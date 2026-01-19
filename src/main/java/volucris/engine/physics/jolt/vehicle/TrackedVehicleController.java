package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

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
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRACK;

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
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRACK = downcallHandle("JPH_TrackedVehicleController_GetTrack", ADDRESS, JAVA_INT);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set driver input: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get forward input: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set forward input: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get left ratio: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set left ratio: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get right ratio: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set right ratio: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get brake input: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set brake input: " + className);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get engine: " + className);
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
	 * Get the tracks this vehicle has.
	 */
	public VehicleTrack getVehicleTrack(VehicleTrack target, TrackSide trackSide) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRACK;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleController, trackSide.id());

			target.set(segment);
			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get vehicle track: " + className);
		}
	}

	/**
	 * Get the tracks this vehicle has.
	 */
	public VehicleTrack getVehicleTrack(TrackSide trackSide) {
		return getVehicleTrack(new VehicleTrack(), trackSide);
	}

}