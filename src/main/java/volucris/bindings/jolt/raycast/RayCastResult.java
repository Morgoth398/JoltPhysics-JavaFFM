/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

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
public final class RayCastResult
		implements Struct<RayCastResult> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BODY_ID;
    public static final VarHandle FRACTION;
    public static final VarHandle SUB_SHAPE_ID2;

    public static final long BODY_ID_OFFSET;
    public static final long FRACTION_OFFSET;
    public static final long SUB_SHAPE_ID2_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bodyID"),
            JAVA_FLOAT.withName("fraction"),
            JAVA_INT.withName("subShapeID2")
        ).withName("JPH_RayCastResult").withByteAlignment(4);
        
        BODY_ID = LAYOUT.varHandle(PathElement.groupElement("bodyID"));
        FRACTION = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        SUB_SHAPE_ID2 = LAYOUT.varHandle(PathElement.groupElement("subShapeID2"));
        
        BODY_ID_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyID"));
        FRACTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        SUB_SHAPE_ID2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subShapeID2"));
        //@formatter:on
    }

    public RayCastResult() {
        this(Arena.ofAuto());
    }
    
    public RayCastResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public RayCastResult(MemorySegment segment) {
        this.segment = segment;
    
    }

    public RayCastResult bodyID(int bodyID) {
        BODY_ID.set(segment, 0L, bodyID);
        return this;
    }
    
    public int bodyID() {
        return (int) BODY_ID.get(segment, 0L);
    }
    
    public RayCastResult fraction(float fraction) {
        FRACTION.set(segment, 0L, fraction);
        return this;
    }
    
    public float fraction() {
        return (float) FRACTION.get(segment, 0L);
    }
    
    public RayCastResult subShapeID2(int subShapeID2) {
        SUB_SHAPE_ID2.set(segment, 0L, subShapeID2);
        return this;
    }
    
    public int subShapeID2() {
        return (int) SUB_SHAPE_ID2.get(segment, 0L);
    }
    
    @Override
    public RayCastResult set(RayCastResult other) {
        return set(other.segment);
    }
    
    @Override
    public RayCastResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RayCastResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RayCastResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RayCastResult(segment),
            count
        );
    }
    
    public static NativeStructArray<RayCastResult> array(Arena arena, RayCastResult... structs) {
        NativeStructArray<RayCastResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new RayCastResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RayCastResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RayCastResult(segment)
        );
    }
    
}