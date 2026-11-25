/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.DVec3;
import volucris.bindings.jolt.math.Float4;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.math.Vec4;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Plane {

	private static final LazyConstant<MethodHandle> JPH_PLANE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_PLANE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_PLANE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_PLANE_S_FROM_POINT_AND_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_PLANE_S_FROM_POINT_AND_NORMAL1;
	private static final LazyConstant<MethodHandle> JPH_PLANE_S_FROM_POINTS_CCW;
	private static final LazyConstant<MethodHandle> JPH_PLANE_GET_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SET_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_PLANE_GET_CONSTANT;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SET_CONSTANT;
	private static final LazyConstant<MethodHandle> JPH_PLANE_STORE_FLOAT4;
	private static final LazyConstant<MethodHandle> JPH_PLANE_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_PLANE_GET_TRANSFORMED;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SCALED;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SIGNED_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_PROJECT_POINT_ON_PLANE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_S_INTERSECT_PLANES;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_PLANE_CREATE = downcallHandle("JPH_Plane_Create", UNBOUNDED_ADDRESS);
		JPH_PLANE_CREATE1 = downcallHandle("JPH_Plane_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_CREATE2 = downcallHandle("JPH_Plane_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PLANE_DESTROY = downcallHandleVoid("JPH_Plane_Destroy", UNBOUNDED_ADDRESS);
		JPH_PLANE_S_FROM_POINT_AND_NORMAL = downcallHandleVoid("JPH_Plane_sFromPointAndNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_S_FROM_POINT_AND_NORMAL1 = downcallHandleVoid("JPH_Plane_sFromPointAndNormal1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_S_FROM_POINTS_CCW = downcallHandleVoid("JPH_Plane_sFromPointsCCW", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_GET_NORMAL = downcallHandleVoid("JPH_Plane_GetNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SET_NORMAL = downcallHandleVoid("JPH_Plane_SetNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_GET_CONSTANT = downcallHandle("JPH_Plane_GetConstant", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PLANE_SET_CONSTANT = downcallHandleVoid("JPH_Plane_SetConstant", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PLANE_STORE_FLOAT4 = downcallHandleVoid("JPH_Plane_StoreFloat4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_OFFSET = downcallHandleVoid("JPH_Plane_Offset", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PLANE_GET_TRANSFORMED = downcallHandleVoid("JPH_Plane_GetTransformed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SCALED = downcallHandleVoid("JPH_Plane_Scaled", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SIGNED_DISTANCE = downcallHandle("JPH_Plane_SignedDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_PROJECT_POINT_ON_PLANE = downcallHandleVoid("JPH_Plane_ProjectPointOnPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_S_INTERSECT_PLANES = downcallHandle("JPH_Plane_sIntersectPlanes", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Plane() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Plane(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Plane(
	    Vec4 inNormalAndConstant
	) {
	    this(
	        Arena.ofAuto(),
	        inNormalAndConstant
	    );
	}
	
	/// Typed method of [#create1].
	public Plane(
		Arena arena,
		Vec4 inNormalAndConstant
	) {
		MemorySegment segment = create1(
			inNormalAndConstant.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Plane(
	    Vec3 inNormal,
	    float inConstant
	) {
	    this(
	        Arena.ofAuto(),
	        inNormal,
	        inConstant
	    );
	}
	
	/// Typed method of [#create2].
	public Plane(
		Arena arena,
		Vec3 inNormal,
		float inConstant
	) {
		MemorySegment segment = create2(
			inNormal.memorySegment(),
			inConstant
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Plane(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_PLANE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inNormalAndConstant
    ) {
    	MethodHandle method = JPH_PLANE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inNormalAndConstant
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inNormal,
    	float inConstant
    ) {
    	MethodHandle method = JPH_PLANE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inNormal,
    			inConstant
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PLANE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create from point and normal
    /// ```
    public static void sFromPointAndNormal(
    	MemorySegment inPoint,
    	MemorySegment inNormal,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_S_FROM_POINT_AND_NORMAL.get();
    	try {
    		 method.invokeExact(
    			inPoint,
    			inNormal,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sFromPointAndNormal].
    public static void sFromPointAndNormal(
    	Vec3 inPoint,
    	Vec3 inNormal,
    	Plane outResult
    ) {
    	sFromPointAndNormal(
    		inPoint.memorySegment(),
    		inNormal.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Create from point and normal, double precision version that more accurately calculates the plane constant
    /// ```
    public static void sFromPointAndNormal1(
    	MemorySegment inPoint,
    	MemorySegment inNormal,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_S_FROM_POINT_AND_NORMAL1.get();
    	try {
    		 method.invokeExact(
    			inPoint,
    			inNormal,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sFromPointAndNormal1].
    public static void sFromPointAndNormal1(
    	DVec3 inPoint,
    	Vec3 inNormal,
    	Plane outResult
    ) {
    	sFromPointAndNormal1(
    		inPoint.memorySegment(),
    		inNormal.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Create from 3 counter clockwise points
    /// ```
    public static void sFromPointsCCW(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_S_FROM_POINTS_CCW.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			inV3,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sFromPointsCCW].
    public static void sFromPointsCCW(
    	Vec3 inV1,
    	Vec3 inV2,
    	Vec3 inV3,
    	Plane outResult
    ) {
    	sFromPointsCCW(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		inV3.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void getNormal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_GET_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormal].
    public final void getNormal(
    	Vec3 outResult
    ) {
    	getNormal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setNormal(
    	MemorySegment self,
    	MemorySegment inNormal
    ) {
    	MethodHandle method = JPH_PLANE_SET_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNormal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormal].
    public final void setNormal(
    	Vec3 inNormal
    ) {
    	setNormal(
    		this.segment,
    		inNormal.memorySegment()
    	);
    }
    
    public static float getConstant(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PLANE_GET_CONSTANT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstant].
    public final float getConstant() {
    	return getConstant(
    		this.segment
    	);
    }
    
    public static void setConstant(
    	MemorySegment self,
    	float inConstant
    ) {
    	MethodHandle method = JPH_PLANE_SET_CONSTANT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstant
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConstant].
    public final void setConstant(
    	float inConstant
    ) {
    	setConstant(
    		this.segment,
    		inConstant
    	);
    }
    
    /// ```
    /// Store as 4 floats
    /// ```
    public static void storeFloat4(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_PLANE_STORE_FLOAT4.get();
    	try {
    		 method.invokeExact(
    			self,
    			outV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#storeFloat4].
    public final void storeFloat4(
    	Float4 outV
    ) {
    	storeFloat4(
    		this.segment,
    		outV.memorySegment()
    	);
    }
    
    /// ```
    /// Offset the plane (positive value means move it in the direction of the plane normal)
    /// ```
    public static void offset(
    	MemorySegment self,
    	float inDistance,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDistance,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#offset].
    public final void offset(
    	float inDistance,
    	Plane outResult
    ) {
    	offset(
    		this.segment,
    		inDistance,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Transform the plane by a matrix
    /// ```
    public static void getTransformed(
    	MemorySegment self,
    	MemorySegment inTransform,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_GET_TRANSFORMED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTransform,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransformed].
    public final void getTransformed(
    	Mat44 inTransform,
    	Plane outResult
    ) {
    	getTransformed(
    		this.segment,
    		inTransform.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Scale the plane, can handle non-uniform and negative scaling
    /// ```
    public static void scaled(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_SCALED.get();
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
    
    /// Typed method of [#scaled].
    public final void scaled(
    	Vec3 inScale,
    	Plane outResult
    ) {
    	scaled(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Distance point to plane
    /// ```
    public static float signedDistance(
    	MemorySegment self,
    	MemorySegment inPoint
    ) {
    	MethodHandle method = JPH_PLANE_SIGNED_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#signedDistance].
    public final float signedDistance(
    	Vec3 inPoint
    ) {
    	return signedDistance(
    		this.segment,
    		inPoint.memorySegment()
    	);
    }
    
    /// ```
    /// Project inPoint onto the plane
    /// ```
    public static void projectPointOnPlane(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_PROJECT_POINT_ON_PLANE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#projectPointOnPlane].
    public final void projectPointOnPlane(
    	Vec3 inPoint,
    	Vec3 outResult
    ) {
    	projectPointOnPlane(
    		this.segment,
    		inPoint.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns intersection point between 3 planes
    /// ```
    public static boolean sIntersectPlanes(
    	MemorySegment inP1,
    	MemorySegment inP2,
    	MemorySegment inP3,
    	MemorySegment outPoint
    ) {
    	MethodHandle method = JPH_PLANE_S_INTERSECT_PLANES.get();
    	try {
    		return (boolean) method.invokeExact(
    			inP1,
    			inP2,
    			inP3,
    			outPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sIntersectPlanes].
    public static boolean sIntersectPlanes(
    	Plane inP1,
    	Plane inP2,
    	Plane inP3,
    	Vec3 outPoint
    ) {
    	return sIntersectPlanes(
    		inP1.memorySegment(),
    		inP2.memorySegment(),
    		inP3.memorySegment(),
    		outPoint.memorySegment()
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