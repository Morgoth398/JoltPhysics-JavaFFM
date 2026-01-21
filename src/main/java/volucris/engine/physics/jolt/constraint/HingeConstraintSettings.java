package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.constraint.ConstraintEnums.ConstraintSpace;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Hinge constraint settings, used to create a hinge constraint.
 */
public final class HingeConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_HINGE_CONSTRAINT_SETTINGS_INIT;

	private static final VarHandle SPACE;
	private static final VarHandle LIMITS_MIN;
	private static final VarHandle LIMITS_MAX;
	private static final VarHandle MAX_FRICTION_TORQUE;

	private static final long BASE_OFFSET;
	private static final long POINT_1_OFFSET;
	private static final long HINGE_AXIS_1_OFFSET;
	private static final long NORMAL_AXIS_1_OFFSET;
	private static final long POINT_2_OFFSET;
	private static final long HINGE_AXIS_2_OFFSET;
	private static final long NORMAL_AXIS_2_OFFSET;
	private static final long LIMITS_SPRING_SETTINGS_OFFSET;
	private static final long MOTOR_SETTINGS_OFFSET;

	private final MemorySegment jphHingeConstraintSettings;

	private final SpringSettings limitsSpringSettings;
	private final MotorSettings motorSettings;

	private final Vec3 point1;
	private final Vec3 hingeAxis1;
	private final Vec3 normalAxis1;
	private final Vec3 point2;
	private final Vec3 hingeAxis2;
	private final Vec3 normalAxis2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ConstraintSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("space"),
		        Vec3.LAYOUT().withName("point1"),
		        Vec3.LAYOUT().withName("hingeAxis1"),
		        Vec3.LAYOUT().withName("normalAxis1"),
		        Vec3.LAYOUT().withName("point2"),
		        Vec3.LAYOUT().withName("hingeAxis2"),
		        Vec3.LAYOUT().withName("normalAxis2"),
		        JAVA_FLOAT.withName("limitsMin"),
		        JAVA_FLOAT.withName("limitsMax"),
		        SpringSettings.LAYOUT().withName("limitsSpringSettings"),
		        JAVA_FLOAT.withName("maxFrictionTorque"),
		        MotorSettings.LAYOUT().withName("motorSettings")
			).withName("JPH_HingeConstraintSettings");
		
		JPH_HINGE_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_HingeConstraintSettings_Init", ADDRESS);
		//@formatter:on

		SPACE = varHandle(LAYOUT, "space");
		LIMITS_MIN = varHandle(LAYOUT, "limitsMin");
		LIMITS_MAX = varHandle(LAYOUT, "limitsMax");
		MAX_FRICTION_TORQUE = varHandle(LAYOUT, "maxFrictionTorque");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		POINT_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
		HINGE_AXIS_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hingeAxis1"));
		NORMAL_AXIS_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalAxis1"));
		POINT_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
		HINGE_AXIS_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hingeAxis2"));
		NORMAL_AXIS_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalAxis2"));
		LIMITS_SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
		MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSettings"));
	}

	public HingeConstraintSettings() {
		this(Arena.ofAuto());
	}

	public HingeConstraintSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphHingeConstraintSettings = segment;

		point1 = new Vec3(segment.asSlice(POINT_1_OFFSET, Vec3.LAYOUT()));
		hingeAxis1 = new Vec3(segment.asSlice(HINGE_AXIS_1_OFFSET, Vec3.LAYOUT()));
		normalAxis1 = new Vec3(segment.asSlice(NORMAL_AXIS_1_OFFSET, Vec3.LAYOUT()));
		point2 = new Vec3(segment.asSlice(POINT_2_OFFSET, Vec3.LAYOUT()));
		hingeAxis2 = new Vec3(segment.asSlice(HINGE_AXIS_2_OFFSET, Vec3.LAYOUT()));
		normalAxis2 = new Vec3(segment.asSlice(NORMAL_AXIS_2_OFFSET, Vec3.LAYOUT()));

		StructLayout layout = SpringSettings.LAYOUT();
		limitsSpringSettings = new SpringSettings(segment.asSlice(LIMITS_SPRING_SETTINGS_OFFSET, layout));

		motorSettings = new MotorSettings(segment.asSlice(MOTOR_SETTINGS_OFFSET, MotorSettings.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_HINGE_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphHingeConstraintSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize higne constraint settings: " + className);
		}
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphHingeConstraintSettings);

		for (ConstraintSpace space : ConstraintSpace.values()) {
			if (value == space.id())
				return space;
		}

		throw new JoltRuntimeException("Wrong value for constraint space");
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public void setSpace(ConstraintSpace space) {
		SPACE.set(jphHingeConstraintSettings, space.id());
	}

	/**
	 * Rotation around the hinge axis will be limited between [mLimitsMin,
	 * mLimitsMax] where mLimitsMin e [-pi, 0] and mLimitsMax e [0, pi]. Both angles
	 * are in radians.
	 */
	public void setLimitsMin(float limit) {
		LIMITS_MIN.set(jphHingeConstraintSettings, limit);
	}

	/**
	 * @see #setLimitsMin(float)
	 */
	public float getLimitsMin() {
		return (float) LIMITS_MIN.get(jphHingeConstraintSettings);
	}

	/**
	 * @see #setLimitsMin(float)
	 */
	public void setLimitsMax(float limit) {
		LIMITS_MAX.set(jphHingeConstraintSettings, limit);
	}

	/**
	 * @see #setLimitsMin(float)
	 */
	public float getLimitsMax() {
		return (float) LIMITS_MAX.get(jphHingeConstraintSettings);
	}

	/**
	 * Maximum amount of torque (N m) to apply as friction when the constraint is
	 * not powered by a motor.
	 */
	public void setMaxFrictionTorque(float torque) {
		MAX_FRICTION_TORQUE.set(jphHingeConstraintSettings, torque);
	}

	/**
	 * Maximum amount of torque (N m) to apply as friction when the constraint is
	 * not powered by a motor.
	 */
	public float getMaxFrictionTorque() {
		return (Float) MAX_FRICTION_TORQUE.get(jphHingeConstraintSettings);
	}

	/**
	 * When enabled, this makes the limits soft. When the constraint exceeds the
	 * limits, a spring force will pull it back.
	 */
	public SpringSettings getLimitsSpringSettings() {
		return limitsSpringSettings;
	}

	/**
	 * When enabled, this makes the limits soft. When the constraint exceeds the
	 * limits, a spring force will pull it back.
	 */
	public void setLimitsSpringSettings(SpringSettings settings) {
		limitsSpringSettings.set(settings.memorySegment());
	}

	/**
	 * In case the constraint is powered, this determines the motor settings around
	 * the hinge axis.
	 */
	public MotorSettings getMotorSettings() {
		return motorSettings;
	}

	/**
	 * In case the constraint is powered, this determines the motor settings around
	 * the hinge axis.
	 */
	public void setMotorSettings(MotorSettings settings) {
		motorSettings.set(settings.memorySegment());
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace). Hinge axis is
	 * the axis where rotation is allowed. When the normal axis of both bodies align
	 * in world space, the hinge angle is defined to be 0. mHingeAxis1 and
	 * mNormalAxis1 should be perpendicular. mHingeAxis2 and mNormalAxis2 should
	 * also be perpendicular. If you configure the joint in world space and create
	 * both bodies with a relative rotation you want to be defined as zero, you can
	 * simply set mHingeAxis1 = mHingeAxis2 and mNormalAxis1 = mNormalAxis2.
	 */
	public void setPoint1(float x, float y, float z) {
		point1.set(x, y, z);
	}

	/**
	 * @see #setPoint1(float, float, float)
	 */
	public void setPoint1(Vector3f point) {
		this.point1.set(point);
	}

	/**
	 * @see #setPoint1(float, float, float)
	 */
	public Vector3f getPoint1(Vector3f target) {
		return point1.get(target);
	}

	/**
	 * @see #setPoint1(float, float, float)
	 */
	public Vector3f getPoint1() {
		return getPoint1(new Vector3f());
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace)
	 */
	public void setPoint2(float x, float y, float z) {
		point2.set(x, y, z);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace)
	 */
	public void setPoint2(Vector3f point) {
		this.point2.set(point);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace)
	 */
	public Vector3f getPoint2(Vector3f target) {
		return point2.get(target);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace)
	 */
	public Vector3f getPoint2() {
		return getPoint2(new Vector3f());
	}

	/**
	 * 
	 */
	public void setHingeAxis1(float x, float y, float z) {
		hingeAxis1.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setHingeAxis1(Vector3f axis) {
		hingeAxis1.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getHingeAxis1(Vector3f target) {
		return hingeAxis1.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getHingeAxis1() {
		return getHingeAxis1(new Vector3f());
	}

	/**
	 * 
	 */
	public void setHingeAxis2(float x, float y, float z) {
		hingeAxis2.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setHingeAxis2(Vector3f axis) {
		hingeAxis2.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getHingeAxis2(Vector3f target) {
		return hingeAxis2.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getHingeAxis2() {
		return getHingeAxis2(new Vector3f());
	}

	/**
	 * 
	 */
	public void setNormalAxis1(float x, float y, float z) {
		normalAxis1.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setNormalAxis1(Vector3f axis) {
		normalAxis1.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getNormalAxis1(Vector3f target) {
		return normalAxis1.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getNomalAxis1() {
		return getNormalAxis1(new Vector3f());
	}

	/**
	 * 
	 */
	public void setNormalAxis2(float x, float y, float z) {
		normalAxis2.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setNormalAxis2(Vector3f axis) {
		normalAxis2.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getNormalAxis2(Vector3f target) {
		return normalAxis2.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getNormalAxis2() {
		return getNormalAxis2(new Vector3f());
	}

	public MemorySegment memorySegment() {
		return jphHingeConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}