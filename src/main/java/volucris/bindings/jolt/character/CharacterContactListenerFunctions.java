/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

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

public final class CharacterContactListenerFunctions
		implements Struct<CharacterContactListenerFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_ADJUST_BODY_VELOCITY_HANDLE;
	public static final VarHandle ON_CONTACT_VALIDATE_HANDLE;
	public static final VarHandle ON_CONTACT_ADDED_HANDLE;
	public static final VarHandle ON_CONTACT_PERSISTED_HANDLE;
	public static final VarHandle ON_CONTACT_REMOVED_HANDLE;
	public static final VarHandle ON_CHARACTER_CONTACT_VALIDATE_HANDLE;
	public static final VarHandle ON_CHARACTER_CONTACT_ADDED_HANDLE;
	public static final VarHandle ON_CHARACTER_CONTACT_PERSISTED_HANDLE;
	public static final VarHandle ON_CHARACTER_CONTACT_REMOVED_HANDLE;
	public static final VarHandle ON_CONTACT_SOLVE_HANDLE;
	public static final VarHandle ON_CHARACTER_CONTACT_SOLVE_HANDLE;

	public static final long ON_ADJUST_BODY_VELOCITY_BYTE_OFFSET;
	public static final long ON_CONTACT_VALIDATE_BYTE_OFFSET;
	public static final long ON_CONTACT_ADDED_BYTE_OFFSET;
	public static final long ON_CONTACT_PERSISTED_BYTE_OFFSET;
	public static final long ON_CONTACT_REMOVED_BYTE_OFFSET;
	public static final long ON_CHARACTER_CONTACT_VALIDATE_BYTE_OFFSET;
	public static final long ON_CHARACTER_CONTACT_ADDED_BYTE_OFFSET;
	public static final long ON_CHARACTER_CONTACT_PERSISTED_BYTE_OFFSET;
	public static final long ON_CHARACTER_CONTACT_REMOVED_BYTE_OFFSET;
	public static final long ON_CONTACT_SOLVE_BYTE_OFFSET;
	public static final long ON_CHARACTER_CONTACT_SOLVE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("OnAdjustBodyVelocity"),
		    UNBOUNDED_ADDRESS.withName("OnContactValidate"),
		    UNBOUNDED_ADDRESS.withName("OnContactAdded"),
		    UNBOUNDED_ADDRESS.withName("OnContactPersisted"),
		    UNBOUNDED_ADDRESS.withName("OnContactRemoved"),
		    UNBOUNDED_ADDRESS.withName("OnCharacterContactValidate"),
		    UNBOUNDED_ADDRESS.withName("OnCharacterContactAdded"),
		    UNBOUNDED_ADDRESS.withName("OnCharacterContactPersisted"),
		    UNBOUNDED_ADDRESS.withName("OnCharacterContactRemoved"),
		    UNBOUNDED_ADDRESS.withName("OnContactSolve"),
		    UNBOUNDED_ADDRESS.withName("OnCharacterContactSolve")
		).withName("JPH_CharacterContactListenerFunctions").withByteAlignment(8);
		
		ON_ADJUST_BODY_VELOCITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnAdjustBodyVelocity"));
		ON_CONTACT_VALIDATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactValidate"));
		ON_CONTACT_ADDED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactAdded"));
		ON_CONTACT_PERSISTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactPersisted"));
		ON_CONTACT_REMOVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactRemoved"));
		ON_CHARACTER_CONTACT_VALIDATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnCharacterContactValidate"));
		ON_CHARACTER_CONTACT_ADDED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnCharacterContactAdded"));
		ON_CHARACTER_CONTACT_PERSISTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnCharacterContactPersisted"));
		ON_CHARACTER_CONTACT_REMOVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnCharacterContactRemoved"));
		ON_CONTACT_SOLVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactSolve"));
		ON_CHARACTER_CONTACT_SOLVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnCharacterContactSolve"));
		
		ON_ADJUST_BODY_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnAdjustBodyVelocity"));
		ON_CONTACT_VALIDATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactValidate"));
		ON_CONTACT_ADDED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactAdded"));
		ON_CONTACT_PERSISTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactPersisted"));
		ON_CONTACT_REMOVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactRemoved"));
		ON_CHARACTER_CONTACT_VALIDATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnCharacterContactValidate"));
		ON_CHARACTER_CONTACT_ADDED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnCharacterContactAdded"));
		ON_CHARACTER_CONTACT_PERSISTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnCharacterContactPersisted"));
		ON_CHARACTER_CONTACT_REMOVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnCharacterContactRemoved"));
		ON_CONTACT_SOLVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactSolve"));
		ON_CHARACTER_CONTACT_SOLVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnCharacterContactSolve"));
		//@formatter:on
	}

	public CharacterContactListenerFunctions() {
	    this(Arena.ofAuto());
	}
	
	public CharacterContactListenerFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CharacterContactListenerFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onAdjustBodyVelocity()
    public CharacterContactListenerFunctions onAdjustBodyVelocity(OnAdjustBodyVelocityFunction onAdjustBodyVelocity) {
    	ON_ADJUST_BODY_VELOCITY_HANDLE.set(segment, 0L, onAdjustBodyVelocity.memorySegment());
    	return this;
    }
    
    /// ```
    /// Callback to adjust the velocity of a body as seen by the character. Can be adjusted to e.g. implement a conveyor belt or an inertial dampener system of a sci-fi space ship.
    /// Note that inBody2 is locked during the callback so you can read its properties freely.
    /// ```
    public @Nullable OnAdjustBodyVelocityFunction onAdjustBodyVelocity() {
    	MemorySegment segment = (MemorySegment) ON_ADJUST_BODY_VELOCITY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnAdjustBodyVelocityFunction.get(segment);
    }
    
    /// @see #onContactValidate()
    public CharacterContactListenerFunctions onContactValidate(OnContactValidateFunction onContactValidate) {
    	ON_CONTACT_VALIDATE_HANDLE.set(segment, 0L, onContactValidate.memorySegment());
    	return this;
    }
    
    /// ```
    /// Checks if a character can collide with specified body. Return true if the contact is valid.
    /// ```
    public @Nullable OnContactValidateFunction onContactValidate() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_VALIDATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactValidateFunction.get(segment);
    }
    
    /// @see #onContactAdded()
    public CharacterContactListenerFunctions onContactAdded(OnContactAddedFunction onContactAdded) {
    	ON_CONTACT_ADDED_HANDLE.set(segment, 0L, onContactAdded.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever the character collides with a body for the first time.
    /// @param inCharacter Character that is being solved
    /// @param inContact Contact that we're colliding against
    /// @param ioSettings Settings returned by the contact callback to indicate how the character should behave
    /// ```
    public @Nullable OnContactAddedFunction onContactAdded() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_ADDED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactAddedFunction.get(segment);
    }
    
    /// @see #onContactPersisted()
    public CharacterContactListenerFunctions onContactPersisted(OnContactPersistedFunction onContactPersisted) {
    	ON_CONTACT_PERSISTED_HANDLE.set(segment, 0L, onContactPersisted.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever the character persists colliding with a body.
    /// @param inCharacter Character that is being solved
    /// @param inContact Contact that we're colliding against
    /// @param ioSettings Settings returned by the contact callback to indicate how the character should behave
    /// ```
    public @Nullable OnContactPersistedFunction onContactPersisted() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_PERSISTED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactPersistedFunction.get(segment);
    }
    
    /// @see #onContactRemoved()
    public CharacterContactListenerFunctions onContactRemoved(OnContactRemovedFunction onContactRemoved) {
    	ON_CONTACT_REMOVED_HANDLE.set(segment, 0L, onContactRemoved.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever the character loses contact with a body.
    /// Note that there is no guarantee that the body or its sub shape still exists at this point. The body may have been deleted since the last update.
    /// @param inCharacter Character that is being solved
    /// @param inBodyID2 Body ID of body that is being hit
    /// @param inSubShapeID2 Sub shape ID of shape that is being hit
    /// ```
    public @Nullable OnContactRemovedFunction onContactRemoved() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_REMOVED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactRemovedFunction.get(segment);
    }
    
    /// @see #onCharacterContactValidate()
    public CharacterContactListenerFunctions onCharacterContactValidate(OnCharacterContactValidateFunction onCharacterContactValidate) {
    	ON_CHARACTER_CONTACT_VALIDATE_HANDLE.set(segment, 0L, onCharacterContactValidate.memorySegment());
    	return this;
    }
    
    /// ```
    /// Same as OnContactValidate but when colliding with a CharacterVirtual
    /// ```
    public @Nullable OnCharacterContactValidateFunction onCharacterContactValidate() {
    	MemorySegment segment = (MemorySegment) ON_CHARACTER_CONTACT_VALIDATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnCharacterContactValidateFunction.get(segment);
    }
    
    /// @see #onCharacterContactAdded()
    public CharacterContactListenerFunctions onCharacterContactAdded(OnCharacterContactAddedFunction onCharacterContactAdded) {
    	ON_CHARACTER_CONTACT_ADDED_HANDLE.set(segment, 0L, onCharacterContactAdded.memorySegment());
    	return this;
    }
    
    /// ```
    /// Same as OnContactAdded but when colliding with a CharacterVirtual
    /// ```
    public @Nullable OnCharacterContactAddedFunction onCharacterContactAdded() {
    	MemorySegment segment = (MemorySegment) ON_CHARACTER_CONTACT_ADDED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnCharacterContactAddedFunction.get(segment);
    }
    
    /// @see #onCharacterContactPersisted()
    public CharacterContactListenerFunctions onCharacterContactPersisted(OnCharacterContactPersistedFunction onCharacterContactPersisted) {
    	ON_CHARACTER_CONTACT_PERSISTED_HANDLE.set(segment, 0L, onCharacterContactPersisted.memorySegment());
    	return this;
    }
    
    /// ```
    /// Same as OnContactPersisted but when colliding with a CharacterVirtual
    /// ```
    public @Nullable OnCharacterContactPersistedFunction onCharacterContactPersisted() {
    	MemorySegment segment = (MemorySegment) ON_CHARACTER_CONTACT_PERSISTED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnCharacterContactPersistedFunction.get(segment);
    }
    
    /// @see #onCharacterContactRemoved()
    public CharacterContactListenerFunctions onCharacterContactRemoved(OnCharacterContactRemovedFunction onCharacterContactRemoved) {
    	ON_CHARACTER_CONTACT_REMOVED_HANDLE.set(segment, 0L, onCharacterContactRemoved.memorySegment());
    	return this;
    }
    
    /// ```
    /// Same as OnContactRemoved but when colliding with a CharacterVirtual
    /// Note that inOtherCharacterID can be the ID of a character that has been deleted. This happens if the character was in contact with this character during the last update, but has been deleted since.
    /// ```
    public @Nullable OnCharacterContactRemovedFunction onCharacterContactRemoved() {
    	MemorySegment segment = (MemorySegment) ON_CHARACTER_CONTACT_REMOVED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnCharacterContactRemovedFunction.get(segment);
    }
    
    /// @see #onContactSolve()
    public CharacterContactListenerFunctions onContactSolve(OnContactSolveFunction onContactSolve) {
    	ON_CONTACT_SOLVE_HANDLE.set(segment, 0L, onContactSolve.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever a contact is being used by the solver. Allows the listener to override the resulting character velocity (e.g. by preventing sliding along certain surfaces).
    /// @param inCharacter Character that is being solved
    /// @param inBodyID2 Body ID of body that is being hit
    /// @param inSubShapeID2 Sub shape ID of shape that is being hit
    /// @param inContactPosition World space contact position
    /// @param inContactNormal World space contact normal
    /// @param inContactVelocity World space velocity of contact point (e.g. for a moving platform)
    /// @param inContactMaterial Material of contact point
    /// @param inCharacterVelocity World space velocity of the character prior to hitting this contact
    /// @param ioNewCharacterVelocity Contains the calculated world space velocity of the character after hitting this contact, this velocity slides along the surface of the contact. Can be modified by the listener to provide an alternative velocity.
    /// ```
    public @Nullable OnContactSolveFunction onContactSolve() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_SOLVE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactSolveFunction.get(segment);
    }
    
    /// @see #onCharacterContactSolve()
    public CharacterContactListenerFunctions onCharacterContactSolve(OnCharacterContactSolveFunction onCharacterContactSolve) {
    	ON_CHARACTER_CONTACT_SOLVE_HANDLE.set(segment, 0L, onCharacterContactSolve.memorySegment());
    	return this;
    }
    
    /// ```
    /// Same as OnContactSolve but when colliding with a CharacterVirtual
    /// ```
    public @Nullable OnCharacterContactSolveFunction onCharacterContactSolve() {
    	MemorySegment segment = (MemorySegment) ON_CHARACTER_CONTACT_SOLVE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnCharacterContactSolveFunction.get(segment);
    }
    
    @Override
    public CharacterContactListenerFunctions set(CharacterContactListenerFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public CharacterContactListenerFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CharacterContactListenerFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CharacterContactListenerFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new CharacterContactListenerFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<CharacterContactListenerFunctions> array(SegmentAllocator allocator, CharacterContactListenerFunctions... structs) {
        NativeStructArray<CharacterContactListenerFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new CharacterContactListenerFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CharacterContactListenerFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CharacterContactListenerFunctions(segment)
        );
    }

}