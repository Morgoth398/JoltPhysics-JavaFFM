/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

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
public final class ShapeCastResult
		implements Struct<ShapeCastResult> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PENETRATION_DEPTH;
    public static final VarHandle SUB_SHAPE_ID1;
    public static final VarHandle SUB_SHAPE_ID2;
    public static final VarHandle BODY_ID2;
    public static final VarHandle FRACTION;
    public static final VarHandle IS_BACK_FACE_HIT;

    public static final long CONTACT_POINT_ON1_OFFSET;
    public static final long CONTACT_POINT_ON2_OFFSET;
    public static final long PENETRATION_AXIS_OFFSET;
    public static final long PENETRATION_DEPTH_OFFSET;
    public static final long SUB_SHAPE_ID1_OFFSET;
    public static final long SUB_SHAPE_ID2_OFFSET;
    public static final long BODY_ID2_OFFSET;
    public static final long FRACTION_OFFSET;
    public static final long IS_BACK_FACE_HIT_OFFSET;

    private final MemorySegment segment;

    private final Vec3 contactPointOn1;
    private final Vec3 contactPointOn2;
    private final Vec3 penetrationAxis;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            Vec3.LAYOUT.withName("contactPointOn1"),
            Vec3.LAYOUT.withName("contactPointOn2"),
            Vec3.LAYOUT.withName("penetrationAxis"),
            JAVA_FLOAT.withName("penetrationDepth"),
            JAVA_INT.withName("subShapeID1"),
            JAVA_INT.withName("subShapeID2"),
            JAVA_INT.withName("bodyID2"),
            JAVA_FLOAT.withName("fraction"),
            JAVA_BOOLEAN.withName("isBackFaceHit"),
            MemoryLayout.paddingLayout(3)
        ).withName("JPH_ShapeCastResult").withByteAlignment(4);
        
        PENETRATION_DEPTH = LAYOUT.varHandle(PathElement.groupElement("penetrationDepth"));
        SUB_SHAPE_ID1 = LAYOUT.varHandle(PathElement.groupElement("subShapeID1"));
        SUB_SHAPE_ID2 = LAYOUT.varHandle(PathElement.groupElement("subShapeID2"));
        BODY_ID2 = LAYOUT.varHandle(PathElement.groupElement("bodyID2"));
        FRACTION = LAYOUT.varHandle(PathElement.groupElement("fraction"));
        IS_BACK_FACE_HIT = LAYOUT.varHandle(PathElement.groupElement("isBackFaceHit"));
        
        CONTACT_POINT_ON1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointOn1"));
        CONTACT_POINT_ON2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointOn2"));
        PENETRATION_AXIS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationAxis"));
        PENETRATION_DEPTH_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationDepth"));
        SUB_SHAPE_ID1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subShapeID1"));
        SUB_SHAPE_ID2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subShapeID2"));
        BODY_ID2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyID2"));
        FRACTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fraction"));
        IS_BACK_FACE_HIT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isBackFaceHit"));
        //@formatter:on
    }

    public ShapeCastResult() {
        this(Arena.ofAuto());
    }
    
    public ShapeCastResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public ShapeCastResult(MemorySegment segment) {
        this.segment = segment;
    
        contactPointOn1 = new Vec3(segment.asSlice(CONTACT_POINT_ON1_OFFSET, Vec3.LAYOUT));
        contactPointOn2 = new Vec3(segment.asSlice(CONTACT_POINT_ON2_OFFSET, Vec3.LAYOUT));
        penetrationAxis = new Vec3(segment.asSlice(PENETRATION_AXIS_OFFSET, Vec3.LAYOUT));
    }

    public ShapeCastResult penetrationDepth(float penetrationDepth) {
        PENETRATION_DEPTH.set(segment, 0L, penetrationDepth);
        return this;
    }
    
    public float penetrationDepth() {
        return (float) PENETRATION_DEPTH.get(segment, 0L);
    }
    
    public ShapeCastResult subShapeID1(int subShapeID1) {
        SUB_SHAPE_ID1.set(segment, 0L, subShapeID1);
        return this;
    }
    
    public int subShapeID1() {
        return (int) SUB_SHAPE_ID1.get(segment, 0L);
    }
    
    public ShapeCastResult subShapeID2(int subShapeID2) {
        SUB_SHAPE_ID2.set(segment, 0L, subShapeID2);
        return this;
    }
    
    public int subShapeID2() {
        return (int) SUB_SHAPE_ID2.get(segment, 0L);
    }
    
    public ShapeCastResult bodyID2(int bodyID2) {
        BODY_ID2.set(segment, 0L, bodyID2);
        return this;
    }
    
    public int bodyID2() {
        return (int) BODY_ID2.get(segment, 0L);
    }
    
    public ShapeCastResult fraction(float fraction) {
        FRACTION.set(segment, 0L, fraction);
        return this;
    }
    
    public float fraction() {
        return (float) FRACTION.get(segment, 0L);
    }
    
    public ShapeCastResult isBackFaceHit(boolean isBackFaceHit) {
        IS_BACK_FACE_HIT.set(segment, 0L, isBackFaceHit);
        return this;
    }
    
    public boolean isBackFaceHit() {
        return (boolean) IS_BACK_FACE_HIT.get(segment, 0L);
    }
    
    public ShapeCastResult contactPointOn1(Consumer<Vec3> consumer) {
        consumer.accept(contactPointOn1);
        return this;
    }
    
    public ShapeCastResult contactPointOn1(Vec3 other) {
        contactPointOn1.set(other);
        return this;
    }
    
    public Vec3 contactPointOn1() {
        return contactPointOn1;
    }
    
    public ShapeCastResult contactPointOn2(Consumer<Vec3> consumer) {
        consumer.accept(contactPointOn2);
        return this;
    }
    
    public ShapeCastResult contactPointOn2(Vec3 other) {
        contactPointOn2.set(other);
        return this;
    }
    
    public Vec3 contactPointOn2() {
        return contactPointOn2;
    }
    
    public ShapeCastResult penetrationAxis(Consumer<Vec3> consumer) {
        consumer.accept(penetrationAxis);
        return this;
    }
    
    public ShapeCastResult penetrationAxis(Vec3 other) {
        penetrationAxis.set(other);
        return this;
    }
    
    public Vec3 penetrationAxis() {
        return penetrationAxis;
    }
    
    @Override
    public ShapeCastResult set(ShapeCastResult other) {
        return set(other.segment);
    }
    
    @Override
    public ShapeCastResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ShapeCastResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ShapeCastResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeCastResult(segment),
            count
        );
    }
    
    public static NativeStructArray<ShapeCastResult> array(Arena arena, ShapeCastResult... structs) {
        NativeStructArray<ShapeCastResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ShapeCastResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ShapeCastResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ShapeCastResult(segment)
        );
    }
    
}