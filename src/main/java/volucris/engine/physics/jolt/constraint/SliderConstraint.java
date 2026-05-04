package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.MotorState;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A slider constraint allows movement in only 1 axis (and no rotation). Also
 * known as a prismatic constraint.
 */
public final class SliderConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_SLIDER_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SET_MOTOR_SETTINGS;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SET_MOTOR_STATE;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_MOTOR_STATE;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SET_TARGET_VELOCITY;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_TARGET_VELOCITY;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SET_TARGET_POSITION;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_TARGET_POSITION;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SET_LIMITS;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_LIMITS_MIN;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_LIMITS_MAX;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_HAS_LIMITS;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

	static {
		//@formatter:off
		JPH_SLIDER_CONSTRAINT_CREATE = downcallHandle("JPH_SliderConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION = downcallHandle("JPH_SliderConstraint_GetCurrentPosition", JAVA_FLOAT, ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE = downcallHandleVoid("JPH_SliderConstraint_SetMaxFrictionForce", ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE = downcallHandle("JPH_SliderConstraint_GetMaxFrictionForce", JAVA_FLOAT, ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_MOTOR_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_SetMotorSettings", ADDRESS, ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_GetMotorSettings", ADDRESS, ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_MOTOR_STATE = downcallHandleVoid("JPH_SliderConstraint_SetMotorState", ADDRESS, JAVA_INT);
		JPH_SLIDER_CONSTRAINT_GET_MOTOR_STATE = downcallHandle("JPH_SliderConstraint_GetMotorState", JAVA_INT, ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_TARGET_VELOCITY = downcallHandleVoid("JPH_SliderConstraint_SetTargetVelocity", ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_TARGET_VELOCITY = downcallHandle("JPH_SliderConstraint_GetTargetVelocity", JAVA_FLOAT, ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_TARGET_POSITION = downcallHandleVoid("JPH_SliderConstraint_SetTargetPosition", ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_TARGET_POSITION = downcallHandle("JPH_SliderConstraint_GetTargetPosition", JAVA_FLOAT, ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_LIMITS = downcallHandleVoid("JPH_SliderConstraint_SetLimits", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_LIMITS_MIN = downcallHandle("JPH_SliderConstraint_GetLimitsMin", JAVA_FLOAT, ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_LIMITS_MAX = downcallHandle("JPH_SliderConstraint_GetLimitsMax", JAVA_FLOAT, ADDRESS);
		JPH_SLIDER_CONSTRAINT_HAS_LIMITS = downcallHandle("JPH_SliderConstraint_HasLimits", JAVA_BOOLEAN, ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_GetLimitsSpringSettings", ADDRESS, ADDRESS);
		JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_SliderConstraint_SetLimitsSpringSettings", ADDRESS, ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SliderConstraint_GetTotalLambdaPosition", ADDRESS, JAVA_FLOAT);
		JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS = downcallHandle("JPH_SliderConstraint_GetTotalLambdaPositionLimits", JAVA_FLOAT, ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_SliderConstraint_GetTotalLambdaRotation", ADDRESS, ADDRESS);
		JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandle("JPH_SliderConstraint_GetTotalLambdaMotor", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected SliderConstraint(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected SliderConstraint(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	public SliderConstraint(SliderConstraintSettings settings, Body body1, Body body2) {
		this(settings, body1, body2, Arena.ofAuto());
	}

	public SliderConstraint(SliderConstraintSettings settings, Body body1, Body body2, Arena arena) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_SLIDER_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create slider constraint: " + className);
		}
		super(segment, arena);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public SliderConstraintSettings getSettings(SliderConstraintSettings target) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get settings: " + className);
		}
	}

	/**
	 * @see #getSettings(SliderConstraintSettings)
	 */
	public SliderConstraintSettings getSettings() {
		return getSettings(new SliderConstraintSettings());
	}

	/**
	 * Get the current distance from the rest position.
	 */
	public float getCurrentPosition() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_CURRENT_POSITION;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get current position: " + className);
		}
	}

	/**
	 * Friction control.
	 */
	public void setMaxFrictionForce(float frictionForce) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_MAX_FRICTION_FORCE;
			method.invokeExact(jphConstraint, frictionForce);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set max friction force: " + className);
		}
	}

	/**
	 * Friction control.
	 */
	public float getMaxFrictionForce() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MAX_FRICTION_FORCE;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max friction force: " + className);
		}
	}

	/**
	 * Motor settings.
	 */
	public void setMotorSettings(MotorSettings settings) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_MOTOR_SETTINGS;
			method.invokeExact(jphConstraint, settings.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set motor settings: " + className);
		}
	}

	/**
	 * Motor settings.
	 */
	public MotorSettings getMotorSettings(MotorSettings target) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MOTOR_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get motor settings: " + className);
		}
	}

	/**
	 * Motor settings.
	 */
	public MotorSettings getMotorSettings() {
		return getMotorSettings(new MotorSettings());
	}

	/**
	 * 
	 */
	public void setMotorState(MotorState state) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_MOTOR_STATE;
			method.invokeExact(jphConstraint, state.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set motor state: " + className);
		}
	}

	/**
	 * 
	 */
	public MotorState getMotorState() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_MOTOR_STATE;
			int value = (int) method.invokeExact(jphConstraint);

			for (MotorState state : MotorState.values()) {
				if (value == state.id())
					return state;
			}

			throw new Throwable();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get motor state: " + className);
		}
	}

	/**
	 * 
	 */
	public void setTargetVelocity(float velocity) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_TARGET_VELOCITY;
			method.invokeExact(jphConstraint, velocity);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set target velocity: " + className);
		}
	}

	/**
	 * 
	 */
	public float getTargetVelocity() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TARGET_VELOCITY;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get target velocity: " + className);
		}
	}

	/**
	 * 
	 */
	public void setTargetPosition(float position) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_TARGET_POSITION;
			method.invokeExact(jphConstraint, position);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set target position: " + className);
		}
	}

	/**
	 * 
	 */
	public float getTargetPosition() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TARGET_POSITION;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get target position: " + className);
		}
	}

	/**
	 * Update the limits of the slider constraint (see
	 * {@link SliderConstraintSettings}
	 */
	public void setLimits(float limitsMin, float limitsMax) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_LIMITS;
			method.invokeExact(jphConstraint, limitsMin, limitsMax);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set limits: " + className);
		}
	}

	/**
	 * 
	 */
	public float getLimitsMin() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_MIN;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get limits min: " + className);
		}
	}

	/**
	 * 
	 */
	public float getLimitsMax() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_MAX;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get limits max: " + className);
		}
	}

	/**
	 * 
	 */
	public boolean hasLimits() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_HAS_LIMITS;
			return (boolean) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot check if constraint has limits: " + className);
		}
	}

	/**
	 * Update the limits spring settings.
	 */
	public SpringSettings getLimitsSpringSettings(SpringSettings target) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get limits spring settings: " + className);
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
			MethodHandle method = JPH_SLIDER_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
			method.invokeExact(jphConstraint, settings.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set limits spring settings: " + className);
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 * 
	 * @param target The arrays length must be >= 2
	 */
	public float[] getTotalLambdaPosition(float[] target) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(2, JAVA_FLOAT));

			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
			method.invokeExact(jphConstraint, array);

			target[0] = array.getAtIndex(JAVA_FLOAT, 0);
			target[1] = array.getAtIndex(JAVA_FLOAT, 1);

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get total lambda position: " + className);
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public float[] getTotalLambdaPosition() {
		return getTotalLambdaPosition(new float[2]);
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public float getTotalLambdaPositionLimits() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION_LIMITS;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get total lambda position limits: " + className);
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaRotation(Vector3f target) {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get total lambda rotation: " + className);
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
	public float getTotalLambdaMotor() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get total lambda motor: " + className);
		}
	}

}