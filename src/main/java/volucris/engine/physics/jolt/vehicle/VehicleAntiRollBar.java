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

/**
 * An anti rollbar is a stiff spring that connects two wheels to reduce the
 * amount of roll the vehicle makes in sharp corners See: <a
 * href=https://en.wikipedia.org/wiki/Anti-roll_bar>https://en.wikipedia.org/wiki/Anti-roll_bar</a>
 */
public final class VehicleAntiRollBar {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_VEHICLE_ANTI_ROLL_BAR_INIT;

	private static final VarHandle LEFT_WHEEL;
	private static final VarHandle RIGHT_WHEEL;
	private static final VarHandle STIFFNESS;

	private final MemorySegment jphVehicleAntiRollBar;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("leftWheel"),
		        JAVA_INT.withName("rightWheel"),
		        JAVA_FLOAT.withName("stiffness")
			).withName("JPH_VehicleAntiRollBar");
		
		JPH_VEHICLE_ANTI_ROLL_BAR_INIT = downcallHandleVoid("JPH_VehicleAntiRollBar_Init", ADDRESS);
		//@formatter:on

		LEFT_WHEEL = varHandle(LAYOUT, "leftWheel");
		RIGHT_WHEEL = varHandle(LAYOUT, "rightWheel");
		STIFFNESS = varHandle(LAYOUT, "stiffness");
	}

	public VehicleAntiRollBar() {
		this(Arena.ofAuto());
	}

	public VehicleAntiRollBar(Arena arena) {
		jphVehicleAntiRollBar = arena.allocate(LAYOUT);

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_VEHICLE_ANTI_ROLL_BAR_INIT;
			method.invokeExact(jphVehicleAntiRollBar);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize vehicle anti roll bar: " + className);
		}
	}

	/**
	 * Index (in mWheels) that represents the left wheel of this anti-rollbar.
	 */
	public void setLeftWheel(int value) {
		LEFT_WHEEL.set(jphVehicleAntiRollBar, value);
	}

	/**
	 * Index (in mWheels) that represents the left wheel of this anti-rollbar.
	 */
	public int getLeftWheel() {
		return (int) LEFT_WHEEL.get(jphVehicleAntiRollBar);
	}

	/**
	 * Index (in mWheels) that represents the right wheel of this anti-rollbar.
	 */
	public void setRightWheel(int value) {
		RIGHT_WHEEL.set(jphVehicleAntiRollBar, value);
	}

	/**
	 * Index (in mWheels) that represents the right wheel of this anti-rollbar.
	 */
	public int getRightWheel() {
		return (int) RIGHT_WHEEL.get(jphVehicleAntiRollBar);
	}

	/**
	 * Stiffness (spring constant in N/m) of anti rollbar, can be 0 to disable the
	 * anti-rollbar.
	 */
	public void setStiffness(float value) {
		STIFFNESS.set(jphVehicleAntiRollBar, value);
	}

	/**
	 * Stiffness (spring constant in N/m) of anti rollbar, can be 0 to disable the
	 * anti-rollbar.
	 */
	public float getStiffness() {
		return (float) STIFFNESS.get(jphVehicleAntiRollBar);
	}

	public MemorySegment memorySegment() {
		return jphVehicleAntiRollBar;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}