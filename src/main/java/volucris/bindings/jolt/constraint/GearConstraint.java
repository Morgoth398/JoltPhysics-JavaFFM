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
public final class GearConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS;
    private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_GEAR_CONSTRAINT_CREATE = downcallHandle("JPH_GearConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_GEAR_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_GearConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS = downcallHandleVoid("JPH_GearConstraint_SetConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA = downcallHandle("JPH_GearConstraint_GetTotalLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public GearConstraint(
        GearConstraintSettings settings, 
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
    
    public GearConstraint(
        Arena arena,
        GearConstraintSettings settings, 
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
    
    public GearConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_GEAR_CONSTRAINT_CREATE.get();
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
        MethodHandle method = JPH_GEAR_CONSTRAINT_GET_SETTINGS.get();
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
        GearConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void setConstraints(
        MemorySegment constraint, 
        MemorySegment gear1, 
        MemorySegment gear2
    ) {
        MethodHandle method = JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS.get();
        try {
            method.invokeExact(
                constraint, 
                gear1, 
                gear2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setConstraints}.
     */
    public final void setConstraints(
        Constraint gear1, 
        Constraint gear2
    ) {
        setConstraints(
            this.segment, 
            gear1.memorySegment(), 
            gear2.memorySegment()
        );
    }
    
    public static float getTotalLambda(
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA.get();
        try {
            return (float) method.invokeExact(
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTotalLambda}.
     */
    public final float getTotalLambda(
    ) {
        return (float) getTotalLambda(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}