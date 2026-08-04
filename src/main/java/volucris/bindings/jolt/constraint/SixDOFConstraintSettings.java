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

public final class SixDOFConstraintSettings
		implements Struct<SixDOFConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_INIT;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FREE_AXIS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FREE_AXIS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FIXED_AXIS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FIXED_AXIS;
    private static final LazyConstant<MethodHandle> JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_LIMITED_AXIS;

    public static final StructLayout LAYOUT;

    public static final VarHandle SPACE_HANDLE;
    public static final VarHandle MAX_FRICTION_HANDLE;
    public static final VarHandle SWING_TYPE_HANDLE;
    public static final VarHandle LIMIT_MIN_HANDLE;
    public static final VarHandle LIMIT_MAX_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long SPACE_BYTE_OFFSET;
    public static final long POSITION1_BYTE_OFFSET;
    public static final long AXIS_X1_BYTE_OFFSET;
    public static final long AXIS_Y1_BYTE_OFFSET;
    public static final long POSITION2_BYTE_OFFSET;
    public static final long AXIS_X2_BYTE_OFFSET;
    public static final long AXIS_Y2_BYTE_OFFSET;
    public static final long MAX_FRICTION_BYTE_OFFSET;
    public static final long SWING_TYPE_BYTE_OFFSET;
    public static final long LIMIT_MIN_BYTE_OFFSET;
    public static final long LIMIT_MAX_BYTE_OFFSET;
    public static final long LIMITS_SPRING_SETTINGS_BYTE_OFFSET;
    public static final long MOTOR_SETTINGS_BYTE_OFFSET;

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
        
        JPH_SIX_DOFCONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_SixDOFConstraintSettings_Init", UNBOUNDED_ADDRESS);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FREE_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_MakeFreeAxis", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FREE_AXIS = downcallHandle("JPH_SixDOFConstraintSettings_IsFreeAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_MAKE_FIXED_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_MakeFixedAxis", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_IS_FIXED_AXIS = downcallHandle("JPH_SixDOFConstraintSettings_IsFixedAxis", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SIX_DOFCONSTRAINT_SETTINGS_SET_LIMITED_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetLimitedAxis", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
        
        SPACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("space"));
        MAX_FRICTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFriction"), PathElement.sequenceElement());
        SWING_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swingType"));
        LIMIT_MIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("limitMin"), PathElement.sequenceElement());
        LIMIT_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("limitMax"), PathElement.sequenceElement());
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        SPACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("space"));
        POSITION1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position1"));
        AXIS_X1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX1"));
        AXIS_Y1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY1"));
        POSITION2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position2"));
        AXIS_X2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX2"));
        AXIS_Y2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY2"));
        MAX_FRICTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFriction"));
        SWING_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swingType"));
        LIMIT_MIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitMin"));
        LIMIT_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitMax"));
        LIMITS_SPRING_SETTINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
        MOTOR_SETTINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSettings"));
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
    
        base = new ConstraintSettings(segment.asSlice(BASE_BYTE_OFFSET, ConstraintSettings.LAYOUT));
        position1 = new Vec3(segment.asSlice(POSITION1_BYTE_OFFSET, Vec3.LAYOUT));
        axisX1 = new Vec3(segment.asSlice(AXIS_X1_BYTE_OFFSET, Vec3.LAYOUT));
        axisY1 = new Vec3(segment.asSlice(AXIS_Y1_BYTE_OFFSET, Vec3.LAYOUT));
        position2 = new Vec3(segment.asSlice(POSITION2_BYTE_OFFSET, Vec3.LAYOUT));
        axisX2 = new Vec3(segment.asSlice(AXIS_X2_BYTE_OFFSET, Vec3.LAYOUT));
        axisY2 = new Vec3(segment.asSlice(AXIS_Y2_BYTE_OFFSET, Vec3.LAYOUT));
        limitsSpringSettings = new SpringSettings[3];
        for (int i = 0; i < 3; i++) {
            long offset = LIMITS_SPRING_SETTINGS_BYTE_OFFSET + i * SpringSettings.LAYOUT.byteSize();
            limitsSpringSettings[i] = new SpringSettings(segment.asSlice(offset, SpringSettings.LAYOUT));
        }
    
        motorSettings = new MotorSettings[6];
        for (int i = 0; i < 6; i++) {
            long offset = MOTOR_SETTINGS_BYTE_OFFSET + i * MotorSettings.LAYOUT.byteSize();
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
    
    /// Typed method of [#init].
    public final void init() {
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
    
    /// Typed method of [#makeFreeAxis].
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
    
    /// Typed method of [#isFreeAxis].
    public final boolean isFreeAxis(
    	int axis
    ) {
    	return isFreeAxis(
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
    
    /// Typed method of [#makeFixedAxis].
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
    
    /// Typed method of [#isFixedAxis].
    public final boolean isFixedAxis(
    	int axis
    ) {
    	return isFixedAxis(
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
    
    /// Typed method of [#setLimitedAxis].
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
    
    /// @see #space()
    public SixDOFConstraintSettings space(int space) {
    	SPACE_HANDLE.set(segment, 0L, space);
    	return this;
    }
    
    public int space() {
    	return (int) SPACE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFriction(int)
    public SixDOFConstraintSettings maxFriction(float maxFriction, int index0) {
    	MAX_FRICTION_HANDLE.set(segment, 0L, index0, maxFriction);
    	return this;
    }
    
    public float maxFriction(int index0) {
    	return (float) MAX_FRICTION_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #swingType()
    public SixDOFConstraintSettings swingType(int swingType) {
    	SWING_TYPE_HANDLE.set(segment, 0L, swingType);
    	return this;
    }
    
    public int swingType() {
    	return (int) SWING_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #limitMin(int)
    public SixDOFConstraintSettings limitMin(float limitMin, int index0) {
    	LIMIT_MIN_HANDLE.set(segment, 0L, index0, limitMin);
    	return this;
    }
    
    public float limitMin(int index0) {
    	return (float) LIMIT_MIN_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #limitMax(int)
    public SixDOFConstraintSettings limitMax(float limitMax, int index0) {
    	LIMIT_MAX_HANDLE.set(segment, 0L, index0, limitMax);
    	return this;
    }
    
    public float limitMax(int index0) {
    	return (float) LIMIT_MAX_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #base()
    public SixDOFConstraintSettings base(Consumer<ConstraintSettings> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public SixDOFConstraintSettings base(ConstraintSettings other) {
    	base.set(other);
    	return this;
    }
    
    public ConstraintSettings base() {
    	return base;
    }
    
    /// @see #position1()
    public SixDOFConstraintSettings position1(Consumer<Vec3> consumer) {
    	consumer.accept(position1);
    	return this;
    }
    
    /// @see #position1()
    public SixDOFConstraintSettings position1(Vec3 other) {
    	position1.set(other);
    	return this;
    }
    
    public Vec3 position1() {
    	return position1;
    }
    
    /// @see #axisX1()
    public SixDOFConstraintSettings axisX1(Consumer<Vec3> consumer) {
    	consumer.accept(axisX1);
    	return this;
    }
    
    /// @see #axisX1()
    public SixDOFConstraintSettings axisX1(Vec3 other) {
    	axisX1.set(other);
    	return this;
    }
    
    public Vec3 axisX1() {
    	return axisX1;
    }
    
    /// @see #axisY1()
    public SixDOFConstraintSettings axisY1(Consumer<Vec3> consumer) {
    	consumer.accept(axisY1);
    	return this;
    }
    
    /// @see #axisY1()
    public SixDOFConstraintSettings axisY1(Vec3 other) {
    	axisY1.set(other);
    	return this;
    }
    
    public Vec3 axisY1() {
    	return axisY1;
    }
    
    /// @see #position2()
    public SixDOFConstraintSettings position2(Consumer<Vec3> consumer) {
    	consumer.accept(position2);
    	return this;
    }
    
    /// @see #position2()
    public SixDOFConstraintSettings position2(Vec3 other) {
    	position2.set(other);
    	return this;
    }
    
    public Vec3 position2() {
    	return position2;
    }
    
    /// @see #axisX2()
    public SixDOFConstraintSettings axisX2(Consumer<Vec3> consumer) {
    	consumer.accept(axisX2);
    	return this;
    }
    
    /// @see #axisX2()
    public SixDOFConstraintSettings axisX2(Vec3 other) {
    	axisX2.set(other);
    	return this;
    }
    
    public Vec3 axisX2() {
    	return axisX2;
    }
    
    /// @see #axisY2()
    public SixDOFConstraintSettings axisY2(Consumer<Vec3> consumer) {
    	consumer.accept(axisY2);
    	return this;
    }
    
    /// @see #axisY2()
    public SixDOFConstraintSettings axisY2(Vec3 other) {
    	axisY2.set(other);
    	return this;
    }
    
    public Vec3 axisY2() {
    	return axisY2;
    }
    
    /// @see #limitsSpringSettings(int)
    public SixDOFConstraintSettings limitsSpringSettings(Consumer<SpringSettings> consumer, int index) {
    	consumer.accept(limitsSpringSettings[index]);
    	return this;
    }
    
    /// @see #limitsSpringSettings(int)
    public SixDOFConstraintSettings limitsSpringSettings(SpringSettings other, int index) {
    	limitsSpringSettings[index].set(other);
    	return this;
    }
    
    public SpringSettings limitsSpringSettings(int index) {
    	return limitsSpringSettings[index];
    }
    
    /// @see #motorSettings(int)
    public SixDOFConstraintSettings motorSettings(Consumer<MotorSettings> consumer, int index) {
    	consumer.accept(motorSettings[index]);
    	return this;
    }
    
    /// @see #motorSettings(int)
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