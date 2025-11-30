package volucris.engine.physics.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.MathUtils;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Settings struct with settings for ExtendedUpdate.
 */
public final class ExtendedUpdateSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle WALK_STAIRS_MIN_STEP_FORWARD;
	private static final VarHandle WALK_STAIRS_STEP_FORWARD_TEST;
	private static final VarHandle WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT;

	private static final long STICK_TO_FLOOR_STEP_DOWN_OFFSET;
	private static final long WALK_STAIRS_STEP_UP_OFFSET;
	private static final long WALK_STAIRS_STEP_DOWN_EXTRA_OFFSET;

	private final MemorySegment jphExtendedUpdateSettings;

	private final Vec3 stickToFloorStepDown;
	private final Vec3 walkStairsStepUp;
	private final Vec3 walkStairsStepDownExtra;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        Vec3.LAYOUT().withName("stickToFloorStepDown"),
		        Vec3.LAYOUT().withName("walkStairsStepUp"),
		        JAVA_FLOAT.withName("walkStairsMinStepForward"),
		        JAVA_FLOAT.withName("walkStairsStepForwardTest"),
		        JAVA_FLOAT.withName("walkStairsCosAngleForwardContact"),
		        Vec3.LAYOUT().withName("walkStairsStepDownExtra")
			).withName("JPH_ExtendedUpdateSettings");
		//@formatter:on

		WALK_STAIRS_MIN_STEP_FORWARD = varHandle(LAYOUT, "walkStairsMinStepForward");
		WALK_STAIRS_STEP_FORWARD_TEST = varHandle(LAYOUT, "walkStairsStepForwardTest");
		WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT = varHandle(LAYOUT, "walkStairsCosAngleForwardContact");

		STICK_TO_FLOOR_STEP_DOWN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stickToFloorStepDown"));
		WALK_STAIRS_STEP_UP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("walkStairsStepUp"));
		WALK_STAIRS_STEP_DOWN_EXTRA_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("walkStairsStepDownExtra"));
	}

	public ExtendedUpdateSettings() {
		jphExtendedUpdateSettings = Arena.ofAuto().allocate(LAYOUT);

		long offset = STICK_TO_FLOOR_STEP_DOWN_OFFSET;
		stickToFloorStepDown = new Vec3(jphExtendedUpdateSettings.asSlice(offset, Vec3.LAYOUT()));

		offset = WALK_STAIRS_STEP_UP_OFFSET;
		walkStairsStepUp = new Vec3(jphExtendedUpdateSettings.asSlice(offset, Vec3.LAYOUT()));

		offset = WALK_STAIRS_STEP_DOWN_EXTRA_OFFSET;
		walkStairsStepDownExtra = new Vec3(jphExtendedUpdateSettings.asSlice(offset, Vec3.LAYOUT()));

		setStickToFloorStepDown(0, -0.5f, 0);
		setWalkStairsStepUp(0, 0.4f, 0);
		setWalkStairsMinStepForward(0.02f);
		setWalkStairsStepForwardTest(0.15f);
		setWalkStairsCosAngleForwardContact(MathUtils.cosDegrees(75));
		setWalkStairsStepDownExtra(0, 0, 0);
	}

	/**
	 * See
	 * {@link CharacterVirtual#walkStairs(float, Vector3f, Vector3f, Vector3f, Vector3f, int, volucris.engine.physics.jolt.physicsSystem.PhysicsSystem, volucris.engine.physics.jolt.filter.BodyFilter, volucris.engine.physics.jolt.filter.ShapeFilter)
	 * walkStairs} stepForward parameter. Note that the parameter only indicates a
	 * magnitude, direction is taken from current velocity.
	 */
	public void setWalkStairsMinStepForward(float value) {
		WALK_STAIRS_MIN_STEP_FORWARD.set(jphExtendedUpdateSettings, value);
	}

	/**
	 * @see #setWalkStairsMinStepForward(float)
	 */
	public float getWalkStairsMinStepForward() {
		return (float) WALK_STAIRS_MIN_STEP_FORWARD.get(jphExtendedUpdateSettings);
	}

	/**
	 * See
	 * {@link CharacterVirtual#walkStairs(float, Vector3f, Vector3f, Vector3f, Vector3f, int, volucris.engine.physics.jolt.physicsSystem.PhysicsSystem, volucris.engine.physics.jolt.filter.BodyFilter, volucris.engine.physics.jolt.filter.ShapeFilter)
	 * walkStairs} stepForwardTest parameter. Note that the parameter only indicates
	 * a magnitude, direction is taken from current velocity.
	 */
	public void setWalkStairsStepForwardTest(float value) {
		WALK_STAIRS_STEP_FORWARD_TEST.set(jphExtendedUpdateSettings, value);
	}

	/**
	 * @see #setWalkStairsStepForwardTest(float)
	 */
	public float getWalkStairsStepForwardTest() {
		return (float) WALK_STAIRS_STEP_FORWARD_TEST.get(jphExtendedUpdateSettings);
	}

	/**
	 * Cos(angle) where angle is the maximum angle between the ground normal in the
	 * horizontal plane and the character forward vector where we're willing to
	 * adjust the step forward test towards the contact normal.
	 */
	public void setWalkStairsCosAngleForwardContact(float value) {
		WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT.set(jphExtendedUpdateSettings, value);
	}

	/**
	 * @see #setWalkStairsCosAngleForwardContact(float)
	 */
	public float getWalkStairsCosAngleForwardContact() {
		return (float) WALK_STAIRS_COS_ANGLE_FORWARD_CONTACT.get(jphExtendedUpdateSettings);
	}

	/**
	 * See
	 * {@link CharacterVirtual#stickToFloor(Vector3f, int, volucris.engine.physics.jolt.physicsSystem.PhysicsSystem, volucris.engine.physics.jolt.filter.BodyFilter, volucris.engine.physics.jolt.filter.ShapeFilter)
	 * stickToFloor} stepDown parameter. Can be zero to turn off.
	 */
	public void setStickToFloorStepDown(float x, float y, float z) {
		stickToFloorStepDown.set(x, y, z);
	}

	/**
	 * @see #setStickToFloorStepDown(float, float, float)
	 */
	public void setStickToFloorStepDown(Vector3f vector) {
		stickToFloorStepDown.set(vector);
	}

	/**
	 * @see #setStickToFloorStepDown(float, float, float)
	 */
	public Vector3f getStickToFloorStepDown(Vector3f target) {
		return stickToFloorStepDown.get(target);
	}

	/**
	 * @see #setStickToFloorStepDown(float, float, float)
	 */
	public Vector3f getStickToFloorStepDown() {
		return getStickToFloorStepDown(new Vector3f());
	}

	/**
	 * See
	 * {@link CharacterVirtual#walkStairs(float, Vector3f, Vector3f, Vector3f, Vector3f, int, volucris.engine.physics.jolt.physicsSystem.PhysicsSystem, volucris.engine.physics.jolt.filter.BodyFilter, volucris.engine.physics.jolt.filter.ShapeFilter)
	 * walkStairs} stepUp parameter. Can be zero to turn off.
	 */
	public void setWalkStairsStepUp(float x, float y, float z) {
		walkStairsStepUp.set(x, y, z);
	}

	/**
	 * @see #setWalkStairsStepUp(float, float, float)
	 */
	public void setWalkStairsStepUp(Vector3f vector) {
		walkStairsStepUp.set(vector);
	}

	/**
	 *  @see #setWalkStairsStepUp(float, float, float)
	 */
	public Vector3f getWalkStairsStepUp(Vector3f target) {
		return walkStairsStepUp.get(target);
	}

	/**
	 *  @see #setWalkStairsStepUp(float, float, float)
	 */
	public Vector3f getWalkStairsStepUp() {
		return getWalkStairsStepUp(new Vector3f());
	}

	/**
	 * See {@link CharacterVirtual#walkStairs(float, Vector3f, Vector3f, Vector3f, Vector3f, int, volucris.engine.physics.jolt.physicsSystem.PhysicsSystem, volucris.engine.physics.jolt.filter.BodyFilter, volucris.engine.physics.jolt.filter.ShapeFilter)
	 * walkStairs} stepDownExtra. 
	 */
	public void setWalkStairsStepDownExtra(float x, float y, float z) {
		walkStairsStepDownExtra.set(x, y, z);
	}

	/**
	 * @see #setWalkStairsStepDownExtra(float, float, float)
	 */
	public void setWalkStairsStepDownExtra(Vector3f vector) {
		walkStairsStepDownExtra.set(vector);
	}

	/**
	 * @see #setWalkStairsStepDownExtra(float, float, float)
	 */
	public Vector3f getWalkStairsStepDownExtra(Vector3f target) {
		return walkStairsStepDownExtra.get(target);
	}

	/**
	 * @see #setWalkStairsStepDownExtra(float, float, float)
	 */
	public Vector3f getWalkStairsStepDownExtra() {
		return getWalkStairsStepDownExtra(new Vector3f());
	}

	public MemorySegment memorySegment() {
		return jphExtendedUpdateSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
