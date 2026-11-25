/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.vehicle.VehicleAntiRollBarArray;
import volucris.bindings.jolt.vehicle.VehicleControllerSettingsRef;
import volucris.bindings.jolt.vehicle.WheelSettingsArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleConstraintSettings extends ConstraintSettings {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_AS_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_UP;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_UP;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_FORWARD;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_FORWARD;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_MAX_PITCH_ROLL_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_MAX_PITCH_ROLL_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_WHEELS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_WHEELS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_ANTI_ROLL_BARS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_ANTI_ROLL_BARS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_CONTROLLER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_CONTROLLER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_CONSTRAINT_SETTINGS_CREATE = downcallHandle("JPH_VehicleConstraintSettings_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_AS_CONSTRAINT_SETTINGS = downcallHandle("JPH_VehicleConstraintSettings_AsConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_UP = downcallHandleVoid("JPH_VehicleConstraintSettings_GetUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_UP = downcallHandleVoid("JPH_VehicleConstraintSettings_SetUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_FORWARD = downcallHandleVoid("JPH_VehicleConstraintSettings_GetForward", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_FORWARD = downcallHandleVoid("JPH_VehicleConstraintSettings_SetForward", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_MAX_PITCH_ROLL_ANGLE = downcallHandle("JPH_VehicleConstraintSettings_GetMaxPitchRollAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_MAX_PITCH_ROLL_ANGLE = downcallHandleVoid("JPH_VehicleConstraintSettings_SetMaxPitchRollAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_WHEELS = downcallHandleVoid("JPH_VehicleConstraintSettings_GetWheels", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_WHEELS = downcallHandleVoid("JPH_VehicleConstraintSettings_SetWheels", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_ANTI_ROLL_BARS = downcallHandleVoid("JPH_VehicleConstraintSettings_GetAntiRollBars", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_ANTI_ROLL_BARS = downcallHandleVoid("JPH_VehicleConstraintSettings_SetAntiRollBars", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_CONTROLLER = downcallHandleVoid("JPH_VehicleConstraintSettings_GetController", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_CONTROLLER = downcallHandleVoid("JPH_VehicleConstraintSettings_SetController", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleConstraintSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConstraintSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public VehicleConstraintSettings(MemorySegment segment) {
		this.segment = segment;
		super(asConstraintSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asConstraintSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_AS_CONSTRAINT_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Vector indicating the up direction of the vehicle (in local space to the body)
    /// ```
    public static void getUp(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUp].
    public final void getUp(
    	Vec3 outResult
    ) {
    	getUp(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vector indicating the up direction of the vehicle (in local space to the body)
    /// ```
    public static void setUp(
    	MemorySegment self,
    	MemorySegment mUp
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUp].
    public final void setUp(
    	Vec3 mUp
    ) {
    	setUp(
    		this.segment,
    		mUp.memorySegment()
    	);
    }
    
    /// ```
    /// Vector indicating forward direction of the vehicle (in local space to the body)
    /// ```
    public static void getForward(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_FORWARD.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getForward].
    public final void getForward(
    	Vec3 outResult
    ) {
    	getForward(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vector indicating forward direction of the vehicle (in local space to the body)
    /// ```
    public static void setForward(
    	MemorySegment self,
    	MemorySegment mForward
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_FORWARD.get();
    	try {
    		 method.invokeExact(
    			self,
    			mForward
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setForward].
    public final void setForward(
    	Vec3 mForward
    ) {
    	setForward(
    		this.segment,
    		mForward.memorySegment()
    	);
    }
    
    /// ```
    /// Defines the maximum pitch/roll angle (rad), can be used to avoid the car from getting upside down. The vehicle up direction will stay within a cone centered around the up axis with half top angle mMaxPitchRollAngle, set to pi to turn off.
    /// ```
    public static float getMaxPitchRollAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_MAX_PITCH_ROLL_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxPitchRollAngle].
    public final float getMaxPitchRollAngle() {
    	return getMaxPitchRollAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Defines the maximum pitch/roll angle (rad), can be used to avoid the car from getting upside down. The vehicle up direction will stay within a cone centered around the up axis with half top angle mMaxPitchRollAngle, set to pi to turn off.
    /// ```
    public static void setMaxPitchRollAngle(
    	MemorySegment self,
    	float mMaxPitchRollAngle
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_MAX_PITCH_ROLL_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxPitchRollAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxPitchRollAngle].
    public final void setMaxPitchRollAngle(
    	float mMaxPitchRollAngle
    ) {
    	setMaxPitchRollAngle(
    		this.segment,
    		mMaxPitchRollAngle
    	);
    }
    
    /// ```
    /// List of wheels and their properties
    /// ```
    public static void getWheels(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_WHEELS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheels].
    public final void getWheels(
    	WheelSettingsArray outResult
    ) {
    	getWheels(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// List of wheels and their properties
    /// ```
    public static void setWheels(
    	MemorySegment self,
    	MemorySegment mWheels
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_WHEELS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWheels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWheels].
    public final void setWheels(
    	WheelSettingsArray mWheels
    ) {
    	setWheels(
    		this.segment,
    		mWheels.memorySegment()
    	);
    }
    
    /// ```
    /// List of anti rollbars and their properties
    /// ```
    public static void getAntiRollBars(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_ANTI_ROLL_BARS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAntiRollBars].
    public final void getAntiRollBars(
    	VehicleAntiRollBarArray outResult
    ) {
    	getAntiRollBars(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// List of anti rollbars and their properties
    /// ```
    public static void setAntiRollBars(
    	MemorySegment self,
    	MemorySegment mAntiRollBars
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_ANTI_ROLL_BARS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAntiRollBars
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAntiRollBars].
    public final void setAntiRollBars(
    	VehicleAntiRollBarArray mAntiRollBars
    ) {
    	setAntiRollBars(
    		this.segment,
    		mAntiRollBars.memorySegment()
    	);
    }
    
    /// ```
    /// Defines how the vehicle can accelerate / decelerate
    /// ```
    public static void getController(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_GET_CONTROLLER.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getController].
    public final void getController(
    	VehicleControllerSettingsRef outResult
    ) {
    	getController(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Defines how the vehicle can accelerate / decelerate
    /// ```
    public static void setController(
    	MemorySegment self,
    	MemorySegment mController
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_SET_CONTROLLER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mController
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setController].
    public final void setController(
    	VehicleControllerSettingsRef mController
    ) {
    	setController(
    		this.segment,
    		mController.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}