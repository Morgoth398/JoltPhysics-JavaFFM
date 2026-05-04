/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.jolt.math.IndexedTriangle;
import volucris.bindings.jolt.math.Triangle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class MeshShapeSettings extends ShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_CREATE2;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SANITIZE;
    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_MESH_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_MeshShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_MESH_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_MeshShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF = downcallHandle("JPH_MeshShapeSettings_GetMaxTrianglesPerLeaf", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF = downcallHandleVoid("JPH_MeshShapeSettings_SetMaxTrianglesPerLeaf", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandle("JPH_MeshShapeSettings_GetActiveEdgeCosThresholdAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandleVoid("JPH_MeshShapeSettings_SetActiveEdgeCosThresholdAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA = downcallHandle("JPH_MeshShapeSettings_GetPerTriangleUserData", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA = downcallHandleVoid("JPH_MeshShapeSettings_SetPerTriangleUserData", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY = downcallHandle("JPH_MeshShapeSettings_GetBuildQuality", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY = downcallHandleVoid("JPH_MeshShapeSettings_SetBuildQuality", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_MESH_SHAPE_SETTINGS_SANITIZE = downcallHandleVoid("JPH_MeshShapeSettings_Sanitize", UNBOUNDED_ADDRESS);
        JPH_MESH_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_MeshShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public MeshShapeSettings(
        NativeStructArray<Triangle> triangles, 
        int triangleCount
    ) {
        this(
            Arena.ofAuto(),
            triangles, 
            triangleCount
        );
    }
    
    public MeshShapeSettings(
        Arena arena,
        NativeStructArray<Triangle> triangles, 
        int triangleCount
    ) {
         MemorySegment segment = create(
            triangles.memorySegment(), 
            triangleCount
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public MeshShapeSettings(
        NativeStructArray<Vec3> vertices, 
        int verticesCount, 
        NativeStructArray<IndexedTriangle> triangles, 
        int triangleCount
    ) {
        this(
            Arena.ofAuto(),
            vertices, 
            verticesCount, 
            triangles, 
            triangleCount
        );
    }
    
    public MeshShapeSettings(
        Arena arena,
        NativeStructArray<Vec3> vertices, 
        int verticesCount, 
        NativeStructArray<IndexedTriangle> triangles, 
        int triangleCount
    ) {
         MemorySegment segment = create2(
            vertices.memorySegment(), 
            verticesCount, 
            triangles.memorySegment(), 
            triangleCount
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public MeshShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment triangles, 
        int triangleCount
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                triangles, 
                triangleCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment create2(
        MemorySegment vertices, 
        int verticesCount, 
        MemorySegment triangles, 
        int triangleCount
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE2.get();
        try {
            return (MemorySegment) method.invokeExact(
                vertices, 
                verticesCount, 
                triangles, 
                triangleCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getMaxTrianglesPerLeaf(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxTrianglesPerLeaf}.
     */
    public final int getMaxTrianglesPerLeaf(
    ) {
        return (int) getMaxTrianglesPerLeaf(
            this.segment
        );
    }
    
    public static void setMaxTrianglesPerLeaf(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxTrianglesPerLeaf}.
     */
    public final void setMaxTrianglesPerLeaf(
        int value
    ) {
        setMaxTrianglesPerLeaf(
            this.segment, 
            value
        );
    }
    
    public static float getActiveEdgeCosThresholdAngle(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getActiveEdgeCosThresholdAngle}.
     */
    public final float getActiveEdgeCosThresholdAngle(
    ) {
        return (float) getActiveEdgeCosThresholdAngle(
            this.segment
        );
    }
    
    public static void setActiveEdgeCosThresholdAngle(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setActiveEdgeCosThresholdAngle}.
     */
    public final void setActiveEdgeCosThresholdAngle(
        float value
    ) {
        setActiveEdgeCosThresholdAngle(
            this.segment, 
            value
        );
    }
    
    public static boolean getPerTriangleUserData(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA.get();
        try {
            return (boolean) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPerTriangleUserData}.
     */
    public final boolean getPerTriangleUserData(
    ) {
        return (boolean) getPerTriangleUserData(
            this.segment
        );
    }
    
    public static void setPerTriangleUserData(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPerTriangleUserData}.
     */
    public final void setPerTriangleUserData(
        boolean value
    ) {
        setPerTriangleUserData(
            this.segment, 
            value
        );
    }
    
    public static int getBuildQuality(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBuildQuality}.
     */
    public final int getBuildQuality(
    ) {
        return (int) getBuildQuality(
            this.segment
        );
    }
    
    public static void setBuildQuality(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setBuildQuality}.
     */
    public final void setBuildQuality(
        int value
    ) {
        setBuildQuality(
            this.segment, 
            value
        );
    }
    
    public static void sanitize(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SANITIZE.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #sanitize}.
     */
    public final void sanitize(
    ) {
        sanitize(
            this.segment
        );
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createShape}.
     */
    public final @Nullable MeshShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new MeshShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}