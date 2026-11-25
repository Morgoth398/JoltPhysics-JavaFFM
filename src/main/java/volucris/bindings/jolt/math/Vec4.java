/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Vec4 {

	private static final LazyConstant<MethodHandle> JPH_VEC4_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEC4_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_VEC4_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_VEC4_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_VEC4_CREATE5;
	private static final LazyConstant<MethodHandle> JPH_VEC4_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_ZERO;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_ONE;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_NA_N;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_REPLICATE;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_LOAD_FLOAT4;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_LOAD_FLOAT4_ALIGNED;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_MIN;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_MAX;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_CLAMP;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_EQUALS;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_LESS;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_LESS_OR_EQUAL;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_GREATER;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_GREATER_OR_EQUAL;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_FUSED_MULTIPLY_ADD;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_SELECT;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_OR;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_XOR;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_AND;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_SORT4;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_SORT4_REVERSE;
	private static final LazyConstant<MethodHandle> JPH_VEC4_GET_X;
	private static final LazyConstant<MethodHandle> JPH_VEC4_GET_Y;
	private static final LazyConstant<MethodHandle> JPH_VEC4_GET_Z;
	private static final LazyConstant<MethodHandle> JPH_VEC4_GET_W;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SET_X;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SET_Y;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SET_Z;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SET_W;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SET;
	private static final LazyConstant<MethodHandle> JPH_VEC4_IS_CLOSE;
	private static final LazyConstant<MethodHandle> JPH_VEC4_IS_NEAR_ZERO;
	private static final LazyConstant<MethodHandle> JPH_VEC4_IS_NORMALIZED;
	private static final LazyConstant<MethodHandle> JPH_VEC4_IS_NA_N;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SPLAT_X;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SPLAT_Y;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SPLAT_Z;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SPLAT_W;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SPLAT_X3;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SPLAT_Y3;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SPLAT_Z3;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SPLAT_W3;
	private static final LazyConstant<MethodHandle> JPH_VEC4_GET_LOWEST_COMPONENT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_VEC4_GET_HIGHEST_COMPONENT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_VEC4_ABS;
	private static final LazyConstant<MethodHandle> JPH_VEC4_RECIPROCAL;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_DIFFERENCE_OF_PRODUCTS;
	private static final LazyConstant<MethodHandle> JPH_VEC4_DOT_V;
	private static final LazyConstant<MethodHandle> JPH_VEC4_DOT;
	private static final LazyConstant<MethodHandle> JPH_VEC4_LENGTH_SQ;
	private static final LazyConstant<MethodHandle> JPH_VEC4_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_VEC4_NORMALIZED;
	private static final LazyConstant<MethodHandle> JPH_VEC4_STORE_FLOAT4;
	private static final LazyConstant<MethodHandle> JPH_VEC4_TO_INT;
	private static final LazyConstant<MethodHandle> JPH_VEC4_REINTERPRET_AS_INT;
	private static final LazyConstant<MethodHandle> JPH_VEC4_GET_SIGN_BITS;
	private static final LazyConstant<MethodHandle> JPH_VEC4_REDUCE_MIN;
	private static final LazyConstant<MethodHandle> JPH_VEC4_REDUCE_MAX;
	private static final LazyConstant<MethodHandle> JPH_VEC4_REDUCE_SUM;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SQRT;
	private static final LazyConstant<MethodHandle> JPH_VEC4_GET_SIGN;
	private static final LazyConstant<MethodHandle> JPH_VEC4_SIN_COS;
	private static final LazyConstant<MethodHandle> JPH_VEC4_TAN;
	private static final LazyConstant<MethodHandle> JPH_VEC4_ASIN;
	private static final LazyConstant<MethodHandle> JPH_VEC4_ACOS;
	private static final LazyConstant<MethodHandle> JPH_VEC4_ATAN;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_ATAN2;
	private static final LazyConstant<MethodHandle> JPH_VEC4_COMPRESS_UNIT_VECTOR;
	private static final LazyConstant<MethodHandle> JPH_VEC4_S_DECOMPRESS_UNIT_VECTOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEC4_CREATE = downcallHandle("JPH_Vec4_Create", UNBOUNDED_ADDRESS);
		JPH_VEC4_CREATE1 = downcallHandle("JPH_Vec4_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_CREATE2 = downcallHandle("JPH_Vec4_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_CREATE3 = downcallHandle("JPH_Vec4_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC4_CREATE5 = downcallHandle("JPH_Vec4_Create5", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_VEC4_DESTROY = downcallHandleVoid("JPH_Vec4_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEC4_S_ZERO = downcallHandleVoid("JPH_Vec4_sZero", UNBOUNDED_ADDRESS);
		JPH_VEC4_S_ONE = downcallHandleVoid("JPH_Vec4_sOne", UNBOUNDED_ADDRESS);
		JPH_VEC4_S_NA_N = downcallHandleVoid("JPH_Vec4_sNaN", UNBOUNDED_ADDRESS);
		JPH_VEC4_S_REPLICATE = downcallHandleVoid("JPH_Vec4_sReplicate", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_LOAD_FLOAT4 = downcallHandleVoid("JPH_Vec4_sLoadFloat4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_LOAD_FLOAT4_ALIGNED = downcallHandleVoid("JPH_Vec4_sLoadFloat4Aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_MIN = downcallHandleVoid("JPH_Vec4_sMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_MAX = downcallHandleVoid("JPH_Vec4_sMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_CLAMP = downcallHandleVoid("JPH_Vec4_sClamp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_EQUALS = downcallHandleVoid("JPH_Vec4_sEquals", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_LESS = downcallHandleVoid("JPH_Vec4_sLess", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_LESS_OR_EQUAL = downcallHandleVoid("JPH_Vec4_sLessOrEqual", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_GREATER = downcallHandleVoid("JPH_Vec4_sGreater", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_GREATER_OR_EQUAL = downcallHandleVoid("JPH_Vec4_sGreaterOrEqual", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_FUSED_MULTIPLY_ADD = downcallHandleVoid("JPH_Vec4_sFusedMultiplyAdd", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_SELECT = downcallHandleVoid("JPH_Vec4_sSelect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_OR = downcallHandleVoid("JPH_Vec4_sOr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_XOR = downcallHandleVoid("JPH_Vec4_sXor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_AND = downcallHandleVoid("JPH_Vec4_sAnd", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_SORT4 = downcallHandleVoid("JPH_Vec4_sSort4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_SORT4_REVERSE = downcallHandleVoid("JPH_Vec4_sSort4Reverse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_GET_X = downcallHandle("JPH_Vec4_GetX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_GET_Y = downcallHandle("JPH_Vec4_GetY", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_GET_Z = downcallHandle("JPH_Vec4_GetZ", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_GET_W = downcallHandle("JPH_Vec4_GetW", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_SET_X = downcallHandleVoid("JPH_Vec4_SetX", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC4_SET_Y = downcallHandleVoid("JPH_Vec4_SetY", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC4_SET_Z = downcallHandleVoid("JPH_Vec4_SetZ", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC4_SET_W = downcallHandleVoid("JPH_Vec4_SetW", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC4_SET = downcallHandleVoid("JPH_Vec4_Set", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_VEC4_IS_CLOSE = downcallHandle("JPH_Vec4_IsClose", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC4_IS_NEAR_ZERO = downcallHandle("JPH_Vec4_IsNearZero", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC4_IS_NORMALIZED = downcallHandle("JPH_Vec4_IsNormalized", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEC4_IS_NA_N = downcallHandle("JPH_Vec4_IsNaN", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_VEC4_SPLAT_X = downcallHandleVoid("JPH_Vec4_SplatX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_SPLAT_Y = downcallHandleVoid("JPH_Vec4_SplatY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_SPLAT_Z = downcallHandleVoid("JPH_Vec4_SplatZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_SPLAT_W = downcallHandleVoid("JPH_Vec4_SplatW", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_SPLAT_X3 = downcallHandleVoid("JPH_Vec4_SplatX3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_SPLAT_Y3 = downcallHandleVoid("JPH_Vec4_SplatY3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_SPLAT_Z3 = downcallHandleVoid("JPH_Vec4_SplatZ3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_SPLAT_W3 = downcallHandleVoid("JPH_Vec4_SplatW3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_GET_LOWEST_COMPONENT_INDEX = downcallHandle("JPH_Vec4_GetLowestComponentIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEC4_GET_HIGHEST_COMPONENT_INDEX = downcallHandle("JPH_Vec4_GetHighestComponentIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEC4_ABS = downcallHandleVoid("JPH_Vec4_Abs", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_RECIPROCAL = downcallHandleVoid("JPH_Vec4_Reciprocal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_DIFFERENCE_OF_PRODUCTS = downcallHandleVoid("JPH_Vec4_sDifferenceOfProducts", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_DOT_V = downcallHandleVoid("JPH_Vec4_DotV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_DOT = downcallHandle("JPH_Vec4_Dot", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_LENGTH_SQ = downcallHandle("JPH_Vec4_LengthSq", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_LENGTH = downcallHandle("JPH_Vec4_Length", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_NORMALIZED = downcallHandleVoid("JPH_Vec4_Normalized", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_STORE_FLOAT4 = downcallHandleVoid("JPH_Vec4_StoreFloat4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_TO_INT = downcallHandleVoid("JPH_Vec4_ToInt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_REINTERPRET_AS_INT = downcallHandleVoid("JPH_Vec4_ReinterpretAsInt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_GET_SIGN_BITS = downcallHandle("JPH_Vec4_GetSignBits", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEC4_REDUCE_MIN = downcallHandle("JPH_Vec4_ReduceMin", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_REDUCE_MAX = downcallHandle("JPH_Vec4_ReduceMax", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_REDUCE_SUM = downcallHandle("JPH_Vec4_ReduceSum", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEC4_SQRT = downcallHandleVoid("JPH_Vec4_Sqrt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_GET_SIGN = downcallHandleVoid("JPH_Vec4_GetSign", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_SIN_COS = downcallHandleVoid("JPH_Vec4_SinCos", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_TAN = downcallHandleVoid("JPH_Vec4_Tan", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_ASIN = downcallHandleVoid("JPH_Vec4_ASin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_ACOS = downcallHandleVoid("JPH_Vec4_ACos", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_ATAN = downcallHandleVoid("JPH_Vec4_ATan", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_ATAN2 = downcallHandleVoid("JPH_Vec4_sATan2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEC4_COMPRESS_UNIT_VECTOR = downcallHandle("JPH_Vec4_CompressUnitVector", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEC4_S_DECOMPRESS_UNIT_VECTOR = downcallHandleVoid("JPH_Vec4_sDecompressUnitVector", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Vec4() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Vec4(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec4(
	    Vec4 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public Vec4(
		Arena arena,
		Vec4 inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec4(
	    Vec3 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create2].
	public Vec4(
		Arena arena,
		Vec3 inRHS
	) {
		MemorySegment segment = create2(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec4(
	    Vec3 inRHS,
	    float inW
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS,
	        inW
	    );
	}
	
	/// Typed method of [#create3].
	public Vec4(
		Arena arena,
		Vec3 inRHS,
		float inW
	) {
		MemorySegment segment = create3(
			inRHS.memorySegment(),
			inW
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec4(
	    float inX,
	    float inY,
	    float inZ,
	    float inW
	) {
	    this(
	        Arena.ofAuto(),
	        inX,
	        inY,
	        inZ,
	        inW
	    );
	}
	
	/// Typed method of [#create5].
	public Vec4(
		Arena arena,
		float inX,
		float inY,
		float inZ,
		float inW
	) {
		MemorySegment segment = create5(
			inX,
			inY,
			inZ,
			inW
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vec4(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_VEC4_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_VEC4_CREATE1.get();
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
    	MethodHandle method = JPH_VEC4_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	MemorySegment inRHS,
    	float inW
    ) {
    	MethodHandle method = JPH_VEC4_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS,
    			inW
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a vector from 4 components
    /// ```
    public static MemorySegment create5(
    	float inX,
    	float inY,
    	float inZ,
    	float inW
    ) {
    	MethodHandle method = JPH_VEC4_CREATE5.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inX,
    			inY,
    			inZ,
    			inW
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC4_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Vector with all zeros
    /// ```
    public static void sZero(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_S_ZERO.get();
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
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_ONE.get();
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
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_NA_N.get();
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
    	Vec4 outResult
    ) {
    	sNaN(
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
    	MethodHandle method = JPH_VEC4_S_REPLICATE.get();
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
    	Vec4 outResult
    ) {
    	sReplicate(
    		inV,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 4 floats from memory
    /// ```
    public static void sLoadFloat4(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_S_LOAD_FLOAT4.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadFloat4].
    public static void sLoadFloat4(
    	Float4 inV,
    	Vec4 outResult
    ) {
    	sLoadFloat4(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 4 floats from memory, 16 bytes aligned
    /// ```
    public static void sLoadFloat4Aligned(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_S_LOAD_FLOAT4_ALIGNED.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadFloat4Aligned].
    public static void sLoadFloat4Aligned(
    	Float4 inV,
    	Vec4 outResult
    ) {
    	sLoadFloat4Aligned(
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
    	MethodHandle method = JPH_VEC4_S_MIN.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_MAX.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_CLAMP.get();
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
    	Vec4 inV,
    	Vec4 inMin,
    	Vec4 inMax,
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_EQUALS.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
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
    	MethodHandle method = JPH_VEC4_S_LESS.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
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
    	MethodHandle method = JPH_VEC4_S_LESS_OR_EQUAL.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
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
    	MethodHandle method = JPH_VEC4_S_GREATER.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
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
    	MethodHandle method = JPH_VEC4_S_GREATER_OR_EQUAL.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
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
    	MethodHandle method = JPH_VEC4_S_FUSED_MULTIPLY_ADD.get();
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
    	Vec4 inMul1,
    	Vec4 inMul2,
    	Vec4 inAdd,
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_SELECT.get();
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
    	Vec4 inNotSet,
    	Vec4 inSet,
    	UVec4 inControl,
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_OR.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_XOR.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_AND.get();
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
    	Vec4 inV1,
    	Vec4 inV2,
    	Vec4 outResult
    ) {
    	sAnd(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sort the four elements of ioValue and sort ioIndex at the same time.
    /// Based on a sorting network: http://en.wikipedia.org/wiki/Sorting_network
    /// ```
    public static void sSort4(
    	MemorySegment ioValue,
    	MemorySegment ioIndex
    ) {
    	MethodHandle method = JPH_VEC4_S_SORT4.get();
    	try {
    		 method.invokeExact(
    			ioValue,
    			ioIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sSort4].
    public static void sSort4(
    	Vec4 ioValue,
    	UVec4 ioIndex
    ) {
    	sSort4(
    		ioValue.memorySegment(),
    		ioIndex.memorySegment()
    	);
    }
    
    /// ```
    /// Reverse sort the four elements of ioValue (highest first) and sort ioIndex at the same time.
    /// Based on a sorting network: http://en.wikipedia.org/wiki/Sorting_network
    /// ```
    public static void sSort4Reverse(
    	MemorySegment ioValue,
    	MemorySegment ioIndex
    ) {
    	MethodHandle method = JPH_VEC4_S_SORT4_REVERSE.get();
    	try {
    		 method.invokeExact(
    			ioValue,
    			ioIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sSort4Reverse].
    public static void sSort4Reverse(
    	Vec4 ioValue,
    	UVec4 ioIndex
    ) {
    	sSort4Reverse(
    		ioValue.memorySegment(),
    		ioIndex.memorySegment()
    	);
    }
    
    public static float getX(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC4_GET_X.get();
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
    	MethodHandle method = JPH_VEC4_GET_Y.get();
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
    	MethodHandle method = JPH_VEC4_GET_Z.get();
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
    
    public static float getW(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC4_GET_W.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getW].
    public final float getW() {
    	return getW(
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
    	MethodHandle method = JPH_VEC4_SET_X.get();
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
    	MethodHandle method = JPH_VEC4_SET_Y.get();
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
    	MethodHandle method = JPH_VEC4_SET_Z.get();
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
    
    public static void setW(
    	MemorySegment self,
    	float inW
    ) {
    	MethodHandle method = JPH_VEC4_SET_W.get();
    	try {
    		 method.invokeExact(
    			self,
    			inW
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setW].
    public final void setW(
    	float inW
    ) {
    	setW(
    		this.segment,
    		inW
    	);
    }
    
    /// ```
    /// Set all components
    /// ```
    public static void set(
    	MemorySegment self,
    	float inX,
    	float inY,
    	float inZ,
    	float inW
    ) {
    	MethodHandle method = JPH_VEC4_SET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inX,
    			inY,
    			inZ,
    			inW
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#set].
    public final void set(
    	float inX,
    	float inY,
    	float inZ,
    	float inW
    ) {
    	set(
    		this.segment,
    		inX,
    		inY,
    		inZ,
    		inW
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
    	MethodHandle method = JPH_VEC4_IS_CLOSE.get();
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
    	Vec4 inV2,
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
    	MethodHandle method = JPH_VEC4_IS_NEAR_ZERO.get();
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
    	MethodHandle method = JPH_VEC4_IS_NORMALIZED.get();
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
    	MethodHandle method = JPH_VEC4_IS_NA_N.get();
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
    	MethodHandle method = JPH_VEC4_SPLAT_X.get();
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
    	MethodHandle method = JPH_VEC4_SPLAT_Y.get();
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
    	MethodHandle method = JPH_VEC4_SPLAT_Z.get();
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
    /// Replicate the W component to all components
    /// ```
    public static void splatW(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_SPLAT_W.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#splatW].
    public final void splatW(
    	Vec4 outResult
    ) {
    	splatW(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate the X component to all components
    /// ```
    public static void splatX3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_SPLAT_X3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#splatX3].
    public final void splatX3(
    	Vec3 outResult
    ) {
    	splatX3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate the Y component to all components
    /// ```
    public static void splatY3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_SPLAT_Y3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#splatY3].
    public final void splatY3(
    	Vec3 outResult
    ) {
    	splatY3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate the Z component to all components
    /// ```
    public static void splatZ3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_SPLAT_Z3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#splatZ3].
    public final void splatZ3(
    	Vec3 outResult
    ) {
    	splatZ3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate the W component to all components
    /// ```
    public static void splatW3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_SPLAT_W3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#splatW3].
    public final void splatW3(
    	Vec3 outResult
    ) {
    	splatW3(
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
    	MethodHandle method = JPH_VEC4_GET_LOWEST_COMPONENT_INDEX.get();
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
    	MethodHandle method = JPH_VEC4_GET_HIGHEST_COMPONENT_INDEX.get();
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
    	MethodHandle method = JPH_VEC4_ABS.get();
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
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_RECIPROCAL.get();
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
    	Vec4 outResult
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
    	MethodHandle method = JPH_VEC4_S_DIFFERENCE_OF_PRODUCTS.get();
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
    	Vec4 inA,
    	Vec4 inB,
    	Vec4 inC,
    	Vec4 inD,
    	Vec4 outResult
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
    /// Dot product, returns the dot product in X, Y, Z and W components
    /// ```
    public static void dotV(
    	MemorySegment self,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_DOT_V.get();
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
    	Vec4 inV2,
    	Vec4 outResult
    ) {
    	dotV(
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
    	MethodHandle method = JPH_VEC4_DOT.get();
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
    	Vec4 inV2
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
    	MethodHandle method = JPH_VEC4_LENGTH_SQ.get();
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
    	MethodHandle method = JPH_VEC4_LENGTH.get();
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
    	MethodHandle method = JPH_VEC4_NORMALIZED.get();
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
    	Vec4 outResult
    ) {
    	normalized(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Store 4 floats to memory
    /// ```
    public static void storeFloat4(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_VEC4_STORE_FLOAT4.get();
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
    /// Convert each component from a float to an int
    /// ```
    public static void toInt(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_TO_INT.get();
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
    /// Reinterpret Vec4 as a UVec4 (doesn't change the bits)
    /// ```
    public static void reinterpretAsInt(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_REINTERPRET_AS_INT.get();
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
    /// Store if X is negative in bit 0, Y in bit 1, Z in bit 2 and W in bit 3
    /// ```
    public static int getSignBits(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC4_GET_SIGN_BITS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSignBits].
    public final int getSignBits() {
    	return getSignBits(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the minimum of X, Y, Z and W
    /// ```
    public static float reduceMin(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC4_REDUCE_MIN.get();
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
    /// Get the maximum of X, Y, Z and W
    /// ```
    public static float reduceMax(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC4_REDUCE_MAX.get();
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
    /// Sum X, Y, Z and W
    /// ```
    public static float reduceSum(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC4_REDUCE_SUM.get();
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
    	MethodHandle method = JPH_VEC4_SQRT.get();
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
    	Vec4 outResult
    ) {
    	sqrt(
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
    	MethodHandle method = JPH_VEC4_GET_SIGN.get();
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
    	Vec4 outResult
    ) {
    	getSign(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the sine and cosine for each element of this vector (input in radians)
    /// ```
    public static void sinCos(
    	MemorySegment self,
    	MemorySegment outSin,
    	MemorySegment outCos
    ) {
    	MethodHandle method = JPH_VEC4_SIN_COS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outSin,
    			outCos
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sinCos].
    public final void sinCos(
    	Vec4 outSin,
    	Vec4 outCos
    ) {
    	sinCos(
    		this.segment,
    		outSin.memorySegment(),
    		outCos.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the tangent for each element of this vector (input in radians)
    /// ```
    public static void tan(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_TAN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#tan].
    public final void tan(
    	Vec4 outResult
    ) {
    	tan(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the arc sine for each element of this vector (returns value in the range [-PI / 2, PI / 2])
    /// Note that all input values will be clamped to the range [-1, 1] and this function will not return NaNs like std::asin
    /// ```
    public static void aSin(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_ASIN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aSin].
    public final void aSin(
    	Vec4 outResult
    ) {
    	aSin(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the arc cosine for each element of this vector (returns value in the range [0, PI])
    /// Note that all input values will be clamped to the range [-1, 1] and this function will not return NaNs like std::acos
    /// ```
    public static void aCos(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_ACOS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aCos].
    public final void aCos(
    	Vec4 outResult
    ) {
    	aCos(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the arc tangent for each element of this vector (returns value in the range [-PI / 2, PI / 2])
    /// ```
    public static void aTan(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_ATAN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aTan].
    public final void aTan(
    	Vec4 outResult
    ) {
    	aTan(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the arc tangent of y / x using the signs of the arguments to determine the correct quadrant (returns value in the range [-PI, PI])
    /// ```
    public static void sATan2(
    	MemorySegment inY,
    	MemorySegment inX,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEC4_S_ATAN2.get();
    	try {
    		 method.invokeExact(
    			inY,
    			inX,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sATan2].
    public static void sATan2(
    	Vec4 inY,
    	Vec4 inX,
    	Vec4 outResult
    ) {
    	sATan2(
    		inY.memorySegment(),
    		inX.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Compress a unit vector to a 32 bit value, precision is around 0.5 * 10^-3
    /// ```
    public static int compressUnitVector(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEC4_COMPRESS_UNIT_VECTOR.get();
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
    	MethodHandle method = JPH_VEC4_S_DECOMPRESS_UNIT_VECTOR.get();
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
    	Vec4 outResult
    ) {
    	sDecompressUnitVector(
    		inValue,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}