/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class HingeConstraintSettings extends TwoBodyConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_SPACE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_HINGE_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_HINGE_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_HINGE_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_HINGE_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_GET_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_SET_MOTOR_SETTINGS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_HINGE_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_HingeConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS = downcallHandle("JPH_HingeConstraintSettings_AsTwoBodyConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_SPACE = downcallHandle("JPH_HingeConstraintSettings_GetSpace", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_SPACE = downcallHandleVoid("JPH_HingeConstraintSettings_SetSpace", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_POINT1 = downcallHandleVoid("JPH_HingeConstraintSettings_GetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_POINT1 = downcallHandleVoid("JPH_HingeConstraintSettings_SetPoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_HINGE_AXIS1 = downcallHandleVoid("JPH_HingeConstraintSettings_GetHingeAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_HINGE_AXIS1 = downcallHandleVoid("JPH_HingeConstraintSettings_SetHingeAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS1 = downcallHandleVoid("JPH_HingeConstraintSettings_GetNormalAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS1 = downcallHandleVoid("JPH_HingeConstraintSettings_SetNormalAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_POINT2 = downcallHandleVoid("JPH_HingeConstraintSettings_GetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_POINT2 = downcallHandleVoid("JPH_HingeConstraintSettings_SetPoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_HINGE_AXIS2 = downcallHandleVoid("JPH_HingeConstraintSettings_GetHingeAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_HINGE_AXIS2 = downcallHandleVoid("JPH_HingeConstraintSettings_SetHingeAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS2 = downcallHandleVoid("JPH_HingeConstraintSettings_GetNormalAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS2 = downcallHandleVoid("JPH_HingeConstraintSettings_SetNormalAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_MIN = downcallHandle("JPH_HingeConstraintSettings_GetLimitsMin", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_MIN = downcallHandleVoid("JPH_HingeConstraintSettings_SetLimitsMin", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_MAX = downcallHandle("JPH_HingeConstraintSettings_GetLimitsMax", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_MAX = downcallHandleVoid("JPH_HingeConstraintSettings_SetLimitsMax", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_HingeConstraintSettings_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_HingeConstraintSettings_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_TORQUE = downcallHandle("JPH_HingeConstraintSettings_GetMaxFrictionTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_TORQUE = downcallHandleVoid("JPH_HingeConstraintSettings_SetMaxFrictionTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_SETTINGS_GET_MOTOR_SETTINGS = downcallHandleVoid("JPH_HingeConstraintSettings_GetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SETTINGS_SET_MOTOR_SETTINGS = downcallHandleVoid("JPH_HingeConstraintSettings_SetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public HingeConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public HingeConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public HingeConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asTwoBodyConstraintSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_AS_TWO_BODY_CONSTRAINT_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// This determines in which space the constraint is setup, all properties below should be in the specified space
    /// ```
    public static int getSpace(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_SPACE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpace].
    public final int getSpace() {
    	return getSpace(
    		this.segment
    	);
    }
    
    /// ```
    /// This determines in which space the constraint is setup, all properties below should be in the specified space
    /// ```
    public static void setSpace(
    	MemorySegment self,
    	int mSpace
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_SPACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSpace
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSpace].
    public final void setSpace(
    	int mSpace
    ) {
    	setSpace(
    		this.segment,
    		mSpace
    	);
    }
    
    /// ```
    /// Body 1 constraint reference frame (space determined by mSpace).
    /// Hinge axis is the axis where rotation is allowed.
    /// When the normal axis of both bodies align in world space, the hinge angle is defined to be 0.
    /// mHingeAxis1 and mNormalAxis1 should be perpendicular. mHingeAxis2 and mNormalAxis2 should also be perpendicular.
    /// If you configure the joint in world space and create both bodies with a relative rotation you want to be defined as zero,
    /// you can simply set mHingeAxis1 = mHingeAxis2 and mNormalAxis1 = mNormalAxis2.
    /// ```
    public static void getPoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPoint1].
    public final void getPoint1(
    	Vec3 outResult
    ) {
    	getPoint1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 1 constraint reference frame (space determined by mSpace).
    /// Hinge axis is the axis where rotation is allowed.
    /// When the normal axis of both bodies align in world space, the hinge angle is defined to be 0.
    /// mHingeAxis1 and mNormalAxis1 should be perpendicular. mHingeAxis2 and mNormalAxis2 should also be perpendicular.
    /// If you configure the joint in world space and create both bodies with a relative rotation you want to be defined as zero,
    /// you can simply set mHingeAxis1 = mHingeAxis2 and mNormalAxis1 = mNormalAxis2.
    /// ```
    public static void setPoint1(
    	MemorySegment self,
    	MemorySegment mPoint1
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPoint1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoint1].
    public final void setPoint1(
    	Vec3 mPoint1
    ) {
    	setPoint1(
    		this.segment,
    		mPoint1.memorySegment()
    	);
    }
    
    public static void getHingeAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_HINGE_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHingeAxis1].
    public final void getHingeAxis1(
    	Vec3 outResult
    ) {
    	getHingeAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setHingeAxis1(
    	MemorySegment self,
    	MemorySegment mHingeAxis1
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_HINGE_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHingeAxis1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHingeAxis1].
    public final void setHingeAxis1(
    	Vec3 mHingeAxis1
    ) {
    	setHingeAxis1(
    		this.segment,
    		mHingeAxis1.memorySegment()
    	);
    }
    
    public static void getNormalAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalAxis1].
    public final void getNormalAxis1(
    	Vec3 outResult
    ) {
    	getNormalAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setNormalAxis1(
    	MemorySegment self,
    	MemorySegment mNormalAxis1
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormalAxis1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalAxis1].
    public final void setNormalAxis1(
    	Vec3 mNormalAxis1
    ) {
    	setNormalAxis1(
    		this.segment,
    		mNormalAxis1.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void getPoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPoint2].
    public final void getPoint2(
    	Vec3 outResult
    ) {
    	getPoint2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body 2 constraint reference frame (space determined by mSpace)
    /// ```
    public static void setPoint2(
    	MemorySegment self,
    	MemorySegment mPoint2
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPoint2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoint2].
    public final void setPoint2(
    	Vec3 mPoint2
    ) {
    	setPoint2(
    		this.segment,
    		mPoint2.memorySegment()
    	);
    }
    
    public static void getHingeAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_HINGE_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHingeAxis2].
    public final void getHingeAxis2(
    	Vec3 outResult
    ) {
    	getHingeAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setHingeAxis2(
    	MemorySegment self,
    	MemorySegment mHingeAxis2
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_HINGE_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHingeAxis2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHingeAxis2].
    public final void setHingeAxis2(
    	Vec3 mHingeAxis2
    ) {
    	setHingeAxis2(
    		this.segment,
    		mHingeAxis2.memorySegment()
    	);
    }
    
    public static void getNormalAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_NORMAL_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalAxis2].
    public final void getNormalAxis2(
    	Vec3 outResult
    ) {
    	getNormalAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setNormalAxis2(
    	MemorySegment self,
    	MemorySegment mNormalAxis2
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_NORMAL_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormalAxis2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalAxis2].
    public final void setNormalAxis2(
    	Vec3 mNormalAxis2
    ) {
    	setNormalAxis2(
    		this.segment,
    		mNormalAxis2.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation around the hinge axis will be limited between [mLimitsMin, mLimitsMax] where mLimitsMin e [-pi, 0] and mLimitsMax e [0, pi].
    /// Both angles are in radians.
    /// ```
    public static float getLimitsMin(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_MIN.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsMin].
    public final float getLimitsMin() {
    	return getLimitsMin(
    		this.segment
    	);
    }
    
    /// ```
    /// Rotation around the hinge axis will be limited between [mLimitsMin, mLimitsMax] where mLimitsMin e [-pi, 0] and mLimitsMax e [0, pi].
    /// Both angles are in radians.
    /// ```
    public static void setLimitsMin(
    	MemorySegment self,
    	float mLimitsMin
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_MIN.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLimitsMin
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsMin].
    public final void setLimitsMin(
    	float mLimitsMin
    ) {
    	setLimitsMin(
    		this.segment,
    		mLimitsMin
    	);
    }
    
    public static float getLimitsMax(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_MAX.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsMax].
    public final float getLimitsMax() {
    	return getLimitsMax(
    		this.segment
    	);
    }
    
    public static void setLimitsMax(
    	MemorySegment self,
    	float mLimitsMax
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_MAX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLimitsMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsMax].
    public final void setLimitsMax(
    	float mLimitsMax
    ) {
    	setLimitsMax(
    		this.segment,
    		mLimitsMax
    	);
    }
    
    /// ```
    /// When enabled, this makes the limits soft. When the constraint exceeds the limits, a spring force will pull it back.
    /// ```
    public static void getLimitsSpringSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsSpringSettings].
    public final void getLimitsSpringSettings(
    	SpringSettings outResult
    ) {
    	getLimitsSpringSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// When enabled, this makes the limits soft. When the constraint exceeds the limits, a spring force will pull it back.
    /// ```
    public static void setLimitsSpringSettings(
    	MemorySegment self,
    	MemorySegment mLimitsSpringSettings
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLimitsSpringSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsSpringSettings].
    public final void setLimitsSpringSettings(
    	SpringSettings mLimitsSpringSettings
    ) {
    	setLimitsSpringSettings(
    		this.segment,
    		mLimitsSpringSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Maximum amount of torque (N m) to apply as friction when the constraint is not powered by a motor
    /// ```
    public static float getMaxFrictionTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_MAX_FRICTION_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxFrictionTorque].
    public final float getMaxFrictionTorque() {
    	return getMaxFrictionTorque(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum amount of torque (N m) to apply as friction when the constraint is not powered by a motor
    /// ```
    public static void setMaxFrictionTorque(
    	MemorySegment self,
    	float mMaxFrictionTorque
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_MAX_FRICTION_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxFrictionTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxFrictionTorque].
    public final void setMaxFrictionTorque(
    	float mMaxFrictionTorque
    ) {
    	setMaxFrictionTorque(
    		this.segment,
    		mMaxFrictionTorque
    	);
    }
    
    /// ```
    /// In case the constraint is powered, this determines the motor settings around the hinge axis
    /// ```
    public static void getMotorSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_GET_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorSettings].
    public final void getMotorSettings(
    	MotorSettings outResult
    ) {
    	getMotorSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// In case the constraint is powered, this determines the motor settings around the hinge axis
    /// ```
    public static void setMotorSettings(
    	MemorySegment self,
    	MemorySegment mMotorSettings
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_SET_MOTOR_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMotorSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotorSettings].
    public final void setMotorSettings(
    	MotorSettings mMotorSettings
    ) {
    	setMotorSettings(
    		this.segment,
    		mMotorSettings.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}