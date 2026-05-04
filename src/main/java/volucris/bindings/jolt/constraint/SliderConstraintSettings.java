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
public final class SliderConstraintSettings
		implements Struct<SliderConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_INIT;
    private static final LazyConstant<MethodHandle> JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;
    public static final VarHandle AUTO_DETECT_POINT;
    public static final VarHandle LIMITS_MIN;
    public static final VarHandle LIMITS_MAX;
    public static final VarHandle MAX_FRICTION_FORCE;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long AUTO_DETECT_POINT_OFFSET;
    public static final long POINT1_OFFSET;
    public static final long SLIDER_AXIS1_OFFSET;
    public static final long NORMAL_AXIS1_OFFSET;
    public static final long POINT2_OFFSET;
    public static final long SLIDER_AXIS2_OFFSET;
    public static final long NORMAL_AXIS2_OFFSET;
    public static final long LIMITS_MIN_OFFSET;
    public static final long LIMITS_MAX_OFFSET;
    public static final long LIMITS_SPRING_SETTINGS_OFFSET;
    public static final long MAX_FRICTION_FORCE_OFFSET;
    public static final long MOTOR_SETTINGS_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 point1;
    private final Vec3 sliderAxis1;
    private final Vec3 normalAxis1;
    private final Vec3 point2;
    private final Vec3 sliderAxis2;
    private final Vec3 normalAxis2;
    private final SpringSettings limitsSpringSettings;
    private final MotorSettings motorSettings;

    static {
        //@formatter:off
        JPH_SLIDER_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_SliderConstraintSettings_Init", UNBOUNDED_ADDRESS);
        JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS = downcallHandleVoid("JPH_SliderConstraintSettings_SetSliderAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            JAVA_BOOLEAN.withName("autoDetectPoint"),
            MemoryLayout.paddingLayout(3),
            Vec3.LAYOUT.withName("point1"),
            Vec3.LAYOUT.withName("sliderAxis1"),
            Vec3.LAYOUT.withName("normalAxis1"),
            Vec3.LAYOUT.withName("point2"),
            Vec3.LAYOUT.withName("sliderAxis2"),
            Vec3.LAYOUT.withName("normalAxis2"),
            JAVA_FLOAT.withName("limitsMin"),
            JAVA_FLOAT.withName("limitsMax"),
            SpringSettings.LAYOUT.withName("limitsSpringSettings"),
            JAVA_FLOAT.withName("maxFrictionForce"),
            MotorSettings.LAYOUT.withName("motorSettings"),
            MemoryLayout.paddingLayout(4)
        ).withName("JPH_SliderConstraintSettings").withByteAlignment(8);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        AUTO_DETECT_POINT = LAYOUT.varHandle(PathElement.groupElement("autoDetectPoint"));
        LIMITS_MIN = LAYOUT.varHandle(PathElement.groupElement("limitsMin"));
        LIMITS_MAX = LAYOUT.varHandle(PathElement.groupElement("limitsMax"));
        MAX_FRICTION_FORCE = LAYOUT.varHandle(PathElement.groupElement("maxFrictionForce"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        AUTO_DETECT_POINT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("autoDetectPoint"));
        POINT1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
        SLIDER_AXIS1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sliderAxis1"));
        NORMAL_AXIS1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalAxis1"));
        POINT2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
        SLIDER_AXIS2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sliderAxis2"));
        NORMAL_AXIS2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalAxis2"));
        LIMITS_MIN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsMin"));
        LIMITS_MAX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsMax"));
        LIMITS_SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
        MAX_FRICTION_FORCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFrictionForce"));
        MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSettings"));
        //@formatter:on
    }

    public SliderConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public SliderConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SliderConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        point1 = new Vec3(segment.asSlice(POINT1_OFFSET, Vec3.LAYOUT));
        sliderAxis1 = new Vec3(segment.asSlice(SLIDER_AXIS1_OFFSET, Vec3.LAYOUT));
        normalAxis1 = new Vec3(segment.asSlice(NORMAL_AXIS1_OFFSET, Vec3.LAYOUT));
        point2 = new Vec3(segment.asSlice(POINT2_OFFSET, Vec3.LAYOUT));
        sliderAxis2 = new Vec3(segment.asSlice(SLIDER_AXIS2_OFFSET, Vec3.LAYOUT));
        normalAxis2 = new Vec3(segment.asSlice(NORMAL_AXIS2_OFFSET, Vec3.LAYOUT));
        limitsSpringSettings = new SpringSettings(segment.asSlice(LIMITS_SPRING_SETTINGS_OFFSET, SpringSettings.LAYOUT));
        motorSettings = new MotorSettings(segment.asSlice(MOTOR_SETTINGS_OFFSET, MotorSettings.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_INIT.get();
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
    
    public static void setSliderAxis(
        MemorySegment settings, 
        MemorySegment axis
    ) {
        MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS.get();
        try {
            method.invokeExact(
                settings, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setSliderAxis}.
     */
    public final void setSliderAxis(
        Vec3 axis
    ) {
        setSliderAxis(
            this.segment, 
            axis.memorySegment()
        );
    }
    
    public SliderConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public SliderConstraintSettings autoDetectPoint(boolean autoDetectPoint) {
        AUTO_DETECT_POINT.set(segment, 0L, autoDetectPoint);
        return this;
    }
    
    public boolean autoDetectPoint() {
        return (boolean) AUTO_DETECT_POINT.get(segment, 0L);
    }
    
    public SliderConstraintSettings limitsMin(float limitsMin) {
        LIMITS_MIN.set(segment, 0L, limitsMin);
        return this;
    }
    
    public float limitsMin() {
        return (float) LIMITS_MIN.get(segment, 0L);
    }
    
    public SliderConstraintSettings limitsMax(float limitsMax) {
        LIMITS_MAX.set(segment, 0L, limitsMax);
        return this;
    }
    
    public float limitsMax() {
        return (float) LIMITS_MAX.get(segment, 0L);
    }
    
    public SliderConstraintSettings maxFrictionForce(float maxFrictionForce) {
        MAX_FRICTION_FORCE.set(segment, 0L, maxFrictionForce);
        return this;
    }
    
    public float maxFrictionForce() {
        return (float) MAX_FRICTION_FORCE.get(segment, 0L);
    }
    
    public SliderConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public SliderConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public SliderConstraintSettings point1(Consumer<Vec3> consumer) {
        consumer.accept(point1);
        return this;
    }
    
    public SliderConstraintSettings point1(Vec3 other) {
        point1.set(other);
        return this;
    }
    
    public Vec3 point1() {
        return point1;
    }
    
    public SliderConstraintSettings sliderAxis1(Consumer<Vec3> consumer) {
        consumer.accept(sliderAxis1);
        return this;
    }
    
    public SliderConstraintSettings sliderAxis1(Vec3 other) {
        sliderAxis1.set(other);
        return this;
    }
    
    public Vec3 sliderAxis1() {
        return sliderAxis1;
    }
    
    public SliderConstraintSettings normalAxis1(Consumer<Vec3> consumer) {
        consumer.accept(normalAxis1);
        return this;
    }
    
    public SliderConstraintSettings normalAxis1(Vec3 other) {
        normalAxis1.set(other);
        return this;
    }
    
    public Vec3 normalAxis1() {
        return normalAxis1;
    }
    
    public SliderConstraintSettings point2(Consumer<Vec3> consumer) {
        consumer.accept(point2);
        return this;
    }
    
    public SliderConstraintSettings point2(Vec3 other) {
        point2.set(other);
        return this;
    }
    
    public Vec3 point2() {
        return point2;
    }
    
    public SliderConstraintSettings sliderAxis2(Consumer<Vec3> consumer) {
        consumer.accept(sliderAxis2);
        return this;
    }
    
    public SliderConstraintSettings sliderAxis2(Vec3 other) {
        sliderAxis2.set(other);
        return this;
    }
    
    public Vec3 sliderAxis2() {
        return sliderAxis2;
    }
    
    public SliderConstraintSettings normalAxis2(Consumer<Vec3> consumer) {
        consumer.accept(normalAxis2);
        return this;
    }
    
    public SliderConstraintSettings normalAxis2(Vec3 other) {
        normalAxis2.set(other);
        return this;
    }
    
    public Vec3 normalAxis2() {
        return normalAxis2;
    }
    
    public SliderConstraintSettings limitsSpringSettings(Consumer<SpringSettings> consumer) {
        consumer.accept(limitsSpringSettings);
        return this;
    }
    
    public SliderConstraintSettings limitsSpringSettings(SpringSettings other) {
        limitsSpringSettings.set(other);
        return this;
    }
    
    public SpringSettings limitsSpringSettings() {
        return limitsSpringSettings;
    }
    
    public SliderConstraintSettings motorSettings(Consumer<MotorSettings> consumer) {
        consumer.accept(motorSettings);
        return this;
    }
    
    public SliderConstraintSettings motorSettings(MotorSettings other) {
        motorSettings.set(other);
        return this;
    }
    
    public MotorSettings motorSettings() {
        return motorSettings;
    }
    
    @Override
    public SliderConstraintSettings set(SliderConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public SliderConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SliderConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SliderConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SliderConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<SliderConstraintSettings> array(Arena arena, SliderConstraintSettings... structs) {
        NativeStructArray<SliderConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SliderConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SliderConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SliderConstraintSettings(segment)
        );
    }
    
}