/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.physicsSystem.PhysicsSystem;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class PhysicsStepListenerContext
		implements Struct<PhysicsStepListenerContext> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DELTA_TIME;
    public static final VarHandle IS_FIRST_STEP;
    public static final VarHandle IS_LAST_STEP;
    public static final VarHandle PHYSICS_SYSTEM;

    public static final long DELTA_TIME_OFFSET;
    public static final long IS_FIRST_STEP_OFFSET;
    public static final long IS_LAST_STEP_OFFSET;
    public static final long PHYSICS_SYSTEM_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("deltaTime"),
            JAVA_INT.withName("isFirstStep"),
            JAVA_INT.withName("isLastStep"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("physicsSystem")
        ).withName("JPH_PhysicsStepListenerContext").withByteAlignment(8);
        
        DELTA_TIME = LAYOUT.varHandle(PathElement.groupElement("deltaTime"));
        IS_FIRST_STEP = LAYOUT.varHandle(PathElement.groupElement("isFirstStep"));
        IS_LAST_STEP = LAYOUT.varHandle(PathElement.groupElement("isLastStep"));
        PHYSICS_SYSTEM = LAYOUT.varHandle(PathElement.groupElement("physicsSystem"));
        
        DELTA_TIME_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deltaTime"));
        IS_FIRST_STEP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isFirstStep"));
        IS_LAST_STEP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isLastStep"));
        PHYSICS_SYSTEM_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("physicsSystem"));
        //@formatter:on
    }

    public PhysicsStepListenerContext() {
        this(Arena.ofAuto());
    }
    
    public PhysicsStepListenerContext(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public PhysicsStepListenerContext(MemorySegment segment) {
        this.segment = segment;
    
    }

    public PhysicsStepListenerContext deltaTime(float deltaTime) {
        DELTA_TIME.set(segment, 0L, deltaTime);
        return this;
    }
    
    public float deltaTime() {
        return (float) DELTA_TIME.get(segment, 0L);
    }
    
    public PhysicsStepListenerContext isFirstStep(int isFirstStep) {
        IS_FIRST_STEP.set(segment, 0L, isFirstStep);
        return this;
    }
    
    public int isFirstStep() {
        return (int) IS_FIRST_STEP.get(segment, 0L);
    }
    
    public PhysicsStepListenerContext isLastStep(int isLastStep) {
        IS_LAST_STEP.set(segment, 0L, isLastStep);
        return this;
    }
    
    public int isLastStep() {
        return (int) IS_LAST_STEP.get(segment, 0L);
    }
    
    public PhysicsStepListenerContext physicsSystem(PhysicsSystem physicsSystem) {
        PHYSICS_SYSTEM.set(segment, 0L, physicsSystem.memorySegment());
        return this;
    }
    
    public @Nullable PhysicsSystem physicsSystem() {
        MemorySegment segment = (MemorySegment) PHYSICS_SYSTEM.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new PhysicsSystem(segment);
    }
    
    @Override
    public PhysicsStepListenerContext set(PhysicsStepListenerContext other) {
        return set(other.segment);
    }
    
    @Override
    public PhysicsStepListenerContext set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<PhysicsStepListenerContext> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<PhysicsStepListenerContext> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PhysicsStepListenerContext(segment),
            count
        );
    }
    
    public static NativeStructArray<PhysicsStepListenerContext> array(Arena arena, PhysicsStepListenerContext... structs) {
        NativeStructArray<PhysicsStepListenerContext> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PhysicsStepListenerContext(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<PhysicsStepListenerContext> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new PhysicsStepListenerContext(segment)
        );
    }
    
}