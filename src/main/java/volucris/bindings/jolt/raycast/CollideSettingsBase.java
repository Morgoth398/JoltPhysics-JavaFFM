/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;

/**
 * 
 */
public final class CollideSettingsBase
		implements Struct<CollideSettingsBase> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ACTIVE_EDGE_MODE;
    public static final VarHandle COLLECT_FACES_MODE;
    public static final VarHandle COLLISION_TOLERANCE;
    public static final VarHandle PENETRATION_TOLERANCE;

    public static final long ACTIVE_EDGE_MODE_OFFSET;
    public static final long COLLECT_FACES_MODE_OFFSET;
    public static final long COLLISION_TOLERANCE_OFFSET;
    public static final long PENETRATION_TOLERANCE_OFFSET;
    public static final long ACTIVE_EDGE_MOVEMENT_DIRECTION_OFFSET;

    private final MemorySegment segment;

    private final Vec3 activeEdgeMovementDirection;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("activeEdgeMode"),
            JAVA_INT.withName("collectFacesMode"),
            JAVA_FLOAT.withName("collisionTolerance"),
            JAVA_FLOAT.withName("penetrationTolerance"),
            Vec3.LAYOUT.withName("activeEdgeMovementDirection")
        ).withName("JPH_CollideSettingsBase").withByteAlignment(4);
        
        ACTIVE_EDGE_MODE = LAYOUT.varHandle(PathElement.groupElement("activeEdgeMode"));
        COLLECT_FACES_MODE = LAYOUT.varHandle(PathElement.groupElement("collectFacesMode"));
        COLLISION_TOLERANCE = LAYOUT.varHandle(PathElement.groupElement("collisionTolerance"));
        PENETRATION_TOLERANCE = LAYOUT.varHandle(PathElement.groupElement("penetrationTolerance"));
        
        ACTIVE_EDGE_MODE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("activeEdgeMode"));
        COLLECT_FACES_MODE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("collectFacesMode"));
        COLLISION_TOLERANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("collisionTolerance"));
        PENETRATION_TOLERANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationTolerance"));
        ACTIVE_EDGE_MOVEMENT_DIRECTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("activeEdgeMovementDirection"));
        //@formatter:on
    }

    public CollideSettingsBase() {
        this(Arena.ofAuto());
    }
    
    public CollideSettingsBase(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CollideSettingsBase(MemorySegment segment) {
        this.segment = segment;
    
        activeEdgeMovementDirection = new Vec3(segment.asSlice(ACTIVE_EDGE_MOVEMENT_DIRECTION_OFFSET, Vec3.LAYOUT));
    }

    public CollideSettingsBase activeEdgeMode(int activeEdgeMode) {
        ACTIVE_EDGE_MODE.set(segment, 0L, activeEdgeMode);
        return this;
    }
    
    public int activeEdgeMode() {
        return (int) ACTIVE_EDGE_MODE.get(segment, 0L);
    }
    
    public CollideSettingsBase collectFacesMode(int collectFacesMode) {
        COLLECT_FACES_MODE.set(segment, 0L, collectFacesMode);
        return this;
    }
    
    public int collectFacesMode() {
        return (int) COLLECT_FACES_MODE.get(segment, 0L);
    }
    
    public CollideSettingsBase collisionTolerance(float collisionTolerance) {
        COLLISION_TOLERANCE.set(segment, 0L, collisionTolerance);
        return this;
    }
    
    public float collisionTolerance() {
        return (float) COLLISION_TOLERANCE.get(segment, 0L);
    }
    
    public CollideSettingsBase penetrationTolerance(float penetrationTolerance) {
        PENETRATION_TOLERANCE.set(segment, 0L, penetrationTolerance);
        return this;
    }
    
    public float penetrationTolerance() {
        return (float) PENETRATION_TOLERANCE.get(segment, 0L);
    }
    
    public CollideSettingsBase activeEdgeMovementDirection(Consumer<Vec3> consumer) {
        consumer.accept(activeEdgeMovementDirection);
        return this;
    }
    
    public CollideSettingsBase activeEdgeMovementDirection(Vec3 other) {
        activeEdgeMovementDirection.set(other);
        return this;
    }
    
    public Vec3 activeEdgeMovementDirection() {
        return activeEdgeMovementDirection;
    }
    
    @Override
    public CollideSettingsBase set(CollideSettingsBase other) {
        return set(other.segment);
    }
    
    @Override
    public CollideSettingsBase set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CollideSettingsBase> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CollideSettingsBase> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollideSettingsBase(segment),
            count
        );
    }
    
    public static NativeStructArray<CollideSettingsBase> array(Arena arena, CollideSettingsBase... structs) {
        NativeStructArray<CollideSettingsBase> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollideSettingsBase(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CollideSettingsBase> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CollideSettingsBase(segment)
        );
    }
    
}