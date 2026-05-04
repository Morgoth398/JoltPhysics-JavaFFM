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
public final class SwingTwistConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST;
    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y;
    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z;
    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SWING_TWIST_CONSTRAINT_CREATE = downcallHandle("JPH_SwingTwistConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SWING_TWIST_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_SwingTwistConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE = downcallHandle("JPH_SwingTwistConstraint_GetNormalHalfConeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SwingTwistConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaTwist", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaSwingY", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaSwingZ", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandleVoid("JPH_SwingTwistConstraint_GetTotalLambdaMotor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public SwingTwistConstraint(
        SwingTwistConstraintSettings settings, 
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
    
    public SwingTwistConstraint(
        Arena arena,
        SwingTwistConstraintSettings settings, 
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
    
    public SwingTwistConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_CREATE.get();
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
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_SETTINGS.get();
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
        SwingTwistConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static float getNormalHalfConeAngle(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNormalHalfConeAngle}.
     */
    public final float getNormalHalfConeAngle(
    ) {
        return (float) getNormalHalfConeAngle(
            this.segment
        );
    }
    
    public static void getTotalLambdaPosition(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
    
    public static float getTotalLambdaTwist(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaTwist}.
     */
    public final float getTotalLambdaTwist(
    ) {
        return (float) getTotalLambdaTwist(
            this.segment
        );
    }
    
    public static float getTotalLambdaSwingY(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaSwingY}.
     */
    public final float getTotalLambdaSwingY(
    ) {
        return (float) getTotalLambdaSwingY(
            this.segment
        );
    }
    
    public static float getTotalLambdaSwingZ(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaSwingZ}.
     */
    public final float getTotalLambdaSwingZ(
    ) {
        return (float) getTotalLambdaSwingZ(
            this.segment
        );
    }
    
    public static void getTotalLambdaMotor(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR.get();
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
     * Typed method of {@link #getTotalLambdaMotor}.
     */
    public final void getTotalLambdaMotor(
        Vec3 result
    ) {
        getTotalLambdaMotor(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}