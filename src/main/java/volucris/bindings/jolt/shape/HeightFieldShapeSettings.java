/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class HeightFieldShapeSettings extends ShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_HeightFieldShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_DetermineMinAndMaxSample", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR = downcallHandle("JPH_HeightFieldShapeSettings_CalculateBitsPerSampleForError", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE = downcallHandleVoid("JPH_HeightFieldShapeSettings_GetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT = downcallHandle("JPH_HeightFieldShapeSettings_GetSampleCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetSampleCount", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShapeSettings_GetMinHeightValue", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMinHeightValue", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShapeSettings_GetMaxHeightValue", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetMaxHeightValue", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE = downcallHandle("JPH_HeightFieldShapeSettings_GetBlockSize", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetBlockSize", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE = downcallHandle("JPH_HeightFieldShapeSettings_GetBitsPerSample", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetBitsPerSample", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandle("JPH_HeightFieldShapeSettings_GetActiveEdgeCosThresholdAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandleVoid("JPH_HeightFieldShapeSettings_SetActiveEdgeCosThresholdAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_HeightFieldShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public HeightFieldShapeSettings(
        NativeFloatArray samples, 
        Vec3 offset, 
        Vec3 scale, 
        int sampleCount, 
        NativeByteArray materialIndices
    ) {
        this(
            Arena.ofAuto(),
            samples, 
            offset, 
            scale, 
            sampleCount, 
            materialIndices
        );
    }
    
    public HeightFieldShapeSettings(
        Arena arena,
        NativeFloatArray samples, 
        Vec3 offset, 
        Vec3 scale, 
        int sampleCount, 
        NativeByteArray materialIndices
    ) {
         MemorySegment segment = create(
            samples.memorySegment(), 
            offset.memorySegment(), 
            scale.memorySegment(), 
            sampleCount, 
            materialIndices.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public HeightFieldShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment samples, 
        MemorySegment offset, 
        MemorySegment scale, 
        int sampleCount, 
        MemorySegment materialIndices
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                samples, 
                offset, 
                scale, 
                sampleCount, 
                materialIndices
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void determineMinAndMaxSample(
        MemorySegment settings, 
        MemorySegment pOutMinValue, 
        MemorySegment pOutMaxValue, 
        MemorySegment pOutQuantizationScale
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_DETERMINE_MIN_AND_MAX_SAMPLE.get();
        try {
            method.invokeExact(
                settings, 
                pOutMinValue, 
                pOutMaxValue, 
                pOutQuantizationScale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #determineMinAndMaxSample}.
     */
    public final void determineMinAndMaxSample(
        NativeFloatArray pOutMinValue, 
        NativeFloatArray pOutMaxValue, 
        NativeFloatArray pOutQuantizationScale
    ) {
        determineMinAndMaxSample(
            this.segment, 
            pOutMinValue.memorySegment(), 
            pOutMaxValue.memorySegment(), 
            pOutQuantizationScale.memorySegment()
        );
    }
    
    public static int calculateBitsPerSampleForError(
        MemorySegment settings, 
        float maxError
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CALCULATE_BITS_PER_SAMPLE_FOR_ERROR.get();
        try {
            return (int) method.invokeExact(
                settings, 
                maxError
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #calculateBitsPerSampleForError}.
     */
    public final int calculateBitsPerSampleForError(
        float maxError
    ) {
        return (int) calculateBitsPerSampleForError(
            this.segment, 
            maxError
        );
    }
    
    public static void getOffset(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_OFFSET.get();
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
     * Typed method of {@link #getOffset}.
     */
    public final void getOffset(
        HeightFieldShapeSettings shape, 
        Vec3 result
    ) {
        getOffset(
            shape.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void setOffset(
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_OFFSET.get();
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
     * Typed method of {@link #setOffset}.
     */
    public final void setOffset(
        Vec3 value
    ) {
        setOffset(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static void getScale(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SCALE.get();
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
     * Typed method of {@link #getScale}.
     */
    public final void getScale(
        HeightFieldShapeSettings shape, 
        Vec3 result
    ) {
        getScale(
            shape.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void setScale(
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SCALE.get();
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
     * Typed method of {@link #setScale}.
     */
    public final void setScale(
        Vec3 value
    ) {
        setScale(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static int getSampleCount(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_SAMPLE_COUNT.get();
        try {
            return (int) method.invokeExact(
                settings
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
    
    public static void setSampleCount(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_SAMPLE_COUNT.get();
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
     * Typed method of {@link #setSampleCount}.
     */
    public final void setSampleCount(
        int value
    ) {
        setSampleCount(
            this.segment, 
            value
        );
    }
    
    public static float getMinHeightValue(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MIN_HEIGHT_VALUE.get();
        try {
            return (float) method.invokeExact(
                settings
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
    
    public static void setMinHeightValue(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MIN_HEIGHT_VALUE.get();
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
     * Typed method of {@link #setMinHeightValue}.
     */
    public final void setMinHeightValue(
        float value
    ) {
        setMinHeightValue(
            this.segment, 
            value
        );
    }
    
    public static float getMaxHeightValue(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_MAX_HEIGHT_VALUE.get();
        try {
            return (float) method.invokeExact(
                settings
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
    
    public static void setMaxHeightValue(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_MAX_HEIGHT_VALUE.get();
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
     * Typed method of {@link #setMaxHeightValue}.
     */
    public final void setMaxHeightValue(
        float value
    ) {
        setMaxHeightValue(
            this.segment, 
            value
        );
    }
    
    public static int getBlockSize(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BLOCK_SIZE.get();
        try {
            return (int) method.invokeExact(
                settings
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
    
    public static void setBlockSize(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BLOCK_SIZE.get();
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
     * Typed method of {@link #setBlockSize}.
     */
    public final void setBlockSize(
        int value
    ) {
        setBlockSize(
            this.segment, 
            value
        );
    }
    
    public static int getBitsPerSample(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_BITS_PER_SAMPLE.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBitsPerSample}.
     */
    public final int getBitsPerSample(
    ) {
        return (int) getBitsPerSample(
            this.segment
        );
    }
    
    public static void setBitsPerSample(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_BITS_PER_SAMPLE.get();
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
     * Typed method of {@link #setBitsPerSample}.
     */
    public final void setBitsPerSample(
        int value
    ) {
        setBitsPerSample(
            this.segment, 
            value
        );
    }
    
    public static float getActiveEdgeCosThresholdAngle(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE.get();
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
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE.get();
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
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable HeightFieldShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new HeightFieldShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}