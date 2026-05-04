package volucris.engine.physics.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.JoltEnums.ShapeColor;
import volucris.engine.physics.jolt.JoltEnums.SoftBodyConstraintColor;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Draw settings
 * <p>
 * Note that there are several debug drawing features that are not exposed
 * through this interface since they use information that is only available deep
 * inside the simulation update and are mostly there to facilitate debugging
 * Jolt. These options use DebugRenderer::sInstance to draw.
 * <p>
 * E.g.:
 * <ul>
 * <li>To draw contact information, use
 * ContactConstraintManager::sDrawContactManifolds.
 * <li>To draw when continuous collision detection is used, use
 * PhysicsSystem::sDrawMotionQualityLinearCast.
 * <li>To draw what's going on in a CharacterVirtual update, use
 * CharacterVirtual::sDrawConstraints, CharacterVirtual::sDrawWalkStairs and
 * CharacterVirtual::sDrawStickToFloor.
 * <li>To draw the volume of water that interacts with a shape, use
 * Shape::sDrawSubmergedVolumes.
 * </ul>
 * 
 */
public final class DrawSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle DRAW_SETTINGS_INIT_DEFAULT;

	private static final VarHandle DRAW_GET_SUPPORT_FUNCTION;
	private static final VarHandle DRAW_SUPPORT_DIRECTION;
	private static final VarHandle DRAW_GET_SUPPORTING_FACE;
	private static final VarHandle DRAW_SHAPE;
	private static final VarHandle DRAW_SHAPE_WIREFRAME;
	private static final VarHandle DRAW_SHAPE_COLOR;
	private static final VarHandle DRAW_BOUNDING_BOX;
	private static final VarHandle DRAW_CENTER_OF_MASS_TRANSFORM;
	private static final VarHandle DRAW_WORLD_TRANSFORM;
	private static final VarHandle DRAW_VELOCITY;
	private static final VarHandle DRAW_MASS_AND_INERTIA;
	private static final VarHandle DRAW_SLEEP_STATS;
	private static final VarHandle DRAW_SOFT_BODY_VERTICES;
	private static final VarHandle DRAW_SOFT_BODY_VERTEX_VELOCITIES;
	private static final VarHandle DRAW_SOFT_BODY_EDGE_CONSTRAINTS;
	private static final VarHandle DRAW_SOFT_BODY_BEND_CONSTRAINTS;
	private static final VarHandle DRAW_SOFT_BODY_VOLUME_CONSTRAINTS;
	private static final VarHandle DRAW_SOFT_BODY_SKIN_CONSTRAINTS;
	private static final VarHandle DRAW_SOFT_BODY_LRA_CONSTRAINTS;
	private static final VarHandle DRAW_SOFT_BODY_PREDICTED_BOUNDS;
	private static final VarHandle DRAW_SOFT_BODY_CONSTRAINT_COLOR;

	private final MemorySegment jphDrawSettings;

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
			).withName("JPH_DrawSettings");
		
		DRAW_SETTINGS_INIT_DEFAULT = downcallHandleVoid("JPH_DrawSettings_InitDefault", ADDRESS);
		
		//@formatter:on

		DRAW_GET_SUPPORT_FUNCTION = varHandle(LAYOUT, "drawGetSupportFunction");
		DRAW_SUPPORT_DIRECTION = varHandle(LAYOUT, "drawSupportDirection");
		DRAW_GET_SUPPORTING_FACE = varHandle(LAYOUT, "drawGetSupportingFace");
		DRAW_SHAPE = varHandle(LAYOUT, "drawShape");
		DRAW_SHAPE_WIREFRAME = varHandle(LAYOUT, "drawShapeWireframe");
		DRAW_SHAPE_COLOR = varHandle(LAYOUT, "drawShapeColor");
		DRAW_BOUNDING_BOX = varHandle(LAYOUT, "drawBoundingBox");
		DRAW_CENTER_OF_MASS_TRANSFORM = varHandle(LAYOUT, "drawCenterOfMassTransform");
		DRAW_WORLD_TRANSFORM = varHandle(LAYOUT, "drawWorldTransform");
		DRAW_VELOCITY = varHandle(LAYOUT, "drawVelocity");
		DRAW_MASS_AND_INERTIA = varHandle(LAYOUT, "drawMassAndInertia");
		DRAW_SLEEP_STATS = varHandle(LAYOUT, "drawSleepStats");
		DRAW_SOFT_BODY_VERTICES = varHandle(LAYOUT, "drawSoftBodyVertices");
		DRAW_SOFT_BODY_VERTEX_VELOCITIES = varHandle(LAYOUT, "drawSoftBodyVertexVelocities");
		DRAW_SOFT_BODY_EDGE_CONSTRAINTS = varHandle(LAYOUT, "drawSoftBodyEdgeConstraints");
		DRAW_SOFT_BODY_BEND_CONSTRAINTS = varHandle(LAYOUT, "drawSoftBodyBendConstraints");
		DRAW_SOFT_BODY_VOLUME_CONSTRAINTS = varHandle(LAYOUT, "drawSoftBodyVolumeConstraints");
		DRAW_SOFT_BODY_SKIN_CONSTRAINTS = varHandle(LAYOUT, "drawSoftBodySkinConstraints");
		DRAW_SOFT_BODY_LRA_CONSTRAINTS = varHandle(LAYOUT, "drawSoftBodyLRAConstraints");
		DRAW_SOFT_BODY_PREDICTED_BOUNDS = varHandle(LAYOUT, "drawSoftBodyPredictedBounds");
		DRAW_SOFT_BODY_CONSTRAINT_COLOR = varHandle(LAYOUT, "drawSoftBodyConstraintColor");

	}

	public DrawSettings() {
		this(Arena.ofAuto());
	}
	
	public DrawSettings(Arena arena) {
		jphDrawSettings = arena.allocate(LAYOUT);

		init();
	}

	private void init() {
		try {
			MethodHandle method = DRAW_SETTINGS_INIT_DEFAULT;
			method.invokeExact(jphDrawSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot initialize draw settings.");
		}
	}

	public boolean drawGetSupportFunction() {
		return (boolean) DRAW_GET_SUPPORT_FUNCTION.get(jphDrawSettings);
	}

	/**
	 * Draw the GetSupport() function, used for convex collision detection.
	 */
	public void setDrawGetSupportFunction(boolean value) {
		DRAW_GET_SUPPORT_FUNCTION.set(jphDrawSettings, value);
	}

	public boolean drawSupportDirection() {
		return (boolean) DRAW_SUPPORT_DIRECTION.get(jphDrawSettings);
	}

	/**
	 * When drawing the support function, also draw which direction mapped to a
	 * specific support point.
	 */
	public void setDrawSupportDirection(boolean value) {
		DRAW_SUPPORT_DIRECTION.set(jphDrawSettings, value);
	}

	public boolean drawGetSupportingFace() {
		return (boolean) DRAW_GET_SUPPORTING_FACE.get(jphDrawSettings);
	}

	/**
	 * Draw the faces that were found colliding during collision detection.
	 */
	public void setDrawGetSupportingFace(boolean value) {
		DRAW_GET_SUPPORTING_FACE.set(jphDrawSettings, value);
	}

	public boolean drawShape() {
		return (boolean) DRAW_SHAPE.get(jphDrawSettings);
	}

	/**
	 * Draw the shapes of all bodies.
	 */
	public void setDrawShape(boolean value) {
		DRAW_SHAPE.set(jphDrawSettings, value);
	}

	public boolean drawShapeWireframe() {
		return (boolean) DRAW_SHAPE_WIREFRAME.get(jphDrawSettings);
	}

	/**
	 * When mDrawShape is true and this is true, the shapes will be drawn in
	 * wireframe instead of solid.
	 */
	public void setDrawShapeWireframe(boolean value) {
		DRAW_SHAPE_WIREFRAME.set(jphDrawSettings, value);
	}

	public ShapeColor getDrawShapeColor() {
		int value = (int) DRAW_SHAPE_COLOR.get(jphDrawSettings);

		for (ShapeColor color : ShapeColor.values()) {
			if (value == color.id())
				return color;
		}

		throw new VolucrisRuntimeException("Jolt: Wrong shape color!");
	}

	/**
	 * Coloring scheme to use for shapes.
	 */
	public void setDrawShapeColor(ShapeColor color) {
		DRAW_SHAPE_COLOR.set(jphDrawSettings, color.id());
	}

	public boolean drawBoundingBox() {
		return (boolean) DRAW_BOUNDING_BOX.get(jphDrawSettings);
	}

	/**
	 * Draw a bounding box per body.
	 */
	public void setDrawBoundingBox(boolean value) {
		DRAW_BOUNDING_BOX.set(jphDrawSettings, value);
	}

	public boolean drawCenterOfMassTransform() {
		return (boolean) DRAW_CENTER_OF_MASS_TRANSFORM.get(jphDrawSettings);
	}

	/**
	 * Draw the center of mass for each body.
	 */
	public void setDrawCenterOfMassTransform(boolean value) {
		DRAW_CENTER_OF_MASS_TRANSFORM.set(jphDrawSettings, value);
	}

	public boolean drawWorldTransform() {
		return (boolean) DRAW_WORLD_TRANSFORM.get(jphDrawSettings);
	}

	/**
	 * Draw the world transform (which can be different than the center of mass) for
	 * each body.
	 */
	public void setDrawWorldTransform(boolean value) {
		DRAW_WORLD_TRANSFORM.set(jphDrawSettings, value);
	}

	public boolean drawVelocity() {
		return (boolean) DRAW_VELOCITY.get(jphDrawSettings);
	}

	/**
	 * Draw the velocity vector for each body.
	 */
	public void setDrawVelocity(boolean value) {
		DRAW_VELOCITY.set(jphDrawSettings, value);
	}

	public boolean drawMassAndInertia() {
		return (boolean) DRAW_MASS_AND_INERTIA.get(jphDrawSettings);
	}

	/**
	 * Draw the mass and inertia (as the box equivalent) for each body.
	 */
	public void setDrawMassAndInertia(boolean value) {
		DRAW_MASS_AND_INERTIA.set(jphDrawSettings, value);
	}

	public boolean drawSleepStats() {
		return (boolean) DRAW_SLEEP_STATS.get(jphDrawSettings);
	}

	/**
	 * Draw stats regarding the sleeping algorithm of each body.
	 */
	public void setDrawSleepStats(boolean value) {
		DRAW_SLEEP_STATS.set(jphDrawSettings, value);
	}

	public boolean drawSoftBodyVertices() {
		return (boolean) DRAW_SOFT_BODY_VERTICES.get(jphDrawSettings);
	}

	/**
	 * Draw the vertices of soft bodies.
	 */
	public void setDrawSoftBodyVertices(boolean value) {
		DRAW_SOFT_BODY_VERTICES.set(jphDrawSettings, value);
	}

	public boolean drawSoftBodyVertexVelocities() {
		return (boolean) DRAW_SOFT_BODY_VERTEX_VELOCITIES.get(jphDrawSettings);
	}

	/**
	 * Draw the velocities of the vertices of soft bodies.
	 */
	public void setDrawSoftBodyVertexVelocities(boolean value) {
		DRAW_SOFT_BODY_VERTEX_VELOCITIES.set(jphDrawSettings, value);
	}

	public boolean drawSoftBodyEdgeConstraints() {
		return (boolean) DRAW_SOFT_BODY_EDGE_CONSTRAINTS.get(jphDrawSettings);
	}

	/**
	 * Draw the edge constraints of soft bodies.
	 */
	public void setDrawSoftBodyEdgeConstraints(boolean value) {
		DRAW_SOFT_BODY_EDGE_CONSTRAINTS.set(jphDrawSettings, value);
	}

	public boolean drawSoftBodyBendConstraints() {
		return (boolean) DRAW_SOFT_BODY_BEND_CONSTRAINTS.get(jphDrawSettings);
	}

	/**
	 * Draw the bend constraints of soft bodies.
	 */
	public void setDrawSoftBodyBendConstraints(boolean value) {
		DRAW_SOFT_BODY_BEND_CONSTRAINTS.set(jphDrawSettings, value);
	}

	public boolean drawSoftBodyVolumeConstraints() {
		return (boolean) DRAW_SOFT_BODY_VOLUME_CONSTRAINTS.get(jphDrawSettings);
	}

	/**
	 * Draw the volume constraints of soft bodies.
	 */
	public void setDrawSoftBodyVolumeConstraints(boolean value) {
		DRAW_SOFT_BODY_VOLUME_CONSTRAINTS.set(jphDrawSettings, value);
	}

	public boolean drawSoftBodySkinConstraints() {
		return (boolean) DRAW_SOFT_BODY_SKIN_CONSTRAINTS.get(jphDrawSettings);
	}

	/**
	 * Draw the skin constraints of soft bodies.
	 */
	public void setDrawSoftBodySkinConstraints(boolean value) {
		DRAW_SOFT_BODY_SKIN_CONSTRAINTS.set(jphDrawSettings, value);
	}

	public boolean drawSoftBodyLRAConstraints() {
		return (boolean) DRAW_SOFT_BODY_LRA_CONSTRAINTS.get(jphDrawSettings);
	}

	/**
	 * Draw the LRA constraints of soft bodies.
	 */
	public void setDrawSoftBodyLRAConstraints(boolean value) {
		DRAW_SOFT_BODY_LRA_CONSTRAINTS.set(jphDrawSettings, value);
	}

	public boolean drawSoftBodyPredictedBounds() {
		return (boolean) DRAW_SOFT_BODY_PREDICTED_BOUNDS.get(jphDrawSettings);
	}

	/**
	 * Draw the predicted bounds of soft bodies.
	 */
	public void setDrawSoftBodyPredictedBounds(boolean value) {
		DRAW_SOFT_BODY_PREDICTED_BOUNDS.set(jphDrawSettings, value);
	}

	public SoftBodyConstraintColor getDrawSoftBodyConstraintColor() {
		int value = (int) DRAW_SOFT_BODY_CONSTRAINT_COLOR.get(jphDrawSettings);

		for (SoftBodyConstraintColor color : SoftBodyConstraintColor.values()) {
			if (value == color.id())
				return color;
		}

		throw new VolucrisRuntimeException("Jolt: Wrong soft body constraint color!");
	}

	/**
	 * Coloring scheme to use for soft body constraints.
	 */
	public void setDrawSoftBodyConstraintColor(SoftBodyConstraintColor color) {
		DRAW_SOFT_BODY_CONSTRAINT_COLOR.set(jphDrawSettings, color.id());
	}

	public MemorySegment memorySegment() {
		return jphDrawSettings;
	}

}
