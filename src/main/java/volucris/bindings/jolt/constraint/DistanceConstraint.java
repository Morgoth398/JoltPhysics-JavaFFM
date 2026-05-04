/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.Body;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class DistanceConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SET_DISTANCE;
    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE;
    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE;
    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_DISTANCE_CONSTRAINT_CREATE = downcallHandle("JPH_DistanceConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_DISTANCE_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_DistanceConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_DISTANCE_CONSTRAINT_SET_DISTANCE = downcallHandleVoid("JPH_DistanceConstraint_SetDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE = downcallHandle("JPH_DistanceConstraint_GetMinDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE = downcallHandle("JPH_DistanceConstraint_GetMaxDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_DistanceConstraint_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_DistanceConstraint_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandle("JPH_DistanceConstraint_GetTotalLambdaPosition", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public DistanceConstraint(
        DistanceConstraintSettings settings, 
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
    
    public DistanceConstraint(
        Arena arena,
        DistanceConstraintSettings settings, 
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
    
    public DistanceConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_CREATE.get();
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
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_SETTINGS.get();
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
        DistanceConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void setDistance(
        MemorySegment constraint, 
        float minDistance, 
        float maxDistance
    ) {
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_SET_DISTANCE.get();
        try {
            method.invokeExact(
                constraint, 
                minDistance, 
                maxDistance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setDistance}.
     */
    public final void setDistance(
        float minDistance, 
        float maxDistance
    ) {
        setDistance(
            this.segment, 
            minDistance, 
            maxDistance
        );
    }
    
    public static float getMinDistance(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMinDistance}.
     */
    public final float getMinDistance(
    ) {
        return (float) getMinDistance(
            this.segment
        );
    }
    
    public static float getMaxDistance(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxDistance}.
     */
    public final float getMaxDistance(
    ) {
        return (float) getMaxDistance(
            this.segment
        );
    }
    
    public static void getLimitsSpringSettings(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS.get();
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
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS.get();
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
    
    public static float getTotalLambdaPosition(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambdaPosition}.
     */
    public final float getTotalLambdaPosition(
    ) {
        return (float) getTotalLambdaPosition(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}