package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.JoltEnums.ActiveEdgeMode;
import volucris.engine.physics.jolt.JoltEnums.CollectFacesMode;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Settings to be passed with a collision query.
 */
public sealed class CollideSettingsBase permits CollideShapeSettings, ShapeCastSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle ACTIVE_EDGE_MODE;
	private static final VarHandle COLLECT_FACES_MODE;
	private static final VarHandle COLLISION_TOLERANCE;
	private static final VarHandle PENETRATION_TOLERANCE;

	private static final long ACTIVE_EDGE_MOVEMENT_DIRECTION_OFFSET;

	private final MemorySegment jphCollideSettingsBase;

	private final Vec3 activeEdgeMovementDirection;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("activeEdgeMode"),
		        JAVA_INT.withName("collectFacesMode"),
		        JAVA_FLOAT.withName("collisionTolerance"),
		        JAVA_FLOAT.withName("penetrationTolerance"),
		        Vec3.LAYOUT().withName("activeEdgeMovementDirection")
			).withName("JPH_CollideSettingsBase");
		//@formatter:on

		ACTIVE_EDGE_MODE = varHandle(LAYOUT, "activeEdgeMode");
		COLLECT_FACES_MODE = varHandle(LAYOUT, "collectFacesMode");
		COLLISION_TOLERANCE = varHandle(LAYOUT, "collisionTolerance");
		PENETRATION_TOLERANCE = varHandle(LAYOUT, "penetrationTolerance");

		ACTIVE_EDGE_MOVEMENT_DIRECTION_OFFSET = LAYOUT
				.byteOffset(PathElement.groupElement("activeEdgeMovementDirection"));
	}

	protected CollideSettingsBase(MemorySegment segment) {
		jphCollideSettingsBase = segment;

		activeEdgeMovementDirection = new Vec3(segment.asSlice(ACTIVE_EDGE_MOVEMENT_DIRECTION_OFFSET, Vec3.LAYOUT()));
	}

	/**
	 * How active edges (edges that a moving object should bump into) are handled.
	 */
	public void setActiveEdgeMode(ActiveEdgeMode mode) {
		ACTIVE_EDGE_MODE.set(jphCollideSettingsBase, mode);
	}

	/**
	 * How active edges (edges that a moving object should bump into) are handled.
	 */
	public ActiveEdgeMode getActiveEdgeMode() {
		int value = (int) ACTIVE_EDGE_MODE.get(jphCollideSettingsBase);

		for (ActiveEdgeMode mode : ActiveEdgeMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new VolucrisRuntimeException("Jolt: Wrong active edge mode!");
	}

	/**
	 * If colliding faces should be collected or only the collision point.
	 */
	public void setCollectFacesMode(CollectFacesMode mode) {
		COLLECT_FACES_MODE.set(jphCollideSettingsBase, mode);
	}

	/**
	 * If colliding faces should be collected or only the collision point.
	 */
	public CollectFacesMode getCollectFacesMode() {
		int value = (int) COLLECT_FACES_MODE.get(jphCollideSettingsBase);

		for (CollectFacesMode mode : CollectFacesMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new VolucrisRuntimeException("Jolt: Wrong collect faces mode!");
	}

	/**
	 * If objects are closer than this distance, they are considered to be colliding
	 * (used for GJK) (unit: meter)
	 */
	public void setCollisionTolerance(float tolerance) {
		COLLISION_TOLERANCE.set(jphCollideSettingsBase, tolerance);
	}

	/**
	 * If objects are closer than this distance, they are considered to be colliding
	 * (used for GJK) (unit: meter)
	 */
	public float getCollisionTolerance() {
		return (float) COLLISION_TOLERANCE.get(jphCollideSettingsBase);
	}

	/**
	 * A factor that determines the accuracy of the penetration depth calculation.
	 * If the change of the squared distance is less than tolerance *
	 * current_penetration_depth^2 the algorithm will terminate. (unit:
	 * dimensionless)
	 */
	public void setPenetrationTolerance(float tolerance) {
		PENETRATION_TOLERANCE.set(jphCollideSettingsBase, tolerance);
	}

	/**
	 * @see #setPenetrationTolerance(float)
	 */
	public float getPenetrationTolerance() {
		return (float) PENETRATION_TOLERANCE.get(jphCollideSettingsBase);
	}

	/**
	 * When mActiveEdgeMode is CollideOnlyWithActive a movement direction can be
	 * provided. When hitting an inactive edge, the system will select the triangle
	 * normal as penetration depth only if it impedes the movement less than with
	 * the calculated penetration depth.
	 */
	public void setActiveEdgeMovementDirection(float x, float y, float z) {
		activeEdgeMovementDirection.set(x, y, z);
	}

	/**
	 * @see #setActiveEdgeMovementDirection(Vector3f)
	 */
	public void setActiveEdgeMovementDirection(Vector3f direction) {
		activeEdgeMovementDirection.set(direction);
	}

	/**
	 * @see #setActiveEdgeMovementDirection(Vector3f)
	 */
	public Vector3f getActiveEdgeMovementDirection(Vector3f target) {
		return activeEdgeMovementDirection.get(target);
	}

	/**
	 * @see #setActiveEdgeMovementDirection(Vector3f)
	 */
	public Vector3f getActiveEdgeMovementDirection() {
		return getActiveEdgeMovementDirection(new Vector3f());
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
