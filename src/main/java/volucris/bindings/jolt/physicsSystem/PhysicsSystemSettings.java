/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physicsSystem;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterface;
import volucris.bindings.jolt.objectLayerPairFilter.ObjectLayerPairFilter;
import volucris.bindings.jolt.objectVsBroadPhaseLayerFilter.ObjectVsBroadPhaseLayerFilter;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;;

/**
 * 
 */
public final class PhysicsSystemSettings
		implements Struct<PhysicsSystemSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_BODIES_HANDLE;
    public static final VarHandle NUM_BODY_MUTEXES_HANDLE;
    public static final VarHandle MAX_BODY_PAIRS_HANDLE;
    public static final VarHandle MAX_CONTACT_CONSTRAINTS_HANDLE;
    public static final VarHandle _PADDING_HANDLE;
    public static final VarHandle BROAD_PHASE_LAYER_INTERFACE_HANDLE;
    public static final VarHandle OBJECT_LAYER_PAIR_FILTER_HANDLE;
    public static final VarHandle OBJECT_VS_BROAD_PHASE_LAYER_FILTER_HANDLE;

    public static final long MAX_BODIES_BYTE_OFFSET;
    public static final long NUM_BODY_MUTEXES_BYTE_OFFSET;
    public static final long MAX_BODY_PAIRS_BYTE_OFFSET;
    public static final long MAX_CONTACT_CONSTRAINTS_BYTE_OFFSET;
    public static final long _PADDING_BYTE_OFFSET;
    public static final long BROAD_PHASE_LAYER_INTERFACE_BYTE_OFFSET;
    public static final long OBJECT_LAYER_PAIR_FILTER_BYTE_OFFSET;
    public static final long OBJECT_VS_BROAD_PHASE_LAYER_FILTER_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("maxBodies"),
            JAVA_INT.withName("numBodyMutexes"),
            JAVA_INT.withName("maxBodyPairs"),
            JAVA_INT.withName("maxContactConstraints"),
            JAVA_INT.withName("_padding"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("broadPhaseLayerInterface"),
            UNBOUNDED_ADDRESS.withName("objectLayerPairFilter"),
            UNBOUNDED_ADDRESS.withName("objectVsBroadPhaseLayerFilter")
        ).withName("JPH_PhysicsSystemSettings").withByteAlignment(8);
        
        MAX_BODIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBodies"));
        NUM_BODY_MUTEXES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numBodyMutexes"));
        MAX_BODY_PAIRS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBodyPairs"));
        MAX_CONTACT_CONSTRAINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxContactConstraints"));
        _PADDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_padding"));
        BROAD_PHASE_LAYER_INTERFACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("broadPhaseLayerInterface"));
        OBJECT_LAYER_PAIR_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectLayerPairFilter"));
        OBJECT_VS_BROAD_PHASE_LAYER_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectVsBroadPhaseLayerFilter"));
        
        MAX_BODIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBodies"));
        NUM_BODY_MUTEXES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numBodyMutexes"));
        MAX_BODY_PAIRS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBodyPairs"));
        MAX_CONTACT_CONSTRAINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxContactConstraints"));
        _PADDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_padding"));
        BROAD_PHASE_LAYER_INTERFACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("broadPhaseLayerInterface"));
        OBJECT_LAYER_PAIR_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectLayerPairFilter"));
        OBJECT_VS_BROAD_PHASE_LAYER_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectVsBroadPhaseLayerFilter"));
        //@formatter:on
    }

    public PhysicsSystemSettings() {
        this(Arena.ofAuto());
    }
    
    public PhysicsSystemSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public PhysicsSystemSettings(MemorySegment segment) {
        this.segment = segment;
    
    }

    public PhysicsSystemSettings maxBodies(int maxBodies) {
        MAX_BODIES_HANDLE.set(segment, 0L, maxBodies);
        return this;
    }
    
    public int maxBodies() {
        return (int) MAX_BODIES_HANDLE.get(segment, 0L);
    }
    
    public PhysicsSystemSettings numBodyMutexes(int numBodyMutexes) {
        NUM_BODY_MUTEXES_HANDLE.set(segment, 0L, numBodyMutexes);
        return this;
    }
    
    public int numBodyMutexes() {
        return (int) NUM_BODY_MUTEXES_HANDLE.get(segment, 0L);
    }
    
    public PhysicsSystemSettings maxBodyPairs(int maxBodyPairs) {
        MAX_BODY_PAIRS_HANDLE.set(segment, 0L, maxBodyPairs);
        return this;
    }
    
    public int maxBodyPairs() {
        return (int) MAX_BODY_PAIRS_HANDLE.get(segment, 0L);
    }
    
    public PhysicsSystemSettings maxContactConstraints(int maxContactConstraints) {
        MAX_CONTACT_CONSTRAINTS_HANDLE.set(segment, 0L, maxContactConstraints);
        return this;
    }
    
    public int maxContactConstraints() {
        return (int) MAX_CONTACT_CONSTRAINTS_HANDLE.get(segment, 0L);
    }
    
    public PhysicsSystemSettings _padding(int _padding) {
        _PADDING_HANDLE.set(segment, 0L, _padding);
        return this;
    }
    
    public int _padding() {
        return (int) _PADDING_HANDLE.get(segment, 0L);
    }
    
    public PhysicsSystemSettings broadPhaseLayerInterface(BroadPhaseLayerInterface broadPhaseLayerInterface) {
        BROAD_PHASE_LAYER_INTERFACE_HANDLE.set(segment, 0L, broadPhaseLayerInterface.memorySegment());
        return this;
    }
    
    public @Nullable BroadPhaseLayerInterface broadPhaseLayerInterface() {
        MemorySegment segment = (MemorySegment) BROAD_PHASE_LAYER_INTERFACE_HANDLE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BroadPhaseLayerInterface(segment);
    }
    
    public PhysicsSystemSettings objectLayerPairFilter(ObjectLayerPairFilter objectLayerPairFilter) {
        OBJECT_LAYER_PAIR_FILTER_HANDLE.set(segment, 0L, objectLayerPairFilter.memorySegment());
        return this;
    }
    
    public @Nullable ObjectLayerPairFilter objectLayerPairFilter() {
        MemorySegment segment = (MemorySegment) OBJECT_LAYER_PAIR_FILTER_HANDLE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new ObjectLayerPairFilter(segment);
    }
    
    public PhysicsSystemSettings objectVsBroadPhaseLayerFilter(ObjectVsBroadPhaseLayerFilter objectVsBroadPhaseLayerFilter) {
        OBJECT_VS_BROAD_PHASE_LAYER_FILTER_HANDLE.set(segment, 0L, objectVsBroadPhaseLayerFilter.memorySegment());
        return this;
    }
    
    public @Nullable ObjectVsBroadPhaseLayerFilter objectVsBroadPhaseLayerFilter() {
        MemorySegment segment = (MemorySegment) OBJECT_VS_BROAD_PHASE_LAYER_FILTER_HANDLE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new ObjectVsBroadPhaseLayerFilter(segment);
    }
    
    @Override
    public PhysicsSystemSettings set(PhysicsSystemSettings other) {
        return set(other.segment);
    }
    
    @Override
    public PhysicsSystemSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<PhysicsSystemSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<PhysicsSystemSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PhysicsSystemSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<PhysicsSystemSettings> array(Arena arena, PhysicsSystemSettings... structs) {
        NativeStructArray<PhysicsSystemSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PhysicsSystemSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<PhysicsSystemSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new PhysicsSystemSettings(segment)
        );
    }
    
}