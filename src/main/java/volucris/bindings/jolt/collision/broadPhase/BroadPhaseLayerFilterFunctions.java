/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class BroadPhaseLayerFilterFunctions
		implements Struct<BroadPhaseLayerFilterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHOULD_COLLIDE_HANDLE;

	public static final long SHOULD_COLLIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("ShouldCollide")
		).withName("JPH_BroadPhaseLayerFilterFunctions").withByteAlignment(8);
		
		SHOULD_COLLIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldCollide"));
		
		SHOULD_COLLIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldCollide"));
		//@formatter:on
	}

	public BroadPhaseLayerFilterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public BroadPhaseLayerFilterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public BroadPhaseLayerFilterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #shouldCollide()
    public BroadPhaseLayerFilterFunctions shouldCollide(ShouldCollideFunction shouldCollide) {
    	SHOULD_COLLIDE_HANDLE.set(segment, 0L, shouldCollide.memorySegment());
    	return this;
    }
    
    /// ```
    /// Function to filter out broadphase layers when doing collision query test (return true to allow testing against objects with this layer)
    /// ```
    public @Nullable ShouldCollideFunction shouldCollide() {
    	MemorySegment segment = (MemorySegment) SHOULD_COLLIDE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShouldCollideFunction.get(segment);
    }
    
    @Override
    public BroadPhaseLayerFilterFunctions set(BroadPhaseLayerFilterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public BroadPhaseLayerFilterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BroadPhaseLayerFilterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BroadPhaseLayerFilterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BroadPhaseLayerFilterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<BroadPhaseLayerFilterFunctions> array(SegmentAllocator allocator, BroadPhaseLayerFilterFunctions... structs) {
        NativeStructArray<BroadPhaseLayerFilterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BroadPhaseLayerFilterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BroadPhaseLayerFilterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BroadPhaseLayerFilterFunctions(segment)
        );
    }

}