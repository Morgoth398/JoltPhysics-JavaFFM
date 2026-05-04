package volucris.engine.physics.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.JoltEnums.BackFaceMode;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Contains the configuration of a character.
 */
public final class CharacterVirtualSettings extends CharacterBaseSettings {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SETTINGS_INIT;

	private static final VarHandle ID;
	private static final VarHandle MASS;
	private static final VarHandle MAX_STRENGTH;
	private static final VarHandle BACKFACE_MODE;
	private static final VarHandle PREDICTIVE_CONTACT_DISTANCE;
	private static final VarHandle MAX_COLLISION_ITERATIONS;
	private static final VarHandle MAX_CONSTRAINT_ITERATIONS;
	private static final VarHandle MIN_TIME_REMAINING;
	private static final VarHandle COLLISION_TOLERANCE;
	private static final VarHandle CHARACTER_PADDING;
	private static final VarHandle MAX_NUM_HITS;
	private static final VarHandle HIT_REDUCTION_COS_MAX_ANGLE;
	private static final VarHandle PENETRATION_RECOVERY_SPEED;
	private static final VarHandle INNER_BODY_SHAPE;
	private static final VarHandle INNER_BODY_ID_OVERRIDE;
	private static final VarHandle INNER_BODY_LAYER;

	private static final long BASE_OFFSET;
	private static final long SHAPE_OFFSET_OFFSET;

	private final MemorySegment jphCharacterVirtualSettings;

	private final Vec3 shapeOffset;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        CharacterBaseSettings.LAYOUT().withName("base"),
		        JAVA_INT.withName("ID"),
		        JAVA_FLOAT.withName("mass"),
		        JAVA_FLOAT.withName("maxStrength"),
		        Vec3.LAYOUT().withName("shapeOffset"),
		        JAVA_INT.withName("backFaceMode"),
		        JAVA_FLOAT.withName("predictiveContactDistance"),
		        JAVA_INT.withName("maxCollisionIterations"),
		        JAVA_INT.withName("maxConstraintIterations"),
		        JAVA_FLOAT.withName("minTimeRemaining"),
		        JAVA_FLOAT.withName("collisionTolerance"),
		        JAVA_FLOAT.withName("characterPadding"),
		        JAVA_INT.withName("maxNumHits"),
		        JAVA_FLOAT.withName("hitReductionCosMaxAngle"),
		        JAVA_FLOAT.withName("penetrationRecoverySpeed"),
		        ADDRESS.withName("innerBodyShape"),
		        JAVA_INT.withName("innerBodyIDOverride"),
		        JAVA_INT.withName("innerBodyLayer")
			).withName("JPH_CharacterVirtualSettings");
		
		JPH_CHARACTER_VIRTUAL_SETTINGS_INIT = downcallHandleVoid("JPH_CharacterVirtualSettings_Init", ADDRESS);
		//@formatter:on

		BASE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		SHAPE_OFFSET_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shapeOffset"));

		ID = varHandle(LAYOUT, "ID");
		MASS = varHandle(LAYOUT, "mass");
		MAX_STRENGTH = varHandle(LAYOUT, "maxStrength");
		BACKFACE_MODE = varHandle(LAYOUT, "backFaceMode");
		PREDICTIVE_CONTACT_DISTANCE = varHandle(LAYOUT, "predictiveContactDistance");
		MAX_COLLISION_ITERATIONS = varHandle(LAYOUT, "maxCollisionIterations");
		MAX_CONSTRAINT_ITERATIONS = varHandle(LAYOUT, "maxConstraintIterations");
		MIN_TIME_REMAINING = varHandle(LAYOUT, "minTimeRemaining");
		COLLISION_TOLERANCE = varHandle(LAYOUT, "collisionTolerance");
		CHARACTER_PADDING = varHandle(LAYOUT, "characterPadding");
		MAX_NUM_HITS = varHandle(LAYOUT, "maxNumHits");
		HIT_REDUCTION_COS_MAX_ANGLE = varHandle(LAYOUT, "hitReductionCosMaxAngle");
		PENETRATION_RECOVERY_SPEED = varHandle(LAYOUT, "penetrationRecoverySpeed");
		INNER_BODY_SHAPE = varHandle(LAYOUT, "innerBodyShape");
		INNER_BODY_ID_OVERRIDE = varHandle(LAYOUT, "innerBodyIDOverride");
		INNER_BODY_LAYER = varHandle(LAYOUT, "innerBodyLayer");
	}

	public CharacterVirtualSettings() {
		this(Arena.ofAuto());
	}

	public CharacterVirtualSettings(Arena arena) {
		MemorySegment segment = arena.allocate(LAYOUT);
		super(segment.asSlice(BASE_OFFSET, CharacterBaseSettings.LAYOUT()));

		jphCharacterVirtualSettings = segment;

		shapeOffset = new Vec3(segment.asSlice(SHAPE_OFFSET_OFFSET, Vec3.LAYOUT()));

		init();
	}

	private void init() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SETTINGS_INIT;
			method.invokeExact(jphCharacterVirtualSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize character virtual settings: " + className);
		}
	}

	/**
	 * ID to give to this character. This is used for deterministically sorting and
	 * as an identifier to represent the character in the contact removal callback.
	 */
	public void setId(int id) {
		ID.set(jphCharacterVirtualSettings, id);
	}

	/**
	 * @see #setId(int)
	 */
	public int getId() {
		return (int) ID.get(jphCharacterVirtualSettings);
	}

	/**
	 * Character mass (kg). Used to push down objects with gravity when the
	 * character is standing on top.
	 */
	public void setMass(float mass) {
		MASS.set(jphCharacterVirtualSettings, mass);
	}

	/**
	 * Character mass (kg). Used to push down objects with gravity when the
	 * character is standing on top.
	 */
	public float getMass() {
		return (float) MASS.get(jphCharacterVirtualSettings);
	}

	/**
	 * Maximum force with which the character can push other bodies (N).
	 */
	public void setMaxStrength(float maxStrength) {
		MAX_STRENGTH.set(jphCharacterVirtualSettings, maxStrength);
	}

	/**
	 * Maximum force with which the character can push other bodies (N).
	 */
	public float getMaxStrength() {
		return (float) MAX_STRENGTH.get(jphCharacterVirtualSettings);
	}

	/**
	 * An extra offset applied to the shape in local space. This allows applying an
	 * extra offset to the shape in local space.
	 */
	public void setShapeOffset(float x, float y, float z) {
		shapeOffset.set(x, y, z);
	}

	/**
	 * @see #setShapeOffset(float, float, float)
	 */
	public void setShapeOffset(Vector3f offset) {
		shapeOffset.set(offset);
	}

	/**
	 * An extra offset applied to the shape in local space. This allows applying an
	 * extra offset to the shape in local space.
	 */
	public Vector3f getShapeOffset(Vector3f target) {
		return shapeOffset.get(target);
	}

	/**
	 * @see #getShapeOffset(Vector3f)
	 */
	public Vector3f getShapeOffset() {
		return getShapeOffset(new Vector3f());
	}

	/**
	 * When colliding with back faces, the character will not be able to move
	 * through back facing triangles. Use this if you have triangles that need to
	 * collide on both sides.
	 */
	public void setBackFaceMode(BackFaceMode mode) {
		BACKFACE_MODE.set(jphCharacterVirtualSettings, mode.id());
	}

	/**
	 * @see #setBackFaceMode(BackFaceMode)
	 */
	public BackFaceMode getBackfaceMode() {
		int value = (int) BACKFACE_MODE.get(jphCharacterVirtualSettings);

		for (BackFaceMode mode : BackFaceMode.values()) {
			if (value == mode.id())
				return mode;
		}

		throw new JoltRuntimeException("Wrong back face mode!");
	}

	/**
	 * How far to scan outside of the shape for predictive contacts. A value of 0
	 * will most likely cause the character to get stuck as it cannot properly
	 * calculate a sliding direction anymore. A value that's too high will cause
	 * ghost collisions.
	 */
	public void setPredictiveContactDistance(float value) {
		PREDICTIVE_CONTACT_DISTANCE.set(jphCharacterVirtualSettings, value);
	}

	/**
	 * @see #setPredictiveContactDistance(float)
	 */
	public float getPredictiveContactDistance() {
		return (float) PREDICTIVE_CONTACT_DISTANCE.get(jphCharacterVirtualSettings);
	}

	/**
	 * Max amount of collision loops.
	 */
	public void setMaxCollisionIterations(int maxIterations) {
		MAX_COLLISION_ITERATIONS.set(jphCharacterVirtualSettings, maxIterations);
	}

	/**
	 * Max amount of collision loops.
	 */
	public int getMaxCollisionIterations() {
		return (int) MAX_COLLISION_ITERATIONS.get(jphCharacterVirtualSettings);
	}

	/**
	 * How often to try stepping in the constraint solving.
	 */
	public void setMaxConstraintIterations(int maxIterations) {
		MAX_CONSTRAINT_ITERATIONS.set(jphCharacterVirtualSettings, maxIterations);
	}

	/**
	 * How often to try stepping in the constraint solving.
	 */
	public int getMaxConstraintIterations() {
		return (int) MAX_CONSTRAINT_ITERATIONS.get(jphCharacterVirtualSettings);
	}

	/**
	 * Early out condition: If this much time is left to simulate we are done.
	 */
	public void setMinTimeRemaining(float time) {
		MIN_TIME_REMAINING.set(jphCharacterVirtualSettings, time);
	}

	/**
	 * Early out condition: If this much time is left to simulate we are done.
	 */
	public float getMinTimeRemaining() {
		return (float) MIN_TIME_REMAINING.get(jphCharacterVirtualSettings);
	}

	/**
	 * How far we're willing to penetrate geometry.
	 */
	public void setCollisionTolerance(float tolerance) {
		COLLISION_TOLERANCE.set(jphCharacterVirtualSettings, tolerance);
	}

	/**
	 * How far we're willing to penetrate geometry.
	 */
	public float getCollisionTolerance() {
		return (float) COLLISION_TOLERANCE.get(jphCharacterVirtualSettings);
	}

	/**
	 * How far we try to stay away from the geometry, this ensures that the sweep
	 * will hit as little as possible lowering the collision cost and reducing the
	 * risk of getting stuck.
	 */
	public void setCharacterPadding(float padding) {
		CHARACTER_PADDING.set(jphCharacterVirtualSettings, padding);
	}

	/**
	 * @see #setCharacterPadding(float)
	 */
	public float getCharacterPadding() {
		return (float) CHARACTER_PADDING.get(jphCharacterVirtualSettings);
	}

	/**
	 * Max num hits to collect in order to avoid excess of contact points
	 * collection.
	 */
	public void setMaxNumHits(int maxNumHits) {
		MAX_NUM_HITS.set(jphCharacterVirtualSettings, maxNumHits);
	}

	/**
	 * Max num hits to collect in order to avoid excess of contact points
	 * collection.
	 */
	public int getMaxNumHits() {
		return (int) MAX_NUM_HITS.get(jphCharacterVirtualSettings);
	}

	/**
	 * Cos(angle) where angle is the maximum angle between two hits contact normals
	 * that are allowed to be merged during hit reduction. Default is around 2.5
	 * degrees. Set to -1 to turn off.
	 */
	public void setHitReductionCosMaxAngle(float value) {
		HIT_REDUCTION_COS_MAX_ANGLE.set(jphCharacterVirtualSettings, value);
	}

	/**
	 * @see #setHitReductionCosMaxAngle(float)
	 */
	public float getHitReductionCosMaxAngle() {
		return (float) HIT_REDUCTION_COS_MAX_ANGLE.get(jphCharacterVirtualSettings);
	}

	/**
	 * This value governs how fast a penetration will be resolved, 0 = nothing is
	 * resolved, 1 = everything in one update.
	 */
	public void setPenetrationRecoverySpeed(float value) {
		PENETRATION_RECOVERY_SPEED.set(jphCharacterVirtualSettings, value);
	}

	/**
	 * @see #setPenetrationRecoverySpeed(float)
	 */
	public float getPenetrationRecoverySpeed() {
		return (float) PENETRATION_RECOVERY_SPEED.get(jphCharacterVirtualSettings);
	}

	/**
	 * 
	 * 
	 * This character can optionally have an inner rigid body. This rigid body can
	 * be used to give the character presence in the world. When set it means that:
	 * 
	 * <ul>
	 * <li>Regular collision checks (e.g. NarrowPhaseQuery.CastRay) will collide
	 * with the rigid body (they cannot collide with CharacterVirtual since it is
	 * not added to the broad phase)
	 * <li>Regular contact callbacks will be called through the ContactListener
	 * (next to the ones that will be passed to the CharacterContactListener)
	 * <li>Fast moving objects of motion quality LinearCast will not be able to pass
	 * through the CharacterVirtual in 1 time step
	 * </ul>
	 */
	public void setInnerBodyShape(Shape shape) {
		INNER_BODY_SHAPE.set(jphCharacterVirtualSettings, shape.memorySegment());
	}

	/**
	 * @see #setInnerBodyShape(Shape)
	 */
	public Shape getInnerBodyShape() {
		MemorySegment segment = (MemorySegment) INNER_BODY_SHAPE.get(jphCharacterVirtualSettings);

		if (segment.equals(MemorySegment.NULL))
			return null;

		Shape shape = Jolt.getShape(segment.address());
		if (shape != null)
			return shape;

		return new Shape(segment, false);
	}

	/**
	 * For a deterministic simulation, it is important to have a deterministic body
	 * ID. When set and when mInnerBodyShape is specified, the inner body will be
	 * created with this specified ID instead of a generated ID.
	 */
	public void setInnerBodyIdOverride(int id) {
		INNER_BODY_ID_OVERRIDE.set(jphCharacterVirtualSettings, id);
	}

	/**
	 * @see #setInnerBodyIdOverride(int)
	 */
	public int getInnerBodyIdOverride() {
		return (int) INNER_BODY_ID_OVERRIDE.get(jphCharacterVirtualSettings);
	}

	/**
	 * Layer that the inner rigid body will be added to.
	 */
	public void setInnerBodyLayer(int layer) {
		INNER_BODY_LAYER.set(jphCharacterVirtualSettings, layer);
	}

	/**
	 * Layer that the inner rigid body will be added to.
	 */
	public int getInnerBodyLayer() {
		return (int) INNER_BODY_LAYER.get(jphCharacterVirtualSettings);
	}

	public MemorySegment memorySegment() {
		return jphCharacterVirtualSettings;
	}

}