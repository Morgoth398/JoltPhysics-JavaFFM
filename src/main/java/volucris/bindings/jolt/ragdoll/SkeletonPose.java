/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

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
    
    /// Typed method of [#create].
    public SkeletonPose(Arena arena) {
    	MemorySegment segment = create();
    
    	if (segment.equals(MemorySegment.NULL))
    		throw new NullPointerException("Created segment is NULL.");
    
    	this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public SkeletonPose(MemorySegment segment) {
    	this.segment = segment;
    }

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_POSE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
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
    
    public static void setSkeleton(
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
    
    /// Typed method of [#setSkeleton].
    public final void setSkeleton(
    	Skeleton skeleton
    ) {
    	setSkeleton(
    		this.segment,
    		skeleton.memorySegment()
    	);
    }
    
    public static MemorySegment getSkeleton(
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
    
    /// Typed method of [#getSkeleton].
    public final @Nullable Skeleton getSkeleton() {
    	MemorySegment segment = getSkeleton(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Skeleton(segment);
    }
    
    public static void setRootOffset(
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
    
    /// Typed method of [#setRootOffset].
    public final void setRootOffset(
    	Vec3 offset
    ) {
    	setRootOffset(
    		this.segment,
    		offset.memorySegment()
    	);
    }
    
    public static void getRootOffset(
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
    
    /// Typed method of [#getRootOffset].
    public final void getRootOffset(
    	Vec3 result
    ) {
    	getRootOffset(
    		this.segment,
    		result.memorySegment()
    	);
    }
    
    public static int getJointCount(
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
    
    /// Typed method of [#getJointCount].
    public final int getJointCount() {
    	return getJointCount(
    		this.segment
    	);
    }
    
    public static void getJointState(
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
    
    /// Typed method of [#getJointState].
    public final void getJointState(
    	int index,
    	Vec3 outTranslation,
    	Quat outRotation
    ) {
    	getJointState(
    		this.segment,
    		index,
    		outTranslation.memorySegment(),
    		outRotation.memorySegment()
    	);
    }
    
    public static void setJointState(
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
    
    /// Typed method of [#setJointState].
    public final void setJointState(
    	int index,
    	Vec3 translation,
    	Quat rotation
    ) {
    	setJointState(
    		this.segment,
    		index,
    		translation.memorySegment(),
    		rotation.memorySegment()
    	);
    }
    
    public static void getJointMatrix(
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
    
    /// Typed method of [#getJointMatrix].
    public final void getJointMatrix(
    	int index,
    	Mat4 result
    ) {
    	getJointMatrix(
    		this.segment,
    		index,
    		result.memorySegment()
    	);
    }
    
    public static void setJointMatrix(
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
    
    /// Typed method of [#setJointMatrix].
    public final void setJointMatrix(
    	int index,
    	Mat4 matrix
    ) {
    	setJointMatrix(
    		this.segment,
    		index,
    		matrix.memorySegment()
    	);
    }
    
    public static void getJointMatrices(
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
    
    /// Typed method of [#getJointMatrices].
    public final void getJointMatrices(
    	Mat4 outMatrices,
    	int count
    ) {
    	getJointMatrices(
    		this.segment,
    		outMatrices.memorySegment(),
    		count
    	);
    }
    
    public static void setJointMatrices(
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
    
    /// Typed method of [#setJointMatrices].
    public final void setJointMatrices(
    	Mat4 matrices,
    	int count
    ) {
    	setJointMatrices(
    		this.segment,
    		matrices.memorySegment(),
    		count
    	);
    }
    
    public static void calculateJointMatrices(
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
    
    /// Typed method of [#calculateJointMatrices].
    public final void calculateJointMatrices() {
    	calculateJointMatrices(
    		this.segment
    	);
    }
    
    public static void calculateJointStates(
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
    
    /// Typed method of [#calculateJointStates].
    public final void calculateJointStates() {
    	calculateJointStates(
    		this.segment
    	);
    }
    
    public static void calculateLocalSpaceJointMatrices(
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
    
    /// Typed method of [#calculateLocalSpaceJointMatrices].
    public final void calculateLocalSpaceJointMatrices(
    	Mat4 outMatrices
    ) {
    	calculateLocalSpaceJointMatrices(
    		this.segment,
    		outMatrices.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}