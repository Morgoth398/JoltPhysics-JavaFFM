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

public final class ContactListenerFunctions
		implements Struct<ContactListenerFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ON_CONTACT_VALIDATE_HANDLE;
	public static final VarHandle ON_CONTACT_ADDED_HANDLE;
	public static final VarHandle ON_CONTACT_PERSISTED_HANDLE;
	public static final VarHandle ON_CONTACT_REMOVED_HANDLE;

	public static final long ON_CONTACT_VALIDATE_BYTE_OFFSET;
	public static final long ON_CONTACT_ADDED_BYTE_OFFSET;
	public static final long ON_CONTACT_PERSISTED_BYTE_OFFSET;
	public static final long ON_CONTACT_REMOVED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("OnContactValidate"),
		    UNBOUNDED_ADDRESS.withName("OnContactAdded"),
		    UNBOUNDED_ADDRESS.withName("OnContactPersisted"),
		    UNBOUNDED_ADDRESS.withName("OnContactRemoved")
		).withName("JPH_ContactListenerFunctions").withByteAlignment(8);
		
		ON_CONTACT_VALIDATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactValidate"));
		ON_CONTACT_ADDED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactAdded"));
		ON_CONTACT_PERSISTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactPersisted"));
		ON_CONTACT_REMOVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OnContactRemoved"));
		
		ON_CONTACT_VALIDATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactValidate"));
		ON_CONTACT_ADDED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactAdded"));
		ON_CONTACT_PERSISTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactPersisted"));
		ON_CONTACT_REMOVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OnContactRemoved"));
		//@formatter:on
	}

	public ContactListenerFunctions() {
	    this(Arena.ofAuto());
	}
	
	public ContactListenerFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public ContactListenerFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #onContactValidate()
    public ContactListenerFunctions onContactValidate(OnContactValidateFunction onContactValidate) {
    	ON_CONTACT_VALIDATE_HANDLE.set(segment, 0L, onContactValidate.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called after detecting a collision between a body pair, but before calling OnContactAdded and before adding the contact constraint.
    /// If the function rejects the contact, the contact will not be processed by the simulation.
    /// This is a rather expensive time to reject a contact point since a lot of the collision detection has happened already, make sure you
    /// filter out the majority of undesired body pairs through the ObjectLayerPairFilter that is registered on the PhysicsSystem.
    /// 
    /// This function may not be called again the next update if a contact persists and no new contact pairs between sub shapes are found.
    /// 
    /// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
    /// 
    /// Body 1 will have a motion type that is larger or equal than body 2's motion type (order from large to small: dynamic -> kinematic -> static). When motion types are equal, they are ordered by BodyID.
    /// 
    /// The collision result (inCollisionResult) is reported relative to inBaseOffset.
    /// ```
    public @Nullable OnContactValidateFunction onContactValidate() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_VALIDATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactValidateFunction.get(segment);
    }
    
    /// @see #onContactAdded()
    public ContactListenerFunctions onContactAdded(OnContactAddedFunction onContactAdded) {
    	ON_CONTACT_ADDED_HANDLE.set(segment, 0L, onContactAdded.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever a new contact point is detected.
    /// 
    /// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
    /// 
    /// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
    /// 
    /// Note that only active bodies will report contacts, as soon as a body goes to sleep the contacts between that body and all other
    /// bodies will receive an OnContactRemoved callback, if this is the case then Body::IsActive() will return false during the callback.
    /// 
    /// When contacts are added, the constraint solver has not run yet, so the collision impulse is unknown at that point.
    /// The velocities of inBody1 and inBody2 are the velocities before the contact has been resolved, so you can use this to
    /// estimate the collision impulse to e.g. determine the volume of the impact sound to play (see: EstimateCollisionResponse).
    /// ```
    public @Nullable OnContactAddedFunction onContactAdded() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_ADDED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactAddedFunction.get(segment);
    }
    
    /// @see #onContactPersisted()
    public ContactListenerFunctions onContactPersisted(OnContactPersistedFunction onContactPersisted) {
    	ON_CONTACT_PERSISTED_HANDLE.set(segment, 0L, onContactPersisted.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever a contact is detected that was also detected last update.
    /// 
    /// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
    /// 
    /// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
    /// 
    /// If the structure of the shape of a body changes between simulation steps (e.g. by adding/removing a child shape of a compound shape),
    /// it is possible that the same sub shape ID used to identify the removed child shape is now reused for a different child shape. The physics
    /// system cannot detect this, so may send a 'contact persisted' callback even though the contact is now on a different child shape. You can
    /// detect this by keeping the old shape (before adding/removing a part) around until the next PhysicsSystem::Update (when the OnContactPersisted
    /// callbacks are triggered) and resolving the sub shape ID against both the old and new shape to see if they still refer to the same child shape.
    /// ```
    public @Nullable OnContactPersistedFunction onContactPersisted() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_PERSISTED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactPersistedFunction.get(segment);
    }
    
    /// @see #onContactRemoved()
    public ContactListenerFunctions onContactRemoved(OnContactRemovedFunction onContactRemoved) {
    	ON_CONTACT_REMOVED_HANDLE.set(segment, 0L, onContactRemoved.memorySegment());
    	return this;
    }
    
    /// ```
    /// Called whenever a contact was detected last update but is not detected anymore.
    /// 
    /// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
    /// 
    /// Beware when trying to access the bodies at the time of callback:
    /// - Some properties of the bodies are being modified from another thread at the same time.
    /// Things that the simulation doesn't modify are safe to read (e.g. user data, if sensor, if added to system etc.).
    /// Things that the simulation does modify (e.g. position, rotation, velocity, bounding box) are not safe to read.
    /// Checking Body::IsActive may return that the body is active but another thread can be in the process of making it go to sleep.
    /// Writing to the bodies is not allowed.
    /// - The body may have been removed and destroyed (you'll receive an OnContactRemoved callback in the PhysicsSystem::Update after the body has been removed). Check that the body still exists.
    /// 
    /// If you need the properties that are being written, cache what you need in the OnContactAdded and OnContactPersisted callbacks and store it in a separate structure to use during this callback.
    /// Alternatively, you could just record that the contact was removed and process it after PhysicsSystem::Update.
    /// 
    /// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
    /// 
    /// The sub shape IDs were created in the previous simulation step, so if the structure of a shape changes (e.g. by adding/removing a child shape of a compound shape),
    /// the sub shape ID may not be valid / may not point to the same sub shape anymore.
    /// If you want to know if this is the last contact between the two bodies, use PhysicsSystem::WereBodiesInContact.
    /// ```
    public @Nullable OnContactRemovedFunction onContactRemoved() {
    	MemorySegment segment = (MemorySegment) ON_CONTACT_REMOVED_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return OnContactRemovedFunction.get(segment);
    }
    
    @Override
    public ContactListenerFunctions set(ContactListenerFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public ContactListenerFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ContactListenerFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ContactListenerFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new ContactListenerFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<ContactListenerFunctions> array(SegmentAllocator allocator, ContactListenerFunctions... structs) {
        NativeStructArray<ContactListenerFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new ContactListenerFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ContactListenerFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ContactListenerFunctions(segment)
        );
    }

}