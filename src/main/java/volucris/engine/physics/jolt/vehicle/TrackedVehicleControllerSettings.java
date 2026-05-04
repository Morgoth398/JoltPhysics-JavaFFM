package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Settings of a vehicle with tank tracks
 * <p>
 * Default settings are based around what I could find about the M1 Abrams tank.
 * Note to avoid issues with very heavy objects vs very light objects the mass
 * of the tank should be a lot lower (say 10x) than that of a real tank. That
 * means that the engine/brake torque is also 10x less.
 */
public final class TrackedVehicleControllerSettings extends VehicleControllerSettings {

	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION;
	private static final MethodHandle JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION;

	static {
		//@formatter:off
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE = downcallHandle("JPH_TrackedVehicleControllerSettings_Create", ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_GetEngine", ADDRESS, ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_SetEngine", ADDRESS, ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION = downcallHandle("JPH_TrackedVehicleControllerSettings_GetTransmission", ADDRESS, ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_SetTransmission", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public TrackedVehicleControllerSettings() {
		this(Arena.ofAuto());
	}
	
	public TrackedVehicleControllerSettings(Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create tracked vehicle controller settings.");
		}
		super(segment, arena);
	}

	/**
	 * The properties of the engine. 
	 */
	public VehicleEngineSettings getEngine(VehicleEngineSettings target) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE;
			method.invokeExact(jphVehicleControllerSettings, target.memorySegment());

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get engine.");
		}
	}

	/**
	 * The properties of the engine. 
	 */
	public VehicleEngineSettings getEngine() {
		return getEngine(new VehicleEngineSettings());
	}

	/**
	 * The properties of the engine. 
	 */
	public void setEngine(VehicleEngineSettings settings) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE;
			method.invokeExact(jphVehicleControllerSettings, settings.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set engine.");
		}
	}

	/**
	 * 	The properties of the transmission (aka gear box)
	 */
	public VehicleTransmissionSettings getTransmission() {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleControllerSettings);

			if (segment.equals(MemorySegment.NULL))
				return null;

			VehicleTransmissionSettings settings = Jolt.getVehicleTransmissionSettings(segment.address());
			if (settings != null)
				return settings;

			return new VehicleTransmissionSettings(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get transmission.");
		}
	}

	/**
	 * 	The properties of the transmission (aka gear box)
	 */
	public void setTransmission(VehicleTransmissionSettings settings) {
		try {
			MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION;
			method.invokeExact(jphVehicleControllerSettings, settings.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set transmission.");
		}
	}

}