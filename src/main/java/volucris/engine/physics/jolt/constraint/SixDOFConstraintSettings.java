package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.constraint.ConstraintEnums.ConstraintSpace;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.SixDOFConstraintAxis;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.SwingType;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * 6 Degree Of Freedom Constraint setup structure. Allows control over each of
 * the 6 degrees of freedom.
 */
public final class SixDOFConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SETTINGS_INIT;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SETTINGS_MAKE_FREE_AXIS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SETTINGS_IS_FREE_AXIS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SETTINGS_MAKE_FIXED_AXIS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SETTINGS_IS_FIXED_AXIS;
	private static final MethodHandle JPH_SIX_DOF_CONSTRAINT_SETTINGS_SET_LIMITED_AXIS;

	private static final VarHandle[] MAX_FRICTION;
	private static final VarHandle[] LIMIT_MIN;
	private static final VarHandle[] LIMIT_MAX;

	private static final VarHandle SPACE;
	private static final VarHandle SWING_TYPE;

	private static final long BASE_OFFSET;
	private static final long POSITION_1_OFFSET;
	private static final long AXIS_X1_OFFSET;
	private static final long AXIS_Y1_OFFSET;
	private static final long POSITION_2_OFFSET;
	private static final long AXIS_X2_OFFSET;
	private static final long AXIS_Y2_OFFSET;
	private static final long LIMITS_SPRING_SETTINGS_OFFSET;
	private static final long MOTOR_SETTINGS_OFFSET;

	private final MemorySegment jphSixDOFConstraintSettings;

	private final SpringSettings[] limitsSpringSettings;
	private final MotorSettings[] motorSettings;

	private final Vec3 position1;
	private final Vec3 axisX1;
	private final Vec3 axisY1;
	private final Vec3 position2;
	private final Vec3 axisX2;
	private final Vec3 axisY2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ConstraintSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("space"),
		        Vec3.LAYOUT().withName("position1"),
		        Vec3.LAYOUT().withName("axisX1"),
		        Vec3.LAYOUT().withName("axisY1"),
		        Vec3.LAYOUT().withName("position2"),
		        Vec3.LAYOUT().withName("axisX2"),
		        Vec3.LAYOUT().withName("axisY2"),
		        MemoryLayout.sequenceLayout(6, JAVA_FLOAT).withName("maxFriction"),
		        JAVA_INT.withName("swingType"),
		        MemoryLayout.sequenceLayout(6, JAVA_FLOAT).withName("limitMin"),
		        MemoryLayout.sequenceLayout(6, JAVA_FLOAT).withName("limitMax"),
		        MemoryLayout.sequenceLayout(3, SpringSettings.LAYOUT()).withName("limitsSpringSettings"),
		        MemoryLayout.sequenceLayout(6, MotorSettings.LAYOUT()).withName("motorSettings"),
		        MemoryLayout.paddingLayout(4)
			);
		
		JPH_SIX_DOF_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_SixDOFConstraintSettings_Init", ADDRESS);
		JPH_SIX_DOF_CONSTRAINT_SETTINGS_MAKE_FREE_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_MakeFreeAxis", ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_SETTINGS_IS_FREE_AXIS = downcallHandle("JPH_SixDOFConstraintSettings_IsFreeAxis", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_SETTINGS_MAKE_FIXED_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_MakeFixedAxis", ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_SETTINGS_IS_FIXED_AXIS = downcallHandle("JPH_SixDOFConstraintSettings_IsFixedAxis", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_SIX_DOF_CONSTRAINT_SETTINGS_SET_LIMITED_AXIS = downcallHandleVoid("JPH_SixDOFConstraintSettings_SetLimitedAxis", ADDRESS, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
		//@formatter:on

		MAX_FRICTION = new VarHandle[6];
		for (int i = 0; i < MAX_FRICTION.length; i++)
			MAX_FRICTION[i] = varHandle(LAYOUT, "maxFriction", i);
		LIMIT_MIN = new VarHandle[6];
		for (int i = 0; i < LIMIT_MIN.length; i++)
			LIMIT_MIN[i] = varHandle(LAYOUT, "limitMin", i);
		LIMIT_MAX = new VarHandle[6];
		for (int i = 0; i < LIMIT_MAX.length; i++)
			LIMIT_MAX[i] = varHandle(LAYOUT, "limitMax", i);

		SPACE = varHandle(LAYOUT, "space");
		SWING_TYPE = varHandle(LAYOUT, "swingType");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		POSITION_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position1"));
		AXIS_X1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX1"));
		AXIS_Y1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY1"));
		POSITION_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("position2"));
		AXIS_X2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX2"));
		AXIS_Y2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY2"));
		LIMITS_SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
		MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSettings"));
	}

	public SixDOFConstraintSettings() {
		MemorySegment segment = Arena.ofAuto().allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphSixDOFConstraintSettings = segment;

		position1 = new Vec3(segment.asSlice(POSITION_1_OFFSET, Vec3.LAYOUT()));
		axisX1 = new Vec3(segment.asSlice(AXIS_X1_OFFSET, Vec3.LAYOUT()));
		axisY1 = new Vec3(segment.asSlice(AXIS_Y1_OFFSET, Vec3.LAYOUT()));
		position2 = new Vec3(segment.asSlice(POSITION_2_OFFSET, Vec3.LAYOUT()));
		axisX2 = new Vec3(segment.asSlice(AXIS_X2_OFFSET, Vec3.LAYOUT()));
		axisY2 = new Vec3(segment.asSlice(AXIS_Y2_OFFSET, Vec3.LAYOUT()));

		limitsSpringSettings = new SpringSettings[3];
		for (int i = 0; i < limitsSpringSettings.length; i++) {
			long offset = LIMITS_SPRING_SETTINGS_OFFSET + i * SpringSettings.LAYOUT().byteSize();
			limitsSpringSettings[i] = new SpringSettings(segment.asSlice(offset, SpringSettings.LAYOUT()));
		}
		motorSettings = new MotorSettings[6];
		for (int i = 0; i < motorSettings.length; i++) {
			long offset = MOTOR_SETTINGS_OFFSET + i * MotorSettings.LAYOUT().byteSize();
			motorSettings[i] = new MotorSettings(segment.asSlice(offset, MotorSettings.LAYOUT()));
		}

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphSixDOFConstraintSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot initialize six DOF constraint settings.");
		}
	}

	/**
	 * Make axis free (unconstrained)
	 */
	public void makeFreeAxis(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SETTINGS_MAKE_FREE_AXIS;
			method.invokeExact(jphSixDOFConstraintSettings, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot make free axis.");
		}
	}

	/**
	 * 
	 */
	public boolean isFreeAxis(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SETTINGS_IS_FREE_AXIS;
			return (boolean) method.invokeExact(jphSixDOFConstraintSettings, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if is free axis.");
		}
	}

	/**
	 * Make axis fixed (fixed at value 0)
	 */
	public void makeFixedAxis(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SETTINGS_MAKE_FIXED_AXIS;
			method.invokeExact(jphSixDOFConstraintSettings, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot make fixed axis.");
		}
	}

	/**
	 * 
	 */
	public boolean isFixedAxis(SixDOFConstraintAxis axis) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SETTINGS_IS_FIXED_AXIS;
			return (boolean) method.invokeExact(jphSixDOFConstraintSettings, axis.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot is fixed axis.");
		}
	}

	/**
	 * Set a valid range for the constraint (if {@code max < min} the axis will become
	 * fixed)
	 */
	public void setLimitedAxis(SixDOFConstraintAxis axis, float min, float max) {
		try {
			MethodHandle method = JPH_SIX_DOF_CONSTRAINT_SETTINGS_SET_LIMITED_AXIS;
			method.invokeExact(jphSixDOFConstraintSettings, axis.id(), min, max);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set limited axis.");
		}
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphSixDOFConstraintSettings);

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
		SPACE.set(jphSixDOFConstraintSettings, space.id());
	}

	/**
	 * The type of swing constraint that we want to use.
	 */
	public SwingType getSwingType() {
		int value = (int) SWING_TYPE.get(jphSixDOFConstraintSettings);

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
		SWING_TYPE.set(jphSixDOFConstraintSettings, type.id());
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace)
	 */
	public void setPosition1(float x, float y, float z) {
		position1.set(x, y, z);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace)
	 */
	public void setPosition1(Vector3f position) {
		position1.set(position);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace)
	 */
	public Vector3f getPosition1(Vector3f target) {
		return position1.get(target);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace)
	 */
	public Vector3f getPosition1() {
		return getPosition1(new Vector3f());
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace)
	 */
	public void setPosition2(float x, float y, float z) {
		position2.set(x, y, z);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace)
	 */
	public void setPosition2(Vector3f position) {
		position2.set(position);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace)
	 */
	public Vector3f getPosition2(Vector3f target) {
		return position2.get(target);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace)
	 */
	public Vector3f getPosition2() {
		return getPosition2(new Vector3f());
	}

	/**
	 * 
	 */
	public void setAxisX1(float x, float y, float z) {
		axisX1.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setAxisX1(Vector3f axis) {
		axisX1.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getAxisX1(Vector3f target) {
		return axisX1.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getAxisX1() {
		return getAxisX1(new Vector3f());
	}

	/**
	 * 
	 */
	public void setAxisX2(float x, float y, float z) {
		axisX2.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setAxisX2(Vector3f axis) {
		axisX2.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getAxisX2(Vector3f target) {
		return axisX2.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getAxisX2() {
		return getAxisX2(new Vector3f());
	}

	/**
	 * 
	 */
	public void setAxisY1(float x, float y, float z) {
		axisY1.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setAxisY1(Vector3f axis) {
		axisY1.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getAxisY1(Vector3f target) {
		return axisY1.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getAxisY1() {
		return getAxisY1(new Vector3f());
	}

	/**
	 * 
	 */
	public void setAxisY2(float x, float y, float z) {
		axisY2.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setAxisY2(Vector3f axis) {
		axisY2.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getAxisY2(Vector3f target) {
		return axisY2.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getAxisY2() {
		return getAxisY2(new Vector3f());
	}

	/**
	 * When enabled, this makes the limits soft. When the constraint exceeds the
	 * limits, a spring force will pull it back. Only soft translation limits are
	 * supported, soft rotation limits are not currently supported.
	 */
	public SpringSettings getLimitsSpringSettings(SixDOFConstraintAxis axis) {
		return limitsSpringSettings[axis.id()];
	}

	/**
	 * Motor settings for each axis.
	 */
	public MotorSettings getMotorSettings(SixDOFConstraintAxis axis) {
		return motorSettings[axis.id()];
	}

	/**
	 * 
	 * 
	 * Limits. For translation: Min and max linear limits in m (0 is frame of body 1
	 * and 2 coincide). For rotation: Min and max angular limits in rad (0 is frame
	 * of body 1 and 2 coincide). See comments at Axis enum for limit ranges.
	 * <p>
	 * Remove degree of freedom by setting min = FLT_MAX and max = -FLT_MAX. The
	 * constraint will be driven to 0 for this axis.
	 * <p>
	 * Free movement over an axis is allowed when min = -FLT_MAX and max = FLT_MAX.
	 * <p>
	 * Rotation limit around X-Axis: When limited, should be ∈[−𝜋,𝜋]. Can be
	 * asymmetric around zero.
	 * <p>
	 * Rotation limit around Y-Z Axis: Forms a pyramid or cone shaped limit:
	 * 
	 * <ul>
	 * <li>For pyramid, should be ∈[−𝜋,𝜋] and does not need to be symmetrical
	 * around zero.
	 * <li>For cone should be ∈[0,𝜋] and needs to be symmetrical around zero (min
	 * limit is assumed to be -max limit).
	 * </ul>
	 * 
	 */
	public float getLimitMin(SixDOFConstraintAxis axis) {
		return (float) LIMIT_MIN[axis.id()].get(jphSixDOFConstraintSettings);
	}

	/**
	 * @see #getLimitMin(SixDOFConstraintAxis)
	 */
	public float getLimitMax(SixDOFConstraintAxis axis) {
		return (float) LIMIT_MAX[axis.id()].get(jphSixDOFConstraintSettings);
	}

	/**
	 * 
	 */
	public float getMaxFriction(SixDOFConstraintAxis axis) {
		return (float) MAX_FRICTION[axis.id()].get(jphSixDOFConstraintSettings);
	}

	public MemorySegment memorySegment() {
		return jphSixDOFConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}