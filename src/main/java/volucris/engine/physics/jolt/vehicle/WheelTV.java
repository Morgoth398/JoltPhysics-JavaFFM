package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Wheel object specifically for TrackedVehicleController.
 */
public final class WheelTV extends Wheel {

	private static final MethodHandle JPH_WHEEL_TV_CREATE;
	private static final MethodHandle JPH_WHEEL_TV_GET_SETTINGS;

	static {
		//@formatter:off
		JPH_WHEEL_TV_CREATE = downcallHandle("JPH_WheelTV_Create", ADDRESS, ADDRESS);
		JPH_WHEEL_TV_GET_SETTINGS = downcallHandle("JPH_WheelTV_GetSettings", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public WheelTV(WheelSettingsTV settings) {
		this(settings, Arena.ofAuto());
	}
	
	public WheelTV(WheelSettingsTV settings, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_WHEEL_TV_CREATE;
			segment = (MemorySegment) method.invokeExact(settings.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create wheel tv.");
		}
		super(segment, arena);
	}

	@Override
	public WheelSettingsTV getSettings() {
		try {
			MethodHandle method = JPH_WHEEL_TV_GET_SETTINGS;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphWheel);

			if (segment.equals(MemorySegment.NULL))
				return null;

			WheelSettingsTV settings = (WheelSettingsTV) Jolt.getWheelSettings(segment.address());
			if (settings != null)
				return settings;

			return new WheelSettingsTV(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get settings.");
		}
	}

}