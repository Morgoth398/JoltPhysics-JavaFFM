/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.PhysicsMaterial;
import volucris.bindings.jolt.math.Plane;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class PlaneShape extends Shape {

    private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_GET_PLANE;
    private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_GET_HALF_EXTENT;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_PLANE_SHAPE_CREATE = downcallHandle("JPH_PlaneShape_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_PLANE_SHAPE_GET_PLANE = downcallHandleVoid("JPH_PlaneShape_GetPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PLANE_SHAPE_GET_HALF_EXTENT = downcallHandle("JPH_PlaneShape_GetHalfExtent", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public PlaneShape(
        Plane plane, 
        PhysicsMaterial material, 
        float halfExtent
    ) {
        this(
            Arena.ofAuto(),
            plane, 
            material, 
            halfExtent
        );
    }
    
    public PlaneShape(
        Arena arena,
        Plane plane, 
        PhysicsMaterial material, 
        float halfExtent
    ) {
         MemorySegment segment = create(
            plane.memorySegment(), 
            material.memorySegment(), 
            halfExtent
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public PlaneShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment plane, 
        MemorySegment material, 
        float halfExtent
    ) {
        MethodHandle method = JPH_PLANE_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                plane, 
                material, 
                halfExtent
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void getPlane(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_PLANE_SHAPE_GET_PLANE.get();
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
     * Typed method of {@link #getPlane}.
     */
    public final void getPlane(
        Plane result
    ) {
        getPlane(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static float getHalfExtent(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_PLANE_SHAPE_GET_HALF_EXTENT.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getHalfExtent}.
     */
    public final float getHalfExtent(
    ) {
        return (float) getHalfExtent(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}