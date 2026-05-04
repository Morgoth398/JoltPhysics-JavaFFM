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
public final class ConeConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
    private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CONE_CONSTRAINT_CREATE = downcallHandle("JPH_ConeConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CONE_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_ConeConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE = downcallHandleVoid("JPH_ConeConstraint_SetHalfConeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE = downcallHandle("JPH_ConeConstraint_GetCosHalfConeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_ConeConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandle("JPH_ConeConstraint_GetTotalLambdaRotation", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public ConeConstraint(
        ConeConstraintSettings settings, 
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
    
    public ConeConstraint(
        Arena arena,
        ConeConstraintSettings settings, 
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
    
    public ConeConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_CONE_CONSTRAINT_CREATE.get();
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
        MethodHandle method = JPH_CONE_CONSTRAINT_GET_SETTINGS.get();
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
        ConeConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void setHalfConeAngle(
        MemorySegment constraint, 
        float halfConeAngle
    ) {
        MethodHandle method = JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE.get();
        try {
            method.invokeExact(
                constraint, 
                halfConeAngle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setHalfConeAngle}.
     */
    public final void setHalfConeAngle(
        float halfConeAngle
    ) {
        setHalfConeAngle(
            this.segment, 
            halfConeAngle
        );
    }
    
    public static float getCosHalfConeAngle(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCosHalfConeAngle}.
     */
    public final float getCosHalfConeAngle(
    ) {
        return (float) getCosHalfConeAngle(
            this.segment
        );
    }
    
    public static void getTotalLambdaPosition(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
    
    public static float getTotalLambdaRotation(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaRotation}.
     */
    public final float getTotalLambdaRotation(
    ) {
        return (float) getTotalLambdaRotation(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}