/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class DrawSettings
		implements Struct<DrawSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DRAW_GET_SUPPORT_FUNCTION;
    public static final VarHandle DRAW_SUPPORT_DIRECTION;
    public static final VarHandle DRAW_GET_SUPPORTING_FACE;
    public static final VarHandle DRAW_SHAPE;
    public static final VarHandle DRAW_SHAPE_WIREFRAME;
    public static final VarHandle DRAW_SHAPE_COLOR;
    public static final VarHandle DRAW_BOUNDING_BOX;
    public static final VarHandle DRAW_CENTER_OF_MASS_TRANSFORM;
    public static final VarHandle DRAW_WORLD_TRANSFORM;
    public static final VarHandle DRAW_VELOCITY;
    public static final VarHandle DRAW_MASS_AND_INERTIA;
    public static final VarHandle DRAW_SLEEP_STATS;
    public static final VarHandle DRAW_SOFT_BODY_VERTICES;
    public static final VarHandle DRAW_SOFT_BODY_VERTEX_VELOCITIES;
    public static final VarHandle DRAW_SOFT_BODY_EDGE_CONSTRAINTS;
    public static final VarHandle DRAW_SOFT_BODY_BEND_CONSTRAINTS;
    public static final VarHandle DRAW_SOFT_BODY_VOLUME_CONSTRAINTS;
    public static final VarHandle DRAW_SOFT_BODY_SKIN_CONSTRAINTS;
    public static final VarHandle DRAW_SOFT_BODY_LRACONSTRAINTS;
    public static final VarHandle DRAW_SOFT_BODY_PREDICTED_BOUNDS;
    public static final VarHandle DRAW_SOFT_BODY_CONSTRAINT_COLOR;

    public static final long DRAW_GET_SUPPORT_FUNCTION_OFFSET;
    public static final long DRAW_SUPPORT_DIRECTION_OFFSET;
    public static final long DRAW_GET_SUPPORTING_FACE_OFFSET;
    public static final long DRAW_SHAPE_OFFSET;
    public static final long DRAW_SHAPE_WIREFRAME_OFFSET;
    public static final long DRAW_SHAPE_COLOR_OFFSET;
    public static final long DRAW_BOUNDING_BOX_OFFSET;
    public static final long DRAW_CENTER_OF_MASS_TRANSFORM_OFFSET;
    public static final long DRAW_WORLD_TRANSFORM_OFFSET;
    public static final long DRAW_VELOCITY_OFFSET;
    public static final long DRAW_MASS_AND_INERTIA_OFFSET;
    public static final long DRAW_SLEEP_STATS_OFFSET;
    public static final long DRAW_SOFT_BODY_VERTICES_OFFSET;
    public static final long DRAW_SOFT_BODY_VERTEX_VELOCITIES_OFFSET;
    public static final long DRAW_SOFT_BODY_EDGE_CONSTRAINTS_OFFSET;
    public static final long DRAW_SOFT_BODY_BEND_CONSTRAINTS_OFFSET;
    public static final long DRAW_SOFT_BODY_VOLUME_CONSTRAINTS_OFFSET;
    public static final long DRAW_SOFT_BODY_SKIN_CONSTRAINTS_OFFSET;
    public static final long DRAW_SOFT_BODY_LRACONSTRAINTS_OFFSET;
    public static final long DRAW_SOFT_BODY_PREDICTED_BOUNDS_OFFSET;
    public static final long DRAW_SOFT_BODY_CONSTRAINT_COLOR_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BOOLEAN.withName("drawGetSupportFunction"),
            JAVA_BOOLEAN.withName("drawSupportDirection"),
            JAVA_BOOLEAN.withName("drawGetSupportingFace"),
            JAVA_BOOLEAN.withName("drawShape"),
            JAVA_BOOLEAN.withName("drawShapeWireframe"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("drawShapeColor"),
            JAVA_BOOLEAN.withName("drawBoundingBox"),
            JAVA_BOOLEAN.withName("drawCenterOfMassTransform"),
            JAVA_BOOLEAN.withName("drawWorldTransform"),
            JAVA_BOOLEAN.withName("drawVelocity"),
            JAVA_BOOLEAN.withName("drawMassAndInertia"),
            JAVA_BOOLEAN.withName("drawSleepStats"),
            JAVA_BOOLEAN.withName("drawSoftBodyVertices"),
            JAVA_BOOLEAN.withName("drawSoftBodyVertexVelocities"),
            JAVA_BOOLEAN.withName("drawSoftBodyEdgeConstraints"),
            JAVA_BOOLEAN.withName("drawSoftBodyBendConstraints"),
            JAVA_BOOLEAN.withName("drawSoftBodyVolumeConstraints"),
            JAVA_BOOLEAN.withName("drawSoftBodySkinConstraints"),
            JAVA_BOOLEAN.withName("drawSoftBodyLRAConstraints"),
            JAVA_BOOLEAN.withName("drawSoftBodyPredictedBounds"),
            MemoryLayout.paddingLayout(2),
            JAVA_INT.withName("drawSoftBodyConstraintColor")
        ).withName("JPH_DrawSettings").withByteAlignment(4);
        
        DRAW_GET_SUPPORT_FUNCTION = LAYOUT.varHandle(PathElement.groupElement("drawGetSupportFunction"));
        DRAW_SUPPORT_DIRECTION = LAYOUT.varHandle(PathElement.groupElement("drawSupportDirection"));
        DRAW_GET_SUPPORTING_FACE = LAYOUT.varHandle(PathElement.groupElement("drawGetSupportingFace"));
        DRAW_SHAPE = LAYOUT.varHandle(PathElement.groupElement("drawShape"));
        DRAW_SHAPE_WIREFRAME = LAYOUT.varHandle(PathElement.groupElement("drawShapeWireframe"));
        DRAW_SHAPE_COLOR = LAYOUT.varHandle(PathElement.groupElement("drawShapeColor"));
        DRAW_BOUNDING_BOX = LAYOUT.varHandle(PathElement.groupElement("drawBoundingBox"));
        DRAW_CENTER_OF_MASS_TRANSFORM = LAYOUT.varHandle(PathElement.groupElement("drawCenterOfMassTransform"));
        DRAW_WORLD_TRANSFORM = LAYOUT.varHandle(PathElement.groupElement("drawWorldTransform"));
        DRAW_VELOCITY = LAYOUT.varHandle(PathElement.groupElement("drawVelocity"));
        DRAW_MASS_AND_INERTIA = LAYOUT.varHandle(PathElement.groupElement("drawMassAndInertia"));
        DRAW_SLEEP_STATS = LAYOUT.varHandle(PathElement.groupElement("drawSleepStats"));
        DRAW_SOFT_BODY_VERTICES = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyVertices"));
        DRAW_SOFT_BODY_VERTEX_VELOCITIES = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyVertexVelocities"));
        DRAW_SOFT_BODY_EDGE_CONSTRAINTS = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyEdgeConstraints"));
        DRAW_SOFT_BODY_BEND_CONSTRAINTS = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyBendConstraints"));
        DRAW_SOFT_BODY_VOLUME_CONSTRAINTS = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyVolumeConstraints"));
        DRAW_SOFT_BODY_SKIN_CONSTRAINTS = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodySkinConstraints"));
        DRAW_SOFT_BODY_LRACONSTRAINTS = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyLRAConstraints"));
        DRAW_SOFT_BODY_PREDICTED_BOUNDS = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyPredictedBounds"));
        DRAW_SOFT_BODY_CONSTRAINT_COLOR = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyConstraintColor"));
        
        DRAW_GET_SUPPORT_FUNCTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawGetSupportFunction"));
        DRAW_SUPPORT_DIRECTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSupportDirection"));
        DRAW_GET_SUPPORTING_FACE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawGetSupportingFace"));
        DRAW_SHAPE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawShape"));
        DRAW_SHAPE_WIREFRAME_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawShapeWireframe"));
        DRAW_SHAPE_COLOR_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawShapeColor"));
        DRAW_BOUNDING_BOX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawBoundingBox"));
        DRAW_CENTER_OF_MASS_TRANSFORM_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawCenterOfMassTransform"));
        DRAW_WORLD_TRANSFORM_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawWorldTransform"));
        DRAW_VELOCITY_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawVelocity"));
        DRAW_MASS_AND_INERTIA_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawMassAndInertia"));
        DRAW_SLEEP_STATS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSleepStats"));
        DRAW_SOFT_BODY_VERTICES_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyVertices"));
        DRAW_SOFT_BODY_VERTEX_VELOCITIES_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyVertexVelocities"));
        DRAW_SOFT_BODY_EDGE_CONSTRAINTS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyEdgeConstraints"));
        DRAW_SOFT_BODY_BEND_CONSTRAINTS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyBendConstraints"));
        DRAW_SOFT_BODY_VOLUME_CONSTRAINTS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyVolumeConstraints"));
        DRAW_SOFT_BODY_SKIN_CONSTRAINTS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodySkinConstraints"));
        DRAW_SOFT_BODY_LRACONSTRAINTS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyLRAConstraints"));
        DRAW_SOFT_BODY_PREDICTED_BOUNDS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyPredictedBounds"));
        DRAW_SOFT_BODY_CONSTRAINT_COLOR_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyConstraintColor"));
        //@formatter:on
    }

    public DrawSettings() {
        this(Arena.ofAuto());
    }
    
    public DrawSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public DrawSettings(MemorySegment segment) {
        this.segment = segment;
    
    }

    public DrawSettings drawGetSupportFunction(boolean drawGetSupportFunction) {
        DRAW_GET_SUPPORT_FUNCTION.set(segment, 0L, drawGetSupportFunction);
        return this;
    }
    
    public boolean drawGetSupportFunction() {
        return (boolean) DRAW_GET_SUPPORT_FUNCTION.get(segment, 0L);
    }
    
    public DrawSettings drawSupportDirection(boolean drawSupportDirection) {
        DRAW_SUPPORT_DIRECTION.set(segment, 0L, drawSupportDirection);
        return this;
    }
    
    public boolean drawSupportDirection() {
        return (boolean) DRAW_SUPPORT_DIRECTION.get(segment, 0L);
    }
    
    public DrawSettings drawGetSupportingFace(boolean drawGetSupportingFace) {
        DRAW_GET_SUPPORTING_FACE.set(segment, 0L, drawGetSupportingFace);
        return this;
    }
    
    public boolean drawGetSupportingFace() {
        return (boolean) DRAW_GET_SUPPORTING_FACE.get(segment, 0L);
    }
    
    public DrawSettings drawShape(boolean drawShape) {
        DRAW_SHAPE.set(segment, 0L, drawShape);
        return this;
    }
    
    public boolean drawShape() {
        return (boolean) DRAW_SHAPE.get(segment, 0L);
    }
    
    public DrawSettings drawShapeWireframe(boolean drawShapeWireframe) {
        DRAW_SHAPE_WIREFRAME.set(segment, 0L, drawShapeWireframe);
        return this;
    }
    
    public boolean drawShapeWireframe() {
        return (boolean) DRAW_SHAPE_WIREFRAME.get(segment, 0L);
    }
    
    public DrawSettings drawShapeColor(int drawShapeColor) {
        DRAW_SHAPE_COLOR.set(segment, 0L, drawShapeColor);
        return this;
    }
    
    public int drawShapeColor() {
        return (int) DRAW_SHAPE_COLOR.get(segment, 0L);
    }
    
    public DrawSettings drawBoundingBox(boolean drawBoundingBox) {
        DRAW_BOUNDING_BOX.set(segment, 0L, drawBoundingBox);
        return this;
    }
    
    public boolean drawBoundingBox() {
        return (boolean) DRAW_BOUNDING_BOX.get(segment, 0L);
    }
    
    public DrawSettings drawCenterOfMassTransform(boolean drawCenterOfMassTransform) {
        DRAW_CENTER_OF_MASS_TRANSFORM.set(segment, 0L, drawCenterOfMassTransform);
        return this;
    }
    
    public boolean drawCenterOfMassTransform() {
        return (boolean) DRAW_CENTER_OF_MASS_TRANSFORM.get(segment, 0L);
    }
    
    public DrawSettings drawWorldTransform(boolean drawWorldTransform) {
        DRAW_WORLD_TRANSFORM.set(segment, 0L, drawWorldTransform);
        return this;
    }
    
    public boolean drawWorldTransform() {
        return (boolean) DRAW_WORLD_TRANSFORM.get(segment, 0L);
    }
    
    public DrawSettings drawVelocity(boolean drawVelocity) {
        DRAW_VELOCITY.set(segment, 0L, drawVelocity);
        return this;
    }
    
    public boolean drawVelocity() {
        return (boolean) DRAW_VELOCITY.get(segment, 0L);
    }
    
    public DrawSettings drawMassAndInertia(boolean drawMassAndInertia) {
        DRAW_MASS_AND_INERTIA.set(segment, 0L, drawMassAndInertia);
        return this;
    }
    
    public boolean drawMassAndInertia() {
        return (boolean) DRAW_MASS_AND_INERTIA.get(segment, 0L);
    }
    
    public DrawSettings drawSleepStats(boolean drawSleepStats) {
        DRAW_SLEEP_STATS.set(segment, 0L, drawSleepStats);
        return this;
    }
    
    public boolean drawSleepStats() {
        return (boolean) DRAW_SLEEP_STATS.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodyVertices(boolean drawSoftBodyVertices) {
        DRAW_SOFT_BODY_VERTICES.set(segment, 0L, drawSoftBodyVertices);
        return this;
    }
    
    public boolean drawSoftBodyVertices() {
        return (boolean) DRAW_SOFT_BODY_VERTICES.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodyVertexVelocities(boolean drawSoftBodyVertexVelocities) {
        DRAW_SOFT_BODY_VERTEX_VELOCITIES.set(segment, 0L, drawSoftBodyVertexVelocities);
        return this;
    }
    
    public boolean drawSoftBodyVertexVelocities() {
        return (boolean) DRAW_SOFT_BODY_VERTEX_VELOCITIES.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodyEdgeConstraints(boolean drawSoftBodyEdgeConstraints) {
        DRAW_SOFT_BODY_EDGE_CONSTRAINTS.set(segment, 0L, drawSoftBodyEdgeConstraints);
        return this;
    }
    
    public boolean drawSoftBodyEdgeConstraints() {
        return (boolean) DRAW_SOFT_BODY_EDGE_CONSTRAINTS.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodyBendConstraints(boolean drawSoftBodyBendConstraints) {
        DRAW_SOFT_BODY_BEND_CONSTRAINTS.set(segment, 0L, drawSoftBodyBendConstraints);
        return this;
    }
    
    public boolean drawSoftBodyBendConstraints() {
        return (boolean) DRAW_SOFT_BODY_BEND_CONSTRAINTS.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodyVolumeConstraints(boolean drawSoftBodyVolumeConstraints) {
        DRAW_SOFT_BODY_VOLUME_CONSTRAINTS.set(segment, 0L, drawSoftBodyVolumeConstraints);
        return this;
    }
    
    public boolean drawSoftBodyVolumeConstraints() {
        return (boolean) DRAW_SOFT_BODY_VOLUME_CONSTRAINTS.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodySkinConstraints(boolean drawSoftBodySkinConstraints) {
        DRAW_SOFT_BODY_SKIN_CONSTRAINTS.set(segment, 0L, drawSoftBodySkinConstraints);
        return this;
    }
    
    public boolean drawSoftBodySkinConstraints() {
        return (boolean) DRAW_SOFT_BODY_SKIN_CONSTRAINTS.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodyLRAConstraints(boolean drawSoftBodyLRAConstraints) {
        DRAW_SOFT_BODY_LRACONSTRAINTS.set(segment, 0L, drawSoftBodyLRAConstraints);
        return this;
    }
    
    public boolean drawSoftBodyLRAConstraints() {
        return (boolean) DRAW_SOFT_BODY_LRACONSTRAINTS.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodyPredictedBounds(boolean drawSoftBodyPredictedBounds) {
        DRAW_SOFT_BODY_PREDICTED_BOUNDS.set(segment, 0L, drawSoftBodyPredictedBounds);
        return this;
    }
    
    public boolean drawSoftBodyPredictedBounds() {
        return (boolean) DRAW_SOFT_BODY_PREDICTED_BOUNDS.get(segment, 0L);
    }
    
    public DrawSettings drawSoftBodyConstraintColor(int drawSoftBodyConstraintColor) {
        DRAW_SOFT_BODY_CONSTRAINT_COLOR.set(segment, 0L, drawSoftBodyConstraintColor);
        return this;
    }
    
    public int drawSoftBodyConstraintColor() {
        return (int) DRAW_SOFT_BODY_CONSTRAINT_COLOR.get(segment, 0L);
    }
    
    @Override
    public DrawSettings set(DrawSettings other) {
        return set(other.segment);
    }
    
    @Override
    public DrawSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<DrawSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<DrawSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DrawSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<DrawSettings> array(Arena arena, DrawSettings... structs) {
        NativeStructArray<DrawSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new DrawSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<DrawSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new DrawSettings(segment)
        );
    }
    
}