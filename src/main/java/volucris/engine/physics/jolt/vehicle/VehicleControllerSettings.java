package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Basic settings object for interface that controls acceleration / deceleration
 * of the vehicle.
 */
public sealed class VehicleControllerSettings
		permits WheeledVehicleControllerSettings, TrackedVehicleControllerSettings {

	private static final MethodHandle JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY;

	protected final MemorySegment jphVehicleControllerSettings;

	static {
		//@formatter:off
		JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleControllerSettings_Destroy", ADDRESS);
		//@formatter:on
	}

	protected VehicleControllerSettings(MemorySegment segment) {
		jphVehicleControllerSettings = segment.reinterpret(Arena.ofAuto(), s -> destroy(s));
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy vehicle controller settings.");
		}
	}

	public MemorySegment memorySegment() {
		return jphVehicleControllerSettings;
	}

}