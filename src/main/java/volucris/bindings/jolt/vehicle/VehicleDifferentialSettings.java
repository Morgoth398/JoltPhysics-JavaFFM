/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class VehicleDifferentialSettings
		implements Struct<VehicleDifferentialSettings> {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle LEFT_WHEEL;
    public static final VarHandle RIGHT_WHEEL;
    public static final VarHandle DIFFERENTIAL_RATIO;
    public static final VarHandle LEFT_RIGHT_SPLIT;
    public static final VarHandle LIMITED_SLIP_RATIO;
    public static final VarHandle ENGINE_TORQUE_RATIO;

    public static final long LEFT_WHEEL_OFFSET;
    public static final long RIGHT_WHEEL_OFFSET;
    public static final long DIFFERENTIAL_RATIO_OFFSET;
    public static final long LEFT_RIGHT_SPLIT_OFFSET;
    public static final long LIMITED_SLIP_RATIO_OFFSET;
    public static final long ENGINE_TORQUE_RATIO_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("leftWheel"),
            JAVA_INT.withName("rightWheel"),
            JAVA_FLOAT.withName("differentialRatio"),
            JAVA_FLOAT.withName("leftRightSplit"),
            JAVA_FLOAT.withName("limitedSlipRatio"),
            JAVA_FLOAT.withName("engineTorqueRatio")
        ).withName("JPH_VehicleDifferentialSettings").withByteAlignment(4);
        
        JPH_VEHICLE_DIFFERENTIAL_SETTINGS_INIT = downcallHandleVoid("JPH_VehicleDifferentialSettings_Init", UNBOUNDED_ADDRESS);
        
        LEFT_WHEEL = LAYOUT.varHandle(PathElement.groupElement("leftWheel"));
        RIGHT_WHEEL = LAYOUT.varHandle(PathElement.groupElement("rightWheel"));
        DIFFERENTIAL_RATIO = LAYOUT.varHandle(PathElement.groupElement("differentialRatio"));
        LEFT_RIGHT_SPLIT = LAYOUT.varHandle(PathElement.groupElement("leftRightSplit"));
        LIMITED_SLIP_RATIO = LAYOUT.varHandle(PathElement.groupElement("limitedSlipRatio"));
        ENGINE_TORQUE_RATIO = LAYOUT.varHandle(PathElement.groupElement("engineTorqueRatio"));
        
        LEFT_WHEEL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leftWheel"));
        RIGHT_WHEEL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rightWheel"));
        DIFFERENTIAL_RATIO_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("differentialRatio"));
        LEFT_RIGHT_SPLIT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leftRightSplit"));
        LIMITED_SLIP_RATIO_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitedSlipRatio"));
        ENGINE_TORQUE_RATIO_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("engineTorqueRatio"));
        //@formatter:on
    }

    public VehicleDifferentialSettings() {
        this(Arena.ofAuto());
    }
    
    public VehicleDifferentialSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VehicleDifferentialSettings(MemorySegment segment) {
        this.segment = segment;
    
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_INIT.get();
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
    
    public VehicleDifferentialSettings leftWheel(int leftWheel) {
        LEFT_WHEEL.set(segment, 0L, leftWheel);
        return this;
    }
    
    public int leftWheel() {
        return (int) LEFT_WHEEL.get(segment, 0L);
    }
    
    public VehicleDifferentialSettings rightWheel(int rightWheel) {
        RIGHT_WHEEL.set(segment, 0L, rightWheel);
        return this;
    }
    
    public int rightWheel() {
        return (int) RIGHT_WHEEL.get(segment, 0L);
    }
    
    public VehicleDifferentialSettings differentialRatio(float differentialRatio) {
        DIFFERENTIAL_RATIO.set(segment, 0L, differentialRatio);
        return this;
    }
    
    public float differentialRatio() {
        return (float) DIFFERENTIAL_RATIO.get(segment, 0L);
    }
    
    public VehicleDifferentialSettings leftRightSplit(float leftRightSplit) {
        LEFT_RIGHT_SPLIT.set(segment, 0L, leftRightSplit);
        return this;
    }
    
    public float leftRightSplit() {
        return (float) LEFT_RIGHT_SPLIT.get(segment, 0L);
    }
    
    public VehicleDifferentialSettings limitedSlipRatio(float limitedSlipRatio) {
        LIMITED_SLIP_RATIO.set(segment, 0L, limitedSlipRatio);
        return this;
    }
    
    public float limitedSlipRatio() {
        return (float) LIMITED_SLIP_RATIO.get(segment, 0L);
    }
    
    public VehicleDifferentialSettings engineTorqueRatio(float engineTorqueRatio) {
        ENGINE_TORQUE_RATIO.set(segment, 0L, engineTorqueRatio);
        return this;
    }
    
    public float engineTorqueRatio() {
        return (float) ENGINE_TORQUE_RATIO.get(segment, 0L);
    }
    
    @Override
    public VehicleDifferentialSettings set(VehicleDifferentialSettings other) {
        return set(other.segment);
    }
    
    @Override
    public VehicleDifferentialSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VehicleDifferentialSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VehicleDifferentialSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleDifferentialSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<VehicleDifferentialSettings> array(Arena arena, VehicleDifferentialSettings... structs) {
        NativeStructArray<VehicleDifferentialSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleDifferentialSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VehicleDifferentialSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VehicleDifferentialSettings(segment)
        );
    }
    
}