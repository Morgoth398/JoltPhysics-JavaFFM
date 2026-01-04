package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.MotorState;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.SixDOFConstraintAxis;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * 6 Degree Of Freedom Constraint. Allows control over each of the 6 degrees of
 * freedom.
 */
public final class SixDOFConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_MIN;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_MAX;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TRANSLATION_LIMITS_MIN;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TRANSLATION_LIMITS_MAX;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_LIMITS_MIN;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_LIMITS_MAX;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_IS_FIXED_AXIS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_IS_FREE_AXIS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SET_MAX_FRICTION;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_MAX_FRICTION;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_MOTOR_SETTINGS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SET_MOTOR_STATE;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_MOTOR_STATE;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SET_TARGET_VELOCITY_CS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TARGET_VELOCITY_CS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SET_TARGET_POSITION_CS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TARGET_POSITION_CS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ORIENTATION_CS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_GET_TARGET_ORIENTATION_CS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ORIENTATION_BS;

	private Quat quatTmp;

	static {
		//@formatter:off
		JPH_SIX_DOF_CONSTRAINT_CREATE = downcallHandle("JPH_SixDOFConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_MIN = downcallHandle("JPH_SixDOFConstraint_GetLimitsMin", JAVA_FLOAT, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_MAX = downcallHandle("JPH_SixDOFConstraint_GetLimitsMax", JAVA_FLOAT, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaPosition", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaRotation", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaMotorTranslation", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION = downcallHandleVoid("JPH_SixDOFConstraint_GetTotalLambdaMotorRotation", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TRANSLATION_LIMITS_MIN = downcallHandleVoid("JPH_SixDOFConstraint_GetTranslationLimitsMin", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TRANSLATION_LIMITS_MAX = downcallHandleVoid("JPH_SixDOFConstraint_GetTranslationLimitsMax", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_LIMITS_MIN = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationLimitsMin", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_LIMITS_MAX = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationLimitsMax", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_IS_FIXED_AXIS = downcallHandle("JPH_SixDOFConstraint_IsFixedAxis", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_IS_FREE_AXIS = downcallHandle("JPH_SixDOFConstraint_IsFreeAxis", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_GetLimitsSpringSettings", ADDRESS, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_SetLimitsSpringSettings", ADDRESS, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_SET_MAX_FRICTION = downcallHandleVoid("JPH_SixDOFConstraint_SetMaxFriction", ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_SIX_DOF_CONSTRAINT_GET_MAX_FRICTION = downcallHandle("JPH_SixDOFConstraint_GetMaxFriction", JAVA_FLOAT, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE = downcallHandleVoid("JPH_SixDOFConstraint_GetRotationInConstraintSpace", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_MOTOR_SETTINGS = downcallHandleVoid("JPH_SixDOFConstraint_GetMotorSettings", ADDRESS, JAVA_INT, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_SET_MOTOR_STATE = downcallHandleVoid("JPH_SixDOFConstraint_SetMotorState", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_GET_MOTOR_STATE = downcallHandle("JPH_SixDOFConstraint_GetMotorState", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_SET_TARGET_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetVelocityCS", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TARGET_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetVelocityCS", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetAngularVelocityCS", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetAngularVelocityCS", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_SET_TARGET_POSITION_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetPositionCS", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TARGET_POSITION_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetPositionCS", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ORIENTATION_CS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetOrientationCS", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_GET_TARGET_ORIENTATION_CS = downcallHandleVoid("JPH_SixDOFConstraint_GetTargetOrientationCS", ADDRESS, ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ORIENTATION_BS = downcallHandleVoid("JPH_SixDOFConstraint_SetTargetOrientationBS", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected SixDOFConstraint(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}
	
	protected SixDOFConstraint(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
		
		quatTmp = new Quat(arena);
	}
	
	public SixDOFConstraint(SixDOFConstraintSettings settings, Body body1, Body body2) {
		this(settings, body1, body2, Arena.ofAuto());
	}
	
	public SixDOFConstraint(SixDOFConstraintSettings settings, Body body1, Body body2, Arena arena) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create six dof constraint settings.");
		}
		super(segment, arena);

		quatTmp = new Quat(arena);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public SixDOFConstraintSettings getSettings(SixDOFConstraintSettings target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get settings.");
		}
	}

	/**
	 * @see #getSettings(SixDOFConstraintSettings)
	 */
	public SixDOFConstraintSettings getSettings() {
		return getSettings(new SixDOFConstraintSettings());
	}

	/**
	 * Get constraint Limits.
	 */
	public float getLimitsMin(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_MIN;
			return (float) method.invokeExact(jphConstraint, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get limits min.");
		}
	}

	/**
	 * 
	 */
	public float getLimitsMax(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_MAX;
			return (float) method.invokeExact(jphConstraint, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get limits max.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda position.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaPosition() {
		return getTotalLambdaPosition(new Vector3f());
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaRotation(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda rotation.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaRotation() {
		return getTotalLambdaRotation(new Vector3f());
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaMotorTranslation(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_TRANSLATION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda motor translation.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaMotorTranslation() {
		return getTotalLambdaMotorTranslation(new Vector3f());
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaMotorRotation(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR_ROTATION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda motor rotation.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaMotorRotation() {
		return getTotalLambdaMotorRotation(new Vector3f());
	}

	/**
	 * 
	 */
	public Vector3f getTranslationLimitsMin(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TRANSLATION_LIMITS_MIN;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get translation limits min.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getTranslationLimitsMin() {
		return getTranslationLimitsMin(new Vector3f());
	}

	/**
	 * 
	 */
	public Vector3f getTranslationLimitsMax(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TRANSLATION_LIMITS_MAX;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get translation limits max.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getTranslationLimitsMax() {
		return getTranslationLimitsMax(new Vector3f());
	}

	/**
	 * 
	 */
	public Vector3f getRotationLimitsMin(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_LIMITS_MIN;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get rotation limits min.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getRotationLimitsMin() {
		return getRotationLimitsMin(new Vector3f());
	}

	/**
	 * 
	 */
	public Vector3f getRotationLimitsMax(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_LIMITS_MAX;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get rotation limits max.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getRotationLimitsMax() {
		return getRotationLimitsMax(new Vector3f());
	}

	/**
	 * Check which axis are fixed/free.
	 */
	public boolean isFixedAxis(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_IS_FIXED_AXIS;
			return (boolean) method.invokeExact(jphConstraint, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if axis is fixed.");
		}
	}

	/**
	 * Check which axis are fixed/free.
	 */
	public boolean isFreeAxis(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_IS_FREE_AXIS;
			return (boolean) method.invokeExact(jphConstraint, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if axis is free.");
		}
	}

	/**
	 * Update the limits spring settings.
	 */
	public SpringSettings getLimitsSpringSettings(SpringSettings target, SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment(), axis.id());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get limits spring settings.");
		}
	}

	/**
	 * Update the limits spring settings.
	 */
	public SpringSettings getLimitsSpringSettings(SixDOFConstraintAxis axis) {
		return getLimitsSpringSettings(new SpringSettings(), axis);
	}

	/**
	 * Update the limits spring settings.
	 */
	public void setLimitsSpringSettings(SpringSettings settings, SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
			method.invokeExact(jphConstraint, settings.memorySegment(), axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set limits spring settings.");
		}
	}

	/**
	 * Set the max friction for each axis.
	 */
	public void setMaxFriction(SixDOFConstraintAxis axis, float friction) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SET_MAX_FRICTION;
			method.invokeExact(jphConstraint, axis.id(), friction);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set max friction.");
		}
	}

	/**
	 * Get the max friction for each axis.
	 */
	public float getMaxFriction(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_MAX_FRICTION;
			return (float) method.invokeExact(jphConstraint, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get max friction.");
		}
	}

	/**
	 * Get rotation of constraint in constraint space.
	 */
	public Quaternionf getRotationInConstraintSpace(Quaternionf target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_ROTATION_IN_CONSTRAINT_SPACE;
			method.invokeExact(jphConstraint, quatTmp.memorySegment());

			return quatTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot  get rotation in constraint space.");
		}
	}

	/**
	 * Get rotation of constraint in constraint space.
	 */
	public Quaternionf getRotationInConstraintSpace() {
		return getRotationInConstraintSpace(new Quaternionf());
	}

	/**
	 * Motor settings.
	 */
	public MotorSettings getMotorSettings(SixDOFConstraintAxis axis, MotorSettings target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_MOTOR_SETTINGS;
			method.invokeExact(jphConstraint, axis.id(), target.memorySegment());

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get motor settings.");
		}
	}

	/**
	 * Motor settings.
	 */
	public MotorSettings getMotorSettings(SixDOFConstraintAxis axis) {
		return getMotorSettings(axis, new MotorSettings());
	}

	/**
	 * Motor controls. Translation motors work in constraint space of body 1.
	 * Rotation motors work in constraint space of body 2 (!).
	 */
	public void setMotorState(SixDOFConstraintAxis axis, MotorState state) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SET_MOTOR_STATE;
			method.invokeExact(jphConstraint, axis.id(), state.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set motor state.");
		}
	}

	/**
	 * @see #setMotorState(SixDOFConstraintAxis, MotorState)
	 */
	public MotorState getMotorState(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_MOTOR_STATE;
			int value = (int) method.invokeExact(jphConstraint, axis.id());

			for (MotorState state : MotorState.values()) {
				if (value == state.id())
					return state;
			}

			throw new Throwable();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call getMotorState.");
		}
	}

	/**
	 * Set the target velocity in body 1 constraint space.
	 */
	public void setTargetVelocityCS(Vector3f velocity) {
		try {
			vecTmp.set(velocity);

			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SET_TARGET_VELOCITY_CS;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set target velocity CS.");
		}
	}

	/**
	 * Get the target velocity in body 1 constraint space.
	 */
	public Vector3f getTargetVelocityCS(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TARGET_VELOCITY_CS;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get target velocity CS.");
		}
	}

	/**
	 * Get the target velocity in body 1 constraint space.
	 */
	public Vector3f getTargetVelocityCS() {
		return getTargetVelocityCS(new Vector3f());
	}

	/**
	 * Set the target angular velocity in body 2 constraint space (!)
	 */
	public void setTargetAngularVelocityCS(Vector3f angularVelocity) {
		try {
			vecTmp.set(angularVelocity);

			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY_CS;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set target angular velocity CS.");
		}
	}

	/**
	 * Get the target angular velocity in body 2 constraint space (!)
	 */
	public Vector3f getTargetAngularVelocityCS(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY_CS;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get target angular velocity CS.");
		}
	}

	/**
	 * Get the target angular velocity in body 2 constraint space (!)
	 */
	public Vector3f getTargetAngularVelocityCS() {
		return getTargetAngularVelocityCS(new Vector3f());
	}

	/**
	 * Set the target position in body 1 constraint space.
	 */
	public void setTargetPositionCS(Vector3f position) {
		try {
			vecTmp.set(position);

			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SET_TARGET_POSITION_CS;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set target position CS.");
		}
	}

	/**
	 * Get the target position in body 1 constraint space.
	 */
	public Vector3f getTargetPositionCS(Vector3f target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TARGET_POSITION_CS;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get target position CS.");
		}
	}

	/**
	 * Get the target position in body 1 constraint space.
	 */
	public Vector3f getTargetPositionCs() {
		return getTargetPositionCS(new Vector3f());
	}

	/**
	 * Set the target orientation in body 1 constraint space.
	 */
	public void setTargetOrientationCS(Quaternionf orientation) {
		try {
			quatTmp.set(orientation);

			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ORIENTATION_CS;
			method.invokeExact(jphConstraint, quatTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set target orientation CS.");
		}
	}

	/**
	 * Get the target orientation in body 1 constraint space.
	 */
	public Quaternionf getTargetOrientationCS(Quaternionf target) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_GET_TARGET_ORIENTATION_CS;
			method.invokeExact(jphConstraint, quatTmp.memorySegment());

			return quatTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get target orientation CS.");
		}
	}

	/**
	 * Get the target orientation in body 1 constraint space.
	 */
	public Quaternionf getTargetOrientationCS() {
		return getTargetOrientationCS(new Quaternionf());
	}

	/**
	 * Set the target orientation in body space (R2 = R1 * inOrientation, where R1
	 * and R2 are the world space rotations for body 1 and 2). Solve: R2 *
	 * ConstraintToBody2 = R1 * ConstraintToBody1 * q (see
	 * SwingTwistConstraint::GetSwingTwist) and R2 = R1 * orientation for q.
	 */
	public void setTargetOrientationBS(Quaternionf orientation) {
		try {
			quatTmp.set(orientation);

			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SET_TARGET_ORIENTATION_BS;
			method.invokeExact(jphConstraint, quatTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set target orientation BS.");
		}
	}

}