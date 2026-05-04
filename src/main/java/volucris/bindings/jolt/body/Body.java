/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.jolt.MotionProperties;
import volucris.bindings.jolt.filter.CollisionGroup;
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
public final class Body {

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
    private static final LazyConstant<MethodHandle> JPH_BODY_ADD_FORCE_AT_POSITION;
    private static final LazyConstant<MethodHandle> JPH_BODY_ADD_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_ACCUMULATED_FORCE;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_ACCUMULATED_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_BODY_RESET_FORCE;
    private static final LazyConstant<MethodHandle> JPH_BODY_RESET_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_BODY_RESET_MOTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_INVERSE_INERTIA;
    private static final LazyConstant<MethodHandle> JPH_BODY_ADD_IMPULSE;
    private static final LazyConstant<MethodHandle> JPH_BODY_ADD_IMPULSE_AT_POSITION;
    private static final LazyConstant<MethodHandle> JPH_BODY_ADD_ANGULAR_IMPULSE;
    private static final LazyConstant<MethodHandle> JPH_BODY_MOVE_KINEMATIC;
    private static final LazyConstant<MethodHandle> JPH_BODY_APPLY_BUOYANCY_IMPULSE;
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
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_MOTION_PROPERTIES;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED;
    private static final LazyConstant<MethodHandle> JPH_BODY_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_FIXED_TO_WORLD_BODY;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_SOFT_BODY_VERTEX_COUNT;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_SOFT_BODY_VERTEX_POSITION;
    private static final LazyConstant<MethodHandle> JPH_BODY_GET_SOFT_BODY_VERTEX_POSITIONS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BODY_GET_ID = downcallHandle("JPH_Body_GetID", JAVA_INT, UNBOUNDED_ADDRESS);
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
        JPH_BODY_GET_BROAD_PHASE_LAYER = downcallHandle("JPH_Body_GetBroadPhaseLayer", JAVA_BYTE, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_OBJECT_LAYER = downcallHandle("JPH_Body_GetObjectLayer", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_COLLISION_GROUP = downcallHandleVoid("JPH_Body_GetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
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
        JPH_BODY_ADD_FORCE_AT_POSITION = downcallHandleVoid("JPH_Body_AddForceAtPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_ADD_TORQUE = downcallHandleVoid("JPH_Body_AddTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_ACCUMULATED_FORCE = downcallHandleVoid("JPH_Body_GetAccumulatedForce", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_ACCUMULATED_TORQUE = downcallHandleVoid("JPH_Body_GetAccumulatedTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_RESET_FORCE = downcallHandleVoid("JPH_Body_ResetForce", UNBOUNDED_ADDRESS);
        JPH_BODY_RESET_TORQUE = downcallHandleVoid("JPH_Body_ResetTorque", UNBOUNDED_ADDRESS);
        JPH_BODY_RESET_MOTION = downcallHandleVoid("JPH_Body_ResetMotion", UNBOUNDED_ADDRESS);
        JPH_BODY_GET_INVERSE_INERTIA = downcallHandleVoid("JPH_Body_GetInverseInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_ADD_IMPULSE = downcallHandleVoid("JPH_Body_AddImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_ADD_IMPULSE_AT_POSITION = downcallHandleVoid("JPH_Body_AddImpulseAtPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_ADD_ANGULAR_IMPULSE = downcallHandleVoid("JPH_Body_AddAngularImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_MOVE_KINEMATIC = downcallHandleVoid("JPH_Body_MoveKinematic", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_APPLY_BUOYANCY_IMPULSE = downcallHandle("JPH_Body_ApplyBuoyancyImpulse", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_IS_IN_BROAD_PHASE = downcallHandle("JPH_Body_IsInBroadPhase", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_IS_COLLISION_CACHE_INVALID = downcallHandle("JPH_Body_IsCollisionCacheInvalid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_SHAPE = downcallHandle("JPH_Body_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_POSITION = downcallHandleVoid("JPH_Body_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_ROTATION = downcallHandleVoid("JPH_Body_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_Body_GetWorldTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_Body_GetCenterOfMassPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_Body_GetCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_INVERSE_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_Body_GetInverseCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_WORLD_SPACE_BOUNDS = downcallHandleVoid("JPH_Body_GetWorldSpaceBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL = downcallHandleVoid("JPH_Body_GetWorldSpaceSurfaceNormal", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_MOTION_PROPERTIES = downcallHandle("JPH_Body_GetMotionProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED = downcallHandle("JPH_Body_GetMotionPropertiesUnchecked", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_SET_USER_DATA = downcallHandleVoid("JPH_Body_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
        JPH_BODY_GET_USER_DATA = downcallHandle("JPH_Body_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_FIXED_TO_WORLD_BODY = downcallHandle("JPH_Body_GetFixedToWorldBody", UNBOUNDED_ADDRESS);
        JPH_BODY_GET_SOFT_BODY_VERTEX_COUNT = downcallHandle("JPH_Body_GetSoftBodyVertexCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_SOFT_BODY_VERTEX_POSITION = downcallHandleVoid("JPH_Body_GetSoftBodyVertexPosition", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_GET_SOFT_BODY_VERTEX_POSITIONS = downcallHandleVoid("JPH_Body_GetSoftBodyVertexPositions", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public Body(MemorySegment segment) {
        this.segment = segment;
    }

    public static int getID(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_ID.get();
        try {
            return (int) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getID}.
     */
    public final int getID(
    ) {
        return (int) getID(
            this.segment
        );
    }
    
    public static int getBodyType(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_BODY_TYPE.get();
        try {
            return (int) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyType}.
     */
    public final int getBodyType(
    ) {
        return (int) getBodyType(
            this.segment
        );
    }
    
    public static boolean isRigidBody(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_RIGID_BODY.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isRigidBody}.
     */
    public final boolean isRigidBody(
    ) {
        return (boolean) isRigidBody(
            this.segment
        );
    }
    
    public static boolean isSoftBody(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_SOFT_BODY.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isSoftBody}.
     */
    public final boolean isSoftBody(
    ) {
        return (boolean) isSoftBody(
            this.segment
        );
    }
    
    public static boolean isActive(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_ACTIVE.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isActive}.
     */
    public final boolean isActive(
    ) {
        return (boolean) isActive(
            this.segment
        );
    }
    
    public static boolean isStatic(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_STATIC.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isStatic}.
     */
    public final boolean isStatic(
    ) {
        return (boolean) isStatic(
            this.segment
        );
    }
    
    public static boolean isKinematic(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_KINEMATIC.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isKinematic}.
     */
    public final boolean isKinematic(
    ) {
        return (boolean) isKinematic(
            this.segment
        );
    }
    
    public static boolean isDynamic(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_DYNAMIC.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isDynamic}.
     */
    public final boolean isDynamic(
    ) {
        return (boolean) isDynamic(
            this.segment
        );
    }
    
    public static boolean canBeKinematicOrDynamic(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_CAN_BE_KINEMATIC_OR_DYNAMIC.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #canBeKinematicOrDynamic}.
     */
    public final boolean canBeKinematicOrDynamic(
    ) {
        return (boolean) canBeKinematicOrDynamic(
            this.segment
        );
    }
    
    public static void setIsSensor(
        MemorySegment body, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_SET_IS_SENSOR.get();
        try {
            method.invokeExact(
                body, 
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
        boolean value
    ) {
        setIsSensor(
            this.segment, 
            value
        );
    }
    
    public static boolean isSensor(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_SENSOR.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isSensor}.
     */
    public final boolean isSensor(
    ) {
        return (boolean) isSensor(
            this.segment
        );
    }
    
    public static void setCollideKinematicVsNonDynamic(
        MemorySegment body, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC.get();
        try {
            method.invokeExact(
                body, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setCollideKinematicVsNonDynamic}.
     */
    public final void setCollideKinematicVsNonDynamic(
        boolean value
    ) {
        setCollideKinematicVsNonDynamic(
            this.segment, 
            value
        );
    }
    
    public static boolean getCollideKinematicVsNonDynamic(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCollideKinematicVsNonDynamic}.
     */
    public final boolean getCollideKinematicVsNonDynamic(
    ) {
        return (boolean) getCollideKinematicVsNonDynamic(
            this.segment
        );
    }
    
    public static void setUseManifoldReduction(
        MemorySegment body, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_SET_USE_MANIFOLD_REDUCTION.get();
        try {
            method.invokeExact(
                body, 
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
        boolean value
    ) {
        setUseManifoldReduction(
            this.segment, 
            value
        );
    }
    
    public static boolean getUseManifoldReduction(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_USE_MANIFOLD_REDUCTION.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUseManifoldReduction}.
     */
    public final boolean getUseManifoldReduction(
    ) {
        return (boolean) getUseManifoldReduction(
            this.segment
        );
    }
    
    public static boolean getUseManifoldReductionWithBody(
        MemorySegment body, 
        MemorySegment other
    ) {
        MethodHandle method = JPH_BODY_GET_USE_MANIFOLD_REDUCTION_WITH_BODY.get();
        try {
            return (boolean) method.invokeExact(
                body, 
                other
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUseManifoldReductionWithBody}.
     */
    public final boolean getUseManifoldReductionWithBody(
        Body other
    ) {
        return (boolean) getUseManifoldReductionWithBody(
            this.segment, 
            other.memorySegment()
        );
    }
    
    public static void setApplyGyroscopicForce(
        MemorySegment body, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_SET_APPLY_GYROSCOPIC_FORCE.get();
        try {
            method.invokeExact(
                body, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setApplyGyroscopicForce}.
     */
    public final void setApplyGyroscopicForce(
        boolean value
    ) {
        setApplyGyroscopicForce(
            this.segment, 
            value
        );
    }
    
    public static boolean getApplyGyroscopicForce(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_APPLY_GYROSCOPIC_FORCE.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getApplyGyroscopicForce}.
     */
    public final boolean getApplyGyroscopicForce(
    ) {
        return (boolean) getApplyGyroscopicForce(
            this.segment
        );
    }
    
    public static void setEnhancedInternalEdgeRemoval(
        MemorySegment body, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_SET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
        try {
            method.invokeExact(
                body, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setEnhancedInternalEdgeRemoval}.
     */
    public final void setEnhancedInternalEdgeRemoval(
        boolean value
    ) {
        setEnhancedInternalEdgeRemoval(
            this.segment, 
            value
        );
    }
    
    public static boolean getEnhancedInternalEdgeRemoval(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getEnhancedInternalEdgeRemoval}.
     */
    public final boolean getEnhancedInternalEdgeRemoval(
    ) {
        return (boolean) getEnhancedInternalEdgeRemoval(
            this.segment
        );
    }
    
    public static boolean getEnhancedInternalEdgeRemovalWithBody(
        MemorySegment body, 
        MemorySegment other
    ) {
        MethodHandle method = JPH_BODY_GET_ENHANCED_INTERNAL_EDGE_REMOVAL_WITH_BODY.get();
        try {
            return (boolean) method.invokeExact(
                body, 
                other
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getEnhancedInternalEdgeRemovalWithBody}.
     */
    public final boolean getEnhancedInternalEdgeRemovalWithBody(
        Body other
    ) {
        return (boolean) getEnhancedInternalEdgeRemovalWithBody(
            this.segment, 
            other.memorySegment()
        );
    }
    
    public static int getMotionType(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_MOTION_TYPE.get();
        try {
            return (int) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotionType}.
     */
    public final int getMotionType(
    ) {
        return (int) getMotionType(
            this.segment
        );
    }
    
    public static void setMotionType(
        MemorySegment body, 
        int motionType
    ) {
        MethodHandle method = JPH_BODY_SET_MOTION_TYPE.get();
        try {
            method.invokeExact(
                body, 
                motionType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMotionType}.
     */
    public final void setMotionType(
        int motionType
    ) {
        setMotionType(
            this.segment, 
            motionType
        );
    }
    
    public static byte getBroadPhaseLayer(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_BROAD_PHASE_LAYER.get();
        try {
            return (byte) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBroadPhaseLayer}.
     */
    public final byte getBroadPhaseLayer(
    ) {
        return (byte) getBroadPhaseLayer(
            this.segment
        );
    }
    
    public static int getObjectLayer(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_OBJECT_LAYER.get();
        try {
            return (int) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getObjectLayer}.
     */
    public final int getObjectLayer(
    ) {
        return (int) getObjectLayer(
            this.segment
        );
    }
    
    public static void getCollisionGroup(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_COLLISION_GROUP.get();
        try {
            method.invokeExact(
                body, 
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
        CollisionGroup result
    ) {
        getCollisionGroup(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setCollisionGroup(
        MemorySegment body, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_BODY_SET_COLLISION_GROUP.get();
        try {
            method.invokeExact(
                body, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setCollisionGroup}.
     */
    public final void setCollisionGroup(
        CollisionGroup value
    ) {
        setCollisionGroup(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static boolean getAllowSleeping(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_ALLOW_SLEEPING.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAllowSleeping}.
     */
    public final boolean getAllowSleeping(
    ) {
        return (boolean) getAllowSleeping(
            this.segment
        );
    }
    
    public static void setAllowSleeping(
        MemorySegment body, 
        boolean allowSleeping
    ) {
        MethodHandle method = JPH_BODY_SET_ALLOW_SLEEPING.get();
        try {
            method.invokeExact(
                body, 
                allowSleeping
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAllowSleeping}.
     */
    public final void setAllowSleeping(
        boolean allowSleeping
    ) {
        setAllowSleeping(
            this.segment, 
            allowSleeping
        );
    }
    
    public static void resetSleepTimer(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_RESET_SLEEP_TIMER.get();
        try {
            method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resetSleepTimer}.
     */
    public final void resetSleepTimer(
    ) {
        resetSleepTimer(
            this.segment
        );
    }
    
    public static float getFriction(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_FRICTION.get();
        try {
            return (float) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getFriction}.
     */
    public final float getFriction(
    ) {
        return (float) getFriction(
            this.segment
        );
    }
    
    public static void setFriction(
        MemorySegment body, 
        float friction
    ) {
        MethodHandle method = JPH_BODY_SET_FRICTION.get();
        try {
            method.invokeExact(
                body, 
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
        float friction
    ) {
        setFriction(
            this.segment, 
            friction
        );
    }
    
    public static float getRestitution(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_RESTITUTION.get();
        try {
            return (float) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRestitution}.
     */
    public final float getRestitution(
    ) {
        return (float) getRestitution(
            this.segment
        );
    }
    
    public static void setRestitution(
        MemorySegment body, 
        float restitution
    ) {
        MethodHandle method = JPH_BODY_SET_RESTITUTION.get();
        try {
            method.invokeExact(
                body, 
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
        float restitution
    ) {
        setRestitution(
            this.segment, 
            restitution
        );
    }
    
    public static void getLinearVelocity(
        MemorySegment body, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_GET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                body, 
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
        Vec3 velocity
    ) {
        getLinearVelocity(
            this.segment, 
            velocity.memorySegment()
        );
    }
    
    public static void setLinearVelocity(
        MemorySegment body, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_SET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                body, 
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
        Vec3 velocity
    ) {
        setLinearVelocity(
            this.segment, 
            velocity.memorySegment()
        );
    }
    
    public static void setLinearVelocityClamped(
        MemorySegment body, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_SET_LINEAR_VELOCITY_CLAMPED.get();
        try {
            method.invokeExact(
                body, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLinearVelocityClamped}.
     */
    public final void setLinearVelocityClamped(
        Vec3 velocity
    ) {
        setLinearVelocityClamped(
            this.segment, 
            velocity.memorySegment()
        );
    }
    
    public static void getAngularVelocity(
        MemorySegment body, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_GET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                body, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAngularVelocity}.
     */
    public final void getAngularVelocity(
        Vec3 velocity
    ) {
        getAngularVelocity(
            this.segment, 
            velocity.memorySegment()
        );
    }
    
    public static void setAngularVelocity(
        MemorySegment body, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_SET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                body, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAngularVelocity}.
     */
    public final void setAngularVelocity(
        Vec3 velocity
    ) {
        setAngularVelocity(
            this.segment, 
            velocity.memorySegment()
        );
    }
    
    public static void setAngularVelocityClamped(
        MemorySegment body, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_SET_ANGULAR_VELOCITY_CLAMPED.get();
        try {
            method.invokeExact(
                body, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAngularVelocityClamped}.
     */
    public final void setAngularVelocityClamped(
        Vec3 velocity
    ) {
        setAngularVelocityClamped(
            this.segment, 
            velocity.memorySegment()
        );
    }
    
    public static void getPointVelocityCOM(
        MemorySegment body, 
        MemorySegment pointRelativeToCOM, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_GET_POINT_VELOCITY_COM.get();
        try {
            method.invokeExact(
                body, 
                pointRelativeToCOM, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPointVelocityCOM}.
     */
    public final void getPointVelocityCOM(
        Vec3 pointRelativeToCOM, 
        Vec3 velocity
    ) {
        getPointVelocityCOM(
            this.segment, 
            pointRelativeToCOM.memorySegment(), 
            velocity.memorySegment()
        );
    }
    
    public static void getPointVelocity(
        MemorySegment body, 
        MemorySegment point, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_GET_POINT_VELOCITY.get();
        try {
            method.invokeExact(
                body, 
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
        Vec3 point, 
        Vec3 velocity
    ) {
        getPointVelocity(
            this.segment, 
            point.memorySegment(), 
            velocity.memorySegment()
        );
    }
    
    public static void addForce(
        MemorySegment body, 
        MemorySegment force
    ) {
        MethodHandle method = JPH_BODY_ADD_FORCE.get();
        try {
            method.invokeExact(
                body, 
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
        Vec3 force
    ) {
        addForce(
            this.segment, 
            force.memorySegment()
        );
    }
    
    public static void addForceAtPosition(
        MemorySegment body, 
        MemorySegment force, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_BODY_ADD_FORCE_AT_POSITION.get();
        try {
            method.invokeExact(
                body, 
                force, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addForceAtPosition}.
     */
    public final void addForceAtPosition(
        Vec3 force, 
        Vec3 position
    ) {
        addForceAtPosition(
            this.segment, 
            force.memorySegment(), 
            position.memorySegment()
        );
    }
    
    public static void addTorque(
        MemorySegment body, 
        MemorySegment force
    ) {
        MethodHandle method = JPH_BODY_ADD_TORQUE.get();
        try {
            method.invokeExact(
                body, 
                force
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addTorque}.
     */
    public final void addTorque(
        Vec3 force
    ) {
        addTorque(
            this.segment, 
            force.memorySegment()
        );
    }
    
    public static void getAccumulatedForce(
        MemorySegment body, 
        MemorySegment force
    ) {
        MethodHandle method = JPH_BODY_GET_ACCUMULATED_FORCE.get();
        try {
            method.invokeExact(
                body, 
                force
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAccumulatedForce}.
     */
    public final void getAccumulatedForce(
        Vec3 force
    ) {
        getAccumulatedForce(
            this.segment, 
            force.memorySegment()
        );
    }
    
    public static void getAccumulatedTorque(
        MemorySegment body, 
        MemorySegment force
    ) {
        MethodHandle method = JPH_BODY_GET_ACCUMULATED_TORQUE.get();
        try {
            method.invokeExact(
                body, 
                force
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAccumulatedTorque}.
     */
    public final void getAccumulatedTorque(
        Vec3 force
    ) {
        getAccumulatedTorque(
            this.segment, 
            force.memorySegment()
        );
    }
    
    public static void resetForce(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_RESET_FORCE.get();
        try {
            method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resetForce}.
     */
    public final void resetForce(
    ) {
        resetForce(
            this.segment
        );
    }
    
    public static void resetTorque(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_RESET_TORQUE.get();
        try {
            method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resetTorque}.
     */
    public final void resetTorque(
    ) {
        resetTorque(
            this.segment
        );
    }
    
    public static void resetMotion(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_RESET_MOTION.get();
        try {
            method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #resetMotion}.
     */
    public final void resetMotion(
    ) {
        resetMotion(
            this.segment
        );
    }
    
    public static void getInverseInertia(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_INVERSE_INERTIA.get();
        try {
            method.invokeExact(
                body, 
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
        Mat4 result
    ) {
        getInverseInertia(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void addImpulse(
        MemorySegment body, 
        MemorySegment impulse
    ) {
        MethodHandle method = JPH_BODY_ADD_IMPULSE.get();
        try {
            method.invokeExact(
                body, 
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
        Vec3 impulse
    ) {
        addImpulse(
            this.segment, 
            impulse.memorySegment()
        );
    }
    
    public static void addImpulseAtPosition(
        MemorySegment body, 
        MemorySegment impulse, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_BODY_ADD_IMPULSE_AT_POSITION.get();
        try {
            method.invokeExact(
                body, 
                impulse, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addImpulseAtPosition}.
     */
    public final void addImpulseAtPosition(
        Vec3 impulse, 
        Vec3 position
    ) {
        addImpulseAtPosition(
            this.segment, 
            impulse.memorySegment(), 
            position.memorySegment()
        );
    }
    
    public static void addAngularImpulse(
        MemorySegment body, 
        MemorySegment angularImpulse
    ) {
        MethodHandle method = JPH_BODY_ADD_ANGULAR_IMPULSE.get();
        try {
            method.invokeExact(
                body, 
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
        Vec3 angularImpulse
    ) {
        addAngularImpulse(
            this.segment, 
            angularImpulse.memorySegment()
        );
    }
    
    public static void moveKinematic(
        MemorySegment body, 
        MemorySegment targetPosition, 
        MemorySegment targetRotation, 
        float deltaTime
    ) {
        MethodHandle method = JPH_BODY_MOVE_KINEMATIC.get();
        try {
            method.invokeExact(
                body, 
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
        Vec3 targetPosition, 
        Quat targetRotation, 
        float deltaTime
    ) {
        moveKinematic(
            this.segment, 
            targetPosition.memorySegment(), 
            targetRotation.memorySegment(), 
            deltaTime
        );
    }
    
    public static boolean applyBuoyancyImpulse(
        MemorySegment body, 
        MemorySegment surfacePosition, 
        MemorySegment surfaceNormal, 
        float buoyancy, 
        float linearDrag, 
        float angularDrag, 
        MemorySegment fluidVelocity, 
        MemorySegment gravity, 
        float deltaTime
    ) {
        MethodHandle method = JPH_BODY_APPLY_BUOYANCY_IMPULSE.get();
        try {
            return (boolean) method.invokeExact(
                body, 
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
    
    public static boolean isInBroadPhase(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_IN_BROAD_PHASE.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isInBroadPhase}.
     */
    public final boolean isInBroadPhase(
    ) {
        return (boolean) isInBroadPhase(
            this.segment
        );
    }
    
    public static boolean isCollisionCacheInvalid(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_IS_COLLISION_CACHE_INVALID.get();
        try {
            return (boolean) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isCollisionCacheInvalid}.
     */
    public final boolean isCollisionCacheInvalid(
    ) {
        return (boolean) isCollisionCacheInvalid(
            this.segment
        );
    }
    
    public static MemorySegment getShape(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getShape}.
     */
    public final @Nullable Shape getShape(
    ) {
        MemorySegment segment = getShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Shape(segment);
    }
    
    public static void getPosition(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_POSITION.get();
        try {
            method.invokeExact(
                body, 
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
        Vec3 result
    ) {
        getPosition(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getRotation(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_ROTATION.get();
        try {
            method.invokeExact(
                body, 
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
        Quat result
    ) {
        getRotation(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getWorldTransform(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_WORLD_TRANSFORM.get();
        try {
            method.invokeExact(
                body, 
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
        Mat4 result
    ) {
        getWorldTransform(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getCenterOfMassPosition(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_CENTER_OF_MASS_POSITION.get();
        try {
            method.invokeExact(
                body, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCenterOfMassPosition}.
     */
    public final void getCenterOfMassPosition(
        Vec3 result
    ) {
        getCenterOfMassPosition(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getCenterOfMassTransform(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_CENTER_OF_MASS_TRANSFORM.get();
        try {
            method.invokeExact(
                body, 
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
        Mat4 result
    ) {
        getCenterOfMassTransform(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getInverseCenterOfMassTransform(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_INVERSE_CENTER_OF_MASS_TRANSFORM.get();
        try {
            method.invokeExact(
                body, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInverseCenterOfMassTransform}.
     */
    public final void getInverseCenterOfMassTransform(
        Mat4 result
    ) {
        getInverseCenterOfMassTransform(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getWorldSpaceBounds(
        MemorySegment body, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_GET_WORLD_SPACE_BOUNDS.get();
        try {
            method.invokeExact(
                body, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldSpaceBounds}.
     */
    public final void getWorldSpaceBounds(
        AABox result
    ) {
        getWorldSpaceBounds(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void getWorldSpaceSurfaceNormal(
        MemorySegment body, 
        int subShapeID, 
        MemorySegment position, 
        MemorySegment normal
    ) {
        MethodHandle method = JPH_BODY_GET_WORLD_SPACE_SURFACE_NORMAL.get();
        try {
            method.invokeExact(
                body, 
                subShapeID, 
                position, 
                normal
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldSpaceSurfaceNormal}.
     */
    public final void getWorldSpaceSurfaceNormal(
        int subShapeID, 
        Vec3 position, 
        Vec3 normal
    ) {
        getWorldSpaceSurfaceNormal(
            this.segment, 
            subShapeID, 
            position.memorySegment(), 
            normal.memorySegment()
        );
    }
    
    public static MemorySegment getMotionProperties(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_MOTION_PROPERTIES.get();
        try {
            return (MemorySegment) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotionProperties}.
     */
    public final @Nullable MotionProperties getMotionProperties(
    ) {
        MemorySegment segment = getMotionProperties(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new MotionProperties(segment);
    }
    
    public static MemorySegment getMotionPropertiesUnchecked(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_MOTION_PROPERTIES_UNCHECKED.get();
        try {
            return (MemorySegment) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotionPropertiesUnchecked}.
     */
    public final @Nullable MotionProperties getMotionPropertiesUnchecked(
    ) {
        MemorySegment segment = getMotionPropertiesUnchecked(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new MotionProperties(segment);
    }
    
    public static void setUserData(
        MemorySegment body, 
        long userData
    ) {
        MethodHandle method = JPH_BODY_SET_USER_DATA.get();
        try {
            method.invokeExact(
                body, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setUserData}.
     */
    public final void setUserData(
        long userData
    ) {
        setUserData(
            this.segment, 
            userData
        );
    }
    
    public static long getUserData(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_USER_DATA.get();
        try {
            return (long) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUserData}.
     */
    public final long getUserData(
    ) {
        return (long) getUserData(
            this.segment
        );
    }
    
    public static MemorySegment ngetFixedToWorldBody() {
        MethodHandle method = JPH_BODY_GET_FIXED_TO_WORLD_BODY.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #ngetFixedToWorldBody}.
     */
    public final @Nullable Body getFixedToWorldBody() {
        MemorySegment segment = ngetFixedToWorldBody();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public static int getSoftBodyVertexCount(
        MemorySegment body
    ) {
        MethodHandle method = JPH_BODY_GET_SOFT_BODY_VERTEX_COUNT.get();
        try {
            return (int) method.invokeExact(
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSoftBodyVertexCount}.
     */
    public final int getSoftBodyVertexCount(
    ) {
        return (int) getSoftBodyVertexCount(
            this.segment
        );
    }
    
    public static void getSoftBodyVertexPosition(
        MemorySegment body, 
        int index, 
        MemorySegment outPos
    ) {
        MethodHandle method = JPH_BODY_GET_SOFT_BODY_VERTEX_POSITION.get();
        try {
            method.invokeExact(
                body, 
                index, 
                outPos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSoftBodyVertexPosition}.
     */
    public final void getSoftBodyVertexPosition(
        int index, 
        Vec3 outPos
    ) {
        getSoftBodyVertexPosition(
            this.segment, 
            index, 
            outPos.memorySegment()
        );
    }
    
    public static void getSoftBodyVertexPositions(
        MemorySegment body, 
        MemorySegment outPositions, 
        int capacity, 
        MemorySegment outCount
    ) {
        MethodHandle method = JPH_BODY_GET_SOFT_BODY_VERTEX_POSITIONS.get();
        try {
            method.invokeExact(
                body, 
                outPositions, 
                capacity, 
                outCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSoftBodyVertexPositions}.
     */
    public final void getSoftBodyVertexPositions(
        NativeStructArray<Vec3> outPositions, 
        int capacity, 
        NativeIntArray outCount
    ) {
        getSoftBodyVertexPositions(
            this.segment, 
            outPositions.memorySegment(), 
            capacity, 
            outCount.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}