/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterContact extends CharacterContactKey {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_AS_CHARACTER_CONTACT_KEY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_CONTACT_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_CONTACT_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_SURFACE_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_SURFACE_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_MOTION_TYPE_B;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_MOTION_TYPE_B;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_IS_SENSOR_B;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_IS_SENSOR_B;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_CHARACTER_B;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_CHARACTER_B;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_HAD_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_HAD_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_WAS_DISCARDED;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_WAS_DISCARDED;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_CAN_PUSH_CHARACTER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_CAN_PUSH_CHARACTER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_GET_IS_BACK_FACING_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SET_IS_BACK_FACING_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_CONTACT_CREATE = downcallHandle("JPH_CharacterContact_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_AS_CHARACTER_CONTACT_KEY = downcallHandle("JPH_CharacterContact_AsCharacterContactKey", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_GET_POSITION = downcallHandleVoid("JPH_CharacterContact_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_POSITION = downcallHandleVoid("JPH_CharacterContact_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_CharacterContact_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_CharacterContact_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_GET_CONTACT_NORMAL = downcallHandleVoid("JPH_CharacterContact_GetContactNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_CONTACT_NORMAL = downcallHandleVoid("JPH_CharacterContact_SetContactNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_GET_SURFACE_NORMAL = downcallHandleVoid("JPH_CharacterContact_GetSurfaceNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_SURFACE_NORMAL = downcallHandleVoid("JPH_CharacterContact_SetSurfaceNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_GET_DISTANCE = downcallHandle("JPH_CharacterContact_GetDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_DISTANCE = downcallHandleVoid("JPH_CharacterContact_SetDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_CONTACT_GET_FRACTION = downcallHandle("JPH_CharacterContact_GetFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_FRACTION = downcallHandleVoid("JPH_CharacterContact_SetFraction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_CONTACT_GET_MOTION_TYPE_B = downcallHandle("JPH_CharacterContact_GetMotionTypeB", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_MOTION_TYPE_B = downcallHandleVoid("JPH_CharacterContact_SetMotionTypeB", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CHARACTER_CONTACT_GET_IS_SENSOR_B = downcallHandle("JPH_CharacterContact_GetIsSensorB", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_IS_SENSOR_B = downcallHandleVoid("JPH_CharacterContact_SetIsSensorB", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_CONTACT_GET_CHARACTER_B = downcallHandle("JPH_CharacterContact_GetCharacterB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_CHARACTER_B = downcallHandleVoid("JPH_CharacterContact_SetCharacterB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_GET_USER_DATA = downcallHandle("JPH_CharacterContact_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_USER_DATA = downcallHandleVoid("JPH_CharacterContact_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CHARACTER_CONTACT_GET_MATERIAL = downcallHandle("JPH_CharacterContact_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_MATERIAL = downcallHandleVoid("JPH_CharacterContact_SetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_GET_HAD_COLLISION = downcallHandle("JPH_CharacterContact_GetHadCollision", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_HAD_COLLISION = downcallHandleVoid("JPH_CharacterContact_SetHadCollision", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_CONTACT_GET_WAS_DISCARDED = downcallHandle("JPH_CharacterContact_GetWasDiscarded", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_WAS_DISCARDED = downcallHandleVoid("JPH_CharacterContact_SetWasDiscarded", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_CONTACT_GET_CAN_PUSH_CHARACTER = downcallHandle("JPH_CharacterContact_GetCanPushCharacter", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_CAN_PUSH_CHARACTER = downcallHandleVoid("JPH_CharacterContact_SetCanPushCharacter", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_CONTACT_GET_IS_BACK_FACING_CONTACT = downcallHandle("JPH_CharacterContact_GetIsBackFacingContact", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_SET_IS_BACK_FACING_CONTACT = downcallHandleVoid("JPH_CharacterContact_SetIsBackFacingContact", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_CONTACT_SAVE_STATE = downcallHandleVoid("JPH_CharacterContact_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_RESTORE_STATE = downcallHandleVoid("JPH_CharacterContact_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CharacterContact() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterContact(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCharacterContactKey(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CharacterContact(MemorySegment segment) {
		this.segment = segment;
		super(asCharacterContactKey(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_CONTACT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCharacterContactKey(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_AS_CHARACTER_CONTACT_KEY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#asCharacterContactKey].
    public final @Nullable CharacterContactKey asCharacterContactKey() {
    	MemorySegment segment = asCharacterContactKey(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterContactKey(segment);
    }
    
    /// ```
    /// Position where the character makes contact
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Position where the character makes contact
    /// ```
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment mPosition
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	Vec3 mPosition
    ) {
    	setPosition(
    		this.segment,
    		mPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity of the contact point
    /// ```
    public static void getLinearVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity].
    public final void getLinearVelocity(
    	Vec3 outResult
    ) {
    	getLinearVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity of the contact point
    /// ```
    public static void setLinearVelocity(
    	MemorySegment self,
    	MemorySegment mLinearVelocity
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public final void setLinearVelocity(
    	Vec3 mLinearVelocity
    ) {
    	setLinearVelocity(
    		this.segment,
    		mLinearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Contact normal, pointing towards the character
    /// ```
    public static void getContactNormal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_CONTACT_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactNormal].
    public final void getContactNormal(
    	Vec3 outResult
    ) {
    	getContactNormal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Contact normal, pointing towards the character
    /// ```
    public static void setContactNormal(
    	MemorySegment self,
    	MemorySegment mContactNormal
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_CONTACT_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mContactNormal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactNormal].
    public final void setContactNormal(
    	Vec3 mContactNormal
    ) {
    	setContactNormal(
    		this.segment,
    		mContactNormal.memorySegment()
    	);
    }
    
    /// ```
    /// Surface normal of the contact. Has been flipped if the contact is back facing (mIsBackFacingContact) and is equal to the contact normal if the contact normal is pointing up more.
    /// ```
    public static void getSurfaceNormal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_SURFACE_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSurfaceNormal].
    public final void getSurfaceNormal(
    	Vec3 outResult
    ) {
    	getSurfaceNormal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Surface normal of the contact. Has been flipped if the contact is back facing (mIsBackFacingContact) and is equal to the contact normal if the contact normal is pointing up more.
    /// ```
    public static void setSurfaceNormal(
    	MemorySegment self,
    	MemorySegment mSurfaceNormal
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_SURFACE_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSurfaceNormal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSurfaceNormal].
    public final void setSurfaceNormal(
    	Vec3 mSurfaceNormal
    ) {
    	setSurfaceNormal(
    		this.segment,
    		mSurfaceNormal.memorySegment()
    	);
    }
    
    /// ```
    /// Distance to the contact = 0 means that it is an actual contact, > 0 means predictive
    /// ```
    public static float getDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDistance].
    public final float getDistance() {
    	return getDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// Distance to the contact = 0 means that it is an actual contact, > 0 means predictive
    /// ```
    public static void setDistance(
    	MemorySegment self,
    	float mDistance
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDistance].
    public final void setDistance(
    	float mDistance
    ) {
    	setDistance(
    		this.segment,
    		mDistance
    	);
    }
    
    /// ```
    /// Fraction along the path where this contact takes place
    /// ```
    public static float getFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFraction].
    public final float getFraction() {
    	return getFraction(
    		this.segment
    	);
    }
    
    /// ```
    /// Fraction along the path where this contact takes place
    /// ```
    public static void setFraction(
    	MemorySegment self,
    	float mFraction
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_FRACTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFraction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFraction].
    public final void setFraction(
    	float mFraction
    ) {
    	setFraction(
    		this.segment,
    		mFraction
    	);
    }
    
    /// ```
    /// Motion type of B, used to determine the priority of the contact
    /// ```
    public static int getMotionTypeB(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_MOTION_TYPE_B.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionTypeB].
    public final int getMotionTypeB() {
    	return getMotionTypeB(
    		this.segment
    	);
    }
    
    /// ```
    /// Motion type of B, used to determine the priority of the contact
    /// ```
    public static void setMotionTypeB(
    	MemorySegment self,
    	int mMotionTypeB
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_MOTION_TYPE_B.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMotionTypeB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotionTypeB].
    public final void setMotionTypeB(
    	int mMotionTypeB
    ) {
    	setMotionTypeB(
    		this.segment,
    		mMotionTypeB
    	);
    }
    
    /// ```
    /// If B is a sensor
    /// ```
    public static boolean getIsSensorB(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_IS_SENSOR_B.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsSensorB].
    public final boolean getIsSensorB() {
    	return getIsSensorB(
    		this.segment
    	);
    }
    
    /// ```
    /// If B is a sensor
    /// ```
    public static void setIsSensorB(
    	MemorySegment self,
    	boolean mIsSensorB
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_IS_SENSOR_B.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsSensorB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsSensorB].
    public final void setIsSensorB(
    	boolean mIsSensorB
    ) {
    	setIsSensorB(
    		this.segment,
    		mIsSensorB
    	);
    }
    
    /// ```
    /// Character we're colliding with (if not nullptr). Note that this may be a dangling pointer when accessed through GetActiveContacts(), use mCharacterIDB instead.
    /// ```
    public static MemorySegment getCharacterB(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_CHARACTER_B.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCharacterB].
    public final @Nullable CharacterVirtual getCharacterB() {
    	MemorySegment segment = getCharacterB(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterVirtual(segment);
    }
    
    /// ```
    /// Character we're colliding with (if not nullptr). Note that this may be a dangling pointer when accessed through GetActiveContacts(), use mCharacterIDB instead.
    /// ```
    public static void setCharacterB(
    	MemorySegment self,
    	MemorySegment mCharacterB
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_CHARACTER_B.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCharacterB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCharacterB].
    public final void setCharacterB(
    	CharacterVirtual mCharacterB
    ) {
    	setCharacterB(
    		this.segment,
    		mCharacterB.memorySegment()
    	);
    }
    
    /// ```
    /// User data of B
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final long getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    /// ```
    /// User data of B
    /// ```
    public static void setUserData(
    	MemorySegment self,
    	long mUserData
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	long mUserData
    ) {
    	setUserData(
    		this.segment,
    		mUserData
    	);
    }
    
    /// ```
    /// Material of B
    /// ```
    public static MemorySegment getMaterial(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial].
    public final @Nullable PhysicsMaterial getMaterial() {
    	MemorySegment segment = getMaterial(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterial(segment);
    }
    
    /// ```
    /// Material of B
    /// ```
    public static void setMaterial(
    	MemorySegment self,
    	MemorySegment mMaterial
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterial].
    public final void setMaterial(
    	PhysicsMaterial mMaterial
    ) {
    	setMaterial(
    		this.segment,
    		mMaterial.memorySegment()
    	);
    }
    
    /// ```
    /// If the character actually collided with the contact (can be false if a predictive contact never becomes a real one)
    /// ```
    public static boolean getHadCollision(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_HAD_COLLISION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHadCollision].
    public final boolean getHadCollision() {
    	return getHadCollision(
    		this.segment
    	);
    }
    
    /// ```
    /// If the character actually collided with the contact (can be false if a predictive contact never becomes a real one)
    /// ```
    public static void setHadCollision(
    	MemorySegment self,
    	boolean mHadCollision
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_HAD_COLLISION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHadCollision
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHadCollision].
    public final void setHadCollision(
    	boolean mHadCollision
    ) {
    	setHadCollision(
    		this.segment,
    		mHadCollision
    	);
    }
    
    /// ```
    /// If the contact validate callback chose to discard this contact or when the body is a sensor
    /// ```
    public static boolean getWasDiscarded(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_WAS_DISCARDED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWasDiscarded].
    public final boolean getWasDiscarded() {
    	return getWasDiscarded(
    		this.segment
    	);
    }
    
    /// ```
    /// If the contact validate callback chose to discard this contact or when the body is a sensor
    /// ```
    public static void setWasDiscarded(
    	MemorySegment self,
    	boolean mWasDiscarded
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_WAS_DISCARDED.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWasDiscarded
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWasDiscarded].
    public final void setWasDiscarded(
    	boolean mWasDiscarded
    ) {
    	setWasDiscarded(
    		this.segment,
    		mWasDiscarded
    	);
    }
    
    /// ```
    /// When true, the velocity of the contact point can push the character
    /// ```
    public static boolean getCanPushCharacter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_CAN_PUSH_CHARACTER.get();
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
    /// When true, the velocity of the contact point can push the character
    /// ```
    public static void setCanPushCharacter(
    	MemorySegment self,
    	boolean mCanPushCharacter
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_CAN_PUSH_CHARACTER.get();
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
    /// If this contact came from a back facing triangle / collision shape
    /// ```
    public static boolean getIsBackFacingContact(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_GET_IS_BACK_FACING_CONTACT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsBackFacingContact].
    public final boolean getIsBackFacingContact() {
    	return getIsBackFacingContact(
    		this.segment
    	);
    }
    
    /// ```
    /// If this contact came from a back facing triangle / collision shape
    /// ```
    public static void setIsBackFacingContact(
    	MemorySegment self,
    	boolean mIsBackFacingContact
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SET_IS_BACK_FACING_CONTACT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsBackFacingContact
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsBackFacingContact].
    public final void setIsBackFacingContact(
    	boolean mIsBackFacingContact
    ) {
    	setIsBackFacingContact(
    		this.segment,
    		mIsBackFacingContact
    	);
    }
    
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_SAVE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveState].
    public final void saveState(
    	StateRecorder inStream
    ) {
    	saveState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_RESTORE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreState].
    public final void restoreState(
    	StateRecorder inStream
    ) {
    	restoreState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}