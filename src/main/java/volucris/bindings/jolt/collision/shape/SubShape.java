/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SubShape {

	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_IS_ROTATION_IDENTITY;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_IS_ROTATION_IDENTITY;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_FROM_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_LOCAL_TRANSFORM_NO_SCALE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_IS_VALID_SCALE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_TRANSFORM_SCALE;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_POSITION_COM;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_POSITION_COM;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_ROTATION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COMPOUND_SHAPE_SUB_SHAPE_CREATE = downcallHandle("JPH_CompoundShapeSubShape_Create", UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_DESTROY = downcallHandleVoid("JPH_CompoundShapeSubShape_Destroy", UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_SHAPE = downcallHandleVoid("JPH_CompoundShapeSubShape_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_SHAPE = downcallHandleVoid("JPH_CompoundShapeSubShape_SetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_USER_DATA = downcallHandle("JPH_CompoundShapeSubShape_GetUserData", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_USER_DATA = downcallHandleVoid("JPH_CompoundShapeSubShape_SetUserData", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_IS_ROTATION_IDENTITY = downcallHandle("JPH_CompoundShapeSubShape_GetIsRotationIdentity", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_IS_ROTATION_IDENTITY = downcallHandleVoid("JPH_CompoundShapeSubShape_SetIsRotationIdentity", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_FROM_SETTINGS = downcallHandle("JPH_CompoundShapeSubShape_FromSettings", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_TRANSFORM = downcallHandleVoid("JPH_CompoundShapeSubShape_SetTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_LOCAL_TRANSFORM_NO_SCALE = downcallHandleVoid("JPH_CompoundShapeSubShape_GetLocalTransformNoScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_IS_VALID_SCALE = downcallHandle("JPH_CompoundShapeSubShape_IsValidScale", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_TRANSFORM_SCALE = downcallHandleVoid("JPH_CompoundShapeSubShape_TransformScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_POSITION_COM = downcallHandleVoid("JPH_CompoundShapeSubShape_SetPositionCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_POSITION_COM = downcallHandleVoid("JPH_CompoundShapeSubShape_GetPositionCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_ROTATION = downcallHandleVoid("JPH_CompoundShapeSubShape_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_ROTATION = downcallHandleVoid("JPH_CompoundShapeSubShape_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SubShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SubShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SubShape(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getShape(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShape].
    public final void getShape(
    	ShapeRefConst outResult
    ) {
    	getShape(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setShape(
    	MemorySegment self,
    	MemorySegment mShape
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape].
    public final void setShape(
    	ShapeRefConst mShape
    ) {
    	setShape(
    		this.segment,
    		mShape.memorySegment()
    	);
    }
    
    /// ```
    /// User data value (put here because it falls in padding bytes)
    /// ```
    public static int getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_USER_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final int getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    /// ```
    /// User data value (put here because it falls in padding bytes)
    /// ```
    public static void setUserData(
    	MemorySegment self,
    	int mUserData
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	int mUserData
    ) {
    	setUserData(
    		this.segment,
    		mUserData
    	);
    }
    
    /// ```
    /// If mRotation is close to identity (put here because it falls in padding bytes)
    /// ```
    public static boolean getIsRotationIdentity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_IS_ROTATION_IDENTITY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsRotationIdentity].
    public final boolean getIsRotationIdentity() {
    	return getIsRotationIdentity(
    		this.segment
    	);
    }
    
    /// ```
    /// If mRotation is close to identity (put here because it falls in padding bytes)
    /// ```
    public static void setIsRotationIdentity(
    	MemorySegment self,
    	boolean mIsRotationIdentity
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_IS_ROTATION_IDENTITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsRotationIdentity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsRotationIdentity].
    public final void setIsRotationIdentity(
    	boolean mIsRotationIdentity
    ) {
    	setIsRotationIdentity(
    		this.segment,
    		mIsRotationIdentity
    	);
    }
    
    /// ```
    /// Initialize sub shape from sub shape settings
    /// @param inSettings Settings object
    /// @param outResult Result object, only used in case of error
    /// @return True on success, false on failure
    /// ```
    public static boolean fromSettings(
    	MemorySegment self,
    	MemorySegment inSettings,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_FROM_SETTINGS.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inSettings,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#fromSettings].
    public final boolean fromSettings(
    	SubShapeSettings inSettings,
    	ShapeResult outResult
    ) {
    	return fromSettings(
    		this.segment,
    		inSettings.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Update the transform of this sub shape
    /// @param inPosition New position
    /// @param inRotation New orientation
    /// @param inCenterOfMass The center of mass of the compound shape
    /// ```
    public static void setTransform(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inCenterOfMass
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inRotation,
    			inCenterOfMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTransform].
    public final void setTransform(
    	Vec3 inPosition,
    	Quat inRotation,
    	Vec3 inCenterOfMass
    ) {
    	setTransform(
    		this.segment,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inCenterOfMass.memorySegment()
    	);
    }
    
    /// ```
    /// Get the local transform for this shape given the scale of the child shape
    /// The total transform of the child shape will be GetLocalTransformNoScale(inScale) * Mat44::sScaling(TransformScale(inScale))
    /// @param inScale The scale of the child shape (in local space of this shape)
    /// ```
    public static void getLocalTransformNoScale(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_LOCAL_TRANSFORM_NO_SCALE.get();
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
    
    /// Typed method of [#getLocalTransformNoScale].
    public final void getLocalTransformNoScale(
    	Vec3 inScale,
    	Mat44 outResult
    ) {
    	getLocalTransformNoScale(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Test if inScale is valid for this sub shape
    /// ```
    public static boolean isValidScale(
    	MemorySegment self,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_IS_VALID_SCALE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isValidScale].
    public final boolean isValidScale(
    	Vec3 inScale
    ) {
    	return isValidScale(
    		this.segment,
    		inScale.memorySegment()
    	);
    }
    
    /// ```
    /// Transform the scale to the local space of the child shape
    /// ```
    public static void transformScale(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_TRANSFORM_SCALE.get();
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
    
    /// Typed method of [#transformScale].
    public final void transformScale(
    	Vec3 inScale,
    	Vec3 outResult
    ) {
    	transformScale(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Compress the center of mass position
    /// ```
    public static void setPositionCOM(
    	MemorySegment self,
    	MemorySegment inPositionCOM
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_POSITION_COM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPositionCOM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPositionCOM].
    public final void setPositionCOM(
    	Vec3 inPositionCOM
    ) {
    	setPositionCOM(
    		this.segment,
    		inPositionCOM.memorySegment()
    	);
    }
    
    /// ```
    /// Uncompress the center of mass position
    /// ```
    public static void getPositionCOM(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_POSITION_COM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPositionCOM].
    public final void getPositionCOM(
    	Vec3 outResult
    ) {
    	getPositionCOM(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Compress the rotation
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment inRotation
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_SET_ROTATION.get();
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
    	Quat inRotation
    ) {
    	setRotation(
    		this.segment,
    		inRotation.memorySegment()
    	);
    }
    
    /// ```
    /// Uncompress the rotation
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COMPOUND_SHAPE_SUB_SHAPE_GET_ROTATION.get();
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
    	Quat outResult
    ) {
    	getRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}