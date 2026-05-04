/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class TriangleShape extends ConvexShape {

    private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_GET_VERTEX1;
    private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_GET_VERTEX2;
    private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_GET_VERTEX3;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TRIANGLE_SHAPE_CREATE = downcallHandle("JPH_TriangleShape_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_TriangleShape_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_TRIANGLE_SHAPE_GET_VERTEX1 = downcallHandleVoid("JPH_TriangleShape_GetVertex1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TRIANGLE_SHAPE_GET_VERTEX2 = downcallHandleVoid("JPH_TriangleShape_GetVertex2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TRIANGLE_SHAPE_GET_VERTEX3 = downcallHandleVoid("JPH_TriangleShape_GetVertex3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TriangleShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment v3, 
        float convexRadius
    ) {
        MethodHandle method = JPH_TRIANGLE_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                v1, 
                v2, 
                v3, 
                convexRadius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #create}.
     */
    public final @Nullable TriangleShape create(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 v3, 
        float convexRadius
    ) {
        MemorySegment segment = create(
            v1.memorySegment(), 
            v2.memorySegment(), 
            v3.memorySegment(), 
            convexRadius
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new TriangleShape(segment);
    }
    
    public static float getConvexRadius(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getConvexRadius}.
     */
    public final float getConvexRadius(
    ) {
        return (float) getConvexRadius(
            this.segment
        );
    }
    
    public static void getVertex1(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX1.get();
        try {
            method.invokeExact(
                shape, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getVertex1}.
     */
    public final void getVertex1(
        Vec3 result
    ) {
        getVertex1(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getVertex2(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX2.get();
        try {
            method.invokeExact(
                shape, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getVertex2}.
     */
    public final void getVertex2(
        Vec3 result
    ) {
        getVertex2(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getVertex3(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX3.get();
        try {
            method.invokeExact(
                shape, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getVertex3}.
     */
    public final void getVertex3(
        Vec3 result
    ) {
        getVertex3(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}