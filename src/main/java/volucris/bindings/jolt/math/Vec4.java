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

public final class Vec4
		implements Struct<Vec4> {

    public static final StructLayout LAYOUT;

    public static final VarHandle X_HANDLE;
    public static final VarHandle Y_HANDLE;
    public static final VarHandle Z_HANDLE;
    public static final VarHandle W_HANDLE;

    public static final long X_BYTE_OFFSET;
    public static final long Y_BYTE_OFFSET;
    public static final long Z_BYTE_OFFSET;
    public static final long W_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("x"),
            JAVA_FLOAT.withName("y"),
            JAVA_FLOAT.withName("z"),
            JAVA_FLOAT.withName("w")
        ).withName("JPH_Vec4").withByteAlignment(4);
        
        X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
        Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
        Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("z"));
        W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("w"));
        
        X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
        Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
        Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("z"));
        W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("w"));
        //@formatter:on
    }

    public Vec4() {
        this(Arena.ofAuto());
    }
    
    public Vec4(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Vec4(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #x()
    public Vec4 x(float x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public float x() {
    	return (float) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public Vec4 y(float y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public float y() {
    	return (float) Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #z()
    public Vec4 z(float z) {
    	Z_HANDLE.set(segment, 0L, z);
    	return this;
    }
    
    public float z() {
    	return (float) Z_HANDLE.get(segment, 0L);
    }
    
    /// @see #w()
    public Vec4 w(float w) {
    	W_HANDLE.set(segment, 0L, w);
    	return this;
    }
    
    public float w() {
    	return (float) W_HANDLE.get(segment, 0L);
    }
    
    @Override
    public Vec4 set(Vec4 other) {
        return set(other.segment);
    }
    
    @Override
    public Vec4 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Vec4> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Vec4> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Vec4(segment),
            count
        );
    }
    
    public static NativeStructArray<Vec4> array(Arena arena, Vec4... structs) {
        NativeStructArray<Vec4> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Vec4(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Vec4> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Vec4(segment)
        );
    }
    
}