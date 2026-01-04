package volucris.engine.physics.jolt.objectLayerPairFilter;

import java.lang.foreign.MemorySegment;

/**
 * Filter class to test if two objects can collide based on their object layer.
 * Used while finding collision pairs.
 */
public sealed class ObjectLayerPairFilter permits ObjectLayerPairFilterMask, ObjectLayerPairFilterTable {

	protected final MemorySegment jphObjectLayerPairFilter;

	protected ObjectLayerPairFilter(MemorySegment jphObjectLayerPairFilter) {
		this.jphObjectLayerPairFilter = jphObjectLayerPairFilter;
	}

	public MemorySegment memorySegment() {
		return jphObjectLayerPairFilter;
	}

}
