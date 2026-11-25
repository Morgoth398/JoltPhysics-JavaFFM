/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ShapeCastSettings extends CollideSettingsBase {

	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_AS_COLLIDE_SETTINGS_BASE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_GET_EXTRA_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_SET_EXTRA_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_GET_BACK_FACE_MODE_TRIANGLES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE_TRIANGLES;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_GET_BACK_FACE_MODE_CONVEX;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE_CONVEX;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_GET_USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_SET_USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_GET_RETURN_DEEPEST_POINT;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_SET_RETURN_DEEPEST_POINT;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SHAPE_CAST_SETTINGS_CREATE = downcallHandle("JPH_ShapeCastSettings_Create", UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_SETTINGS_AS_COLLIDE_SETTINGS_BASE = downcallHandle("JPH_ShapeCastSettings_AsCollideSettingsBase", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_SETTINGS_GET_EXTRA_CONVEX_RADIUS = downcallHandle("JPH_ShapeCastSettings_GetExtraConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_SETTINGS_SET_EXTRA_CONVEX_RADIUS = downcallHandleVoid("JPH_ShapeCastSettings_SetExtraConvexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SHAPE_CAST_SETTINGS_GET_BACK_FACE_MODE_TRIANGLES = downcallHandle("JPH_ShapeCastSettings_GetBackFaceModeTriangles", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE_TRIANGLES = downcallHandleVoid("JPH_ShapeCastSettings_SetBackFaceModeTriangles", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SHAPE_CAST_SETTINGS_GET_BACK_FACE_MODE_CONVEX = downcallHandle("JPH_ShapeCastSettings_GetBackFaceModeConvex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE_CONVEX = downcallHandleVoid("JPH_ShapeCastSettings_SetBackFaceModeConvex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SHAPE_CAST_SETTINGS_GET_USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS = downcallHandle("JPH_ShapeCastSettings_GetUseShrunkenShapeAndConvexRadius", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_SETTINGS_SET_USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS = downcallHandleVoid("JPH_ShapeCastSettings_SetUseShrunkenShapeAndConvexRadius", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SHAPE_CAST_SETTINGS_GET_RETURN_DEEPEST_POINT = downcallHandle("JPH_ShapeCastSettings_GetReturnDeepestPoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_SETTINGS_SET_RETURN_DEEPEST_POINT = downcallHandleVoid("JPH_ShapeCastSettings_SetReturnDeepestPoint", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE = downcallHandleVoid("JPH_ShapeCastSettings_SetBackFaceMode", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public ShapeCastSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ShapeCastSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCollideSettingsBase(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ShapeCastSettings(MemorySegment segment) {
		this.segment = segment;
		super(asCollideSettingsBase(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCollideSettingsBase(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_AS_COLLIDE_SETTINGS_BASE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// When > 0 the query shape is inflated by an extra convex radius, this makes it bigger in every direction by this margin. (unit: meter)
    /// ```
    public static float getExtraConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_GET_EXTRA_CONVEX_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getExtraConvexRadius].
    public final float getExtraConvexRadius() {
    	return getExtraConvexRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// When > 0 the query shape is inflated by an extra convex radius, this makes it bigger in every direction by this margin. (unit: meter)
    /// ```
    public static void setExtraConvexRadius(
    	MemorySegment self,
    	float mExtraConvexRadius
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_SET_EXTRA_CONVEX_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mExtraConvexRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setExtraConvexRadius].
    public final void setExtraConvexRadius(
    	float mExtraConvexRadius
    ) {
    	setExtraConvexRadius(
    		this.segment,
    		mExtraConvexRadius
    	);
    }
    
    /// ```
    /// How backfacing triangles should be treated (should we report moving from back to front for triangle based shapes, e.g. for MeshShape/HeightFieldShape?)
    /// ```
    public static int getBackFaceModeTriangles(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_GET_BACK_FACE_MODE_TRIANGLES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBackFaceModeTriangles].
    public final int getBackFaceModeTriangles() {
    	return getBackFaceModeTriangles(
    		this.segment
    	);
    }
    
    /// ```
    /// How backfacing triangles should be treated (should we report moving from back to front for triangle based shapes, e.g. for MeshShape/HeightFieldShape?)
    /// ```
    public static void setBackFaceModeTriangles(
    	MemorySegment self,
    	int mBackFaceModeTriangles
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE_TRIANGLES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBackFaceModeTriangles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBackFaceModeTriangles].
    public final void setBackFaceModeTriangles(
    	int mBackFaceModeTriangles
    ) {
    	setBackFaceModeTriangles(
    		this.segment,
    		mBackFaceModeTriangles
    	);
    }
    
    /// ```
    /// How backfacing convex objects should be treated (should we report starting inside an object and moving out?)
    /// ```
    public static int getBackFaceModeConvex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_GET_BACK_FACE_MODE_CONVEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBackFaceModeConvex].
    public final int getBackFaceModeConvex() {
    	return getBackFaceModeConvex(
    		this.segment
    	);
    }
    
    /// ```
    /// How backfacing convex objects should be treated (should we report starting inside an object and moving out?)
    /// ```
    public static void setBackFaceModeConvex(
    	MemorySegment self,
    	int mBackFaceModeConvex
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE_CONVEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBackFaceModeConvex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBackFaceModeConvex].
    public final void setBackFaceModeConvex(
    	int mBackFaceModeConvex
    ) {
    	setBackFaceModeConvex(
    		this.segment,
    		mBackFaceModeConvex
    	);
    }
    
    /// ```
    /// Indicates if we want to shrink the shape by the convex radius and then expand it again. This speeds up collision detection and gives a more accurate normal at the cost of a more 'rounded' shape.
    /// ```
    public static boolean getUseShrunkenShapeAndConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_GET_USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUseShrunkenShapeAndConvexRadius].
    public final boolean getUseShrunkenShapeAndConvexRadius() {
    	return getUseShrunkenShapeAndConvexRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Indicates if we want to shrink the shape by the convex radius and then expand it again. This speeds up collision detection and gives a more accurate normal at the cost of a more 'rounded' shape.
    /// ```
    public static void setUseShrunkenShapeAndConvexRadius(
    	MemorySegment self,
    	boolean mUseShrunkenShapeAndConvexRadius
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_SET_USE_SHRUNKEN_SHAPE_AND_CONVEX_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUseShrunkenShapeAndConvexRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUseShrunkenShapeAndConvexRadius].
    public final void setUseShrunkenShapeAndConvexRadius(
    	boolean mUseShrunkenShapeAndConvexRadius
    ) {
    	setUseShrunkenShapeAndConvexRadius(
    		this.segment,
    		mUseShrunkenShapeAndConvexRadius
    	);
    }
    
    /// ```
    /// When true, and the shape is intersecting at the beginning of the cast (fraction = 0) then this will calculate the deepest penetration point (costing additional CPU time)
    /// ```
    public static boolean getReturnDeepestPoint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_GET_RETURN_DEEPEST_POINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getReturnDeepestPoint].
    public final boolean getReturnDeepestPoint() {
    	return getReturnDeepestPoint(
    		this.segment
    	);
    }
    
    /// ```
    /// When true, and the shape is intersecting at the beginning of the cast (fraction = 0) then this will calculate the deepest penetration point (costing additional CPU time)
    /// ```
    public static void setReturnDeepestPoint(
    	MemorySegment self,
    	boolean mReturnDeepestPoint
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_SET_RETURN_DEEPEST_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mReturnDeepestPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setReturnDeepestPoint].
    public final void setReturnDeepestPoint(
    	boolean mReturnDeepestPoint
    ) {
    	setReturnDeepestPoint(
    		this.segment,
    		mReturnDeepestPoint
    	);
    }
    
    /// ```
    /// Set the backfacing mode for all shapes
    /// ```
    public static void setBackFaceMode(
    	MemorySegment self,
    	int inMode
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_SETTINGS_SET_BACK_FACE_MODE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBackFaceMode].
    public final void setBackFaceMode(
    	int inMode
    ) {
    	setBackFaceMode(
    		this.segment,
    		inMode
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}