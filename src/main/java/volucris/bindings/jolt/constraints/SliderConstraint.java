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
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SliderConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_TARGET_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TARGET_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_TARGET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TARGET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_HAS_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SLIDER_CONSTRAINT_CREATE = downcallHandle("JPH_SliderConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_SliderConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION = downcallHandle("JPH_SliderConstraint_GetCurrentPosition", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE = downcallHandleVoid("JPH_SliderConstraint_SetMaxFrictionForce", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE = downcallHandle("JPH_SliderConstraint_GetMaxFrictionForce", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS = downcallHandle("JPH_SliderConstraint_GetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS1 = downcallHandle("JPH_SliderConstraint_GetMotorSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_MOTOR_STATE = downcallHandleVoid("JPH_SliderConstraint_SetMotorState", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SLIDER_CONSTRAINT_GET_MOTOR_STATE = downcallHandle("JPH_SliderConstraint_GetMotorState", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_TARGET_VELOCITY = downcallHandleVoid("JPH_SliderConstraint_SetTargetVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_TARGET_VELOCITY = downcallHandle("JPH_SliderConstraint_GetTargetVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_TARGET_POSITION = downcallHandleVoid("JPH_SliderConstraint_SetTargetPosition", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_TARGET_POSITION = downcallHandle("JPH_SliderConstraint_GetTargetPosition", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_LIMITS = downcallHandleVoid("JPH_SliderConstraint_SetLimits", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_LIMITS_MIN = downcallHandle("JPH_SliderConstraint_GetLimitsMin", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_LIMITS_MAX = downcallHandle("JPH_SliderConstraint_GetLimitsMax", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_HAS_LIMITS = downcallHandle("JPH_SliderConstraint_HasLimits", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandle("JPH_SliderConstraint_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1 = downcallHandle("JPH_SliderConstraint_GetLimitsSpringSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SliderConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS = downcallHandle("JPH_SliderConstraint_GetTotalLambdaPositionLimits", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_SliderConstraint_GetTotalLambdaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandle("JPH_SliderConstraint_GetTotalLambdaMotor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SliderConstraint(
	    Body inBody1,
	    Body inBody2,
	    SliderConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public SliderConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		SliderConstraintSettings inSettings
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

	public SliderConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct slider constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the current distance from the rest position
    /// ```
    public static float getCurrentPosition(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCurrentPosition].
    public final float getCurrentPosition() {
    	return getCurrentPosition(
    		this.segment
    	);
    }
    
    /// ```
    /// Friction control
    /// ```
    public static void setMaxFrictionForce(
    	MemorySegment self,
    	float inFrictionForce
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFrictionForce
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxFrictionForce].
    public final void setMaxFrictionForce(
    	float inFrictionForce
    ) {
    	setMaxFrictionForce(
    		this.segment,
    		inFrictionForce
    	);
    }
    
    public static float getMaxFrictionForce(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxFrictionForce].
    public final float getMaxFrictionForce() {
    	return getMaxFrictionForce(
    		this.segment
    	);
    }
    
    /// ```
    /// Motor settings
    /// ```
    public static MemorySegment getMotorSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS1.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_MOTOR_STATE.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MOTOR_STATE.get();
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
    
    public static void setTargetVelocity(
    	MemorySegment self,
    	float inVelocity
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_TARGET_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetVelocity].
    public final void setTargetVelocity(
    	float inVelocity
    ) {
    	setTargetVelocity(
    		this.segment,
    		inVelocity
    	);
    }
    
    public static float getTargetVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TARGET_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetVelocity].
    public final float getTargetVelocity() {
    	return getTargetVelocity(
    		this.segment
    	);
    }
    
    public static void setTargetPosition(
    	MemorySegment self,
    	float inPosition
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_TARGET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetPosition].
    public final void setTargetPosition(
    	float inPosition
    ) {
    	setTargetPosition(
    		this.segment,
    		inPosition
    	);
    }
    
    public static float getTargetPosition(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TARGET_POSITION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetPosition].
    public final float getTargetPosition() {
    	return getTargetPosition(
    		this.segment
    	);
    }
    
    /// ```
    /// Update the limits of the slider constraint (see SliderConstraintSettings)
    /// ```
    public static void setLimits(
    	MemorySegment self,
    	float inLimitsMin,
    	float inLimitsMax
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_LIMITS.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_MIN.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_MAX.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_HAS_LIMITS.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS.get();
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
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
    	Vector2 outResult
    ) {
    	getTotalLambdaPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static float getTotalLambdaPositionLimits(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaPositionLimits].
    public final float getTotalLambdaPositionLimits() {
    	return getTotalLambdaPositionLimits(
    		this.segment
    	);
    }
    
    public static void getTotalLambdaRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
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
    	Vec3 outResult
    ) {
    	getTotalLambdaRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static float getTotalLambdaMotor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR.get();
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