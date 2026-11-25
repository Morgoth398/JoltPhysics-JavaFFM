/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

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

public final class GroupFilterFunctions
		implements Struct<GroupFilterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CAN_COLLIDE_HANDLE;
	public static final VarHandle SAVE_BINARY_STATE_HANDLE;

	public static final long CAN_COLLIDE_BYTE_OFFSET;
	public static final long SAVE_BINARY_STATE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("CanCollide"),
		    UNBOUNDED_ADDRESS.withName("SaveBinaryState")
		).withName("JPH_GroupFilterFunctions").withByteAlignment(8);
		
		CAN_COLLIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CanCollide"));
		SAVE_BINARY_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("SaveBinaryState"));
		
		CAN_COLLIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CanCollide"));
		SAVE_BINARY_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("SaveBinaryState"));
		//@formatter:on
	}

	public GroupFilterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public GroupFilterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public GroupFilterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #canCollide()
    public GroupFilterFunctions canCollide(CanCollideFunction canCollide) {
    	CAN_COLLIDE_HANDLE.set(segment, 0L, canCollide.memorySegment());
    	return this;
    }
    
    /// ```
    /// Check if two groups collide
    /// ```
    public @Nullable CanCollideFunction canCollide() {
    	MemorySegment segment = (MemorySegment) CAN_COLLIDE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CanCollideFunction.get(segment);
    }
    
    /// @see #saveBinaryState()
    public GroupFilterFunctions saveBinaryState(SaveBinaryStateFunction saveBinaryState) {
    	SAVE_BINARY_STATE_HANDLE.set(segment, 0L, saveBinaryState.memorySegment());
    	return this;
    }
    
    /// ```
    /// Saves the contents of the group filter in binary form to inStream.
    /// ```
    public @Nullable SaveBinaryStateFunction saveBinaryState() {
    	MemorySegment segment = (MemorySegment) SAVE_BINARY_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return SaveBinaryStateFunction.get(segment);
    }
    
    @Override
    public GroupFilterFunctions set(GroupFilterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public GroupFilterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<GroupFilterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<GroupFilterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new GroupFilterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<GroupFilterFunctions> array(SegmentAllocator allocator, GroupFilterFunctions... structs) {
        NativeStructArray<GroupFilterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new GroupFilterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<GroupFilterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new GroupFilterFunctions(segment)
        );
    }

}