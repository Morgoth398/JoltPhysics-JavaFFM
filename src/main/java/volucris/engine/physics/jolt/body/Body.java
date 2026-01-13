package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.MotionProperties;
import volucris.engine.physics.jolt.filter.CollisionGroup;
import volucris.engine.physics.jolt.jobSystem.JobSystem;
import volucris.engine.physics.jolt.math.AABox;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.physics.jolt.body.BodyEnums.BodyType;
import volucris.engine.physics.jolt.body.BodyEnums.MotionType;
import volucris.engine.physics.jolt.JoltEnums.Activation;

import volucris.engine.graphics.BoundingBox;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

//@formatter:off
/**
 * A rigid body that can be simulated using the physics system
 * <p>
 * Note that internally all properties (position, velocity etc.) are tracked
 * relative to the center of mass of the object to simplify the simulation of
 * the object.
 * <p>
 * The offset between the position of the body and the center of mass position
 * of the body is
 * {@snippet :
 *  GetShape().GetCenterOfMass();
 *  }
 * The functions that get/set the position of the body all indicate if they are
 * relative to the center of mass or to the original position in which the shape
 * was created.
 * <p>
 * The linear velocity is also velocity of the center of mass, to correct for
 * this:
 * 𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦𝐶𝑂𝑀=𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦−𝐴𝑛𝑔𝑢𝑙𝑎𝑟𝑉𝑒𝑙𝑜𝑐𝑖𝑡𝑦×𝑆ℎ𝑎𝑝𝑒𝐶𝑂𝑀.
 * 
 */
//@formatter:on
public final class Body {

	private static final MethodHandle JPH_BODY_GET_ID;
	private static final MethodHandle JPH_BODY_GET_BODY_TYPE;
	private static final MethodHandle JPH_BODY_IS_RIGID_BODY;
	private static final MethodHandle JPH_BODY_IS_SOFT_BODY;
	private static final MethodHandle JPH_BODY_IS_ACTIVE;
	private static final MethodHandle JPH_BODY_IS_STATIC;
	private static final MethodHandle JPH_BODY_IS_KINEMATIC;
	private static final MethodHandle JPH_BODY_IS_DYNAMIC;
	private static final MethodHandle JPH_BODY_CAN_BE_KINEMATIC_OR_DYNAMIC;
	private static final MethodHandle JPH_BODY_SET_IS_SENSOR;
	private static final MethodHandle JPH_BODY_IS_SENSOR;
	private static final MethodHandle JPH_BODY_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
	private static final MethodHandle JPH_BODY_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
	private static final MethodHandle JPH_BODY_SET_USE_MANIFOLD_REDUCTION;
	private static final MethodHandle JPH_BODY_GET_USE_MANIFOLD_REDUCTION;
	private static final MethodHandle JPH_BODY_GET_USE_MANIFOLD_REDUCTION_WITH_BODY;
	private static final MethodHandle JPH_BODY_SET_APPLY_GYROSCOPIC_FORCE;
	private static final MethodHandle JPH_BODY_GET_APPLY_GYROSCOPIC_FORCE;
	private static final MethodHandle JPH_BODY_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final MethodHandle JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final MethodHandle JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL_WITH_BODY;
	private static final MethodHandle JPH_BODY_GET_MOTION_TYPE;
	private static final MethodHandle JPH_BODY_SET_MOTION_TYPE;
	private static final MethodHandle JPH_BODY_GET_BROAD_PHASE_LAYER;
	private static final MethodHandle JPH_BODY_GET_OBJECT_LAYER;
	private static final MethodHandle JPH_BODY_GET_COLLISION_GROUP;
	private static final MethodHandle JPH_BODY_SET_COLLISION_GROUP;
	private static final MethodHandle JPH_BODY_GET_ALLOW_SLEEPING;
	private static final MethodHandle JPH_BODY_SET_ALLOW_SLEEPING;
	private static final MethodHandle JPH_BODY_RESET_SLEEP_TIMER;
	private static final MethodHandle JPH_BODY_GET_FRICTION;
	private static final MethodHandle JPH_BODY_SET_FRICTION;
	private static final MethodHandle JPH_BODY_GET_RESTITUTION;
	private static final MethodHandle JPH_BODY_SET_RESTITUTION;
	private static final MethodHandle JPH_BODY_GET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_SET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_SET_LINEAR_VELOCITY_CLAMPED;
	private static final MethodHandle JPH_BODY_GET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_SET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_SET_ANGULAR_VELOCITY_CLAMPED;
	private static final MethodHandle JPH_BODY_GET_POINT_VELOCITY_COM;
	private static final MethodHandle JPH_BODY_GET_POINT_VELOCITY;
	private static final MethodHandle JPH_BODY_ADD_FORCE;
	private static final MethodHandle JPH_BODY_ADD_FORCE_AT_POSITION;
	private static final MethodHandle JPH_BODY_ADD_TORQUE;
	private static final MethodHandle JPH_BODY_GET_ACCUMULATED_FORCE;
	private static final MethodHandle JPH_BODY_GET_ACCUMULATED_TORQUE;
	private static final MethodHandle JPH_BODY_RESET_FORCE;
	private static final MethodHandle JPH_BODY_RESET_TORQUE;
	private static final MethodHandle JPH_BODY_RESET_MOTION;
	private static final MethodHandle JPH_BODY_GET_INVERSE_INERTIA;
	private static final MethodHandle JPH_BODY_ADD_IMPULSE;
	private static final MethodHandle JPH_BODY_ADD_IMPULSE_AT_POSITION;
	private static final MethodHandle JPH_BODY_ADD_ANGULAR_IMPULSE;
	private static final MethodHandle JPH_BODY_MOVE_KINEMATIC;
	private static final MethodHandle JPH_BODY_APPLY_BUOYANCY_IMPULSE;
	private static final MethodHandle JPH_BODY_IS_IN_BROAD_PHASE;
	private static final MethodHandle JPH_BODY_IS_COLLISION_CACHE_INVALID;
	private static final MethodHandle JPH_BODY_GET_SHAPE;
	private static final MethodHandle JPH_BODY_GET_POSITION;
	private static final MethodHandle JPH_BODY_GET_ROTATION;
	private static final MethodHandle JPH_BODY_GET_WORLD_TRANSFORM;
	private static final MethodHandle JPH_BODY_GET_CENTER_OF_MASS_POSITION;
	private static final MethodHandle JPH_BODY_GET_CENTER_OF_MASS_TRANSFORM;
	private static final MethodHandle JPH_BODY_GET_INVERSE_CENTER_OF_MASS_TRANSFORM;
	private static final MethodHandle JPH_BODY_GET_WORLD_SPACE_BOUNDS;
	private static final MethodHandle JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL;
	private static final MethodHandle JPH_BODY_GET_MOTION_PROPERTIES;
	private static final MethodHandle JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED;
	private static final MethodHandle JPH_BODY_SET_USER_DATA;
	private static final MethodHandle JPH_BODY_GET_USER_DATA;
	private static final MethodHandle JPH_BODY_GET_FIXED_TO_WORLD_BODY;

	private static final int INVALID_BODY_ID = 0xffffffff;

	private final MemorySegment jphBody;

	private AABox aaBoxTmp;

	private Quat quatTmp;

	private Mat4 matTmp;

	private Vec3 vecTmp;
	private Vec3 vecTmp2;
	private Vec3 vecTmp3;
	private Vec3 vecTmp4;

	static {
		//@formatter:off
		JPH_BODY_GET_ID = downcallHandle("JPH_Body_GetID", JAVA_INT, ADDRESS);
		JPH_BODY_GET_BODY_TYPE = downcallHandle("JPH_Body_GetBodyType", JAVA_INT, ADDRESS);
		JPH_BODY_IS_RIGID_BODY = downcallHandle("JPH_Body_IsRigidBody", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_IS_SOFT_BODY = downcallHandle("JPH_Body_IsSoftBody", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_IS_ACTIVE = downcallHandle("JPH_Body_IsActive", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_IS_STATIC = downcallHandle("JPH_Body_IsStatic", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_IS_KINEMATIC = downcallHandle("JPH_Body_IsKinematic", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_IS_DYNAMIC = downcallHandle("JPH_Body_IsDynamic", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_CAN_BE_KINEMATIC_OR_DYNAMIC = downcallHandle("JPH_Body_CanBeKinematicOrDynamic", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_SET_IS_SENSOR = downcallHandleVoid("JPH_Body_SetIsSensor", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_IS_SENSOR = downcallHandle("JPH_Body_IsSensor", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandleVoid("JPH_Body_SetCollideKinematicVsNonDynamic", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandle("JPH_Body_GetCollideKinematicVsNonDynamic", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_Body_SetUseManifoldReduction", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_Body_GetUseManifoldReduction", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_GET_USE_MANIFOLD_REDUCTION_WITH_BODY = downcallHandle("JPH_Body_GetUseManifoldReductionWithBody", JAVA_BOOLEAN, ADDRESS, ADDRESS);
		JPH_BODY_SET_APPLY_GYROSCOPIC_FORCE = downcallHandleVoid("JPH_Body_SetApplyGyroscopicForce", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_APPLY_GYROSCOPIC_FORCE = downcallHandle("JPH_Body_GetApplyGyroscopicForce", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_Body_SetEnhancedInternalEdgeRemoval", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_Body_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL_WITH_BODY = downcallHandle("JPH_Body_GetEnhancedInternalEdgeRemovalWithBody", JAVA_BOOLEAN, ADDRESS, ADDRESS);
		JPH_BODY_GET_MOTION_TYPE = downcallHandle("JPH_Body_GetMotionType", JAVA_INT, ADDRESS);
		JPH_BODY_SET_MOTION_TYPE = downcallHandleVoid("JPH_Body_SetMotionType", ADDRESS, JAVA_INT);
		JPH_BODY_GET_BROAD_PHASE_LAYER = downcallHandle("JPH_Body_GetBroadPhaseLayer", JAVA_BYTE, ADDRESS);
		JPH_BODY_GET_OBJECT_LAYER = downcallHandle("JPH_Body_GetObjectLayer", JAVA_INT, ADDRESS);
		JPH_BODY_GET_COLLISION_GROUP = downcallHandleVoid("JPH_Body_GetCollisionGroup", ADDRESS, ADDRESS);
		JPH_BODY_SET_COLLISION_GROUP = downcallHandleVoid("JPH_Body_SetCollisionGroup", ADDRESS, ADDRESS);
		JPH_BODY_GET_ALLOW_SLEEPING = downcallHandle("JPH_Body_GetAllowSleeping", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_SET_ALLOW_SLEEPING = downcallHandleVoid("JPH_Body_SetAllowSleeping", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_RESET_SLEEP_TIMER = downcallHandleVoid("JPH_Body_ResetSleepTimer", ADDRESS);
		JPH_BODY_GET_FRICTION = downcallHandle("JPH_Body_GetFriction", JAVA_FLOAT, ADDRESS);
		JPH_BODY_SET_FRICTION = downcallHandleVoid("JPH_Body_SetFriction", ADDRESS, JAVA_FLOAT);
		JPH_BODY_GET_RESTITUTION = downcallHandle("JPH_Body_GetRestitution", JAVA_FLOAT, ADDRESS);
		JPH_BODY_SET_RESTITUTION = downcallHandleVoid("JPH_Body_SetRestitution", ADDRESS, JAVA_FLOAT);
		JPH_BODY_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Body_GetLinearVelocity", ADDRESS, ADDRESS);
		JPH_BODY_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Body_SetLinearVelocity", ADDRESS, ADDRESS);
		JPH_BODY_SET_LINEAR_VELOCITY_CLAMPED = downcallHandleVoid("JPH_Body_SetLinearVelocityClamped", ADDRESS, ADDRESS);
		JPH_BODY_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Body_GetAngularVelocity", ADDRESS, ADDRESS);
		JPH_BODY_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Body_SetAngularVelocity", ADDRESS, ADDRESS);
		JPH_BODY_SET_ANGULAR_VELOCITY_CLAMPED = downcallHandleVoid("JPH_Body_SetAngularVelocityClamped", ADDRESS, ADDRESS);
		JPH_BODY_GET_POINT_VELOCITY_COM = downcallHandleVoid("JPH_Body_GetPointVelocityCOM", ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_GET_POINT_VELOCITY = downcallHandleVoid("JPH_Body_GetPointVelocity", ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_ADD_FORCE = downcallHandleVoid("JPH_Body_AddForce", ADDRESS, ADDRESS);
		JPH_BODY_ADD_FORCE_AT_POSITION = downcallHandleVoid("JPH_Body_AddForceAtPosition", ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_ADD_TORQUE = downcallHandleVoid("JPH_Body_AddTorque", ADDRESS, ADDRESS);
		JPH_BODY_GET_ACCUMULATED_FORCE = downcallHandleVoid("JPH_Body_GetAccumulatedForce", ADDRESS, ADDRESS);
		JPH_BODY_GET_ACCUMULATED_TORQUE = downcallHandleVoid("JPH_Body_GetAccumulatedTorque", ADDRESS, ADDRESS);
		JPH_BODY_RESET_FORCE = downcallHandleVoid("JPH_Body_ResetForce", ADDRESS);
		JPH_BODY_RESET_TORQUE = downcallHandleVoid("JPH_Body_ResetTorque", ADDRESS);
		JPH_BODY_RESET_MOTION = downcallHandleVoid("JPH_Body_ResetMotion", ADDRESS);
		JPH_BODY_GET_INVERSE_INERTIA = downcallHandleVoid("JPH_Body_GetInverseInertia", ADDRESS, ADDRESS);
		JPH_BODY_ADD_IMPULSE = downcallHandleVoid("JPH_Body_AddImpulse", ADDRESS, ADDRESS);
		JPH_BODY_ADD_IMPULSE_AT_POSITION = downcallHandleVoid("JPH_Body_AddImpulseAtPosition", ADDRESS, ADDRESS, ADDRESS);
		JPH_BODY_ADD_ANGULAR_IMPULSE = downcallHandleVoid("JPH_Body_AddAngularImpulse", ADDRESS, ADDRESS);
		JPH_BODY_MOVE_KINEMATIC = downcallHandleVoid("JPH_Body_MoveKinematic", ADDRESS, ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_BODY_APPLY_BUOYANCY_IMPULSE = downcallHandle("JPH_Body_ApplyBuoyancyImpulse", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_BODY_IS_IN_BROAD_PHASE = downcallHandle("JPH_Body_IsInBroadPhase", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_IS_COLLISION_CACHE_INVALID = downcallHandle("JPH_Body_IsCollisionCacheInvalid", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_GET_SHAPE = downcallHandle("JPH_Body_GetShape", ADDRESS, ADDRESS);
		JPH_BODY_GET_POSITION = downcallHandleVoid("JPH_Body_GetPosition", ADDRESS, ADDRESS);
		JPH_BODY_GET_ROTATION = downcallHandleVoid("JPH_Body_GetRotation", ADDRESS, ADDRESS);
		JPH_BODY_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_Body_GetWorldTransform", ADDRESS, ADDRESS);
		JPH_BODY_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_Body_GetCenterOfMassPosition", ADDRESS, ADDRESS);
		JPH_BODY_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_Body_GetCenterOfMassTransform", ADDRESS, ADDRESS);
		JPH_BODY_GET_INVERSE_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_Body_GetInverseCenterOfMassTransform", ADDRESS, ADDRESS);
		JPH_BODY_GET_WORLD_SPACE_BOUNDS = downcallHandleVoid("JPH_Body_GetWorldSpaceBounds", ADDRESS, ADDRESS);
		JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL = downcallHandleVoid("JPH_Body_GetWorldSpaceSurfaceNormal", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_BODY_GET_MOTION_PROPERTIES = downcallHandle("JPH_Body_GetMotionProperties", ADDRESS, ADDRESS);
		JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED = downcallHandle("JPH_Body_GetMotionPropertiesUnchecked", ADDRESS, ADDRESS);
		JPH_BODY_SET_USER_DATA = downcallHandleVoid("JPH_Body_SetUserData", ADDRESS, JAVA_LONG);
		JPH_BODY_GET_USER_DATA = downcallHandle("JPH_Body_GetUserData", JAVA_LONG, ADDRESS);
		JPH_BODY_GET_FIXED_TO_WORLD_BODY = downcallHandle("JPH_Body_GetFixedToWorldBody", ADDRESS);
		//@formatter:on
	}

	public Body(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}
	
	public Body(MemorySegment segment, Arena arena) {
		this.jphBody = segment;

		Jolt.addBody(segment.address(), this);

		aaBoxTmp = new AABox(arena);

		quatTmp = new Quat(arena);

		matTmp = new Mat4(arena);

		vecTmp = new Vec3(arena);
		vecTmp2 = new Vec3(arena);
		vecTmp3 = new Vec3(arena);
		vecTmp4 = new Vec3(arena);
	}

	/**
	 * Get the id of this body.
	 */
	public int getID() {
		try {
			MethodHandle method = JPH_BODY_GET_ID;
			return (int) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get body id.");
		}
	}

	/**
	 * Check if the ID is valid.
	 */
	public boolean isIDValid() {
		return getID() != INVALID_BODY_ID;
	}

	/**
	 * Check if the ID is valid.
	 */
	public static boolean isIDValid(int id) {
		return id != INVALID_BODY_ID;
	}

	/**
	 * Get the type of body (rigid or soft)
	 */
	public BodyType getBodyType() {
		try {
			MethodHandle method = JPH_BODY_GET_BODY_TYPE;
			int value = (int) method.invokeExact(jphBody);

			if (value == BodyType.RIGID_BODY.id())
				return BodyType.RIGID_BODY;
			else
				return BodyType.SOFT_BODY;

		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get body type.");
		}
	}

	/**
	 * Check if this body is a rigid body.
	 */
	public boolean isRigidBody() {
		try {
			MethodHandle method = JPH_BODY_IS_RIGID_BODY;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body is rigid body.");
		}
	}

	/**
	 * Check if this body is a soft body.
	 */
	public boolean isSoftBody() {
		try {
			MethodHandle method = JPH_BODY_IS_SOFT_BODY;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body is soft body.");
		}
	}

	/**
	 * If this body is currently actively simulating (true) or sleeping (false)
	 */
	public boolean isActive() {
		try {
			MethodHandle method = JPH_BODY_IS_ACTIVE;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body is active.");
		}
	}

	/**
	 * Check if this body is static (not movable)
	 */
	public boolean isStatic() {
		try {
			MethodHandle method = JPH_BODY_IS_STATIC;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body is static.");
		}
	}

	/**
	 * Check if this body is kinematic (keyframed), which means that it will move
	 * according to its current velocity, but forces don't affect it.
	 */
	public boolean isKinematic() {
		try {
			MethodHandle method = JPH_BODY_IS_KINEMATIC;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body is kinematic.");
		}
	}

	/**
	 * Check if this body is dynamic, which means that it moves and forces can act
	 * on it.
	 */
	public boolean isDynamic() {
		try {
			MethodHandle method = JPH_BODY_IS_DYNAMIC;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body is dynamic.");
		}
	}

	/**
	 * Check if a body could be made kinematic or dynamic (if it was created dynamic
	 * or with allowDynamicOrKinematic set to true)
	 */
	public boolean canBeKinematicOrDynamic() {
		try {
			MethodHandle method = JPH_BODY_CAN_BE_KINEMATIC_OR_DYNAMIC;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body can be kinematic or dynamic.");
		}
	}

	/**
	 * Change the body to a sensor. A sensor will receive collision callbacks, but
	 * will not cause any collision responses and can be used as a trigger volume.
	 * The cheapest sensor (in terms of CPU usage) is a sensor with motion type
	 * Static (they can be moved around using
	 * {@link BodyInterface#setPosition(int, Vector3f, Activation) setPosition}/
	 * {@link BodyInterface#setPositionAndRotation(int, Vector3f, Quaternionf, Activation)
	 * setPositionAndRotation}) These sensors will only detect collisions with
	 * active Dynamic or Kinematic bodies. As soon as a body go to sleep, the
	 * contact point with the sensor will be lost. If you make a sensor Dynamic or
	 * Kinematic and activate them, the sensor will be able to detect collisions
	 * with sleeping bodies too. An active sensor will never go to sleep
	 * automatically. When you make a Dynamic or Kinematic sensor, make sure it is
	 * in an ObjectLayer that does not collide with Static bodies or other sensors
	 * to avoid extra overhead in the broad phase.
	 */
	public void setIsSensor(boolean isSensor) {
		try {
			MethodHandle method = JPH_BODY_SET_IS_SENSOR;
			method.invokeExact(jphBody, isSensor);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set is sensor.");
		}
	}

	/**
	 * Check if this body is a sensor.
	 */
	public boolean isSensor() {
		try {
			MethodHandle method = JPH_BODY_IS_SENSOR;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body is sensor.");
		}
	}

	/**
	 * If kinematic objects can generate contact points against other kinematic or
	 * static objects. Note that turning this on can be CPU intensive as much more
	 * collision detection work will be done without any effect on the simulation
	 * (kinematic objects are not affected by other kinematic/static objects). This
	 * can be used to make sensors detect static objects. Note that the sensor must
	 * be kinematic and active for it to detect static objects.
	 */
	public void setCollideKinematicVsNonDynamic(boolean collideKinematicVsNonDynamic) {
		try {
			MethodHandle method = JPH_BODY_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
			method.invokeExact(jphBody, collideKinematicVsNonDynamic);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set collideKinematicVsNonDynamic.");
		}
	}

	/**
	 * Check if kinematic objects can generate contact points against other
	 * kinematic or static objects.
	 */
	public boolean getCollideKinematicVsNonDynamic() {
		try {
			MethodHandle method = JPH_BODY_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get CollideKinematicVsNonDynamic.");
		}
	}

	/**
	 * If {@link PhysicsSettings#useManifoldReduction(boolean)} is true, this allows
	 * turning off manifold reduction for this specific body. Manifold reduction by
	 * default will combine contacts with similar normals that come from different
	 * SubShapeIDs (e.g. different triangles in a mesh shape or different compound
	 * shapes). If the application requires tracking exactly which SubShapeIDs are
	 * in contact, you can turn off manifold reduction. Note that this comes at a
	 * performance cost. Consider using
	 * {@link BodyInterface#setUseManifoldReduction(int, boolean)
	 * BodyInterface.setUseManifoldReduction} if the body could already be in
	 * contact with other bodies to ensure that the contact cache is invalidated and
	 * you get the correct contact callbacks.
	 */
	public void setUseManifoldReduction(boolean useManifoldReduction) {
		try {
			MethodHandle method = JPH_BODY_SET_USE_MANIFOLD_REDUCTION;
			method.invokeExact(jphBody, useManifoldReduction);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set UseManifoldReduction.");
		}
	}

	/**
	 * Check if this body can use manifold reduction.
	 */
	public boolean getUseManifoldReduction() {
		try {
			MethodHandle method = JPH_BODY_GET_USE_MANIFOLD_REDUCTION;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get UseManifoldReduction.");
		}
	}

	/**
	 * Checks if the combination of this body and inBody2 should use manifold
	 * reduction.
	 */
	public boolean getUseManifoldReductionWithBody(Body other) {
		try {
			MethodHandle method = JPH_BODY_GET_USE_MANIFOLD_REDUCTION_WITH_BODY;
			return (boolean) method.invokeExact(jphBody, other.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get UseManifoldReductionWithBody.");
		}
	}

	/**
	 * Set to indicate that the gyroscopic force should be applied to this body (aka
	 * Dzhanibekov effect, see <a
	 * href=https://en.wikipedia.org/wiki/Tennis_racket_theorem>
	 * https://en.wikipedia.org/wiki/Tennis_racket_theorem</a>)
	 */
	public void setApplyGyroscopicForce(boolean applyGyroscopicForce) {
		try {
			MethodHandle method = JPH_BODY_SET_APPLY_GYROSCOPIC_FORCE;
			method.invokeExact(jphBody, applyGyroscopicForce);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set ApplyGyroscopicForce.");
		}
	}

	/**
	 * Check if the gyroscopic force is being applied for this body.
	 */
	public boolean getApplygyroscopicForce() {
		try {
			MethodHandle method = JPH_BODY_GET_APPLY_GYROSCOPIC_FORCE;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ApplyGyroscopicForce.");
		}
	}

	/**
	 * Set to indicate that extra effort should be made to try to remove ghost
	 * contacts (collisions with internal edges of a mesh). This is more expensive
	 * but makes bodies move smoother over a mesh with convex edges.
	 */
	public void setEnhancedInternalEdgeRemoval(boolean enhancedInternalEdgeRemoval) {
		try {
			MethodHandle method = JPH_BODY_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
			method.invokeExact(jphBody, enhancedInternalEdgeRemoval);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set EnhancedInternalEdgeRemoval.");
		}
	}

	/**
	 * Check if enhanced internal edge removal is turned on.
	 */
	public boolean getEnhancedInternalEdgeRemoval() {
		try {
			MethodHandle method = JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get EnhancedInternalEdgeRemoval.");
		}
	}

	/**
	 * Checks if the combination of this body and inBody2 should use enhanced
	 * internal edge removal.
	 */
	public boolean getEnhancedInternalEdgeRemovalWithBody(Body other) {
		try {
			MethodHandle method = JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL_WITH_BODY;
			return (boolean) method.invokeExact(jphBody, other.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get EnhancedInternalEdgeRemovalWithBody.");
		}
	}

	/**
	 * Get the bodies motion type.
	 */
	public MotionType getMotionType() {
		try {
			MethodHandle method = JPH_BODY_GET_MOTION_TYPE;
			int value = (int) method.invokeExact(jphBody);

			if (value == MotionType.DYNAMIC.id())
				return MotionType.DYNAMIC;
			else if (value == MotionType.KINEMATIC.id())
				return MotionType.KINEMATIC;
			else
				return MotionType.STATIC;

		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get motion type.");
		}
	}

	/**
	 * Set the motion type of this body. Consider using
	 * {@link BodyInterface#setMotionType(int, MotionType, Activation)} instead of
	 * this function if the body may be active or if it needs to be activated.
	 */
	public void setMotionType(MotionType motionType) {
		try {
			MethodHandle method = JPH_BODY_SET_MOTION_TYPE;
			method.invokeExact(jphBody, motionType.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set motion type.");
		}
	}

	/**
	 * Get broadphase layer, this determines in which broad phase sub-tree the
	 * object is placed.
	 */
	public byte getBroadPhaseLayer() {
		try {
			MethodHandle method = JPH_BODY_GET_BROAD_PHASE_LAYER;
			return (byte) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get broad phase layer.");
		}
	}

	/**
	 * Get object layer, this determines which other objects it collides with.
	 */
	public int getObjectLayer() {
		try {
			MethodHandle method = JPH_BODY_GET_OBJECT_LAYER;
			return (int) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get obejct layer.");
		}
	}

	/**
	 * Collision group and sub-group ID, determines which other objects it collides
	 * with.
	 */
	public CollisionGroup getCollisiongroup(CollisionGroup target) {
		try {
			MethodHandle method = JPH_BODY_GET_COLLISION_GROUP;
			method.invokeExact(jphBody, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get collision group.");
		}
	}

	/**
	 * Collision group and sub-group ID, determines which other objects it collides
	 * with.
	 */
	public CollisionGroup getCollisionGroup() {
		return getCollisiongroup(new CollisionGroup());
	}

	/**
	 * Sets the collision group of this body.
	 */
	public void setCollisionGroup(CollisionGroup collisionGroup) {
		try {
			MethodHandle method = JPH_BODY_SET_COLLISION_GROUP;
			method.invokeExact(jphBody, collisionGroup.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set collision group.");
		}
	}

	/**
	 * If this body can go to sleep. Note that disabling sleeping on a sleeping
	 * object will not wake it up.
	 */
	public boolean getAllowSleeping() {
		try {
			MethodHandle method = JPH_BODY_GET_ALLOW_SLEEPING;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get allow sleeping.");
		}
	}

	/**
	 * Set if this body can go to sleep.
	 */
	public void setAllowsleeping(boolean allowSleeping) {
		try {
			MethodHandle method = JPH_BODY_SET_ALLOW_SLEEPING;
			method.invokeExact(jphBody, allowSleeping);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set allow sleeping.");
		}
	}

	/**
	 * Resets the sleep timer. This does not wake up the body if it is sleeping, but
	 * allows resetting the system that detects when a body is sleeping.
	 */
	public void resetSleepTimer() {
		try {
			MethodHandle method = JPH_BODY_RESET_SLEEP_TIMER;
			method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot reset sleep timer.");
		}
	}

	/**
	 * Friction (dimensionless number, usually between 0 and 1, 0 = no friction, 1 =
	 * friction force equals force that presses the two bodies together). Note that
	 * bodies can have negative friction but the combined friction should never go
	 * below zero.
	 */
	public float getFriction() {
		try {
			MethodHandle method = JPH_BODY_GET_FRICTION;
			return (float) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get friction.");
		}
	}

	/**
	 * Sets the friction of this body.
	 * 
	 * @see #getFriction()
	 */
	public void setFriction(float friction) {
		try {
			MethodHandle method = JPH_BODY_SET_FRICTION;
			method.invokeExact(jphBody, friction);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set friction.");
		}
	}

	/**
	 * Restitution (dimensionless number, usually between 0 and 1, 0 = completely
	 * inelastic collision response, 1 = completely elastic collision response).
	 * Note that bodies can have negative restitution but the combined restitution
	 * should never go below zero.
	 */
	public float getRestitution() {
		try {
			MethodHandle method = JPH_BODY_GET_RESTITUTION;
			return (float) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get restitution.");
		}
	}

	/**
	 * Sets the restitution of this body.
	 * 
	 * @see #getRestitution()
	 */
	public void setRestitution(float restitution) {
		try {
			MethodHandle method = JPH_BODY_SET_RESTITUTION;
			method.invokeExact(jphBody, restitution);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set restitution.");
		}
	}

	/**
	 * Get world space linear velocity of the center of mass (unit: m/s)
	 */
	public Vector3f getLinearVelocity(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_GET_LINEAR_VELOCITY;
			method.invokeExact(jphBody, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get linear velocity.");
		}
	}

	/**
	 * Get world space linear velocity of the center of mass (unit: m/s)
	 */
	public Vector3f getLinearVelocity() {
		return getLinearVelocity(new Vector3f());
	}

	/**
	 * Set world space linear velocity of the center of mass (unit: m/s). If you
	 * want the body to wake up when it is sleeping, use
	 * {@link BodyInterface#setLinearVelocity(int, Vector3f)} instead.
	 */
	public void setLinearVelocity(Vector3f linearVelocity) {
		try {
			vecTmp.set(linearVelocity);

			MethodHandle method = JPH_BODY_SET_LINEAR_VELOCITY;
			method.invokeExact(jphBody, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set linear velocity.");
		}
	}

	/**
	 * Set world space linear velocity of the center of mass, will make sure the
	 * value is clamped against the maximum linear velocity. If you want the body to
	 * wake up when it is sleeping, use
	 * {@link BodyInterface#setLinearVelocity(int, Vector3f)} instead.
	 */
	public void setLinearVelocityClamped(Vector3f linearVelocity) {
		try {
			vecTmp.set(linearVelocity);

			MethodHandle method = JPH_BODY_SET_LINEAR_VELOCITY_CLAMPED;
			method.invokeExact(jphBody, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set linear velocity clamped.");
		}
	}

	/**
	 * Get world space angular velocity of the center of mass (unit: rad/s)
	 */
	public Vector3f getAngularVelocity(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_GET_ANGULAR_VELOCITY;
			method.invokeExact(jphBody, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get angular velocity.");
		}
	}

	/**
	 * Get world space angular velocity of the center of mass (unit: rad/s)
	 */
	public Vector3f getAngularVelocity() {
		return getAngularVelocity(new Vector3f());
	}

	/**
	 * Set world space angular velocity of the center of mass (unit: rad/s). If you
	 * want the body to wake up when it is sleeping, use
	 * {@link BodyInterface#setAngularVelocity(int, Vector3f)
	 * BodyInterface.setAngularVelocity} instead.
	 */
	public void setAngularVelocity(Vector3f angularVelocity) {
		try {
			vecTmp.set(angularVelocity);

			MethodHandle method = JPH_BODY_SET_ANGULAR_VELOCITY;
			method.invokeExact(jphBody, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set angular velocity.");
		}
	}

	/**
	 * Set world space angular velocity of the center of mass, will make sure the
	 * value is clamped against the maximum angular velocity. If you want the body
	 * to wake up when it is sleeping, use
	 * {@link BodyInterface#setAngularVelocity(int, Vector3f)
	 * BodyInterface.setAngularVelocity} instead.
	 */
	public void setAngularVelocityClamped(Vector3f angularVelocity) {
		try {
			vecTmp.set(angularVelocity);

			MethodHandle method = JPH_BODY_SET_ANGULAR_VELOCITY_CLAMPED;
			method.invokeExact(jphBody, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set angular velocity clamped.");
		}
	}

	/**
	 * Velocity of the point (in center of mass space, e.g. on the surface of the
	 * body) of the body (unit: m/s)
	 */
	public Vector3f getPointVelocityCOM(Vector3f pointRelativeToCOM, Vector3f target) {
		try {
			vecTmp.set(pointRelativeToCOM);

			MethodHandle method = JPH_BODY_GET_POINT_VELOCITY_COM;
			method.invokeExact(jphBody, vecTmp.memorySegment(), vecTmp2.memorySegment());

			return vecTmp2.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get point velocity COM.");
		}
	}

	/**
	 * Velocity of the point (in center of mass space, e.g. on the surface of the
	 * body) of the body (unit: m/s)
	 */
	public Vector3f getPointVelocityCOM(Vector3f pointRelativeToCOM) {
		return getPointVelocityCOM(pointRelativeToCOM, new Vector3f());
	}

	/**
	 * Velocity of the point (in world space, e.g. on the surface of the body) of
	 * the body (unit: m/s)
	 */
	public Vector3f getPointVelocity(Vector3f point, Vector3f target) {
		try {
			vecTmp.set(point);

			MethodHandle method = JPH_BODY_GET_POINT_VELOCITY;
			method.invokeExact(jphBody, vecTmp.memorySegment(), vecTmp2.memorySegment());

			return vecTmp2.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get point velocity.");
		}
	}

	/**
	 * Velocity of the point (in world space, e.g. on the surface of the body) of
	 * the body (unit: m/s)
	 */
	public Vector3f getPointVelocity(Vector3f point) {
		return getPointVelocity(point, new Vector3f());
	}

	/**
	 * Add force (unit: N) at center of mass for the next time step, will be reset
	 * after the next call to {@link PhysicsSystem#update(float, int, JobSystem)
	 * PhysicsSystem.update}. If you want the body to wake up when it is sleeping,
	 * use {@link BodyInterface#addForce(int, Vector3f) BodyInterface.addForce}
	 * instead.
	 */
	public void addForce(Vector3f force) {
		try {
			vecTmp.set(force);

			MethodHandle method = JPH_BODY_ADD_FORCE;
			method.invokeExact(jphBody, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add force.");
		}
	}

	/**
	 * Add force (unit: N) at position for the next time step, will be reset after
	 * the next call to {@link PhysicsSystem#update(float, int, JobSystem)
	 * PhysicsSystem.update}. If you want the body to wake up when it is sleeping,
	 * use {@link BodyInterface#addForce(int, Vector3f) BodyInterface.addForce}
	 * instead.
	 */
	public void addForceAtPosition(Vector3f force, Vector3f position) {
		try {
			vecTmp.set(force);
			vecTmp2.set(position);

			MethodHandle method = JPH_BODY_ADD_FORCE_AT_POSITION;
			method.invokeExact(jphBody, vecTmp.memorySegment(), vecTmp2.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add force at position.");
		}
	}

	/**
	 * Add torque (unit: N m) for the next time step, will be reset after the next
	 * call to {@link PhysicsSystem#update(float, int, JobSystem)
	 * PhysicsSystem.update}. If you want the body to wake up when it is sleeping,
	 * use {@link BodyInterface#addTorque(int, Vector3f) BodyInterface.addTorque}
	 * instead.
	 */
	public void addTorque(Vector3f torque) {
		try {
			vecTmp.set(torque);

			MethodHandle method = JPH_BODY_ADD_TORQUE;
			method.invokeExact(jphBody, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add torque.");
		}
	}

	public Vector3f getAccumulatedForce(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_GET_ACCUMULATED_FORCE;
			method.invokeExact(jphBody, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get accumulated force.");
		}
	}

	public Vector3f getAccumulatedTorque(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_GET_ACCUMULATED_TORQUE;
			method.invokeExact(jphBody, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get accumulated torque.");
		}
	}

	public void resetForce() {
		try {
			MethodHandle method = JPH_BODY_RESET_FORCE;
			method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot reset force.");
		}
	}

	public void resetTorque() {
		try {
			MethodHandle method = JPH_BODY_RESET_TORQUE;
			method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot reset torque.");
		}
	}

	public void resetMotion() {
		try {
			MethodHandle method = JPH_BODY_RESET_MOTION;
			method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot reset motion.");
		}
	}

	/**
	 * Get inverse inertia tensor in world space.
	 */
	public Matrix4f getInverseInertia(Matrix4f target) {
		try {
			MethodHandle method = JPH_BODY_GET_INVERSE_INERTIA;
			method.invokeExact(jphBody, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get inverse inertia.");
		}
	}

	/**
	 * Get inverse inertia tensor in world space.
	 */
	public Matrix4f getInverseInertia() {
		return getInverseInertia(new Matrix4f());
	}

	/**
	 * Add impulse to center of mass (unit: kg m/s). If you want the body to wake up
	 * when it is sleeping, use {@link BodyInterface#addImpulse(int, Vector3f)
	 * BodyInterface.addImpulse} instead.
	 */
	public void addImpulse(Vector3f impulse) {
		try {
			vecTmp.set(impulse);

			MethodHandle method = JPH_BODY_ADD_IMPULSE;
			method.invokeExact(jphBody, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add impulse.");
		}
	}

	/**
	 * Add impulse to point in world space (unit: kg m/s). If you want the body to
	 * wake up when it is sleeping, use
	 * {@link BodyInterface#addImpulse(int, Vector3f, Vector3f)
	 * BodyInterface.addImpulse}
	 */
	public void addImpulseAtPosition(Vector3f impulse, Vector3f position) {
		try {
			vecTmp.set(impulse);
			vecTmp2.set(position);

			MethodHandle method = JPH_BODY_ADD_IMPULSE_AT_POSITION;
			method.invokeExact(jphBody, vecTmp.memorySegment(), vecTmp2.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add impulse add position.");
		}
	}

	/**
	 * Add angular impulse in world space (unit: N m s). If you want the body to
	 * wake up when it is sleeping, use
	 * {@link BodyInterface#addAngularImpulse(int, Vector3f)
	 * BodyInterface.addAngularImpulse} instead.
	 */
	public void addAngularImpulse(Vector3f angularImpulse) {
		try {
			vecTmp.set(angularImpulse);

			MethodHandle method = JPH_BODY_ADD_ANGULAR_IMPULSE;
			method.invokeExact(jphBody, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add angular impulse.");
		}
	}

	/**
	 * Set velocity of body such that it will be positioned at
	 * targetPosition/Rotation in deltaTime seconds. If you want the body to wake up
	 * when it is sleeping, use
	 * {@link BodyInterface#moveKinematic(int, Vector3f, Quaternionf, float)
	 * BodyInterface.moveKinematic} instead.
	 */
	public void moveKinematic(Vector3f targetPosition, Quaternionf targetRotation, float deltaTime) {
		try {
			vecTmp.set(targetPosition);
			quatTmp.set(targetRotation);

			MethodHandle method = JPH_BODY_MOVE_KINEMATIC;
			method.invokeExact(jphBody, vecTmp.memorySegment(), quatTmp.memorySegment(), deltaTime);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot move kinematic.");
		}
	}

	/**
	 * Applies an impulse to the body that simulates fluid buoyancy and drag. If you
	 * want the body to wake up when it is sleeping, use
	 * {@link BodyInterface#applyBuoyancyImpulse(int, Vector3f, Vector3f, float, float, float, Vector3f, Vector3f, float)
	 * BodyInterface.applyBuoyancyImpulse} instead.
	 * 
	 * @param surfacePosition Position of the fluid surface in world space
	 * @param surfaceNormal   Normal of the fluid surface (should point up)
	 * @param buoyancy        The buoyancy factor for the body.
	 *                        {@code 1 = neutral body, <
	 *                        1 sinks, > 1 floats} . Note that we don't use the
	 *                        fluid density since it is harder to configure than a
	 *                        simple number between [0, 2]
	 * @param linearDrag      Linear drag factor that slows down the body when in
	 *                        the fluid (approx. 0.5)
	 * @param angularDrag     Angular drag factor that slows down rotation when the
	 *                        body is in the fluid (approx. 0.01)
	 * @param fluidVelocity   The average velocity of the fluid (in m/s) in which
	 *                        the body resides
	 * @param gravity         The gravity vector (pointing down)
	 * @param deltaTime       Delta time of the next simulation step (in s)
	 * @return true if an impulse was applied, false if the body was not in the
	 *         fluid
	 */
	public boolean applyBuoyancyImpulse(Vector3f surfacePosition, Vector3f surfaceNormal, float buoyancy,
			float linearDrag, float angularDrag, Vector3f fluidVelocity, Vector3f gravity, float deltaTime) {
		try {
			vecTmp.set(surfacePosition);
			vecTmp2.set(surfaceNormal);
			vecTmp3.set(fluidVelocity);
			vecTmp4.set(gravity);

			MethodHandle method = JPH_BODY_APPLY_BUOYANCY_IMPULSE;
			return (boolean) method.invokeExact(jphBody, vecTmp.memorySegment(), vecTmp2.memorySegment(), buoyancy,
					linearDrag, angularDrag, vecTmp3.memorySegment(), vecTmp4.memorySegment(), deltaTime);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot apply buoyancy impulse.");
		}
	}

	/**
	 * Check if this body has been added to the physics system.
	 */
	public boolean isInBroadPhase() {
		try {
			MethodHandle method = JPH_BODY_IS_IN_BROAD_PHASE;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if body is in broad phase.");
		}
	}

	/**
	 * Check if this body has been changed in such a way that the collision cache
	 * should be considered invalid for any body interacting with this body.
	 */
	public boolean isCollisionCacheInvalid() {
		try {
			MethodHandle method = JPH_BODY_IS_COLLISION_CACHE_INVALID;
			return (boolean) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if collision cache is invalid.");
		}
	}

	/**
	 * Get the shape of this body.
	 */
	public Shape getShape() {
		try {
			MethodHandle method = JPH_BODY_GET_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBody);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Shape shape = Jolt.getShape(segment.address());
			if (shape != null)
				return shape;

			return new Shape(segment, false);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get shape.");
		}
	}

	/**
	 * World space position of the body.
	 */
	public Vector3f getPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_GET_POSITION;
			method.invokeExact(jphBody, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get position.");
		}
	}

	/**
	 * World space position of the body.
	 */
	public Vector3f getPosition() {
		return getPosition(new Vector3f());
	}

	/**
	 * World space rotation of the body.
	 */
	public Quaternionf getRotation(Quaternionf target) {
		try {
			MethodHandle method = JPH_BODY_GET_ROTATION;
			method.invokeExact(jphBody, quatTmp.memorySegment());

			return quatTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get rotation.");
		}
	}

	/**
	 * World space rotation of the body.
	 */
	public Quaternionf getRotation() {
		return getRotation(new Quaternionf());
	}

	/**
	 * Calculates the transform of this body.
	 */
	public Matrix4f getWorldTransform(Matrix4f target) {
		try {
			MethodHandle method = JPH_BODY_GET_WORLD_TRANSFORM;
			method.invokeExact(jphBody, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get world transform.");
		}
	}

	/**
	 * Calculates the transform of this body.
	 */
	public Matrix4f getWorldTransform() {
		return getWorldTransform(new Matrix4f());
	}

	/**
	 * Gets the world space position of this body's center of mass.
	 */
	public Vector3f getCenterOfMassPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_GET_CENTER_OF_MASS_POSITION;
			method.invokeExact(jphBody, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get center of mass position.");
		}
	}

	/**
	 * Gets the world space position of this body's center of mass.
	 */
	public Vector3f getCenterOfMassPosition() {
		return getCenterOfMassPosition(new Vector3f());
	}

	/**
	 * Calculates the transform for this body's center of mass.
	 */
	public Matrix4f getCenterOfMassTransform(Matrix4f target) {
		try {
			MethodHandle method = JPH_BODY_GET_CENTER_OF_MASS_TRANSFORM;
			method.invokeExact(jphBody, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get center of mass transform.");
		}
	}

	/**
	 * Calculates the transform for this body's center of mass.
	 */
	public Matrix4f getCenterOfMassTransform() {
		return getCenterOfMassTransform(new Matrix4f());
	}

	/**
	 * Calculates the inverse of the transform for this body's center of mass.
	 */
	public Matrix4f getInverseCenterOfMassTransform(Matrix4f target) {
		try {
			MethodHandle method = JPH_BODY_GET_INVERSE_CENTER_OF_MASS_TRANSFORM;
			method.invokeExact(jphBody, matTmp.memorySegment());

			return matTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get inverse center of mass transform.");
		}
	}

	/**
	 * Calculates the inverse of the transform for this body's center of mass.
	 */
	public Matrix4f getInverseCenterOfMassTransform() {
		return getInverseCenterOfMassTransform(new Matrix4f());
	}

	/**
	 * Get world space bounding box.
	 */
	public BoundingBox getWorldSpaceBounds(BoundingBox target) {
		try {
			MethodHandle method = JPH_BODY_GET_WORLD_SPACE_BOUNDS;
			method.invokeExact(jphBody, aaBoxTmp.memorySegment());
			return aaBoxTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get world space bounds.");
		}
	}

	/**
	 * Get world space bounding box.
	 */
	public BoundingBox getWorldSpaceBounds() {
		return getWorldSpaceBounds(new BoundingBox());
	}

	/**
	 * Get surface normal of a particular sub shape and its world space surface
	 * position on this body.
	 */
	public Vector3f getWorldSpaceSurfaceNormal(float subShapeId, Vector3f position, Vector3f target) {
		try {
			vecTmp.set(position);

			MethodHandle method = JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL;
			method.invokeExact(jphBody, subShapeId, vecTmp.memorySegment(), vecTmp2.memorySegment());

			return vecTmp2.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get world space surface normal.");
		}
	}

	/**
	 * Get surface normal of a particular sub shape and its world space surface
	 * position on this body.
	 */
	public Vector3f getWorldSpaceSurfaceNormal(float subShapeId, Vector3f position) {
		return getWorldSpaceSurfaceNormal(subShapeId, position, new Vector3f());
	}

	/**
	 * Access to the motion properties.
	 */
	public MotionProperties getMotionProperties(MotionProperties target) {
		try {
			MethodHandle method = JPH_BODY_GET_MOTION_PROPERTIES;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBody);

			target.set(segment);

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get motion properties.");
		}
	}

	/**
	 * Access to the motion properties.
	 */
	public MotionProperties getMotionProperties() {
		return getMotionProperties(new MotionProperties());
	}

	/**
	 * Access to the motion properties (version that does not check if the object is
	 * kinematic or dynamic)
	 */
	public MotionProperties getMotionPropertiesUnchecked(MotionProperties target) {
		try {
			MethodHandle method = JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBody);

			target.set(segment);

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get motion properties unchecked.");
		}
	}

	/**
	 * Access to the motion properties (version that does not check if the object is
	 * kinematic or dynamic)
	 */
	public MotionProperties getMotionPropertiesUnchecked() {
		return getMotionPropertiesUnchecked(new MotionProperties());
	}

	public void setUserData(long userData) {
		try {
			MethodHandle method = JPH_BODY_SET_USER_DATA;
			method.invokeExact(jphBody, userData);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set user data.");
		}
	}

	/**
	 * Set the internal user data for the body.
	 * <p>
	 * The object is not passed to the native code.
	 */
	public void setInternalUserData(Object internalUserData) {
		Jolt.setInternalUserData(jphBody.address(), internalUserData);
	}

	/**
	 * Get the internal user data stored in the body.
	 * <p>
	 * The object is not passed to the native code.
	 */
	public Object getInternalUserData() {
		return Jolt.getInternalUserData(jphBody.address());
	}

	/**
	 * Set the user data for the body.
	 * <p>
	 * The object is not passed to the native code.
	 */
	public void setObjectUserData(Object userData) {
		Jolt.setUserData(jphBody.address(), userData);
	}

	/**
	 * Get the user data stored in the body.
	 */
	public Object getObjectUserData() {
		return Jolt.getUserData(jphBody.address());
	}

	/**
	 * Access to the user data, can be used for anything by the application.
	 */
	public long getUserData() {
		try {
			MethodHandle method = JPH_BODY_GET_USER_DATA;
			return (long) method.invokeExact(jphBody);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get user data.");
		}
	}

	/**
	 * A dummy body that can be used by constraints to attach a constraint to the
	 * world instead of another body.
	 */
	public static Body getFixedToWorldBody() {
		try {
			MethodHandle method = JPH_BODY_GET_FIXED_TO_WORLD_BODY;
			MemorySegment segment = (MemorySegment) method.invokeExact();

			if (segment.equals(MemorySegment.NULL))
				return null;

			Body body = Jolt.getBody(segment.address());
			if (body != null)
				return body;

			return new Body(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get fixed to world body.");
		}
	}

	/**
	 * The pointer of this body.
	 */
	public MemorySegment memorySegment() {
		return jphBody;
	}

}