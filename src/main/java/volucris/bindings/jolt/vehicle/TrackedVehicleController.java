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

public final class TrackedVehicleController extends VehicleController {

	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_AS_VEHICLE_CONTROLLER;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE1;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION1;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_RPMMETER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TRACKED_VEHICLE_CONTROLLER_CREATE = downcallHandle("JPH_TrackedVehicleController_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_AS_VEHICLE_CONTROLLER = downcallHandle("JPH_TrackedVehicleController_AsVehicleController", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetDriverInput", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetForwardInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT = downcallHandle("JPH_TrackedVehicleController_GetForwardInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO = downcallHandleVoid("JPH_TrackedVehicleController_SetLeftRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO = downcallHandle("JPH_TrackedVehicleController_GetLeftRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO = downcallHandleVoid("JPH_TrackedVehicleController_SetRightRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO = downcallHandle("JPH_TrackedVehicleController_GetRightRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetBrakeInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT = downcallHandle("JPH_TrackedVehicleController_GetBrakeInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE = downcallHandle("JPH_TrackedVehicleController_GetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE1 = downcallHandle("JPH_TrackedVehicleController_GetEngine1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION = downcallHandle("JPH_TrackedVehicleController_GetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION1 = downcallHandle("JPH_TrackedVehicleController_GetTransmission1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SET_RPMMETER = downcallHandleVoid("JPH_TrackedVehicleController_SetRPMMeter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public TrackedVehicleController(
	    TrackedVehicleControllerSettings inSettings,
	    VehicleConstraint inConstraint
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inConstraint
	    );
	}
	
	/// Typed method of [#create].
	public TrackedVehicleController(
		Arena arena,
		TrackedVehicleControllerSettings inSettings,
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

	public TrackedVehicleController(MemorySegment segment) {
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
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_CREATE.get();
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
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_AS_VEHICLE_CONTROLLER.get();
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
    /// @param inLeftRatio Value between -1 and 1 indicating an extra multiplier to the rotation rate of the left track (used for steering)
    /// @param inRightRatio Value between -1 and 1 indicating an extra multiplier to the rotation rate of the right track (used for steering)
    /// @param inBrake Value between 0 and 1 indicating how strong the brake pedal is pressed
    /// ```
    public static void setDriverInput(
    	MemorySegment self,
    	float inForward,
    	float inLeftRatio,
    	float inRightRatio,
    	float inBrake
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inForward,
    			inLeftRatio,
    			inRightRatio,
    			inBrake
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDriverInput].
    public final void setDriverInput(
    	float inForward,
    	float inLeftRatio,
    	float inRightRatio,
    	float inBrake
    ) {
    	setDriverInput(
    		this.segment,
    		inForward,
    		inLeftRatio,
    		inRightRatio,
    		inBrake
    	);
    }
    
    /// ```
    /// Value between -1 and 1 for auto transmission and value between 0 and 1 indicating desired driving direction and amount the gas pedal is pressed
    /// ```
    public static void setForwardInput(
    	MemorySegment self,
    	float inForward
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT.get();
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
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT.get();
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
    /// Value between -1 and 1 indicating an extra multiplier to the rotation rate of the left track (used for steering)
    /// ```
    public static void setLeftRatio(
    	MemorySegment self,
    	float inLeftRatio
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLeftRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeftRatio].
    public final void setLeftRatio(
    	float inLeftRatio
    ) {
    	setLeftRatio(
    		this.segment,
    		inLeftRatio
    	);
    }
    
    public static float getLeftRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeftRatio].
    public final float getLeftRatio() {
    	return getLeftRatio(
    		this.segment
    	);
    }
    
    /// ```
    /// Value between -1 and 1 indicating an extra multiplier to the rotation rate of the right track (used for steering)
    /// ```
    public static void setRightRatio(
    	MemorySegment self,
    	float inRightRatio
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRightRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRightRatio].
    public final void setRightRatio(
    	float inRightRatio
    ) {
    	setRightRatio(
    		this.segment,
    		inRightRatio
    	);
    }
    
    public static float getRightRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRightRatio].
    public final float getRightRatio() {
    	return getRightRatio(
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
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT.get();
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
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT.get();
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
    /// Get current engine state
    /// ```
    public static MemorySegment getEngine(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE.get();
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
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE1.get();
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
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION.get();
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
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION1.get();
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
    /// Debug drawing of RPM meter
    /// ```
    public static void setRPMMeter(
    	MemorySegment self,
    	MemorySegment inPosition,
    	float inSize
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_RPMMETER.get();
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