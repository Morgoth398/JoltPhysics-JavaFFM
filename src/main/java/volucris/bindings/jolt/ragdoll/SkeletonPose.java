/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public class SkeletonPose {

    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_SET_SKELETON;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_SKELETON;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_SET_ROOT_OFFSET;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_ROOT_OFFSET;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_COUNT;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_STATE;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_SET_JOINT_STATE;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_MATRIX;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_SET_JOINT_MATRIX;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_MATRICES;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_SET_JOINT_MATRICES;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_CALCULATE_JOINT_STATES;
    private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SKELETON_POSE_CREATE = downcallHandle("JPH_SkeletonPose_Create", UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_DESTROY = downcallHandleVoid("JPH_SkeletonPose_Destroy", UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_SET_SKELETON = downcallHandleVoid("JPH_SkeletonPose_SetSkeleton", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_GET_SKELETON = downcallHandle("JPH_SkeletonPose_GetSkeleton", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_SET_ROOT_OFFSET = downcallHandleVoid("JPH_SkeletonPose_SetRootOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_GET_ROOT_OFFSET = downcallHandleVoid("JPH_SkeletonPose_GetRootOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_GET_JOINT_COUNT = downcallHandle("JPH_SkeletonPose_GetJointCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_GET_JOINT_STATE = downcallHandleVoid("JPH_SkeletonPose_GetJointState", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_SET_JOINT_STATE = downcallHandleVoid("JPH_SkeletonPose_SetJointState", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_GET_JOINT_MATRIX = downcallHandleVoid("JPH_SkeletonPose_GetJointMatrix", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_SET_JOINT_MATRIX = downcallHandleVoid("JPH_SkeletonPose_SetJointMatrix", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_GET_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_GetJointMatrices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SKELETON_POSE_SET_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_SetJointMatrices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_CalculateJointMatrices", UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_CALCULATE_JOINT_STATES = downcallHandleVoid("JPH_SkeletonPose_CalculateJointStates", UNBOUNDED_ADDRESS);
        JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_CalculateLocalSpaceJointMatrices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public SkeletonPose() {
        this(Arena.ofAuto());
    }
    
    public SkeletonPose(Arena arena) {
        MemorySegment segment = skeletonPose_Create();
        this.segment = segment.reinterpret(arena, s -> skeletonPose_Destroy(s));
    }
    
    public SkeletonPose(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment skeletonPose_Create() {
        MethodHandle method = JPH_SKELETON_POSE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void skeletonPose_Destroy(
        MemorySegment pose
    ) {
        MethodHandle method = JPH_SKELETON_POSE_DESTROY.get();
        try {
            method.invokeExact(
                pose
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void skeletonPose_SetSkeleton(
        MemorySegment pose, 
        MemorySegment skeleton
    ) {
        MethodHandle method = JPH_SKELETON_POSE_SET_SKELETON.get();
        try {
            method.invokeExact(
                pose, 
                skeleton
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_SetSkeleton}.
     */
    public final void skeletonPose_SetSkeleton(
        SkeletonPose pose, 
        Skeleton skeleton
    ) {
        skeletonPose_SetSkeleton(
            pose.memorySegment(), 
            skeleton.memorySegment()
        );
    }
    
    public static MemorySegment skeletonPose_GetSkeleton(
        MemorySegment pose
    ) {
        MethodHandle method = JPH_SKELETON_POSE_GET_SKELETON.get();
        try {
            return (MemorySegment) method.invokeExact(
                pose
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_GetSkeleton}.
     */
    public final @Nullable Skeleton skeletonPose_GetSkeleton(
        SkeletonPose pose
    ) {
        MemorySegment segment = skeletonPose_GetSkeleton(
            pose.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Skeleton(segment);
    }
    
    public static void skeletonPose_SetRootOffset(
        MemorySegment pose, 
        MemorySegment offset
    ) {
        MethodHandle method = JPH_SKELETON_POSE_SET_ROOT_OFFSET.get();
        try {
            method.invokeExact(
                pose, 
                offset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_SetRootOffset}.
     */
    public final void skeletonPose_SetRootOffset(
        SkeletonPose pose, 
        Vec3 offset
    ) {
        skeletonPose_SetRootOffset(
            pose.memorySegment(), 
            offset.memorySegment()
        );
    }
    
    public static void skeletonPose_GetRootOffset(
        MemorySegment pose, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SKELETON_POSE_GET_ROOT_OFFSET.get();
        try {
            method.invokeExact(
                pose, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_GetRootOffset}.
     */
    public final void skeletonPose_GetRootOffset(
        SkeletonPose pose, 
        Vec3 result
    ) {
        skeletonPose_GetRootOffset(
            pose.memorySegment(), 
            result.memorySegment()
        );
    }
    
    public static int skeletonPose_GetJointCount(
        MemorySegment pose
    ) {
        MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_COUNT.get();
        try {
            return (int) method.invokeExact(
                pose
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_GetJointCount}.
     */
    public final int skeletonPose_GetJointCount(
        SkeletonPose pose
    ) {
        return (int) skeletonPose_GetJointCount(
            pose.memorySegment()
        );
    }
    
    public static void skeletonPose_GetJointState(
        MemorySegment pose, 
        int index, 
        MemorySegment outTranslation, 
        MemorySegment outRotation
    ) {
        MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_STATE.get();
        try {
            method.invokeExact(
                pose, 
                index, 
                outTranslation, 
                outRotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_GetJointState}.
     */
    public final void skeletonPose_GetJointState(
        SkeletonPose pose, 
        int index, 
        Vec3 outTranslation, 
        Quat outRotation
    ) {
        skeletonPose_GetJointState(
            pose.memorySegment(), 
            index, 
            outTranslation.memorySegment(), 
            outRotation.memorySegment()
        );
    }
    
    public static void skeletonPose_SetJointState(
        MemorySegment pose, 
        int index, 
        MemorySegment translation, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_SKELETON_POSE_SET_JOINT_STATE.get();
        try {
            method.invokeExact(
                pose, 
                index, 
                translation, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_SetJointState}.
     */
    public final void skeletonPose_SetJointState(
        SkeletonPose pose, 
        int index, 
        Vec3 translation, 
        Quat rotation
    ) {
        skeletonPose_SetJointState(
            pose.memorySegment(), 
            index, 
            translation.memorySegment(), 
            rotation.memorySegment()
        );
    }
    
    public static void skeletonPose_GetJointMatrix(
        MemorySegment pose, 
        int index, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_MATRIX.get();
        try {
            method.invokeExact(
                pose, 
                index, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_GetJointMatrix}.
     */
    public final void skeletonPose_GetJointMatrix(
        SkeletonPose pose, 
        int index, 
        Mat4 result
    ) {
        skeletonPose_GetJointMatrix(
            pose.memorySegment(), 
            index, 
            result.memorySegment()
        );
    }
    
    public static void skeletonPose_SetJointMatrix(
        MemorySegment pose, 
        int index, 
        MemorySegment matrix
    ) {
        MethodHandle method = JPH_SKELETON_POSE_SET_JOINT_MATRIX.get();
        try {
            method.invokeExact(
                pose, 
                index, 
                matrix
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_SetJointMatrix}.
     */
    public final void skeletonPose_SetJointMatrix(
        SkeletonPose pose, 
        int index, 
        Mat4 matrix
    ) {
        skeletonPose_SetJointMatrix(
            pose.memorySegment(), 
            index, 
            matrix.memorySegment()
        );
    }
    
    public static void skeletonPose_GetJointMatrices(
        MemorySegment pose, 
        MemorySegment outMatrices, 
        int count
    ) {
        MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_MATRICES.get();
        try {
            method.invokeExact(
                pose, 
                outMatrices, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_GetJointMatrices}.
     */
    public final void skeletonPose_GetJointMatrices(
        SkeletonPose pose, 
        Mat4 outMatrices, 
        int count
    ) {
        skeletonPose_GetJointMatrices(
            pose.memorySegment(), 
            outMatrices.memorySegment(), 
            count
        );
    }
    
    public static void skeletonPose_SetJointMatrices(
        MemorySegment pose, 
        MemorySegment matrices, 
        int count
    ) {
        MethodHandle method = JPH_SKELETON_POSE_SET_JOINT_MATRICES.get();
        try {
            method.invokeExact(
                pose, 
                matrices, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_SetJointMatrices}.
     */
    public final void skeletonPose_SetJointMatrices(
        SkeletonPose pose, 
        Mat4 matrices, 
        int count
    ) {
        skeletonPose_SetJointMatrices(
            pose.memorySegment(), 
            matrices.memorySegment(), 
            count
        );
    }
    
    public static void skeletonPose_CalculateJointMatrices(
        MemorySegment pose
    ) {
        MethodHandle method = JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES.get();
        try {
            method.invokeExact(
                pose
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_CalculateJointMatrices}.
     */
    public final void skeletonPose_CalculateJointMatrices(
        SkeletonPose pose
    ) {
        skeletonPose_CalculateJointMatrices(
            pose.memorySegment()
        );
    }
    
    public static void skeletonPose_CalculateJointStates(
        MemorySegment pose
    ) {
        MethodHandle method = JPH_SKELETON_POSE_CALCULATE_JOINT_STATES.get();
        try {
            method.invokeExact(
                pose
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_CalculateJointStates}.
     */
    public final void skeletonPose_CalculateJointStates(
        SkeletonPose pose
    ) {
        skeletonPose_CalculateJointStates(
            pose.memorySegment()
        );
    }
    
    public static void skeletonPose_CalculateLocalSpaceJointMatrices(
        MemorySegment pose, 
        MemorySegment outMatrices
    ) {
        MethodHandle method = JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES.get();
        try {
            method.invokeExact(
                pose, 
                outMatrices
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #skeletonPose_CalculateLocalSpaceJointMatrices}.
     */
    public final void skeletonPose_CalculateLocalSpaceJointMatrices(
        SkeletonPose pose, 
        Mat4 outMatrices
    ) {
        skeletonPose_CalculateLocalSpaceJointMatrices(
            pose.memorySegment(), 
            outMatrices.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}