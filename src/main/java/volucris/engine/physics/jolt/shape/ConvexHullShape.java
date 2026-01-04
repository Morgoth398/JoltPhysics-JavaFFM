package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A convex hull.
 */
public final class ConvexHullShape extends ConvexShape {

	private static final MethodHandle JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS;
	private static final MethodHandle JPH_CONVEX_HULL_SHAPE_GET_POINT;
	private static final MethodHandle JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES;
	private static final MethodHandle JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE;
	private static final MethodHandle JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS = downcallHandle("JPH_ConvexHullShape_GetNumPoints", JAVA_INT, ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_POINT = downcallHandleVoid("JPH_ConvexHullShape_GetPoint", ADDRESS, JAVA_INT, ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES = downcallHandle("JPH_ConvexHullShape_GetNumFaces", JAVA_INT, ADDRESS);
		JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE = downcallHandle("JPH_ConvexHullShape_GetNumVerticesInFace", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES = downcallHandle("JPH_ConvexHullShape_GetFaceVertices", JAVA_INT, ADDRESS, JAVA_INT, JAVA_INT, ADDRESS);
		//@formatter:on
	}

	protected ConvexHullShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}
	
	protected ConvexHullShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected ConvexHullShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}
	
	protected ConvexHullShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);

		vecTmp = new Vec3(arena);
	}

	/**
	 * Get the number of vertices in this convex hull.
	 */
	public int getNumPoints() {
		try {
			MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_POINTS;
			return (int) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get num points.");
		}
	}

	/**
	 * Get a vertex of this convex hull relative to the center of mass.
	 */
	public Vector3f getPoint(int index, Vector3f target) {
		try {
			MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_POINT;
			method.invokeExact(jphShape, index, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get point.");
		}
	}

	/**
	 * Get a vertex of this convex hull relative to the center of mass.
	 */
	public Vector3f getPoint(int index) {
		return getPoint(index, new Vector3f());
	}

	/**
	 * Get the number of faces in this convex hull.
	 */
	public int getNumFaces() {
		try {
			MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_FACES;
			return (int) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get num faces.");
		}
	}

	/**
	 * Get the number of vertices in a face.
	 */
	public int getNumVerticesInFace(int faceIndex) {
		try {
			MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_NUM_VERTICES_IN_FACE;
			return (int) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get num vertices in face.");
		}
	}

	/**
	 * Get the vertices indices of a face
	 * 
	 * @return Number of vertices in face, if this is bigger than inMaxVertices, not
	 *         all vertices were retrieved.
	 */
	public int getFaceVertices(int faceIndex, int maxVertices, int[] target) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(maxVertices, JAVA_INT));

			MethodHandle method = JPH_CONVEX_HULL_SHAPE_GET_FACE_VERTICES;
			int count = (int) method.invokeExact(jphShape, faceIndex, maxVertices, array);

			for (int i = 0; i < maxVertices; i++)
				target[i] = array.getAtIndex(JAVA_INT, i);

			return count;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get face vertices.");
		}
	}

}