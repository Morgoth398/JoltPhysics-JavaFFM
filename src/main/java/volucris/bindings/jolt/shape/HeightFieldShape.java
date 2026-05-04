/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.PhysicsMaterial;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class HeightFieldShape extends Shape {

    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT = downcallHandle("JPH_HeightFieldShape_GetSampleCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE = downcallHandle("JPH_HeightFieldShape_GetBlockSize", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL = downcallHandle("JPH_HeightFieldShape_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_HEIGHT_FIELD_SHAPE_GET_POSITION = downcallHandleVoid("JPH_HeightFieldShape_GetPosition", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION = downcallHandle("JPH_HeightFieldShape_IsNoCollision", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE = downcallHandle("JPH_HeightFieldShape_ProjectOntoSurface", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShape_GetMinHeightValue", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShape_GetMaxHeightValue", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public HeightFieldShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static int getSampleCount(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT.get();
        try {
            return (int) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSampleCount}.
     */
    public final int getSampleCount(
    ) {
        return (int) getSampleCount(
            this.segment
        );
    }
    
    public static int getBlockSize(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE.get();
        try {
            return (int) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBlockSize}.
     */
    public final int getBlockSize(
    ) {
        return (int) getBlockSize(
            this.segment
        );
    }
    
    public static MemorySegment getMaterial(
        MemorySegment shape, 
        int x, 
        int y
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL.get();
        try {
            return (MemorySegment) method.invokeExact(
                shape, 
                x, 
                y
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaterial}.
     */
    public final @Nullable PhysicsMaterial getMaterial(
        int x, 
        int y
    ) {
        MemorySegment segment = getMaterial(
            this.segment, 
            x, 
            y
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new PhysicsMaterial(segment);
    }
    
    public static void getPosition(
        MemorySegment shape, 
        int x, 
        int y, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_POSITION.get();
        try {
            method.invokeExact(
                shape, 
                x, 
                y, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPosition}.
     */
    public final void getPosition(
        int x, 
        int y, 
        Vec3 result
    ) {
        getPosition(
            this.segment, 
            x, 
            y, 
            result.memorySegment()
        );
    }
    
    public static boolean isNoCollision(
        MemorySegment shape, 
        int x, 
        int y
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION.get();
        try {
            return (boolean) method.invokeExact(
                shape, 
                x, 
                y
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isNoCollision}.
     */
    public final boolean isNoCollision(
        int x, 
        int y
    ) {
        return (boolean) isNoCollision(
            this.segment, 
            x, 
            y
        );
    }
    
    public static boolean projectOntoSurface(
        MemorySegment shape, 
        MemorySegment localPosition, 
        MemorySegment outSurfacePosition, 
        MemorySegment outSubShapeID
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE.get();
        try {
            return (boolean) method.invokeExact(
                shape, 
                localPosition, 
                outSurfacePosition, 
                outSubShapeID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #projectOntoSurface}.
     */
    public final boolean projectOntoSurface(
        Vec3 localPosition, 
        Vec3 outSurfacePosition, 
        NativeIntArray outSubShapeID
    ) {
        return (boolean) projectOntoSurface(
            this.segment, 
            localPosition.memorySegment(), 
            outSurfacePosition.memorySegment(), 
            outSubShapeID.memorySegment()
        );
    }
    
    public static float getMinHeightValue(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMinHeightValue}.
     */
    public final float getMinHeightValue(
    ) {
        return (float) getMinHeightValue(
            this.segment
        );
    }
    
    public static float getMaxHeightValue(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxHeightValue}.
     */
    public final float getMaxHeightValue(
    ) {
        return (float) getMaxHeightValue(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}