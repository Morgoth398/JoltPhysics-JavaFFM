package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that contains all information of two colliding shapes.
 */
public final class CollideShapeResult {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_COLLIDE_SHAPE_RESULTS_FREE_MEMBERS;

	private static final VarHandle PENETRATION_DEPTH;
	private static final VarHandle SUB_SHAPE_ID_1;
	private static final VarHandle SUB_SHAPE_ID_2;
	private static final VarHandle BODY_ID_2;
	private static final VarHandle SHAPE_1_FACE_COUNT;
	private static final VarHandle SHAPE_1_FACES;
	private static final VarHandle SHAPE_2_FACE_COUNT;
	private static final VarHandle SHAPE_2_FACES;

	private static final long CONTACT_POINT_ON_1_OFFSET;
	private static final long CONTACT_POINT_ON_2_OFFSET;
	private static final long PENETRATION_AXIS_OFFSET;

	private final MemorySegment jphCollideShapeResult;

	private final Vec3 contactPointOn1;
	private final Vec3 contactPointOn2;
	private final Vec3 penetrationAxis;

	private Vec3 vecTmp;

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
		        JAVA_INT.withName("shape1FaceCount"),
		        ADDRESS.withName("shape1Faces"),
		        JAVA_INT.withName("shape2FaceCount"),
		        MemoryLayout.paddingLayout(4),
		        ADDRESS.withName("shape2Faces")
			).withName("JPH_CollideShapeResult");
		
		JPH_COLLIDE_SHAPE_RESULTS_FREE_MEMBERS = downcallHandleVoid("JPH_CollideShapeResult_FreeMembers", ADDRESS);		
		//@formatter:on

		PENETRATION_DEPTH = varHandle(LAYOUT, "penetrationDepth");
		SUB_SHAPE_ID_1 = varHandle(LAYOUT, "subShapeID1");
		SUB_SHAPE_ID_2 = varHandle(LAYOUT, "subShapeID2");
		BODY_ID_2 = varHandle(LAYOUT, "bodyID2");
		SHAPE_1_FACE_COUNT = varHandle(LAYOUT, "shape1FaceCount");
		SHAPE_1_FACES = varHandle(LAYOUT, "shape1Faces");
		SHAPE_2_FACE_COUNT = varHandle(LAYOUT, "shape2FaceCount");
		SHAPE_2_FACES = varHandle(LAYOUT, "shape2Faces");

		CONTACT_POINT_ON_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointOn1"));
		CONTACT_POINT_ON_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointOn2"));
		PENETRATION_AXIS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationAxis"));
	}

	public CollideShapeResult() {
		this(Arena.ofAuto());
	}

	public CollideShapeResult(Arena arena) {
		jphCollideShapeResult = arena.allocate(LAYOUT);

		contactPointOn1 = new Vec3(jphCollideShapeResult.asSlice(CONTACT_POINT_ON_1_OFFSET, Vec3.LAYOUT()));
		contactPointOn2 = new Vec3(jphCollideShapeResult.asSlice(CONTACT_POINT_ON_2_OFFSET, Vec3.LAYOUT()));
		penetrationAxis = new Vec3(jphCollideShapeResult.asSlice(PENETRATION_AXIS_OFFSET, Vec3.LAYOUT()));

		vecTmp = new Vec3();
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphCollideShapeResult, 0, LAYOUT.byteSize());
	}

	public void freeMembers() {
		try {
			MethodHandle method = JPH_COLLIDE_SHAPE_RESULTS_FREE_MEMBERS;
			method.invokeExact(jphCollideShapeResult);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot free members: " + className);
		}
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
		return (float) PENETRATION_DEPTH.get(jphCollideShapeResult);
	}

	/**
	 * Sub shape ID that identifies the face on shape 1.
	 */
	public int getSubShapeId1() {
		return (int) SUB_SHAPE_ID_1.get(jphCollideShapeResult);
	}

	/**
	 * Sub shape ID that identifies the face on shape 2.
	 */
	public int getSubShapeId2() {
		return (int) SUB_SHAPE_ID_2.get(jphCollideShapeResult);
	}

	/**
	 * BodyID to which shape 2 belongs to.
	 */
	public int getBodyId2() {
		return (int) BODY_ID_2.get(jphCollideShapeResult);
	}

	/**
	 * 
	 */
	public int getShape1FaceCount() {
		return (int) SHAPE_1_FACE_COUNT.get(jphCollideShapeResult);
	}

	/**
	 * Colliding faces on shape 1 (optional result, in world space or relative to
	 * base offset)
	 * <p>
	 * 
	 * The array must be big enough to hold 3 * {@link #getShape1FaceCount()}
	 * elements.
	 */
	public float[] getShape1Faces(float[] target) {
		MemorySegment segment = (MemorySegment) SHAPE_1_FACES.get(jphCollideShapeResult);

		int vectorCount = getShape1FaceCount();
		MemorySegment array = segment.reinterpret(vectorCount * Vec3.LAYOUT().byteSize());

		int counter = 0;
		for (int i = 0; i < vectorCount; i++) {
			long offset = i * Vec3.LAYOUT().byteSize();
			MemorySegment.copy(array, offset, vecTmp.memorySegment(), 0, Vec3.LAYOUT().byteSize());

			target[counter++] = vecTmp.getX();
			target[counter++] = vecTmp.getY();
			target[counter++] = vecTmp.getZ();
		}

		return target;
	}

	/**
	 * Colliding faces on shape 1 (optional result, in world space or relative to
	 * base offset)
	 */
	public float[] getShape1Faces() {
		return getShape1Faces(new float[3 * getShape1FaceCount()]);
	}

	/**
	 * 
	 */
	public int getShape2FaceCount() {
		return (int) SHAPE_2_FACE_COUNT.get(jphCollideShapeResult);
	}

	/**
	 * Colliding faces on shape 2 (optional result, in world space or relative to
	 * base offset)
	 * <p>
	 * The array must be big enough to hold 3 * {@link #getShape1FaceCount()}
	 * elements.
	 */
	public float[] getShape2Faces(float[] target) {
		MemorySegment segment = (MemorySegment) SHAPE_2_FACES.get(jphCollideShapeResult);

		int vectorCount = getShape2FaceCount();
		MemorySegment array = segment.reinterpret(vectorCount * Vec3.LAYOUT().byteSize());

		int counter = 0;
		for (int i = 0; i < vectorCount; i++) {
			long offset = i * Vec3.LAYOUT().byteSize();
			MemorySegment.copy(array, offset, vecTmp.memorySegment(), 0, Vec3.LAYOUT().byteSize());

			target[counter++] = vecTmp.getX();
			target[counter++] = vecTmp.getY();
			target[counter++] = vecTmp.getZ();
		}

		return target;
	}

	/**
	 * Colliding faces on shape 2 (optional result, in world space or relative to
	 * base offset)
	 */
	public float[] getShape2Faces() {
		return getShape2Faces(new float[3 * getShape2FaceCount()]);
	}

	public MemorySegment memorySegment() {
		return jphCollideShapeResult;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
