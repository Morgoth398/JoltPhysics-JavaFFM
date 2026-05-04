/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.PhysicsMaterial;
import volucris.bindings.jolt.filter.BroadPhaseLayerFilter;
import volucris.bindings.jolt.filter.CollisionGroup;
import volucris.bindings.jolt.filter.ObjectLayerFilter;
import volucris.bindings.jolt.math.AABox;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class BodyInterface {

    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DESTROY_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ASSIGN_BODY_ID;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ASSIGN_BODY_ID2;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_UNASSIGN_BODY_ID;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_SOFT_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_REMOVE_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_REMOVE_AND_DESTROY_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_IS_ADDED;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_BODY_TYPE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_MOTION_TYPE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_MOTION_TYPE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_RESTITUTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_RESTITUTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_COLLISION_GROUP;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_COLLISION_GROUP;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ACTIVATE_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ACTIVATE_BODIES;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DEACTIVATE_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_DEACTIVATE_BODIES;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_IS_ACTIVE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_RESET_SLEEP_TIMER;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_MOVE_KINEMATIC;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_POINT_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_FORCE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_FORCE2;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_IMPULSE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_IMPULSE2;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_MOTION_QUALITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_MOTION_QUALITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_INVERSE_INERTIA;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_SET_IS_SENSOR;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_IS_SENSOR;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_GET_MATERIAL;
    private static final LazyConstant<MethodHandle> JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BODY_INTERFACE_DESTROY_BODY = downcallHandleVoid("JPH_BodyInterface_DestroyBody", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY = downcallHandle("JPH_BodyInterface_CreateAndAddBody", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_CREATE_BODY = downcallHandle("JPH_BodyInterface_CreateBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID = downcallHandle("JPH_BodyInterface_CreateBodyWithID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID = downcallHandle("JPH_BodyInterface_CreateBodyWithoutID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID = downcallHandleVoid("JPH_BodyInterface_DestroyBodyWithoutID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ASSIGN_BODY_ID = downcallHandle("JPH_BodyInterface_AssignBodyID", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ASSIGN_BODY_ID2 = downcallHandle("JPH_BodyInterface_AssignBodyID2", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_UNASSIGN_BODY_ID = downcallHandle("JPH_BodyInterface_UnassignBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_CREATE_SOFT_BODY = downcallHandle("JPH_BodyInterface_CreateSoftBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID = downcallHandle("JPH_BodyInterface_CreateSoftBodyWithID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID = downcallHandle("JPH_BodyInterface_CreateSoftBodyWithoutID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY = downcallHandle("JPH_BodyInterface_CreateAndAddSoftBody", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_ADD_BODY = downcallHandleVoid("JPH_BodyInterface_AddBody", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_BODY_INTERFACE_REMOVE_BODY = downcallHandleVoid("JPH_BodyInterface_RemoveBody", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_REMOVE_AND_DESTROY_BODY = downcallHandleVoid("JPH_BodyInterface_RemoveAndDestroyBody", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_IS_ADDED = downcallHandle("JPH_BodyInterface_IsAdded", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_GET_BODY_TYPE = downcallHandle("JPH_BodyInterface_GetBodyType", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetLinearVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetLinearVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_BodyInterface_GetCenterOfMassPosition", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_MOTION_TYPE = downcallHandle("JPH_BodyInterface_GetMotionType", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_MOTION_TYPE = downcallHandleVoid("JPH_BodyInterface_SetMotionType", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        JPH_BODY_INTERFACE_GET_RESTITUTION = downcallHandle("JPH_BodyInterface_GetRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_RESTITUTION = downcallHandleVoid("JPH_BodyInterface_SetRestitution", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_BODY_INTERFACE_GET_FRICTION = downcallHandle("JPH_BodyInterface_GetFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_FRICTION = downcallHandleVoid("JPH_BodyInterface_SetFriction", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_BODY_INTERFACE_SET_POSITION = downcallHandleVoid("JPH_BodyInterface_SetPosition", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_GET_POSITION = downcallHandleVoid("JPH_BodyInterface_GetPosition", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_SET_ROTATION = downcallHandleVoid("JPH_BodyInterface_SetRotation", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_GET_ROTATION = downcallHandleVoid("JPH_BodyInterface_GetRotation", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_BodyInterface_SetPositionAndRotation", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED = downcallHandleVoid("JPH_BodyInterface_SetPositionAndRotationWhenChanged", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_BodyInterface_GetPositionAndRotation", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetPositionRotationAndVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyInterface_GetCollisionGroup", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_SET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyInterface_SetCollisionGroup", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_SHAPE = downcallHandle("JPH_BodyInterface_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_SHAPE = downcallHandleVoid("JPH_BodyInterface_SetShape", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, JAVA_INT);
        JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED = downcallHandleVoid("JPH_BodyInterface_NotifyShapeChanged", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, JAVA_INT);
        JPH_BODY_INTERFACE_ACTIVATE_BODY = downcallHandleVoid("JPH_BodyInterface_ActivateBody", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_ACTIVATE_BODIES = downcallHandleVoid("JPH_BodyInterface_ActivateBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX = downcallHandleVoid("JPH_BodyInterface_ActivateBodiesInAABox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_DEACTIVATE_BODY = downcallHandleVoid("JPH_BodyInterface_DeactivateBody", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_DEACTIVATE_BODIES = downcallHandleVoid("JPH_BodyInterface_DeactivateBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_IS_ACTIVE = downcallHandle("JPH_BodyInterface_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_RESET_SLEEP_TIMER = downcallHandleVoid("JPH_BodyInterface_ResetSleepTimer", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_GET_OBJECT_LAYER = downcallHandle("JPH_BodyInterface_GetObjectLayer", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_OBJECT_LAYER = downcallHandleVoid("JPH_BodyInterface_SetObjectLayer", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_BodyInterface_GetWorldTransform", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_BodyInterface_GetCenterOfMassTransform", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_MOVE_KINEMATIC = downcallHandleVoid("JPH_BodyInterface_MoveKinematic", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE = downcallHandle("JPH_BodyInterface_ApplyBuoyancyImpulse", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetLinearAndAngularVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetLinearAndAngularVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_AddLinearVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_AddLinearAndAngularVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_SetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_GET_POINT_VELOCITY = downcallHandleVoid("JPH_BodyInterface_GetPointVelocity", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_FORCE = downcallHandleVoid("JPH_BodyInterface_AddForce", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_FORCE2 = downcallHandleVoid("JPH_BodyInterface_AddForce2", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_TORQUE = downcallHandleVoid("JPH_BodyInterface_AddTorque", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE = downcallHandleVoid("JPH_BodyInterface_AddForceAndTorque", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_IMPULSE = downcallHandleVoid("JPH_BodyInterface_AddImpulse", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_IMPULSE2 = downcallHandleVoid("JPH_BodyInterface_AddImpulse2", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE = downcallHandleVoid("JPH_BodyInterface_AddAngularImpulse", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_SET_MOTION_QUALITY = downcallHandleVoid("JPH_BodyInterface_SetMotionQuality", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_BODY_INTERFACE_GET_MOTION_QUALITY = downcallHandle("JPH_BodyInterface_GetMotionQuality", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_GET_INVERSE_INERTIA = downcallHandleVoid("JPH_BodyInterface_GetInverseInertia", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_BodyInterface_SetGravityFactor", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR = downcallHandle("JPH_BodyInterface_GetGravityFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_BodyInterface_SetUseManifoldReduction", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
        JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_BodyInterface_GetUseManifoldReduction", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_USER_DATA = downcallHandleVoid("JPH_BodyInterface_SetUserData", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG);
        JPH_BODY_INTERFACE_GET_USER_DATA = downcallHandle("JPH_BodyInterface_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_SET_IS_SENSOR = downcallHandleVoid("JPH_BodyInterface_SetIsSensor", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
        JPH_BODY_INTERFACE_IS_SENSOR = downcallHandle("JPH_BodyInterface_IsSensor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_INTERFACE_GET_MATERIAL = downcallHandle("JPH_BodyInterface_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE = downcallHandleVoid("JPH_BodyInterface_InvalidateContactCache", UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public BodyInterface(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroyBody(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_DESTROY_BODY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #destroyBody}.
     */
    public final void destroyBody(
        int bodyID
    ) {
        destroyBody(
            this.segment, 
            bodyID
        );
    }
    
    public static int createAndAddBody(
        MemorySegment bodyInterface, 
        MemorySegment settings, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_CREATE_AND_ADD_BODY.get();
        try {
            return (int) method.invokeExact(
                bodyInterface, 
                settings, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createAndAddBody}.
     */
    public final int createAndAddBody(
        BodyCreationSettings settings, 
        int activationMode
    ) {
        return (int) createAndAddBody(
            this.segment, 
            settings.memorySegment(), 
            activationMode
        );
    }
    
    public static MemorySegment createBody(
        MemorySegment bodyInterface, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createBody}.
     */
    public final @Nullable Body createBody(
        BodyCreationSettings settings
    ) {
        MemorySegment segment = createBody(
            this.segment, 
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static MemorySegment createBodyWithID(
        MemorySegment bodyInterface, 
        int bodyID, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY_WITH_ID.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                bodyID, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createBodyWithID}.
     */
    public final @Nullable Body createBodyWithID(
        int bodyID, 
        BodyCreationSettings settings
    ) {
        MemorySegment segment = createBodyWithID(
            this.segment, 
            bodyID, 
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static MemorySegment createBodyWithoutID(
        MemorySegment bodyInterface, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_CREATE_BODY_WITHOUT_ID.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createBodyWithoutID}.
     */
    public final @Nullable Body createBodyWithoutID(
        BodyCreationSettings settings
    ) {
        MemorySegment segment = createBodyWithoutID(
            this.segment, 
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static void destroyBodyWithoutID(
        MemorySegment bodyInterface, 
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_DESTROY_BODY_WITHOUT_ID.get();
        try {
            method.invokeExact(
                bodyInterface, 
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #destroyBodyWithoutID}.
     */
    public final void destroyBodyWithoutID(
        Body body
    ) {
        destroyBodyWithoutID(
            this.segment, 
            body.memorySegment()
        );
    }
    
    public static boolean assignBodyID(
        MemorySegment bodyInterface, 
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ASSIGN_BODY_ID.get();
        try {
            return (boolean) method.invokeExact(
                bodyInterface, 
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #assignBodyID}.
     */
    public final boolean assignBodyID(
        Body body
    ) {
        return (boolean) assignBodyID(
            this.segment, 
            body.memorySegment()
        );
    }
    
    public static boolean assignBodyID2(
        MemorySegment bodyInterface, 
        MemorySegment body, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ASSIGN_BODY_ID2.get();
        try {
            return (boolean) method.invokeExact(
                bodyInterface, 
                body, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #assignBodyID2}.
     */
    public final boolean assignBodyID2(
        Body body, 
        int bodyID
    ) {
        return (boolean) assignBodyID2(
            this.segment, 
            body.memorySegment(), 
            bodyID
        );
    }
    
    public static MemorySegment unassignBodyID(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_UNASSIGN_BODY_ID.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #unassignBodyID}.
     */
    public final @Nullable Body unassignBodyID(
        int bodyID
    ) {
        MemorySegment segment = unassignBodyID(
            this.segment, 
            bodyID
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static MemorySegment createSoftBody(
        MemorySegment bodyInterface, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createSoftBody}.
     */
    public final @Nullable Body createSoftBody(
        SoftBodyCreationSettings settings
    ) {
        MemorySegment segment = createSoftBody(
            this.segment, 
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static MemorySegment createSoftBodyWithID(
        MemorySegment bodyInterface, 
        int bodyID, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITH_ID.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                bodyID, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createSoftBodyWithID}.
     */
    public final @Nullable Body createSoftBodyWithID(
        int bodyID, 
        SoftBodyCreationSettings settings
    ) {
        MemorySegment segment = createSoftBodyWithID(
            this.segment, 
            bodyID, 
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static MemorySegment createSoftBodyWithoutID(
        MemorySegment bodyInterface, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_CREATE_SOFT_BODY_WITHOUT_ID.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createSoftBodyWithoutID}.
     */
    public final @Nullable Body createSoftBodyWithoutID(
        SoftBodyCreationSettings settings
    ) {
        MemorySegment segment = createSoftBodyWithoutID(
            this.segment, 
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static int createAndAddSoftBody(
        MemorySegment bodyInterface, 
        MemorySegment settings, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_CREATE_AND_ADD_SOFT_BODY.get();
        try {
            return (int) method.invokeExact(
                bodyInterface, 
                settings, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createAndAddSoftBody}.
     */
    public final int createAndAddSoftBody(
        SoftBodyCreationSettings settings, 
        int activationMode
    ) {
        return (int) createAndAddSoftBody(
            this.segment, 
            settings.memorySegment(), 
            activationMode
        );
    }
    
    public static void addBody(
        MemorySegment bodyInterface, 
        int bodyID, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_BODY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addBody}.
     */
    public final void addBody(
        int bodyID, 
        int activationMode
    ) {
        addBody(
            this.segment, 
            bodyID, 
            activationMode
        );
    }
    
    public static void removeBody(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_REMOVE_BODY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeBody}.
     */
    public final void removeBody(
        int bodyID
    ) {
        removeBody(
            this.segment, 
            bodyID
        );
    }
    
    public static void removeAndDestroyBody(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_REMOVE_AND_DESTROY_BODY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeAndDestroyBody}.
     */
    public final void removeAndDestroyBody(
        int bodyID
    ) {
        removeAndDestroyBody(
            this.segment, 
            bodyID
        );
    }
    
    public static boolean isAdded(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_IS_ADDED.get();
        try {
            return (boolean) method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isAdded}.
     */
    public final boolean isAdded(
        int bodyID
    ) {
        return (boolean) isAdded(
            this.segment, 
            bodyID
        );
    }
    
    public static int getBodyType(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_BODY_TYPE.get();
        try {
            return (int) method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyType}.
     */
    public final int getBodyType(
        int bodyID
    ) {
        return (int) getBodyType(
            this.segment, 
            bodyID
        );
    }
    
    public static void setLinearVelocity(
        MemorySegment bodyInterface, 
        int bodyID, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLinearVelocity}.
     */
    public final void setLinearVelocity(
        int bodyID, 
        Vec3 velocity
    ) {
        setLinearVelocity(
            this.segment, 
            bodyID, 
            velocity.memorySegment()
        );
    }
    
    public static void getLinearVelocity(
        MemorySegment bodyInterface, 
        int bodyID, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLinearVelocity}.
     */
    public final void getLinearVelocity(
        int bodyID, 
        Vec3 velocity
    ) {
        getLinearVelocity(
            this.segment, 
            bodyID, 
            velocity.memorySegment()
        );
    }
    
    public static void getCenterOfMassPosition(
        MemorySegment bodyInterface, 
        int bodyID, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_POSITION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCenterOfMassPosition}.
     */
    public final void getCenterOfMassPosition(
        int bodyID, 
        Vec3 position
    ) {
        getCenterOfMassPosition(
            this.segment, 
            bodyID, 
            position.memorySegment()
        );
    }
    
    public static int getMotionType(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_MOTION_TYPE.get();
        try {
            return (int) method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotionType}.
     */
    public final int getMotionType(
        int bodyID
    ) {
        return (int) getMotionType(
            this.segment, 
            bodyID
        );
    }
    
    public static void setMotionType(
        MemorySegment bodyInterface, 
        int bodyID, 
        int motionType, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_MOTION_TYPE.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID, 
                motionType, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMotionType}.
     */
    public final void setMotionType(
        int bodyID, 
        int motionType, 
        int activationMode
    ) {
        setMotionType(
            this.segment, 
            bodyID, 
            motionType, 
            activationMode
        );
    }
    
    public static float getRestitution(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_RESTITUTION.get();
        try {
            return (float) method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRestitution}.
     */
    public final float getRestitution(
        int bodyID
    ) {
        return (float) getRestitution(
            this.segment, 
            bodyID
        );
    }
    
    public static void setRestitution(
        MemorySegment bodyInterface, 
        int bodyID, 
        float restitution
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_RESTITUTION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID, 
                restitution
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRestitution}.
     */
    public final void setRestitution(
        int bodyID, 
        float restitution
    ) {
        setRestitution(
            this.segment, 
            bodyID, 
            restitution
        );
    }
    
    public static float getFriction(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_FRICTION.get();
        try {
            return (float) method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getFriction}.
     */
    public final float getFriction(
        int bodyID
    ) {
        return (float) getFriction(
            this.segment, 
            bodyID
        );
    }
    
    public static void setFriction(
        MemorySegment bodyInterface, 
        int bodyID, 
        float friction
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_FRICTION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID, 
                friction
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setFriction}.
     */
    public final void setFriction(
        int bodyID, 
        float friction
    ) {
        setFriction(
            this.segment, 
            bodyID, 
            friction
        );
    }
    
    public static void setPosition(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment position, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                position, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPosition}.
     */
    public final void setPosition(
        int bodyId, 
        Vec3 position, 
        int activationMode
    ) {
        setPosition(
            this.segment, 
            bodyId, 
            position.memorySegment(), 
            activationMode
        );
    }
    
    public static void getPosition(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_POSITION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPosition}.
     */
    public final void getPosition(
        int bodyId, 
        Vec3 result
    ) {
        getPosition(
            this.segment, 
            bodyId, 
            result.memorySegment()
        );
    }
    
    public static void setRotation(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment rotation, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_ROTATION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                rotation, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRotation}.
     */
    public final void setRotation(
        int bodyId, 
        Quat rotation, 
        int activationMode
    ) {
        setRotation(
            this.segment, 
            bodyId, 
            rotation.memorySegment(), 
            activationMode
        );
    }
    
    public static void getRotation(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_ROTATION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotation}.
     */
    public final void getRotation(
        int bodyId, 
        Quat result
    ) {
        getRotation(
            this.segment, 
            bodyId, 
            result.memorySegment()
        );
    }
    
    public static void setPositionAndRotation(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment position, 
        MemorySegment rotation, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                position, 
                rotation, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPositionAndRotation}.
     */
    public final void setPositionAndRotation(
        int bodyId, 
        Vec3 position, 
        Quat rotation, 
        int activationMode
    ) {
        setPositionAndRotation(
            this.segment, 
            bodyId, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            activationMode
        );
    }
    
    public static void setPositionAndRotationWhenChanged(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment position, 
        MemorySegment rotation, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_AND_ROTATION_WHEN_CHANGED.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                position, 
                rotation, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPositionAndRotationWhenChanged}.
     */
    public final void setPositionAndRotationWhenChanged(
        int bodyId, 
        Vec3 position, 
        Quat rotation, 
        int activationMode
    ) {
        setPositionAndRotationWhenChanged(
            this.segment, 
            bodyId, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            activationMode
        );
    }
    
    public static void getPositionAndRotation(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment position, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_POSITION_AND_ROTATION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                position, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPositionAndRotation}.
     */
    public final void getPositionAndRotation(
        int bodyId, 
        Vec3 position, 
        Quat rotation
    ) {
        getPositionAndRotation(
            this.segment, 
            bodyId, 
            position.memorySegment(), 
            rotation.memorySegment()
        );
    }
    
    public static void setPositionRotationAndVelocity(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment position, 
        MemorySegment rotation, 
        MemorySegment linearVelocity, 
        MemorySegment angularVelocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_POSITION_ROTATION_AND_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                position, 
                rotation, 
                linearVelocity, 
                angularVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPositionRotationAndVelocity}.
     */
    public final void setPositionRotationAndVelocity(
        int bodyId, 
        Vec3 position, 
        Quat rotation, 
        Vec3 linearVelocity, 
        Vec3 angularVelocity
    ) {
        setPositionRotationAndVelocity(
            this.segment, 
            bodyId, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            linearVelocity.memorySegment(), 
            angularVelocity.memorySegment()
        );
    }
    
    public static void getCollisionGroup(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_COLLISION_GROUP.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCollisionGroup}.
     */
    public final void getCollisionGroup(
        int bodyId, 
        CollisionGroup result
    ) {
        getCollisionGroup(
            this.segment, 
            bodyId, 
            result.memorySegment()
        );
    }
    
    public static void setCollisionGroup(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment group
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_COLLISION_GROUP.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                group
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setCollisionGroup}.
     */
    public final void setCollisionGroup(
        int bodyId, 
        CollisionGroup group
    ) {
        setCollisionGroup(
            this.segment, 
            bodyId, 
            group.memorySegment()
        );
    }
    
    public static MemorySegment getShape(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getShape}.
     */
    public final @Nullable Shape getShape(
        int bodyId
    ) {
        MemorySegment segment = getShape(
            this.segment, 
            bodyId
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Shape(segment);
    }
    
    public static void setShape(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment shape, 
        boolean updateMassProperties, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_SHAPE.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                shape, 
                updateMassProperties, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setShape}.
     */
    public final void setShape(
        int bodyId, 
        Shape shape, 
        boolean updateMassProperties, 
        int activationMode
    ) {
        setShape(
            this.segment, 
            bodyId, 
            shape.memorySegment(), 
            updateMassProperties, 
            activationMode
        );
    }
    
    public static void notifyShapeChanged(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment previousCenterOfMass, 
        boolean updateMassProperties, 
        int activationMode
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_NOTIFY_SHAPE_CHANGED.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                previousCenterOfMass, 
                updateMassProperties, 
                activationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #notifyShapeChanged}.
     */
    public final void notifyShapeChanged(
        int bodyId, 
        Vec3 previousCenterOfMass, 
        boolean updateMassProperties, 
        int activationMode
    ) {
        notifyShapeChanged(
            this.segment, 
            bodyId, 
            previousCenterOfMass.memorySegment(), 
            updateMassProperties, 
            activationMode
        );
    }
    
    public static void activateBody(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #activateBody}.
     */
    public final void activateBody(
        int bodyId
    ) {
        activateBody(
            this.segment, 
            bodyId
        );
    }
    
    public static void activateBodies(
        MemorySegment bodyInterface, 
        MemorySegment bodyIDs, 
        int count
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODIES.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyIDs, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #activateBodies}.
     */
    public final void activateBodies(
        NativeIntArray bodyIDs, 
        int count
    ) {
        activateBodies(
            this.segment, 
            bodyIDs.memorySegment(), 
            count
        );
    }
    
    public static void activateBodiesInAABox(
        MemorySegment bodyInterface, 
        MemorySegment box, 
        MemorySegment broadPhaseLayerFilter, 
        MemorySegment objectLayerFilter
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ACTIVATE_BODIES_IN_AABOX.get();
        try {
            method.invokeExact(
                bodyInterface, 
                box, 
                broadPhaseLayerFilter, 
                objectLayerFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #activateBodiesInAABox}.
     */
    public final void activateBodiesInAABox(
        AABox box, 
        BroadPhaseLayerFilter broadPhaseLayerFilter, 
        ObjectLayerFilter objectLayerFilter
    ) {
        activateBodiesInAABox(
            this.segment, 
            box.memorySegment(), 
            broadPhaseLayerFilter.memorySegment(), 
            objectLayerFilter.memorySegment()
        );
    }
    
    public static void deactivateBody(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_DEACTIVATE_BODY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #deactivateBody}.
     */
    public final void deactivateBody(
        int bodyId
    ) {
        deactivateBody(
            this.segment, 
            bodyId
        );
    }
    
    public static void deactivateBodies(
        MemorySegment bodyInterface, 
        MemorySegment bodyIDs, 
        int count
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_DEACTIVATE_BODIES.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyIDs, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #deactivateBodies}.
     */
    public final void deactivateBodies(
        NativeIntArray bodyIDs, 
        int count
    ) {
        deactivateBodies(
            this.segment, 
            bodyIDs.memorySegment(), 
            count
        );
    }
    
    public static boolean isActive(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_IS_ACTIVE.get();
        try {
            return (boolean) method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isActive}.
     */
    public final boolean isActive(
        int bodyID
    ) {
        return (boolean) isActive(
            this.segment, 
            bodyID
        );
    }
    
    public static void resetSleepTimer(
        MemorySegment bodyInterface, 
        int bodyID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_RESET_SLEEP_TIMER.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resetSleepTimer}.
     */
    public final void resetSleepTimer(
        int bodyID
    ) {
        resetSleepTimer(
            this.segment, 
            bodyID
        );
    }
    
    public static int getObjectLayer(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_OBJECT_LAYER.get();
        try {
            return (int) method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getObjectLayer}.
     */
    public final int getObjectLayer(
        int bodyId
    ) {
        return (int) getObjectLayer(
            this.segment, 
            bodyId
        );
    }
    
    public static void setObjectLayer(
        MemorySegment bodyInterface, 
        int bodyId, 
        int layer
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_OBJECT_LAYER.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                layer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setObjectLayer}.
     */
    public final void setObjectLayer(
        int bodyId, 
        int layer
    ) {
        setObjectLayer(
            this.segment, 
            bodyId, 
            layer
        );
    }
    
    public static void getWorldTransform(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_WORLD_TRANSFORM.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldTransform}.
     */
    public final void getWorldTransform(
        int bodyId, 
        Mat4 result
    ) {
        getWorldTransform(
            this.segment, 
            bodyId, 
            result.memorySegment()
        );
    }
    
    public static void getCenterOfMassTransform(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_CENTER_OF_MASS_TRANSFORM.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCenterOfMassTransform}.
     */
    public final void getCenterOfMassTransform(
        int bodyId, 
        Mat4 result
    ) {
        getCenterOfMassTransform(
            this.segment, 
            bodyId, 
            result.memorySegment()
        );
    }
    
    public static void moveKinematic(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment targetPosition, 
        MemorySegment targetRotation, 
        float deltaTime
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_MOVE_KINEMATIC.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                targetPosition, 
                targetRotation, 
                deltaTime
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #moveKinematic}.
     */
    public final void moveKinematic(
        int bodyId, 
        Vec3 targetPosition, 
        Quat targetRotation, 
        float deltaTime
    ) {
        moveKinematic(
            this.segment, 
            bodyId, 
            targetPosition.memorySegment(), 
            targetRotation.memorySegment(), 
            deltaTime
        );
    }
    
    public static boolean applyBuoyancyImpulse(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment surfacePosition, 
        MemorySegment surfaceNormal, 
        float buoyancy, 
        float linearDrag, 
        float angularDrag, 
        MemorySegment fluidVelocity, 
        MemorySegment gravity, 
        float deltaTime
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_APPLY_BUOYANCY_IMPULSE.get();
        try {
            return (boolean) method.invokeExact(
                bodyInterface, 
                bodyId, 
                surfacePosition, 
                surfaceNormal, 
                buoyancy, 
                linearDrag, 
                angularDrag, 
                fluidVelocity, 
                gravity, 
                deltaTime
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #applyBuoyancyImpulse}.
     */
    public final boolean applyBuoyancyImpulse(
        int bodyId, 
        Vec3 surfacePosition, 
        Vec3 surfaceNormal, 
        float buoyancy, 
        float linearDrag, 
        float angularDrag, 
        Vec3 fluidVelocity, 
        Vec3 gravity, 
        float deltaTime
    ) {
        return (boolean) applyBuoyancyImpulse(
            this.segment, 
            bodyId, 
            surfacePosition.memorySegment(), 
            surfaceNormal.memorySegment(), 
            buoyancy, 
            linearDrag, 
            angularDrag, 
            fluidVelocity.memorySegment(), 
            gravity.memorySegment(), 
            deltaTime
        );
    }
    
    public static void setLinearAndAngularVelocity(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment linearVelocity, 
        MemorySegment angularVelocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_LINEAR_AND_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                linearVelocity, 
                angularVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLinearAndAngularVelocity}.
     */
    public final void setLinearAndAngularVelocity(
        int bodyId, 
        Vec3 linearVelocity, 
        Vec3 angularVelocity
    ) {
        setLinearAndAngularVelocity(
            this.segment, 
            bodyId, 
            linearVelocity.memorySegment(), 
            angularVelocity.memorySegment()
        );
    }
    
    public static void getLinearAndAngularVelocity(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment linearVelocity, 
        MemorySegment angularVelocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_LINEAR_AND_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                linearVelocity, 
                angularVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLinearAndAngularVelocity}.
     */
    public final void getLinearAndAngularVelocity(
        int bodyId, 
        Vec3 linearVelocity, 
        Vec3 angularVelocity
    ) {
        getLinearAndAngularVelocity(
            this.segment, 
            bodyId, 
            linearVelocity.memorySegment(), 
            angularVelocity.memorySegment()
        );
    }
    
    public static void addLinearVelocity(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment linearVelocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                linearVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addLinearVelocity}.
     */
    public final void addLinearVelocity(
        int bodyId, 
        Vec3 linearVelocity
    ) {
        addLinearVelocity(
            this.segment, 
            bodyId, 
            linearVelocity.memorySegment()
        );
    }
    
    public static void addLinearAndAngularVelocity(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment linearVelocity, 
        MemorySegment angularVelocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_LINEAR_AND_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                linearVelocity, 
                angularVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addLinearAndAngularVelocity}.
     */
    public final void addLinearAndAngularVelocity(
        int bodyId, 
        Vec3 linearVelocity, 
        Vec3 angularVelocity
    ) {
        addLinearAndAngularVelocity(
            this.segment, 
            bodyId, 
            linearVelocity.memorySegment(), 
            angularVelocity.memorySegment()
        );
    }
    
    public static void setAngularVelocity(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment angularVelocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                angularVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAngularVelocity}.
     */
    public final void setAngularVelocity(
        int bodyId, 
        Vec3 angularVelocity
    ) {
        setAngularVelocity(
            this.segment, 
            bodyId, 
            angularVelocity.memorySegment()
        );
    }
    
    public static void getAngularVelocity(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment angularVelocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                angularVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAngularVelocity}.
     */
    public final void getAngularVelocity(
        int bodyId, 
        Vec3 angularVelocity
    ) {
        getAngularVelocity(
            this.segment, 
            bodyId, 
            angularVelocity.memorySegment()
        );
    }
    
    public static void getPointVelocity(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment point, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_POINT_VELOCITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                point, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPointVelocity}.
     */
    public final void getPointVelocity(
        int bodyId, 
        Vec3 point, 
        Vec3 velocity
    ) {
        getPointVelocity(
            this.segment, 
            bodyId, 
            point.memorySegment(), 
            velocity.memorySegment()
        );
    }
    
    public static void addForce(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment force
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                force
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addForce}.
     */
    public final void addForce(
        int bodyId, 
        Vec3 force
    ) {
        addForce(
            this.segment, 
            bodyId, 
            force.memorySegment()
        );
    }
    
    public static void addForce2(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment force, 
        MemorySegment point
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE2.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                force, 
                point
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addForce2}.
     */
    public final void addForce2(
        int bodyId, 
        Vec3 force, 
        Vec3 point
    ) {
        addForce2(
            this.segment, 
            bodyId, 
            force.memorySegment(), 
            point.memorySegment()
        );
    }
    
    public static void addTorque(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment torque
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_TORQUE.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                torque
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addTorque}.
     */
    public final void addTorque(
        int bodyId, 
        Vec3 torque
    ) {
        addTorque(
            this.segment, 
            bodyId, 
            torque.memorySegment()
        );
    }
    
    public static void addForceAndTorque(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment force, 
        MemorySegment torque
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_FORCE_AND_TORQUE.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                force, 
                torque
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addForceAndTorque}.
     */
    public final void addForceAndTorque(
        int bodyId, 
        Vec3 force, 
        Vec3 torque
    ) {
        addForceAndTorque(
            this.segment, 
            bodyId, 
            force.memorySegment(), 
            torque.memorySegment()
        );
    }
    
    public static void addImpulse(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment impulse
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_IMPULSE.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                impulse
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addImpulse}.
     */
    public final void addImpulse(
        int bodyId, 
        Vec3 impulse
    ) {
        addImpulse(
            this.segment, 
            bodyId, 
            impulse.memorySegment()
        );
    }
    
    public static void addImpulse2(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment impulse, 
        MemorySegment point
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_IMPULSE2.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                impulse, 
                point
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addImpulse2}.
     */
    public final void addImpulse2(
        int bodyId, 
        Vec3 impulse, 
        Vec3 point
    ) {
        addImpulse2(
            this.segment, 
            bodyId, 
            impulse.memorySegment(), 
            point.memorySegment()
        );
    }
    
    public static void addAngularImpulse(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment angularImpulse
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_ADD_ANGULAR_IMPULSE.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                angularImpulse
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addAngularImpulse}.
     */
    public final void addAngularImpulse(
        int bodyId, 
        Vec3 angularImpulse
    ) {
        addAngularImpulse(
            this.segment, 
            bodyId, 
            angularImpulse.memorySegment()
        );
    }
    
    public static void setMotionQuality(
        MemorySegment bodyInterface, 
        int bodyId, 
        int quality
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_MOTION_QUALITY.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                quality
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMotionQuality}.
     */
    public final void setMotionQuality(
        int bodyId, 
        int quality
    ) {
        setMotionQuality(
            this.segment, 
            bodyId, 
            quality
        );
    }
    
    public static int getMotionQuality(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_MOTION_QUALITY.get();
        try {
            return (int) method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotionQuality}.
     */
    public final int getMotionQuality(
        int bodyId
    ) {
        return (int) getMotionQuality(
            this.segment, 
            bodyId
        );
    }
    
    public static void getInverseInertia(
        MemorySegment bodyInterface, 
        int bodyId, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_INVERSE_INERTIA.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInverseInertia}.
     */
    public final void getInverseInertia(
        int bodyId, 
        Mat4 result
    ) {
        getInverseInertia(
            this.segment, 
            bodyId, 
            result.memorySegment()
        );
    }
    
    public static void setGravityFactor(
        MemorySegment bodyInterface, 
        int bodyId, 
        float value
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_GRAVITY_FACTOR.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setGravityFactor}.
     */
    public final void setGravityFactor(
        int bodyId, 
        float value
    ) {
        setGravityFactor(
            this.segment, 
            bodyId, 
            value
        );
    }
    
    public static float getGravityFactor(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_GRAVITY_FACTOR.get();
        try {
            return (float) method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGravityFactor}.
     */
    public final float getGravityFactor(
        int bodyId
    ) {
        return (float) getGravityFactor(
            this.segment, 
            bodyId
        );
    }
    
    public static void setUseManifoldReduction(
        MemorySegment bodyInterface, 
        int bodyId, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_USE_MANIFOLD_REDUCTION.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setUseManifoldReduction}.
     */
    public final void setUseManifoldReduction(
        int bodyId, 
        boolean value
    ) {
        setUseManifoldReduction(
            this.segment, 
            bodyId, 
            value
        );
    }
    
    public static boolean getUseManifoldReduction(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_USE_MANIFOLD_REDUCTION.get();
        try {
            return (boolean) method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUseManifoldReduction}.
     */
    public final boolean getUseManifoldReduction(
        int bodyId
    ) {
        return (boolean) getUseManifoldReduction(
            this.segment, 
            bodyId
        );
    }
    
    public static void setUserData(
        MemorySegment bodyInterface, 
        int bodyId, 
        long inUserData
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_USER_DATA.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                inUserData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setUserData}.
     */
    public final void setUserData(
        int bodyId, 
        long inUserData
    ) {
        setUserData(
            this.segment, 
            bodyId, 
            inUserData
        );
    }
    
    public static long getUserData(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_USER_DATA.get();
        try {
            return (long) method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUserData}.
     */
    public final long getUserData(
        int bodyId
    ) {
        return (long) getUserData(
            this.segment, 
            bodyId
        );
    }
    
    public static void setIsSensor(
        MemorySegment bodyInterface, 
        int bodyId, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_SET_IS_SENSOR.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setIsSensor}.
     */
    public final void setIsSensor(
        int bodyId, 
        boolean value
    ) {
        setIsSensor(
            this.segment, 
            bodyId, 
            value
        );
    }
    
    public static boolean isSensor(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_IS_SENSOR.get();
        try {
            return (boolean) method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isSensor}.
     */
    public final boolean isSensor(
        int bodyId
    ) {
        return (boolean) isSensor(
            this.segment, 
            bodyId
        );
    }
    
    public static MemorySegment getMaterial(
        MemorySegment bodyInterface, 
        int bodyId, 
        int subShapeID
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_GET_MATERIAL.get();
        try {
            return (MemorySegment) method.invokeExact(
                bodyInterface, 
                bodyId, 
                subShapeID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaterial}.
     */
    public final @Nullable PhysicsMaterial getMaterial(
        int bodyId, 
        int subShapeID
    ) {
        MemorySegment segment = getMaterial(
            this.segment, 
            bodyId, 
            subShapeID
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new PhysicsMaterial(segment);
    }
    
    public static void invalidateContactCache(
        MemorySegment bodyInterface, 
        int bodyId
    ) {
        MethodHandle method = JPH_BODY_INTERFACE_INVALIDATE_CONTACT_CACHE.get();
        try {
            method.invokeExact(
                bodyInterface, 
                bodyId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #invalidateContactCache}.
     */
    public final void invalidateContactCache(
        int bodyId
    ) {
        invalidateContactCache(
            this.segment, 
            bodyId
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}