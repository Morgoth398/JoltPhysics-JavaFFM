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
public final class ConstraintSettings
		implements Struct<ConstraintSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ENABLED_HANDLE;
    public static final VarHandle CONSTRAINT_PRIORITY_HANDLE;
    public static final VarHandle NUM_VELOCITY_STEPS_OVERRIDE_HANDLE;
    public static final VarHandle NUM_POSITION_STEPS_OVERRIDE_HANDLE;
    public static final VarHandle DRAW_CONSTRAINT_SIZE_HANDLE;
    public static final VarHandle USER_DATA_HANDLE;

    public static final long ENABLED_BYTE_OFFSET;
    public static final long CONSTRAINT_PRIORITY_BYTE_OFFSET;
    public static final long NUM_VELOCITY_STEPS_OVERRIDE_BYTE_OFFSET;
    public static final long NUM_POSITION_STEPS_OVERRIDE_BYTE_OFFSET;
    public static final long DRAW_CONSTRAINT_SIZE_BYTE_OFFSET;
    public static final long USER_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BOOLEAN.withName("enabled"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("constraintPriority"),
            JAVA_INT.withName("numVelocityStepsOverride"),
            JAVA_INT.withName("numPositionStepsOverride"),
            JAVA_FLOAT.withName("drawConstraintSize"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("userData")
        ).withName("JPH_ConstraintSettings").withByteAlignment(8);
        
        ENABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enabled"));
        CONSTRAINT_PRIORITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("constraintPriority"));
        NUM_VELOCITY_STEPS_OVERRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numVelocityStepsOverride"));
        NUM_POSITION_STEPS_OVERRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numPositionStepsOverride"));
        DRAW_CONSTRAINT_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawConstraintSize"));
        USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userData"));
        
        ENABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enabled"));
        CONSTRAINT_PRIORITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constraintPriority"));
        NUM_VELOCITY_STEPS_OVERRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numVelocityStepsOverride"));
        NUM_POSITION_STEPS_OVERRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numPositionStepsOverride"));
        DRAW_CONSTRAINT_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawConstraintSize"));
        USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        //@formatter:on
    }

    public ConstraintSettings(MemorySegment segment) {
        this.segment = segment;
    
    }

    public ConstraintSettings enabled(boolean enabled) {
        ENABLED_HANDLE.set(segment, 0L, enabled);
        return this;
    }
    
    public boolean enabled() {
        return (boolean) ENABLED_HANDLE.get(segment, 0L);
    }
    
    public ConstraintSettings constraintPriority(int constraintPriority) {
        CONSTRAINT_PRIORITY_HANDLE.set(segment, 0L, constraintPriority);
        return this;
    }
    
    public int constraintPriority() {
        return (int) CONSTRAINT_PRIORITY_HANDLE.get(segment, 0L);
    }
    
    public ConstraintSettings numVelocityStepsOverride(int numVelocityStepsOverride) {
        NUM_VELOCITY_STEPS_OVERRIDE_HANDLE.set(segment, 0L, numVelocityStepsOverride);
        return this;
    }
    
    public int numVelocityStepsOverride() {
        return (int) NUM_VELOCITY_STEPS_OVERRIDE_HANDLE.get(segment, 0L);
    }
    
    public ConstraintSettings numPositionStepsOverride(int numPositionStepsOverride) {
        NUM_POSITION_STEPS_OVERRIDE_HANDLE.set(segment, 0L, numPositionStepsOverride);
        return this;
    }
    
    public int numPositionStepsOverride() {
        return (int) NUM_POSITION_STEPS_OVERRIDE_HANDLE.get(segment, 0L);
    }
    
    public ConstraintSettings drawConstraintSize(float drawConstraintSize) {
        DRAW_CONSTRAINT_SIZE_HANDLE.set(segment, 0L, drawConstraintSize);
        return this;
    }
    
    public float drawConstraintSize() {
        return (float) DRAW_CONSTRAINT_SIZE_HANDLE.get(segment, 0L);
    }
    
    public ConstraintSettings userData(long userData) {
        USER_DATA_HANDLE.set(segment, 0L, userData);
        return this;
    }
    
    public long userData() {
        return (long) USER_DATA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public ConstraintSettings set(ConstraintSettings other) {
        return set(other.segment);
    }
    
    @Override
    public ConstraintSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ConstraintSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ConstraintSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ConstraintSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<ConstraintSettings> array(Arena arena, ConstraintSettings... structs) {
        NativeStructArray<ConstraintSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ConstraintSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ConstraintSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ConstraintSettings(segment)
        );
    }
    
}