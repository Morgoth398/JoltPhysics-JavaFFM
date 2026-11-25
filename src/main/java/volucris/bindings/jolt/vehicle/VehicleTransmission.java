/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StateRecorder;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleTransmission extends VehicleTransmissionSettings {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_AS_VEHICLE_TRANSMISSION_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SET;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_UPDATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_TRANSMISSION_CREATE = downcallHandle("JPH_VehicleTransmission_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_AS_VEHICLE_TRANSMISSION_SETTINGS = downcallHandle("JPH_VehicleTransmission_AsVehicleTransmissionSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SET = downcallHandleVoid("JPH_VehicleTransmission_Set", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_UPDATE = downcallHandleVoid("JPH_VehicleTransmission_Update", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_BOOLEAN);
		JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR = downcallHandle("JPH_VehicleTransmission_GetCurrentGear", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION = downcallHandle("JPH_VehicleTransmission_GetClutchFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR = downcallHandle("JPH_VehicleTransmission_IsSwitchingGear", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO = downcallHandle("JPH_VehicleTransmission_GetCurrentRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP = downcallHandle("JPH_VehicleTransmission_AllowSleep", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SAVE_STATE = downcallHandleVoid("JPH_VehicleTransmission_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_RESTORE_STATE = downcallHandleVoid("JPH_VehicleTransmission_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleTransmission() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleTransmission(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleTransmissionSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public VehicleTransmission(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleTransmissionSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asVehicleTransmissionSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_AS_VEHICLE_TRANSMISSION_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Set input from driver regarding the transmission (only relevant when transmission is set to manual mode)
    /// @param inCurrentGear Current gear, -1 = reverse, 0 = neutral, 1 = 1st gear etc.
    /// @param inClutchFriction Value between 0 and 1 indicating how much friction the clutch gives (0 = no friction, 1 = full friction)
    /// ```
    public static void set(
    	MemorySegment self,
    	int inCurrentGear,
    	float inClutchFriction
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCurrentGear,
    			inClutchFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#set].
    public final void set(
    	int inCurrentGear,
    	float inClutchFriction
    ) {
    	set(
    		this.segment,
    		inCurrentGear,
    		inClutchFriction
    	);
    }
    
    /// ```
    /// Update the current gear and clutch friction if the transmission is in auto mode
    /// @param inDeltaTime Time step delta time in s
    /// @param inCurrentRPM Current RPM for engine
    /// @param inForwardInput Hint if the user wants to drive forward (> 0) or backwards (< 0)
    /// @param inCanShiftUp Indicates if we want to allow the transmission to shift up (e.g. pass false if wheels are slipping)
    /// ```
    public static void update(
    	MemorySegment self,
    	float inDeltaTime,
    	float inCurrentRPM,
    	float inForwardInput,
    	boolean inCanShiftUp
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_UPDATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inCurrentRPM,
    			inForwardInput,
    			inCanShiftUp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#update].
    public final void update(
    	float inDeltaTime,
    	float inCurrentRPM,
    	float inForwardInput,
    	boolean inCanShiftUp
    ) {
    	update(
    		this.segment,
    		inDeltaTime,
    		inCurrentRPM,
    		inForwardInput,
    		inCanShiftUp
    	);
    }
    
    /// ```
    /// Current gear, -1 = reverse, 0 = neutral, 1 = 1st gear etc.
    /// ```
    public static int getCurrentGear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCurrentGear].
    public final int getCurrentGear() {
    	return getCurrentGear(
    		this.segment
    	);
    }
    
    /// ```
    /// Value between 0 and 1 indicating how much friction the clutch gives (0 = no friction, 1 = full friction)
    /// ```
    public static float getClutchFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClutchFriction].
    public final float getClutchFriction() {
    	return getClutchFriction(
    		this.segment
    	);
    }
    
    /// ```
    /// If the auto box is currently switching gears
    /// ```
    public static boolean isSwitchingGear(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSwitchingGear].
    public final boolean isSwitchingGear() {
    	return isSwitchingGear(
    		this.segment
    	);
    }
    
    /// ```
    /// Return the transmission ratio based on the current gear (ratio between engine and differential)
    /// ```
    public static float getCurrentRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCurrentRatio].
    public final float getCurrentRatio() {
    	return getCurrentRatio(
    		this.segment
    	);
    }
    
    /// ```
    /// Only allow sleeping when the transmission is idle
    /// ```
    public static boolean allowSleep(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#allowSleep].
    public final boolean allowSleep() {
    	return allowSleep(
    		this.segment
    	);
    }
    
    /// ```
    /// Saving state for replay
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SAVE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveState].
    public final void saveState(
    	StateRecorder inStream
    ) {
    	saveState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_RESTORE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreState].
    public final void restoreState(
    	StateRecorder inStream
    ) {
    	restoreState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}