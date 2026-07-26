/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class IndexedTriangle
		implements Struct<IndexedTriangle> {

    public static final StructLayout LAYOUT;

    public static final VarHandle I1_HANDLE;
    public static final VarHandle I2_HANDLE;
    public static final VarHandle I3_HANDLE;
    public static final VarHandle MATERIAL_INDEX_HANDLE;
    public static final VarHandle USER_DATA_HANDLE;

    public static final long I1_BYTE_OFFSET;
    public static final long I2_BYTE_OFFSET;
    public static final long I3_BYTE_OFFSET;
    public static final long MATERIAL_INDEX_BYTE_OFFSET;
    public static final long USER_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("i1"),
            JAVA_INT.withName("i2"),
            JAVA_INT.withName("i3"),
            JAVA_INT.withName("materialIndex"),
            JAVA_INT.withName("userData")
        ).withName("JPH_IndexedTriangle").withByteAlignment(4);
        
        I1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("i1"));
        I2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("i2"));
        I3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("i3"));
        MATERIAL_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("materialIndex"));
        USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("userData"));
        
        I1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("i1"));
        I2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("i2"));
        I3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("i3"));
        MATERIAL_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndex"));
        USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("userData"));
        //@formatter:on
    }

    public IndexedTriangle() {
        this(Arena.ofAuto());
    }
    
    public IndexedTriangle(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public IndexedTriangle(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #i1()
    public IndexedTriangle i1(int i1) {
    	I1_HANDLE.set(segment, 0L, i1);
    	return this;
    }
    
    public int i1() {
    	return (int) I1_HANDLE.get(segment, 0L);
    }
    
    /// @see #i2()
    public IndexedTriangle i2(int i2) {
    	I2_HANDLE.set(segment, 0L, i2);
    	return this;
    }
    
    public int i2() {
    	return (int) I2_HANDLE.get(segment, 0L);
    }
    
    /// @see #i3()
    public IndexedTriangle i3(int i3) {
    	I3_HANDLE.set(segment, 0L, i3);
    	return this;
    }
    
    public int i3() {
    	return (int) I3_HANDLE.get(segment, 0L);
    }
    
    /// @see #materialIndex()
    public IndexedTriangle materialIndex(int materialIndex) {
    	MATERIAL_INDEX_HANDLE.set(segment, 0L, materialIndex);
    	return this;
    }
    
    public int materialIndex() {
    	return (int) MATERIAL_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #userData()
    public IndexedTriangle userData(int userData) {
    	USER_DATA_HANDLE.set(segment, 0L, userData);
    	return this;
    }
    
    public int userData() {
    	return (int) USER_DATA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public IndexedTriangle set(IndexedTriangle other) {
        return set(other.segment);
    }
    
    @Override
    public IndexedTriangle set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<IndexedTriangle> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<IndexedTriangle> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new IndexedTriangle(segment),
            count
        );
    }
    
    public static NativeStructArray<IndexedTriangle> array(Arena arena, IndexedTriangle... structs) {
        NativeStructArray<IndexedTriangle> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new IndexedTriangle(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<IndexedTriangle> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new IndexedTriangle(segment)
        );
    }
    
}