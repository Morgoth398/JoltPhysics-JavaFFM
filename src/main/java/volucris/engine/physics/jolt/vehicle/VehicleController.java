package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.constraint.VehicleConstraint;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Runtime data for interface that controls acceleration / deceleration of the
 * vehicle.
 */
public sealed class VehicleController permits WheeledVehicleController, TrackedVehicleController {

	private static final MethodHandle JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT;

	protected final MemorySegment jphVehicleController;

	static {
		//@formatter:off
		JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT = downcallHandle("JPH_VehicleController_GetConstraint", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public VehicleController(MemorySegment segment) {
		this.jphVehicleController = segment;

		Jolt.addVehicleController(segment.address(), this);
	}

	/**
	 * Access the vehicle constraint that this controller is part of.
	 */
	public VehicleConstraint getConstraint() {
		try {
			MethodHandle method = JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphVehicleController);

			if (segment.equals(MemorySegment.NULL))
				return null;

			VehicleConstraint constraint = (VehicleConstraint) Jolt.getConstraint(segment.address());
			if (constraint != null)
				return constraint;

			return new VehicleConstraint(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get constraint.");
		}
	}

	/**
	 * The method does not check if the memory segment points to a
	 * WheeledVehicleController, so make sure of that first.
	 */
	public WheeledVehicleController asWheeledVehicleController() {
		if (this instanceof WheeledVehicleController c)
			return c;

		return new WheeledVehicleController(jphVehicleController);
	}

	/**
	 * The method does not check if the memory segment points to a
	 * TrackedVehicleController, so make sure of that first.
	 */
	public TrackedVehicleController asTrackedVehicleController() {
		if (this instanceof TrackedVehicleController c)
			return c;

		return new TrackedVehicleController(jphVehicleController);
	}

	public MemorySegment memorySegment() {
		return jphVehicleController;
	}

}