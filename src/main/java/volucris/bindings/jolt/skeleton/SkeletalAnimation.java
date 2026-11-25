/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SkeletalAnimation extends SkeletalAnimationRefTarget {

	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_GET_DURATION;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_SCALE_JOINTS;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_SET_IS_LOOPING;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_IS_LOOPING;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_SAMPLE;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINTS;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINTS1;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_S_RESTORE_FROM_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETAL_ANIMATION_CREATE = downcallHandle("JPH_SkeletalAnimation_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_AS_REF_TARGET = downcallHandle("JPH_SkeletalAnimation_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_GET_DURATION = downcallHandle("JPH_SkeletalAnimation_GetDuration", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_SCALE_JOINTS = downcallHandleVoid("JPH_SkeletalAnimation_ScaleJoints", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SKELETAL_ANIMATION_SET_IS_LOOPING = downcallHandleVoid("JPH_SkeletalAnimation_SetIsLooping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SKELETAL_ANIMATION_IS_LOOPING = downcallHandle("JPH_SkeletalAnimation_IsLooping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_SAMPLE = downcallHandleVoid("JPH_SkeletalAnimation_Sample", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINTS = downcallHandle("JPH_SkeletalAnimation_GetAnimatedJoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINTS1 = downcallHandle("JPH_SkeletalAnimation_GetAnimatedJoints1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_SAVE_BINARY_STATE = downcallHandleVoid("JPH_SkeletalAnimation_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_S_RESTORE_FROM_BINARY_STATE = downcallHandleVoid("JPH_SkeletalAnimation_sRestoreFromBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_DESTROY = downcallHandleVoid("JPH_SkeletalAnimation_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SkeletalAnimation() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SkeletalAnimation(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SkeletalAnimation(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the length (in seconds) of this animation
    /// ```
    public static float getDuration(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_GET_DURATION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDuration].
    public final float getDuration() {
    	return getDuration(
    		this.segment
    	);
    }
    
    /// ```
    /// Scale the size of all joints by inScale
    /// ```
    public static void scaleJoints(
    	MemorySegment self,
    	float inScale
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_SCALE_JOINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#scaleJoints].
    public final void scaleJoints(
    	float inScale
    ) {
    	scaleJoints(
    		this.segment,
    		inScale
    	);
    }
    
    /// ```
    /// If the animation is looping or not. If an animation is looping, the animation will continue playing after completion
    /// ```
    public static void setIsLooping(
    	MemorySegment self,
    	boolean inIsLooping
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_SET_IS_LOOPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIsLooping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsLooping].
    public final void setIsLooping(
    	boolean inIsLooping
    ) {
    	setIsLooping(
    		this.segment,
    		inIsLooping
    	);
    }
    
    public static boolean isLooping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_IS_LOOPING.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isLooping].
    public final boolean isLooping() {
    	return isLooping(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the (interpolated) joint transforms at time inTime
    /// ```
    public static void sample(
    	MemorySegment self,
    	float inTime,
    	MemorySegment ioPose
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_SAMPLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTime,
    			ioPose
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sample].
    public final void sample(
    	float inTime,
    	SkeletonPose ioPose
    ) {
    	sample(
    		this.segment,
    		inTime,
    		ioPose.memorySegment()
    	);
    }
    
    /// ```
    /// Get joint samples
    /// ```
    public static MemorySegment getAnimatedJoints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAnimatedJoints].
    public final @Nullable AnimatedJointArray getAnimatedJoints() {
    	MemorySegment segment = getAnimatedJoints(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AnimatedJointArray(segment);
    }
    
    public static MemorySegment getAnimatedJoints1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINTS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAnimatedJoints1].
    public final @Nullable AnimatedJointArray getAnimatedJoints1() {
    	MemorySegment segment = getAnimatedJoints1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AnimatedJointArray(segment);
    }
    
    /// ```
    /// Saves the state of this animation in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restore a saved ragdoll from inStream
    /// ```
    public static void sRestoreFromBinaryState(
    	MemorySegment inStream,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_S_RESTORE_FROM_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreFromBinaryState].
    public final void sRestoreFromBinaryState(
    	StreamIn inStream,
    	AnimationResult outResult
    ) {
    	sRestoreFromBinaryState(
    		inStream.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}