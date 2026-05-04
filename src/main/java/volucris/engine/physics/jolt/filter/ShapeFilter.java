package volucris.engine.physics.jolt.filter;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Filter class.
 */
public abstract class ShapeFilter {

	private static final ArrayList<WeakReference<ShapeFilter>> SHAPE_FILTERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_SHAPE_FILTER_SET_PROCS;
	private static final MethodHandle JPH_SHAPE_FILTER_CREATE;
	private static final MethodHandle JPH_SHAPE_FILTER_DESTROY;
	private static final MethodHandle JPH_SHAPE_FILTER_GET_BODY_ID_2;
	private static final MethodHandle JPH_SHAPE_FILTER_SET_BODY_ID_2;

	private static final VarHandle SHOULD_COLLIDE;
	private static final VarHandle SHOULD_COLLIDE_2;

	private static final MemorySegment JPH_SHAPE_FILTER_PROCS;

	private static MemorySegment SHOULD_COLLIDE_ADDR;
	private static MemorySegment SHOULD_COLLIDE2_ADDR;

	private static int count;

	private final MemorySegment jphShapeFilter;
	private final MemorySegment userData;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("ShouldCollide"),
				ADDRESS.withName("ShouldCollide2")
			).withName("JPH_ShapeFilter_Procs");
		//@formatter:on

		SHOULD_COLLIDE = varHandle(LAYOUT, "ShouldCollide");
		SHOULD_COLLIDE_2 = varHandle(LAYOUT, "ShouldCollide2");

		JPH_SHAPE_FILTER_SET_PROCS = downcallHandleVoid("JPH_ShapeFilter_SetProcs", ADDRESS);
		JPH_SHAPE_FILTER_CREATE = downcallHandle("JPH_ShapeFilter_Create", ADDRESS, ADDRESS);
		JPH_SHAPE_FILTER_DESTROY = downcallHandleVoid("JPH_ShapeFilter_Destroy", ADDRESS);
		JPH_SHAPE_FILTER_GET_BODY_ID_2 = downcallHandle("JPH_ShapeFilter_GetBodyID2", JAVA_INT, ADDRESS);
		JPH_SHAPE_FILTER_SET_BODY_ID_2 = downcallHandleVoid("JPH_ShapeFilter_SetBodyID2", ADDRESS, JAVA_INT);

		Arena arena = Arena.ofAuto();
		JPH_SHAPE_FILTER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		SHAPE_FILTERS = new ArrayList<WeakReference<ShapeFilter>>();
	}

	public ShapeFilter() {
		this(Arena.ofAuto());
	}

	public ShapeFilter(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_SHAPE_FILTER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphShapeFilter = segment.reinterpret(arena, s -> destroy(s));

			SHAPE_FILTERS.add(index, new WeakReference<ShapeFilter>(this));
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create shape filter: " + className);
		}
	}

	/**
	 * Filter function to determine if we should collide with a shape. This overload
	 * is called when the query doesn't have a source shape (e.g. ray cast / collide
	 * point)
	 * 
	 * @param shape2           Shape we're colliding against
	 * @param subShapeIDShape2 The sub shape ID that will lead from the root shape
	 *                         to inShape2 (i.e. the shape of bodyID2)
	 * @return true if the filter passes
	 */
	protected abstract boolean shouldCollide(Shape shape2, int subShapeIDShape2);

	/**
	 * Filter function to determine if two shapes should collide. This overload is
	 * called when querying a shape vs a shape (e.g. collide object / cast object).
	 * It is called at each level of the shape hierarchy, so if you have a compound
	 * shape with a box, this function will be called twice. It will not be called
	 * on triangles that are part of another shape, i.e a mesh shape will not
	 * trigger a callback per triangle. You can filter out individual triangles in
	 * the CollisionCollector::AddHit function by their sub shape ID.
	 * 
	 * @param shape1           1st shape that is colliding
	 * @param subShapeIDShape1 The sub shape ID that will lead from the root shape
	 *                         to inShape1 (i.e. the shape that is used to collide
	 *                         or cast against shape 2)
	 * @param shape2           2nd shape that is colliding
	 * @param subShapeIDShape2 The sub shape ID that will lead from the root shape
	 *                         to inShape2 (i.e. the shape of mBodyID2)
	 * @return true if the filter passes.
	 */
	protected abstract boolean shouldCollide(Shape shape1, int subShapeIDShape1, Shape shape2, int subShapeIDShape2);

	public int getBodyId2() {
		try {
			MethodHandle method = JPH_SHAPE_FILTER_GET_BODY_ID_2;
			return (int) method.invokeExact(jphShapeFilter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get body id 2: " + className);
		}
	}

	public void setBodyId2(int bodyId2) {
		try {
			MethodHandle method = JPH_SHAPE_FILTER_SET_BODY_ID_2;
			method.invokeExact(jphShapeFilter, bodyId2);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set body id 2: " + className);
		}
	}

	private static void setProcs() {
		try {
			MethodHandle method = JPH_SHAPE_FILTER_SET_PROCS;
			method.invokeExact(JPH_SHAPE_FILTER_PROCS);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set shape filter procs: " + className);
		}
	}

	private static void fillProcs(Arena arena) {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(ShapeFilter.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create private lookup: " + className);
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		
		FunctionDescriptor shouldCollide = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, ADDRESS, INT_ADDRESS);
		FunctionDescriptor shouldCollide2 = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, ADDRESS, INT_ADDRESS, ADDRESS, INT_ADDRESS);
		
		MethodHandle shouldCollideHandle = upcallHandleStatic(lookup, ShapeFilter.class, "shouldCollide", shouldCollide);
		MethodHandle shouldCollide2Handle = upcallHandleStatic(lookup, ShapeFilter.class, "shouldCollide", shouldCollide2);
	
		SHOULD_COLLIDE_ADDR = upcallStub(shouldCollideHandle, shouldCollide, arena);
		SHOULD_COLLIDE2_ADDR = upcallStub(shouldCollide2Handle, shouldCollide2, arena);
		
		SHOULD_COLLIDE.set(JPH_SHAPE_FILTER_PROCS, SHOULD_COLLIDE_ADDR);
		SHOULD_COLLIDE_2.set(JPH_SHAPE_FILTER_PROCS, SHOULD_COLLIDE2_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_SHAPE_FILTER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy shape filter: " + className);
		}
	}

	@SuppressWarnings("unused")
	private static boolean shouldCollide(MemorySegment userData, MemorySegment shape2, MemorySegment subShapeIDShape2) {
		ShapeFilter shapeFilter = SHAPE_FILTERS.get(userData.get(JAVA_INT, 0)).get();

		Shape shape = Jolt.getShape(shape2.address());
		if (shape == null && !shape2.equals(MemorySegment.NULL))
			shape = new Shape(shape2, false);

		int subShapeId = subShapeIDShape2.reinterpret(JAVA_INT.byteSize()).get(JAVA_INT, 0);
		return shapeFilter.shouldCollide(shape, subShapeId);
	}

	@SuppressWarnings("unused")
	private static boolean shouldCollide(MemorySegment userData, MemorySegment shape1, MemorySegment subShapeIDShape1,
			MemorySegment shape2, MemorySegment subShapeIDShape2) {
		ShapeFilter shapeFilter = SHAPE_FILTERS.get(userData.get(JAVA_INT, 0)).get();

		Shape firstShape = Jolt.getShape(shape1.address());
		if (firstShape == null && !shape1.equals(MemorySegment.NULL))
			firstShape = new Shape(shape1, false);
		Shape secondShape = Jolt.getShape(shape2.address());
		if (secondShape == null && !shape2.equals(MemorySegment.NULL))
			secondShape = new Shape(shape2, false);

		int firstShapeId = subShapeIDShape1.get(JAVA_INT, 0);
		int secondShapeId = subShapeIDShape2.get(JAVA_INT, 0);
		return shapeFilter.shouldCollide(firstShape, firstShapeId, secondShape, secondShapeId);
	}

	public MemorySegment memorySegment() {
		return jphShapeFilter;
	}

}
