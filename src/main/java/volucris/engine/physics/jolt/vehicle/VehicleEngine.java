package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Runtime data for engine.
 */
public final class VehicleEngine {

	private static final MethodHandle JPH_VEHICLE_ENGINE_CLAMP_RPM;
	private static final MethodHandle JPH_VEHICLE_ENGINE_GET_CURRENT_RPM;
	private static final MethodHandle JPH_VEHICLE_ENGINE_SET_CURRENT_RPM;
	private static final MethodHandle JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_VEHICLE_ENGINE_GET_TORQUE;
	private static final MethodHandle JPH_VEHICLE_ENGINE_APPLY_TORQUE;
	private static final MethodHandle JPH_VEHICLE_ENGINE_APPLY_DAMPING;
	private static final MethodHandle JPH_VEHICLE_ENGINE_ALLOW_SLEEP;

	private final MemorySegment jphVehicleEngine;

	static {
		//@formatter:off
		JPH_VEHICLE_ENGINE_CLAMP_RPM = downcallHandleVoid("JPH_VehicleEngine_ClampRPM", ADDRESS);
		JPH_VEHICLE_ENGINE_GET_CURRENT_RPM = downcallHandle("JPH_VehicleEngine_GetCurrentRPM", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_ENGINE_SET_CURRENT_RPM = downcallHandleVoid("JPH_VehicleEngine_SetCurrentRPM", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY = downcallHandle("JPH_VehicleEngine_GetAngularVelocity", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_ENGINE_GET_TORQUE = downcallHandle("JPH_VehicleEngine_GetTorque", JAVA_FLOAT, ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_APPLY_TORQUE = downcallHandleVoid("JPH_VehicleEngine_ApplyTorque", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_APPLY_DAMPING = downcallHandleVoid("JPH_VehicleEngine_ApplyDamping", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_ALLOW_SLEEP = downcallHandle("JPH_VehicleEngine_AllowSleep", JAVA_BOOLEAN, ADDRESS);
		//@formatter:on
	}

	public VehicleEngine() {
		jphVehicleEngine = Arena.ofAuto().allocate(ADDRESS);
	}

	public void set(MemorySegment segment) {
		jphVehicleEngine.set(ADDRESS, 0, segment);
	}

	/**
	 * Clamp the RPM between min and max RPM.
	 */
	public void clampRPM() {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_CLAMP_RPM;
			method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot clamp RPM.");
		}
	}

	/**
	 * Current rotation speed of engine in rounds per minute.
	 */
	public float getCurrentRPM() {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_GET_CURRENT_RPM;
			return (float) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot  get current RPM.");
		}
	}

	/**
	 * Update rotation speed of engine in rounds per minute.
	 */
	public void setCurrentRPM(float rpm) {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_SET_CURRENT_RPM;
			method.invokeExact(memorySegment(), rpm);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set current RPM.");
		}
	}

	/**
	 * Get current angular velocity of the engine in radians / second.
	 */
	public float getAngularVelocity() {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY;
			return (float) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get angular velocity.");
		}
	}

	/**
	 * Get the amount of torque (N m) that the engine can supply
	 */
	public float getTorque(float acceleration) {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_GET_TORQUE;
			return (float) method.invokeExact(memorySegment(), acceleration);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get torque.");
		}
	}

	/**
	 * Apply a torque to the engine rotation speed
	 */
	public void applyTorque(float torque, float deltaTime) {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_APPLY_TORQUE;
			method.invokeExact(memorySegment(), torque, deltaTime);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot apply torque.");
		}
	}

	/**
	 * Update the engine RPM for damping
	 */
	public void applyDamping(float deltaTime) {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_APPLY_DAMPING;
			method.invokeExact(memorySegment(), deltaTime);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot apply damping.");
		}
	}

	/**
	 * If the engine is idle we allow the vehicle to sleep.
	 */
	public boolean allowSleep() {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_ALLOW_SLEEP;
			return (boolean) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot allow sleep.");
		}
	}

	private MemorySegment memorySegment() {
		return jphVehicleEngine.getAtIndex(ADDRESS, 0);
	}

}
