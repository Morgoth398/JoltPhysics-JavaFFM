package volucris.engine.physics.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Contains the structure of a ragdoll.
 */
public final class RagdollSettings {

	private static final MethodHandle JPH_RAGDOLL_SETTINGS_CREATE;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_DESTROY;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_GET_SKELETON;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_SET_SKELETON;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_STABILIZE;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR;
	private static final MethodHandle JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL;

	private final MemorySegment jphRagdollSettings;

	private Mat4 matTmp;

	static {
		//@formatter:off
		JPH_RAGDOLL_SETTINGS_CREATE = downcallHandle("JPH_RagdollSettings_Create", ADDRESS);
		JPH_RAGDOLL_SETTINGS_DESTROY = downcallHandleVoid("JPH_RagdollSettings_Destroy", ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_SKELETON = downcallHandle("JPH_RagdollSettings_GetSkeleton", ADDRESS, ADDRESS);
		JPH_RAGDOLL_SETTINGS_SET_SKELETON = downcallHandleVoid("JPH_RagdollSettings_SetSkeleton", ADDRESS, ADDRESS);
		JPH_RAGDOLL_SETTINGS_STABILIZE = downcallHandle("JPH_RagdollSettings_Stabilize", JAVA_BOOLEAN, ADDRESS);
		JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS = downcallHandleVoid("JPH_RagdollSettings_DisableParentChildCollisions", ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX = downcallHandleVoid("JPH_RagdollSettings_CalculateBodyIndexToConstraintIndex", ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX = downcallHandle("JPH_RagdollSettings_GetConstraintIndexForBodyIndex", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR = downcallHandleVoid("JPH_RagdollSettings_CalculateConstraintIndexToBodyIdxPair", ADDRESS);
		JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL = downcallHandle("JPH_RagdollSettings_CreateRagdoll", ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_LONG);
		//@formatter:on
	}

	public RagdollSettings() {
		try {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();

			Arena arena = Arena.ofConfined();
			jphRagdollSettings = segment.reinterpret(arena, s -> destroy(s));

			matTmp = new Mat4(arena);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create ragdoll settings.");
		}
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy ragdoll settings.");
		}
	}

	/**
	 * Access to the skeleton of this ragdoll.
	 */
	public Skeleton getSkeleton() {
		try {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_SKELETON;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphRagdollSettings);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Skeleton skeleton = Jolt.getSkeleton(segment.address());
			if (skeleton != null)
				return null;

			return new Skeleton(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get skeleton.");
		}
	}

	/**
	 * Set the skeleton of this ragdoll.
	 */
	public void setSkeleton(Skeleton skeleton) {
		try {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_SKELETON;
			method.invokeExact(jphRagdollSettings, skeleton.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set skeleton.");
		}
	}

	/**
	 * Stabilize the constraints of the ragdoll
	 */
	public boolean stabilize() {
		try {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_STABILIZE;
			return (boolean) method.invokeExact(jphRagdollSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot stabilize.");
		}
	}

	/**
	 * @see #disableParentChildCollisions(Matrix4f[], float)
	 */
	public void disableParentChildCollisions() {
		disableParentChildCollisions(null, 0.0f);
	}

	/**
	 * @see #disableParentChildCollisions(Matrix4f[], float)
	 */
	public void disableParentChildCollisions(float minSeparationDistance) {
		disableParentChildCollisions(null, minSeparationDistance);
	}

	/**
	 * @see #disableParentChildCollisions(Matrix4f[], float)
	 */
	public void disableParentChildCollisions(Matrix4f[] jointMatrices) {
		disableParentChildCollisions(jointMatrices, 0.0f);
	}

	/**
	 * 
	 * 
	 * After the ragdoll has been fully configured, call this function to
	 * automatically create and add a GroupFilterTable collision filter to all
	 * bodies and configure them so that parent and children don't collide.
	 * <p>
	 * This will:
	 * <ul>
	 * <li>Create a GroupFilterTable and assign it to all of the bodies in a
	 * ragdoll.
	 * <li>Each body in your ragdoll will get a SubGroupID that is equal to the
	 * joint index in the Skeleton that it is attached to.
	 * <li>Loop over all joints in the Skeleton and call
	 * GroupFilterTable::DisableCollision(joint index, parent joint index).
	 * <li>When a pose is provided through inJointMatrices the function will detect
	 * collisions between joints (they must be separated by more than
	 * inMinSeparationDistance to be treated as not colliding) and automatically
	 * disable collisions.
	 * </ul>
	 * When you create an instance using Ragdoll::CreateRagdoll pass in a unique
	 * GroupID for each ragdoll (e.g. a simple counter), note that this number
	 * should be unique throughout the PhysicsSystem, so if you have different types
	 * of ragdolls they should not share the same GroupID.
	 * 
	 */
	public void disableParentChildCollisions(Matrix4f[] jointMatrices, float minSeparationDistance) {
		try (Arena arena = Arena.ofConfined()) {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS;

			if (jointMatrices != null) {
				int length = jointMatrices.length;
				MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(length, Mat4.LAYOUT()));

				for (int i = 0; i < length; i++) {
					matTmp.set(jointMatrices[i]);

					long offset = i * Mat4.LAYOUT().byteSize();
					MemorySegment.copy(matTmp.memorySegment(), 0, array, offset, Mat4.LAYOUT().byteSize());
				}

				method.invokeExact(jphRagdollSettings, array, minSeparationDistance);
			} else {
				method.invokeExact(jphRagdollSettings, MemorySegment.NULL, minSeparationDistance);
			}
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot disable parent child collisions.");
		}
	}

	/**
	 * Calculate the map needed for GetConstraintIndexToBodyIdxPair()
	 */
	public void calculateBodyIndexToConstraintIndex() {
		try {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX;
			method.invokeExact(jphRagdollSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot calculate body index to constraint index.");
		}
	}

	/**
	 * Map a single body index to a constraint index.
	 */
	public int getConstraintIndexForBodyIndex(int bodyIndex) {
		try {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX;
			return (int) method.invokeExact(jphRagdollSettings, bodyIndex);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get constraint index for body index.");
		}
	}

	/**
	 * Calculate the map needed for GetConstraintIndexToBodyIdxPair()
	 */
	public void calculateConstraintIndexToBodyIdxPair() {
		try {
			MethodHandle method = JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR;
			method.invokeExact(jphRagdollSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot calculate constraint index to body IdxPair.");
		}
	}

	/**
	 * Create ragdoll instance from these settings
	 * 
	 * @return Newly created ragdoll or null when out of bodies
	 */
	public Ragdoll createRagdoll(PhysicsSystem system) {
		return createRagdoll(system, 0, 0);
	}

	/**
	 * Create ragdoll instance from these settings
	 * 
	 * @return Newly created ragdoll or null when out of bodies
	 */
	public Ragdoll createRagdoll(PhysicsSystem system, long userData) {
		return createRagdoll(system, 0, userData);
	}

	/**
	 * Create ragdoll instance from these settings
	 * 
	 * @return Newly created ragdoll or null when out of bodies
	 */
	public Ragdoll createRagdoll(PhysicsSystem system, int collisionGroup) {
		return createRagdoll(system, collisionGroup, 0);
	}

	/**
	 * Create ragdoll instance from these settings
	 * 
	 * @return Newly created ragdoll or null when out of bodies
	 */
	public Ragdoll createRagdoll(PhysicsSystem system, int collisionGroup, long userData) {
		try {
			MemorySegment settAddr = jphRagdollSettings;
			MemorySegment systemAddr = system.memorySegment();

			MethodHandle method = JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL;
			MemorySegment segment = (MemorySegment) method.invokeExact(settAddr, systemAddr, collisionGroup, userData);

			return new Ragdoll(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create ragdoll.");
		}
	}

}