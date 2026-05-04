package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.MotorState;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A hinge constraint constrains 2 bodies on a single point and allows only a
 * single axis of rotation.
 */
public final class HingeConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_HINGE_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_SET_MOTOR_SETTINGS;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_SET_LIMITS;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_HAS_LIMITS;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS;
	private static final MethodHandle JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

	static {
		//@formatter:off
		JPH_HINGE_CONSTRAINT_CREATE = downcallHandle("JPH_HingeConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpacePoint1", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpacePoint2", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceHingeAxis1", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceHingeAxis2", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceNormalAxis1", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2 = downcallHandleVoid("JPH_HingeConstraint_GetLocalSpaceNormalAxis2", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE = downcallHandle("JPH_HingeConstraint_GetCurrentAngle", JAVA_FLOAT, ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE = downcallHandleVoid("JPH_HingeConstraint_SetMaxFrictionTorque", ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE = downcallHandle("JPH_HingeConstraint_GetMaxFrictionTorque", JAVA_FLOAT, ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_MOTOR_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_SetMotorSettings", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_GetMotorSettings", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE = downcallHandleVoid("JPH_HingeConstraint_SetMotorState", ADDRESS, JAVA_INT);
		JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE = downcallHandle("JPH_HingeConstraint_GetMotorState", JAVA_INT, ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_HingeConstraint_SetTargetAngularVelocity", ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY = downcallHandle("JPH_HingeConstraint_GetTargetAngularVelocity", JAVA_FLOAT, ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE = downcallHandleVoid("JPH_HingeConstraint_SetTargetAngle", ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE = downcallHandle("JPH_HingeConstraint_GetTargetAngle", JAVA_FLOAT, ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_LIMITS = downcallHandleVoid("JPH_HingeConstraint_SetLimits", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN = downcallHandle("JPH_HingeConstraint_GetLimitsMin", JAVA_FLOAT, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX = downcallHandle("JPH_HingeConstraint_GetLimitsMax", JAVA_FLOAT, ADDRESS);
		JPH_HINGE_CONSTRAINT_HAS_LIMITS = downcallHandle("JPH_HingeConstraint_HasLimits", JAVA_BOOLEAN, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_GetLimitsSpringSettings", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_HingeConstraint_SetLimitsSpringSettings", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_HingeConstraint_GetTotalLambdaPosition", ADDRESS, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_HingeConstraint_GetTotalLambdaRotation", ADDRESS, JAVA_FLOAT);
		JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS = downcallHandle("JPH_HingeConstraint_GetTotalLambdaRotationLimits", JAVA_FLOAT, ADDRESS);
		JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandle("JPH_HingeConstraint_GetTotalLambdaMotor", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected HingeConstraint(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}
	
	public HingeConstraint(HingeConstraintSettings settings, Body body1, Body body2) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_HINGE_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create hinge constraint.");
		}
		super(segment);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public HingeConstraintSettings getSettings(HingeConstraintSettings target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get settings.");
		}
	}

	/**
	 * @see #getSettings(HingeConstraintSettings)
	 */
	public HingeConstraintSettings getSettings() {
		return getSettings(new HingeConstraintSettings());
	}

	/**
	 * Get the attachment point for body 1 relative to body 1 COM (transform by
	 * {@link Body#getCenterOfMassTransform()} to take to world space).
	 */
	public Vector3f getLocalSpacePoint1(Vector3f target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT1;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get local space point 1.");
		}
	}

	/**
	 * @see #getLocalSpacePoint1(Vector3f)
	 */
	public Vector3f getLocalSpacePoint1() {
		return getLocalSpacePoint1(new Vector3f());
	}

	/**
	 * Get the attachment point for body 2 relative to body 2 COM (transform by
	 * {@link Body#getCenterOfMassTransform()} to take to world space).
	 */
	public Vector3f getLocalSpacePoint2(Vector3f target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_POINT2;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get local space point 2.");
		}
	}

	/**
	 * @see #getLocalSpacePoint2(Vector3f)
	 */
	public Vector3f getLocalSpacePoint2() {
		return getLocalSpacePoint2(new Vector3f());
	}

	/**
	 * 
	 */
	public Vector3f getLocalSpaceHingeAxis1(Vector3f target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS1;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get local space hinge axis 1.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getLocalSpaceHingeAxis1() {
		return getLocalSpaceHingeAxis1(new Vector3f());
	}

	/**
	 * 
	 */
	public Vector3f getLocalSpaceHingeAxis2(Vector3f target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_HINGE_AXIS2;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get local space hinge axis 2.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getLocalSpaceHingeAxis2() {
		return getLocalSpaceHingeAxis2(new Vector3f());
	}

	/**
	 * 
	 */
	public Vector3f getLocalSpaceNormalAxis1(Vector3f target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS1;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get local space normal axis 1.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getLocalSpaceNormalAxis1() {
		return getLocalSpaceNormalAxis1(new Vector3f());
	}

	/**
	 * 
	 */
	public Vector3f getLocalSpaceNormalAxis2(Vector3f target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LOCAL_SPACE_NORMAL_AXIS2;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get local space normal axis 2.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getLocalSpaceNormalAxis2() {
		return getLocalSpaceNormalAxis2(new Vector3f());
	}

	/**
	 * Get the current rotation angle from the rest position.
	 */
	public float getCurrentAngle() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_CURRENT_ANGLE;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get current angle.");
		}
	}

	/**
	 * 
	 */
	public void setMaxFrictionTorque(float frictionTorque) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_SET_MAX_FRICTION_TORQUE;
			method.invokeExact(jphConstraint, frictionTorque);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set max friction torque.");
		}
	}

	/**
	 * 
	 */
	public float getMaxFrictionTorque() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MAX_FRICTION_TORQUE;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get max friction torque.");
		}
	}

	/**
	 * 
	 */
	public void setMotorSettings(MotorSettings settings) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_SET_MOTOR_SETTINGS;
			method.invokeExact(jphConstraint, settings.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set motor settings.");
		}
	}

	/**
	 * 
	 */
	public MotorSettings getMotorSettings(MotorSettings target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MOTOR_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get motor settings.");
		}
	}

	/**
	 * 
	 */
	public MotorSettings getMotorSettings() {
		return getMotorSettings(new MotorSettings());
	}

	/**
	 * 
	 */
	public void setMotorState(MotorState state) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_SET_MOTOR_STATE;
			method.invokeExact(jphConstraint, state.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set motor state.");
		}
	}

	/**
	 * 
	 */
	public MotorState getMotorState() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_MOTOR_STATE;
			int value = (int) method.invokeExact(jphConstraint);

			for (MotorState state : MotorState.values()) {
				if (value == state.id())
					return state;
			}

			throw new Throwable();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get motor state.");
		}
	}

	/**
	 * rad/s
	 */
	public void setTargetAngularVelocity(float angularVelocity) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_SET_TARGET_ANGULAR_VELOCITY;
			method.invokeExact(jphConstraint, angularVelocity);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set target angular velocity.");
		}
	}

	/**
	 * rad/s
	 */
	public float getTargetAngularVelocity() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TARGET_ANGULAR_VELOCITY;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get target angular velocity.");
		}
	}

	/**
	 * rad
	 */
	public void setTargetAngle(float angle) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_SET_TARGET_ANGLE;
			method.invokeExact(jphConstraint, angle);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set target angle.");
		}
	}

	/**
	 * rad
	 */
	public float getTargetAngle() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TARGET_ANGLE;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get target angle.");
		}
	}

	/**
	 * 
	 */
	public void setLimits(float limitsMin, float limitsMax) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_SET_LIMITS;
			method.invokeExact(jphConstraint, limitsMin, limitsMax);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set limits.");
		}
	}

	/**
	 * 
	 */
	public float getLimitsMin() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_MIN;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get limits min.");
		}
	}

	/**
	 * 
	 */
	public float getLimitsMax() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_MAX;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get limits max.");
		}
	}

	/**
	 * 
	 */
	public boolean hasLimits() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_HAS_LIMITS;
			return (boolean) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if constraint has limits.");
		}
	}

	/**
	 * Update the limits spring settings.
	 */
	public SpringSettings getLimitsSpringSettings(SpringSettings target) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get limits spring settings.");
		}
	}

	/**
	 * Update the limits spring settings.
	 */
	public SpringSettings getLimitsSpringSettings() {
		return getLimitsSpringSettings(new SpringSettings());
	}

	/**
	 * Update the limits spring settings.
	 */
	public void setLimitsSpringSettings(SpringSettings settings) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
			method.invokeExact(jphConstraint, settings.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set limits spring settings.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaPosition(Vector3f result) {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(result);
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
	 * 
	 * @param target Needs to have the size 2
	 */
	public float[] getTotalLambdaRotation(float[] target) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(2, JAVA_FLOAT));

			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
			method.invokeExact(jphConstraint, array);

			target[0] = array.getAtIndex(JAVA_FLOAT, 0);
			target[1] = array.get(JAVA_FLOAT, 1);

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda rotation.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public float[] getTotalLambdaRotation() {
		return getTotalLambdaRotation(new float[2]);
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public float getTotalLambdaRotationLimits() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION_LIMITS;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda rotation limits.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public float getTotalLambdaMotor() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda motor.");
		}
	}

}