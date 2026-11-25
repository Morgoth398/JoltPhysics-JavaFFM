/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Keyframe extends JointState {

	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_KEYFRAME_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_KEYFRAME_AS_JOINT_STATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_KEYFRAME_GET_TIME;
	private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_KEYFRAME_SET_TIME;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETAL_ANIMATION_KEYFRAME_CREATE = downcallHandle("JPH_SkeletalAnimationKeyframe_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_KEYFRAME_AS_JOINT_STATE = downcallHandle("JPH_SkeletalAnimationKeyframe_AsJointState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_KEYFRAME_GET_TIME = downcallHandle("JPH_SkeletalAnimationKeyframe_GetTime", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SKELETAL_ANIMATION_KEYFRAME_SET_TIME = downcallHandleVoid("JPH_SkeletalAnimationKeyframe_SetTime", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public Keyframe() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Keyframe(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asJointState(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public Keyframe(MemorySegment segment) {
		this.segment = segment;
		super(asJointState(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_KEYFRAME_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asJointState(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_KEYFRAME_AS_JOINT_STATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Time of keyframe in seconds
    /// ```
    public static float getTime(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_KEYFRAME_GET_TIME.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTime].
    public final float getTime() {
    	return getTime(
    		this.segment
    	);
    }
    
    /// ```
    /// Time of keyframe in seconds
    /// ```
    public static void setTime(
    	MemorySegment self,
    	float mTime
    ) {
    	MethodHandle method = JPH_SKELETAL_ANIMATION_KEYFRAME_SET_TIME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTime].
    public final void setTime(
    	float mTime
    ) {
    	setTime(
    		this.segment,
    		mTime
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}