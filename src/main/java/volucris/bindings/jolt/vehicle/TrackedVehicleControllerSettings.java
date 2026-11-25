/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class TrackedVehicleControllerSettings extends VehicleControllerSettings {

	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_AS_VEHICLE_CONTROLLER_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION;
	private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE = downcallHandle("JPH_TrackedVehicleControllerSettings_Create", UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_AS_VEHICLE_CONTROLLER_SETTINGS = downcallHandle("JPH_TrackedVehicleControllerSettings_AsVehicleControllerSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_GetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_SetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_GetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_SetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TrackedVehicleControllerSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public TrackedVehicleControllerSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleControllerSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TrackedVehicleControllerSettings(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleControllerSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asVehicleControllerSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_AS_VEHICLE_CONTROLLER_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The properties of the engine
    /// ```
    public static void getEngine(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEngine].
    public final void getEngine(
    	VehicleEngineSettings outResult
    ) {
    	getEngine(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The properties of the engine
    /// ```
    public static void setEngine(
    	MemorySegment self,
    	MemorySegment mEngine
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mEngine
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEngine].
    public final void setEngine(
    	VehicleEngineSettings mEngine
    ) {
    	setEngine(
    		this.segment,
    		mEngine.memorySegment()
    	);
    }
    
    /// ```
    /// The properties of the transmission (aka gear box)
    /// ```
    public static void getTransmission(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransmission].
    public final void getTransmission(
    	VehicleTransmissionSettings outResult
    ) {
    	getTransmission(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The properties of the transmission (aka gear box)
    /// ```
    public static void setTransmission(
    	MemorySegment self,
    	MemorySegment mTransmission
    ) {
    	MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTransmission
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTransmission].
    public final void setTransmission(
    	VehicleTransmissionSettings mTransmission
    ) {
    	setTransmission(
    		this.segment,
    		mTransmission.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}