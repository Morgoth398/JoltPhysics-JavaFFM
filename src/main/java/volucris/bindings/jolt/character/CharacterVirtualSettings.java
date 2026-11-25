/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.ShapeRefConst;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterVirtualSettings extends CharacterBaseSettings {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_AS_CHARACTER_BASE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MASS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MASS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_STRENGTH;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_STRENGTH;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_SHAPE_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_SHAPE_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_BACK_FACE_MODE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_BACK_FACE_MODE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_PREDICTIVE_CONTACT_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_PREDICTIVE_CONTACT_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_COLLISION_ITERATIONS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_COLLISION_ITERATIONS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_CONSTRAINT_ITERATIONS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_CONSTRAINT_ITERATIONS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MIN_TIME_REMAINING;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MIN_TIME_REMAINING;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_COLLISION_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_COLLISION_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_CHARACTER_PADDING;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_CHARACTER_PADDING;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_NUM_HITS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_NUM_HITS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_HIT_REDUCTION_COS_MAX_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_HIT_REDUCTION_COS_MAX_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_PENETRATION_RECOVERY_SPEED;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_PENETRATION_RECOVERY_SPEED;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_IDOVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_IDOVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_LAYER;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_LAYER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_VIRTUAL_SETTINGS_CREATE = downcallHandle("JPH_CharacterVirtualSettings_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_CREATE1 = downcallHandle("JPH_CharacterVirtualSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_AS_CHARACTER_BASE_SETTINGS = downcallHandle("JPH_CharacterVirtualSettings_AsCharacterBaseSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_ID = downcallHandleVoid("JPH_CharacterVirtualSettings_GetID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_ID = downcallHandleVoid("JPH_CharacterVirtualSettings_SetID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MASS = downcallHandle("JPH_CharacterVirtualSettings_GetMass", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MASS = downcallHandleVoid("JPH_CharacterVirtualSettings_SetMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_STRENGTH = downcallHandle("JPH_CharacterVirtualSettings_GetMaxStrength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_STRENGTH = downcallHandleVoid("JPH_CharacterVirtualSettings_SetMaxStrength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_SHAPE_OFFSET = downcallHandleVoid("JPH_CharacterVirtualSettings_GetShapeOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_SHAPE_OFFSET = downcallHandleVoid("JPH_CharacterVirtualSettings_SetShapeOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_BACK_FACE_MODE = downcallHandle("JPH_CharacterVirtualSettings_GetBackFaceMode", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_BACK_FACE_MODE = downcallHandleVoid("JPH_CharacterVirtualSettings_SetBackFaceMode", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_PREDICTIVE_CONTACT_DISTANCE = downcallHandle("JPH_CharacterVirtualSettings_GetPredictiveContactDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_PREDICTIVE_CONTACT_DISTANCE = downcallHandleVoid("JPH_CharacterVirtualSettings_SetPredictiveContactDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_COLLISION_ITERATIONS = downcallHandle("JPH_CharacterVirtualSettings_GetMaxCollisionIterations", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_COLLISION_ITERATIONS = downcallHandleVoid("JPH_CharacterVirtualSettings_SetMaxCollisionIterations", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_CONSTRAINT_ITERATIONS = downcallHandle("JPH_CharacterVirtualSettings_GetMaxConstraintIterations", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_CONSTRAINT_ITERATIONS = downcallHandleVoid("JPH_CharacterVirtualSettings_SetMaxConstraintIterations", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MIN_TIME_REMAINING = downcallHandle("JPH_CharacterVirtualSettings_GetMinTimeRemaining", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MIN_TIME_REMAINING = downcallHandleVoid("JPH_CharacterVirtualSettings_SetMinTimeRemaining", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_COLLISION_TOLERANCE = downcallHandle("JPH_CharacterVirtualSettings_GetCollisionTolerance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_COLLISION_TOLERANCE = downcallHandleVoid("JPH_CharacterVirtualSettings_SetCollisionTolerance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_CHARACTER_PADDING = downcallHandle("JPH_CharacterVirtualSettings_GetCharacterPadding", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_CHARACTER_PADDING = downcallHandleVoid("JPH_CharacterVirtualSettings_SetCharacterPadding", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_NUM_HITS = downcallHandle("JPH_CharacterVirtualSettings_GetMaxNumHits", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_NUM_HITS = downcallHandleVoid("JPH_CharacterVirtualSettings_SetMaxNumHits", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_HIT_REDUCTION_COS_MAX_ANGLE = downcallHandle("JPH_CharacterVirtualSettings_GetHitReductionCosMaxAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_HIT_REDUCTION_COS_MAX_ANGLE = downcallHandleVoid("JPH_CharacterVirtualSettings_SetHitReductionCosMaxAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_PENETRATION_RECOVERY_SPEED = downcallHandle("JPH_CharacterVirtualSettings_GetPenetrationRecoverySpeed", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_PENETRATION_RECOVERY_SPEED = downcallHandleVoid("JPH_CharacterVirtualSettings_SetPenetrationRecoverySpeed", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_SHAPE = downcallHandleVoid("JPH_CharacterVirtualSettings_GetInnerBodyShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_SHAPE = downcallHandleVoid("JPH_CharacterVirtualSettings_SetInnerBodyShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_IDOVERRIDE = downcallHandleVoid("JPH_CharacterVirtualSettings_GetInnerBodyIDOverride", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_IDOVERRIDE = downcallHandleVoid("JPH_CharacterVirtualSettings_SetInnerBodyIDOverride", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_LAYER = downcallHandle("JPH_CharacterVirtualSettings_GetInnerBodyLayer", JAVA_SHORT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_LAYER = downcallHandleVoid("JPH_CharacterVirtualSettings_SetInnerBodyLayer", UNBOUNDED_ADDRESS, JAVA_SHORT);
		//@formatter:on
	}

	public CharacterVirtualSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterVirtualSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCharacterBaseSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CharacterVirtualSettings(
	    CharacterVirtualSettings param0
	) {
	    this(
	        Arena.ofAuto(),
	        param0
	    );
	}
	
	/// Typed method of [#create1].
	public CharacterVirtualSettings(
		Arena arena,
		CharacterVirtualSettings param0
	) {
		MemorySegment segment = create1(
			param0.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCharacterBaseSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CharacterVirtualSettings(MemorySegment segment) {
		this.segment = segment;
		super(asCharacterBaseSettings(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment param0
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCharacterBaseSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_AS_CHARACTER_BASE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// ID to give to this character. This is used for deterministically sorting and as an identifier to represent the character in the contact removal callback.
    /// ```
    public static void getID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getID].
    public final void getID(
    	CharacterID outResult
    ) {
    	getID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// ID to give to this character. This is used for deterministically sorting and as an identifier to represent the character in the contact removal callback.
    /// ```
    public static void setID(
    	MemorySegment self,
    	MemorySegment mID
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			mID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setID].
    public final void setID(
    	CharacterID mID
    ) {
    	setID(
    		this.segment,
    		mID.memorySegment()
    	);
    }
    
    /// ```
    /// Character mass (kg). Used to push down objects with gravity when the character is standing on top.
    /// ```
    public static float getMass(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMass].
    public final float getMass() {
    	return getMass(
    		this.segment
    	);
    }
    
    /// ```
    /// Character mass (kg). Used to push down objects with gravity when the character is standing on top.
    /// ```
    public static void setMass(
    	MemorySegment self,
    	float mMass
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMass].
    public final void setMass(
    	float mMass
    ) {
    	setMass(
    		this.segment,
    		mMass
    	);
    }
    
    /// ```
    /// Maximum force with which the character can push other bodies (N).
    /// ```
    public static float getMaxStrength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_STRENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxStrength].
    public final float getMaxStrength() {
    	return getMaxStrength(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum force with which the character can push other bodies (N).
    /// ```
    public static void setMaxStrength(
    	MemorySegment self,
    	float mMaxStrength
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_STRENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxStrength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxStrength].
    public final void setMaxStrength(
    	float mMaxStrength
    ) {
    	setMaxStrength(
    		this.segment,
    		mMaxStrength
    	);
    }
    
    /// ```
    /// An extra offset applied to the shape in local space. This allows applying an extra offset to the shape in local space.
    /// ```
    public static void getShapeOffset(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_SHAPE_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShapeOffset].
    public final void getShapeOffset(
    	Vec3 outResult
    ) {
    	getShapeOffset(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// An extra offset applied to the shape in local space. This allows applying an extra offset to the shape in local space.
    /// ```
    public static void setShapeOffset(
    	MemorySegment self,
    	MemorySegment mShapeOffset
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_SHAPE_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShapeOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShapeOffset].
    public final void setShapeOffset(
    	Vec3 mShapeOffset
    ) {
    	setShapeOffset(
    		this.segment,
    		mShapeOffset.memorySegment()
    	);
    }
    
    /// ```
    /// When colliding with back faces, the character will not be able to move through back facing triangles. Use this if you have triangles that need to collide on both sides.
    /// ```
    public static int getBackFaceMode(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_BACK_FACE_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBackFaceMode].
    public final int getBackFaceMode() {
    	return getBackFaceMode(
    		this.segment
    	);
    }
    
    /// ```
    /// When colliding with back faces, the character will not be able to move through back facing triangles. Use this if you have triangles that need to collide on both sides.
    /// ```
    public static void setBackFaceMode(
    	MemorySegment self,
    	int mBackFaceMode
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_BACK_FACE_MODE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBackFaceMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBackFaceMode].
    public final void setBackFaceMode(
    	int mBackFaceMode
    ) {
    	setBackFaceMode(
    		this.segment,
    		mBackFaceMode
    	);
    }
    
    /// ```
    /// How far to scan outside of the shape for predictive contacts. A value of 0 will most likely cause the character to get stuck as it cannot properly calculate a sliding direction anymore. A value that's too high will cause ghost collisions.
    /// ```
    public static float getPredictiveContactDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_PREDICTIVE_CONTACT_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPredictiveContactDistance].
    public final float getPredictiveContactDistance() {
    	return getPredictiveContactDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// How far to scan outside of the shape for predictive contacts. A value of 0 will most likely cause the character to get stuck as it cannot properly calculate a sliding direction anymore. A value that's too high will cause ghost collisions.
    /// ```
    public static void setPredictiveContactDistance(
    	MemorySegment self,
    	float mPredictiveContactDistance
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_PREDICTIVE_CONTACT_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPredictiveContactDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPredictiveContactDistance].
    public final void setPredictiveContactDistance(
    	float mPredictiveContactDistance
    ) {
    	setPredictiveContactDistance(
    		this.segment,
    		mPredictiveContactDistance
    	);
    }
    
    /// ```
    /// Max amount of collision loops
    /// ```
    public static int getMaxCollisionIterations(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_COLLISION_ITERATIONS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxCollisionIterations].
    public final int getMaxCollisionIterations() {
    	return getMaxCollisionIterations(
    		this.segment
    	);
    }
    
    /// ```
    /// Max amount of collision loops
    /// ```
    public static void setMaxCollisionIterations(
    	MemorySegment self,
    	int mMaxCollisionIterations
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_COLLISION_ITERATIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxCollisionIterations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxCollisionIterations].
    public final void setMaxCollisionIterations(
    	int mMaxCollisionIterations
    ) {
    	setMaxCollisionIterations(
    		this.segment,
    		mMaxCollisionIterations
    	);
    }
    
    /// ```
    /// How often to try stepping in the constraint solving
    /// ```
    public static int getMaxConstraintIterations(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_CONSTRAINT_ITERATIONS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxConstraintIterations].
    public final int getMaxConstraintIterations() {
    	return getMaxConstraintIterations(
    		this.segment
    	);
    }
    
    /// ```
    /// How often to try stepping in the constraint solving
    /// ```
    public static void setMaxConstraintIterations(
    	MemorySegment self,
    	int mMaxConstraintIterations
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_CONSTRAINT_ITERATIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxConstraintIterations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxConstraintIterations].
    public final void setMaxConstraintIterations(
    	int mMaxConstraintIterations
    ) {
    	setMaxConstraintIterations(
    		this.segment,
    		mMaxConstraintIterations
    	);
    }
    
    /// ```
    /// Early out condition: If this much time is left to simulate we are done
    /// ```
    public static float getMinTimeRemaining(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MIN_TIME_REMAINING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinTimeRemaining].
    public final float getMinTimeRemaining() {
    	return getMinTimeRemaining(
    		this.segment
    	);
    }
    
    /// ```
    /// Early out condition: If this much time is left to simulate we are done
    /// ```
    public static void setMinTimeRemaining(
    	MemorySegment self,
    	float mMinTimeRemaining
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MIN_TIME_REMAINING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMinTimeRemaining
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMinTimeRemaining].
    public final void setMinTimeRemaining(
    	float mMinTimeRemaining
    ) {
    	setMinTimeRemaining(
    		this.segment,
    		mMinTimeRemaining
    	);
    }
    
    /// ```
    /// How far we're willing to penetrate geometry
    /// ```
    public static float getCollisionTolerance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_COLLISION_TOLERANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollisionTolerance].
    public final float getCollisionTolerance() {
    	return getCollisionTolerance(
    		this.segment
    	);
    }
    
    /// ```
    /// How far we're willing to penetrate geometry
    /// ```
    public static void setCollisionTolerance(
    	MemorySegment self,
    	float mCollisionTolerance
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_COLLISION_TOLERANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCollisionTolerance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollisionTolerance].
    public final void setCollisionTolerance(
    	float mCollisionTolerance
    ) {
    	setCollisionTolerance(
    		this.segment,
    		mCollisionTolerance
    	);
    }
    
    /// ```
    /// How far we try to stay away from the geometry, this ensures that the sweep will hit as little as possible lowering the collision cost and reducing the risk of getting stuck
    /// ```
    public static float getCharacterPadding(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_CHARACTER_PADDING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCharacterPadding].
    public final float getCharacterPadding() {
    	return getCharacterPadding(
    		this.segment
    	);
    }
    
    /// ```
    /// How far we try to stay away from the geometry, this ensures that the sweep will hit as little as possible lowering the collision cost and reducing the risk of getting stuck
    /// ```
    public static void setCharacterPadding(
    	MemorySegment self,
    	float mCharacterPadding
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_CHARACTER_PADDING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCharacterPadding
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCharacterPadding].
    public final void setCharacterPadding(
    	float mCharacterPadding
    ) {
    	setCharacterPadding(
    		this.segment,
    		mCharacterPadding
    	);
    }
    
    /// ```
    /// Max num hits to collect in order to avoid excess of contact points collection
    /// ```
    public static int getMaxNumHits(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_MAX_NUM_HITS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxNumHits].
    public final int getMaxNumHits() {
    	return getMaxNumHits(
    		this.segment
    	);
    }
    
    /// ```
    /// Max num hits to collect in order to avoid excess of contact points collection
    /// ```
    public static void setMaxNumHits(
    	MemorySegment self,
    	int mMaxNumHits
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_MAX_NUM_HITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxNumHits
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxNumHits].
    public final void setMaxNumHits(
    	int mMaxNumHits
    ) {
    	setMaxNumHits(
    		this.segment,
    		mMaxNumHits
    	);
    }
    
    /// ```
    /// Cos(angle) where angle is the maximum angle between two hits contact normals that are allowed to be merged during hit reduction. Default is around 2.5 degrees. Set to -1 to turn off.
    /// ```
    public static float getHitReductionCosMaxAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_HIT_REDUCTION_COS_MAX_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHitReductionCosMaxAngle].
    public final float getHitReductionCosMaxAngle() {
    	return getHitReductionCosMaxAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Cos(angle) where angle is the maximum angle between two hits contact normals that are allowed to be merged during hit reduction. Default is around 2.5 degrees. Set to -1 to turn off.
    /// ```
    public static void setHitReductionCosMaxAngle(
    	MemorySegment self,
    	float mHitReductionCosMaxAngle
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_HIT_REDUCTION_COS_MAX_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHitReductionCosMaxAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHitReductionCosMaxAngle].
    public final void setHitReductionCosMaxAngle(
    	float mHitReductionCosMaxAngle
    ) {
    	setHitReductionCosMaxAngle(
    		this.segment,
    		mHitReductionCosMaxAngle
    	);
    }
    
    /// ```
    /// This value governs how fast a penetration will be resolved, 0 = nothing is resolved, 1 = everything in one update
    /// ```
    public static float getPenetrationRecoverySpeed(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_PENETRATION_RECOVERY_SPEED.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPenetrationRecoverySpeed].
    public final float getPenetrationRecoverySpeed() {
    	return getPenetrationRecoverySpeed(
    		this.segment
    	);
    }
    
    /// ```
    /// This value governs how fast a penetration will be resolved, 0 = nothing is resolved, 1 = everything in one update
    /// ```
    public static void setPenetrationRecoverySpeed(
    	MemorySegment self,
    	float mPenetrationRecoverySpeed
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_PENETRATION_RECOVERY_SPEED.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPenetrationRecoverySpeed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPenetrationRecoverySpeed].
    public final void setPenetrationRecoverySpeed(
    	float mPenetrationRecoverySpeed
    ) {
    	setPenetrationRecoverySpeed(
    		this.segment,
    		mPenetrationRecoverySpeed
    	);
    }
    
    /// ```
    /// This character can optionally have an inner rigid body. This rigid body can be used to give the character presence in the world. When set it means that:
    /// - Regular collision checks (e.g. NarrowPhaseQuery::CastRay) will collide with the rigid body (they cannot collide with CharacterVirtual since it is not added to the broad phase)
    /// - Regular contact callbacks will be called through the ContactListener (next to the ones that will be passed to the CharacterContactListener)
    /// - Fast moving objects of motion quality LinearCast will not be able to pass through the CharacterVirtual in 1 time step
    /// ```
    public static void getInnerBodyShape(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInnerBodyShape].
    public final void getInnerBodyShape(
    	ShapeRefConst outResult
    ) {
    	getInnerBodyShape(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// This character can optionally have an inner rigid body. This rigid body can be used to give the character presence in the world. When set it means that:
    /// - Regular collision checks (e.g. NarrowPhaseQuery::CastRay) will collide with the rigid body (they cannot collide with CharacterVirtual since it is not added to the broad phase)
    /// - Regular contact callbacks will be called through the ContactListener (next to the ones that will be passed to the CharacterContactListener)
    /// - Fast moving objects of motion quality LinearCast will not be able to pass through the CharacterVirtual in 1 time step
    /// ```
    public static void setInnerBodyShape(
    	MemorySegment self,
    	MemorySegment mInnerBodyShape
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInnerBodyShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInnerBodyShape].
    public final void setInnerBodyShape(
    	ShapeRefConst mInnerBodyShape
    ) {
    	setInnerBodyShape(
    		this.segment,
    		mInnerBodyShape.memorySegment()
    	);
    }
    
    /// ```
    /// For a deterministic simulation, it is important to have a deterministic body ID. When set and when mInnerBodyShape is specified,
    /// the inner body will be created with this specified ID instead of a generated ID.
    /// ```
    public static void getInnerBodyIDOverride(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_IDOVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInnerBodyIDOverride].
    public final void getInnerBodyIDOverride(
    	BodyID outResult
    ) {
    	getInnerBodyIDOverride(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// For a deterministic simulation, it is important to have a deterministic body ID. When set and when mInnerBodyShape is specified,
    /// the inner body will be created with this specified ID instead of a generated ID.
    /// ```
    public static void setInnerBodyIDOverride(
    	MemorySegment self,
    	MemorySegment mInnerBodyIDOverride
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_IDOVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInnerBodyIDOverride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInnerBodyIDOverride].
    public final void setInnerBodyIDOverride(
    	BodyID mInnerBodyIDOverride
    ) {
    	setInnerBodyIDOverride(
    		this.segment,
    		mInnerBodyIDOverride.memorySegment()
    	);
    }
    
    /// ```
    /// Layer that the inner rigid body will be added to
    /// ```
    public static short getInnerBodyLayer(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_GET_INNER_BODY_LAYER.get();
    	try {
    		return (short) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInnerBodyLayer].
    public final short getInnerBodyLayer() {
    	return getInnerBodyLayer(
    		this.segment
    	);
    }
    
    /// ```
    /// Layer that the inner rigid body will be added to
    /// ```
    public static void setInnerBodyLayer(
    	MemorySegment self,
    	short mInnerBodyLayer
    ) {
    	MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_SET_INNER_BODY_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInnerBodyLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInnerBodyLayer].
    public final void setInnerBodyLayer(
    	short mInnerBodyLayer
    ) {
    	setInnerBodyLayer(
    		this.segment,
    		mInnerBodyLayer
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}