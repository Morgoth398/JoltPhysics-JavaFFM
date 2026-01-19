package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Runtime controller class.
 */
public sealed class WheeledVehicleController extends VehicleController permits MotorcycleController {

	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION;

	static {
		//@formatter:off
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetDriverInput", ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetForwardInput", ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT = downcallHandle("JPH_WheeledVehicleController_GetForwardInput", JAVA_FLOAT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetRightInput", ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT = downcallHandle("JPH_WheeledVehicleController_GetRightInput", JAVA_FLOAT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetBrakeInput", ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT = downcallHandle("JPH_WheeledVehicleController_GetBrakeInput", JAVA_FLOAT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetHandBrakeInput", ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT = downcallHandle("JPH_WheeledVehicleController_GetHandBrakeInput", JAVA_FLOAT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH = downcallHandle("JPH_WheeledVehicleController_GetWheelSpeedAtClutch", JAVA_FLOAT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE = downcallHandle("JPH_WheeledVehicleController_GetEngine", ADDRESS, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION = downcallHandle("JPH_WheeledVehicleController_GetTransmission", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public WheeledVehicleController(MemorySegment segment) {
		super(segment);
	}

	/**
	 * Set input from driver.
	 * 
	 * @param forward   Value between -1 and 1 for auto transmission and value
	 *                  between 0 and 1 indicating desired driving direction and
	 *                  amount the gas pedal is pressed
	 * @param right     Value between -1 and 1 indicating desired steering angle (1
	 *                  = right)
	 * @param brake     Value between 0 and 1 indicating how strong the brake pedal
	 *                  is pressed
	 * @param handBrake Value between 0 and 1 indicating how strong the hand brake
	 *                  is pulled
	 */
	public void setDriverInput(float forward, float right, float brake, float handBrake) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT;
			method.invokeExact(jphVehicleController, forward, right, brake, handBrake);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set driver input: " + className);
		}
	}

	/**
	 * Value between -1 and 1 for auto transmission and value between 0 and 1
	 * indicating desired driving direction and amount the gas pedal is pressed.
	 */
	public void setForwardInput(float forward) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT;
			method.invokeExact(jphVehicleController, forward);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set forward input: " + className);
		}
	}

	/**
	 * @see #setForwardInput(float)
	 */
	public float getForwardInput() {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get forward input: " + className);
		}
	}

	/**
	 * Value between -1 and 1 indicating desired steering angle (1 = right)
	 */
	public void setRightInput(float rightRatio) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT;
			method.invokeExact(jphVehicleController, rightRatio);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setRightInput: " + className);
		}
	}

	/**
	 * @see #setRightInput(float)
	 */
	public float getRightInput() {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get right input: " + className);
		}
	}

	/**
	 * Value between 0 and 1 indicating how strong the brake pedal is pressed.
	 */
	public void setBrakeInput(float brakeInput) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT;
			method.invokeExact(jphVehicleController, brakeInput);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set brake input: " + className);
		}
	}

	/**
	 * @see #getBrakeInput()
	 */
	public float getBrakeInput() {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get brake input: " + className);
		}
	}

	/**
	 * Value between 0 and 1 indicating how strong the hand brake is pulled.
	 */
	public void setHandBrakeInput(float handBrakeInput) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT;
			method.invokeExact(jphVehicleController, handBrakeInput);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set hand brake input: " + className);
		}
	}

	/**
	 * @see #setHandBrakeInput(float)
	 */
	public float getHandBrakeInput() {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get hand brake input: " + className);
		}
	}

	/**
	 * Get the average wheel speed of all driven wheels (measured at the clutch)
	 */
	public float getWheelSpeedAtClutch() {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get wheel speed at clutch: " + className);
		}
	}

	/**
	 * Get current engine state.
	 */
	public VehicleEngine getEngine(VehicleEngine target) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleController);

			target.set(segment);
			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get engine: " + className);
		}
	}

	/**
	 * Get current engine state.
	 */
	public VehicleEngine getEngine() {
		return getEngine(new VehicleEngine());
	}

	/**
	 * Get current transmission state.
	 */
	public VehicleTransmission getTransmission(VehicleTransmission target) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleController);

			target.set(segment);
			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get transmission: " + className);
		}
	}

	/**
	 * Get current transmission state.
	 */
	public VehicleTransmission getTransmission() {
		return getTransmission(new VehicleTransmission());
	}

	/**
	 * The method does not check if the memory segment points to a
	 * MotorcycleController, so make sure of that first.
	 */
	public MotorcycleController asMotorcycleController() {
		if (this instanceof MotorcycleController c)
			return c;

		return new MotorcycleController(jphVehicleController);
	}

}