/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Mat44Array;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.renderer.DebugRenderer;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SkeletonPose {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_SET_SKELETON;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_SKELETON;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_SET_ROOT_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_ROOT_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_COUNT;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINTS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINTS1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_MATRICES;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_MATRICES1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_MATRIX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_GET_JOINT_MATRIX1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_CALCULATE_JOINT_STATES;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_POSE_DRAW;

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
		JPH_SKELETON_POSE_GET_JOINTS = downcallHandle("JPH_SkeletonPose_GetJoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_GET_JOINTS1 = downcallHandle("JPH_SkeletonPose_GetJoints1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_GET_JOINT = downcallHandle("JPH_SkeletonPose_GetJoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_POSE_GET_JOINT1 = downcallHandle("JPH_SkeletonPose_GetJoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_POSE_GET_JOINT_MATRICES = downcallHandle("JPH_SkeletonPose_GetJointMatrices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_GET_JOINT_MATRICES1 = downcallHandle("JPH_SkeletonPose_GetJointMatrices1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_GET_JOINT_MATRIX = downcallHandle("JPH_SkeletonPose_GetJointMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_POSE_GET_JOINT_MATRIX1 = downcallHandle("JPH_SkeletonPose_GetJointMatrix1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_CalculateJointMatrices", UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_CALCULATE_JOINT_STATES = downcallHandleVoid("JPH_SkeletonPose_CalculateJointStates", UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_CalculateLocalSpaceJointMatrices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_POSE_DRAW = downcallHandleVoid("JPH_SkeletonPose_Draw", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
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
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @name Skeleton
    /// @{
    /// ```
    public static void setSkeleton(
    	MemorySegment self,
    	MemorySegment inSkeleton
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_SET_SKELETON.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSkeleton
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSkeleton].
    public final void setSkeleton(
    	Skeleton inSkeleton
    ) {
    	setSkeleton(
    		this.segment,
    		inSkeleton.memorySegment()
    	);
    }
    
    public static MemorySegment getSkeleton(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_SKELETON.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
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
    
    /// ```
    /// Extra offset applied to the root (and therefore also to all of its children)
    /// ```
    public static void setRootOffset(
    	MemorySegment self,
    	MemorySegment inOffset
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_SET_ROOT_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRootOffset].
    public final void setRootOffset(
    	Vec3 inOffset
    ) {
    	setRootOffset(
    		this.segment,
    		inOffset.memorySegment()
    	);
    }
    
    public static void getRootOffset(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_ROOT_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRootOffset].
    public final void getRootOffset(
    	Vec3 outResult
    ) {
    	getRootOffset(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @name Properties of the joints
    /// @{
    /// ```
    public static int getJointCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			self
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
    
    public static MemorySegment getJoints(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoints].
    public final @Nullable JointStateArray getJoints() {
    	MemorySegment segment = getJoints(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointStateArray(segment);
    }
    
    public static MemorySegment getJoints1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINTS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoints1].
    public final @Nullable JointStateArray getJoints1() {
    	MemorySegment segment = getJoints1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointStateArray(segment);
    }
    
    public static MemorySegment getJoint(
    	MemorySegment self,
    	int inJoint
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inJoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoint].
    public final @Nullable JointState getJoint(
    	int inJoint
    ) {
    	MemorySegment segment = getJoint(
    		this.segment,
    		inJoint
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointState(segment);
    }
    
    public static MemorySegment getJoint1(
    	MemorySegment self,
    	int inJoint
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINT1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inJoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJoint1].
    public final @Nullable JointState getJoint1(
    	int inJoint
    ) {
    	MemorySegment segment = getJoint1(
    		this.segment,
    		inJoint
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new JointState(segment);
    }
    
    /// ```
    /// @name Joint matrices
    /// @{
    /// ```
    public static MemorySegment getJointMatrices(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_MATRICES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointMatrices].
    public final @Nullable Mat44Array getJointMatrices() {
    	MemorySegment segment = getJointMatrices(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Mat44Array(segment);
    }
    
    public static MemorySegment getJointMatrices1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_MATRICES1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointMatrices1].
    public final @Nullable Mat44Array getJointMatrices1() {
    	MemorySegment segment = getJointMatrices1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Mat44Array(segment);
    }
    
    public static MemorySegment getJointMatrix(
    	MemorySegment self,
    	int inJoint
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_MATRIX.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inJoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointMatrix].
    public final @Nullable Mat44 getJointMatrix(
    	int inJoint
    ) {
    	MemorySegment segment = getJointMatrix(
    		this.segment,
    		inJoint
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Mat44(segment);
    }
    
    public static MemorySegment getJointMatrix1(
    	MemorySegment self,
    	int inJoint
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_MATRIX1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inJoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getJointMatrix1].
    public final @Nullable Mat44 getJointMatrix1(
    	int inJoint
    ) {
    	MemorySegment segment = getJointMatrix1(
    		this.segment,
    		inJoint
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Mat44(segment);
    }
    
    /// ```
    /// Convert the joint states to joint matrices
    /// ```
    public static void calculateJointMatrices(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES.get();
    	try {
    		 method.invokeExact(
    			self
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
    
    /// ```
    /// Convert joint matrices to joint states
    /// ```
    public static void calculateJointStates(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_CALCULATE_JOINT_STATES.get();
    	try {
    		 method.invokeExact(
    			self
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
    
    /// ```
    /// Outputs the joint matrices in local space (ensure that outMatrices has GetJointCount() elements, assumes that values in GetJoints() is up to date)
    /// ```
    public static void calculateLocalSpaceJointMatrices(
    	MemorySegment self,
    	MemorySegment outMatrices
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outMatrices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateLocalSpaceJointMatrices].
    public final void calculateLocalSpaceJointMatrices(
    	Mat44 outMatrices
    ) {
    	calculateLocalSpaceJointMatrices(
    		this.segment,
    		outMatrices.memorySegment()
    	);
    }
    
    /// ```
    /// Draw current pose
    /// ```
    public static void draw(
    	MemorySegment self,
    	MemorySegment inDrawSettings,
    	MemorySegment inRenderer,
    	MemorySegment inOffset
    ) {
    	MethodHandle method = JPH_SKELETON_POSE_DRAW.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDrawSettings,
    			inRenderer,
    			inOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#draw].
    public final void draw(
    	DrawSettings inDrawSettings,
    	DebugRenderer inRenderer,
    	Mat44 inOffset
    ) {
    	draw(
    		this.segment,
    		inDrawSettings.memorySegment(),
    		inRenderer.memorySegment(),
    		inOffset.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}