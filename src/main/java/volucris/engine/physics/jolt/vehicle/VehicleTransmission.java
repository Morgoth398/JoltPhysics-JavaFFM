package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Runtime data for transmission.
 */
public final class VehicleTransmission {

	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SET;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_UPDATE;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP;

	private final MemorySegment jphVehicleTransmission;

	static {
		//@formatter:off
		JPH_VEHICLE_TRANSMISSION_SET = downcallHandleVoid("JPH_VehicleTransmission_Set", ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_UPDATE = downcallHandleVoid("JPH_VehicleTransmission_Update", ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_BOOLEAN);
		JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR = downcallHandle("JPH_VehicleTransmission_GetCurrentGear", JAVA_INT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION = downcallHandle("JPH_VehicleTransmission_GetClutchFriction", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR = downcallHandle("JPH_VehicleTransmission_IsSwitchingGear", JAVA_BOOLEAN, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO = downcallHandle("JPH_VehicleTransmission_GetCurrentRatio", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP = downcallHandle("JPH_VehicleTransmission_AllowSleep", JAVA_BOOLEAN, ADDRESS);
		//@formatter:on
	}

	public VehicleTransmission() {
		jphVehicleTransmission = Arena.ofAuto().allocate(ADDRESS);
	}

	public void set(MemorySegment segment) {
		jphVehicleTransmission.setAtIndex(ADDRESS, 0, segment);
	}

	/**
	 * Set input from driver regarding the transmission (only relevant when
	 * transmission is set to manual mode)
	 * 
	 * @param currentGear    Current gear, -1 = reverse, 0 = neutral, 1 = 1st gear
	 *                       etc.
	 * @param clutchFriction Value between 0 and 1 indicating how much friction the
	 *                       clutch gives (0 = no friction, 1 = full friction)
	 */
	public void set(int currentGear, float clutchFriction) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SET;
			method.invokeExact(memorySegment(), currentGear, clutchFriction);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call set.");
		}
	}

	/**
	 * Update the current gear and clutch friction if the transmission is in auto
	 * mode
	 * 
	 * @param deltaTime    Time step delta time in s
	 * @param currentRPM   Current RPM for engine
	 * @param forwardInput Hint if the user wants to drive forward (> 0) or
	 *                     backwards {@code < 0}
	 * @param canShiftUp   Indicates if we want to allow the transmission to shift
	 *                     up (e.g. pass false if wheels are slipping)
	 */
	public void update(float deltaTime, float currentRPM, float forwardInput, boolean canShiftUp) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_UPDATE;
			method.invokeExact(memorySegment(), deltaTime, currentRPM, forwardInput, canShiftUp);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call update.");
		}
	}

	/**
	 * Current gear, -1 = reverse, 0 = neutral, 1 = 1st gear etc.
	 */
	public int getCurrentGear() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR;
			return (int) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get current gear.");
		}
	}

	/**
	 * Value between 0 and 1 indicating how much friction the clutch gives (0 = no
	 * friction, 1 = full friction)
	 */
	public float getClutchFriction() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION;
			return (float) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get clutch friction.");
		}
	}

	/**
	 * f the auto box is currently switching gears.
	 */
	public boolean isSwitchingGear() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR;
			return (boolean) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if switching gear.");
		}
	}

	/**
	 * Return the transmission ratio based on the current gear (ratio between engine
	 * and differential)
	 */
	public float getCurrentRatio() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO;
			return (float) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get current ratio.");
		}
	}

	/**
	 * Only allow sleeping when the transmission is idle.
	 */
	public boolean allowSleep() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP;
			return (boolean) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot allow sleep.");
		}
	}

	private MemorySegment memorySegment() {
		return jphVehicleTransmission.getAtIndex(ADDRESS, 0);
	}

}