/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class UVec4 {

	private static final LazyConstant<MethodHandle> JPH_UVEC4_CREATE;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_ZERO;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_REPLICATE;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_LOAD_INT;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_LOAD_INT4;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_LOAD_INT4_ALIGNED;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_MIN;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_MAX;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_EQUALS;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_SELECT;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_OR;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_XOR;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_AND;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_NOT;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_S_SORT4_TRUE;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_GET_X;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_GET_Y;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_GET_Z;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_GET_W;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SET_X;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SET_Y;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SET_Z;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SET_W;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SPLAT_X;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SPLAT_Y;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SPLAT_Z;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SPLAT_W;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_TO_FLOAT;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_REINTERPRET_AS_FLOAT;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_DOT_V;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_DOT;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_STORE_INT4;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_STORE_INT4_ALIGNED;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_TEST_ANY_TRUE;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_TEST_ANY_XYZTRUE;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_TEST_ALL_TRUE;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_TEST_ALL_XYZTRUE;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_COUNT_TRUES;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_GET_TRUES;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_EXPAND4_UINT16_LO;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_EXPAND4_UINT16_HI;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_EXPAND4_BYTE0;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_EXPAND4_BYTE4;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_EXPAND4_BYTE8;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_EXPAND4_BYTE12;
	private static final LazyConstant<MethodHandle> JPH_UVEC4_SHIFT_COMPONENTS4_MINUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_UVEC4_CREATE = downcallHandle("JPH_UVec4_Create", UNBOUNDED_ADDRESS);
		JPH_UVEC4_CREATE1 = downcallHandle("JPH_UVec4_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_CREATE3 = downcallHandle("JPH_UVec4_Create3", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_UVEC4_DESTROY = downcallHandleVoid("JPH_UVec4_Destroy", UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_ZERO = downcallHandleVoid("JPH_UVec4_sZero", UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_REPLICATE = downcallHandleVoid("JPH_UVec4_sReplicate", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_LOAD_INT = downcallHandleVoid("JPH_UVec4_sLoadInt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_LOAD_INT4 = downcallHandleVoid("JPH_UVec4_sLoadInt4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_LOAD_INT4_ALIGNED = downcallHandleVoid("JPH_UVec4_sLoadInt4Aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_MIN = downcallHandleVoid("JPH_UVec4_sMin", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_MAX = downcallHandleVoid("JPH_UVec4_sMax", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_EQUALS = downcallHandleVoid("JPH_UVec4_sEquals", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_SELECT = downcallHandleVoid("JPH_UVec4_sSelect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_OR = downcallHandleVoid("JPH_UVec4_sOr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_XOR = downcallHandleVoid("JPH_UVec4_sXor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_AND = downcallHandleVoid("JPH_UVec4_sAnd", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_NOT = downcallHandleVoid("JPH_UVec4_sNot", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_S_SORT4_TRUE = downcallHandleVoid("JPH_UVec4_sSort4True", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_GET_X = downcallHandle("JPH_UVec4_GetX", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UVEC4_GET_Y = downcallHandle("JPH_UVec4_GetY", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UVEC4_GET_Z = downcallHandle("JPH_UVec4_GetZ", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UVEC4_GET_W = downcallHandle("JPH_UVec4_GetW", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UVEC4_SET_X = downcallHandleVoid("JPH_UVec4_SetX", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_UVEC4_SET_Y = downcallHandleVoid("JPH_UVec4_SetY", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_UVEC4_SET_Z = downcallHandleVoid("JPH_UVec4_SetZ", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_UVEC4_SET_W = downcallHandleVoid("JPH_UVec4_SetW", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_UVEC4_SPLAT_X = downcallHandleVoid("JPH_UVec4_SplatX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_SPLAT_Y = downcallHandleVoid("JPH_UVec4_SplatY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_SPLAT_Z = downcallHandleVoid("JPH_UVec4_SplatZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_SPLAT_W = downcallHandleVoid("JPH_UVec4_SplatW", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_TO_FLOAT = downcallHandleVoid("JPH_UVec4_ToFloat", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_REINTERPRET_AS_FLOAT = downcallHandleVoid("JPH_UVec4_ReinterpretAsFloat", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_DOT_V = downcallHandleVoid("JPH_UVec4_DotV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_DOT = downcallHandle("JPH_UVec4_Dot", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_STORE_INT4 = downcallHandleVoid("JPH_UVec4_StoreInt4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_STORE_INT4_ALIGNED = downcallHandleVoid("JPH_UVec4_StoreInt4Aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_TEST_ANY_TRUE = downcallHandle("JPH_UVec4_TestAnyTrue", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_UVEC4_TEST_ANY_XYZTRUE = downcallHandle("JPH_UVec4_TestAnyXYZTrue", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_UVEC4_TEST_ALL_TRUE = downcallHandle("JPH_UVec4_TestAllTrue", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_UVEC4_TEST_ALL_XYZTRUE = downcallHandle("JPH_UVec4_TestAllXYZTrue", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_UVEC4_COUNT_TRUES = downcallHandle("JPH_UVec4_CountTrues", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UVEC4_GET_TRUES = downcallHandle("JPH_UVec4_GetTrues", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_UVEC4_EXPAND4_UINT16_LO = downcallHandleVoid("JPH_UVec4_Expand4Uint16Lo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_EXPAND4_UINT16_HI = downcallHandleVoid("JPH_UVec4_Expand4Uint16Hi", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_EXPAND4_BYTE0 = downcallHandleVoid("JPH_UVec4_Expand4Byte0", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_EXPAND4_BYTE4 = downcallHandleVoid("JPH_UVec4_Expand4Byte4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_EXPAND4_BYTE8 = downcallHandleVoid("JPH_UVec4_Expand4Byte8", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_EXPAND4_BYTE12 = downcallHandleVoid("JPH_UVec4_Expand4Byte12", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_UVEC4_SHIFT_COMPONENTS4_MINUS = downcallHandleVoid("JPH_UVec4_ShiftComponents4Minus", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public UVec4() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public UVec4(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public UVec4(
	    UVec4 inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public UVec4(
		Arena arena,
		UVec4 inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public UVec4(
	    int inX,
	    int inY,
	    int inZ,
	    int inW
	) {
	    this(
	        Arena.ofAuto(),
	        inX,
	        inY,
	        inZ,
	        inW
	    );
	}
	
	/// Typed method of [#create3].
	public UVec4(
		Arena arena,
		int inX,
		int inY,
		int inZ,
		int inW
	) {
		MemorySegment segment = create3(
			inX,
			inY,
			inZ,
			inW
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public UVec4(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_UVEC4_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_UVEC4_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Create a vector from 4 integer components
    /// ```
    public static MemorySegment create3(
    	int inX,
    	int inY,
    	int inZ,
    	int inW
    ) {
    	MethodHandle method = JPH_UVEC4_CREATE3.get();
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
    	MethodHandle method = JPH_UVEC4_DESTROY.get();
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
    	MethodHandle method = JPH_UVEC4_S_ZERO.get();
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
    	UVec4 outResult
    ) {
    	sZero(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Replicate int inV across all components
    /// ```
    public static void sReplicate(
    	int inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_S_REPLICATE.get();
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
    	int inV,
    	UVec4 outResult
    ) {
    	sReplicate(
    		inV,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 1 int from memory and place it in the X component, zeros Y, Z and W
    /// ```
    public static void sLoadInt(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_S_LOAD_INT.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadInt].
    public static void sLoadInt(
    	NativeIntArray inV,
    	UVec4 outResult
    ) {
    	sLoadInt(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 4 ints from memory
    /// ```
    public static void sLoadInt4(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_S_LOAD_INT4.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadInt4].
    public static void sLoadInt4(
    	NativeIntArray inV,
    	UVec4 outResult
    ) {
    	sLoadInt4(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 4 ints from memory, aligned to 16 bytes
    /// ```
    public static void sLoadInt4Aligned(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_S_LOAD_INT4_ALIGNED.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadInt4Aligned].
    public static void sLoadInt4Aligned(
    	NativeIntArray inV,
    	UVec4 outResult
    ) {
    	sLoadInt4Aligned(
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
    	MethodHandle method = JPH_UVEC4_S_MIN.get();
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
    	UVec4 inV1,
    	UVec4 inV2,
    	UVec4 outResult
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
    	MethodHandle method = JPH_UVEC4_S_MAX.get();
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
    	UVec4 inV1,
    	UVec4 inV2,
    	UVec4 outResult
    ) {
    	sMax(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
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
    	MethodHandle method = JPH_UVEC4_S_EQUALS.get();
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
    	UVec4 inV1,
    	UVec4 inV2,
    	UVec4 outResult
    ) {
    	sEquals(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
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
    	MethodHandle method = JPH_UVEC4_S_SELECT.get();
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
    	UVec4 inNotSet,
    	UVec4 inSet,
    	UVec4 inControl,
    	UVec4 outResult
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
    	MethodHandle method = JPH_UVEC4_S_OR.get();
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
    	UVec4 inV1,
    	UVec4 inV2,
    	UVec4 outResult
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
    	MethodHandle method = JPH_UVEC4_S_XOR.get();
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
    	UVec4 inV1,
    	UVec4 inV2,
    	UVec4 outResult
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
    	MethodHandle method = JPH_UVEC4_S_AND.get();
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
    	UVec4 inV1,
    	UVec4 inV2,
    	UVec4 outResult
    ) {
    	sAnd(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Logical not (component wise)
    /// ```
    public static void sNot(
    	MemorySegment inV1,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_S_NOT.get();
    	try {
    		 method.invokeExact(
    			inV1,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sNot].
    public static void sNot(
    	UVec4 inV1,
    	UVec4 outResult
    ) {
    	sNot(
    		inV1.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sorts the elements in inIndex so that the values that correspond to trues in inValue are the first elements.
    /// The remaining elements will be set to inValue.w.
    /// I.e. if inValue = (true, false, true, false) and inIndex = (1, 2, 3, 4) the function returns (1, 3, 4, 4).
    /// ```
    public static void sSort4True(
    	MemorySegment inValue,
    	MemorySegment inIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_S_SORT4_TRUE.get();
    	try {
    		 method.invokeExact(
    			inValue,
    			inIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sSort4True].
    public static void sSort4True(
    	UVec4 inValue,
    	UVec4 inIndex,
    	UVec4 outResult
    ) {
    	sSort4True(
    		inValue.memorySegment(),
    		inIndex.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static int getX(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_GET_X.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getX].
    public final int getX() {
    	return getX(
    		this.segment
    	);
    }
    
    public static int getY(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_GET_Y.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getY].
    public final int getY() {
    	return getY(
    		this.segment
    	);
    }
    
    public static int getZ(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_GET_Z.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getZ].
    public final int getZ() {
    	return getZ(
    		this.segment
    	);
    }
    
    public static int getW(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_GET_W.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getW].
    public final int getW() {
    	return getW(
    		this.segment
    	);
    }
    
    /// ```
    /// Set individual components
    /// ```
    public static void setX(
    	MemorySegment self,
    	int inX
    ) {
    	MethodHandle method = JPH_UVEC4_SET_X.get();
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
    	int inX
    ) {
    	setX(
    		this.segment,
    		inX
    	);
    }
    
    public static void setY(
    	MemorySegment self,
    	int inY
    ) {
    	MethodHandle method = JPH_UVEC4_SET_Y.get();
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
    	int inY
    ) {
    	setY(
    		this.segment,
    		inY
    	);
    }
    
    public static void setZ(
    	MemorySegment self,
    	int inZ
    ) {
    	MethodHandle method = JPH_UVEC4_SET_Z.get();
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
    	int inZ
    ) {
    	setZ(
    		this.segment,
    		inZ
    	);
    }
    
    public static void setW(
    	MemorySegment self,
    	int inW
    ) {
    	MethodHandle method = JPH_UVEC4_SET_W.get();
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
    	int inW
    ) {
    	setW(
    		this.segment,
    		inW
    	);
    }
    
    /// ```
    /// Replicate the X component to all components
    /// ```
    public static void splatX(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_SPLAT_X.get();
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
    	UVec4 outResult
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
    	MethodHandle method = JPH_UVEC4_SPLAT_Y.get();
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
    	UVec4 outResult
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
    	MethodHandle method = JPH_UVEC4_SPLAT_Z.get();
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
    	UVec4 outResult
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
    	MethodHandle method = JPH_UVEC4_SPLAT_W.get();
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
    	UVec4 outResult
    ) {
    	splatW(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Convert each component from an int to a float
    /// ```
    public static void toFloat(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_TO_FLOAT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#toFloat].
    public final void toFloat(
    	Vec4 outResult
    ) {
    	toFloat(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Reinterpret UVec4 as a Vec4 (doesn't change the bits)
    /// ```
    public static void reinterpretAsFloat(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_REINTERPRET_AS_FLOAT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reinterpretAsFloat].
    public final void reinterpretAsFloat(
    	Vec4 outResult
    ) {
    	reinterpretAsFloat(
    		this.segment,
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
    	MethodHandle method = JPH_UVEC4_DOT_V.get();
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
    	UVec4 inV2,
    	UVec4 outResult
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
    public static int dot(
    	MemorySegment self,
    	MemorySegment inV2
    ) {
    	MethodHandle method = JPH_UVEC4_DOT.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inV2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dot].
    public final int dot(
    	UVec4 inV2
    ) {
    	return dot(
    		this.segment,
    		inV2.memorySegment()
    	);
    }
    
    /// ```
    /// Store 4 ints to memory
    /// ```
    public static void storeInt4(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_UVEC4_STORE_INT4.get();
    	try {
    		 method.invokeExact(
    			self,
    			outV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#storeInt4].
    public final void storeInt4(
    	NativeIntArray outV
    ) {
    	storeInt4(
    		this.segment,
    		outV.memorySegment()
    	);
    }
    
    /// ```
    /// Store 4 ints to memory, aligned to 16 bytes
    /// ```
    public static void storeInt4Aligned(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_UVEC4_STORE_INT4_ALIGNED.get();
    	try {
    		 method.invokeExact(
    			self,
    			outV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#storeInt4Aligned].
    public final void storeInt4Aligned(
    	NativeIntArray outV
    ) {
    	storeInt4Aligned(
    		this.segment,
    		outV.memorySegment()
    	);
    }
    
    /// ```
    /// Test if any of the components are true (true is when highest bit of component is set)
    /// ```
    public static boolean testAnyTrue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_TEST_ANY_TRUE.get();
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
    /// Test if any of X, Y or Z components are true (true is when highest bit of component is set)
    /// ```
    public static boolean testAnyXYZTrue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_TEST_ANY_XYZTRUE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#testAnyXYZTrue].
    public final boolean testAnyXYZTrue() {
    	return testAnyXYZTrue(
    		this.segment
    	);
    }
    
    /// ```
    /// Test if all components are true (true is when highest bit of component is set)
    /// ```
    public static boolean testAllTrue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_TEST_ALL_TRUE.get();
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
    
    /// ```
    /// Test if X, Y and Z components are true (true is when highest bit of component is set)
    /// ```
    public static boolean testAllXYZTrue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_TEST_ALL_XYZTRUE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#testAllXYZTrue].
    public final boolean testAllXYZTrue() {
    	return testAllXYZTrue(
    		this.segment
    	);
    }
    
    /// ```
    /// Count the number of components that are true (true is when highest bit of component is set)
    /// ```
    public static int countTrues(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_COUNT_TRUES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#countTrues].
    public final int countTrues() {
    	return countTrues(
    		this.segment
    	);
    }
    
    /// ```
    /// Store if X is true in bit 0, Y in bit 1, Z in bit 2 and W in bit 3 (true is when highest bit of component is set)
    /// ```
    public static int getTrues(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_UVEC4_GET_TRUES.get();
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
    /// Takes the lower 4 16 bits and expands them to X, Y, Z and W
    /// ```
    public static void expand4Uint16Lo(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_EXPAND4_UINT16_LO.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#expand4Uint16Lo].
    public final void expand4Uint16Lo(
    	UVec4 outResult
    ) {
    	expand4Uint16Lo(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Takes the upper 4 16 bits and expands them to X, Y, Z and W
    /// ```
    public static void expand4Uint16Hi(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_EXPAND4_UINT16_HI.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#expand4Uint16Hi].
    public final void expand4Uint16Hi(
    	UVec4 outResult
    ) {
    	expand4Uint16Hi(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Takes byte 0 .. 3 and expands them to X, Y, Z and W
    /// ```
    public static void expand4Byte0(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_EXPAND4_BYTE0.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#expand4Byte0].
    public final void expand4Byte0(
    	UVec4 outResult
    ) {
    	expand4Byte0(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Takes byte 4 .. 7 and expands them to X, Y, Z and W
    /// ```
    public static void expand4Byte4(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_EXPAND4_BYTE4.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#expand4Byte4].
    public final void expand4Byte4(
    	UVec4 outResult
    ) {
    	expand4Byte4(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Takes byte 8 .. 11 and expands them to X, Y, Z and W
    /// ```
    public static void expand4Byte8(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_EXPAND4_BYTE8.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#expand4Byte8].
    public final void expand4Byte8(
    	UVec4 outResult
    ) {
    	expand4Byte8(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Takes byte 12 .. 15 and expands them to X, Y, Z and W
    /// ```
    public static void expand4Byte12(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_EXPAND4_BYTE12.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#expand4Byte12].
    public final void expand4Byte12(
    	UVec4 outResult
    ) {
    	expand4Byte12(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Shift vector components by 4 - Count floats to the left, so if Count = 1 the resulting vector is (W, 0, 0, 0), when Count = 3 the resulting vector is (Y, Z, W, 0)
    /// ```
    public static void shiftComponents4Minus(
    	MemorySegment self,
    	int inCount,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_UVEC4_SHIFT_COMPONENTS4_MINUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCount,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shiftComponents4Minus].
    public final void shiftComponents4Minus(
    	int inCount,
    	UVec4 outResult
    ) {
    	shiftComponents4Minus(
    		this.segment,
    		inCount,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}