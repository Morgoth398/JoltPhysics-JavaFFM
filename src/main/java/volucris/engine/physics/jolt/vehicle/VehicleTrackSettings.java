package volucris.engine.physics.jolt.vehicle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

import java.lang.Throwable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

/**
 *  
 */
public final class VehicleTrackSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle DRIVEN_WHEEL;
	private static final VarHandle WHEELS;
	private static final VarHandle WHEELS_COUNT;
	private static final VarHandle INERTIA;
	private static final VarHandle ANGULAR_DAMPING;
	private static final VarHandle MAX_BRAKE_TORQUE;
	private static final VarHandle DIFFERENTIAL_RATIO;

	private static final MethodHandle JPH_VEHICLE_TRACK_SETTINGS_INIT;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
					JAVA_INT.withName("drivenWheel"),
					MemoryLayout.paddingLayout(4),
					ADDRESS.withName("wheels"),
					JAVA_INT.withName("wheelsCount"),
					JAVA_FLOAT.withName("inertia"),
					JAVA_FLOAT.withName("angularDamping"),
					JAVA_FLOAT.withName("maxBrakeTorque"),
					JAVA_FLOAT.withName("differentialRatio"),
					MemoryLayout.paddingLayout(4)
				).withName("JPH_VehicleTrackSettings");

		DRIVEN_WHEEL = varHandle(LAYOUT, "drivenWheel");
		WHEELS = varHandle(LAYOUT, "wheels");
		WHEELS_COUNT = varHandle(LAYOUT, "wheelsCount");
		INERTIA = varHandle(LAYOUT, "inertia");
		ANGULAR_DAMPING = varHandle(LAYOUT, "angularDamping");
		MAX_BRAKE_TORQUE = varHandle(LAYOUT, "maxBrakeTorque");
		DIFFERENTIAL_RATIO = varHandle(LAYOUT, "differentialRatio");

		JPH_VEHICLE_TRACK_SETTINGS_INIT = downcallHandleVoid("JPH_VehicleTrackSettings_Init", ADDRESS);
		//@formatter:on
	}

	private final MemorySegment jphVehicleTrackSettings;

	private Arena arena;

	public VehicleTrackSettings() {
		this(Arena.ofAuto());
	}

	public VehicleTrackSettings(Arena arena) {
		this.arena = arena;

		jphVehicleTrackSettings = arena.allocate(LAYOUT);

		try {
			MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_INIT;
			method.invokeExact(jphVehicleTrackSettings);
		} catch (Throwable throwable) {
			String className = throwable.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call init: " + className);
		}
	}

	public void setDrivenWheel(int drivenWheel) {
		DRIVEN_WHEEL.set(jphVehicleTrackSettings, drivenWheel);
	}

	public int getDrivenWheel() {
		return (int) DRIVEN_WHEEL.get(jphVehicleTrackSettings);
	}

	public void setWheels(int[] wheels) {
		WHEELS.set(jphVehicleTrackSettings, arena.allocateFrom(JAVA_INT, wheels));
	}

	public int[] getWheels() {
		return (int[]) WHEELS.get(jphVehicleTrackSettings);
	}

	public void setWheelsCount(int wheelsCount) {
		WHEELS_COUNT.set(jphVehicleTrackSettings, wheelsCount);
	}

	public int getWheelsCount() {
		return (int) WHEELS_COUNT.get(jphVehicleTrackSettings);
	}

	public void setInertia(float inertia) {
		INERTIA.set(jphVehicleTrackSettings, inertia);
	}

	public float getInertia() {
		return (float) INERTIA.get(jphVehicleTrackSettings);
	}

	public void setAngularDamping(float angularDamping) {
		ANGULAR_DAMPING.set(jphVehicleTrackSettings, angularDamping);
	}

	public float getAngularDamping() {
		return (float) ANGULAR_DAMPING.get(jphVehicleTrackSettings);
	}

	public void setMaxBrakeTorque(float maxBrakeTorque) {
		MAX_BRAKE_TORQUE.set(jphVehicleTrackSettings, maxBrakeTorque);
	}

	public float getMaxBrakeTorque() {
		return (float) MAX_BRAKE_TORQUE.get(jphVehicleTrackSettings);
	}

	public void setDifferentialRatio(float differentialRatio) {
		DIFFERENTIAL_RATIO.set(jphVehicleTrackSettings, differentialRatio);
	}

	public float getDifferentialRatio() {
		return (float) DIFFERENTIAL_RATIO.get(jphVehicleTrackSettings);
	}

	public final MemorySegment memorySegment() {
		return jphVehicleTrackSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}
}
