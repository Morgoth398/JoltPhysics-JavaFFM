/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class SoftBodySharedSettings {

    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ADD_VERTEX;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ADD_VERTICES;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_REMOVE_VERTEX;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTEX_COUNT;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTEX;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACE;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACES;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_REMOVE_FACE;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACE_COUNT;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACE;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_CREATE_CONSTRAINTS;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SOFT_BODY_SHARED_SETTINGS_CREATE = downcallHandle("JPH_SoftBodySharedSettings_Create", UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_SHARED_SETTINGS_DESTROY = downcallHandleVoid("JPH_SoftBodySharedSettings_Destroy", UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_SHARED_SETTINGS_ADD_VERTEX = downcallHandleVoid("JPH_SoftBodySharedSettings_AddVertex", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_SHARED_SETTINGS_ADD_VERTICES = downcallHandleVoid("JPH_SoftBodySharedSettings_AddVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SOFT_BODY_SHARED_SETTINGS_REMOVE_VERTEX = downcallHandle("JPH_SoftBodySharedSettings_RemoveVertex", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTEX_COUNT = downcallHandle("JPH_SoftBodySharedSettings_GetVertexCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTEX = downcallHandle("JPH_SoftBodySharedSettings_GetVertex", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACE = downcallHandleVoid("JPH_SoftBodySharedSettings_AddFace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACES = downcallHandleVoid("JPH_SoftBodySharedSettings_AddFaces", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SOFT_BODY_SHARED_SETTINGS_REMOVE_FACE = downcallHandle("JPH_SoftBodySharedSettings_RemoveFace", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACE_COUNT = downcallHandle("JPH_SoftBodySharedSettings_GetFaceCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACE = downcallHandle("JPH_SoftBodySharedSettings_GetFace", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_SHARED_SETTINGS_CREATE_CONSTRAINTS = downcallHandleVoid("JPH_SoftBodySharedSettings_CreateConstraints", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT);
        JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE = downcallHandleVoid("JPH_SoftBodySharedSettings_Optimize", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public SoftBodySharedSettings() {
        this(Arena.ofAuto());
    }
    
    public SoftBodySharedSettings(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public SoftBodySharedSettings(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_DESTROY.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void addVertex(
        MemorySegment settings, 
        MemorySegment vertex
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ADD_VERTEX.get();
        try {
            method.invokeExact(
                settings, 
                vertex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addVertex}.
     */
    public final void addVertex(
        SoftVertex vertex
    ) {
        addVertex(
            this.segment, 
            vertex.memorySegment()
        );
    }
    
    public static void addVertices(
        MemorySegment settings, 
        MemorySegment vertices, 
        int count
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ADD_VERTICES.get();
        try {
            method.invokeExact(
                settings, 
                vertices, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addVertices}.
     */
    public final void addVertices(
        SoftVertex vertices, 
        int count
    ) {
        addVertices(
            this.segment, 
            vertices.memorySegment(), 
            count
        );
    }
    
    public static boolean removeVertex(
        MemorySegment settings, 
        int index
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_REMOVE_VERTEX.get();
        try {
            return (boolean) method.invokeExact(
                settings, 
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeVertex}.
     */
    public final boolean removeVertex(
        int index
    ) {
        return (boolean) removeVertex(
            this.segment, 
            index
        );
    }
    
    public static int getVertexCount(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTEX_COUNT.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getVertexCount}.
     */
    public final int getVertexCount(
    ) {
        return (int) getVertexCount(
            this.segment
        );
    }
    
    public static boolean getVertex(
        MemorySegment settings, 
        int index, 
        MemorySegment outVertex
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_VERTEX.get();
        try {
            return (boolean) method.invokeExact(
                settings, 
                index, 
                outVertex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getVertex}.
     */
    public final boolean getVertex(
        int index, 
        SoftVertex outVertex
    ) {
        return (boolean) getVertex(
            this.segment, 
            index, 
            outVertex.memorySegment()
        );
    }
    
    public static void addFace(
        MemorySegment settings, 
        MemorySegment face
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACE.get();
        try {
            method.invokeExact(
                settings, 
                face
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addFace}.
     */
    public final void addFace(
        SoftFace face
    ) {
        addFace(
            this.segment, 
            face.memorySegment()
        );
    }
    
    public static void addFaces(
        MemorySegment settings, 
        MemorySegment faces, 
        int count
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_ADD_FACES.get();
        try {
            method.invokeExact(
                settings, 
                faces, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addFaces}.
     */
    public final void addFaces(
        SoftFace faces, 
        int count
    ) {
        addFaces(
            this.segment, 
            faces.memorySegment(), 
            count
        );
    }
    
    public static boolean removeFace(
        MemorySegment settings, 
        int index
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_REMOVE_FACE.get();
        try {
            return (boolean) method.invokeExact(
                settings, 
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeFace}.
     */
    public final boolean removeFace(
        int index
    ) {
        return (boolean) removeFace(
            this.segment, 
            index
        );
    }
    
    public static int getFaceCount(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACE_COUNT.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getFaceCount}.
     */
    public final int getFaceCount(
    ) {
        return (int) getFaceCount(
            this.segment
        );
    }
    
    public static boolean getFace(
        MemorySegment settings, 
        int index, 
        MemorySegment outFace
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_GET_FACE.get();
        try {
            return (boolean) method.invokeExact(
                settings, 
                index, 
                outFace
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getFace}.
     */
    public final boolean getFace(
        int index, 
        SoftFace outFace
    ) {
        return (boolean) getFace(
            this.segment, 
            index, 
            outFace.memorySegment()
        );
    }
    
    public static void createConstraints(
        MemorySegment settings, 
        float compliance, 
        int bendType
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_CREATE_CONSTRAINTS.get();
        try {
            method.invokeExact(
                settings, 
                compliance, 
                bendType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createConstraints}.
     */
    public final void createConstraints(
        float compliance, 
        int bendType
    ) {
        createConstraints(
            this.segment, 
            compliance, 
            bendType
        );
    }
    
    public static void optimize(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_SHARED_SETTINGS_OPTIMIZE.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #optimize}.
     */
    public final void optimize(
    ) {
        optimize(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}