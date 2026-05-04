package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Configuration for the transmission of a vehicle (gear box)
 */
public final class VehicleTransmissionSettings {

	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO_COUNT;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIO;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO_COUNT;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIO;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH;
	private static final MethodHandle JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH;

	private final MemorySegment jphVehicleTransmissionSettings;

	static {
		//@formatter:off
		JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE = downcallHandle("JPH_VehicleTransmissionSettings_Create", ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleTransmissionSettings_Destroy", ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE = downcallHandle("JPH_VehicleTransmissionSettings_GetMode", JAVA_INT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetMode", ADDRESS, JAVA_INT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO_COUNT = downcallHandle("JPH_VehicleTransmissionSettings_GetGearRatioCount", JAVA_INT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO = downcallHandle("JPH_VehicleTransmissionSettings_GetGearRatio", JAVA_FLOAT, ADDRESS, JAVA_INT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIO = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetGearRatio", ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS = downcallHandle("JPH_VehicleTransmissionSettings_GetGearRatios", ADDRESS, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetGearRatios", ADDRESS, ADDRESS, JAVA_INT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO_COUNT = downcallHandle("JPH_VehicleTransmissionSettings_GetReverseGearRatioCount", JAVA_INT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO = downcallHandle("JPH_VehicleTransmissionSettings_GetReverseGearRatio", JAVA_FLOAT, ADDRESS, JAVA_INT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIO = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetReverseGearRatio", ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS = downcallHandle("JPH_VehicleTransmissionSettings_GetReverseGearRatios", ADDRESS, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetReverseGearRatios", ADDRESS, ADDRESS, JAVA_INT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME = downcallHandle("JPH_VehicleTransmissionSettings_GetSwitchTime", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetSwitchTime", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME = downcallHandle("JPH_VehicleTransmissionSettings_GetClutchReleaseTime", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetClutchReleaseTime", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY = downcallHandle("JPH_VehicleTransmissionSettings_GetSwitchLatency", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetSwitchLatency", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM = downcallHandle("JPH_VehicleTransmissionSettings_GetShiftUpRPM", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetShiftUpRPM", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM = downcallHandle("JPH_VehicleTransmissionSettings_GetShiftDownRPM", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetShiftDownRPM", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH = downcallHandle("JPH_VehicleTransmissionSettings_GetClutchStrength", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetClutchStrength", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	protected VehicleTransmissionSettings(MemorySegment segment) {
		jphVehicleTransmissionSettings = segment;

		Jolt.addVehicleTransmissionSettings(segment.address(), this);
	}

	public VehicleTransmissionSettings() {
		this(Arena.ofAuto());
	}

	public VehicleTransmissionSettings(Arena arena) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphVehicleTransmissionSettings = segment.reinterpret(arena, s -> destroy(s));
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create vehicle transmission settings: " + className);
		}

		Jolt.addVehicleTransmissionSettings(jphVehicleTransmissionSettings.address(), this);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy transmission settings: " + className);
		}

		Jolt.removeVehicleTransmissionSettings(segment.address());
	}

	/**
	 * How to switch gears.
	 */
	public TransmissionMode getMode() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE;
			int value = (int) method.invokeExact(jphVehicleTransmissionSettings);

			for (TransmissionMode mode : TransmissionMode.values()) {
				if (value == mode.id())
					return mode;
			}

			throw new Throwable();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get mode: " + className);
		}
	}

	/**
	 * How to switch gears.
	 */
	public void setMode(TransmissionMode mode) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE;
			method.invokeExact(jphVehicleTransmissionSettings, mode.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set mode: " + className);
		}
	}

	/**
	 * 
	 */
	public int getGearRatioCount() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO_COUNT;
			return (int) method.invokeExact(jphVehicleTransmissionSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get gear ratio count: " + className);
		}
	}

	/**
	 * Ratio in rotation rate between engine and gear box, first element is 1st
	 * gear, 2nd element 2nd gear etc.
	 */
	public float getGearRatio(int index) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO;
			return (float) method.invokeExact(jphVehicleTransmissionSettings, index);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get gear ratio: " + className);
		}
	}

	/**
	 * Ratio in rotation rate between engine and gear box, first element is 1st
	 * gear, 2nd element 2nd gear etc.
	 */
	public void setGearRatio(int index, float value) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIO;
			method.invokeExact(jphVehicleTransmissionSettings, index, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set gear ratio: " + className);
		}
	}

	/**
	 * Ratio in rotation rate between engine and gear box, first element is 1st
	 * gear, 2nd element 2nd gear etc.
	 * <p>
	 * The array must be big enough to hold {@link #getGearRatioCount()} elements.
	 * 
	 * @param target The target array
	 * @return
	 */
	public float[] getGearRatios(float[] target) {
		try {
			int count = getGearRatioCount();

			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleTransmissionSettings);

			MemorySegment array = segment.reinterpret(count * Float.BYTES);
			MemorySegment.copy(array, JAVA_FLOAT, 0, target, 0, count);

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get gear ratios: " + className);
		}
	}

	/**
	 * @see #getGearRatios(float[])
	 */
	public float[] getGearRatios() {
		return getGearRatios(new float[getGearRatioCount()]);
	}

	/**
	 * Ratio in rotation rate between engine and gear box, first element is 1st
	 * gear, 2nd element 2nd gear etc.
	 */
	public void setGearRatios(float... values) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocateFrom(JAVA_FLOAT, values);

			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS;
			method.invokeExact(jphVehicleTransmissionSettings, array, values.length);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set gear ratios: " + className);
		}
	}

	/**
	 * 
	 */
	public int getReverseGearRatioCount() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO_COUNT;
			return (int) method.invokeExact(jphVehicleTransmissionSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get reverse gear ratio count: " + className);
		}
	}

	/**
	 * Ratio in rotation rate between engine and gear box when driving in reverse.
	 */
	public float getReverseGearRatio(int index) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO;
			return (float) method.invokeExact(jphVehicleTransmissionSettings, index);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get reverse gear ratio: " + className);
		}
	}

	/**
	 * Ratio in rotation rate between engine and gear box when driving in reverse.
	 */
	public void setReverseGearRatio(int index, float value) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIO;
			method.invokeExact(jphVehicleTransmissionSettings, index, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set reverse gear ratio: " + className);
		}
	}

	/**
	 * Ratio in rotation rate between engine and gear box when driving in reverse.
	 * <p>
	 * The array must be big enough to hold {@link #getReverseGearRatioCount()}
	 * elements.
	 * 
	 * @param target The target array
	 * @return
	 */
	public float[] getReverseGearRatios(float[] target) {
		try {
			int count = getReverseGearRatioCount();

			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleTransmissionSettings);

			MemorySegment array = segment.reinterpret(count * Float.BYTES);
			MemorySegment.copy(array, JAVA_FLOAT, 0, target, 0, count);

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get reverse gear ratios: " + className);
		}
	}

	public float[] getReverseGearRatios() {
		return getReverseGearRatios(new float[getReverseGearRatioCount()]);
	}

	/**
	 * Ratio in rotation rate between engine and gear box when driving in reverse.
	 */
	public void setReverseGearRatios(float... values) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocateFrom(JAVA_FLOAT, values);

			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS;
			method.invokeExact(jphVehicleTransmissionSettings, array, values.length);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set reverse gear ratios: " + className);
		}
	}

	/**
	 * How long it takes to switch gears (s), only used in auto mode.
	 */
	public float getSwitchTime() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME;
			return (float) method.invokeExact(jphVehicleTransmissionSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get switch time: " + className);
		}
	}

	/**
	 * How long it takes to switch gears (s), only used in auto mode.
	 */
	public void setSwitchTime(float value) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME;
			method.invokeExact(jphVehicleTransmissionSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set switch time: " + className);
		}
	}

	/**
	 * How long it takes to release the clutch (go to full friction), only used in
	 * auto mode.
	 */
	public float getClutchReleaseTime() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME;
			return (float) method.invokeExact(jphVehicleTransmissionSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get clutch release time: " + className);
		}
	}

	/**
	 * How long it takes to release the clutch (go to full friction), only used in
	 * auto mode.
	 */
	public void setClutchReleaseTime(float value) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME;
			method.invokeExact(jphVehicleTransmissionSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set clutch release time: " + className);
		}
	}

	/**
	 * How long to wait after releasing the clutch before another switch is
	 * attempted (s), only used in auto mode.
	 */
	public float getSwitchLatency() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY;
			return (float) method.invokeExact(jphVehicleTransmissionSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get switch latency: " + className);
		}
	}

	/**
	 * How long to wait after releasing the clutch before another switch is
	 * attempted (s), only used in auto mode.
	 */
	public void setSwitchLatency(float value) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY;
			method.invokeExact(jphVehicleTransmissionSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set switch latency: " + className);
		}
	}

	/**
	 * If RPM of engine is bigger then this we will shift a gear up, only used in
	 * auto mode.
	 */
	public float getShiftUpRPM() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM;
			return (float) method.invokeExact(jphVehicleTransmissionSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get shift up RPM: " + className);
		}
	}

	/**
	 * If RPM of engine is bigger then this we will shift a gear up, only used in
	 * auto mode.
	 */
	public void setShiftUpRPM(float value) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM;
			method.invokeExact(jphVehicleTransmissionSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set shift up RPM: " + className);
		}
	}

	/**
	 * If RPM of engine is smaller then this we will shift a gear down, only used in
	 * auto mode.
	 */
	public float getShiftDownRPM() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM;
			return (float) method.invokeExact(jphVehicleTransmissionSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get shift down RPM: " + className);
		}
	}

	/**
	 * If RPM of engine is smaller then this we will shift a gear down, only used in
	 * auto mode.
	 */
	public void setShiftDownRPM(float value) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM;
			method.invokeExact(jphVehicleTransmissionSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set shift down RPM: " + className);
		}
	}

	/**
	 * Strength of the clutch when fully engaged. Total torque a clutch applies is
	 * Torque = ClutchStrength * (Velocity Engine - Avg Velocity Wheels At Clutch)
	 * (units: k m^2 s^-1)
	 */
	public float getClutchStrength() {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH;
			return (float) method.invokeExact(jphVehicleTransmissionSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get clutch strength: " + className);
		}
	}

	/**
	 * @see #getClutchStrength()
	 */
	public void setClutchStrength(float value) {
		try {
			MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH;
			method.invokeExact(jphVehicleTransmissionSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set clutch strength: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphVehicleTransmissionSettings;
	}

}