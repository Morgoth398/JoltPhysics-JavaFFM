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
public final class SixDOFConstraintSettings
		implements Struct<SixDOFConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_INIT;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FREE_AXIS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FREE_AXIS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FIXED_AXIS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FIXED_AXIS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_LIMITED_AXIS;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE;
    public static final VarHandle MAX_FRICTION;
    public static final VarHandle SWING_TYPE;
    public static final VarHandle LIMIT_MIN;
    public static final VarHandle LIMIT_MAX;

    public static final long BASE_OFFSET;
    public static final long SPACE_OFFSET;
    public static final long POSITION1_OFFSET;
    public static final long AXIS_X1_OFFSET;
    public static final long AXIS_Y1_OFFSET;
    public static final long POSITION2_OFFSET;
    public static final long AXIS_X2_OFFSET;
    public static final long AXIS_Y2_OFFSET;
    public static final long MAX_FRICTION_OFFSET;
    public static final long SWING_TYPE_OFFSET;
    public static final long LIMIT_MIN_OFFSET;
    public static final long LIMIT_MAX_OFFSET;
    public static final long LIMITS_SPRING_SETTINGS_OFFSET;
    public static final long MOTOR_SETTINGS_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 position1;
    private final Vec3 axisX1;
    private final Vec3 axisY1;
    private final Vec3 position2;
    private final Vec3 axisX2;
    private final Vec3 axisY2;
    private final SpringSettings[] limitsSpringSettings;
    private final MotorSettings[] motorSettings;

    static {
        //@formatter:off
        JPH_SIX_DOFCONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_SixDOFConstraintSettings_Init", UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FREE_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_MakeFreeAxis", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FREE_AXIS = downcallHandle("JPH_SixDOFConstraintSettings_IsFreeAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FIXED_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_MakeFixedAxis", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FIXED_AXIS = downcallHandle("JPH_SixDOFConstraintSettings_IsFixedAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_LIMITED_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetLimitedAxis", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
        
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            JAVA_INT.withName("space"),
            Vec3.LAYOUT.withName("position1"),
            Vec3.LAYOUT.withName("axisX1"),
            Vec3.LAYOUT.withName("axisY1"),
            Vec3.LAYOUT.withName("position2"),
            Vec3.LAYOUT.withName("axisX2"),
            Vec3.LAYOUT.withName("axisY2"),
            MemoryLayout.sequenceLayout(6, JAVA_FLOAT).withName("maxFriction"),
            JAVA_INT.withName("swingType"),
            MemoryLayout.sequenceLayout(6, JAVA_FLOAT).withName("limitMin"),
            MemoryLayout.sequenceLayout(6, JAVA_FLOAT).withName("limitMax"),
            MemoryLayout.sequenceLayout(3, SpringSettings.LAYOUT).withName("limitsSpringSettings"),
            MemoryLayout.sequenceLayout(6, MotorSettings.LAYOUT).withName("motorSettings"),
            MemoryLayout.paddingLayout(4)
        ).withName("JPH_SixDOFConstraintSettings").withByteAlignment(8);
        
        SPACE = LAYOUT.varHandle(PathElement.groupElement("space"));
        MAX_FRICTION = LAYOUT.varHandle(PathElement.groupElement("maxFriction"), PathElement.sequenceElement());
        SWING_TYPE = LAYOUT.varHandle(PathElement.groupElement("swingType"));
        LIMIT_MIN = LAYOUT.varHandle(PathElement.groupElement("limitMin"), PathElement.sequenceElement());
        LIMIT_MAX = LAYOUT.varHandle(PathElement.groupElement("limitMax"), PathElement.sequenceElement());
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        POSITION1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position1"));
        AXIS_X1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX1"));
        AXIS_Y1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY1"));
        POSITION2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position2"));
        AXIS_X2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX2"));
        AXIS_Y2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY2"));
        MAX_FRICTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFriction"));
        SWING_TYPE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swingType"));
        LIMIT_MIN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitMin"));
        LIMIT_MAX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitMax"));
        LIMITS_SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
        MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSettings"));
        //@formatter:on
    }

    public SixDOFConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public SixDOFConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SixDOFConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        position1 = new Vec3(segment.asSlice(POSITION1_OFFSET, Vec3.LAYOUT));
        axisX1 = new Vec3(segment.asSlice(AXIS_X1_OFFSET, Vec3.LAYOUT));
        axisY1 = new Vec3(segment.asSlice(AXIS_Y1_OFFSET, Vec3.LAYOUT));
        position2 = new Vec3(segment.asSlice(POSITION2_OFFSET, Vec3.LAYOUT));
        axisX2 = new Vec3(segment.asSlice(AXIS_X2_OFFSET, Vec3.LAYOUT));
        axisY2 = new Vec3(segment.asSlice(AXIS_Y2_OFFSET, Vec3.LAYOUT));
    
        limitsSpringSettings = new SpringSettings[3];
        for (int i = 0; i < 3; i++) {
            long offset = LIMITS_SPRING_SETTINGS_OFFSET + i * SpringSettings.LAYOUT.byteSize();
            limitsSpringSettings[i] = new SpringSettings(segment.asSlice(offset, SpringSettings.LAYOUT));
        }
    
    
        motorSettings = new MotorSettings[6];
        for (int i = 0; i < 6; i++) {
            long offset = MOTOR_SETTINGS_OFFSET + i * MotorSettings.LAYOUT.byteSize();
            motorSettings[i] = new MotorSettings(segment.asSlice(offset, MotorSettings.LAYOUT));
        }
    
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_INIT.get();
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
    
    public static void makeFreeAxis(
        MemorySegment settings, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FREE_AXIS.get();
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
     * Typed method of {@link #makeFreeAxis}.
     */
    public final void makeFreeAxis(
        int axis
    ) {
        makeFreeAxis(
            this.segment, 
            axis
        );
    }
    
    public static boolean isFreeAxis(
        MemorySegment settings, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FREE_AXIS.get();
        try {
            return (boolean) method.invokeExact(
                settings, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isFreeAxis}.
     */
    public final boolean isFreeAxis(
        int axis
    ) {
        return (boolean) isFreeAxis(
            this.segment, 
            axis
        );
    }
    
    public static void makeFixedAxis(
        MemorySegment settings, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FIXED_AXIS.get();
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
     * Typed method of {@link #makeFixedAxis}.
     */
    public final void makeFixedAxis(
        int axis
    ) {
        makeFixedAxis(
            this.segment, 
            axis
        );
    }
    
    public static boolean isFixedAxis(
        MemorySegment settings, 
        int axis
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FIXED_AXIS.get();
        try {
            return (boolean) method.invokeExact(
                settings, 
                axis
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isFixedAxis}.
     */
    public final boolean isFixedAxis(
        int axis
    ) {
        return (boolean) isFixedAxis(
            this.segment, 
            axis
        );
    }
    
    public static void setLimitedAxis(
        MemorySegment settings, 
        int axis, 
        float min, 
        float max
    ) {
        MethodHandle method = JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_LIMITED_AXIS.get();
        try {
            method.invokeExact(
                settings, 
                axis, 
                min, 
                max
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLimitedAxis}.
     */
    public final void setLimitedAxis(
        int axis, 
        float min, 
        float max
    ) {
        setLimitedAxis(
            this.segment, 
            axis, 
            min, 
            max
        );
    }
    
    public SixDOFConstraintSettings space(int space) {
        SPACE.set(segment, 0L, space);
        return this;
    }
    
    public int space() {
        return (int) SPACE.get(segment, 0L);
    }
    
    public SixDOFConstraintSettings maxFriction(float maxFriction, long index) {
        MAX_FRICTION.set(segment, 0L, index, maxFriction);
        return this;
    }
    
    public float maxFriction(long index) {
        return (float) MAX_FRICTION.get(segment, 0L, index);
    }
    
    public SixDOFConstraintSettings swingType(int swingType) {
        SWING_TYPE.set(segment, 0L, swingType);
        return this;
    }
    
    public int swingType() {
        return (int) SWING_TYPE.get(segment, 0L);
    }
    
    public SixDOFConstraintSettings limitMin(float limitMin, long index) {
        LIMIT_MIN.set(segment, 0L, index, limitMin);
        return this;
    }
    
    public float limitMin(long index) {
        return (float) LIMIT_MIN.get(segment, 0L, index);
    }
    
    public SixDOFConstraintSettings limitMax(float limitMax, long index) {
        LIMIT_MAX.set(segment, 0L, index, limitMax);
        return this;
    }
    
    public float limitMax(long index) {
        return (float) LIMIT_MAX.get(segment, 0L, index);
    }
    
    public SixDOFConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public SixDOFConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public SixDOFConstraintSettings position1(Consumer<Vec3> consumer) {
        consumer.accept(position1);
        return this;
    }
    
    public SixDOFConstraintSettings position1(Vec3 other) {
        position1.set(other);
        return this;
    }
    
    public Vec3 position1() {
        return position1;
    }
    
    public SixDOFConstraintSettings axisX1(Consumer<Vec3> consumer) {
        consumer.accept(axisX1);
        return this;
    }
    
    public SixDOFConstraintSettings axisX1(Vec3 other) {
        axisX1.set(other);
        return this;
    }
    
    public Vec3 axisX1() {
        return axisX1;
    }
    
    public SixDOFConstraintSettings axisY1(Consumer<Vec3> consumer) {
        consumer.accept(axisY1);
        return this;
    }
    
    public SixDOFConstraintSettings axisY1(Vec3 other) {
        axisY1.set(other);
        return this;
    }
    
    public Vec3 axisY1() {
        return axisY1;
    }
    
    public SixDOFConstraintSettings position2(Consumer<Vec3> consumer) {
        consumer.accept(position2);
        return this;
    }
    
    public SixDOFConstraintSettings position2(Vec3 other) {
        position2.set(other);
        return this;
    }
    
    public Vec3 position2() {
        return position2;
    }
    
    public SixDOFConstraintSettings axisX2(Consumer<Vec3> consumer) {
        consumer.accept(axisX2);
        return this;
    }
    
    public SixDOFConstraintSettings axisX2(Vec3 other) {
        axisX2.set(other);
        return this;
    }
    
    public Vec3 axisX2() {
        return axisX2;
    }
    
    public SixDOFConstraintSettings axisY2(Consumer<Vec3> consumer) {
        consumer.accept(axisY2);
        return this;
    }
    
    public SixDOFConstraintSettings axisY2(Vec3 other) {
        axisY2.set(other);
        return this;
    }
    
    public Vec3 axisY2() {
        return axisY2;
    }
    
    public SixDOFConstraintSettings limitsSpringSettings(Consumer<SpringSettings> consumer, int index) {
        consumer.accept(limitsSpringSettings[index]);
        return this;
    }
    
    public SixDOFConstraintSettings limitsSpringSettings(SpringSettings other, int index) {
        limitsSpringSettings[index].set(other);
        return this;
    }
    
    public SpringSettings limitsSpringSettings(int index) {
        return limitsSpringSettings[index];
    }
    
    public SixDOFConstraintSettings motorSettings(Consumer<MotorSettings> consumer, int index) {
        consumer.accept(motorSettings[index]);
        return this;
    }
    
    public SixDOFConstraintSettings motorSettings(MotorSettings other, int index) {
        motorSettings[index].set(other);
        return this;
    }
    
    public MotorSettings motorSettings(int index) {
        return motorSettings[index];
    }
    
    @Override
    public SixDOFConstraintSettings set(SixDOFConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public SixDOFConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SixDOFConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SixDOFConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SixDOFConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<SixDOFConstraintSettings> array(Arena arena, SixDOFConstraintSettings... structs) {
        NativeStructArray<SixDOFConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SixDOFConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SixDOFConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SixDOFConstraintSettings(segment)
        );
    }
    
}