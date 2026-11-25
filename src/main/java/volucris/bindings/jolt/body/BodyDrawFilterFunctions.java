/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

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

public final class BodyDrawFilterFunctions
		implements Struct<BodyDrawFilterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHOULD_DRAW_HANDLE;

	public static final long SHOULD_DRAW_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("ShouldDraw")
		).withName("JPH_BodyDrawFilterFunctions").withByteAlignment(8);
		
		SHOULD_DRAW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldDraw"));
		
		SHOULD_DRAW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldDraw"));
		//@formatter:on
	}

	public BodyDrawFilterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public BodyDrawFilterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public BodyDrawFilterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #shouldDraw()
    public BodyDrawFilterFunctions shouldDraw(ShouldDrawFunction shouldDraw) {
    	SHOULD_DRAW_HANDLE.set(segment, 0L, shouldDraw.memorySegment());
    	return this;
    }
    
    /// ```
    /// Filter function. Returns true if inBody should be rendered
    /// ```
    public @Nullable ShouldDrawFunction shouldDraw() {
    	MemorySegment segment = (MemorySegment) SHOULD_DRAW_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShouldDrawFunction.get(segment);
    }
    
    @Override
    public BodyDrawFilterFunctions set(BodyDrawFilterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public BodyDrawFilterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyDrawFilterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyDrawFilterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BodyDrawFilterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyDrawFilterFunctions> array(SegmentAllocator allocator, BodyDrawFilterFunctions... structs) {
        NativeStructArray<BodyDrawFilterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BodyDrawFilterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyDrawFilterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyDrawFilterFunctions(segment)
        );
    }

}