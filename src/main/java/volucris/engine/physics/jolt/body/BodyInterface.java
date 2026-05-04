package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.JoltEnums.Activation;
import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.physics.jolt.body.BodyEnums.BodyType;
import volucris.engine.physics.jolt.body.BodyEnums.MotionQuality;
import volucris.engine.physics.jolt.body.BodyEnums.MotionType;
import volucris.engine.physics.jolt.filter.BroadPhaseLayerFilter;
import volucris.engine.physics.jolt.filter.CollisionGroup;
import volucris.engine.physics.jolt.filter.ObjectLayerFilter;
import volucris.engine.physics.jolt.math.AABox;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that provides operations on bodies using a body ID. Note that if you
 * need to do multiple operations on a single body, it is more efficient to lock
 * the body once and combine the operations. All quantities are in world space
 * unless otherwise specified.
 */
public final class BodyInterface {

	private static final MethodHandle JPH_BODY_INTERFACE_DESTROY_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_CREATE_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID;
	private static final MethodHandle JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID;
	private static final MethodHandle JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID;
	private static final MethodHandle JPH_BODY_INTERFACE_ASSIGN_BODY_ID;
	private static final MethodHandle JPH_BODY_INTERFACE_ASSIGN_BODY_ID2;
	private static final MethodHandle JPH_BODY_INTERFACE_UNASSIGN_BODY_ID;
	private static final MethodHandle JPH_BODY_INTERFACE_CREATE_SOFT_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID;
	private static final MethodHandle JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID;
	private static final MethodHandle JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_REMOVE_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_REMOVE_AND_DESTROY_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_IS_ADDED;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_BODY_TYPE;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_MOTION_TYPE;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_MOTION_TYPE;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_RESTITUTION;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_RESTITUTION;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_FRICTION;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_FRICTION;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_POSITION;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_POSITION;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_ROTATION;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_ROTATION;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_COLLISION_GROUP;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_COLLISION_GROUP;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_SHAPE;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_SHAPE;
	private static final MethodHandle JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED;
	private static final MethodHandle JPH_BODY_INTERFACE_ACTIVATE_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_ACTIVATE_BODIES;
	private static final MethodHandle JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX;
	private static final MethodHandle JPH_BODY_INTERFACE_DEACTIVATE_BODY;
	private static final MethodHandle JPH_BODY_INTERFACE_DEACTIVATE_BODIES;
	private static final MethodHandle JPH_BODY_INTERFACE_IS_ACTIVE;
	private static final MethodHandle JPH_BODY_INTERFACE_RESET_SLEEP_TIMER;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_OBJECT_LAYER;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_OBJECT_LAYER;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM;
	private static final MethodHandle JPH_BODY_INTERFACE_MOVE_KINEMATIC;
	private static final MethodHandle JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_POINT_VELOCITY;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_FORCE;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_FORCE2;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_TORQUE;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_IMPULSE;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_IMPULSE2;
	private static final MethodHandle JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_MOTION_QUALITY;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_MOTION_QUALITY;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_INVERSE_INERTIA;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_USER_DATA;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_USER_DATA;
	private static final MethodHandle JPH_BODY_INTERFACE_SET_IS_SENSOR;
	private static final MethodHandle JPH_BODY_INTERFACE_IS_SENSOR;
	private static final MethodHandle JPH_BODY_INTERFACE_GET_MATERIAL;
	private static final MethodHandle JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE;

	private final MemorySegment jphBodyInterface;

	private Quat quatTmp;

	private Mat4 matTmp;

	private Vec3 vecTmp;
	private Vec3 vecTmp2;
	private Vec3 vecTmp3;
	private Vec3 vecTmp4;

	static {
		//@formatter:off
		JPH_BODY_INTERFACE_DESTROY_BODY = downcallHandleVoid("JPH_BodyInterface_DestroyBody", ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY = downcallHandle("JPH_BodyInterface_CreateAndAddBody", JAVA_INT, ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_CREATE_BODY = downcallHandle("JPH_BodyInterface_CreateBody", ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID = downcallHandle("JPH_BodyInterface_CreateBodyWithID", ADDRESS, ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID = downcallHandle("JPH_BodyInterface_CreateBodyWithoutID", ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID = downcallHandleVoid("JPH_BodyInterface_DestroyBodyWithoutID", ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_ASSIGN_BODY_ID = downcallHandle("JPH_BodyInterface_AssignBodyID", JAVA_BOOLEAN, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_ASSIGN_BODY_ID2 = downcallHandle("JPH_BodyInterface_AssignBodyID2", JAVA_BOOLEAN, ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_UNASSIGN_BODY_ID = downcallHandle("JPH_BodyInterface_UnassignBodyID", ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_CREATE_SOFT_BODY = downcallHandle("JPH_BodyInterface_CreateSoftBody", ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID = downcallHandle("JPH_BodyInterface_CreateSoftBodyWithID", ADDRESS, ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID = downcallHandle("JPH_BodyInterface_CreateSoftBodyWithoutID", ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY = downcallHandle("JPH_BodyInterface_CreateAndAddSoftBody", JAVA_INT, ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ADD_BODY = downcallHandleVoid("JPH_BodyInterface_AddBody", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BODY_INTERFACE_REMOVE_BODY = downcallHandleVoid("JPH_BodyInterface_RemoveBody", ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_REMOVE_AND_DESTROY_BODY = downcallHandleVoid("JPH_BodyInterface_RemoveAndDestroyBody", ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_IS_ACTIVE = downcallHandle("JPH_BodyInterface_IsActive", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_IS_ADDED = downcallHandle("JPH_BodyInterface_IsAdded", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_BODY_TYPE = downcallHandle("JPH_BodyInterface_GetBodyType", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetLinearVelocity", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetLinearVelocity", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_BodyInterface_GetCenterOfMassPosition", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_GET_MOTION_TYPE = downcallHandle("JPH_BodyInterface_GetMotionType", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_MOTION_TYPE = downcallHandleVoid("JPH_BodyInterface_SetMotionType", ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_BODY_INTERFACE_GET_RESTITUTION = downcallHandle("JPH_BodyInterface_GetRestitution", JAVA_FLOAT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_RESTITUTION = downcallHandleVoid("JPH_BodyInterface_SetRestitution", ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_BODY_INTERFACE_GET_FRICTION = downcallHandle("JPH_BodyInterface_GetFriction", JAVA_FLOAT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_FRICTION = downcallHandleVoid("JPH_BodyInterface_SetFriction", ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_BODY_INTERFACE_SET_POSITION = downcallHandleVoid("JPH_BodyInterface_SetPosition", ADDRESS, JAVA_INT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_POSITION = downcallHandleVoid("JPH_BodyInterface_GetPosition", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_SET_ROTATION = downcallHandleVoid("JPH_BodyInterface_SetRotation", ADDRESS, JAVA_INT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_ROTATION = downcallHandleVoid("JPH_BodyInterface_GetRotation", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_BodyInterface_SetPositionAndRotation", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED = downcallHandleVoid("JPH_BodyInterface_SetPositionAndRotationWhenChanged", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_BodyInterface_GetPositionAndRotation", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetPositionRotationAndVelocity", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_GET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyInterface_GetCollisionGroup", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_SET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyInterface_SetCollisionGroup", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_GET_SHAPE = downcallHandle("JPH_BodyInterface_GetShape", ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_SHAPE = downcallHandleVoid("JPH_BodyInterface_SetShape", ADDRESS, JAVA_INT, ADDRESS, JAVA_BOOLEAN, JAVA_INT);
		JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED = downcallHandleVoid("JPH_BodyInterface_NotifyShapeChanged", ADDRESS, JAVA_INT, ADDRESS, JAVA_BOOLEAN, JAVA_INT);
		JPH_BODY_INTERFACE_ACTIVATE_BODY = downcallHandleVoid("JPH_BodyInterface_ActivateBody", ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ACTIVATE_BODIES = downcallHandleVoid("JPH_BodyInterface_ActivateBodies", ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX = downcallHandleVoid("JPH_BodyInterface_ActivateBodiesInAABox", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_DEACTIVATE_BODY = downcallHandleVoid("JPH_BodyInterface_DeactivateBody", ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_DEACTIVATE_BODIES = downcallHandleVoid("JPH_BodyInterface_DeactivateBodies", ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_RESET_SLEEP_TIMER = downcallHandleVoid("JPH_BodyInterface_ResetSleepTimer", ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_OBJECT_LAYER = downcallHandle("JPH_BodyInterface_GetObjectLayer", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_OBJECT_LAYER = downcallHandleVoid("JPH_BodyInterface_SetObjectLayer", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_BodyInterface_GetWorldTransform", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_BodyInterface_GetCenterOfMassTransform", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_MOVE_KINEMATIC = downcallHandleVoid("JPH_BodyInterface_MoveKinematic", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE = downcallHandle("JPH_BodyInterface_ApplyBuoyancyImpulse", JAVA_BOOLEAN, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetLinearAndAngularVelocity", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetLinearAndAngularVelocity", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_AddLinearVelocity", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_AddLinearAndAngularVelocity", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetAngularVelocity", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetAngularVelocity", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_GET_POINT_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetPointVelocity", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_ADD_FORCE = downcallHandleVoid("JPH_BodyInterface_AddForce", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_ADD_FORCE2 = downcallHandleVoid("JPH_BodyInterface_AddForce2", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_ADD_TORQUE = downcallHandleVoid("JPH_BodyInterface_AddTorque", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE = downcallHandleVoid("JPH_BodyInterface_AddForceAndTorque", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_ADD_IMPULSE = downcallHandleVoid("JPH_BodyInterface_AddImpulse", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_ADD_IMPULSE2 = downcallHandleVoid("JPH_BodyInterface_AddImpulse2", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE = downcallHandleVoid("JPH_BodyInterface_AddAngularImpulse", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_SET_MOTION_QUALITY = downcallHandleVoid("JPH_BodyInterface_SetMotionQuality", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BODY_INTERFACE_GET_MOTION_QUALITY = downcallHandle("JPH_BodyInterface_GetMotionQuality", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_INVERSE_INERTIA = downcallHandleVoid("JPH_BodyInterface_GetInverseInertia", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_BodyInterface_SetGravityFactor", ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR = downcallHandle("JPH_BodyInterface_GetGravityFactor", JAVA_FLOAT, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_BodyInterface_SetUseManifoldReduction", ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_BodyInterface_GetUseManifoldReduction", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_USER_DATA = downcallHandleVoid("JPH_BodyInterface_SetUserData", ADDRESS, JAVA_INT, JAVA_LONG);
		JPH_BODY_INTERFACE_GET_USER_DATA = downcallHandle("JPH_BodyInterface_GetUserData", JAVA_LONG, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_IS_SENSOR = downcallHandleVoid("JPH_BodyInterface_SetIsSensor", ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_BODY_INTERFACE_IS_SENSOR = downcallHandle("JPH_BodyInterface_IsSensor", JAVA_BOOLEAN, ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_MATERIAL = downcallHandle("JPH_BodyInterface_GetMaterial", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE = downcallHandleVoid("JPH_BodyInterface_InvalidateContactCache", ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public BodyInterface(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	public BodyInterface(MemorySegment segment, Arena arena) {
		jphBodyInterface = segment;

		quatTmp = new Quat(arena);

		matTmp = new Mat4(arena);

		vecTmp = new Vec3(arena);
		vecTmp2 = new Vec3(arena);
		vecTmp3 = new Vec3(arena);
		vecTmp4 = new Vec3(arena);
	}

	/**
	 * This method does not exist in jolt physics. It calls
	 * {@link #destroyBody(int)} but also removes the body object from an internal
	 * list.
	 */
	public void destroyBody(Body body) {
		destroyBody(body.getID());
		Jolt.removeBody(body.memorySegment().address());
	}

	/**
	 * Destroy a body. Make sure that you remove the body from the physics system
	 * using {@link BodyInterface#removeBody(int)} before calling this function.
	 */
	public void destroyBody(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_DESTROY_BODY;
			method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy body: " + className);
		}
	}

	/**
	 * Combines CreateBody and AddBody.
	 * 
	 * @return Created body ID or an invalid ID when out of bodies
	 */
	public int createAndAddBody(BodyCreationSettings settings, Activation activation) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY;
			return (int) method.invokeExact(jphBodyInterface, settings.memorySegment(), activation.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create and add body: " + className);
		}
	}

	/**
	 * Create a rigid body.
	 * 
	 * @return Created body or null when out of bodies
	 */
	public Body createBody(BodyCreationSettings settings) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, settings.memorySegment());

			if (segment.equals(MemorySegment.NULL))
				return null;

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create body: " + className);
		}
	}

	/**
	 * Create a rigid body with specified ID. This function can be used if a
	 * simulation is to run in sync between clients or if a simulation needs to be
	 * restored exactly. The ID created on the server can be replicated to the
	 * client and used to create a deterministic simulation.
	 * 
	 * @return Created body or null when the body ID is invalid or a body of the
	 *         same ID already exists.
	 */
	public Body createBodyWithID(int id, BodyCreationSettings settings) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, id, settings.memorySegment());

			if (segment.equals(MemorySegment.NULL))
				return null;

			Body body = Jolt.getBody(segment.address());
			if (body != null)
				return body;

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create body with id: " + className);
		}
	}

	/**
	 * Advanced use only. Creates a rigid body without specifying an ID. This body
	 * cannot be added to the physics system until it has been assigned a body ID.
	 * This can be used to decouple allocation from registering the body. A call to
	 * CreateBodyWithoutID followed by AssignBodyID is equivalent to calling
	 * CreateBodyWithID.
	 */
	public Body createBodyWithoutID(BodyCreationSettings settings) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, settings.memorySegment());

			if (segment.equals(MemorySegment.NULL))
				return null;

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create body without ID: " + className);
		}
	}

	/**
	 * Advanced use only. Destroy a body previously created with CreateBodyWithoutID
	 * that hasn't gotten an ID yet through the AssignBodyID function, or a body
	 * that has had its body ID unassigned through UnassignBodyID. Bodies that have
	 * an ID should be destroyed through {@link #destroyBody(int)}
	 */
	public void destroyBodyWithoutID(Body body) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID;
			method.invokeExact(jphBodyInterface, body.memorySegment());

			Jolt.removeBody(body.memorySegment().address());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy body without ID: " + className);
		}
	}

	/**
	 * Advanced use only. Assigns the next available body ID to a body that was
	 * created using CreateBodyWithoutID. After this call, the body can be added to
	 * the physics system.
	 * 
	 * @return false if the body already has an ID or out of body ids
	 */
	public boolean assignBodyID(Body body) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_ASSIGN_BODY_ID;
			return (boolean) method.invokeExact(jphBodyInterface, body.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot assign body id: " + className);
		}
	}

	/**
	 * Advanced use only. Assigns a body ID to a body that was created using
	 * CreateBodyWithoutID. After this call, the body can be added to the physics
	 * system.
	 * 
	 * @return false if the body already has an ID or out of body ids
	 */
	public boolean assignBodyID(Body body, int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_ASSIGN_BODY_ID2;
			return (boolean) method.invokeExact(jphBodyInterface, body.memorySegment(), bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot assign body id: " + className);
		}
	}

	/**
	 * Advanced use only. Removes the bodyId from its body and returns the body.
	 * Before calling this, the body should have been removed from the physics
	 * system. The body can be destroyed through DestroyBodyWithoutID. This can be
	 * used to decouple deallocation. A call to UnassignBodyID followed by calls to
	 * DestroyBodyWithoutID is equivalent to calling DestroyBody.
	 */
	public Body unassignBodyID(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_UNASSIGN_BODY_ID;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, bodyId);

			Body body = Jolt.getBody(segment.address());
			if (body == null)
				return new Body(segment);
			return body;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot unassing body id: " + className);
		}
	}

	/**
	 * Create a soft body.
	 * 
	 * @return Created body or null when out of bodies
	 */
	public Body createSoftBody(SoftBodyCreationSettings settings) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, settings.memorySegment());

			if (segment.equals(MemorySegment.NULL))
				return null;

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create soft body: " + className);
		}
	}

	/**
	 * Create a soft body with specified ID. See comments at
	 * {@link #createBodyWithID(int, BodyCreationSettings)}.
	 */
	public Body createSoftBodyWithID(int bodyId, SoftBodyCreationSettings settings) {
		try {
			MemorySegment settingsAddr = settings.memorySegment();

			MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, bodyId, settingsAddr);

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create soft body with id: " + className);
		}
	}

	/**
	 * Advanced use only. Creates a body without specifying an ID. See comments at
	 * {@link #createBodyWithoutID(BodyCreationSettings)}
	 */
	public Body createSoftBodyWithoutID(SoftBodyCreationSettings settings) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, settings.memorySegment());

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create soft body without id: " + className);
		}
	}

	/**
	 * Combines CreateSoftBody and AddBody.
	 * 
	 * @return Created body ID or an invalid ID when out of bodies.
	 */
	public int createAndAddSoftBody(SoftBodyCreationSettings settings, Activation activation) {
		try {
			MemorySegment settingsAddr = settings.memorySegment();

			MethodHandle method = JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY;
			return (int) method.invokeExact(jphBodyInterface, settingsAddr, activation.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create amd add soft body: " + className);
		}
	}

	/**
	 * Add body to the physics system. Note that if you need to add multiple bodies,
	 * use the AddBodiesPrepare/AddBodiesFinalize function. Adding many bodies, one
	 * at a time, results in a really inefficient broadphase until
	 * PhysicsSystem::OptimizeBroadPhase is called or when PhysicsSystem::Update
	 * rebuilds the tree! After adding, to get a body by ID use the BodyLockRead or
	 * BodyLockWrite interface!
	 */
	public void addBody(int bodyId, Activation activation) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_ADD_BODY;
			method.invokeExact(jphBodyInterface, bodyId, activation.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add body: " + className);
		}
	}

	/**
	 * Remove body from the physics system. Note that you need to add a body to the
	 * physics system before you can remove it.
	 */
	public void removeBody(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_REMOVE_BODY;
			method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove body: " + className);
		}
	}

	public void removeAndDestroyBody(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_REMOVE_AND_DESTROY_BODY;
			method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove and destroy body: " + className);
		}
	}

	public boolean isActive(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_IS_ACTIVE;
			return (boolean) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot check if body is active: " + className);
		}
	}

	/**
	 * Check if a body has been added to the physics system.
	 */
	public boolean isAdded(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_IS_ADDED;
			return (boolean) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot check if body is added: " + className);
		}
	}

	public BodyType getBodyType(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_BODY_TYPE;
			int value = (int) method.invokeExact(jphBodyInterface, bodyId);

			if (value == BodyType.RIGID_BODY.id())
				return BodyType.RIGID_BODY;
			else
				return BodyType.SOFT_BODY;

		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get body type: " + className);
		}
	}

	public void setLinearVelocity(int bodyId, Vector3f linearVelocity) {
		try {
			vecTmp.set(linearVelocity);

			MethodHandle method = JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set linear velocity: " + className);
		}
	}

	public Vector3f getLinearVelocity(int bodyId, Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get linear velocity: " + className);
		}
	}

	public Vector3f getLinearVelocity(int bodyId) {
		return getLinearVelocity(bodyId, new Vector3f());
	}

	public Vector3f getCenterOfMassPosition(int bodyId, Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get center of mass position: " + className);
		}
	}

	public Vector3f getCenterOfMassPosition(int bodyId) {
		return getCenterOfMassPosition(bodyId, new Vector3f());
	}

	public MotionType getMotionType(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_MOTION_TYPE;
			int type = (int) method.invokeExact(jphBodyInterface, bodyId);

			if (type == MotionType.DYNAMIC.id())
				return MotionType.DYNAMIC;
			else if (type == MotionType.KINEMATIC.id())
				return MotionType.KINEMATIC;
			else
				return MotionType.STATIC;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get motion type: " + className);
		}
	}

	public void setMotionType(int bodyId, MotionType motionType, Activation activation) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_MOTION_TYPE;
			method.invokeExact(jphBodyInterface, bodyId, motionType.id(), activation.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set motion type: " + className);
		}
	}

	public float getRestitution(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_RESTITUTION;
			return (float) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get restitution: " + className);
		}
	}

	public void setRestitution(int bodyId, float restitution) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_RESTITUTION;
			method.invokeExact(jphBodyInterface, bodyId, restitution);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set restitution: " + className);
		}
	}

	public float getFriction(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_FRICTION;
			return (float) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get friction: " + className);
		}
	}

	public void setFriction(int bodyId, float friction) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_FRICTION;
			method.invokeExact(jphBodyInterface, bodyId, friction);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set friction: " + className);
		}
	}

	public void setPosition(int bodyId, Vector3f position, Activation activation) {
		try {
			vecTmp.set(position);

			MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), activation.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set position: " + className);
		}
	}

	public Vector3f getPosition(int bodyId, Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_POSITION;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get position: " + className);
		}
	}

	public Vector3f getPosition(int bodyId) {
		return getPosition(bodyId, new Vector3f());
	}

	public void setRotation(int bodyId, Quaternionf rotation, Activation activation) {
		try {
			quatTmp.set(rotation);

			MethodHandle method = JPH_BODY_INTERFACE_SET_ROTATION;
			method.invokeExact(jphBodyInterface, bodyId, quatTmp.memorySegment(), activation.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set rotation: " + className);
		}
	}

	public Quaternionf getRotation(int bodyId, Quaternionf target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_ROTATION;
			method.invokeExact(jphBodyInterface, bodyId, quatTmp.memorySegment());

			return quatTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get rotation: " + className);
		}
	}

	public Quaternionf getRotation(int bodyId) {
		return getRotation(bodyId, new Quaternionf());
	}

	public void setPositionAndRotation(int bodyId, Vector3f position, Quaternionf rotation, Activation activation) {
		try {
			vecTmp.set(position);
			quatTmp.set(rotation);

			int id = activation.id();

			MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), quatTmp.memorySegment(), id);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set position and rotation: " + className);
		}
	}

	/**
	 * Will only update the position/rotation and activate the body when the
	 * difference is larger than a very small number. This avoids updating the
	 * broadphase/waking up a body when the resulting position/orientation doesn't
	 * really change.
	 */
	public void setPositionAndRotationWhenChanged(int bodyId, Vector3f position, Quaternionf rotation,
			Activation activation) {
		try {
			vecTmp.set(position);
			quatTmp.set(rotation);

			int id = activation.id();

			MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), quatTmp.memorySegment(), id);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set position and rotation when changed: " + className);
		}
	}

	public void getPositionAndRotation(int bodyId, Vector3f posTarget, Quaternionf rotTarget) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), quatTmp.memorySegment());

			vecTmp.get(posTarget);
			quatTmp.get(rotTarget);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get position and rotation: " + className);
		}
	}

	/**
	 * Set the complete motion state of a body. Note that the linear velocity is the
	 * velocity of the center of mass, which may not coincide with the position of
	 * your object, to correct for this:
	 * 𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦𝐶𝑂𝑀=𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦−𝐴𝑛𝑔𝑢𝑙𝑎𝑟𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦×𝑆ℎ𝑎𝑝𝑒𝐶𝑂𝑀
	 */
	public void setPositionRotationAndVelocity(int bodyId, Vector3f position, Quaternionf rotation,
			Vector3f linearVelocity, Vector3f angularVelocity, Activation activation) {
		try {
			vecTmp.set(position);
			quatTmp.set(rotation);
			vecTmp2.set(linearVelocity);
			vecTmp3.set(angularVelocity);

			int id = activation.id();

			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment rotAddr = quatTmp.memorySegment();
			MemorySegment linVAddr = vecTmp2.memorySegment();
			MemorySegment angVAddr = vecTmp3.memorySegment();

			MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, posAddr, rotAddr, linVAddr, angVAddr, id);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set position rotation and velocity: " + className);
		}
	}

	public CollisionGroup getCollisiongroup(int bodyId, CollisionGroup target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_COLLISION_GROUP;
			method.invokeExact(jphBodyInterface, bodyId, target.memorySegment());
			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get collision group: " + className);
		}
	}

	public CollisionGroup getCollisionGroup(int bodyId) {
		return getCollisiongroup(bodyId, new CollisionGroup());
	}

	public void setCollisionGroup(int bodyId, CollisionGroup collisionGroup) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_COLLISION_GROUP;
			method.invokeExact(jphBodyInterface, bodyId, collisionGroup.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set collision group: " + className);
		}
	}

	/**
	 * Get the current shape.
	 */
	public Shape getShape(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, bodyId);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Shape shape = Jolt.getShape(segment.address());
			if (shape != null)
				return shape;

			return new Shape(segment, false);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get shape: " + className);
		}
	}

	/**
	 * Set a new shape on the body.
	 * 
	 * @param bodyId               ID of body that had its shape changed
	 * @param shape                The new shpe
	 * @param updateMassProperties When true, the mass and inertia tensor is
	 *                             recalculated
	 * @param activation           Wheter or not to activate the body
	 */
	public void setShape(int bodyId, Shape shape, boolean updateMassProperties, Activation activation) {
		try {
			int id = activation.id();

			MethodHandle method = JPH_BODY_INTERFACE_SET_SHAPE;
			method.invokeExact(jphBodyInterface, bodyId, shape.memorySegment(), updateMassProperties, id);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set shape: " + className);
		}
	}

	/**
	 * Notify all systems to indicate that a shape has changed (usable for
	 * MutableCompoundShapes).
	 * 
	 * @param bodyId               ID of body that had its shape changed
	 * @param previousCenterOfMass Center of mass of the shape before the
	 *                             alterations
	 * @param updateMassProperties When true, the mass and inertia tensor is
	 *                             recalculated
	 * @param activation           Whether or not to activate the body
	 */
	public void notifyShapeChanged(int bodyId, Vector3f previousCenterOfMass, boolean updateMassProperties,
			Activation activation) {
		try {
			vecTmp.set(previousCenterOfMass);

			int id = activation.id();

			MethodHandle method = JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), updateMassProperties, id);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot notify shape changed: " + className);
		}
	}

	/**
	 * Note that you need to add the body to the physics system before you can
	 * activate it.
	 */
	public void activateBody(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODY;
			method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot activate body: " + className);
		}
	}

	/**
	 * Note that you need to add the bodies to the physics system before you can
	 * activate them.
	 */
	public void activateBodies(int... bodyIds) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(bodyIds.length, JAVA_INT));

			for (int i = 0; i < bodyIds.length; i++)
				array.setAtIndex(JAVA_INT, i, bodyIds[i]);

			MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODIES;
			method.invokeExact(jphBodyInterface, array, bodyIds.length);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot activate bodies: " + className);
		}
	}

	/**
	 * Note that you need to add the bodies to the physics system before you can
	 * activate them.
	 */
	public void activateBodiesInAABox(AABox box, BroadPhaseLayerFilter broadPhaseLayerFilter,
			ObjectLayerFilter objectLayerFilter) {
		try {
			MemorySegment filt1Addr = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2Addr = objectLayerFilter.memorySegment();

			MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX;
			method.invokeExact(jphBodyInterface, box.memorySegment(), filt1Addr, filt2Addr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot activate bodies in aabox: " + className);
		}
	}

	/**
	 * Note that you need to add the body to the physics system before you can
	 * deactivate it.
	 */
	public void deactivateBody(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_DEACTIVATE_BODY;
			method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot deactivate body: " + className);
		}
	}

	/**
	 * Note that you need to add the bodies to the physics system before you can
	 * deactivate them.
	 */
	public void deactivateBodies(int... bodyIds) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(bodyIds.length, JAVA_INT));

			for (int i = 0; i < bodyIds.length; i++)
				array.setAtIndex(JAVA_INT, i, bodyIds[i]);

			MethodHandle method = JPH_BODY_INTERFACE_DEACTIVATE_BODIES;
			method.invokeExact(jphBodyInterface, array, bodyIds.length);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot deactivate bodies: " + className);
		}
	}

	public void resetSleepTimer(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_RESET_SLEEP_TIMER;
			method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot reset sleep timer: " + className);
		}
	}

	public int getObjectLayer(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_OBJECT_LAYER;
			return (int) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get object layer: " + className);
		}
	}

	public void setObjectLayer(int bodyId, int objectLayer) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_OBJECT_LAYER;
			method.invokeExact(jphBodyInterface, bodyId, objectLayer);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set object layer: " + className);
		}
	}

	public Matrix4f getWorldTransform(int bodyId, Matrix4f target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM;
			method.invokeExact(jphBodyInterface, bodyId, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get world transform: " + className);
		}
	}

	public Matrix4f getWorldTransform(int bodyId) {
		return getWorldTransform(bodyId, new Matrix4f());
	}

	public Matrix4f getCenterOfMassTransform(int bodyId, Matrix4f target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM;
			method.invokeExact(jphBodyInterface, bodyId, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get center of mass transform: " + className);
		}
	}

	public Matrix4f getCenterOfMassTransform(int bodyId) {
		return getCenterOfMassTransform(bodyId, new Matrix4f());
	}

	/**
	 * Set velocity of body such that it will be positioned at
	 * inTargetPosition/Rotation in inDeltaTime seconds (will activate body if
	 * needed)
	 */
	public void moveKinematic(int bodyId, Vector3f targetPosition, Quaternionf targetRotation, float deltaTime) {
		try {
			vecTmp.set(targetPosition);
			quatTmp.set(targetRotation);

			MethodHandle method = JPH_BODY_INTERFACE_MOVE_KINEMATIC;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), quatTmp.memorySegment(), deltaTime);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot: " + className);
		}
	}

	/**
	 * @see Body#applyBuoyancyImpulse(Vector3f, Vector3f, float, float, float,
	 *      Vector3f, Vector3f, float)
	 */
	public boolean applyBuoyancyImpulse(int bodyId, Vector3f surfacePosition, Vector3f surfaceNormal, float buoyancy,
			float linearDrag, float angularDrag, Vector3f fluidVelocity, Vector3f gravity, float deltaTime) {
		try {
			vecTmp.set(surfacePosition);
			vecTmp2.set(surfaceNormal);
			vecTmp3.set(fluidVelocity);
			vecTmp4.set(gravity);

			MethodHandle method = JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE;
			return (boolean) method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(),
					vecTmp2.memorySegment(), buoyancy, linearDrag, angularDrag, vecTmp3.memorySegment(),
					vecTmp4.memorySegment(), deltaTime);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot apply buoyancy impulse: " + className);
		}
	}

	/**
	 * @see #getLinearAndAngularVelocity(int, Vector3f, Vector3f)
	 */
	public void setLinearAndAngularVelocity(int bodyId, Vector3f linearVelocity, Vector3f angularVelocity) {
		try {
			vecTmp.set(linearVelocity);
			vecTmp2.set(angularVelocity);

			MethodHandle method = JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), vecTmp2.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set linear and angular velocity: " + className);
		}
	}

	/**
	 * Linear or angular velocity (functions will activate body if needed). Note
	 * that the linear velocity is the velocity of the center of mass, which may not
	 * coincide with the position of your object, to correct for this:
	 * 𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦𝐶𝑂𝑀=𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦−𝐴𝑛𝑔𝑢𝑙𝑎𝑟𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦×𝑆ℎ𝑎𝑝𝑒𝐶𝑂𝑀
	 */
	public void getLinearAndAngularVelocity(int bodyId, Vector3f linearVelocity, Vector3f angularVelocity) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), vecTmp2.memorySegment());

			vecTmp.get(linearVelocity);
			vecTmp2.get(angularVelocity);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get linear and angular velocity: " + className);
		}
	}

	/**
	 * Add velocity to current velocity.
	 */
	public void addLinearVelocity(int bodyId, Vector3f linearVelocity) {
		try {
			vecTmp.set(linearVelocity);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add linear velocity: " + className);
		}
	}

	/**
	 * Add linear and angular to current velocities.
	 */
	public void addLinearAndAngularVelocity(int bodyId, Vector3f linearVelocity, Vector3f angularVelocity) {
		try {
			vecTmp.set(linearVelocity);
			vecTmp2.set(angularVelocity);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), vecTmp2.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add linear and angular velocity: " + className);
		}
	}

	public void setAngularVelocity(int bodyId, Vector3f angularVelocity) {
		try {
			vecTmp.set(angularVelocity);

			MethodHandle method = JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set angular velocity: " + className);
		}
	}

	public Vector3f getAngularVelocity(int bodyId, Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get angular velocity: " + className);
		}
	}

	/**
	 * Velocity of point inPoint (in world space, e.g. on the surface of the body)
	 * of the body.
	 */
	public Vector3f getPointVelocity(int bodyId, Vector3f point, Vector3f target) {
		try {
			vecTmp.set(point);

			MethodHandle method = JPH_BODY_INTERFACE_GET_POINT_VELOCITY;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), vecTmp2.memorySegment());

			return vecTmp2.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get point velocity: " + className);
		}
	}

	/**
	 * Note that you should add a body to the physics system before applying forces
	 * or torques.
	 * 
	 * @see Body#addForce(Vector3f)
	 */
	public void addForce(int bodyId, Vector3f force) {
		try {
			vecTmp.set(force);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add force: " + className);
		}
	}

	/**
	 * Note that you should add a body to the physics system before applying forces
	 * or torques.
	 * 
	 * @see Body#addForceAtPosition(Vector3f, Vector3f)
	 */
	public void addForce(int bodyId, Vector3f force, Vector3f point) {
		try {
			vecTmp.set(force);
			vecTmp2.set(point);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE2;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), vecTmp2.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add force: " + className);
		}
	}

	/**
	 * Note that you should add a body to the physics system before applying forces
	 * or torques.
	 * 
	 * @see Body#addTorque(Vector3f)
	 */
	public void addTorque(int bodyId, Vector3f torque) {
		try {
			vecTmp.set(torque);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_TORQUE;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add torque: " + className);
		}
	}

	/**
	 * Note that you should add a body to the physics system before applying forces
	 * or torques.
	 * <p>
	 * A combination of {@link Body#addForce(Vector3f)} and
	 * {@link Body#addTorque(Vector3f)}
	 */
	public void addForceAndTorque(int bodyId, Vector3f force, Vector3f torque) {
		try {
			vecTmp.set(force);
			vecTmp2.set(torque);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), vecTmp2.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add force and torque: " + className);
		}
	}

	/**
	 * Note that you should add a body to the physics system before applying
	 * impulses.
	 * <p>
	 * Applied at center of mass.
	 */
	public void addImpulse(int bodyId, Vector3f impulse) {
		try {
			vecTmp.set(impulse);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_IMPULSE;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add impulse: " + className);
		}
	}

	/**
	 * Note that you should add a body to the physics system before applying
	 * impulses.
	 * <p>
	 * Applied at point.
	 */
	public void addImpulse(int bodyId, Vector3f impulse, Vector3f point) {
		try {
			vecTmp.set(impulse);
			vecTmp2.set(point);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_IMPULSE2;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment(), vecTmp2.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add impulse: " + className);
		}
	}

	public void addAngularImpulse(int bodyId, Vector3f impulse) {
		try {
			vecTmp.set(impulse);

			MethodHandle method = JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE;
			method.invokeExact(jphBodyInterface, bodyId, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add angular impulse: " + className);
		}
	}

	public void setMotionQuality(int bodyId, MotionQuality motionQuality) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_MOTION_QUALITY;
			method.invokeExact(jphBodyInterface, bodyId, motionQuality.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set motion quality: " + className);
		}
	}

	public MotionQuality getMotionQuality(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_MOTION_QUALITY;
			int motionQuality = (int) method.invokeExact(jphBodyInterface, bodyId);

			if (motionQuality == MotionQuality.DISCRETE.id())
				return MotionQuality.DISCRETE;
			else
				return MotionQuality.LINEAR_CAST;

		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get motion quality: " + className);
		}
	}

	/**
	 * Get inverse inertia tensor in world space.
	 */
	public Matrix4f getInverseInertia(int bodyId, Matrix4f target) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_INVERSE_INERTIA;
			method.invokeExact(jphBodyInterface, bodyId, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get inverse inertia: " + className);
		}
	}

	/**
	 * Get inverse inertia tensor in world space.
	 */
	public Matrix4f getInverseInertia(int bodyId) {
		return getInverseInertia(bodyId, new Matrix4f());
	}

	public void setGravityFactor(int bodyId, float gravityFactor) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR;
			method.invokeExact(jphBodyInterface, bodyId, gravityFactor);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set gravity factor: " + className);
		}
	}

	public float getGravityFactor(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR;
			return (float) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get gravity factor: " + className);
		}
	}

	public void setUseManifoldReduction(int bodyId, boolean useManifoldReduction) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION;
			method.invokeExact(jphBodyInterface, bodyId, useManifoldReduction);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set use manifold reduction: " + className);
		}
	}

	public boolean getUseManifoldReduction(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION;
			return (boolean) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get use manifold reduction: " + className);
		}
	}

	/**
	 * Set the user data for a body.
	 */
	public void setUserData(int bodyId, long userData) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_USER_DATA;
			method.invokeExact(jphBodyInterface, bodyId, userData);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set user data: " + className);
		}
	}

	/**
	 * Get the user data for a body.
	 */
	public long getUserData(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_USER_DATA;
			return (long) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get user data: " + className);
		}
	}

	public void setIsSensor(int bodyId, boolean isSensor) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_SET_IS_SENSOR;
			method.invokeExact(jphBodyInterface, bodyId, isSensor);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set is sensor: " + className);
		}
	}

	public boolean isSensor(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_IS_SENSOR;
			return (boolean) method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot check if is sensor: " + className);
		}
	}

	/**
	 * Get the material for a particular sub shape.
	 */
	public PhysicsMaterial getMaterial(int bodyId, int subShapeId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_GET_MATERIAL;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyInterface, bodyId, subShapeId);

			if (segment.equals(MemorySegment.NULL))
				return null;

			PhysicsMaterial material = Jolt.getMaterial(segment.address());
			if (material != null)
				return material;

			return new PhysicsMaterial(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get material: " + className);
		}
	}

	/**
	 * Set the Body::EFlags::InvalidateContactCache flag for the specified body.
	 * This means that the collision cache is invalid for any body pair involving
	 * that body until the next physics step.
	 */
	public void invalidateContactCache(int bodyId) {
		try {
			MethodHandle method = JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE;
			method.invokeExact(jphBodyInterface, bodyId);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot invalidate contact cache: " + className);
		}
	}

}