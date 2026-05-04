/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.constraint.VehicleConstraint;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class VehicleController
		permits WheeledVehicleController,
		TrackedVehicleController {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT = downcallHandle("JPH_VehicleController_GetConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public VehicleController(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment getConstraint(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT.get();
        try {
            return (MemorySegment) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getConstraint}.
     */
    public final @Nullable VehicleConstraint getConstraint(
    ) {
        MemorySegment segment = getConstraint(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new VehicleConstraint(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}