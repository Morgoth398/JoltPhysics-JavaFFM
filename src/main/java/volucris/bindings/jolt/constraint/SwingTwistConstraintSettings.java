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
public final class SwingTwistConstraintSettings
		implements Struct<SwingTwistConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;
    public static final VarHandle SWING_TYPE;
    public static final VarHandle NORMAL_HALF_CONE_ANGLE;
    public static final VarHandle PLANE_HALF_CONE_ANGLE;
    public static final VarHandle TWIST_MIN_ANGLE;
    public static final VarHandle TWIST_MAX_ANGLE;
    public static final VarHandle MAX_FRICTION_TORQUE;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long POSITION1_OFFSET;
    public static final long TWIST_AXIS1_OFFSET;
    public static final long PLANE_AXIS1_OFFSET;
    public static final long POSITION2_OFFSET;
    public static final long TWIST_AXIS2_OFFSET;
    public static final long PLANE_AXIS2_OFFSET;
    public static final long SWING_TYPE_OFFSET;
    public static final long NORMAL_HALF_CONE_ANGLE_OFFSET;
    public static final long PLANE_HALF_CONE_ANGLE_OFFSET;
    public static final long TWIST_MIN_ANGLE_OFFSET;
    public static final long TWIST_MAX_ANGLE_OFFSET;
    public static final long MAX_FRICTION_TORQUE_OFFSET;
    public static final long SWING_MOTOR_SETTINGS_OFFSET;
    public static final long TWIST_MOTOR_SETTINGS_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 position1;
    private final Vec3 twistAxis1;
    private final Vec3 planeAxis1;
    private final Vec3 position2;
    private final Vec3 twistAxis2;
    private final Vec3 planeAxis2;
    private final MotorSettings swingMotorSettings;
    private final MotorSettings twistMotorSettings;

    static {
        //@formatter:off
        JPH_SWING_TWIST_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_SwingTwistConstraintSettings_Init", UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            Vec3.LAYOUT.withName("position1"),
            Vec3.LAYOUT.withName("twistAxis1"),
            Vec3.LAYOUT.withName("planeAxis1"),
            Vec3.LAYOUT.withName("position2"),
            Vec3.LAYOUT.withName("twistAxis2"),
            Vec3.LAYOUT.withName("planeAxis2"),
            JAVA_INT.withName("swingType"),
            JAVA_FLOAT.withName("normalHalfConeAngle"),
            JAVA_FLOAT.withName("planeHalfConeAngle"),
            JAVA_FLOAT.withName("twistMinAngle"),
            JAVA_FLOAT.withName("twistMaxAngle"),
            JAVA_FLOAT.withName("maxFrictionTorque"),
            MotorSettings.LAYOUT.withName("swingMotorSettings"),
            MotorSettings.LAYOUT.withName("twistMotorSettings"),
            MemoryLayout.paddingLayout(4)
        ).withName("JPH_SwingTwistConstraintSettings").withByteAlignment(8);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        SWING_TYPE = LAYOUT.varHandle(PathElement.groupElement("swingType"));
        NORMAL_HALF_CONE_ANGLE = LAYOUT.varHandle(PathElement.groupElement("normalHalfConeAngle"));
        PLANE_HALF_CONE_ANGLE = LAYOUT.varHandle(PathElement.groupElement("planeHalfConeAngle"));
        TWIST_MIN_ANGLE = LAYOUT.varHandle(PathElement.groupElement("twistMinAngle"));
        TWIST_MAX_ANGLE = LAYOUT.varHandle(PathElement.groupElement("twistMaxAngle"));
        MAX_FRICTION_TORQUE = LAYOUT.varHandle(PathElement.groupElement("maxFrictionTorque"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        POSITION1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position1"));
        TWIST_AXIS1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistAxis1"));
        PLANE_AXIS1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeAxis1"));
        POSITION2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position2"));
        TWIST_AXIS2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistAxis2"));
        PLANE_AXIS2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeAxis2"));
        SWING_TYPE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swingType"));
        NORMAL_HALF_CONE_ANGLE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalHalfConeAngle"));
        PLANE_HALF_CONE_ANGLE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeHalfConeAngle"));
        TWIST_MIN_ANGLE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistMinAngle"));
        TWIST_MAX_ANGLE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistMaxAngle"));
        MAX_FRICTION_TORQUE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFrictionTorque"));
        SWING_MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swingMotorSettings"));
        TWIST_MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistMotorSettings"));
        //@formatter:on
    }

    public SwingTwistConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public SwingTwistConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SwingTwistConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        position1 = new Vec3(segment.asSlice(POSITION1_OFFSET, Vec3.LAYOUT));
        twistAxis1 = new Vec3(segment.asSlice(TWIST_AXIS1_OFFSET, Vec3.LAYOUT));
        planeAxis1 = new Vec3(segment.asSlice(PLANE_AXIS1_OFFSET, Vec3.LAYOUT));
        position2 = new Vec3(segment.asSlice(POSITION2_OFFSET, Vec3.LAYOUT));
        twistAxis2 = new Vec3(segment.asSlice(TWIST_AXIS2_OFFSET, Vec3.LAYOUT));
        planeAxis2 = new Vec3(segment.asSlice(PLANE_AXIS2_OFFSET, Vec3.LAYOUT));
        swingMotorSettings = new MotorSettings(segment.asSlice(SWING_MOTOR_SETTINGS_OFFSET, MotorSettings.LAYOUT));
        twistMotorSettings = new MotorSettings(segment.asSlice(TWIST_MOTOR_SETTINGS_OFFSET, MotorSettings.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_INIT.get();
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
    
    public SwingTwistConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public SwingTwistConstraintSettings swingType(int swingType) {
        SWING_TYPE.set(segment, 0L, swingType);
        return this;
    }
    
    public int swingType() {
        return (int) SWING_TYPE.get(segment, 0L);
    }
    
    public SwingTwistConstraintSettings normalHalfConeAngle(float normalHalfConeAngle) {
        NORMAL_HALF_CONE_ANGLE.set(segment, 0L, normalHalfConeAngle);
        return this;
    }
    
    public float normalHalfConeAngle() {
        return (float) NORMAL_HALF_CONE_ANGLE.get(segment, 0L);
    }
    
    public SwingTwistConstraintSettings planeHalfConeAngle(float planeHalfConeAngle) {
        PLANE_HALF_CONE_ANGLE.set(segment, 0L, planeHalfConeAngle);
        return this;
    }
    
    public float planeHalfConeAngle() {
        return (float) PLANE_HALF_CONE_ANGLE.get(segment, 0L);
    }
    
    public SwingTwistConstraintSettings twistMinAngle(float twistMinAngle) {
        TWIST_MIN_ANGLE.set(segment, 0L, twistMinAngle);
        return this;
    }
    
    public float twistMinAngle() {
        return (float) TWIST_MIN_ANGLE.get(segment, 0L);
    }
    
    public SwingTwistConstraintSettings twistMaxAngle(float twistMaxAngle) {
        TWIST_MAX_ANGLE.set(segment, 0L, twistMaxAngle);
        return this;
    }
    
    public float twistMaxAngle() {
        return (float) TWIST_MAX_ANGLE.get(segment, 0L);
    }
    
    public SwingTwistConstraintSettings maxFrictionTorque(float maxFrictionTorque) {
        MAX_FRICTION_TORQUE.set(segment, 0L, maxFrictionTorque);
        return this;
    }
    
    public float maxFrictionTorque() {
        return (float) MAX_FRICTION_TORQUE.get(segment, 0L);
    }
    
    public SwingTwistConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public SwingTwistConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public SwingTwistConstraintSettings position1(Consumer<Vec3> consumer) {
        consumer.accept(position1);
        return this;
    }
    
    public SwingTwistConstraintSettings position1(Vec3 other) {
        position1.set(other);
        return this;
    }
    
    public Vec3 position1() {
        return position1;
    }
    
    public SwingTwistConstraintSettings twistAxis1(Consumer<Vec3> consumer) {
        consumer.accept(twistAxis1);
        return this;
    }
    
    public SwingTwistConstraintSettings twistAxis1(Vec3 other) {
        twistAxis1.set(other);
        return this;
    }
    
    public Vec3 twistAxis1() {
        return twistAxis1;
    }
    
    public SwingTwistConstraintSettings planeAxis1(Consumer<Vec3> consumer) {
        consumer.accept(planeAxis1);
        return this;
    }
    
    public SwingTwistConstraintSettings planeAxis1(Vec3 other) {
        planeAxis1.set(other);
        return this;
    }
    
    public Vec3 planeAxis1() {
        return planeAxis1;
    }
    
    public SwingTwistConstraintSettings position2(Consumer<Vec3> consumer) {
        consumer.accept(position2);
        return this;
    }
    
    public SwingTwistConstraintSettings position2(Vec3 other) {
        position2.set(other);
        return this;
    }
    
    public Vec3 position2() {
        return position2;
    }
    
    public SwingTwistConstraintSettings twistAxis2(Consumer<Vec3> consumer) {
        consumer.accept(twistAxis2);
        return this;
    }
    
    public SwingTwistConstraintSettings twistAxis2(Vec3 other) {
        twistAxis2.set(other);
        return this;
    }
    
    public Vec3 twistAxis2() {
        return twistAxis2;
    }
    
    public SwingTwistConstraintSettings planeAxis2(Consumer<Vec3> consumer) {
        consumer.accept(planeAxis2);
        return this;
    }
    
    public SwingTwistConstraintSettings planeAxis2(Vec3 other) {
        planeAxis2.set(other);
        return this;
    }
    
    public Vec3 planeAxis2() {
        return planeAxis2;
    }
    
    public SwingTwistConstraintSettings swingMotorSettings(Consumer<MotorSettings> consumer) {
        consumer.accept(swingMotorSettings);
        return this;
    }
    
    public SwingTwistConstraintSettings swingMotorSettings(MotorSettings other) {
        swingMotorSettings.set(other);
        return this;
    }
    
    public MotorSettings swingMotorSettings() {
        return swingMotorSettings;
    }
    
    public SwingTwistConstraintSettings twistMotorSettings(Consumer<MotorSettings> consumer) {
        consumer.accept(twistMotorSettings);
        return this;
    }
    
    public SwingTwistConstraintSettings twistMotorSettings(MotorSettings other) {
        twistMotorSettings.set(other);
        return this;
    }
    
    public MotorSettings twistMotorSettings() {
        return twistMotorSettings;
    }
    
    @Override
    public SwingTwistConstraintSettings set(SwingTwistConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public SwingTwistConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SwingTwistConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SwingTwistConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SwingTwistConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<SwingTwistConstraintSettings> array(Arena arena, SwingTwistConstraintSettings... structs) {
        NativeStructArray<SwingTwistConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SwingTwistConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SwingTwistConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SwingTwistConstraintSettings(segment)
        );
    }
    
}