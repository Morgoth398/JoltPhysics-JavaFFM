/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class RayCastSettings {

	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_GET_BACK_FACE_MODE_TRIANGLES;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE_TRIANGLES;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_GET_BACK_FACE_MODE_CONVEX;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE_CONVEX;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_GET_TREAT_CONVEX_AS_SOLID;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_SET_TREAT_CONVEX_AS_SOLID;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RAY_CAST_SETTINGS_CREATE = downcallHandle("JPH_RayCastSettings_Create", UNBOUNDED_ADDRESS);
		JPH_RAY_CAST_SETTINGS_DESTROY = downcallHandleVoid("JPH_RayCastSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_RAY_CAST_SETTINGS_GET_BACK_FACE_MODE_TRIANGLES = downcallHandle("JPH_RayCastSettings_GetBackFaceModeTriangles", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE_TRIANGLES = downcallHandleVoid("JPH_RayCastSettings_SetBackFaceModeTriangles", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_RAY_CAST_SETTINGS_GET_BACK_FACE_MODE_CONVEX = downcallHandle("JPH_RayCastSettings_GetBackFaceModeConvex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE_CONVEX = downcallHandleVoid("JPH_RayCastSettings_SetBackFaceModeConvex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_RAY_CAST_SETTINGS_GET_TREAT_CONVEX_AS_SOLID = downcallHandle("JPH_RayCastSettings_GetTreatConvexAsSolid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_RAY_CAST_SETTINGS_SET_TREAT_CONVEX_AS_SOLID = downcallHandleVoid("JPH_RayCastSettings_SetTreatConvexAsSolid", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE = downcallHandleVoid("JPH_RayCastSettings_SetBackFaceMode", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public RayCastSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RayCastSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RayCastSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// How backfacing triangles should be treated (should we report back facing hits for triangle based shapes, e.g. MeshShape/HeightFieldShape?)
    /// ```
    public static int getBackFaceModeTriangles(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_GET_BACK_FACE_MODE_TRIANGLES.get();
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
    /// How backfacing triangles should be treated (should we report back facing hits for triangle based shapes, e.g. MeshShape/HeightFieldShape?)
    /// ```
    public static void setBackFaceModeTriangles(
    	MemorySegment self,
    	int mBackFaceModeTriangles
    ) {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE_TRIANGLES.get();
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
    /// How backfacing convex objects should be treated (should we report back facing hits for convex shapes?)
    /// ```
    public static int getBackFaceModeConvex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_GET_BACK_FACE_MODE_CONVEX.get();
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
    /// How backfacing convex objects should be treated (should we report back facing hits for convex shapes?)
    /// ```
    public static void setBackFaceModeConvex(
    	MemorySegment self,
    	int mBackFaceModeConvex
    ) {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE_CONVEX.get();
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
    /// If convex shapes should be treated as solid. When true, a ray starting inside a convex shape will generate a hit at fraction 0.
    /// ```
    public static boolean getTreatConvexAsSolid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_GET_TREAT_CONVEX_AS_SOLID.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTreatConvexAsSolid].
    public final boolean getTreatConvexAsSolid() {
    	return getTreatConvexAsSolid(
    		this.segment
    	);
    }
    
    /// ```
    /// If convex shapes should be treated as solid. When true, a ray starting inside a convex shape will generate a hit at fraction 0.
    /// ```
    public static void setTreatConvexAsSolid(
    	MemorySegment self,
    	boolean mTreatConvexAsSolid
    ) {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_SET_TREAT_CONVEX_AS_SOLID.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTreatConvexAsSolid
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTreatConvexAsSolid].
    public final void setTreatConvexAsSolid(
    	boolean mTreatConvexAsSolid
    ) {
    	setTreatConvexAsSolid(
    		this.segment,
    		mTreatConvexAsSolid
    	);
    }
    
    /// ```
    /// Set the backfacing mode for all shapes
    /// ```
    public static void setBackFaceMode(
    	MemorySegment self,
    	int inMode
    ) {
    	MethodHandle method = JPH_RAY_CAST_SETTINGS_SET_BACK_FACE_MODE.get();
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