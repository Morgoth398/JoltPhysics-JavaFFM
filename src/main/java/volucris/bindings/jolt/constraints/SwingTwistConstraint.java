/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SwingTwistConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_LOCAL_SPACE_POSITION1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_LOCAL_SPACE_POSITION2;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_CONSTRAINT_TO_BODY1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_CONSTRAINT_TO_BODY2;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_NORMAL_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_PLANE_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_PLANE_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MIN_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MIN_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MAX_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MAX_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_MAX_FRICTION_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_MAX_FRICTION_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_SWING_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_BS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ORIENTATION_CS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TARGET_ORIENTATION_CS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ORIENTATION_BS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SWING_TWIST_CONSTRAINT_CREATE = downcallHandle("JPH_SwingTwistConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_SwingTwistConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_LOCAL_SPACE_POSITION1 = downcallHandleVoid("JPH_SwingTwistConstraint_GetLocalSpacePosition1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_LOCAL_SPACE_POSITION2 = downcallHandleVoid("JPH_SwingTwistConstraint_GetLocalSpacePosition2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_CONSTRAINT_TO_BODY1 = downcallHandleVoid("JPH_SwingTwistConstraint_GetConstraintToBody1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_CONSTRAINT_TO_BODY2 = downcallHandleVoid("JPH_SwingTwistConstraint_GetConstraintToBody2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE = downcallHandle("JPH_SwingTwistConstraint_GetNormalHalfConeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_NORMAL_HALF_CONE_ANGLE = downcallHandleVoid("JPH_SwingTwistConstraint_SetNormalHalfConeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_GET_PLANE_HALF_CONE_ANGLE = downcallHandle("JPH_SwingTwistConstraint_GetPlaneHalfConeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_PLANE_HALF_CONE_ANGLE = downcallHandleVoid("JPH_SwingTwistConstraint_SetPlaneHalfConeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MIN_ANGLE = downcallHandle("JPH_SwingTwistConstraint_GetTwistMinAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MIN_ANGLE = downcallHandleVoid("JPH_SwingTwistConstraint_SetTwistMinAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MAX_ANGLE = downcallHandle("JPH_SwingTwistConstraint_GetTwistMaxAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MAX_ANGLE = downcallHandleVoid("JPH_SwingTwistConstraint_SetTwistMaxAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_SETTINGS = downcallHandle("JPH_SwingTwistConstraint_GetSwingMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_SETTINGS1 = downcallHandle("JPH_SwingTwistConstraint_GetSwingMotorSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_SETTINGS = downcallHandle("JPH_SwingTwistConstraint_GetTwistMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_SETTINGS1 = downcallHandle("JPH_SwingTwistConstraint_GetTwistMotorSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_MAX_FRICTION_TORQUE = downcallHandleVoid("JPH_SwingTwistConstraint_SetMaxFrictionTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_GET_MAX_FRICTION_TORQUE = downcallHandle("JPH_SwingTwistConstraint_GetMaxFrictionTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_SWING_MOTOR_STATE = downcallHandleVoid("JPH_SwingTwistConstraint_SetSwingMotorState", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_STATE = downcallHandle("JPH_SwingTwistConstraint_GetSwingMotorState", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MOTOR_STATE = downcallHandleVoid("JPH_SwingTwistConstraint_SetTwistMotorState", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_STATE = downcallHandle("JPH_SwingTwistConstraint_GetTwistMotorState", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS = downcallHandleVoid("JPH_SwingTwistConstraint_SetTargetAngularVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS = downcallHandleVoid("JPH_SwingTwistConstraint_GetTargetAngularVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_BS = downcallHandleVoid("JPH_SwingTwistConstraint_SetTargetAngularVelocityBS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ORIENTATION_CS = downcallHandleVoid("JPH_SwingTwistConstraint_SetTargetOrientationCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TARGET_ORIENTATION_CS = downcallHandleVoid("JPH_SwingTwistConstraint_GetTargetOrientationCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ORIENTATION_BS = downcallHandleVoid("JPH_SwingTwistConstraint_SetTargetOrientationBS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE = downcallHandleVoid("JPH_SwingTwistConstraint_GetRotationInConstraintSpace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SwingTwistConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaTwist", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaSwingY", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaSwingZ", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandleVoid("JPH_SwingTwistConstraint_GetTotalLambdaMotor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SwingTwistConstraint(
	    Body inBody1,
	    Body inBody2,
	    SwingTwistConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public SwingTwistConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		SwingTwistConstraintSettings inSettings
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

	public SwingTwistConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct swing twist constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @name Constraint reference frame
    /// ```
    public static void getLocalSpacePosition1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_LOCAL_SPACE_POSITION1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpacePosition1].
    public final void getLocalSpacePosition1(
    	Vec3 outResult
    ) {
    	getLocalSpacePosition1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getLocalSpacePosition2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_LOCAL_SPACE_POSITION2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpacePosition2].
    public final void getLocalSpacePosition2(
    	Vec3 outResult
    ) {
    	getLocalSpacePosition2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getConstraintToBody1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_CONSTRAINT_TO_BODY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintToBody1].
    public final void getConstraintToBody1(
    	Quat outResult
    ) {
    	getConstraintToBody1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getConstraintToBody2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_CONSTRAINT_TO_BODY2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintToBody2].
    public final void getConstraintToBody2(
    	Quat outResult
    ) {
    	getConstraintToBody2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @name Constraint limits
    /// ```
    public static float getNormalHalfConeAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalHalfConeAngle].
    public final float getNormalHalfConeAngle() {
    	return getNormalHalfConeAngle(
    		this.segment
    	);
    }
    
    public static void setNormalHalfConeAngle(
    	MemorySegment self,
    	float inAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_NORMAL_HALF_CONE_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalHalfConeAngle].
    public final void setNormalHalfConeAngle(
    	float inAngle
    ) {
    	setNormalHalfConeAngle(
    		this.segment,
    		inAngle
    	);
    }
    
    public static float getPlaneHalfConeAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_PLANE_HALF_CONE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPlaneHalfConeAngle].
    public final float getPlaneHalfConeAngle() {
    	return getPlaneHalfConeAngle(
    		this.segment
    	);
    }
    
    public static void setPlaneHalfConeAngle(
    	MemorySegment self,
    	float inAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_PLANE_HALF_CONE_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPlaneHalfConeAngle].
    public final void setPlaneHalfConeAngle(
    	float inAngle
    ) {
    	setPlaneHalfConeAngle(
    		this.segment,
    		inAngle
    	);
    }
    
    public static float getTwistMinAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MIN_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistMinAngle].
    public final float getTwistMinAngle() {
    	return getTwistMinAngle(
    		this.segment
    	);
    }
    
    public static void setTwistMinAngle(
    	MemorySegment self,
    	float inAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MIN_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistMinAngle].
    public final void setTwistMinAngle(
    	float inAngle
    ) {
    	setTwistMinAngle(
    		this.segment,
    		inAngle
    	);
    }
    
    public static float getTwistMaxAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MAX_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistMaxAngle].
    public final float getTwistMaxAngle() {
    	return getTwistMaxAngle(
    		this.segment
    	);
    }
    
    public static void setTwistMaxAngle(
    	MemorySegment self,
    	float inAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MAX_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistMaxAngle].
    public final void setTwistMaxAngle(
    	float inAngle
    ) {
    	setTwistMaxAngle(
    		this.segment,
    		inAngle
    	);
    }
    
    /// ```
    /// @name Motor settings
    /// ```
    public static MemorySegment getSwingMotorSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwingMotorSettings].
    public final @Nullable MotorSettings getSwingMotorSettings() {
    	MemorySegment segment = getSwingMotorSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    public static MemorySegment getSwingMotorSettings1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_SETTINGS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwingMotorSettings1].
    public final @Nullable MotorSettings getSwingMotorSettings1() {
    	MemorySegment segment = getSwingMotorSettings1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    public static MemorySegment getTwistMotorSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistMotorSettings].
    public final @Nullable MotorSettings getTwistMotorSettings() {
    	MemorySegment segment = getTwistMotorSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    public static MemorySegment getTwistMotorSettings1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_SETTINGS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistMotorSettings1].
    public final @Nullable MotorSettings getTwistMotorSettings1() {
    	MemorySegment segment = getTwistMotorSettings1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    /// ```
    /// @name Friction control
    /// ```
    public static void setMaxFrictionTorque(
    	MemorySegment self,
    	float inFrictionTorque
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_MAX_FRICTION_TORQUE.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_MAX_FRICTION_TORQUE.get();
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
    /// Controls if the motors are on or off
    /// ```
    public static void setSwingMotorState(
    	MemorySegment self,
    	int inState
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_SWING_MOTOR_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inState
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSwingMotorState].
    public final void setSwingMotorState(
    	int inState
    ) {
    	setSwingMotorState(
    		this.segment,
    		inState
    	);
    }
    
    public static int getSwingMotorState(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_SWING_MOTOR_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwingMotorState].
    public final int getSwingMotorState() {
    	return getSwingMotorState(
    		this.segment
    	);
    }
    
    public static void setTwistMotorState(
    	MemorySegment self,
    	int inState
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_TWIST_MOTOR_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inState
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTwistMotorState].
    public final void setTwistMotorState(
    	int inState
    ) {
    	setTwistMotorState(
    		this.segment,
    		inState
    	);
    }
    
    public static int getTwistMotorState(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TWIST_MOTOR_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwistMotorState].
    public final int getTwistMotorState() {
    	return getTwistMotorState(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the target angular velocity of body 2 in constraint space of body 2
    /// ```
    public static void setTargetAngularVelocityCS(
    	MemorySegment self,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetAngularVelocityCS].
    public final void setTargetAngularVelocityCS(
    	Vec3 inAngularVelocity
    ) {
    	setTargetAngularVelocityCS(
    		this.segment,
    		inAngularVelocity.memorySegment()
    	);
    }
    
    public static void getTargetAngularVelocityCS(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetAngularVelocityCS].
    public final void getTargetAngularVelocityCS(
    	Vec3 outResult
    ) {
    	getTargetAngularVelocityCS(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the target angular velocity of body 2 in body 2 space
    /// ```
    public static void setTargetAngularVelocityBS(
    	MemorySegment self,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_BS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetAngularVelocityBS].
    public final void setTargetAngularVelocityBS(
    	Vec3 inAngularVelocity
    ) {
    	setTargetAngularVelocityBS(
    		this.segment,
    		inAngularVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set the target orientation in constraint space (drives constraint to: GetRotationInConstraintSpace() == inOrientation)
    /// ```
    public static void setTargetOrientationCS(
    	MemorySegment self,
    	MemorySegment inOrientation
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ORIENTATION_CS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inOrientation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetOrientationCS].
    public final void setTargetOrientationCS(
    	Quat inOrientation
    ) {
    	setTargetOrientationCS(
    		this.segment,
    		inOrientation.memorySegment()
    	);
    }
    
    public static void getTargetOrientationCS(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TARGET_ORIENTATION_CS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetOrientationCS].
    public final void getTargetOrientationCS(
    	Quat outResult
    ) {
    	getTargetOrientationCS(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the target orientation in body space (R2 = R1 * inOrientation, where R1 and R2 are the world space rotations for body 1 and 2).
    /// Solve: R2 * ConstraintToBody2 = R1 * ConstraintToBody1 * q (see SwingTwistConstraint::GetSwingTwist) and R2 = R1 * inOrientation for q.
    /// ```
    public static void setTargetOrientationBS(
    	MemorySegment self,
    	MemorySegment inOrientation
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SET_TARGET_ORIENTATION_BS.get();
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
    /// Get current rotation of constraint in constraint space.
    /// Solve: R2 * ConstraintToBody2 = R1 * ConstraintToBody1 * q for q.
    /// ```
    public static void getRotationInConstraintSpace(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotationInConstraintSpace].
    public final void getRotationInConstraintSpace(
    	Quat outResult
    ) {
    	getRotationInConstraintSpace(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the linear/angular impulse applied to satisfy the constraint)
    /// ```
    public static void getTotalLambdaPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
    
    public static float getTotalLambdaTwist(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaTwist].
    public final float getTotalLambdaTwist() {
    	return getTotalLambdaTwist(
    		this.segment
    	);
    }
    
    public static float getTotalLambdaSwingY(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaSwingY].
    public final float getTotalLambdaSwingY() {
    	return getTotalLambdaSwingY(
    		this.segment
    	);
    }
    
    public static float getTotalLambdaSwingZ(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaSwingZ].
    public final float getTotalLambdaSwingZ() {
    	return getTotalLambdaSwingZ(
    		this.segment
    	);
    }
    
    public static void getTotalLambdaMotor(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaMotor].
    public final void getTotalLambdaMotor(
    	Vec3 outResult
    ) {
    	getTotalLambdaMotor(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}