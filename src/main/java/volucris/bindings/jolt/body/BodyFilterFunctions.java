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

public final class BodyFilterFunctions
		implements Struct<BodyFilterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHOULD_COLLIDE_HANDLE;
	public static final VarHandle SHOULD_COLLIDE_LOCKED_HANDLE;

	public static final long SHOULD_COLLIDE_BYTE_OFFSET;
	public static final long SHOULD_COLLIDE_LOCKED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("ShouldCollide"),
		    UNBOUNDED_ADDRESS.withName("ShouldCollideLocked")
		).withName("JPH_BodyFilterFunctions").withByteAlignment(8);
		
		SHOULD_COLLIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldCollide"));
		SHOULD_COLLIDE_LOCKED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldCollideLocked"));
		
		SHOULD_COLLIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldCollide"));
		SHOULD_COLLIDE_LOCKED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldCollideLocked"));
		//@formatter:on
	}

	public BodyFilterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public BodyFilterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public BodyFilterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #shouldCollide()
    public BodyFilterFunctions shouldCollide(ShouldCollideFunction shouldCollide) {
    	SHOULD_COLLIDE_HANDLE.set(segment, 0L, shouldCollide.memorySegment());
    	return this;
    }
    
    /// ```
    /// Filter function. Returns true if we should collide with inBodyID
    /// ```
    public @Nullable ShouldCollideFunction shouldCollide() {
    	MemorySegment segment = (MemorySegment) SHOULD_COLLIDE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShouldCollideFunction.get(segment);
    }
    
    /// @see #shouldCollideLocked()
    public BodyFilterFunctions shouldCollideLocked(ShouldCollideLockedFunction shouldCollideLocked) {
    	SHOULD_COLLIDE_LOCKED_HANDLE.set(segment, 0L, shouldCollideLocked.memorySegment());
    	return this;
    }
    
    /// ```
    /// Filter function. Returns true if we should collide with inBody (this is called after the body is locked and makes it possible to filter based on body members)
    /// ```
    public @Nullable ShouldCollideLockedFunction shouldCollideLocked() {
    	MemorySegment segment = (MemorySegment) SHOULD_COLLIDE_LOCKED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShouldCollideLockedFunction.get(segment);
    }
    
    @Override
    public BodyFilterFunctions set(BodyFilterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public BodyFilterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BodyFilterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BodyFilterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BodyFilterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<BodyFilterFunctions> array(SegmentAllocator allocator, BodyFilterFunctions... structs) {
        NativeStructArray<BodyFilterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new BodyFilterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BodyFilterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BodyFilterFunctions(segment)
        );
    }

}