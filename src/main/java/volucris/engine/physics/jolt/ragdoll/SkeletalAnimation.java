package volucris.engine.physics.jolt.ragdoll;

import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Resource for a skinned animation.
 */
public final class SkeletalAnimation {

	private static final MethodHandle JPH_SKELETAL_ANIMATION_CREATE;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_DESTROY;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_GET_DURATION;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_IS_LOOPING;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_SET_IS_LOOPING;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_SCALE_JOINTS;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_SAMPLE;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINT_COUNT;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_ADD_ANIMATED_JOINT;
	private static final MethodHandle JPH_SKELETAL_ANIMATION_ADD_KEYFRAME;

	private final MemorySegment jphSkeletalAnimation;

	private Quat quatTmp;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_SKELETAL_ANIMATION_CREATE = downcallHandle("JPH_SkeletalAnimation_Create", ADDRESS);
		JPH_SKELETAL_ANIMATION_DESTROY = downcallHandleVoid("JPH_SkeletalAnimation_Destroy", ADDRESS);
		JPH_SKELETAL_ANIMATION_GET_DURATION = downcallHandle("JPH_SkeletalAnimation_GetDuration", JAVA_FLOAT, ADDRESS);
		JPH_SKELETAL_ANIMATION_IS_LOOPING = downcallHandle("JPH_SkeletalAnimation_IsLooping", JAVA_BOOLEAN, ADDRESS);
		JPH_SKELETAL_ANIMATION_SET_IS_LOOPING = downcallHandleVoid("JPH_SkeletalAnimation_SetIsLooping", ADDRESS, JAVA_BOOLEAN);
		JPH_SKELETAL_ANIMATION_SCALE_JOINTS = downcallHandleVoid("JPH_SkeletalAnimation_ScaleJoints", ADDRESS, JAVA_FLOAT);
		JPH_SKELETAL_ANIMATION_SAMPLE = downcallHandleVoid("JPH_SkeletalAnimation_Sample", ADDRESS, JAVA_FLOAT, ADDRESS);
		JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINT_COUNT = downcallHandle("JPH_SkeletalAnimation_GetAnimatedJointCount", JAVA_INT, ADDRESS);
		JPH_SKELETAL_ANIMATION_ADD_ANIMATED_JOINT = downcallHandleVoid("JPH_SkeletalAnimation_AddAnimatedJoint", ADDRESS, ADDRESS);
		JPH_SKELETAL_ANIMATION_ADD_KEYFRAME = downcallHandleVoid("JPH_SkeletalAnimation_AddKeyframe", ADDRESS, JAVA_INT, JAVA_FLOAT, ADDRESS, ADDRESS);
		//@formatter:on
	}

	/**
	 *  
	 */
	public SkeletalAnimation() {
		this(Arena.ofAuto());
	}
	
	/**
	 *  
	 */
	public SkeletalAnimation(Arena arena) {
		try {
			MethodHandle method = JPH_SKELETAL_ANIMATION_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphSkeletalAnimation = segment.reinterpret(arena, s -> destroy(s));

			quatTmp = new Quat(arena);
			vecTmp = new Vec3(arena);

		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot create sekeletal animation.");
		}
	}

	/**
	 *  
	 */
	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_SKELETAL_ANIMATION_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot call destroy.");
		}
	}

	/**
	 * Get the length (in seconds) of this animation.
	 */
	public float getDuration() {
		try {
			MethodHandle method = JPH_SKELETAL_ANIMATION_GET_DURATION;
			return (float) method.invokeExact(jphSkeletalAnimation);
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot get duration.");
		}
	}

	/**
	 * If the animation is looping or not. If an animation is looping, the animation
	 * will continue playing after completion.
	 */
	public boolean isLooping() {
		try {
			MethodHandle method = JPH_SKELETAL_ANIMATION_IS_LOOPING;
			return (boolean) method.invokeExact(jphSkeletalAnimation);
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot call isLooping.");
		}
	}

	/**
	 * If the animation is looping or not. If an animation is looping, the animation
	 * will continue playing after completion.
	 */
	public void setIsLooping(boolean looping) {
		try {
			MethodHandle method = JPH_SKELETAL_ANIMATION_SET_IS_LOOPING;
			method.invokeExact(jphSkeletalAnimation, looping);
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot set isLooping.");
		}
	}

	/**
	 * Scale the size of all joints by scale.
	 */
	public void scaleJoints(float scale) {
		try {
			MethodHandle method = JPH_SKELETAL_ANIMATION_SCALE_JOINTS;
			method.invokeExact(jphSkeletalAnimation, scale);
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot scale joints.");
		}
	}

	/**
	 *  Get the (interpolated) joint transforms at time. 
	 */
	public void sample(float time, SkeletonPose pose) {
		try {
			MethodHandle method = JPH_SKELETAL_ANIMATION_SAMPLE;
			method.invokeExact(jphSkeletalAnimation, time, pose.memorySegment());
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot call sample.");
		}
	}

	/**
	 *  
	 */
	public int getAnimatedJointCount() {
		try {
			MethodHandle method = JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINT_COUNT;
			return (int) method.invokeExact(jphSkeletalAnimation);
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot call getAnimatedJointCount.");
		}
	}

	/**
	 *  
	 */
	public void addAnimatedJoint(String jointName) {
		try (Arena arena = Arena.ofConfined()) {
			MethodHandle method = JPH_SKELETAL_ANIMATION_ADD_ANIMATED_JOINT;
			method.invokeExact(jphSkeletalAnimation, arena.allocateFrom(jointName));
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot call addAnimatedJoint.");
		}
	}

	/**
	 *  
	 */
	public void addKeyframe(int jointIndex, float time, Vector3f translation, Quaternionf rotation) {
		try {
			vecTmp.set(translation);
			quatTmp.set(rotation);

			MethodHandle method = JPH_SKELETAL_ANIMATION_ADD_KEYFRAME;
			method.invokeExact(jphSkeletalAnimation, jointIndex, time, vecTmp.memorySegment(), quatTmp.memorySegment());
		} catch (Throwable throwable) {
			throw new RuntimeException("Jolt: Cannot add keyframe.");
		}
	}

	public MemorySegment memorySegment() {
		return jphSkeletalAnimation;
	}
}
