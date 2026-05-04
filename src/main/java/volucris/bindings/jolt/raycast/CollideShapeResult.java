/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

import edu.umd.cs.findbugs.annotations.Nullable;
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
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class CollideShapeResult
		implements Struct<CollideShapeResult> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PENETRATION_DEPTH;
    public static final VarHandle SUB_SHAPE_ID1;
    public static final VarHandle SUB_SHAPE_ID2;
    public static final VarHandle BODY_ID2;
    public static final VarHandle SHAPE1_FACE_COUNT;
    public static final VarHandle SHAPE1_FACES;
    public static final VarHandle SHAPE2_FACE_COUNT;
    public static final VarHandle SHAPE2_FACES;

    public static final long CONTACT_POINT_ON1_OFFSET;
    public static final long CONTACT_POINT_ON2_OFFSET;
    public static final long PENETRATION_AXIS_OFFSET;
    public static final long PENETRATION_DEPTH_OFFSET;
    public static final long SUB_SHAPE_ID1_OFFSET;
    public static final long SUB_SHAPE_ID2_OFFSET;
    public static final long BODY_ID2_OFFSET;
    public static final long SHAPE1_FACE_COUNT_OFFSET;
    public static final long SHAPE1_FACES_OFFSET;
    public static final long SHAPE2_FACE_COUNT_OFFSET;
    public static final long SHAPE2_FACES_OFFSET;

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
            JAVA_INT.withName("shape1FaceCount"),
            UNBOUNDED_ADDRESS.withName("shape1Faces"),
            JAVA_INT.withName("shape2FaceCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("shape2Faces")
        ).withName("JPH_CollideShapeResult").withByteAlignment(8);
        
        PENETRATION_DEPTH = LAYOUT.varHandle(PathElement.groupElement("penetrationDepth"));
        SUB_SHAPE_ID1 = LAYOUT.varHandle(PathElement.groupElement("subShapeID1"));
        SUB_SHAPE_ID2 = LAYOUT.varHandle(PathElement.groupElement("subShapeID2"));
        BODY_ID2 = LAYOUT.varHandle(PathElement.groupElement("bodyID2"));
        SHAPE1_FACE_COUNT = LAYOUT.varHandle(PathElement.groupElement("shape1FaceCount"));
        SHAPE1_FACES = LAYOUT.varHandle(PathElement.groupElement("shape1Faces"));
        SHAPE2_FACE_COUNT = LAYOUT.varHandle(PathElement.groupElement("shape2FaceCount"));
        SHAPE2_FACES = LAYOUT.varHandle(PathElement.groupElement("shape2Faces"));
        
        CONTACT_POINT_ON1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointOn1"));
        CONTACT_POINT_ON2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointOn2"));
        PENETRATION_AXIS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationAxis"));
        PENETRATION_DEPTH_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationDepth"));
        SUB_SHAPE_ID1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subShapeID1"));
        SUB_SHAPE_ID2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subShapeID2"));
        BODY_ID2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyID2"));
        SHAPE1_FACE_COUNT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shape1FaceCount"));
        SHAPE1_FACES_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shape1Faces"));
        SHAPE2_FACE_COUNT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shape2FaceCount"));
        SHAPE2_FACES_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shape2Faces"));
        //@formatter:on
    }

    public CollideShapeResult() {
        this(Arena.ofAuto());
    }
    
    public CollideShapeResult(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CollideShapeResult(MemorySegment segment) {
        this.segment = segment;
    
        contactPointOn1 = new Vec3(segment.asSlice(CONTACT_POINT_ON1_OFFSET, Vec3.LAYOUT));
        contactPointOn2 = new Vec3(segment.asSlice(CONTACT_POINT_ON2_OFFSET, Vec3.LAYOUT));
        penetrationAxis = new Vec3(segment.asSlice(PENETRATION_AXIS_OFFSET, Vec3.LAYOUT));
    }

    public CollideShapeResult penetrationDepth(float penetrationDepth) {
        PENETRATION_DEPTH.set(segment, 0L, penetrationDepth);
        return this;
    }
    
    public float penetrationDepth() {
        return (float) PENETRATION_DEPTH.get(segment, 0L);
    }
    
    public CollideShapeResult subShapeID1(int subShapeID1) {
        SUB_SHAPE_ID1.set(segment, 0L, subShapeID1);
        return this;
    }
    
    public int subShapeID1() {
        return (int) SUB_SHAPE_ID1.get(segment, 0L);
    }
    
    public CollideShapeResult subShapeID2(int subShapeID2) {
        SUB_SHAPE_ID2.set(segment, 0L, subShapeID2);
        return this;
    }
    
    public int subShapeID2() {
        return (int) SUB_SHAPE_ID2.get(segment, 0L);
    }
    
    public CollideShapeResult bodyID2(int bodyID2) {
        BODY_ID2.set(segment, 0L, bodyID2);
        return this;
    }
    
    public int bodyID2() {
        return (int) BODY_ID2.get(segment, 0L);
    }
    
    public CollideShapeResult shape1FaceCount(int shape1FaceCount) {
        SHAPE1_FACE_COUNT.set(segment, 0L, shape1FaceCount);
        return this;
    }
    
    public int shape1FaceCount() {
        return (int) SHAPE1_FACE_COUNT.get(segment, 0L);
    }
    
    public CollideShapeResult shape1Faces(Vec3 shape1Faces) {
        SHAPE1_FACES.set(segment, 0L, shape1Faces.memorySegment());
        return this;
    }
    
    public @Nullable Vec3 shape1Faces() {
        MemorySegment segment = (MemorySegment) SHAPE1_FACES.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Vec3(segment);
    }
    
    public CollideShapeResult shape2FaceCount(int shape2FaceCount) {
        SHAPE2_FACE_COUNT.set(segment, 0L, shape2FaceCount);
        return this;
    }
    
    public int shape2FaceCount() {
        return (int) SHAPE2_FACE_COUNT.get(segment, 0L);
    }
    
    public CollideShapeResult shape2Faces(Vec3 shape2Faces) {
        SHAPE2_FACES.set(segment, 0L, shape2Faces.memorySegment());
        return this;
    }
    
    public @Nullable Vec3 shape2Faces() {
        MemorySegment segment = (MemorySegment) SHAPE2_FACES.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Vec3(segment);
    }
    
    public CollideShapeResult contactPointOn1(Consumer<Vec3> consumer) {
        consumer.accept(contactPointOn1);
        return this;
    }
    
    public CollideShapeResult contactPointOn1(Vec3 other) {
        contactPointOn1.set(other);
        return this;
    }
    
    public Vec3 contactPointOn1() {
        return contactPointOn1;
    }
    
    public CollideShapeResult contactPointOn2(Consumer<Vec3> consumer) {
        consumer.accept(contactPointOn2);
        return this;
    }
    
    public CollideShapeResult contactPointOn2(Vec3 other) {
        contactPointOn2.set(other);
        return this;
    }
    
    public Vec3 contactPointOn2() {
        return contactPointOn2;
    }
    
    public CollideShapeResult penetrationAxis(Consumer<Vec3> consumer) {
        consumer.accept(penetrationAxis);
        return this;
    }
    
    public CollideShapeResult penetrationAxis(Vec3 other) {
        penetrationAxis.set(other);
        return this;
    }
    
    public Vec3 penetrationAxis() {
        return penetrationAxis;
    }
    
    @Override
    public CollideShapeResult set(CollideShapeResult other) {
        return set(other.segment);
    }
    
    @Override
    public CollideShapeResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CollideShapeResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CollideShapeResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollideShapeResult(segment),
            count
        );
    }
    
    public static NativeStructArray<CollideShapeResult> array(Arena arena, CollideShapeResult... structs) {
        NativeStructArray<CollideShapeResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CollideShapeResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CollideShapeResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CollideShapeResult(segment)
        );
    }
    
}