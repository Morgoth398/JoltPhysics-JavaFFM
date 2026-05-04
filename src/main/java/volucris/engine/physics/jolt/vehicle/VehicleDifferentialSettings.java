package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public final class VehicleDifferentialSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_VEHICLE_DIFFERENTIAL_SETTINGS_INIT;

	private static final VarHandle LEFT_WHEEL;
	private static final VarHandle RIGHT_WHEEL;
	private static final VarHandle DIFFERENTIAL_RATIO;
	private static final VarHandle LEFT_RIGHT_SPLIT;
	private static final VarHandle LIMITED_SLIP_RATIO;
	private static final VarHandle ENGINE_TORQUE_RATIO;

	private final MemorySegment jphVehicleDifferentialSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("leftWheel"),
		        JAVA_INT.withName("rightWheel"),
		        JAVA_FLOAT.withName("differentialRatio"),
		        JAVA_FLOAT.withName("leftRightSplit"),
		        JAVA_FLOAT.withName("limitedSlipRatio"),
		        JAVA_FLOAT.withName("engineTorqueRatio")
			).withName("JPH_VehicleDifferentialSettings");
		
		JPH_VEHICLE_DIFFERENTIAL_SETTINGS_INIT = downcallHandleVoid("JPH_VehicleDifferentialSettings_Init", ADDRESS);
		//@formatter:on

		LEFT_WHEEL = varHandle(LAYOUT, "leftWheel");
		RIGHT_WHEEL = varHandle(LAYOUT, "rightWheel");
		DIFFERENTIAL_RATIO = varHandle(LAYOUT, "differentialRatio");
		LEFT_RIGHT_SPLIT = varHandle(LAYOUT, "leftRightSplit");
		LIMITED_SLIP_RATIO = varHandle(LAYOUT, "limitedSlipRatio");
		ENGINE_TORQUE_RATIO = varHandle(LAYOUT, "engineTorqueRatio");
	}

	public VehicleDifferentialSettings() {
		this(Arena.ofAuto());
	}

	public VehicleDifferentialSettings(Arena arena) {
		jphVehicleDifferentialSettings = arena.allocate(LAYOUT);

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_VEHICLE_DIFFERENTIAL_SETTINGS_INIT;
			method.invokeExact(jphVehicleDifferentialSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize vehicle differential settings: " + className);
		}
	}

	/**
	 * Index (in mWheels) that represents the left wheel of this differential (can
	 * be -1 to indicate no wheel)
	 */
	public void setLeftWheel(int leftWheel) {
		LEFT_WHEEL.set(jphVehicleDifferentialSettings, leftWheel);
	}

	/**
	 * @see #setLeftWheel(int)
	 */
	public int getLeftWheel() {
		return (int) LEFT_WHEEL.get(jphVehicleDifferentialSettings);
	}

	/**
	 * Index (in mWheels) that represents the right wheel of this differential (can
	 * be -1 to indicate no wheel)
	 */
	public void setRightWheel(int rightWheel) {
		RIGHT_WHEEL.set(jphVehicleDifferentialSettings, rightWheel);
	}

	/**
	 * @see #setRightWheel(int)
	 */
	public int getRightWheel() {
		return (int) RIGHT_WHEEL.get(jphVehicleDifferentialSettings);
	}

	/**
	 * Ratio between rotation speed of gear box and wheels.
	 */
	public void setDifferentialRatio(float value) {
		DIFFERENTIAL_RATIO.set(jphVehicleDifferentialSettings, value);
	}

	/**
	 * Ratio between rotation speed of gear box and wheels.
	 */
	public float getDifferentialRatio() {
		return (float) DIFFERENTIAL_RATIO.get(jphVehicleDifferentialSettings);
	}

	/**
	 * Defines how the engine torque is split across the left and right wheel (0 =
	 * left, 0.5 = center, 1 = right)
	 */
	public void setLeftRightSplit(float value) {
		LEFT_RIGHT_SPLIT.set(jphVehicleDifferentialSettings, value);
	}

	/**
	 * @see #setLeftRightSplit(float)
	 */
	public float getLeftRightSplit() {
		return (float) LEFT_RIGHT_SPLIT.get(jphVehicleDifferentialSettings);
	}

	/**
	 * Ratio max / min wheel speed. When this ratio is exceeded, all torque gets
	 * distributed to the slowest moving wheel. This allows implementing a limited
	 * slip differential. Set to FLT_MAX for an open differential. Value should be >
	 * 1.
	 */
	public void setLimitedSlipRatio(float value) {
		LIMITED_SLIP_RATIO.set(jphVehicleDifferentialSettings, value);
	}

	/**
	 * @see #setLimitedSlipRatio(float)
	 */
	public float getLimitedSlipRatio() {
		return (float) LIMITED_SLIP_RATIO.get(jphVehicleDifferentialSettings);
	}

	/**
	 * How much of the engines torque is applied to this differential (0 = none, 1 =
	 * full), make sure the sum of all differentials is 1.
	 */
	public void setEngineTorqueRatio(float value) {
		ENGINE_TORQUE_RATIO.set(jphVehicleDifferentialSettings, value);
	}

	/**
	 * @see #setEngineTorqueRatio(float)
	 */
	public float getEngineTorqueRatio() {
		return (float) ENGINE_TORQUE_RATIO.get(jphVehicleDifferentialSettings);
	}

	public MemorySegment memorySegment() {
		return jphVehicleDifferentialSettings;
	}

}