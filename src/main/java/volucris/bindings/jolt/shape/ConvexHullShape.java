/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class ConvexHullShape extends ConvexShape {

    private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS;
    private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_POINT;
    private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES;
    private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE;
    private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS = downcallHandle("JPH_ConvexHullShape_GetNumPoints", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONVEX_HULL_SHAPE_GET_POINT = downcallHandleVoid("JPH_ConvexHullShape_GetPoint", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES = downcallHandle("JPH_ConvexHullShape_GetNumFaces", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE = downcallHandle("JPH_ConvexHullShape_GetNumVerticesInFace", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES = downcallHandle("JPH_ConvexHullShape_GetFaceVertices", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public ConvexHullShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static int getNumPoints(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS.get();
        try {
            return (int) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumPoints}.
     */
    public final int getNumPoints(
    ) {
        return (int) getNumPoints(
            this.segment
        );
    }
    
    public static void getPoint(
        MemorySegment shape, 
        int index, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_POINT.get();
        try {
            method.invokeExact(
                shape, 
                index, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPoint}.
     */
    public final void getPoint(
        int index, 
        Vec3 result
    ) {
        getPoint(
            this.segment, 
            index, 
            result.memorySegment()
        );
    }
    
    public static int getNumFaces(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES.get();
        try {
            return (int) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumFaces}.
     */
    public final int getNumFaces(
    ) {
        return (int) getNumFaces(
            this.segment
        );
    }
    
    public static int getNumVerticesInFace(
        MemorySegment shape, 
        int faceIndex
    ) {
        MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE.get();
        try {
            return (int) method.invokeExact(
                shape, 
                faceIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumVerticesInFace}.
     */
    public final int getNumVerticesInFace(
        int faceIndex
    ) {
        return (int) getNumVerticesInFace(
            this.segment, 
            faceIndex
        );
    }
    
    public static int getFaceVertices(
        MemorySegment shape, 
        int faceIndex, 
        int maxVertices, 
        MemorySegment vertices
    ) {
        MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES.get();
        try {
            return (int) method.invokeExact(
                shape, 
                faceIndex, 
                maxVertices, 
                vertices
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getFaceVertices}.
     */
    public final int getFaceVertices(
        int faceIndex, 
        int maxVertices, 
        NativeIntArray vertices
    ) {
        return (int) getFaceVertices(
            this.segment, 
            faceIndex, 
            maxVertices, 
            vertices.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}