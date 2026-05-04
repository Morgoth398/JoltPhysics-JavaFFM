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
public final class PointConstraint extends TwoBodyConstraint {

    private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_CREATE;
    private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SET_POINT1;
    private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SET_POINT2;
    private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1;
    private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2;
    private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_POINT_CONSTRAINT_CREATE = downcallHandle("JPH_PointConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_POINT_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_PointConstraint_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_POINT_CONSTRAINT_SET_POINT1 = downcallHandleVoid("JPH_PointConstraint_SetPoint1", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_POINT_CONSTRAINT_SET_POINT2 = downcallHandleVoid("JPH_PointConstraint_SetPoint2", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1 = downcallHandleVoid("JPH_PointConstraint_GetLocalSpacePoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2 = downcallHandleVoid("JPH_PointConstraint_GetLocalSpacePoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_PointConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public PointConstraint(
        PointConstraintSettings settings, 
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
    
    public PointConstraint(
        Arena arena,
        PointConstraintSettings settings, 
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
    
    public PointConstraint(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment body1, 
        MemorySegment body2
    ) {
        MethodHandle method = JPH_POINT_CONSTRAINT_CREATE.get();
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
        MethodHandle method = JPH_POINT_CONSTRAINT_GET_SETTINGS.get();
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
        PointConstraintSettings settings
    ) {
        getSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void setPoint1(
        MemorySegment constraint, 
        int space, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_POINT_CONSTRAINT_SET_POINT1.get();
        try {
            method.invokeExact(
                constraint, 
                space, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPoint1}.
     */
    public final void setPoint1(
        int space, 
        Vec3 value
    ) {
        setPoint1(
            this.segment, 
            space, 
            value.memorySegment()
        );
    }
    
    public static void setPoint2(
        MemorySegment constraint, 
        int space, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_POINT_CONSTRAINT_SET_POINT2.get();
        try {
            method.invokeExact(
                constraint, 
                space, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPoint2}.
     */
    public final void setPoint2(
        int space, 
        Vec3 value
    ) {
        setPoint2(
            this.segment, 
            space, 
            value.memorySegment()
        );
    }
    
    public static void getLocalSpacePoint1(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1.get();
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
        MethodHandle method = JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2.get();
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
    
    public static void getTotalLambdaPosition(
        MemorySegment constraint, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}