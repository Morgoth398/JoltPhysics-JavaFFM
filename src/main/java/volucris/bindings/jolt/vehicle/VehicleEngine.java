/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.renderer.DebugRenderer;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleEngine extends VehicleEngineSettings {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_AS_VEHICLE_ENGINE_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY_TO_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_CLAMP_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_GET_CURRENT_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SET_CURRENT_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_GET_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_APPLY_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_APPLY_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_CONVERT_RPMTO_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_DRAW_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_ALLOW_SLEEP;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_ENGINE_CREATE = downcallHandle("JPH_VehicleEngine_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_AS_VEHICLE_ENGINE_SETTINGS = downcallHandle("JPH_VehicleEngine_AsVehicleEngineSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY_TO_RPM = downcallHandle("JPH_VehicleEngine_GetAngularVelocityToRPM", JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_CLAMP_RPM = downcallHandleVoid("JPH_VehicleEngine_ClampRPM", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_GET_CURRENT_RPM = downcallHandle("JPH_VehicleEngine_GetCurrentRPM", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SET_CURRENT_RPM = downcallHandleVoid("JPH_VehicleEngine_SetCurrentRPM", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY = downcallHandle("JPH_VehicleEngine_GetAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_GET_TORQUE = downcallHandle("JPH_VehicleEngine_GetTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_APPLY_TORQUE = downcallHandleVoid("JPH_VehicleEngine_ApplyTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_APPLY_DAMPING = downcallHandleVoid("JPH_VehicleEngine_ApplyDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_CONVERT_RPMTO_ANGLE = downcallHandle("JPH_VehicleEngine_ConvertRPMToAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_DRAW_RPM = downcallHandleVoid("JPH_VehicleEngine_DrawRPM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_ALLOW_SLEEP = downcallHandle("JPH_VehicleEngine_AllowSleep", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SAVE_STATE = downcallHandleVoid("JPH_VehicleEngine_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_RESTORE_STATE = downcallHandleVoid("JPH_VehicleEngine_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleEngine() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleEngine(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleEngineSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public VehicleEngine(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleEngineSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_ENGINE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asVehicleEngineSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_AS_VEHICLE_ENGINE_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Multiply an angular velocity (rad/s) with this value to get rounds per minute (RPM)
    /// ```
    public static float getAngularVelocityToRPM() {
    	MethodHandle method = JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY_TO_RPM.get();
    	try {
    		return (float) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Clamp the RPM between min and max RPM
    /// ```
    public static void clampRPM(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_CLAMP_RPM.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clampRPM].
    public final void clampRPM() {
    	clampRPM(
    		this.segment
    	);
    }
    
    /// ```
    /// Current rotation speed of engine in rounds per minute
    /// ```
    public static float getCurrentRPM(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_GET_CURRENT_RPM.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCurrentRPM].
    public final float getCurrentRPM() {
    	return getCurrentRPM(
    		this.segment
    	);
    }
    
    /// ```
    /// Update rotation speed of engine in rounds per minute
    /// ```
    public static void setCurrentRPM(
    	MemorySegment self,
    	float inRPM
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SET_CURRENT_RPM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRPM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCurrentRPM].
    public final void setCurrentRPM(
    	float inRPM
    ) {
    	setCurrentRPM(
    		this.segment,
    		inRPM
    	);
    }
    
    /// ```
    /// Get current angular velocity of the engine in radians / second
    /// ```
    public static float getAngularVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public final float getAngularVelocity() {
    	return getAngularVelocity(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the amount of torque (N m) that the engine can supply
    /// @param inAcceleration How much the gas pedal is pressed [0, 1]
    /// ```
    public static float getTorque(
    	MemorySegment self,
    	float inAcceleration
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_GET_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inAcceleration
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTorque].
    public final float getTorque(
    	float inAcceleration
    ) {
    	return getTorque(
    		this.segment,
    		inAcceleration
    	);
    }
    
    /// ```
    /// Apply a torque to the engine rotation speed
    /// @param inTorque Torque in N m
    /// @param inDeltaTime Delta time in seconds
    /// ```
    public static void applyTorque(
    	MemorySegment self,
    	float inTorque,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_APPLY_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTorque,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyTorque].
    public final void applyTorque(
    	float inTorque,
    	float inDeltaTime
    ) {
    	applyTorque(
    		this.segment,
    		inTorque,
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Update the engine RPM for damping
    /// @param inDeltaTime Delta time in seconds
    /// ```
    public static void applyDamping(
    	MemorySegment self,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_APPLY_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyDamping].
    public final void applyDamping(
    	float inDeltaTime
    ) {
    	applyDamping(
    		this.segment,
    		inDeltaTime
    	);
    }
    
    public static float convertRPMToAngle(
    	MemorySegment self,
    	float inRPM
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_CONVERT_RPMTO_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inRPM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#convertRPMToAngle].
    public final float convertRPMToAngle(
    	float inRPM
    ) {
    	return convertRPMToAngle(
    		this.segment,
    		inRPM
    	);
    }
    
    /// ```
    /// Debug draw a RPM meter
    /// ```
    public static void drawRPM(
    	MemorySegment self,
    	MemorySegment inRenderer,
    	MemorySegment inPosition,
    	MemorySegment inForward,
    	MemorySegment inUp,
    	float inSize,
    	float inShiftDownRPM,
    	float inShiftUpRPM
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_DRAW_RPM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer,
    			inPosition,
    			inForward,
    			inUp,
    			inSize,
    			inShiftDownRPM,
    			inShiftUpRPM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawRPM].
    public final void drawRPM(
    	DebugRenderer inRenderer,
    	Vec3 inPosition,
    	Vec3 inForward,
    	Vec3 inUp,
    	float inSize,
    	float inShiftDownRPM,
    	float inShiftUpRPM
    ) {
    	drawRPM(
    		this.segment,
    		inRenderer.memorySegment(),
    		inPosition.memorySegment(),
    		inForward.memorySegment(),
    		inUp.memorySegment(),
    		inSize,
    		inShiftDownRPM,
    		inShiftUpRPM
    	);
    }
    
    /// ```
    /// If the engine is idle we allow the vehicle to sleep
    /// ```
    public static boolean allowSleep(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_ALLOW_SLEEP.get();
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
    	MethodHandle method = JPH_VEHICLE_ENGINE_SAVE_STATE.get();
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
    	MethodHandle method = JPH_VEHICLE_ENGINE_RESTORE_STATE.get();
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