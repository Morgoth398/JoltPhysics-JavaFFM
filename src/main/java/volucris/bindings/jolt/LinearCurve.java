/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.jolt.math.Point;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class LinearCurve {

    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_CLEAR;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_RESERVE;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_ADD_POINT;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_SORT;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_MIN_X;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_MAX_X;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_VALUE;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_POINT_COUNT;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_POINT;
    private static final LazyConstant<MethodHandle> JPH_LINEAR_CURVE_GET_POINTS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_LINEAR_CURVE_CREATE = downcallHandle("JPH_LinearCurve_Create", UNBOUNDED_ADDRESS);
        JPH_LINEAR_CURVE_DESTROY = downcallHandleVoid("JPH_LinearCurve_Destroy", UNBOUNDED_ADDRESS);
        JPH_LINEAR_CURVE_CLEAR = downcallHandleVoid("JPH_LinearCurve_Clear", UNBOUNDED_ADDRESS);
        JPH_LINEAR_CURVE_RESERVE = downcallHandleVoid("JPH_LinearCurve_Reserve", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_LINEAR_CURVE_ADD_POINT = downcallHandleVoid("JPH_LinearCurve_AddPoint", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        JPH_LINEAR_CURVE_SORT = downcallHandleVoid("JPH_LinearCurve_Sort", UNBOUNDED_ADDRESS);
        JPH_LINEAR_CURVE_GET_MIN_X = downcallHandle("JPH_LinearCurve_GetMinX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_LINEAR_CURVE_GET_MAX_X = downcallHandle("JPH_LinearCurve_GetMaxX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_LINEAR_CURVE_GET_VALUE = downcallHandle("JPH_LinearCurve_GetValue", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_LINEAR_CURVE_GET_POINT_COUNT = downcallHandle("JPH_LinearCurve_GetPointCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_LINEAR_CURVE_GET_POINT = downcallHandleVoid("JPH_LinearCurve_GetPoint", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_LINEAR_CURVE_GET_POINTS = downcallHandleVoid("JPH_LinearCurve_GetPoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public LinearCurve() {
        this(Arena.ofAuto());
    }
    
    public LinearCurve(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public LinearCurve(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_LINEAR_CURVE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment curve
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_DESTROY.get();
        try {
            method.invokeExact(
                curve
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void clear(
        MemorySegment curve
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_CLEAR.get();
        try {
            method.invokeExact(
                curve
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #clear}.
     */
    public final void clear(
    ) {
        clear(
            this.segment
        );
    }
    
    public static void reserve(
        MemorySegment curve, 
        int numPoints
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_RESERVE.get();
        try {
            method.invokeExact(
                curve, 
                numPoints
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #reserve}.
     */
    public final void reserve(
        int numPoints
    ) {
        reserve(
            this.segment, 
            numPoints
        );
    }
    
    public static void addPoint(
        MemorySegment curve, 
        float x, 
        float y
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_ADD_POINT.get();
        try {
            method.invokeExact(
                curve, 
                x, 
                y
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addPoint}.
     */
    public final void addPoint(
        float x, 
        float y
    ) {
        addPoint(
            this.segment, 
            x, 
            y
        );
    }
    
    public static void sort(
        MemorySegment curve
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_SORT.get();
        try {
            method.invokeExact(
                curve
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #sort}.
     */
    public final void sort(
    ) {
        sort(
            this.segment
        );
    }
    
    public static float getMinX(
        MemorySegment curve
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_GET_MIN_X.get();
        try {
            return (float) method.invokeExact(
                curve
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMinX}.
     */
    public final float getMinX(
    ) {
        return (float) getMinX(
            this.segment
        );
    }
    
    public static float getMaxX(
        MemorySegment curve
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_GET_MAX_X.get();
        try {
            return (float) method.invokeExact(
                curve
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxX}.
     */
    public final float getMaxX(
    ) {
        return (float) getMaxX(
            this.segment
        );
    }
    
    public static float getValue(
        MemorySegment curve, 
        float x
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_GET_VALUE.get();
        try {
            return (float) method.invokeExact(
                curve, 
                x
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getValue}.
     */
    public final float getValue(
        float x
    ) {
        return (float) getValue(
            this.segment, 
            x
        );
    }
    
    public static int getPointCount(
        MemorySegment curve
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_GET_POINT_COUNT.get();
        try {
            return (int) method.invokeExact(
                curve
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
    
    public static void getPoint(
        MemorySegment curve, 
        int index, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_GET_POINT.get();
        try {
            method.invokeExact(
                curve, 
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
        Point result
    ) {
        getPoint(
            this.segment, 
            index, 
            result.memorySegment()
        );
    }
    
    public static void getPoints(
        MemorySegment curve, 
        MemorySegment points, 
        MemorySegment count
    ) {
        MethodHandle method = JPH_LINEAR_CURVE_GET_POINTS.get();
        try {
            method.invokeExact(
                curve, 
                points, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPoints}.
     */
    public final void getPoints(
        NativeStructArray<Point> points, 
        NativeIntArray count
    ) {
        getPoints(
            this.segment, 
            points.memorySegment(), 
            count.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}