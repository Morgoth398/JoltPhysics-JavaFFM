package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Wheel object specifically for WheeledVehicleController.
 */
public final class WheelWV extends Wheel {

	private static final MethodHandle JPH_WHEEL_WV_CREATE;
	private static final MethodHandle JPH_WHEEL_WV_GET_SETTINGS;
	private static final MethodHandle JPH_WHEEL_WV_APPLY_TORQUE;

	static {
		//@formatter:off
		JPH_WHEEL_WV_CREATE = downcallHandle("JPH_WheelWV_Create", ADDRESS, ADDRESS);
		JPH_WHEEL_WV_GET_SETTINGS = downcallHandle("JPH_WheelWV_GetSettings", ADDRESS, ADDRESS);
		JPH_WHEEL_WV_APPLY_TORQUE = downcallHandleVoid("JPH_WheelWV_ApplyTorque", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		//@formatter:on
	}

	public WheelWV(WheelSettingsWV settings) {
		this(settings, Arena.ofAuto());
	}

	public WheelWV(WheelSettingsWV settings, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_WHEEL_WV_CREATE;
			segment = (MemorySegment) method.invokeExact(settings.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create wheel wv: " + className);
		}
		super(segment, arena);
	}

	@Override
	public WheelSettingsWV getSettings() {
		try {
			MethodHandle method = JPH_WHEEL_WV_GET_SETTINGS;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphWheel);

			if (segment.equals(MemorySegment.NULL))
				return null;

			WheelSettingsWV settings = (WheelSettingsWV) Jolt.getWheelSettings(segment.address());
			if (settings != null)
				return settings;

			return new WheelSettingsWV(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get settings: " + className);
		}
	}

	/**
	 * Apply a torque (N m) to the wheel for a particular delta time.
	 */
	public void applyTorque(float torque, float deltaTime) {
		try {
			MethodHandle method = JPH_WHEEL_WV_APPLY_TORQUE;
			method.invokeExact(jphWheel, torque, deltaTime);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot apply torque: " + className);
		}
	}

}