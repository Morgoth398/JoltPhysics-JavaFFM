package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Runtime controller class.
 */
public final class MotorcycleController extends WheeledVehicleController {

	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR;

	static {
		//@formatter:off
		JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE = downcallHandle("JPH_MotorcycleController_GetWheelBase", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED = downcallHandle("JPH_MotorcycleController_IsLeanControllerEnabled", JAVA_BOOLEAN, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER = downcallHandleVoid("JPH_MotorcycleController_EnableLeanController", ADDRESS, JAVA_BOOLEAN);
		JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED = downcallHandle("JPH_MotorcycleController_IsLeanSteeringLimitEnabled", JAVA_BOOLEAN, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT = downcallHandleVoid("JPH_MotorcycleController_EnableLeanSteeringLimit", ADDRESS, JAVA_BOOLEAN);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT = downcallHandle("JPH_MotorcycleController_GetLeanSpringConstant", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringConstant", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING = downcallHandle("JPH_MotorcycleController_GetLeanSpringDamping", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringDamping", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandle("JPH_MotorcycleController_GetLeanSpringIntegrationCoefficient", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringIntegrationCoefficient", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandle("JPH_MotorcycleController_GetLeanSpringIntegrationCoefficientDecay", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringIntegrationCoefficientDecay", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR = downcallHandle("JPH_MotorcycleController_GetLeanSmoothingFactor", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR = downcallHandleVoid("JPH_MotorcycleController_SetLeanSmoothingFactor", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public MotorcycleController(MemorySegment segment) {
		super(segment);
	}

	/**
	 * Get the distance between the front and back wheels.
	 */
	public float getWheelBase() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get wheel base: " + className);
		}
	}

	/**
	 * Check if the lean spring is enabled.
	 */
	public boolean isLeanControllerEnabled() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED;
			return (boolean) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call isLeanControllerEnabled: " + className);
		}
	}

	/**
	 * Enable or disable the lean spring. This allows you to temporarily disable the
	 * lean spring to allow the motorcycle to fall over.
	 */
	public void enableLeanController(boolean value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot enable lean controller: " + className);
		}
	}

	/**
	 * 
	 */
	public boolean isLeanSteeringLimitEnabled() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED;
			return (boolean) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call isLeanSteeringLimitEnabled: " + className);
		}
	}

	/**
	 * Enable or disable the lean steering limit. When enabled (default) the
	 * steering angle is limited based on the vehicle speed to prevent steering that
	 * would cause an inertial force that causes the motorcycle to topple over.
	 */
	public void enableLeanSteeringLimit(boolean value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot enable lean steering limit: " + className);
		}
	}

	/**
	 * 
	 */
	public float getLeanSpringConstant() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lean spring constant: " + className);
		}
	}

	/**
	 * Spring constant for the lean spring.
	 */
	public void setLeanSpringConstant(float value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean spring constant: " + className);
		}
	}

	/**
	 * 
	 */
	public float getLeanSpringDamping() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lean spring damping: " + className);
		}
	}

	/**
	 * Spring damping constant for the lean spring.
	 */
	public void setLeanSpringDamping(float value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean spring damping: " + className);
		}
	}

	/**
	 * @see #setLeanSpringIntegrationCoefficient(float)
	 */
	public float getLeanSpringIntegrationCoefficient() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lean spring integration coefficient: " + className);
		}
	}

	/**
	 * The lean spring applies an additional force equal to this coefficient *
	 * Integral(delta angle, 0, t), this effectively makes the lean spring a PID
	 * controller.
	 */
	public void setLeanSpringIntegrationCoefficient(float value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean spring integration coefficient: " + className);
		}
	}

	/**
	 * @see #setLeanSpringIntegrationCoefficientDecay(float)
	 */
	public float getLeanSpringIntegrationCoefficientDecay() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lean spring integration coefficient decay: " + className);
		}
	}

	/**
	 * How much to decay the angle integral when the wheels are not touching the
	 * floor: new_value = e^(-decay * t) * initial_value.
	 */
	public void setLeanSpringIntegrationCoefficientDecay(float value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean spring integration coefficient decay: " + className);
		}
	}

	/**
	 * @see #setLeanSmoothingFactor(float)
	 */
	public float getLeanSmoothingFactor() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lean smoothing factor: " + className);
		}
	}

	/**
	 * How much to smooth the lean angle (0 = no smoothing, 1 = lean angle never
	 * changes) Note that this is frame rate dependent because the formula is:
	 * smoothing_factor * previous + (1 - smoothing_factor) * current
	 */
	public void setLeanSmoothingFactor(float value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean smoothing factor: " + className);
		}
	}

}