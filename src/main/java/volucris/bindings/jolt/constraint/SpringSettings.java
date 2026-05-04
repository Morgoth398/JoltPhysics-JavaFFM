/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/**
 * 
 */
public final class SpringSettings
		implements Struct<SpringSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MODE;
    public static final VarHandle FREQUENCY_OR_STIFFNESS;
    public static final VarHandle DAMPING;

    public static final long MODE_OFFSET;
    public static final long FREQUENCY_OR_STIFFNESS_OFFSET;
    public static final long DAMPING_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("mode"),
            JAVA_FLOAT.withName("frequencyOrStiffness"),
            JAVA_FLOAT.withName("damping")
        ).withName("JPH_SpringSettings").withByteAlignment(4);
        
        MODE = LAYOUT.varHandle(PathElement.groupElement("mode"));
        FREQUENCY_OR_STIFFNESS = LAYOUT.varHandle(PathElement.groupElement("frequencyOrStiffness"));
        DAMPING = LAYOUT.varHandle(PathElement.groupElement("damping"));
        
        MODE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
        FREQUENCY_OR_STIFFNESS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frequencyOrStiffness"));
        DAMPING_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("damping"));
        //@formatter:on
    }

    public SpringSettings() {
        this(Arena.ofAuto());
    }
    
    public SpringSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SpringSettings(MemorySegment segment) {
        this.segment = segment;
    
    }

    public SpringSettings mode(int mode) {
        MODE.set(segment, 0L, mode);
        return this;
    }
    
    public int mode() {
        return (int) MODE.get(segment, 0L);
    }
    
    public SpringSettings frequencyOrStiffness(float frequencyOrStiffness) {
        FREQUENCY_OR_STIFFNESS.set(segment, 0L, frequencyOrStiffness);
        return this;
    }
    
    public float frequencyOrStiffness() {
        return (float) FREQUENCY_OR_STIFFNESS.get(segment, 0L);
    }
    
    public SpringSettings damping(float damping) {
        DAMPING.set(segment, 0L, damping);
        return this;
    }
    
    public float damping() {
        return (float) DAMPING.get(segment, 0L);
    }
    
    @Override
    public SpringSettings set(SpringSettings other) {
        return set(other.segment);
    }
    
    @Override
    public SpringSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SpringSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SpringSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SpringSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<SpringSettings> array(Arena arena, SpringSettings... structs) {
        NativeStructArray<SpringSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SpringSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SpringSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SpringSettings(segment)
        );
    }
    
}