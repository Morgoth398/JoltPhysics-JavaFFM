package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Result of a shape cast test.
 */
public class ShapeCastResult {

	private static final StructLayout LAYOUT;

	private static final VarHandle PENETRATION_DEPTH;
	private static final VarHandle SUB_SHAPE_ID_1;
	private static final VarHandle SUB_SHAPE_ID_2;
	private static final VarHandle BODY_ID_2;
	private static final VarHandle FRACTION;
	private static final VarHandle IS_BACKFACE_HIT;

	private static final long CONTACT_POINT_ON_1_OFFSET;
	private static final long CONTACT_POINT_ON_2_OFFSET;
	private static final long PENETRATION_AXIS_OFFSET;

	private final MemorySegment jphShapeCastResult;

	private final Vec3 contactPointOn1;
	private final Vec3 contactPointOn2;
	private final Vec3 penetrationAxis;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        Vec3.LAYOUT().withName("contactPointOn1"),
		        Vec3.LAYOUT().withName("contactPointOn2"),
		        Vec3.LAYOUT().withName("penetrationAxis"),
		        JAVA_FLOAT.withName("penetrationDepth"),
		        JAVA_INT.withName("subShapeID1"),
		        JAVA_INT.withName("subShapeID2"),
		        JAVA_INT.withName("bodyID2"),
		        JAVA_FLOAT.withName("fraction"),
		        JAVA_BOOLEAN.withName("isBackFaceHit"),
		        MemoryLayout.paddingLayout(3)
			);
		//@formatter:on

		PENETRATION_DEPTH = varHandle(LAYOUT, "penetrationDepth");
		SUB_SHAPE_ID_1 = varHandle(LAYOUT, "subShapeID1");
		SUB_SHAPE_ID_2 = varHandle(LAYOUT, "subShapeID2");
		BODY_ID_2 = varHandle(LAYOUT, "bodyID2");
		FRACTION = varHandle(LAYOUT, "fraction");
		IS_BACKFACE_HIT = varHandle(LAYOUT, "isBackFaceHit");

		CONTACT_POINT_ON_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointOn1"));
		CONTACT_POINT_ON_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointOn2"));
		PENETRATION_AXIS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationAxis"));
	}

	public ShapeCastResult() {
		this(Arena.ofAuto());
	}
	
	public ShapeCastResult(Arena arena) {
		jphShapeCastResult = arena.allocate(LAYOUT);

		contactPointOn1 = new Vec3(jphShapeCastResult.asSlice(CONTACT_POINT_ON_1_OFFSET, Vec3.LAYOUT()));
		contactPointOn2 = new Vec3(jphShapeCastResult.asSlice(CONTACT_POINT_ON_2_OFFSET, Vec3.LAYOUT()));
		penetrationAxis = new Vec3(jphShapeCastResult.asSlice(PENETRATION_AXIS_OFFSET, Vec3.LAYOUT()));
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphShapeCastResult, 0, LAYOUT.byteSize());
	}

	/**
	 * Contact point on the surface of shape 1 (in world space or relative to base
	 * offset)
	 */
	public Vector3f getContactPoint1(Vector3f target) {
		return contactPointOn1.get(target);
	}

	/**
	 * Contact point on the surface of shape 1 (in world space or relative to base
	 * offset)
	 */
	public Vector3f getContactPoint1() {
		return getContactPoint1(new Vector3f());
	}

	/**
	 * Contact point on the surface of shape 2 (in world space or relative to base
	 * offset). If the penetration depth is 0, this will be the same as
	 * mContactPointOn1.
	 */
	public Vector3f getContactPoint2(Vector3f target) {
		return contactPointOn2.get(target);
	}

	/**
	 * @see #getContactPoint2(Vector3f)
	 */
	public Vector3f getContactPoint2() {
		return getContactPoint2(new Vector3f());
	}

	/**
	 * Direction to move shape 2 out of collision along the shortest path (magnitude
	 * is meaningless, in world space). You can use -mPenetrationAxis.Normalized()
	 * as contact normal.
	 */
	public Vector3f getPenetrationAxis(Vector3f target) {
		return penetrationAxis.get(target);
	}

	/**
	 * @see #getPenetrationAxis(Vector3f)
	 */
	public Vector3f getPenetrationAxis() {
		return getPenetrationAxis(new Vector3f());
	}

	/**
	 * Penetration depth (move shape 2 by this distance to resolve the collision).
	 * If CollideShapeSettings::mMaxSeparationDistance > 0 this number can be
	 * negative to indicate that the objects are separated by -mPenetrationDepth.
	 * The contact points are the closest points in that case.
	 */
	public float getPenetrationDepth() {
		return (float) PENETRATION_DEPTH.get(jphShapeCastResult);
	}

	/**
	 * Sub shape ID that identifies the face on shape 1.
	 */
	public int getSubShapeId1() {
		return (int) SUB_SHAPE_ID_1.get(jphShapeCastResult);
	}

	/**
	 * Sub shape ID that identifies the face on shape 2.
	 */
	public int getSubShapeId2() {
		return (int) SUB_SHAPE_ID_2.get(jphShapeCastResult);
	}

	/**
	 * BodyID to which shape 2 belongs to.
	 */
	public int getBodyId2() {
		return (int) BODY_ID_2.get(jphShapeCastResult);
	}

	/**
	 * This is the fraction where the shape hit the other shape: CenterOfMassOnHit =
	 * Start + value * (End - Start)
	 */
	public float getFraction() {
		return (float) FRACTION.get(jphShapeCastResult);
	}

	/**
	 * True if the shape was hit from the back side.
	 */
	public boolean isBackFaceHit() {
		return (boolean) IS_BACKFACE_HIT.get(jphShapeCastResult);
	}

	public MemorySegment memorySegment() {
		return jphShapeCastResult;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
