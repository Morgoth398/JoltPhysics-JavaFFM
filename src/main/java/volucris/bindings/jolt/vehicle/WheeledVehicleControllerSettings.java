/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class WheeledVehicleControllerSettings extends VehicleControllerSettings
		permits MotorcycleControllerSettings {

	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_AS_VEHICLE_CONTROLLER_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO;
	private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE = downcallHandle("JPH_WheeledVehicleControllerSettings_Create", UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_AS_VEHICLE_CONTROLLER_SETTINGS = downcallHandle("JPH_WheeledVehicleControllerSettings_AsVehicleControllerSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_GetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_GetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_GetDifferentials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferentials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO = downcallHandle("JPH_WheeledVehicleControllerSettings_GetDifferentialLimitedSlipRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferentialLimitedSlipRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public WheeledVehicleControllerSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public WheeledVehicleControllerSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleControllerSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public WheeledVehicleControllerSettings(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleControllerSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE.get();
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
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_AS_VEHICLE_CONTROLLER_SETTINGS.get();
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
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE.get();
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
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE.get();
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
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION.get();
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
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION.get();
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
    
    /// ```
    /// List of differentials and their properties
    /// ```
    public static void getDifferentials(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDifferentials].
    public final void getDifferentials(
    	VehicleDifferentialSettingsArray outResult
    ) {
    	getDifferentials(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// List of differentials and their properties
    /// ```
    public static void setDifferentials(
    	MemorySegment self,
    	MemorySegment mDifferentials
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDifferentials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDifferentials].
    public final void setDifferentials(
    	VehicleDifferentialSettingsArray mDifferentials
    ) {
    	setDifferentials(
    		this.segment,
    		mDifferentials.memorySegment()
    	);
    }
    
    /// ```
    /// Ratio max / min average wheel speed of each differential (measured at the clutch). When the ratio is exceeded all torque gets distributed to the differential with the minimal average velocity. This allows implementing a limited slip differential between differentials. Set to FLT_MAX for an open differential. Value should be > 1.
    /// ```
    public static float getDifferentialLimitedSlipRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO.get();
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
    
    /// ```
    /// Ratio max / min average wheel speed of each differential (measured at the clutch). When the ratio is exceeded all torque gets distributed to the differential with the minimal average velocity. This allows implementing a limited slip differential between differentials. Set to FLT_MAX for an open differential. Value should be > 1.
    /// ```
    public static void setDifferentialLimitedSlipRatio(
    	MemorySegment self,
    	float mDifferentialLimitedSlipRatio
    ) {
    	MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDifferentialLimitedSlipRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDifferentialLimitedSlipRatio].
    public final void setDifferentialLimitedSlipRatio(
    	float mDifferentialLimitedSlipRatio
    ) {
    	setDifferentialLimitedSlipRatio(
    		this.segment,
    		mDifferentialLimitedSlipRatio
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}