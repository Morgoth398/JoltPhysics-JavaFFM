/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.Vector2;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class HingeConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_TARGET_ORIENTATION_BS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_HAS_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_HINGE_CONSTRAINT_CREATE = downcallHandle("JPH_HingeConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_HingeConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpacePoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpacePoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceHingeAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceHingeAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceNormalAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceNormalAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE = downcallHandle("JPH_HingeConstraint_GetCurrentAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE = downcallHandleVoid("JPH_HingeConstraint_SetMaxFrictionTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE = downcallHandle("JPH_HingeConstraint_GetMaxFrictionTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS = downcallHandle("JPH_HingeConstraint_GetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS1 = downcallHandle("JPH_HingeConstraint_GetMotorSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE = downcallHandleVoid("JPH_HingeConstraint_SetMotorState", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE = downcallHandle("JPH_HingeConstraint_GetMotorState", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_HingeConstraint_SetTargetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY = downcallHandle("JPH_HingeConstraint_GetTargetAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE = downcallHandleVoid("JPH_HingeConstraint_SetTargetAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE = downcallHandle("JPH_HingeConstraint_GetTargetAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_TARGET_ORIENTATION_BS = downcallHandleVoid("JPH_HingeConstraint_SetTargetOrientationBS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_LIMITS = downcallHandleVoid("JPH_HingeConstraint_SetLimits", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN = downcallHandle("JPH_HingeConstraint_GetLimitsMin", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX = downcallHandle("JPH_HingeConstraint_GetLimitsMax", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_HAS_LIMITS = downcallHandle("JPH_HingeConstraint_HasLimits", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandle("JPH_HingeConstraint_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1 = downcallHandle("JPH_HingeConstraint_GetLimitsSpringSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_HingeConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_HingeConstraint_GetTotalLambdaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS = downcallHandle("JPH_HingeConstraint_GetTotalLambdaRotationLimits", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandle("JPH_HingeConstraint_GetTotalLambdaMotor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public HingeConstraint(
	    Body inBody1,
	    Body inBody2,
	    HingeConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public HingeConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		HingeConstraintSettings inSettings
	) {
		MemorySegment segment = create(
			inBody1.memorySegment(),
			inBody2.memorySegment(),
			inSettings.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraint(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public HingeConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct hinge constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBody1,
    			inBody2,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asTwoBodyConstraint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the attachment point for body 1 relative to body 1 COM (transform by Body::GetCenterOfMassTransform to take to world space)
    /// ```
    public static void getLocalSpacePoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpacePoint1].
    public final void getLocalSpacePoint1(
    	Vec3 outResult
    ) {
    	getLocalSpacePoint1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the attachment point for body 2 relative to body 2 COM (transform by Body::GetCenterOfMassTransform to take to world space)
    /// ```
    public static void getLocalSpacePoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpacePoint2].
    public final void getLocalSpacePoint2(
    	Vec3 outResult
    ) {
    	getLocalSpacePoint2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getLocalSpaceHingeAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpaceHingeAxis1].
    public final void getLocalSpaceHingeAxis1(
    	Vec3 outResult
    ) {
    	getLocalSpaceHingeAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getLocalSpaceHingeAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpaceHingeAxis2].
    public final void getLocalSpaceHingeAxis2(
    	Vec3 outResult
    ) {
    	getLocalSpaceHingeAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getLocalSpaceNormalAxis1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpaceNormalAxis1].
    public final void getLocalSpaceNormalAxis1(
    	Vec3 outResult
    ) {
    	getLocalSpaceNormalAxis1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getLocalSpaceNormalAxis2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpaceNormalAxis2].
    public final void getLocalSpaceNormalAxis2(
    	Vec3 outResult
    ) {
    	getLocalSpaceNormalAxis2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current rotation angle from the rest position
    /// ```
    public static float getCurrentAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCurrentAngle].
    public final float getCurrentAngle() {
    	return getCurrentAngle(
    		this.segment
    	);
    }
    
    public static void setMaxFrictionTorque(
    	MemorySegment self,
    	float inFrictionTorque
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFrictionTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxFrictionTorque].
    public final void setMaxFrictionTorque(
    	float inFrictionTorque
    ) {
    	setMaxFrictionTorque(
    		this.segment,
    		inFrictionTorque
    	);
    }
    
    public static float getMaxFrictionTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE.get();
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
    
    public static MemorySegment getMotorSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorSettings].
    public final @Nullable MotorSettings getMotorSettings() {
    	MemorySegment segment = getMotorSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    public static MemorySegment getMotorSettings1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorSettings1].
    public final @Nullable MotorSettings getMotorSettings1() {
    	MemorySegment segment = getMotorSettings1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    public static void setMotorState(
    	MemorySegment self,
    	int inState
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inState
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotorState].
    public final void setMotorState(
    	int inState
    ) {
    	setMotorState(
    		this.segment,
    		inState
    	);
    }
    
    public static int getMotorState(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorState].
    public final int getMotorState() {
    	return getMotorState(
    		this.segment
    	);
    }
    
    public static void setTargetAngularVelocity(
    	MemorySegment self,
    	float inAngularVelocity
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetAngularVelocity].
    public final void setTargetAngularVelocity(
    	float inAngularVelocity
    ) {
    	setTargetAngularVelocity(
    		this.segment,
    		inAngularVelocity
    	);
    }
    
    public static float getTargetAngularVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetAngularVelocity].
    public final float getTargetAngularVelocity() {
    	return getTargetAngularVelocity(
    		this.segment
    	);
    }
    
    public static void setTargetAngle(
    	MemorySegment self,
    	float inAngle
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetAngle].
    public final void setTargetAngle(
    	float inAngle
    ) {
    	setTargetAngle(
    		this.segment,
    		inAngle
    	);
    }
    
    public static float getTargetAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetAngle].
    public final float getTargetAngle() {
    	return getTargetAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the target orientation in body space (R2 = R1 * inOrientation, where R1 and R2 are the world space rotations for body 1 and 2).
    /// Calculates the local space target angle and calls SetTargetAngle. Motor state must be EMotorState::Position or EMotorState::PositionAndVelocity for this to have any effect.
    /// May set the wrong angle if inOrientation contains large rotations around other axis than the hinge axis.
    /// ```
    public static void setTargetOrientationBS(
    	MemorySegment self,
    	MemorySegment inOrientation
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SET_TARGET_ORIENTATION_BS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inOrientation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetOrientationBS].
    public final void setTargetOrientationBS(
    	Quat inOrientation
    ) {
    	setTargetOrientationBS(
    		this.segment,
    		inOrientation.memorySegment()
    	);
    }
    
    /// ```
    /// Update the rotation limits of the hinge, value in radians (see HingeConstraintSettings)
    /// ```
    public static void setLimits(
    	MemorySegment self,
    	float inLimitsMin,
    	float inLimitsMax
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SET_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLimitsMin,
    			inLimitsMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimits].
    public final void setLimits(
    	float inLimitsMin,
    	float inLimitsMax
    ) {
    	setLimits(
    		this.segment,
    		inLimitsMin,
    		inLimitsMax
    	);
    }
    
    public static float getLimitsMin(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN.get();
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
    
    public static float getLimitsMax(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX.get();
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
    
    public static boolean hasLimits(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_HAS_LIMITS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasLimits].
    public final boolean hasLimits() {
    	return hasLimits(
    		this.segment
    	);
    }
    
    /// ```
    /// Update the limits spring settings
    /// ```
    public static MemorySegment getLimitsSpringSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsSpringSettings].
    public final @Nullable SpringSettings getLimitsSpringSettings() {
    	MemorySegment segment = getLimitsSpringSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SpringSettings(segment);
    }
    
    public static MemorySegment getLimitsSpringSettings1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsSpringSettings1].
    public final @Nullable SpringSettings getLimitsSpringSettings1() {
    	MemorySegment segment = getLimitsSpringSettings1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SpringSettings(segment);
    }
    
    public static void setLimitsSpringSettings(
    	MemorySegment self,
    	MemorySegment inLimitsSpringSettings
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLimitsSpringSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsSpringSettings].
    public final void setLimitsSpringSettings(
    	SpringSettings inLimitsSpringSettings
    ) {
    	setLimitsSpringSettings(
    		this.segment,
    		inLimitsSpringSettings.memorySegment()
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the linear/angular impulse applied to satisfy the constraint)
    /// ```
    public static void getTotalLambdaPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaPosition].
    public final void getTotalLambdaPosition(
    	Vec3 outResult
    ) {
    	getTotalLambdaPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getTotalLambdaRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaRotation].
    public final void getTotalLambdaRotation(
    	Vector2 outResult
    ) {
    	getTotalLambdaRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static float getTotalLambdaRotationLimits(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaRotationLimits].
    public final float getTotalLambdaRotationLimits() {
    	return getTotalLambdaRotationLimits(
    		this.segment
    	);
    }
    
    public static float getTotalLambdaMotor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaMotor].
    public final float getTotalLambdaMotor() {
    	return getTotalLambdaMotor(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}