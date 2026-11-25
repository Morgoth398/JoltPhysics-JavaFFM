/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

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

public class TempAllocatorFunctions
		implements Struct<TempAllocatorFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ALLOCATE_HANDLE;
	public static final VarHandle FREE_HANDLE;

	public static final long ALLOCATE_BYTE_OFFSET;
	public static final long FREE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("Allocate"),
		    UNBOUNDED_ADDRESS.withName("Free")
		).withName("JPH_TempAllocatorFunctions").withByteAlignment(8);
		
		ALLOCATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Allocate"));
		FREE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Free"));
		
		ALLOCATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Allocate"));
		FREE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Free"));
		//@formatter:on
	}

	public TempAllocatorFunctions() {
	    this(Arena.ofAuto());
	}
	
	public TempAllocatorFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public TempAllocatorFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #allocate()
    public TempAllocatorFunctions allocate(AllocateFunction allocate) {
    	ALLOCATE_HANDLE.set(segment, 0L, allocate.memorySegment());
    	return this;
    }
    
    /// ```
    /// Allocates inSize bytes of memory, returned memory address must be JPH_RVECTOR_ALIGNMENT byte aligned
    /// ```
    public @Nullable AllocateFunction allocate() {
    	MemorySegment segment = (MemorySegment) ALLOCATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return AllocateFunction.get(segment);
    }
    
    /// @see #free()
    public TempAllocatorFunctions free(FreeFunction free) {
    	FREE_HANDLE.set(segment, 0L, free.memorySegment());
    	return this;
    }
    
    /// ```
    /// Frees inSize bytes of memory located at inAddress
    /// ```
    public @Nullable FreeFunction free() {
    	MemorySegment segment = (MemorySegment) FREE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return FreeFunction.get(segment);
    }
    
    @Override
    public TempAllocatorFunctions set(TempAllocatorFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public TempAllocatorFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<TempAllocatorFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<TempAllocatorFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new TempAllocatorFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<TempAllocatorFunctions> array(SegmentAllocator allocator, TempAllocatorFunctions... structs) {
        NativeStructArray<TempAllocatorFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new TempAllocatorFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<TempAllocatorFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new TempAllocatorFunctions(segment)
        );
    }

}