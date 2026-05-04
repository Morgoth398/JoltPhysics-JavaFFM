package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Settings of a two wheeled motorcycle (adds a spring to balance the
 * motorcycle) Note: The motor cycle controller is still in development and may
 * need a lot of tweaks/hacks to work properly!
 */
public final class MotorcycleControllerSettings extends WheeledVehicleControllerSettings {

	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_CREATE;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_MAX_LEAN_ANGLE;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_MAX_LEAN_ANGLE;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_CONSTANT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_CONSTANT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_DAMPING;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_DAMPING;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SMOOTHING_FACTOR;
	private static final MethodHandle JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SMOOTHING_FACTOR;

	static {
		//@formatter:off
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_CREATE = downcallHandle("JPH_MotorcycleControllerSettings_Create", ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_MAX_LEAN_ANGLE = downcallHandle("JPH_MotorcycleControllerSettings_GetMaxLeanAngle", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_MAX_LEAN_ANGLE = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetMaxLeanAngle", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_CONSTANT = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSpringConstant", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_CONSTANT = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSpringConstant", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_DAMPING = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSpringDamping", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_DAMPING = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSpringDamping", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSpringIntegrationCoefficient", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSpringIntegrationCoefficient", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSpringIntegrationCoefficientDecay", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSpringIntegrationCoefficientDecay", ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SMOOTHING_FACTOR = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSmoothingFactor", JAVA_FLOAT, ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SMOOTHING_FACTOR = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSmoothingFactor", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public MotorcycleControllerSettings() {
		this(Arena.ofAuto());
	}

	public MotorcycleControllerSettings(Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create motorcycle controller settings: " + className);
		}
		super(segment, arena);
	}

	/**
	 * How far we're willing to make the bike lean over in turns (in radians)
	 */
	public float getMaxLeanAngle() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_MAX_LEAN_ANGLE;
			return (float) method.invokeExact(jphVehicleControllerSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max lean angle: " + className);
		}
	}

	/**
	 * How far we're willing to make the bike lean over in turns (in radians)
	 */
	public void setMaxLeanAngle(float value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_MAX_LEAN_ANGLE;
			method.invokeExact(jphVehicleControllerSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set max lean angle: " + className);
		}
	}

	/**
	 * Spring constant for the lean spring.
	 */
	public float getLeanSpringConstant() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_CONSTANT;
			return (float) method.invokeExact(jphVehicleControllerSettings);
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
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_CONSTANT;
			method.invokeExact(jphVehicleControllerSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean spring constant: " + className);
		}
	}

	/**
	 * Spring damping constant for the lean spring.
	 */
	public float getLeanSpringDamping() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_DAMPING;
			return (float) method.invokeExact(jphVehicleControllerSettings);
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
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_DAMPING;
			method.invokeExact(jphVehicleControllerSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean spring damping: " + className);
		}
	}

	/**
	 * The lean spring applies an additional force equal to this coefficient *
	 * Integral(delta angle, 0, t), this effectively makes the lean spring a PID
	 * controller.
	 */
	public float getLeanSpringIntegrationCoefficient() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
			return (float) method.invokeExact(jphVehicleControllerSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lean spring integration coefficient: " + className);
		}
	}

	/**
	 * @see #getLeanSpringIntegrationCoefficient()
	 */
	public void setLeanSpringIntegrationCoefficient(float value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
			method.invokeExact(jphVehicleControllerSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean spring integration coefficient: " + className);
		}
	}

	/**
	 * How much to decay the angle integral when the wheels are not touching the
	 * floor: new_value = e^(-decay * t) * initial_value.
	 */
	public float getLeanSpringIntegrationCoefficientDecay() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
			return (float) method.invokeExact(jphVehicleControllerSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lean spring integration coefficient decay: " + className);
		}
	}

	/**
	 * @see #getLeanSpringIntegrationCoefficientDecay()
	 */
	public void setLeanSpringIntegrationCoefficientDecay(float value) {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
			method.invokeExact(jphVehicleControllerSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean spring integration coefficient decay: " + className);
		}
	}

	/**
	 * 
	 */
	public float getLeanSmoothingFactor() {
		try {
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SMOOTHING_FACTOR;
			return (float) method.invokeExact(jphVehicleControllerSettings);
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
			MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SMOOTHING_FACTOR;
			method.invokeExact(jphVehicleControllerSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lean smoothing factor: " + className);
		}
	}

}