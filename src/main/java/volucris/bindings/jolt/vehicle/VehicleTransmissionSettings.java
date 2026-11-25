/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.FloatArray;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class VehicleTransmissionSettings
		permits VehicleTransmission {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_RESTORE_BINARY_STATE;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE = downcallHandle("JPH_VehicleTransmissionSettings_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleTransmissionSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE = downcallHandle("JPH_VehicleTransmissionSettings_GetMode", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetMode", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS = downcallHandleVoid("JPH_VehicleTransmissionSettings_GetGearRatios", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetGearRatios", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS = downcallHandleVoid("JPH_VehicleTransmissionSettings_GetReverseGearRatios", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetReverseGearRatios", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME = downcallHandle("JPH_VehicleTransmissionSettings_GetSwitchTime", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetSwitchTime", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME = downcallHandle("JPH_VehicleTransmissionSettings_GetClutchReleaseTime", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetClutchReleaseTime", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY = downcallHandle("JPH_VehicleTransmissionSettings_GetSwitchLatency", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetSwitchLatency", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM = downcallHandle("JPH_VehicleTransmissionSettings_GetShiftUpRPM", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetShiftUpRPM", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM = downcallHandle("JPH_VehicleTransmissionSettings_GetShiftDownRPM", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetShiftDownRPM", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH = downcallHandle("JPH_VehicleTransmissionSettings_GetClutchStrength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetClutchStrength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_VehicleTransmissionSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRANSMISSION_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_VehicleTransmissionSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleTransmissionSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleTransmissionSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VehicleTransmissionSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// How to switch gears
    /// ```
    public static int getMode(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMode].
    public final int getMode() {
    	return getMode(
    		this.segment
    	);
    }
    
    /// ```
    /// How to switch gears
    /// ```
    public static void setMode(
    	MemorySegment self,
    	int mMode
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMode].
    public final void setMode(
    	int mMode
    ) {
    	setMode(
    		this.segment,
    		mMode
    	);
    }
    
    /// ```
    /// Ratio in rotation rate between engine and gear box, first element is 1st gear, 2nd element 2nd gear etc.
    /// ```
    public static void getGearRatios(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGearRatios].
    public final void getGearRatios(
    	FloatArray outResult
    ) {
    	getGearRatios(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Ratio in rotation rate between engine and gear box, first element is 1st gear, 2nd element 2nd gear etc.
    /// ```
    public static void setGearRatios(
    	MemorySegment self,
    	MemorySegment mGearRatios
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mGearRatios
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGearRatios].
    public final void setGearRatios(
    	FloatArray mGearRatios
    ) {
    	setGearRatios(
    		this.segment,
    		mGearRatios.memorySegment()
    	);
    }
    
    /// ```
    /// Ratio in rotation rate between engine and gear box when driving in reverse
    /// ```
    public static void getReverseGearRatios(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getReverseGearRatios].
    public final void getReverseGearRatios(
    	FloatArray outResult
    ) {
    	getReverseGearRatios(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Ratio in rotation rate between engine and gear box when driving in reverse
    /// ```
    public static void setReverseGearRatios(
    	MemorySegment self,
    	MemorySegment mReverseGearRatios
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mReverseGearRatios
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setReverseGearRatios].
    public final void setReverseGearRatios(
    	FloatArray mReverseGearRatios
    ) {
    	setReverseGearRatios(
    		this.segment,
    		mReverseGearRatios.memorySegment()
    	);
    }
    
    /// ```
    /// How long it takes to switch gears (s), only used in auto mode
    /// ```
    public static float getSwitchTime(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwitchTime].
    public final float getSwitchTime() {
    	return getSwitchTime(
    		this.segment
    	);
    }
    
    /// ```
    /// How long it takes to switch gears (s), only used in auto mode
    /// ```
    public static void setSwitchTime(
    	MemorySegment self,
    	float mSwitchTime
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSwitchTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSwitchTime].
    public final void setSwitchTime(
    	float mSwitchTime
    ) {
    	setSwitchTime(
    		this.segment,
    		mSwitchTime
    	);
    }
    
    /// ```
    /// How long it takes to release the clutch (go to full friction), only used in auto mode
    /// ```
    public static float getClutchReleaseTime(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClutchReleaseTime].
    public final float getClutchReleaseTime() {
    	return getClutchReleaseTime(
    		this.segment
    	);
    }
    
    /// ```
    /// How long it takes to release the clutch (go to full friction), only used in auto mode
    /// ```
    public static void setClutchReleaseTime(
    	MemorySegment self,
    	float mClutchReleaseTime
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME.get();
    	try {
    		 method.invokeExact(
    			self,
    			mClutchReleaseTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setClutchReleaseTime].
    public final void setClutchReleaseTime(
    	float mClutchReleaseTime
    ) {
    	setClutchReleaseTime(
    		this.segment,
    		mClutchReleaseTime
    	);
    }
    
    /// ```
    /// How long to wait after releasing the clutch before another switch is attempted (s), only used in auto mode
    /// ```
    public static float getSwitchLatency(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwitchLatency].
    public final float getSwitchLatency() {
    	return getSwitchLatency(
    		this.segment
    	);
    }
    
    /// ```
    /// How long to wait after releasing the clutch before another switch is attempted (s), only used in auto mode
    /// ```
    public static void setSwitchLatency(
    	MemorySegment self,
    	float mSwitchLatency
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSwitchLatency
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSwitchLatency].
    public final void setSwitchLatency(
    	float mSwitchLatency
    ) {
    	setSwitchLatency(
    		this.segment,
    		mSwitchLatency
    	);
    }
    
    /// ```
    /// If RPM of engine is bigger then this we will shift a gear up, only used in auto mode
    /// ```
    public static float getShiftUpRPM(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShiftUpRPM].
    public final float getShiftUpRPM() {
    	return getShiftUpRPM(
    		this.segment
    	);
    }
    
    /// ```
    /// If RPM of engine is bigger then this we will shift a gear up, only used in auto mode
    /// ```
    public static void setShiftUpRPM(
    	MemorySegment self,
    	float mShiftUpRPM
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShiftUpRPM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShiftUpRPM].
    public final void setShiftUpRPM(
    	float mShiftUpRPM
    ) {
    	setShiftUpRPM(
    		this.segment,
    		mShiftUpRPM
    	);
    }
    
    /// ```
    /// If RPM of engine is smaller then this we will shift a gear down, only used in auto mode
    /// ```
    public static float getShiftDownRPM(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShiftDownRPM].
    public final float getShiftDownRPM() {
    	return getShiftDownRPM(
    		this.segment
    	);
    }
    
    /// ```
    /// If RPM of engine is smaller then this we will shift a gear down, only used in auto mode
    /// ```
    public static void setShiftDownRPM(
    	MemorySegment self,
    	float mShiftDownRPM
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShiftDownRPM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShiftDownRPM].
    public final void setShiftDownRPM(
    	float mShiftDownRPM
    ) {
    	setShiftDownRPM(
    		this.segment,
    		mShiftDownRPM
    	);
    }
    
    /// ```
    /// Strength of the clutch when fully engaged. Total torque a clutch applies is Torque = ClutchStrength * (Velocity Engine - Avg Velocity Wheels At Clutch) (units: k m^2 s^-1)
    /// ```
    public static float getClutchStrength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getClutchStrength].
    public final float getClutchStrength() {
    	return getClutchStrength(
    		this.segment
    	);
    }
    
    /// ```
    /// Strength of the clutch when fully engaged. Total torque a clutch applies is Torque = ClutchStrength * (Velocity Engine - Avg Velocity Wheels At Clutch) (units: k m^2 s^-1)
    /// ```
    public static void setClutchStrength(
    	MemorySegment self,
    	float mClutchStrength
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mClutchStrength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setClutchStrength].
    public final void setClutchStrength(
    	float mClutchStrength
    ) {
    	setClutchStrength(
    		this.segment,
    		mClutchStrength
    	);
    }
    
    /// ```
    /// Saves the contents in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restores the contents in binary form to inStream.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_RESTORE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreBinaryState].
    public final void restoreBinaryState(
    	StreamIn inStream
    ) {
    	restoreBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}