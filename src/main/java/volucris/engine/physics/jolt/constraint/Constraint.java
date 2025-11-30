package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.ConstraintSubType;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.ConstraintType;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Base class for all physics constraints. A constraint removes one or more
 * degrees of freedom for a rigid body.
 */
public sealed class Constraint permits TwoBodyConstraint, VehicleConstraint {

	private static final MethodHandle JPH_CONSTRAINT_DESTROY;
	private static final MethodHandle JPH_CONSTRAINT_GET_TYPE;
	private static final MethodHandle JPH_CONSTRAINT_GET_SUB_TYPE;
	private static final MethodHandle JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY;
	private static final MethodHandle JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY;
	private static final MethodHandle JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final MethodHandle JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final MethodHandle JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE;
	private static final MethodHandle JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE;
	private static final MethodHandle JPH_CONSTRAINT_GET_ENABLED;
	private static final MethodHandle JPH_CONSTRAINT_SET_ENABLED;
	private static final MethodHandle JPH_CONSTRAINT_GET_USER_DATA;
	private static final MethodHandle JPH_CONSTRAINT_SET_USER_DATA;
	private static final MethodHandle JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED;
	private static final MethodHandle JPH_CONSTRAINT_RESET_WARM_START;
	private static final MethodHandle JPH_CONSTRAINT_IS_ACTIVE;
	private static final MethodHandle JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT;
	private static final MethodHandle JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT;
	private static final MethodHandle JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT;
	private static final MethodHandle JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT;

	protected final MemorySegment jphConstraint;

	protected Arena arena;

	protected Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_CONSTRAINT_DESTROY = downcallHandleVoid("JPH_Constraint_Destroy", ADDRESS);
		JPH_CONSTRAINT_GET_TYPE = downcallHandle("JPH_Constraint_GetType", JAVA_INT, ADDRESS);
		JPH_CONSTRAINT_GET_SUB_TYPE = downcallHandle("JPH_Constraint_GetSubType", JAVA_INT, ADDRESS);
		JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY = downcallHandle("JPH_Constraint_GetConstraintPriority", JAVA_INT, ADDRESS);
		JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY = downcallHandleVoid("JPH_Constraint_SetConstraintPriority", ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandle("JPH_Constraint_GetNumVelocityStepsOverride", JAVA_INT, ADDRESS);
		JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandleVoid("JPH_Constraint_SetNumVelocityStepsOverride", ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE = downcallHandle("JPH_Constraint_GetNumPositionStepsOverride", JAVA_INT, ADDRESS);
		JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE = downcallHandleVoid("JPH_Constraint_SetNumPositionStepsOverride", ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_GET_ENABLED = downcallHandle("JPH_Constraint_GetEnabled", JAVA_BOOLEAN, ADDRESS);
		JPH_CONSTRAINT_SET_ENABLED = downcallHandleVoid("JPH_Constraint_SetEnabled", ADDRESS, JAVA_BOOLEAN);
		JPH_CONSTRAINT_GET_USER_DATA = downcallHandle("JPH_Constraint_GetUserData", JAVA_LONG, ADDRESS);
		JPH_CONSTRAINT_SET_USER_DATA = downcallHandleVoid("JPH_Constraint_SetUserData", ADDRESS, JAVA_LONG);
		JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED = downcallHandleVoid("JPH_Constraint_NotifyShapeChanged", ADDRESS, JAVA_INT, ADDRESS);
		JPH_CONSTRAINT_RESET_WARM_START = downcallHandleVoid("JPH_Constraint_ResetWarmStart", ADDRESS);
		JPH_CONSTRAINT_IS_ACTIVE = downcallHandle("JPH_Constraint_IsActive", JAVA_BOOLEAN, ADDRESS);
		JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT = downcallHandleVoid("JPH_Constraint_SetupVelocityConstraint", ADDRESS, JAVA_FLOAT);
		JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT = downcallHandleVoid("JPH_Constraint_WarmStartVelocityConstraint", ADDRESS, JAVA_FLOAT);
		JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_Constraint_SolveVelocityConstraint", JAVA_BOOLEAN, ADDRESS, JAVA_FLOAT);
		JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_Constraint_SolvePositionConstraint", JAVA_BOOLEAN, ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		//@formatter:on
	}

	protected Constraint(MemorySegment segment) {
		this(segment, true);
	}

	public Constraint(MemorySegment segment, boolean owns) {
		arena = Arena.ofAuto();

		if (owns)
			jphConstraint = segment.reinterpret(arena, s -> destroy(s));
		else
			jphConstraint = segment;

		vecTmp = new Vec3(arena);

		Jolt.addConstraint(segment.address(), this);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_CONSTRAINT_DESTROY;
			method.invokeExact(segment);

			Jolt.removeConstraint(segment.address());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy constraint.");
		}
	}

	/**
	 * Get the type of a constraint.
	 */
	public ConstraintType getType() {
		try {
			MethodHandle method = JPH_CONSTRAINT_GET_TYPE;
			int value = (int) method.invokeExact(jphConstraint);

			for (ConstraintType type : ConstraintType.values()) {
				if (value == type.id())
					return type;
			}

			throw new Throwable();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get constraint type.");
		}
	}

	/**
	 * Get the sub type of a constraint.
	 */
	public ConstraintSubType getSubType() {
		try {
			MethodHandle method = JPH_CONSTRAINT_GET_SUB_TYPE;
			int value = (int) method.invokeExact(jphConstraint);

			for (ConstraintSubType type : ConstraintSubType.values()) {
				if (value == type.id())
					return type;
			}

			throw new Throwable();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get constraint sub type.");
		}
	}

	/**
	 * Priority of the constraint when solving. Higher numbers have are more likely
	 * to be solved correctly. Note that if you want a deterministic simulation and
	 * you cannot guarantee the order in which constraints are added/removed, you
	 * can make the priority for all constraints unique to get a deterministic
	 * ordering.
	 */
	public int getConstraintPriority() {
		try {
			MethodHandle method = JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY;
			return (int) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get constraint priority.");
		}
	}

	/**
	 * @see #getConstraintPriority()
	 */
	public void setConstraintPriority(int priority) {
		try {
			MethodHandle method = JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY;
			method.invokeExact(jphConstraint, priority);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set constraint priority.");
		}
	}

	/**
	 * Used only when the constraint is active. Override for the number of solver
	 * velocity iterations to run, 0 means use the default in
	 * {@link PhysicsSettings#setNumVelocitySteps(int)}. The number of iterations to
	 * use is the max of all contacts and constraints in the island.
	 */
	public int getNumVelocityStepsOverride() {
		try {
			MethodHandle method = JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE;
			return (int) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get num velocity steps override.");
		}
	}

	/**
	 * @see #getNumVelocityStepsOverride()
	 */
	public void setNumVelocityStepsOverride(int value) {
		try {
			MethodHandle method = JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE;
			method.invokeExact(jphConstraint, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set num velocity steps override.");
		}
	}

	/**
	 * @see #setNumPositionStepsOverride(int)
	 */
	public int getNumPositionStepsOverride() {
		try {
			MethodHandle method = JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE;
			return (int) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get num position steps override.");
		}
	}

	/**
	 * Used only when the constraint is active. Override for the number of solver
	 * position iterations to run, 0 means use the default in
	 * {@link PhysicsSettings#setNumPositionSteps(int)}. The number of iterations to
	 * use is the max of all contacts and constraints in the island.
	 */
	public void setNumPositionStepsOverride(int value) {
		try {
			MethodHandle method = JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE;
			method.invokeExact(jphConstraint, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set num position steps override.");
		}
	}

	/**
	 * Test if a constraint is enabled.
	 */
	public boolean isEnabled() {
		try {
			MethodHandle method = JPH_CONSTRAINT_GET_ENABLED;
			return (boolean) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if is enabled.");
		}
	}

	/**
	 * Enable / disable this constraint. This can e.g. be used to implement a
	 * breakable constraint by detecting that the constraint impulse (see e.g.
	 * {@link PointConstraint#getTotalLambdaPosition()} went over a certain limit
	 * and then disabling the constraint. Note that although a disabled constraint
	 * will not affect the simulation in any way anymore, it does incur some
	 * processing overhead. Alternatively you can remove a constraint from the
	 * constraint manager (which may be more costly if you want to disable the
	 * constraint for a short while).
	 */
	public void setEnabled(boolean enabled) {
		try {
			MethodHandle method = JPH_CONSTRAINT_SET_ENABLED;
			method.invokeExact(jphConstraint, enabled);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set enabled.");
		}
	}

	/**
	 * Access to the user data, can be used for anything by the application.
	 */
	public long getUserData() {
		try {
			MethodHandle method = JPH_CONSTRAINT_GET_USER_DATA;
			return (long) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get user data.");
		}
	}

	/**
	 * @see #getUserData()
	 */
	public void setUserData(long userData) {
		try {
			MethodHandle method = JPH_CONSTRAINT_SET_USER_DATA;
			method.invokeExact(jphConstraint, userData);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set user data.");
		}
	}

	/**
	 * Notify the constraint that the shape of a body has changed and that its
	 * center of mass has moved by deltaCOM. Bodies don't know which constraints are
	 * connected to them so the user is responsible for notifying the relevant
	 * constraints when a body changes.
	 * 
	 * @param bodyId   ID of the body that has changed
	 * @param deltaCOM The delta of the center of mass of the body
	 *                 (shape->GetCenterOfMass() -
	 *                 shape_before_change->GetCenterOfMass())
	 */
	public void notifyShapeChanged(int bodyId, Vector3f deltaCOM) {
		try {
			vecTmp.set(deltaCOM);

			MethodHandle method = JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED;
			method.invokeExact(jphConstraint, bodyId, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot notify shape changed.");
		}
	}

	/**
	 * Notify the system that the configuration of the bodies and/or constraint has
	 * changed enough so that the warm start impulses should not be applied the next
	 * frame. You can use this function for example when repositioning a ragdoll
	 * through Ragdoll::SetPose in such a way that the orientation of the bodies
	 * completely changes so that the previous frame impulses are no longer a good
	 * approximation of what the impulses will be in the next frame. Calling this
	 * function when there are no big changes will result in the constraints being
	 * much 'softer' than usual so they are more easily violated (e.g. a long chain
	 * of bodies might sag a bit if you call this every frame).
	 */
	public void resetWarmStart() {
		try {
			MethodHandle method = JPH_CONSTRAINT_RESET_WARM_START;
			method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot reset warm start.");
		}
	}

	/**
	 * 
	 */
	public boolean isActive() {
		try {
			MethodHandle method = JPH_CONSTRAINT_IS_ACTIVE;
			return (boolean) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if is active.");
		}
	}

	/**
	 * 
	 */
	public void setupVelocityConstraint(float deltaTime) {
		try {
			MethodHandle method = JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT;
			method.invokeExact(jphConstraint, deltaTime);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot setup velocity constraint.");
		}
	}

	/**
	 * 
	 */
	public void warmStartVelocityConstraint(float warmStartImpulseRatio) {
		try {
			MethodHandle method = JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT;
			method.invokeExact(jphConstraint, warmStartImpulseRatio);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot warm start velocity constraint.");
		}
	}

	/**
	 * 
	 */
	public boolean solveVelocityConstraint(float deltaTime) {
		try {
			MethodHandle method = JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT;
			return (boolean) method.invokeExact(jphConstraint, deltaTime);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call solve velocity constraint.");
		}
	}

	/**
	 * 
	 */
	public boolean solvePositionConstraint(float deltaTime, float baumgarte) {
		try {
			MethodHandle method = JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT;
			return (boolean) method.invokeExact(jphConstraint, deltaTime, baumgarte);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot solve position constraint.");
		}
	}

	/**
	 * Converts this constraint into a {@link TwoBodyConstraint}. This may create a
	 * new object.
	 * <p>
	 * The method does not check if the memory segment points to a
	 * TwoBodyConstraint, so make sure of that first.
	 */
	public TwoBodyConstraint asTwoBodyConstraint() {
		if (this instanceof TwoBodyConstraint c)
			return c;

		return new TwoBodyConstraint(jphConstraint, false);
	}

	/**
	 * Converts this constraint into a {@link VehicleConstraint}. This may create a
	 * new object.
	 * <p>
	 * The method does not check if the memory segment points to a
	 * VehicleConstraint, so make sure of that first.
	 */
	public VehicleConstraint asVehicleConstraint() {
		if (this instanceof VehicleConstraint c)
			return c;

		return new VehicleConstraint(jphConstraint);
	}

	public MemorySegment memorySegment() {
		return jphConstraint;
	}

}