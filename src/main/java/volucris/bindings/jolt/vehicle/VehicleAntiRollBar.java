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
public final class VehicleAntiRollBar
		implements Struct<VehicleAntiRollBar> {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_INIT;

    public static final StructLayout LAYOUT;

    public static final VarHandle LEFT_WHEEL;
    public static final VarHandle RIGHT_WHEEL;
    public static final VarHandle STIFFNESS;

    public static final long LEFT_WHEEL_OFFSET;
    public static final long RIGHT_WHEEL_OFFSET;
    public static final long STIFFNESS_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("leftWheel"),
            JAVA_INT.withName("rightWheel"),
            JAVA_FLOAT.withName("stiffness")
        ).withName("JPH_VehicleAntiRollBar").withByteAlignment(4);
        
        JPH_VEHICLE_ANTI_ROLL_BAR_INIT = downcallHandleVoid("JPH_VehicleAntiRollBar_Init", UNBOUNDED_ADDRESS);
        
        LEFT_WHEEL = LAYOUT.varHandle(PathElement.groupElement("leftWheel"));
        RIGHT_WHEEL = LAYOUT.varHandle(PathElement.groupElement("rightWheel"));
        STIFFNESS = LAYOUT.varHandle(PathElement.groupElement("stiffness"));
        
        LEFT_WHEEL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("leftWheel"));
        RIGHT_WHEEL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rightWheel"));
        STIFFNESS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stiffness"));
        //@formatter:on
    }

    public VehicleAntiRollBar() {
        this(Arena.ofAuto());
    }
    
    public VehicleAntiRollBar(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VehicleAntiRollBar(MemorySegment segment) {
        this.segment = segment;
    
    
        init();
    }

    public static void init(
        MemorySegment antiRollBar
    ) {
        MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_INIT.get();
        try {
            method.invokeExact(
                antiRollBar
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
    
    public VehicleAntiRollBar leftWheel(int leftWheel) {
        LEFT_WHEEL.set(segment, 0L, leftWheel);
        return this;
    }
    
    public int leftWheel() {
        return (int) LEFT_WHEEL.get(segment, 0L);
    }
    
    public VehicleAntiRollBar rightWheel(int rightWheel) {
        RIGHT_WHEEL.set(segment, 0L, rightWheel);
        return this;
    }
    
    public int rightWheel() {
        return (int) RIGHT_WHEEL.get(segment, 0L);
    }
    
    public VehicleAntiRollBar stiffness(float stiffness) {
        STIFFNESS.set(segment, 0L, stiffness);
        return this;
    }
    
    public float stiffness() {
        return (float) STIFFNESS.get(segment, 0L);
    }
    
    @Override
    public VehicleAntiRollBar set(VehicleAntiRollBar other) {
        return set(other.segment);
    }
    
    @Override
    public VehicleAntiRollBar set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VehicleAntiRollBar> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VehicleAntiRollBar> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleAntiRollBar(segment),
            count
        );
    }
    
    public static NativeStructArray<VehicleAntiRollBar> array(Arena arena, VehicleAntiRollBar... structs) {
        NativeStructArray<VehicleAntiRollBar> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VehicleAntiRollBar(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VehicleAntiRollBar> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VehicleAntiRollBar(segment)
        );
    }
    
}