package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * WheelSettings object specifically for TrackedVehicleController.
 */
public final class WheelSettingsTV extends WheelSettings {

	private static final MethodHandle JPH_WHEEL_SETTINGS_TV_CREATE;
	private static final MethodHandle JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION;

	static {
		//@formatter:off
		JPH_WHEEL_SETTINGS_TV_CREATE = downcallHandle("JPH_WheelSettingsTV_Create", ADDRESS);
		JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION = downcallHandle("JPH_WheelSettingsTV_GetLongitudinalFriction", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsTV_SetLongitudinalFriction", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION = downcallHandle("JPH_WheelSettingsTV_GetLateralFriction", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsTV_SetLateralFriction", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	protected WheelSettingsTV(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected WheelSettingsTV(MemorySegment segment, Arena arena) {
		super(segment, arena, false);
	}

	public WheelSettingsTV() {
		this(Arena.ofAuto());
	}

	public WheelSettingsTV(Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_TV_CREATE;
			segment = (MemorySegment) method.invokeExact();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create wheel settings tv: " + className);
		}
		super(segment, arena, true);
	}

	/**
	 * Friction in forward direction of tire.
	 */
	public float getLongitudinalFriction() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get longitudinal friction: " + className);
		}
	}

	/**
	 * Friction in forward direction of tire.
	 */
	public void setLongitudinalFriction(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set longitudinal friction: " + className);
		}
	}

	/**
	 * Friction in sideways direction of tire.
	 */
	public float getLateralFriction() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lateral friction: " + className);
		}
	}

	/**
	 * Friction in sideways direction of tire.
	 */
	public void setLateralFriction(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set lateral friction: " + className);
		}
	}

}