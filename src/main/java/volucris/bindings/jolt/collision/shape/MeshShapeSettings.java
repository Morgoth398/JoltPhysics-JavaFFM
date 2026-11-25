/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.PhysicsMaterialList;
import volucris.bindings.jolt.geometry.IndexedTriangleArray;
import volucris.bindings.jolt.geometry.TriangleArray;
import volucris.bindings.jolt.math.Float3Array;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MeshShapeSettings extends ShapeSettings {

	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_AS_SHAPE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_TRIANGLE_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_TRIANGLE_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_INDEXED_TRIANGLES;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_INDEXED_TRIANGLES;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_MATERIALS;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY;
	private static final LazyConstant<MethodHandle> JPH_MESH_SHAPE_SETTINGS_SANITIZE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_MESH_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_MeshShapeSettings_Create", UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_CREATE1 = downcallHandle("JPH_MeshShapeSettings_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_MeshShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_AS_SHAPE_SETTINGS = downcallHandle("JPH_MeshShapeSettings_AsShapeSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_GET_TRIANGLE_VERTICES = downcallHandleVoid("JPH_MeshShapeSettings_GetTriangleVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_TRIANGLE_VERTICES = downcallHandleVoid("JPH_MeshShapeSettings_SetTriangleVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_GET_INDEXED_TRIANGLES = downcallHandleVoid("JPH_MeshShapeSettings_GetIndexedTriangles", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_INDEXED_TRIANGLES = downcallHandleVoid("JPH_MeshShapeSettings_SetIndexedTriangles", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_GET_MATERIALS = downcallHandleVoid("JPH_MeshShapeSettings_GetMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_MATERIALS = downcallHandleVoid("JPH_MeshShapeSettings_SetMaterials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF = downcallHandle("JPH_MeshShapeSettings_GetMaxTrianglesPerLeaf", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF = downcallHandleVoid("JPH_MeshShapeSettings_SetMaxTrianglesPerLeaf", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandle("JPH_MeshShapeSettings_GetActiveEdgeCosThresholdAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE = downcallHandleVoid("JPH_MeshShapeSettings_SetActiveEdgeCosThresholdAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA = downcallHandle("JPH_MeshShapeSettings_GetPerTriangleUserData", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA = downcallHandleVoid("JPH_MeshShapeSettings_SetPerTriangleUserData", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY = downcallHandle("JPH_MeshShapeSettings_GetBuildQuality", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY = downcallHandleVoid("JPH_MeshShapeSettings_SetBuildQuality", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_MESH_SHAPE_SETTINGS_SANITIZE = downcallHandleVoid("JPH_MeshShapeSettings_Sanitize", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public MeshShapeSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public MeshShapeSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MeshShapeSettings(
	    TriangleArray inTriangles,
	    PhysicsMaterialList inMaterials
	) {
	    this(
	        Arena.ofAuto(),
	        inTriangles,
	        inMaterials
	    );
	}
	
	/// Typed method of [#create1].
	public MeshShapeSettings(
		Arena arena,
		TriangleArray inTriangles,
		PhysicsMaterialList inMaterials
	) {
		MemorySegment segment = create1(
			inTriangles.memorySegment(),
			inMaterials.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MeshShapeSettings(
	    Float3Array inVertices,
	    IndexedTriangleArray inTriangles,
	    PhysicsMaterialList inMaterials
	) {
	    this(
	        Arena.ofAuto(),
	        inVertices,
	        inTriangles,
	        inMaterials
	    );
	}
	
	/// Typed method of [#create2].
	public MeshShapeSettings(
		Arena arena,
		Float3Array inVertices,
		IndexedTriangleArray inTriangles,
		PhysicsMaterialList inMaterials
	) {
		MemorySegment segment = create2(
			inVertices.memorySegment(),
			inTriangles.memorySegment(),
			inMaterials.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShapeSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MeshShapeSettings(MemorySegment segment) {
		this.segment = segment;
		super(asShapeSettings(segment));
	}

    /// ```
    /// Default constructor for deserialization
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a mesh shape.
    /// ```
    public static MemorySegment create1(
    	MemorySegment inTriangles,
    	MemorySegment inMaterials
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inTriangles,
    			inMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inVertices,
    	MemorySegment inTriangles,
    	MemorySegment inMaterials
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVertices,
    			inTriangles,
    			inMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShapeSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_AS_SHAPE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Vertices belonging to mIndexedTriangles
    /// ```
    public static void getTriangleVertices(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_TRIANGLE_VERTICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTriangleVertices].
    public final void getTriangleVertices(
    	Float3Array outResult
    ) {
    	getTriangleVertices(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vertices belonging to mIndexedTriangles
    /// ```
    public static void setTriangleVertices(
    	MemorySegment self,
    	MemorySegment mTriangleVertices
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_TRIANGLE_VERTICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTriangleVertices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTriangleVertices].
    public final void setTriangleVertices(
    	Float3Array mTriangleVertices
    ) {
    	setTriangleVertices(
    		this.segment,
    		mTriangleVertices.memorySegment()
    	);
    }
    
    /// ```
    /// Original list of indexed triangles (triangles will be reordered internally in the mesh shape).
    /// Triangles must be provided in counter clockwise order.
    /// Degenerate triangles will automatically be removed during mesh creation but no other mesh simplifications are performed, use an external library if this is desired.
    /// For simulation, the triangles are considered to be single sided.
    /// For ray casts you can choose to make triangles double sided by setting RayCastSettings::mBackFaceMode to EBackFaceMode::CollideWithBackFaces.
    /// For collide shape tests you can use CollideShapeSettings::mBackFaceMode and for shape casts you can use ShapeCastSettings::mBackFaceModeTriangles.
    /// ```
    public static void getIndexedTriangles(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_INDEXED_TRIANGLES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIndexedTriangles].
    public final void getIndexedTriangles(
    	IndexedTriangleArray outResult
    ) {
    	getIndexedTriangles(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Original list of indexed triangles (triangles will be reordered internally in the mesh shape).
    /// Triangles must be provided in counter clockwise order.
    /// Degenerate triangles will automatically be removed during mesh creation but no other mesh simplifications are performed, use an external library if this is desired.
    /// For simulation, the triangles are considered to be single sided.
    /// For ray casts you can choose to make triangles double sided by setting RayCastSettings::mBackFaceMode to EBackFaceMode::CollideWithBackFaces.
    /// For collide shape tests you can use CollideShapeSettings::mBackFaceMode and for shape casts you can use ShapeCastSettings::mBackFaceModeTriangles.
    /// ```
    public static void setIndexedTriangles(
    	MemorySegment self,
    	MemorySegment mIndexedTriangles
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_INDEXED_TRIANGLES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIndexedTriangles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIndexedTriangles].
    public final void setIndexedTriangles(
    	IndexedTriangleArray mIndexedTriangles
    ) {
    	setIndexedTriangles(
    		this.segment,
    		mIndexedTriangles.memorySegment()
    	);
    }
    
    /// ```
    /// Materials assigned to the triangles. Each triangle specifies which material it uses through its mMaterialIndex
    /// ```
    public static void getMaterials(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterials].
    public final void getMaterials(
    	PhysicsMaterialList outResult
    ) {
    	getMaterials(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Materials assigned to the triangles. Each triangle specifies which material it uses through its mMaterialIndex
    /// ```
    public static void setMaterials(
    	MemorySegment self,
    	MemorySegment mMaterials
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_MATERIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterials].
    public final void setMaterials(
    	PhysicsMaterialList mMaterials
    ) {
    	setMaterials(
    		this.segment,
    		mMaterials.memorySegment()
    	);
    }
    
    /// ```
    /// Maximum number of triangles in each leaf of the axis aligned box tree. This is a balance between memory and performance. Can be in the range [1, MeshShape::MaxTrianglesPerLeaf].
    /// Sensible values are between 4 (for better performance) and 8 (for less memory usage).
    /// ```
    public static int getMaxTrianglesPerLeaf(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_MAX_TRIANGLES_PER_LEAF.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxTrianglesPerLeaf].
    public final int getMaxTrianglesPerLeaf() {
    	return getMaxTrianglesPerLeaf(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum number of triangles in each leaf of the axis aligned box tree. This is a balance between memory and performance. Can be in the range [1, MeshShape::MaxTrianglesPerLeaf].
    /// Sensible values are between 4 (for better performance) and 8 (for less memory usage).
    /// ```
    public static void setMaxTrianglesPerLeaf(
    	MemorySegment self,
    	int mMaxTrianglesPerLeaf
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_MAX_TRIANGLES_PER_LEAF.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxTrianglesPerLeaf
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxTrianglesPerLeaf].
    public final void setMaxTrianglesPerLeaf(
    	int mMaxTrianglesPerLeaf
    ) {
    	setMaxTrianglesPerLeaf(
    		this.segment,
    		mMaxTrianglesPerLeaf
    	);
    }
    
    /// ```
    /// Cosine of the threshold angle (if the angle between the two triangles is bigger than this, the edge is active, note that a concave edge is always inactive).
    /// Setting this value too small can cause ghost collisions with edges, setting it too big can cause depenetration artifacts (objects not depenetrating quickly).
    /// Valid ranges are between cos(0 degrees) and cos(90 degrees). The default value is cos(5 degrees).
    /// Negative values will make all edges active and causes EActiveEdgeMode::CollideOnlyWithActive to behave as EActiveEdgeMode::CollideWithAll.
    /// This speeds up the build process but will require all bodies that can interact with the mesh to use BodyCreationSettings::mEnhancedInternalEdgeRemoval = true.
    /// ```
    public static float getActiveEdgeCosThresholdAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getActiveEdgeCosThresholdAngle].
    public final float getActiveEdgeCosThresholdAngle() {
    	return getActiveEdgeCosThresholdAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Cosine of the threshold angle (if the angle between the two triangles is bigger than this, the edge is active, note that a concave edge is always inactive).
    /// Setting this value too small can cause ghost collisions with edges, setting it too big can cause depenetration artifacts (objects not depenetrating quickly).
    /// Valid ranges are between cos(0 degrees) and cos(90 degrees). The default value is cos(5 degrees).
    /// Negative values will make all edges active and causes EActiveEdgeMode::CollideOnlyWithActive to behave as EActiveEdgeMode::CollideWithAll.
    /// This speeds up the build process but will require all bodies that can interact with the mesh to use BodyCreationSettings::mEnhancedInternalEdgeRemoval = true.
    /// ```
    public static void setActiveEdgeCosThresholdAngle(
    	MemorySegment self,
    	float mActiveEdgeCosThresholdAngle
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_ACTIVE_EDGE_COS_THRESHOLD_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mActiveEdgeCosThresholdAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setActiveEdgeCosThresholdAngle].
    public final void setActiveEdgeCosThresholdAngle(
    	float mActiveEdgeCosThresholdAngle
    ) {
    	setActiveEdgeCosThresholdAngle(
    		this.segment,
    		mActiveEdgeCosThresholdAngle
    	);
    }
    
    /// ```
    /// When true, we store the user data coming from Triangle::mUserData or IndexedTriangle::mUserData in the mesh shape.
    /// This can be used to store additional data like the original index of the triangle in the mesh.
    /// Can be retrieved using MeshShape::GetTriangleUserData.
    /// Turning this on increases the memory used by the MeshShape by roughly 25%.
    /// ```
    public static boolean getPerTriangleUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_PER_TRIANGLE_USER_DATA.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPerTriangleUserData].
    public final boolean getPerTriangleUserData() {
    	return getPerTriangleUserData(
    		this.segment
    	);
    }
    
    /// ```
    /// When true, we store the user data coming from Triangle::mUserData or IndexedTriangle::mUserData in the mesh shape.
    /// This can be used to store additional data like the original index of the triangle in the mesh.
    /// Can be retrieved using MeshShape::GetTriangleUserData.
    /// Turning this on increases the memory used by the MeshShape by roughly 25%.
    /// ```
    public static void setPerTriangleUserData(
    	MemorySegment self,
    	boolean mPerTriangleUserData
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_PER_TRIANGLE_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPerTriangleUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPerTriangleUserData].
    public final void setPerTriangleUserData(
    	boolean mPerTriangleUserData
    ) {
    	setPerTriangleUserData(
    		this.segment,
    		mPerTriangleUserData
    	);
    }
    
    /// ```
    /// Determines the quality of the tree building process.
    /// ```
    public static int getBuildQuality(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_GET_BUILD_QUALITY.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBuildQuality].
    public final int getBuildQuality() {
    	return getBuildQuality(
    		this.segment
    	);
    }
    
    /// ```
    /// Determines the quality of the tree building process.
    /// ```
    public static void setBuildQuality(
    	MemorySegment self,
    	int mBuildQuality
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SET_BUILD_QUALITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBuildQuality
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBuildQuality].
    public final void setBuildQuality(
    	int mBuildQuality
    ) {
    	setBuildQuality(
    		this.segment,
    		mBuildQuality
    	);
    }
    
    /// ```
    /// Sanitize the mesh data. Remove duplicate and degenerate triangles. This is called automatically when constructing the MeshShapeSettings with a list of (indexed-) triangles.
    /// ```
    public static void sanitize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MESH_SHAPE_SETTINGS_SANITIZE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sanitize].
    public final void sanitize() {
    	sanitize(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}