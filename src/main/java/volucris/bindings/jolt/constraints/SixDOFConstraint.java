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

public final class SixDOFConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TRANSLATION_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_ROTATION_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MIN;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MAX;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_IS_FIXED_AXIS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_IS_FREE_AXIS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_MAX_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_MAX_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_MOTOR_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_MOTOR_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_MOTOR_STATE;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TARGET_VELOCITY_CS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_VELOCITY_CS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TARGET_POSITION_CS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_POSITION_CS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_CS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TARGET_ORIENTATION_CS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_BS;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SIX_DOFCONSTRAINT_CREATE = downcallHandle("JPH_SixDOFConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_SixDOFConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SET_TRANSLATION_LIMITS = downcallHandleVoid("JPH_SixDOFConstraint_SetTranslationLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SET_ROTATION_LIMITS = downcallHandleVoid("JPH_SixDOFConstraint_SetRotationLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MIN = downcallHandle("JPH_SixDOFConstraint_GetLimitsMin", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MAX = downcallHandle("JPH_SixDOFConstraint_GetLimitsMax", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MIN = downcallHandleVoid("JPH_SixDOFConstraint_GetTranslationLimitsMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MAX = downcallHandleVoid("JPH_SixDOFConstraint_GetTranslationLimitsMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MIN = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationLimitsMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MAX = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationLimitsMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_IS_FIXED_AXIS = downcallHandle("JPH_SixDOFConstraint_IsFixedAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_IS_FREE_AXIS = downcallHandle("JPH_SixDOFConstraint_IsFreeAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandle("JPH_SixDOFConstraint_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SET_MAX_FRICTION = downcallHandleVoid("JPH_SixDOFConstraint_SetMaxFriction", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_SIX_DOFCONSTRAINT_GET_MAX_FRICTION = downcallHandle("JPH_SixDOFConstraint_GetMaxFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationInConstraintSpace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_MOTOR_SETTINGS = downcallHandle("JPH_SixDOFConstraint_GetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_GET_MOTOR_SETTINGS1 = downcallHandle("JPH_SixDOFConstraint_GetMotorSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_SET_MOTOR_STATE = downcallHandleVoid("JPH_SixDOFConstraint_SetMotorState", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_GET_MOTOR_STATE = downcallHandle("JPH_SixDOFConstraint_GetMotorState", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SIX_DOFCONSTRAINT_GET_TARGET_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SET_TARGET_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetAngularVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetAngularVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_TARGET_POSITION_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetPositionCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SET_TARGET_POSITION_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetPositionCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetOrientationCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_TARGET_ORIENTATION_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetOrientationCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_BS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetOrientationBS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaMotorTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaMotorRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SixDOFConstraint(
	    Body inBody1,
	    Body inBody2,
	    SixDOFConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public SixDOFConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		SixDOFConstraintSettings inSettings
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

	public SixDOFConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct six DOF constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Update the translation limits for this constraint
    /// ```
    public static void setTranslationLimits(
    	MemorySegment self,
    	MemorySegment inLimitMin,
    	MemorySegment inLimitMax
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TRANSLATION_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLimitMin,
    			inLimitMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTranslationLimits].
    public final void setTranslationLimits(
    	Vec3 inLimitMin,
    	Vec3 inLimitMax
    ) {
    	setTranslationLimits(
    		this.segment,
    		inLimitMin.memorySegment(),
    		inLimitMax.memorySegment()
    	);
    }
    
    /// ```
    /// Update the rotational limits for this constraint
    /// ```
    public static void setRotationLimits(
    	MemorySegment self,
    	MemorySegment inLimitMin,
    	MemorySegment inLimitMax
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_ROTATION_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLimitMin,
    			inLimitMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotationLimits].
    public final void setRotationLimits(
    	Vec3 inLimitMin,
    	Vec3 inLimitMax
    ) {
    	setRotationLimits(
    		this.segment,
    		inLimitMin.memorySegment(),
    		inLimitMax.memorySegment()
    	);
    }
    
    /// ```
    /// Get constraint Limits
    /// ```
    public static float getLimitsMin(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MIN.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsMin].
    public final float getLimitsMin(
    	int inAxis
    ) {
    	return getLimitsMin(
    		this.segment,
    		inAxis
    	);
    }
    
    public static float getLimitsMax(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MAX.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsMax].
    public final float getLimitsMax(
    	int inAxis
    ) {
    	return getLimitsMax(
    		this.segment,
    		inAxis
    	);
    }
    
    public static void getTranslationLimitsMin(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MIN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTranslationLimitsMin].
    public final void getTranslationLimitsMin(
    	Vec3 outResult
    ) {
    	getTranslationLimitsMin(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getTranslationLimitsMax(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MAX.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTranslationLimitsMax].
    public final void getTranslationLimitsMax(
    	Vec3 outResult
    ) {
    	getTranslationLimitsMax(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getRotationLimitsMin(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MIN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotationLimitsMin].
    public final void getRotationLimitsMin(
    	Vec3 outResult
    ) {
    	getRotationLimitsMin(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getRotationLimitsMax(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MAX.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotationLimitsMax].
    public final void getRotationLimitsMax(
    	Vec3 outResult
    ) {
    	getRotationLimitsMax(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Check which axis are fixed/free
    /// ```
    public static boolean isFixedAxis(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_IS_FIXED_AXIS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isFixedAxis].
    public final boolean isFixedAxis(
    	int inAxis
    ) {
    	return isFixedAxis(
    		this.segment,
    		inAxis
    	);
    }
    
    public static boolean isFreeAxis(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_IS_FREE_AXIS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isFreeAxis].
    public final boolean isFreeAxis(
    	int inAxis
    ) {
    	return isFreeAxis(
    		this.segment,
    		inAxis
    	);
    }
    
    /// ```
    /// Update the limits spring settings
    /// ```
    public static MemorySegment getLimitsSpringSettings(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsSpringSettings].
    public final @Nullable SpringSettings getLimitsSpringSettings(
    	int inAxis
    ) {
    	MemorySegment segment = getLimitsSpringSettings(
    		this.segment,
    		inAxis
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SpringSettings(segment);
    }
    
    public static void setLimitsSpringSettings(
    	MemorySegment self,
    	int inAxis,
    	MemorySegment inLimitsSpringSettings
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAxis,
    			inLimitsSpringSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsSpringSettings].
    public final void setLimitsSpringSettings(
    	int inAxis,
    	SpringSettings inLimitsSpringSettings
    ) {
    	setLimitsSpringSettings(
    		this.segment,
    		inAxis,
    		inLimitsSpringSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Set the max friction for each axis
    /// ```
    public static void setMaxFriction(
    	MemorySegment self,
    	int inAxis,
    	float inFriction
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_MAX_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAxis,
    			inFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxFriction].
    public final void setMaxFriction(
    	int inAxis,
    	float inFriction
    ) {
    	setMaxFriction(
    		this.segment,
    		inAxis,
    		inFriction
    	);
    }
    
    public static float getMaxFriction(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_MAX_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxFriction].
    public final float getMaxFriction(
    	int inAxis
    ) {
    	return getMaxFriction(
    		this.segment,
    		inAxis
    	);
    }
    
    /// ```
    /// Get rotation of constraint in constraint space
    /// ```
    public static void getRotationInConstraintSpace(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE.get();
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
    /// Motor settings
    /// ```
    public static MemorySegment getMotorSettings(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_MOTOR_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorSettings].
    public final @Nullable MotorSettings getMotorSettings(
    	int inAxis
    ) {
    	MemorySegment segment = getMotorSettings(
    		this.segment,
    		inAxis
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    public static MemorySegment getMotorSettings1(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_MOTOR_SETTINGS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorSettings1].
    public final @Nullable MotorSettings getMotorSettings1(
    	int inAxis
    ) {
    	MemorySegment segment = getMotorSettings1(
    		this.segment,
    		inAxis
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotorSettings(segment);
    }
    
    /// ```
    /// Motor controls.
    /// Translation motors work in constraint space of body 1.
    /// Rotation motors work in constraint space of body 2 (!).
    /// ```
    public static void setMotorState(
    	MemorySegment self,
    	int inAxis,
    	int inState
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_MOTOR_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAxis,
    			inState
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotorState].
    public final void setMotorState(
    	int inAxis,
    	int inState
    ) {
    	setMotorState(
    		this.segment,
    		inAxis,
    		inState
    	);
    }
    
    public static int getMotorState(
    	MemorySegment self,
    	int inAxis
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_MOTOR_STATE.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotorState].
    public final int getMotorState(
    	int inAxis
    ) {
    	return getMotorState(
    		this.segment,
    		inAxis
    	);
    }
    
    /// ```
    /// Set the target velocity in body 1 constraint space
    /// ```
    public static void getTargetVelocityCS(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TARGET_VELOCITY_CS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetVelocityCS].
    public final void getTargetVelocityCS(
    	Vec3 outResult
    ) {
    	getTargetVelocityCS(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setTargetVelocityCS(
    	MemorySegment self,
    	MemorySegment inVelocity
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_VELOCITY_CS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetVelocityCS].
    public final void setTargetVelocityCS(
    	Vec3 inVelocity
    ) {
    	setTargetVelocityCS(
    		this.segment,
    		inVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set the target angular velocity in body 2 constraint space (!)
    /// ```
    public static void setTargetAngularVelocityCS(
    	MemorySegment self,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS.get();
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
    /// Set the target position in body 1 constraint space
    /// ```
    public static void getTargetPositionCS(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TARGET_POSITION_CS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTargetPositionCS].
    public final void getTargetPositionCS(
    	Vec3 outResult
    ) {
    	getTargetPositionCS(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setTargetPositionCS(
    	MemorySegment self,
    	MemorySegment inPosition
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_POSITION_CS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTargetPositionCS].
    public final void setTargetPositionCS(
    	Vec3 inPosition
    ) {
    	setTargetPositionCS(
    		this.segment,
    		inPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Set the target orientation in body 1 constraint space
    /// ```
    public static void setTargetOrientationCS(
    	MemorySegment self,
    	MemorySegment inOrientation
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_CS.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TARGET_ORIENTATION_CS.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_BS.get();
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
    /// @name Get Lagrange multiplier from last physics update (the linear/angular impulse applied to satisfy the constraint)
    /// ```
    public static void getTotalLambdaPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
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
    
    public static void getTotalLambdaMotorTranslation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaMotorTranslation].
    public final void getTotalLambdaMotorTranslation(
    	Vec3 outResult
    ) {
    	getTotalLambdaMotorTranslation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getTotalLambdaMotorRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaMotorRotation].
    public final void getTotalLambdaMotorRotation(
    	Vec3 outResult
    ) {
    	getTotalLambdaMotorRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}