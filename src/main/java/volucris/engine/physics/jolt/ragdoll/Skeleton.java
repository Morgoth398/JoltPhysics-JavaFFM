package volucris.engine.physics.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Resource that contains the joint hierarchy for a skeleton.
 */
public final class Skeleton {

	private static final MethodHandle JPH_SKELETON_CREATE;
	private static final MethodHandle JPH_SKELETON_DESTROY;
	private static final MethodHandle JPH_SKELETON_ADD_JOINT;
	private static final MethodHandle JPH_SKELETON_ADD_JOINT2;
	private static final MethodHandle JPH_SKELETON_ADD_JOINT3;
	private static final MethodHandle JPH_SKELETON_GET_JOINT_COUNT;
	private static final MethodHandle JPH_SKELETON_GET_JOINT;
	private static final MethodHandle JPH_SKELETON_GET_JOINT_INDEX;
	private static final MethodHandle JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES;
	private static final MethodHandle JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED;

	private final MemorySegment jphSkeleton;

	static {
		//@formatter:off
		JPH_SKELETON_CREATE = downcallHandle("JPH_Skeleton_Create", ADDRESS);
		JPH_SKELETON_DESTROY = downcallHandleVoid("JPH_Skeleton_Destroy", ADDRESS);
		JPH_SKELETON_ADD_JOINT = downcallHandle("JPH_Skeleton_AddJoint", JAVA_INT, ADDRESS, ADDRESS);
		JPH_SKELETON_ADD_JOINT2 = downcallHandle("JPH_Skeleton_AddJoint2", JAVA_INT, ADDRESS, ADDRESS, JAVA_INT);
		JPH_SKELETON_ADD_JOINT3 = downcallHandle("JPH_Skeleton_AddJoint3", JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_SKELETON_GET_JOINT_COUNT = downcallHandle("JPH_Skeleton_GetJointCount", JAVA_INT, ADDRESS);
		JPH_SKELETON_GET_JOINT = downcallHandleVoid("JPH_Skeleton_GetJoint", ADDRESS, JAVA_INT, ADDRESS);
		JPH_SKELETON_GET_JOINT_INDEX = downcallHandle("JPH_Skeleton_GetJointIndex", JAVA_INT, ADDRESS, ADDRESS);
		JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES = downcallHandleVoid("JPH_Skeleton_CalculateParentJointIndices", ADDRESS);
		JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED = downcallHandle("JPH_Skeleton_AreJointsCorrectlyOrdered", JAVA_BOOLEAN, ADDRESS);
		//@formatter:on
	}

	public Skeleton(MemorySegment segment) {
		jphSkeleton = segment;

		Jolt.addSkeleton(jphSkeleton.address(), this);
	}

	public Skeleton() {
		this(Arena.ofAuto());
	}
	
	public Skeleton(Arena arena) {
		try {
			MethodHandle method = JPH_SKELETON_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphSkeleton = segment.reinterpret(arena, s -> destroy(s));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create skeleton.");
		}

		Jolt.addSkeleton(jphSkeleton.address(), this);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_SKELETON_DESTROY;
			method.invokeExact(segment);

			Jolt.removeSkeleton(segment.address());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy skeleton.");
		}
	}

	/**
	 * 
	 */
	public int addJoint(String name) {
		try (Arena arena = Arena.ofConfined()) {
			MethodHandle method = JPH_SKELETON_ADD_JOINT;
			return (int) method.invokeExact(jphSkeleton, arena.allocateFrom(name));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add joint.");
		}
	}

	/**
	 * 
	 */
	public int addJoint(String name, int parentIndex) {
		try(Arena arena = Arena.ofConfined()) {
			MethodHandle method = JPH_SKELETON_ADD_JOINT2;
			return (int) method.invokeExact(jphSkeleton, arena.allocateFrom(name), parentIndex);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add joint.");
		}
	}

	/**
	 * 
	 */
	public int addJoint(String name, String parentName) {
		try(Arena arena = Arena.ofConfined()) {
			MethodHandle method = JPH_SKELETON_ADD_JOINT3;
			return (int) method.invokeExact(jphSkeleton, arena.allocateFrom(name), arena.allocateFrom(parentName));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call addJoint3.");
		}
	}

	/**
	 * 
	 */
	public int getJointCount() {
		try {
			MethodHandle method = JPH_SKELETON_GET_JOINT_COUNT;
			return (int) method.invokeExact(jphSkeleton);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get joint count.");
		}
	}

	/**
	 * 
	 */
	public SkeletonJoint getJoint(int index, SkeletonJoint target) {
		try {
			MethodHandle method = JPH_SKELETON_GET_JOINT;
			method.invokeExact(jphSkeleton, index, target.memorySegment());

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get joint.");
		}
	}

	/**
	 * 
	 */
	public SkeletonJoint getJoint(int index) {
		return getJoint(index, new SkeletonJoint());
	}

	/**
	 * 
	 */
	public int getJointIndex(String name) {
		try (Arena arena = Arena.ofConfined()) {
			MethodHandle method = JPH_SKELETON_GET_JOINT_INDEX;
			return (int) method.invokeExact(jphSkeleton, arena.allocateFrom(name));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get joint index.");
		}
	}

	/**
	 * Fill in parent joint indices based on name.
	 */
	public void calculateParentJointIndices() {
		try {
			MethodHandle method = JPH_SKELETON_CALCULATE_PARENT_JOINT_INDICES;
			method.invokeExact(jphSkeleton);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot calculate parent joint indices.");
		}
	}

	/**
	 * Many of the algorithms that use the Skeleton class require that parent joints
	 * are in the mJoints array before their children. This function returns true if
	 * this is the case, false if not.
	 */
	public boolean areJointsCorrectlyOrdered() {
		try {
			MethodHandle method = JPH_SKELETON_ARE_JOINTS_CORRECTLY_ORDERED;
			return (boolean) method.invokeExact(jphSkeleton);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if joints are correctly ordered.");
		}
	}

	public MemorySegment memorySegment() {
		return jphSkeleton;
	}

}