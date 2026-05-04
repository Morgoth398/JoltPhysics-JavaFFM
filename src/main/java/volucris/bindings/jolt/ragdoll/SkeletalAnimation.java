/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class SkeletalAnimation {

    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_GET_DURATION;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_IS_LOOPING;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_SET_IS_LOOPING;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_SCALE_JOINTS;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_SAMPLE;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINT_COUNT;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_ADD_ANIMATED_JOINT;
    private static final LazyConstant<MethodHandle> JPH_SKELETAL_ANIMATION_ADD_KEYFRAME;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SKELETAL_ANIMATION_CREATE = downcallHandle("JPH_SkeletalAnimation_Create", UNBOUNDED_ADDRESS);
        JPH_SKELETAL_ANIMATION_DESTROY = downcallHandleVoid("JPH_SkeletalAnimation_Destroy", UNBOUNDED_ADDRESS);
        JPH_SKELETAL_ANIMATION_GET_DURATION = downcallHandle("JPH_SkeletalAnimation_GetDuration", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SKELETAL_ANIMATION_IS_LOOPING = downcallHandle("JPH_SkeletalAnimation_IsLooping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_SKELETAL_ANIMATION_SET_IS_LOOPING = downcallHandleVoid("JPH_SkeletalAnimation_SetIsLooping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_SKELETAL_ANIMATION_SCALE_JOINTS = downcallHandleVoid("JPH_SkeletalAnimation_ScaleJoints", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SKELETAL_ANIMATION_SAMPLE = downcallHandleVoid("JPH_SkeletalAnimation_Sample", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINT_COUNT = downcallHandle("JPH_SkeletalAnimation_GetAnimatedJointCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SKELETAL_ANIMATION_ADD_ANIMATED_JOINT = downcallHandleVoid("JPH_SkeletalAnimation_AddAnimatedJoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETAL_ANIMATION_ADD_KEYFRAME = downcallHandleVoid("JPH_SkeletalAnimation_AddKeyframe", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public SkeletalAnimation() {
        this(Arena.ofAuto());
    }
    
    public SkeletalAnimation(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public SkeletalAnimation(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_SKELETAL_ANIMATION_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment animation
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_DESTROY.get();
        try {
            method.invokeExact(
                animation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static float getDuration(
        MemorySegment animation
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_GET_DURATION.get();
        try {
            return (float) method.invokeExact(
                animation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDuration}.
     */
    public final float getDuration(
    ) {
        return (float) getDuration(
            this.segment
        );
    }
    
    public static boolean isLooping(
        MemorySegment animation
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_IS_LOOPING.get();
        try {
            return (boolean) method.invokeExact(
                animation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isLooping}.
     */
    public final boolean isLooping(
    ) {
        return (boolean) isLooping(
            this.segment
        );
    }
    
    public static void setIsLooping(
        MemorySegment animation, 
        boolean looping
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_SET_IS_LOOPING.get();
        try {
            method.invokeExact(
                animation, 
                looping
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setIsLooping}.
     */
    public final void setIsLooping(
        boolean looping
    ) {
        setIsLooping(
            this.segment, 
            looping
        );
    }
    
    public static void scaleJoints(
        MemorySegment animation, 
        float scale
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_SCALE_JOINTS.get();
        try {
            method.invokeExact(
                animation, 
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #scaleJoints}.
     */
    public final void scaleJoints(
        float scale
    ) {
        scaleJoints(
            this.segment, 
            scale
        );
    }
    
    public static void sample(
        MemorySegment animation, 
        float time, 
        MemorySegment pose
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_SAMPLE.get();
        try {
            method.invokeExact(
                animation, 
                time, 
                pose
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #sample}.
     */
    public final void sample(
        float time, 
        SkeletonPose pose
    ) {
        sample(
            this.segment, 
            time, 
            pose.memorySegment()
        );
    }
    
    public static int getAnimatedJointCount(
        MemorySegment animation
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_GET_ANIMATED_JOINT_COUNT.get();
        try {
            return (int) method.invokeExact(
                animation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAnimatedJointCount}.
     */
    public final int getAnimatedJointCount(
    ) {
        return (int) getAnimatedJointCount(
            this.segment
        );
    }
    
    public static void addAnimatedJoint(
        MemorySegment animation, 
        MemorySegment jointName
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_ADD_ANIMATED_JOINT.get();
        try {
            method.invokeExact(
                animation, 
                jointName
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addAnimatedJoint}.
     */
    public final void addAnimatedJoint(
        NativeByteArray jointName
    ) {
        addAnimatedJoint(
            this.segment, 
            jointName.memorySegment()
        );
    }
    
    public static void addKeyframe(
        MemorySegment animation, 
        int jointIndex, 
        float time, 
        MemorySegment translation, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_SKELETAL_ANIMATION_ADD_KEYFRAME.get();
        try {
            method.invokeExact(
                animation, 
                jointIndex, 
                time, 
                translation, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addKeyframe}.
     */
    public final void addKeyframe(
        int jointIndex, 
        float time, 
        Vec3 translation, 
        Quat rotation
    ) {
        addKeyframe(
            this.segment, 
            jointIndex, 
            time, 
            translation.memorySegment(), 
            rotation.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}