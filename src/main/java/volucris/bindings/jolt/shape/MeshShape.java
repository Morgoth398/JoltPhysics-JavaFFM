/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class MeshShape extends Shape {

    private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA = downcallHandle("JPH_MeshShape_GetTriangleUserData", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public MeshShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static int getTriangleUserData(
        MemorySegment shape, 
        int id
    ) {
        MethodHandle method = JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA.get();
        try {
            return (int) method.invokeExact(
                shape, 
                id
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTriangleUserData}.
     */
    public final int getTriangleUserData(
        int id
    ) {
        return (int) getTriangleUserData(
            this.segment, 
            id
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}