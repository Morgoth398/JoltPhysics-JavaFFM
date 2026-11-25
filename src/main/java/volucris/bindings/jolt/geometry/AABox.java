/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.DMat44;
import volucris.bindings.jolt.math.DVec3;
import volucris.bindings.jolt.math.Float3Array;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class AABox {

	private static final LazyConstant<MethodHandle> JPH_AABOX_CREATE;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_AABOX_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_MIN;
	private static final LazyConstant<MethodHandle> JPH_AABOX_SET_MIN;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_MAX;
	private static final LazyConstant<MethodHandle> JPH_AABOX_SET_MAX;
	private static final LazyConstant<MethodHandle> JPH_AABOX_S_FROM_TWO_POINTS;
	private static final LazyConstant<MethodHandle> JPH_AABOX_S_FROM_TRIANGLE;
	private static final LazyConstant<MethodHandle> JPH_AABOX_S_BIGGEST;
	private static final LazyConstant<MethodHandle> JPH_AABOX_SET_EMPTY;
	private static final LazyConstant<MethodHandle> JPH_AABOX_IS_VALID;
	private static final LazyConstant<MethodHandle> JPH_AABOX_ENCAPSULATE;
	private static final LazyConstant<MethodHandle> JPH_AABOX_ENCAPSULATE1;
	private static final LazyConstant<MethodHandle> JPH_AABOX_ENCAPSULATE2;
	private static final LazyConstant<MethodHandle> JPH_AABOX_ENCAPSULATE3;
	private static final LazyConstant<MethodHandle> JPH_AABOX_INTERSECT;
	private static final LazyConstant<MethodHandle> JPH_AABOX_ENSURE_MINIMAL_EDGE_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_AABOX_EXPAND_BY;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_CENTER;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_EXTENT;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_SIZE;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_SURFACE_AREA;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CONTAINS;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CONTAINS1;
	private static final LazyConstant<MethodHandle> JPH_AABOX_CONTAINS2;
	private static final LazyConstant<MethodHandle> JPH_AABOX_OVERLAPS;
	private static final LazyConstant<MethodHandle> JPH_AABOX_OVERLAPS1;
	private static final LazyConstant<MethodHandle> JPH_AABOX_TRANSLATE;
	private static final LazyConstant<MethodHandle> JPH_AABOX_TRANSLATE1;
	private static final LazyConstant<MethodHandle> JPH_AABOX_TRANSFORMED;
	private static final LazyConstant<MethodHandle> JPH_AABOX_TRANSFORMED1;
	private static final LazyConstant<MethodHandle> JPH_AABOX_SCALED;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_SUPPORT;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_CLOSEST_POINT;
	private static final LazyConstant<MethodHandle> JPH_AABOX_GET_SQ_DISTANCE_TO;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_AABOX_CREATE = downcallHandle("JPH_AABox_Create", UNBOUNDED_ADDRESS);
		JPH_AABOX_CREATE1 = downcallHandle("JPH_AABox_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_CREATE2 = downcallHandle("JPH_AABox_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_CREATE3 = downcallHandle("JPH_AABox_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_AABOX_DESTROY = downcallHandleVoid("JPH_AABox_Destroy", UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_MIN = downcallHandleVoid("JPH_AABox_GetMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_SET_MIN = downcallHandleVoid("JPH_AABox_SetMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_MAX = downcallHandleVoid("JPH_AABox_GetMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_SET_MAX = downcallHandleVoid("JPH_AABox_SetMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_S_FROM_TWO_POINTS = downcallHandleVoid("JPH_AABox_sFromTwoPoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_S_FROM_TRIANGLE = downcallHandleVoid("JPH_AABox_sFromTriangle", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_S_BIGGEST = downcallHandleVoid("JPH_AABox_sBiggest", UNBOUNDED_ADDRESS);
		JPH_AABOX_SET_EMPTY = downcallHandleVoid("JPH_AABox_SetEmpty", UNBOUNDED_ADDRESS);
		JPH_AABOX_IS_VALID = downcallHandle("JPH_AABox_IsValid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_AABOX_ENCAPSULATE = downcallHandleVoid("JPH_AABox_Encapsulate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_ENCAPSULATE1 = downcallHandleVoid("JPH_AABox_Encapsulate1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_ENCAPSULATE2 = downcallHandleVoid("JPH_AABox_Encapsulate2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_ENCAPSULATE3 = downcallHandleVoid("JPH_AABox_Encapsulate3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_INTERSECT = downcallHandleVoid("JPH_AABox_Intersect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_ENSURE_MINIMAL_EDGE_LENGTH = downcallHandleVoid("JPH_AABox_EnsureMinimalEdgeLength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_AABOX_EXPAND_BY = downcallHandleVoid("JPH_AABox_ExpandBy", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_CENTER = downcallHandleVoid("JPH_AABox_GetCenter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_EXTENT = downcallHandleVoid("JPH_AABox_GetExtent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_SIZE = downcallHandleVoid("JPH_AABox_GetSize", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_SURFACE_AREA = downcallHandle("JPH_AABox_GetSurfaceArea", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_VOLUME = downcallHandle("JPH_AABox_GetVolume", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_AABOX_CONTAINS = downcallHandle("JPH_AABox_Contains", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_CONTAINS1 = downcallHandle("JPH_AABox_Contains1", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_CONTAINS2 = downcallHandle("JPH_AABox_Contains2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_OVERLAPS = downcallHandle("JPH_AABox_Overlaps", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_OVERLAPS1 = downcallHandle("JPH_AABox_Overlaps1", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_TRANSLATE = downcallHandleVoid("JPH_AABox_Translate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_TRANSLATE1 = downcallHandleVoid("JPH_AABox_Translate1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_TRANSFORMED = downcallHandleVoid("JPH_AABox_Transformed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_TRANSFORMED1 = downcallHandleVoid("JPH_AABox_Transformed1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_SCALED = downcallHandleVoid("JPH_AABox_Scaled", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_SUPPORT = downcallHandleVoid("JPH_AABox_GetSupport", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_CLOSEST_POINT = downcallHandleVoid("JPH_AABox_GetClosestPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AABOX_GET_SQ_DISTANCE_TO = downcallHandle("JPH_AABox_GetSqDistanceTo", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public AABox() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public AABox(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AABox(
	    Vec3 inMin,
	    Vec3 inMax
	) {
	    this(
	        Arena.ofAuto(),
	        inMin,
	        inMax
	    );
	}
	
	/// Typed method of [#create1].
	public AABox(
		Arena arena,
		Vec3 inMin,
		Vec3 inMax
	) {
		MemorySegment segment = create1(
			inMin.memorySegment(),
			inMax.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AABox(
	    DVec3 inMin,
	    DVec3 inMax
	) {
	    this(
	        Arena.ofAuto(),
	        inMin,
	        inMax
	    );
	}
	
	/// Typed method of [#create2].
	public AABox(
		Arena arena,
		DVec3 inMin,
		DVec3 inMax
	) {
		MemorySegment segment = create2(
			inMin.memorySegment(),
			inMax.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AABox(
	    Vec3 inCenter,
	    float inRadius
	) {
	    this(
	        Arena.ofAuto(),
	        inCenter,
	        inRadius
	    );
	}
	
	/// Typed method of [#create3].
	public AABox(
		Arena arena,
		Vec3 inCenter,
		float inRadius
	) {
		MemorySegment segment = create3(
			inCenter.memorySegment(),
			inRadius
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AABox(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_AABOX_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inMin,
    	MemorySegment inMax
    ) {
    	MethodHandle method = JPH_AABOX_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inMin,
    			inMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inMin,
    	MemorySegment inMax
    ) {
    	MethodHandle method = JPH_AABOX_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inMin,
    			inMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	MemorySegment inCenter,
    	float inRadius
    ) {
    	MethodHandle method = JPH_AABOX_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inCenter,
    			inRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_AABOX_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Bounding box min and max
    /// ```
    public static void getMin(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_GET_MIN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMin].
    public final void getMin(
    	Vec3 outResult
    ) {
    	getMin(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Bounding box min and max
    /// ```
    public static void setMin(
    	MemorySegment self,
    	MemorySegment mMin
    ) {
    	MethodHandle method = JPH_AABOX_SET_MIN.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMin
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMin].
    public final void setMin(
    	Vec3 mMin
    ) {
    	setMin(
    		this.segment,
    		mMin.memorySegment()
    	);
    }
    
    public static void getMax(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_GET_MAX.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMax].
    public final void getMax(
    	Vec3 outResult
    ) {
    	getMax(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setMax(
    	MemorySegment self,
    	MemorySegment mMax
    ) {
    	MethodHandle method = JPH_AABOX_SET_MAX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMax].
    public final void setMax(
    	Vec3 mMax
    ) {
    	setMax(
    		this.segment,
    		mMax.memorySegment()
    	);
    }
    
    /// ```
    /// Create box from 2 points
    /// ```
    public static void sFromTwoPoints(
    	MemorySegment inP1,
    	MemorySegment inP2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_S_FROM_TWO_POINTS.get();
    	try {
    		 method.invokeExact(
    			inP1,
    			inP2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sFromTwoPoints].
    public static void sFromTwoPoints(
    	Vec3 inP1,
    	Vec3 inP2,
    	AABox outResult
    ) {
    	sFromTwoPoints(
    		inP1.memorySegment(),
    		inP2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Create box from indexed triangle
    /// ```
    public static void sFromTriangle(
    	MemorySegment inVertices,
    	MemorySegment inTriangle,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_S_FROM_TRIANGLE.get();
    	try {
    		 method.invokeExact(
    			inVertices,
    			inTriangle,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sFromTriangle].
    public static void sFromTriangle(
    	Float3Array inVertices,
    	IndexedTriangle inTriangle,
    	AABox outResult
    ) {
    	sFromTriangle(
    		inVertices.memorySegment(),
    		inTriangle.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get bounding box of size FLT_MAX
    /// ```
    public static void sBiggest(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_S_BIGGEST.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sBiggest].
    public static void sBiggest(
    	AABox outResult
    ) {
    	sBiggest(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Reset the bounding box to an empty bounding box
    /// ```
    public static void setEmpty(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_AABOX_SET_EMPTY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEmpty].
    public final void setEmpty() {
    	setEmpty(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if the bounding box is valid (max >= min)
    /// ```
    public static boolean isValid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_AABOX_IS_VALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValid].
    public final boolean isValid() {
    	return isValid(
    		this.segment
    	);
    }
    
    /// ```
    /// Encapsulate point in bounding box
    /// ```
    public static void encapsulate(
    	MemorySegment self,
    	MemorySegment inPos
    ) {
    	MethodHandle method = JPH_AABOX_ENCAPSULATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPos
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#encapsulate].
    public final void encapsulate(
    	Vec3 inPos
    ) {
    	encapsulate(
    		this.segment,
    		inPos.memorySegment()
    	);
    }
    
    /// ```
    /// Encapsulate bounding box in bounding box
    /// ```
    public static void encapsulate1(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_AABOX_ENCAPSULATE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#encapsulate1].
    public final void encapsulate1(
    	AABox inRHS
    ) {
    	encapsulate1(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    /// ```
    /// Encapsulate triangle in bounding box
    /// ```
    public static void encapsulate2(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_AABOX_ENCAPSULATE2.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#encapsulate2].
    public final void encapsulate2(
    	Triangle inRHS
    ) {
    	encapsulate2(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    /// ```
    /// Encapsulate triangle in bounding box
    /// ```
    public static void encapsulate3(
    	MemorySegment self,
    	MemorySegment inVertices,
    	MemorySegment inTriangle
    ) {
    	MethodHandle method = JPH_AABOX_ENCAPSULATE3.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVertices,
    			inTriangle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#encapsulate3].
    public final void encapsulate3(
    	Float3Array inVertices,
    	IndexedTriangle inTriangle
    ) {
    	encapsulate3(
    		this.segment,
    		inVertices.memorySegment(),
    		inTriangle.memorySegment()
    	);
    }
    
    /// ```
    /// Intersect this bounding box with inOther, returns the intersection
    /// ```
    public static void intersect(
    	MemorySegment self,
    	MemorySegment inOther,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_INTERSECT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inOther,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#intersect].
    public final void intersect(
    	AABox inOther,
    	AABox outResult
    ) {
    	intersect(
    		this.segment,
    		inOther.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Make sure that each edge of the bounding box has a minimal length
    /// ```
    public static void ensureMinimalEdgeLength(
    	MemorySegment self,
    	float inMinEdgeLength
    ) {
    	MethodHandle method = JPH_AABOX_ENSURE_MINIMAL_EDGE_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMinEdgeLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ensureMinimalEdgeLength].
    public final void ensureMinimalEdgeLength(
    	float inMinEdgeLength
    ) {
    	ensureMinimalEdgeLength(
    		this.segment,
    		inMinEdgeLength
    	);
    }
    
    /// ```
    /// Widen the box on both sides by inVector
    /// ```
    public static void expandBy(
    	MemorySegment self,
    	MemorySegment inVector
    ) {
    	MethodHandle method = JPH_AABOX_EXPAND_BY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVector
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#expandBy].
    public final void expandBy(
    	Vec3 inVector
    ) {
    	expandBy(
    		this.segment,
    		inVector.memorySegment()
    	);
    }
    
    /// ```
    /// Get center of bounding box
    /// ```
    public static void getCenter(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_GET_CENTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenter].
    public final void getCenter(
    	Vec3 outResult
    ) {
    	getCenter(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get extent of bounding box (half of the size)
    /// ```
    public static void getExtent(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_GET_EXTENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getExtent].
    public final void getExtent(
    	Vec3 outResult
    ) {
    	getExtent(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get size of bounding box
    /// ```
    public static void getSize(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_GET_SIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSize].
    public final void getSize(
    	Vec3 outResult
    ) {
    	getSize(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get surface area of bounding box
    /// ```
    public static float getSurfaceArea(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_AABOX_GET_SURFACE_AREA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSurfaceArea].
    public final float getSurfaceArea() {
    	return getSurfaceArea(
    		this.segment
    	);
    }
    
    /// ```
    /// Get volume of bounding box
    /// ```
    public static float getVolume(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_AABOX_GET_VOLUME.get();
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
    /// Check if this box contains another box
    /// ```
    public static boolean contains(
    	MemorySegment self,
    	MemorySegment inOther
    ) {
    	MethodHandle method = JPH_AABOX_CONTAINS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inOther
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contains].
    public final boolean contains(
    	AABox inOther
    ) {
    	return contains(
    		this.segment,
    		inOther.memorySegment()
    	);
    }
    
    /// ```
    /// Check if this box contains a point
    /// ```
    public static boolean contains1(
    	MemorySegment self,
    	MemorySegment inOther
    ) {
    	MethodHandle method = JPH_AABOX_CONTAINS1.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inOther
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contains1].
    public final boolean contains1(
    	Vec3 inOther
    ) {
    	return contains1(
    		this.segment,
    		inOther.memorySegment()
    	);
    }
    
    /// ```
    /// Check if this box contains a point
    /// ```
    public static boolean contains2(
    	MemorySegment self,
    	MemorySegment inOther
    ) {
    	MethodHandle method = JPH_AABOX_CONTAINS2.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inOther
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contains2].
    public final boolean contains2(
    	DVec3 inOther
    ) {
    	return contains2(
    		this.segment,
    		inOther.memorySegment()
    	);
    }
    
    /// ```
    /// Check if this box overlaps with another box
    /// ```
    public static boolean overlaps(
    	MemorySegment self,
    	MemorySegment inOther
    ) {
    	MethodHandle method = JPH_AABOX_OVERLAPS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inOther
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlaps].
    public final boolean overlaps(
    	AABox inOther
    ) {
    	return overlaps(
    		this.segment,
    		inOther.memorySegment()
    	);
    }
    
    /// ```
    /// Check if this box overlaps with a plane
    /// ```
    public static boolean overlaps1(
    	MemorySegment self,
    	MemorySegment inPlane
    ) {
    	MethodHandle method = JPH_AABOX_OVERLAPS1.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inPlane
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overlaps1].
    public final boolean overlaps1(
    	Plane inPlane
    ) {
    	return overlaps1(
    		this.segment,
    		inPlane.memorySegment()
    	);
    }
    
    /// ```
    /// Translate bounding box
    /// ```
    public static void translate(
    	MemorySegment self,
    	MemorySegment inTranslation
    ) {
    	MethodHandle method = JPH_AABOX_TRANSLATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTranslation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#translate].
    public final void translate(
    	Vec3 inTranslation
    ) {
    	translate(
    		this.segment,
    		inTranslation.memorySegment()
    	);
    }
    
    /// ```
    /// Translate bounding box
    /// ```
    public static void translate1(
    	MemorySegment self,
    	MemorySegment inTranslation
    ) {
    	MethodHandle method = JPH_AABOX_TRANSLATE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTranslation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#translate1].
    public final void translate1(
    	DVec3 inTranslation
    ) {
    	translate1(
    		this.segment,
    		inTranslation.memorySegment()
    	);
    }
    
    /// ```
    /// Transform bounding box
    /// ```
    public static void transformed(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_TRANSFORMED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#transformed].
    public final void transformed(
    	Mat44 inMatrix,
    	AABox outResult
    ) {
    	transformed(
    		this.segment,
    		inMatrix.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Transform bounding box
    /// ```
    public static void transformed1(
    	MemorySegment self,
    	MemorySegment inMatrix,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_TRANSFORMED1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#transformed1].
    public final void transformed1(
    	DMat44 inMatrix,
    	AABox outResult
    ) {
    	transformed1(
    		this.segment,
    		inMatrix.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Scale this bounding box, can handle non-uniform and negative scaling
    /// ```
    public static void scaled(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_SCALED.get();
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
    	AABox outResult
    ) {
    	scaled(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the support vector for this convex shape.
    /// ```
    public static void getSupport(
    	MemorySegment self,
    	MemorySegment inDirection,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_GET_SUPPORT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDirection,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSupport].
    public final void getSupport(
    	Vec3 inDirection,
    	Vec3 outResult
    ) {
    	getSupport(
    		this.segment,
    		inDirection.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the closest point on or in this box to inPoint
    /// ```
    public static void getClosestPoint(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_AABOX_GET_CLOSEST_POINT.get();
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
    
    /// Typed method of [#getClosestPoint].
    public final void getClosestPoint(
    	Vec3 inPoint,
    	Vec3 outResult
    ) {
    	getClosestPoint(
    		this.segment,
    		inPoint.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the squared distance between inPoint and this box (will be 0 if in Point is inside the box)
    /// ```
    public static float getSqDistanceTo(
    	MemorySegment self,
    	MemorySegment inPoint
    ) {
    	MethodHandle method = JPH_AABOX_GET_SQ_DISTANCE_TO.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSqDistanceTo].
    public final float getSqDistanceTo(
    	Vec3 inPoint
    ) {
    	return getSqDistanceTo(
    		this.segment,
    		inPoint.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}