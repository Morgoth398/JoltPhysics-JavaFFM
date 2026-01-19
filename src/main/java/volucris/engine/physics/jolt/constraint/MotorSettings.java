package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that contains the settings for a constraint motor. See the main page of
 * the API documentation for more information on how to configure a motor.
 */
public final class MotorSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle MIN_FORCE_LIMIT;
	private static final VarHandle MAX_FORCE_LIMIT;
	private static final VarHandle MIN_TORQUE_LIMIT;
	private static final VarHandle MAX_TORQUE_LIMIT;

	private static final long SPRING_SETTINGS_OFFSET;

	private final MemorySegment jphMotorSettings;

	private final SpringSettings springSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        SpringSettings.LAYOUT().withName("springSettings"),
		        JAVA_FLOAT.withName("minForceLimit"),
		        JAVA_FLOAT.withName("maxForceLimit"),
		        JAVA_FLOAT.withName("minTorqueLimit"),
		        JAVA_FLOAT.withName("maxTorqueLimit")
			).withName("JPH_MotorSettings");
		//@formatter:on

		MIN_FORCE_LIMIT = varHandle(LAYOUT, "minForceLimit");
		MAX_FORCE_LIMIT = varHandle(LAYOUT, "maxForceLimit");
		MIN_TORQUE_LIMIT = varHandle(LAYOUT, "minTorqueLimit");
		MAX_TORQUE_LIMIT = varHandle(LAYOUT, "maxTorqueLimit");

		SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("springSettings"));
	}

	public MotorSettings() {
		this(Arena.ofAuto());
	}

	public MotorSettings(Arena arena) {
		jphMotorSettings = arena.allocate(LAYOUT);

		springSettings = new SpringSettings(jphMotorSettings.asSlice(SPRING_SETTINGS_OFFSET, SpringSettings.LAYOUT()));
	}

	public MotorSettings(MemorySegment segment) {
		jphMotorSettings = segment;

		springSettings = new SpringSettings(jphMotorSettings.asSlice(SPRING_SETTINGS_OFFSET, SpringSettings.LAYOUT()));
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphMotorSettings, 0, LAYOUT.byteSize());
	}

	/**
	 * Minimum force to apply in case of a linear constraint (N). Usually this is
	 * -mMaxForceLimit unless you want a motor that can e.g. push but not pull. Not
	 * used when motor is an angular motor.
	 */
	public void setMinForceLimit(float limit) {
		MIN_FORCE_LIMIT.set(jphMotorSettings, limit);
	}

	/**
	 * @see #setMinForceLimit(float)
	 */
	public float getMinForceLimit() {
		return (float) MIN_FORCE_LIMIT.get(jphMotorSettings);
	}

	/**
	 * Maximum force to apply in case of a linear constraint (N). Not used when
	 * motor is an angular motor.
	 */
	public void setMaxForceLimit(float limit) {
		MAX_FORCE_LIMIT.set(jphMotorSettings, limit);
	}

	/**
	 * @see #setMaxForceLimit(float)
	 */
	public float getMaxForceLimit() {
		return (float) MAX_FORCE_LIMIT.get(jphMotorSettings);
	}

	/**
	 * Minimum torque to apply in case of a angular constraint (N m). Usually this
	 * is -mMaxTorqueLimit unless you want a motor that can e.g. push but not pull.
	 * Not used when motor is a position motor.
	 */
	public void setMinTorqueLimit(float limit) {
		MIN_TORQUE_LIMIT.set(jphMotorSettings, limit);
	}

	/**
	 * @see #setMinTorqueLimit(float)
	 */
	public float getMinTorqueLimit() {
		return (float) MIN_TORQUE_LIMIT.get(jphMotorSettings);
	}

	/**
	 * Maximum torque to apply in case of a angular constraint (N m). Not used when
	 * motor is a position motor.
	 */
	public void setMaxTorqueLimit(float limit) {
		MAX_TORQUE_LIMIT.set(jphMotorSettings, limit);
	}

	/**
	 * @see #setMaxTorqueLimit(float)
	 */
	public float getMaxTorqueLimit() {
		return (float) MAX_TORQUE_LIMIT.get(jphMotorSettings);
	}

	/**
	 * Settings for the spring that is used to drive to the position target (not
	 * used when motor is a velocity motor).
	 */
	public void setSpringSettings(SpringSettings springSettings) {
		this.springSettings.set(springSettings.memorySegment());
	}

	/**
	 * Settings for the spring that is used to drive to the position target (not
	 * used when motor is a velocity motor).
	 */
	public SpringSettings getSpringSettings() {
		return springSettings;
	}

	public MemorySegment memorySegment() {
		return jphMotorSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
