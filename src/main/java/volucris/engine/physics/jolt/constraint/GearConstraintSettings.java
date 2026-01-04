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
 * 
 */
public final class GearConstraintSettings extends TwoBodyConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_GEAR_CONSTRAINT_SETTINGS_INIT;

	private static final VarHandle SPACE;
	private static final VarHandle RATIO;

	private static final long BASE_OFFSET;
	private static final long HINGE_AXIS_1_OFFSET;
	private static final long HINGE_AXIS_2_OFFSET;

	private final MemorySegment jphGearConstraintSettings;

	private final Vec3 hingeAxis1;
	private final Vec3 hingeAxis2;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        ConstraintSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("space"),
		        Vec3.LAYOUT().withName("hingeAxis1"),
		        Vec3.LAYOUT().withName("hingeAxis2"),
		        JAVA_FLOAT.withName("ratio")
			).withName("JPH_GearConstraintSettings");
		
		JPH_GEAR_CONSTRAINT_SETTINGS_INIT = downcallHandleVoid("JPH_GearConstraintSettings_Init", ADDRESS);
		//@formatter:on

		SPACE = varHandle(LAYOUT, "sapce");
		RATIO = varHandle(LAYOUT, "ratio");

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		HINGE_AXIS_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hingeAxis1"));
		HINGE_AXIS_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hingeAxis2"));
	}

	public GearConstraintSettings() {
		this(Arena.ofAuto());
	}
	
	public GearConstraintSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, ConstraintSettings.LAYOUT()));

		jphGearConstraintSettings = segment;

		hingeAxis1 = new Vec3(segment.asSlice(HINGE_AXIS_1_OFFSET, Vec3.LAYOUT()));
		hingeAxis2 = new Vec3(segment.asSlice(HINGE_AXIS_2_OFFSET, Vec3.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_GEAR_CONSTRAINT_SETTINGS_INIT;
			method.invokeExact(jphGearConstraintSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot initialize gear constraint settings.");
		}
	}

	/**
	 * This determines in which space the constraint is setup, all properties below
	 * should be in the specified space.
	 */
	public ConstraintSpace getSpace() {
		int value = (int) SPACE.get(jphGearConstraintSettings);

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
		SPACE.set(jphGearConstraintSettings, space.id());
	}

	/**
	 * Ratio between both gears.
	 */
	public void setRatio(float ratio) {
		RATIO.set(jphGearConstraintSettings, ratio);
	}

	/**
	 * Ratio between both gears.
	 */
	public float getRatio() {
		return (float) RATIO.get(jphGearConstraintSettings);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace). 
	 */
	public void setHingeAxis1(float x, float y, float z) {
		hingeAxis1.set(x, y, z);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace). 
	 */
	public void setHingeAxis1(Vector3f axis) {
		hingeAxis1.set(axis);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace). 
	 */
	public Vector3f getHingeAxis1(Vector3f target) {
		return hingeAxis1.get(target);
	}

	/**
	 * Body 1 constraint reference frame (space determined by mSpace). 
	 */
	public Vector3f getHingeAxis1() {
		return getHingeAxis1(new Vector3f());
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace) 
	 */
	public void setHingeAxis2(float x, float y, float z) {
		hingeAxis2.set(x, y, z);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace) 
	 */
	public void setHingeAxis2(Vector3f axis) {
		hingeAxis2.set(axis);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace) 
	 */
	public Vector3f getHingeAxis2(Vector3f target) {
		return hingeAxis2.get(target);
	}

	/**
	 * Body 2 constraint reference frame (space determined by mSpace) 
	 */
	public Vector3f getHingeAxis2() {
		return getHingeAxis2(new Vector3f());
	}

	public MemorySegment memorySegment() {
		return jphGearConstraintSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}