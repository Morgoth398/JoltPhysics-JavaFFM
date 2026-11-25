/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.constraints.VehicleConstraint;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class WheeledVehicleController extends VehicleController
		permits MotorcycleController {

	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_AS_VEHICLE_CONTROLLER;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE1;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION1;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIALS;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIALS1;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_TIRE_MAX_IMPULSE_CALLBACK;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_TIRE_MAX_IMPULSE_CALLBACK;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_RPMMETER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_WHEELED_VEHICLE_CONTROLLER_CREATE = downcallHandle("JPH_WheeledVehicleController_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_AS_VEHICLE_CONTROLLER = downcallHandle("JPH_WheeledVehicleController_AsVehicleController", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetDriverInput", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetForwardInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT = downcallHandle("JPH_WheeledVehicleController_GetForwardInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetRightInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT = downcallHandle("JPH_WheeledVehicleController_GetRightInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetBrakeInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT = downcallHandle("JPH_WheeledVehicleController_GetBrakeInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetHandBrakeInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT = downcallHandle("JPH_WheeledVehicleController_GetHandBrakeInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE = downcallHandle("JPH_WheeledVehicleController_GetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE1 = downcallHandle("JPH_WheeledVehicleController_GetEngine1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION = downcallHandle("JPH_WheeledVehicleController_GetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION1 = downcallHandle("JPH_WheeledVehicleController_GetTransmission1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIALS = downcallHandle("JPH_WheeledVehicleController_GetDifferentials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIALS1 = downcallHandle("JPH_WheeledVehicleController_GetDifferentials1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO = downcallHandle("JPH_WheeledVehicleController_GetDifferentialLimitedSlipRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO = downcallHandleVoid("JPH_WheeledVehicleController_SetDifferentialLimitedSlipRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH = downcallHandle("JPH_WheeledVehicleController_GetWheelSpeedAtClutch", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_GET_TIRE_MAX_IMPULSE_CALLBACK = downcallHandle("JPH_WheeledVehicleController_GetTireMaxImpulseCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_TIRE_MAX_IMPULSE_CALLBACK = downcallHandleVoid("JPH_WheeledVehicleController_SetTireMaxImpulseCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SET_RPMMETER = downcallHandleVoid("JPH_WheeledVehicleController_SetRPMMeter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public WheeledVehicleController(
	    WheeledVehicleControllerSettings inSettings,
	    VehicleConstraint inConstraint
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inConstraint
	    );
	}
	
	/// Typed method of [#create].
	public WheeledVehicleController(
		Arena arena,
		WheeledVehicleControllerSettings inSettings,
		VehicleConstraint inConstraint
	) {
		MemorySegment segment = create(
			inSettings.memorySegment(),
			inConstraint.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleController(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public WheeledVehicleController(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleController(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inSettings,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asVehicleController(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_AS_VEHICLE_CONTROLLER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Set input from driver
    /// @param inForward Value between -1 and 1 for auto transmission and value between 0 and 1 indicating desired driving direction and amount the gas pedal is pressed
    /// @param inRight Value between -1 and 1 indicating desired steering angle (1 = right)
    /// @param inBrake Value between 0 and 1 indicating how strong the brake pedal is pressed
    /// @param inHandBrake Value between 0 and 1 indicating how strong the hand brake is pulled
    /// ```
    public static void setDriverInput(
    	MemorySegment self,
    	float inForward,
    	float inRight,
    	float inBrake,
    	float inHandBrake
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inForward,
    			inRight,
    			inBrake,
    			inHandBrake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDriverInput].
    public final void setDriverInput(
    	float inForward,
    	float inRight,
    	float inBrake,
    	float inHandBrake
    ) {
    	setDriverInput(
    		this.segment,
    		inForward,
    		inRight,
    		inBrake,
    		inHandBrake
    	);
    }
    
    /// ```
    /// Value between -1 and 1 for auto transmission and value between 0 and 1 indicating desired driving direction and amount the gas pedal is pressed
    /// ```
    public static void setForwardInput(
    	MemorySegment self,
    	float inForward
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inForward
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setForwardInput].
    public final void setForwardInput(
    	float inForward
    ) {
    	setForwardInput(
    		this.segment,
    		inForward
    	);
    }
    
    public static float getForwardInput(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getForwardInput].
    public final float getForwardInput() {
    	return getForwardInput(
    		this.segment
    	);
    }
    
    /// ```
    /// Value between -1 and 1 indicating desired steering angle (1 = right)
    /// ```
    public static void setRightInput(
    	MemorySegment self,
    	float inRight
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRightInput].
    public final void setRightInput(
    	float inRight
    ) {
    	setRightInput(
    		this.segment,
    		inRight
    	);
    }
    
    public static float getRightInput(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRightInput].
    public final float getRightInput() {
    	return getRightInput(
    		this.segment
    	);
    }
    
    /// ```
    /// Value between 0 and 1 indicating how strong the brake pedal is pressed
    /// ```
    public static void setBrakeInput(
    	MemorySegment self,
    	float inBrake
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBrake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBrakeInput].
    public final void setBrakeInput(
    	float inBrake
    ) {
    	setBrakeInput(
    		this.segment,
    		inBrake
    	);
    }
    
    public static float getBrakeInput(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBrakeInput].
    public final float getBrakeInput() {
    	return getBrakeInput(
    		this.segment
    	);
    }
    
    /// ```
    /// Value between 0 and 1 indicating how strong the hand brake is pulled
    /// ```
    public static void setHandBrakeInput(
    	MemorySegment self,
    	float inHandBrake
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inHandBrake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHandBrakeInput].
    public final void setHandBrakeInput(
    	float inHandBrake
    ) {
    	setHandBrakeInput(
    		this.segment,
    		inHandBrake
    	);
    }
    
    public static float getHandBrakeInput(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHandBrakeInput].
    public final float getHandBrakeInput() {
    	return getHandBrakeInput(
    		this.segment
    	);
    }
    
    /// ```
    /// Get current engine state
    /// ```
    public static MemorySegment getEngine(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEngine].
    public final @Nullable VehicleEngine getEngine() {
    	MemorySegment segment = getEngine(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleEngine(segment);
    }
    
    /// ```
    /// Get current engine state (writable interface, allows you to make changes to the configuration which will take effect the next time step)
    /// ```
    public static MemorySegment getEngine1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEngine1].
    public final @Nullable VehicleEngine getEngine1() {
    	MemorySegment segment = getEngine1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleEngine(segment);
    }
    
    /// ```
    /// Get current transmission state
    /// ```
    public static MemorySegment getTransmission(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransmission].
    public final @Nullable VehicleTransmission getTransmission() {
    	MemorySegment segment = getTransmission(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleTransmission(segment);
    }
    
    /// ```
    /// Get current transmission state (writable interface, allows you to make changes to the configuration which will take effect the next time step)
    /// ```
    public static MemorySegment getTransmission1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransmission1].
    public final @Nullable VehicleTransmission getTransmission1() {
    	MemorySegment segment = getTransmission1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleTransmission(segment);
    }
    
    /// ```
    /// Get the differentials this vehicle has
    /// ```
    public static MemorySegment getDifferentials(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIALS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDifferentials].
    public final @Nullable VehicleDifferentialSettingsArray getDifferentials() {
    	MemorySegment segment = getDifferentials(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleDifferentialSettingsArray(segment);
    }
    
    /// ```
    /// Get the differentials this vehicle has (writable interface, allows you to make changes to the configuration which will take effect the next time step)
    /// ```
    public static MemorySegment getDifferentials1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIALS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDifferentials1].
    public final @Nullable VehicleDifferentialSettingsArray getDifferentials1() {
    	MemorySegment segment = getDifferentials1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleDifferentialSettingsArray(segment);
    }
    
    /// ```
    /// Ratio max / min average wheel speed of each differential (measured at the clutch).
    /// ```
    public static float getDifferentialLimitedSlipRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDifferentialLimitedSlipRatio].
    public final float getDifferentialLimitedSlipRatio() {
    	return getDifferentialLimitedSlipRatio(
    		this.segment
    	);
    }
    
    public static void setDifferentialLimitedSlipRatio(
    	MemorySegment self,
    	float inV
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDifferentialLimitedSlipRatio].
    public final void setDifferentialLimitedSlipRatio(
    	float inV
    ) {
    	setDifferentialLimitedSlipRatio(
    		this.segment,
    		inV
    	);
    }
    
    /// ```
    /// Get the average wheel speed of all driven wheels (measured at the clutch)
    /// ```
    public static float getWheelSpeedAtClutch(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelSpeedAtClutch].
    public final float getWheelSpeedAtClutch() {
    	return getWheelSpeedAtClutch(
    		this.segment
    	);
    }
    
    public static MemorySegment getTireMaxImpulseCallback(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_TIRE_MAX_IMPULSE_CALLBACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTireMaxImpulseCallback].
    public final @Nullable TireMaxImpulseCallback getTireMaxImpulseCallback() {
    	MemorySegment segment = getTireMaxImpulseCallback(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TireMaxImpulseCallback(segment);
    }
    
    public static void setTireMaxImpulseCallback(
    	MemorySegment self,
    	MemorySegment inTireMaxImpulseCallback
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_TIRE_MAX_IMPULSE_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTireMaxImpulseCallback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTireMaxImpulseCallback].
    public final void setTireMaxImpulseCallback(
    	TireMaxImpulseCallback inTireMaxImpulseCallback
    ) {
    	setTireMaxImpulseCallback(
    		this.segment,
    		inTireMaxImpulseCallback.memorySegment()
    	);
    }
    
    /// ```
    /// Debug drawing of RPM meter
    /// ```
    public static void setRPMMeter(
    	MemorySegment self,
    	MemorySegment inPosition,
    	float inSize
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_RPMMETER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRPMMeter].
    public final void setRPMMeter(
    	Vec3 inPosition,
    	float inSize
    ) {
    	setRPMMeter(
    		this.segment,
    		inPosition.memorySegment(),
    		inSize
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}