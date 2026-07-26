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

public final class DrawSettings
		implements Struct<DrawSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DRAW_GET_SUPPORT_FUNCTION_HANDLE;
    public static final VarHandle DRAW_SUPPORT_DIRECTION_HANDLE;
    public static final VarHandle DRAW_GET_SUPPORTING_FACE_HANDLE;
    public static final VarHandle DRAW_SHAPE_HANDLE;
    public static final VarHandle DRAW_SHAPE_WIREFRAME_HANDLE;
    public static final VarHandle DRAW_SHAPE_COLOR_HANDLE;
    public static final VarHandle DRAW_BOUNDING_BOX_HANDLE;
    public static final VarHandle DRAW_CENTER_OF_MASS_TRANSFORM_HANDLE;
    public static final VarHandle DRAW_WORLD_TRANSFORM_HANDLE;
    public static final VarHandle DRAW_VELOCITY_HANDLE;
    public static final VarHandle DRAW_MASS_AND_INERTIA_HANDLE;
    public static final VarHandle DRAW_SLEEP_STATS_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_VERTICES_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_VERTEX_VELOCITIES_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_EDGE_CONSTRAINTS_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_BEND_CONSTRAINTS_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_VOLUME_CONSTRAINTS_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_SKIN_CONSTRAINTS_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_LRACONSTRAINTS_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_PREDICTED_BOUNDS_HANDLE;
    public static final VarHandle DRAW_SOFT_BODY_CONSTRAINT_COLOR_HANDLE;

    public static final long DRAW_GET_SUPPORT_FUNCTION_BYTE_OFFSET;
    public static final long DRAW_SUPPORT_DIRECTION_BYTE_OFFSET;
    public static final long DRAW_GET_SUPPORTING_FACE_BYTE_OFFSET;
    public static final long DRAW_SHAPE_BYTE_OFFSET;
    public static final long DRAW_SHAPE_WIREFRAME_BYTE_OFFSET;
    public static final long DRAW_SHAPE_COLOR_BYTE_OFFSET;
    public static final long DRAW_BOUNDING_BOX_BYTE_OFFSET;
    public static final long DRAW_CENTER_OF_MASS_TRANSFORM_BYTE_OFFSET;
    public static final long DRAW_WORLD_TRANSFORM_BYTE_OFFSET;
    public static final long DRAW_VELOCITY_BYTE_OFFSET;
    public static final long DRAW_MASS_AND_INERTIA_BYTE_OFFSET;
    public static final long DRAW_SLEEP_STATS_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_VERTICES_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_VERTEX_VELOCITIES_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_EDGE_CONSTRAINTS_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_BEND_CONSTRAINTS_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_VOLUME_CONSTRAINTS_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_SKIN_CONSTRAINTS_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_LRACONSTRAINTS_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_PREDICTED_BOUNDS_BYTE_OFFSET;
    public static final long DRAW_SOFT_BODY_CONSTRAINT_COLOR_BYTE_OFFSET;

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
        
        DRAW_GET_SUPPORT_FUNCTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawGetSupportFunction"));
        DRAW_SUPPORT_DIRECTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSupportDirection"));
        DRAW_GET_SUPPORTING_FACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawGetSupportingFace"));
        DRAW_SHAPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawShape"));
        DRAW_SHAPE_WIREFRAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawShapeWireframe"));
        DRAW_SHAPE_COLOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawShapeColor"));
        DRAW_BOUNDING_BOX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawBoundingBox"));
        DRAW_CENTER_OF_MASS_TRANSFORM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawCenterOfMassTransform"));
        DRAW_WORLD_TRANSFORM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawWorldTransform"));
        DRAW_VELOCITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawVelocity"));
        DRAW_MASS_AND_INERTIA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawMassAndInertia"));
        DRAW_SLEEP_STATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSleepStats"));
        DRAW_SOFT_BODY_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyVertices"));
        DRAW_SOFT_BODY_VERTEX_VELOCITIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyVertexVelocities"));
        DRAW_SOFT_BODY_EDGE_CONSTRAINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyEdgeConstraints"));
        DRAW_SOFT_BODY_BEND_CONSTRAINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyBendConstraints"));
        DRAW_SOFT_BODY_VOLUME_CONSTRAINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyVolumeConstraints"));
        DRAW_SOFT_BODY_SKIN_CONSTRAINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodySkinConstraints"));
        DRAW_SOFT_BODY_LRACONSTRAINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyLRAConstraints"));
        DRAW_SOFT_BODY_PREDICTED_BOUNDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyPredictedBounds"));
        DRAW_SOFT_BODY_CONSTRAINT_COLOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawSoftBodyConstraintColor"));
        
        DRAW_GET_SUPPORT_FUNCTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawGetSupportFunction"));
        DRAW_SUPPORT_DIRECTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSupportDirection"));
        DRAW_GET_SUPPORTING_FACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawGetSupportingFace"));
        DRAW_SHAPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawShape"));
        DRAW_SHAPE_WIREFRAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawShapeWireframe"));
        DRAW_SHAPE_COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawShapeColor"));
        DRAW_BOUNDING_BOX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawBoundingBox"));
        DRAW_CENTER_OF_MASS_TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawCenterOfMassTransform"));
        DRAW_WORLD_TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawWorldTransform"));
        DRAW_VELOCITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawVelocity"));
        DRAW_MASS_AND_INERTIA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawMassAndInertia"));
        DRAW_SLEEP_STATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSleepStats"));
        DRAW_SOFT_BODY_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyVertices"));
        DRAW_SOFT_BODY_VERTEX_VELOCITIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyVertexVelocities"));
        DRAW_SOFT_BODY_EDGE_CONSTRAINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyEdgeConstraints"));
        DRAW_SOFT_BODY_BEND_CONSTRAINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyBendConstraints"));
        DRAW_SOFT_BODY_VOLUME_CONSTRAINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyVolumeConstraints"));
        DRAW_SOFT_BODY_SKIN_CONSTRAINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodySkinConstraints"));
        DRAW_SOFT_BODY_LRACONSTRAINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyLRAConstraints"));
        DRAW_SOFT_BODY_PREDICTED_BOUNDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyPredictedBounds"));
        DRAW_SOFT_BODY_CONSTRAINT_COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawSoftBodyConstraintColor"));
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

    /// @see #drawGetSupportFunction()
    public DrawSettings drawGetSupportFunction(boolean drawGetSupportFunction) {
    	DRAW_GET_SUPPORT_FUNCTION_HANDLE.set(segment, 0L, drawGetSupportFunction);
    	return this;
    }
    
    /// ```
    /// Draw the GetSupport() function, used for convex collision detection
    /// ```
    public boolean drawGetSupportFunction() {
    	return (boolean) DRAW_GET_SUPPORT_FUNCTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSupportDirection()
    public DrawSettings drawSupportDirection(boolean drawSupportDirection) {
    	DRAW_SUPPORT_DIRECTION_HANDLE.set(segment, 0L, drawSupportDirection);
    	return this;
    }
    
    /// ```
    /// When drawing the support function, also draw which direction mapped to a specific support point
    /// ```
    public boolean drawSupportDirection() {
    	return (boolean) DRAW_SUPPORT_DIRECTION_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawGetSupportingFace()
    public DrawSettings drawGetSupportingFace(boolean drawGetSupportingFace) {
    	DRAW_GET_SUPPORTING_FACE_HANDLE.set(segment, 0L, drawGetSupportingFace);
    	return this;
    }
    
    /// ```
    /// Draw the faces that were found colliding during collision detection
    /// ```
    public boolean drawGetSupportingFace() {
    	return (boolean) DRAW_GET_SUPPORTING_FACE_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawShape()
    public DrawSettings drawShape(boolean drawShape) {
    	DRAW_SHAPE_HANDLE.set(segment, 0L, drawShape);
    	return this;
    }
    
    /// ```
    /// Draw the shapes of all bodies
    /// ```
    public boolean drawShape() {
    	return (boolean) DRAW_SHAPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawShapeWireframe()
    public DrawSettings drawShapeWireframe(boolean drawShapeWireframe) {
    	DRAW_SHAPE_WIREFRAME_HANDLE.set(segment, 0L, drawShapeWireframe);
    	return this;
    }
    
    /// ```
    /// When mDrawShape is true and this is true, the shapes will be drawn in wireframe instead of solid.
    /// ```
    public boolean drawShapeWireframe() {
    	return (boolean) DRAW_SHAPE_WIREFRAME_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawShapeColor()
    public DrawSettings drawShapeColor(int drawShapeColor) {
    	DRAW_SHAPE_COLOR_HANDLE.set(segment, 0L, drawShapeColor);
    	return this;
    }
    
    /// ```
    /// Coloring scheme to use for shapes
    /// ```
    public int drawShapeColor() {
    	return (int) DRAW_SHAPE_COLOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawBoundingBox()
    public DrawSettings drawBoundingBox(boolean drawBoundingBox) {
    	DRAW_BOUNDING_BOX_HANDLE.set(segment, 0L, drawBoundingBox);
    	return this;
    }
    
    /// ```
    /// Draw a bounding box per body
    /// ```
    public boolean drawBoundingBox() {
    	return (boolean) DRAW_BOUNDING_BOX_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawCenterOfMassTransform()
    public DrawSettings drawCenterOfMassTransform(boolean drawCenterOfMassTransform) {
    	DRAW_CENTER_OF_MASS_TRANSFORM_HANDLE.set(segment, 0L, drawCenterOfMassTransform);
    	return this;
    }
    
    /// ```
    /// Draw the center of mass for each body
    /// ```
    public boolean drawCenterOfMassTransform() {
    	return (boolean) DRAW_CENTER_OF_MASS_TRANSFORM_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawWorldTransform()
    public DrawSettings drawWorldTransform(boolean drawWorldTransform) {
    	DRAW_WORLD_TRANSFORM_HANDLE.set(segment, 0L, drawWorldTransform);
    	return this;
    }
    
    /// ```
    /// Draw the world transform (which may differ from its center of mass) of each body
    /// ```
    public boolean drawWorldTransform() {
    	return (boolean) DRAW_WORLD_TRANSFORM_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawVelocity()
    public DrawSettings drawVelocity(boolean drawVelocity) {
    	DRAW_VELOCITY_HANDLE.set(segment, 0L, drawVelocity);
    	return this;
    }
    
    /// ```
    /// Draw the velocity vector for each body
    /// ```
    public boolean drawVelocity() {
    	return (boolean) DRAW_VELOCITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawMassAndInertia()
    public DrawSettings drawMassAndInertia(boolean drawMassAndInertia) {
    	DRAW_MASS_AND_INERTIA_HANDLE.set(segment, 0L, drawMassAndInertia);
    	return this;
    }
    
    /// ```
    /// Draw the mass and inertia (as the box equivalent) for each body
    /// ```
    public boolean drawMassAndInertia() {
    	return (boolean) DRAW_MASS_AND_INERTIA_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSleepStats()
    public DrawSettings drawSleepStats(boolean drawSleepStats) {
    	DRAW_SLEEP_STATS_HANDLE.set(segment, 0L, drawSleepStats);
    	return this;
    }
    
    /// ```
    /// Draw stats regarding the sleeping algorithm of each body
    /// ```
    public boolean drawSleepStats() {
    	return (boolean) DRAW_SLEEP_STATS_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodyVertices()
    public DrawSettings drawSoftBodyVertices(boolean drawSoftBodyVertices) {
    	DRAW_SOFT_BODY_VERTICES_HANDLE.set(segment, 0L, drawSoftBodyVertices);
    	return this;
    }
    
    /// ```
    /// Draw the vertices of soft bodies
    /// ```
    public boolean drawSoftBodyVertices() {
    	return (boolean) DRAW_SOFT_BODY_VERTICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodyVertexVelocities()
    public DrawSettings drawSoftBodyVertexVelocities(boolean drawSoftBodyVertexVelocities) {
    	DRAW_SOFT_BODY_VERTEX_VELOCITIES_HANDLE.set(segment, 0L, drawSoftBodyVertexVelocities);
    	return this;
    }
    
    /// ```
    /// Draw the velocities of the vertices of soft bodies
    /// ```
    public boolean drawSoftBodyVertexVelocities() {
    	return (boolean) DRAW_SOFT_BODY_VERTEX_VELOCITIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodyEdgeConstraints()
    public DrawSettings drawSoftBodyEdgeConstraints(boolean drawSoftBodyEdgeConstraints) {
    	DRAW_SOFT_BODY_EDGE_CONSTRAINTS_HANDLE.set(segment, 0L, drawSoftBodyEdgeConstraints);
    	return this;
    }
    
    /// ```
    /// Draw the edge constraints of soft bodies
    /// ```
    public boolean drawSoftBodyEdgeConstraints() {
    	return (boolean) DRAW_SOFT_BODY_EDGE_CONSTRAINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodyBendConstraints()
    public DrawSettings drawSoftBodyBendConstraints(boolean drawSoftBodyBendConstraints) {
    	DRAW_SOFT_BODY_BEND_CONSTRAINTS_HANDLE.set(segment, 0L, drawSoftBodyBendConstraints);
    	return this;
    }
    
    /// ```
    /// Draw the bend constraints of soft bodies
    /// ```
    public boolean drawSoftBodyBendConstraints() {
    	return (boolean) DRAW_SOFT_BODY_BEND_CONSTRAINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodyVolumeConstraints()
    public DrawSettings drawSoftBodyVolumeConstraints(boolean drawSoftBodyVolumeConstraints) {
    	DRAW_SOFT_BODY_VOLUME_CONSTRAINTS_HANDLE.set(segment, 0L, drawSoftBodyVolumeConstraints);
    	return this;
    }
    
    /// ```
    /// Draw the volume constraints of soft bodies
    /// ```
    public boolean drawSoftBodyVolumeConstraints() {
    	return (boolean) DRAW_SOFT_BODY_VOLUME_CONSTRAINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodySkinConstraints()
    public DrawSettings drawSoftBodySkinConstraints(boolean drawSoftBodySkinConstraints) {
    	DRAW_SOFT_BODY_SKIN_CONSTRAINTS_HANDLE.set(segment, 0L, drawSoftBodySkinConstraints);
    	return this;
    }
    
    /// ```
    /// Draw the skin constraints of soft bodies
    /// ```
    public boolean drawSoftBodySkinConstraints() {
    	return (boolean) DRAW_SOFT_BODY_SKIN_CONSTRAINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodyLRAConstraints()
    public DrawSettings drawSoftBodyLRAConstraints(boolean drawSoftBodyLRAConstraints) {
    	DRAW_SOFT_BODY_LRACONSTRAINTS_HANDLE.set(segment, 0L, drawSoftBodyLRAConstraints);
    	return this;
    }
    
    /// ```
    /// Draw the LRA constraints of soft bodies
    /// ```
    public boolean drawSoftBodyLRAConstraints() {
    	return (boolean) DRAW_SOFT_BODY_LRACONSTRAINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodyPredictedBounds()
    public DrawSettings drawSoftBodyPredictedBounds(boolean drawSoftBodyPredictedBounds) {
    	DRAW_SOFT_BODY_PREDICTED_BOUNDS_HANDLE.set(segment, 0L, drawSoftBodyPredictedBounds);
    	return this;
    }
    
    /// ```
    /// Draw the predicted bounds of soft bodies
    /// ```
    public boolean drawSoftBodyPredictedBounds() {
    	return (boolean) DRAW_SOFT_BODY_PREDICTED_BOUNDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawSoftBodyConstraintColor()
    public DrawSettings drawSoftBodyConstraintColor(int drawSoftBodyConstraintColor) {
    	DRAW_SOFT_BODY_CONSTRAINT_COLOR_HANDLE.set(segment, 0L, drawSoftBodyConstraintColor);
    	return this;
    }
    
    /// ```
    /// Coloring scheme to use for soft body constraints
    /// ```
    public int drawSoftBodyConstraintColor() {
    	return (int) DRAW_SOFT_BODY_CONSTRAINT_COLOR_HANDLE.get(segment, 0L);
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