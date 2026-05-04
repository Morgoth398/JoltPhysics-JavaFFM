/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class Vec3
		implements Struct<Vec3> {

    private static final LazyConstant<MethodHandle> JPH_VEC3_AXIS_X;
    private static final LazyConstant<MethodHandle> JPH_VEC3_AXIS_Y;
    private static final LazyConstant<MethodHandle> JPH_VEC3_AXIS_Z;
    private static final LazyConstant<MethodHandle> JPH_VEC3_IS_CLOSE;
    private static final LazyConstant<MethodHandle> JPH_VEC3_IS_NEAR_ZERO;
    private static final LazyConstant<MethodHandle> JPH_VEC3_IS_NORMALIZED;
    private static final LazyConstant<MethodHandle> JPH_VEC3_IS_NA_N;
    private static final LazyConstant<MethodHandle> JPH_VEC3_NEGATE;
    private static final LazyConstant<MethodHandle> JPH_VEC3_NORMALIZED;
    private static final LazyConstant<MethodHandle> JPH_VEC3_CROSS;
    private static final LazyConstant<MethodHandle> JPH_VEC3_ABS;
    private static final LazyConstant<MethodHandle> JPH_VEC3_LENGTH;
    private static final LazyConstant<MethodHandle> JPH_VEC3_LENGTH_SQUARED;
    private static final LazyConstant<MethodHandle> JPH_VEC3_DOT_PRODUCT;
    private static final LazyConstant<MethodHandle> JPH_VEC3_NORMALIZE;
    private static final LazyConstant<MethodHandle> JPH_VEC3_ADD;
    private static final LazyConstant<MethodHandle> JPH_VEC3_SUBTRACT;
    private static final LazyConstant<MethodHandle> JPH_VEC3_MULTIPLY;
    private static final LazyConstant<MethodHandle> JPH_VEC3_MULTIPLY_SCALAR;
    private static final LazyConstant<MethodHandle> JPH_VEC3_MULTIPLY_MATRIX;
    private static final LazyConstant<MethodHandle> JPH_VEC3_DIVIDE;
    private static final LazyConstant<MethodHandle> JPH_VEC3_DIVIDE_SCALAR;
    private static final LazyConstant<MethodHandle> JPH_VEC3_GET_NORMALIZED_PERPENDICULAR;

    public static final StructLayout LAYOUT;

    public static final VarHandle X;
    public static final VarHandle Y;
    public static final VarHandle Z;

    public static final long X_OFFSET;
    public static final long Y_OFFSET;
    public static final long Z_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEC3_AXIS_X = downcallHandleVoid("JPH_Vec3_AxisX", UNBOUNDED_ADDRESS);
        JPH_VEC3_AXIS_Y = downcallHandleVoid("JPH_Vec3_AxisY", UNBOUNDED_ADDRESS);
        JPH_VEC3_AXIS_Z = downcallHandleVoid("JPH_Vec3_AxisZ", UNBOUNDED_ADDRESS);
        JPH_VEC3_IS_CLOSE = downcallHandle("JPH_Vec3_IsClose", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEC3_IS_NEAR_ZERO = downcallHandle("JPH_Vec3_IsNearZero", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEC3_IS_NORMALIZED = downcallHandle("JPH_Vec3_IsNormalized", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEC3_IS_NA_N = downcallHandle("JPH_Vec3_IsNaN", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_VEC3_NEGATE = downcallHandleVoid("JPH_Vec3_Negate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_NORMALIZED = downcallHandleVoid("JPH_Vec3_Normalized", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_CROSS = downcallHandleVoid("JPH_Vec3_Cross", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_ABS = downcallHandleVoid("JPH_Vec3_Abs", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_LENGTH = downcallHandle("JPH_Vec3_Length", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEC3_LENGTH_SQUARED = downcallHandle("JPH_Vec3_LengthSquared", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEC3_DOT_PRODUCT = downcallHandleVoid("JPH_Vec3_DotProduct", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_NORMALIZE = downcallHandleVoid("JPH_Vec3_Normalize", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_ADD = downcallHandleVoid("JPH_Vec3_Add", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_SUBTRACT = downcallHandleVoid("JPH_Vec3_Subtract", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_MULTIPLY = downcallHandleVoid("JPH_Vec3_Multiply", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_MULTIPLY_SCALAR = downcallHandleVoid("JPH_Vec3_MultiplyScalar", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEC3_MULTIPLY_MATRIX = downcallHandleVoid("JPH_Vec3_MultiplyMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_DIVIDE = downcallHandleVoid("JPH_Vec3_Divide", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEC3_DIVIDE_SCALAR = downcallHandleVoid("JPH_Vec3_DivideScalar", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEC3_GET_NORMALIZED_PERPENDICULAR = downcallHandleVoid("JPH_Vec3_GetNormalizedPerpendicular", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("x"),
            JAVA_FLOAT.withName("y"),
            JAVA_FLOAT.withName("z")
        ).withName("JPH_Vec3").withByteAlignment(4);
        
        X = LAYOUT.varHandle(PathElement.groupElement("x"));
        Y = LAYOUT.varHandle(PathElement.groupElement("y"));
        Z = LAYOUT.varHandle(PathElement.groupElement("z"));
        
        X_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
        Y_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
        Z_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("z"));
        //@formatter:on
    }

    public Vec3() {
        this(Arena.ofAuto());
    }
    
    public Vec3(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Vec3(MemorySegment segment) {
        this.segment = segment;
    
    }

    public static void axisX(
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_AXIS_X.get();
        try {
            method.invokeExact(
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #axisX}.
     */
    public static void axisX(
        Vec3 result
    ) {
        axisX(
            result.memorySegment()
        );
    }
    
    public static void axisY(
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_AXIS_Y.get();
        try {
            method.invokeExact(
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #axisY}.
     */
    public static void axisY(
        Vec3 result
    ) {
        axisY(
            result.memorySegment()
        );
    }
    
    public static void axisZ(
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_AXIS_Z.get();
        try {
            method.invokeExact(
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #axisZ}.
     */
    public static void axisZ(
        Vec3 result
    ) {
        axisZ(
            result.memorySegment()
        );
    }
    
    public static boolean isClose(
        MemorySegment v1, 
        MemorySegment v2, 
        float maxDistSq
    ) {
        MethodHandle method = JPH_VEC3_IS_CLOSE.get();
        try {
            return (boolean) method.invokeExact(
                v1, 
                v2, 
                maxDistSq
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isClose}.
     */
    public static boolean isClose(
        Vec3 v1, 
        Vec3 v2, 
        float maxDistSq
    ) {
        return (boolean) isClose(
            v1.memorySegment(), 
            v2.memorySegment(), 
            maxDistSq
        );
    }
    
    public static boolean isNearZero(
        MemorySegment v, 
        float maxDistSq
    ) {
        MethodHandle method = JPH_VEC3_IS_NEAR_ZERO.get();
        try {
            return (boolean) method.invokeExact(
                v, 
                maxDistSq
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isNearZero}.
     */
    public static boolean isNearZero(
        Vec3 v, 
        float maxDistSq
    ) {
        return (boolean) isNearZero(
            v.memorySegment(), 
            maxDistSq
        );
    }
    
    public static boolean isNormalized(
        MemorySegment v, 
        float tolerance
    ) {
        MethodHandle method = JPH_VEC3_IS_NORMALIZED.get();
        try {
            return (boolean) method.invokeExact(
                v, 
                tolerance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isNormalized}.
     */
    public static boolean isNormalized(
        Vec3 v, 
        float tolerance
    ) {
        return (boolean) isNormalized(
            v.memorySegment(), 
            tolerance
        );
    }
    
    public static boolean isNaN(
        MemorySegment v
    ) {
        MethodHandle method = JPH_VEC3_IS_NA_N.get();
        try {
            return (boolean) method.invokeExact(
                v
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isNaN}.
     */
    public static boolean isNaN(
        Vec3 v
    ) {
        return (boolean) isNaN(
            v.memorySegment()
        );
    }
    
    public static void negate(
        MemorySegment v, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_NEGATE.get();
        try {
            method.invokeExact(
                v, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #negate}.
     */
    public static void negate(
        Vec3 v, 
        Vec3 result
    ) {
        negate(
            v.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void normalized(
        MemorySegment v, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_NORMALIZED.get();
        try {
            method.invokeExact(
                v, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #normalized}.
     */
    public static void normalized(
        Vec3 v, 
        Vec3 result
    ) {
        normalized(
            v.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void cross(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_CROSS.get();
        try {
            method.invokeExact(
                v1, 
                v2, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #cross}.
     */
    public static void cross(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 result
    ) {
        cross(
            v1.memorySegment(), 
            v2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void abs(
        MemorySegment v, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_ABS.get();
        try {
            method.invokeExact(
                v, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #abs}.
     */
    public static void abs(
        Vec3 v, 
        Vec3 result
    ) {
        abs(
            v.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static float length(
        MemorySegment v
    ) {
        MethodHandle method = JPH_VEC3_LENGTH.get();
        try {
            return (float) method.invokeExact(
                v
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #length}.
     */
    public static float length(
        Vec3 v
    ) {
        return (float) length(
            v.memorySegment()
        );
    }
    
    public static float lengthSquared(
        MemorySegment v
    ) {
        MethodHandle method = JPH_VEC3_LENGTH_SQUARED.get();
        try {
            return (float) method.invokeExact(
                v
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #lengthSquared}.
     */
    public static float lengthSquared(
        Vec3 v
    ) {
        return (float) lengthSquared(
            v.memorySegment()
        );
    }
    
    public static void dotProduct(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_DOT_PRODUCT.get();
        try {
            method.invokeExact(
                v1, 
                v2, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #dotProduct}.
     */
    public static void dotProduct(
        Vec3 v1, 
        Vec3 v2, 
        NativeFloatArray result
    ) {
        dotProduct(
            v1.memorySegment(), 
            v2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void normalize(
        MemorySegment v, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_NORMALIZE.get();
        try {
            method.invokeExact(
                v, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #normalize}.
     */
    public static void normalize(
        Vec3 v, 
        Vec3 result
    ) {
        normalize(
            v.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void add(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_ADD.get();
        try {
            method.invokeExact(
                v1, 
                v2, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #add}.
     */
    public static void add(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 result
    ) {
        add(
            v1.memorySegment(), 
            v2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void subtract(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_SUBTRACT.get();
        try {
            method.invokeExact(
                v1, 
                v2, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #subtract}.
     */
    public static void subtract(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 result
    ) {
        subtract(
            v1.memorySegment(), 
            v2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void multiply(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_MULTIPLY.get();
        try {
            method.invokeExact(
                v1, 
                v2, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #multiply}.
     */
    public static void multiply(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 result
    ) {
        multiply(
            v1.memorySegment(), 
            v2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void multiplyScalar(
        MemorySegment v, 
        float scalar, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_MULTIPLY_SCALAR.get();
        try {
            method.invokeExact(
                v, 
                scalar, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #multiplyScalar}.
     */
    public static void multiplyScalar(
        Vec3 v, 
        float scalar, 
        Vec3 result
    ) {
        multiplyScalar(
            v.memorySegment(), 
            scalar, 
            result.memorySegment()
        );
    }
    
    public static void multiplyMatrix(
        MemorySegment left, 
        MemorySegment right, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_MULTIPLY_MATRIX.get();
        try {
            method.invokeExact(
                left, 
                right, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #multiplyMatrix}.
     */
    public static void multiplyMatrix(
        Mat4 left, 
        Vec3 right, 
        Vec3 result
    ) {
        multiplyMatrix(
            left.memorySegment(), 
            right.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void divide(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_DIVIDE.get();
        try {
            method.invokeExact(
                v1, 
                v2, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #divide}.
     */
    public static void divide(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 result
    ) {
        divide(
            v1.memorySegment(), 
            v2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void divideScalar(
        MemorySegment v, 
        float scalar, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_DIVIDE_SCALAR.get();
        try {
            method.invokeExact(
                v, 
                scalar, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #divideScalar}.
     */
    public static void divideScalar(
        Vec3 v, 
        float scalar, 
        Vec3 result
    ) {
        divideScalar(
            v.memorySegment(), 
            scalar, 
            result.memorySegment()
        );
    }
    
    public static void getNormalizedPerpendicular(
        MemorySegment v, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_VEC3_GET_NORMALIZED_PERPENDICULAR.get();
        try {
            method.invokeExact(
                v, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNormalizedPerpendicular}.
     */
    public static void getNormalizedPerpendicular(
        Vec3 v, 
        Vec3 result
    ) {
        getNormalizedPerpendicular(
            v.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public Vec3 x(float x) {
        X.set(segment, 0L, x);
        return this;
    }
    
    public float x() {
        return (float) X.get(segment, 0L);
    }
    
    public Vec3 y(float y) {
        Y.set(segment, 0L, y);
        return this;
    }
    
    public float y() {
        return (float) Y.get(segment, 0L);
    }
    
    public Vec3 z(float z) {
        Z.set(segment, 0L, z);
        return this;
    }
    
    public float z() {
        return (float) Z.get(segment, 0L);
    }
    
    @Override
    public Vec3 set(Vec3 other) {
        return set(other.segment);
    }
    
    @Override
    public Vec3 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Vec3> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Vec3> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Vec3(segment),
            count
        );
    }
    
    public static NativeStructArray<Vec3> array(Arena arena, Vec3... structs) {
        NativeStructArray<Vec3> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Vec3(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Vec3> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Vec3(segment)
        );
    }
    
}