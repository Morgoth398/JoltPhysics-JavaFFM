package volucris.engine.physics.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.JoltEnums.Activation;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Runtime character object. This object usually represents the player or a
 * humanoid AI. It uses a single rigid body, usually with a capsule shape to
 * simulate movement and collision for the character. The character is a
 * keyframed object, the application controls it by setting the velocity.
 */
public final class Character extends CharacterBase {

	private static final MethodHandle JPH_CHARACTER_CREATE;
	private static final MethodHandle JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM;
	private static final MethodHandle JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM;
	private static final MethodHandle JPH_CHARACTER_ACTIVATE;
	private static final MethodHandle JPH_CHARACTER_POST_SIMULATION;
	private static final MethodHandle JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_CHARACTER_GET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_CHARACTER_SET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_CHARACTER_ADD_LINEAR_VELOCITY;
	private static final MethodHandle JPH_CHARACTER_ADD_IMPULSE;
	private static final MethodHandle JPH_CHARACTER_GET_BODY_ID;
	private static final MethodHandle JPH_CHARACTER_GET_POSITION_AND_ROTATION;
	private static final MethodHandle JPH_CHARACTER_SET_POSITION_AND_ROTATION;
	private static final MethodHandle JPH_CHARACTER_GET_POSITION;
	private static final MethodHandle JPH_CHARACTER_SET_POSITION;
	private static final MethodHandle JPH_CHARACTER_GET_ROTATION;
	private static final MethodHandle JPH_CHARACTER_SET_ROTATION;
	private static final MethodHandle JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION;
	private static final MethodHandle JPH_CHARACTER_GET_WORLD_TRANSFORM;
	private static final MethodHandle JPH_CHARACTER_GET_LAYER;
	private static final MethodHandle JPH_CHARACTER_SET_LAYER;
	private static final MethodHandle JPH_CHARACTER_SET_SHAPE;

	private Mat4 matTmp;

	private Quat quatTmp;

	private Vec3 vecTmp2;

	static {
		//@formatter:off
		JPH_CHARACTER_CREATE = downcallHandle("JPH_Character_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_LONG, ADDRESS);
		JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Character_AddToPhysicsSystem", ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Character_RemoveFromPhysicsSystem", ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_ACTIVATE = downcallHandleVoid("JPH_Character_Activate", ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_POST_SIMULATION = downcallHandleVoid("JPH_Character_PostSimulation", ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
		JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Character_SetLinearAndAngularVelocity", ADDRESS, ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_GetLinearVelocity", ADDRESS, ADDRESS);
		JPH_CHARACTER_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_SetLinearVelocity", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_ADD_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_AddLinearVelocity", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_ADD_IMPULSE = downcallHandleVoid("JPH_Character_AddImpulse", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_BODY_ID = downcallHandle("JPH_Character_GetBodyID", JAVA_INT, ADDRESS);
		JPH_CHARACTER_GET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_Character_GetPositionAndRotation", ADDRESS, ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_SET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_Character_SetPositionAndRotation", ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_POSITION = downcallHandleVoid("JPH_Character_GetPosition", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_SET_POSITION = downcallHandleVoid("JPH_Character_SetPosition", ADDRESS, ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_ROTATION = downcallHandleVoid("JPH_Character_GetRotation", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_SET_ROTATION = downcallHandleVoid("JPH_Character_SetRotation", ADDRESS, ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_Character_GetCenterOfMassPosition", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_Character_GetWorldTransform", ADDRESS, ADDRESS, JAVA_BOOLEAN);
		JPH_CHARACTER_GET_LAYER = downcallHandle("JPH_Character_GetLayer", JAVA_INT, ADDRESS);
		JPH_CHARACTER_SET_LAYER = downcallHandleVoid("JPH_Character_SetLayer", ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_CHARACTER_SET_SHAPE = downcallHandleVoid("JPH_Character_SetShape", ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
		//@formatter:on
	}

	/**
	 * Constructor.
	 * 
	 * @param settings The settings for the character
	 * @param position Initial position for the character
	 * @param rotation Initial rotation for the character (usually only around Y)
	 * @param userData Application specific value
	 * @param system   Physics system that this character will be added to later
	 */
	public Character(CharacterSettings settings, Vector3f position, Quaternionf rotation, long userData,
			PhysicsSystem system) {
		this(settings, position, rotation, userData, system, Arena.ofAuto());
	}

	/**
	 * Constructor.
	 * 
	 * @param settings The settings for the character
	 * @param position Initial position for the character
	 * @param rotation Initial rotation for the character (usually only around Y)
	 * @param userData Application specific value
	 * @param system   Physics system that this character will be added to later
	 */
	public Character(CharacterSettings settings, Vector3f position, Quaternionf rotation, long userData,
			PhysicsSystem system, Arena arena) {
		MemorySegment segment;
		try {
			Vec3 vec = new Vec3(arena, position);
			Quat quat = new Quat(arena, rotation);

			MemorySegment settAddr = settings.memorySegment();
			MemorySegment posAddr = vec.memorySegment();
			MemorySegment rotAddr = quat.memorySegment();
			MemorySegment systemAddr = system.memorySegment();

			MethodHandle method = JPH_CHARACTER_CREATE;
			segment = (MemorySegment) method.invokeExact(settAddr, posAddr, rotAddr, userData, systemAddr);

			vecTmp2 = vec;
			quatTmp = quat;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create character: " + className);
		}
		super(segment, arena, true);

		vecTmp2 = new Vec3(arena);

	}

	/**
	 * Add bodies and constraints to the system and optionally activate the bodies.
	 */
	public void addToPhysicsSystem(Activation activationMode, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM;
			method.invokeExact(jphCharacter, activationMode.id(), lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add to physics system: " + className);
		}
	}

	/**
	 * Remove bodies and constraints from the system.
	 */
	public void removeFromPhysicsSystem(boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM;
			method.invokeExact(jphCharacter, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove from physics system: " + className);
		}
	}

	/**
	 * Wake up the character.
	 */
	public void activate(boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_ACTIVATE;
			method.invokeExact(jphCharacter, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot activate: " + className);
		}
	}

	/**
	 * Needs to be called after every
	 * {@link PhysicsSystem#update(float, int, volucris.engine.physics.jolt.jobSystem.JobSystem)
	 * PhysicsSystem.update}
	 * 
	 * @param maxSeparationDistance Max distance between the floor and the character
	 *                              to still consider the character standing on the
	 *                              floor
	 * @param lockBodies            If the collision query should use the locking
	 *                              body interface (true) or the non locking body
	 *                              interface (false)
	 */
	public void postSimulation(float maxSeparationDistance, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_POST_SIMULATION;
			method.invokeExact(jphCharacter, maxSeparationDistance, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call post simulation: " + className);
		}
	}

	/**
	 * Control the velocity of the character.
	 */
	public void setLinearAndAngularVelocity(Vector3f linearVelocity, Vector3f angularVelocity, boolean lockBodies) {
		try {
			vecTmp.set(linearVelocity);
			vecTmp2.set(angularVelocity);

			MethodHandle method = JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY;
			method.invokeExact(jphCharacter, vecTmp.memorySegment(), vecTmp2.memorySegment(), lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set linear and angular velocity: " + className);
		}
	}

	/**
	 * Get the linear velocity of the character (m / s)
	 */
	public Vector3f getLinearVelocity(Vector3f target) {
		try {
			MethodHandle method = JPH_CHARACTER_GET_LINEAR_VELOCITY;
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
	public void setLinearVelocity(Vector3f velocity, boolean lockBodies) {
		try {
			vecTmp.set(velocity);

			MethodHandle method = JPH_CHARACTER_SET_LINEAR_VELOCITY;
			method.invokeExact(jphCharacter, vecTmp.memorySegment(), lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set linear velocity: " + className);
		}
	}

	/**
	 * Add world space linear velocity to current velocity (m / s)
	 */
	public void addLinearVelocity(Vector3f velocity, boolean lockBodies) {
		try {
			vecTmp.set(velocity);

			MethodHandle method = JPH_CHARACTER_ADD_LINEAR_VELOCITY;
			method.invokeExact(jphCharacter, velocity, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add linear velocity: " + className);
		}
	}

	/**
	 * Add impulse to the center of mass of the character.
	 */
	public void addImpulse(Vector3f impulse, boolean lockBodies) {
		try {
			vecTmp.set(impulse);

			MethodHandle method = JPH_CHARACTER_ADD_IMPULSE;
			method.invokeExact(jphCharacter, vecTmp.memorySegment(), lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add impulse: " + className);
		}
	}

	/**
	 * Get the body associated with this character.
	 */
	public int getBodyID() {
		try {
			MethodHandle method = JPH_CHARACTER_GET_BODY_ID;
			return (int) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get body ID: " + className);
		}
	}

	/**
	 * Get position / rotation of the body.
	 */
	public void getPositionAndRotation(Vector3f position, Quaternionf rotation, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_GET_POSITION_AND_ROTATION;
			method.invokeExact(jphCharacter, vecTmp.memorySegment(), quatTmp.memorySegment(), lockBodies);

			vecTmp.get(position);
			quatTmp.get(rotation);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get position and rotation: " + className);
		}
	}

	/**
	 * Set the position / rotation of the body, optionally activating it.
	 */
	public void setPositionAndRotation(Vector3f pos, Quaternionf rotation, Activation activation, boolean lockBodies) {
		try {
			vecTmp.set(pos);
			quatTmp.set(rotation);

			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment rotAddr = quatTmp.memorySegment();

			MethodHandle method = JPH_CHARACTER_SET_POSITION_AND_ROTATION;
			method.invokeExact(jphCharacter, posAddr, rotAddr, activation.id(), lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set position and rotation: " + className);
		}
	}

	/**
	 * Get the position of the character.
	 */
	public Vector3f getPosition(Vector3f target, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_GET_POSITION;
			method.invokeExact(jphCharacter, vecTmp.memorySegment(), lockBodies);

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get position: " + className);
		}
	}

	/**
	 * Get the position of the character.
	 */
	public Vector3f getPosition(boolean lockBodies) {
		return getPosition(new Vector3f(), lockBodies);
	}

	/**
	 * Set the position of the character, optionally activating it.
	 */
	public void setPosition(Vector3f position, Activation activationMode, boolean lockBodies) {
		try {
			vecTmp.set(position);

			MethodHandle method = JPH_CHARACTER_SET_POSITION;
			method.invokeExact(jphCharacter, vecTmp.memorySegment(), activationMode.id(), lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call setPosition: " + className);
		}
	}

	/**
	 * Get the rotation of the character.
	 */
	public Quaternionf getRotation(Quaternionf target, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_GET_ROTATION;
			method.invokeExact(jphCharacter, quatTmp.memorySegment(), lockBodies);

			return quatTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get rotation: " + className);
		}
	}

	/**
	 * Get the rotation of the character.
	 */
	public Quaternionf getRotation(boolean lockBodies) {
		return getRotation(new Quaternionf(), lockBodies);
	}

	/**
	 * Set the rotation of the character, optionally activating it.
	 */
	public void setRotation(Quaternionf rotation, Activation activationMode, boolean lockBodies) {
		try {
			quatTmp.set(rotation);

			MethodHandle method = JPH_CHARACTER_SET_ROTATION;
			method.invokeExact(jphCharacter, quatTmp.memorySegment(), activationMode.id(), lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set rotation: " + className);
		}
	}

	/**
	 * Position of the center of mass of the underlying rigid body.
	 */
	public Vector3f getCenterOfMassPosition(Vector3f target, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION;
			method.invokeExact(jphCharacter, vecTmp.memorySegment(), lockBodies);

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get center of mass position: " + className);
		}
	}

	/**
	 * Position of the center of mass of the underlying rigid body.
	 */
	public Vector3f getCenterOfMassPosition(boolean lockBodies) {
		return getCenterOfMassPosition(new Vector3f(), lockBodies);
	}

	/**
	 * Calculate the world transform of the character.
	 */
	public Matrix4f getWorldTransform(Matrix4f target, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_GET_WORLD_TRANSFORM;
			method.invokeExact(jphCharacter, matTmp.memorySegment(), lockBodies);

			return matTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get world transform: " + className);
		}
	}

	/**
	 * Calculate the world transform of the character.
	 */
	public Matrix4f getWorldTransform(boolean lockBodies) {
		return getWorldTransform(new Matrix4f(), lockBodies);
	}

	/**
	 * Get the layer of the character.
	 */
	public int getLayer() {
		try {
			MethodHandle method = JPH_CHARACTER_GET_LAYER;
			return (int) method.invokeExact(jphCharacter);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get layer: " + className);
		}
	}

	/**
	 * Update the layer of the character.
	 */
	public void setLayer(int layer, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_SET_LAYER;
			method.invokeExact(jphCharacter, layer, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set layer: " + className);
		}
	}

	/**
	 * Switch the shape of the character (e.g. for stance). When
	 * inMaxPenetrationDepth is not Float.MAX_VALUE, it checks if the new shape
	 * collides before switching shape.
	 */
	public void setShape(Shape shape, float maxPenetrationDepth, boolean lockBodies) {
		try {
			MethodHandle method = JPH_CHARACTER_SET_SHAPE;
			method.invokeExact(jphCharacter, shape.memorySegment(), maxPenetrationDepth, lockBodies);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set shape: " + className);
		}
	}

}