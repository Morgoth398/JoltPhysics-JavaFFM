/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Vec3 {

	private static final LazyConstant<MethodHandle> JPH_VEC3_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEC3_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_VEC3_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_VEC3_CREATE4;
	private static final LazyConstant<MethodHandle> JPH_VEC3_CREATE5;
	private static final LazyConstant<MethodHandle> JPH_VEC3_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEC3_GET_UNIT_SPHERE;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_ZERO;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_ONE;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_NA_N;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_AXIS_X;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_AXIS_Y;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_AXIS_Z;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_REPLICATE;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_LOAD_FLOAT3_UNSAFE;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_MIN;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_MAX;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_CLAMP;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_EQUALS;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_LESS;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_LESS_OR_EQUAL;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_GREATER;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_GREATER_OR_EQUAL;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_FUSED_MULTIPLY_ADD;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_SELECT;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_OR;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_XOR;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_AND;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_UNIT_SPHERICAL;
	private static final LazyConstant<MethodHandle> JPH_VEC3_GET_X;
	private static final LazyConstant<MethodHandle> JPH_VEC3_GET_Y;
	private static final LazyConstant<MethodHandle> JPH_VEC3_GET_Z;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SET_X;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SET_Y;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SET_Z;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SET;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SET_COMPONENT;
	private static final LazyConstant<MethodHandle> JPH_VEC3_IS_CLOSE;
	private static final LazyConstant<MethodHandle> JPH_VEC3_IS_NEAR_ZERO;
	private static final LazyConstant<MethodHandle> JPH_VEC3_IS_NORMALIZED;
	private static final LazyConstant<MethodHandle> JPH_VEC3_IS_NA_N;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SPLAT_X;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SPLAT_Y;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SPLAT_Z;
	private static final LazyConstant<MethodHandle> JPH_VEC3_GET_LOWEST_COMPONENT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_VEC3_GET_HIGHEST_COMPONENT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_VEC3_ABS;
	private static final LazyConstant<MethodHandle> JPH_VEC3_RECIPROCAL;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_DIFFERENCE_OF_PRODUCTS;
	private static final LazyConstant<MethodHandle> JPH_VEC3_CROSS;
	private static final LazyConstant<MethodHandle> JPH_VEC3_CROSS_PRECISE;
	private static final LazyConstant<MethodHandle> JPH_VEC3_DOT_V;
	private static final LazyConstant<MethodHandle> JPH_VEC3_DOT_V4;
	private static final LazyConstant<MethodHandle> JPH_VEC3_DOT;
	private static final LazyConstant<MethodHandle> JPH_VEC3_LENGTH_SQ;
	private static final LazyConstant<MethodHandle> JPH_VEC3_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_VEC3_NORMALIZED;
	private static final LazyConstant<MethodHandle> JPH_VEC3_NORMALIZED_OR;
	private static final LazyConstant<MethodHandle> JPH_VEC3_STORE_FLOAT3;
	private static final LazyConstant<MethodHandle> JPH_VEC3_TO_INT;
	private static final LazyConstant<MethodHandle> JPH_VEC3_REINTERPRET_AS_INT;
	private static final LazyConstant<MethodHandle> JPH_VEC3_REDUCE_MIN;
	private static final LazyConstant<MethodHandle> JPH_VEC3_REDUCE_MAX;
	private static final LazyConstant<MethodHandle> JPH_VEC3_REDUCE_SUM;
	private static final LazyConstant<MethodHandle> JPH_VEC3_SQRT;
	private static final LazyConstant<MethodHandle> JPH_VEC3_GET_NORMALIZED_PERPENDICULAR;
	private static final LazyConstant<MethodHandle> JPH_VEC3_GET_SIGN;
	private static final LazyConstant<MethodHandle> JPH_VEC3_COMPRESS_UNIT_VECTOR;
	private static final LazyConstant<MethodHandle> JPH_VEC3_S_DECOMPRESS_UNIT_VECTOR;
	private static final LazyConstant<MethodHandle> JPH_VEC3_CHECK_W;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEC3_CREATE = downcallHandle("JPH_Vec3_Create", UNBOUNDED_ADDRESS);
		JPH_VEC3_CREATE1 = downcallHandle("JPH_Vec3_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_CREATE2 = downcallHandle("JPH_Vec3_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_CREATE4 = downcallHandle("JPH_Vec3_Create4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_CREATE5 = downcallHandle("JPH_Vec3_Create5", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_VEC3_DESTROY = downcallHandleVoid("JPH_Vec3_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEC3_GET_UNIT_SPHERE = downcallHandleVoid("JPH_Vec3_GetUnitSphere", UNBOUNDED_ADDRESS);
		JPH_VEC3_S_ZERO = downcallHandleVoid("JPH_Vec3_sZero", UNBOUNDED_ADDRESS);
		JPH_VEC3_S_ONE = downcallHandleVoid("JPH_Vec3_sOne", UNBOUNDED_ADDRESS);
		JPH_VEC3_S_NA_N = downcallHandleVoid("JPH_Vec3_sNaN", UNBOUNDED_ADDRESS);
		JPH_VEC3_S_AXIS_X = downcallHandleVoid("JPH_Vec3_sAxisX", UNBOUNDED_ADDRESS);
		JPH_VEC3_S_AXIS_Y = downcallHandleVoid("JPH_Vec3_sAxisY", UNBOUNDED_ADDRESS);
		JPH_VEC3_S_AXIS_Z = downcallHandleVoid("JPH_Vec3_sAxisZ", UNBOUNDED_ADDRESS);
		JPH_VEC3_S_REPLICATE = downcallHandleVoid("JPH_Vec3_sReplicate", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_LOAD_FLOAT3_UNSAFE = downcallHandleVoid("JPH_Vec3_sLoadFloat3Unsafe", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_MIN = downcallHandleVoid("JPH_Vec3_sMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_MAX = downcallHandleVoid("JPH_Vec3_sMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_CLAMP = downcallHandleVoid("JPH_Vec3_sClamp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_EQUALS = downcallHandleVoid("JPH_Vec3_sEquals", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_LESS = downcallHandleVoid("JPH_Vec3_sLess", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_LESS_OR_EQUAL = downcallHandleVoid("JPH_Vec3_sLessOrEqual", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_GREATER = downcallHandleVoid("JPH_Vec3_sGreater", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_GREATER_OR_EQUAL = downcallHandleVoid("JPH_Vec3_sGreaterOrEqual", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_FUSED_MULTIPLY_ADD = downcallHandleVoid("JPH_Vec3_sFusedMultiplyAdd", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_SELECT = downcallHandleVoid("JPH_Vec3_sSelect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_OR = downcallHandleVoid("JPH_Vec3_sOr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_XOR = downcallHandleVoid("JPH_Vec3_sXor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_AND = downcallHandleVoid("JPH_Vec3_sAnd", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_UNIT_SPHERICAL = downcallHandleVoid("JPH_Vec3_sUnitSpherical", JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_GET_X = downcallHandle("JPH_Vec3_GetX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_GET_Y = downcallHandle("JPH_Vec3_GetY", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_GET_Z = downcallHandle("JPH_Vec3_GetZ", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_SET_X = downcallHandleVoid("JPH_Vec3_SetX", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC3_SET_Y = downcallHandleVoid("JPH_Vec3_SetY", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC3_SET_Z = downcallHandleVoid("JPH_Vec3_SetZ", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC3_SET = downcallHandleVoid("JPH_Vec3_Set", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_VEC3_SET_COMPONENT = downcallHandleVoid("JPH_Vec3_SetComponent", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_VEC3_IS_CLOSE = downcallHandle("JPH_Vec3_IsClose", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC3_IS_NEAR_ZERO = downcallHandle("JPH_Vec3_IsNearZero", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC3_IS_NORMALIZED = downcallHandle("JPH_Vec3_IsNormalized", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC3_IS_NA_N = downcallHandle("JPH_Vec3_IsNaN", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_VEC3_SPLAT_X = downcallHandleVoid("JPH_Vec3_SplatX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_SPLAT_Y = downcallHandleVoid("JPH_Vec3_SplatY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_SPLAT_Z = downcallHandleVoid("JPH_Vec3_SplatZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_GET_LOWEST_COMPONENT_INDEX = downcallHandle("JPH_Vec3_GetLowestComponentIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEC3_GET_HIGHEST_COMPONENT_INDEX = downcallHandle("JPH_Vec3_GetHighestComponentIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEC3_ABS = downcallHandleVoid("JPH_Vec3_Abs", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_RECIPROCAL = downcallHandleVoid("JPH_Vec3_Reciprocal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_DIFFERENCE_OF_PRODUCTS = downcallHandleVoid("JPH_Vec3_sDifferenceOfProducts", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_CROSS = downcallHandleVoid("JPH_Vec3_Cross", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_CROSS_PRECISE = downcallHandleVoid("JPH_Vec3_CrossPrecise", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_DOT_V = downcallHandleVoid("JPH_Vec3_DotV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_DOT_V4 = downcallHandleVoid("JPH_Vec3_DotV4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_DOT = downcallHandle("JPH_Vec3_Dot", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_LENGTH_SQ = downcallHandle("JPH_Vec3_LengthSq", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_LENGTH = downcallHandle("JPH_Vec3_Length", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_NORMALIZED = downcallHandleVoid("JPH_Vec3_Normalized", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_NORMALIZED_OR = downcallHandleVoid("JPH_Vec3_NormalizedOr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_STORE_FLOAT3 = downcallHandleVoid("JPH_Vec3_StoreFloat3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_TO_INT = downcallHandleVoid("JPH_Vec3_ToInt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_REINTERPRET_AS_INT = downcallHandleVoid("JPH_Vec3_ReinterpretAsInt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_REDUCE_MIN = downcallHandle("JPH_Vec3_ReduceMin", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_REDUCE_MAX = downcallHandle("JPH_Vec3_ReduceMax", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_REDUCE_SUM = downcallHandle("JPH_Vec3_ReduceSum", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC3_SQRT = downcallHandleVoid("JPH_Vec3_Sqrt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_GET_NORMALIZED_PERPENDICULAR = downcallHandleVoid("JPH_Vec3_GetNormalizedPerpendicular", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_GET_SIGN = downcallHandleVoid("JPH_Vec3_GetSign", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC3_COMPRESS_UNIT_VECTOR = downcallHandle("JPH_Vec3_CompressUnitVector", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEC3_S_DECOMPRESS_UNIT_VECTOR = downcallHandleVoid("JPH_Vec3_sDecompressUnitVector", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEC3_CHECK_W = downcallHandleVoid("JPH_Vec3_CheckW", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Vec3() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Vec3(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec3(
	    Vec3 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public Vec3(
		Arena arena,
		Vec3 inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec3(
	    Vec4 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create2].
	public Vec3(
		Arena arena,
		Vec4 inRHS
	) {
		MemorySegment segment = create2(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec3(
	    Float3 inV
	) {
	    this(
	        Arena.ofAuto(),
	        inV
	    );
	}
	
	/// Typed method of [#create4].
	public Vec3(
		Arena arena,
		Float3 inV
	) {
		MemorySegment segment = create4(
			inV.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec3(
	    float inX,
	    float inY,
	    float inZ
	) {
	    this(
	        Arena.ofAuto(),
	        inX,
	        inY,
	        inZ
	    );
	}
	
	/// Typed method of [#create5].
	public Vec3(
		Arena arena,
		float inX,
		float inY,
		float inZ
	) {
		MemorySegment segment = create5(
			inX,
			inY,
			inZ
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec3(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_VEC3_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_VEC3_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_VEC3_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Load 3 floats from memory
    /// ```
    public static MemorySegment create4(
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_VEC3_CREATE4.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a vector from 3 components
    /// ```
    public static MemorySegment create5(
    	float inX,
    	float inY,
    	float inZ
    ) {
    	MethodHandle method = JPH_VEC3_CREATE5.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inX,
    			inY,
    			inZ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// A set of vectors uniformly spanning the surface of a unit sphere, usable for debug purposes
    /// ```
    public static void getUnitSphere(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_GET_UNIT_SPHERE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUnitSphere].
    public static void getUnitSphere(
    	UnitSphereVectors outResult
    ) {
    	getUnitSphere(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vector with all zeros
    /// ```
    public static void sZero(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_ZERO.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sZero].
    public static void sZero(
    	Vec3 outResult
    ) {
    	sZero(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vector with all ones
    /// ```
    public static void sOne(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_ONE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sOne].
    public static void sOne(
    	Vec3 outResult
    ) {
    	sOne(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vector with all NaN's
    /// ```
    public static void sNaN(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_NA_N.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sNaN].
    public static void sNaN(
    	Vec3 outResult
    ) {
    	sNaN(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vectors with the principal axis
    /// ```
    public static void sAxisX(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_AXIS_X.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sAxisX].
    public static void sAxisX(
    	Vec3 outResult
    ) {
    	sAxisX(
    		outResult.memorySegment()
    	);
    }
    
    public static void sAxisY(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_AXIS_Y.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sAxisY].
    public static void sAxisY(
    	Vec3 outResult
    ) {
    	sAxisY(
    		outResult.memorySegment()
    	);
    }
    
    public static void sAxisZ(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_AXIS_Z.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sAxisZ].
    public static void sAxisZ(
    	Vec3 outResult
    ) {
    	sAxisZ(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate inV across all components
    /// ```
    public static void sReplicate(
    	float inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_REPLICATE.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sReplicate].
    public static void sReplicate(
    	float inV,
    	Vec3 outResult
    ) {
    	sReplicate(
    		inV,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 3 floats from memory (reads 32 bits extra which it doesn't use)
    /// ```
    public static void sLoadFloat3Unsafe(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_LOAD_FLOAT3_UNSAFE.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadFloat3Unsafe].
    public static void sLoadFloat3Unsafe(
    	Float3 inV,
    	Vec3 outResult
    ) {
    	sLoadFloat3Unsafe(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Return the minimum value of each of the components
    /// ```
    public static void sMin(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_MIN.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sMin].
    public static void sMin(
    	Vec3 inV1,
    	Vec3 inV2,
    	Vec3 outResult
    ) {
    	sMin(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Return the maximum of each of the components
    /// ```
    public static void sMax(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_MAX.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sMax].
    public static void sMax(
    	Vec3 inV1,
    	Vec3 inV2,
    	Vec3 outResult
    ) {
    	sMax(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Clamp a vector between min and max (component wise)
    /// ```
    public static void sClamp(
    	MemorySegment inV,
    	MemorySegment inMin,
    	MemorySegment inMax,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_CLAMP.get();
    	try {
    		 method.invokeExact(
    			inV,
    			inMin,
    			inMax,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sClamp].
    public static void sClamp(
    	Vec3 inV,
    	Vec3 inMin,
    	Vec3 inMax,
    	Vec3 outResult
    ) {
    	sClamp(
    		inV.memorySegment(),
    		inMin.memorySegment(),
    		inMax.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Equals (component wise)
    /// ```
    public static void sEquals(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_EQUALS.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sEquals].
    public static void sEquals(
    	Vec3 inV1,
    	Vec3 inV2,
    	UVec4 outResult
    ) {
    	sEquals(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Less than (component wise)
    /// ```
    public static void sLess(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_LESS.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLess].
    public static void sLess(
    	Vec3 inV1,
    	Vec3 inV2,
    	UVec4 outResult
    ) {
    	sLess(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Less than or equal (component wise)
    /// ```
    public static void sLessOrEqual(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_LESS_OR_EQUAL.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLessOrEqual].
    public static void sLessOrEqual(
    	Vec3 inV1,
    	Vec3 inV2,
    	UVec4 outResult
    ) {
    	sLessOrEqual(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Greater than (component wise)
    /// ```
    public static void sGreater(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_GREATER.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGreater].
    public static void sGreater(
    	Vec3 inV1,
    	Vec3 inV2,
    	UVec4 outResult
    ) {
    	sGreater(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Greater than or equal (component wise)
    /// ```
    public static void sGreaterOrEqual(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_GREATER_OR_EQUAL.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGreaterOrEqual].
    public static void sGreaterOrEqual(
    	Vec3 inV1,
    	Vec3 inV2,
    	UVec4 outResult
    ) {
    	sGreaterOrEqual(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates inMul1 * inMul2 + inAdd
    /// ```
    public static void sFusedMultiplyAdd(
    	MemorySegment inMul1,
    	MemorySegment inMul2,
    	MemorySegment inAdd,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_FUSED_MULTIPLY_ADD.get();
    	try {
    		 method.invokeExact(
    			inMul1,
    			inMul2,
    			inAdd,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sFusedMultiplyAdd].
    public static void sFusedMultiplyAdd(
    	Vec3 inMul1,
    	Vec3 inMul2,
    	Vec3 inAdd,
    	Vec3 outResult
    ) {
    	sFusedMultiplyAdd(
    		inMul1.memorySegment(),
    		inMul2.memorySegment(),
    		inAdd.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Component wise select, returns inNotSet when highest bit of inControl = 0 and inSet when highest bit of inControl = 1
    /// ```
    public static void sSelect(
    	MemorySegment inNotSet,
    	MemorySegment inSet,
    	MemorySegment inControl,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_SELECT.get();
    	try {
    		 method.invokeExact(
    			inNotSet,
    			inSet,
    			inControl,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sSelect].
    public static void sSelect(
    	Vec3 inNotSet,
    	Vec3 inSet,
    	UVec4 inControl,
    	Vec3 outResult
    ) {
    	sSelect(
    		inNotSet.memorySegment(),
    		inSet.memorySegment(),
    		inControl.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Logical or (component wise)
    /// ```
    public static void sOr(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_OR.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sOr].
    public static void sOr(
    	Vec3 inV1,
    	Vec3 inV2,
    	Vec3 outResult
    ) {
    	sOr(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Logical xor (component wise)
    /// ```
    public static void sXor(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_XOR.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sXor].
    public static void sXor(
    	Vec3 inV1,
    	Vec3 inV2,
    	Vec3 outResult
    ) {
    	sXor(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Logical and (component wise)
    /// ```
    public static void sAnd(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_AND.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sAnd].
    public static void sAnd(
    	Vec3 inV1,
    	Vec3 inV2,
    	Vec3 outResult
    ) {
    	sAnd(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get unit vector given spherical coordinates
    /// inTheta \f$\in [0, \pi]\f$ is angle between vector and z-axis
    /// inPhi \f$\in [0, 2 \pi]\f$ is the angle in the xy-plane starting from the x axis and rotating counter clockwise around the z-axis
    /// ```
    public static void sUnitSpherical(
    	float inTheta,
    	float inPhi,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_UNIT_SPHERICAL.get();
    	try {
    		 method.invokeExact(
    			inTheta,
    			inPhi,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sUnitSpherical].
    public static void sUnitSpherical(
    	float inTheta,
    	float inPhi,
    	Vec3 outResult
    ) {
    	sUnitSpherical(
    		inTheta,
    		inPhi,
    		outResult.memorySegment()
    	);
    }
    
    public static float getX(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_GET_X.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getX].
    public final float getX() {
    	return getX(
    		this.segment
    	);
    }
    
    public static float getY(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_GET_Y.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getY].
    public final float getY() {
    	return getY(
    		this.segment
    	);
    }
    
    public static float getZ(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_GET_Z.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getZ].
    public final float getZ() {
    	return getZ(
    		this.segment
    	);
    }
    
    /// ```
    /// Set individual components
    /// ```
    public static void setX(
    	MemorySegment self,
    	float inX
    ) {
    	MethodHandle method = JPH_VEC3_SET_X.get();
    	try {
    		 method.invokeExact(
    			self,
    			inX
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setX].
    public final void setX(
    	float inX
    ) {
    	setX(
    		this.segment,
    		inX
    	);
    }
    
    public static void setY(
    	MemorySegment self,
    	float inY
    ) {
    	MethodHandle method = JPH_VEC3_SET_Y.get();
    	try {
    		 method.invokeExact(
    			self,
    			inY
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setY].
    public final void setY(
    	float inY
    ) {
    	setY(
    		this.segment,
    		inY
    	);
    }
    
    public static void setZ(
    	MemorySegment self,
    	float inZ
    ) {
    	MethodHandle method = JPH_VEC3_SET_Z.get();
    	try {
    		 method.invokeExact(
    			self,
    			inZ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setZ].
    public final void setZ(
    	float inZ
    ) {
    	setZ(
    		this.segment,
    		inZ
    	);
    }
    
    /// ```
    /// Set all components
    /// ```
    public static void set(
    	MemorySegment self,
    	float inX,
    	float inY,
    	float inZ
    ) {
    	MethodHandle method = JPH_VEC3_SET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inX,
    			inY,
    			inZ
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#set].
    public final void set(
    	float inX,
    	float inY,
    	float inZ
    ) {
    	set(
    		this.segment,
    		inX,
    		inY,
    		inZ
    	);
    }
    
    /// ```
    /// Set float component by index
    /// ```
    public static void setComponent(
    	MemorySegment self,
    	int inCoordinate,
    	float inValue
    ) {
    	MethodHandle method = JPH_VEC3_SET_COMPONENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCoordinate,
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setComponent].
    public final void setComponent(
    	int inCoordinate,
    	float inValue
    ) {
    	setComponent(
    		this.segment,
    		inCoordinate,
    		inValue
    	);
    }
    
    /// ```
    /// Test if two vectors are close
    /// ```
    public static boolean isClose(
    	MemorySegment self,
    	MemorySegment inV2,
    	float inMaxDistSq
    ) {
    	MethodHandle method = JPH_VEC3_IS_CLOSE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inV2,
    			inMaxDistSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isClose].
    public final boolean isClose(
    	Vec3 inV2,
    	float inMaxDistSq
    ) {
    	return isClose(
    		this.segment,
    		inV2.memorySegment(),
    		inMaxDistSq
    	);
    }
    
    /// ```
    /// Test if vector is near zero
    /// ```
    public static boolean isNearZero(
    	MemorySegment self,
    	float inMaxDistSq
    ) {
    	MethodHandle method = JPH_VEC3_IS_NEAR_ZERO.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inMaxDistSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isNearZero].
    public final boolean isNearZero(
    	float inMaxDistSq
    ) {
    	return isNearZero(
    		this.segment,
    		inMaxDistSq
    	);
    }
    
    /// ```
    /// Test if length^2 of this vector is within the range [1 - inTolerance, 1 + inTolerance]
    /// ```
    public static boolean isNormalized(
    	MemorySegment self,
    	float inTolerance
    ) {
    	MethodHandle method = JPH_VEC3_IS_NORMALIZED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inTolerance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isNormalized].
    public final boolean isNormalized(
    	float inTolerance
    ) {
    	return isNormalized(
    		this.segment,
    		inTolerance
    	);
    }
    
    /// ```
    /// Test if vector contains NaN elements
    /// ```
    public static boolean isNaN(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_IS_NA_N.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isNaN].
    public final boolean isNaN() {
    	return isNaN(
    		this.segment
    	);
    }
    
    /// ```
    /// Replicate the X component to all components
    /// ```
    public static void splatX(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_SPLAT_X.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#splatX].
    public final void splatX(
    	Vec4 outResult
    ) {
    	splatX(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate the Y component to all components
    /// ```
    public static void splatY(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_SPLAT_Y.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#splatY].
    public final void splatY(
    	Vec4 outResult
    ) {
    	splatY(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate the Z component to all components
    /// ```
    public static void splatZ(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_SPLAT_Z.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#splatZ].
    public final void splatZ(
    	Vec4 outResult
    ) {
    	splatZ(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get index of component with lowest value
    /// ```
    public static int getLowestComponentIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_GET_LOWEST_COMPONENT_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLowestComponentIndex].
    public final int getLowestComponentIndex() {
    	return getLowestComponentIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Get index of component with highest value
    /// ```
    public static int getHighestComponentIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_GET_HIGHEST_COMPONENT_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHighestComponentIndex].
    public final int getHighestComponentIndex() {
    	return getHighestComponentIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Return the absolute value of each of the components
    /// ```
    public static void abs(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_ABS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#abs].
    public final void abs(
    	Vec3 outResult
    ) {
    	abs(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Reciprocal vector (1 / value) for each of the components
    /// ```
    public static void reciprocal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_RECIPROCAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reciprocal].
    public final void reciprocal(
    	Vec3 outResult
    ) {
    	reciprocal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates inA * inB - inC * inD with more precision when FMA instructions are available. See DifferenceOfProducts.
    /// ```
    public static void sDifferenceOfProducts(
    	MemorySegment inA,
    	MemorySegment inB,
    	MemorySegment inC,
    	MemorySegment inD,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_DIFFERENCE_OF_PRODUCTS.get();
    	try {
    		 method.invokeExact(
    			inA,
    			inB,
    			inC,
    			inD,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sDifferenceOfProducts].
    public static void sDifferenceOfProducts(
    	Vec3 inA,
    	Vec3 inB,
    	Vec3 inC,
    	Vec3 inD,
    	Vec3 outResult
    ) {
    	sDifferenceOfProducts(
    		inA.memorySegment(),
    		inB.memorySegment(),
    		inC.memorySegment(),
    		inD.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Cross product
    /// ```
    public static void cross(
    	MemorySegment self,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_CROSS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#cross].
    public final void cross(
    	Vec3 inV2,
    	Vec3 outResult
    ) {
    	cross(
    		this.segment,
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Cross product (more precise version when FMA is available)
    /// ```
    public static void crossPrecise(
    	MemorySegment self,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_CROSS_PRECISE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#crossPrecise].
    public final void crossPrecise(
    	Vec3 inV2,
    	Vec3 outResult
    ) {
    	crossPrecise(
    		this.segment,
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Dot product, returns the dot product in X, Y and Z components
    /// ```
    public static void dotV(
    	MemorySegment self,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_DOT_V.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dotV].
    public final void dotV(
    	Vec3 inV2,
    	Vec3 outResult
    ) {
    	dotV(
    		this.segment,
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Dot product, returns the dot product in X, Y, Z and W components
    /// ```
    public static void dotV4(
    	MemorySegment self,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_DOT_V4.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dotV4].
    public final void dotV4(
    	Vec3 inV2,
    	Vec4 outResult
    ) {
    	dotV4(
    		this.segment,
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Dot product
    /// ```
    public static float dot(
    	MemorySegment self,
    	MemorySegment inV2
    ) {
    	MethodHandle method = JPH_VEC3_DOT.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inV2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dot].
    public final float dot(
    	Vec3 inV2
    ) {
    	return dot(
    		this.segment,
    		inV2.memorySegment()
    	);
    }
    
    /// ```
    /// Squared length of vector
    /// ```
    public static float lengthSq(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_LENGTH_SQ.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lengthSq].
    public final float lengthSq() {
    	return lengthSq(
    		this.segment
    	);
    }
    
    /// ```
    /// Length of vector
    /// ```
    public static float length(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#length].
    public final float length() {
    	return length(
    		this.segment
    	);
    }
    
    /// ```
    /// Normalize vector
    /// ```
    public static void normalized(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_NORMALIZED.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#normalized].
    public final void normalized(
    	Vec3 outResult
    ) {
    	normalized(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Normalize vector or return inZeroValue if the length of the vector is zero
    /// ```
    public static void normalizedOr(
    	MemorySegment self,
    	MemorySegment inZeroValue,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_NORMALIZED_OR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inZeroValue,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#normalizedOr].
    public final void normalizedOr(
    	Vec3 inZeroValue,
    	Vec3 outResult
    ) {
    	normalizedOr(
    		this.segment,
    		inZeroValue.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Store 3 floats to memory
    /// ```
    public static void storeFloat3(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_VEC3_STORE_FLOAT3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#storeFloat3].
    public final void storeFloat3(
    	Float3 outV
    ) {
    	storeFloat3(
    		this.segment,
    		outV.memorySegment()
    	);
    }
    
    /// ```
    /// Convert each component from a float to an int
    /// ```
    public static void toInt(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_TO_INT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#toInt].
    public final void toInt(
    	UVec4 outResult
    ) {
    	toInt(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Reinterpret Vec3 as a UVec4 (doesn't change the bits)
    /// ```
    public static void reinterpretAsInt(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_REINTERPRET_AS_INT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reinterpretAsInt].
    public final void reinterpretAsInt(
    	UVec4 outResult
    ) {
    	reinterpretAsInt(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the minimum of X, Y and Z
    /// ```
    public static float reduceMin(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_REDUCE_MIN.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reduceMin].
    public final float reduceMin() {
    	return reduceMin(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the maximum of X, Y and Z
    /// ```
    public static float reduceMax(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_REDUCE_MAX.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reduceMax].
    public final float reduceMax() {
    	return reduceMax(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the sum of X, Y and Z
    /// ```
    public static float reduceSum(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_REDUCE_SUM.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reduceSum].
    public final float reduceSum() {
    	return reduceSum(
    		this.segment
    	);
    }
    
    /// ```
    /// Component wise square root
    /// ```
    public static void sqrt(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_SQRT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sqrt].
    public final void sqrt(
    	Vec3 outResult
    ) {
    	sqrt(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get normalized vector that is perpendicular to this vector
    /// ```
    public static void getNormalizedPerpendicular(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_GET_NORMALIZED_PERPENDICULAR.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalizedPerpendicular].
    public final void getNormalizedPerpendicular(
    	Vec3 outResult
    ) {
    	getNormalizedPerpendicular(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get vector that contains the sign of each element (returns 1.0f if positive, -1.0f if negative)
    /// ```
    public static void getSign(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_GET_SIGN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSign].
    public final void getSign(
    	Vec3 outResult
    ) {
    	getSign(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Compress a unit vector to a 32 bit value, precision is around 10^-4
    /// ```
    public static int compressUnitVector(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_COMPRESS_UNIT_VECTOR.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#compressUnitVector].
    public final int compressUnitVector() {
    	return compressUnitVector(
    		this.segment
    	);
    }
    
    /// ```
    /// Decompress a unit vector from a 32 bit value
    /// ```
    public static void sDecompressUnitVector(
    	int inValue,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC3_S_DECOMPRESS_UNIT_VECTOR.get();
    	try {
    		 method.invokeExact(
    			inValue,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sDecompressUnitVector].
    public static void sDecompressUnitVector(
    	int inValue,
    	Vec3 outResult
    ) {
    	sDecompressUnitVector(
    		inValue,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Internal helper function that checks that W is equal to Z, so e.g. dividing by it should not generate div by 0
    /// ```
    public static void checkW(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC3_CHECK_W.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#checkW].
    public final void checkW() {
    	checkW(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}