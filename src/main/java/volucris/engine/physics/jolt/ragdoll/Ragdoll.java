package volucris.engine.physics.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.JoltEnums.Activation;
import volucris.engine.physics.jolt.constraint.Constraint;
import volucris.engine.utils.VolucrisRuntimeException;

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

	private final MemorySegment jphRagdoll;

	static {
		//@formatter:off
		JPH_RAGDOLL_DESTROY = downcallHandleVoid("JPH_Ragdoll_Destroy", ADDRESS);
		JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Ragdoll_AddToPhysicsSystem", ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Ragdoll_RemoveFromPhysicsSystem", ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_ACTIVATE = downcallHandleVoid("JPH_Ragdoll_Activate", ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_IS_ACTIVE = downcallHandle("JPH_Ragdoll_IsActive", JAVA_BOOLEAN, ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_RESET_WARM_START = downcallHandleVoid("JPH_Ragdoll_ResetWarmStart", ADDRESS);
		//@formatter:on
	}

	protected Ragdoll(MemorySegment segment) {
		jphRagdoll = segment.reinterpret(Arena.ofAuto(), s -> destroy(s));
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_RAGDOLL_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy ragdoll.");
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
			throw new VolucrisRuntimeException("Jolt: Cannot add to physics system.");
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
			throw new VolucrisRuntimeException("Jolt: Cannot remove from physics system.");
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
			throw new VolucrisRuntimeException("Jolt: Cannot activate.");
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
			throw new VolucrisRuntimeException("Jolt: Cannot call is active.");
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
			throw new VolucrisRuntimeException("Jolt: Cannot reset warm start.");
		}
	}

}