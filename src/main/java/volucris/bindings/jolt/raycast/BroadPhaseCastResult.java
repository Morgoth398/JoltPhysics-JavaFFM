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

public final class BroadPhaseCastResult
		implements Struct<BroadPhaseCastResult> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BODY_ID_HANDLE;
    public static final VarHandle FRACTION_HANDLE;

    public static final long BODY_ID_BYTE_OFFSET;
    public static final long FRACTION_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bodyID"),
            JAVA_FLOAT.withName("fraction")
        ).withName("JPH_BroadPhaseCastResult").withByteAlignment(4);
        
        BODY_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bodyID"));
        FRACTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        
        BODY_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyID"));
        FRACTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        //@formatter:on
    }

    public BroadPhaseCastResult() {
        this(Arena.ofAuto());
    }
    
    public BroadPhaseCastResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public BroadPhaseCastResult(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bodyID()
    public BroadPhaseCastResult bodyID(int bodyID) {
    	BODY_ID_HANDLE.set(segment, 0L, bodyID);
    	return this;
    }
    
    public int bodyID() {
    	return (int) BODY_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #fraction()
    public BroadPhaseCastResult fraction(float fraction) {
    	FRACTION_HANDLE.set(segment, 0L, fraction);
    	return this;
    }
    
    public float fraction() {
    	return (float) FRACTION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public BroadPhaseCastResult set(BroadPhaseCastResult other) {
        return set(other.segment);
    }
    
    @Override
    public BroadPhaseCastResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<BroadPhaseCastResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<BroadPhaseCastResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BroadPhaseCastResult(segment),
            count
        );
    }
    
    public static NativeStructArray<BroadPhaseCastResult> array(Arena arena, BroadPhaseCastResult... structs) {
        NativeStructArray<BroadPhaseCastResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new BroadPhaseCastResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<BroadPhaseCastResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new BroadPhaseCastResult(segment)
        );
    }
    
}