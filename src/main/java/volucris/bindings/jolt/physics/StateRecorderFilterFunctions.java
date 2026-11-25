/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

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

public final class StateRecorderFilterFunctions
		implements Struct<StateRecorderFilterFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHOULD_SAVE_BODY_HANDLE;
	public static final VarHandle SHOULD_SAVE_CONSTRAINT_HANDLE;
	public static final VarHandle SHOULD_SAVE_CONTACT_HANDLE;
	public static final VarHandle SHOULD_RESTORE_CONTACT_HANDLE;

	public static final long SHOULD_SAVE_BODY_BYTE_OFFSET;
	public static final long SHOULD_SAVE_CONSTRAINT_BYTE_OFFSET;
	public static final long SHOULD_SAVE_CONTACT_BYTE_OFFSET;
	public static final long SHOULD_RESTORE_CONTACT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("ShouldSaveBody"),
		    UNBOUNDED_ADDRESS.withName("ShouldSaveConstraint"),
		    UNBOUNDED_ADDRESS.withName("ShouldSaveContact"),
		    UNBOUNDED_ADDRESS.withName("ShouldRestoreContact")
		).withName("JPH_StateRecorderFilterFunctions").withByteAlignment(8);
		
		SHOULD_SAVE_BODY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldSaveBody"));
		SHOULD_SAVE_CONSTRAINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldSaveConstraint"));
		SHOULD_SAVE_CONTACT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldSaveContact"));
		SHOULD_RESTORE_CONTACT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ShouldRestoreContact"));
		
		SHOULD_SAVE_BODY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldSaveBody"));
		SHOULD_SAVE_CONSTRAINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldSaveConstraint"));
		SHOULD_SAVE_CONTACT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldSaveContact"));
		SHOULD_RESTORE_CONTACT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ShouldRestoreContact"));
		//@formatter:on
	}

	public StateRecorderFilterFunctions() {
	    this(Arena.ofAuto());
	}
	
	public StateRecorderFilterFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StateRecorderFilterFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #shouldSaveBody()
    public StateRecorderFilterFunctions shouldSaveBody(ShouldSaveBodyFunction shouldSaveBody) {
    	SHOULD_SAVE_BODY_HANDLE.set(segment, 0L, shouldSaveBody.memorySegment());
    	return this;
    }
    
    /// ```
    /// If the state of a specific body should be saved
    /// ```
    public @Nullable ShouldSaveBodyFunction shouldSaveBody() {
    	MemorySegment segment = (MemorySegment) SHOULD_SAVE_BODY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShouldSaveBodyFunction.get(segment);
    }
    
    /// @see #shouldSaveConstraint()
    public StateRecorderFilterFunctions shouldSaveConstraint(ShouldSaveConstraintFunction shouldSaveConstraint) {
    	SHOULD_SAVE_CONSTRAINT_HANDLE.set(segment, 0L, shouldSaveConstraint.memorySegment());
    	return this;
    }
    
    /// ```
    /// If the state of a specific constraint should be saved
    /// ```
    public @Nullable ShouldSaveConstraintFunction shouldSaveConstraint() {
    	MemorySegment segment = (MemorySegment) SHOULD_SAVE_CONSTRAINT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShouldSaveConstraintFunction.get(segment);
    }
    
    /// @see #shouldSaveContact()
    public StateRecorderFilterFunctions shouldSaveContact(ShouldSaveContactFunction shouldSaveContact) {
    	SHOULD_SAVE_CONTACT_HANDLE.set(segment, 0L, shouldSaveContact.memorySegment());
    	return this;
    }
    
    /// ```
    /// If the state of a specific contact should be saved
    /// ```
    public @Nullable ShouldSaveContactFunction shouldSaveContact() {
    	MemorySegment segment = (MemorySegment) SHOULD_SAVE_CONTACT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShouldSaveContactFunction.get(segment);
    }
    
    /// @see #shouldRestoreContact()
    public StateRecorderFilterFunctions shouldRestoreContact(ShouldRestoreContactFunction shouldRestoreContact) {
    	SHOULD_RESTORE_CONTACT_HANDLE.set(segment, 0L, shouldRestoreContact.memorySegment());
    	return this;
    }
    
    /// ```
    /// If the state of a specific contact should be restored
    /// ```
    public @Nullable ShouldRestoreContactFunction shouldRestoreContact() {
    	MemorySegment segment = (MemorySegment) SHOULD_RESTORE_CONTACT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return ShouldRestoreContactFunction.get(segment);
    }
    
    @Override
    public StateRecorderFilterFunctions set(StateRecorderFilterFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public StateRecorderFilterFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StateRecorderFilterFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StateRecorderFilterFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StateRecorderFilterFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<StateRecorderFilterFunctions> array(SegmentAllocator allocator, StateRecorderFilterFunctions... structs) {
        NativeStructArray<StateRecorderFilterFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StateRecorderFilterFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StateRecorderFilterFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StateRecorderFilterFunctions(segment)
        );
    }

}