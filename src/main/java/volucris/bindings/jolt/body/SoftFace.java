/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A face defines the surface of the body
/// ```
public final class SoftFace
		implements Struct<SoftFace> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VERTEX1_HANDLE;
    public static final VarHandle VERTEX2_HANDLE;
    public static final VarHandle VERTEX3_HANDLE;
    public static final VarHandle MATERIAL_INDEX_HANDLE;

    public static final long VERTEX1_BYTE_OFFSET;
    public static final long VERTEX2_BYTE_OFFSET;
    public static final long VERTEX3_BYTE_OFFSET;
    public static final long MATERIAL_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("vertex1"),
            JAVA_INT.withName("vertex2"),
            JAVA_INT.withName("vertex3"),
            JAVA_INT.withName("materialIndex")
        ).withName("JPH_SoftFace").withByteAlignment(4);
        
        VERTEX1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertex1"));
        VERTEX2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertex2"));
        VERTEX3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertex3"));
        MATERIAL_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndex"));
        
        VERTEX1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertex1"));
        VERTEX2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertex2"));
        VERTEX3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertex3"));
        MATERIAL_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndex"));
        //@formatter:on
    }

    public SoftFace() {
        this(Arena.ofAuto());
    }
    
    public SoftFace(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SoftFace(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #vertex1()
    public SoftFace vertex1(int vertex1) {
    	VERTEX1_HANDLE.set(segment, 0L, vertex1);
    	return this;
    }
    
    public int vertex1() {
    	return (int) VERTEX1_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertex2()
    public SoftFace vertex2(int vertex2) {
    	VERTEX2_HANDLE.set(segment, 0L, vertex2);
    	return this;
    }
    
    public int vertex2() {
    	return (int) VERTEX2_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertex3()
    public SoftFace vertex3(int vertex3) {
    	VERTEX3_HANDLE.set(segment, 0L, vertex3);
    	return this;
    }
    
    public int vertex3() {
    	return (int) VERTEX3_HANDLE.get(segment, 0L);
    }
    
    /// @see #materialIndex()
    public SoftFace materialIndex(int materialIndex) {
    	MATERIAL_INDEX_HANDLE.set(segment, 0L, materialIndex);
    	return this;
    }
    
    public int materialIndex() {
    	return (int) MATERIAL_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public SoftFace set(SoftFace other) {
        return set(other.segment);
    }
    
    @Override
    public SoftFace set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SoftFace> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SoftFace> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SoftFace(segment),
            count
        );
    }
    
    public static NativeStructArray<SoftFace> array(Arena arena, SoftFace... structs) {
        NativeStructArray<SoftFace> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SoftFace(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SoftFace> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SoftFace(segment)
        );
    }
    
}