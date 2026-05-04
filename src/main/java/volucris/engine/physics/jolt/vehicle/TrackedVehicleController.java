package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * 
 */
public final class TrackedVehicleController extends VehicleController {

	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION;

	static {
		//@formatter:off
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetDriverInput", ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT = downcallHandle("JPH_TrackedVehicleController_GetForwardInput", JAVA_FLOAT, ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetForwardInput", ADDRESS, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO = downcallHandle("JPH_TrackedVehicleController_GetLeftRatio", JAVA_FLOAT, ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO = downcallHandleVoid("JPH_TrackedVehicleController_SetLeftRatio", ADDRESS, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO = downcallHandle("JPH_TrackedVehicleController_GetRightRatio", JAVA_FLOAT, ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO = downcallHandleVoid("JPH_TrackedVehicleController_SetRightRatio", ADDRESS, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT = downcallHandle("JPH_TrackedVehicleController_GetBrakeInput", JAVA_FLOAT, ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetBrakeInput", ADDRESS, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE = downcallHandle("JPH_TrackedVehicleController_GetEngine", ADDRESS, ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION = downcallHandle("JPH_TrackedVehicleController_GetTransmission", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public TrackedVehicleController(MemorySegment segment) {
		super(segment);
	}

	/**
	 * Set input from driver
	 * 
	 * @param forward    Value between -1 and 1 for auto transmission and value
	 *                   between 0 and 1 indicating desired driving direction and
	 *                   amount the gas pedal is pressed
	 * @param leftRatio  Value between -1 and 1 indicating an extra multiplier to
	 *                   the rotation rate of the left track (used for steering)
	 * @param rightRatio Value between -1 and 1 indicating an extra multiplier to
	 *                   the rotation rate of the right track (used for steering)
	 * @param brake      Value between 0 and 1 indicating how strong the brake pedal
	 *                   is pressed
	 */
	public void setDriverInput(float forward, float leftRatio, float rightRatio, float brake) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT;
			method.invokeExact(jphVehicleController, forward, leftRatio, rightRatio, brake);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set driver input.");
		}
	}

	/**
	 * 
	 */
	public float getForwardInput() {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get forward input.");
		}
	}

	/**
	 * 
	 */
	public void setForwardInput(float value) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set forward input.");
		}
	}

	/**
	 * @see #setLeftRatio(float)
	 */
	public float getLeftRatio() {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get left ratio.");
		}
	}

	/**
	 * Value between -1 and 1 indicating an extra multiplier to the rotation rate of
	 * the left track (used for steering)
	 */
	public void setLeftRatio(float value) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set left ratio.");
		}
	}

	/**
	 * @see #setRightRatio(float)
	 */
	public float getRightRatio() {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get right ratio.");
		}
	}

	/**
	 * Value between -1 and 1 indicating an extra multiplier to the rotation rate of
	 * the right track (used for steering)
	 */
	public void setRightRatio(float value) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set right ratio.");
		}
	}

	/**
	 * @see #setBrakeInput(float)
	 */
	public float getBrakeInput() {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT;
			return (float) method.invokeExact(jphVehicleController);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get brake input.");
		}
	}

	/**
	 * Value between 0 and 1 indicating how strong the brake pedal is pressed.
	 */
	public void setBrakeInput(float value) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT;
			method.invokeExact(jphVehicleController, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set brake input.");
		}
	}

	/**
	 * Get current engine state (writable interface, allows you to make changes to
	 * the configuration which will take effect the next time step)
	 */
	public VehicleEngine getEngine(VehicleEngine target) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleController);

			target.set(segment);
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get engine.");
		}
	}

	/**
	 * @see #getEngine(VehicleEngine)
	 */
	public VehicleEngine getEngine() {
		return getEngine(new VehicleEngine());
	}

	/**
	 * Get current transmission state.
	 */
	public VehicleTransmission getTransmission(VehicleTransmission target) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleController);

			target.set(segment);
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get transmission.");
		}
	}

	/**
	 * Get current transmission state.
	 */
	public VehicleTransmission getTransmission() {
		return getTransmission(new VehicleTransmission());
	}

}