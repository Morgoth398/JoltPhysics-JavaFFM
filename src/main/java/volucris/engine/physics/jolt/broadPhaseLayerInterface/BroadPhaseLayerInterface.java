package volucris.engine.physics.jolt.broadPhaseLayerInterface;

import java.lang.foreign.MemorySegment;

/**
 * Interface that the application should implement to allow mapping object
 * layers to broadphase layers.
 */
public sealed class BroadPhaseLayerInterface permits BroadPhaseLayerInterfaceMask, BroadPhaseLayerInterfaceTable {

	protected final MemorySegment jphBroadPhaseLayerInterface;

	protected BroadPhaseLayerInterface(MemorySegment jphBroadPhaseLayerInterface) {
		this.jphBroadPhaseLayerInterface = jphBroadPhaseLayerInterface;
	}

	public MemorySegment memorySegment() {
		return jphBroadPhaseLayerInterface;
	}

}
