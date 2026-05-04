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
public final class Point
		implements Struct<Point> {

    public static final StructLayout LAYOUT;

    public static final VarHandle X;
    public static final VarHandle Y;

    public static final long X_OFFSET;
    public static final long Y_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("x"),
            JAVA_FLOAT.withName("y")
        ).withName("JPH_Point").withByteAlignment(4);
        
        X = LAYOUT.varHandle(PathElement.groupElement("x"));
        Y = LAYOUT.varHandle(PathElement.groupElement("y"));
        
        X_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
        Y_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
        //@formatter:on
    }

    public Point() {
        this(Arena.ofAuto());
    }
    
    public Point(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Point(MemorySegment segment) {
        this.segment = segment;
    
    }

    public Point x(float x) {
        X.set(segment, 0L, x);
        return this;
    }
    
    public float x() {
        return (float) X.get(segment, 0L);
    }
    
    public Point y(float y) {
        Y.set(segment, 0L, y);
        return this;
    }
    
    public float y() {
        return (float) Y.get(segment, 0L);
    }
    
    @Override
    public Point set(Point other) {
        return set(other.segment);
    }
    
    @Override
    public Point set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Point> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Point> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Point(segment),
            count
        );
    }
    
    public static NativeStructArray<Point> array(Arena arena, Point... structs) {
        NativeStructArray<Point> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Point(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Point> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Point(segment)
        );
    }
    
}