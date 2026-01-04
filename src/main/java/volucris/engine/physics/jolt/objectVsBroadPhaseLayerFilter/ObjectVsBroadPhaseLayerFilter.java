package volucris.engine.physics.jolt.objectVsBroadPhaseLayerFilter;

import java.lang.foreign.MemorySegment;

/**
 * Class to test if an object can collide with a broadphase layer. Used while
 * finding collision pairs.
 */
public sealed class ObjectVsBroadPhaseLayerFilter
		permits ObjectVsBroadPhaseLayerFilterMask, ObjectVsBroadPhaseLayerFilterTable {

	protected final MemorySegment jphObjectVsBroadPhaseLayerFilter;

	protected ObjectVsBroadPhaseLayerFilter(MemorySegment jphObjectVsBroadPhaseLayerFilter) {
		this.jphObjectVsBroadPhaseLayerFilter = jphObjectVsBroadPhaseLayerFilter;
	}

	public MemorySegment memorySegment() {
		return jphObjectVsBroadPhaseLayerFilter;
	}

}
