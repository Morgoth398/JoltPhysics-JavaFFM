/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.filter.BodyFilter;
import volucris.bindings.jolt.filter.BroadPhaseLayerFilter;
import volucris.bindings.jolt.filter.ObjectLayerFilter;
import volucris.bindings.jolt.filter.ShapeFilter;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class NarrowPhaseQuery {

    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_CAST_RAY;
    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_CAST_RAY2;
    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_CAST_RAY3;
    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_COLLIDE_POINT;
    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_COLLIDE_POINT2;
    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE2;
    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_CAST_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_CAST_SHAPE2;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_NARROW_PHASE_QUERY_CAST_RAY = downcallHandle("JPH_NarrowPhaseQuery_CastRay", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_NARROW_PHASE_QUERY_CAST_RAY2 = downcallHandle("JPH_NarrowPhaseQuery_CastRay2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_NARROW_PHASE_QUERY_CAST_RAY3 = downcallHandle("JPH_NarrowPhaseQuery_CastRay3", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_NARROW_PHASE_QUERY_COLLIDE_POINT = downcallHandle("JPH_NarrowPhaseQuery_CollidePoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_NARROW_PHASE_QUERY_COLLIDE_POINT2 = downcallHandle("JPH_NarrowPhaseQuery_CollidePoint2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE = downcallHandle("JPH_NarrowPhaseQuery_CollideShape", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE2 = downcallHandle("JPH_NarrowPhaseQuery_CollideShape2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_NARROW_PHASE_QUERY_CAST_SHAPE = downcallHandle("JPH_NarrowPhaseQuery_CastShape", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_NARROW_PHASE_QUERY_CAST_SHAPE2 = downcallHandle("JPH_NarrowPhaseQuery_CastShape2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public NarrowPhaseQuery(MemorySegment segment) {
        this.segment = segment;
    }

    public static boolean castRay(
        MemorySegment query, 
        MemorySegment origin, 
        MemorySegment direction, 
        MemorySegment hit, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_RAY.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                origin, 
                direction, 
                hit, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #castRay}.
     */
    public final boolean castRay(
        Vec3 origin, 
        Vec3 direction, 
        RayCastResult hit, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter
    ) {
        return (boolean) castRay(
            this.segment, 
            origin.memorySegment(), 
            direction.memorySegment(), 
            hit.memorySegment(), 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment()
        );
    }
    
    public static boolean castRay2(
        MemorySegment query, 
        MemorySegment origin, 
        MemorySegment direction, 
        MemorySegment rayCastSettings, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_RAY2.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                origin, 
                direction, 
                rayCastSettings, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #castRay2}.
     */
    public final boolean castRay2(
        Vec3 origin, 
        Vec3 direction, 
        RayCastSettings rayCastSettings, 
        CastRayCollectorCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) castRay2(
            this.segment, 
            origin.memorySegment(), 
            direction.memorySegment(), 
            rayCastSettings.memorySegment(), 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean castRay3(
        MemorySegment query, 
        MemorySegment origin, 
        MemorySegment direction, 
        MemorySegment rayCastSettings, 
        int collectorType, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_RAY3.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                origin, 
                direction, 
                rayCastSettings, 
                collectorType, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #castRay3}.
     */
    public final boolean castRay3(
        Vec3 origin, 
        Vec3 direction, 
        RayCastSettings rayCastSettings, 
        int collectorType, 
        CastRayResultCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) castRay3(
            this.segment, 
            origin.memorySegment(), 
            direction.memorySegment(), 
            rayCastSettings.memorySegment(), 
            collectorType, 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean collidePoint(
        MemorySegment query, 
        MemorySegment point, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_POINT.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                point, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #collidePoint}.
     */
    public final boolean collidePoint(
        Vec3 point, 
        CollidePointCollectorCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) collidePoint(
            this.segment, 
            point.memorySegment(), 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean collidePoint2(
        MemorySegment query, 
        MemorySegment point, 
        int collectorType, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_POINT2.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                point, 
                collectorType, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #collidePoint2}.
     */
    public final boolean collidePoint2(
        Vec3 point, 
        int collectorType, 
        CollidePointResultCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) collidePoint2(
            this.segment, 
            point.memorySegment(), 
            collectorType, 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean collideShape(
        MemorySegment query, 
        MemorySegment shape, 
        MemorySegment scale, 
        MemorySegment centerOfMassTransform, 
        MemorySegment settings, 
        MemorySegment baseOffset, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                shape, 
                scale, 
                centerOfMassTransform, 
                settings, 
                baseOffset, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #collideShape}.
     */
    public final boolean collideShape(
        Shape shape, 
        Vec3 scale, 
        Mat4 centerOfMassTransform, 
        CollideShapeSettings settings, 
        Vec3 baseOffset, 
        CollideShapeCollectorCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) collideShape(
            this.segment, 
            shape.memorySegment(), 
            scale.memorySegment(), 
            centerOfMassTransform.memorySegment(), 
            settings.memorySegment(), 
            baseOffset.memorySegment(), 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean collideShape2(
        MemorySegment query, 
        MemorySegment shape, 
        MemorySegment scale, 
        MemorySegment centerOfMassTransform, 
        MemorySegment settings, 
        MemorySegment baseOffset, 
        int collectorType, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE2.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                shape, 
                scale, 
                centerOfMassTransform, 
                settings, 
                baseOffset, 
                collectorType, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #collideShape2}.
     */
    public final boolean collideShape2(
        Shape shape, 
        Vec3 scale, 
        Mat4 centerOfMassTransform, 
        CollideShapeSettings settings, 
        Vec3 baseOffset, 
        int collectorType, 
        CollideShapeResultCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) collideShape2(
            this.segment, 
            shape.memorySegment(), 
            scale.memorySegment(), 
            centerOfMassTransform.memorySegment(), 
            settings.memorySegment(), 
            baseOffset.memorySegment(), 
            collectorType, 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean castShape(
        MemorySegment query, 
        MemorySegment shape, 
        MemorySegment worldTransform, 
        MemorySegment direction, 
        MemorySegment settings, 
        MemorySegment baseOffset, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_SHAPE.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                shape, 
                worldTransform, 
                direction, 
                settings, 
                baseOffset, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #castShape}.
     */
    public final boolean castShape(
        Shape shape, 
        Mat4 worldTransform, 
        Vec3 direction, 
        ShapeCastSettings settings, 
        Vec3 baseOffset, 
        CastShapeCollectorCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) castShape(
            this.segment, 
            shape.memorySegment(), 
            worldTransform.memorySegment(), 
            direction.memorySegment(), 
            settings.memorySegment(), 
            baseOffset.memorySegment(), 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean castShape2(
        MemorySegment query, 
        MemorySegment shape, 
        MemorySegment worldTransform, 
        MemorySegment direction, 
        MemorySegment settings, 
        MemorySegment baseOffset, 
        int collectorType, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_SHAPE2.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                shape, 
                worldTransform, 
                direction, 
                settings, 
                baseOffset, 
                collectorType, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #castShape2}.
     */
    public final boolean castShape2(
        Shape shape, 
        Mat4 worldTransform, 
        Vec3 direction, 
        ShapeCastSettings settings, 
        Vec3 baseOffset, 
        int collectorType, 
        CastShapeResultCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) castShape2(
            this.segment, 
            shape.memorySegment(), 
            worldTransform.memorySegment(), 
            direction.memorySegment(), 
            settings.memorySegment(), 
            baseOffset.memorySegment(), 
            collectorType, 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}