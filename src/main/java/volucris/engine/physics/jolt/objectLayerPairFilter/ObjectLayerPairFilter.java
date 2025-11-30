package volucris.engine.physics.jolt.objectLayerPairFilter;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * Filter class to test if two objects can collide based on their object layer.
 * Used while finding collision pairs.
 */
public sealed class ObjectLayerPairFilter permits ObjectLayerPairFilterMask, ObjectLayerPairFilterTable {

	protected final MemorySegment jphObjectLayerPairFilter;

	protected ObjectLayerPairFilter(MemorySegment jphObjectLayerPairFilter) {
		this.jphObjectLayerPairFilter = jphObjectLayerPairFilter.reinterpret(Arena.ofAuto(), null);
	}

	public MemorySegment memorySegment() {
		return jphObjectLayerPairFilter.asReadOnly();
	}

}
