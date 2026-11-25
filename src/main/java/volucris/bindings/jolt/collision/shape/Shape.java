/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.jolt.Color;
import volucris.bindings.jolt.IDToMaterialMap;
import volucris.bindings.jolt.MaterialToIDMap;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.SupportingFace;
import volucris.bindings.jolt.body.MassProperties;
import volucris.bindings.jolt.collision.CastRayCollector;
import volucris.bindings.jolt.collision.CollidePointCollector;
import volucris.bindings.jolt.collision.CollideSoftBodyVertexIterator;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.collision.PhysicsMaterialList;
import volucris.bindings.jolt.collision.PhysicsMaterialRefConst;
import volucris.bindings.jolt.collision.RayCast;
import volucris.bindings.jolt.collision.RayCastResult;
import volucris.bindings.jolt.collision.RayCastSettings;
import volucris.bindings.jolt.collision.ShapeFilter;
import volucris.bindings.jolt.collision.TransformedShape;
import volucris.bindings.jolt.collision.TransformedShapeCollector;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.geometry.Plane;
import volucris.bindings.jolt.math.DMat44;
import volucris.bindings.jolt.math.Float3;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.renderer.DebugRenderer;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class Shape extends ShapeRefTarget
		permits CompoundShape,
		ConvexShape,
		DecoratedShape,
		EmptyShape,
		HeightFieldShape,
		MeshShape,
		PlaneShape,
		SoftBodyShape {

	private static final LazyConstant<MethodHandle> JPH_SHAPE_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_GET_TRIANGLES_MIN_TRIANGLES_REQUESTED;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_DRAW_SUBMERGED_VOLUMES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SET_DRAW_SUBMERGED_VOLUMES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_TYPE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUB_TYPE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_MUST_BE_STATIC;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_CENTER_OF_MASS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_LOCAL_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUB_SHAPE_IDBITS_RECURSIVE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_WORLD_SPACE_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_WORLD_SPACE_BOUNDS1;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_INNER_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_MASS_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_LEAF_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SURFACE_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUPPORTING_FACE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUB_SHAPE_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUB_SHAPE_TRANSFORMED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_SUBMERGED_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_DRAW;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_DRAW_GET_SUPPORT_FUNCTION;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_DRAW_GET_SUPPORTING_FACE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RAY;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RAY1;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_COLLIDE_POINT;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_COLLIDE_SOFT_BODY_VERTICES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_COLLECT_TRANSFORMED_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_TRANSFORM_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SCALE_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_TRIANGLES_START;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_TRIANGLES_NEXT;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_S_RESTORE_FROM_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SAVE_MATERIAL_STATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_RESTORE_MATERIAL_STATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SAVE_SUB_SHAPE_STATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_RESTORE_SUB_SHAPE_STATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_SAVE_WITH_CHILDREN;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_S_RESTORE_WITH_CHILDREN;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_STATS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_STATS_RECURSIVE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_IS_VALID_SCALE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_MAKE_SCALE_VALID;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_SHAPE_AS_REF_TARGET = downcallHandle("JPH_Shape_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_GET_TRIANGLES_MIN_TRIANGLES_REQUESTED = downcallHandle("JPH_Shape_GetGetTrianglesMinTrianglesRequested", JAVA_INT);
		JPH_SHAPE_GET_DRAW_SUBMERGED_VOLUMES = downcallHandle("JPH_Shape_GetDrawSubmergedVolumes", JAVA_BOOLEAN);
		JPH_SHAPE_SET_DRAW_SUBMERGED_VOLUMES = downcallHandleVoid("JPH_Shape_SetDrawSubmergedVolumes", JAVA_BOOLEAN);
		JPH_SHAPE_GET_TYPE = downcallHandle("JPH_Shape_GetType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_SUB_TYPE = downcallHandle("JPH_Shape_GetSubType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_USER_DATA = downcallHandle("JPH_Shape_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_SHAPE_SET_USER_DATA = downcallHandleVoid("JPH_Shape_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_SHAPE_MUST_BE_STATIC = downcallHandle("JPH_Shape_MustBeStatic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_CENTER_OF_MASS = downcallHandleVoid("JPH_Shape_GetCenterOfMass", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_LOCAL_BOUNDS = downcallHandleVoid("JPH_Shape_GetLocalBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_SUB_SHAPE_IDBITS_RECURSIVE = downcallHandle("JPH_Shape_GetSubShapeIDBitsRecursive", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_WORLD_SPACE_BOUNDS = downcallHandleVoid("JPH_Shape_GetWorldSpaceBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_WORLD_SPACE_BOUNDS1 = downcallHandleVoid("JPH_Shape_GetWorldSpaceBounds1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_INNER_RADIUS = downcallHandle("JPH_Shape_GetInnerRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_MASS_PROPERTIES = downcallHandleVoid("JPH_Shape_GetMassProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_LEAF_SHAPE = downcallHandle("JPH_Shape_GetLeafShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_MATERIAL = downcallHandle("JPH_Shape_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_SURFACE_NORMAL = downcallHandleVoid("JPH_Shape_GetSurfaceNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_SUPPORTING_FACE = downcallHandleVoid("JPH_Shape_GetSupportingFace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_SUB_SHAPE_USER_DATA = downcallHandle("JPH_Shape_GetSubShapeUserData", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_SUB_SHAPE_TRANSFORMED_SHAPE = downcallHandleVoid("JPH_Shape_GetSubShapeTransformedShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_SUBMERGED_VOLUME = downcallHandleVoid("JPH_Shape_GetSubmergedVolume", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_DRAW = downcallHandleVoid("JPH_Shape_Draw", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, JAVA_BOOLEAN);
		JPH_SHAPE_DRAW_GET_SUPPORT_FUNCTION = downcallHandleVoid("JPH_Shape_DrawGetSupportFunction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SHAPE_DRAW_GET_SUPPORTING_FACE = downcallHandleVoid("JPH_Shape_DrawGetSupportingFace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_RAY = downcallHandle("JPH_Shape_CastRay", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_RAY1 = downcallHandleVoid("JPH_Shape_CastRay1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_COLLIDE_POINT = downcallHandleVoid("JPH_Shape_CollidePoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_COLLIDE_SOFT_BODY_VERTICES = downcallHandleVoid("JPH_Shape_CollideSoftBodyVertices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_SHAPE_COLLECT_TRANSFORMED_SHAPES = downcallHandleVoid("JPH_Shape_CollectTransformedShapes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_TRANSFORM_SHAPE = downcallHandleVoid("JPH_Shape_TransformShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_SCALE_SHAPE = downcallHandleVoid("JPH_Shape_ScaleShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_TRIANGLES_START = downcallHandleVoid("JPH_Shape_GetTrianglesStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_TRIANGLES_NEXT = downcallHandle("JPH_Shape_GetTrianglesNext", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_SAVE_BINARY_STATE = downcallHandleVoid("JPH_Shape_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_S_RESTORE_FROM_BINARY_STATE = downcallHandleVoid("JPH_Shape_sRestoreFromBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_SAVE_MATERIAL_STATE = downcallHandleVoid("JPH_Shape_SaveMaterialState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_RESTORE_MATERIAL_STATE = downcallHandleVoid("JPH_Shape_RestoreMaterialState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SHAPE_SAVE_SUB_SHAPE_STATE = downcallHandleVoid("JPH_Shape_SaveSubShapeState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_RESTORE_SUB_SHAPE_STATE = downcallHandleVoid("JPH_Shape_RestoreSubShapeState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SHAPE_SAVE_WITH_CHILDREN = downcallHandleVoid("JPH_Shape_SaveWithChildren", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_S_RESTORE_WITH_CHILDREN = downcallHandleVoid("JPH_Shape_sRestoreWithChildren", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_STATS = downcallHandleVoid("JPH_Shape_GetStats", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_STATS_RECURSIVE = downcallHandleVoid("JPH_Shape_GetStatsRecursive", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_VOLUME = downcallHandle("JPH_Shape_GetVolume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_IS_VALID_SCALE = downcallHandle("JPH_Shape_IsValidScale", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_MAKE_SCALE_VALID = downcallHandleVoid("JPH_Shape_MakeScaleValid", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_DESTROY = downcallHandleVoid("JPH_Shape_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Shape(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// This is the minimum amount of triangles that should be requested through GetTrianglesNext.
    /// ```
    public static int getGetTrianglesMinTrianglesRequested() {
    	MethodHandle method = JPH_SHAPE_GET_GET_TRIANGLES_MIN_TRIANGLES_REQUESTED.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Debug helper which draws the intersection between water and the shapes, the center of buoyancy and the submerged volume
    /// ```
    public static boolean getDrawSubmergedVolumes() {
    	MethodHandle method = JPH_SHAPE_GET_DRAW_SUBMERGED_VOLUMES.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Debug helper which draws the intersection between water and the shapes, the center of buoyancy and the submerged volume
    /// ```
    public static void setDrawSubmergedVolumes(
    	boolean sDrawSubmergedVolumes
    ) {
    	MethodHandle method = JPH_SHAPE_SET_DRAW_SUBMERGED_VOLUMES.get();
    	try {
    		 method.invokeExact(
    			sDrawSubmergedVolumes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get type
    /// ```
    public static int getType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_GET_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getType].
    public final int getType() {
    	return getType(
    		this.segment
    	);
    }
    
    public static int getSubType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_GET_SUB_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubType].
    public final int getSubType() {
    	return getSubType(
    		this.segment
    	);
    }
    
    /// ```
    /// User data (to be used freely by the application)
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_GET_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final long getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    public static void setUserData(
    	MemorySegment self,
    	long inUserData
    ) {
    	MethodHandle method = JPH_SHAPE_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	long inUserData
    ) {
    	setUserData(
    		this.segment,
    		inUserData
    	);
    }
    
    /// ```
    /// Check if this shape can only be used to create a static body or if it can also be dynamic/kinematic
    /// ```
    public static boolean mustBeStatic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_MUST_BE_STATIC.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mustBeStatic].
    public final boolean mustBeStatic() {
    	return mustBeStatic(
    		this.segment
    	);
    }
    
    /// ```
    /// All shapes are centered around their center of mass. This function returns the center of mass position that needs to be applied to transform the shape to where it was created.
    /// ```
    public static void getCenterOfMass(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_CENTER_OF_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMass].
    public final void getCenterOfMass(
    	Vec3 outResult
    ) {
    	getCenterOfMass(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get local bounding box including convex radius, this box is centered around the center of mass rather than the world transform
    /// ```
    public static void getLocalBounds(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_LOCAL_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalBounds].
    public final void getLocalBounds(
    	AABox outResult
    ) {
    	getLocalBounds(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the max number of sub shape ID bits that are needed to be able to address any leaf shape in this shape. Used mainly for checking that it is smaller or equal than SubShapeID::MaxBits.
    /// ```
    public static int getSubShapeIDBitsRecursive(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_GET_SUB_SHAPE_IDBITS_RECURSIVE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeIDBitsRecursive].
    public final int getSubShapeIDBitsRecursive() {
    	return getSubShapeIDBitsRecursive(
    		this.segment
    	);
    }
    
    /// ```
    /// Get world space bounds including convex radius.
    /// This shape is scaled by inScale in local space first.
    /// This function can be overridden to return a closer fitting world space bounding box, by default it will just transform what GetLocalBounds() returns.
    /// ```
    public static void getWorldSpaceBounds(
    	MemorySegment self,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_WORLD_SPACE_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenterOfMassTransform,
    			inScale,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceBounds].
    public final void getWorldSpaceBounds(
    	Mat44 inCenterOfMassTransform,
    	Vec3 inScale,
    	AABox outResult
    ) {
    	getWorldSpaceBounds(
    		this.segment,
    		inCenterOfMassTransform.memorySegment(),
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get world space bounds including convex radius.
    /// ```
    public static void getWorldSpaceBounds1(
    	MemorySegment self,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_WORLD_SPACE_BOUNDS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenterOfMassTransform,
    			inScale,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceBounds1].
    public final void getWorldSpaceBounds1(
    	DMat44 inCenterOfMassTransform,
    	Vec3 inScale,
    	AABox outResult
    ) {
    	getWorldSpaceBounds1(
    		this.segment,
    		inCenterOfMassTransform.memorySegment(),
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns the radius of the biggest sphere that fits entirely in the shape. In case this shape consists of multiple sub shapes, it returns the smallest sphere of the parts.
    /// This can be used as a measure of how far the shape can be moved without risking going through geometry.
    /// ```
    public static float getInnerRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_GET_INNER_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInnerRadius].
    public final float getInnerRadius() {
    	return getInnerRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Calculate the mass and inertia of this shape
    /// ```
    public static void getMassProperties(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_MASS_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMassProperties].
    public final void getMassProperties(
    	MassProperties outResult
    ) {
    	getMassProperties(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the leaf shape for a particular sub shape ID.
    /// @param inSubShapeID The full sub shape ID that indicates the path to the leaf shape
    /// @param outRemainder What remains of the sub shape ID after removing the path to the leaf shape (could e.g. refer to a triangle within a MeshShape)
    /// @return The shape or null if the sub shape ID is invalid
    /// ```
    public static MemorySegment getLeafShape(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment outRemainder
    ) {
    	MethodHandle method = JPH_SHAPE_GET_LEAF_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inSubShapeID,
    			outRemainder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeafShape].
    public final @Nullable Shape getLeafShape(
    	SubShapeID inSubShapeID,
    	SubShapeID outRemainder
    ) {
    	MemorySegment segment = getLeafShape(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		outRemainder.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Shape(segment);
    }
    
    /// ```
    /// Get the material assigned to a particular sub shape ID
    /// ```
    public static MemorySegment getMaterial(
    	MemorySegment self,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_SHAPE_GET_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial].
    public final @Nullable PhysicsMaterial getMaterial(
    	SubShapeID inSubShapeID
    ) {
    	MemorySegment segment = getMaterial(
    		this.segment,
    		inSubShapeID.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterial(segment);
    }
    
    /// ```
    /// Get the surface normal of a particular sub shape ID and point on surface (all vectors are relative to center of mass for this shape).
    /// Note: When you have a CollideShapeResult or ShapeCastResult you should use -mPenetrationAxis.Normalized() as contact normal as GetSurfaceNormal will only return face normals (and not vertex or edge normals).
    /// ```
    public static void getSurfaceNormal(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment inLocalSurfacePosition,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_SURFACE_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			inLocalSurfacePosition,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSurfaceNormal].
    public final void getSurfaceNormal(
    	SubShapeID inSubShapeID,
    	Vec3 inLocalSurfacePosition,
    	Vec3 outResult
    ) {
    	getSurfaceNormal(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		inLocalSurfacePosition.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the vertices of the face that faces inDirection the most (includes any convex radius). Note that this function can only return faces of
    /// convex shapes or triangles, which is why a sub shape ID to get to that leaf must be provided.
    /// @param inSubShapeID Sub shape ID of target shape
    /// @param inDirection Direction that the face should be facing (in local space to this shape)
    /// @param inCenterOfMassTransform Transform to transform outVertices with
    /// @param inScale Scale in local space of the shape (scales relative to its center of mass)
    /// @param outVertices Resulting face. The returned face can be empty if the shape doesn't have polygons to return (e.g. because it's a sphere). The face will be returned in world space.
    /// ```
    public static void getSupportingFace(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment inDirection,
    	MemorySegment inScale,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment outVertices
    ) {
    	MethodHandle method = JPH_SHAPE_GET_SUPPORTING_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			inDirection,
    			inScale,
    			inCenterOfMassTransform,
    			outVertices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSupportingFace].
    public final void getSupportingFace(
    	SubShapeID inSubShapeID,
    	Vec3 inDirection,
    	Vec3 inScale,
    	Mat44 inCenterOfMassTransform,
    	SupportingFace outVertices
    ) {
    	getSupportingFace(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		inDirection.memorySegment(),
    		inScale.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		outVertices.memorySegment()
    	);
    }
    
    /// ```
    /// Get the user data of a particular sub shape ID. Corresponds with the value stored in Shape::GetUserData of the leaf shape pointed to by inSubShapeID.
    /// ```
    public static long getSubShapeUserData(
    	MemorySegment self,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_SHAPE_GET_SUB_SHAPE_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeUserData].
    public final long getSubShapeUserData(
    	SubShapeID inSubShapeID
    ) {
    	return getSubShapeUserData(
    		this.segment,
    		inSubShapeID.memorySegment()
    	);
    }
    
    /// ```
    /// Get the direct child sub shape and its transform for a sub shape ID.
    /// @param inSubShapeID Sub shape ID that indicates the path to the leaf shape
    /// @param inPositionCOM The position of the center of mass of this shape
    /// @param inRotation The orientation of this shape
    /// @param inScale Scale in local space of the shape (scales relative to its center of mass)
    /// @param outRemainder The remainder of the sub shape ID after removing the sub shape
    /// @return Direct child sub shape and its transform, note that the body ID and sub shape ID will be invalid
    /// ```
    public static void getSubShapeTransformedShape(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment inPositionCOM,
    	MemorySegment inRotation,
    	MemorySegment inScale,
    	MemorySegment outRemainder,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_SUB_SHAPE_TRANSFORMED_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			inPositionCOM,
    			inRotation,
    			inScale,
    			outRemainder,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeTransformedShape].
    public final void getSubShapeTransformedShape(
    	SubShapeID inSubShapeID,
    	Vec3 inPositionCOM,
    	Quat inRotation,
    	Vec3 inScale,
    	SubShapeID outRemainder,
    	TransformedShape outResult
    ) {
    	getSubShapeTransformedShape(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		inPositionCOM.memorySegment(),
    		inRotation.memorySegment(),
    		inScale.memorySegment(),
    		outRemainder.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void getSubmergedVolume(
    	MemorySegment self,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale,
    	MemorySegment inSurface,
    	MemorySegment outTotalVolume,
    	MemorySegment outSubmergedVolume,
    	MemorySegment outCenterOfBuoyancy,
    	MemorySegment inBaseOffset
    ) {
    	MethodHandle method = JPH_SHAPE_GET_SUBMERGED_VOLUME.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenterOfMassTransform,
    			inScale,
    			inSurface,
    			outTotalVolume,
    			outSubmergedVolume,
    			outCenterOfBuoyancy,
    			inBaseOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubmergedVolume].
    public final void getSubmergedVolume(
    	Mat44 inCenterOfMassTransform,
    	Vec3 inScale,
    	Plane inSurface,
    	NativeFloatArray outTotalVolume,
    	NativeFloatArray outSubmergedVolume,
    	Vec3 outCenterOfBuoyancy,
    	Vec3 inBaseOffset
    ) {
    	getSubmergedVolume(
    		this.segment,
    		inCenterOfMassTransform.memorySegment(),
    		inScale.memorySegment(),
    		inSurface.memorySegment(),
    		outTotalVolume.memorySegment(),
    		outSubmergedVolume.memorySegment(),
    		outCenterOfBuoyancy.memorySegment(),
    		inBaseOffset.memorySegment()
    	);
    }
    
    /// ```
    /// Draw the shape at a particular location with a particular color (debugging purposes)
    /// ```
    public static void draw(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale,
    	MemorySegment inColor,
    	boolean inUseMaterialColors,
    	boolean inDrawWireframe
    ) {
    	MethodHandle method = JPH_SHAPE_DRAW.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inScale,
    			inColor,
    			inUseMaterialColors,
    			inDrawWireframe
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#draw].
    public final void draw(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	Vec3 inScale,
    	Color inColor,
    	boolean inUseMaterialColors,
    	boolean inDrawWireframe
    ) {
    	draw(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inScale.memorySegment(),
    		inColor.memorySegment(),
    		inUseMaterialColors,
    		inDrawWireframe
    	);
    }
    
    /// ```
    /// Draw the results of the GetSupportFunction with the convex radius added back on to show any errors introduced by this process (only relevant for convex shapes)
    /// ```
    public static void drawGetSupportFunction(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale,
    	MemorySegment inColor,
    	boolean inDrawSupportDirection
    ) {
    	MethodHandle method = JPH_SHAPE_DRAW_GET_SUPPORT_FUNCTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inScale,
    			inColor,
    			inDrawSupportDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawGetSupportFunction].
    public final void drawGetSupportFunction(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	Vec3 inScale,
    	Color inColor,
    	boolean inDrawSupportDirection
    ) {
    	drawGetSupportFunction(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inScale.memorySegment(),
    		inColor.memorySegment(),
    		inDrawSupportDirection
    	);
    }
    
    /// ```
    /// Draw the results of the GetSupportingFace function to show any errors introduced by this process (only relevant for convex shapes)
    /// ```
    public static void drawGetSupportingFace(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_SHAPE_DRAW_GET_SUPPORTING_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inCenterOfMassTransform,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawGetSupportingFace].
    public final void drawGetSupportingFace(
    	DebugRenderer inRenderer,
    	Mat44 inCenterOfMassTransform,
    	Vec3 inScale
    ) {
    	drawGetSupportingFace(
    		this.segment,
    		inRenderer.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inScale.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a ray against this shape, returns true if it finds a hit closer than ioHit.mFraction and updates that fraction. Otherwise ioHit is left untouched and the function returns false.
    /// Note that the ray should be relative to the center of mass of this shape (i.e. subtract Shape::GetCenterOfMass() from RayCast::mOrigin if you want to cast against the shape in the space it was created).
    /// Convex objects will be treated as solid (meaning if the ray starts inside, you'll get a hit fraction of 0) and back face hits against triangles are returned.
    /// If you want the surface normal of the hit use GetSurfaceNormal(ioHit.mSubShapeID2, inRay.GetPointOnRay(ioHit.mFraction)).
    /// ```
    public static boolean castRay(
    	MemorySegment self,
    	MemorySegment inRay,
    	MemorySegment inSubShapeIDCreator,
    	MemorySegment ioHit
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RAY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inRay,
    			inSubShapeIDCreator,
    			ioHit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRay].
    public final boolean castRay(
    	RayCast inRay,
    	SubShapeIDCreator inSubShapeIDCreator,
    	RayCastResult ioHit
    ) {
    	return castRay(
    		this.segment,
    		inRay.memorySegment(),
    		inSubShapeIDCreator.memorySegment(),
    		ioHit.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a ray against this shape. Allows returning multiple hits through ioCollector. Note that this version is more flexible but also slightly slower than the CastRay function that returns only a single hit.
    /// If you want the surface normal of the hit use GetSurfaceNormal(collected sub shape ID, inRay.GetPointOnRay(collected faction)).
    /// ```
    public static void castRay1(
    	MemorySegment self,
    	MemorySegment inRay,
    	MemorySegment inRayCastSettings,
    	MemorySegment inSubShapeIDCreator,
    	MemorySegment ioCollector,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RAY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRay,
    			inRayCastSettings,
    			inSubShapeIDCreator,
    			ioCollector,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRay1].
    public final void castRay1(
    	RayCast inRay,
    	RayCastSettings inRayCastSettings,
    	SubShapeIDCreator inSubShapeIDCreator,
    	CastRayCollector ioCollector,
    	ShapeFilter inShapeFilter
    ) {
    	castRay1(
    		this.segment,
    		inRay.memorySegment(),
    		inRayCastSettings.memorySegment(),
    		inSubShapeIDCreator.memorySegment(),
    		ioCollector.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Check if inPoint is inside this shape. For this tests all shapes are treated as if they were solid.
    /// Note that inPoint should be relative to the center of mass of this shape (i.e. subtract Shape::GetCenterOfMass() from inPoint if you want to test against the shape in the space it was created).
    /// For a mesh shape, this test will only provide sensible information if the mesh is a closed manifold.
    /// For each shape that collides, ioCollector will receive a hit.
    /// ```
    public static void collidePoint(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment inSubShapeIDCreator,
    	MemorySegment ioCollector,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_SHAPE_COLLIDE_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			inSubShapeIDCreator,
    			ioCollector,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collidePoint].
    public final void collidePoint(
    	Vec3 inPoint,
    	SubShapeIDCreator inSubShapeIDCreator,
    	CollidePointCollector ioCollector,
    	ShapeFilter inShapeFilter
    ) {
    	collidePoint(
    		this.segment,
    		inPoint.memorySegment(),
    		inSubShapeIDCreator.memorySegment(),
    		ioCollector.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Collides all vertices of a soft body with this shape and updates SoftBodyVertex::mCollisionPlane, SoftBodyVertex::mCollidingShapeIndex and SoftBodyVertex::mLargestPenetration if a collision with more penetration was found.
    /// @param inCenterOfMassTransform Center of mass transform for this shape relative to the vertices.
    /// @param inScale Scale in local space of the shape (scales relative to its center of mass)
    /// @param inVertices The vertices of the soft body
    /// @param inNumVertices The number of vertices in inVertices
    /// @param inCollidingShapeIndex Value to store in CollideSoftBodyVertexIterator::mCollidingShapeIndex when a collision was found
    /// ```
    public static void collideSoftBodyVertices(
    	MemorySegment self,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inScale,
    	MemorySegment inVertices,
    	int inNumVertices,
    	int inCollidingShapeIndex
    ) {
    	MethodHandle method = JPH_SHAPE_COLLIDE_SOFT_BODY_VERTICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenterOfMassTransform,
    			inScale,
    			inVertices,
    			inNumVertices,
    			inCollidingShapeIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideSoftBodyVertices].
    public final void collideSoftBodyVertices(
    	Mat44 inCenterOfMassTransform,
    	Vec3 inScale,
    	CollideSoftBodyVertexIterator inVertices,
    	int inNumVertices,
    	int inCollidingShapeIndex
    ) {
    	collideSoftBodyVertices(
    		this.segment,
    		inCenterOfMassTransform.memorySegment(),
    		inScale.memorySegment(),
    		inVertices.memorySegment(),
    		inNumVertices,
    		inCollidingShapeIndex
    	);
    }
    
    /// ```
    /// Collect the leaf transformed shapes of all leaf shapes of this shape.
    /// inBox is the world space axis aligned box which leaf shapes should collide with.
    /// inPositionCOM/inRotation/inScale describes the transform of this shape.
    /// inSubShapeIDCreator represents the current sub shape ID of this shape.
    /// ```
    public static void collectTransformedShapes(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment inPositionCOM,
    	MemorySegment inRotation,
    	MemorySegment inScale,
    	MemorySegment inSubShapeIDCreator,
    	MemorySegment ioCollector,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_SHAPE_COLLECT_TRANSFORMED_SHAPES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			inPositionCOM,
    			inRotation,
    			inScale,
    			inSubShapeIDCreator,
    			ioCollector,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collectTransformedShapes].
    public final void collectTransformedShapes(
    	AABox inBox,
    	Vec3 inPositionCOM,
    	Quat inRotation,
    	Vec3 inScale,
    	SubShapeIDCreator inSubShapeIDCreator,
    	TransformedShapeCollector ioCollector,
    	ShapeFilter inShapeFilter
    ) {
    	collectTransformedShapes(
    		this.segment,
    		inBox.memorySegment(),
    		inPositionCOM.memorySegment(),
    		inRotation.memorySegment(),
    		inScale.memorySegment(),
    		inSubShapeIDCreator.memorySegment(),
    		ioCollector.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Transforms this shape and all of its children with inTransform, resulting shape(s) are passed to ioCollector.
    /// Note that not all shapes support all transforms (especially true for scaling), the resulting shape will try to match the transform as accurately as possible.
    /// @param inCenterOfMassTransform The transform (rotation, translation, scale) that the center of mass of the shape should get
    /// @param ioCollector The transformed shapes will be passed to this collector
    /// ```
    public static void transformShape(
    	MemorySegment self,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment ioCollector
    ) {
    	MethodHandle method = JPH_SHAPE_TRANSFORM_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenterOfMassTransform,
    			ioCollector
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#transformShape].
    public final void transformShape(
    	Mat44 inCenterOfMassTransform,
    	TransformedShapeCollector ioCollector
    ) {
    	transformShape(
    		this.segment,
    		inCenterOfMassTransform.memorySegment(),
    		ioCollector.memorySegment()
    	);
    }
    
    /// ```
    /// Scale this shape. Note that not all shapes support all scales, this will return a shape that matches the scale as accurately as possible. See Shape::IsValidScale for more information.
    /// @param inScale The scale to use for this shape (note: this scale is applied to the entire shape in the space it was created, most other functions apply the scale in the space of the leaf shapes and from the center of mass!)
    /// ```
    public static void scaleShape(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_SCALE_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inScale,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#scaleShape].
    public final void scaleShape(
    	Vec3 inScale,
    	ShapeResult outResult
    ) {
    	scaleShape(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// To start iterating over triangles, call this function first.
    /// ioContext is a temporary buffer and should remain untouched until the last call to GetTrianglesNext.
    /// inBox is the world space bounding in which you want to get the triangles.
    /// inPositionCOM/inRotation/inScale describes the transform of this shape.
    /// To get the actual triangles call GetTrianglesNext.
    /// ```
    public static void getTrianglesStart(
    	MemorySegment self,
    	MemorySegment ioContext,
    	MemorySegment inBox,
    	MemorySegment inPositionCOM,
    	MemorySegment inRotation,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_SHAPE_GET_TRIANGLES_START.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioContext,
    			inBox,
    			inPositionCOM,
    			inRotation,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTrianglesStart].
    public final void getTrianglesStart(
    	GetTrianglesContext ioContext,
    	AABox inBox,
    	Vec3 inPositionCOM,
    	Quat inRotation,
    	Vec3 inScale
    ) {
    	getTrianglesStart(
    		this.segment,
    		ioContext.memorySegment(),
    		inBox.memorySegment(),
    		inPositionCOM.memorySegment(),
    		inRotation.memorySegment(),
    		inScale.memorySegment()
    	);
    }
    
    /// ```
    /// Call this repeatedly to get all triangles in the box.
    /// outTriangleVertices should be large enough to hold 3 * inMaxTriangleRequested entries.
    /// outMaterials (if it is not null) should contain inMaxTrianglesRequested entries.
    /// The function returns the amount of triangles that it found (which will be <= inMaxTrianglesRequested), or 0 if there are no more triangles.
    /// Note that the function can return a value < inMaxTrianglesRequested and still have more triangles to process (triangles can be returned in blocks).
    /// Note that the function may return triangles outside of the requested box, only coarse culling is performed on the returned triangles.
    /// ```
    public static int getTrianglesNext(
    	MemorySegment self,
    	MemorySegment ioContext,
    	int inMaxTrianglesRequested,
    	MemorySegment outTriangleVertices,
    	MemorySegment outMaterials
    ) {
    	MethodHandle method = JPH_SHAPE_GET_TRIANGLES_NEXT.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			ioContext,
    			inMaxTrianglesRequested,
    			outTriangleVertices,
    			outMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTrianglesNext].
    public final int getTrianglesNext(
    	GetTrianglesContext ioContext,
    	int inMaxTrianglesRequested,
    	Float3 outTriangleVertices,
    	NativePointerArray outMaterials
    ) {
    	return getTrianglesNext(
    		this.segment,
    		ioContext.memorySegment(),
    		inMaxTrianglesRequested,
    		outTriangleVertices.memorySegment(),
    		outMaterials.memorySegment()
    	);
    }
    
    /// ```
    /// Saves the contents of the shape in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SHAPE_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Creates a Shape of the correct type and restores its contents from the binary stream inStream.
    /// ```
    public static void sRestoreFromBinaryState(
    	MemorySegment inStream,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_S_RESTORE_FROM_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreFromBinaryState].
    public static void sRestoreFromBinaryState(
    	StreamIn inStream,
    	ShapeResult outResult
    ) {
    	sRestoreFromBinaryState(
    		inStream.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Outputs the material references that this shape has to outMaterials.
    /// ```
    public static void saveMaterialState(
    	MemorySegment self,
    	MemorySegment outMaterials
    ) {
    	MethodHandle method = JPH_SHAPE_SAVE_MATERIAL_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveMaterialState].
    public final void saveMaterialState(
    	PhysicsMaterialList outMaterials
    ) {
    	saveMaterialState(
    		this.segment,
    		outMaterials.memorySegment()
    	);
    }
    
    /// ```
    /// Restore the material references after calling sRestoreFromBinaryState. Note that the exact same materials need to be provided in the same order as returned by SaveMaterialState.
    /// ```
    public static void restoreMaterialState(
    	MemorySegment self,
    	MemorySegment inMaterials,
    	int inNumMaterials
    ) {
    	MethodHandle method = JPH_SHAPE_RESTORE_MATERIAL_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaterials,
    			inNumMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreMaterialState].
    public final void restoreMaterialState(
    	PhysicsMaterialRefConst inMaterials,
    	int inNumMaterials
    ) {
    	restoreMaterialState(
    		this.segment,
    		inMaterials.memorySegment(),
    		inNumMaterials
    	);
    }
    
    /// ```
    /// Outputs the shape references that this shape has to outSubShapes.
    /// ```
    public static void saveSubShapeState(
    	MemorySegment self,
    	MemorySegment outSubShapes
    ) {
    	MethodHandle method = JPH_SHAPE_SAVE_SUB_SHAPE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outSubShapes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveSubShapeState].
    public final void saveSubShapeState(
    	ShapeList outSubShapes
    ) {
    	saveSubShapeState(
    		this.segment,
    		outSubShapes.memorySegment()
    	);
    }
    
    /// ```
    /// Restore the shape references after calling sRestoreFromBinaryState. Note that the exact same shapes need to be provided in the same order as returned by SaveSubShapeState.
    /// ```
    public static void restoreSubShapeState(
    	MemorySegment self,
    	MemorySegment inSubShapes,
    	int inNumShapes
    ) {
    	MethodHandle method = JPH_SHAPE_RESTORE_SUB_SHAPE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapes,
    			inNumShapes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreSubShapeState].
    public final void restoreSubShapeState(
    	ShapeRefConst inSubShapes,
    	int inNumShapes
    ) {
    	restoreSubShapeState(
    		this.segment,
    		inSubShapes.memorySegment(),
    		inNumShapes
    	);
    }
    
    /// ```
    /// Save this shape, all its children and its materials. Pass in an empty map in ioShapeMap / ioMaterialMap or reuse the same map while saving multiple shapes to the same stream in order to avoid writing duplicates.
    /// ```
    public static void saveWithChildren(
    	MemorySegment self,
    	MemorySegment inStream,
    	MemorySegment ioShapeMap,
    	MemorySegment ioMaterialMap
    ) {
    	MethodHandle method = JPH_SHAPE_SAVE_WITH_CHILDREN.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream,
    			ioShapeMap,
    			ioMaterialMap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveWithChildren].
    public final void saveWithChildren(
    	StreamOut inStream,
    	ShapeToIDMap ioShapeMap,
    	MaterialToIDMap ioMaterialMap
    ) {
    	saveWithChildren(
    		this.segment,
    		inStream.memorySegment(),
    		ioShapeMap.memorySegment(),
    		ioMaterialMap.memorySegment()
    	);
    }
    
    /// ```
    /// Restore a shape, all its children and materials. Pass in an empty map in ioShapeMap / ioMaterialMap or reuse the same map while reading multiple shapes from the same stream in order to restore duplicates.
    /// ```
    public static void sRestoreWithChildren(
    	MemorySegment inStream,
    	MemorySegment ioShapeMap,
    	MemorySegment ioMaterialMap,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_S_RESTORE_WITH_CHILDREN.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			ioShapeMap,
    			ioMaterialMap,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreWithChildren].
    public static void sRestoreWithChildren(
    	StreamIn inStream,
    	IDToShapeMap ioShapeMap,
    	IDToMaterialMap ioMaterialMap,
    	ShapeResult outResult
    ) {
    	sRestoreWithChildren(
    		inStream.memorySegment(),
    		ioShapeMap.memorySegment(),
    		ioMaterialMap.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get stats of this shape. Use for logging / data collection purposes only. Does not add values from child shapes, use GetStatsRecursive for this.
    /// ```
    public static void getStats(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_STATS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getStats].
    public final void getStats(
    	Stats outResult
    ) {
    	getStats(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the combined stats of this shape and its children.
    /// @param ioVisitedShapes is used to track which shapes have already been visited, to avoid calculating the wrong memory size.
    /// ```
    public static void getStatsRecursive(
    	MemorySegment self,
    	MemorySegment ioVisitedShapes,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_GET_STATS_RECURSIVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioVisitedShapes,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getStatsRecursive].
    public final void getStatsRecursive(
    	VisitedShapes ioVisitedShapes,
    	Stats outResult
    ) {
    	getStatsRecursive(
    		this.segment,
    		ioVisitedShapes.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static float getVolume(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_GET_VOLUME.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVolume].
    public final float getVolume() {
    	return getVolume(
    		this.segment
    	);
    }
    
    /// ```
    /// Test if inScale is a valid scale for this shape. Some shapes can only be scaled uniformly, compound shapes cannot handle shapes
    /// being rotated and scaled (this would cause shearing), scale can never be zero. When the scale is invalid, the function will return false.
    /// 
    /// Here's a list of supported scales:
    /// SphereShape: Scale must be uniform (signs of scale are ignored).
    /// BoxShape: Any scale supported (signs of scale are ignored).
    /// TriangleShape: Any scale supported when convex radius is zero, otherwise only uniform scale supported.
    /// CapsuleShape: Scale must be uniform (signs of scale are ignored).
    /// TaperedCapsuleShape: Scale must be uniform (sign of Y scale can be used to flip the capsule).
    /// CylinderShape: Scale must be uniform in XZ plane, Y can scale independently (signs of scale are ignored).
    /// RotatedTranslatedShape: Scale must not cause shear in the child shape.
    /// CompoundShape: Scale must not cause shear in any of the child shapes.
    /// ```
    public static boolean isValidScale(
    	MemorySegment self,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_SHAPE_IS_VALID_SCALE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidScale].
    public final boolean isValidScale(
    	Vec3 inScale
    ) {
    	return isValidScale(
    		this.segment,
    		inScale.memorySegment()
    	);
    }
    
    /// ```
    /// This function will make sure that if you wrap this shape in a ScaledShape that the scale is valid.
    /// Note that this involves discarding components of the scale that are invalid, so the resulting scaled shape may be different than the requested scale.
    /// Compare the return value of this function with the scale you passed in to detect major inconsistencies and possibly warn the user.
    /// @param inScale Local space scale for this shape.
    /// @return Scale that can be used to wrap this shape in a ScaledShape. IsValidScale will return true for this scale.
    /// ```
    public static void makeScaleValid(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_MAKE_SCALE_VALID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inScale,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#makeScaleValid].
    public final void makeScaleValid(
    	Vec3 inScale,
    	Vec3 outResult
    ) {
    	makeScaleValid(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public final void destroy() {
    	destroy(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}