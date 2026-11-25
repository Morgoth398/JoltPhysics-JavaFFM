/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class AnimatedJoint {

	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_GET_JOINT_NAME;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_SET_JOINT_NAME;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_GET_KEYFRAMES;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_SET_KEYFRAMES;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_CREATE = downcallHandle("JPH_SkeletalAnimationAnimatedJoint_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_DESTROY = downcallHandleVoid("JPH_SkeletalAnimationAnimatedJoint_Destroy", UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_GET_JOINT_NAME = downcallHandleVoid("JPH_SkeletalAnimationAnimatedJoint_GetJointName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_SET_JOINT_NAME = downcallHandleVoid("JPH_SkeletalAnimationAnimatedJoint_SetJointName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_GET_KEYFRAMES = downcallHandleVoid("JPH_SkeletalAnimationAnimatedJoint_GetKeyframes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_SET_KEYFRAMES = downcallHandleVoid("JPH_SkeletalAnimationAnimatedJoint_SetKeyframes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public AnimatedJoint() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public AnimatedJoint(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AnimatedJoint(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Name of the joint
    /// ```
    public static void getJointName(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_GET_JOINT_NAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointName].
    public final void getJointName(
    	BasicString2 outResult
    ) {
    	getJointName(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Name of the joint
    /// ```
    public static void setJointName(
    	MemorySegment self,
    	MemorySegment mJointName
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_SET_JOINT_NAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mJointName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setJointName].
    public final void setJointName(
    	BasicString2 mJointName
    ) {
    	setJointName(
    		this.segment,
    		mJointName.memorySegment()
    	);
    }
    
    /// ```
    /// List of keyframes over time
    /// ```
    public static void getKeyframes(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_GET_KEYFRAMES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getKeyframes].
    public final void getKeyframes(
    	Keyframes outResult
    ) {
    	getKeyframes(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// List of keyframes over time
    /// ```
    public static void setKeyframes(
    	MemorySegment self,
    	MemorySegment mKeyframes
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_ANIMATED_JOINT_SET_KEYFRAMES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mKeyframes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setKeyframes].
    public final void setKeyframes(
    	Keyframes mKeyframes
    ) {
    	setKeyframes(
    		this.segment,
    		mKeyframes.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}