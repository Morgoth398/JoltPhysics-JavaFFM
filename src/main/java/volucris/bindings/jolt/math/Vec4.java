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

/**
 * 
 */
public final class Vec4
		implements Struct<Vec4> {

    public static final StructLayout LAYOUT;

    public static final VarHandle X;
    public static final VarHandle Y;
    public static final VarHandle Z;
    public static final VarHandle W;

    public static final long X_OFFSET;
    public static final long Y_OFFSET;
    public static final long Z_OFFSET;
    public static final long W_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("x"),
            JAVA_FLOAT.withName("y"),
            JAVA_FLOAT.withName("z"),
            JAVA_FLOAT.withName("w")
        ).withName("JPH_Vec4").withByteAlignment(4);
        
        X = LAYOUT.varHandle(PathElement.groupElement("x"));
        Y = LAYOUT.varHandle(PathElement.groupElement("y"));
        Z = LAYOUT.varHandle(PathElement.groupElement("z"));
        W = LAYOUT.varHandle(PathElement.groupElement("w"));
        
        X_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
        Y_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
        Z_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("z"));
        W_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("w"));
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

    public Vec4 x(float x) {
        X.set(segment, 0L, x);
        return this;
    }
    
    public float x() {
        return (float) X.get(segment, 0L);
    }
    
    public Vec4 y(float y) {
        Y.set(segment, 0L, y);
        return this;
    }
    
    public float y() {
        return (float) Y.get(segment, 0L);
    }
    
    public Vec4 z(float z) {
        Z.set(segment, 0L, z);
        return this;
    }
    
    public float z() {
        return (float) Z.get(segment, 0L);
    }
    
    public Vec4 w(float w) {
        W.set(segment, 0L, w);
        return this;
    }
    
    public float w() {
        return (float) W.get(segment, 0L);
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