/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class ContactManifold {

    private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL;
    private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH;
    private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1;
    private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2;
    private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_POINT_COUNT;
    private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1;
    private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH = downcallHandle("JPH_ContactManifold_GetPenetrationDepth", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1 = downcallHandle("JPH_ContactManifold_GetSubShapeID1", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2 = downcallHandle("JPH_ContactManifold_GetSubShapeID2", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONTACT_MANIFOLD_GET_POINT_COUNT = downcallHandle("JPH_ContactManifold_GetPointCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1 = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceContactPointOn1", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2 = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceContactPointOn2", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public ContactManifold(MemorySegment segment) {
        this.segment = segment;
    }

    public static void getWorldSpaceNormal(
        MemorySegment manifold, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL.get();
        try {
            method.invokeExact(
                manifold, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldSpaceNormal}.
     */
    public final void getWorldSpaceNormal(
        Vec3 result
    ) {
        getWorldSpaceNormal(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static float getPenetrationDepth(
        MemorySegment manifold
    ) {
        MethodHandle method = JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH.get();
        try {
            return (float) method.invokeExact(
                manifold
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPenetrationDepth}.
     */
    public final float getPenetrationDepth(
    ) {
        return (float) getPenetrationDepth(
            this.segment
        );
    }
    
    public static int getSubShapeID1(
        MemorySegment manifold
    ) {
        MethodHandle method = JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1.get();
        try {
            return (int) method.invokeExact(
                manifold
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSubShapeID1}.
     */
    public final int getSubShapeID1(
    ) {
        return (int) getSubShapeID1(
            this.segment
        );
    }
    
    public static int getSubShapeID2(
        MemorySegment manifold
    ) {
        MethodHandle method = JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2.get();
        try {
            return (int) method.invokeExact(
                manifold
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSubShapeID2}.
     */
    public final int getSubShapeID2(
    ) {
        return (int) getSubShapeID2(
            this.segment
        );
    }
    
    public static int getPointCount(
        MemorySegment manifold
    ) {
        MethodHandle method = JPH_CONTACT_MANIFOLD_GET_POINT_COUNT.get();
        try {
            return (int) method.invokeExact(
                manifold
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPointCount}.
     */
    public final int getPointCount(
    ) {
        return (int) getPointCount(
            this.segment
        );
    }
    
    public static void getWorldSpaceContactPointOn1(
        MemorySegment manifold, 
        int index, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1.get();
        try {
            method.invokeExact(
                manifold, 
                index, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldSpaceContactPointOn1}.
     */
    public final void getWorldSpaceContactPointOn1(
        int index, 
        Vec3 result
    ) {
        getWorldSpaceContactPointOn1(
            this.segment, 
            index, 
            result.memorySegment()
        );
    }
    
    public static void getWorldSpaceContactPointOn2(
        MemorySegment manifold, 
        int index, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2.get();
        try {
            method.invokeExact(
                manifold, 
                index, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldSpaceContactPointOn2}.
     */
    public final void getWorldSpaceContactPointOn2(
        int index, 
        Vec3 result
    ) {
        getWorldSpaceContactPointOn2(
            this.segment, 
            index, 
            result.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}