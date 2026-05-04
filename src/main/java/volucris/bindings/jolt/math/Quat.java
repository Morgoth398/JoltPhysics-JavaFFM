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
public final class Quat
		implements Struct<Quat> {

    private static final LazyConstant<MethodHandle> JPH_QUAT_FROM_TO;
    private static final LazyConstant<MethodHandle> JPH_QUAT_GET_AXIS_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_QUAT_GET_EULER_ANGLES;
    private static final LazyConstant<MethodHandle> JPH_QUAT_ROTATE_AXIS_X;
    private static final LazyConstant<MethodHandle> JPH_QUAT_ROTATE_AXIS_Y;
    private static final LazyConstant<MethodHandle> JPH_QUAT_ROTATE_AXIS_Z;
    private static final LazyConstant<MethodHandle> JPH_QUAT_INVERSED;
    private static final LazyConstant<MethodHandle> JPH_QUAT_GET_PERPENDICULAR;
    private static final LazyConstant<MethodHandle> JPH_QUAT_GET_ROTATION_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_QUAT_FROM_EULER_ANGLES;
    private static final LazyConstant<MethodHandle> JPH_QUAT_ADD;
    private static final LazyConstant<MethodHandle> JPH_QUAT_SUBTRACT;
    private static final LazyConstant<MethodHandle> JPH_QUAT_MULTIPLY;
    private static final LazyConstant<MethodHandle> JPH_QUAT_MULTIPLY_SCALAR;
    private static final LazyConstant<MethodHandle> JPH_QUAT_DIVIDE_SCALAR;
    private static final LazyConstant<MethodHandle> JPH_QUAT_DOT;
    private static final LazyConstant<MethodHandle> JPH_QUAT_CONJUGATED;
    private static final LazyConstant<MethodHandle> JPH_QUAT_GET_TWIST;
    private static final LazyConstant<MethodHandle> JPH_QUAT_GET_SWING_TWIST;
    private static final LazyConstant<MethodHandle> JPH_QUAT_LERP;
    private static final LazyConstant<MethodHandle> JPH_QUAT_SLERP;
    private static final LazyConstant<MethodHandle> JPH_QUAT_ROTATE;
    private static final LazyConstant<MethodHandle> JPH_QUAT_INVERSE_ROTATE;

    public static final StructLayout LAYOUT;

    public static final VarHandle X;
    public static final VarHandle Y;
    public static final VarHandle Z;
    public static final VarHandle W;

    public static final long X_OFFSET;
    public static final long Y_OFFSET;
    public static final long Z_OFFSET;
    public static final long W_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_QUAT_FROM_TO = downcallHandleVoid("JPH_Quat_FromTo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_GET_AXIS_ANGLE = downcallHandleVoid("JPH_Quat_GetAxisAngle", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_GET_EULER_ANGLES = downcallHandleVoid("JPH_Quat_GetEulerAngles", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_ROTATE_AXIS_X = downcallHandleVoid("JPH_Quat_RotateAxisX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_ROTATE_AXIS_Y = downcallHandleVoid("JPH_Quat_RotateAxisY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_ROTATE_AXIS_Z = downcallHandleVoid("JPH_Quat_RotateAxisZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_INVERSED = downcallHandleVoid("JPH_Quat_Inversed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_GET_PERPENDICULAR = downcallHandleVoid("JPH_Quat_GetPerpendicular", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_GET_ROTATION_ANGLE = downcallHandle("JPH_Quat_GetRotationAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_FROM_EULER_ANGLES = downcallHandleVoid("JPH_Quat_FromEulerAngles", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_ADD = downcallHandleVoid("JPH_Quat_Add", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_SUBTRACT = downcallHandleVoid("JPH_Quat_Subtract", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_MULTIPLY = downcallHandleVoid("JPH_Quat_Multiply", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_MULTIPLY_SCALAR = downcallHandleVoid("JPH_Quat_MultiplyScalar", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_QUAT_DIVIDE_SCALAR = downcallHandleVoid("JPH_Quat_DivideScalar", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_QUAT_DOT = downcallHandleVoid("JPH_Quat_Dot", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_CONJUGATED = downcallHandleVoid("JPH_Quat_Conjugated", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_GET_TWIST = downcallHandleVoid("JPH_Quat_GetTwist", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_GET_SWING_TWIST = downcallHandleVoid("JPH_Quat_GetSwingTwist", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_LERP = downcallHandleVoid("JPH_Quat_Lerp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_QUAT_SLERP = downcallHandleVoid("JPH_Quat_Slerp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_QUAT_ROTATE = downcallHandleVoid("JPH_Quat_Rotate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_QUAT_INVERSE_ROTATE = downcallHandleVoid("JPH_Quat_InverseRotate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("x"),
            JAVA_FLOAT.withName("y"),
            JAVA_FLOAT.withName("z"),
            JAVA_FLOAT.withName("w")
        ).withName("JPH_Quat").withByteAlignment(4);
        
        X = LAYOUT.varHandle(PathElement.groupElement("x"));
        Y = LAYOUT.varHandle(PathElement.groupElement("y"));
        Z = LAYOUT.varHandle(PathElement.groupElement("z"));
        W = LAYOUT.varHandle(PathElement.groupElement("w"));
        
        X_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
        Y_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
        Z_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("z"));
        W_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("w"));
        //@formatter:on
    }

    public Quat() {
        this(Arena.ofAuto());
    }
    
    public Quat(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Quat(MemorySegment segment) {
        this.segment = segment;
    
    }

    public static void fromTo(
        MemorySegment from, 
        MemorySegment to, 
        MemorySegment quat
    ) {
        MethodHandle method = JPH_QUAT_FROM_TO.get();
        try {
            method.invokeExact(
                from, 
                to, 
                quat
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #fromTo}.
     */
    public static void fromTo(
        Vec3 from, 
        Vec3 to, 
        Quat quat
    ) {
        fromTo(
            from.memorySegment(), 
            to.memorySegment(), 
            quat.memorySegment()
        );
    }
    
    public static void getAxisAngle(
        MemorySegment quat, 
        MemorySegment outAxis, 
        MemorySegment outAngle
    ) {
        MethodHandle method = JPH_QUAT_GET_AXIS_ANGLE.get();
        try {
            method.invokeExact(
                quat, 
                outAxis, 
                outAngle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAxisAngle}.
     */
    public static void getAxisAngle(
        Quat quat, 
        Vec3 outAxis, 
        NativeFloatArray outAngle
    ) {
        getAxisAngle(
            quat.memorySegment(), 
            outAxis.memorySegment(), 
            outAngle.memorySegment()
        );
    }
    
    public static void getEulerAngles(
        MemorySegment quat, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_GET_EULER_ANGLES.get();
        try {
            method.invokeExact(
                quat, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getEulerAngles}.
     */
    public static void getEulerAngles(
        Quat quat, 
        Vec3 result
    ) {
        getEulerAngles(
            quat.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void rotateAxisX(
        MemorySegment quat, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_ROTATE_AXIS_X.get();
        try {
            method.invokeExact(
                quat, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #rotateAxisX}.
     */
    public static void rotateAxisX(
        Quat quat, 
        Vec3 result
    ) {
        rotateAxisX(
            quat.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void rotateAxisY(
        MemorySegment quat, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_ROTATE_AXIS_Y.get();
        try {
            method.invokeExact(
                quat, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #rotateAxisY}.
     */
    public static void rotateAxisY(
        Quat quat, 
        Vec3 result
    ) {
        rotateAxisY(
            quat.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void rotateAxisZ(
        MemorySegment quat, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_ROTATE_AXIS_Z.get();
        try {
            method.invokeExact(
                quat, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #rotateAxisZ}.
     */
    public static void rotateAxisZ(
        Quat quat, 
        Vec3 result
    ) {
        rotateAxisZ(
            quat.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void inversed(
        MemorySegment quat, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_INVERSED.get();
        try {
            method.invokeExact(
                quat, 
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
        Quat quat, 
        Quat result
    ) {
        inversed(
            quat.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getPerpendicular(
        MemorySegment quat, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_GET_PERPENDICULAR.get();
        try {
            method.invokeExact(
                quat, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPerpendicular}.
     */
    public static void getPerpendicular(
        Quat quat, 
        Quat result
    ) {
        getPerpendicular(
            quat.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static float getRotationAngle(
        MemorySegment quat, 
        MemorySegment axis
    ) {
        MethodHandle method = JPH_QUAT_GET_ROTATION_ANGLE.get();
        try {
            return (float) method.invokeExact(
                quat, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotationAngle}.
     */
    public static float getRotationAngle(
        Quat quat, 
        Vec3 axis
    ) {
        return (float) getRotationAngle(
            quat.memorySegment(), 
            axis.memorySegment()
        );
    }
    
    public static void fromEulerAngles(
        MemorySegment angles, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_FROM_EULER_ANGLES.get();
        try {
            method.invokeExact(
                angles, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #fromEulerAngles}.
     */
    public static void fromEulerAngles(
        Vec3 angles, 
        Quat result
    ) {
        fromEulerAngles(
            angles.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void add(
        MemorySegment q1, 
        MemorySegment q2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_ADD.get();
        try {
            method.invokeExact(
                q1, 
                q2, 
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
        Quat q1, 
        Quat q2, 
        Quat result
    ) {
        add(
            q1.memorySegment(), 
            q2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void subtract(
        MemorySegment q1, 
        MemorySegment q2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_SUBTRACT.get();
        try {
            method.invokeExact(
                q1, 
                q2, 
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
        Quat q1, 
        Quat q2, 
        Quat result
    ) {
        subtract(
            q1.memorySegment(), 
            q2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void multiply(
        MemorySegment q1, 
        MemorySegment q2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_MULTIPLY.get();
        try {
            method.invokeExact(
                q1, 
                q2, 
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
        Quat q1, 
        Quat q2, 
        Quat result
    ) {
        multiply(
            q1.memorySegment(), 
            q2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void multiplyScalar(
        MemorySegment q, 
        float scalar, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_MULTIPLY_SCALAR.get();
        try {
            method.invokeExact(
                q, 
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
        Quat q, 
        float scalar, 
        Quat result
    ) {
        multiplyScalar(
            q.memorySegment(), 
            scalar, 
            result.memorySegment()
        );
    }
    
    public static void divideScalar(
        MemorySegment q, 
        float scalar, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_DIVIDE_SCALAR.get();
        try {
            method.invokeExact(
                q, 
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
        Quat q, 
        float scalar, 
        Quat result
    ) {
        divideScalar(
            q.memorySegment(), 
            scalar, 
            result.memorySegment()
        );
    }
    
    public static void dot(
        MemorySegment q1, 
        MemorySegment q2, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_DOT.get();
        try {
            method.invokeExact(
                q1, 
                q2, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #dot}.
     */
    public static void dot(
        Quat q1, 
        Quat q2, 
        NativeFloatArray result
    ) {
        dot(
            q1.memorySegment(), 
            q2.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void conjugated(
        MemorySegment quat, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_CONJUGATED.get();
        try {
            method.invokeExact(
                quat, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #conjugated}.
     */
    public static void conjugated(
        Quat quat, 
        Quat result
    ) {
        conjugated(
            quat.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getTwist(
        MemorySegment quat, 
        MemorySegment axis, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_GET_TWIST.get();
        try {
            method.invokeExact(
                quat, 
                axis, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTwist}.
     */
    public static void getTwist(
        Quat quat, 
        Vec3 axis, 
        Quat result
    ) {
        getTwist(
            quat.memorySegment(), 
            axis.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void getSwingTwist(
        MemorySegment quat, 
        MemorySegment outSwing, 
        MemorySegment outTwist
    ) {
        MethodHandle method = JPH_QUAT_GET_SWING_TWIST.get();
        try {
            method.invokeExact(
                quat, 
                outSwing, 
                outTwist
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSwingTwist}.
     */
    public static void getSwingTwist(
        Quat quat, 
        Quat outSwing, 
        Quat outTwist
    ) {
        getSwingTwist(
            quat.memorySegment(), 
            outSwing.memorySegment(), 
            outTwist.memorySegment()
        );
    }
    
    public static void lerp(
        MemorySegment from, 
        MemorySegment to, 
        float fraction, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_LERP.get();
        try {
            method.invokeExact(
                from, 
                to, 
                fraction, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #lerp}.
     */
    public static void lerp(
        Quat from, 
        Quat to, 
        float fraction, 
        Quat result
    ) {
        lerp(
            from.memorySegment(), 
            to.memorySegment(), 
            fraction, 
            result.memorySegment()
        );
    }
    
    public static void slerp(
        MemorySegment from, 
        MemorySegment to, 
        float fraction, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_SLERP.get();
        try {
            method.invokeExact(
                from, 
                to, 
                fraction, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #slerp}.
     */
    public static void slerp(
        Quat from, 
        Quat to, 
        float fraction, 
        Quat result
    ) {
        slerp(
            from.memorySegment(), 
            to.memorySegment(), 
            fraction, 
            result.memorySegment()
        );
    }
    
    public static void rotate(
        MemorySegment quat, 
        MemorySegment vec, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_ROTATE.get();
        try {
            method.invokeExact(
                quat, 
                vec, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #rotate}.
     */
    public static void rotate(
        Quat quat, 
        Vec3 vec, 
        Vec3 result
    ) {
        rotate(
            quat.memorySegment(), 
            vec.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static void inverseRotate(
        MemorySegment quat, 
        MemorySegment vec, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_QUAT_INVERSE_ROTATE.get();
        try {
            method.invokeExact(
                quat, 
                vec, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #inverseRotate}.
     */
    public static void inverseRotate(
        Quat quat, 
        Vec3 vec, 
        Vec3 result
    ) {
        inverseRotate(
            quat.memorySegment(), 
            vec.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public Quat x(float x) {
        X.set(segment, 0L, x);
        return this;
    }
    
    public float x() {
        return (float) X.get(segment, 0L);
    }
    
    public Quat y(float y) {
        Y.set(segment, 0L, y);
        return this;
    }
    
    public float y() {
        return (float) Y.get(segment, 0L);
    }
    
    public Quat z(float z) {
        Z.set(segment, 0L, z);
        return this;
    }
    
    public float z() {
        return (float) Z.get(segment, 0L);
    }
    
    public Quat w(float w) {
        W.set(segment, 0L, w);
        return this;
    }
    
    public float w() {
        return (float) W.get(segment, 0L);
    }
    
    @Override
    public Quat set(Quat other) {
        return set(other.segment);
    }
    
    @Override
    public Quat set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Quat> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Quat> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Quat(segment),
            count
        );
    }
    
    public static NativeStructArray<Quat> array(Arena arena, Quat... structs) {
        NativeStructArray<Quat> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Quat(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Quat> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Quat(segment)
        );
    }
    
}