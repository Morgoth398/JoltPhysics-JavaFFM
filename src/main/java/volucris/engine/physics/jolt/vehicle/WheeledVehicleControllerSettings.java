package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Settings of a vehicle with regular wheels
 * <p>
 * The properties in this controller are largely based on "Car Physics for
 * Games" by Marco Monster. See: <a
 * href=https://www.asawicki.info/Mirror/Car%20Physics%20for%20Games/Car%20Physics%20for%20Games.html>https://www.asawicki.info/Mirror/Car%20Physics%20for%20Games/Car%20Physics%20for%20Games.html</a>
 * 
 */
public sealed class WheeledVehicleControllerSettings extends VehicleControllerSettings
		permits MotorcycleControllerSettings {

	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS_COUNT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS_COUNT;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO;
	private static final MethodHandle JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO;

	static {
		//@formatter:off
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE = downcallHandle("JPH_WheeledVehicleControllerSettings_Create", ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_GetEngine", ADDRESS, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetEngine", ADDRESS, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION = downcallHandle("JPH_WheeledVehicleControllerSettings_GetTransmission", ADDRESS, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetTransmission", ADDRESS, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS_COUNT = downcallHandle("JPH_WheeledVehicleControllerSettings_GetDifferentialsCount", JAVA_INT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS_COUNT = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferentialsCount", ADDRESS, JAVA_INT);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_GetDifferential", ADDRESS, JAVA_INT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferential", ADDRESS, JAVA_INT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferentials", ADDRESS, ADDRESS, JAVA_INT);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO = downcallHandle("JPH_WheeledVehicleControllerSettings_GetDifferentialLimitedSlipRatio", JAVA_FLOAT, ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferentialLimitedSlipRatio", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	protected WheeledVehicleControllerSettings(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected WheeledVehicleControllerSettings(MemorySegment segment, Arena arena) {
		super(segment, arena);
	}

	public WheeledVehicleControllerSettings() {
		this(Arena.ofAuto());
	}

	public WheeledVehicleControllerSettings(Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create wheeled vehicle controller settings.");
		}
		super(segment, arena);
	}

	/**
	 * The properties of the engine.
	 */
	public VehicleEngineSettings getEngine(VehicleEngineSettings target) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE;
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
	public void setEngine(VehicleEngineSettings engine) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE;
			method.invokeExact(jphVehicleControllerSettings, engine.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set engine.");
		}
	}

	/**
	 * The properties of the transmission (aka gear box)
	 */
	public VehicleTransmissionSettings getTransmission() {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION;
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
	 * The properties of the transmission (aka gear box)
	 */
	public void setTransmission(VehicleTransmissionSettings transmission) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION;
			method.invokeExact(jphVehicleControllerSettings, transmission.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set transmission.");
		}
	}

	/**
	 * 
	 */
	public int getDifferentialsCount() {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS_COUNT;
			return (int) method.invokeExact(jphVehicleControllerSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get differentials count.");
		}
	}

	/**
	 * 
	 */
	public void setDifferentialsCount(int count) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS_COUNT;
			method.invokeExact(jphVehicleControllerSettings, count);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set differentials count.");
		}
	}

	/**
	 * 
	 */
	public VehicleDifferentialSettings getDifferential(int index, VehicleDifferentialSettings target) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL;
			method.invokeExact(jphVehicleControllerSettings, index, target.memorySegment());

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get differential.");
		}
	}

	/**
	 * 
	 */
	public VehicleDifferentialSettings getDifferential(int index) {
		return getDifferential(index, new VehicleDifferentialSettings());
	}

	/**
	 * 
	 */
	public void setDifferential(int index, VehicleDifferentialSettings differential) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL;
			method.invokeExact(jphVehicleControllerSettings, index, differential.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set differential.");
		}
	}

	/**
	 * 
	 */
	public void setDifferentials(VehicleDifferentialSettings... values) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(values.length, ADDRESS));

			for (int i = 0; i < values.length; i++) {
				MemorySegment segment = values[i].memorySegment();
				array.setAtIndex(ADDRESS, i, segment);
			}

			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS;
			method.invokeExact(jphVehicleControllerSettings, array, values.length);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call set differentials.");
		}
	}

	/**
	 * Ratio max / min average wheel speed of each differential (measured at the
	 * clutch). When the ratio is exceeded all torque gets distributed to the
	 * differential with the minimal average velocity. This allows implementing a
	 * limited slip differential between differentials. Set to FLT_MAX for an open
	 * differential. Value should be > 1.
	 */
	public float getDifferentialLimitedSlipRatio() {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO;
			return (float) method.invokeExact(jphVehicleControllerSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get differential limited slip ratio.");
		}
	}

	/**
	 * @see #getDifferentialLimitedSlipRatio()
	 */
	public void setDifferentialLimitedSlipRatio(float value) {
		try {
			MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO;
			method.invokeExact(jphVehicleControllerSettings, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set differential limited slip ratio.");
		}
	}

}