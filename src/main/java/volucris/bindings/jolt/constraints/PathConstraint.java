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

public final class PathConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SET_PATH;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_PATH;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_PATH_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SET_MAX_FRICTION_FORCE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_MAX_FRICTION_FORCE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SET_POSITION_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SET_TARGET_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_TARGET_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_SET_TARGET_PATH_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_TARGET_PATH_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_HINGE;
	private static final LazyConstant<MethodHandle> JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PATH_CONSTRAINT_CREATE = downcallHandle("JPH_PathConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_PathConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SET_PATH = downcallHandleVoid("JPH_PathConstraint_SetPath", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PATH_CONSTRAINT_GET_PATH = downcallHandle("JPH_PathConstraint_GetPath", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_GET_PATH_FRACTION = downcallHandle("JPH_PathConstraint_GetPathFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SET_MAX_FRICTION_FORCE = downcallHandleVoid("JPH_PathConstraint_SetMaxFrictionForce", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PATH_CONSTRAINT_GET_MAX_FRICTION_FORCE = downcallHandle("JPH_PathConstraint_GetMaxFrictionForce", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_SETTINGS = downcallHandle("JPH_PathConstraint_GetPositionMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_SETTINGS1 = downcallHandle("JPH_PathConstraint_GetPositionMotorSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SET_POSITION_MOTOR_STATE = downcallHandleVoid("JPH_PathConstraint_SetPositionMotorState", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_STATE = downcallHandle("JPH_PathConstraint_GetPositionMotorState", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SET_TARGET_VELOCITY = downcallHandleVoid("JPH_PathConstraint_SetTargetVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PATH_CONSTRAINT_GET_TARGET_VELOCITY = downcallHandle("JPH_PathConstraint_GetTargetVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_SET_TARGET_PATH_FRACTION = downcallHandleVoid("JPH_PathConstraint_SetTargetPathFraction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PATH_CONSTRAINT_GET_TARGET_PATH_FRACTION = downcallHandle("JPH_PathConstraint_GetTargetPathFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_PathConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS = downcallHandle("JPH_PathConstraint_GetTotalLambdaPositionLimits", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandle("JPH_PathConstraint_GetTotalLambdaMotor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_HINGE = downcallHandleVoid("JPH_PathConstraint_GetTotalLambdaRotationHinge", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_PathConstraint_GetTotalLambdaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PathConstraint(
	    Body inBody1,
	    Body inBody2,
	    PathConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public PathConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		PathConstraintSettings inSettings
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

	public PathConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct point constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_PATH_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Update the path for this constraint
    /// ```
    public static void setPath(
    	MemorySegment self,
    	MemorySegment inPath,
    	float inPathFraction
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SET_PATH.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPath,
    			inPathFraction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPath].
    public final void setPath(
    	PathConstraintPath inPath,
    	float inPathFraction
    ) {
    	setPath(
    		this.segment,
    		inPath.memorySegment(),
    		inPathFraction
    	);
    }
    
    /// ```
    /// Access to the current path
    /// ```
    public static MemorySegment getPath(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_PATH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPath].
    public final @Nullable PathConstraintPath getPath() {
    	MemorySegment segment = getPath(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PathConstraintPath(segment);
    }
    
    /// ```
    /// Access to the current fraction along the path e [0, GetPath()->GetMaxPathFraction()]
    /// ```
    public static float getPathFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_PATH_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPathFraction].
    public final float getPathFraction() {
    	return getPathFraction(
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
    	MethodHandle method = JPH_PATH_CONSTRAINT_SET_MAX_FRICTION_FORCE.get();
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
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_MAX_FRICTION_FORCE.get();
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
    /// Position motor settings
    /// ```
    public static MemorySegment getPositionMotorSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPositionMotorSettings].
    public final @Nullable MotorSettings getPositionMotorSettings() {
    	MemorySegment segment = getPositionMotorSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    public static MemorySegment getPositionMotorSettings1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_SETTINGS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPositionMotorSettings1].
    public final @Nullable MotorSettings getPositionMotorSettings1() {
    	MemorySegment segment = getPositionMotorSettings1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    public static void setPositionMotorState(
    	MemorySegment self,
    	int inState
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SET_POSITION_MOTOR_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inState
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPositionMotorState].
    public final void setPositionMotorState(
    	int inState
    ) {
    	setPositionMotorState(
    		this.segment,
    		inState
    	);
    }
    
    public static int getPositionMotorState(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_POSITION_MOTOR_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPositionMotorState].
    public final int getPositionMotorState() {
    	return getPositionMotorState(
    		this.segment
    	);
    }
    
    public static void setTargetVelocity(
    	MemorySegment self,
    	float inVelocity
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SET_TARGET_VELOCITY.get();
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
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_TARGET_VELOCITY.get();
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
    
    public static void setTargetPathFraction(
    	MemorySegment self,
    	float inFraction
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_SET_TARGET_PATH_FRACTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFraction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetPathFraction].
    public final void setTargetPathFraction(
    	float inFraction
    ) {
    	setTargetPathFraction(
    		this.segment,
    		inFraction
    	);
    }
    
    public static float getTargetPathFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_TARGET_PATH_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetPathFraction].
    public final float getTargetPathFraction() {
    	return getTargetPathFraction(
    		this.segment
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the linear/angular impulse applied to satisfy the constraint)
    /// ```
    public static void getTotalLambdaPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS.get();
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
    
    public static float getTotalLambdaMotor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR.get();
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
    
    public static void getTotalLambdaRotationHinge(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_HINGE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaRotationHinge].
    public final void getTotalLambdaRotationHinge(
    	Vector2 outResult
    ) {
    	getTotalLambdaRotationHinge(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getTotalLambdaRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PATH_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}