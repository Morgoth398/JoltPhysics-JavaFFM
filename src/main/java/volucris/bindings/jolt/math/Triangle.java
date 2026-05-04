/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/**
 * 
 */
public final class Triangle
		implements Struct<Triangle> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MATERIAL_INDEX;

    public static final long V1_OFFSET;
    public static final long V2_OFFSET;
    public static final long V3_OFFSET;
    public static final long MATERIAL_INDEX_OFFSET;

    private final MemorySegment segment;

    private final Vec3 v1;
    private final Vec3 v2;
    private final Vec3 v3;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("v1"),
            Vec3.LAYOUT.withName("v2"),
            Vec3.LAYOUT.withName("v3"),
            JAVA_INT.withName("materialIndex")
        ).withName("JPH_Triangle").withByteAlignment(4);
        
        MATERIAL_INDEX = LAYOUT.varHandle(PathElement.groupElement("materialIndex"));
        
        V1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("v1"));
        V2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("v2"));
        V3_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("v3"));
        MATERIAL_INDEX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("materialIndex"));
        //@formatter:on
    }

    public Triangle() {
        this(Arena.ofAuto());
    }
    
    public Triangle(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Triangle(MemorySegment segment) {
        this.segment = segment;
    
        v1 = new Vec3(segment.asSlice(V1_OFFSET, Vec3.LAYOUT));
        v2 = new Vec3(segment.asSlice(V2_OFFSET, Vec3.LAYOUT));
        v3 = new Vec3(segment.asSlice(V3_OFFSET, Vec3.LAYOUT));
    }

    public Triangle materialIndex(int materialIndex) {
        MATERIAL_INDEX.set(segment, 0L, materialIndex);
        return this;
    }
    
    public int materialIndex() {
        return (int) MATERIAL_INDEX.get(segment, 0L);
    }
    
    public Triangle v1(Consumer<Vec3> consumer) {
        consumer.accept(v1);
        return this;
    }
    
    public Triangle v1(Vec3 other) {
        v1.set(other);
        return this;
    }
    
    public Vec3 v1() {
        return v1;
    }
    
    public Triangle v2(Consumer<Vec3> consumer) {
        consumer.accept(v2);
        return this;
    }
    
    public Triangle v2(Vec3 other) {
        v2.set(other);
        return this;
    }
    
    public Vec3 v2() {
        return v2;
    }
    
    public Triangle v3(Consumer<Vec3> consumer) {
        consumer.accept(v3);
        return this;
    }
    
    public Triangle v3(Vec3 other) {
        v3.set(other);
        return this;
    }
    
    public Vec3 v3() {
        return v3;
    }
    
    @Override
    public Triangle set(Triangle other) {
        return set(other.segment);
    }
    
    @Override
    public Triangle set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Triangle> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Triangle> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Triangle(segment),
            count
        );
    }
    
    public static NativeStructArray<Triangle> array(Arena arena, Triangle... structs) {
        NativeStructArray<Triangle> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Triangle(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Triangle> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Triangle(segment)
        );
    }
    
}