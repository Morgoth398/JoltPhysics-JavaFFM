package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * WheelSettings object specifically for WheeledVehicleController.
 */
public final class WheelSettingsWV extends WheelSettings {

	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_CREATE;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_GET_INERTIA;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_SET_INERTIA;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_GET_ANGULAR_DAMPING;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_SET_ANGULAR_DAMPING;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_GET_MAX_STEER_ANGLE;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_SET_MAX_STEER_ANGLE;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_GET_LONGITUDINAL_FRICTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_SET_LONGITUDINAL_FRICTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_GET_LATERAL_FRICTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_SET_LATERAL_FRICTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_GET_MAX_BRAKE_TORQUE;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_SET_MAX_BRAKE_TORQUE;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_GET_MAX_HAND_BRAKE_TORQUE;
	private static final MethodHandle JPH_WHEEL_SETTINGS_WV_SET_MAX_HAND_BRAKE_TORQUE;

	static {
		//@formatter:off
		JPH_WHEEL_SETTINGS_WV_CREATE = downcallHandle("JPH_WheelSettingsWV_Create", ADDRESS);
		JPH_WHEEL_SETTINGS_WV_GET_INERTIA = downcallHandle("JPH_WheelSettingsWV_GetInertia", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_INERTIA = downcallHandleVoid("JPH_WheelSettingsWV_SetInertia", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_WV_GET_ANGULAR_DAMPING = downcallHandle("JPH_WheelSettingsWV_GetAngularDamping", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_WheelSettingsWV_SetAngularDamping", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_WV_GET_MAX_STEER_ANGLE = downcallHandle("JPH_WheelSettingsWV_GetMaxSteerAngle", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_MAX_STEER_ANGLE = downcallHandleVoid("JPH_WheelSettingsWV_SetMaxSteerAngle", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_WV_GET_LONGITUDINAL_FRICTION = downcallHandle("JPH_WheelSettingsWV_GetLongitudinalFriction", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsWV_SetLongitudinalFriction", ADDRESS);
		JPH_WHEEL_SETTINGS_WV_GET_LATERAL_FRICTION = downcallHandle("JPH_WheelSettingsWV_GetLateralFriction", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_LATERAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsWV_SetLateralFriction", ADDRESS);
		JPH_WHEEL_SETTINGS_WV_GET_MAX_BRAKE_TORQUE = downcallHandle("JPH_WheelSettingsWV_GetMaxBrakeTorque", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_MAX_BRAKE_TORQUE = downcallHandleVoid("JPH_WheelSettingsWV_SetMaxBrakeTorque", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_WV_GET_MAX_HAND_BRAKE_TORQUE = downcallHandle("JPH_WheelSettingsWV_GetMaxHandBrakeTorque", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_MAX_HAND_BRAKE_TORQUE = downcallHandleVoid("JPH_WheelSettingsWV_SetMaxHandBrakeTorque", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	protected WheelSettingsWV(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected WheelSettingsWV(MemorySegment segment, Arena arena) {
		super(segment, arena, false);
	}

	public WheelSettingsWV() {
		this(Arena.ofAuto());
	}

	public WheelSettingsWV(Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_CREATE;
			segment = (MemorySegment) method.invokeExact();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create wheel settings wv: " + className);
		}
		super(segment, arena, true);
	}

	/**
	 * Moment of inertia (kg m^2), for a cylinder this would be 0.5 * M * R^2 which
	 * is 0.9 for a wheel with a mass of 20 kg and radius 0.3 m.
	 */
	public float getInertia() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_INERTIA;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get inertia: " + className);
		}
	}

	/**
	 * @see #getInertia()
	 */
	public void setInertia(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_INERTIA;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set inertia: " + className);
		}
	}

	/**
	 * Angular damping factor of the wheel: dw/dt = -c * w. Value should be zero or
	 * positive and is usually close to 0.
	 */
	public float getAngularDamping() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_ANGULAR_DAMPING;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get angular damping: " + className);
		}
	}

	/**
	 * @see #getAngularDamping()
	 */
	public void setAngularDamping(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_ANGULAR_DAMPING;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set angular damping: " + className);
		}
	}

	/**
	 * How much this wheel can steer (radians)
	 */
	public float getMaxSteerAngle() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_STEER_ANGLE;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max steer angle: " + className);
		}
	}

	/**
	 * How much this wheel can steer (radians)
	 */
	public void setMaxSteerAngle(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_STEER_ANGLE;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set max steer angle: " + className);
		}
	}

	/**
	 * On the Y-axis: friction in the forward direction of the tire. Friction is
	 * normally between 0 (no friction) and 1 (full friction) although friction can
	 * be a little bit higher than 1 because of the profile of a tire. On the
	 * X-axis: the slip ratio (fraction) defined as (omega_wheel * r_wheel -
	 * v_longitudinal) / |v_longitudinal|. You can see slip ratio as the amount the
	 * wheel is spinning relative to the floor: 0 means the wheel has full traction
	 * and is rolling perfectly in sync with the ground, 1 is for example when the
	 * wheel is locked and sliding over the ground.
	 */
	public LinearCurve getLongitudinalFriction() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_LONGITUDINAL_FRICTION;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphWheelSettings);

			if (segment.equals(MemorySegment.NULL))
				return null;

			LinearCurve curve = Jolt.getLinearCurve(segment.address());
			if (curve != null)
				return curve;

			return new LinearCurve(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get longitudinal friction: " + className);
		}
	}

	/**
	 * @see #getLongitudinalFriction()
	 */
	public void setLongitudinalFriction(LinearCurve curve) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_LONGITUDINAL_FRICTION;
			method.invokeExact(jphWheelSettings, curve.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set longitudinal friction: " + className);
		}
	}

	/**
	 * On the Y-axis: friction in the sideways direction of the tire. Friction is
	 * normally between 0 (no friction) and 1 (full friction) although friction can
	 * be a little bit higher than 1 because of the profile of a tire. On the
	 * X-axis: the slip angle (degrees) defined as angle between relative contact
	 * velocity and tire direction.
	 */
	public LinearCurve getLateralFriction() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_LATERAL_FRICTION;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphWheelSettings);

			if (segment.equals(MemorySegment.NULL))
				return null;

			LinearCurve curve = Jolt.getLinearCurve(segment.address());
			if (curve != null)
				return curve;

			return new LinearCurve(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lateral friction: " + className);
		}
	}

	/**
	 * @see #getLateralFriction()
	 */
	public void setLateralFriction(LinearCurve curve) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_LATERAL_FRICTION;
			method.invokeExact(jphWheelSettings, curve.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lateral friction: " + className);
		}
	}

	/**
	 * How much torque (Nm) the brakes can apply to this wheel.
	 */
	public float getMaxBrakeTorque() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_BRAKE_TORQUE;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max brake torque: " + className);
		}
	}

	/**
	 * How much torque (Nm) the brakes can apply to this wheel.
	 */
	public void setMaxBrakeTorque(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_BRAKE_TORQUE;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set max brake torque: " + className);
		}
	}

	/**
	 * How much torque (Nm) the hand brake can apply to this wheel (usually only
	 * applied to the rear wheels)
	 */
	public float getMaxHandBrakeTorque() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_HAND_BRAKE_TORQUE;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max hand brake torque: " + className);
		}
	}

	/**
	 * How much torque (Nm) the hand brake can apply to this wheel (usually only
	 * applied to the rear wheels)
	 */
	public void setMaxHandBrakeTorque(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_HAND_BRAKE_TORQUE;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set max hand brake torque: " + className);
		}
	}

}