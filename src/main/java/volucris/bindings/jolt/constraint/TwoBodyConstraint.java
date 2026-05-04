/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Mat4;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class TwoBodyConstraint extends Constraint
		permits ConeConstraint,
		DistanceConstraint,
		FixedConstraint,
		GearConstraint,
		HingeConstraint,
		PointConstraint,
		SixDOFConstraint,
		SliderConstraint,
		SwingTwistConstraint {

    private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_GET_BODY1;
    private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_GET_BODY2;
    private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY1_MATRIX;
    private static final LazyConstant<MethodHandle> JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY2_MATRIX;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TWO_BODY_CONSTRAINT_GET_BODY1 = downcallHandle("JPH_TwoBodyConstraint_GetBody1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TWO_BODY_CONSTRAINT_GET_BODY2 = downcallHandle("JPH_TwoBodyConstraint_GetBody2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY1_MATRIX = downcallHandleVoid("JPH_TwoBodyConstraint_GetConstraintToBody1Matrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY2_MATRIX = downcallHandleVoid("JPH_TwoBodyConstraint_GetConstraintToBody2Matrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TwoBodyConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment getBody1(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_TWO_BODY_CONSTRAINT_GET_BODY1.get();
        try {
            return (MemorySegment) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBody1}.
     */
    public final @Nullable Body getBody1(
    ) {
        MemorySegment segment = getBody1(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static MemorySegment getBody2(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_TWO_BODY_CONSTRAINT_GET_BODY2.get();
        try {
            return (MemorySegment) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBody2}.
     */
    public final @Nullable Body getBody2(
    ) {
        MemorySegment segment = getBody2(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static void getConstraintToBody1Matrix(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY1_MATRIX.get();
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
     * Typed method of {@link #getConstraintToBody1Matrix}.
     */
    public final void getConstraintToBody1Matrix(
        Mat4 result
    ) {
        getConstraintToBody1Matrix(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getConstraintToBody2Matrix(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY2_MATRIX.get();
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
     * Typed method of {@link #getConstraintToBody2Matrix}.
     */
    public final void getConstraintToBody2Matrix(
        Mat4 result
    ) {
        getConstraintToBody2Matrix(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}