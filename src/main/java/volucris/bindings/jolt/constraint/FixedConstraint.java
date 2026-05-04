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

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class FixedConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
    private static final LazyConstant<MethodHandle> JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_FIXED_CONSTRAINT_CREATE = downcallHandle("JPH_FixedConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_FIXED_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_FixedConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_FixedConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_FixedConstraint_GetTotalLambdaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public FixedConstraint(
        FixedConstraintSettings settings, 
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
    
    public FixedConstraint(
        Arena arena,
        FixedConstraintSettings settings, 
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
    
    public FixedConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_FIXED_CONSTRAINT_CREATE.get();
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
        MethodHandle method = JPH_FIXED_CONSTRAINT_GET_SETTINGS.get();
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
        FixedConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void getTotalLambdaPosition(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
        MethodHandle method = JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}