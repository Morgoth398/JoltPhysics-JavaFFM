/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Mat44 {

	private static final LazyConstant<MethodHandle> JPH_MAT44_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MAT44_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_MAT44_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_MAT44_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_ZERO;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_IDENTITY;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_NA_N;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_LOAD_FLOAT4X4;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_LOAD_FLOAT4X4_ALIGNED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_ROTATION_X;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_ROTATION_Y;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_ROTATION_Z;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_ROTATION1;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_ROTATION_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_INVERSE_ROTATION_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_SCALE;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_SCALE1;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_OUTER_PRODUCT;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_CROSS_PRODUCT;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_QUAT_LEFT_MULTIPLY;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_QUAT_RIGHT_MULTIPLY;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_LOOK_AT;
	private static final LazyConstant<MethodHandle> JPH_MAT44_S_PERSPECTIVE;
	private static final LazyConstant<MethodHandle> JPH_MAT44_IS_CLOSE;
	private static final LazyConstant<MethodHandle> JPH_MAT44_MULTIPLY3X3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_MULTIPLY3X3_TRANSPOSED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_MULTIPLY3X31;
	private static final LazyConstant<MethodHandle> JPH_MAT44_MULTIPLY3X3_LEFT_TRANSPOSED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_MULTIPLY3X3_RIGHT_TRANSPOSED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_AXIS_X;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_AXIS_X;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_AXIS_Y;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_AXIS_Y;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_AXIS_Z;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_AXIS_Z;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_DIAGONAL3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_DIAGONAL3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_DIAGONAL4;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_DIAGONAL4;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_COLUMN3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_COLUMN3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_COLUMN4;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_COLUMN4;
	private static final LazyConstant<MethodHandle> JPH_MAT44_STORE_FLOAT4X4;
	private static final LazyConstant<MethodHandle> JPH_MAT44_TRANSPOSED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_TRANSPOSED3X3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_INVERSED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_INVERSED_ROTATION_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_DETERMINANT3X3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_ADJOINTED3X3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_INVERSED3X3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_INVERSED3X3;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_ROTATION_SAFE;
	private static final LazyConstant<MethodHandle> JPH_MAT44_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_QUATERNION;
	private static final LazyConstant<MethodHandle> JPH_MAT44_GET_DIRECTION_PRESERVING_MATRIX;
	private static final LazyConstant<MethodHandle> JPH_MAT44_PRE_TRANSLATED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_POST_TRANSLATED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_PRE_SCALED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_POST_SCALED;
	private static final LazyConstant<MethodHandle> JPH_MAT44_DECOMPOSE;
	private static final LazyConstant<MethodHandle> JPH_MAT44_TO_MAT44;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_MAT44_CREATE = downcallHandle("JPH_Mat44_Create", UNBOUNDED_ADDRESS);
		JPH_MAT44_CREATE1 = downcallHandle("JPH_Mat44_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_CREATE2 = downcallHandle("JPH_Mat44_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_CREATE3 = downcallHandle("JPH_Mat44_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_DESTROY = downcallHandleVoid("JPH_Mat44_Destroy", UNBOUNDED_ADDRESS);
		JPH_MAT44_S_ZERO = downcallHandleVoid("JPH_Mat44_sZero", UNBOUNDED_ADDRESS);
		JPH_MAT44_S_IDENTITY = downcallHandleVoid("JPH_Mat44_sIdentity", UNBOUNDED_ADDRESS);
		JPH_MAT44_S_NA_N = downcallHandleVoid("JPH_Mat44_sNaN", UNBOUNDED_ADDRESS);
		JPH_MAT44_S_LOAD_FLOAT4X4 = downcallHandleVoid("JPH_Mat44_sLoadFloat4x4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_LOAD_FLOAT4X4_ALIGNED = downcallHandleVoid("JPH_Mat44_sLoadFloat4x4Aligned", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_ROTATION_X = downcallHandleVoid("JPH_Mat44_sRotationX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_ROTATION_Y = downcallHandleVoid("JPH_Mat44_sRotationY", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_ROTATION_Z = downcallHandleVoid("JPH_Mat44_sRotationZ", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_ROTATION = downcallHandleVoid("JPH_Mat44_sRotation", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_ROTATION1 = downcallHandleVoid("JPH_Mat44_sRotation1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_TRANSLATION = downcallHandleVoid("JPH_Mat44_sTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_ROTATION_TRANSLATION = downcallHandleVoid("JPH_Mat44_sRotationTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_INVERSE_ROTATION_TRANSLATION = downcallHandleVoid("JPH_Mat44_sInverseRotationTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_SCALE = downcallHandleVoid("JPH_Mat44_sScale", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_SCALE1 = downcallHandleVoid("JPH_Mat44_sScale1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_OUTER_PRODUCT = downcallHandleVoid("JPH_Mat44_sOuterProduct", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_CROSS_PRODUCT = downcallHandleVoid("JPH_Mat44_sCrossProduct", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_QUAT_LEFT_MULTIPLY = downcallHandleVoid("JPH_Mat44_sQuatLeftMultiply", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_QUAT_RIGHT_MULTIPLY = downcallHandleVoid("JPH_Mat44_sQuatRightMultiply", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_LOOK_AT = downcallHandleVoid("JPH_Mat44_sLookAt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_S_PERSPECTIVE = downcallHandleVoid("JPH_Mat44_sPerspective", JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MAT44_IS_CLOSE = downcallHandle("JPH_Mat44_IsClose", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MAT44_MULTIPLY3X3 = downcallHandleVoid("JPH_Mat44_Multiply3x3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_MULTIPLY3X3_TRANSPOSED = downcallHandleVoid("JPH_Mat44_Multiply3x3Transposed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_MULTIPLY3X31 = downcallHandleVoid("JPH_Mat44_Multiply3x31", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_MULTIPLY3X3_LEFT_TRANSPOSED = downcallHandleVoid("JPH_Mat44_Multiply3x3LeftTransposed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_MULTIPLY3X3_RIGHT_TRANSPOSED = downcallHandleVoid("JPH_Mat44_Multiply3x3RightTransposed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_AXIS_X = downcallHandleVoid("JPH_Mat44_GetAxisX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_AXIS_X = downcallHandleVoid("JPH_Mat44_SetAxisX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_AXIS_Y = downcallHandleVoid("JPH_Mat44_GetAxisY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_AXIS_Y = downcallHandleVoid("JPH_Mat44_SetAxisY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_AXIS_Z = downcallHandleVoid("JPH_Mat44_GetAxisZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_AXIS_Z = downcallHandleVoid("JPH_Mat44_SetAxisZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_TRANSLATION = downcallHandleVoid("JPH_Mat44_GetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_TRANSLATION = downcallHandleVoid("JPH_Mat44_SetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_DIAGONAL3 = downcallHandleVoid("JPH_Mat44_GetDiagonal3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_DIAGONAL3 = downcallHandleVoid("JPH_Mat44_SetDiagonal3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_DIAGONAL4 = downcallHandleVoid("JPH_Mat44_GetDiagonal4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_DIAGONAL4 = downcallHandleVoid("JPH_Mat44_SetDiagonal4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_COLUMN3 = downcallHandleVoid("JPH_Mat44_GetColumn3", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_COLUMN3 = downcallHandleVoid("JPH_Mat44_SetColumn3", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_COLUMN4 = downcallHandleVoid("JPH_Mat44_GetColumn4", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_COLUMN4 = downcallHandleVoid("JPH_Mat44_SetColumn4", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MAT44_STORE_FLOAT4X4 = downcallHandleVoid("JPH_Mat44_StoreFloat4x4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_TRANSPOSED = downcallHandleVoid("JPH_Mat44_Transposed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_TRANSPOSED3X3 = downcallHandleVoid("JPH_Mat44_Transposed3x3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_INVERSED = downcallHandleVoid("JPH_Mat44_Inversed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_INVERSED_ROTATION_TRANSLATION = downcallHandleVoid("JPH_Mat44_InversedRotationTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_DETERMINANT3X3 = downcallHandle("JPH_Mat44_GetDeterminant3x3", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MAT44_ADJOINTED3X3 = downcallHandleVoid("JPH_Mat44_Adjointed3x3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_INVERSED3X3 = downcallHandleVoid("JPH_Mat44_Inversed3x3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_INVERSED3X3 = downcallHandle("JPH_Mat44_SetInversed3x3", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_ROTATION = downcallHandleVoid("JPH_Mat44_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_ROTATION_SAFE = downcallHandleVoid("JPH_Mat44_GetRotationSafe", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_SET_ROTATION = downcallHandleVoid("JPH_Mat44_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_QUATERNION = downcallHandleVoid("JPH_Mat44_GetQuaternion", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_GET_DIRECTION_PRESERVING_MATRIX = downcallHandleVoid("JPH_Mat44_GetDirectionPreservingMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_PRE_TRANSLATED = downcallHandleVoid("JPH_Mat44_PreTranslated", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_POST_TRANSLATED = downcallHandleVoid("JPH_Mat44_PostTranslated", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_PRE_SCALED = downcallHandleVoid("JPH_Mat44_PreScaled", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_POST_SCALED = downcallHandleVoid("JPH_Mat44_PostScaled", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_DECOMPOSE = downcallHandleVoid("JPH_Mat44_Decompose", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MAT44_TO_MAT44 = downcallHandleVoid("JPH_Mat44_ToMat44", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Mat44() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Mat44(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Mat44(
	    Vec4 inC1,
	    Vec4 inC2,
	    Vec4 inC3,
	    Vec4 inC4
	) {
	    this(
	        Arena.ofAuto(),
	        inC1,
	        inC2,
	        inC3,
	        inC4
	    );
	}
	
	/// Typed method of [#create1].
	public Mat44(
		Arena arena,
		Vec4 inC1,
		Vec4 inC2,
		Vec4 inC3,
		Vec4 inC4
	) {
		MemorySegment segment = create1(
			inC1.memorySegment(),
			inC2.memorySegment(),
			inC3.memorySegment(),
			inC4.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Mat44(
	    Vec4 inC1,
	    Vec4 inC2,
	    Vec4 inC3,
	    Vec3 inC4
	) {
	    this(
	        Arena.ofAuto(),
	        inC1,
	        inC2,
	        inC3,
	        inC4
	    );
	}
	
	/// Typed method of [#create2].
	public Mat44(
		Arena arena,
		Vec4 inC1,
		Vec4 inC2,
		Vec4 inC3,
		Vec3 inC4
	) {
		MemorySegment segment = create2(
			inC1.memorySegment(),
			inC2.memorySegment(),
			inC3.memorySegment(),
			inC4.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Mat44(
	    Mat44 inM2
	) {
	    this(
	        Arena.ofAuto(),
	        inM2
	    );
	}
	
	/// Typed method of [#create3].
	public Mat44(
		Arena arena,
		Mat44 inM2
	) {
		MemorySegment segment = create3(
			inM2.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Mat44(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_MAT44_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inC1,
    	MemorySegment inC2,
    	MemorySegment inC3,
    	MemorySegment inC4
    ) {
    	MethodHandle method = JPH_MAT44_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inC1,
    			inC2,
    			inC3,
    			inC4
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inC1,
    	MemorySegment inC2,
    	MemorySegment inC3,
    	MemorySegment inC4
    ) {
    	MethodHandle method = JPH_MAT44_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inC1,
    			inC2,
    			inC3,
    			inC4
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	MemorySegment inM2
    ) {
    	MethodHandle method = JPH_MAT44_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inM2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MAT44_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Zero matrix
    /// ```
    public static void sZero(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_ZERO.get();
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
    	Mat44 outResult
    ) {
    	sZero(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Identity matrix
    /// ```
    public static void sIdentity(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_IDENTITY.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sIdentity].
    public static void sIdentity(
    	Mat44 outResult
    ) {
    	sIdentity(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Matrix filled with NaN's
    /// ```
    public static void sNaN(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_NA_N.get();
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
    	Mat44 outResult
    ) {
    	sNaN(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 16 floats from memory
    /// ```
    public static void sLoadFloat4x4(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_LOAD_FLOAT4X4.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadFloat4x4].
    public static void sLoadFloat4x4(
    	Float4 inV,
    	Mat44 outResult
    ) {
    	sLoadFloat4x4(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 16 floats from memory, 16 bytes aligned
    /// ```
    public static void sLoadFloat4x4Aligned(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_LOAD_FLOAT4X4_ALIGNED.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLoadFloat4x4Aligned].
    public static void sLoadFloat4x4Aligned(
    	Float4 inV,
    	Mat44 outResult
    ) {
    	sLoadFloat4x4Aligned(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate around X, Y or Z axis (angle in radians)
    /// ```
    public static void sRotationX(
    	float inX,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_ROTATION_X.get();
    	try {
    		 method.invokeExact(
    			inX,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRotationX].
    public static void sRotationX(
    	float inX,
    	Mat44 outResult
    ) {
    	sRotationX(
    		inX,
    		outResult.memorySegment()
    	);
    }
    
    public static void sRotationY(
    	float inY,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_ROTATION_Y.get();
    	try {
    		 method.invokeExact(
    			inY,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRotationY].
    public static void sRotationY(
    	float inY,
    	Mat44 outResult
    ) {
    	sRotationY(
    		inY,
    		outResult.memorySegment()
    	);
    }
    
    public static void sRotationZ(
    	float inZ,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_ROTATION_Z.get();
    	try {
    		 method.invokeExact(
    			inZ,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRotationZ].
    public static void sRotationZ(
    	float inZ,
    	Mat44 outResult
    ) {
    	sRotationZ(
    		inZ,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate around arbitrary axis
    /// ```
    public static void sRotation(
    	MemorySegment inAxis,
    	float inAngle,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_ROTATION.get();
    	try {
    		 method.invokeExact(
    			inAxis,
    			inAngle,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRotation].
    public static void sRotation(
    	Vec3 inAxis,
    	float inAngle,
    	Mat44 outResult
    ) {
    	sRotation(
    		inAxis.memorySegment(),
    		inAngle,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate from quaternion
    /// ```
    public static void sRotation1(
    	MemorySegment inQuat,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_ROTATION1.get();
    	try {
    		 method.invokeExact(
    			inQuat,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRotation1].
    public static void sRotation1(
    	Quat inQuat,
    	Mat44 outResult
    ) {
    	sRotation1(
    		inQuat.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get matrix that translates
    /// ```
    public static void sTranslation(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sTranslation].
    public static void sTranslation(
    	Vec3 inV,
    	Mat44 outResult
    ) {
    	sTranslation(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get matrix that rotates and translates
    /// ```
    public static void sRotationTranslation(
    	MemorySegment inR,
    	MemorySegment inT,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_ROTATION_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			inR,
    			inT,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRotationTranslation].
    public static void sRotationTranslation(
    	Quat inR,
    	Vec3 inT,
    	Mat44 outResult
    ) {
    	sRotationTranslation(
    		inR.memorySegment(),
    		inT.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get inverse matrix of sRotationTranslation
    /// ```
    public static void sInverseRotationTranslation(
    	MemorySegment inR,
    	MemorySegment inT,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_INVERSE_ROTATION_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			inR,
    			inT,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sInverseRotationTranslation].
    public static void sInverseRotationTranslation(
    	Quat inR,
    	Vec3 inT,
    	Mat44 outResult
    ) {
    	sInverseRotationTranslation(
    		inR.memorySegment(),
    		inT.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get matrix that scales uniformly
    /// ```
    public static void sScale(
    	float inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_SCALE.get();
    	try {
    		 method.invokeExact(
    			inScale,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sScale].
    public static void sScale(
    	float inScale,
    	Mat44 outResult
    ) {
    	sScale(
    		inScale,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get matrix that scales (produces a matrix with (inV, 1) on its diagonal)
    /// ```
    public static void sScale1(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_SCALE1.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sScale1].
    public static void sScale1(
    	Vec3 inV,
    	Mat44 outResult
    ) {
    	sScale1(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get outer product of inV and inV2 (equivalent to \f$inV1 \otimes inV2\f$)
    /// ```
    public static void sOuterProduct(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_OUTER_PRODUCT.get();
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
    
    /// Typed method of [#sOuterProduct].
    public static void sOuterProduct(
    	Vec3 inV1,
    	Vec3 inV2,
    	Mat44 outResult
    ) {
    	sOuterProduct(
    		inV1.memorySegment(),
    		inV2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get matrix that represents a cross product \f$A \times B = \text{sCrossProduct}(A) \: B\f$
    /// ```
    public static void sCrossProduct(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_CROSS_PRODUCT.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sCrossProduct].
    public static void sCrossProduct(
    	Vec3 inV,
    	Mat44 outResult
    ) {
    	sCrossProduct(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns matrix ML so that \f$ML(q) \: p = q \: p\f$ (where p and q are quaternions)
    /// ```
    public static void sQuatLeftMultiply(
    	MemorySegment inQ,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_QUAT_LEFT_MULTIPLY.get();
    	try {
    		 method.invokeExact(
    			inQ,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sQuatLeftMultiply].
    public static void sQuatLeftMultiply(
    	Quat inQ,
    	Mat44 outResult
    ) {
    	sQuatLeftMultiply(
    		inQ.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns matrix MR so that \f$MR(q) \: p = p \: q\f$ (where p and q are quaternions)
    /// ```
    public static void sQuatRightMultiply(
    	MemorySegment inQ,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_QUAT_RIGHT_MULTIPLY.get();
    	try {
    		 method.invokeExact(
    			inQ,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sQuatRightMultiply].
    public static void sQuatRightMultiply(
    	Quat inQ,
    	Mat44 outResult
    ) {
    	sQuatRightMultiply(
    		inQ.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns a look at matrix that transforms from world space to view space
    /// @param inPos Position of the camera
    /// @param inTarget Target of the camera
    /// @param inUp Up vector
    /// ```
    public static void sLookAt(
    	MemorySegment inPos,
    	MemorySegment inTarget,
    	MemorySegment inUp,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_LOOK_AT.get();
    	try {
    		 method.invokeExact(
    			inPos,
    			inTarget,
    			inUp,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLookAt].
    public static void sLookAt(
    	Vec3 inPos,
    	Vec3 inTarget,
    	Vec3 inUp,
    	Mat44 outResult
    ) {
    	sLookAt(
    		inPos.memorySegment(),
    		inTarget.memorySegment(),
    		inUp.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns a right-handed perspective projection matrix
    /// ```
    public static void sPerspective(
    	float inFovY,
    	float inAspect,
    	float inNear,
    	float inFar,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_S_PERSPECTIVE.get();
    	try {
    		 method.invokeExact(
    			inFovY,
    			inAspect,
    			inNear,
    			inFar,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sPerspective].
    public static void sPerspective(
    	float inFovY,
    	float inAspect,
    	float inNear,
    	float inFar,
    	Mat44 outResult
    ) {
    	sPerspective(
    		inFovY,
    		inAspect,
    		inNear,
    		inFar,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Test if two matrices are close
    /// ```
    public static boolean isClose(
    	MemorySegment self,
    	MemorySegment inM2,
    	float inMaxDistSq
    ) {
    	MethodHandle method = JPH_MAT44_IS_CLOSE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inM2,
    			inMaxDistSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isClose].
    public final boolean isClose(
    	Mat44 inM2,
    	float inMaxDistSq
    ) {
    	return isClose(
    		this.segment,
    		inM2.memorySegment(),
    		inMaxDistSq
    	);
    }
    
    /// ```
    /// Multiply vector by only 3x3 part of the matrix
    /// ```
    public static void multiply3x3(
    	MemorySegment self,
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_MULTIPLY3X3.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#multiply3x3].
    public final void multiply3x3(
    	Vec3 inV,
    	Vec3 outResult
    ) {
    	multiply3x3(
    		this.segment,
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply vector by only 3x3 part of the transpose of the matrix (\f$result = this^T \: inV\f$)
    /// ```
    public static void multiply3x3Transposed(
    	MemorySegment self,
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_MULTIPLY3X3_TRANSPOSED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#multiply3x3Transposed].
    public final void multiply3x3Transposed(
    	Vec3 inV,
    	Vec3 outResult
    ) {
    	multiply3x3Transposed(
    		this.segment,
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply 3x3 matrix by 3x3 matrix
    /// ```
    public static void multiply3x31(
    	MemorySegment self,
    	MemorySegment inM,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_MULTIPLY3X31.get();
    	try {
    		 method.invokeExact(
    			self,
    			inM,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#multiply3x31].
    public final void multiply3x31(
    	Mat44 inM,
    	Mat44 outResult
    ) {
    	multiply3x31(
    		this.segment,
    		inM.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply transpose of 3x3 matrix by 3x3 matrix (\f$result = this^T \: inM\f$)
    /// ```
    public static void multiply3x3LeftTransposed(
    	MemorySegment self,
    	MemorySegment inM,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_MULTIPLY3X3_LEFT_TRANSPOSED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inM,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#multiply3x3LeftTransposed].
    public final void multiply3x3LeftTransposed(
    	Mat44 inM,
    	Mat44 outResult
    ) {
    	multiply3x3LeftTransposed(
    		this.segment,
    		inM.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply 3x3 matrix by the transpose of a 3x3 matrix (\f$result = this \: inM^T\f$)
    /// ```
    public static void multiply3x3RightTransposed(
    	MemorySegment self,
    	MemorySegment inM,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_MULTIPLY3X3_RIGHT_TRANSPOSED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inM,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#multiply3x3RightTransposed].
    public final void multiply3x3RightTransposed(
    	Mat44 inM,
    	Mat44 outResult
    ) {
    	multiply3x3RightTransposed(
    		this.segment,
    		inM.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the columns
    /// ```
    public static void getAxisX(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_AXIS_X.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAxisX].
    public final void getAxisX(
    	Vec3 outResult
    ) {
    	getAxisX(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setAxisX(
    	MemorySegment self,
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_MAT44_SET_AXIS_X.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAxisX].
    public final void setAxisX(
    	Vec3 inV
    ) {
    	setAxisX(
    		this.segment,
    		inV.memorySegment()
    	);
    }
    
    public static void getAxisY(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_AXIS_Y.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAxisY].
    public final void getAxisY(
    	Vec3 outResult
    ) {
    	getAxisY(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setAxisY(
    	MemorySegment self,
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_MAT44_SET_AXIS_Y.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAxisY].
    public final void setAxisY(
    	Vec3 inV
    ) {
    	setAxisY(
    		this.segment,
    		inV.memorySegment()
    	);
    }
    
    public static void getAxisZ(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_AXIS_Z.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAxisZ].
    public final void getAxisZ(
    	Vec3 outResult
    ) {
    	getAxisZ(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setAxisZ(
    	MemorySegment self,
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_MAT44_SET_AXIS_Z.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAxisZ].
    public final void setAxisZ(
    	Vec3 inV
    ) {
    	setAxisZ(
    		this.segment,
    		inV.memorySegment()
    	);
    }
    
    public static void getTranslation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTranslation].
    public final void getTranslation(
    	Vec3 outResult
    ) {
    	getTranslation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setTranslation(
    	MemorySegment self,
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_MAT44_SET_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTranslation].
    public final void setTranslation(
    	Vec3 inV
    ) {
    	setTranslation(
    		this.segment,
    		inV.memorySegment()
    	);
    }
    
    public static void getDiagonal3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_DIAGONAL3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDiagonal3].
    public final void getDiagonal3(
    	Vec3 outResult
    ) {
    	getDiagonal3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setDiagonal3(
    	MemorySegment self,
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_MAT44_SET_DIAGONAL3.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDiagonal3].
    public final void setDiagonal3(
    	Vec3 inV
    ) {
    	setDiagonal3(
    		this.segment,
    		inV.memorySegment()
    	);
    }
    
    public static void getDiagonal4(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_DIAGONAL4.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDiagonal4].
    public final void getDiagonal4(
    	Vec4 outResult
    ) {
    	getDiagonal4(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setDiagonal4(
    	MemorySegment self,
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_MAT44_SET_DIAGONAL4.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDiagonal4].
    public final void setDiagonal4(
    	Vec4 inV
    ) {
    	setDiagonal4(
    		this.segment,
    		inV.memorySegment()
    	);
    }
    
    public static void getColumn3(
    	MemorySegment self,
    	int inCol,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_COLUMN3.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCol,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getColumn3].
    public final void getColumn3(
    	int inCol,
    	Vec3 outResult
    ) {
    	getColumn3(
    		this.segment,
    		inCol,
    		outResult.memorySegment()
    	);
    }
    
    public static void setColumn3(
    	MemorySegment self,
    	int inCol,
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_MAT44_SET_COLUMN3.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCol,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setColumn3].
    public final void setColumn3(
    	int inCol,
    	Vec3 inV
    ) {
    	setColumn3(
    		this.segment,
    		inCol,
    		inV.memorySegment()
    	);
    }
    
    public static void getColumn4(
    	MemorySegment self,
    	int inCol,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_COLUMN4.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCol,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getColumn4].
    public final void getColumn4(
    	int inCol,
    	Vec4 outResult
    ) {
    	getColumn4(
    		this.segment,
    		inCol,
    		outResult.memorySegment()
    	);
    }
    
    public static void setColumn4(
    	MemorySegment self,
    	int inCol,
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_MAT44_SET_COLUMN4.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCol,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setColumn4].
    public final void setColumn4(
    	int inCol,
    	Vec4 inV
    ) {
    	setColumn4(
    		this.segment,
    		inCol,
    		inV.memorySegment()
    	);
    }
    
    /// ```
    /// Store matrix to memory
    /// ```
    public static void storeFloat4x4(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_MAT44_STORE_FLOAT4X4.get();
    	try {
    		 method.invokeExact(
    			self,
    			outV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#storeFloat4x4].
    public final void storeFloat4x4(
    	Float4 outV
    ) {
    	storeFloat4x4(
    		this.segment,
    		outV.memorySegment()
    	);
    }
    
    /// ```
    /// Transpose matrix
    /// ```
    public static void transposed(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_TRANSPOSED.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#transposed].
    public final void transposed(
    	Mat44 outResult
    ) {
    	transposed(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Transpose 3x3 subpart of matrix
    /// ```
    public static void transposed3x3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_TRANSPOSED3X3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#transposed3x3].
    public final void transposed3x3(
    	Mat44 outResult
    ) {
    	transposed3x3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Inverse 4x4 matrix
    /// ```
    public static void inversed(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_INVERSED.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#inversed].
    public final void inversed(
    	Mat44 outResult
    ) {
    	inversed(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Inverse 4x4 matrix when it only contains rotation and translation
    /// ```
    public static void inversedRotationTranslation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_INVERSED_ROTATION_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#inversedRotationTranslation].
    public final void inversedRotationTranslation(
    	Mat44 outResult
    ) {
    	inversedRotationTranslation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the determinant of a 3x3 matrix
    /// ```
    public static float getDeterminant3x3(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MAT44_GET_DETERMINANT3X3.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDeterminant3x3].
    public final float getDeterminant3x3() {
    	return getDeterminant3x3(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the adjoint of a 3x3 matrix
    /// ```
    public static void adjointed3x3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_ADJOINTED3X3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#adjointed3x3].
    public final void adjointed3x3(
    	Mat44 outResult
    ) {
    	adjointed3x3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Inverse 3x3 matrix
    /// ```
    public static void inversed3x3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_INVERSED3X3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#inversed3x3].
    public final void inversed3x3(
    	Mat44 outResult
    ) {
    	inversed3x3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// this = inM.Inversed3x3(), returns false if the matrix is singular in which case *this is unchanged
    /// ```
    public static boolean setInversed3x3(
    	MemorySegment self,
    	MemorySegment inM
    ) {
    	MethodHandle method = JPH_MAT44_SET_INVERSED3X3.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInversed3x3].
    public final boolean setInversed3x3(
    	Mat44 inM
    ) {
    	return setInversed3x3(
    		this.segment,
    		inM.memorySegment()
    	);
    }
    
    /// ```
    /// Get rotation part only (note: retains the first 3 values from the bottom row)
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotation].
    public final void getRotation(
    	Mat44 outResult
    ) {
    	getRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get rotation part only (note: also clears the bottom row)
    /// ```
    public static void getRotationSafe(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_ROTATION_SAFE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotationSafe].
    public final void getRotationSafe(
    	Mat44 outResult
    ) {
    	getRotationSafe(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Updates the rotation part of this matrix (the first 3 columns)
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment inRotation
    ) {
    	MethodHandle method = JPH_MAT44_SET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotation].
    public final void setRotation(
    	Mat44 inRotation
    ) {
    	setRotation(
    		this.segment,
    		inRotation.memorySegment()
    	);
    }
    
    /// ```
    /// Convert to quaternion
    /// ```
    public static void getQuaternion(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_QUATERNION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getQuaternion].
    public final void getQuaternion(
    	Quat outResult
    ) {
    	getQuaternion(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get matrix that transforms a direction with the same transform as this matrix (length is not preserved)
    /// ```
    public static void getDirectionPreservingMatrix(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_GET_DIRECTION_PRESERVING_MATRIX.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDirectionPreservingMatrix].
    public final void getDirectionPreservingMatrix(
    	Mat44 outResult
    ) {
    	getDirectionPreservingMatrix(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Pre multiply by translation matrix: result = this * Mat44::sTranslation(inTranslation)
    /// ```
    public static void preTranslated(
    	MemorySegment self,
    	MemorySegment inTranslation,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_PRE_TRANSLATED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTranslation,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#preTranslated].
    public final void preTranslated(
    	Vec3 inTranslation,
    	Mat44 outResult
    ) {
    	preTranslated(
    		this.segment,
    		inTranslation.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Post multiply by translation matrix: result = Mat44::sTranslation(inTranslation) * this (i.e. add inTranslation to the 4-th column)
    /// ```
    public static void postTranslated(
    	MemorySegment self,
    	MemorySegment inTranslation,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_POST_TRANSLATED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTranslation,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#postTranslated].
    public final void postTranslated(
    	Vec3 inTranslation,
    	Mat44 outResult
    ) {
    	postTranslated(
    		this.segment,
    		inTranslation.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Scale a matrix: result = this * Mat44::sScale(inScale)
    /// ```
    public static void preScaled(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_PRE_SCALED.get();
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
    
    /// Typed method of [#preScaled].
    public final void preScaled(
    	Vec3 inScale,
    	Mat44 outResult
    ) {
    	preScaled(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Scale a matrix: result = Mat44::sScale(inScale) * this
    /// ```
    public static void postScaled(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_POST_SCALED.get();
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
    
    /// Typed method of [#postScaled].
    public final void postScaled(
    	Vec3 inScale,
    	Mat44 outResult
    ) {
    	postScaled(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Decompose a matrix into a rotation & translation part and into a scale part so that:
    /// this = return_value * Mat44::sScale(outScale).
    /// This equation only holds when the matrix is orthogonal, if it is not the returned matrix
    /// will be made orthogonal using the modified Gram-Schmidt algorithm (see: https://en.wikipedia.org/wiki/Gram%E2%80%93Schmidt_process)
    /// ```
    public static void decompose(
    	MemorySegment self,
    	MemorySegment outScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_DECOMPOSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outScale,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#decompose].
    public final void decompose(
    	Vec3 outScale,
    	Mat44 outResult
    ) {
    	decompose(
    		this.segment,
    		outScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// In single precision mode just return the matrix itself
    /// ```
    public static void toMat44(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MAT44_TO_MAT44.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#toMat44].
    public final void toMat44(
    	Mat44 outResult
    ) {
    	toMat44(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}