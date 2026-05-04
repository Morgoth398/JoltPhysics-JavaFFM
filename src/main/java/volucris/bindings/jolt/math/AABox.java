/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/**
 * 
 */
public final class AABox
		implements Struct<AABox> {

    public static final StructLayout LAYOUT;

    public static final long MIN_OFFSET;
    public static final long MAX_OFFSET;

    private final MemorySegment segment;

    private final Vec3 min;
    private final Vec3 max;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("min"),
            Vec3.LAYOUT.withName("max")
        ).withName("JPH_AABox").withByteAlignment(4);
        
        MIN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("min"));
        MAX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max"));
        //@formatter:on
    }

    public AABox() {
        this(Arena.ofAuto());
    }
    
    public AABox(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AABox(MemorySegment segment) {
        this.segment = segment;
    
        min = new Vec3(segment.asSlice(MIN_OFFSET, Vec3.LAYOUT));
        max = new Vec3(segment.asSlice(MAX_OFFSET, Vec3.LAYOUT));
    }

    public AABox min(Consumer<Vec3> consumer) {
        consumer.accept(min);
        return this;
    }
    
    public AABox min(Vec3 other) {
        min.set(other);
        return this;
    }
    
    public Vec3 min() {
        return min;
    }
    
    public AABox max(Consumer<Vec3> consumer) {
        consumer.accept(max);
        return this;
    }
    
    public AABox max(Vec3 other) {
        max.set(other);
        return this;
    }
    
    public Vec3 max() {
        return max;
    }
    
    @Override
    public AABox set(AABox other) {
        return set(other.segment);
    }
    
    @Override
    public AABox set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AABox> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AABox> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AABox(segment),
            count
        );
    }
    
    public static NativeStructArray<AABox> array(Arena arena, AABox... structs) {
        NativeStructArray<AABox> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AABox(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AABox> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AABox(segment)
        );
    }
    
}