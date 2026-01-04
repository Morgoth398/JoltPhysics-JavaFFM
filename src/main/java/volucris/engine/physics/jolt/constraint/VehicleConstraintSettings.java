package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.vehicle.VehicleAntiRollBar;
import volucris.engine.physics.jolt.vehicle.VehicleControllerSettings;
import volucris.engine.physics.jolt.vehicle.WheelSettings;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Configuration for constraint that simulates a wheeled vehicle.
 * <p>
 * The properties in this constraint are largely based on "Car Physics for
 * Games" by Marco Monster. See: <a href=
 * https://www.asawicki.info/Mirror/Car%20Physics%20for%20Games/Car%20Physics%20for%20Games.html>https://www.asawicki.info/Mirror/Car%20Physics%20for%20Games/Car%20Physics%20for%20Games.html</a>
 * 
 */
public final class VehicleConstraintSettings extends ConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_SETTINGS_INIT;

	private static final VarHandle MAX_PITCH_ROLL_ANGLE;
	private static final VarHandle WHEELS_COUNT;
	private static final VarHandle WHEELS;
	private static final VarHandle ANTI_ROLL_BARS_COUNT;
	private static final VarHandle ANTI_ROLL_BARS;
	private static final VarHandle CONTROLLER;

	private static final long BASE_OFFSET;
	private static final long UP_OFFSET;
	private static final long FORWARD_OFFSET;

	private final Arena arena;

	private final MemorySegment jphVehicleConstraintSettings;

	private Vec3 up;
	private Vec3 forward;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ConstraintSettings.LAYOUT().withName("base"),
		        Vec3.LAYOUT().withName("up"),
		        Vec3.LAYOUT().withName("forward"),
		        JAVA_FLOAT.withName("maxPitchRollAngle"),
		        JAVA_INT.withName("wheelsCount"),
		        ADDRESS.withName("wheels"),
		        JAVA_INT.withName("antiRollBarsCount"),
		        MemoryLayout.paddingLayout(4),
		        ADDRESS.withName("antiRollBars"),
		        ADDRESS.withName("controller")
			);
		
		JPH_VEHICLE_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_VehicleConstraintSettings_Init", ADDRESS);
		//@formatter:on

		MAX_PITCH_ROLL_ANGLE = varHandle(LAYOUT, "maxPitchRollAngle");
		WHEELS_COUNT = varHandle(LAYOUT, "wheelsCount");
		WHEELS = varHandle(LAYOUT, "wheels");
		ANTI_ROLL_BARS_COUNT = varHandle(LAYOUT, "antiRollBarsCount");
		ANTI_ROLL_BARS = varHandle(LAYOUT, "antiRollBars");
		CONTROLLER = varHandle(LAYOUT, "controller");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		UP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("up"));
		FORWARD_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("forward"));
	}

	public VehicleConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	public VehicleConstraintSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		this.arena = arena;
		this.jphVehicleConstraintSettings = segment;

		up = new Vec3(segment.asSlice(UP_OFFSET, Vec3.LAYOUT()));
		forward = new Vec3(segment.asSlice(FORWARD_OFFSET, Vec3.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphVehicleConstraintSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot initialize vehicle constraint settings.");
		}
	}

	/**
	 * Vector indicating the up direction of the vehicle (in local space to the
	 * body)
	 */
	public void setUp(float x, float y, float z) {
		up.set(x, y, z);
	}

	/**
	 * Vector indicating the up direction of the vehicle (in local space to the
	 * body)
	 */
	public void setUp(Vector3f up) {
		this.up.set(up);
	}

	/**
	 * Vector indicating the up direction of the vehicle (in local space to the
	 * body)
	 */
	public Vector3f getUp(Vector3f target) {
		return up.get(target);
	}

	/**
	 * Vector indicating the up direction of the vehicle (in local space to the
	 * body)
	 */
	public Vector3f getUp() {
		return getUp(new Vector3f());
	}

	/**
	 * Vector indicating forward direction of the vehicle (in local space to the
	 * body)
	 */
	public void setForward(float x, float y, float z) {
		forward.set(x, y, z);
	}

	/**
	 * Vector indicating forward direction of the vehicle (in local space to the
	 * body)
	 */
	public void setForward(Vector3f up) {
		this.forward.set(up);
	}

	/**
	 * Vector indicating forward direction of the vehicle (in local space to the
	 * body)
	 */
	public Vector3f getForward(Vector3f target) {
		return forward.get(target);
	}

	/**
	 * Vector indicating forward direction of the vehicle (in local space to the
	 * body)
	 */
	public Vector3f getForward() {
		return getForward(new Vector3f());
	}

	/**
	 * Defines the maximum pitch/roll angle (rad), can be used to avoid the car from
	 * getting upside down. The vehicle up direction will stay within a cone
	 * centered around the up axis with half top angle mMaxPitchRollAngle, set to pi
	 * to turn off.
	 */
	public void setMaxPitchRollAngle(float angle) {
		MAX_PITCH_ROLL_ANGLE.set(jphVehicleConstraintSettings, angle);
	}

	/**
	 * @see #setMaxPitchRollAngle(float)
	 */
	public float getMaxPitchRollAngle() {
		return (float) MAX_PITCH_ROLL_ANGLE.get(jphVehicleConstraintSettings);
	}

	/**
	 * 
	 */
	public int getWheelsCount() {
		return (int) WHEELS_COUNT.get(jphVehicleConstraintSettings);
	}

	/**
	 * Set the wheels of this vehicle.
	 * <p>
	 * Implementation: An array is created that will be freed when this settings get
	 * freed.
	 */
	public void setWheels(WheelSettings... settings) {
		WHEELS_COUNT.set(jphVehicleConstraintSettings, settings.length);

		MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(settings.length, ADDRESS));
		for (int i = 0; i < settings.length; i++)
			array.setAtIndex(ADDRESS, i, settings[i].memorySegment());

		WHEELS.set(jphVehicleConstraintSettings, array);
	}

	/**
	 * Set the anti roll bars of this vehicle.
	 * <p>
	 * Implementation: An array is created that will be freed when this settings get
	 * freed.
	 */
	public void setAntiRollBars(VehicleAntiRollBar... antiRollBars) {
		ANTI_ROLL_BARS_COUNT.set(jphVehicleConstraintSettings, antiRollBars.length);

		StructLayout layout = VehicleAntiRollBar.LAYOUT();
		MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(antiRollBars.length, layout));
		for (int i = 0; i < antiRollBars.length; i++) {
			long offset = i * layout.byteSize();
			MemorySegment src = antiRollBars[i].memorySegment();
			MemorySegment.copy(src, 0, array, offset, layout.byteSize());
		}

		ANTI_ROLL_BARS.set(jphVehicleConstraintSettings, array);
	}

	/**
	 * 	Defines how the vehicle can accelerate / decelerate. 
	 */
	public void setVehicleController(VehicleControllerSettings settings) {
		CONTROLLER.set(jphVehicleConstraintSettings, settings.memorySegment());
	}

	public MemorySegment memorySegment() {
		return jphVehicleConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}