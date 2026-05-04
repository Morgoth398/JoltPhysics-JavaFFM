package volucris.engine.physics.jolt.broadPhaseLayerInterface;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.objectLayerPairFilter.ObjectLayerPairFilterMask;
import volucris.engine.physics.jolt.objectVsBroadPhaseLayerFilter.ObjectVsBroadPhaseLayerFilterMask;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * BroadPhaseLayerInterface implementation. This defines a mapping between
 * object and broadphase layers. This implementation works together with
 * {@link ObjectLayerPairFilterMask} and
 * {@link ObjectVsBroadPhaseLayerFilterMask}. A broadphase layer is suitable for
 * an object if its {@code group & groupsToInclude} is not zero and its
 * {@code group &
 * groupsToExclude} is zero. The broadphase layers are iterated from lowest to
 * highest value and the first one that matches is taken. If none match then it
 * takes the last layer.
 */
public final class BroadPhaseLayerInterfaceMask extends BroadPhaseLayerInterface {

	private static final MethodHandle JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE;
	private static final MethodHandle JPH_BROAD_PAHSE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER;

	static {
		//@formatter:off
		JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE = downcallHandle("JPH_BroadPhaseLayerInterfaceMask_Create", ADDRESS, JAVA_INT);
		JPH_BROAD_PAHSE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER = downcallHandleVoid("JPH_BroadPhaseLayerInterfaceMask_ConfigureLayer", ADDRESS, JAVA_BYTE, JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	public BroadPhaseLayerInterfaceMask(int numBroadPhaseLayers) {
		MemorySegment segment;
		try {
			segment = (MemorySegment) JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE.invokeExact(numBroadPhaseLayers);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create BroadPhaseLayerInterfaceMask.");
		}
		super(segment);
	}

	public void configureLayer(byte broadphaseLayer, int groupsToInclude, int groupsToExclude) {
		try {
			MethodHandle method = JPH_BROAD_PAHSE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER;
			method.invokeExact(jphBroadPhaseLayerInterface, broadphaseLayer, groupsToInclude, groupsToExclude);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot configure layer.");
		}
	}

}
