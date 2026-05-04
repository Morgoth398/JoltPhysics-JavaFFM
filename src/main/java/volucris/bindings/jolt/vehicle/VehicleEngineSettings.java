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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.LinearCurve;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class VehicleEngineSettings
		implements Struct<VehicleEngineSettings> {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_TORQUE;
    public static final VarHandle MIN_RPM;
    public static final VarHandle MAX_RPM;
    public static final VarHandle NORMALIZED_TORQUE;
    public static final VarHandle INERTIA;
    public static final VarHandle ANGULAR_DAMPING;

    public static final long MAX_TORQUE_OFFSET;
    public static final long MIN_RPM_OFFSET;
    public static final long MAX_RPM_OFFSET;
    public static final long NORMALIZED_TORQUE_OFFSET;
    public static final long INERTIA_OFFSET;
    public static final long ANGULAR_DAMPING_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("maxTorque"),
            JAVA_FLOAT.withName("minRPM"),
            JAVA_FLOAT.withName("maxRPM"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("normalizedTorque"),
            JAVA_FLOAT.withName("inertia"),
            JAVA_FLOAT.withName("angularDamping")
        ).withName("JPH_VehicleEngineSettings").withByteAlignment(8);
        
        JPH_VEHICLE_ENGINE_SETTINGS_INIT = downcallHandleVoid("JPH_VehicleEngineSettings_Init", UNBOUNDED_ADDRESS);
        
        MAX_TORQUE = LAYOUT.varHandle(PathElement.groupElement("maxTorque"));
        MIN_RPM = LAYOUT.varHandle(PathElement.groupElement("minRPM"));
        MAX_RPM = LAYOUT.varHandle(PathElement.groupElement("maxRPM"));
        NORMALIZED_TORQUE = LAYOUT.varHandle(PathElement.groupElement("normalizedTorque"));
        INERTIA = LAYOUT.varHandle(PathElement.groupElement("inertia"));
        ANGULAR_DAMPING = LAYOUT.varHandle(PathElement.groupElement("angularDamping"));
        
        MAX_TORQUE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTorque"));
        MIN_RPM_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minRPM"));
        MAX_RPM_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxRPM"));
        NORMALIZED_TORQUE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalizedTorque"));
        INERTIA_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inertia"));
        ANGULAR_DAMPING_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("angularDamping"));
        //@formatter:on
    }

    public VehicleEngineSettings() {
        this(Arena.ofAuto());
    }
    
    public VehicleEngineSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VehicleEngineSettings(MemorySegment segment) {
        this.segment = segment;
    
    
        init();
    }

    public static void init(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_INIT.get();
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
    
    public VehicleEngineSettings maxTorque(float maxTorque) {
        MAX_TORQUE.set(segment, 0L, maxTorque);
        return this;
    }
    
    public float maxTorque() {
        return (float) MAX_TORQUE.get(segment, 0L);
    }
    
    public VehicleEngineSettings minRPM(float minRPM) {
        MIN_RPM.set(segment, 0L, minRPM);
        return this;
    }
    
    public float minRPM() {
        return (float) MIN_RPM.get(segment, 0L);
    }
    
    public VehicleEngineSettings maxRPM(float maxRPM) {
        MAX_RPM.set(segment, 0L, maxRPM);
        return this;
    }
    
    public float maxRPM() {
        return (float) MAX_RPM.get(segment, 0L);
    }
    
    public VehicleEngineSettings normalizedTorque(LinearCurve normalizedTorque) {
        NORMALIZED_TORQUE.set(segment, 0L, normalizedTorque.memorySegment());
        return this;
    }
    
    public @Nullable LinearCurve normalizedTorque() {
        MemorySegment segment = (MemorySegment) NORMALIZED_TORQUE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new LinearCurve(segment);
    }
    
    public VehicleEngineSettings inertia(float inertia) {
        INERTIA.set(segment, 0L, inertia);
        return this;
    }
    
    public float inertia() {
        return (float) INERTIA.get(segment, 0L);
    }
    
    public VehicleEngineSettings angularDamping(float angularDamping) {
        ANGULAR_DAMPING.set(segment, 0L, angularDamping);
        return this;
    }
    
    public float angularDamping() {
        return (float) ANGULAR_DAMPING.get(segment, 0L);
    }
    
    @Override
    public VehicleEngineSettings set(VehicleEngineSettings other) {
        return set(other.segment);
    }
    
    @Override
    public VehicleEngineSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VehicleEngineSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VehicleEngineSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleEngineSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<VehicleEngineSettings> array(Arena arena, VehicleEngineSettings... structs) {
        NativeStructArray<VehicleEngineSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleEngineSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VehicleEngineSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VehicleEngineSettings(segment)
        );
    }
    
}