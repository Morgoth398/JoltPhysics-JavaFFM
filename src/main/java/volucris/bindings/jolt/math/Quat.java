/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeFloatArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Quat {

	private static final LazyConstant<MethodHandle> JPH_QUAT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_QUAT_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_QUAT_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_QUAT_CREATE4;
	private static final LazyConstant<MethodHandle> JPH_QUAT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_VALUE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_SET_VALUE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_IS_CLOSE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_IS_NORMALIZED;
	private static final LazyConstant<MethodHandle> JPH_QUAT_IS_NA_N;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_X;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_Y;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_Z;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_W;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_XYZ;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_XYZW;
	private static final LazyConstant<MethodHandle> JPH_QUAT_SET_X;
	private static final LazyConstant<MethodHandle> JPH_QUAT_SET_Y;
	private static final LazyConstant<MethodHandle> JPH_QUAT_SET_Z;
	private static final LazyConstant<MethodHandle> JPH_QUAT_SET_W;
	private static final LazyConstant<MethodHandle> JPH_QUAT_SET;
	private static final LazyConstant<MethodHandle> JPH_QUAT_S_ZERO;
	private static final LazyConstant<MethodHandle> JPH_QUAT_S_IDENTITY;
	private static final LazyConstant<MethodHandle> JPH_QUAT_S_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_AXIS_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_QUAT_S_FROM_TO;
	private static final LazyConstant<MethodHandle> JPH_QUAT_S_EULER_ANGLES;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_EULER_ANGLES;
	private static final LazyConstant<MethodHandle> JPH_QUAT_LENGTH_SQ;
	private static final LazyConstant<MethodHandle> JPH_QUAT_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_QUAT_NORMALIZED;
	private static final LazyConstant<MethodHandle> JPH_QUAT_S_MULTIPLY_IMAGINARY;
	private static final LazyConstant<MethodHandle> JPH_QUAT_INVERSE_ROTATE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_ROTATE_AXIS_X;
	private static final LazyConstant<MethodHandle> JPH_QUAT_ROTATE_AXIS_Y;
	private static final LazyConstant<MethodHandle> JPH_QUAT_ROTATE_AXIS_Z;
	private static final LazyConstant<MethodHandle> JPH_QUAT_DOT;
	private static final LazyConstant<MethodHandle> JPH_QUAT_CONJUGATED;
	private static final LazyConstant<MethodHandle> JPH_QUAT_INVERSED;
	private static final LazyConstant<MethodHandle> JPH_QUAT_ENSURE_WPOSITIVE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_PERPENDICULAR;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_ROTATION_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_TWIST;
	private static final LazyConstant<MethodHandle> JPH_QUAT_GET_SWING_TWIST;
	private static final LazyConstant<MethodHandle> JPH_QUAT_LERP;
	private static final LazyConstant<MethodHandle> JPH_QUAT_SLERP;
	private static final LazyConstant<MethodHandle> JPH_QUAT_S_LOAD_FLOAT3_UNSAFE;
	private static final LazyConstant<MethodHandle> JPH_QUAT_STORE_FLOAT3;
	private static final LazyConstant<MethodHandle> JPH_QUAT_STORE_FLOAT4;
	private static final LazyConstant<MethodHandle> JPH_QUAT_COMPRESS_UNIT_QUAT;
	private static final LazyConstant<MethodHandle> JPH_QUAT_S_DECOMPRESS_UNIT_QUAT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_QUAT_CREATE = downcallHandle("JPH_Quat_Create", UNBOUNDED_ADDRESS);
		JPH_QUAT_CREATE1 = downcallHandle("JPH_Quat_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_CREATE2 = downcallHandle("JPH_Quat_Create2", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_QUAT_CREATE3 = downcallHandle("JPH_Quat_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_CREATE4 = downcallHandle("JPH_Quat_Create4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_DESTROY = downcallHandleVoid("JPH_Quat_Destroy", UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_VALUE = downcallHandleVoid("JPH_Quat_GetValue", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_SET_VALUE = downcallHandleVoid("JPH_Quat_SetValue", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_IS_CLOSE = downcallHandle("JPH_Quat_IsClose", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_QUAT_IS_NORMALIZED = downcallHandle("JPH_Quat_IsNormalized", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_QUAT_IS_NA_N = downcallHandle("JPH_Quat_IsNaN", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_X = downcallHandle("JPH_Quat_GetX", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_Y = downcallHandle("JPH_Quat_GetY", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_Z = downcallHandle("JPH_Quat_GetZ", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_W = downcallHandle("JPH_Quat_GetW", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_XYZ = downcallHandleVoid("JPH_Quat_GetXYZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_XYZW = downcallHandleVoid("JPH_Quat_GetXYZW", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_SET_X = downcallHandleVoid("JPH_Quat_SetX", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_QUAT_SET_Y = downcallHandleVoid("JPH_Quat_SetY", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_QUAT_SET_Z = downcallHandleVoid("JPH_Quat_SetZ", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_QUAT_SET_W = downcallHandleVoid("JPH_Quat_SetW", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_QUAT_SET = downcallHandleVoid("JPH_Quat_Set", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_QUAT_S_ZERO = downcallHandleVoid("JPH_Quat_sZero", UNBOUNDED_ADDRESS);
		JPH_QUAT_S_IDENTITY = downcallHandleVoid("JPH_Quat_sIdentity", UNBOUNDED_ADDRESS);
		JPH_QUAT_S_ROTATION = downcallHandleVoid("JPH_Quat_sRotation", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_AXIS_ANGLE = downcallHandleVoid("JPH_Quat_GetAxisAngle", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Quat_GetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_S_FROM_TO = downcallHandleVoid("JPH_Quat_sFromTo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_S_EULER_ANGLES = downcallHandleVoid("JPH_Quat_sEulerAngles", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_EULER_ANGLES = downcallHandleVoid("JPH_Quat_GetEulerAngles", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_LENGTH_SQ = downcallHandle("JPH_Quat_LengthSq", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_LENGTH = downcallHandle("JPH_Quat_Length", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_NORMALIZED = downcallHandleVoid("JPH_Quat_Normalized", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_S_MULTIPLY_IMAGINARY = downcallHandleVoid("JPH_Quat_sMultiplyImaginary", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_INVERSE_ROTATE = downcallHandleVoid("JPH_Quat_InverseRotate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_ROTATE_AXIS_X = downcallHandleVoid("JPH_Quat_RotateAxisX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_ROTATE_AXIS_Y = downcallHandleVoid("JPH_Quat_RotateAxisY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_ROTATE_AXIS_Z = downcallHandleVoid("JPH_Quat_RotateAxisZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_DOT = downcallHandle("JPH_Quat_Dot", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_CONJUGATED = downcallHandleVoid("JPH_Quat_Conjugated", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_INVERSED = downcallHandleVoid("JPH_Quat_Inversed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_ENSURE_WPOSITIVE = downcallHandleVoid("JPH_Quat_EnsureWPositive", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_PERPENDICULAR = downcallHandleVoid("JPH_Quat_GetPerpendicular", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_ROTATION_ANGLE = downcallHandle("JPH_Quat_GetRotationAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_TWIST = downcallHandleVoid("JPH_Quat_GetTwist", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_GET_SWING_TWIST = downcallHandleVoid("JPH_Quat_GetSwingTwist", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_LERP = downcallHandleVoid("JPH_Quat_LERP", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_SLERP = downcallHandleVoid("JPH_Quat_SLERP", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_QUAT_S_LOAD_FLOAT3_UNSAFE = downcallHandleVoid("JPH_Quat_sLoadFloat3Unsafe", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_STORE_FLOAT3 = downcallHandleVoid("JPH_Quat_StoreFloat3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_STORE_FLOAT4 = downcallHandleVoid("JPH_Quat_StoreFloat4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_QUAT_COMPRESS_UNIT_QUAT = downcallHandle("JPH_Quat_CompressUnitQuat", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_QUAT_S_DECOMPRESS_UNIT_QUAT = downcallHandleVoid("JPH_Quat_sDecompressUnitQuat", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Quat() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Quat(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Quat(
	    Quat inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public Quat(
		Arena arena,
		Quat inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Quat(
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
	
	/// Typed method of [#create2].
	public Quat(
		Arena arena,
		float inX,
		float inY,
		float inZ,
		float inW
	) {
		MemorySegment segment = create2(
			inX,
			inY,
			inZ,
			inW
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Quat(
	    Float4 inV
	) {
	    this(
	        Arena.ofAuto(),
	        inV
	    );
	}
	
	/// Typed method of [#create3].
	public Quat(
		Arena arena,
		Float4 inV
	) {
		MemorySegment segment = create3(
			inV.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Quat(
	    Vec4 inV
	) {
	    this(
	        Arena.ofAuto(),
	        inV
	    );
	}
	
	/// Typed method of [#create4].
	public Quat(
		Arena arena,
		Vec4 inV
	) {
		MemorySegment segment = create4(
			inV.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Quat(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// @name Constructors
    /// @{
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_QUAT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_QUAT_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	float inX,
    	float inY,
    	float inZ,
    	float inW
    ) {
    	MethodHandle method = JPH_QUAT_CREATE2.get();
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
    
    public static MemorySegment create3(
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_QUAT_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create4(
    	MemorySegment inV
    ) {
    	MethodHandle method = JPH_QUAT_CREATE4.get();
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
    	MethodHandle method = JPH_QUAT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 4 vector that stores [x, y, z, w] parts of the quaternion
    /// ```
    public static void getValue(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_GET_VALUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getValue].
    public final void getValue(
    	Vec4 outResult
    ) {
    	getValue(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// 4 vector that stores [x, y, z, w] parts of the quaternion
    /// ```
    public static void setValue(
    	MemorySegment self,
    	MemorySegment mValue
    ) {
    	MethodHandle method = JPH_QUAT_SET_VALUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setValue].
    public final void setValue(
    	Vec4 mValue
    ) {
    	setValue(
    		this.segment,
    		mValue.memorySegment()
    	);
    }
    
    /// ```
    /// If this quaternion is close to inRHS. Note that q and -q represent the same rotation, this is not checked here.
    /// ```
    public static boolean isClose(
    	MemorySegment self,
    	MemorySegment inRHS,
    	float inMaxDistSq
    ) {
    	MethodHandle method = JPH_QUAT_IS_CLOSE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inRHS,
    			inMaxDistSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isClose].
    public final boolean isClose(
    	Quat inRHS,
    	float inMaxDistSq
    ) {
    	return isClose(
    		this.segment,
    		inRHS.memorySegment(),
    		inMaxDistSq
    	);
    }
    
    /// ```
    /// If the length^2 of this quaternion is within the range [1 - inTolerance, 1 + inTolerance]
    /// ```
    public static boolean isNormalized(
    	MemorySegment self,
    	float inTolerance
    ) {
    	MethodHandle method = JPH_QUAT_IS_NORMALIZED.get();
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
    /// If any component of this quaternion is a NaN (not a number)
    /// ```
    public static boolean isNaN(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_QUAT_IS_NA_N.get();
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
    /// Get X component (imaginary part i)
    /// ```
    public static float getX(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_QUAT_GET_X.get();
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
    
    /// ```
    /// Get Y component (imaginary part j)
    /// ```
    public static float getY(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_QUAT_GET_Y.get();
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
    
    /// ```
    /// Get Z component (imaginary part k)
    /// ```
    public static float getZ(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_QUAT_GET_Z.get();
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
    /// Get W component (real part)
    /// ```
    public static float getW(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_QUAT_GET_W.get();
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
    /// Get the imaginary part of the quaternion
    /// ```
    public static void getXYZ(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_GET_XYZ.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getXYZ].
    public final void getXYZ(
    	Vec3 outResult
    ) {
    	getXYZ(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the quaternion as a Vec4
    /// ```
    public static void getXYZW(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_GET_XYZW.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getXYZW].
    public final void getXYZW(
    	Vec4 outResult
    ) {
    	getXYZW(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set individual components
    /// ```
    public static void setX(
    	MemorySegment self,
    	float inX
    ) {
    	MethodHandle method = JPH_QUAT_SET_X.get();
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
    	MethodHandle method = JPH_QUAT_SET_Y.get();
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
    	MethodHandle method = JPH_QUAT_SET_Z.get();
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
    	MethodHandle method = JPH_QUAT_SET_W.get();
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
    	MethodHandle method = JPH_QUAT_SET.get();
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
    /// @return [0, 0, 0, 0]
    /// ```
    public static void sZero(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_S_ZERO.get();
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
    	Quat outResult
    ) {
    	sZero(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @return [1, 0, 0, 0] (or in storage format Quat(0, 0, 0, 1))
    /// ```
    public static void sIdentity(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_S_IDENTITY.get();
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
    	Quat outResult
    ) {
    	sIdentity(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation from axis and angle
    /// ```
    public static void sRotation(
    	MemorySegment inAxis,
    	float inAngle,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_S_ROTATION.get();
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
    	Quat outResult
    ) {
    	sRotation(
    		inAxis.memorySegment(),
    		inAngle,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get axis and angle that represents this quaternion, outAngle will always be in the range \f$[0, \pi]\f$
    /// ```
    public static void getAxisAngle(
    	MemorySegment self,
    	MemorySegment outAxis,
    	MemorySegment outAngle
    ) {
    	MethodHandle method = JPH_QUAT_GET_AXIS_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outAxis,
    			outAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAxisAngle].
    public final void getAxisAngle(
    	Vec3 outAxis,
    	NativeFloatArray outAngle
    ) {
    	getAxisAngle(
    		this.segment,
    		outAxis.memorySegment(),
    		outAngle.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate angular velocity given that this quaternion represents the rotation that is reached after inDeltaTime when starting from identity rotation
    /// ```
    public static void getAngularVelocity(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_GET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public final void getAngularVelocity(
    	float inDeltaTime,
    	Vec3 outResult
    ) {
    	getAngularVelocity(
    		this.segment,
    		inDeltaTime,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Create quaternion that rotates a vector from the direction of inFrom to the direction of inTo along the shortest path
    /// @see https://www.euclideanspace.com/maths/algebra/vectors/angleBetween/index.htm
    /// ```
    public static void sFromTo(
    	MemorySegment inFrom,
    	MemorySegment inTo,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_S_FROM_TO.get();
    	try {
    		 method.invokeExact(
    			inFrom,
    			inTo,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sFromTo].
    public static void sFromTo(
    	Vec3 inFrom,
    	Vec3 inTo,
    	Quat outResult
    ) {
    	sFromTo(
    		inFrom.memorySegment(),
    		inTo.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Conversion from Euler angles. Rotation order is X then Y then Z (RotZ * RotY * RotX). Angles in radians.
    /// ```
    public static void sEulerAngles(
    	MemorySegment inAngles,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_S_EULER_ANGLES.get();
    	try {
    		 method.invokeExact(
    			inAngles,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sEulerAngles].
    public static void sEulerAngles(
    	Vec3 inAngles,
    	Quat outResult
    ) {
    	sEulerAngles(
    		inAngles.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Conversion to Euler angles. Rotation order is X then Y then Z (RotZ * RotY * RotX). Angles in radians.
    /// ```
    public static void getEulerAngles(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_GET_EULER_ANGLES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEulerAngles].
    public final void getEulerAngles(
    	Vec3 outResult
    ) {
    	getEulerAngles(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Squared length of quaternion.
    /// @return Squared length of quaternion (\f$|v|^2\f$)
    /// ```
    public static float lengthSq(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_QUAT_LENGTH_SQ.get();
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
    /// Length of quaternion.
    /// @return Length of quaternion (\f$|v|\f$)
    /// ```
    public static float length(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_QUAT_LENGTH.get();
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
    /// Normalize the quaternion (make it length 1)
    /// ```
    public static void normalized(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_NORMALIZED.get();
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
    	Quat outResult
    ) {
    	normalized(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply a quaternion with imaginary components and no real component (x, y, z, 0) with a quaternion
    /// ```
    public static void sMultiplyImaginary(
    	MemorySegment inLHS,
    	MemorySegment inRHS,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_S_MULTIPLY_IMAGINARY.get();
    	try {
    		 method.invokeExact(
    			inLHS,
    			inRHS,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sMultiplyImaginary].
    public static void sMultiplyImaginary(
    	Vec3 inLHS,
    	Quat inRHS,
    	Quat outResult
    ) {
    	sMultiplyImaginary(
    		inLHS.memorySegment(),
    		inRHS.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate a vector by the inverse of this quaternion
    /// ```
    public static void inverseRotate(
    	MemorySegment self,
    	MemorySegment inValue,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_INVERSE_ROTATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inValue,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#inverseRotate].
    public final void inverseRotate(
    	Vec3 inValue,
    	Vec3 outResult
    ) {
    	inverseRotate(
    		this.segment,
    		inValue.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate a the vector (1, 0, 0) with this quaternion
    /// ```
    public static void rotateAxisX(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_ROTATE_AXIS_X.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rotateAxisX].
    public final void rotateAxisX(
    	Vec3 outResult
    ) {
    	rotateAxisX(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate a the vector (0, 1, 0) with this quaternion
    /// ```
    public static void rotateAxisY(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_ROTATE_AXIS_Y.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rotateAxisY].
    public final void rotateAxisY(
    	Vec3 outResult
    ) {
    	rotateAxisY(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate a the vector (0, 0, 1) with this quaternion
    /// ```
    public static void rotateAxisZ(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_ROTATE_AXIS_Z.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rotateAxisZ].
    public final void rotateAxisZ(
    	Vec3 outResult
    ) {
    	rotateAxisZ(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Dot product
    /// ```
    public static float dot(
    	MemorySegment self,
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_QUAT_DOT.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inRHS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dot].
    public final float dot(
    	Quat inRHS
    ) {
    	return dot(
    		this.segment,
    		inRHS.memorySegment()
    	);
    }
    
    /// ```
    /// The conjugate [w, -x, -y, -z] is the same as the inverse for unit quaternions
    /// ```
    public static void conjugated(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_CONJUGATED.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#conjugated].
    public final void conjugated(
    	Quat outResult
    ) {
    	conjugated(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get inverse quaternion
    /// ```
    public static void inversed(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_INVERSED.get();
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
    	Quat outResult
    ) {
    	inversed(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Ensures that the W component is positive by negating the entire quaternion if it is not. This is useful when you want to store a quaternion as a 3 vector by discarding W and reconstructing it as sqrt(1 - x^2 - y^2 - z^2).
    /// ```
    public static void ensureWPositive(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_ENSURE_WPOSITIVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ensureWPositive].
    public final void ensureWPositive(
    	Quat outResult
    ) {
    	ensureWPositive(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get a quaternion that is perpendicular to this quaternion
    /// ```
    public static void getPerpendicular(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_GET_PERPENDICULAR.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPerpendicular].
    public final void getPerpendicular(
    	Quat outResult
    ) {
    	getPerpendicular(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get rotation angle around inAxis (uses Swing Twist Decomposition to get the twist quaternion and uses q(axis, angle) = [cos(angle / 2), axis * sin(angle / 2)])
    /// ```
    public static float getRotationAngle(
    	MemorySegment self,
    	MemorySegment inAxis
    ) {
    	MethodHandle method = JPH_QUAT_GET_ROTATION_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotationAngle].
    public final float getRotationAngle(
    	Vec3 inAxis
    ) {
    	return getRotationAngle(
    		this.segment,
    		inAxis.memorySegment()
    	);
    }
    
    /// ```
    /// Swing Twist Decomposition: any quaternion can be split up as:
    /// 
    /// \f[q = q_{swing} \: q_{twist}\f]
    /// 
    /// where \f$q_{twist}\f$ rotates only around axis v.
    /// 
    /// \f$q_{twist}\f$ is:
    /// 
    /// \f[q_{twist} = \frac{[q_w, q_{ijk} \cdot v \: v]}{\left|[q_w, q_{ijk} \cdot v \: v]\right|}\f]
    /// 
    /// where q_w is the real part of the quaternion and q_i the imaginary part (a 3 vector).
    /// 
    /// The swing can then be calculated as:
    /// 
    /// \f[q_{swing} = q \: q_{twist}^* \f]
    /// 
    /// Where \f$q_{twist}^*\f$ = complex conjugate of \f$q_{twist}\f$
    /// ```
    public static void getTwist(
    	MemorySegment self,
    	MemorySegment inAxis,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_GET_TWIST.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAxis,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTwist].
    public final void getTwist(
    	Vec3 inAxis,
    	Quat outResult
    ) {
    	getTwist(
    		this.segment,
    		inAxis.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Decomposes quaternion into swing and twist component:
    /// 
    /// \f$q = q_{swing} \: q_{twist}\f$
    /// 
    /// where \f$q_{swing} \: \hat{x} = q_{twist} \: \hat{y} = q_{twist} \: \hat{z} = 0\f$
    /// 
    /// In other words:
    /// 
    /// - \f$q_{twist}\f$ only rotates around the X-axis.
    /// - \f$q_{swing}\f$ only rotates around the Y and Z-axis.
    /// 
    /// @see Gino van den Bergen - Rotational Joint Limits in Quaternion Space - GDC 2016
    /// ```
    public static void getSwingTwist(
    	MemorySegment self,
    	MemorySegment outSwing,
    	MemorySegment outTwist
    ) {
    	MethodHandle method = JPH_QUAT_GET_SWING_TWIST.get();
    	try {
    		 method.invokeExact(
    			self,
    			outSwing,
    			outTwist
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwingTwist].
    public final void getSwingTwist(
    	Quat outSwing,
    	Quat outTwist
    ) {
    	getSwingTwist(
    		this.segment,
    		outSwing.memorySegment(),
    		outTwist.memorySegment()
    	);
    }
    
    /// ```
    /// Linear interpolation between two quaternions (for small steps).
    /// @param inFraction is in the range [0, 1]
    /// @param inDestination The destination quaternion
    /// @return (1 - inFraction) * this + fraction * inDestination
    /// ```
    public static void lERP(
    	MemorySegment self,
    	MemorySegment inDestination,
    	float inFraction,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_LERP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDestination,
    			inFraction,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lERP].
    public final void lERP(
    	Quat inDestination,
    	float inFraction,
    	Quat outResult
    ) {
    	lERP(
    		this.segment,
    		inDestination.memorySegment(),
    		inFraction,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Spherical linear interpolation between two quaternions.
    /// @param inFraction is in the range [0, 1]
    /// @param inDestination The destination quaternion
    /// @return When fraction is zero this quaternion is returned, when fraction is 1 inDestination is returned.
    /// When fraction is between 0 and 1 an interpolation along the shortest path is returned.
    /// ```
    public static void sLERP(
    	MemorySegment self,
    	MemorySegment inDestination,
    	float inFraction,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_SLERP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDestination,
    			inFraction,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sLERP].
    public final void sLERP(
    	Quat inDestination,
    	float inFraction,
    	Quat outResult
    ) {
    	sLERP(
    		this.segment,
    		inDestination.memorySegment(),
    		inFraction,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Load 3 floats from memory (X, Y and Z component and then calculates W) reads 32 bits extra which it doesn't use
    /// ```
    public static void sLoadFloat3Unsafe(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_S_LOAD_FLOAT3_UNSAFE.get();
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
    	Quat outResult
    ) {
    	sLoadFloat3Unsafe(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Store as 3 floats to memory (X, Y and Z component). Ensures that W is positive before storing.
    /// ```
    public static void storeFloat3(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_QUAT_STORE_FLOAT3.get();
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
    /// Store as 4 floats
    /// ```
    public static void storeFloat4(
    	MemorySegment self,
    	MemorySegment outV
    ) {
    	MethodHandle method = JPH_QUAT_STORE_FLOAT4.get();
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
    /// Compress a unit quaternion to a 32 bit value, precision is around 0.5 degree
    /// ```
    public static int compressUnitQuat(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_QUAT_COMPRESS_UNIT_QUAT.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#compressUnitQuat].
    public final int compressUnitQuat() {
    	return compressUnitQuat(
    		this.segment
    	);
    }
    
    /// ```
    /// Decompress a unit quaternion from a 32 bit value
    /// ```
    public static void sDecompressUnitQuat(
    	int inValue,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_QUAT_S_DECOMPRESS_UNIT_QUAT.get();
    	try {
    		 method.invokeExact(
    			inValue,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sDecompressUnitQuat].
    public static void sDecompressUnitQuat(
    	int inValue,
    	Quat outResult
    ) {
    	sDecompressUnitQuat(
    		inValue,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}