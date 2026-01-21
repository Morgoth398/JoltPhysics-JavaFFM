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
 * Point constraint settings, used to create a point constraint.
 */
public final class PointConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_POINT_CONSTRAINT_SETTINGS_INIT;

	private static final VarHandle SPACE;

	private static final long BASE_OFFSET;
	private static final long POINT_1_OFFSET;
	private static final long POINT_2_OFFSET;

	private final MemorySegment jphPointConstraintSettings;

	private final Vec3 point1;
	private final Vec3 point2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ConstraintSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("space"),
		        Vec3.LAYOUT().withName("point1"),
		        Vec3.LAYOUT().withName("point2"),
		        MemoryLayout.paddingLayout(4)
			).withName("JPH_PointConstraintSettings");
		
		JPH_POINT_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_PointConstraintSettings_Init", ADDRESS);
		//@formatter:on

		SPACE = varHandle(LAYOUT, "base");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		POINT_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point1"));
		POINT_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point2"));
	}

	public PointConstraintSettings() {
		this(Arena.ofAuto());
	}

	public PointConstraintSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphPointConstraintSettings = segment;

		point1 = new Vec3(segment.asSlice(POINT_1_OFFSET, Vec3.LAYOUT()));
		point2 = new Vec3(segment.asSlice(POINT_2_OFFSET, Vec3.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_POINT_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphPointConstraintSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize point constraint settings: " + className);
		}
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphPointConstraintSettings);

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
		SPACE.set(jphPointConstraintSettings, space.id());
	}

	/**
	 * Body 1 constraint position (space determined by mSpace).
	 */
	public void setPoint1(float x, float y, float z) {
		point1.set(x, y, z);
	}

	/**
	 * Body 1 constraint position (space determined by mSpace).
	 */
	public void setPoint1(Vector3f point) {
		this.point1.set(point);
	}

	/**
	 * Body 1 constraint position (space determined by mSpace).
	 */
	public Vector3f getPoint1(Vector3f target) {
		return point1.get(target);
	}

	/**
	 * Body 1 constraint position (space determined by mSpace).
	 */
	public Vector3f getPoint1() {
		return getPoint1(new Vector3f());
	}

	/**
	 * Body 2 constraint position (space determined by mSpace). Note: Normally you
	 * would set mPoint1 = mPoint2 if the bodies are already placed how you want to
	 * constrain them (if mSpace = world space).
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
		return jphPointConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}