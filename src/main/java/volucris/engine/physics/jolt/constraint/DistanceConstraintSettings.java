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
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Distance constraint settings, used to create a distance constraint.
 */
public final class DistanceConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_SETTINGS_INIT;

	private static final VarHandle SPACE;
	private static final VarHandle MIN_DISTANCE;
	private static final VarHandle MAX_DISTANCE;

	private static final long BASE_OFFSET;
	private static final long POINT_1_OFFSET;
	private static final long POINT_2_OFFSET;
	private static final long LIMITS_SPRING_SETTINGS_OFFSET;

	private final MemorySegment jphDistanceConstraintSettings;

	private final SpringSettings limitsSpringSettings;

	private final Vec3 point1;
	private final Vec3 point2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ConstraintSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("space"),
		        Vec3.LAYOUT().withName("point1"),
		        Vec3.LAYOUT().withName("point2"),
		        JAVA_FLOAT.withName("minDistance"),
		        JAVA_FLOAT.withName("maxDistance"),
		        SpringSettings.LAYOUT().withName("limitsSpringSettings")
			).withName("JPH_DistanceConstraintSettings");
		
		JPH_DISTANCE_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_DistanceConstraintSettings_Init", ADDRESS);
		//@formatter:on

		SPACE = varHandle(LAYOUT, "space");
		MIN_DISTANCE = varHandle(LAYOUT, "minDistance");
		MAX_DISTANCE = varHandle(LAYOUT, "maxDistance");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		POINT_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
		POINT_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
		LIMITS_SPRING_SETTINGS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("limitsSpringSettings"));
	}

	public DistanceConstraintSettings() {
		MemorySegment segment = Arena.ofAuto().allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphDistanceConstraintSettings = segment;

		StructLayout layout = SpringSettings.LAYOUT();
		limitsSpringSettings = new SpringSettings(segment.asSlice(LIMITS_SPRING_SETTINGS_OFFSET, layout));

		point1 = new Vec3(segment.asSlice(POINT_1_OFFSET, Vec3.LAYOUT()));
		point2 = new Vec3(segment.asSlice(POINT_2_OFFSET, Vec3.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_DISTANCE_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphDistanceConstraintSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot initialize distance constraint settings.");
		}
	}

	/**
	 * @see #setSpace(ConstraintSpace)
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphDistanceConstraintSettings);

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
		SPACE.set(jphDistanceConstraintSettings, space.id());
	}

	/**
	 * Ability to override the distance range at which the two points are kept
	 * apart. If the value is negative, it will be replaced by the distance between
	 * mPoint1 and mPoint2 (works only if mSpace is world space).
	 */
	public void setMinDistance(float minDistance) {
		MIN_DISTANCE.set(jphDistanceConstraintSettings, minDistance);
	}

	/**
	 * @see #setMinDistance(float)
	 */
	public float getMinDistance() {
		return (float) MIN_DISTANCE.get(jphDistanceConstraintSettings);
	}

	/**
	 * 
	 */
	public void setMaxDistance(float maxDistance) {
		MAX_DISTANCE.set(jphDistanceConstraintSettings, maxDistance);
	}

	/**
	 * 
	 */
	public float getMaxDistance() {
		return (float) MAX_DISTANCE.get(jphDistanceConstraintSettings);
	}

	/**
	 * When enabled, this makes the limits soft. When the constraint exceeds the
	 * limits, a spring force will pull it back.
	 */
	public SpringSettings getLimitsSpringSettings() {
		return limitsSpringSettings;
	}

	/**
	 * @see #setLimitsSpringSettings(SpringSettings)
	 */
	public void setLimitsSpringSettings(SpringSettings settings) {
		limitsSpringSettings.set(settings.memorySegment());
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace). Constraint
	 * will keep mPoint1 (a point on body 1) and mPoint2 (a point on body 2) at the
	 * same distance. Note that this constraint can be used as a cheap
	 * PointConstraint by setting mPoint1 = mPoint2 (but this removes only 1 degree
	 * of freedom instead of 3).
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
	 * Body 2 constraint reference frame (space determined by mSpace).
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

	public MemorySegment memorySegment() {
		return jphDistanceConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}