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
public final class SupportingFace
		implements Struct<SupportingFace> {

    public static final StructLayout LAYOUT;

    public static final VarHandle COUNT;

    public static final long COUNT_OFFSET;
    public static final long VERTICES_OFFSET;

    private final MemorySegment segment;

    private final Vec3[] vertices;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("count"),
            MemoryLayout.sequenceLayout(32, Vec3.LAYOUT).withName("vertices")
        ).withName("JPH_SupportingFace").withByteAlignment(4);
        
        COUNT = LAYOUT.varHandle(PathElement.groupElement("count"));
        
        COUNT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
        VERTICES_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertices"));
        //@formatter:on
    }

    public SupportingFace() {
        this(Arena.ofAuto());
    }
    
    public SupportingFace(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SupportingFace(MemorySegment segment) {
        this.segment = segment;
    
    
        vertices = new Vec3[32];
        for (int i = 0; i < 32; i++) {
            long offset = VERTICES_OFFSET + i * Vec3.LAYOUT.byteSize();
            vertices[i] = new Vec3(segment.asSlice(offset, Vec3.LAYOUT));
        }
    
    }

    public SupportingFace count(int count) {
        COUNT.set(segment, 0L, count);
        return this;
    }
    
    public int count() {
        return (int) COUNT.get(segment, 0L);
    }
    
    public SupportingFace vertices(Consumer<Vec3> consumer, int index) {
        consumer.accept(vertices[index]);
        return this;
    }
    
    public SupportingFace vertices(Vec3 other, int index) {
        vertices[index].set(other);
        return this;
    }
    
    public Vec3 vertices(int index) {
        return vertices[index];
    }
    
    @Override
    public SupportingFace set(SupportingFace other) {
        return set(other.segment);
    }
    
    @Override
    public SupportingFace set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SupportingFace> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SupportingFace> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SupportingFace(segment),
            count
        );
    }
    
    public static NativeStructArray<SupportingFace> array(Arena arena, SupportingFace... structs) {
        NativeStructArray<SupportingFace> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SupportingFace(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SupportingFace> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SupportingFace(segment)
        );
    }
    
}