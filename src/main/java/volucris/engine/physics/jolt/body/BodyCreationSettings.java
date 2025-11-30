package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.JoltEnums.AllowedDOFs;
import volucris.engine.physics.jolt.MassProperties;
import volucris.engine.physics.jolt.filter.CollisionGroup;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.physics.jolt.shape.ShapeSettings;
import volucris.engine.physics.jolt.body.BodyEnums.MotionType;
import volucris.engine.physics.jolt.body.BodyEnums.MotionQuality;
import volucris.engine.physics.jolt.body.BodyEnums.OverrideMassProperties;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Settings for constructing a rigid body. 
 */
public final class BodyCreationSettings {

	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_CREATE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_CREATE2;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_CREATE3;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_DESTROY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_POSITION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_POSITION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_ROTATION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_ROTATION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_USER_DATA;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_USER_DATA;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_FRICTION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_FRICTION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE;
	private static final MethodHandle JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE;

	private final MemorySegment jphBodyCreationSettings;

	private Quat quatTmp;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_BODY_CREATION_SETTINGS_CREATE = downcallHandle("JPH_BodyCreationSettings_Create", ADDRESS);
		JPH_BODY_CREATION_SETTINGS_CREATE2 = downcallHandle("JPH_BodyCreationSettings_Create2", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_CREATE3 = downcallHandle("JPH_BodyCreationSettings_Create3", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_DESTROY = downcallHandleVoid("JPH_BodyCreationSettings_Destroy", ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_POSITION = downcallHandleVoid("JPH_BodyCreationSettings_GetPosition", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_POSITION = downcallHandleVoid("JPH_BodyCreationSettings_SetPosition", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_ROTATION = downcallHandleVoid("JPH_BodyCreationSettings_GetRotation", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ROTATION = downcallHandleVoid("JPH_BodyCreationSettings_SetRotation", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_GetLinearVelocity", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetLinearVelocity", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_GetAngularVelocity", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetAngularVelocity", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_USER_DATA = downcallHandle("JPH_BodyCreationSettings_GetUserData", JAVA_LONG, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_BodyCreationSettings_SetUserData", ADDRESS, JAVA_LONG);
		JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER = downcallHandle("JPH_BodyCreationSettings_GetObjectLayer", JAVA_INT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER = downcallHandleVoid("JPH_BodyCreationSettings_SetObjectLayer", ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyCreationSettings_GetCollisionGroup", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyCreationSettings_SetCollisionGroup", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE = downcallHandle("JPH_BodyCreationSettings_GetMotionType", JAVA_INT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE = downcallHandleVoid("JPH_BodyCreationSettings_SetMotionType", ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS = downcallHandle("JPH_BodyCreationSettings_GetAllowedDOFs", JAVA_INT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowedDOFs", ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC = downcallHandle("JPH_BodyCreationSettings_GetAllowDynamicOrKinematic", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowDynamicOrKinematic", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR = downcallHandle("JPH_BodyCreationSettings_GetIsSensor", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR = downcallHandleVoid("JPH_BodyCreationSettings_SetIsSensor", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandle("JPH_BodyCreationSettings_GetCollideKinematicVsNonDynamic", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandleVoid("JPH_BodyCreationSettings_SetCollideKinematicVsNonDynamic", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_BodyCreationSettings_GetUseManifoldReduction", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_BodyCreationSettings_SetUseManifoldReduction", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE = downcallHandle("JPH_BodyCreationSettings_GetApplyGyroscopicForce", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE = downcallHandleVoid("JPH_BodyCreationSettings_SetApplyGyroscopicForce", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY = downcallHandle("JPH_BodyCreationSettings_GetMotionQuality", JAVA_INT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMotionQuality", ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_BodyCreationSettings_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_BodyCreationSettings_SetEnhancedInternalEdgeRemoval", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING = downcallHandle("JPH_BodyCreationSettings_GetAllowSleeping", JAVA_BOOLEAN, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowSleeping", ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_CREATION_SETTINGS_GET_FRICTION = downcallHandle("JPH_BodyCreationSettings_GetFriction", JAVA_FLOAT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_FRICTION = downcallHandleVoid("JPH_BodyCreationSettings_SetFriction", ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION = downcallHandle("JPH_BodyCreationSettings_GetRestitution", JAVA_FLOAT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION = downcallHandleVoid("JPH_BodyCreationSettings_SetRestitution", ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING = downcallHandle("JPH_BodyCreationSettings_GetLinearDamping", JAVA_FLOAT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING = downcallHandleVoid("JPH_BodyCreationSettings_SetLinearDamping", ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING = downcallHandle("JPH_BodyCreationSettings_GetAngularDamping", JAVA_FLOAT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_BodyCreationSettings_SetAngularDamping", ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY = downcallHandle("JPH_BodyCreationSettings_GetMaxLinearVelocity", JAVA_FLOAT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMaxLinearVelocity", ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY = downcallHandle("JPH_BodyCreationSettings_GetMaxAngularVelocity", JAVA_FLOAT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMaxAngularVelocity", ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR = downcallHandle("JPH_BodyCreationSettings_GetGravityFactor", JAVA_FLOAT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_BodyCreationSettings_SetGravityFactor", ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandle("JPH_BodyCreationSettings_GetNumVelocityStepsOverride", JAVA_INT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetNumVelocityStepsOverride", ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE = downcallHandle("JPH_BodyCreationSettings_GetNumPositionStepsOverride", JAVA_INT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetNumPositionStepsOverride", ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES = downcallHandle("JPH_BodyCreationSettings_GetOverrideMassProperties", JAVA_INT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES = downcallHandleVoid("JPH_BodyCreationSettings_SetOverrideMassProperties", ADDRESS, JAVA_INT);
		JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER = downcallHandle("JPH_BodyCreationSettings_GetInertiaMultiplier", JAVA_FLOAT, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER = downcallHandleVoid("JPH_BodyCreationSettings_SetInertiaMultiplier", ADDRESS, JAVA_FLOAT);
		JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_GetMassPropertiesOverride", ADDRESS, ADDRESS);
		JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetMassPropertiesOverride", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected BodyCreationSettings() {
		try {
			Arena arena = Arena.ofAuto();
			quatTmp = new Quat(arena);
			vecTmp = new Vec3(arena);

			MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphBodyCreationSettings = segment.reinterpret(arena, s -> destroy(s));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create BodyCreationSettings.");
		}
	}

	public BodyCreationSettings(ShapeSettings settings, Vector3f position, Quaternionf rotation, MotionType motionType,
			int objectLayer) {
		try {
			Arena arena = Arena.ofAuto();
			quatTmp = new Quat(arena);
			vecTmp = new Vec3(arena);

			vecTmp.set(position);
			quatTmp.set(rotation);

			MemorySegment settAddr = settings.memorySegment();
			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment rotAddr = quatTmp.memorySegment();

			int mtId = motionType.id();

			MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE2;
			MemorySegment segment = (MemorySegment) method.invokeExact(settAddr, posAddr, rotAddr, mtId, objectLayer);
			jphBodyCreationSettings = segment.reinterpret(arena, s -> destroy(s));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create BodyCreationSettings.");
		}
	}

	public BodyCreationSettings(Shape shape, Vector3f position, Quaternionf rotation, MotionType motionType,
			int objectLayer) {

		try {
			Arena arena = Arena.ofAuto();
			quatTmp = new Quat(arena);
			vecTmp = new Vec3(arena);

			vecTmp.set(position);
			quatTmp.set(rotation);

			MemorySegment shapeAddr = shape.memorySegment();
			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment rotAddr = quatTmp.memorySegment();

			int mtId = motionType.id();

			MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE3;
			MemorySegment segment = (MemorySegment) method.invokeExact(shapeAddr, posAddr, rotAddr, mtId, objectLayer);
			jphBodyCreationSettings = segment.reinterpret(arena, s -> destroy(s));
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create BodyCreationSettings.");
		}

	}

	private static void destroy(MemorySegment segment) {
		try {
			JPH_BODY_CREATION_SETTINGS_DESTROY.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy BodyCreationSettings.");
		}
	}

	/**
	 * Position of the body (not of the center of mass)
	 */
	public Vector3f getPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_POSITION;
			method.invokeExact(jphBodyCreationSettings, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get position.");
		}
	}

	/**
	 * Position of the body (not of the center of mass)
	 */
	public Vector3f getPosition() {
		return getPosition(new Vector3f());
	}

	/**
	 * Position of the body (not of the center of mass)
	 */
	public void setPosition(Vector3f position) {
		setPosition(position.x, position.y, position.z);
	}

	/**
	 * Position of the body (not of the center of mass)
	 */
	public void setPosition(float x, float y, float z) {
		try {
			vecTmp.set(x, y, z);

			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_POSITION;
			method.invokeExact(jphBodyCreationSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set position.");
		}
	}

	/**
	 * Rotation of the body.
	 */
	public Quaternionf getRotation(Quaternionf target) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ROTATION;
			method.invokeExact(jphBodyCreationSettings, quatTmp.memorySegment());
			return quatTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get rotation.");
		}
	}

	/**
	 * Rotation of the body.
	 */
	public Quaternionf getRotation() {
		return getRotation(new Quaternionf());
	}

	/**
	 * Rotation of the body.
	 */
	public void setRotation(Quaternionf rotation) {
		try {
			quatTmp.set(rotation);

			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ROTATION;
			method.invokeExact(jphBodyCreationSettings, quatTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set rotation.");
		}
	}

	/**
	 * World space linear velocity of the center of mass (m/s)
	 */
	public Vector3f getLinearVelocity(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY;
			method.invokeExact(jphBodyCreationSettings, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get linear velocity.");
		}
	}

	/**
	 * World space linear velocity of the center of mass (m/s)
	 */
	public Vector3f getLinearVelocity() {
		return getLinearVelocity(new Vector3f());
	}

	/**
	 * World space linear velocity of the center of mass (m/s)
	 */
	public void setLinearVelocity(Vector3f linearVelocity) {
		setLinearVelocity(linearVelocity.x, linearVelocity.y, linearVelocity.z);
	}

	/**
	 * World space linear velocity of the center of mass (m/s)
	 */
	public void setLinearVelocity(float x, float y, float z) {
		try {
			vecTmp.set(x, y, z);

			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY;
			method.invokeExact(jphBodyCreationSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set linear velocity.");
		}
	}

	/**
	 * World space angular velocity (rad/s)
	 */
	public Vector3f getAngularVelocity(Vector3f target) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY;
			method.invokeExact(jphBodyCreationSettings, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get angular velocity.");
		}
	}

	/**
	 * World space angular velocity (rad/s)
	 */
	public Vector3f getAngularVelocity() {
		return getAngularVelocity(new Vector3f());
	}

	/**
	 * World space angular velocity (rad/s)
	 */
	public void setAngularVelocity(Vector3f angularVelocity) {
		setAngularVelocity(angularVelocity.x, angularVelocity.y, angularVelocity.z);
	}

	/**
	 * World space angular velocity (rad/s)
	 */
	public void setAngularVelocity(float x, float y, float z) {
		try {
			vecTmp.set(x, y, z);

			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY;
			method.invokeExact(jphBodyCreationSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set angular velocity.");
		}
	}

	/**
	 * User data value (can be used by application)
	 */
	public long getUserData() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_USER_DATA;
			return (long) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get user data.");
		}
	}

	/**
	 * User data value (can be used by application)
	 */
	public void setUserData(long value) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_USER_DATA;
			method.invokeExact(jphBodyCreationSettings, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set user data.");
		}
	}

	/**
	 * The collision layer this body belongs to (determines if two objects can
	 * collide)
	 */
	public int getObjectLayer() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER;
			return (int) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get object layer.");
		}
	}

	/**
	 * The collision layer this body belongs to (determines if two objects can
	 * collide)
	 */
	public void setObjectLayer(int objectLayer) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER;
			method.invokeExact(jphBodyCreationSettings, objectLayer);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set object layer.");
		}
	}

	/**
	 * The collision group this body belongs to (determines if two objects can
	 * collide)
	 */
	public CollisionGroup getCollisiongroup(CollisionGroup target) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP;
			method.invokeExact(jphBodyCreationSettings, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get collision group.");
		}
	}

	/**
	 * The collision group this body belongs to (determines if two objects can
	 * collide)
	 */
	public CollisionGroup getCollisionGroup() {
		return getCollisiongroup(new CollisionGroup());
	}

	/**
	 * The collision group this body belongs to (determines if two objects can
	 * collide)
	 */
	public void setCollisionGroup(CollisionGroup collisionGroup) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP;
			method.invokeExact(jphBodyCreationSettings, collisionGroup.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set collision group.");
		}
	}

	/**
	 * Motion type, determines if the object is static, dynamic or kinematic.
	 */
	public MotionType getMotionType() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE;
			int type = (int) method.invokeExact(jphBodyCreationSettings);

			if (type == MotionType.DYNAMIC.id())
				return MotionType.DYNAMIC;
			else if (type == MotionType.KINEMATIC.id())
				return MotionType.KINEMATIC;
			else
				return MotionType.STATIC;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get motion type.");
		}
	}

	/**
	 * Motion type, determines if the object is static, dynamic or kinematic.
	 */
	public void setMotionType(MotionType motionType) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE;
			method.invokeExact(jphBodyCreationSettings, motionType.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set motion type.");
		}
	}

	/**
	 * Which degrees of freedom this body has (can be used to limit simulation to
	 * 2D)
	 */
	public int getAllowedDOFs() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS;
			return (int) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get allowed DOFs.");
		}
	}

	/**
	 * Which degrees of freedom this body has (can be used to limit simulation to
	 * 2D)
	 */
	public void setAllowedDOFs(AllowedDOFs allowedDOFs) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS;
			method.invokeExact(jphBodyCreationSettings, allowedDOFs.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set allowed DOFs.");
		}
	}

	/**
	 * Which degrees of freedom this body has (can be used to limit simulation to
	 * 2D)
	 */
	public void setAllowedDOFs(AllowedDOFs... allowedDOFs) {
		try {
			int mask = 0;
			for (int i = 0; i < allowedDOFs.length; i++)
				mask |= allowedDOFs[i].id();

			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS;
			method.invokeExact(jphBodyCreationSettings, mask);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set allowed DOFs.");
		}
	}

	/**
	 * @see #setAllowDynamicOrKinematic(boolean)
	 */
	public boolean getAllowDynamicOrKinematic() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC;
			return (boolean) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if dynamic or kinematic is allowed.");
		}
	}

	/**
	 * When this body is created as static, this setting tells the system to create
	 * a MotionProperties object so that the object can be switched to kinematic or
	 * dynamic.
	 */
	public void setAllowDynamicOrKinematic(boolean allowDynamicOrKinematic) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC;
			method.invokeExact(jphBodyCreationSettings, allowDynamicOrKinematic);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set dynamic or kinematic allowed.");
		}
	}

	/**
	 * If this body is a sensor. A sensor will receive collision callbacks, but will
	 * not cause any collision responses and can be used as a trigger volume. See
	 * description at {@link Body#setIsSensor(boolean) Body.setIsSensor}
	 */
	public boolean isSensor() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR;
			return (boolean) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if is sensor.");
		}
	}

	/**
	 * @see #isSensor()
	 */
	public void setIsSensor(boolean isSensor) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR;
			method.invokeExact(jphBodyCreationSettings, isSensor);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set sensor.");
		}
	}

	/**
	 * @see #setCollideKinematicVsNonDynamic(boolean)
	 */
	public boolean getCollideKinematicVsNonDynamic() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
			return (boolean) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call getCollideKinematicVsNonDynamic.");
		}
	}

	/**
	 * If kinematic objects can generate contact points against other kinematic or
	 * static objects. See description at
	 * {@link Body#setCollideKinematicVsNonDynamic(boolean)}
	 */
	public void setCollideKinematicVsNonDynamic(boolean value) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
			method.invokeExact(jphBodyCreationSettings, value);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call setCollideKinematicVsNonDynamic.");
		}
	}

	/**
	 * If this body should use manifold reduction (see description at
	 * {@link Body#setUseManifoldReduction(boolean)})
	 */
	public boolean useManifoldReduction() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION;
			return (boolean) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if manifold reduction is used.");
		}
	}

	/**
	 * @see #useManifoldReduction()
	 */
	public void useManifoldReduction(boolean useManifoldReduction) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION;
			method.invokeExact(jphBodyCreationSettings, useManifoldReduction);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set if manifold reduction is used.");
		}
	}

	/**
	 * 
	 */
	public boolean getApplyGyroscopicForce() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE;
			return (boolean) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get ApplyGyroscopicForce.");
		}
	}

	/**
	 * Set to indicate that the gyroscopic force should be applied to this body (aka
	 * Dzhanibekov effect, see <a href=
	 * "https://en.wikipedia.org/wiki/Tennis_racket_theorem">https://en.wikipedia.org/wiki/Tennis_racket_theorem
	 * </a>
	 */
	public void setApplyGyroscopicForce(boolean applyGyroscopicForce) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE;
			method.invokeExact(jphBodyCreationSettings, applyGyroscopicForce);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set ApplyGyroscopicForce.");
		}
	}

	/**
	 * Motion quality, or how well it detects collisions when it has a high
	 * velocity.
	 */
	public MotionQuality getMotionQuality() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY;
			int motionQuality = (int) method.invokeExact(jphBodyCreationSettings);

			if (motionQuality == MotionQuality.DISCRETE.id())
				return MotionQuality.DISCRETE;
			else
				return MotionQuality.LINEAR_CAST;

		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get motion quality.");
		}
	}

	/**
	 * Motion quality, or how well it detects collisions when it has a high
	 * velocity.
	 */
	public void setMotionQuality(MotionQuality motionQuality) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY;
			method.invokeExact(jphBodyCreationSettings, motionQuality.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set motion quality.");
		}
	}

	/**
	 * Set to indicate that extra effort should be made to try to remove ghost
	 * contacts (collisions with internal edges of a mesh). This is more expensive
	 * but makes bodies move smoother over a mesh with convex edges.
	 */
	public boolean getEnhancedInternalEdgeRemoval() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
			return (boolean) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get EnhancedInternalEdgeRemoval.");
		}
	}

	/**
	 * @see #getEnhancedInternalEdgeRemoval()
	 */
	public void setEnhancedInternalEdgeRemoval(boolean enhancedInternalEdgeRemoval) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
			method.invokeExact(jphBodyCreationSettings, enhancedInternalEdgeRemoval);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set EnhancedInternalEdgeRemoval.");
		}
	}

	/**
	 * If this body can go to sleep or not.
	 */
	public boolean getAllowSleeping() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING;
			return (boolean) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get allow sleeping.");
		}
	}

	/**
	 * If this body can go to sleep or not.
	 */
	public void setAllowsleeping(boolean allowSleeping) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING;
			method.invokeExact(jphBodyCreationSettings, allowSleeping);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set allow sleeping.");
		}
	}

	/**
	 * Friction of the body (dimensionless number, usually between 0 and 1, 0 = no
	 * friction, 1 = friction force equals force that presses the two bodies
	 * together). Note that bodies can have negative friction but the combined
	 * friction (see PhysicsSystem::SetCombineFriction) should never go below zero.
	 */
	public float getFriction() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_FRICTION;
			return (float) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get friction.");
		}
	}

	/**
	 * @see #getFriction()
	 */
	public void setFriction(float friction) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_FRICTION;
			method.invokeExact(jphBodyCreationSettings, friction);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set friction.");
		}
	}

	/**
	 * Restitution of body (dimensionless number, usually between 0 and 1, 0 =
	 * completely inelastic collision response, 1 = completely elastic collision
	 * response). Note that bodies can have negative restitution but the combined
	 * restitution (see PhysicsSystem::SetCombineRestitution) should never go below
	 * zero.
	 */
	public float getRestitution() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION;
			return (float) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get restitution.");
		}
	}

	/**
	 * @see #getRestitution()
	 */
	public void setRestitution(float restitution) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION;
			method.invokeExact(jphBodyCreationSettings, restitution);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set restitution.");
		}
	}

	/**
	 * Linear damping: dv/dt = -c * v. c. Value should be zero or positive and is
	 * usually close to 0.
	 */
	public float getLinearDamping() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING;
			return (float) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get linear damping.");
		}
	}

	/**
	 * @see #getLinearDamping()
	 */
	public void setLinearDamping(float linearDamping) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING;
			method.invokeExact(jphBodyCreationSettings, linearDamping);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set linear damping.");
		}
	}

	/**
	 * Angular damping: dw/dt = -c * w. c. Value should be zero or positive and is
	 * usually close to 0.
	 */
	public float getAngularDamping() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING;
			return (float) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get angular damping.");
		}
	}

	/**
	 * @see #getAngularDamping()
	 */
	public void setAngularDamping(float angularDamping) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING;
			method.invokeExact(jphBodyCreationSettings, angularDamping);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set angular damping.");
		}
	}

	/**
	 * Maximum linear velocity that this body can reach (m/s)
	 */
	public float getMaxLinearVelocity() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY;
			return (float) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get max linear velocity.");
		}
	}

	/**
	 * Maximum linear velocity that this body can reach (m/s)
	 */
	public void setMaxLinearVelocity(float maxLinearVelocity) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY;
			method.invokeExact(jphBodyCreationSettings, maxLinearVelocity);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set max linear velocity.");
		}
	}

	/**
	 * Maximum angular velocity that this body can reach (rad/s)
	 */
	public float getMaxAngularVelocity() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY;
			return (float) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get max angular velocity.");
		}
	}

	/**
	 * Maximum angular velocity that this body can reach (rad/s)
	 */
	public void setMaxAngularVelocity(float maxAngularVelocity) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY;
			method.invokeExact(jphBodyCreationSettings, maxAngularVelocity);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set max angular velocity.");
		}
	}

	/**
	 * Value to multiply gravity with for this body.
	 */
	public float getGravityFactor() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR;
			return (float) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get gravity factor.");
		}
	}

	/**
	 * Value to multiply gravity with for this body.
	 */
	public void setGravityFactor(float gravityFactor) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR;
			method.invokeExact(jphBodyCreationSettings, gravityFactor);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set gravity factor.");
		}
	}

	/**
	 * Used only when this body is dynamic and colliding. Override for the number of
	 * solver velocity iterations to run, 0 means use the default in
	 * {@link PhysicsSettings#setNumVelocitySteps(int)} The number of iterations to
	 * use is the max of all contacts and constraints in the island.
	 */
	public int getNumVelocityStepsOverride() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE;
			return (int) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get number of velocity steps override.");
		}
	}

	/**
	 * @see #getNumVelocityStepsOverride()
	 */
	public void setNumVelocityStepsOverride(int numVelocityStepOverride) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE;
			method.invokeExact(jphBodyCreationSettings, numVelocityStepOverride);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set  number of velocity steps override.");
		}
	}

	/**
	 * Used only when this body is dynamic and colliding. Override for the number of
	 * solver position iterations to run, 0 means use the default in
	 * {@link PhysicsSettings#setNumPositionSteps(int)} The number of iterations to use is the
	 * max of all contacts and constraints in the island.
	 */
	public int getNumPositionStepsOverride() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE;
			return (int) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get number of position steps override.");
		}
	}

	/**
	 * @see #getNumPositionStepsOverride()
	 */
	public void setNumPositionStepsOverride(int numPositionStepsOverride) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE;
			method.invokeExact(jphBodyCreationSettings, numPositionStepsOverride);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set number of position steps override.");
		}
	}

	/**
	 * Determines how massPropertiesOverride will be used.
	 */
	public OverrideMassProperties getOverrideMassProperties() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES;
			int value = (int) method.invokeExact(jphBodyCreationSettings);

			if (value == OverrideMassProperties.CALCULATE_INERTIA.id())
				return OverrideMassProperties.CALCULATE_INERTIA;
			else if (value == OverrideMassProperties.CALCULATE_MASS_AND_INERTIA.id())
				return OverrideMassProperties.CALCULATE_MASS_AND_INERTIA;
			else
				return OverrideMassProperties.MASS_AND_INERTIA_PROVIDED;

		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get override mass properties.");
		}
	}

	/**
	 * Determines how massPropertiesOverride will be used.
	 */
	public void setOverrideMassProperties(OverrideMassProperties overrideMassProperties) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES;
			method.invokeExact(jphBodyCreationSettings, overrideMassProperties.id());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set override mass properties.");
		}
	}

	/**
	 * When calculating the inertia (not when it is provided) the calculated inertia will be multiplied by this value. 
	 */
	public float getInertiaMultiplier() {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER;
			return (float) method.invokeExact(jphBodyCreationSettings);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get inertia multiplier.");
		}
	}

	/**
	 * When calculating the inertia (not when it is provided) the calculated inertia will be multiplied by this value. 
	 */
	public void setInertiaMultiplier(float inertiaMultiplier) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER;
			method.invokeExact(jphBodyCreationSettings, inertiaMultiplier);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set inertia multiplier.");
		}
	}

	/**
	 * Contains replacement mass settings which override the automatically calculated values. 
	 */
	public MassProperties getMassPropertiesOverride(MassProperties target) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE;
			method.invokeExact(jphBodyCreationSettings, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get mass properties override.");
		}
	}

	/**
	 * Contains replacement mass settings which override the automatically calculated values. 
	 */
	public MassProperties getMassPropertiesOverride() {
		return getMassPropertiesOverride(new MassProperties());
	}

	/**
	 * Contains replacement mass settings which override the automatically calculated values. 
	 */
	public void setMassPropertiesOverride(MassProperties massProperties) {
		try {
			MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE;
			method.invokeExact(jphBodyCreationSettings, massProperties.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set mass properties override.");
		}
	}

	/**
	 * Do not store a reference to this memory segment.
	 * Otherwise the memory cannot be freed by the garbage collector.
	 */
	public MemorySegment memorySegment() {
		return jphBodyCreationSettings;
	}

}