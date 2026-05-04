package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.constraint.ConstraintEnums.ConstraintSpace;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.SwingType;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Swing twist constraint settings, used to create a swing twist constraint All
 * values in this structure are copied to the swing twist constraint and the
 * settings object is no longer needed afterwards.
 * <p>
 * An example <a href=https://jrouwe.github.io/JoltPhysics/SwingTwistConstraint.png>image</a>.
 */
public final class SwingTwistConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_SETTINGS_INIT;

	private static final VarHandle SPACE;
	private static final VarHandle SWING_TYPE;
	private static final VarHandle NORMAL_HALF_CONE_ANGLE;
	private static final VarHandle PLANE_HALF_CONE_ANGLE;
	private static final VarHandle TWIST_MIN_ANGLE;
	private static final VarHandle TWIST_MAX_ANGLE;
	private static final VarHandle MAX_FRICTION_TORQUE;

	private static final long BASE_OFFSET;
	private static final long POSITION_1_OFFSET;
	private static final long TWIST_AXIS_1_OFFSET;
	private static final long PLANE_AXIS_1_OFFSET;
	private static final long POSITION_2_OFFSET;
	private static final long TWIST_AXIS_2_OFFSET;
	private static final long PLANE_AXIS_2_OFFSET;
	private static final long SWING_MOTOR_SETTINGS_OFFSET;
	private static final long TWIST_MOTOR_SETTINGS_OFFSET;

	private final MemorySegment jphSwingTwistConstraintSettings;

	private final MotorSettings swingMotorSettings;
	private final MotorSettings twistMotorSettings;

	private final Vec3 position1;
	private final Vec3 twistAxis1;
	private final Vec3 planeAxis1;
	private final Vec3 position2;
	private final Vec3 twistAxis2;
	private final Vec3 planeAxis2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ConstraintSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("space"),
		        Vec3.LAYOUT().withName("position1"),
		        Vec3.LAYOUT().withName("twistAxis1"),
		        Vec3.LAYOUT().withName("planeAxis1"),
		        Vec3.LAYOUT().withName("position2"),
		        Vec3.LAYOUT().withName("twistAxis2"),
		        Vec3.LAYOUT().withName("planeAxis2"),
		        JAVA_INT.withName("swingType"),
		        JAVA_FLOAT.withName("normalHalfConeAngle"),
		        JAVA_FLOAT.withName("planeHalfConeAngle"),
		        JAVA_FLOAT.withName("twistMinAngle"),
		        JAVA_FLOAT.withName("twistMaxAngle"),
		        JAVA_FLOAT.withName("maxFrictionTorque"),
		        MotorSettings.LAYOUT().withName("swingMotorSettings"),
		        MotorSettings.LAYOUT().withName("twistMotorSettings"),
		        MemoryLayout.paddingLayout(4)
			).withName("JPH_SwingTwistConstraintSettings");
		
		JPH_SWING_TWIST_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_SwingTwistConstraintSettings_Init", ADDRESS);
		//@formatter:on

		SPACE = varHandle(LAYOUT, "space");
		SWING_TYPE = varHandle(LAYOUT, "swingType");
		NORMAL_HALF_CONE_ANGLE = varHandle(LAYOUT, "normalHalfConeAngle");
		PLANE_HALF_CONE_ANGLE = varHandle(LAYOUT, "planeHalfConeAngle");
		TWIST_MIN_ANGLE = varHandle(LAYOUT, "twistMinAngle");
		TWIST_MAX_ANGLE = varHandle(LAYOUT, "twistMaxAngle");
		MAX_FRICTION_TORQUE = varHandle(LAYOUT, "maxFrictionTorque");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		POSITION_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position1"));
		TWIST_AXIS_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistAxis1"));
		PLANE_AXIS_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeAxis1"));
		POSITION_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position2"));
		TWIST_AXIS_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistAxis2"));
		PLANE_AXIS_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("planeAxis2"));
		SWING_MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swingMotorSettings"));
		TWIST_MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistMotorSettings"));
	}

	public SwingTwistConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	public SwingTwistConstraintSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphSwingTwistConstraintSettings = segment;

		swingMotorSettings = new MotorSettings(segment.asSlice(SWING_MOTOR_SETTINGS_OFFSET, MotorSettings.LAYOUT()));
		twistMotorSettings = new MotorSettings(segment.asSlice(TWIST_MOTOR_SETTINGS_OFFSET, MotorSettings.LAYOUT()));

		position1 = new Vec3(segment.asSlice(POSITION_1_OFFSET, Vec3.LAYOUT()));
		twistAxis1 = new Vec3(segment.asSlice(TWIST_AXIS_1_OFFSET, Vec3.LAYOUT()));
		planeAxis1 = new Vec3(segment.asSlice(PLANE_AXIS_1_OFFSET, Vec3.LAYOUT()));
		position2 = new Vec3(segment.asSlice(POSITION_2_OFFSET, Vec3.LAYOUT()));
		twistAxis2 = new Vec3(segment.asSlice(TWIST_AXIS_2_OFFSET, Vec3.LAYOUT()));
		planeAxis2 = new Vec3(segment.asSlice(PLANE_AXIS_2_OFFSET, Vec3.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphSwingTwistConstraintSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot initialize swing twist constraint settings.");
		}
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphSwingTwistConstraintSettings);

		for (ConstraintSpace space : ConstraintSpace.values()) {
			if (value == space.id())
				return space;
		}

		throw new VolucrisRuntimeException("Jolt: Wrong value for constraint space.");
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public void setSpace(ConstraintSpace space) {
		SPACE.set(jphSwingTwistConstraintSettings, space.id());
	}

	/**
	 * The type of swing constraint that we want to use. 
	 */
	public SwingType getSwingType() {
		int value = (int) SWING_TYPE.get(jphSwingTwistConstraintSettings);

		for (SwingType type : SwingType.values()) {
			if (value == type.id())
				return type;
		}

		throw new VolucrisRuntimeException("Jolt: Wrong value for swing type.");
	}

	/**
	 * The type of swing constraint that we want to use. 
	 */
	public void setSwingType(SwingType type) {
		SWING_TYPE.set(jphSwingTwistConstraintSettings, type.id());
	}

	/**
	 * See image at Detailed Description. Angle in radians. 
	 */
	public void setNormalHalfConeAngle(float angle) {
		NORMAL_HALF_CONE_ANGLE.set(jphSwingTwistConstraintSettings, angle);
	}

	/**
	 * See image at Detailed Description. Angle in radians. 
	 */
	public float getNormalHalfConeAngle() {
		return (float) NORMAL_HALF_CONE_ANGLE.get(jphSwingTwistConstraintSettings);
	}

	/**
	 * See image at Detailed Description. Angle in radians. 
	 */
	public void setPlaneHalfConeAngle(float angle) {
		PLANE_HALF_CONE_ANGLE.set(jphSwingTwistConstraintSettings, angle);
	}

	/**
	 * See image at Detailed Description. Angle in radians. 
	 */
	public float getPlaneHalfConeAngle() {
		return (float) PLANE_HALF_CONE_ANGLE.get(jphSwingTwistConstraintSettings);
	}

	/**
	 * See image at Detailed Description. Angle in radians. Should be ∈[−𝜋,𝜋]. 
	 */
	public void setTwistMinAngle(float angle) {
		TWIST_MIN_ANGLE.set(jphSwingTwistConstraintSettings, angle);
	}

	/**
	 * See image at Detailed Description. Angle in radians. Should be ∈[−𝜋,𝜋]. 
	 */
	public float getTwistMinAngle() {
		return (float) TWIST_MIN_ANGLE.get(jphSwingTwistConstraintSettings);
	}

	/**
	 * See image at Detailed Description. Angle in radians. Should be ∈[−𝜋,𝜋]. 
	 */
	public void setTwistMaxAngle(float angle) {
		TWIST_MAX_ANGLE.set(jphSwingTwistConstraintSettings, angle);
	}

	/**
	 * See image at Detailed Description. Angle in radians. Should be ∈[−𝜋,𝜋]. 
	 */
	public float getTwistMaxAngle() {
		return (float) TWIST_MAX_ANGLE.get(jphSwingTwistConstraintSettings);
	}

	/**
	 * Maximum amount of torque (N m) to apply as friction when the constraint is not powered by a motor. 
	 */
	public void setMaxFrictionTorque(float torque) {
		MAX_FRICTION_TORQUE.set(jphSwingTwistConstraintSettings, torque);
	}

	/**
	 * Maximum amount of torque (N m) to apply as friction when the constraint is not powered by a motor. 
	 */
	public float getMaxFrictionTorque() {
		return (float) MAX_FRICTION_TORQUE.get(jphSwingTwistConstraintSettings);
	}

	/**
	 * 
	 */
	public void setPosition1(float x, float y, float z) {
		position1.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setPosition1(Vector3f position) {
		position1.set(position);
	}

	/**
	 * 
	 */
	public Vector3f getPosition1(Vector3f target) {
		return position1.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getPosition1() {
		return getPosition1(new Vector3f());
	}

	/**
	 * 
	 */
	public void setPosition2(float x, float y, float z) {
		position2.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setPosition2(Vector3f position) {
		position2.set(position);
	}

	/**
	 * 
	 */
	public Vector3f getPosition2(Vector3f target) {
		return position2.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getPosition2() {
		return getPosition2(new Vector3f());
	}

	/**
	 * 
	 */
	public void setTwistAxis1(float x, float y, float z) {
		twistAxis1.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setTwistAxis1(Vector3f axis) {
		twistAxis1.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getTwistAxis1(Vector3f target) {
		return twistAxis1.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getTwistAxis1() {
		return getTwistAxis1(new Vector3f());
	}

	/**
	 * 
	 */
	public void setTwistAxis2(float x, float y, float z) {
		twistAxis2.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setTwistAxis2(Vector3f axis) {
		twistAxis2.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getTwistAxis2(Vector3f target) {
		return twistAxis2.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getTwistAxis2() {
		return getTwistAxis2(new Vector3f());
	}

	/**
	 * 
	 */
	public void setPlaneAxis1(float x, float y, float z) {
		planeAxis1.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setPlaneAxis1(Vector3f axis) {
		planeAxis1.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getPlaneAxis1(Vector3f target) {
		return planeAxis1.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getPlaneAxis1() {
		return getPlaneAxis1(new Vector3f());
	}

	/**
	 * 
	 */
	public void setPlaneAxis2(float x, float y, float z) {
		planeAxis2.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setPlaneAxis2(Vector3f axis) {
		planeAxis2.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getPlaneAxis2(Vector3f target) {
		return planeAxis2.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getPlaneAxis2() {
		return getPlaneAxis2(new Vector3f());
	}

	/**
	 * 
	 */
	public MotorSettings getSwingMotorSettings() {
		return swingMotorSettings;
	}

	/**
	 * 
	 */
	public void setSwingMotorSettings(MotorSettings settings) {
		swingMotorSettings.set(settings.memorySegment());
	}

	/**
	 * 
	 */
	public MotorSettings getTwistMotorSettings() {
		return twistMotorSettings;
	}

	/**
	 * 
	 */
	public void setTwistMotorSettings(MotorSettings settings) {
		twistMotorSettings.set(settings.memorySegment());
	}

	public MemorySegment memorySegment() {
		return jphSwingTwistConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}