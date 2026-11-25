/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterContactSettings {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SETTINGS_GET_CAN_PUSH_CHARACTER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SETTINGS_SET_CAN_PUSH_CHARACTER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SETTINGS_GET_CAN_RECEIVE_IMPULSES;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SETTINGS_SET_CAN_RECEIVE_IMPULSES;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_CONTACT_SETTINGS_CREATE = downcallHandle("JPH_CharacterContactSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SETTINGS_DESTROY = downcallHandleVoid("JPH_CharacterContactSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SETTINGS_GET_CAN_PUSH_CHARACTER = downcallHandle("JPH_CharacterContactSettings_GetCanPushCharacter", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SETTINGS_SET_CAN_PUSH_CHARACTER = downcallHandleVoid("JPH_CharacterContactSettings_SetCanPushCharacter", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_CONTACT_SETTINGS_GET_CAN_RECEIVE_IMPULSES = downcallHandle("JPH_CharacterContactSettings_GetCanReceiveImpulses", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SETTINGS_SET_CAN_RECEIVE_IMPULSES = downcallHandleVoid("JPH_CharacterContactSettings_SetCanReceiveImpulses", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		//@formatter:on
	}

	public CharacterContactSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterContactSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterContactSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// True when the object can push the virtual character.
    /// ```
    public static boolean getCanPushCharacter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SETTINGS_GET_CAN_PUSH_CHARACTER.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCanPushCharacter].
    public final boolean getCanPushCharacter() {
    	return getCanPushCharacter(
    		this.segment
    	);
    }
    
    /// ```
    /// True when the object can push the virtual character.
    /// ```
    public static void setCanPushCharacter(
    	MemorySegment self,
    	boolean mCanPushCharacter
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SETTINGS_SET_CAN_PUSH_CHARACTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCanPushCharacter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCanPushCharacter].
    public final void setCanPushCharacter(
    	boolean mCanPushCharacter
    ) {
    	setCanPushCharacter(
    		this.segment,
    		mCanPushCharacter
    	);
    }
    
    /// ```
    /// True when the virtual character can apply impulses (push) the body.
    /// Note that this only works against rigid bodies. Other CharacterVirtual objects can only be moved in their own update,
    /// so you must ensure that in their OnCharacterContactAdded mCanPushCharacter is true.
    /// ```
    public static boolean getCanReceiveImpulses(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SETTINGS_GET_CAN_RECEIVE_IMPULSES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCanReceiveImpulses].
    public final boolean getCanReceiveImpulses() {
    	return getCanReceiveImpulses(
    		this.segment
    	);
    }
    
    /// ```
    /// True when the virtual character can apply impulses (push) the body.
    /// Note that this only works against rigid bodies. Other CharacterVirtual objects can only be moved in their own update,
    /// so you must ensure that in their OnCharacterContactAdded mCanPushCharacter is true.
    /// ```
    public static void setCanReceiveImpulses(
    	MemorySegment self,
    	boolean mCanReceiveImpulses
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SETTINGS_SET_CAN_RECEIVE_IMPULSES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCanReceiveImpulses
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCanReceiveImpulses].
    public final void setCanReceiveImpulses(
    	boolean mCanReceiveImpulses
    ) {
    	setCanReceiveImpulses(
    		this.segment,
    		mCanReceiveImpulses
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}