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
 * Fixed constraint settings, used to create a fixed constraint.
 */
public final class FixedConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_FIXED_CONSTRAINT_SETTINGS_INIT;

	private static final VarHandle SPACE;
	private static final VarHandle AUTO_DETECT_POINT;

	private static final long BASE_OFFSET;
	private static final long POINT_1_OFFSET;
	private static final long AXIS_X1_OFFSET;
	private static final long AXIS_Y1_OFFSET;
	private static final long POINT_2_OFFSET;
	private static final long AXIS_X2_OFFSET;
	private static final long AXIS_Y2_OFFSET;

	private final MemorySegment jphFixedConstraintSettings;

	private final Vec3 point1;
	private final Vec3 axisX1;
	private final Vec3 axisY1;
	private final Vec3 point2;
	private final Vec3 axisX2;
	private final Vec3 axisY2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ConstraintSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("space"),
		        JAVA_BOOLEAN.withName("autoDetectPoint"),
		        MemoryLayout.paddingLayout(3),
		        Vec3.LAYOUT().withName("point1"),
		        Vec3.LAYOUT().withName("axisX1"),
		        Vec3.LAYOUT().withName("axisY1"),
		        Vec3.LAYOUT().withName("point2"),
		        Vec3.LAYOUT().withName("axisX2"),
		        Vec3.LAYOUT().withName("axisY2")	
			).withName("JPH_FixedConstraintSettings");
		
		JPH_FIXED_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_FixedConstraintSettings_Init", ADDRESS);
		//@formatter:on

		SPACE = varHandle(LAYOUT, "space");
		AUTO_DETECT_POINT = varHandle(LAYOUT, "autoDetectPoint");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		POINT_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
		AXIS_X1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX1"));
		AXIS_Y1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY1"));
		POINT_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
		AXIS_X2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisX2"));
		AXIS_Y2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("axisY2"));
	}

	public FixedConstraintSettings() {
		this(Arena.ofAuto());
	}

	public FixedConstraintSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphFixedConstraintSettings = segment;

		point1 = new Vec3(segment.asSlice(POINT_1_OFFSET, Vec3.LAYOUT()));
		axisX1 = new Vec3(segment.asSlice(AXIS_X1_OFFSET, Vec3.LAYOUT()));
		axisY1 = new Vec3(segment.asSlice(AXIS_Y1_OFFSET, Vec3.LAYOUT()));
		point2 = new Vec3(segment.asSlice(POINT_2_OFFSET, Vec3.LAYOUT()));
		axisX2 = new Vec3(segment.asSlice(AXIS_X2_OFFSET, Vec3.LAYOUT()));
		axisY2 = new Vec3(segment.asSlice(AXIS_Y2_OFFSET, Vec3.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_FIXED_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphFixedConstraintSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Jolt: Cannot initialize fixed constraint settings: " + className);
		}
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphFixedConstraintSettings);

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
		SPACE.set(jphFixedConstraintSettings, space.id());
	}

	/**
	 * When space is WorldSpace point1 and point2 can be automatically calculated
	 * based on the positions of the bodies when the constraint is created (they
	 * will be fixated in their current relative position/orientation). Set this to
	 * false if you want to supply the attachment points yourself.
	 */
	public void setAutoDetectPoint(boolean autoDetect) {
		AUTO_DETECT_POINT.set(jphFixedConstraintSettings, autoDetect);
	}

	/**
	 * @see #setAutoDetectPoint(boolean)
	 */
	public boolean getAutoDetectPoint() {
		return (boolean) AUTO_DETECT_POINT.get(jphFixedConstraintSettings);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace)
	 */
	public void setPoint1(float x, float y, float z) {
		point1.set(x, y, z);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace)
	 */
	public void setPoint1(Vector3f point) {
		this.point1.set(point);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace)
	 */
	public Vector3f getPoint1(Vector3f target) {
		return point1.get(target);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace)
	 */
	public Vector3f getPoint1() {
		return getPoint1(new Vector3f());
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

	public MemorySegment memorySegment() {
		return jphFixedConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}