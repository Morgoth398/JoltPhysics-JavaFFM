package volucris.engine.physics.jolt.ragdoll;

import java.lang.Throwable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;

import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that is able to map a low detail (ragdoll) skeleton to a high detail
 * (animation) skeleton and vice versa.
 */
public final class SkeletonMapper {

	private static final MethodHandle JPH_SKELETON_MAPPER_CREATE;
	private static final MethodHandle JPH_SKELETON_MAPPER_DESTROY;
	private static final MethodHandle JPH_SKELETON_MAPPER_INITIALIZE;
	private static final MethodHandle JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS;
	private static final MethodHandle JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS;
	private static final MethodHandle JPH_SKELETON_MAPPER_MAP;
	private static final MethodHandle JPH_SKELETON_MAPPER_MAP_REVERSE;
	private static final MethodHandle JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_INDEX;
	private static final MethodHandle JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED;

	private final MemorySegment jphSkeletonMapper;

	private Mat4 matTmp;

	static {
		//@formatter:off
		JPH_SKELETON_MAPPER_CREATE = downcallHandle("JPH_SkeletonMapper_Create", ADDRESS);
		JPH_SKELETON_MAPPER_DESTROY = downcallHandleVoid("JPH_SkeletonMapper_Destroy", ADDRESS);
		JPH_SKELETON_MAPPER_INITIALIZE = downcallHandleVoid("JPH_SkeletonMapper_Initialize", ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS = downcallHandleVoid("JPH_SkeletonMapper_LockAllTranslations", ADDRESS, ADDRESS, ADDRESS);
		JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS = downcallHandleVoid("JPH_SkeletonMapper_LockTranslations", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SKELETON_MAPPER_MAP = downcallHandleVoid("JPH_SkeletonMapper_Map", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SKELETON_MAPPER_MAP_REVERSE = downcallHandleVoid("JPH_SkeletonMapper_MapReverse", ADDRESS, ADDRESS, ADDRESS);
		JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_INDEX = downcallHandle("JPH_SkeletonMapper_GetMappedJointIndex", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED = downcallHandle("JPH_SkeletonMapper_IsJointTranslationLocked", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public SkeletonMapper() {
		this(Arena.ofAuto());
	}

	public SkeletonMapper(Arena arena) {
		try {
			MethodHandle method = JPH_SKELETON_MAPPER_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphSkeletonMapper = segment.reinterpret(arena, s -> destroy(s));

			matTmp = new Mat4(arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create skeleton mapper: " + className);
		}
	}

	/**
	 *  
	 */
	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_SKELETON_MAPPER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call destroy: " + className);
		}
	}

	/**
	 * Initialize the skeleton mapper. Skeleton 1 should be the (low detail) ragdoll
	 * skeleton and skeleton 2 the (high detail) animation skeleton. We assume that
	 * each joint in skeleton 1 can be mapped to a joint in skeleton 2 (if not
	 * mapping from animation skeleton to ragdoll skeleton will be undefined).
	 * Skeleton 2 should have the same hierarchy as skeleton 1 but can contain extra
	 * joints between those in skeleton 1 and it can have extra joints at the root
	 * and leaves of the skeleton.
	 * 
	 * @param skeleton1    Source skeleton to map from.
	 * @param neutralPose1 Neutral pose of the source skeleton (model space)
	 * @param skeleton2    Target skeleton to map to.
	 * @param neutralPose2 Neutral pose of the target skeleton (model space),
	 *                     inNeutralPose1 and inNeutralPose2 must match as closely
	 *                     as possible, preferably the position of the mappable
	 *                     joints should be identical.
	 */
	public void initialize(Skeleton skeleton1, Matrix4f[] neutralPose1, Skeleton skeleton2, Matrix4f[] neutralPose2) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment pose1 = arena.allocate(Mat4.LAYOUT(), neutralPose1.length);
			for (int i = 0; i < neutralPose1.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(neutralPose1[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, pose1, offset, Mat4.LAYOUT().byteSize());
			}
			MemorySegment pose2 = arena.allocate(Mat4.LAYOUT(), neutralPose2.length);
			for (int i = 0; i < neutralPose2.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(neutralPose2[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, pose2, offset, Mat4.LAYOUT().byteSize());
			}

			MemorySegment skeleton1Addr = skeleton1.memorySegment();
			MemorySegment skeleton2Addr = skeleton2.memorySegment();

			MethodHandle method = JPH_SKELETON_MAPPER_INITIALIZE;
			method.invokeExact(jphSkeletonMapper, skeleton1Addr, pose1, skeleton2Addr, pose2);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call initialize: " + className);
		}
	}

	/**
	 * After Initialize(), this can be called to lock the translation of all joints
	 * in skeleton 2 below the first mapped joint to those of the neutral pose.
	 * Because constraints are never 100% rigid, there's always a little bit of
	 * stretch in the ragdoll when the ragdoll is under stress. Locking the
	 * translations of the pose will remove the visual stretch from the ragdoll but
	 * will introduce a difference between the physical simulation and the visual
	 * representation.
	 * 
	 * @param skeleton2    Target skeleton to map to.
	 * @param neutralPose2 Neutral pose to take reference translations from
	 */
	public void lockAllTranslations(Skeleton skeleton2, Matrix4f[] neutralPose2) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment pose2 = arena.allocate(Mat4.LAYOUT(), neutralPose2.length);
			for (int i = 0; i < neutralPose2.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(neutralPose2[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, pose2, offset, Mat4.LAYOUT().byteSize());
			}

			MethodHandle method = JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS;
			method.invokeExact(jphSkeletonMapper, skeleton2.memorySegment(), pose2);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call lockAllTranslations: " + className);
		}
	}

	/**
	 * This can be called so lock the translation of a specified set of joints in
	 * skeleton 2. Because constraints are never 100% rigid, there's always a little
	 * bit of stretch in the ragdoll when the ragdoll is under stress. Locking the
	 * translations of the pose will remove the visual stretch from the ragdoll but
	 * will introduce a difference between the physical simulation and the visual
	 * representation.
	 * 
	 * @param skeleton2          Target skeleton to map to.
	 * @param lockedTranslations An array of bools the size of
	 *                           skeleton2->GetJointCount(), for each joint
	 *                           indicating if the joint is locked.
	 * @param neutralPose2       Neutral pose to take reference translations from
	 */
	public void lockTranslations(Skeleton skeleton2, boolean[] lockedTranslations, Matrix4f[] neutralPose2) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment pose2 = arena.allocate(Mat4.LAYOUT(), neutralPose2.length);
			for (int i = 0; i < neutralPose2.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(neutralPose2[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, pose2, offset, Mat4.LAYOUT().byteSize());
			}

			MemorySegment array = arena.allocate(JAVA_BOOLEAN, lockedTranslations.length);
			for (int i = 0; i < lockedTranslations.length; i++)
				array.setAtIndex(JAVA_BOOLEAN, i, lockedTranslations[i]);

			MethodHandle method = JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS;
			method.invokeExact(jphSkeletonMapper, skeleton2.memorySegment(), array, pose2);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call lockTranslations: " + className);
		}
	}

	/**
	 * Map a pose. Joints that were directly mappable will be copied in model space
	 * from pose 1 to pose 2. Any joints that are only present in skeleton 2 will
	 * get their model space transform calculated through the local space transforms
	 * of pose 2. Joints that are part of a joint chain between two mapped joints
	 * will be reoriented towards the next joint in skeleton 1. This means that it
	 * is possible for unmapped joints to have some animation, but very extreme
	 * animation poses will show artifacts.
	 * 
	 * @param pose1ModelSpace Pose on skeleton 1 in model space
	 * @param pose2LocalSpace Pose on skeleton 2 in local space (used for the joints
	 *                        that cannot be mapped)
	 * @param pose2ModelSpace Model space pose on skeleton 2 (the output of the
	 *                        mapping)
	 */
	public void map(Matrix4f[] pose1ModelSpace, Matrix4f[] pose2LocalSpace, Matrix4f[] pose2ModelSpace) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment pose1 = arena.allocate(Mat4.LAYOUT(), pose1ModelSpace.length);
			for (int i = 0; i < pose1ModelSpace.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(pose1ModelSpace[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, pose1, offset, Mat4.LAYOUT().byteSize());
			}
			MemorySegment pose2 = arena.allocate(Mat4.LAYOUT(), pose2LocalSpace.length);
			for (int i = 0; i < pose2LocalSpace.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(pose2LocalSpace[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, pose2, offset, Mat4.LAYOUT().byteSize());
			}
			MemorySegment target = arena.allocate(Mat4.LAYOUT(), pose2ModelSpace.length);

			MethodHandle method = JPH_SKELETON_MAPPER_MAP;
			method.invokeExact(jphSkeletonMapper, pose1, pose2, target);

			for (int i = 0; i < pose2ModelSpace.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				MemorySegment.copy(target, offset, matTmp.memorySegment(), 0, Mat4.LAYOUT().byteSize());

				if (pose2ModelSpace[i] == null)
					pose2ModelSpace[i] = new Matrix4f();

				matTmp.get(pose2ModelSpace[i]);
			}
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call map: " + className);
		}
	}

	/**
	 * Reverse map a pose, this will only use the mappings and not the chains (it
	 * assumes that all joints in skeleton 1 are mapped)
	 * 
	 * @param pose2ModelSpace Model space pose on skeleton 2
	 * @param pose1ModelSpace When the function returns this will contain the model
	 *                        space pose for skeleton 1
	 */
	public void mapReverse(Matrix4f[] pose2ModelSpace, Matrix4f[] pose1ModelSpace) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment pose2 = arena.allocate(Mat4.LAYOUT(), pose2ModelSpace.length);
			for (int i = 0; i < pose2ModelSpace.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(pose2ModelSpace[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, pose2, offset, Mat4.LAYOUT().byteSize());
			}
			MemorySegment target = arena.allocate(Mat4.LAYOUT(), pose1ModelSpace.length);

			MethodHandle method = JPH_SKELETON_MAPPER_MAP_REVERSE;
			method.invokeExact(jphSkeletonMapper, pose2, target);

			for (int i = 0; i < pose1ModelSpace.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				MemorySegment.copy(target, offset, matTmp.memorySegment(), 0, Mat4.LAYOUT().byteSize());

				if (pose1ModelSpace[i] == null)
					pose1ModelSpace[i] = new Matrix4f();

				matTmp.get(pose1ModelSpace[i]);
			}
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call mapReverse: " + className);
		}
	}

	/**
	 * Search through the directly mapped joints (mMappings) and find inJoint1Index,
	 * returns the corresponding Joint2Index or -1 if not found.
	 */
	public int getMappedJointIndex(int joint1Index) {
		try {
			MethodHandle method = JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_INDEX;
			return (int) method.invokeExact(jphSkeletonMapper, joint1Index);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getMappedJointIndex: " + className);
		}
	}

	/**
	 * Search through the locked translations (mLockedTranslations) and find if
	 * joint inJoint2Index is locked.
	 */
	public boolean isJointTranslationLocked(int joint2Index) {
		try {
			MethodHandle method = JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED;
			return (boolean) method.invokeExact(jphSkeletonMapper, joint2Index);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call isJointTranslationLocked: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphSkeletonMapper;
	}
}
