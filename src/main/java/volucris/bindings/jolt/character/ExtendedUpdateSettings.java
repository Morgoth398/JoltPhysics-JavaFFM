/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ExtendedUpdateSettings {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_STICK_TO_FLOOR_STEP_DOWN;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_STICK_TO_FLOOR_STEP_DOWN;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_UP;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_UP;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_MIN_STEP_FORWARD;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_MIN_STEP_FORWARD;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_FORWARD_TEST;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_FORWARD_TEST;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_DOWN_EXTRA;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_DOWN_EXTRA;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_CREATE = downcallHandle("JPH_CharacterVirtualExtendedUpdateSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_DESTROY = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_STICK_TO_FLOOR_STEP_DOWN = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_GetStickToFloorStepDown", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_STICK_TO_FLOOR_STEP_DOWN = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_SetStickToFloorStepDown", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_UP = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_GetWalkStairsStepUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_UP = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_SetWalkStairsStepUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_MIN_STEP_FORWARD = downcallHandle("JPH_CharacterVirtualExtendedUpdateSettings_GetWalkStairsMinStepForward", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_MIN_STEP_FORWARD = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_SetWalkStairsMinStepForward", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_FORWARD_TEST = downcallHandle("JPH_CharacterVirtualExtendedUpdateSettings_GetWalkStairsStepForwardTest", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_FORWARD_TEST = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_SetWalkStairsStepForwardTest", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT = downcallHandle("JPH_CharacterVirtualExtendedUpdateSettings_GetWalkStairsCosAngleForwardContact", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_SetWalkStairsCosAngleForwardContact", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_DOWN_EXTRA = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_GetWalkStairsStepDownExtra", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_DOWN_EXTRA = downcallHandleVoid("JPH_CharacterVirtualExtendedUpdateSettings_SetWalkStairsStepDownExtra", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ExtendedUpdateSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ExtendedUpdateSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ExtendedUpdateSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// See StickToFloor inStepDown parameter. Can be zero to turn off.
    /// ```
    public static void getStickToFloorStepDown(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_STICK_TO_FLOOR_STEP_DOWN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getStickToFloorStepDown].
    public final void getStickToFloorStepDown(
    	Vec3 outResult
    ) {
    	getStickToFloorStepDown(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// See StickToFloor inStepDown parameter. Can be zero to turn off.
    /// ```
    public static void setStickToFloorStepDown(
    	MemorySegment self,
    	MemorySegment mStickToFloorStepDown
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_STICK_TO_FLOOR_STEP_DOWN.get();
    	try {
    		 method.invokeExact(
    			self,
    			mStickToFloorStepDown
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setStickToFloorStepDown].
    public final void setStickToFloorStepDown(
    	Vec3 mStickToFloorStepDown
    ) {
    	setStickToFloorStepDown(
    		this.segment,
    		mStickToFloorStepDown.memorySegment()
    	);
    }
    
    /// ```
    /// See WalkStairs inStepUp parameter. Can be zero to turn off.
    /// ```
    public static void getWalkStairsStepUp(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWalkStairsStepUp].
    public final void getWalkStairsStepUp(
    	Vec3 outResult
    ) {
    	getWalkStairsStepUp(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// See WalkStairs inStepUp parameter. Can be zero to turn off.
    /// ```
    public static void setWalkStairsStepUp(
    	MemorySegment self,
    	MemorySegment mWalkStairsStepUp
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWalkStairsStepUp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWalkStairsStepUp].
    public final void setWalkStairsStepUp(
    	Vec3 mWalkStairsStepUp
    ) {
    	setWalkStairsStepUp(
    		this.segment,
    		mWalkStairsStepUp.memorySegment()
    	);
    }
    
    /// ```
    /// See WalkStairs inStepForward parameter. Note that the parameter only indicates a magnitude, direction is taken from current velocity.
    /// ```
    public static float getWalkStairsMinStepForward(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_MIN_STEP_FORWARD.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWalkStairsMinStepForward].
    public final float getWalkStairsMinStepForward() {
    	return getWalkStairsMinStepForward(
    		this.segment
    	);
    }
    
    /// ```
    /// See WalkStairs inStepForward parameter. Note that the parameter only indicates a magnitude, direction is taken from current velocity.
    /// ```
    public static void setWalkStairsMinStepForward(
    	MemorySegment self,
    	float mWalkStairsMinStepForward
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_MIN_STEP_FORWARD.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWalkStairsMinStepForward
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWalkStairsMinStepForward].
    public final void setWalkStairsMinStepForward(
    	float mWalkStairsMinStepForward
    ) {
    	setWalkStairsMinStepForward(
    		this.segment,
    		mWalkStairsMinStepForward
    	);
    }
    
    /// ```
    /// See WalkStairs inStepForwardTest parameter. Note that the parameter only indicates a magnitude, direction is taken from current velocity.
    /// ```
    public static float getWalkStairsStepForwardTest(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_FORWARD_TEST.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWalkStairsStepForwardTest].
    public final float getWalkStairsStepForwardTest() {
    	return getWalkStairsStepForwardTest(
    		this.segment
    	);
    }
    
    /// ```
    /// See WalkStairs inStepForwardTest parameter. Note that the parameter only indicates a magnitude, direction is taken from current velocity.
    /// ```
    public static void setWalkStairsStepForwardTest(
    	MemorySegment self,
    	float mWalkStairsStepForwardTest
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_FORWARD_TEST.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWalkStairsStepForwardTest
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWalkStairsStepForwardTest].
    public final void setWalkStairsStepForwardTest(
    	float mWalkStairsStepForwardTest
    ) {
    	setWalkStairsStepForwardTest(
    		this.segment,
    		mWalkStairsStepForwardTest
    	);
    }
    
    /// ```
    /// Cos(angle) where angle is the maximum angle between the ground normal in the horizontal plane and the character forward vector where we're willing to adjust the step forward test towards the contact normal.
    /// ```
    public static float getWalkStairsCosAngleForwardContact(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWalkStairsCosAngleForwardContact].
    public final float getWalkStairsCosAngleForwardContact() {
    	return getWalkStairsCosAngleForwardContact(
    		this.segment
    	);
    }
    
    /// ```
    /// Cos(angle) where angle is the maximum angle between the ground normal in the horizontal plane and the character forward vector where we're willing to adjust the step forward test towards the contact normal.
    /// ```
    public static void setWalkStairsCosAngleForwardContact(
    	MemorySegment self,
    	float mWalkStairsCosAngleForwardContact
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWalkStairsCosAngleForwardContact
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWalkStairsCosAngleForwardContact].
    public final void setWalkStairsCosAngleForwardContact(
    	float mWalkStairsCosAngleForwardContact
    ) {
    	setWalkStairsCosAngleForwardContact(
    		this.segment,
    		mWalkStairsCosAngleForwardContact
    	);
    }
    
    /// ```
    /// See WalkStairs inStepDownExtra
    /// ```
    public static void getWalkStairsStepDownExtra(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_GET_WALK_STAIRS_STEP_DOWN_EXTRA.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWalkStairsStepDownExtra].
    public final void getWalkStairsStepDownExtra(
    	Vec3 outResult
    ) {
    	getWalkStairsStepDownExtra(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// See WalkStairs inStepDownExtra
    /// ```
    public static void setWalkStairsStepDownExtra(
    	MemorySegment self,
    	MemorySegment mWalkStairsStepDownExtra
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE_SETTINGS_SET_WALK_STAIRS_STEP_DOWN_EXTRA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWalkStairsStepDownExtra
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWalkStairsStepDownExtra].
    public final void setWalkStairsStepDownExtra(
    	Vec3 mWalkStairsStepDownExtra
    ) {
    	setWalkStairsStepDownExtra(
    		this.segment,
    		mWalkStairsStepDownExtra.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}