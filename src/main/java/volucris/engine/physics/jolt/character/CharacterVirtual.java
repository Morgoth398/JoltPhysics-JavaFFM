package volucris.engine.physics.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.filter.BodyFilter;
import volucris.engine.physics.jolt.filter.ShapeFilter;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Runtime character object. This object usually represents the player. Contrary
 * to the Character class it doesn't use a rigid body but moves doing collision
 * checks only (hence the name virtual). The advantage of this is that you can
 * determine when the character moves in the frame (usually this has to happen
 * at a very particular point in the frame) but the downside is that other
 * objects don't see this virtual character. To make a CharacterVirtual visible
 * to the simulation, you can optionally create an inner rigid body through
 * {@link CharacterVirtualSettings#setInnerBodyShape(Shape)}. A CharacterVirtual
 * is not tracked by the PhysicsSystem so you need to update it yourself. This
 * also means that a call to PhysicsSystem::SaveState will not save its state,
 * you need to call CharacterVirtual::SaveState yourself.
 */
public final class CharacterVirtual extends CharacterBase {

	private static final MethodHandle JPH_CHARACTER_VIRTUAL_CREATE;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_ID;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_LISTENER;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_POSITION;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_POSITION;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_ROTATION;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_ROTATION;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_MASS;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_MASS;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_USER_DATA;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_USER_DATA;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_UPDATE;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_WALK_STAIRS;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_SHAPE;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_NUM_ACTIVE_CONTACTS;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACT;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_BODY;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH;
	private static final MethodHandle JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_CHARACTER;

	private Mat4 matTmp;

	private Quat quatTmp;

	private Vec3 vecTmp2;
	private Vec3 vecTmp3;
	private Vec3 vecTmp4;

	static {
		//@formatter:off
		JPH_CHARACTER_VIRTUAL_CREATE = downcallHandle("JPH_CharacterVirtual_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_LONG, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_ID = downcallHandle("JPH_CharacterVirtual_GetID", JAVA_INT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_LISTENER = downcallHandleVoid("JPH_CharacterVirtual_SetListener", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION = downcallHandleVoid("JPH_CharacterVirtual_SetCharacterVsCharacterCollision", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_GetLinearVelocity", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_SetLinearVelocity", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_POSITION = downcallHandleVoid("JPH_CharacterVirtual_GetPosition", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_POSITION = downcallHandleVoid("JPH_CharacterVirtual_SetPosition", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_ROTATION = downcallHandleVoid("JPH_CharacterVirtual_GetRotation", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_ROTATION = downcallHandleVoid("JPH_CharacterVirtual_SetRotation", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_CharacterVirtual_GetWorldTransform", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_CharacterVirtual_GetCenterOfMassTransform", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_MASS = downcallHandle("JPH_CharacterVirtual_GetMass", JAVA_FLOAT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_MASS = downcallHandleVoid("JPH_CharacterVirtual_SetMass", ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH = downcallHandle("JPH_CharacterVirtual_GetMaxStrength", JAVA_FLOAT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH = downcallHandleVoid("JPH_CharacterVirtual_SetMaxStrength", ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED = downcallHandle("JPH_CharacterVirtual_GetPenetrationRecoverySpeed", JAVA_FLOAT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED = downcallHandleVoid("JPH_CharacterVirtual_SetPenetrationRecoverySpeed", ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_CharacterVirtual_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_CharacterVirtual_SetEnhancedInternalEdgeRemoval", ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING = downcallHandle("JPH_CharacterVirtual_GetCharacterPadding", JAVA_FLOAT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS = downcallHandle("JPH_CharacterVirtual_GetMaxNumHits", JAVA_INT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS = downcallHandleVoid("JPH_CharacterVirtual_SetMaxNumHits", ADDRESS, JAVA_INT);
		JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE = downcallHandle("JPH_CharacterVirtual_GetHitReductionCosMaxAngle", JAVA_FLOAT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE = downcallHandleVoid("JPH_CharacterVirtual_SetHitReductionCosMaxAngle", ADDRESS, JAVA_FLOAT);
		JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED = downcallHandle("JPH_CharacterVirtual_GetMaxHitsExceeded", JAVA_BOOLEAN, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET = downcallHandleVoid("JPH_CharacterVirtual_GetShapeOffset", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET = downcallHandleVoid("JPH_CharacterVirtual_SetShapeOffset", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_USER_DATA = downcallHandle("JPH_CharacterVirtual_GetUserData", JAVA_LONG, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_USER_DATA = downcallHandleVoid("JPH_CharacterVirtual_SetUserData", ADDRESS, JAVA_LONG);
		JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID = downcallHandle("JPH_CharacterVirtual_GetInnerBodyID", JAVA_INT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES = downcallHandleVoid("JPH_CharacterVirtual_CancelVelocityTowardsSteepSlopes", ADDRESS, ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES = downcallHandleVoid("JPH_CharacterVirtual_StartTrackingContactChanges", ADDRESS);
		JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES = downcallHandleVoid("JPH_CharacterVirtual_FinishTrackingContactChanges", ADDRESS);
		JPH_CHARACTER_VIRTUAL_UPDATE = downcallHandleVoid("JPH_CharacterVirtual_Update", ADDRESS, JAVA_FLOAT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE = downcallHandleVoid("JPH_CharacterVirtual_ExtendedUpdate", ADDRESS, JAVA_FLOAT, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS = downcallHandleVoid("JPH_CharacterVirtual_RefreshContacts", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS = downcallHandle("JPH_CharacterVirtual_CanWalkStairs", JAVA_BOOLEAN, ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_WALK_STAIRS = downcallHandle("JPH_CharacterVirtual_WalkStairs", JAVA_BOOLEAN, ADDRESS, JAVA_FLOAT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR = downcallHandle("JPH_CharacterVirtual_StickToFloor", JAVA_BOOLEAN, ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_UpdateGroundVelocity", ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_SHAPE = downcallHandle("JPH_CharacterVirtual_SetShape", JAVA_BOOLEAN, ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE = downcallHandleVoid("JPH_CharacterVirtual_SetInnerBodyShape", ADDRESS, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_NUM_ACTIVE_CONTACTS = downcallHandle("JPH_CharacterVirtual_GetNumActiveContacts", JAVA_INT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACT = downcallHandleVoid("JPH_CharacterVirtual_GetActiveContact", ADDRESS, JAVA_INT, ADDRESS);
		JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_BODY = downcallHandle("JPH_CharacterVirtual_HasCollidedWithBody", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH = downcallHandle("JPH_CharacterVirtual_HasCollidedWith", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_CHARACTER = downcallHandle("JPH_CharacterVirtual_HasCollidedWithCharacter", JAVA_BOOLEAN, ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected CharacterVirtual(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected CharacterVirtual(MemorySegment segment, Arena arena) {
		super(segment, arena, false);

		Jolt.addCharacterVirtual(segment.address(), this);

		quatTmp = new Quat(arena);
		matTmp = new Mat4(arena);
		vecTmp2 = new Vec3(arena);
		vecTmp3 = new Vec3(arena);
		vecTmp4 = new Vec3(arena);
	}

	/**
	 * Constructor without user data.
	 */
	public CharacterVirtual(CharacterVirtualSettings settings, Vector3f position, Quaternionf rotation,
			PhysicsSystem system, Arena arena) {
		this(settings, position, rotation, 0, system, arena);
	}

	/**
	 * Constructor without user data.
	 */
	public CharacterVirtual(CharacterVirtualSettings settings, Vector3f position, Quaternionf rotation,
			PhysicsSystem system) {
		this(settings, position, rotation, 0, system, Arena.ofAuto());
	}

	/**
	 * Constructor.
	 * 
	 * @param settings The settings for the character
	 * @param position Initial position for the character
	 * @param rotation Initial rotation for the character (usually only around the
	 *                 up-axis)
	 * @param userData Application specific value
	 * @param system   Physics system that this character will be added to
	 */
	public CharacterVirtual(CharacterVirtualSettings settings, Vector3f position, Quaternionf rotation, long userData,
			PhysicsSystem system) {
		this(settings, position, rotation, userData, system, Arena.ofAuto());
	}

	/**
	 * Constructor.
	 * 
	 * @param settings The settings for the character
	 * @param position Initial position for the character
	 * @param rotation Initial rotation for the character (usually only around the
	 *                 up-axis)
	 * @param userData Application specific value
	 * @param system   Physics system that this character will be added to
	 */
	public CharacterVirtual(CharacterVirtualSettings settings, Vector3f position, Quaternionf rotation, long userData,
			PhysicsSystem system, Arena arena) {
		MemorySegment segment;
		try {
			Vec3 vec = new Vec3(arena, position);
			Quat quat = new Quat(arena, rotation);

			MemorySegment settAddr = settings.memorySegment();
			MemorySegment posAddr = vec.memorySegment();
			MemorySegment rotAddr = quat.memorySegment();
			MemorySegment systemAddr = system.memorySegment();

			MethodHandle method = JPH_CHARACTER_VIRTUAL_CREATE;
			segment = (MemorySegment) method.invokeExact(settAddr, posAddr, rotAddr, userData, systemAddr);

			vecTmp2 = vec;
			quatTmp = quat;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create character virtual: " + className);
		}
		super(segment, arena, true);

		Jolt.addCharacterVirtual(segment.address(), this);

		matTmp = new Mat4(arena);
		vecTmp3 = new Vec3(arena);
		vecTmp4 = new Vec3(arena);
	}

	/**
	 * The ID of this character.
	 */
	public int getID() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ID;
			return (int) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get ID: " + className);
		}
	}

	/**
	 * Set the contact listener.
	 */
	public void setListener(CharacterContactListener listener) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_LISTENER;
			method.invokeExact(jphCharacter, listener.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set listener: " + className);
		}
	}

	/**
	 * Set the character vs character collision interface.
	 */
	public void setCharacterVsCharacterCollision(CharacterVsCharacterCollision characterVsCharacterCollision) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION;
			method.invokeExact(jphCharacter, characterVsCharacterCollision.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set character vs character collision: " + className);
		}
	}

	/**
	 * Get the linear velocity of the character (m / s)
	 */
	public Vector3f getLinearVelocity(Vector3f target) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get linear velocity: " + className);
		}
	}

	/**
	 * Get the linear velocity of the character (m / s)
	 */
	public Vector3f getLinearVelocity() {
		return getLinearVelocity(new Vector3f());
	}

	/**
	 * Set the linear velocity of the character (m / s)
	 */
	public void setLinearVelocity(Vector3f velocity) {
		try {
			vecTmp.set(velocity);

			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set linear velocity: " + className);
		}
	}

	/**
	 * Get the position of the character.
	 */
	public Vector3f getPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_POSITION;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get position: " + className);
		}
	}

	/**
	 * Get the position of the character.
	 */
	public Vector3f getPosition() {
		return getPosition(new Vector3f());
	}

	/**
	 * Set the position of the character.
	 */
	public void setPosition(Vector3f position) {
		try {
			vecTmp.set(position);

			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_POSITION;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set position: " + className);
		}
	}

	/**
	 * Get the rotation of the character.
	 */
	public Quaternionf getRotation(Quaternionf target) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ROTATION;
			method.invokeExact(jphCharacter, quatTmp.memorySegment());

			return quatTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get rotation: " + className);
		}
	}

	/**
	 * Get the rotation of the character.
	 */
	public Quaternionf getRotation() {
		return getRotation(new Quaternionf());
	}

	/**
	 * Set the rotation of the character.
	 */
	public void setRotation(Quaternionf rotation) {
		try {
			quatTmp.set(rotation);

			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_ROTATION;
			method.invokeExact(jphCharacter, quatTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set rotation: " + className);
		}
	}

	/**
	 * Calculate the world transform of the character.
	 */
	public Matrix4f getWorldTransform(Matrix4f target) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM;
			method.invokeExact(jphCharacter, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get world transform: " + className);
		}
	}

	/**
	 * Calculate the world transform of the character.
	 */
	public Matrix4f getWorldTransform() {
		return getWorldTransform(new Matrix4f());
	}

	/**
	 * Calculates the transform for this character's center of mass.
	 */
	public Matrix4f getCenterOfMassTransform(Matrix4f target) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM;
			method.invokeExact(jphCharacter, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get center of mass transform: " + className);
		}
	}

	/**
	 * Calculates the transform for this character's center of mass.
	 */
	public Matrix4f getCenterOfMassTransform() {
		return getCenterOfMassTransform(new Matrix4f());
	}

	/**
	 * Character mass (kg)
	 */
	public float getMass() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MASS;
			return (float) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get mass: " + className);
		}
	}

	/**
	 * Character mass (kg)
	 */
	public void setMass(float mass) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MASS;
			method.invokeExact(jphCharacter, mass);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set mass: " + className);
		}
	}

	/**
	 * Maximum force with which the character can push other bodies (N)
	 */
	public float getMaxStrength() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH;
			return (float) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max strength: " + className);
		}
	}

	/**
	 * Maximum force with which the character can push other bodies (N)
	 */
	public void setMaxStrength(float maxStrength) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH;
			method.invokeExact(jphCharacter, maxStrength);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set max strength: " + className);
		}
	}

	/**
	 * This value governs how fast a penetration will be resolved, 0 = nothing is
	 * resolved, 1 = everything in one update.
	 */
	public float getPenetrationRecoverySpeed() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED;
			return (float) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get penetration recovery speed: " + className);
		}
	}

	/**
	 * This value governs how fast a penetration will be resolved, 0 = nothing is
	 * resolved, 1 = everything in one update.
	 */
	public void setPenetrationRecoverySpeed(float value) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED;
			method.invokeExact(jphCharacter, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set penetration recovery speed: " + className);
		}
	}

	/**
	 * @see #setEnhancedInternalEdgeRemoval(boolean)
	 */
	public boolean getEnhancedInternalEdgeRemoval() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
			return (boolean) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get enhanced internal edge removal: " + className);
		}
	}

	/**
	 * Set to indicate that extra effort should be made to try to remove ghost
	 * contacts (collisions with internal edges of a mesh). This is more expensive
	 * but makes bodies move smoother over a mesh with convex edges.
	 */
	public void setEnhancedInternalEdgeRemoval(boolean value) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
			method.invokeExact(jphCharacter, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set enhanced internal edge removal: " + className);
		}
	}

	/**
	 * Character padding.
	 */
	public float getCharacterPadding() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING;
			return (float) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get character padding: " + className);
		}
	}

	/**
	 * Max num hits to collect in order to avoid excess of contact points
	 * collection.
	 */
	public int getMaxNumHits() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS;
			return (int) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max um hits: " + className);
		}
	}

	/**
	 * Max num hits to collect in order to avoid excess of contact points
	 * collection.
	 */
	public void setMaxNumHits(int maxNumHits) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS;
			method.invokeExact(jphCharacter, maxNumHits);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set max num hits: " + className);
		}
	}

	/**
	 * @see #setHitReductionCosMaxAngle(float)
	 */
	public float getHitReductionCosMaxAngle() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE;
			return (float) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get hit reduction cos max angle: " + className);
		}
	}

	/**
	 * Cos(angle) where angle is the maximum angle between two hits contact normals
	 * that are allowed to be merged during hit reduction. Default is around 2.5
	 * degrees. Set to -1 to turn off.
	 */
	public void setHitReductionCosMaxAngle(float value) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE;
			method.invokeExact(jphCharacter, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set hit reduction cos max angle: " + className);
		}
	}

	/**
	 * Returns if we exceeded the maximum number of hits during the last collision
	 * check and had to discard hits based on distance. This can be used to find
	 * areas that have too complex geometry for the character to navigate properly.
	 * To solve you can either increase the max number of hits or simplify the
	 * geometry. Note that the character simulation will try to do its best to
	 * select the most relevant contacts to avoid the character from getting stuck.
	 */
	public boolean getMaxHitsExceeded() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED;
			return (boolean) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max hits exceeded: " + className);
		}
	}

	/**
	 * An extra offset applied to the shape in local space. This allows applying an
	 * extra offset to the shape in local space. Note that setting it on the fly can
	 * cause the shape to teleport into collision.
	 */
	public Vector3f getShapeOffset(Vector3f target) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get shape offset: " + className);
		}
	}

	/**
	 * @see #getShapeOffset(Vector3f)
	 */
	public Vector3f getShapeOffset() {
		return getShapeOffset(new Vector3f());
	}

	/**
	 * @see #getShapeOffset(Vector3f)
	 */
	public void setShapeOffset(Vector3f offset) {
		try {
			vecTmp.set(offset);

			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET;
			method.invokeExact(jphCharacter, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set shape offset: " + className);
		}
	}

	/**
	 * Access to the user data, can be used for anything by the application.
	 */
	public long getUserData() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_USER_DATA;
			return (long) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get user data: " + className);
		}
	}

	/**
	 * Set the user data, can be used for anything by the application.
	 */
	public void setUserData(long userData) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_USER_DATA;
			method.invokeExact(jphCharacter, userData);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set user data: " + className);
		}
	}

	/**
	 * Optional inner rigid body that proxies the character in the world. Can be
	 * used to update body properties.
	 */
	public int getInnerBodyID() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID;
			return (int) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get inner bodyID: " + className);
		}
	}

	/**
	 * This function can be called prior to calling
	 * {@link #update(float, int, PhysicsSystem, BodyFilter, ShapeFilter) Update()}
	 * to convert a desired velocity into a velocity that won't make the character
	 * move further onto steep slopes. This velocity can then be set on the
	 * character using {@link #setLinearVelocity(Vector3f) SetLinearVelocity()}.
	 * 
	 * @param desiredVelocity Velocity to clamp against steep walls
	 */
	public Vector3f cancelVelocityTowardsSteepSlopes(Vector3f desiredVelocity, Vector3f target) {
		try {
			vecTmp.set(desiredVelocity);

			MethodHandle method = JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES;
			method.invokeExact(jphCharacter, vecTmp.memorySegment(), vecTmp2.memorySegment());

			return vecTmp2.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot cancel velocity towards steep slopes: " + className);
		}
	}

	/**
	 * @see #cancelVelocityTowardsSteepSlopes(Vector3f, Vector3f)
	 */
	public Vector3f cancelVelocityTowardsSteepSlopes(Vector3f desiredVelocity) {
		return cancelVelocityTowardsSteepSlopes(desiredVelocity, new Vector3f());
	}

	/**
	 * This function is internally called by Update, WalkStairs, StickToFloor and
	 * ExtendedUpdate and is responsible for tracking if contacts are added,
	 * persisted or removed. If you want to do multiple operations on a character
	 * (e.g. first Update then WalkStairs), you can surround the code with a
	 * StartTrackingContactChanges and FinishTrackingContactChanges pair to only
	 * receive a single callback per contact on the CharacterContactListener. If you
	 * don't do this then you could for example receive a contact added callback
	 * during the Update and a contact persisted callback during WalkStairs.
	 */
	public void startTrackingContactChanges() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES;
			method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot start tracking contact changes: " + className);
		}
	}

	/**
	 * This call triggers contact removal callbacks and is used in conjunction with
	 * StartTrackingContactChanges.
	 */
	public void finishTrackingContactChanges() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES;
			method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot finish tracking contact changes: " + className);
		}
	}

	/**
	 * This is the main update function. It moves the character according to its
	 * current velocity (the character is similar to a kinematic body in the sense
	 * that you set the velocity and the character will follow unless collision is
	 * blocking the way). Note it's your own responsibility to apply gravity to the
	 * character velocity! Different surface materials (like ice) can be emulated by
	 * getting the ground material and adjusting the velocity and/or the max slope
	 * angle accordingly every frame.
	 * 
	 * @param deltaTime   Time step to simulate.
	 * @param layer       The broad phase layer
	 * @param system      The physics system
	 * @param bodyFilter  Filter that is used to check if a character collides with
	 *                    a body.
	 * @param shapeFilter Filter that is used to check if a character collides with
	 *                    a subshape.
	 */
	public void update(float deltaTime, int layer, PhysicsSystem system, BodyFilter bodyFilter,
			ShapeFilter shapeFilter) {
		try {
			MemorySegment charAddr = jphCharacter;
			MemorySegment systemAddr = system.memorySegment();
			MemorySegment bodyFilterAddr = bodyFilter.memorySegment();
			MemorySegment shapeFilterAddr = shapeFilter.memorySegment();

			MethodHandle method = JPH_CHARACTER_VIRTUAL_UPDATE;
			method.invokeExact(charAddr, deltaTime, layer, systemAddr, bodyFilterAddr, shapeFilterAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call update: " + className);
		}
	}

	/**
	 * This function combines Update, StickToFloor and WalkStairs. This function
	 * serves as an example of how these functions could be combined. Before
	 * calling, call SetLinearVelocity to update the horizontal/vertical speed of
	 * the character, typically this is:
	 * <ul>
	 * <li>When on OnGround and not moving away from ground: velocity =
	 * GetGroundVelocity() + horizontal speed as input by player + optional vertical
	 * jump velocity + delta time * gravity
	 * <li>Else: velocity = current vertical velocity + horizontal speed as input by
	 * player + delta time * gravity
	 * </ul>
	 * 
	 * @param deltaTime   Time step to simulate.
	 * @param settings    A structure containing settings for the algorithm.
	 * @param layer       The broad phase layer
	 * @param system      The physics system
	 * @param bodyFilter  Filter that is used to check if a character collides with
	 *                    a body.
	 * @param shapeFilter Filter that is used to check if a character collides with
	 *                    a subshape.
	 */
	public void extendedUpdate(float deltaTime, ExtendedUpdateSettings settings, int layer, PhysicsSystem system,
			BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {
			MemorySegment charAddr = jphCharacter;
			MemorySegment settAddr = settings.memorySegment();
			MemorySegment systemAddr = system.memorySegment();
			MemorySegment bodyFilterAddr = bodyFilter.memorySegment();
			MemorySegment shapeFilterAddr = shapeFilter.memorySegment();

			MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE;
			method.invokeExact(charAddr, deltaTime, settAddr, layer, systemAddr, bodyFilterAddr, shapeFilterAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call extended update: " + className);
		}
	}

	/**
	 * This function can be used after a character has teleported to determine the
	 * new contacts with the world.
	 */
	public void refreshContacts(int layer, PhysicsSystem system, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {
			MemorySegment systemAddr = system.memorySegment();
			MemorySegment bodyFilterAddr = bodyFilter.memorySegment();
			MemorySegment shapeFilterAddr = shapeFilter.memorySegment();

			MethodHandle method = JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS;
			method.invokeExact(jphCharacter, layer, systemAddr, bodyFilterAddr, shapeFilterAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot refresh contacts: " + className);
		}
	}

	/**
	 * This function will return true if the character has moved into a slope that
	 * is too steep (e.g. a vertical wall). You would call WalkStairs to attempt to
	 * step up stairs.
	 * 
	 * @param linearVelocity The linear velocity that the player desired. This is
	 *                       used to determine if we're pushing into a step.
	 */
	public boolean canWalkStairs(Vector3f linearVelocity) {
		try {
			vecTmp.set(linearVelocity);

			MethodHandle method = JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS;
			return (boolean) method.invokeExact(jphCharacter, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call can walk stairs: " + className);
		}
	}

	/**
	 * When stair walking is needed, you can call the WalkStairs function to cast
	 * up, forward and down again to try to find a valid position.
	 * 
	 * @param deltaTime       Time step to simulate.
	 * @param stepUp          The direction and distance to step up (this
	 *                        corresponds to the max step height)
	 * @param stepForward     The direction and distance to step forward after the
	 *                        step up
	 * @param stepForwardTest When running at a high frequency, inStepForward can be
	 *                        very small and it's likely that you hit the side of
	 *                        the stairs on the way down. This could produce a
	 *                        normal that violates the max slope angle. If this
	 *                        happens, we test again using this distance from the up
	 *                        position to see if we find a valid slope.
	 * @param stepDownExtra   An additional translation that is added when stepping
	 *                        down at the end. Allows you to step further down than
	 *                        up. Set to zero if you don't want this. Should be in
	 *                        the opposite direction of up.
	 * @param layer           The broad phase layer
	 * @param system          The physics system
	 * @param bodyFilter      Filter that is used to check if a character collides
	 *                        with a body.
	 * @param shapeFilter     Filter that is used to check if a character collides
	 *                        with a subshape.
	 * @return true if the stair walk was successful
	 */
	public boolean walkStairs(float deltaTime, Vector3f stepUp, Vector3f stepForward, Vector3f stepForwardTest,
			Vector3f stepDownExtra, int layer, PhysicsSystem system, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {
			vecTmp.set(stepUp);
			vecTmp2.set(stepForward);
			vecTmp3.set(stepForwardTest);
			vecTmp4.set(stepDownExtra);

			MemorySegment charAddr = jphCharacter;
			MemorySegment upAddr = vecTmp.memorySegment();
			MemorySegment forwardAddr = vecTmp2.memorySegment();
			MemorySegment forwardTestAddr = vecTmp3.memorySegment();
			MemorySegment downAddr = vecTmp4.memorySegment();
			MemorySegment systemAddr = system.memorySegment();
			MemorySegment bodyFilterAddr = bodyFilter.memorySegment();
			MemorySegment shapeFilterAddr = shapeFilter.memorySegment();

			MethodHandle method = JPH_CHARACTER_VIRTUAL_WALK_STAIRS;
			return (boolean) method.invokeExact(charAddr, deltaTime, upAddr, forwardAddr, forwardTestAddr, downAddr,
					layer, systemAddr, bodyFilterAddr, shapeFilterAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call walk stairs: " + className);
		}
	}

	/**
	 * This function can be used to artificially keep the character to the floor.
	 * Normally when a character is on a small step and starts moving horizontally,
	 * the character will lose contact with the floor because the initial vertical
	 * velocity is zero while the horizontal velocity is quite high. To prevent the
	 * character from losing contact with the floor, we do an additional collision
	 * check downwards and if we find the floor within a certain distance, we
	 * project the character onto the floor.
	 * 
	 * @param stepDown    Max amount to project the character downwards (if no floor
	 *                    is found within this distance, the function will return
	 *                    false)
	 * @param layer       The broad phase layer
	 * @param system      The physics system
	 * @param bodyFilter  Filter that is used to check if a character collides with
	 *                    a body
	 * @param shapeFilter Filter that is used to check if a character collides with
	 *                    a subshape
	 * @return True if the character was successfully projected onto the floor
	 */
	public boolean stickToFloor(Vector3f stepDown, int layer, PhysicsSystem system, BodyFilter bodyFilter,
			ShapeFilter shapeFilter) {
		try {
			vecTmp.set(stepDown);

			MemorySegment charAddr = jphCharacter;
			MemorySegment downAddr = vecTmp.memorySegment();
			MemorySegment systemAddr = system.memorySegment();
			MemorySegment bodyFilterAddr = bodyFilter.memorySegment();
			MemorySegment shapeFilterAddr = shapeFilter.memorySegment();

			MethodHandle method = JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR;
			return (boolean) method.invokeExact(charAddr, downAddr, layer, systemAddr, bodyFilterAddr, shapeFilterAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call stick to floor: " + className);
		}
	}

	/**
	 * Use the ground body ID to get an updated estimate of the ground velocity.
	 * This function can be used if the ground body has moved / changed velocity and
	 * you want a new estimate of the ground velocity. It will not perform collision
	 * detection, so is less accurate than RefreshContacts but a lot faster.
	 */
	public void updateGroundVelocity() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY;
			method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot update ground velocity: " + className);
		}
	}

	/**
	 * Switch the shape of the character (e.g. for stance).
	 * 
	 * @param shape               The shape to switch to.
	 * @param maxPenetrationDepth When inMaxPenetrationDepth is not Float.MAX_VALUE,
	 *                            it checks if the new shape collides before
	 *                            switching shape. This is the max penetration we're
	 *                            willing to accept after the switch.
	 * @param layer               The broad phase layer
	 * @param system              The physics system
	 * @param bodyFilter          Filter that is used to check if a character
	 *                            collides with a body.
	 * @param shapeFilter         Filter that is used to check if a character
	 *                            collides with a subshape.
	 * @return Returns true if the switch succeeded.
	 */
	public boolean setShape(Shape shape, float maxPenetrationDepth, int layer, PhysicsSystem system,
			BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {

			float value = maxPenetrationDepth;

			MemorySegment charAddr = jphCharacter;
			MemorySegment shapeAddr = shape.memorySegment();
			MemorySegment systemAddr = system.memorySegment();
			MemorySegment bFiltAddr = bodyFilter.memorySegment();
			MemorySegment sFiltAddr = shapeFilter.memorySegment();

			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_SHAPE;
			return (boolean) method.invokeExact(charAddr, shapeAddr, value, layer, systemAddr, bFiltAddr, sFiltAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setShape: " + className);
		}
	}

	/**
	 * Updates the shape of the inner rigid body. Should be called after a
	 * successful call to SetShape.
	 */
	public void setInnerBodyShape(Shape shape) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE;
			method.invokeExact(jphCharacter, shape.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set inner body shape: " + className);
		}
	}

	/**
	 * Get the number of active contacts.
	 */
	public int getNumActiveContacts() {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_NUM_ACTIVE_CONTACTS;
			return (int) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get num active contacts: " + className);
		}
	}

	/**
	 * Access to the internal list of contacts that the character has found. Note
	 * that only contacts that have their mHadCollision flag set are actual
	 * contacts.
	 */
	public CharacterVirtualContact getActiveContact(int index, CharacterVirtualContact target) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACT;
			method.invokeExact(jphCharacter, index, target.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get active contact: " + className);
		}
	}

	/**
	 * @see #getActiveContact(int, CharacterVirtualContact)
	 */
	public CharacterVirtualContact getActiveContact(int index) {
		return getActiveContact(index, new CharacterVirtualContact());
	}

	/**
	 * heck if the character is currently in contact with or has collided with
	 * another body in the last operation (e.g. Update or WalkStairs)
	 */
	public boolean hasCollidedWithBody(int bodyId) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_BODY;
			return (boolean) method.invokeExact(jphCharacter, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call has collided with body: " + className);
		}
	}

	/**
	 * Check if the character is currently in contact with or has collided with
	 * another character in the last time step (e.g. Update or WalkStairs)
	 */
	public boolean hasCollidedWith(int characterId) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH;
			return (boolean) method.invokeExact(jphCharacter, characterId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call has collided with: " + className);
		}
	}

	/**
	 * Check if the character is currently in contact with or has collided with
	 * another character in the last time step (e.g. Update or WalkStairs)
	 */
	public boolean hasCollidedWithCharacter(CharacterVirtual other) {
		try {
			MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_CHARACTER;
			return (boolean) method.invokeExact(jphCharacter, other.jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call has collided with character: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphCharacter;
	}

}