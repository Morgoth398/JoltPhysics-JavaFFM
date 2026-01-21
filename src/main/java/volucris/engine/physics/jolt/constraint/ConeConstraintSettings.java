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
 * Cone constraint settings, used to create a cone constraint.
 */
public final class ConeConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_CONE_CONSTRAINT_SETTINGS_INIT;

	private static final VarHandle SPACE;
	private static final VarHandle HALF_CONE_ANGLE;

	private static final long BASE_OFFSET;
	private static final long POINT_OFFSET;
	private static final long TWIST_AXIS_1_OFFSET;
	private static final long POINT_2_OFFSET;
	private static final long TWIST_AXIS_2_OFFSET;

	private final MemorySegment jphConeConstraintSettings;

	private final Vec3 point;
	private final Vec3 twistAxis1;
	private final Vec3 point2;
	private final Vec3 twistAxis2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ConstraintSettings.LAYOUT().withName("base"),
				JAVA_INT.withName("space"),
				Vec3.LAYOUT().withName("point"),
				Vec3.LAYOUT().withName("twistAxis1"),
				Vec3.LAYOUT().withName("point2"),
				Vec3.LAYOUT().withName("twistAxis2"),
				JAVA_FLOAT.withName("halfConeAngle")
			).withName("JPH_ConeConstraintSettings");
		
		JPH_CONE_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_ConeConstraintSettings_Init", ADDRESS);
		
		SPACE = varHandle(LAYOUT, "space");
		HALF_CONE_ANGLE = varHandle(LAYOUT, "halfConeAngle");
		//@formatter:on

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		POINT_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point"));
		TWIST_AXIS_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistAxis1"));
		POINT_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
		TWIST_AXIS_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("twistAxis2"));
	}

	public ConeConstraintSettings() {
		this(Arena.ofAuto());
	}

	public ConeConstraintSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphConeConstraintSettings = segment;

		point = new Vec3(segment.asSlice(POINT_OFFSET, Vec3.LAYOUT()));
		twistAxis1 = new Vec3(segment.asSlice(TWIST_AXIS_1_OFFSET, Vec3.LAYOUT()));
		point2 = new Vec3(segment.asSlice(POINT_2_OFFSET, Vec3.LAYOUT()));
		twistAxis2 = new Vec3(segment.asSlice(TWIST_AXIS_2_OFFSET, Vec3.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_CONE_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphConeConstraintSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize cone constraint settings: " + className);
		}
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphConeConstraintSettings);

		for (ConstraintSpace space : ConstraintSpace.values()) {
			if (value == space.id())
				return space;
		}

		throw new JoltRuntimeException("Wrong value for constraint space");
	}

	/**
	 * @see #getSpace()
	 */
	public void setSpace(ConstraintSpace space) {
		SPACE.set(jphConeConstraintSettings, space.id());
	}

	/**
	 * Body 1 constraint reference frame (space determined by
	 * {@link #setSpace(ConstraintSpace)}
	 */
	public void setPoint(float x, float y, float z) {
		point.set(x, y, z);
	}

	/**
	 * @see #setPoint(float, float, float)
	 */
	public void setPoint(Vector3f point) {
		this.point.set(point);
	}

	/**
	 * @see #setPoint(float, float, float)
	 */
	public Vector3f getPoint(Vector3f target) {
		return point.get(target);
	}

	/**
	 * @see #setPoint(float, float, float)
	 */
	public Vector3f getPoint() {
		return getPoint(new Vector3f());
	}

	/**
	 * Body 2 constraint reference frame (space determined by
	 * {@link #setSpace(ConstraintSpace)}
	 */
	public void setPoint2(float x, float y, float z) {
		point2.set(x, y, z);
	}

	/**
	 * @see #setPoint(float, float, float)
	 */
	public void setPoint2(Vector3f point) {
		this.point2.set(point);
	}

	/**
	 * @see #setPoint(float, float, float)
	 */
	public Vector3f getPoint2(Vector3f target) {
		return point2.get(target);
	}

	/**
	 * @see #setPoint(float, float, float)
	 */
	public Vector3f getPoint2() {
		return getPoint2(new Vector3f());
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
	 * Half of maximum angle between twist axis of body 1 and 2.
	 */
	public void setHalfConeAngle(float angle) {
		HALF_CONE_ANGLE.set(jphConeConstraintSettings, angle);
	}

	/**
	 * Half of maximum angle between twist axis of body 1 and 2.
	 */
	public float getHalfConeAngle() {
		return (float) HALF_CONE_ANGLE.get(jphConeConstraintSettings);
	}

	public MemorySegment memorySegment() {
		return jphConeConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}