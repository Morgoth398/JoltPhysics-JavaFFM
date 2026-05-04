/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/**
 * 
 */
public final class MotorSettings
		implements Struct<MotorSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MIN_FORCE_LIMIT;
    public static final VarHandle MAX_FORCE_LIMIT;
    public static final VarHandle MIN_TORQUE_LIMIT;
    public static final VarHandle MAX_TORQUE_LIMIT;

    public static final long SPRING_SETTINGS_OFFSET;
    public static final long MIN_FORCE_LIMIT_OFFSET;
    public static final long MAX_FORCE_LIMIT_OFFSET;
    public static final long MIN_TORQUE_LIMIT_OFFSET;
    public static final long MAX_TORQUE_LIMIT_OFFSET;

    private final MemorySegment segment;

    private final SpringSettings springSettings;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            SpringSettings.LAYOUT.withName("springSettings"),
            JAVA_FLOAT.withName("minForceLimit"),
            JAVA_FLOAT.withName("maxForceLimit"),
            JAVA_FLOAT.withName("minTorqueLimit"),
            JAVA_FLOAT.withName("maxTorqueLimit")
        ).withName("JPH_MotorSettings").withByteAlignment(4);
        
        MIN_FORCE_LIMIT = LAYOUT.varHandle(PathElement.groupElement("minForceLimit"));
        MAX_FORCE_LIMIT = LAYOUT.varHandle(PathElement.groupElement("maxForceLimit"));
        MIN_TORQUE_LIMIT = LAYOUT.varHandle(PathElement.groupElement("minTorqueLimit"));
        MAX_TORQUE_LIMIT = LAYOUT.varHandle(PathElement.groupElement("maxTorqueLimit"));
        
        SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("springSettings"));
        MIN_FORCE_LIMIT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minForceLimit"));
        MAX_FORCE_LIMIT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxForceLimit"));
        MIN_TORQUE_LIMIT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minTorqueLimit"));
        MAX_TORQUE_LIMIT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTorqueLimit"));
        //@formatter:on
    }

    public MotorSettings() {
        this(Arena.ofAuto());
    }
    
    public MotorSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MotorSettings(MemorySegment segment) {
        this.segment = segment;
    
        springSettings = new SpringSettings(segment.asSlice(SPRING_SETTINGS_OFFSET, SpringSettings.LAYOUT));
    }

    public MotorSettings minForceLimit(float minForceLimit) {
        MIN_FORCE_LIMIT.set(segment, 0L, minForceLimit);
        return this;
    }
    
    public float minForceLimit() {
        return (float) MIN_FORCE_LIMIT.get(segment, 0L);
    }
    
    public MotorSettings maxForceLimit(float maxForceLimit) {
        MAX_FORCE_LIMIT.set(segment, 0L, maxForceLimit);
        return this;
    }
    
    public float maxForceLimit() {
        return (float) MAX_FORCE_LIMIT.get(segment, 0L);
    }
    
    public MotorSettings minTorqueLimit(float minTorqueLimit) {
        MIN_TORQUE_LIMIT.set(segment, 0L, minTorqueLimit);
        return this;
    }
    
    public float minTorqueLimit() {
        return (float) MIN_TORQUE_LIMIT.get(segment, 0L);
    }
    
    public MotorSettings maxTorqueLimit(float maxTorqueLimit) {
        MAX_TORQUE_LIMIT.set(segment, 0L, maxTorqueLimit);
        return this;
    }
    
    public float maxTorqueLimit() {
        return (float) MAX_TORQUE_LIMIT.get(segment, 0L);
    }
    
    public MotorSettings springSettings(Consumer<SpringSettings> consumer) {
        consumer.accept(springSettings);
        return this;
    }
    
    public MotorSettings springSettings(SpringSettings other) {
        springSettings.set(other);
        return this;
    }
    
    public SpringSettings springSettings() {
        return springSettings;
    }
    
    @Override
    public MotorSettings set(MotorSettings other) {
        return set(other.segment);
    }
    
    @Override
    public MotorSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MotorSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MotorSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MotorSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<MotorSettings> array(Arena arena, MotorSettings... structs) {
        NativeStructArray<MotorSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MotorSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MotorSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MotorSettings(segment)
        );
    }
    
}