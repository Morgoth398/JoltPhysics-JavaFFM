/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class SixDOFConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MIN;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MAX;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION;
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
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_MOTOR_STATE;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_MOTOR_STATE;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_VELOCITY_CS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TARGET_VELOCITY_CS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_POSITION_CS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TARGET_POSITION_CS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_CS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_GET_TARGET_ORIENTATION_CS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_BS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SIX_DOFCONSTRAINT_CREATE = downcallHandle("JPH_SixDOFConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MIN = downcallHandle("JPH_SixDOFConstraint_GetLimitsMin", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MAX = downcallHandle("JPH_SixDOFConstraint_GetLimitsMax", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaMotorTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaMotorRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MIN = downcallHandleVoid("JPH_SixDOFConstraint_GetTranslationLimitsMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MAX = downcallHandleVoid("JPH_SixDOFConstraint_GetTranslationLimitsMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MIN = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationLimitsMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MAX = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationLimitsMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_IS_FIXED_AXIS = downcallHandle("JPH_SixDOFConstraint_IsFixedAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_IS_FREE_AXIS = downcallHandle("JPH_SixDOFConstraint_IsFreeAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SET_MAX_FRICTION = downcallHandleVoid("JPH_SixDOFConstraint_SetMaxFriction", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_SIX_DOFCONSTRAINT_GET_MAX_FRICTION = downcallHandle("JPH_SixDOFConstraint_GetMaxFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationInConstraintSpace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_MOTOR_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_GetMotorSettings", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_SET_MOTOR_STATE = downcallHandleVoid("JPH_SixDOFConstraint_SetMotorState", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_GET_MOTOR_STATE = downcallHandle("JPH_SixDOFConstraint_GetMotorState", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SET_TARGET_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TARGET_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetAngularVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetAngularVelocityCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_SET_TARGET_POSITION_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetPositionCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TARGET_POSITION_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetPositionCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetOrientationCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_GET_TARGET_ORIENTATION_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetOrientationCS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_BS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetOrientationBS", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public SixDOFConstraint(
        SixDOFConstraintSettings settings, 
        Body body1, 
        Body body2
    ) {
        this(
            Arena.ofAuto(),
            settings, 
            body1, 
            body2
        );
    }
    
    public SixDOFConstraint(
        Arena arena,
        SixDOFConstraintSettings settings, 
        Body body1, 
        Body body2
    ) {
         MemorySegment segment = create(
            settings.memorySegment(), 
            body1.memorySegment(), 
            body2.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public SixDOFConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings, 
                body1, 
                body2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void getSettings(
        MemorySegment constraint, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_SETTINGS.get();
        try {
            method.invokeExact(
                constraint, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSettings}.
     */
    public final void getSettings(
        SixDOFConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static float getLimitsMin(
        MemorySegment constraint, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MIN.get();
        try {
            return (float) method.invokeExact(
                constraint, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLimitsMin}.
     */
    public final float getLimitsMin(
        int axis
    ) {
        return (float) getLimitsMin(
            this.segment, 
            axis
        );
    }
    
    public static float getLimitsMax(
        MemorySegment constraint, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_LIMITS_MAX.get();
        try {
            return (float) method.invokeExact(
                constraint, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLimitsMax}.
     */
    public final float getLimitsMax(
        int axis
    ) {
        return (float) getLimitsMax(
            this.segment, 
            axis
        );
    }
    
    public static void getTotalLambdaPosition(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaPosition}.
     */
    public final void getTotalLambdaPosition(
        Vec3 result
    ) {
        getTotalLambdaPosition(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getTotalLambdaRotation(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaRotation}.
     */
    public final void getTotalLambdaRotation(
        Vec3 result
    ) {
        getTotalLambdaRotation(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getTotalLambdaMotorTranslation(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaMotorTranslation}.
     */
    public final void getTotalLambdaMotorTranslation(
        Vec3 result
    ) {
        getTotalLambdaMotorTranslation(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getTotalLambdaMotorRotation(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaMotorRotation}.
     */
    public final void getTotalLambdaMotorRotation(
        Vec3 result
    ) {
        getTotalLambdaMotorRotation(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getTranslationLimitsMin(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MIN.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTranslationLimitsMin}.
     */
    public final void getTranslationLimitsMin(
        Vec3 result
    ) {
        getTranslationLimitsMin(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getTranslationLimitsMax(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TRANSLATION_LIMITS_MAX.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTranslationLimitsMax}.
     */
    public final void getTranslationLimitsMax(
        Vec3 result
    ) {
        getTranslationLimitsMax(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getRotationLimitsMin(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MIN.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotationLimitsMin}.
     */
    public final void getRotationLimitsMin(
        Vec3 result
    ) {
        getRotationLimitsMin(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getRotationLimitsMax(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_ROTATION_LIMITS_MAX.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotationLimitsMax}.
     */
    public final void getRotationLimitsMax(
        Vec3 result
    ) {
        getRotationLimitsMax(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static boolean isFixedAxis(
        MemorySegment constraint, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_IS_FIXED_AXIS.get();
        try {
            return (boolean) method.invokeExact(
                constraint, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isFixedAxis}.
     */
    public final boolean isFixedAxis(
        int axis
    ) {
        return (boolean) isFixedAxis(
            this.segment, 
            axis
        );
    }
    
    public static boolean isFreeAxis(
        MemorySegment constraint, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_IS_FREE_AXIS.get();
        try {
            return (boolean) method.invokeExact(
                constraint, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isFreeAxis}.
     */
    public final boolean isFreeAxis(
        int axis
    ) {
        return (boolean) isFreeAxis(
            this.segment, 
            axis
        );
    }
    
    public static void getLimitsSpringSettings(
        MemorySegment constraint, 
        MemorySegment result, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_LIMITS_SPRING_SETTINGS.get();
        try {
            method.invokeExact(
                constraint, 
                result, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLimitsSpringSettings}.
     */
    public final void getLimitsSpringSettings(
        SpringSettings result, 
        int axis
    ) {
        getLimitsSpringSettings(
            this.segment, 
            result.memorySegment(), 
            axis
        );
    }
    
    public static void setLimitsSpringSettings(
        MemorySegment constraint, 
        MemorySegment settings, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_LIMITS_SPRING_SETTINGS.get();
        try {
            method.invokeExact(
                constraint, 
                settings, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLimitsSpringSettings}.
     */
    public final void setLimitsSpringSettings(
        SpringSettings settings, 
        int axis
    ) {
        setLimitsSpringSettings(
            this.segment, 
            settings.memorySegment(), 
            axis
        );
    }
    
    public static void setMaxFriction(
        MemorySegment constraint, 
        int axis, 
        float inFriction
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_MAX_FRICTION.get();
        try {
            method.invokeExact(
                constraint, 
                axis, 
                inFriction
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxFriction}.
     */
    public final void setMaxFriction(
        int axis, 
        float inFriction
    ) {
        setMaxFriction(
            this.segment, 
            axis, 
            inFriction
        );
    }
    
    public static float getMaxFriction(
        MemorySegment constraint, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_MAX_FRICTION.get();
        try {
            return (float) method.invokeExact(
                constraint, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxFriction}.
     */
    public final float getMaxFriction(
        int axis
    ) {
        return (float) getMaxFriction(
            this.segment, 
            axis
        );
    }
    
    public static void getRotationInConstraintSpace(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotationInConstraintSpace}.
     */
    public final void getRotationInConstraintSpace(
        Quat result
    ) {
        getRotationInConstraintSpace(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getMotorSettings(
        MemorySegment constraint, 
        int axis, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_MOTOR_SETTINGS.get();
        try {
            method.invokeExact(
                constraint, 
                axis, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotorSettings}.
     */
    public final void getMotorSettings(
        int axis, 
        MotorSettings settings
    ) {
        getMotorSettings(
            this.segment, 
            axis, 
            settings.memorySegment()
        );
    }
    
    public static void setMotorState(
        MemorySegment constraint, 
        int axis, 
        int state
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_MOTOR_STATE.get();
        try {
            method.invokeExact(
                constraint, 
                axis, 
                state
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMotorState}.
     */
    public final void setMotorState(
        int axis, 
        int state
    ) {
        setMotorState(
            this.segment, 
            axis, 
            state
        );
    }
    
    public static int getMotorState(
        MemorySegment constraint, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_MOTOR_STATE.get();
        try {
            return (int) method.invokeExact(
                constraint, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotorState}.
     */
    public final int getMotorState(
        int axis
    ) {
        return (int) getMotorState(
            this.segment, 
            axis
        );
    }
    
    public static void setTargetVelocityCS(
        MemorySegment constraint, 
        MemorySegment inVelocity
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_VELOCITY_CS.get();
        try {
            method.invokeExact(
                constraint, 
                inVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetVelocityCS}.
     */
    public final void setTargetVelocityCS(
        Vec3 inVelocity
    ) {
        setTargetVelocityCS(
            this.segment, 
            inVelocity.memorySegment()
        );
    }
    
    public static void getTargetVelocityCS(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TARGET_VELOCITY_CS.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTargetVelocityCS}.
     */
    public final void getTargetVelocityCS(
        Vec3 result
    ) {
        getTargetVelocityCS(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setTargetAngularVelocityCS(
        MemorySegment constraint, 
        MemorySegment inAngularVelocity
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS.get();
        try {
            method.invokeExact(
                constraint, 
                inAngularVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetAngularVelocityCS}.
     */
    public final void setTargetAngularVelocityCS(
        Vec3 inAngularVelocity
    ) {
        setTargetAngularVelocityCS(
            this.segment, 
            inAngularVelocity.memorySegment()
        );
    }
    
    public static void getTargetAngularVelocityCS(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTargetAngularVelocityCS}.
     */
    public final void getTargetAngularVelocityCS(
        Vec3 result
    ) {
        getTargetAngularVelocityCS(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setTargetPositionCS(
        MemorySegment constraint, 
        MemorySegment inPosition
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_POSITION_CS.get();
        try {
            method.invokeExact(
                constraint, 
                inPosition
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetPositionCS}.
     */
    public final void setTargetPositionCS(
        Vec3 inPosition
    ) {
        setTargetPositionCS(
            this.segment, 
            inPosition.memorySegment()
        );
    }
    
    public static void getTargetPositionCS(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TARGET_POSITION_CS.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTargetPositionCS}.
     */
    public final void getTargetPositionCS(
        Vec3 result
    ) {
        getTargetPositionCS(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setTargetOrientationCS(
        MemorySegment constraint, 
        MemorySegment inOrientation
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_CS.get();
        try {
            method.invokeExact(
                constraint, 
                inOrientation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetOrientationCS}.
     */
    public final void setTargetOrientationCS(
        Quat inOrientation
    ) {
        setTargetOrientationCS(
            this.segment, 
            inOrientation.memorySegment()
        );
    }
    
    public static void getTargetOrientationCS(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_GET_TARGET_ORIENTATION_CS.get();
        try {
            method.invokeExact(
                constraint, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTargetOrientationCS}.
     */
    public final void getTargetOrientationCS(
        Quat result
    ) {
        getTargetOrientationCS(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setTargetOrientationBS(
        MemorySegment constraint, 
        MemorySegment inOrientation
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SET_TARGET_ORIENTATION_BS.get();
        try {
            method.invokeExact(
                constraint, 
                inOrientation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetOrientationBS}.
     */
    public final void setTargetOrientationBS(
        Quat inOrientation
    ) {
        setTargetOrientationBS(
            this.segment, 
            inOrientation.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}