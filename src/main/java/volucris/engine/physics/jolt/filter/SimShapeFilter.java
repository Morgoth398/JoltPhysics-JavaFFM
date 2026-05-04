package volucris.engine.physics.jolt.filter;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Filter class used during the simulation
 * ({@link PhysicsSystem#update(float, int, volucris.engine.physics.jolt.jobSystem.JobSystem)
 * PhysicsSystem.Update}) to filter out collisions at shape level.
 */
public abstract class SimShapeFilter {

	private static final ArrayList<WeakReference<SimShapeFilter>> SIM_SHAPE_FILTERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_SIM_SHAPE_FILTER_SET_PROCS;
	private static final MethodHandle JPH_SIM_SHAPE_FILTER_CREATE;
	private static final MethodHandle JPH_SIM_SHAPE_FILTER_DESTROY;

	private static final VarHandle SHOULD_COLLIDE;

	private static final MemorySegment JPH_SIM_SHAPE_FILTER_PROCS;

	private static MemorySegment SHOULD_COLLIDE_ADDR;

	private static int count;

	private final MemorySegment jphSimShapeFilter;
	private final MemorySegment userData;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("ShouldCollide")
			).withName("JPH_ShapeFilter_Procs");
		//@formatter:on

		SHOULD_COLLIDE = varHandle(LAYOUT, "ShouldCollide");

		JPH_SIM_SHAPE_FILTER_SET_PROCS = downcallHandleVoid("JPH_ShapeFilter_SetProcs", ADDRESS);
		JPH_SIM_SHAPE_FILTER_CREATE = downcallHandle("JPH_ShapeFilter_Create", ADDRESS, ADDRESS);
		JPH_SIM_SHAPE_FILTER_DESTROY = downcallHandleVoid("JPH_ShapeFilter_Destroy", ADDRESS);

		Arena arena = Arena.ofAuto();
		JPH_SIM_SHAPE_FILTER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		SIM_SHAPE_FILTERS = new ArrayList<WeakReference<SimShapeFilter>>();
	}

	public SimShapeFilter() {
		this(Arena.ofAuto());
	}
	
	public SimShapeFilter(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_SIM_SHAPE_FILTER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphSimShapeFilter = segment.reinterpret(arena, s -> destroy(s));

			SIM_SHAPE_FILTERS.add(index, new WeakReference<SimShapeFilter>(this));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create sim shape filter.");
		}
	}

	/**
	 * Filter function to determine if two shapes should collide. This overload is
	 * called during the simulation
	 * ({@link PhysicsSystem#update(float, int, volucris.engine.physics.jolt.jobSystem.JobSystem)
	 * PhysicsSystem.Update}) and must be registered with
	 * {@link PhysicsSystem#setSimShapeFilter(SimShapeFilter)}. It is called at each
	 * level of the shape hierarchy, so if you have a compound shape with a box,
	 * this function will be called twice. It will not be called on triangles that
	 * are part of another shape, i.e a mesh shape will not trigger a callback per
	 * triangle. Note that this function is called from multiple threads and must be
	 * thread safe. All properties are read only.
	 * 
	 * @param body1              1st body that is colliding
	 * @param shape1             1st shape that is colliding
	 * @param subShapeIdOfShape1 The sub shape ID that will lead from
	 *                           body1.GetShape() to shape1
	 * @param body2              2nd body that is colliding
	 * @param shape2             2nd shape that is colliding
	 * @param subShapeIdOfShape2 The sub shape ID that will lead from
	 *                           body2.GetShape() to shape2
	 * @return true if the filter passes.
	 */
	//@formatter:off
	protected abstract boolean shouldCollide(Body body1, Shape shape1, int subShapeIdOfShape1, Body body2, Shape shape2, int subShapeIdOfShape2);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_SIM_SHAPE_FILTER_SET_PROCS;
			method.invokeExact(JPH_SIM_SHAPE_FILTER_PROCS);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set shape filter procs.");
		}
	}

	private static void fillProcs(Arena arena) {
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(SimShapeFilter.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		
		FunctionDescriptor shouldCollide = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, ADDRESS, ADDRESS, INT_ADDRESS, ADDRESS, ADDRESS, INT_ADDRESS);
		
		MethodHandle shouldCollideHandle = upcallHandleStatic(lookup, SimShapeFilter.class, "shouldCollide", shouldCollide);
	
		SHOULD_COLLIDE_ADDR = upcallStub(shouldCollideHandle, shouldCollide, arena);
		
		SHOULD_COLLIDE.set(JPH_SIM_SHAPE_FILTER_PROCS, SHOULD_COLLIDE_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_SIM_SHAPE_FILTER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy sim shape filter.");
		}
	}

	@SuppressWarnings("unused")
	private static boolean shouldCollide(MemorySegment userData, MemorySegment body1, MemorySegment shape1,
			MemorySegment subShapeIDOfShape1, MemorySegment body2, MemorySegment shape2,
			MemorySegment subShapeIDOfShape2) {

		SimShapeFilter filter = SIM_SHAPE_FILTERS.get(userData.get(JAVA_INT, 0)).get();

		Body firstBody = Jolt.getBody(body1.address());
		if (firstBody == null && !body1.equals(MemorySegment.NULL))
			firstBody = new Body(body1);

		Shape firstShape = Jolt.getShape(shape1.address());
		if (firstShape == null && !shape1.equals(MemorySegment.NULL))
			firstShape = new Shape(shape1, false);

		int subShapeId1 = subShapeIDOfShape1.get(JAVA_INT, 0);

		Body secondBody = Jolt.getBody(body2.address());
		if (secondBody == null && !body2.equals(MemorySegment.NULL))
			secondBody = new Body(body2);

		Shape secondShape = Jolt.getShape(shape2.address());
		if (secondShape == null && !shape2.equals(MemorySegment.NULL))
			secondShape = new Shape(shape2, false);

		int subShapeId2 = subShapeIDOfShape2.get(JAVA_INT, 0);

		return filter.shouldCollide(firstBody, firstShape, subShapeId1, secondBody, secondShape, subShapeId2);
	}

	public MemorySegment memorySegment() {
		return jphSimShapeFilter;
	}

}
