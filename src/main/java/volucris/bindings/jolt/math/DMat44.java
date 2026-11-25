/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DMat44 {

	private static final LazyConstant<MethodHandle> JPH_DMAT44_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_CREATE4;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_S_ZERO;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_S_IDENTITY;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_S_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_S_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_S_ROTATION_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_S_INVERSE_ROTATION_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_S_SCALE;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_TO_MAT44;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_IS_CLOSE;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_MULTIPLY3X3;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_MULTIPLY3X31;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_MULTIPLY3X3_TRANSPOSED;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_PRE_SCALED;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_POST_SCALED;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_PRE_TRANSLATED;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_PRE_TRANSLATED1;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_POST_TRANSLATED;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_POST_TRANSLATED1;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_AXIS_X;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_SET_AXIS_X;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_AXIS_Y;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_SET_AXIS_Y;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_AXIS_Z;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_SET_AXIS_Z;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_SET_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_COLUMN3;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_SET_COLUMN3;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_COLUMN4;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_SET_COLUMN4;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_TRANSPOSED3X3;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_INVERSED;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_INVERSED_ROTATION_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_QUATERNION;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_GET_DIRECTION_PRESERVING_MATRIX;
	private static final LazyConstant<MethodHandle> JPH_DMAT44_DECOMPOSE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DMAT44_CREATE = downcallHandle("JPH_DMat44_Create", UNBOUNDED_ADDRESS);
		JPH_DMAT44_CREATE1 = downcallHandle("JPH_DMat44_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_CREATE2 = downcallHandle("JPH_DMat44_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_CREATE3 = downcallHandle("JPH_DMat44_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_CREATE4 = downcallHandle("JPH_DMat44_Create4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_DESTROY = downcallHandleVoid("JPH_DMat44_Destroy", UNBOUNDED_ADDRESS);
		JPH_DMAT44_S_ZERO = downcallHandleVoid("JPH_DMat44_sZero", UNBOUNDED_ADDRESS);
		JPH_DMAT44_S_IDENTITY = downcallHandleVoid("JPH_DMat44_sIdentity", UNBOUNDED_ADDRESS);
		JPH_DMAT44_S_ROTATION = downcallHandleVoid("JPH_DMat44_sRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_S_TRANSLATION = downcallHandleVoid("JPH_DMat44_sTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_S_ROTATION_TRANSLATION = downcallHandleVoid("JPH_DMat44_sRotationTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_S_INVERSE_ROTATION_TRANSLATION = downcallHandleVoid("JPH_DMat44_sInverseRotationTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_S_SCALE = downcallHandleVoid("JPH_DMat44_sScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_TO_MAT44 = downcallHandleVoid("JPH_DMat44_ToMat44", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_IS_CLOSE = downcallHandle("JPH_DMat44_IsClose", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DMAT44_MULTIPLY3X3 = downcallHandleVoid("JPH_DMat44_Multiply3x3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_MULTIPLY3X31 = downcallHandleVoid("JPH_DMat44_Multiply3x31", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_MULTIPLY3X3_TRANSPOSED = downcallHandleVoid("JPH_DMat44_Multiply3x3Transposed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_PRE_SCALED = downcallHandleVoid("JPH_DMat44_PreScaled", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_POST_SCALED = downcallHandleVoid("JPH_DMat44_PostScaled", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_PRE_TRANSLATED = downcallHandleVoid("JPH_DMat44_PreTranslated", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_PRE_TRANSLATED1 = downcallHandleVoid("JPH_DMat44_PreTranslated1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_POST_TRANSLATED = downcallHandleVoid("JPH_DMat44_PostTranslated", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_POST_TRANSLATED1 = downcallHandleVoid("JPH_DMat44_PostTranslated1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_AXIS_X = downcallHandleVoid("JPH_DMat44_GetAxisX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_SET_AXIS_X = downcallHandleVoid("JPH_DMat44_SetAxisX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_AXIS_Y = downcallHandleVoid("JPH_DMat44_GetAxisY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_SET_AXIS_Y = downcallHandleVoid("JPH_DMat44_SetAxisY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_AXIS_Z = downcallHandleVoid("JPH_DMat44_GetAxisZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_SET_AXIS_Z = downcallHandleVoid("JPH_DMat44_SetAxisZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_TRANSLATION = downcallHandleVoid("JPH_DMat44_GetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_SET_TRANSLATION = downcallHandleVoid("JPH_DMat44_SetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_COLUMN3 = downcallHandleVoid("JPH_DMat44_GetColumn3", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DMAT44_SET_COLUMN3 = downcallHandleVoid("JPH_DMat44_SetColumn3", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_COLUMN4 = downcallHandleVoid("JPH_DMat44_GetColumn4", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DMAT44_SET_COLUMN4 = downcallHandleVoid("JPH_DMat44_SetColumn4", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_DMAT44_TRANSPOSED3X3 = downcallHandleVoid("JPH_DMat44_Transposed3x3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_INVERSED = downcallHandleVoid("JPH_DMat44_Inversed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_INVERSED_ROTATION_TRANSLATION = downcallHandleVoid("JPH_DMat44_InversedRotationTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_ROTATION = downcallHandleVoid("JPH_DMat44_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_SET_ROTATION = downcallHandleVoid("JPH_DMat44_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_QUATERNION = downcallHandleVoid("JPH_DMat44_GetQuaternion", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_GET_DIRECTION_PRESERVING_MATRIX = downcallHandleVoid("JPH_DMat44_GetDirectionPreservingMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DMAT44_DECOMPOSE = downcallHandleVoid("JPH_DMat44_Decompose", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DMat44() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public DMat44(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DMat44(
	    Vec4 inC1,
	    Vec4 inC2,
	    Vec4 inC3,
	    DVec3 inC4
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
	public DMat44(
		Arena arena,
		Vec4 inC1,
		Vec4 inC2,
		Vec4 inC3,
		DVec3 inC4
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

	public DMat44(
	    DMat44 inM2
	) {
	    this(
	        Arena.ofAuto(),
	        inM2
	    );
	}
	
	/// Typed method of [#create2].
	public DMat44(
		Arena arena,
		DMat44 inM2
	) {
		MemorySegment segment = create2(
			inM2.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DMat44(
	    Mat44 inM
	) {
	    this(
	        Arena.ofAuto(),
	        inM
	    );
	}
	
	/// Typed method of [#create3].
	public DMat44(
		Arena arena,
		Mat44 inM
	) {
		MemorySegment segment = create3(
			inM.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DMat44(
	    Mat44 inRot,
	    DVec3 inT
	) {
	    this(
	        Arena.ofAuto(),
	        inRot,
	        inT
	    );
	}
	
	/// Typed method of [#create4].
	public DMat44(
		Arena arena,
		Mat44 inRot,
		DVec3 inT
	) {
		MemorySegment segment = create4(
			inRot.memorySegment(),
			inT.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DMat44(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_DMAT44_CREATE.get();
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
    	MethodHandle method = JPH_DMAT44_CREATE1.get();
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
    	MemorySegment inM2
    ) {
    	MethodHandle method = JPH_DMAT44_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inM2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	MemorySegment inM
    ) {
    	MethodHandle method = JPH_DMAT44_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create4(
    	MemorySegment inRot,
    	MemorySegment inT
    ) {
    	MethodHandle method = JPH_DMAT44_CREATE4.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRot,
    			inT
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DMAT44_DESTROY.get();
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
    	MethodHandle method = JPH_DMAT44_S_ZERO.get();
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
    	DMat44 outResult
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
    	MethodHandle method = JPH_DMAT44_S_IDENTITY.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sIdentity].
    public final void sIdentity(
    	DMat44 outResult
    ) {
    	sIdentity(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate from quaternion
    /// ```
    public static void sRotation(
    	MemorySegment inQuat,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_S_ROTATION.get();
    	try {
    		 method.invokeExact(
    			inQuat,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRotation].
    public final void sRotation(
    	Quat inQuat,
    	DMat44 outResult
    ) {
    	sRotation(
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
    	MethodHandle method = JPH_DMAT44_S_TRANSLATION.get();
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
    public final void sTranslation(
    	DVec3 inV,
    	DMat44 outResult
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
    	MethodHandle method = JPH_DMAT44_S_ROTATION_TRANSLATION.get();
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
    public final void sRotationTranslation(
    	Quat inR,
    	DVec3 inT,
    	DMat44 outResult
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
    	MethodHandle method = JPH_DMAT44_S_INVERSE_ROTATION_TRANSLATION.get();
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
    public final void sInverseRotationTranslation(
    	Quat inR,
    	DVec3 inT,
    	DMat44 outResult
    ) {
    	sInverseRotationTranslation(
    		inR.memorySegment(),
    		inT.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get matrix that scales (produces a matrix with (inV, 1) on its diagonal)
    /// ```
    public static void sScale(
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_S_SCALE.get();
    	try {
    		 method.invokeExact(
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sScale].
    public final void sScale(
    	Vec3 inV,
    	DMat44 outResult
    ) {
    	sScale(
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Convert to Mat44 rounding to nearest
    /// ```
    public static void toMat44(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_TO_MAT44.get();
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
    
    /// ```
    /// Test if two matrices are close
    /// ```
    public static boolean isClose(
    	MemorySegment self,
    	MemorySegment inM2,
    	float inMaxDistSq
    ) {
    	MethodHandle method = JPH_DMAT44_IS_CLOSE.get();
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
    	DMat44 inM2,
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
    	MethodHandle method = JPH_DMAT44_MULTIPLY3X3.get();
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
    /// Multiply vector by only 3x3 part of the matrix
    /// ```
    public static void multiply3x31(
    	MemorySegment self,
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_MULTIPLY3X31.get();
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
    
    /// Typed method of [#multiply3x31].
    public final void multiply3x31(
    	DVec3 inV,
    	DVec3 outResult
    ) {
    	multiply3x31(
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
    	MethodHandle method = JPH_DMAT44_MULTIPLY3X3_TRANSPOSED.get();
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
    /// Scale a matrix: result = this * Mat44::sScale(inScale)
    /// ```
    public static void preScaled(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_PRE_SCALED.get();
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
    	DMat44 outResult
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
    	MethodHandle method = JPH_DMAT44_POST_SCALED.get();
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
    	DMat44 outResult
    ) {
    	postScaled(
    		this.segment,
    		inScale.memorySegment(),
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
    	MethodHandle method = JPH_DMAT44_PRE_TRANSLATED.get();
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
    	DMat44 outResult
    ) {
    	preTranslated(
    		this.segment,
    		inTranslation.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Pre multiply by translation matrix: result = this * Mat44::sTranslation(inTranslation)
    /// ```
    public static void preTranslated1(
    	MemorySegment self,
    	MemorySegment inTranslation,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_PRE_TRANSLATED1.get();
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
    
    /// Typed method of [#preTranslated1].
    public final void preTranslated1(
    	DVec3 inTranslation,
    	DMat44 outResult
    ) {
    	preTranslated1(
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
    	MethodHandle method = JPH_DMAT44_POST_TRANSLATED.get();
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
    	DMat44 outResult
    ) {
    	postTranslated(
    		this.segment,
    		inTranslation.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Post multiply by translation matrix: result = Mat44::sTranslation(inTranslation) * this (i.e. add inTranslation to the 4-th column)
    /// ```
    public static void postTranslated1(
    	MemorySegment self,
    	MemorySegment inTranslation,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_POST_TRANSLATED1.get();
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
    
    /// Typed method of [#postTranslated1].
    public final void postTranslated1(
    	DVec3 inTranslation,
    	DMat44 outResult
    ) {
    	postTranslated1(
    		this.segment,
    		inTranslation.memorySegment(),
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
    	MethodHandle method = JPH_DMAT44_GET_AXIS_X.get();
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
    	MethodHandle method = JPH_DMAT44_SET_AXIS_X.get();
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
    	MethodHandle method = JPH_DMAT44_GET_AXIS_Y.get();
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
    	MethodHandle method = JPH_DMAT44_SET_AXIS_Y.get();
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
    	MethodHandle method = JPH_DMAT44_GET_AXIS_Z.get();
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
    	MethodHandle method = JPH_DMAT44_SET_AXIS_Z.get();
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
    	MethodHandle method = JPH_DMAT44_GET_TRANSLATION.get();
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
    	DVec3 outResult
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
    	MethodHandle method = JPH_DMAT44_SET_TRANSLATION.get();
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
    	DVec3 inV
    ) {
    	setTranslation(
    		this.segment,
    		inV.memorySegment()
    	);
    }
    
    public static void getColumn3(
    	MemorySegment self,
    	int inCol,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_GET_COLUMN3.get();
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
    	MethodHandle method = JPH_DMAT44_SET_COLUMN3.get();
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
    	MethodHandle method = JPH_DMAT44_GET_COLUMN4.get();
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
    	MethodHandle method = JPH_DMAT44_SET_COLUMN4.get();
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
    /// Transpose 3x3 subpart of matrix
    /// ```
    public static void transposed3x3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_TRANSPOSED3X3.get();
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
    	MethodHandle method = JPH_DMAT44_INVERSED.get();
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
    	DMat44 outResult
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
    	MethodHandle method = JPH_DMAT44_INVERSED_ROTATION_TRANSLATION.get();
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
    	DMat44 outResult
    ) {
    	inversedRotationTranslation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get rotation part only (note: retains the first 3 values from the bottom row)
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_GET_ROTATION.get();
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
    /// Updates the rotation part of this matrix (the first 3 columns)
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment inRotation
    ) {
    	MethodHandle method = JPH_DMAT44_SET_ROTATION.get();
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
    	MethodHandle method = JPH_DMAT44_GET_QUATERNION.get();
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
    	MethodHandle method = JPH_DMAT44_GET_DIRECTION_PRESERVING_MATRIX.get();
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
    /// Works identical to Mat44::Decompose
    /// ```
    public static void decompose(
    	MemorySegment self,
    	MemorySegment outScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DMAT44_DECOMPOSE.get();
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
    	DMat44 outResult
    ) {
    	decompose(
    		this.segment,
    		outScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}