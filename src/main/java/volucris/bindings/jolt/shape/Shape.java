/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.DebugRenderer;
import volucris.bindings.jolt.MassProperties;
import volucris.bindings.jolt.PhysicsMaterial;
import volucris.bindings.jolt.filter.ShapeFilter;
import volucris.bindings.jolt.math.AABox;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.SupportingFace;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.raycast.CastRayResultCallback;
import volucris.bindings.jolt.raycast.CollidePointResultCallback;
import volucris.bindings.jolt.raycast.RayCastResult;
import volucris.bindings.jolt.raycast.RayCastSettings;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class Shape
		permits CompoundShape,
		ConvexShape,
		DecoratedShape,
		EmptyShape,
		HeightFieldShape,
		MeshShape,
		PlaneShape {

    private static final LazyConstant<MethodHandle> JPH_SHAPE_DRAW;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_TYPE;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUB_TYPE;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_MUST_BE_STATIC;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_CENTER_OF_MASS;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_LOCAL_BOUNDS;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUB_SHAPE_IDBITS_RECURSIVE;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_WORLD_SPACE_BOUNDS;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_INNER_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_MASS_PROPERTIES;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_LEAF_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_MATERIAL;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SURFACE_NORMAL;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUPPORTING_FACE;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_VOLUME;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_IS_VALID_SCALE;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_MAKE_SCALE_VALID;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_SCALE_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RAY;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RAY2;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_COLLIDE_POINT;
    private static final LazyConstant<MethodHandle> JPH_SHAPE_COLLIDE_POINT2;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SHAPE_DRAW = downcallHandleVoid("JPH_Shape_Draw", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN, JAVA_BOOLEAN);
        JPH_SHAPE_DESTROY = downcallHandleVoid("JPH_Shape_Destroy", UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_TYPE = downcallHandle("JPH_Shape_GetType", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_SUB_TYPE = downcallHandle("JPH_Shape_GetSubType", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_USER_DATA = downcallHandle("JPH_Shape_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_SHAPE_SET_USER_DATA = downcallHandleVoid("JPH_Shape_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
        JPH_SHAPE_MUST_BE_STATIC = downcallHandle("JPH_Shape_MustBeStatic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_CENTER_OF_MASS = downcallHandleVoid("JPH_Shape_GetCenterOfMass", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_LOCAL_BOUNDS = downcallHandleVoid("JPH_Shape_GetLocalBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_SUB_SHAPE_IDBITS_RECURSIVE = downcallHandle("JPH_Shape_GetSubShapeIDBitsRecursive", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_WORLD_SPACE_BOUNDS = downcallHandleVoid("JPH_Shape_GetWorldSpaceBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_INNER_RADIUS = downcallHandle("JPH_Shape_GetInnerRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_MASS_PROPERTIES = downcallHandleVoid("JPH_Shape_GetMassProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_LEAF_SHAPE = downcallHandle("JPH_Shape_GetLeafShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_MATERIAL = downcallHandle("JPH_Shape_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SHAPE_GET_SURFACE_NORMAL = downcallHandleVoid("JPH_Shape_GetSurfaceNormal", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_SUPPORTING_FACE = downcallHandleVoid("JPH_Shape_GetSupportingFace", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_GET_VOLUME = downcallHandle("JPH_Shape_GetVolume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SHAPE_IS_VALID_SCALE = downcallHandle("JPH_Shape_IsValidScale", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_MAKE_SCALE_VALID = downcallHandleVoid("JPH_Shape_MakeScaleValid", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_SCALE_SHAPE = downcallHandle("JPH_Shape_ScaleShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_CAST_RAY = downcallHandle("JPH_Shape_CastRay", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_CAST_RAY2 = downcallHandle("JPH_Shape_CastRay2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_COLLIDE_POINT = downcallHandle("JPH_Shape_CollidePoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SHAPE_COLLIDE_POINT2 = downcallHandle("JPH_Shape_CollidePoint2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public Shape(MemorySegment segment) {
        this.segment = segment;
    }

    public static void draw(
        MemorySegment shape, 
        MemorySegment renderer, 
        MemorySegment centerOfMassTransform, 
        MemorySegment scale, 
        int color, 
        boolean useMaterialColors, 
        boolean drawWireframe
    ) {
        MethodHandle method = JPH_SHAPE_DRAW.get();
        try {
            method.invokeExact(
                shape, 
                renderer, 
                centerOfMassTransform, 
                scale, 
                color, 
                useMaterialColors, 
                drawWireframe
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #draw}.
     */
    public final void draw(
        DebugRenderer renderer, 
        Mat4 centerOfMassTransform, 
        Vec3 scale, 
        int color, 
        boolean useMaterialColors, 
        boolean drawWireframe
    ) {
        draw(
            this.segment, 
            renderer.memorySegment(), 
            centerOfMassTransform.memorySegment(), 
            scale.memorySegment(), 
            color, 
            useMaterialColors, 
            drawWireframe
        );
    }
    
    public static void destroy(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_SHAPE_DESTROY.get();
        try {
            method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #destroy}.
     */
    public final void destroy(
    ) {
        destroy(
            this.segment
        );
    }
    
    public static int getType(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_SHAPE_GET_TYPE.get();
        try {
            return (int) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getType}.
     */
    public final int getType(
    ) {
        return (int) getType(
            this.segment
        );
    }
    
    public static int getSubType(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_SHAPE_GET_SUB_TYPE.get();
        try {
            return (int) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSubType}.
     */
    public final int getSubType(
    ) {
        return (int) getSubType(
            this.segment
        );
    }
    
    public static long getUserData(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_SHAPE_GET_USER_DATA.get();
        try {
            return (long) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUserData}.
     */
    public final long getUserData(
    ) {
        return (long) getUserData(
            this.segment
        );
    }
    
    public static void setUserData(
        MemorySegment shape, 
        long userData
    ) {
        MethodHandle method = JPH_SHAPE_SET_USER_DATA.get();
        try {
            method.invokeExact(
                shape, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setUserData}.
     */
    public final void setUserData(
        long userData
    ) {
        setUserData(
            this.segment, 
            userData
        );
    }
    
    public static boolean mustBeStatic(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_SHAPE_MUST_BE_STATIC.get();
        try {
            return (boolean) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #mustBeStatic}.
     */
    public final boolean mustBeStatic(
    ) {
        return (boolean) mustBeStatic(
            this.segment
        );
    }
    
    public static void getCenterOfMass(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SHAPE_GET_CENTER_OF_MASS.get();
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
     * Typed method of {@link #getCenterOfMass}.
     */
    public final void getCenterOfMass(
        Vec3 result
    ) {
        getCenterOfMass(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getLocalBounds(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SHAPE_GET_LOCAL_BOUNDS.get();
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
     * Typed method of {@link #getLocalBounds}.
     */
    public final void getLocalBounds(
        AABox result
    ) {
        getLocalBounds(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static int getSubShapeIDBitsRecursive(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_SHAPE_GET_SUB_SHAPE_IDBITS_RECURSIVE.get();
        try {
            return (int) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSubShapeIDBitsRecursive}.
     */
    public final int getSubShapeIDBitsRecursive(
    ) {
        return (int) getSubShapeIDBitsRecursive(
            this.segment
        );
    }
    
    public static void getWorldSpaceBounds(
        MemorySegment shape, 
        MemorySegment centerOfMassTransform, 
        MemorySegment scale, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SHAPE_GET_WORLD_SPACE_BOUNDS.get();
        try {
            method.invokeExact(
                shape, 
                centerOfMassTransform, 
                scale, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldSpaceBounds}.
     */
    public final void getWorldSpaceBounds(
        Mat4 centerOfMassTransform, 
        Vec3 scale, 
        AABox result
    ) {
        getWorldSpaceBounds(
            this.segment, 
            centerOfMassTransform.memorySegment(), 
            scale.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static float getInnerRadius(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_SHAPE_GET_INNER_RADIUS.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInnerRadius}.
     */
    public final float getInnerRadius(
    ) {
        return (float) getInnerRadius(
            this.segment
        );
    }
    
    public static void getMassProperties(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SHAPE_GET_MASS_PROPERTIES.get();
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
     * Typed method of {@link #getMassProperties}.
     */
    public final void getMassProperties(
        MassProperties result
    ) {
        getMassProperties(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static MemorySegment getLeafShape(
        MemorySegment shape, 
        int subShapeID, 
        MemorySegment remainder
    ) {
        MethodHandle method = JPH_SHAPE_GET_LEAF_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                shape, 
                subShapeID, 
                remainder
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLeafShape}.
     */
    public final @Nullable Shape getLeafShape(
        int subShapeID, 
        NativeIntArray remainder
    ) {
        MemorySegment segment = getLeafShape(
            this.segment, 
            subShapeID, 
            remainder.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Shape(segment);
    }
    
    public static MemorySegment getMaterial(
        MemorySegment shape, 
        int subShapeID
    ) {
        MethodHandle method = JPH_SHAPE_GET_MATERIAL.get();
        try {
            return (MemorySegment) method.invokeExact(
                shape, 
                subShapeID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaterial}.
     */
    public final @Nullable PhysicsMaterial getMaterial(
        int subShapeID
    ) {
        MemorySegment segment = getMaterial(
            this.segment, 
            subShapeID
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new PhysicsMaterial(segment);
    }
    
    public static void getSurfaceNormal(
        MemorySegment shape, 
        int subShapeID, 
        MemorySegment localPosition, 
        MemorySegment normal
    ) {
        MethodHandle method = JPH_SHAPE_GET_SURFACE_NORMAL.get();
        try {
            method.invokeExact(
                shape, 
                subShapeID, 
                localPosition, 
                normal
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSurfaceNormal}.
     */
    public final void getSurfaceNormal(
        int subShapeID, 
        Vec3 localPosition, 
        Vec3 normal
    ) {
        getSurfaceNormal(
            this.segment, 
            subShapeID, 
            localPosition.memorySegment(), 
            normal.memorySegment()
        );
    }
    
    public static void getSupportingFace(
        MemorySegment shape, 
        int subShapeID, 
        MemorySegment direction, 
        MemorySegment scale, 
        MemorySegment centerOfMassTransform, 
        MemorySegment outVertices
    ) {
        MethodHandle method = JPH_SHAPE_GET_SUPPORTING_FACE.get();
        try {
            method.invokeExact(
                shape, 
                subShapeID, 
                direction, 
                scale, 
                centerOfMassTransform, 
                outVertices
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSupportingFace}.
     */
    public final void getSupportingFace(
        int subShapeID, 
        Vec3 direction, 
        Vec3 scale, 
        Mat4 centerOfMassTransform, 
        SupportingFace outVertices
    ) {
        getSupportingFace(
            this.segment, 
            subShapeID, 
            direction.memorySegment(), 
            scale.memorySegment(), 
            centerOfMassTransform.memorySegment(), 
            outVertices.memorySegment()
        );
    }
    
    public static float getVolume(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_SHAPE_GET_VOLUME.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getVolume}.
     */
    public final float getVolume(
    ) {
        return (float) getVolume(
            this.segment
        );
    }
    
    public static boolean isValidScale(
        MemorySegment shape, 
        MemorySegment scale
    ) {
        MethodHandle method = JPH_SHAPE_IS_VALID_SCALE.get();
        try {
            return (boolean) method.invokeExact(
                shape, 
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isValidScale}.
     */
    public final boolean isValidScale(
        Vec3 scale
    ) {
        return (boolean) isValidScale(
            this.segment, 
            scale.memorySegment()
        );
    }
    
    public static void makeScaleValid(
        MemorySegment shape, 
        MemorySegment scale, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SHAPE_MAKE_SCALE_VALID.get();
        try {
            method.invokeExact(
                shape, 
                scale, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #makeScaleValid}.
     */
    public final void makeScaleValid(
        Vec3 scale, 
        Vec3 result
    ) {
        makeScaleValid(
            this.segment, 
            scale.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static MemorySegment scaleShape(
        MemorySegment shape, 
        MemorySegment scale
    ) {
        MethodHandle method = JPH_SHAPE_SCALE_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                shape, 
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #scaleShape}.
     */
    public final @Nullable Shape scaleShape(
        Vec3 scale
    ) {
        MemorySegment segment = scaleShape(
            this.segment, 
            scale.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Shape(segment);
    }
    
    public static boolean castRay(
        MemorySegment shape, 
        MemorySegment origin, 
        MemorySegment direction, 
        MemorySegment hit
    ) {
        MethodHandle method = JPH_SHAPE_CAST_RAY.get();
        try {
            return (boolean) method.invokeExact(
                shape, 
                origin, 
                direction, 
                hit
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
        RayCastResult hit
    ) {
        return (boolean) castRay(
            this.segment, 
            origin.memorySegment(), 
            direction.memorySegment(), 
            hit.memorySegment()
        );
    }
    
    public static boolean castRay2(
        MemorySegment shape, 
        MemorySegment origin, 
        MemorySegment direction, 
        MemorySegment rayCastSettings, 
        int collectorType, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_SHAPE_CAST_RAY2.get();
        try {
            return (boolean) method.invokeExact(
                shape, 
                origin, 
                direction, 
                rayCastSettings, 
                collectorType, 
                callback, 
                userData, 
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
        int collectorType, 
        CastRayResultCallback callback, 
        MemorySegment userData, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) castRay2(
            this.segment, 
            origin.memorySegment(), 
            direction.memorySegment(), 
            rayCastSettings.memorySegment(), 
            collectorType, 
            callback.memorySegment(), 
            userData, 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean collidePoint(
        MemorySegment shape, 
        MemorySegment point, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_SHAPE_COLLIDE_POINT.get();
        try {
            return (boolean) method.invokeExact(
                shape, 
                point, 
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
        ShapeFilter shapeFilter
    ) {
        return (boolean) collidePoint(
            this.segment, 
            point.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean collidePoint2(
        MemorySegment shape, 
        MemorySegment point, 
        int collectorType, 
        MemorySegment callback, 
        MemorySegment userData, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_SHAPE_COLLIDE_POINT2.get();
        try {
            return (boolean) method.invokeExact(
                shape, 
                point, 
                collectorType, 
                callback, 
                userData, 
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
        ShapeFilter shapeFilter
    ) {
        return (boolean) collidePoint2(
            this.segment, 
            point.memorySegment(), 
            collectorType, 
            callback.memorySegment(), 
            userData, 
            shapeFilter.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}