/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DVec3 {

	private static final LazyConstant<MethodHandle> JPH_DVEC3_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_CREATE5;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_CREATE6;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_GET_TRUE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_GET_FALSE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_ZERO;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_ONE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_AXIS_X;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_AXIS_Y;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_AXIS_Z;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_REPLICATE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_NA_N;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_LOAD_DOUBLE3_UNSAFE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_STORE_DOUBLE3;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_PREPARE_ROUND_TO_ZERO;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_PREPARE_ROUND_TO_INF;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_TO_VEC3_ROUND_DOWN;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_TO_VEC3_ROUND_UP;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_MIN;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_MAX;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_CLAMP;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_EQUALS;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_LESS;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_LESS_OR_EQUAL;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_GREATER;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_GREATER_OR_EQUAL;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_FUSED_MULTIPLY_ADD;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_SELECT;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_OR;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_XOR;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_S_AND;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_GET_TRUES;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_TEST_ANY_TRUE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_TEST_ALL_TRUE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_GET_X;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_GET_Y;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_GET_Z;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_SET_X;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_SET_Y;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_SET_Z;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_SET;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_SET_COMPONENT;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_IS_CLOSE;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_IS_NEAR_ZERO;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_IS_NORMALIZED;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_IS_NA_N;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_ABS;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_RECIPROCAL;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_CROSS;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_DOT;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_LENGTH_SQ;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_NORMALIZED;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_SQRT;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_GET_SIGN;
	private static final LazyConstant<MethodHandle> JPH_DVEC3_CHECK_W;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DVEC3_CREATE = downcallHandle("JPH_DVec3_Create", UNBOUNDED_ADDRESS);
		JPH_DVEC3_CREATE1 = downcallHandle("JPH_DVec3_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_CREATE2 = downcallHandle("JPH_DVec3_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_CREATE3 = downcallHandle("JPH_DVec3_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_CREATE5 = downcallHandle("JPH_DVec3_Create5", UNBOUNDED_ADDRESS, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		JPH_DVEC3_CREATE6 = downcallHandle("JPH_DVec3_Create6", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_DESTROY = downcallHandleVoid("JPH_DVec3_Destroy", UNBOUNDED_ADDRESS);
		JPH_DVEC3_GET_TRUE = downcallHandle("JPH_DVec3_GetTrue", JAVA_DOUBLE);
		JPH_DVEC3_GET_FALSE = downcallHandle("JPH_DVec3_GetFalse", JAVA_DOUBLE);
		JPH_DVEC3_S_ZERO = downcallHandleVoid("JPH_DVec3_sZero", UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_ONE = downcallHandleVoid("JPH_DVec3_sOne", UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_AXIS_X = downcallHandleVoid("JPH_DVec3_sAxisX", UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_AXIS_Y = downcallHandleVoid("JPH_DVec3_sAxisY", UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_AXIS_Z = downcallHandleVoid("JPH_DVec3_sAxisZ", UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_REPLICATE = downcallHandleVoid("JPH_DVec3_sReplicate", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_NA_N = downcallHandleVoid("JPH_DVec3_sNaN", UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_LOAD_DOUBLE3_UNSAFE = downcallHandleVoid("JPH_DVec3_sLoadDouble3Unsafe", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_STORE_DOUBLE3 = downcallHandleVoid("JPH_DVec3_StoreDouble3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_PREPARE_ROUND_TO_ZERO = downcallHandleVoid("JPH_DVec3_PrepareRoundToZero", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_PREPARE_ROUND_TO_INF = downcallHandleVoid("JPH_DVec3_PrepareRoundToInf", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_TO_VEC3_ROUND_DOWN = downcallHandleVoid("JPH_DVec3_ToVec3RoundDown", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_TO_VEC3_ROUND_UP = downcallHandleVoid("JPH_DVec3_ToVec3RoundUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_MIN = downcallHandleVoid("JPH_DVec3_sMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_MAX = downcallHandleVoid("JPH_DVec3_sMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_CLAMP = downcallHandleVoid("JPH_DVec3_sClamp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_EQUALS = downcallHandleVoid("JPH_DVec3_sEquals", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_LESS = downcallHandleVoid("JPH_DVec3_sLess", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_LESS_OR_EQUAL = downcallHandleVoid("JPH_DVec3_sLessOrEqual", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_GREATER = downcallHandleVoid("JPH_DVec3_sGreater", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_GREATER_OR_EQUAL = downcallHandleVoid("JPH_DVec3_sGreaterOrEqual", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_FUSED_MULTIPLY_ADD = downcallHandleVoid("JPH_DVec3_sFusedMultiplyAdd", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_SELECT = downcallHandleVoid("JPH_DVec3_sSelect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_OR = downcallHandleVoid("JPH_DVec3_sOr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_XOR = downcallHandleVoid("JPH_DVec3_sXor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_S_AND = downcallHandleVoid("JPH_DVec3_sAnd", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_GET_TRUES = downcallHandle("JPH_DVec3_GetTrues", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DVEC3_TEST_ANY_TRUE = downcallHandle("JPH_DVec3_TestAnyTrue", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_DVEC3_TEST_ALL_TRUE = downcallHandle("JPH_DVec3_TestAllTrue", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_DVEC3_GET_X = downcallHandle("JPH_DVec3_GetX", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DVEC3_GET_Y = downcallHandle("JPH_DVec3_GetY", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DVEC3_GET_Z = downcallHandle("JPH_DVec3_GetZ", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DVEC3_SET_X = downcallHandleVoid("JPH_DVec3_SetX", UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		JPH_DVEC3_SET_Y = downcallHandleVoid("JPH_DVec3_SetY", UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		JPH_DVEC3_SET_Z = downcallHandleVoid("JPH_DVec3_SetZ", UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		JPH_DVEC3_SET = downcallHandleVoid("JPH_DVec3_Set", UNBOUNDED_ADDRESS, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		JPH_DVEC3_SET_COMPONENT = downcallHandleVoid("JPH_DVec3_SetComponent", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_DOUBLE);
		JPH_DVEC3_IS_CLOSE = downcallHandle("JPH_DVec3_IsClose", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		JPH_DVEC3_IS_NEAR_ZERO = downcallHandle("JPH_DVec3_IsNearZero", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		JPH_DVEC3_IS_NORMALIZED = downcallHandle("JPH_DVec3_IsNormalized", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
		JPH_DVEC3_IS_NA_N = downcallHandle("JPH_DVec3_IsNaN", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_DVEC3_ABS = downcallHandleVoid("JPH_DVec3_Abs", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_RECIPROCAL = downcallHandleVoid("JPH_DVec3_Reciprocal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_CROSS = downcallHandleVoid("JPH_DVec3_Cross", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_DOT = downcallHandle("JPH_DVec3_Dot", JAVA_DOUBLE, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_LENGTH_SQ = downcallHandle("JPH_DVec3_LengthSq", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DVEC3_LENGTH = downcallHandle("JPH_DVec3_Length", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		JPH_DVEC3_NORMALIZED = downcallHandleVoid("JPH_DVec3_Normalized", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_SQRT = downcallHandleVoid("JPH_DVec3_Sqrt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_GET_SIGN = downcallHandleVoid("JPH_DVec3_GetSign", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DVEC3_CHECK_W = downcallHandleVoid("JPH_DVec3_CheckW", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DVec3() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public DVec3(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DVec3(
	    DVec3 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public DVec3(
		Arena arena,
		DVec3 inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DVec3(
	    Vec3 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create2].
	public DVec3(
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

	public DVec3(
	    Vec4 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create3].
	public DVec3(
		Arena arena,
		Vec4 inRHS
	) {
		MemorySegment segment = create3(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DVec3(
	    double inX,
	    double inY,
	    double inZ
	) {
	    this(
	        Arena.ofAuto(),
	        inX,
	        inY,
	        inZ
	    );
	}
	
	/// Typed method of [#create5].
	public DVec3(
		Arena arena,
		double inX,
		double inY,
		double inZ
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

	public DVec3(
	    Double3 inV
	) {
	    this(
	        Arena.ofAuto(),
	        inV
	    );
	}
	
	/// Typed method of [#create6].
	public DVec3(
		Arena arena,
		Double3 inV
	) {
		MemorySegment segment = create6(
			inV.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DVec3(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_DVEC3_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_DVEC3_CREATE1.get();
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
    	MethodHandle method = JPH_DVEC3_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_DVEC3_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a vector from 3 components
    /// ```
    public static MemorySegment create5(
    	double inX,
    	double inY,
    	double inZ
    ) {
    	MethodHandle method = JPH_DVEC3_CREATE5.get();
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
    
    /// ```
    /// Load 3 doubles from memory
    /// ```
    public static MemorySegment create6(
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_DVEC3_CREATE6.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Representations of true and false for boolean operations
    /// ```
    public static double getTrue() {
    	MethodHandle method = JPH_DVEC3_GET_TRUE.get();
    	try {
    		return (double) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static double getFalse() {
    	MethodHandle method = JPH_DVEC3_GET_FALSE.get();
    	try {
    		return (double) method.invokeExact();
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
    	MethodHandle method = JPH_DVEC3_S_ZERO.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sZero].
    public final void sZero(
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_ONE.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sOne].
    public final void sOne(
    	DVec3 outResult
    ) {
    	sOne(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vectors with the principal axis
    /// ```
    public static void sAxisX(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_S_AXIS_X.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sAxisX].
    public final void sAxisX(
    	DVec3 outResult
    ) {
    	sAxisX(
    		outResult.memorySegment()
    	);
    }
    
    public static void sAxisY(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_S_AXIS_Y.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sAxisY].
    public final void sAxisY(
    	DVec3 outResult
    ) {
    	sAxisY(
    		outResult.memorySegment()
    	);
    }
    
    public static void sAxisZ(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_S_AXIS_Z.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sAxisZ].
    public final void sAxisZ(
    	DVec3 outResult
    ) {
    	sAxisZ(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate inV across all components
    /// ```
    public static void sReplicate(
    	double inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_S_REPLICATE.get();
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
    public final void sReplicate(
    	double inV,
    	DVec3 outResult
    ) {
    	sReplicate(
    		inV,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vector with all NaN's
    /// ```
    public static void sNaN(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_S_NA_N.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sNaN].
    public final void sNaN(
    	DVec3 outResult
    ) {
    	sNaN(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 3 doubles from memory (reads 64 bits extra which it doesn't use)
    /// ```
    public static void sLoadDouble3Unsafe(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_S_LOAD_DOUBLE3_UNSAFE.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadDouble3Unsafe].
    public final void sLoadDouble3Unsafe(
    	Double3 inV,
    	DVec3 outResult
    ) {
    	sLoadDouble3Unsafe(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Store 3 doubles to memory
    /// ```
    public static void storeDouble3(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_DVEC3_STORE_DOUBLE3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#storeDouble3].
    public final void storeDouble3(
    	Double3 outV
    ) {
    	storeDouble3(
    		this.segment,
    		outV.memorySegment()
    	);
    }
    
    /// ```
    /// Prepare to convert to float vector 3 rounding towards zero (returns DVec3 that can be converted to a Vec3 to get the rounding)
    /// ```
    public static void prepareRoundToZero(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_PREPARE_ROUND_TO_ZERO.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#prepareRoundToZero].
    public final void prepareRoundToZero(
    	DVec3 outResult
    ) {
    	prepareRoundToZero(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Prepare to convert to float vector 3 rounding towards positive/negative inf (returns DVec3 that can be converted to a Vec3 to get the rounding)
    /// ```
    public static void prepareRoundToInf(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_PREPARE_ROUND_TO_INF.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#prepareRoundToInf].
    public final void prepareRoundToInf(
    	DVec3 outResult
    ) {
    	prepareRoundToInf(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Convert to float vector 3 rounding down
    /// ```
    public static void toVec3RoundDown(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_TO_VEC3_ROUND_DOWN.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#toVec3RoundDown].
    public final void toVec3RoundDown(
    	Vec3 outResult
    ) {
    	toVec3RoundDown(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Convert to float vector 3 rounding up
    /// ```
    public static void toVec3RoundUp(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_TO_VEC3_ROUND_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#toVec3RoundUp].
    public final void toVec3RoundUp(
    	Vec3 outResult
    ) {
    	toVec3RoundUp(
    		this.segment,
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
    	MethodHandle method = JPH_DVEC3_S_MIN.get();
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
    public final void sMin(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_MAX.get();
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
    public final void sMax(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_CLAMP.get();
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
    public final void sClamp(
    	DVec3 inV,
    	DVec3 inMin,
    	DVec3 inMax,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_EQUALS.get();
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
    public final void sEquals(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_LESS.get();
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
    public final void sLess(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_LESS_OR_EQUAL.get();
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
    public final void sLessOrEqual(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_GREATER.get();
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
    public final void sGreater(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_GREATER_OR_EQUAL.get();
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
    public final void sGreaterOrEqual(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_FUSED_MULTIPLY_ADD.get();
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
    public final void sFusedMultiplyAdd(
    	DVec3 inMul1,
    	DVec3 inMul2,
    	DVec3 inAdd,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_SELECT.get();
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
    public final void sSelect(
    	DVec3 inNotSet,
    	DVec3 inSet,
    	DVec3 inControl,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_OR.get();
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
    public final void sOr(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_XOR.get();
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
    public final void sXor(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_S_AND.get();
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
    public final void sAnd(
    	DVec3 inV1,
    	DVec3 inV2,
    	DVec3 outResult
    ) {
    	sAnd(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Store if X is true in bit 0, Y in bit 1, Z in bit 2 and W in bit 3 (true is when highest bit of component is set)
    /// ```
    public static int getTrues(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_GET_TRUES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTrues].
    public final int getTrues() {
    	return getTrues(
    		this.segment
    	);
    }
    
    /// ```
    /// Test if any of the components are true (true is when highest bit of component is set)
    /// ```
    public static boolean testAnyTrue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_TEST_ANY_TRUE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#testAnyTrue].
    public final boolean testAnyTrue() {
    	return testAnyTrue(
    		this.segment
    	);
    }
    
    /// ```
    /// Test if all components are true (true is when highest bit of component is set)
    /// ```
    public static boolean testAllTrue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_TEST_ALL_TRUE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#testAllTrue].
    public final boolean testAllTrue() {
    	return testAllTrue(
    		this.segment
    	);
    }
    
    public static double getX(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_GET_X.get();
    	try {
    		return (double) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getX].
    public final double getX() {
    	return getX(
    		this.segment
    	);
    }
    
    public static double getY(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_GET_Y.get();
    	try {
    		return (double) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getY].
    public final double getY() {
    	return getY(
    		this.segment
    	);
    }
    
    public static double getZ(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_GET_Z.get();
    	try {
    		return (double) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getZ].
    public final double getZ() {
    	return getZ(
    		this.segment
    	);
    }
    
    /// ```
    /// Set individual components
    /// ```
    public static void setX(
    	MemorySegment self,
    	double inX
    ) {
    	MethodHandle method = JPH_DVEC3_SET_X.get();
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
    	double inX
    ) {
    	setX(
    		this.segment,
    		inX
    	);
    }
    
    public static void setY(
    	MemorySegment self,
    	double inY
    ) {
    	MethodHandle method = JPH_DVEC3_SET_Y.get();
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
    	double inY
    ) {
    	setY(
    		this.segment,
    		inY
    	);
    }
    
    public static void setZ(
    	MemorySegment self,
    	double inZ
    ) {
    	MethodHandle method = JPH_DVEC3_SET_Z.get();
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
    	double inZ
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
    	double inX,
    	double inY,
    	double inZ
    ) {
    	MethodHandle method = JPH_DVEC3_SET.get();
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
    	double inX,
    	double inY,
    	double inZ
    ) {
    	set(
    		this.segment,
    		inX,
    		inY,
    		inZ
    	);
    }
    
    /// ```
    /// Set double component by index
    /// ```
    public static void setComponent(
    	MemorySegment self,
    	int inCoordinate,
    	double inValue
    ) {
    	MethodHandle method = JPH_DVEC3_SET_COMPONENT.get();
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
    	double inValue
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
    	double inMaxDistSq
    ) {
    	MethodHandle method = JPH_DVEC3_IS_CLOSE.get();
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
    	DVec3 inV2,
    	double inMaxDistSq
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
    	double inMaxDistSq
    ) {
    	MethodHandle method = JPH_DVEC3_IS_NEAR_ZERO.get();
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
    	double inMaxDistSq
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
    	double inTolerance
    ) {
    	MethodHandle method = JPH_DVEC3_IS_NORMALIZED.get();
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
    	double inTolerance
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
    	MethodHandle method = JPH_DVEC3_IS_NA_N.get();
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
    /// Return the absolute value of each of the components
    /// ```
    public static void abs(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_ABS.get();
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
    	DVec3 outResult
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
    	MethodHandle method = JPH_DVEC3_RECIPROCAL.get();
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
    	DVec3 outResult
    ) {
    	reciprocal(
    		this.segment,
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
    	MethodHandle method = JPH_DVEC3_CROSS.get();
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
    	DVec3 inV2,
    	DVec3 outResult
    ) {
    	cross(
    		this.segment,
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Dot product
    /// ```
    public static double dot(
    	MemorySegment self,
    	MemorySegment inV2
    ) {
    	MethodHandle method = JPH_DVEC3_DOT.get();
    	try {
    		return (double) method.invokeExact(
    			self,
    			inV2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dot].
    public final double dot(
    	DVec3 inV2
    ) {
    	return dot(
    		this.segment,
    		inV2.memorySegment()
    	);
    }
    
    /// ```
    /// Squared length of vector
    /// ```
    public static double lengthSq(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_LENGTH_SQ.get();
    	try {
    		return (double) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lengthSq].
    public final double lengthSq() {
    	return lengthSq(
    		this.segment
    	);
    }
    
    /// ```
    /// Length of vector
    /// ```
    public static double length(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_LENGTH.get();
    	try {
    		return (double) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#length].
    public final double length() {
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
    	MethodHandle method = JPH_DVEC3_NORMALIZED.get();
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
    	DVec3 outResult
    ) {
    	normalized(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Component wise square root
    /// ```
    public static void sqrt(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_SQRT.get();
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
    	DVec3 outResult
    ) {
    	sqrt(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get vector that contains the sign of each element (returns 1 if positive, -1 if negative)
    /// ```
    public static void getSign(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DVEC3_GET_SIGN.get();
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
    	DVec3 outResult
    ) {
    	getSign(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Internal helper function that checks that W is equal to Z, so e.g. dividing by it should not generate div by 0
    /// ```
    public static void checkW(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DVEC3_CHECK_W.get();
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