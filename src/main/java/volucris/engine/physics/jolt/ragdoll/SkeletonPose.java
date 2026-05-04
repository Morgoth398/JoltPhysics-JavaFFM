package volucris.engine.physics.jolt.ragdoll;

import java.lang.Throwable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Instance of a skeleton, contains the pose the current skeleton is in.
 */
public final class SkeletonPose {

	private static final MethodHandle JPH_SKELETON_POSE_CREATE;
	private static final MethodHandle JPH_SKELETON_POSE_DESTROY;
	private static final MethodHandle JPH_SKELETON_POSE_SET_SKELETON;
	private static final MethodHandle JPH_SKELETON_POSE_GET_SKELETON;
	private static final MethodHandle JPH_SKELETON_POSE_SET_ROOT_OFFSET;
	private static final MethodHandle JPH_SKELETON_POSE_GET_ROOT_OFFSET;
	private static final MethodHandle JPH_SKELETON_POSE_GET_JOINT_COUNT;
	private static final MethodHandle JPH_SKELETON_POSE_GET_JOINT_STATE;
	private static final MethodHandle JPH_SKELETON_POSE_SET_JOINT_STATE;
	private static final MethodHandle JPH_SKELETON_POSE_GET_JOINT_MATRIX;
	private static final MethodHandle JPH_SKELETON_POSE_SET_JOINT_MATRIX;
	private static final MethodHandle JPH_SKELETON_POSE_GET_JOINT_MATRICES;
	private static final MethodHandle JPH_SKELETON_POSE_SET_JOINT_MATRICES;
	private static final MethodHandle JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES;
	private static final MethodHandle JPH_SKELETON_POSE_CALCULATE_JOINT_STATES;
	private static final MethodHandle JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES;

	private final MemorySegment jphSkeletonPose;

	private Mat4 matTmp;
	private Quat quatTmp;
	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_SKELETON_POSE_CREATE = downcallHandle("JPH_SkeletonPose_Create", ADDRESS);
		JPH_SKELETON_POSE_DESTROY = downcallHandleVoid("JPH_SkeletonPose_Destroy", ADDRESS);
		JPH_SKELETON_POSE_SET_SKELETON = downcallHandleVoid("JPH_SkeletonPose_SetSkeleton", ADDRESS, ADDRESS);
		JPH_SKELETON_POSE_GET_SKELETON = downcallHandle("JPH_SkeletonPose_GetSkeleton", ADDRESS, ADDRESS);
		JPH_SKELETON_POSE_SET_ROOT_OFFSET = downcallHandleVoid("JPH_SkeletonPose_SetRootOffset", ADDRESS, ADDRESS);
		JPH_SKELETON_POSE_GET_ROOT_OFFSET = downcallHandleVoid("JPH_SkeletonPose_GetRootOffset", ADDRESS, ADDRESS);
		JPH_SKELETON_POSE_GET_JOINT_COUNT = downcallHandle("JPH_SkeletonPose_GetJointCount", JAVA_INT, ADDRESS);
		JPH_SKELETON_POSE_GET_JOINT_STATE = downcallHandleVoid("JPH_SkeletonPose_GetJointState", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_SKELETON_POSE_SET_JOINT_STATE = downcallHandleVoid("JPH_SkeletonPose_SetJointState", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_SKELETON_POSE_GET_JOINT_MATRIX = downcallHandleVoid("JPH_SkeletonPose_GetJointMatrix", ADDRESS, JAVA_INT, ADDRESS);
		JPH_SKELETON_POSE_SET_JOINT_MATRIX = downcallHandleVoid("JPH_SkeletonPose_SetJointMatrix", ADDRESS, JAVA_INT, ADDRESS);
		JPH_SKELETON_POSE_GET_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_GetJointMatrices", ADDRESS, ADDRESS, JAVA_INT);
		JPH_SKELETON_POSE_SET_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_SetJointMatrices", ADDRESS, ADDRESS, JAVA_INT);
		JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_CalculateJointMatrices", ADDRESS);
		JPH_SKELETON_POSE_CALCULATE_JOINT_STATES = downcallHandleVoid("JPH_SkeletonPose_CalculateJointStates", ADDRESS);
		JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES = downcallHandleVoid("JPH_SkeletonPose_CalculateLocalSpaceJointMatrices", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public SkeletonPose() {
		this(Arena.ofAuto());
	}

	public SkeletonPose(Arena arena) {
		try {
			MethodHandle method = JPH_SKELETON_POSE_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphSkeletonPose = segment.reinterpret(arena, s -> destroy(s));

			matTmp = new Mat4(arena);
			quatTmp = new Quat(arena);
			vecTmp = new Vec3(arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call create: " + className);
		}
	}

	/**
	 *  
	 */
	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_SKELETON_POSE_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call destroy: " + className);
		}
	}

	/**
	 *  
	 */
	public void setSkeleton(Skeleton skeleton) {
		try {
			MethodHandle method = JPH_SKELETON_POSE_SET_SKELETON;
			method.invokeExact(jphSkeletonPose, skeleton.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setSkeleton: " + className);
		}
	}

	/**
	 *  
	 */
	public Skeleton getSkeleton() {
		try {
			MethodHandle method = JPH_SKELETON_POSE_GET_SKELETON;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphSkeletonPose);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Skeleton skeleton = Jolt.getSkeleton(segment.address());
			if (skeleton != null)
				return skeleton;

			return new Skeleton(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get skeleton: " + className);
		}
	}

	/**
	 * Extra offset applied to the root (and therefore also to all of its children)
	 * .
	 */
	public void setRootOffset(Vector3f offset) {
		try {
			vecTmp.set(offset);

			MethodHandle method = JPH_SKELETON_POSE_SET_ROOT_OFFSET;
			method.invokeExact(jphSkeletonPose, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setRootOffset: " + className);
		}
	}

	/**
	 * Extra offset applied to the root (and therefore also to all of its children).
	 */
	public Vector3f getRootOffset(Vector3f target) {
		try {
			MethodHandle method = JPH_SKELETON_POSE_GET_ROOT_OFFSET;
			method.invokeExact(jphSkeletonPose, vecTmp.memorySegment());

			vecTmp.get(target);
			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getRootOffset: " + className);
		}
	}

	public Vector3f getRootOffset() {
		return getRootOffset(new Vector3f());
	}

	/**
	 *  
	 */
	public int getJointCount() {
		try {
			MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_COUNT;
			return (int) method.invokeExact(jphSkeletonPose);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getJointCount: " + className);
		}
	}

	/**
	 *  
	 */
	public void getJointState(int index, Vector3f translation, Quaternionf rotation) {
		try {
			MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_STATE;
			method.invokeExact(jphSkeletonPose, index, vecTmp.memorySegment(), quatTmp.memorySegment());

			vecTmp.get(translation);
			quatTmp.get(rotation);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getJointState: " + className);
		}
	}

	/**
	 *  
	 */
	public void setJointState(int index, Vector3f translation, Quaternionf rotation) {
		try {
			vecTmp.set(translation);
			quatTmp.set(rotation);

			MethodHandle method = JPH_SKELETON_POSE_SET_JOINT_STATE;
			method.invokeExact(jphSkeletonPose, index, vecTmp.memorySegment(), quatTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setJointState: " + className);
		}
	}

	/**
	 *  
	 */
	public Matrix4f getJointMatrix(int index, Matrix4f target) {
		try {
			MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_MATRIX;
			method.invokeExact(jphSkeletonPose, index, matTmp.memorySegment());

			matTmp.get(target);
			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getJointMatrix: " + className);
		}
	}

	/**
	 *  
	 */
	public Matrix4f getJointMatrix(int index) {
		return getJointMatrix(index, new Matrix4f());
	}

	/**
	 *  
	 */
	public void setJointMatrix(int index, Matrix4f matrix) {
		try {
			matTmp.set(matrix);

			MethodHandle method = JPH_SKELETON_POSE_SET_JOINT_MATRIX;
			method.invokeExact(jphSkeletonPose, index, matTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setJointMatrix: " + className);
		}
	}

	/**
	 *  
	 */
	public void getJointMatrices(Matrix4f[] matrices, int count) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(Mat4.LAYOUT(), count);

			MethodHandle method = JPH_SKELETON_POSE_GET_JOINT_MATRICES;
			method.invokeExact(jphSkeletonPose, array, count);

			for (int i = 0; i < count; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				MemorySegment.copy(array, offset, matTmp.memorySegment(), 0, Mat4.LAYOUT().byteSize());

				if (matrices[i] == null)
					matrices[i] = new Matrix4f();

				matTmp.get(matrices[i]);
			}
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getJointMatrices: " + className);
		}
	}

	/**
	 *  
	 */
	public void setJointMatrices(Matrix4f[] matrices, int count) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(Mat4.LAYOUT(), count);

			for (int i = 0; i < count; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(matrices[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, array, offset, Mat4.LAYOUT().byteSize());
			}

			MethodHandle method = JPH_SKELETON_POSE_SET_JOINT_MATRICES;
			method.invokeExact(jphSkeletonPose, array, count);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setJointMatrices: " + className);
		}
	}

	/**
	 * Convert the joint states to joint matrices.
	 */
	public void calculateJointMatrices() {
		try {
			MethodHandle method = JPH_SKELETON_POSE_CALCULATE_JOINT_MATRICES;
			method.invokeExact(jphSkeletonPose);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call calculateJointMatrices: " + className);
		}
	}

	/**
	 * Convert joint matrices to joint states.
	 */
	public void calculateJointStates() {
		try {
			MethodHandle method = JPH_SKELETON_POSE_CALCULATE_JOINT_STATES;
			method.invokeExact(jphSkeletonPose);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call calculateJointStates: " + className);
		}
	}

	/**
	 * Outputs the joint matrices in local space (ensure that matrices has
	 * GetJointCount() elements, assumes that values in GetJoints() is up to date)
	 */
	public void calculateLocalSpaceJointMatrices(Matrix4f[] matrices) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(Mat4.LAYOUT(), getJointCount());

			MethodHandle method = JPH_SKELETON_POSE_CALCULATE_LOCAL_SPACE_JOINT_MATRICES;
			method.invokeExact(jphSkeletonPose, array);

			int count = getJointCount();
			for (int i = 0; i < count; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				MemorySegment.copy(array, offset, matTmp.memorySegment(), 0, Mat4.LAYOUT().byteSize());

				if (matrices[i] == null)
					matrices[i] = new Matrix4f();

				matTmp.get(matrices[i]);
			}

		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call calculateLocalSpaceJointMatrices: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphSkeletonPose;
	}
}
