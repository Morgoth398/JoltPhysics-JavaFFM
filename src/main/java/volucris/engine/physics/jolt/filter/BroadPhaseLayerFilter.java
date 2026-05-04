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

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Filter class for broadphase layers.
 */
public abstract class BroadPhaseLayerFilter {

	private static final ArrayList<WeakReference<BroadPhaseLayerFilter>> FILTERS;

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_BROAD_PHASE_LAYER_FILTER_SET_PROCS;
	private static final MethodHandle JPH_BROAD_PHASE_LAYER_FILTER_CREATE;
	private static final MethodHandle JPH_BROAD_PHASE_LAYER_FILTER_DESTROY;

	private static final VarHandle SHOULD_COLLIDE;

	private static final MemorySegment JPH_BROAD_PHASE_LAYER_FILTER_PROCS;

	private static MemorySegment SHOULD_COLLIDE_ADDR;

	private static int count;

	private final MemorySegment jphBroadPhaseLayerFilter;
	private final MemorySegment userData;

	static {
		// @formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("ShouldCollide")
			).withName("JPH_BroadPhaseLayerFilter_Procs");
		//@formatter:on

		SHOULD_COLLIDE = varHandle(LAYOUT, "ShouldCollide");

		JPH_BROAD_PHASE_LAYER_FILTER_SET_PROCS = downcallHandleVoid("JPH_BroadPhaseLayerFilter_SetProcs", ADDRESS);
		JPH_BROAD_PHASE_LAYER_FILTER_CREATE = downcallHandle("JPH_BroadPhaseLayerFilter_Create", ADDRESS, ADDRESS);
		JPH_BROAD_PHASE_LAYER_FILTER_DESTROY = downcallHandleVoid("JPH_BroadPhaseLayerFilter_Destroy", ADDRESS);

		JPH_BROAD_PHASE_LAYER_FILTER_PROCS = Arena.ofAuto().allocate(LAYOUT);

		fillProcs();
		setProcs();

		FILTERS = new ArrayList<WeakReference<BroadPhaseLayerFilter>>();
	}

	public BroadPhaseLayerFilter() {
		try {
			int index = count++;

			Arena arena = Arena.ofAuto();

			userData = arena.allocateFrom(JAVA_INT, index);

			MethodHandle method = JPH_BROAD_PHASE_LAYER_FILTER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(userData);

			jphBroadPhaseLayerFilter = segment.reinterpret(arena, s -> destroy(s));

			FILTERS.add(index, new WeakReference<BroadPhaseLayerFilter>(this));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create broad phase layer filter.");
		}
	}

	/**
	 * Function to filter out broadphase layers when doing collision query test
	 * 
	 * @param layer The layer
	 * @return true to allow testing against objects with this layer
	 */
	protected abstract boolean shouldCollide(byte layer);

	private static void setProcs() {
		try {
			MethodHandle method = JPH_BROAD_PHASE_LAYER_FILTER_SET_PROCS;
			method.invokeExact(JPH_BROAD_PHASE_LAYER_FILTER_PROCS);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set broad phase layer filter procs.");
		}
	}

	private static void fillProcs() {
		//@formatter:off
		Lookup lookup;
		try {
			lookup = MethodHandles.privateLookupIn(BroadPhaseLayerFilter.class, MethodHandles.lookup());
		} catch (IllegalAccessException e) {
			throw new VolucrisRuntimeException("Cannot create private lookup.");
		}
		
		AddressLayout INT_ADDRESS = ADDRESS.withTargetLayout(JAVA_INT);
		
		FunctionDescriptor shouldCollide = functionDescr(JAVA_BOOLEAN, INT_ADDRESS, JAVA_BYTE);
		
		MethodHandle shouldCollideHandle = upcallHandleStatic(lookup, BroadPhaseLayerFilter.class, "shouldCollide", shouldCollide);
	
		SHOULD_COLLIDE_ADDR = upcallStub(shouldCollideHandle, shouldCollide);
		
		SHOULD_COLLIDE.set(JPH_BROAD_PHASE_LAYER_FILTER_PROCS, SHOULD_COLLIDE_ADDR);
		//@formatter:on
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_BROAD_PHASE_LAYER_FILTER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy broad phase layer filter.");
		}
	}

	@SuppressWarnings("unused")
	private static boolean shouldCollide(MemorySegment userData, byte layer) {
		BroadPhaseLayerFilter filter = FILTERS.get(userData.get(JAVA_INT, 0)).get();
		return filter.shouldCollide(layer);
	}

	public MemorySegment memorySegment() {
		return jphBroadPhaseLayerFilter;
	}

}
