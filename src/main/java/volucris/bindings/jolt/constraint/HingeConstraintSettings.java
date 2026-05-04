/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class HingeConstraintSettings
		implements Struct<HingeConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_HINGE_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;
    public static final VarHandle LIMITS_MIN;
    public static final VarHandle LIMITS_MAX;
    public static final VarHandle MAX_FRICTION_TORQUE;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long POINT1_OFFSET;
    public static final long HINGE_AXIS1_OFFSET;
    public static final long NORMAL_AXIS1_OFFSET;
    public static final long POINT2_OFFSET;
    public static final long HINGE_AXIS2_OFFSET;
    public static final long NORMAL_AXIS2_OFFSET;
    public static final long LIMITS_MIN_OFFSET;
    public static final long LIMITS_MAX_OFFSET;
    public static final long LIMITS_SPRING_SETTINGS_OFFSET;
    public static final long MAX_FRICTION_TORQUE_OFFSET;
    public static final long MOTOR_SETTINGS_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 point1;
    private final Vec3 hingeAxis1;
    private final Vec3 normalAxis1;
    private final Vec3 point2;
    private final Vec3 hingeAxis2;
    private final Vec3 normalAxis2;
    private final SpringSettings limitsSpringSettings;
    private final MotorSettings motorSettings;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            Vec3.LAYOUT.withName("point1"),
            Vec3.LAYOUT.withName("hingeAxis1"),
            Vec3.LAYOUT.withName("normalAxis1"),
            Vec3.LAYOUT.withName("point2"),
            Vec3.LAYOUT.withName("hingeAxis2"),
            Vec3.LAYOUT.withName("normalAxis2"),
            JAVA_FLOAT.withName("limitsMin"),
            JAVA_FLOAT.withName("limitsMax"),
            SpringSettings.LAYOUT.withName("limitsSpringSettings"),
            JAVA_FLOAT.withName("maxFrictionTorque"),
            MotorSettings.LAYOUT.withName("motorSettings")
        ).withName("JPH_HingeConstraintSettings").withByteAlignment(8);
        
        JPH_HINGE_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_HingeConstraintSettings_Init", UNBOUNDED_ADDRESS);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        LIMITS_MIN = LAYOUT.varHandle(PathElement.groupElement("limitsMin"));
        LIMITS_MAX = LAYOUT.varHandle(PathElement.groupElement("limitsMax"));
        MAX_FRICTION_TORQUE = LAYOUT.varHandle(PathElement.groupElement("maxFrictionTorque"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        POINT1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
        HINGE_AXIS1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hingeAxis1"));
        NORMAL_AXIS1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalAxis1"));
        POINT2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
        HINGE_AXIS2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hingeAxis2"));
        NORMAL_AXIS2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalAxis2"));
        LIMITS_MIN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsMin"));
        LIMITS_MAX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsMax"));
        LIMITS_SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
        MAX_FRICTION_TORQUE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFrictionTorque"));
        MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSettings"));
        //@formatter:on
    }

    public HingeConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public HingeConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public HingeConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        point1 = new Vec3(segment.asSlice(POINT1_OFFSET, Vec3.LAYOUT));
        hingeAxis1 = new Vec3(segment.asSlice(HINGE_AXIS1_OFFSET, Vec3.LAYOUT));
        normalAxis1 = new Vec3(segment.asSlice(NORMAL_AXIS1_OFFSET, Vec3.LAYOUT));
        point2 = new Vec3(segment.asSlice(POINT2_OFFSET, Vec3.LAYOUT));
        hingeAxis2 = new Vec3(segment.asSlice(HINGE_AXIS2_OFFSET, Vec3.LAYOUT));
        normalAxis2 = new Vec3(segment.asSlice(NORMAL_AXIS2_OFFSET, Vec3.LAYOUT));
        limitsSpringSettings = new SpringSettings(segment.asSlice(LIMITS_SPRING_SETTINGS_OFFSET, SpringSettings.LAYOUT));
        motorSettings = new MotorSettings(segment.asSlice(MOTOR_SETTINGS_OFFSET, MotorSettings.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_INIT.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #init}.
     */
    public final void init(
    ) {
        init(
            this.segment
        );
    }
    
    public HingeConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public HingeConstraintSettings limitsMin(float limitsMin) {
        LIMITS_MIN.set(segment, 0L, limitsMin);
        return this;
    }
    
    public float limitsMin() {
        return (float) LIMITS_MIN.get(segment, 0L);
    }
    
    public HingeConstraintSettings limitsMax(float limitsMax) {
        LIMITS_MAX.set(segment, 0L, limitsMax);
        return this;
    }
    
    public float limitsMax() {
        return (float) LIMITS_MAX.get(segment, 0L);
    }
    
    public HingeConstraintSettings maxFrictionTorque(float maxFrictionTorque) {
        MAX_FRICTION_TORQUE.set(segment, 0L, maxFrictionTorque);
        return this;
    }
    
    public float maxFrictionTorque() {
        return (float) MAX_FRICTION_TORQUE.get(segment, 0L);
    }
    
    public HingeConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public HingeConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public HingeConstraintSettings point1(Consumer<Vec3> consumer) {
        consumer.accept(point1);
        return this;
    }
    
    public HingeConstraintSettings point1(Vec3 other) {
        point1.set(other);
        return this;
    }
    
    public Vec3 point1() {
        return point1;
    }
    
    public HingeConstraintSettings hingeAxis1(Consumer<Vec3> consumer) {
        consumer.accept(hingeAxis1);
        return this;
    }
    
    public HingeConstraintSettings hingeAxis1(Vec3 other) {
        hingeAxis1.set(other);
        return this;
    }
    
    public Vec3 hingeAxis1() {
        return hingeAxis1;
    }
    
    public HingeConstraintSettings normalAxis1(Consumer<Vec3> consumer) {
        consumer.accept(normalAxis1);
        return this;
    }
    
    public HingeConstraintSettings normalAxis1(Vec3 other) {
        normalAxis1.set(other);
        return this;
    }
    
    public Vec3 normalAxis1() {
        return normalAxis1;
    }
    
    public HingeConstraintSettings point2(Consumer<Vec3> consumer) {
        consumer.accept(point2);
        return this;
    }
    
    public HingeConstraintSettings point2(Vec3 other) {
        point2.set(other);
        return this;
    }
    
    public Vec3 point2() {
        return point2;
    }
    
    public HingeConstraintSettings hingeAxis2(Consumer<Vec3> consumer) {
        consumer.accept(hingeAxis2);
        return this;
    }
    
    public HingeConstraintSettings hingeAxis2(Vec3 other) {
        hingeAxis2.set(other);
        return this;
    }
    
    public Vec3 hingeAxis2() {
        return hingeAxis2;
    }
    
    public HingeConstraintSettings normalAxis2(Consumer<Vec3> consumer) {
        consumer.accept(normalAxis2);
        return this;
    }
    
    public HingeConstraintSettings normalAxis2(Vec3 other) {
        normalAxis2.set(other);
        return this;
    }
    
    public Vec3 normalAxis2() {
        return normalAxis2;
    }
    
    public HingeConstraintSettings limitsSpringSettings(Consumer<SpringSettings> consumer) {
        consumer.accept(limitsSpringSettings);
        return this;
    }
    
    public HingeConstraintSettings limitsSpringSettings(SpringSettings other) {
        limitsSpringSettings.set(other);
        return this;
    }
    
    public SpringSettings limitsSpringSettings() {
        return limitsSpringSettings;
    }
    
    public HingeConstraintSettings motorSettings(Consumer<MotorSettings> consumer) {
        consumer.accept(motorSettings);
        return this;
    }
    
    public HingeConstraintSettings motorSettings(MotorSettings other) {
        motorSettings.set(other);
        return this;
    }
    
    public MotorSettings motorSettings() {
        return motorSettings;
    }
    
    @Override
    public HingeConstraintSettings set(HingeConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public HingeConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<HingeConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<HingeConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HingeConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<HingeConstraintSettings> array(Arena arena, HingeConstraintSettings... structs) {
        NativeStructArray<HingeConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new HingeConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<HingeConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new HingeConstraintSettings(segment)
        );
    }
    
}