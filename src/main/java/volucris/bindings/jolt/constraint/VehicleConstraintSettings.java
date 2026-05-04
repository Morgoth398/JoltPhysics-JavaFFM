/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.vehicle.VehicleAntiRollBar;
import volucris.bindings.jolt.vehicle.VehicleControllerSettings;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class VehicleConstraintSettings
		implements Struct<VehicleConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_PITCH_ROLL_ANGLE;
    public static final VarHandle WHEELS_COUNT;
    public static final VarHandle WHEELS;
    public static final VarHandle ANTI_ROLL_BARS_COUNT;
    public static final VarHandle ANTI_ROLL_BARS;
    public static final VarHandle CONTROLLER;

    public static final long BASE_OFFSET;
    public static final long UP_OFFSET;
    public static final long FORWARD_OFFSET;
    public static final long MAX_PITCH_ROLL_ANGLE_OFFSET;
    public static final long WHEELS_COUNT_OFFSET;
    public static final long WHEELS_OFFSET;
    public static final long ANTI_ROLL_BARS_COUNT_OFFSET;
    public static final long ANTI_ROLL_BARS_OFFSET;
    public static final long CONTROLLER_OFFSET;

    private final MemorySegment segment;

    private final ConstraintSettings base;
    private final Vec3 up;
    private final Vec3 forward;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            ConstraintSettings.LAYOUT.withName("base"),
            Vec3.LAYOUT.withName("up"),
            Vec3.LAYOUT.withName("forward"),
            JAVA_FLOAT.withName("maxPitchRollAngle"),
            JAVA_INT.withName("wheelsCount"),
            UNBOUNDED_ADDRESS.withName("wheels"),
            JAVA_INT.withName("antiRollBarsCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("antiRollBars"),
            UNBOUNDED_ADDRESS.withName("controller")
        ).withName("JPH_VehicleConstraintSettings").withByteAlignment(8);
        
        JPH_VEHICLE_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_VehicleConstraintSettings_Init", UNBOUNDED_ADDRESS);
        
        MAX_PITCH_ROLL_ANGLE = LAYOUT.varHandle(PathElement.groupElement("maxPitchRollAngle"));
        WHEELS_COUNT = LAYOUT.varHandle(PathElement.groupElement("wheelsCount"));
        WHEELS = LAYOUT.varHandle(PathElement.groupElement("wheels"));
        ANTI_ROLL_BARS_COUNT = LAYOUT.varHandle(PathElement.groupElement("antiRollBarsCount"));
        ANTI_ROLL_BARS = LAYOUT.varHandle(PathElement.groupElement("antiRollBars"));
        CONTROLLER = LAYOUT.varHandle(PathElement.groupElement("controller"));
        
        BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        UP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("up"));
        FORWARD_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("forward"));
        MAX_PITCH_ROLL_ANGLE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPitchRollAngle"));
        WHEELS_COUNT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wheelsCount"));
        WHEELS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wheels"));
        ANTI_ROLL_BARS_COUNT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("antiRollBarsCount"));
        ANTI_ROLL_BARS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("antiRollBars"));
        CONTROLLER_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("controller"));
        //@formatter:on
    }

    public VehicleConstraintSettings() {
        this(Arena.ofAuto());
    }
    
    public VehicleConstraintSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VehicleConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
        base = new ConstraintSettings(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT));
        up = new Vec3(segment.asSlice(UP_OFFSET, Vec3.LAYOUT));
        forward = new Vec3(segment.asSlice(FORWARD_OFFSET, Vec3.LAYOUT));
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_INIT.get();
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
    
    public VehicleConstraintSettings maxPitchRollAngle(float maxPitchRollAngle) {
        MAX_PITCH_ROLL_ANGLE.set(segment, 0L, maxPitchRollAngle);
        return this;
    }
    
    public float maxPitchRollAngle() {
        return (float) MAX_PITCH_ROLL_ANGLE.get(segment, 0L);
    }
    
    public VehicleConstraintSettings wheelsCount(int wheelsCount) {
        WHEELS_COUNT.set(segment, 0L, wheelsCount);
        return this;
    }
    
    public int wheelsCount() {
        return (int) WHEELS_COUNT.get(segment, 0L);
    }
    
    public VehicleConstraintSettings wheels(NativePointerArray wheels) {
        WHEELS.set(segment, 0L, wheels.memorySegment());
        return this;
    }
    
    public @Nullable NativePointerArray wheels() {
        MemorySegment segment = (MemorySegment) WHEELS.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new NativePointerArray(segment);
    }
    
    public VehicleConstraintSettings antiRollBarsCount(int antiRollBarsCount) {
        ANTI_ROLL_BARS_COUNT.set(segment, 0L, antiRollBarsCount);
        return this;
    }
    
    public int antiRollBarsCount() {
        return (int) ANTI_ROLL_BARS_COUNT.get(segment, 0L);
    }
    
    public VehicleConstraintSettings antiRollBars(VehicleAntiRollBar antiRollBars) {
        ANTI_ROLL_BARS.set(segment, 0L, antiRollBars.memorySegment());
        return this;
    }
    
    public @Nullable VehicleAntiRollBar antiRollBars() {
        MemorySegment segment = (MemorySegment) ANTI_ROLL_BARS.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new VehicleAntiRollBar(segment);
    }
    
    public VehicleConstraintSettings controller(VehicleControllerSettings controller) {
        CONTROLLER.set(segment, 0L, controller.memorySegment());
        return this;
    }
    
    public @Nullable VehicleControllerSettings controller() {
        MemorySegment segment = (MemorySegment) CONTROLLER.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new VehicleControllerSettings(segment);
    }
    
    public VehicleConstraintSettings base(Consumer<ConstraintSettings> consumer) {
        consumer.accept(base);
        return this;
    }
    
    public VehicleConstraintSettings base(ConstraintSettings other) {
        base.set(other);
        return this;
    }
    
    public ConstraintSettings base() {
        return base;
    }
    
    public VehicleConstraintSettings up(Consumer<Vec3> consumer) {
        consumer.accept(up);
        return this;
    }
    
    public VehicleConstraintSettings up(Vec3 other) {
        up.set(other);
        return this;
    }
    
    public Vec3 up() {
        return up;
    }
    
    public VehicleConstraintSettings forward(Consumer<Vec3> consumer) {
        consumer.accept(forward);
        return this;
    }
    
    public VehicleConstraintSettings forward(Vec3 other) {
        forward.set(other);
        return this;
    }
    
    public Vec3 forward() {
        return forward;
    }
    
    @Override
    public VehicleConstraintSettings set(VehicleConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public VehicleConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VehicleConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VehicleConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<VehicleConstraintSettings> array(Arena arena, VehicleConstraintSettings... structs) {
        NativeStructArray<VehicleConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VehicleConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VehicleConstraintSettings(segment)
        );
    }
    
}