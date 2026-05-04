/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class VehicleControllerSettings
		permits WheeledVehicleControllerSettings,
		TrackedVehicleControllerSettings {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleControllerSettings_Destroy", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public VehicleControllerSettings(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #destroy}.
     */
    public final void destroy(
    ) {
        destroy(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}