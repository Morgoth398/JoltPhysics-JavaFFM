/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.filter.BroadPhaseLayerFilter;
import volucris.bindings.jolt.filter.ObjectLayerFilter;
import volucris.bindings.jolt.math.AABox;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class BroadPhaseQuery {

    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_CAST_RAY;
    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_CAST_RAY2;
    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX;
    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE;
    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_COLLIDE_POINT;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BROAD_PHASE_QUERY_CAST_RAY = downcallHandle("JPH_BroadPhaseQuery_CastRay", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BROAD_PHASE_QUERY_CAST_RAY2 = downcallHandle("JPH_BroadPhaseQuery_CastRay2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX = downcallHandle("JPH_BroadPhaseQuery_CollideAABox", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE = downcallHandle("JPH_BroadPhaseQuery_CollideSphere", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BROAD_PHASE_QUERY_COLLIDE_POINT = downcallHandle("JPH_BroadPhaseQuery_CollidePoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public BroadPhaseQuery(MemorySegment segment) {
        this.segment = segment;
    }

    public static boolean castRay(
        MemorySegment query, 
        MemorySegment origin, 
        MemorySegment direction, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter
    ) {
        MethodHandle method = JPH_BROAD_PHASE_QUERY_CAST_RAY.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                origin, 
                direction, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter
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
        RayCastBodyCollectorCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter
    ) {
        return (boolean) castRay(
            this.segment, 
            origin.memorySegment(), 
            direction.memorySegment(), 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment()
        );
    }
    
    public static boolean castRay2(
        MemorySegment query, 
        MemorySegment origin, 
        MemorySegment direction, 
        int collectorType, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter
    ) {
        MethodHandle method = JPH_BROAD_PHASE_QUERY_CAST_RAY2.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                origin, 
                direction, 
                collectorType, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter
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
        int collectorType, 
        RayCastBodyResultCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter
    ) {
        return (boolean) castRay2(
            this.segment, 
            origin.memorySegment(), 
            direction.memorySegment(), 
            collectorType, 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment()
        );
    }
    
    public static boolean collideAABox(
        MemorySegment query, 
        MemorySegment box, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter
    ) {
        MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                box, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #collideAABox}.
     */
    public final boolean collideAABox(
        AABox box, 
        CollideShapeBodyCollectorCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter
    ) {
        return (boolean) collideAABox(
            this.segment, 
            box.memorySegment(), 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment()
        );
    }
    
    public static boolean collideSphere(
        MemorySegment query, 
        MemorySegment center, 
        float radius, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter
    ) {
        MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                center, 
                radius, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #collideSphere}.
     */
    public final boolean collideSphere(
        Vec3 center, 
        float radius, 
        CollideShapeBodyCollectorCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter
    ) {
        return (boolean) collideSphere(
            this.segment, 
            center.memorySegment(), 
            radius, 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment()
        );
    }
    
    public static boolean collidePoint(
        MemorySegment query, 
        MemorySegment point, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter
    ) {
        MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_POINT.get();
        try {
            return (boolean) method.invokeExact(
                query, 
                point, 
                callback, 
                userData, 
                broadPhaseLayerFilter, 
                objectLayerFilter
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
        CollideShapeBodyCollectorCallback callback, 
        MemorySegment userData, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter
    ) {
        return (boolean) collidePoint(
            this.segment, 
            point.memorySegment(), 
            callback.memorySegment(), 
            userData, 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}