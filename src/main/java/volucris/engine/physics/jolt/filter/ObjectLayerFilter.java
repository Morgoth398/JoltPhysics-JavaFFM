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

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Filter class for object layers.
 */
public abstract class ObjectLayerFilter {

	private static final ArrayList<WeakReference<ObjectLayerFilter>> FILTERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_OBJECT_LAYER_FILTER_SET_PROCS;
	private static final MethodHandle JPH_OBJECT_LAYER_FILTER_CREATE;
	private static final MethodHandle JPH_OBJECT_LAYER_FILTER_DESTROY;

	private static final VarHandle SHOULD_COLLIDE;

	private static final MemorySegment JPH_OBJECT_LAYER_FILTER_PROCS;

	private static MemorySegment SHOULD_COLLIDE_ADDR;

	private static int count;

	private final MemorySegment jphObjectLayerFilter;
	private final MemorySegment userData;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("ShouldCollide")
			).withName("JPH_ObjectLayerFilter_Procs");
		//@formatter:on

		SHOULD_COLLIDE = varHandle(LAYOUT, "ShouldCollide");

		JPH_OBJECT_LAYER_FILTER_SET_PROCS = downcallHandleVoid("JPH_ObjectLayerFilter_SetProcs", ADDRESS);
		JPH_OBJECT_LAYER_FILTER_CREATE = downcallHandle("JPH_ObjectLayerFilter_Create", ADDRESS, ADDRESS);
		JPH_OBJECT_LAYER_FILTER_DESTROY = downcallHandleVoid("JPH_ObjectLayerFilter_Destroy", ADDRESS);

		Arena arena = Arena.ofAuto();
		JPH_OBJECT_LAYER_FILTER_PROCS = arena.allocate(LAYOUT);

		fillProcs(arena);
		setProcs();

		FILTERS = new ArrayList<WeakReference<ObjectLayerFilter>>();
	}

	public ObjectLayerFilter() {
		this(Arena.ofAuto());
	}

	public ObjectLayerFilter(Arena arena) {
		try {
			int index = count++;

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_OBJECT_LAYER_FILTER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphObjectLayerFilter = segment.reinterpret(arena, s -> destroy(s));

			FILTERS.add(index, new WeakReference<ObjectLayerFilter>(this));
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create object layer filter: " + className);
		}
	}

	/**
	 * Function to filter out object layers when doing collision query test.
	 * 
	 * @param layer
	 * @return true to allow testing against objects with this layer
	 */
	protected abstract boolean shouldCollide(int layer);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_OBJECT_LAYER_FILTER_SET_PROCS;
			method.invokeExact(JPH_OBJECT_LAYER_FILTER_PROCS);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set object layer filter procs: " + className);
		}
	}

	private static void fillProcs(Arena arena) {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(ObjectLayerFilter.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create private lookup: " + className);
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		
		FunctionDescriptor shouldCollide = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, JAVA_INT);
		
		MethodHandle shouldCollideHandle = upcallHandleStatic(lookup, ObjectLayerFilter.class, "shouldCollide", shouldCollide);
	
		SHOULD_COLLIDE_ADDR = upcallStub(shouldCollideHandle, shouldCollide, arena);
		
		SHOULD_COLLIDE.set(JPH_OBJECT_LAYER_FILTER_PROCS, SHOULD_COLLIDE_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_OBJECT_LAYER_FILTER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy object layer filter: " + className);
		}
	}

	@SuppressWarnings("unused")
	private static boolean shouldCollide(MemorySegment userData, int layer) {
		ObjectLayerFilter filter = FILTERS.get(userData.get(JAVA_INT, 0)).get();
		return filter.shouldCollide(layer);
	}

	public MemorySegment memorySegment() {
		return jphObjectLayerFilter;
	}

}
