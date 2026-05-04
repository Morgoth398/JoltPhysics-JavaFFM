/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class Mat4
		implements Struct<Mat4> {

    private static final LazyConstant<MethodHandle> JPH_MAT4_ADD;
    private static final LazyConstant<MethodHandle> JPH_MAT4_SUBTRACT;
    private static final LazyConstant<MethodHandle> JPH_MAT4_MULTIPLY;
    private static final LazyConstant<MethodHandle> JPH_MAT4_MULTIPLY_SCALAR;
    private static final LazyConstant<MethodHandle> JPH_MAT4_ZERO;
    private static final LazyConstant<MethodHandle> JPH_MAT4_IDENTITY;
    private static final LazyConstant<MethodHandle> JPH_MAT4_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_MAT4_ROTATION2;
    private static final LazyConstant<MethodHandle> JPH_MAT4_TRANSLATION;
    private static final LazyConstant<MethodHandle> JPH_MAT4_ROTATION_TRANSLATION;
    private static final LazyConstant<MethodHandle> JPH_MAT4_INVERSE_ROTATION_TRANSLATION;
    private static final LazyConstant<MethodHandle> JPH_MAT4_SCALE;
    private static final LazyConstant<MethodHandle> JPH_MAT4_TRANSPOSED;
    private static final LazyConstant<MethodHandle> JPH_MAT4_INVERSED;
    private static final LazyConstant<MethodHandle> JPH_MAT4_GET_AXIS_X;
    private static final LazyConstant<MethodHandle> JPH_MAT4_GET_AXIS_Y;
    private static final LazyConstant<MethodHandle> JPH_MAT4_GET_AXIS_Z;
    private static final LazyConstant<MethodHandle> JPH_MAT4_GET_TRANSLATION;
    private static final LazyConstant<MethodHandle> JPH_MAT4_GET_QUATERNION;

    public static final StructLayout LAYOUT;

    public static final long COLUMN_OFFSET;

    private final MemorySegment segment;

    private final Vec4[] column;

    static {
        //@formatter:off
        JPH_MAT4_ADD = downcallHandleVoid("JPH_Mat4_Add", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_SUBTRACT = downcallHandleVoid("JPH_Mat4_Subtract", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_MULTIPLY = downcallHandleVoid("JPH_Mat4_Multiply", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_MULTIPLY_SCALAR = downcallHandleVoid("JPH_Mat4_MultiplyScalar", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MAT4_ZERO = downcallHandleVoid("JPH_Mat4_Zero", UNBOUNDED_ADDRESS);
        JPH_MAT4_IDENTITY = downcallHandleVoid("JPH_Mat4_Identity", UNBOUNDED_ADDRESS);
        JPH_MAT4_ROTATION = downcallHandleVoid("JPH_Mat4_Rotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_ROTATION2 = downcallHandleVoid("JPH_Mat4_Rotation2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MAT4_TRANSLATION = downcallHandleVoid("JPH_Mat4_Translation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_ROTATION_TRANSLATION = downcallHandleVoid("JPH_Mat4_RotationTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_INVERSE_ROTATION_TRANSLATION = downcallHandleVoid("JPH_Mat4_InverseRotationTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_SCALE = downcallHandleVoid("JPH_Mat4_Scale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_TRANSPOSED = downcallHandleVoid("JPH_Mat4_Transposed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_INVERSED = downcallHandleVoid("JPH_Mat4_Inversed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_GET_AXIS_X = downcallHandleVoid("JPH_Mat4_GetAxisX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_GET_AXIS_Y = downcallHandleVoid("JPH_Mat4_GetAxisY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_GET_AXIS_Z = downcallHandleVoid("JPH_Mat4_GetAxisZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_GET_TRANSLATION = downcallHandleVoid("JPH_Mat4_GetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_MAT4_GET_QUATERNION = downcallHandleVoid("JPH_Mat4_GetQuaternion", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Vec4.LAYOUT).withName("column")
        ).withName("JPH_Mat4").withByteAlignment(4);
        
        
        COLUMN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("column"));
        //@formatter:on
    }

    public Mat4() {
        this(Arena.ofAuto());
    }
    
    public Mat4(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Mat4(MemorySegment segment) {
        this.segment = segment;
    
    
        column = new Vec4[4];
        for (int i = 0; i < 4; i++) {
            long offset = COLUMN_OFFSET + i * Vec4.LAYOUT.byteSize();
            column[i] = new Vec4(segment.asSlice(offset, Vec4.LAYOUT));
        }
    
    }

    public static void add(
        MemorySegment m1, 
        MemorySegment m2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_ADD.get();
        try {
            method.invokeExact(
                m1, 
                m2, 
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
        Mat4 m1, 
        Mat4 m2, 
        Mat4 result
    ) {
        add(
            m1.memorySegment(), 
            m2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void subtract(
        MemorySegment m1, 
        MemorySegment m2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_SUBTRACT.get();
        try {
            method.invokeExact(
                m1, 
                m2, 
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
        Mat4 m1, 
        Mat4 m2, 
        Mat4 result
    ) {
        subtract(
            m1.memorySegment(), 
            m2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void multiply(
        MemorySegment m1, 
        MemorySegment m2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_MULTIPLY.get();
        try {
            method.invokeExact(
                m1, 
                m2, 
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
        Mat4 m1, 
        Mat4 m2, 
        Mat4 result
    ) {
        multiply(
            m1.memorySegment(), 
            m2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void multiplyScalar(
        MemorySegment m, 
        float scalar, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_MULTIPLY_SCALAR.get();
        try {
            method.invokeExact(
                m, 
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
        Mat4 m, 
        float scalar, 
        Mat4 result
    ) {
        multiplyScalar(
            m.memorySegment(), 
            scalar, 
            result.memorySegment()
        );
    }
    
    public static void zero(
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_ZERO.get();
        try {
            method.invokeExact(
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #zero}.
     */
    public static void zero(
        Mat4 result
    ) {
        zero(
            result.memorySegment()
        );
    }
    
    public static void identity(
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_IDENTITY.get();
        try {
            method.invokeExact(
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #identity}.
     */
    public static void identity(
        Mat4 result
    ) {
        identity(
            result.memorySegment()
        );
    }
    
    public static void rotation(
        MemorySegment result, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_MAT4_ROTATION.get();
        try {
            method.invokeExact(
                result, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #rotation}.
     */
    public static void rotation(
        Mat4 result, 
        Quat rotation
    ) {
        rotation(
            result.memorySegment(), 
            rotation.memorySegment()
        );
    }
    
    public static void rotation2(
        MemorySegment result, 
        MemorySegment axis, 
        float angle
    ) {
        MethodHandle method = JPH_MAT4_ROTATION2.get();
        try {
            method.invokeExact(
                result, 
                axis, 
                angle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #rotation2}.
     */
    public static void rotation2(
        Mat4 result, 
        Vec3 axis, 
        float angle
    ) {
        rotation2(
            result.memorySegment(), 
            axis.memorySegment(), 
            angle
        );
    }
    
    public static void translation(
        MemorySegment result, 
        MemorySegment translation
    ) {
        MethodHandle method = JPH_MAT4_TRANSLATION.get();
        try {
            method.invokeExact(
                result, 
                translation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #translation}.
     */
    public static void translation(
        Mat4 result, 
        Vec3 translation
    ) {
        translation(
            result.memorySegment(), 
            translation.memorySegment()
        );
    }
    
    public static void rotationTranslation(
        MemorySegment result, 
        MemorySegment rotation, 
        MemorySegment translation
    ) {
        MethodHandle method = JPH_MAT4_ROTATION_TRANSLATION.get();
        try {
            method.invokeExact(
                result, 
                rotation, 
                translation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #rotationTranslation}.
     */
    public static void rotationTranslation(
        Mat4 result, 
        Quat rotation, 
        Vec3 translation
    ) {
        rotationTranslation(
            result.memorySegment(), 
            rotation.memorySegment(), 
            translation.memorySegment()
        );
    }
    
    public static void inverseRotationTranslation(
        MemorySegment result, 
        MemorySegment rotation, 
        MemorySegment translation
    ) {
        MethodHandle method = JPH_MAT4_INVERSE_ROTATION_TRANSLATION.get();
        try {
            method.invokeExact(
                result, 
                rotation, 
                translation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #inverseRotationTranslation}.
     */
    public static void inverseRotationTranslation(
        Mat4 result, 
        Quat rotation, 
        Vec3 translation
    ) {
        inverseRotationTranslation(
            result.memorySegment(), 
            rotation.memorySegment(), 
            translation.memorySegment()
        );
    }
    
    public static void scale(
        MemorySegment result, 
        MemorySegment scale
    ) {
        MethodHandle method = JPH_MAT4_SCALE.get();
        try {
            method.invokeExact(
                result, 
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #scale}.
     */
    public static void scale(
        Mat4 result, 
        Vec3 scale
    ) {
        scale(
            result.memorySegment(), 
            scale.memorySegment()
        );
    }
    
    public static void transposed(
        MemorySegment m, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_TRANSPOSED.get();
        try {
            method.invokeExact(
                m, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #transposed}.
     */
    public static void transposed(
        Mat4 m, 
        Mat4 result
    ) {
        transposed(
            m.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void inversed(
        MemorySegment matrix, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_INVERSED.get();
        try {
            method.invokeExact(
                matrix, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #inversed}.
     */
    public static void inversed(
        Mat4 matrix, 
        Mat4 result
    ) {
        inversed(
            matrix.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getAxisX(
        MemorySegment matrix, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_GET_AXIS_X.get();
        try {
            method.invokeExact(
                matrix, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAxisX}.
     */
    public static void getAxisX(
        Mat4 matrix, 
        Vec3 result
    ) {
        getAxisX(
            matrix.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getAxisY(
        MemorySegment matrix, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_GET_AXIS_Y.get();
        try {
            method.invokeExact(
                matrix, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAxisY}.
     */
    public static void getAxisY(
        Mat4 matrix, 
        Vec3 result
    ) {
        getAxisY(
            matrix.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getAxisZ(
        MemorySegment matrix, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_GET_AXIS_Z.get();
        try {
            method.invokeExact(
                matrix, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAxisZ}.
     */
    public static void getAxisZ(
        Mat4 matrix, 
        Vec3 result
    ) {
        getAxisZ(
            matrix.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getTranslation(
        MemorySegment matrix, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_GET_TRANSLATION.get();
        try {
            method.invokeExact(
                matrix, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTranslation}.
     */
    public static void getTranslation(
        Mat4 matrix, 
        Vec3 result
    ) {
        getTranslation(
            matrix.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getQuaternion(
        MemorySegment matrix, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_MAT4_GET_QUATERNION.get();
        try {
            method.invokeExact(
                matrix, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getQuaternion}.
     */
    public static void getQuaternion(
        Mat4 matrix, 
        Quat result
    ) {
        getQuaternion(
            matrix.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public Mat4 column(Consumer<Vec4> consumer, int index) {
        consumer.accept(column[index]);
        return this;
    }
    
    public Mat4 column(Vec4 other, int index) {
        column[index].set(other);
        return this;
    }
    
    public Vec4 column(int index) {
        return column[index];
    }
    
    @Override
    public Mat4 set(Mat4 other) {
        return set(other.segment);
    }
    
    @Override
    public Mat4 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Mat4> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Mat4> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Mat4(segment),
            count
        );
    }
    
    public static NativeStructArray<Mat4> array(Arena arena, Mat4... structs) {
        NativeStructArray<Mat4> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Mat4(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Mat4> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Mat4(segment)
        );
    }
    
}