package volucris.engine.physics.jolt.objectVsBroadPhaseLayerFilter;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterface;
import volucris.engine.physics.jolt.objectLayerPairFilter.ObjectLayerPairFilter;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that determines if an object layer can collide with a broadphase layer.
 * This implementation uses a table and constructs itself from an
 * {@link ObjectLayerPairFilter} and a {@link BroadPhaseLayerInterface}
 */
public final class ObjectVsBroadPhaseLayerFilterTable extends ObjectVsBroadPhaseLayerFilter {

	private static final MethodHandle JPH_VS_BROAD_PAHSE_LAYER_FILTER_TABLE_CREATE;

	static {
		//@formatter:off
		JPH_VS_BROAD_PAHSE_LAYER_FILTER_TABLE_CREATE = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterTable_Create", ADDRESS, ADDRESS, JAVA_INT, ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public ObjectVsBroadPhaseLayerFilterTable(BroadPhaseLayerInterface layerInterface, int numBroadPhaseLayers,
			ObjectLayerPairFilter pairFilter, int numObjectLayers) {
		MemorySegment segment;
		try {
			MemorySegment interfaceSegment = layerInterface.memorySegment();
			MemorySegment pairFilterSegment = pairFilter.memorySegment();

			MethodHandle method = JPH_VS_BROAD_PAHSE_LAYER_FILTER_TABLE_CREATE;
			segment = (MemorySegment) method.invokeExact(interfaceSegment, numBroadPhaseLayers, pairFilterSegment,
					numObjectLayers);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create ObjectVsBroadPhaseLayerFilterTable: " + className);
		}
		super(segment);
	}
}
