package volucris.engine.physics.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.JoltEnums.Activation;
import volucris.engine.physics.jolt.constraint.Constraint;
import volucris.engine.physics.jolt.constraint.TwoBodyConstraint;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Runtime ragdoll information.
 */
public final class Ragdoll {

	private static final MethodHandle JPH_RAGDOLL_DESTROY;
	private static final MethodHandle JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM;
	private static final MethodHandle JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM;
	private static final MethodHandle JPH_RAGDOLL_ACTIVATE;
	private static final MethodHandle JPH_RAGDOLL_IS_ACTIVE;
	private static final MethodHandle JPH_RAGDOLL_RESET_WARM_START;
	private static final MethodHandle JPH_RAGDOLL_SET_POSE;
	private static final MethodHandle JPH_RAGDOLL_SET_POSE2;
	private static final MethodHandle JPH_RAGDOLL_GET_POSE;
	private static final MethodHandle JPH_RAGDOLL_GET_POSE2;
	private static final MethodHandle JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS;
	private static final MethodHandle JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS;
	private static final MethodHandle JPH_RAGDOLL_GET_BODY_COUNT;
	private static final MethodHandle JPH_RAGDOLL_GET_BODY_ID;
	private static final MethodHandle JPH_RAGDOLL_GET_CONSTRAINT_COUNT;
	private static final MethodHandle JPH_RAGDOLL_GET_CONSTRAINT;
	private static final MethodHandle JPH_RAGDOLL_GET_ROOT_TRANSFORM;
	private static final MethodHandle JPH_RAGDOLL_GET_RAGDOLL_SETTINGS;

	private final MemorySegment jphRagdoll;

	private Mat4 matTmp;
	private Quat quatTmp;
	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_RAGDOLL_DESTROY = downcallHandleVoid("JPH_Ragdoll_Destroy", ADDRESS);
		JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Ragdoll_AddToPhysicsSystem", ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Ragdoll_RemoveFromPhysicsSystem", ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_ACTIVATE = downcallHandleVoid("JPH_Ragdoll_Activate", ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_IS_ACTIVE = downcallHandle("JPH_Ragdoll_IsActive", JAVA_BOOLEAN, ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_RESET_WARM_START = downcallHandleVoid("JPH_Ragdoll_ResetWarmStart", ADDRESS);
		JPH_RAGDOLL_SET_POSE = downcallHandleVoid("JPH_Ragdoll_SetPose", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_SET_POSE2 = downcallHandleVoid("JPH_Ragdoll_SetPose2", ADDRESS, ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_GET_POSE = downcallHandleVoid("JPH_Ragdoll_GetPose", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_GET_POSE2 = downcallHandleVoid("JPH_Ragdoll_GetPose2", ADDRESS, ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS = downcallHandleVoid("JPH_Ragdoll_DriveToPoseUsingMotors", ADDRESS, ADDRESS);
		JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS = downcallHandleVoid("JPH_Ragdoll_DriveToPoseUsingKinematics", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
		JPH_RAGDOLL_GET_BODY_COUNT = downcallHandle("JPH_Ragdoll_GetBodyCount", JAVA_INT, ADDRESS);
		JPH_RAGDOLL_GET_BODY_ID = downcallHandle("JPH_Ragdoll_GetBodyID", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_RAGDOLL_GET_CONSTRAINT_COUNT = downcallHandle("JPH_Ragdoll_GetConstraintCount", JAVA_INT, ADDRESS);
		JPH_RAGDOLL_GET_CONSTRAINT = downcallHandle("JPH_Ragdoll_GetConstraint", ADDRESS, ADDRESS, JAVA_INT);
		JPH_RAGDOLL_GET_ROOT_TRANSFORM = downcallHandleVoid("JPH_Ragdoll_GetRootTransform", ADDRESS, ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_GET_RAGDOLL_SETTINGS = downcallHandle("JPH_Ragdoll_GetRagdollSettings", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected Ragdoll(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected Ragdoll(MemorySegment segment, Arena arena) {
		jphRagdoll = segment.reinterpret(arena, s -> destroy(s));

		matTmp = new Mat4(arena);
		quatTmp = new Quat(arena);
		vecTmp = new Vec3(arena);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_RAGDOLL_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy ragdoll: " + className);
		}
	}

	/**
	 * Add bodies and constraints to the system and optionally activate the bodies.
	 */
	public void addToPhysicsSystem(boolean lockBodies) {
		addToPhysicsSystem(Activation.ACTIVATE, lockBodies);
	}

	/**
	 * Add bodies and constraints to the system and optionally activate the bodies.
	 */
	public void addToPhysicsSystem(Activation activationMode) {
		addToPhysicsSystem(activationMode, true);
	}

	/**
	 * Add bodies and constraints to the system and optionally activate the bodies.
	 */
	public void addToPhysicsSystem(Activation activationMode, boolean lockBodies) {
		try {
			MethodHandle method = JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM;
			method.invokeExact(jphRagdoll, activationMode.id(), lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add to physics system: " + className);
		}
	}

	/**
	 * Remove bodies and constraints from the system.
	 */
	public void removeFromPhysicsSystem() {
		removeFromPhysicsSystem(true);
	}

	/**
	 * Remove bodies and constraints from the system.
	 */
	public void removeFromPhysicsSystem(boolean lockBodies) {
		try {
			MethodHandle method = JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM;
			method.invokeExact(jphRagdoll, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove from physics system: " + className);
		}
	}

	/**
	 * Wake up all bodies in the ragdoll.
	 */
	public void activate() {
		activate(true);
	}

	/**
	 * Wake up all bodies in the ragdoll.
	 */
	public void activate(boolean lockBodies) {
		try {
			MethodHandle method = JPH_RAGDOLL_ACTIVATE;
			method.invokeExact(jphRagdoll, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot activate: " + className);
		}
	}

	/**
	 * @see #isActive(boolean)
	 */
	public boolean isActive() {
		return isActive(true);
	}

	/**
	 * Check if one or more of the bodies in the ragdoll are active. Note that this
	 * involves locking the bodies (if inLockBodies is true) and looping over them.
	 * An alternative and possibly faster way could be to install a
	 * BodyActivationListener and count the number of active bodies of a ragdoll as
	 * they're activated / deactivated (basically check if the body that activates /
	 * deactivates is in GetBodyIDs() and increment / decrement a counter).
	 */
	public boolean isActive(boolean lockBodies) {
		try {
			MethodHandle method = JPH_RAGDOLL_IS_ACTIVE;
			return (boolean) method.invokeExact(jphRagdoll, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call is active: " + className);
		}
	}

	/**
	 * This function calls ResetWarmStart on all constraints. It can be used after
	 * calling SetPose to reset previous frames impulses. See:
	 * {@link Constraint#resetWarmStart()}
	 */
	public void resetWarmStart() {
		try {
			MethodHandle method = JPH_RAGDOLL_RESET_WARM_START;
			method.invokeExact(jphRagdoll);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot reset warm start: " + className);
		}
	}

	/**
	 * Set the ragdoll to a pose (calls BodyInterface::SetPositionAndRotation to
	 * instantly move the ragdoll)
	 */
	public void setPose(SkeletonPose pose, boolean lockBodies) {
		try {
			MethodHandle method = JPH_RAGDOLL_SET_POSE;
			method.invokeExact(jphRagdoll, pose.memorySegment(), lockBodies);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setPose: " + className);
		}
	}

	/**
	 * Set the ragdoll to a pose (calls BodyInterface::SetPositionAndRotation to
	 * instantly move the ragdoll)
	 */
	public void setPose(Vector3f rootOffset, Matrix4f[] jointMatrices, boolean lockBodies) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(Mat4.LAYOUT(), jointMatrices.length);
			for (int i = 0; i < jointMatrices.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				matTmp.set(jointMatrices[i]);
				MemorySegment.copy(matTmp.memorySegment(), 0, array, offset, Mat4.LAYOUT().byteSize());
			}

			vecTmp.set(rootOffset);

			MethodHandle method = JPH_RAGDOLL_SET_POSE2;
			method.invokeExact(jphRagdoll, vecTmp.memorySegment(), array, lockBodies);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setPose2: " + className);
		}
	}

	/**
	 * Get the ragdoll pose (uses the world transform of the bodies to calculate the
	 * pose)
	 */
	public void getPose(SkeletonPose pose, boolean lockBodies) {
		try {
			MethodHandle method = JPH_RAGDOLL_GET_POSE;
			method.invokeExact(jphRagdoll, pose.memorySegment(), lockBodies);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getPose: " + className);
		}
	}

	/**
	 * Lower level version of GetPose that directly returns the world space joint
	 * matrices.
	 */
	public void getPose(Vector3f rootOffset, Matrix4f[] jointMatrices, boolean lockBodies) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(Mat4.LAYOUT(), jointMatrices.length);

			MethodHandle method = JPH_RAGDOLL_GET_POSE2;
			method.invokeExact(jphRagdoll, vecTmp.memorySegment(), array, lockBodies);

			vecTmp.get(rootOffset);

			for (int i = 0; i < jointMatrices.length; i++) {
				long offset = i * Mat4.LAYOUT().byteSize();
				MemorySegment.copy(array, offset, matTmp.memorySegment(), 0, Mat4.LAYOUT().byteSize());

				if (jointMatrices[i] == null)
					jointMatrices[i] = new Matrix4f();

				matTmp.get(jointMatrices[i]);
			}

		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getPose2: " + className);
		}
	}

	/**
	 * Drive the ragdoll to a specific pose by activating the motors on each
	 * constraint.
	 */
	public void driveToPoseUsingMotors(SkeletonPose pose) {
		try {
			MethodHandle method = JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS;
			method.invokeExact(jphRagdoll, pose.memorySegment());
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call driveToPoseUsingMotors: " + className);
		}
	}

	/**
	 * Drive the ragdoll to a specific pose by setting velocities on each of the
	 * bodies so that it will reach inPose in inDeltaTime.
	 */
	public void driveToPoseUsingKinematics(SkeletonPose pose, float deltaTime, boolean lockBodies) {
		try {
			MethodHandle method = JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS;
			method.invokeExact(jphRagdoll, pose.memorySegment(), deltaTime, lockBodies);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call driveToPoseUsingKinematics: " + className);
		}
	}

	/**
	 * Get number of bodies in the ragdoll.
	 */
	public int getBodyCount() {
		try {
			MethodHandle method = JPH_RAGDOLL_GET_BODY_COUNT;
			return (int) method.invokeExact(jphRagdoll);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getBodyCount: " + className);
		}
	}

	/**
	 * Access a body ID.
	 */
	public int getBodyID(int bodyIndex) {
		try {
			MethodHandle method = JPH_RAGDOLL_GET_BODY_ID;
			return (int) method.invokeExact(jphRagdoll, bodyIndex);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getBodyID: " + className);
		}
	}

	/**
	 * Get number of constraints in the ragdoll.
	 */
	public int getConstraintCount() {
		try {
			MethodHandle method = JPH_RAGDOLL_GET_CONSTRAINT_COUNT;
			return (int) method.invokeExact(jphRagdoll);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getConstraintCount: " + className);
		}
	}

	/**
	 * Access a constraint by index.
	 */
	public TwoBodyConstraint getConstraint(int constraintIndex) {
		try {
			MethodHandle method = JPH_RAGDOLL_GET_CONSTRAINT;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphRagdoll, constraintIndex);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Constraint constraint = Jolt.getConstraint(segment.address());
			if (constraint != null)
				return constraint.asTwoBodyConstraint();

			return new TwoBodyConstraint(segment, false);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getConstraint: " + className);
		}
	}

	/**
	 * Get the position and orientation of the root of the ragdoll.
	 */
	public void getRootTransform(Vector3f position, Quaternionf rotation, boolean lockBodies) {
		try {
			MethodHandle method = JPH_RAGDOLL_GET_ROOT_TRANSFORM;
			method.invokeExact(jphRagdoll, vecTmp.memorySegment(), quatTmp.memorySegment(), lockBodies);

			vecTmp.get(position);
			quatTmp.get(rotation);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getRootTransform: " + className);
		}
	}

	/**
	 * Get the settings object that created this ragdoll.
	 */
	public RagdollSettings getRagdollSettings() {
		try {
			MethodHandle method = JPH_RAGDOLL_GET_RAGDOLL_SETTINGS;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphRagdoll);

			if (segment.equals(MemorySegment.NULL))
				return null;

			RagdollSettings settings = Jolt.getRagdollSettings(segment.address());
			if (settings != null)
				return settings;

			return new RagdollSettings(segment);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getRagdollSettings: " + className);
		}
	}

}