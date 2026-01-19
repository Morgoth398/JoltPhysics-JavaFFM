package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Generic properties for a vehicle engine.
 */
public final class VehicleEngineSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_VEHICLE_ENGINE_SETTINGS_INIT;

	private static final VarHandle MAX_TORQUE;
	private static final VarHandle MIN_RPM;
	private static final VarHandle MAX_RPM;
	private static final VarHandle NORMALIZED_TORQUE;
	private static final VarHandle INERTIA;
	private static final VarHandle ANGULAR_DAMPING;

	private final MemorySegment jphVehicleEngineSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_FLOAT.withName("maxTorque"),
		        JAVA_FLOAT.withName("minRPM"),
		        JAVA_FLOAT.withName("maxRPM"),
		        MemoryLayout.paddingLayout(4),
		        ADDRESS.withName("normalizedTorque"),
		        JAVA_FLOAT.withName("inertia"),
		        JAVA_FLOAT.withName("angularDamping")
			).withName("JPH_VehicleEngineSettings");
		
		JPH_VEHICLE_ENGINE_SETTINGS_INIT = downcallHandleVoid("JPH_VehicleEngineSettings_Init", ADDRESS);
		//@formatter:on

		MAX_TORQUE = varHandle(LAYOUT, "maxTorque");
		MIN_RPM = varHandle(LAYOUT, "minRPM");
		MAX_RPM = varHandle(LAYOUT, "maxRPM");
		NORMALIZED_TORQUE = varHandle(LAYOUT, "normalizedTorque");
		INERTIA = varHandle(LAYOUT, "inertia");
		ANGULAR_DAMPING = varHandle(LAYOUT, "angularDamping");
	}

	public VehicleEngineSettings() {
		this(Arena.ofAuto());
	}

	public VehicleEngineSettings(Arena arena) {
		jphVehicleEngineSettings = arena.allocate(LAYOUT);

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_INIT;
			method.invokeExact(jphVehicleEngineSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize vehicle engine settings: " + className);
		}
	}

	/**
	 * Max amount of torque (Nm) that the engine can deliver.
	 */
	public void setMaxTorque(float torque) {
		MAX_TORQUE.set(jphVehicleEngineSettings, torque);
	}

	/**
	 * Max amount of torque (Nm) that the engine can deliver.
	 */
	public float getMaxTorque() {
		return (float) MAX_TORQUE.get(jphVehicleEngineSettings);
	}

	/**
	 * Min amount of revolutions per minute (rpm) the engine can produce without
	 * stalling.
	 */
	public void setMinRPM(float value) {
		MIN_RPM.set(jphVehicleEngineSettings, value);
	}

	/**
	 * Min amount of revolutions per minute (rpm) the engine can produce without
	 * stalling.
	 */
	public float getMinRPM() {
		return (float) MIN_RPM.get(jphVehicleEngineSettings);
	}

	/**
	 * Max amount of revolutions per minute (rpm) the engine can generate.
	 */
	public void setMaxRPM(float value) {
		MAX_RPM.set(jphVehicleEngineSettings, value);
	}

	/**
	 * Max amount of revolutions per minute (rpm) the engine can generate.
	 */
	public float getMaxRPM() {
		return (float) MAX_RPM.get(jphVehicleEngineSettings);
	}

	/**
	 * Y-axis: Curve that describes a ratio of the max torque the engine can produce
	 * (0 = 0, 1 = mMaxTorque). X-axis: the fraction of the RPM of the engine (0 =
	 * mMinRPM, 1 = mMaxRPM)
	 */
	public void setNormalizedTorque(LinearCurve linearCurve) {
		NORMALIZED_TORQUE.set(jphVehicleEngineSettings, linearCurve.memorySegment());
	}

	/**
	 * @see #setNormalizedTorque(LinearCurve)
	 */
	public LinearCurve getNormalizedTorque() {
		MemorySegment segment = (MemorySegment) NORMALIZED_TORQUE.get(jphVehicleEngineSettings);

		if (segment.equals(MemorySegment.NULL))
			return null;

		LinearCurve curve = Jolt.getLinearCurve(segment.address());
		if (curve != null)
			return curve;

		return new LinearCurve(segment);
	}

	/**
	 * Moment of inertia (kg m^2) of the engine.
	 */
	public void setInertia(float inertia) {
		INERTIA.set(jphVehicleEngineSettings);
	}

	/**
	 * Moment of inertia (kg m^2) of the engine.
	 */
	public float getInertia() {
		return (float) INERTIA.get(jphVehicleEngineSettings);
	}

	/**
	 * Angular damping factor of the wheel: dw/dt = -c * w. Value should be zero or
	 * positive and is usually close to 0.
	 */
	public void setAngularDamping(float angularDamping) {
		ANGULAR_DAMPING.set(jphVehicleEngineSettings, angularDamping);
	}

	/**
	 * Angular damping factor of the wheel: dw/dt = -c * w. Value should be zero or
	 * positive and is usually close to 0.
	 */
	public float getAngularDamping() {
		return (float) ANGULAR_DAMPING.get(jphVehicleEngineSettings);
	}

	public MemorySegment memorySegment() {
		return jphVehicleEngineSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}