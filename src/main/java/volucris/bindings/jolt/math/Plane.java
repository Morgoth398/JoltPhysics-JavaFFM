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
public final class Plane
		implements Struct<Plane> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DISTANCE;

    public static final long NORMAL_OFFSET;
    public static final long DISTANCE_OFFSET;

    private final MemorySegment segment;

    private final Vec3 normal;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("normal"),
            JAVA_FLOAT.withName("distance")
        ).withName("JPH_Plane").withByteAlignment(4);
        
        DISTANCE = LAYOUT.varHandle(PathElement.groupElement("distance"));
        
        NORMAL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
        DISTANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("distance"));
        //@formatter:on
    }

    public Plane() {
        this(Arena.ofAuto());
    }
    
    public Plane(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public Plane(MemorySegment segment) {
        this.segment = segment;
    
        normal = new Vec3(segment.asSlice(NORMAL_OFFSET, Vec3.LAYOUT));
    }

    public Plane distance(float distance) {
        DISTANCE.set(segment, 0L, distance);
        return this;
    }
    
    public float distance() {
        return (float) DISTANCE.get(segment, 0L);
    }
    
    public Plane normal(Consumer<Vec3> consumer) {
        consumer.accept(normal);
        return this;
    }
    
    public Plane normal(Vec3 other) {
        normal.set(other);
        return this;
    }
    
    public Vec3 normal() {
        return normal;
    }
    
    @Override
    public Plane set(Plane other) {
        return set(other.segment);
    }
    
    @Override
    public Plane set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<Plane> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<Plane> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Plane(segment),
            count
        );
    }
    
    public static NativeStructArray<Plane> array(Arena arena, Plane... structs) {
        NativeStructArray<Plane> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new Plane(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<Plane> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new Plane(segment)
        );
    }
    
}