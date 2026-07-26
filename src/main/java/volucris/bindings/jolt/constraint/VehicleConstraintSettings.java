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

public final class VehicleConstraintSettings
		implements Struct<VehicleConstraintSettings> {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_PITCH_ROLL_ANGLE_HANDLE;
    public static final VarHandle WHEELS_COUNT_HANDLE;
    public static final VarHandle WHEELS_HANDLE;
    public static final VarHandle ANTI_ROLL_BARS_COUNT_HANDLE;
    public static final VarHandle ANTI_ROLL_BARS_HANDLE;
    public static final VarHandle CONTROLLER_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long UP_BYTE_OFFSET;
    public static final long FORWARD_BYTE_OFFSET;
    public static final long MAX_PITCH_ROLL_ANGLE_BYTE_OFFSET;
    public static final long WHEELS_COUNT_BYTE_OFFSET;
    public static final long WHEELS_BYTE_OFFSET;
    public static final long ANTI_ROLL_BARS_COUNT_BYTE_OFFSET;
    public static final long ANTI_ROLL_BARS_BYTE_OFFSET;
    public static final long CONTROLLER_BYTE_OFFSET;

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
        
        MAX_PITCH_ROLL_ANGLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPitchRollAngle"));
        WHEELS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wheelsCount"));
        WHEELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wheels"));
        ANTI_ROLL_BARS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("antiRollBarsCount"));
        ANTI_ROLL_BARS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("antiRollBars"));
        CONTROLLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("controller"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        UP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("up"));
        FORWARD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("forward"));
        MAX_PITCH_ROLL_ANGLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPitchRollAngle"));
        WHEELS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wheelsCount"));
        WHEELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wheels"));
        ANTI_ROLL_BARS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("antiRollBarsCount"));
        ANTI_ROLL_BARS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("antiRollBars"));
        CONTROLLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("controller"));
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
    
        base = new ConstraintSettings(segment.asSlice(BASE_BYTE_OFFSET, ConstraintSettings.LAYOUT));
        up = new Vec3(segment.asSlice(UP_BYTE_OFFSET, Vec3.LAYOUT));
        forward = new Vec3(segment.asSlice(FORWARD_BYTE_OFFSET, Vec3.LAYOUT));
    
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
    
    /// Typed method of [#init].
    public final void init() {
    	init(
    		this.segment
    	);
    }
    
    /// @see #maxPitchRollAngle()
    public VehicleConstraintSettings maxPitchRollAngle(float maxPitchRollAngle) {
    	MAX_PITCH_ROLL_ANGLE_HANDLE.set(segment, 0L, maxPitchRollAngle);
    	return this;
    }
    
    public float maxPitchRollAngle() {
    	return (float) MAX_PITCH_ROLL_ANGLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #wheelsCount()
    public VehicleConstraintSettings wheelsCount(int wheelsCount) {
    	WHEELS_COUNT_HANDLE.set(segment, 0L, wheelsCount);
    	return this;
    }
    
    public int wheelsCount() {
    	return (int) WHEELS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #wheels()
    public VehicleConstraintSettings wheels(NativePointerArray wheels) {
    	WHEELS_HANDLE.set(segment, 0L, wheels.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray wheels() {
    	MemorySegment segment = (MemorySegment) WHEELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #antiRollBarsCount()
    public VehicleConstraintSettings antiRollBarsCount(int antiRollBarsCount) {
    	ANTI_ROLL_BARS_COUNT_HANDLE.set(segment, 0L, antiRollBarsCount);
    	return this;
    }
    
    public int antiRollBarsCount() {
    	return (int) ANTI_ROLL_BARS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #antiRollBars()
    public VehicleConstraintSettings antiRollBars(VehicleAntiRollBar antiRollBars) {
    	ANTI_ROLL_BARS_HANDLE.set(segment, 0L, antiRollBars.memorySegment());
    	return this;
    }
    
    public @Nullable VehicleAntiRollBar antiRollBars() {
    	MemorySegment segment = (MemorySegment) ANTI_ROLL_BARS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleAntiRollBar(segment);
    }
    
    /// @see #controller()
    public VehicleConstraintSettings controller(VehicleControllerSettings controller) {
    	CONTROLLER_HANDLE.set(segment, 0L, controller.memorySegment());
    	return this;
    }
    
    public @Nullable VehicleControllerSettings controller() {
    	MemorySegment segment = (MemorySegment) CONTROLLER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleControllerSettings(segment);
    }
    
    /// @see #base()
    public VehicleConstraintSettings base(Consumer<ConstraintSettings> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public VehicleConstraintSettings base(ConstraintSettings other) {
    	base.set(other);
    	return this;
    }
    
    public ConstraintSettings base() {
    	return base;
    }
    
    /// @see #up()
    public VehicleConstraintSettings up(Consumer<Vec3> consumer) {
    	consumer.accept(up);
    	return this;
    }
    
    /// @see #up()
    public VehicleConstraintSettings up(Vec3 other) {
    	up.set(other);
    	return this;
    }
    
    public Vec3 up() {
    	return up;
    }
    
    /// @see #forward()
    public VehicleConstraintSettings forward(Consumer<Vec3> consumer) {
    	consumer.accept(forward);
    	return this;
    }
    
    /// @see #forward()
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