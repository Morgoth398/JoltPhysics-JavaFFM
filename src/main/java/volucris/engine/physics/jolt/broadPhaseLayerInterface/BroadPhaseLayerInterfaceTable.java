package volucris.engine.physics.jolt.broadPhaseLayerInterface;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * BroadPhaseLayerInterface implementation. This defines a mapping between
 * object and broadphase layers. This implementation uses a simple table
 */
public final class BroadPhaseLayerInterfaceTable extends BroadPhaseLayerInterface {

	private static final MethodHandle JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE;
	private static final MethodHandle JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PAHSE_LAYER;

	static {
		//@formatter:off
		JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE = downcallHandle("JPH_BroadPhaseLayerInterfaceTable_Create", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PAHSE_LAYER = downcallHandleVoid("JPH_BroadPhaseLayerInterfaceTable_MapObjectToBroadPhaseLayer", ADDRESS, JAVA_INT, JAVA_BYTE);
		//@formatter:on
	}

	public BroadPhaseLayerInterfaceTable(int numObjectLayers, int numBroadPhaseLayers) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE;
			segment = (MemorySegment) method.invokeExact(numObjectLayers, numBroadPhaseLayers);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create BroadPhaseLayerInterfaceTable.");
		}
		super(segment);
	}

	public void mapObjectToBroadPhaseLayer(int objectLayer, byte broadPhaseLayer) {
		try {
			MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PAHSE_LAYER;
			method.invokeExact(jphBroadPhaseLayerInterface, objectLayer, broadPhaseLayer);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot map object to broad phase layer.");
		}
	}

}
