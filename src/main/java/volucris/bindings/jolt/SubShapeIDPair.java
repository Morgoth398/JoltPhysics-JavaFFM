/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

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
public final class SubShapeIDPair
		implements Struct<SubShapeIDPair> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BODY1_ID;
    public static final VarHandle SUB_SHAPE_ID1;
    public static final VarHandle BODY2_ID;
    public static final VarHandle SUB_SHAPE_ID2;

    public static final long BODY1_ID_OFFSET;
    public static final long SUB_SHAPE_ID1_OFFSET;
    public static final long BODY2_ID_OFFSET;
    public static final long SUB_SHAPE_ID2_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("Body1ID"),
            JAVA_INT.withName("subShapeID1"),
            JAVA_INT.withName("Body2ID"),
            JAVA_INT.withName("subShapeID2")
        ).withName("JPH_SubShapeIDPair").withByteAlignment(4);
        
        BODY1_ID = LAYOUT.varHandle(PathElement.groupElement("Body1ID"));
        SUB_SHAPE_ID1 = LAYOUT.varHandle(PathElement.groupElement("subShapeID1"));
        BODY2_ID = LAYOUT.varHandle(PathElement.groupElement("Body2ID"));
        SUB_SHAPE_ID2 = LAYOUT.varHandle(PathElement.groupElement("subShapeID2"));
        
        BODY1_ID_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Body1ID"));
        SUB_SHAPE_ID1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subShapeID1"));
        BODY2_ID_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Body2ID"));
        SUB_SHAPE_ID2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subShapeID2"));
        //@formatter:on
    }

    public SubShapeIDPair() {
        this(Arena.ofAuto());
    }
    
    public SubShapeIDPair(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SubShapeIDPair(MemorySegment segment) {
        this.segment = segment;
    
    }

    public SubShapeIDPair Body1ID(int Body1ID) {
        BODY1_ID.set(segment, 0L, Body1ID);
        return this;
    }
    
    public int Body1ID() {
        return (int) BODY1_ID.get(segment, 0L);
    }
    
    public SubShapeIDPair subShapeID1(int subShapeID1) {
        SUB_SHAPE_ID1.set(segment, 0L, subShapeID1);
        return this;
    }
    
    public int subShapeID1() {
        return (int) SUB_SHAPE_ID1.get(segment, 0L);
    }
    
    public SubShapeIDPair Body2ID(int Body2ID) {
        BODY2_ID.set(segment, 0L, Body2ID);
        return this;
    }
    
    public int Body2ID() {
        return (int) BODY2_ID.get(segment, 0L);
    }
    
    public SubShapeIDPair subShapeID2(int subShapeID2) {
        SUB_SHAPE_ID2.set(segment, 0L, subShapeID2);
        return this;
    }
    
    public int subShapeID2() {
        return (int) SUB_SHAPE_ID2.get(segment, 0L);
    }
    
    @Override
    public SubShapeIDPair set(SubShapeIDPair other) {
        return set(other.segment);
    }
    
    @Override
    public SubShapeIDPair set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SubShapeIDPair> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SubShapeIDPair> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SubShapeIDPair(segment),
            count
        );
    }
    
    public static NativeStructArray<SubShapeIDPair> array(Arena arena, SubShapeIDPair... structs) {
        NativeStructArray<SubShapeIDPair> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SubShapeIDPair(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SubShapeIDPair> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SubShapeIDPair(segment)
        );
    }
    
}