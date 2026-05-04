/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.filter;

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
public final class CollisionGroup
		implements Struct<CollisionGroup> {

    public static final StructLayout LAYOUT;

    public static final VarHandle GROUP_FILTER;
    public static final VarHandle GROUP_ID;
    public static final VarHandle SUB_GROUP_ID;

    public static final long GROUP_FILTER_OFFSET;
    public static final long GROUP_ID_OFFSET;
    public static final long SUB_GROUP_ID_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("groupFilter"),
            JAVA_INT.withName("groupID"),
            JAVA_INT.withName("subGroupID")
        ).withName("JPH_CollisionGroup").withByteAlignment(8);
        
        GROUP_FILTER = LAYOUT.varHandle(PathElement.groupElement("groupFilter"));
        GROUP_ID = LAYOUT.varHandle(PathElement.groupElement("groupID"));
        SUB_GROUP_ID = LAYOUT.varHandle(PathElement.groupElement("subGroupID"));
        
        GROUP_FILTER_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupFilter"));
        GROUP_ID_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("groupID"));
        SUB_GROUP_ID_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subGroupID"));
        //@formatter:on
    }

    public CollisionGroup() {
        this(Arena.ofAuto());
    }
    
    public CollisionGroup(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CollisionGroup(MemorySegment segment) {
        this.segment = segment;
    
    }

    public CollisionGroup groupFilter(GroupFilter groupFilter) {
        GROUP_FILTER.set(segment, 0L, groupFilter.memorySegment());
        return this;
    }
    
    public @Nullable GroupFilter groupFilter() {
        MemorySegment segment = (MemorySegment) GROUP_FILTER.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new GroupFilter(segment);
    }
    
    public CollisionGroup groupID(int groupID) {
        GROUP_ID.set(segment, 0L, groupID);
        return this;
    }
    
    public int groupID() {
        return (int) GROUP_ID.get(segment, 0L);
    }
    
    public CollisionGroup subGroupID(int subGroupID) {
        SUB_GROUP_ID.set(segment, 0L, subGroupID);
        return this;
    }
    
    public int subGroupID() {
        return (int) SUB_GROUP_ID.get(segment, 0L);
    }
    
    @Override
    public CollisionGroup set(CollisionGroup other) {
        return set(other.segment);
    }
    
    @Override
    public CollisionGroup set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CollisionGroup> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CollisionGroup> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollisionGroup(segment),
            count
        );
    }
    
    public static NativeStructArray<CollisionGroup> array(Arena arena, CollisionGroup... structs) {
        NativeStructArray<CollisionGroup> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollisionGroup(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CollisionGroup> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CollisionGroup(segment)
        );
    }
    
}