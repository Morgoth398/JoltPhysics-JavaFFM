/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.collision.CollisionGroup;
import volucris.bindings.jolt.collision.TransformedShape;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayer;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerInterface;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.softBody.SoftBodyCreationSettings;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Body {

	private static final LazyConstant<MethodHandle> JPH_BODY_GET_INACTIVE_INDEX;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_BODY_TYPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_RIGID_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_SOFT_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_STATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_CAN_BE_KINEMATIC_OR_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_SENSOR;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_USE_MANIFOLD_REDUCTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_USE_MANIFOLD_REDUCTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_USE_MANIFOLD_REDUCTION_WITH_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_APPLY_GYROSCOPIC_FORCE;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_APPLY_GYROSCOPIC_FORCE;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL_WITH_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_MOTION_TYPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_MOTION_TYPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_BROAD_PHASE_LAYER;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_COLLISION_GROUP;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_COLLISION_GROUP1;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_COLLISION_GROUP;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_BODY_RESET_SLEEP_TIMER;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_LINEAR_VELOCITY_CLAMPED;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_ANGULAR_VELOCITY_CLAMPED;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_POINT_VELOCITY_COM;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_POINT_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_BODY_ADD_FORCE;
	private static final LazyConstant<MethodHandle> JPH_BODY_ADD_FORCE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_ADD_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_ACCUMULATED_FORCE;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_ACCUMULATED_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_BODY_RESET_FORCE;
	private static final LazyConstant<MethodHandle> JPH_BODY_RESET_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_BODY_RESET_MOTION;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_INVERSE_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_BODY_ADD_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_BODY_ADD_IMPULSE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_ADD_ANGULAR_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_BODY_MOVE_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_SUBMERGED_VOLUME;
	private static final LazyConstant<MethodHandle> JPH_BODY_APPLY_BUOYANCY_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_BODY_APPLY_BUOYANCY_IMPULSE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_IN_BROAD_PHASE;
	private static final LazyConstant<MethodHandle> JPH_BODY_IS_COLLISION_CACHE_INVALID;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_CENTER_OF_MASS_POSITION;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_CENTER_OF_MASS_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_INVERSE_CENTER_OF_MASS_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_WORLD_SPACE_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_MOTION_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_MOTION_PROPERTIES1;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED1;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_TRANSFORMED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_BODY_CREATION_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_BODY_APPLY_BODY_CREATION_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_SOFT_BODY_CREATION_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_BODY_APPLY_SOFT_BODY_CREATION_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_BODY_S_FIND_COLLIDING_PAIRS_CAN_COLLIDE;
	private static final LazyConstant<MethodHandle> JPH_BODY_ADD_POSITION_STEP;
	private static final LazyConstant<MethodHandle> JPH_BODY_SUB_POSITION_STEP;
	private static final LazyConstant<MethodHandle> JPH_BODY_ADD_ROTATION_STEP;
	private static final LazyConstant<MethodHandle> JPH_BODY_SUB_ROTATION_STEP;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_OBJECT_LAYER_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_IN_BROAD_PHASE_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_INVALIDATE_CONTACT_CACHE_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_VALIDATE_CONTACT_CACHE_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_CALCULATE_WORLD_SPACE_BOUNDS_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_POSITION_AND_ROTATION_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_UPDATE_CENTER_OF_MASS_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_SET_SHAPE_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_INDEX_IN_ACTIVE_BODIES_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_UPDATE_SLEEP_STATE_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_BODY_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_RESTORE_STATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_GET_FIXED_TO_WORLD;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_GET_INACTIVE_INDEX = downcallHandle("JPH_Body_GetInactiveIndex", JAVA_INT);
		JPH_BODY_GET_ID = downcallHandle("JPH_Body_GetID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_BODY_TYPE = downcallHandle("JPH_Body_GetBodyType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_IS_RIGID_BODY = downcallHandle("JPH_Body_IsRigidBody", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_IS_SOFT_BODY = downcallHandle("JPH_Body_IsSoftBody", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_IS_ACTIVE = downcallHandle("JPH_Body_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_IS_STATIC = downcallHandle("JPH_Body_IsStatic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_IS_KINEMATIC = downcallHandle("JPH_Body_IsKinematic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_IS_DYNAMIC = downcallHandle("JPH_Body_IsDynamic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_CAN_BE_KINEMATIC_OR_DYNAMIC = downcallHandle("JPH_Body_CanBeKinematicOrDynamic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_IS_SENSOR = downcallHandleVoid("JPH_Body_SetIsSensor", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_IS_SENSOR = downcallHandle("JPH_Body_IsSensor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandleVoid("JPH_Body_SetCollideKinematicVsNonDynamic", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandle("JPH_Body_GetCollideKinematicVsNonDynamic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_Body_SetUseManifoldReduction", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_Body_GetUseManifoldReduction", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_USE_MANIFOLD_REDUCTION_WITH_BODY = downcallHandle("JPH_Body_GetUseManifoldReductionWithBody", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_APPLY_GYROSCOPIC_FORCE = downcallHandleVoid("JPH_Body_SetApplyGyroscopicForce", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_APPLY_GYROSCOPIC_FORCE = downcallHandle("JPH_Body_GetApplyGyroscopicForce", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_Body_SetEnhancedInternalEdgeRemoval", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_Body_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL_WITH_BODY = downcallHandle("JPH_Body_GetEnhancedInternalEdgeRemovalWithBody", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_MOTION_TYPE = downcallHandle("JPH_Body_GetMotionType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_MOTION_TYPE = downcallHandleVoid("JPH_Body_SetMotionType", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_GET_BROAD_PHASE_LAYER = downcallHandleVoid("JPH_Body_GetBroadPhaseLayer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_OBJECT_LAYER = downcallHandle("JPH_Body_GetObjectLayer", JAVA_SHORT, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_COLLISION_GROUP = downcallHandle("JPH_Body_GetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_COLLISION_GROUP1 = downcallHandle("JPH_Body_GetCollisionGroup1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_COLLISION_GROUP = downcallHandleVoid("JPH_Body_SetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_ALLOW_SLEEPING = downcallHandle("JPH_Body_GetAllowSleeping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_ALLOW_SLEEPING = downcallHandleVoid("JPH_Body_SetAllowSleeping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_RESET_SLEEP_TIMER = downcallHandleVoid("JPH_Body_ResetSleepTimer", UNBOUNDED_ADDRESS);
		JPH_BODY_GET_FRICTION = downcallHandle("JPH_Body_GetFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_FRICTION = downcallHandleVoid("JPH_Body_SetFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_GET_RESTITUTION = downcallHandle("JPH_Body_GetRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_RESTITUTION = downcallHandleVoid("JPH_Body_SetRestitution", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Body_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Body_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_LINEAR_VELOCITY_CLAMPED = downcallHandleVoid("JPH_Body_SetLinearVelocityClamped", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Body_GetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Body_SetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_ANGULAR_VELOCITY_CLAMPED = downcallHandleVoid("JPH_Body_SetAngularVelocityClamped", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_POINT_VELOCITY_COM = downcallHandleVoid("JPH_Body_GetPointVelocityCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_POINT_VELOCITY = downcallHandleVoid("JPH_Body_GetPointVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_ADD_FORCE = downcallHandleVoid("JPH_Body_AddForce", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_ADD_FORCE1 = downcallHandleVoid("JPH_Body_AddForce1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_ADD_TORQUE = downcallHandleVoid("JPH_Body_AddTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_ACCUMULATED_FORCE = downcallHandleVoid("JPH_Body_GetAccumulatedForce", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_ACCUMULATED_TORQUE = downcallHandleVoid("JPH_Body_GetAccumulatedTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_RESET_FORCE = downcallHandleVoid("JPH_Body_ResetForce", UNBOUNDED_ADDRESS);
		JPH_BODY_RESET_TORQUE = downcallHandleVoid("JPH_Body_ResetTorque", UNBOUNDED_ADDRESS);
		JPH_BODY_RESET_MOTION = downcallHandleVoid("JPH_Body_ResetMotion", UNBOUNDED_ADDRESS);
		JPH_BODY_GET_INVERSE_INERTIA = downcallHandleVoid("JPH_Body_GetInverseInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_ADD_IMPULSE = downcallHandleVoid("JPH_Body_AddImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_ADD_IMPULSE1 = downcallHandleVoid("JPH_Body_AddImpulse1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_ADD_ANGULAR_IMPULSE = downcallHandleVoid("JPH_Body_AddAngularImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_MOVE_KINEMATIC = downcallHandleVoid("JPH_Body_MoveKinematic", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_GET_SUBMERGED_VOLUME = downcallHandleVoid("JPH_Body_GetSubmergedVolume", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_APPLY_BUOYANCY_IMPULSE = downcallHandle("JPH_Body_ApplyBuoyancyImpulse", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_APPLY_BUOYANCY_IMPULSE1 = downcallHandle("JPH_Body_ApplyBuoyancyImpulse1", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BODY_IS_IN_BROAD_PHASE = downcallHandle("JPH_Body_IsInBroadPhase", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_IS_COLLISION_CACHE_INVALID = downcallHandle("JPH_Body_IsCollisionCacheInvalid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_SHAPE = downcallHandle("JPH_Body_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_POSITION = downcallHandleVoid("JPH_Body_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_ROTATION = downcallHandleVoid("JPH_Body_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_Body_GetWorldTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_Body_GetCenterOfMassPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_Body_GetCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_INVERSE_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_Body_GetInverseCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_WORLD_SPACE_BOUNDS = downcallHandle("JPH_Body_GetWorldSpaceBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_MOTION_PROPERTIES = downcallHandle("JPH_Body_GetMotionProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_MOTION_PROPERTIES1 = downcallHandle("JPH_Body_GetMotionProperties1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED = downcallHandle("JPH_Body_GetMotionPropertiesUnchecked", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED1 = downcallHandle("JPH_Body_GetMotionPropertiesUnchecked1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_USER_DATA = downcallHandle("JPH_Body_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_USER_DATA = downcallHandleVoid("JPH_Body_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL = downcallHandleVoid("JPH_Body_GetWorldSpaceSurfaceNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_TRANSFORMED_SHAPE = downcallHandleVoid("JPH_Body_GetTransformedShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_BODY_CREATION_SETTINGS = downcallHandleVoid("JPH_Body_GetBodyCreationSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_APPLY_BODY_CREATION_SETTINGS = downcallHandleVoid("JPH_Body_ApplyBodyCreationSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_SOFT_BODY_CREATION_SETTINGS = downcallHandleVoid("JPH_Body_GetSoftBodyCreationSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_APPLY_SOFT_BODY_CREATION_SETTINGS = downcallHandleVoid("JPH_Body_ApplySoftBodyCreationSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_S_FIND_COLLIDING_PAIRS_CAN_COLLIDE = downcallHandle("JPH_Body_sFindCollidingPairsCanCollide", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_ADD_POSITION_STEP = downcallHandleVoid("JPH_Body_AddPositionStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SUB_POSITION_STEP = downcallHandleVoid("JPH_Body_SubPositionStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_ADD_ROTATION_STEP = downcallHandleVoid("JPH_Body_AddRotationStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SUB_ROTATION_STEP = downcallHandleVoid("JPH_Body_SubRotationStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_OBJECT_LAYER_INTERNAL = downcallHandleVoid("JPH_Body_SetObjectLayerInternal", UNBOUNDED_ADDRESS, JAVA_SHORT, UNBOUNDED_ADDRESS);
		JPH_BODY_SET_IN_BROAD_PHASE_INTERNAL = downcallHandleVoid("JPH_Body_SetInBroadPhaseInternal", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_INVALIDATE_CONTACT_CACHE_INTERNAL = downcallHandle("JPH_Body_InvalidateContactCacheInternal", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_VALIDATE_CONTACT_CACHE_INTERNAL = downcallHandleVoid("JPH_Body_ValidateContactCacheInternal", UNBOUNDED_ADDRESS);
		JPH_BODY_CALCULATE_WORLD_SPACE_BOUNDS_INTERNAL = downcallHandleVoid("JPH_Body_CalculateWorldSpaceBoundsInternal", UNBOUNDED_ADDRESS);
		JPH_BODY_SET_POSITION_AND_ROTATION_INTERNAL = downcallHandleVoid("JPH_Body_SetPositionAndRotationInternal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_UPDATE_CENTER_OF_MASS_INTERNAL = downcallHandleVoid("JPH_Body_UpdateCenterOfMassInternal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_SET_SHAPE_INTERNAL = downcallHandleVoid("JPH_Body_SetShapeInternal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_BODY_GET_INDEX_IN_ACTIVE_BODIES_INTERNAL = downcallHandle("JPH_Body_GetIndexInActiveBodiesInternal", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_UPDATE_SLEEP_STATE_INTERNAL = downcallHandle("JPH_Body_UpdateSleepStateInternal", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_BODY_SAVE_STATE = downcallHandleVoid("JPH_Body_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_RESTORE_STATE = downcallHandleVoid("JPH_Body_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_GET_FIXED_TO_WORLD = downcallHandle("JPH_Body_GetFixedToWorld", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Body(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constant indicating that body is not active
    /// ```
    public static int getInactiveIndex() {
    	MethodHandle method = JPH_BODY_GET_INACTIVE_INDEX.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the id of this body
    /// ```
    public static MemorySegment getID(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getID].
    public final @Nullable BodyID getID() {
    	MemorySegment segment = getID(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyID(segment);
    }
    
    /// ```
    /// Get the type of body (rigid or soft)
    /// ```
    public static int getBodyType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_BODY_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyType].
    public final int getBodyType() {
    	return getBodyType(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if this body is a rigid body
    /// ```
    public static boolean isRigidBody(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_RIGID_BODY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isRigidBody].
    public final boolean isRigidBody() {
    	return isRigidBody(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if this body is a soft body
    /// ```
    public static boolean isSoftBody(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_SOFT_BODY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSoftBody].
    public final boolean isSoftBody() {
    	return isSoftBody(
    		this.segment
    	);
    }
    
    /// ```
    /// If this body is currently actively simulating (true) or sleeping (false)
    /// ```
    public static boolean isActive(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_ACTIVE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isActive].
    public final boolean isActive() {
    	return isActive(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if this body is static (not movable)
    /// ```
    public static boolean isStatic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_STATIC.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isStatic].
    public final boolean isStatic() {
    	return isStatic(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if this body is kinematic (keyframed), which means that it will move according to its current velocity, but forces don't affect it
    /// ```
    public static boolean isKinematic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_KINEMATIC.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isKinematic].
    public final boolean isKinematic() {
    	return isKinematic(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if this body is dynamic, which means that it moves and forces can act on it
    /// ```
    public static boolean isDynamic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_DYNAMIC.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isDynamic].
    public final boolean isDynamic() {
    	return isDynamic(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if a body could be made kinematic or dynamic (if it was created dynamic or with mAllowDynamicOrKinematic set to true)
    /// ```
    public static boolean canBeKinematicOrDynamic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CAN_BE_KINEMATIC_OR_DYNAMIC.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#canBeKinematicOrDynamic].
    public final boolean canBeKinematicOrDynamic() {
    	return canBeKinematicOrDynamic(
    		this.segment
    	);
    }
    
    /// ```
    /// Change the body to a sensor. A sensor will receive collision callbacks, but will not cause any collision responses and can be used as a trigger volume.
    /// The cheapest sensor (in terms of CPU usage) is a sensor with motion type Static (they can be moved around using BodyInterface::SetPosition/SetPositionAndRotation).
    /// These sensors will only detect collisions with active Dynamic or Kinematic bodies. As soon as a body go to sleep, the contact point with the sensor will be lost.
    /// If you make a sensor Dynamic or Kinematic and activate them, the sensor will be able to detect collisions with sleeping bodies too. An active sensor will never go to sleep automatically.
    /// When you make a Dynamic or Kinematic sensor, make sure it is in an ObjectLayer that does not collide with Static bodies or other sensors to avoid extra overhead in the broad phase.
    /// ```
    public static void setIsSensor(
    	MemorySegment self,
    	boolean inIsSensor
    ) {
    	MethodHandle method = JPH_BODY_SET_IS_SENSOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIsSensor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsSensor].
    public final void setIsSensor(
    	boolean inIsSensor
    ) {
    	setIsSensor(
    		this.segment,
    		inIsSensor
    	);
    }
    
    /// ```
    /// Check if this body is a sensor.
    /// ```
    public static boolean isSensor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_SENSOR.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSensor].
    public final boolean isSensor() {
    	return isSensor(
    		this.segment
    	);
    }
    
    /// ```
    /// If kinematic objects can generate contact points against other kinematic or static objects.
    /// Note that turning this on can be CPU intensive as much more collision detection work will be done without any effect on the simulation (kinematic objects are not affected by other kinematic/static objects).
    /// This can be used to make sensors detect static objects. Note that the sensor must be kinematic and active for it to detect static objects.
    /// ```
    public static void setCollideKinematicVsNonDynamic(
    	MemorySegment self,
    	boolean inCollide
    ) {
    	MethodHandle method = JPH_BODY_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCollide
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollideKinematicVsNonDynamic].
    public final void setCollideKinematicVsNonDynamic(
    	boolean inCollide
    ) {
    	setCollideKinematicVsNonDynamic(
    		this.segment,
    		inCollide
    	);
    }
    
    /// ```
    /// Check if kinematic objects can generate contact points against other kinematic or static objects.
    /// ```
    public static boolean getCollideKinematicVsNonDynamic(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollideKinematicVsNonDynamic].
    public final boolean getCollideKinematicVsNonDynamic() {
    	return getCollideKinematicVsNonDynamic(
    		this.segment
    	);
    }
    
    /// ```
    /// If PhysicsSettings::mUseManifoldReduction is true, this allows turning off manifold reduction for this specific body.
    /// Manifold reduction by default will combine contacts with similar normals that come from different SubShapeIDs (e.g. different triangles in a mesh shape or different compound shapes).
    /// If the application requires tracking exactly which SubShapeIDs are in contact, you can turn off manifold reduction. Note that this comes at a performance cost.
    /// Consider using BodyInterface::SetUseManifoldReduction if the body could already be in contact with other bodies to ensure that the contact cache is invalidated and you get the correct contact callbacks.
    /// ```
    public static void setUseManifoldReduction(
    	MemorySegment self,
    	boolean inUseReduction
    ) {
    	MethodHandle method = JPH_BODY_SET_USE_MANIFOLD_REDUCTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inUseReduction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUseManifoldReduction].
    public final void setUseManifoldReduction(
    	boolean inUseReduction
    ) {
    	setUseManifoldReduction(
    		this.segment,
    		inUseReduction
    	);
    }
    
    /// ```
    /// Check if this body can use manifold reduction.
    /// ```
    public static boolean getUseManifoldReduction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_USE_MANIFOLD_REDUCTION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUseManifoldReduction].
    public final boolean getUseManifoldReduction() {
    	return getUseManifoldReduction(
    		this.segment
    	);
    }
    
    /// ```
    /// Checks if the combination of this body and inBody2 should use manifold reduction
    /// ```
    public static boolean getUseManifoldReductionWithBody(
    	MemorySegment self,
    	MemorySegment inBody2
    ) {
    	MethodHandle method = JPH_BODY_GET_USE_MANIFOLD_REDUCTION_WITH_BODY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUseManifoldReductionWithBody].
    public final boolean getUseManifoldReductionWithBody(
    	Body inBody2
    ) {
    	return getUseManifoldReductionWithBody(
    		this.segment,
    		inBody2.memorySegment()
    	);
    }
    
    /// ```
    /// Set to indicate that the gyroscopic force should be applied to this body (aka Dzhanibekov effect, see https://en.wikipedia.org/wiki/Tennis_racket_theorem)
    /// ```
    public static void setApplyGyroscopicForce(
    	MemorySegment self,
    	boolean inApply
    ) {
    	MethodHandle method = JPH_BODY_SET_APPLY_GYROSCOPIC_FORCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inApply
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setApplyGyroscopicForce].
    public final void setApplyGyroscopicForce(
    	boolean inApply
    ) {
    	setApplyGyroscopicForce(
    		this.segment,
    		inApply
    	);
    }
    
    /// ```
    /// Check if the gyroscopic force is being applied for this body
    /// ```
    public static boolean getApplyGyroscopicForce(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_APPLY_GYROSCOPIC_FORCE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getApplyGyroscopicForce].
    public final boolean getApplyGyroscopicForce() {
    	return getApplyGyroscopicForce(
    		this.segment
    	);
    }
    
    /// ```
    /// Set to indicate that extra effort should be made to try to remove ghost contacts (collisions with internal edges of a mesh). This is more expensive but makes bodies move smoother over a mesh with convex edges.
    /// ```
    public static void setEnhancedInternalEdgeRemoval(
    	MemorySegment self,
    	boolean inApply
    ) {
    	MethodHandle method = JPH_BODY_SET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inApply
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEnhancedInternalEdgeRemoval].
    public final void setEnhancedInternalEdgeRemoval(
    	boolean inApply
    ) {
    	setEnhancedInternalEdgeRemoval(
    		this.segment,
    		inApply
    	);
    }
    
    /// ```
    /// Check if enhanced internal edge removal is turned on
    /// ```
    public static boolean getEnhancedInternalEdgeRemoval(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEnhancedInternalEdgeRemoval].
    public final boolean getEnhancedInternalEdgeRemoval() {
    	return getEnhancedInternalEdgeRemoval(
    		this.segment
    	);
    }
    
    /// ```
    /// Checks if the combination of this body and inBody2 should use enhanced internal edge removal
    /// ```
    public static boolean getEnhancedInternalEdgeRemovalWithBody(
    	MemorySegment self,
    	MemorySegment inBody2
    ) {
    	MethodHandle method = JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL_WITH_BODY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEnhancedInternalEdgeRemovalWithBody].
    public final boolean getEnhancedInternalEdgeRemovalWithBody(
    	Body inBody2
    ) {
    	return getEnhancedInternalEdgeRemovalWithBody(
    		this.segment,
    		inBody2.memorySegment()
    	);
    }
    
    /// ```
    /// Get the bodies motion type.
    /// ```
    public static int getMotionType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_MOTION_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionType].
    public final int getMotionType() {
    	return getMotionType(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the motion type of this body. Consider using BodyInterface::SetMotionType instead of this function if the body may be active or if it needs to be activated.
    /// ```
    public static void setMotionType(
    	MemorySegment self,
    	int inMotionType
    ) {
    	MethodHandle method = JPH_BODY_SET_MOTION_TYPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMotionType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMotionType].
    public final void setMotionType(
    	int inMotionType
    ) {
    	setMotionType(
    		this.segment,
    		inMotionType
    	);
    }
    
    /// ```
    /// Get broadphase layer, this determines in which broad phase sub-tree the object is placed
    /// ```
    public static void getBroadPhaseLayer(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_BROAD_PHASE_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBroadPhaseLayer].
    public final void getBroadPhaseLayer(
    	BroadPhaseLayer outResult
    ) {
    	getBroadPhaseLayer(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get object layer, this determines which other objects it collides with
    /// ```
    public static short getObjectLayer(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_OBJECT_LAYER.get();
    	try {
    		return (short) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getObjectLayer].
    public final short getObjectLayer() {
    	return getObjectLayer(
    		this.segment
    	);
    }
    
    /// ```
    /// Collision group and sub-group ID, determines which other objects it collides with
    /// ```
    public static MemorySegment getCollisionGroup(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_COLLISION_GROUP.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollisionGroup].
    public final @Nullable CollisionGroup getCollisionGroup() {
    	MemorySegment segment = getCollisionGroup(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CollisionGroup(segment);
    }
    
    public static MemorySegment getCollisionGroup1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_COLLISION_GROUP1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollisionGroup1].
    public final @Nullable CollisionGroup getCollisionGroup1() {
    	MemorySegment segment = getCollisionGroup1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CollisionGroup(segment);
    }
    
    public static void setCollisionGroup(
    	MemorySegment self,
    	MemorySegment inGroup
    ) {
    	MethodHandle method = JPH_BODY_SET_COLLISION_GROUP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inGroup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollisionGroup].
    public final void setCollisionGroup(
    	CollisionGroup inGroup
    ) {
    	setCollisionGroup(
    		this.segment,
    		inGroup.memorySegment()
    	);
    }
    
    /// ```
    /// If this body can go to sleep. Note that disabling sleeping on a sleeping object will not wake it up.
    /// ```
    public static boolean getAllowSleeping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_ALLOW_SLEEPING.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAllowSleeping].
    public final boolean getAllowSleeping() {
    	return getAllowSleeping(
    		this.segment
    	);
    }
    
    public static void setAllowSleeping(
    	MemorySegment self,
    	boolean inAllow
    ) {
    	MethodHandle method = JPH_BODY_SET_ALLOW_SLEEPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAllow
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAllowSleeping].
    public final void setAllowSleeping(
    	boolean inAllow
    ) {
    	setAllowSleeping(
    		this.segment,
    		inAllow
    	);
    }
    
    /// ```
    /// Resets the sleep timer. This does not wake up the body if it is sleeping, but allows resetting the system that detects when a body is sleeping.
    /// ```
    public static void resetSleepTimer(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_RESET_SLEEP_TIMER.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetSleepTimer].
    public final void resetSleepTimer() {
    	resetSleepTimer(
    		this.segment
    	);
    }
    
    /// ```
    /// Friction (dimensionless number, usually between 0 and 1, 0 = no friction, 1 = friction force equals force that presses the two bodies together). Note that bodies can have negative friction but the combined friction (see PhysicsSystem::SetCombineFriction) should never go below zero.
    /// ```
    public static float getFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFriction].
    public final float getFriction() {
    	return getFriction(
    		this.segment
    	);
    }
    
    public static void setFriction(
    	MemorySegment self,
    	float inFriction
    ) {
    	MethodHandle method = JPH_BODY_SET_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFriction].
    public final void setFriction(
    	float inFriction
    ) {
    	setFriction(
    		this.segment,
    		inFriction
    	);
    }
    
    /// ```
    /// Restitution (dimensionless number, usually between 0 and 1, 0 = completely inelastic collision response, 1 = completely elastic collision response). Note that bodies can have negative restitution but the combined restitution (see PhysicsSystem::SetCombineRestitution) should never go below zero.
    /// ```
    public static float getRestitution(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_RESTITUTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRestitution].
    public final float getRestitution() {
    	return getRestitution(
    		this.segment
    	);
    }
    
    public static void setRestitution(
    	MemorySegment self,
    	float inRestitution
    ) {
    	MethodHandle method = JPH_BODY_SET_RESTITUTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRestitution
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRestitution].
    public final void setRestitution(
    	float inRestitution
    ) {
    	setRestitution(
    		this.segment,
    		inRestitution
    	);
    }
    
    /// ```
    /// Get world space linear velocity of the center of mass (unit: m/s)
    /// ```
    public static void getLinearVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity].
    public final void getLinearVelocity(
    	Vec3 outResult
    ) {
    	getLinearVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set world space linear velocity of the center of mass (unit: m/s).
    /// Note that it is illegal to set a non-zero linear velocity on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::SetLinearVelocity instead.
    /// ```
    public static void setLinearVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_BODY_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public final void setLinearVelocity(
    	Vec3 inLinearVelocity
    ) {
    	setLinearVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set world space linear velocity of the center of mass, will make sure the value is clamped against the maximum linear velocity.
    /// Note that it is illegal to set a non-zero linear velocity on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::SetLinearVelocity instead.
    /// ```
    public static void setLinearVelocityClamped(
    	MemorySegment self,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_BODY_SET_LINEAR_VELOCITY_CLAMPED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocityClamped].
    public final void setLinearVelocityClamped(
    	Vec3 inLinearVelocity
    ) {
    	setLinearVelocityClamped(
    		this.segment,
    		inLinearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Get world space angular velocity of the center of mass (unit: rad/s)
    /// ```
    public static void getAngularVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public final void getAngularVelocity(
    	Vec3 outResult
    ) {
    	getAngularVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set world space angular velocity of the center of mass (unit: rad/s).
    /// Note that it is illegal to set a non-zero angular velocity on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::SetAngularVelocity instead.
    /// ```
    public static void setAngularVelocity(
    	MemorySegment self,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_SET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity].
    public final void setAngularVelocity(
    	Vec3 inAngularVelocity
    ) {
    	setAngularVelocity(
    		this.segment,
    		inAngularVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set world space angular velocity of the center of mass, will make sure the value is clamped against the maximum angular velocity.
    /// Note that it is illegal to set a non-zero angular velocity on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::SetAngularVelocity instead.
    /// ```
    public static void setAngularVelocityClamped(
    	MemorySegment self,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_BODY_SET_ANGULAR_VELOCITY_CLAMPED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocityClamped].
    public final void setAngularVelocityClamped(
    	Vec3 inAngularVelocity
    ) {
    	setAngularVelocityClamped(
    		this.segment,
    		inAngularVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity of point inPoint (in center of mass space, e.g. on the surface of the body) of the body (unit: m/s)
    /// ```
    public static void getPointVelocityCOM(
    	MemorySegment self,
    	MemorySegment inPointRelativeToCOM,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_POINT_VELOCITY_COM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPointRelativeToCOM,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPointVelocityCOM].
    public final void getPointVelocityCOM(
    	Vec3 inPointRelativeToCOM,
    	Vec3 outResult
    ) {
    	getPointVelocityCOM(
    		this.segment,
    		inPointRelativeToCOM.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity of point inPoint (in world space, e.g. on the surface of the body) of the body (unit: m/s)
    /// ```
    public static void getPointVelocity(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_POINT_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPointVelocity].
    public final void getPointVelocity(
    	Vec3 inPoint,
    	Vec3 outResult
    ) {
    	getPointVelocity(
    		this.segment,
    		inPoint.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Add force (unit: N) at center of mass for the next time step, will be reset after the next call to PhysicsSystem::Update.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::AddForce instead.
    /// ```
    public static void addForce(
    	MemorySegment self,
    	MemorySegment inForce
    ) {
    	MethodHandle method = JPH_BODY_ADD_FORCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inForce
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addForce].
    public final void addForce(
    	Vec3 inForce
    ) {
    	addForce(
    		this.segment,
    		inForce.memorySegment()
    	);
    }
    
    /// ```
    /// Add force (unit: N) at world space position inPosition for the next time step, will be reset after the next call to PhysicsSystem::Update.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::AddForce instead.
    /// ```
    public static void addForce1(
    	MemorySegment self,
    	MemorySegment inForce,
    	MemorySegment inPosition
    ) {
    	MethodHandle method = JPH_BODY_ADD_FORCE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inForce,
    			inPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addForce1].
    public final void addForce1(
    	Vec3 inForce,
    	Vec3 inPosition
    ) {
    	addForce1(
    		this.segment,
    		inForce.memorySegment(),
    		inPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Add torque (unit: N m) for the next time step, will be reset after the next call to PhysicsSystem::Update.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::AddTorque instead.
    /// ```
    public static void addTorque(
    	MemorySegment self,
    	MemorySegment inTorque
    ) {
    	MethodHandle method = JPH_BODY_ADD_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addTorque].
    public final void addTorque(
    	Vec3 inTorque
    ) {
    	addTorque(
    		this.segment,
    		inTorque.memorySegment()
    	);
    }
    
    public static void getAccumulatedForce(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_ACCUMULATED_FORCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAccumulatedForce].
    public final void getAccumulatedForce(
    	Vec3 outResult
    ) {
    	getAccumulatedForce(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getAccumulatedTorque(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_ACCUMULATED_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAccumulatedTorque].
    public final void getAccumulatedTorque(
    	Vec3 outResult
    ) {
    	getAccumulatedTorque(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void resetForce(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_RESET_FORCE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetForce].
    public final void resetForce() {
    	resetForce(
    		this.segment
    	);
    }
    
    public static void resetTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_RESET_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetTorque].
    public final void resetTorque() {
    	resetTorque(
    		this.segment
    	);
    }
    
    public static void resetMotion(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_RESET_MOTION.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetMotion].
    public final void resetMotion() {
    	resetMotion(
    		this.segment
    	);
    }
    
    /// ```
    /// Get inverse inertia tensor in world space
    /// ```
    public static void getInverseInertia(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_INVERSE_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseInertia].
    public final void getInverseInertia(
    	Mat44 outResult
    ) {
    	getInverseInertia(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Add impulse to center of mass (unit: kg m/s).
    /// If you want the body to wake up when it is sleeping, use BodyInterface::AddImpulse instead.
    /// ```
    public static void addImpulse(
    	MemorySegment self,
    	MemorySegment inImpulse
    ) {
    	MethodHandle method = JPH_BODY_ADD_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addImpulse].
    public final void addImpulse(
    	Vec3 inImpulse
    ) {
    	addImpulse(
    		this.segment,
    		inImpulse.memorySegment()
    	);
    }
    
    /// ```
    /// Add impulse to point in world space (unit: kg m/s).
    /// If you want the body to wake up when it is sleeping, use BodyInterface::AddImpulse instead.
    /// ```
    public static void addImpulse1(
    	MemorySegment self,
    	MemorySegment inImpulse,
    	MemorySegment inPosition
    ) {
    	MethodHandle method = JPH_BODY_ADD_IMPULSE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inImpulse,
    			inPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addImpulse1].
    public final void addImpulse1(
    	Vec3 inImpulse,
    	Vec3 inPosition
    ) {
    	addImpulse1(
    		this.segment,
    		inImpulse.memorySegment(),
    		inPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Add angular impulse in world space (unit: N m s).
    /// If you want the body to wake up when it is sleeping, use BodyInterface::AddAngularImpulse instead.
    /// ```
    public static void addAngularImpulse(
    	MemorySegment self,
    	MemorySegment inAngularImpulse
    ) {
    	MethodHandle method = JPH_BODY_ADD_ANGULAR_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addAngularImpulse].
    public final void addAngularImpulse(
    	Vec3 inAngularImpulse
    ) {
    	addAngularImpulse(
    		this.segment,
    		inAngularImpulse.memorySegment()
    	);
    }
    
    /// ```
    /// Set velocity of body such that it will be positioned at inTargetPosition/inTargetRotation in inDeltaTime seconds.
    /// Note that it is illegal to provide a new position/orientation on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::MoveKinematic instead.
    /// ```
    public static void moveKinematic(
    	MemorySegment self,
    	MemorySegment inTargetPosition,
    	MemorySegment inTargetRotation,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_MOVE_KINEMATIC.get();
    	try {
    		 method.invokeExact(
    			self,
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
    	Vec3 inTargetPosition,
    	Quat inTargetRotation,
    	float inDeltaTime
    ) {
    	moveKinematic(
    		this.segment,
    		inTargetPosition.memorySegment(),
    		inTargetRotation.memorySegment(),
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Gets the properties needed to do buoyancy calculations
    /// @param inSurfacePosition Position of the fluid surface in world space
    /// @param inSurfaceNormal Normal of the fluid surface (should point up)
    /// @param outTotalVolume On return this contains the total volume of the shape
    /// @param outSubmergedVolume On return this contains the submerged volume of the shape
    /// @param outRelativeCenterOfBuoyancy On return this contains the center of mass of the submerged volume relative to the center of mass of the body
    /// ```
    public static void getSubmergedVolume(
    	MemorySegment self,
    	MemorySegment inSurfacePosition,
    	MemorySegment inSurfaceNormal,
    	MemorySegment outTotalVolume,
    	MemorySegment outSubmergedVolume,
    	MemorySegment outRelativeCenterOfBuoyancy
    ) {
    	MethodHandle method = JPH_BODY_GET_SUBMERGED_VOLUME.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSurfacePosition,
    			inSurfaceNormal,
    			outTotalVolume,
    			outSubmergedVolume,
    			outRelativeCenterOfBuoyancy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubmergedVolume].
    public final void getSubmergedVolume(
    	Vec3 inSurfacePosition,
    	Vec3 inSurfaceNormal,
    	NativeFloatArray outTotalVolume,
    	NativeFloatArray outSubmergedVolume,
    	Vec3 outRelativeCenterOfBuoyancy
    ) {
    	getSubmergedVolume(
    		this.segment,
    		inSurfacePosition.memorySegment(),
    		inSurfaceNormal.memorySegment(),
    		outTotalVolume.memorySegment(),
    		outSubmergedVolume.memorySegment(),
    		outRelativeCenterOfBuoyancy.memorySegment()
    	);
    }
    
    /// ```
    /// Applies an impulse to the body that simulates fluid buoyancy and drag.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::ApplyBuoyancyImpulse instead.
    /// @param inSurfacePosition Position of the fluid surface in world space
    /// @param inSurfaceNormal Normal of the fluid surface (should point up)
    /// @param inBuoyancy The buoyancy factor for the body. 1 = neutral body, < 1 sinks, > 1 floats. Note that we don't use the fluid density since it is harder to configure than a simple number between [0, 2]
    /// @param inLinearDrag Linear drag factor that slows down the body when in the fluid (approx. 0.5)
    /// @param inAngularDrag Angular drag factor that slows down rotation when the body is in the fluid (approx. 0.01)
    /// @param inFluidVelocity The average velocity of the fluid (in m/s) in which the body resides
    /// @param inGravity The gravity vector (pointing down)
    /// @param inDeltaTime Delta time of the next simulation step (in s)
    /// @return true if an impulse was applied, false if the body was not in the fluid
    /// ```
    public static boolean applyBuoyancyImpulse(
    	MemorySegment self,
    	MemorySegment inSurfacePosition,
    	MemorySegment inSurfaceNormal,
    	float inBuoyancy,
    	float inLinearDrag,
    	float inAngularDrag,
    	MemorySegment inFluidVelocity,
    	MemorySegment inGravity,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_APPLY_BUOYANCY_IMPULSE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
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
    /// Applies an impulse to the body that simulates fluid buoyancy and drag.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::ApplyBuoyancyImpulse instead.
    /// @param inTotalVolume Total volume of the shape of this body (m^3)
    /// @param inSubmergedVolume Submerged volume of the shape of this body (m^3)
    /// @param inRelativeCenterOfBuoyancy The center of mass of the submerged volume relative to the center of mass of the body
    /// @param inBuoyancy The buoyancy factor for the body. 1 = neutral body, < 1 sinks, > 1 floats. Note that we don't use the fluid density since it is harder to configure than a simple number between [0, 2]
    /// @param inLinearDrag Linear drag factor that slows down the body when in the fluid (approx. 0.5)
    /// @param inAngularDrag Angular drag factor that slows down rotation when the body is in the fluid (approx. 0.01)
    /// @param inFluidVelocity The average velocity of the fluid (in m/s) in which the body resides
    /// @param inGravity The gravity vector (pointing down)
    /// @param inDeltaTime Delta time of the next simulation step (in s)
    /// @return true if an impulse was applied, false if the body was not in the fluid
    /// ```
    public static boolean applyBuoyancyImpulse1(
    	MemorySegment self,
    	float inTotalVolume,
    	float inSubmergedVolume,
    	MemorySegment inRelativeCenterOfBuoyancy,
    	float inBuoyancy,
    	float inLinearDrag,
    	float inAngularDrag,
    	MemorySegment inFluidVelocity,
    	MemorySegment inGravity,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_APPLY_BUOYANCY_IMPULSE1.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inTotalVolume,
    			inSubmergedVolume,
    			inRelativeCenterOfBuoyancy,
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
    
    /// Typed method of [#applyBuoyancyImpulse1].
    public final boolean applyBuoyancyImpulse1(
    	float inTotalVolume,
    	float inSubmergedVolume,
    	Vec3 inRelativeCenterOfBuoyancy,
    	float inBuoyancy,
    	float inLinearDrag,
    	float inAngularDrag,
    	Vec3 inFluidVelocity,
    	Vec3 inGravity,
    	float inDeltaTime
    ) {
    	return applyBuoyancyImpulse1(
    		this.segment,
    		inTotalVolume,
    		inSubmergedVolume,
    		inRelativeCenterOfBuoyancy.memorySegment(),
    		inBuoyancy,
    		inLinearDrag,
    		inAngularDrag,
    		inFluidVelocity.memorySegment(),
    		inGravity.memorySegment(),
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Check if this body has been added to the physics system
    /// ```
    public static boolean isInBroadPhase(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_IN_BROAD_PHASE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isInBroadPhase].
    public final boolean isInBroadPhase() {
    	return isInBroadPhase(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if this body has been changed in such a way that the collision cache should be considered invalid for any body interacting with this body
    /// ```
    public static boolean isCollisionCacheInvalid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_IS_COLLISION_CACHE_INVALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isCollisionCacheInvalid].
    public final boolean isCollisionCacheInvalid() {
    	return isCollisionCacheInvalid(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the shape of this body
    /// ```
    public static MemorySegment getShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShape].
    public final @Nullable Shape getShape() {
    	MemorySegment segment = getShape(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Shape(segment);
    }
    
    /// ```
    /// World space position of the body
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// World space rotation of the body
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotation].
    public final void getRotation(
    	Quat outResult
    ) {
    	getRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates the transform of this body
    /// ```
    public static void getWorldTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_WORLD_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldTransform].
    public final void getWorldTransform(
    	Mat44 outResult
    ) {
    	getWorldTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Gets the world space position of this body's center of mass
    /// ```
    public static void getCenterOfMassPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_CENTER_OF_MASS_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMassPosition].
    public final void getCenterOfMassPosition(
    	Vec3 outResult
    ) {
    	getCenterOfMassPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates the transform for this body's center of mass
    /// ```
    public static void getCenterOfMassTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_CENTER_OF_MASS_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMassTransform].
    public final void getCenterOfMassTransform(
    	Mat44 outResult
    ) {
    	getCenterOfMassTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates the inverse of the transform for this body's center of mass
    /// ```
    public static void getInverseCenterOfMassTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_INVERSE_CENTER_OF_MASS_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseCenterOfMassTransform].
    public final void getInverseCenterOfMassTransform(
    	Mat44 outResult
    ) {
    	getInverseCenterOfMassTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get world space bounding box
    /// ```
    public static MemorySegment getWorldSpaceBounds(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_WORLD_SPACE_BOUNDS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceBounds].
    public final @Nullable AABox getWorldSpaceBounds() {
    	MemorySegment segment = getWorldSpaceBounds(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AABox(segment);
    }
    
    /// ```
    /// Access to the motion properties
    /// ```
    public static MemorySegment getMotionProperties(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_MOTION_PROPERTIES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionProperties].
    public final @Nullable MotionProperties getMotionProperties() {
    	MemorySegment segment = getMotionProperties(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotionProperties(segment);
    }
    
    public static MemorySegment getMotionProperties1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_MOTION_PROPERTIES1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionProperties1].
    public final @Nullable MotionProperties getMotionProperties1() {
    	MemorySegment segment = getMotionProperties1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotionProperties(segment);
    }
    
    /// ```
    /// Access to the motion properties (version that does not check if the object is kinematic or dynamic)
    /// ```
    public static MemorySegment getMotionPropertiesUnchecked(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionPropertiesUnchecked].
    public final @Nullable MotionProperties getMotionPropertiesUnchecked() {
    	MemorySegment segment = getMotionPropertiesUnchecked(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotionProperties(segment);
    }
    
    public static MemorySegment getMotionPropertiesUnchecked1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionPropertiesUnchecked1].
    public final @Nullable MotionProperties getMotionPropertiesUnchecked1() {
    	MemorySegment segment = getMotionPropertiesUnchecked1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MotionProperties(segment);
    }
    
    /// ```
    /// Access to the user data, can be used for anything by the application
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final long getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    public static void setUserData(
    	MemorySegment self,
    	long inUserData
    ) {
    	MethodHandle method = JPH_BODY_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	long inUserData
    ) {
    	setUserData(
    		this.segment,
    		inUserData
    	);
    }
    
    /// ```
    /// Get surface normal of a particular sub shape and its world space surface position on this body
    /// ```
    public static void getWorldSpaceSurfaceNormal(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment inPosition,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			inPosition,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceSurfaceNormal].
    public final void getWorldSpaceSurfaceNormal(
    	SubShapeID inSubShapeID,
    	Vec3 inPosition,
    	Vec3 outResult
    ) {
    	getWorldSpaceSurfaceNormal(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		inPosition.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the transformed shape of this body, which can be used to do collision detection outside of a body lock
    /// ```
    public static void getTransformedShape(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_TRANSFORMED_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTransformedShape].
    public final void getTransformedShape(
    	TransformedShape outResult
    ) {
    	getTransformedShape(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Function to convert a body back to a body creation settings object to be able to save/recreate the body later. Can e.g. be used to move a body from one PhysicsSystem to another.
    /// ```
    public static void getBodyCreationSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_BODY_CREATION_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyCreationSettings].
    public final void getBodyCreationSettings(
    	BodyCreationSettings outResult
    ) {
    	getBodyCreationSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Function to overwrite current body state with inBodyCreationSettings. Can only be done when the body is not in the physics system and cannot add MotionProperties if the body was created without one.
    /// Note that if you change the shape of the body and this body may have been in contact with other bodies before, you should call BodyInterface::InvalidateContactCache to invalidate any previous contacts.
    /// ```
    public static void applyBodyCreationSettings(
    	MemorySegment self,
    	MemorySegment inBodyCreationSettings,
    	MemorySegment inBPLInterface
    ) {
    	MethodHandle method = JPH_BODY_APPLY_BODY_CREATION_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyCreationSettings,
    			inBPLInterface
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyBodyCreationSettings].
    public final void applyBodyCreationSettings(
    	BodyCreationSettings inBodyCreationSettings,
    	BroadPhaseLayerInterface inBPLInterface
    ) {
    	applyBodyCreationSettings(
    		this.segment,
    		inBodyCreationSettings.memorySegment(),
    		inBPLInterface.memorySegment()
    	);
    }
    
    /// ```
    /// Function to convert a soft body back to a body creation settings object to be able to save/recreate the body later. Can e.g. be used to move a body from one PhysicsSystem to another.
    /// ```
    public static void getSoftBodyCreationSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_GET_SOFT_BODY_CREATION_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSoftBodyCreationSettings].
    public final void getSoftBodyCreationSettings(
    	SoftBodyCreationSettings outResult
    ) {
    	getSoftBodyCreationSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Function to overwrite current body state with inSoftBodyCreationSettings. Can only be done when the body is not in the physics system and cannot add MotionProperties if the body was created without one.
    /// ```
    public static void applySoftBodyCreationSettings(
    	MemorySegment self,
    	MemorySegment inSoftBodyCreationSettings,
    	MemorySegment inBPLInterface
    ) {
    	MethodHandle method = JPH_BODY_APPLY_SOFT_BODY_CREATION_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSoftBodyCreationSettings,
    			inBPLInterface
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applySoftBodyCreationSettings].
    public final void applySoftBodyCreationSettings(
    	SoftBodyCreationSettings inSoftBodyCreationSettings,
    	BroadPhaseLayerInterface inBPLInterface
    ) {
    	applySoftBodyCreationSettings(
    		this.segment,
    		inSoftBodyCreationSettings.memorySegment(),
    		inBPLInterface.memorySegment()
    	);
    }
    
    /// ```
    /// Helper function for BroadPhase::FindCollidingPairs that returns true when two bodies can collide
    /// It assumes that body 1 is dynamic and active and guarantees that it body 1 collides with body 2 that body 2 will not collide with body 1 in order to avoid finding duplicate collision pairs
    /// ```
    public static boolean sFindCollidingPairsCanCollide(
    	MemorySegment inBody1,
    	MemorySegment inBody2
    ) {
    	MethodHandle method = JPH_BODY_S_FIND_COLLIDING_PAIRS_CAN_COLLIDE.get();
    	try {
    		return (boolean) method.invokeExact(
    			inBody1,
    			inBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sFindCollidingPairsCanCollide].
    public static boolean sFindCollidingPairsCanCollide(
    	Body inBody1,
    	Body inBody2
    ) {
    	return sFindCollidingPairsCanCollide(
    		inBody1.memorySegment(),
    		inBody2.memorySegment()
    	);
    }
    
    /// ```
    /// Update position using an Euler step (used during position integrate & constraint solving)
    /// ```
    public static void addPositionStep(
    	MemorySegment self,
    	MemorySegment inLinearVelocityTimesDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_ADD_POSITION_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocityTimesDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addPositionStep].
    public final void addPositionStep(
    	Vec3 inLinearVelocityTimesDeltaTime
    ) {
    	addPositionStep(
    		this.segment,
    		inLinearVelocityTimesDeltaTime.memorySegment()
    	);
    }
    
    public static void subPositionStep(
    	MemorySegment self,
    	MemorySegment inLinearVelocityTimesDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_SUB_POSITION_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocityTimesDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#subPositionStep].
    public final void subPositionStep(
    	Vec3 inLinearVelocityTimesDeltaTime
    ) {
    	subPositionStep(
    		this.segment,
    		inLinearVelocityTimesDeltaTime.memorySegment()
    	);
    }
    
    /// ```
    /// Update rotation using an Euler step (used during position integrate & constraint solving)
    /// ```
    public static void addRotationStep(
    	MemorySegment self,
    	MemorySegment inAngularVelocityTimesDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_ADD_ROTATION_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocityTimesDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addRotationStep].
    public final void addRotationStep(
    	Vec3 inAngularVelocityTimesDeltaTime
    ) {
    	addRotationStep(
    		this.segment,
    		inAngularVelocityTimesDeltaTime.memorySegment()
    	);
    }
    
    public static void subRotationStep(
    	MemorySegment self,
    	MemorySegment inAngularVelocityTimesDeltaTime
    ) {
    	MethodHandle method = JPH_BODY_SUB_ROTATION_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocityTimesDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#subRotationStep].
    public final void subRotationStep(
    	Vec3 inAngularVelocityTimesDeltaTime
    ) {
    	subRotationStep(
    		this.segment,
    		inAngularVelocityTimesDeltaTime.memorySegment()
    	);
    }
    
    /// ```
    /// Function to update body's layer (should only be called internally since it also requires updating the broadphase)
    /// ```
    public static void setObjectLayerInternal(
    	MemorySegment self,
    	short inLayer,
    	MemorySegment inBPLInterface
    ) {
    	MethodHandle method = JPH_BODY_SET_OBJECT_LAYER_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLayer,
    			inBPLInterface
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setObjectLayerInternal].
    public final void setObjectLayerInternal(
    	short inLayer,
    	BroadPhaseLayerInterface inBPLInterface
    ) {
    	setObjectLayerInternal(
    		this.segment,
    		inLayer,
    		inBPLInterface.memorySegment()
    	);
    }
    
    /// ```
    /// Flag if body is in the broadphase (should only be called by the BroadPhase)
    /// ```
    public static void setInBroadPhaseInternal(
    	MemorySegment self,
    	boolean inInBroadPhase
    ) {
    	MethodHandle method = JPH_BODY_SET_IN_BROAD_PHASE_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inInBroadPhase
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInBroadPhaseInternal].
    public final void setInBroadPhaseInternal(
    	boolean inInBroadPhase
    ) {
    	setInBroadPhaseInternal(
    		this.segment,
    		inInBroadPhase
    	);
    }
    
    /// ```
    /// Invalidate the contact cache (should only be called by the BodyManager), will be reset the next simulation step. Returns true if the contact cache was still valid.
    /// ```
    public static boolean invalidateContactCacheInternal(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_INVALIDATE_CONTACT_CACHE_INTERNAL.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#invalidateContactCacheInternal].
    public final boolean invalidateContactCacheInternal() {
    	return invalidateContactCacheInternal(
    		this.segment
    	);
    }
    
    /// ```
    /// Reset the collision cache invalid flag (should only be called by the BodyManager).
    /// ```
    public static void validateContactCacheInternal(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_VALIDATE_CONTACT_CACHE_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#validateContactCacheInternal].
    public final void validateContactCacheInternal() {
    	validateContactCacheInternal(
    		this.segment
    	);
    }
    
    /// ```
    /// Updates world space bounding box (should only be called by the PhysicsSystem)
    /// ```
    public static void calculateWorldSpaceBoundsInternal(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_CALCULATE_WORLD_SPACE_BOUNDS_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateWorldSpaceBoundsInternal].
    public final void calculateWorldSpaceBoundsInternal() {
    	calculateWorldSpaceBoundsInternal(
    		this.segment
    	);
    }
    
    /// ```
    /// Function to update body's position (should only be called by the BodyInterface since it also requires updating the broadphase)
    /// ```
    public static void setPositionAndRotationInternal(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	boolean inResetSleepTimer
    ) {
    	MethodHandle method = JPH_BODY_SET_POSITION_AND_ROTATION_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inRotation,
    			inResetSleepTimer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPositionAndRotationInternal].
    public final void setPositionAndRotationInternal(
    	Vec3 inPosition,
    	Quat inRotation,
    	boolean inResetSleepTimer
    ) {
    	setPositionAndRotationInternal(
    		this.segment,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inResetSleepTimer
    	);
    }
    
    /// ```
    /// Updates the center of mass and optionally mass properties after shifting the center of mass or changes to the shape (should only be called by the BodyInterface since it also requires updating the broadphase)
    /// @param inPreviousCenterOfMass Center of mass of the shape before the alterations
    /// @param inUpdateMassProperties When true, the mass and inertia tensor is recalculated
    /// ```
    public static void updateCenterOfMassInternal(
    	MemorySegment self,
    	MemorySegment inPreviousCenterOfMass,
    	boolean inUpdateMassProperties
    ) {
    	MethodHandle method = JPH_BODY_UPDATE_CENTER_OF_MASS_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPreviousCenterOfMass,
    			inUpdateMassProperties
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#updateCenterOfMassInternal].
    public final void updateCenterOfMassInternal(
    	Vec3 inPreviousCenterOfMass,
    	boolean inUpdateMassProperties
    ) {
    	updateCenterOfMassInternal(
    		this.segment,
    		inPreviousCenterOfMass.memorySegment(),
    		inUpdateMassProperties
    	);
    }
    
    /// ```
    /// Function to update a body's shape (should only be called by the BodyInterface since it also requires updating the broadphase)
    /// @param inShape The new shape for this body
    /// @param inUpdateMassProperties When true, the mass and inertia tensor is recalculated
    /// ```
    public static void setShapeInternal(
    	MemorySegment self,
    	MemorySegment inShape,
    	boolean inUpdateMassProperties
    ) {
    	MethodHandle method = JPH_BODY_SET_SHAPE_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShape,
    			inUpdateMassProperties
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShapeInternal].
    public final void setShapeInternal(
    	Shape inShape,
    	boolean inUpdateMassProperties
    ) {
    	setShapeInternal(
    		this.segment,
    		inShape.memorySegment(),
    		inUpdateMassProperties
    	);
    }
    
    /// ```
    /// Access to the index in the BodyManager::mActiveBodies list
    /// ```
    public static int getIndexInActiveBodiesInternal(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_GET_INDEX_IN_ACTIVE_BODIES_INTERNAL.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIndexInActiveBodiesInternal].
    public final int getIndexInActiveBodiesInternal() {
    	return getIndexInActiveBodiesInternal(
    		this.segment
    	);
    }
    
    /// ```
    /// Update eligibility for sleeping
    /// ```
    public static int updateSleepStateInternal(
    	MemorySegment self,
    	float inDeltaTime,
    	float inMaxMovement,
    	float inTimeBeforeSleep
    ) {
    	MethodHandle method = JPH_BODY_UPDATE_SLEEP_STATE_INTERNAL.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inDeltaTime,
    			inMaxMovement,
    			inTimeBeforeSleep
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#updateSleepStateInternal].
    public final int updateSleepStateInternal(
    	float inDeltaTime,
    	float inMaxMovement,
    	float inTimeBeforeSleep
    ) {
    	return updateSleepStateInternal(
    		this.segment,
    		inDeltaTime,
    		inMaxMovement,
    		inTimeBeforeSleep
    	);
    }
    
    /// ```
    /// Saving state for replay
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_BODY_SAVE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveState].
    public final void saveState(
    	StateRecorder inStream
    ) {
    	saveState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restoring state for replay
    /// ```
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_BODY_RESTORE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreState].
    public final void restoreState(
    	StateRecorder inStream
    ) {
    	restoreState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public static MemorySegment ngetFixedToWorld() {
    	MethodHandle method = JPH_BODY_GET_FIXED_TO_WORLD.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetFixedToWorld].
    public static @Nullable Body getFixedToWorld() {
    	MemorySegment segment = ngetFixedToWorld();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new Body(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}