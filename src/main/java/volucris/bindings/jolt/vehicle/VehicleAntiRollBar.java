/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleAntiRollBar {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_GET_LEFT_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_SET_LEFT_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_GET_RIGHT_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_SET_RIGHT_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_GET_STIFFNESS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_SET_STIFFNESS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ANTI_ROLL_BAR_RESTORE_BINARY_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_ANTI_ROLL_BAR_CREATE = downcallHandle("JPH_VehicleAntiRollBar_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ANTI_ROLL_BAR_DESTROY = downcallHandleVoid("JPH_VehicleAntiRollBar_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ANTI_ROLL_BAR_GET_LEFT_WHEEL = downcallHandle("JPH_VehicleAntiRollBar_GetLeftWheel", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ANTI_ROLL_BAR_SET_LEFT_WHEEL = downcallHandleVoid("JPH_VehicleAntiRollBar_SetLeftWheel", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_ANTI_ROLL_BAR_GET_RIGHT_WHEEL = downcallHandle("JPH_VehicleAntiRollBar_GetRightWheel", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ANTI_ROLL_BAR_SET_RIGHT_WHEEL = downcallHandleVoid("JPH_VehicleAntiRollBar_SetRightWheel", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_ANTI_ROLL_BAR_GET_STIFFNESS = downcallHandle("JPH_VehicleAntiRollBar_GetStiffness", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ANTI_ROLL_BAR_SET_STIFFNESS = downcallHandleVoid("JPH_VehicleAntiRollBar_SetStiffness", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ANTI_ROLL_BAR_SAVE_BINARY_STATE = downcallHandleVoid("JPH_VehicleAntiRollBar_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ANTI_ROLL_BAR_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_VehicleAntiRollBar_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleAntiRollBar() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleAntiRollBar(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VehicleAntiRollBar(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Index (in mWheels) that represents the left wheel of this anti-rollbar
    /// ```
    public static int getLeftWheel(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_GET_LEFT_WHEEL.get();
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
    /// Index (in mWheels) that represents the left wheel of this anti-rollbar
    /// ```
    public static void setLeftWheel(
    	MemorySegment self,
    	int mLeftWheel
    ) {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_SET_LEFT_WHEEL.get();
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
    /// Index (in mWheels) that represents the right wheel of this anti-rollbar
    /// ```
    public static int getRightWheel(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_GET_RIGHT_WHEEL.get();
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
    /// Index (in mWheels) that represents the right wheel of this anti-rollbar
    /// ```
    public static void setRightWheel(
    	MemorySegment self,
    	int mRightWheel
    ) {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_SET_RIGHT_WHEEL.get();
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
    /// Stiffness (spring constant in N/m) of anti rollbar, can be 0 to disable the anti-rollbar
    /// ```
    public static float getStiffness(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_GET_STIFFNESS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getStiffness].
    public final float getStiffness() {
    	return getStiffness(
    		this.segment
    	);
    }
    
    /// ```
    /// Stiffness (spring constant in N/m) of anti rollbar, can be 0 to disable the anti-rollbar
    /// ```
    public static void setStiffness(
    	MemorySegment self,
    	float mStiffness
    ) {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_SET_STIFFNESS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mStiffness
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setStiffness].
    public final void setStiffness(
    	float mStiffness
    ) {
    	setStiffness(
    		this.segment,
    		mStiffness
    	);
    }
    
    /// ```
    /// Saves the contents in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_SAVE_BINARY_STATE.get();
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
    	MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_RESTORE_BINARY_STATE.get();
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

}