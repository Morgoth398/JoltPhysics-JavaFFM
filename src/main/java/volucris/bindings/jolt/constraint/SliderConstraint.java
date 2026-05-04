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
public final class SliderConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_MOTOR_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS;
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
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SLIDER_CONSTRAINT_CREATE = downcallHandle("JPH_SliderConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION = downcallHandle("JPH_SliderConstraint_GetCurrentPosition", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE = downcallHandleVoid("JPH_SliderConstraint_SetMaxFrictionForce", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE = downcallHandle("JPH_SliderConstraint_GetMaxFrictionForce", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_SET_MOTOR_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_SetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_GetMotorSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
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
        JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SliderConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS = downcallHandle("JPH_SliderConstraint_GetTotalLambdaPositionLimits", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_SliderConstraint_GetTotalLambdaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandle("JPH_SliderConstraint_GetTotalLambdaMotor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public SliderConstraint(
        SliderConstraintSettings settings, 
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
    
    public SliderConstraint(
        Arena arena,
        SliderConstraintSettings settings, 
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
    
    public SliderConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_CREATE.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_SETTINGS.get();
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
        SliderConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static float getCurrentPosition(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCurrentPosition}.
     */
    public final float getCurrentPosition(
    ) {
        return (float) getCurrentPosition(
            this.segment
        );
    }
    
    public static void setMaxFrictionForce(
        MemorySegment constraint, 
        float frictionForce
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE.get();
        try {
            method.invokeExact(
                constraint, 
                frictionForce
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxFrictionForce}.
     */
    public final void setMaxFrictionForce(
        float frictionForce
    ) {
        setMaxFrictionForce(
            this.segment, 
            frictionForce
        );
    }
    
    public static float getMaxFrictionForce(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxFrictionForce}.
     */
    public final float getMaxFrictionForce(
    ) {
        return (float) getMaxFrictionForce(
            this.segment
        );
    }
    
    public static void setMotorSettings(
        MemorySegment constraint, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_MOTOR_SETTINGS.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_MOTOR_STATE.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MOTOR_STATE.get();
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
    
    public static void setTargetVelocity(
        MemorySegment constraint, 
        float velocity
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_TARGET_VELOCITY.get();
        try {
            method.invokeExact(
                constraint, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetVelocity}.
     */
    public final void setTargetVelocity(
        float velocity
    ) {
        setTargetVelocity(
            this.segment, 
            velocity
        );
    }
    
    public static float getTargetVelocity(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TARGET_VELOCITY.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTargetVelocity}.
     */
    public final float getTargetVelocity(
    ) {
        return (float) getTargetVelocity(
            this.segment
        );
    }
    
    public static void setTargetPosition(
        MemorySegment constraint, 
        float position
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_TARGET_POSITION.get();
        try {
            method.invokeExact(
                constraint, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTargetPosition}.
     */
    public final void setTargetPosition(
        float position
    ) {
        setTargetPosition(
            this.segment, 
            position
        );
    }
    
    public static float getTargetPosition(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TARGET_POSITION.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTargetPosition}.
     */
    public final float getTargetPosition(
    ) {
        return (float) getTargetPosition(
            this.segment
        );
    }
    
    public static void setLimits(
        MemorySegment constraint, 
        float inLimitsMin, 
        float inLimitsMax
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_LIMITS.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_MIN.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_MAX.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_HAS_LIMITS.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS.get();
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
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS.get();
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
        MemorySegment position
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
        try {
            method.invokeExact(
                constraint, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaPosition}.
     */
    public final void getTotalLambdaPosition(
        MemorySegment position
    ) {
        getTotalLambdaPosition(
            this.segment, 
            position
        );
    }
    
    public static float getTotalLambdaPositionLimits(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaPositionLimits}.
     */
    public final float getTotalLambdaPositionLimits(
    ) {
        return (float) getTotalLambdaPositionLimits(
            this.segment
        );
    }
    
    public static void getTotalLambdaRotation(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
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
    
    public static float getTotalLambdaMotor(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR.get();
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