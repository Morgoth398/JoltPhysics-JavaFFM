/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class SkeletonJoint
		implements Struct<SkeletonJoint> {

    public static final StructLayout LAYOUT;

    public static final VarHandle NAME;
    public static final VarHandle PARENT_NAME;
    public static final VarHandle PARENT_JOINT_INDEX;

    public static final long NAME_OFFSET;
    public static final long PARENT_NAME_OFFSET;
    public static final long PARENT_JOINT_INDEX_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("name"),
            UNBOUNDED_ADDRESS.withName("parentName"),
            JAVA_INT.withName("parentJointIndex"),
            MemoryLayout.paddingLayout(4)
        ).withName("JPH_SkeletonJoint").withByteAlignment(8);
        
        NAME = LAYOUT.varHandle(PathElement.groupElement("name"));
        PARENT_NAME = LAYOUT.varHandle(PathElement.groupElement("parentName"));
        PARENT_JOINT_INDEX = LAYOUT.varHandle(PathElement.groupElement("parentJointIndex"));
        
        NAME_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
        PARENT_NAME_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("parentName"));
        PARENT_JOINT_INDEX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("parentJointIndex"));
        //@formatter:on
    }

    public SkeletonJoint() {
        this(Arena.ofAuto());
    }
    
    public SkeletonJoint(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SkeletonJoint(MemorySegment segment) {
        this.segment = segment;
    
    }

    public SkeletonJoint name(Arena arena, String name) {
        NAME.set(segment, 0L, arena.allocateFrom(name));
        return this;
    }
    
    public @Nullable String name() {
        MemorySegment segment = (MemorySegment) NAME.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return segment.getString(0);
    }
    
    public SkeletonJoint parentName(Arena arena, String parentName) {
        PARENT_NAME.set(segment, 0L, arena.allocateFrom(parentName));
        return this;
    }
    
    public @Nullable String parentName() {
        MemorySegment segment = (MemorySegment) PARENT_NAME.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return segment.getString(0);
    }
    
    public SkeletonJoint parentJointIndex(int parentJointIndex) {
        PARENT_JOINT_INDEX.set(segment, 0L, parentJointIndex);
        return this;
    }
    
    public int parentJointIndex() {
        return (int) PARENT_JOINT_INDEX.get(segment, 0L);
    }
    
    @Override
    public SkeletonJoint set(SkeletonJoint other) {
        return set(other.segment);
    }
    
    @Override
    public SkeletonJoint set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SkeletonJoint> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SkeletonJoint> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SkeletonJoint(segment),
            count
        );
    }
    
    public static NativeStructArray<SkeletonJoint> array(Arena arena, SkeletonJoint... structs) {
        NativeStructArray<SkeletonJoint> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SkeletonJoint(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SkeletonJoint> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SkeletonJoint(segment)
        );
    }
    
}