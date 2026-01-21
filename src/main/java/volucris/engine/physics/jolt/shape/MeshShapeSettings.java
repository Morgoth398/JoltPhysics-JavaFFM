package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.math.IndexedTriangle;
import volucris.engine.physics.jolt.math.Triangle;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.shape.ShapeEnums.BuildQuality;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that constructs a MeshShape.
 */
public final class MeshShapeSettings extends ShapeSettings {

	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_CREATE2;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_SANITIZE;
	private static final MethodHandle JPH_MESH_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_MESH_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_MeshShapeSettings_Create", ADDRESS, ADDRESS, JAVA_INT);
		JPH_MESH_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_MeshShapeSettings_Create2", ADDRESS, ADDRESS, JAVA_INT, ADDRESS, JAVA_INT);
		JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF = downcallHandle("JPH_MeshShapeSettings_GetMaxTrianglesPerLeaf", JAVA_INT, ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF = downcallHandleVoid("JPH_MeshShapeSettings_SetMaxTrianglesPerLeaf", ADDRESS, JAVA_INT);
		JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandle("JPH_MeshShapeSettings_GetActiveEdgeCosThresholdAngle", JAVA_FLOAT, ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandleVoid("JPH_MeshShapeSettings_SetActiveEdgeCosThresholdAngle", ADDRESS, JAVA_FLOAT);
		JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA = downcallHandle("JPH_MeshShapeSettings_GetPerTriangleUserData", JAVA_BOOLEAN, ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA = downcallHandleVoid("JPH_MeshShapeSettings_SetPerTriangleUserData", ADDRESS, JAVA_BOOLEAN);
		JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY = downcallHandle("JPH_MeshShapeSettings_GetBuildQuality", JAVA_INT, ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY = downcallHandleVoid("JPH_MeshShapeSettings_SetBuildQuality", ADDRESS, JAVA_INT);
		JPH_MESH_SHAPE_SETTINGS_SANITIZE = downcallHandleVoid("JPH_MeshShapeSettings_Sanitize", ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_MeshShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public MeshShapeSettings(float[] triangles, int triangleCount) {
		this(triangles, triangleCount, Arena.ofAuto());
	}

	public MeshShapeSettings(float[] triangles, int triangleCount, Arena arena) {
		this(triangles, null, triangleCount, arena);
	}

	public MeshShapeSettings(float[] triangles, int[] materialIndices, int triangleCount) {
		this(triangles, materialIndices, triangleCount, Arena.ofAuto());
	}

	public MeshShapeSettings(float[] triangles, int[] materialIndices, int triangleCount, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			MemorySegment array = confinedArena.allocate(MemoryLayout.sequenceLayout(triangleCount, Triangle.LAYOUT()));

			Triangle triangle = new Triangle(confinedArena);

			int floatCount = 0;
			for (int i = 0; i < triangleCount; i++) {
				triangle.setVertex1(triangles[floatCount++], triangles[floatCount++], triangles[floatCount++]);
				triangle.setVertex2(triangles[floatCount++], triangles[floatCount++], triangles[floatCount++]);
				triangle.setVertex3(triangles[floatCount++], triangles[floatCount++], triangles[floatCount++]);

				if (materialIndices != null)
					triangle.setMaterialIndex(materialIndices[i]);

				long offset = i * Triangle.LAYOUT().byteSize();
				MemorySegment.copy(triangle.memorySegment(), 0, array, offset, Triangle.LAYOUT().byteSize());
			}

			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(array, triangleCount);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create mesh shape settings: " + className);
		}
		super(segment, arena);
	}

	public MeshShapeSettings(float[] vertices, int verticesCount, int[] triangles, int triangleCount) {
		this(vertices, verticesCount, triangles, triangleCount, Arena.ofAuto());
	}

	public MeshShapeSettings(float[] vertices, int verticesCount, int[] triangles, int triangleCount, Arena arena) {
		this(vertices, verticesCount, triangles, null, null, triangleCount, arena);
	}

	public MeshShapeSettings(float[] vertices, int verticesCount, int[] triangles, int[] userData, int triangleCount) {
		this(vertices, verticesCount, triangles, userData, triangleCount, Arena.ofAuto());
	}

	public MeshShapeSettings(float[] vertices, int verticesCount, int[] triangles, int[] userData, int triangleCount,
			Arena arena) {
		this(vertices, verticesCount, triangles, null, userData, triangleCount, arena);
	}

	public MeshShapeSettings(float[] vertices, int verticesCount, int[] triangles, int[] materialIndices,
			int[] userData, int triangleCount) {
		this(vertices, verticesCount, triangles, materialIndices, userData, triangleCount, Arena.ofAuto());
	}

	public MeshShapeSettings(float[] vertices, int verticesCount, int[] triangles, int[] materialIndices,
			int[] userData, int triangleCount, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			MemoryLayout arrayLayout = MemoryLayout.sequenceLayout(verticesCount, Vec3.LAYOUT());
			MemorySegment verticesArray = confinedArena.allocate(arrayLayout);

			Vec3 vertex = new Vec3(confinedArena);
			int vertexCounter = 0;
			for (int i = 0; i < verticesCount; i++) {
				vertex.set(vertices[vertexCounter++], vertices[vertexCounter++], vertices[vertexCounter++]);

				long offset = i * Vec3.LAYOUT().byteSize();
				MemorySegment.copy(vertex.memorySegment(), 0, verticesArray, offset, Vec3.LAYOUT().byteSize());
			}

			StructLayout layout = IndexedTriangle.LAYOUT();
			MemorySegment trianglesArray = confinedArena.allocate(MemoryLayout.sequenceLayout(triangleCount, layout));

			IndexedTriangle triangle = new IndexedTriangle(confinedArena);
			int triangleCounter = 0;
			for (int i = 0; i < triangleCount; i++) {
				triangle.setIndex1(triangles[triangleCounter++]);
				triangle.setIndex2(triangles[triangleCounter++]);
				triangle.setIndex3(triangles[triangleCounter++]);

				if (materialIndices != null)
					triangle.setMaterialIndex(materialIndices[i]);
				if (userData != null)
					triangle.setUserData(userData[i]);

				long offset = i * layout.byteSize();
				MemorySegment.copy(triangle.memorySegment(), 0, trianglesArray, offset, layout.byteSize());
			}

			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE2;
			segment = (MemorySegment) method.invokeExact(verticesArray, verticesCount, trianglesArray, triangleCount);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create mesh shape settings: " + className);
		}
		super(segment, arena);
	}

	/**
	 * Maximum number of triangles in each leaf of the axis aligned box tree. This
	 * is a balance between memory and performance. Can be in the range [1,
	 * MeshShape::MaxTrianglesPerLeaf]. Sensible values are between 4 (for better
	 * performance) and 8 (for less memory usage).
	 */
	public int getMaxTrianglesPerLeaf() {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF;
			return (int) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max triangles per leaf: " + className);
		}
	}

	/**
	 * @see #getMaxTrianglesPerLeaf()
	 */
	public void setMaxTrianglesPerLeaf(int maxTrianglePerLeaf) {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF;
			method.invokeExact(jphShapeSettings, maxTrianglePerLeaf);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set max triangles per leaf: " + className);
		}
	}

	/**
	 * Cosine of the threshold angle (if the angle between the two triangles is
	 * bigger than this, the edge is active, note that a concave edge is always
	 * inactive). Setting this value too small can cause ghost collisions with
	 * edges, setting it too big can cause depenetration artifacts (objects not
	 * depenetrating quickly). Valid ranges are between cos(0 degrees) and cos(90
	 * degrees). The default value is cos(5 degrees). Negative values will make all
	 * edges active and causes EActiveEdgeMode::CollideOnlyWithActive to behave as
	 * EActiveEdgeMode::CollideWithAll. This speeds up the build process but will
	 * require all bodies that can interact with the mesh to use
	 * BodyCreationSettings::mEnhancedInternalEdgeRemoval = true.
	 */
	public float getActiveEdgeCosThresholdAngle() {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
			return (float) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get activeEdgeCosThresholdAngle: " + className);
		}
	}

	/**
	 * @see #setActiveEdgeCosThresholdAngle(float)
	 */
	public void setActiveEdgeCosThresholdAngle(float value) {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
			method.invokeExact(jphShapeSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set activeEdgeCosThresholdAngle: " + className);
		}
	}

	/**
	 * When true, we store the user data coming from Triangle::mUserData or
	 * IndexedTriangle::mUserData in the mesh shape. This can be used to store
	 * additional data like the original index of the triangle in the mesh. Can be
	 * retrieved using MeshShape::GetTriangleUserData. Turning this on increases the
	 * memory used by the MeshShape by roughly 25%.
	 */
	public boolean getPerTriangleUserData() {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA;
			return (boolean) method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get perTriangleUserData: " + className);
		}
	}

	/**
	 * @see #getPerTriangleUserData()
	 */
	public void setPerTriangleUserData(boolean value) {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA;
			method.invokeExact(jphShapeSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set perTriangleUserData: " + className);
		}
	}

	/**
	 * Determines the quality of the tree building process.
	 */
	public BuildQuality getBuildQuality() {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY;
			int value = (int) method.invokeExact(jphShapeSettings);

			if (value == BuildQuality.FAVOR_BUILD_SPEED.id())
				return BuildQuality.FAVOR_BUILD_SPEED;
			else
				return BuildQuality.FAVOR_RUNTIME_PERFORMANCE;

		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get build quality: " + className);
		}
	}

	/**
	 * Determines the quality of the tree building process.
	 */
	public void setBuildQuality(BuildQuality buildQuality) {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY;
			method.invokeExact(jphShapeSettings, buildQuality.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set build quality: " + className);
		}
	}

	/**
	 * Sanitize the mesh data. Remove duplicate and degenerate triangles. This is
	 * called automatically when constructing the MeshShapeSettings with a list of
	 * (indexed-) triangles.
	 */
	public void sanitize() {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SANITIZE;
			method.invokeExact(jphShapeSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call sanitize: " + className);
		}
	}

	public MeshShape createShape() {
		return createShape(Arena.ofAuto());
	}

	public MeshShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new MeshShape(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create shape: " + className);
		}
	}

}