/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.jolt.collision.CollisionGroup;
import volucris.bindings.jolt.collision.ObjectLayerFilter;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.collision.TransformedShape;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerFilter;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.collision.shape.ShapeRefConst;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.constraints.TwoBodyConstraint;
import volucris.bindings.jolt.constraints.TwoBodyConstraintSettings;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.softBody.SoftBodyCreationSettings;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BodyInterface {

	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_SOFT_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ASSIGN_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ASSIGN_BODY_ID1;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_UNASSIGN_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_UNASSIGN_BODY_IDS;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DESTROY_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DESTROY_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_REMOVE_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_IS_ADDED;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_BODIES_PREPARE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_BODIES_FINALIZE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_BODIES_ABORT;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_REMOVE_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ACTIVATE_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ACTIVATE_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DEACTIVATE_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DEACTIVATE_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_RESET_SLEEP_TIMER;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ACTIVATE_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_MOVE_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_POINT_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_FORCE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_FORCE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_IMPULSE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_BODY_TYPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_MOTION_TYPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_MOTION_TYPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_MOTION_QUALITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_MOTION_QUALITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_INVERSE_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_MAX_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_MAX_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_MAX_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_MAX_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_COLLISION_GROUP;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_COLLISION_GROUP;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_TRANSFORMED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_INTERFACE_CREATE_BODY = downcallHandle("JPH_BodyInterface_CreateBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_CREATE_SOFT_BODY = downcallHandle("JPH_BodyInterface_CreateSoftBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID = downcallHandle("JPH_BodyInterface_CreateBodyWithID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID = downcallHandle("JPH_BodyInterface_CreateSoftBodyWithID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID = downcallHandle("JPH_BodyInterface_CreateBodyWithoutID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID = downcallHandle("JPH_BodyInterface_CreateSoftBodyWithoutID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID = downcallHandleVoid("JPH_BodyInterface_DestroyBodyWithoutID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ASSIGN_BODY_ID = downcallHandle("JPH_BodyInterface_AssignBodyID", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ASSIGN_BODY_ID1 = downcallHandle("JPH_BodyInterface_AssignBodyID1", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_UNASSIGN_BODY_ID = downcallHandle("JPH_BodyInterface_UnassignBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_UNASSIGN_BODY_IDS = downcallHandleVoid("JPH_BodyInterface_UnassignBodyIDs", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_DESTROY_BODY = downcallHandleVoid("JPH_BodyInterface_DestroyBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_DESTROY_BODIES = downcallHandleVoid("JPH_BodyInterface_DestroyBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ADD_BODY = downcallHandleVoid("JPH_BodyInterface_AddBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_REMOVE_BODY = downcallHandleVoid("JPH_BodyInterface_RemoveBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_IS_ADDED = downcallHandle("JPH_BodyInterface_IsAdded", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY = downcallHandleVoid("JPH_BodyInterface_CreateAndAddBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY = downcallHandleVoid("JPH_BodyInterface_CreateAndAddSoftBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ADD_BODIES_PREPARE = downcallHandle("JPH_BodyInterface_AddBodiesPrepare", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ADD_BODIES_FINALIZE = downcallHandleVoid("JPH_BodyInterface_AddBodiesFinalize", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ADD_BODIES_ABORT = downcallHandleVoid("JPH_BodyInterface_AddBodiesAbort", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_REMOVE_BODIES = downcallHandleVoid("JPH_BodyInterface_RemoveBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ACTIVATE_BODY = downcallHandleVoid("JPH_BodyInterface_ActivateBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ACTIVATE_BODIES = downcallHandleVoid("JPH_BodyInterface_ActivateBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX = downcallHandleVoid("JPH_BodyInterface_ActivateBodiesInAABox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_DEACTIVATE_BODY = downcallHandleVoid("JPH_BodyInterface_DeactivateBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_DEACTIVATE_BODIES = downcallHandleVoid("JPH_BodyInterface_DeactivateBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_IS_ACTIVE = downcallHandle("JPH_BodyInterface_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_RESET_SLEEP_TIMER = downcallHandleVoid("JPH_BodyInterface_ResetSleepTimer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_CREATE_CONSTRAINT = downcallHandle("JPH_BodyInterface_CreateConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ACTIVATE_CONSTRAINT = downcallHandleVoid("JPH_BodyInterface_ActivateConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_SHAPE = downcallHandleVoid("JPH_BodyInterface_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_SHAPE = downcallHandleVoid("JPH_BodyInterface_SetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, JAVA_INT);
		JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED = downcallHandleVoid("JPH_BodyInterface_NotifyShapeChanged", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, JAVA_INT);
		JPH_BODY_INTERFACE_SET_OBJECT_LAYER = downcallHandleVoid("JPH_BodyInterface_SetObjectLayer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_BODY_INTERFACE_GET_OBJECT_LAYER = downcallHandle("JPH_BodyInterface_GetObjectLayer", JAVA_SHORT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_BodyInterface_SetPositionAndRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED = downcallHandleVoid("JPH_BodyInterface_SetPositionAndRotationWhenChanged", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_BodyInterface_GetPositionAndRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_POSITION = downcallHandleVoid("JPH_BodyInterface_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_POSITION = downcallHandleVoid("JPH_BodyInterface_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_BodyInterface_GetCenterOfMassPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_ROTATION = downcallHandleVoid("JPH_BodyInterface_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_ROTATION = downcallHandleVoid("JPH_BodyInterface_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_BodyInterface_GetWorldTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_BodyInterface_GetCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_MOVE_KINEMATIC = downcallHandleVoid("JPH_BodyInterface_MoveKinematic", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetLinearAndAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetLinearAndAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_AddLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_AddLinearAndAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_POINT_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetPointVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetPositionRotationAndVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ADD_FORCE = downcallHandleVoid("JPH_BodyInterface_AddForce", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ADD_FORCE1 = downcallHandleVoid("JPH_BodyInterface_AddForce1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ADD_TORQUE = downcallHandleVoid("JPH_BodyInterface_AddTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE = downcallHandleVoid("JPH_BodyInterface_AddForceAndTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_ADD_IMPULSE = downcallHandleVoid("JPH_BodyInterface_AddImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ADD_IMPULSE1 = downcallHandleVoid("JPH_BodyInterface_AddImpulse1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE = downcallHandleVoid("JPH_BodyInterface_AddAngularImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE = downcallHandle("JPH_BodyInterface_ApplyBuoyancyImpulse", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_GET_BODY_TYPE = downcallHandle("JPH_BodyInterface_GetBodyType", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_MOTION_TYPE = downcallHandleVoid("JPH_BodyInterface_SetMotionType", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BODY_INTERFACE_GET_MOTION_TYPE = downcallHandle("JPH_BodyInterface_GetMotionType", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_MOTION_QUALITY = downcallHandleVoid("JPH_BodyInterface_SetMotionQuality", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_INTERFACE_GET_MOTION_QUALITY = downcallHandle("JPH_BodyInterface_GetMotionQuality", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_INVERSE_INERTIA = downcallHandleVoid("JPH_BodyInterface_GetInverseInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_RESTITUTION = downcallHandleVoid("JPH_BodyInterface_SetRestitution", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_GET_RESTITUTION = downcallHandle("JPH_BodyInterface_GetRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_FRICTION = downcallHandleVoid("JPH_BodyInterface_SetFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_GET_FRICTION = downcallHandle("JPH_BodyInterface_GetFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_BodyInterface_SetGravityFactor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR = downcallHandle("JPH_BodyInterface_GetGravityFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_MAX_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetMaxLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_GET_MAX_LINEAR_VELOCITY = downcallHandle("JPH_BodyInterface_GetMaxLinearVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_MAX_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetMaxAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_INTERFACE_GET_MAX_ANGULAR_VELOCITY = downcallHandle("JPH_BodyInterface_GetMaxAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_BodyInterface_SetUseManifoldReduction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_BodyInterface_GetUseManifoldReduction", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_IS_SENSOR = downcallHandleVoid("JPH_BodyInterface_SetIsSensor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_INTERFACE_IS_SENSOR = downcallHandle("JPH_BodyInterface_IsSensor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyInterface_SetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_COLLISION_GROUP = downcallHandle("JPH_BodyInterface_GetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_TRANSFORMED_SHAPE = downcallHandleVoid("JPH_BodyInterface_GetTransformedShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_GET_USER_DATA = downcallHandle("JPH_BodyInterface_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_SET_USER_DATA = downcallHandleVoid("JPH_BodyInterface_SetUserData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_BODY_INTERFACE_GET_MATERIAL = downcallHandle("JPH_BodyInterface_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE = downcallHandleVoid("JPH_BodyInterface_InvalidateContactCache", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BodyInterface(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Create a rigid body
    /// @return Created body or null when out of bodies
    /// ```
    public static MemorySegment createBody(
    	MemorySegment self,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createBody].
    public final @Nullable Body createBody(
    	BodyCreationSettings inSettings
    ) {
    	MemorySegment segment = createBody(
    		this.segment,
    		inSettings.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    /// ```
    /// Create a soft body
    /// @return Created body or null when out of bodies
    /// ```
    public static MemorySegment createSoftBody(
    	MemorySegment self,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createSoftBody].
    public final @Nullable Body createSoftBody(
    	SoftBodyCreationSettings inSettings
    ) {
    	MemorySegment segment = createSoftBody(
    		this.segment,
    		inSettings.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    /// ```
    /// Create a rigid body with specified ID. This function can be used if a simulation is to run in sync between clients or if a simulation needs to be restored exactly.
    /// The ID created on the server can be replicated to the client and used to create a deterministic simulation.
    /// @return Created body or null when the body ID is invalid or a body of the same ID already exists.
    /// ```
    public static MemorySegment createBodyWithID(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBodyID,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createBodyWithID].
    public final @Nullable Body createBodyWithID(
    	BodyID inBodyID,
    	BodyCreationSettings inSettings
    ) {
    	MemorySegment segment = createBodyWithID(
    		this.segment,
    		inBodyID.memorySegment(),
    		inSettings.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    /// ```
    /// Create a soft body with specified ID. See comments at CreateBodyWithID.
    /// ```
    public static MemorySegment createSoftBodyWithID(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBodyID,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createSoftBodyWithID].
    public final @Nullable Body createSoftBodyWithID(
    	BodyID inBodyID,
    	SoftBodyCreationSettings inSettings
    ) {
    	MemorySegment segment = createSoftBodyWithID(
    		this.segment,
    		inBodyID.memorySegment(),
    		inSettings.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    /// ```
    /// Advanced use only. Creates a rigid body without specifying an ID. This body cannot be added to the physics system until it has been assigned a body ID.
    /// This can be used to decouple allocation from registering the body. A call to CreateBodyWithoutID followed by AssignBodyID is equivalent to calling CreateBodyWithID.
    /// @return Created body
    /// ```
    public static MemorySegment createBodyWithoutID(
    	MemorySegment self,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createBodyWithoutID].
    public final @Nullable Body createBodyWithoutID(
    	BodyCreationSettings inSettings
    ) {
    	MemorySegment segment = createBodyWithoutID(
    		this.segment,
    		inSettings.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    /// ```
    /// Advanced use only. Creates a body without specifying an ID. See comments at CreateBodyWithoutID.
    /// ```
    public static MemorySegment createSoftBodyWithoutID(
    	MemorySegment self,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createSoftBodyWithoutID].
    public final @Nullable Body createSoftBodyWithoutID(
    	SoftBodyCreationSettings inSettings
    ) {
    	MemorySegment segment = createSoftBodyWithoutID(
    		this.segment,
    		inSettings.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    /// ```
    /// Advanced use only. Destroy a body previously created with CreateBodyWithoutID that hasn't gotten an ID yet through the AssignBodyID function,
    /// or a body that has had its body ID unassigned through UnassignBodyIDs. Bodies that have an ID should be destroyed through DestroyBody.
    /// ```
    public static void destroyBodyWithoutID(
    	MemorySegment self,
    	MemorySegment inBody
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyBodyWithoutID].
    public final void destroyBodyWithoutID(
    	Body inBody
    ) {
    	destroyBodyWithoutID(
    		this.segment,
    		inBody.memorySegment()
    	);
    }
    
    /// ```
    /// Advanced use only. Assigns the next available body ID to a body that was created using CreateBodyWithoutID. After this call, the body can be added to the physics system.
    /// @return false if the body already has an ID or out of body ids.
    /// ```
    public static boolean assignBodyID(
    	MemorySegment self,
    	MemorySegment ioBody
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ASSIGN_BODY_ID.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#assignBodyID].
    public final boolean assignBodyID(
    	Body ioBody
    ) {
    	return assignBodyID(
    		this.segment,
    		ioBody.memorySegment()
    	);
    }
    
    /// ```
    /// Advanced use only. Assigns a body ID to a body that was created using CreateBodyWithoutID. After this call, the body can be added to the physics system.
    /// @return false if the body already has an ID or if the ID is not valid.
    /// ```
    public static boolean assignBodyID1(
    	MemorySegment self,
    	MemorySegment ioBody,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ASSIGN_BODY_ID1.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#assignBodyID1].
    public final boolean assignBodyID1(
    	Body ioBody,
    	BodyID inBodyID
    ) {
    	return assignBodyID1(
    		this.segment,
    		ioBody.memorySegment(),
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// Advanced use only. See UnassignBodyIDs. Unassigns the ID of a single body.
    /// ```
    public static MemorySegment unassignBodyID(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_UNASSIGN_BODY_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#unassignBodyID].
    public final @Nullable Body unassignBodyID(
    	BodyID inBodyID
    ) {
    	MemorySegment segment = unassignBodyID(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    /// ```
    /// Advanced use only. Removes a number of body IDs from their bodies and returns the body pointers. Before calling this, the body should have been removed from the physics system.
    /// The body can be destroyed through DestroyBodyWithoutID. This can be used to decouple deallocation. A call to UnassignBodyIDs followed by calls to DestroyBodyWithoutID is equivalent to calling DestroyBodies.
    /// @param inBodyIDs A list of body IDs
    /// @param inNumber Number of bodies in the list
    /// @param outBodies If not null on input, this will contain a list of body pointers corresponding to inBodyIDs that can be destroyed afterwards (caller assumes ownership over these).
    /// ```
    public static void unassignBodyIDs(
    	MemorySegment self,
    	MemorySegment inBodyIDs,
    	int inNumber,
    	MemorySegment outBodies
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_UNASSIGN_BODY_IDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyIDs,
    			inNumber,
    			outBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#unassignBodyIDs].
    public final void unassignBodyIDs(
    	BodyID inBodyIDs,
    	int inNumber,
    	NativePointerArray outBodies
    ) {
    	unassignBodyIDs(
    		this.segment,
    		inBodyIDs.memorySegment(),
    		inNumber,
    		outBodies.memorySegment()
    	);
    }
    
    /// ```
    /// Destroy a body.
    /// Make sure that you remove the body from the physics system using BodyInterface::RemoveBody before calling this function.
    /// ```
    public static void destroyBody(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_DESTROY_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyBody].
    public final void destroyBody(
    	BodyID inBodyID
    ) {
    	destroyBody(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// Destroy multiple bodies
    /// Make sure that you remove the bodies from the physics system using BodyInterface::RemoveBody before calling this function.
    /// ```
    public static void destroyBodies(
    	MemorySegment self,
    	MemorySegment inBodyIDs,
    	int inNumber
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_DESTROY_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyIDs,
    			inNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroyBodies].
    public final void destroyBodies(
    	BodyID inBodyIDs,
    	int inNumber
    ) {
    	destroyBodies(
    		this.segment,
    		inBodyIDs.memorySegment(),
    		inNumber
    	);
    }
    
    /// ```
    /// Add body to the physics system.
    /// Note that if you need to add multiple bodies, use the AddBodiesPrepare/AddBodiesFinalize function.
    /// Adding many bodies, one at a time, results in a really inefficient broadphase until PhysicsSystem::OptimizeBroadPhase is called or when PhysicsSystem::Update rebuilds the tree!
    /// After adding, to get a body by ID use the BodyLockRead or BodyLockWrite interface!
    /// ```
    public static void addBody(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addBody].
    public final void addBody(
    	BodyID inBodyID,
    	int inActivationMode
    ) {
    	addBody(
    		this.segment,
    		inBodyID.memorySegment(),
    		inActivationMode
    	);
    }
    
    /// ```
    /// Remove body from the physics system. Note that you need to add a body to the physics system before you can remove it.
    /// ```
    public static void removeBody(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_REMOVE_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#removeBody].
    public final void removeBody(
    	BodyID inBodyID
    ) {
    	removeBody(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// Check if a body has been added to the physics system.
    /// ```
    public static boolean isAdded(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_IS_ADDED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isAdded].
    public final boolean isAdded(
    	BodyID inBodyID
    ) {
    	return isAdded(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// Combines CreateBody and AddBody
    /// @return Created body ID or an invalid ID when out of bodies
    /// ```
    public static void createAndAddBody(
    	MemorySegment self,
    	MemorySegment inSettings,
    	int inActivationMode,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSettings,
    			inActivationMode,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createAndAddBody].
    public final void createAndAddBody(
    	BodyCreationSettings inSettings,
    	int inActivationMode,
    	BodyID outResult
    ) {
    	createAndAddBody(
    		this.segment,
    		inSettings.memorySegment(),
    		inActivationMode,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Combines CreateSoftBody and AddBody
    /// @return Created body ID or an invalid ID when out of bodies
    /// ```
    public static void createAndAddSoftBody(
    	MemorySegment self,
    	MemorySegment inSettings,
    	int inActivationMode,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSettings,
    			inActivationMode,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createAndAddSoftBody].
    public final void createAndAddSoftBody(
    	SoftBodyCreationSettings inSettings,
    	int inActivationMode,
    	BodyID outResult
    ) {
    	createAndAddSoftBody(
    		this.segment,
    		inSettings.memorySegment(),
    		inActivationMode,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Prepare adding inNumber bodies at ioBodies to the PhysicsSystem, returns a handle that should be used in AddBodiesFinalize/Abort.
    /// This can be done on a background thread without influencing the PhysicsSystem.
    /// ioBodies may be shuffled around by this function and should be kept that way until AddBodiesFinalize/Abort is called.
    /// ```
    public static MemorySegment addBodiesPrepare(
    	MemorySegment self,
    	MemorySegment ioBodies,
    	int inNumber
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_BODIES_PREPARE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			ioBodies,
    			inNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addBodiesPrepare].
    public final @Nullable MemorySegment addBodiesPrepare(
    	BodyID ioBodies,
    	int inNumber
    ) {
    	MemorySegment segment = addBodiesPrepare(
    		this.segment,
    		ioBodies.memorySegment(),
    		inNumber
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// Finalize adding bodies to the PhysicsSystem, supply the return value of AddBodiesPrepare in inAddState.
    /// Please ensure that the ioBodies array passed to AddBodiesPrepare is unmodified and passed again to this function.
    /// ```
    public static void addBodiesFinalize(
    	MemorySegment self,
    	MemorySegment ioBodies,
    	int inNumber,
    	MemorySegment inAddState,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_BODIES_FINALIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioBodies,
    			inNumber,
    			inAddState,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addBodiesFinalize].
    public final void addBodiesFinalize(
    	BodyID ioBodies,
    	int inNumber,
    	MemorySegment inAddState,
    	int inActivationMode
    ) {
    	addBodiesFinalize(
    		this.segment,
    		ioBodies.memorySegment(),
    		inNumber,
    		inAddState,
    		inActivationMode
    	);
    }
    
    /// ```
    /// Abort adding bodies to the PhysicsSystem, supply the return value of AddBodiesPrepare in inAddState.
    /// This can be done on a background thread without influencing the PhysicsSystem.
    /// Please ensure that the ioBodies array passed to AddBodiesPrepare is unmodified and passed again to this function.
    /// ```
    public static void addBodiesAbort(
    	MemorySegment self,
    	MemorySegment ioBodies,
    	int inNumber,
    	MemorySegment inAddState
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_BODIES_ABORT.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioBodies,
    			inNumber,
    			inAddState
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addBodiesAbort].
    public final void addBodiesAbort(
    	BodyID ioBodies,
    	int inNumber,
    	MemorySegment inAddState
    ) {
    	addBodiesAbort(
    		this.segment,
    		ioBodies.memorySegment(),
    		inNumber,
    		inAddState
    	);
    }
    
    /// ```
    /// Remove inNumber bodies in ioBodies from the PhysicsSystem. Note that bodies need to be added to the physics system before they can be removed.
    /// ioBodies may be shuffled around by this function.
    /// ```
    public static void removeBodies(
    	MemorySegment self,
    	MemorySegment ioBodies,
    	int inNumber
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_REMOVE_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioBodies,
    			inNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#removeBodies].
    public final void removeBodies(
    	BodyID ioBodies,
    	int inNumber
    ) {
    	removeBodies(
    		this.segment,
    		ioBodies.memorySegment(),
    		inNumber
    	);
    }
    
    /// ```
    /// @name Activate / deactivate a body. Note that you need to add a body to the physics system before you can activate it.
    /// @{
    /// ```
    public static void activateBody(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#activateBody].
    public final void activateBody(
    	BodyID inBodyID
    ) {
    	activateBody(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    public static void activateBodies(
    	MemorySegment self,
    	MemorySegment inBodyIDs,
    	int inNumber
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyIDs,
    			inNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#activateBodies].
    public final void activateBodies(
    	BodyID inBodyIDs,
    	int inNumber
    ) {
    	activateBodies(
    		this.segment,
    		inBodyIDs.memorySegment(),
    		inNumber
    	);
    }
    
    public static void activateBodiesInAABox(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#activateBodiesInAABox].
    public final void activateBodiesInAABox(
    	AABox inBox,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter
    ) {
    	activateBodiesInAABox(
    		this.segment,
    		inBox.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment()
    	);
    }
    
    public static void deactivateBody(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_DEACTIVATE_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#deactivateBody].
    public final void deactivateBody(
    	BodyID inBodyID
    ) {
    	deactivateBody(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    public static void deactivateBodies(
    	MemorySegment self,
    	MemorySegment inBodyIDs,
    	int inNumber
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_DEACTIVATE_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyIDs,
    			inNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#deactivateBodies].
    public final void deactivateBodies(
    	BodyID inBodyIDs,
    	int inNumber
    ) {
    	deactivateBodies(
    		this.segment,
    		inBodyIDs.memorySegment(),
    		inNumber
    	);
    }
    
    public static boolean isActive(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_IS_ACTIVE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isActive].
    public final boolean isActive(
    	BodyID inBodyID
    ) {
    	return isActive(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    public static void resetSleepTimer(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_RESET_SLEEP_TIMER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetSleepTimer].
    public final void resetSleepTimer(
    	BodyID inBodyID
    ) {
    	resetSleepTimer(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// Create a two body constraint
    /// ```
    public static MemorySegment createConstraint(
    	MemorySegment self,
    	MemorySegment inSettings,
    	MemorySegment inBodyID1,
    	MemorySegment inBodyID2
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_CREATE_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inSettings,
    			inBodyID1,
    			inBodyID2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createConstraint].
    public final @Nullable TwoBodyConstraint createConstraint(
    	TwoBodyConstraintSettings inSettings,
    	BodyID inBodyID1,
    	BodyID inBodyID2
    ) {
    	MemorySegment segment = createConstraint(
    		this.segment,
    		inSettings.memorySegment(),
    		inBodyID1.memorySegment(),
    		inBodyID2.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TwoBodyConstraint(segment);
    }
    
    /// ```
    /// Activate non-static bodies attached to a constraint.
    /// Note that the bodies involved in the constraint should be added to the physics system before activating a constraint.
    /// ```
    public static void activateConstraint(
    	MemorySegment self,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#activateConstraint].
    public final void activateConstraint(
    	TwoBodyConstraint inConstraint
    ) {
    	activateConstraint(
    		this.segment,
    		inConstraint.memorySegment()
    	);
    }
    
    /// ```
    /// Get the current shape
    /// ```
    public static void getShape(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShape].
    public final void getShape(
    	BodyID inBodyID,
    	ShapeRefConst outResult
    ) {
    	getShape(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set a new shape on the body
    /// @param inBodyID Body ID of body that had its shape changed
    /// @param inShape The new shape
    /// @param inUpdateMassProperties When true, the mass and inertia tensor is recalculated
    /// @param inActivationMode Whether or not to activate the body
    /// ```
    public static void setShape(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inShape,
    	boolean inUpdateMassProperties,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inShape,
    			inUpdateMassProperties,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape].
    public final void setShape(
    	BodyID inBodyID,
    	Shape inShape,
    	boolean inUpdateMassProperties,
    	int inActivationMode
    ) {
    	setShape(
    		this.segment,
    		inBodyID.memorySegment(),
    		inShape.memorySegment(),
    		inUpdateMassProperties,
    		inActivationMode
    	);
    }
    
    /// ```
    /// Notify all systems to indicate that a shape has changed (usable for MutableCompoundShapes)
    /// @param inBodyID Body ID of body that had its shape changed
    /// @param inPreviousCenterOfMass Center of mass of the shape before the alterations
    /// @param inUpdateMassProperties When true, the mass and inertia tensor is recalculated
    /// @param inActivationMode Whether or not to activate the body
    /// ```
    public static void notifyShapeChanged(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inPreviousCenterOfMass,
    	boolean inUpdateMassProperties,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inPreviousCenterOfMass,
    			inUpdateMassProperties,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#notifyShapeChanged].
    public final void notifyShapeChanged(
    	BodyID inBodyID,
    	Vec3 inPreviousCenterOfMass,
    	boolean inUpdateMassProperties,
    	int inActivationMode
    ) {
    	notifyShapeChanged(
    		this.segment,
    		inBodyID.memorySegment(),
    		inPreviousCenterOfMass.memorySegment(),
    		inUpdateMassProperties,
    		inActivationMode
    	);
    }
    
    /// ```
    /// @name Object layer of a body
    /// @{
    /// ```
    public static void setObjectLayer(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	short inLayer
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_OBJECT_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setObjectLayer].
    public final void setObjectLayer(
    	BodyID inBodyID,
    	short inLayer
    ) {
    	setObjectLayer(
    		this.segment,
    		inBodyID.memorySegment(),
    		inLayer
    	);
    }
    
    public static short getObjectLayer(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_OBJECT_LAYER.get();
    	try {
    		return (short) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getObjectLayer].
    public final short getObjectLayer(
    	BodyID inBodyID
    ) {
    	return getObjectLayer(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Position and rotation of a body
    /// @{
    /// ```
    public static void setPositionAndRotation(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inPosition,
    			inRotation,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPositionAndRotation].
    public final void setPositionAndRotation(
    	BodyID inBodyID,
    	Vec3 inPosition,
    	Quat inRotation,
    	int inActivationMode
    ) {
    	setPositionAndRotation(
    		this.segment,
    		inBodyID.memorySegment(),
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inActivationMode
    	);
    }
    
    public static void setPositionAndRotationWhenChanged(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inPosition,
    			inRotation,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPositionAndRotationWhenChanged].
    public final void setPositionAndRotationWhenChanged(
    	BodyID inBodyID,
    	Vec3 inPosition,
    	Quat inRotation,
    	int inActivationMode
    ) {
    	setPositionAndRotationWhenChanged(
    		this.segment,
    		inBodyID.memorySegment(),
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inActivationMode
    	);
    }
    
    public static void getPositionAndRotation(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outPosition,
    	MemorySegment outRotation
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outPosition,
    			outRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPositionAndRotation].
    public final void getPositionAndRotation(
    	BodyID inBodyID,
    	Vec3 outPosition,
    	Quat outRotation
    ) {
    	getPositionAndRotation(
    		this.segment,
    		inBodyID.memorySegment(),
    		outPosition.memorySegment(),
    		outRotation.memorySegment()
    	);
    }
    
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inPosition,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inPosition,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	BodyID inBodyID,
    	Vec3 inPosition,
    	int inActivationMode
    ) {
    	setPosition(
    		this.segment,
    		inBodyID.memorySegment(),
    		inPosition.memorySegment(),
    		inActivationMode
    	);
    }
    
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	BodyID inBodyID,
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void getCenterOfMassPosition(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMassPosition].
    public final void getCenterOfMassPosition(
    	BodyID inBodyID,
    	Vec3 outResult
    ) {
    	getCenterOfMassPosition(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void setRotation(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inRotation,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inRotation,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotation].
    public final void setRotation(
    	BodyID inBodyID,
    	Quat inRotation,
    	int inActivationMode
    ) {
    	setRotation(
    		this.segment,
    		inBodyID.memorySegment(),
    		inRotation.memorySegment(),
    		inActivationMode
    	);
    }
    
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotation].
    public final void getRotation(
    	BodyID inBodyID,
    	Quat outResult
    ) {
    	getRotation(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void getWorldTransform(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldTransform].
    public final void getWorldTransform(
    	BodyID inBodyID,
    	Mat44 outResult
    ) {
    	getWorldTransform(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void getCenterOfMassTransform(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMassTransform].
    public final void getCenterOfMassTransform(
    	BodyID inBodyID,
    	Mat44 outResult
    ) {
    	getCenterOfMassTransform(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set velocity of body such that it will be positioned at inTargetPosition/Rotation in inDeltaTime seconds (will activate body if needed)
    /// ```
    public static void moveKinematic(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inTargetPosition,
    	MemorySegment inTargetRotation,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_MOVE_KINEMATIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inTargetPosition,
    			inTargetRotation,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#moveKinematic].
    public final void moveKinematic(
    	BodyID inBodyID,
    	Vec3 inTargetPosition,
    	Quat inTargetRotation,
    	float inDeltaTime
    ) {
    	moveKinematic(
    		this.segment,
    		inBodyID.memorySegment(),
    		inTargetPosition.memorySegment(),
    		inTargetRotation.memorySegment(),
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Linear or angular velocity (functions will activate body if needed).
    /// Note that the linear velocity is the velocity of the center of mass, which may not coincide with the position of your object, to correct for this: \f$VelocityCOM = Velocity - AngularVelocity \times ShapeCOM\f$
    /// ```
    public static void setLinearAndAngularVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inLinearVelocity,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inLinearVelocity,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearAndAngularVelocity].
    public final void setLinearAndAngularVelocity(
    	BodyID inBodyID,
    	Vec3 inLinearVelocity,
    	Vec3 inAngularVelocity
    ) {
    	setLinearAndAngularVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inLinearVelocity.memorySegment(),
    		inAngularVelocity.memorySegment()
    	);
    }
    
    public static void getLinearAndAngularVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outLinearVelocity,
    	MemorySegment outAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outLinearVelocity,
    			outAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearAndAngularVelocity].
    public final void getLinearAndAngularVelocity(
    	BodyID inBodyID,
    	Vec3 outLinearVelocity,
    	Vec3 outAngularVelocity
    ) {
    	getLinearAndAngularVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		outLinearVelocity.memorySegment(),
    		outAngularVelocity.memorySegment()
    	);
    }
    
    public static void setLinearVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public final void setLinearVelocity(
    	BodyID inBodyID,
    	Vec3 inLinearVelocity
    ) {
    	setLinearVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inLinearVelocity.memorySegment()
    	);
    }
    
    public static void getLinearVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity].
    public final void getLinearVelocity(
    	BodyID inBodyID,
    	Vec3 outResult
    ) {
    	getLinearVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void addLinearVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addLinearVelocity].
    public final void addLinearVelocity(
    	BodyID inBodyID,
    	Vec3 inLinearVelocity
    ) {
    	addLinearVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inLinearVelocity.memorySegment()
    	);
    }
    
    public static void addLinearAndAngularVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inLinearVelocity,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inLinearVelocity,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addLinearAndAngularVelocity].
    public final void addLinearAndAngularVelocity(
    	BodyID inBodyID,
    	Vec3 inLinearVelocity,
    	Vec3 inAngularVelocity
    ) {
    	addLinearAndAngularVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inLinearVelocity.memorySegment(),
    		inAngularVelocity.memorySegment()
    	);
    }
    
    public static void setAngularVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity].
    public final void setAngularVelocity(
    	BodyID inBodyID,
    	Vec3 inAngularVelocity
    ) {
    	setAngularVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inAngularVelocity.memorySegment()
    	);
    }
    
    public static void getAngularVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public final void getAngularVelocity(
    	BodyID inBodyID,
    	Vec3 outResult
    ) {
    	getAngularVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void getPointVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inPoint,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_POINT_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inPoint,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPointVelocity].
    public final void getPointVelocity(
    	BodyID inBodyID,
    	Vec3 inPoint,
    	Vec3 outResult
    ) {
    	getPointVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inPoint.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the complete motion state of a body.
    /// Note that the linear velocity is the velocity of the center of mass, which may not coincide with the position of your object, to correct for this: \f$VelocityCOM = Velocity - AngularVelocity \times ShapeCOM\f$
    /// ```
    public static void setPositionRotationAndVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inLinearVelocity,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inPosition,
    			inRotation,
    			inLinearVelocity,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPositionRotationAndVelocity].
    public final void setPositionRotationAndVelocity(
    	BodyID inBodyID,
    	Vec3 inPosition,
    	Quat inRotation,
    	Vec3 inLinearVelocity,
    	Vec3 inAngularVelocity
    ) {
    	setPositionRotationAndVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inLinearVelocity.memorySegment(),
    		inAngularVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// @name Add forces to the body. Note that you should add a body to the physics system before applying forces or torques.
    /// @{
    /// ```
    public static void addForce(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inForce,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inForce,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addForce].
    public final void addForce(
    	BodyID inBodyID,
    	Vec3 inForce,
    	int inActivationMode
    ) {
    	addForce(
    		this.segment,
    		inBodyID.memorySegment(),
    		inForce.memorySegment(),
    		inActivationMode
    	);
    }
    
    public static void addForce1(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inForce,
    	MemorySegment inPoint,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inForce,
    			inPoint,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addForce1].
    public final void addForce1(
    	BodyID inBodyID,
    	Vec3 inForce,
    	Vec3 inPoint,
    	int inActivationMode
    ) {
    	addForce1(
    		this.segment,
    		inBodyID.memorySegment(),
    		inForce.memorySegment(),
    		inPoint.memorySegment(),
    		inActivationMode
    	);
    }
    
    public static void addTorque(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inTorque,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inTorque,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addTorque].
    public final void addTorque(
    	BodyID inBodyID,
    	Vec3 inTorque,
    	int inActivationMode
    ) {
    	addTorque(
    		this.segment,
    		inBodyID.memorySegment(),
    		inTorque.memorySegment(),
    		inActivationMode
    	);
    }
    
    public static void addForceAndTorque(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inForce,
    	MemorySegment inTorque,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inForce,
    			inTorque,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addForceAndTorque].
    public final void addForceAndTorque(
    	BodyID inBodyID,
    	Vec3 inForce,
    	Vec3 inTorque,
    	int inActivationMode
    ) {
    	addForceAndTorque(
    		this.segment,
    		inBodyID.memorySegment(),
    		inForce.memorySegment(),
    		inTorque.memorySegment(),
    		inActivationMode
    	);
    }
    
    /// ```
    /// @name Add an impulse to the body. Note that you should add a body to the physics system before applying impulses.
    /// @{
    /// ```
    public static void addImpulse(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inImpulse
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addImpulse].
    public final void addImpulse(
    	BodyID inBodyID,
    	Vec3 inImpulse
    ) {
    	addImpulse(
    		this.segment,
    		inBodyID.memorySegment(),
    		inImpulse.memorySegment()
    	);
    }
    
    public static void addImpulse1(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inImpulse,
    	MemorySegment inPoint
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_IMPULSE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inImpulse,
    			inPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addImpulse1].
    public final void addImpulse1(
    	BodyID inBodyID,
    	Vec3 inImpulse,
    	Vec3 inPoint
    ) {
    	addImpulse1(
    		this.segment,
    		inBodyID.memorySegment(),
    		inImpulse.memorySegment(),
    		inPoint.memorySegment()
    	);
    }
    
    public static void addAngularImpulse(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inAngularImpulse
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inAngularImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addAngularImpulse].
    public final void addAngularImpulse(
    	BodyID inBodyID,
    	Vec3 inAngularImpulse
    ) {
    	addAngularImpulse(
    		this.segment,
    		inBodyID.memorySegment(),
    		inAngularImpulse.memorySegment()
    	);
    }
    
    public static boolean applyBuoyancyImpulse(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inSurfacePosition,
    	MemorySegment inSurfaceNormal,
    	float inBuoyancy,
    	float inLinearDrag,
    	float inAngularDrag,
    	MemorySegment inFluidVelocity,
    	MemorySegment inGravity,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBodyID,
    			inSurfacePosition,
    			inSurfaceNormal,
    			inBuoyancy,
    			inLinearDrag,
    			inAngularDrag,
    			inFluidVelocity,
    			inGravity,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyBuoyancyImpulse].
    public final boolean applyBuoyancyImpulse(
    	BodyID inBodyID,
    	Vec3 inSurfacePosition,
    	Vec3 inSurfaceNormal,
    	float inBuoyancy,
    	float inLinearDrag,
    	float inAngularDrag,
    	Vec3 inFluidVelocity,
    	Vec3 inGravity,
    	float inDeltaTime
    ) {
    	return applyBuoyancyImpulse(
    		this.segment,
    		inBodyID.memorySegment(),
    		inSurfacePosition.memorySegment(),
    		inSurfaceNormal.memorySegment(),
    		inBuoyancy,
    		inLinearDrag,
    		inAngularDrag,
    		inFluidVelocity.memorySegment(),
    		inGravity.memorySegment(),
    		inDeltaTime
    	);
    }
    
    /// ```
    /// @name Body type
    /// @{
    /// ```
    public static int getBodyType(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_BODY_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyType].
    public final int getBodyType(
    	BodyID inBodyID
    ) {
    	return getBodyType(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Body motion type
    /// @{
    /// ```
    public static void setMotionType(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	int inMotionType,
    	int inActivationMode
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_MOTION_TYPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inMotionType,
    			inActivationMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotionType].
    public final void setMotionType(
    	BodyID inBodyID,
    	int inMotionType,
    	int inActivationMode
    ) {
    	setMotionType(
    		this.segment,
    		inBodyID.memorySegment(),
    		inMotionType,
    		inActivationMode
    	);
    }
    
    public static int getMotionType(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_MOTION_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionType].
    public final int getMotionType(
    	BodyID inBodyID
    ) {
    	return getMotionType(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Body motion quality
    /// @{
    /// ```
    public static void setMotionQuality(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	int inMotionQuality
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_MOTION_QUALITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inMotionQuality
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotionQuality].
    public final void setMotionQuality(
    	BodyID inBodyID,
    	int inMotionQuality
    ) {
    	setMotionQuality(
    		this.segment,
    		inBodyID.memorySegment(),
    		inMotionQuality
    	);
    }
    
    public static int getMotionQuality(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_MOTION_QUALITY.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionQuality].
    public final int getMotionQuality(
    	BodyID inBodyID
    ) {
    	return getMotionQuality(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// Get inverse inertia tensor in world space
    /// ```
    public static void getInverseInertia(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_INVERSE_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseInertia].
    public final void getInverseInertia(
    	BodyID inBodyID,
    	Mat44 outResult
    ) {
    	getInverseInertia(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @name Restitution
    /// @{
    /// ```
    public static void setRestitution(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	float inRestitution
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_RESTITUTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inRestitution
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRestitution].
    public final void setRestitution(
    	BodyID inBodyID,
    	float inRestitution
    ) {
    	setRestitution(
    		this.segment,
    		inBodyID.memorySegment(),
    		inRestitution
    	);
    }
    
    public static float getRestitution(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_RESTITUTION.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRestitution].
    public final float getRestitution(
    	BodyID inBodyID
    ) {
    	return getRestitution(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Friction
    /// @{
    /// ```
    public static void setFriction(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	float inFriction
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFriction].
    public final void setFriction(
    	BodyID inBodyID,
    	float inFriction
    ) {
    	setFriction(
    		this.segment,
    		inBodyID.memorySegment(),
    		inFriction
    	);
    }
    
    public static float getFriction(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFriction].
    public final float getFriction(
    	BodyID inBodyID
    ) {
    	return getFriction(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Gravity factor
    /// @{
    /// ```
    public static void setGravityFactor(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	float inGravityFactor
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inGravityFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGravityFactor].
    public final void setGravityFactor(
    	BodyID inBodyID,
    	float inGravityFactor
    ) {
    	setGravityFactor(
    		this.segment,
    		inBodyID.memorySegment(),
    		inGravityFactor
    	);
    }
    
    public static float getGravityFactor(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGravityFactor].
    public final float getGravityFactor(
    	BodyID inBodyID
    ) {
    	return getGravityFactor(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Max linear velocity
    /// @{
    /// ```
    public static void setMaxLinearVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	float inLinearVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_MAX_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxLinearVelocity].
    public final void setMaxLinearVelocity(
    	BodyID inBodyID,
    	float inLinearVelocity
    ) {
    	setMaxLinearVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inLinearVelocity
    	);
    }
    
    public static float getMaxLinearVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_MAX_LINEAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxLinearVelocity].
    public final float getMaxLinearVelocity(
    	BodyID inBodyID
    ) {
    	return getMaxLinearVelocity(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Max angular velocity
    /// @{
    /// ```
    public static void setMaxAngularVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	float inAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_MAX_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxAngularVelocity].
    public final void setMaxAngularVelocity(
    	BodyID inBodyID,
    	float inAngularVelocity
    ) {
    	setMaxAngularVelocity(
    		this.segment,
    		inBodyID.memorySegment(),
    		inAngularVelocity
    	);
    }
    
    public static float getMaxAngularVelocity(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_MAX_ANGULAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxAngularVelocity].
    public final float getMaxAngularVelocity(
    	BodyID inBodyID
    ) {
    	return getMaxAngularVelocity(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Manifold reduction
    /// @{
    /// ```
    public static void setUseManifoldReduction(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	boolean inUseReduction
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inUseReduction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUseManifoldReduction].
    public final void setUseManifoldReduction(
    	BodyID inBodyID,
    	boolean inUseReduction
    ) {
    	setUseManifoldReduction(
    		this.segment,
    		inBodyID.memorySegment(),
    		inUseReduction
    	);
    }
    
    public static boolean getUseManifoldReduction(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUseManifoldReduction].
    public final boolean getUseManifoldReduction(
    	BodyID inBodyID
    ) {
    	return getUseManifoldReduction(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Sensor
    /// @{
    /// ```
    public static void setIsSensor(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	boolean inIsSensor
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_IS_SENSOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inIsSensor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsSensor].
    public final void setIsSensor(
    	BodyID inBodyID,
    	boolean inIsSensor
    ) {
    	setIsSensor(
    		this.segment,
    		inBodyID.memorySegment(),
    		inIsSensor
    	);
    }
    
    public static boolean isSensor(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_IS_SENSOR.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSensor].
    public final boolean isSensor(
    	BodyID inBodyID
    ) {
    	return isSensor(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// @name Collision group
    /// @{
    /// ```
    public static void setCollisionGroup(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inCollisionGroup
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_COLLISION_GROUP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inCollisionGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollisionGroup].
    public final void setCollisionGroup(
    	BodyID inBodyID,
    	CollisionGroup inCollisionGroup
    ) {
    	setCollisionGroup(
    		this.segment,
    		inBodyID.memorySegment(),
    		inCollisionGroup.memorySegment()
    	);
    }
    
    public static MemorySegment getCollisionGroup(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_COLLISION_GROUP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollisionGroup].
    public final @Nullable CollisionGroup getCollisionGroup(
    	BodyID inBodyID
    ) {
    	MemorySegment segment = getCollisionGroup(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CollisionGroup(segment);
    }
    
    /// ```
    /// Get transform and shape for this body, used to perform collision detection
    /// ```
    public static void getTransformedShape(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_TRANSFORMED_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransformedShape].
    public final void getTransformedShape(
    	BodyID inBodyID,
    	TransformedShape outResult
    ) {
    	getTransformedShape(
    		this.segment,
    		inBodyID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the user data for a body
    /// ```
    public static long getUserData(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final long getUserData(
    	BodyID inBodyID
    ) {
    	return getUserData(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    public static void setUserData(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	long inUserData
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	BodyID inBodyID,
    	long inUserData
    ) {
    	setUserData(
    		this.segment,
    		inBodyID.memorySegment(),
    		inUserData
    	);
    }
    
    /// ```
    /// Get the material for a particular sub shape
    /// ```
    public static MemorySegment getMaterial(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_GET_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBodyID,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial].
    public final @Nullable PhysicsMaterial getMaterial(
    	BodyID inBodyID,
    	SubShapeID inSubShapeID
    ) {
    	MemorySegment segment = getMaterial(
    		this.segment,
    		inBodyID.memorySegment(),
    		inSubShapeID.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterial(segment);
    }
    
    /// ```
    /// Set the Body::EFlags::InvalidateContactCache flag for the specified body. This means that the collision cache is invalid for any body pair involving that body until the next physics step.
    /// ```
    public static void invalidateContactCache(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#invalidateContactCache].
    public final void invalidateContactCache(
    	BodyID inBodyID
    ) {
    	invalidateContactCache(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}