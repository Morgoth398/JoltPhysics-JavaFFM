package volucris.engine.physics.jolt.vehicle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

import java.lang.Throwable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.engine.utils.VolucrisRuntimeException;

/**
 *  
 */
public final class VehicleTrack {
	
	private static final MethodHandle JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_VEHICLE_TRACK_GET_DRIVEN_WHEEL;
	private static final MethodHandle JPH_VEHICLE_TRACK_GET_INERTIA;
	private static final MethodHandle JPH_VEHICLE_TRACK_GET_ANGULAR_DAMPING;
	private static final MethodHandle JPH_VEHICLE_TRACK_GET_MAX_BRAKE_TORQUE;
	private static final MethodHandle JPH_VEHICLE_TRACK_GET_DIFFERENTIAL_RATIO;

	static {
		//@formatter:off
		JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY = downcallHandle("JPH_VehicleTrack_GetAngularVelocity", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_VehicleTrack_SetAngularVelocity", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRACK_GET_DRIVEN_WHEEL = downcallHandle("JPH_VehicleTrack_GetDrivenWheel", JAVA_INT, ADDRESS);
		JPH_VEHICLE_TRACK_GET_INERTIA = downcallHandle("JPH_VehicleTrack_GetInertia", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRACK_GET_ANGULAR_DAMPING = downcallHandle("JPH_VehicleTrack_GetAngularDamping", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRACK_GET_MAX_BRAKE_TORQUE = downcallHandle("JPH_VehicleTrack_GetMaxBrakeTorque", JAVA_FLOAT, ADDRESS);
		JPH_VEHICLE_TRACK_GET_DIFFERENTIAL_RATIO = downcallHandle("JPH_VehicleTrack_GetDifferentialRatio", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	private final MemorySegment jphVehicleTrack;
	
	public VehicleTrack() {
		this(Arena.ofAuto());
	}
	
	public VehicleTrack(Arena arena) {
		jphVehicleTrack = arena.allocate(ADDRESS);
	}
	
	public void set(MemorySegment segment) {
		jphVehicleTrack.setAtIndex(ADDRESS, 0, segment);
	}
	
	/**
	 *  
	 */
	public float getAngularVelocity() {
		try {
			MethodHandle method = JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY;
			return (float) method.invokeExact(memorySegment());
		} catch(Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new VolucrisRuntimeException("Cannot call getAngularVelocity: " + className);
		}
	}

	/**
	 *  
	 */
	public void setAngularVelocity(float velocity) {
		try {
			MethodHandle method = JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY;
			method.invokeExact(memorySegment(), velocity);
		} catch(Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new VolucrisRuntimeException("Cannot call setAngularVelocity: " + className);
		}
	}

	/**
	 *  
	 */
	public int getDrivenWheel() {
		try {
			MethodHandle method = JPH_VEHICLE_TRACK_GET_DRIVEN_WHEEL;
			return (int) method.invokeExact(memorySegment());
		} catch(Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new VolucrisRuntimeException("Cannot call getDrivenWheel: " + className);
		}
	}

	/**
	 *  
	 */
	public float getInertia() {
		try {
			MethodHandle method = JPH_VEHICLE_TRACK_GET_INERTIA;
			return (float) method.invokeExact(memorySegment());
		} catch(Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new VolucrisRuntimeException("Cannot call getInertia: " + className);
		}
	}

	/**
	 *  
	 */
	public float getAngularDamping() {
		try {
			MethodHandle method = JPH_VEHICLE_TRACK_GET_ANGULAR_DAMPING;
			return (float) method.invokeExact(memorySegment());
		} catch(Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new VolucrisRuntimeException("Cannot call getAngularDamping: " + className);
		}
	}

	/**
	 *  
	 */
	public float getMaxBrakeTorque() {
		try {
			MethodHandle method = JPH_VEHICLE_TRACK_GET_MAX_BRAKE_TORQUE;
			return (float) method.invokeExact(memorySegment());
		} catch(Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new VolucrisRuntimeException("Cannot call getMaxBrakeTorque: " + className);
		}
	}

	/**
	 *  
	 */
	public float getDifferentialRatio() {
		try {
			MethodHandle method = JPH_VEHICLE_TRACK_GET_DIFFERENTIAL_RATIO;
			return (float) method.invokeExact(memorySegment());
		} catch(Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new VolucrisRuntimeException("Cannot call getDifferentialRatio: " + className);
		}
	}

	public final MemorySegment memorySegment() {
		return jphVehicleTrack.get(ADDRESS, 0);
	}
}
