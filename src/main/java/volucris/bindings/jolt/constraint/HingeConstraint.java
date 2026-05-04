/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class HingeConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_MOTOR_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_LIMITS;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_HAS_LIMITS;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS;
    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_HINGE_CONSTRAINT_CREATE = downcallHandle("JPH_HingeConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpacePoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpacePoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceHingeAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceHingeAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceNormalAxis1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceNormalAxis2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE = downcallHandle("JPH_HingeConstraint_GetCurrentAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE = downcallHandleVoid("JPH_HingeConstraint_SetMaxFrictionTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE = downcallHandle("JPH_HingeConstraint_GetMaxFrictionTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_SET_MOTOR_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_SetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_GetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE = downcallHandleVoid("JPH_HingeConstraint_SetMotorState", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE = downcallHandle("JPH_HingeConstraint_GetMotorState", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_HingeConstraint_SetTargetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY = downcallHandle("JPH_HingeConstraint_GetTargetAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE = downcallHandleVoid("JPH_HingeConstraint_SetTargetAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE = downcallHandle("JPH_HingeConstraint_GetTargetAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_SET_LIMITS = downcallHandleVoid("JPH_HingeConstraint_SetLimits", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN = downcallHandle("JPH_HingeConstraint_GetLimitsMin", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX = downcallHandle("JPH_HingeConstraint_GetLimitsMax", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_HAS_LIMITS = downcallHandle("JPH_HingeConstraint_HasLimits", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_HingeConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_HingeConstraint_GetTotalLambdaRotation", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS = downcallHandle("JPH_HingeConstraint_GetTotalLambdaRotationLimits", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandle("JPH_HingeConstraint_GetTotalLambdaMotor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public HingeConstraint(
        HingeConstraintSettings settings, 
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
    
    public HingeConstraint(
        Arena arena,
        HingeConstraintSettings settings, 
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
    
    public HingeConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_CREATE.get();
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
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_SETTINGS.get();
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
        HingeConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void getLocalSpacePoint1(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1.get();
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
     * Typed method of {@link #getLocalSpacePoint1}.
     */
    public final void getLocalSpacePoint1(
        Vec3 result
    ) {
        getLocalSpacePoint1(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getLocalSpacePoint2(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2.get();
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
     * Typed method of {@link #getLocalSpacePoint2}.
     */
    public final void getLocalSpacePoint2(
        Vec3 result
    ) {
        getLocalSpacePoint2(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getLocalSpaceHingeAxis1(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1.get();
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
     * Typed method of {@link #getLocalSpaceHingeAxis1}.
     */
    public final void getLocalSpaceHingeAxis1(
        Vec3 result
    ) {
        getLocalSpaceHingeAxis1(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getLocalSpaceHingeAxis2(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2.get();
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
     * Typed method of {@link #getLocalSpaceHingeAxis2}.
     */
    public final void getLocalSpaceHingeAxis2(
        Vec3 result
    ) {
        getLocalSpaceHingeAxis2(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getLocalSpaceNormalAxis1(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1.get();
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
     * Typed method of {@link #getLocalSpaceNormalAxis1}.
     */
    public final void getLocalSpaceNormalAxis1(
        Vec3 result
    ) {
        getLocalSpaceNormalAxis1(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getLocalSpaceNormalAxis2(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2.get();
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
     * Typed method of {@link #getLocalSpaceNormalAxis2}.
     */
    public final void getLocalSpaceNormalAxis2(
        Vec3 result
    ) {
        getLocalSpaceNormalAxis2(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static float getCurrentAngle(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCurrentAngle}.
     */
    public final float getCurrentAngle(
    ) {
        return (float) getCurrentAngle(
            this.segment
        );
    }
    
    public static void setMaxFrictionTorque(
        MemorySegment constraint, 
        float frictionTorque
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE.get();
        try {
            method.invokeExact(
                constraint, 
                frictionTorque
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxFrictionTorque}.
     */
    public final void setMaxFrictionTorque(
        float frictionTorque
    ) {
        setMaxFrictionTorque(
            this.segment, 
            frictionTorque
        );
    }
    
    public static float getMaxFrictionTorque(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxFrictionTorque}.
     */
    public final float getMaxFrictionTorque(
    ) {
        return (float) getMaxFrictionTorque(
            this.segment
        );
    }
    
    public static void setMotorSettings(
        MemorySegment constraint, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_SET_MOTOR_SETTINGS.get();
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
     * Typed method of {@link #setMotorSettings}.
     */
    public final void setMotorSettings(
        MotorSettings settings
    ) {
        setMotorSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void getMotorSettings(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS.get();
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
     * Typed method of {@link #getMotorSettings}.
     */
    public final void getMotorSettings(
        MotorSettings result
    ) {
        getMotorSettings(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setMotorState(
        MemorySegment constraint, 
        int state
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE.get();
        try {
            method.invokeExact(
                constraint, 
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
        int state
    ) {
        setMotorState(
            this.segment, 
            state
        );
    }
    
    public static int getMotorState(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE.get();
        try {
            return (int) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotorState}.
     */
    public final int getMotorState(
    ) {
        return (int) getMotorState(
            this.segment
        );
    }
    
    public static void setTargetAngularVelocity(
        MemorySegment constraint, 
        float angularVelocity
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                constraint, 
                angularVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetAngularVelocity}.
     */
    public final void setTargetAngularVelocity(
        float angularVelocity
    ) {
        setTargetAngularVelocity(
            this.segment, 
            angularVelocity
        );
    }
    
    public static float getTargetAngularVelocity(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTargetAngularVelocity}.
     */
    public final float getTargetAngularVelocity(
    ) {
        return (float) getTargetAngularVelocity(
            this.segment
        );
    }
    
    public static void setTargetAngle(
        MemorySegment constraint, 
        float angle
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE.get();
        try {
            method.invokeExact(
                constraint, 
                angle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetAngle}.
     */
    public final void setTargetAngle(
        float angle
    ) {
        setTargetAngle(
            this.segment, 
            angle
        );
    }
    
    public static float getTargetAngle(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTargetAngle}.
     */
    public final float getTargetAngle(
    ) {
        return (float) getTargetAngle(
            this.segment
        );
    }
    
    public static void setLimits(
        MemorySegment constraint, 
        float inLimitsMin, 
        float inLimitsMax
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_SET_LIMITS.get();
        try {
            method.invokeExact(
                constraint, 
                inLimitsMin, 
                inLimitsMax
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLimits}.
     */
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
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLimitsMin}.
     */
    public final float getLimitsMin(
    ) {
        return (float) getLimitsMin(
            this.segment
        );
    }
    
    public static float getLimitsMax(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLimitsMax}.
     */
    public final float getLimitsMax(
    ) {
        return (float) getLimitsMax(
            this.segment
        );
    }
    
    public static boolean hasLimits(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_HAS_LIMITS.get();
        try {
            return (boolean) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #hasLimits}.
     */
    public final boolean hasLimits(
    ) {
        return (boolean) hasLimits(
            this.segment
        );
    }
    
    public static void getLimitsSpringSettings(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS.get();
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
     * Typed method of {@link #getLimitsSpringSettings}.
     */
    public final void getLimitsSpringSettings(
        SpringSettings result
    ) {
        getLimitsSpringSettings(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setLimitsSpringSettings(
        MemorySegment constraint, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS.get();
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
     * Typed method of {@link #setLimitsSpringSettings}.
     */
    public final void setLimitsSpringSettings(
        SpringSettings settings
    ) {
        setLimitsSpringSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void getTotalLambdaPosition(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
        try {
            method.invokeExact(
                constraint, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaRotation}.
     */
    public final void getTotalLambdaRotation(
        MemorySegment rotation
    ) {
        getTotalLambdaRotation(
            this.segment, 
            rotation
        );
    }
    
    public static float getTotalLambdaRotationLimits(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaRotationLimits}.
     */
    public final float getTotalLambdaRotationLimits(
    ) {
        return (float) getTotalLambdaRotationLimits(
            this.segment
        );
    }
    
    public static float getTotalLambdaMotor(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaMotor}.
     */
    public final float getTotalLambdaMotor(
    ) {
        return (float) getTotalLambdaMotor(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}