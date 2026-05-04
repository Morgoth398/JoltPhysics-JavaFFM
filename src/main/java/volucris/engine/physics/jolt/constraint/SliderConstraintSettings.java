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
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Slider constraint settings, used to create a slider constraint.
 */
public final class SliderConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SETTINGS_INIT;
	private static final MethodHandle JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS;

	private static final VarHandle SPACE;
	private static final VarHandle AUTO_DETECT_POINT;
	private static final VarHandle LIMITS_MIN;
	private static final VarHandle LIMITS_MAX;
	private static final VarHandle MAX_FRICTION_FORCE;

	private static final long BASE_OFFSET;
	private static final long POINT_1_OFFSET;
	private static final long SLIDER_AXIS_1_OFFSET;
	private static final long NORMAL_AXIS_1_OFFSET;
	private static final long POINT_2_OFFSET;
	private static final long SLIDER_AXIS_2_OFFSET;
	private static final long NORMAL_AXIS_2_OFFSET;
	private static final long SPRING_SETTINGS_OFFSET;
	private static final long MOTOR_SETTINGS_OFFSET;

	private final MemorySegment jphSliderConstraintSettings;

	private final SpringSettings limitsSpringSettings;
	private final MotorSettings motorSettings;

	private final Vec3 point1;
	private final Vec3 sliderAxis1;
	private final Vec3 normalAxis1;
	private final Vec3 point2;
	private final Vec3 sliderAxis2;
	private final Vec3 normalAxis2;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ConstraintSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("space"),
		        JAVA_BOOLEAN.withName("autoDetectPoint"),
		        MemoryLayout.paddingLayout(3),
		        Vec3.LAYOUT().withName("point1"),
		        Vec3.LAYOUT().withName("sliderAxis1"),
		        Vec3.LAYOUT().withName("normalAxis1"),
		        Vec3.LAYOUT().withName("point2"),
		        Vec3.LAYOUT().withName("sliderAxis2"),
		        Vec3.LAYOUT().withName("normalAxis2"),
		        JAVA_FLOAT.withName("limitsMin"),
		        JAVA_FLOAT.withName("limitsMax"),
		        SpringSettings.LAYOUT().withName("limitsSpringSettings"),
		        JAVA_FLOAT.withName("maxFrictionForce"),
		        MotorSettings.LAYOUT().withName("motorSettings"),
		        MemoryLayout.paddingLayout(4)
			);
		
		JPH_SLIDER_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_SliderConstraintSettings_Init", ADDRESS);
		JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS = downcallHandleVoid("JPH_SliderConstraintSettings_SetSliderAxis", ADDRESS, ADDRESS);
		//@formatter:on

		SPACE = varHandle(LAYOUT, "space");
		AUTO_DETECT_POINT = varHandle(LAYOUT, "autoDetectPoint");
		LIMITS_MIN = varHandle(LAYOUT, "limitsMin");
		LIMITS_MAX = varHandle(LAYOUT, "limitsMax");
		MAX_FRICTION_FORCE = varHandle(LAYOUT, "maxFrictionForce");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		POINT_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
		SLIDER_AXIS_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sliderAxis1"));
		NORMAL_AXIS_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalAxis1"));
		POINT_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
		SLIDER_AXIS_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sliderAxis2"));
		NORMAL_AXIS_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normalAxis2"));
		SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
		MOTOR_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motorSettings"));
	}

	public SliderConstraintSettings() {
		this(Arena.ofAuto());
	}

	public SliderConstraintSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphSliderConstraintSettings = segment;

		limitsSpringSettings = new SpringSettings(segment.asSlice(SPRING_SETTINGS_OFFSET, SpringSettings.LAYOUT()));
		motorSettings = new MotorSettings(segment.asSlice(MOTOR_SETTINGS_OFFSET, MotorSettings.LAYOUT()));

		point1 = new Vec3(segment.asSlice(POINT_1_OFFSET, Vec3.LAYOUT()));
		sliderAxis1 = new Vec3(segment.asSlice(SLIDER_AXIS_1_OFFSET, Vec3.LAYOUT()));
		normalAxis1 = new Vec3(segment.asSlice(NORMAL_AXIS_1_OFFSET, Vec3.LAYOUT()));
		point2 = new Vec3(segment.asSlice(POINT_2_OFFSET, Vec3.LAYOUT()));
		sliderAxis2 = new Vec3(segment.asSlice(SLIDER_AXIS_2_OFFSET, Vec3.LAYOUT()));
		normalAxis2 = new Vec3(segment.asSlice(NORMAL_AXIS_2_OFFSET, Vec3.LAYOUT()));

		vecTmp = new Vec3(arena);

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphSliderConstraintSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize slider constraint settings: " + className);
		}
	}

	/**
	 * Simple way of setting the slider and normal axis in world space (assumes the
	 * bodies are already oriented correctly when the constraint is created)
	 */
	public void setSliderAxis(Vector3f axis) {
		try {
			vecTmp.set(axis);

			MethodHandle method = JPH_SLIDER_CONSTRAINT_SETTINGS_SET_SLIDER_AXIS;
			method.invokeExact(jphSliderConstraintSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set slider axis: " + className);
		}
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphSliderConstraintSettings);

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
		SPACE.set(jphSliderConstraintSettings, space.id());
	}

	/**
	 * When mSpace is WorldSpace mPoint1 and mPoint2 can be automatically calculated
	 * based on the positions of the bodies when the constraint is created (the
	 * current relative position/orientation is chosen as the '0' position). Set
	 * this to false if you want to supply the attachment points yourself.
	 */
	public void setAutoDetectPoint(boolean autoDetect) {
		AUTO_DETECT_POINT.set(jphSliderConstraintSettings, autoDetect);
	}

	/**
	 * @see #setAutoDetectPoint(boolean)
	 */
	public boolean getAutoDetectPoint() {
		return (boolean) AUTO_DETECT_POINT.get(jphSliderConstraintSettings);
	}

	/**
	 * When the bodies move so that mPoint1 coincides with mPoint2 the slider
	 * position is defined to be 0, movement will be limited between [mLimitsMin,
	 * mLimitsMax] where mLimitsMin e [-inf, 0] and mLimitsMax e [0, inf].
	 */
	public void setLimitsMin(float limit) {
		LIMITS_MIN.set(jphSliderConstraintSettings, limit);
	}

	/**
	 * @see #setLimitsMin(float)
	 */
	public float getLimitsMin() {
		return (float) LIMITS_MIN.get(jphSliderConstraintSettings);
	}

	/**
	 * @see #setLimitsMin(float)
	 */
	public void setLimitsMax(float limit) {
		LIMITS_MAX.set(jphSliderConstraintSettings, limit);
	}

	/**
	 * @see #setLimitsMin(float)
	 */
	public float getLimitsMax() {
		return (float) LIMITS_MAX.get(jphSliderConstraintSettings);
	}

	/**
	 * Maximum amount of friction force to apply (N) when not driven by a motor.
	 */
	public void setMaxFrictionForce(float maxForce) {
		MAX_FRICTION_FORCE.set(jphSliderConstraintSettings, maxForce);
	}

	/**
	 * Maximum amount of friction force to apply (N) when not driven by a motor.
	 */
	public float getMaxFrictionForce() {
		return (float) MAX_FRICTION_FORCE.get(jphSliderConstraintSettings);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace). Slider axis
	 * is the axis along which movement is possible (direction), normal axis is a
	 * perpendicular vector to define the frame.
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
	 * @see #setPoint2(float, float, float)
	 */
	public void setPoint2(Vector3f point) {
		this.point2.set(point);
	}

	/**
	 * @see #setPoint2(float, float, float)
	 */
	public Vector3f getPoint2(Vector3f target) {
		return point2.get(target);
	}

	/**
	 * @see #setPoint2(float, float, float)
	 */
	public Vector3f getPoint2() {
		return getPoint2(new Vector3f());
	}

	/**
	 * 
	 */
	public void setSliderAxis1(float x, float y, float z) {
		sliderAxis1.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setSliderAxis1(Vector3f axis) {
		sliderAxis1.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getSliderAxis1(Vector3f target) {
		return sliderAxis1.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getSliderAxis1() {
		return getSliderAxis1(new Vector3f());
	}

	/**
	 * 
	 */
	public void setSliderAxis2(float x, float y, float z) {
		sliderAxis2.set(x, y, z);
	}

	/**
	 * 
	 */
	public void setSliderAxis2(Vector3f axis) {
		sliderAxis2.set(axis);
	}

	/**
	 * 
	 */
	public Vector3f getSliderAxis2(Vector3f target) {
		return sliderAxis2.get(target);
	}

	/**
	 * 
	 */
	public Vector3f getSliderAxis2() {
		return getSliderAxis2(new Vector3f());
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
	public Vector3f getNormalAxis1() {
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
	 * the sliding axis.
	 */
	public MotorSettings getMotorSettings() {
		return motorSettings;
	}

	/**
	 * In case the constraint is powered, this determines the motor settings around
	 * the sliding axis.
	 */
	public void setMotorSettings(MotorSettings settings) {
		motorSettings.set(settings.memorySegment());
	}

	public MemorySegment memorySegment() {
		return jphSliderConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}