/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public sealed class JointState
		permits Keyframe {

	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_JOINT_STATE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_JOINT_STATE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_JOINT_STATE_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_JOINT_STATE_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_JOINT_STATE_GET_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_JOINT_STATE_SET_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_JOINT_STATE_FROM_MATRIX;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_JOINT_STATE_TO_MATRIX;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETAL_ANIMATION_JOINT_STATE_CREATE = downcallHandle("JPH_SkeletalAnimationJointState_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_JOINT_STATE_DESTROY = downcallHandleVoid("JPH_SkeletalAnimationJointState_Destroy", UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_JOINT_STATE_GET_ROTATION = downcallHandleVoid("JPH_SkeletalAnimationJointState_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_JOINT_STATE_SET_ROTATION = downcallHandleVoid("JPH_SkeletalAnimationJointState_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_JOINT_STATE_GET_TRANSLATION = downcallHandleVoid("JPH_SkeletalAnimationJointState_GetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_JOINT_STATE_SET_TRANSLATION = downcallHandleVoid("JPH_SkeletalAnimationJointState_SetTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_JOINT_STATE_FROM_MATRIX = downcallHandleVoid("JPH_SkeletalAnimationJointState_FromMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_JOINT_STATE_TO_MATRIX = downcallHandleVoid("JPH_SkeletalAnimationJointState_ToMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public JointState() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public JointState(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public JointState(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_JOINT_STATE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_JOINT_STATE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Local space rotation of the joint
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_JOINT_STATE_GET_ROTATION.get();
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
    
    /// ```
    /// Local space rotation of the joint
    /// ```
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment mRotation
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_JOINT_STATE_SET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotation].
    public final void setRotation(
    	Quat mRotation
    ) {
    	setRotation(
    		this.segment,
    		mRotation.memorySegment()
    	);
    }
    
    /// ```
    /// Local space translation of the joint
    /// ```
    public static void getTranslation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_JOINT_STATE_GET_TRANSLATION.get();
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
    
    /// ```
    /// Local space translation of the joint
    /// ```
    public static void setTranslation(
    	MemorySegment self,
    	MemorySegment mTranslation
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_JOINT_STATE_SET_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTranslation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTranslation].
    public final void setTranslation(
    	Vec3 mTranslation
    ) {
    	setTranslation(
    		this.segment,
    		mTranslation.memorySegment()
    	);
    }
    
    /// ```
    /// Convert from a local space matrix
    /// ```
    public static void fromMatrix(
    	MemorySegment self,
    	MemorySegment inMatrix
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_JOINT_STATE_FROM_MATRIX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMatrix
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#fromMatrix].
    public final void fromMatrix(
    	Mat44 inMatrix
    ) {
    	fromMatrix(
    		this.segment,
    		inMatrix.memorySegment()
    	);
    }
    
    /// ```
    /// Convert to matrix representation
    /// ```
    public static void toMatrix(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_JOINT_STATE_TO_MATRIX.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#toMatrix].
    public final void toMatrix(
    	Mat44 outResult
    ) {
    	toMatrix(
    		this.segment,
    		outResult.memorySegment()
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