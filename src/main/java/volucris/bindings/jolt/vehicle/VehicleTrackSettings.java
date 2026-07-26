/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleTrackSettings
		implements Struct<VehicleTrackSettings> {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle DRIVEN_WHEEL_HANDLE;
    public static final VarHandle WHEELS_HANDLE;
    public static final VarHandle WHEELS_COUNT_HANDLE;
    public static final VarHandle INERTIA_HANDLE;
    public static final VarHandle ANGULAR_DAMPING_HANDLE;
    public static final VarHandle MAX_BRAKE_TORQUE_HANDLE;
    public static final VarHandle DIFFERENTIAL_RATIO_HANDLE;

    public static final long DRIVEN_WHEEL_BYTE_OFFSET;
    public static final long WHEELS_BYTE_OFFSET;
    public static final long WHEELS_COUNT_BYTE_OFFSET;
    public static final long INERTIA_BYTE_OFFSET;
    public static final long ANGULAR_DAMPING_BYTE_OFFSET;
    public static final long MAX_BRAKE_TORQUE_BYTE_OFFSET;
    public static final long DIFFERENTIAL_RATIO_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("drivenWheel"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("wheels"),
            JAVA_INT.withName("wheelsCount"),
            JAVA_FLOAT.withName("inertia"),
            JAVA_FLOAT.withName("angularDamping"),
            JAVA_FLOAT.withName("maxBrakeTorque"),
            JAVA_FLOAT.withName("differentialRatio"),
            MemoryLayout.paddingLayout(4)
        ).withName("JPH_VehicleTrackSettings").withByteAlignment(8);
        
        JPH_VEHICLE_TRACK_SETTINGS_INIT = downcallHandleVoid("JPH_VehicleTrackSettings_Init", UNBOUNDED_ADDRESS);
        
        DRIVEN_WHEEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drivenWheel"));
        WHEELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wheels"));
        WHEELS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wheelsCount"));
        INERTIA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inertia"));
        ANGULAR_DAMPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("angularDamping"));
        MAX_BRAKE_TORQUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBrakeTorque"));
        DIFFERENTIAL_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("differentialRatio"));
        
        DRIVEN_WHEEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drivenWheel"));
        WHEELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wheels"));
        WHEELS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wheelsCount"));
        INERTIA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inertia"));
        ANGULAR_DAMPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularDamping"));
        MAX_BRAKE_TORQUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBrakeTorque"));
        DIFFERENTIAL_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("differentialRatio"));
        //@formatter:on
    }

    public VehicleTrackSettings() {
        this(Arena.ofAuto());
    }
    
    public VehicleTrackSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VehicleTrackSettings(MemorySegment segment) {
        this.segment = segment;
    
    
        init();
    }

    
    public static void init(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_INIT.get();
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
    
    /// @see #drivenWheel()
    public VehicleTrackSettings drivenWheel(int drivenWheel) {
    	DRIVEN_WHEEL_HANDLE.set(segment, 0L, drivenWheel);
    	return this;
    }
    
    public int drivenWheel() {
    	return (int) DRIVEN_WHEEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #wheels()
    public VehicleTrackSettings wheels(NativeIntArray wheels) {
    	WHEELS_HANDLE.set(segment, 0L, wheels.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray wheels() {
    	MemorySegment segment = (MemorySegment) WHEELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #wheelsCount()
    public VehicleTrackSettings wheelsCount(int wheelsCount) {
    	WHEELS_COUNT_HANDLE.set(segment, 0L, wheelsCount);
    	return this;
    }
    
    public int wheelsCount() {
    	return (int) WHEELS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #inertia()
    public VehicleTrackSettings inertia(float inertia) {
    	INERTIA_HANDLE.set(segment, 0L, inertia);
    	return this;
    }
    
    public float inertia() {
    	return (float) INERTIA_HANDLE.get(segment, 0L);
    }
    
    /// @see #angularDamping()
    public VehicleTrackSettings angularDamping(float angularDamping) {
    	ANGULAR_DAMPING_HANDLE.set(segment, 0L, angularDamping);
    	return this;
    }
    
    public float angularDamping() {
    	return (float) ANGULAR_DAMPING_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBrakeTorque()
    public VehicleTrackSettings maxBrakeTorque(float maxBrakeTorque) {
    	MAX_BRAKE_TORQUE_HANDLE.set(segment, 0L, maxBrakeTorque);
    	return this;
    }
    
    public float maxBrakeTorque() {
    	return (float) MAX_BRAKE_TORQUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #differentialRatio()
    public VehicleTrackSettings differentialRatio(float differentialRatio) {
    	DIFFERENTIAL_RATIO_HANDLE.set(segment, 0L, differentialRatio);
    	return this;
    }
    
    public float differentialRatio() {
    	return (float) DIFFERENTIAL_RATIO_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VehicleTrackSettings set(VehicleTrackSettings other) {
        return set(other.segment);
    }
    
    @Override
    public VehicleTrackSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VehicleTrackSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VehicleTrackSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleTrackSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<VehicleTrackSettings> array(Arena arena, VehicleTrackSettings... structs) {
        NativeStructArray<VehicleTrackSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleTrackSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VehicleTrackSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VehicleTrackSettings(segment)
        );
    }
    
}