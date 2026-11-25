/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleDifferentialSettings {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LEFT_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LEFT_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_RIGHT_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_RIGHT_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_DIFFERENTIAL_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_DIFFERENTIAL_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LEFT_RIGHT_SPLIT;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LEFT_RIGHT_SPLIT;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LIMITED_SLIP_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LIMITED_SLIP_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_ENGINE_TORQUE_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_ENGINE_TORQUE_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_RESTORE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_DIFFERENTIAL_SETTINGS_CALCULATE_TORQUE_RATIO;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_CREATE = downcallHandle("JPH_VehicleDifferentialSettings_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleDifferentialSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LEFT_WHEEL = downcallHandle("JPH_VehicleDifferentialSettings_GetLeftWheel", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LEFT_WHEEL = downcallHandleVoid("JPH_VehicleDifferentialSettings_SetLeftWheel", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_RIGHT_WHEEL = downcallHandle("JPH_VehicleDifferentialSettings_GetRightWheel", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_RIGHT_WHEEL = downcallHandleVoid("JPH_VehicleDifferentialSettings_SetRightWheel", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_DIFFERENTIAL_RATIO = downcallHandle("JPH_VehicleDifferentialSettings_GetDifferentialRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_DIFFERENTIAL_RATIO = downcallHandleVoid("JPH_VehicleDifferentialSettings_SetDifferentialRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LEFT_RIGHT_SPLIT = downcallHandle("JPH_VehicleDifferentialSettings_GetLeftRightSplit", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LEFT_RIGHT_SPLIT = downcallHandleVoid("JPH_VehicleDifferentialSettings_SetLeftRightSplit", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LIMITED_SLIP_RATIO = downcallHandle("JPH_VehicleDifferentialSettings_GetLimitedSlipRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LIMITED_SLIP_RATIO = downcallHandleVoid("JPH_VehicleDifferentialSettings_SetLimitedSlipRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_ENGINE_TORQUE_RATIO = downcallHandle("JPH_VehicleDifferentialSettings_GetEngineTorqueRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_ENGINE_TORQUE_RATIO = downcallHandleVoid("JPH_VehicleDifferentialSettings_SetEngineTorqueRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_VehicleDifferentialSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_VehicleDifferentialSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_CALCULATE_TORQUE_RATIO = downcallHandleVoid("JPH_VehicleDifferentialSettings_CalculateTorqueRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleDifferentialSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleDifferentialSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VehicleDifferentialSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Index (in mWheels) that represents the left wheel of this differential (can be -1 to indicate no wheel)
    /// ```
    public static int getLeftWheel(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LEFT_WHEEL.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeftWheel].
    public final int getLeftWheel() {
    	return getLeftWheel(
    		this.segment
    	);
    }
    
    /// ```
    /// Index (in mWheels) that represents the left wheel of this differential (can be -1 to indicate no wheel)
    /// ```
    public static void setLeftWheel(
    	MemorySegment self,
    	int mLeftWheel
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LEFT_WHEEL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLeftWheel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeftWheel].
    public final void setLeftWheel(
    	int mLeftWheel
    ) {
    	setLeftWheel(
    		this.segment,
    		mLeftWheel
    	);
    }
    
    /// ```
    /// Index (in mWheels) that represents the right wheel of this differential (can be -1 to indicate no wheel)
    /// ```
    public static int getRightWheel(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_RIGHT_WHEEL.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRightWheel].
    public final int getRightWheel() {
    	return getRightWheel(
    		this.segment
    	);
    }
    
    /// ```
    /// Index (in mWheels) that represents the right wheel of this differential (can be -1 to indicate no wheel)
    /// ```
    public static void setRightWheel(
    	MemorySegment self,
    	int mRightWheel
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_RIGHT_WHEEL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRightWheel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRightWheel].
    public final void setRightWheel(
    	int mRightWheel
    ) {
    	setRightWheel(
    		this.segment,
    		mRightWheel
    	);
    }
    
    /// ```
    /// Ratio between rotation speed of gear box and wheels
    /// ```
    public static float getDifferentialRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_DIFFERENTIAL_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDifferentialRatio].
    public final float getDifferentialRatio() {
    	return getDifferentialRatio(
    		this.segment
    	);
    }
    
    /// ```
    /// Ratio between rotation speed of gear box and wheels
    /// ```
    public static void setDifferentialRatio(
    	MemorySegment self,
    	float mDifferentialRatio
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_DIFFERENTIAL_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDifferentialRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDifferentialRatio].
    public final void setDifferentialRatio(
    	float mDifferentialRatio
    ) {
    	setDifferentialRatio(
    		this.segment,
    		mDifferentialRatio
    	);
    }
    
    /// ```
    /// Defines how the engine torque is split across the left and right wheel (0 = left, 0.5 = center, 1 = right)
    /// ```
    public static float getLeftRightSplit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LEFT_RIGHT_SPLIT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeftRightSplit].
    public final float getLeftRightSplit() {
    	return getLeftRightSplit(
    		this.segment
    	);
    }
    
    /// ```
    /// Defines how the engine torque is split across the left and right wheel (0 = left, 0.5 = center, 1 = right)
    /// ```
    public static void setLeftRightSplit(
    	MemorySegment self,
    	float mLeftRightSplit
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LEFT_RIGHT_SPLIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLeftRightSplit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeftRightSplit].
    public final void setLeftRightSplit(
    	float mLeftRightSplit
    ) {
    	setLeftRightSplit(
    		this.segment,
    		mLeftRightSplit
    	);
    }
    
    /// ```
    /// Ratio max / min wheel speed. When this ratio is exceeded, all torque gets distributed to the slowest moving wheel. This allows implementing a limited slip differential. Set to FLT_MAX for an open differential. Value should be > 1.
    /// ```
    public static float getLimitedSlipRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_LIMITED_SLIP_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitedSlipRatio].
    public final float getLimitedSlipRatio() {
    	return getLimitedSlipRatio(
    		this.segment
    	);
    }
    
    /// ```
    /// Ratio max / min wheel speed. When this ratio is exceeded, all torque gets distributed to the slowest moving wheel. This allows implementing a limited slip differential. Set to FLT_MAX for an open differential. Value should be > 1.
    /// ```
    public static void setLimitedSlipRatio(
    	MemorySegment self,
    	float mLimitedSlipRatio
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_LIMITED_SLIP_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLimitedSlipRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitedSlipRatio].
    public final void setLimitedSlipRatio(
    	float mLimitedSlipRatio
    ) {
    	setLimitedSlipRatio(
    		this.segment,
    		mLimitedSlipRatio
    	);
    }
    
    /// ```
    /// How much of the engines torque is applied to this differential (0 = none, 1 = full), make sure the sum of all differentials is 1.
    /// ```
    public static float getEngineTorqueRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_GET_ENGINE_TORQUE_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEngineTorqueRatio].
    public final float getEngineTorqueRatio() {
    	return getEngineTorqueRatio(
    		this.segment
    	);
    }
    
    /// ```
    /// How much of the engines torque is applied to this differential (0 = none, 1 = full), make sure the sum of all differentials is 1.
    /// ```
    public static void setEngineTorqueRatio(
    	MemorySegment self,
    	float mEngineTorqueRatio
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SET_ENGINE_TORQUE_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			mEngineTorqueRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEngineTorqueRatio].
    public final void setEngineTorqueRatio(
    	float mEngineTorqueRatio
    ) {
    	setEngineTorqueRatio(
    		this.segment,
    		mEngineTorqueRatio
    	);
    }
    
    /// ```
    /// Saves the contents in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_SAVE_BINARY_STATE.get();
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
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_RESTORE_BINARY_STATE.get();
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
    
    /// ```
    /// Calculate the torque ratio between left and right wheel
    /// @param inLeftAngularVelocity Angular velocity of left wheel (rad / s)
    /// @param inRightAngularVelocity Angular velocity of right wheel (rad / s)
    /// @param outLeftTorqueFraction Fraction of torque that should go to the left wheel
    /// @param outRightTorqueFraction Fraction of torque that should go to the right wheel
    /// ```
    public static void calculateTorqueRatio(
    	MemorySegment self,
    	float inLeftAngularVelocity,
    	float inRightAngularVelocity,
    	MemorySegment outLeftTorqueFraction,
    	MemorySegment outRightTorqueFraction
    ) {
    	MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_CALCULATE_TORQUE_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLeftAngularVelocity,
    			inRightAngularVelocity,
    			outLeftTorqueFraction,
    			outRightTorqueFraction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateTorqueRatio].
    public final void calculateTorqueRatio(
    	float inLeftAngularVelocity,
    	float inRightAngularVelocity,
    	NativeFloatArray outLeftTorqueFraction,
    	NativeFloatArray outRightTorqueFraction
    ) {
    	calculateTorqueRatio(
    		this.segment,
    		inLeftAngularVelocity,
    		inRightAngularVelocity,
    		outLeftTorqueFraction.memorySegment(),
    		outRightTorqueFraction.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}