package volucris.engine.physics.jolt.objectVsBroadPhaseLayerFilter;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static volucris.engine.utils.FFMUtils.downcallHandle;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterface;
import volucris.engine.physics.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterfaceMask;
import volucris.engine.physics.jolt.objectLayerPairFilter.ObjectLayerPairFilterMask;
import volucris.engine.utils.VolucrisRuntimeException;

/**
 * Class that determines if an object layer can collide with a broadphase layer.
 * This implementation works together with {@link BroadPhaseLayerInterfaceMask}
 * and {@link ObjectLayerPairFilterMask}.
 */
public final class ObjectVsBroadPhaseLayerFilterMask extends ObjectVsBroadPhaseLayerFilter {

	private static final MethodHandle JPH_VS_BROAD_PAHSE_LAYER_FILTER_MASK_CREATE;

	static {
		//@formatter:off
		JPH_VS_BROAD_PAHSE_LAYER_FILTER_MASK_CREATE = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterMask_Create", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public ObjectVsBroadPhaseLayerFilterMask(BroadPhaseLayerInterface layerInterface) {
		MemorySegment segment;
		try {
			MemorySegment interfaceSegment = layerInterface.memorySegment();
			segment = (MemorySegment) JPH_VS_BROAD_PAHSE_LAYER_FILTER_MASK_CREATE.invokeExact(interfaceSegment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create ObjectVsBroadPhaseLayerFilterMask.");
		}
		super(segment);
	}
}
