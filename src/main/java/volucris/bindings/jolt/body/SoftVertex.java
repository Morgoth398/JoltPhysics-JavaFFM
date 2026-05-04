/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;

/**
 * 
 */
public final class SoftVertex
		implements Struct<SoftVertex> {

    public static final StructLayout LAYOUT;

    public static final VarHandle INV_MASS;

    public static final long POSITION_OFFSET;
    public static final long VELOCITY_OFFSET;
    public static final long INV_MASS_OFFSET;

    private final MemorySegment segment;

    private final Vec3 position;
    private final Vec3 velocity;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("position"),
            Vec3.LAYOUT.withName("velocity"),
            JAVA_FLOAT.withName("invMass")
        ).withName("JPH_SoftVertex").withByteAlignment(4);
        
        INV_MASS = LAYOUT.varHandle(PathElement.groupElement("invMass"));
        
        POSITION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position"));
        VELOCITY_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("velocity"));
        INV_MASS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("invMass"));
        //@formatter:on
    }

    public SoftVertex() {
        this(Arena.ofAuto());
    }
    
    public SoftVertex(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public SoftVertex(MemorySegment segment) {
        this.segment = segment;
    
        position = new Vec3(segment.asSlice(POSITION_OFFSET, Vec3.LAYOUT));
        velocity = new Vec3(segment.asSlice(VELOCITY_OFFSET, Vec3.LAYOUT));
    }

    public SoftVertex invMass(float invMass) {
        INV_MASS.set(segment, 0L, invMass);
        return this;
    }
    
    public float invMass() {
        return (float) INV_MASS.get(segment, 0L);
    }
    
    public SoftVertex position(Consumer<Vec3> consumer) {
        consumer.accept(position);
        return this;
    }
    
    public SoftVertex position(Vec3 other) {
        position.set(other);
        return this;
    }
    
    public Vec3 position() {
        return position;
    }
    
    public SoftVertex velocity(Consumer<Vec3> consumer) {
        consumer.accept(velocity);
        return this;
    }
    
    public SoftVertex velocity(Vec3 other) {
        velocity.set(other);
        return this;
    }
    
    public Vec3 velocity() {
        return velocity;
    }
    
    @Override
    public SoftVertex set(SoftVertex other) {
        return set(other.segment);
    }
    
    @Override
    public SoftVertex set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<SoftVertex> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<SoftVertex> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SoftVertex(segment),
            count
        );
    }
    
    public static NativeStructArray<SoftVertex> array(Arena arena, SoftVertex... structs) {
        NativeStructArray<SoftVertex> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new SoftVertex(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<SoftVertex> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new SoftVertex(segment)
        );
    }
    
}