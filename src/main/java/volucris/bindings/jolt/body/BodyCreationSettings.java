/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.MassProperties;
import volucris.bindings.jolt.filter.CollisionGroup;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.shape.Shape;
import volucris.bindings.jolt.shape.ShapeSettings;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class BodyCreationSettings {

    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_CREATE2;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_CREATE3;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE;
    private static final LazyConstant<MethodHandle> JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BODY_CREATION_SETTINGS_CREATE = downcallHandle("JPH_BodyCreationSettings_Create", UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_CREATE2 = downcallHandle("JPH_BodyCreationSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_CREATE3 = downcallHandle("JPH_BodyCreationSettings_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_DESTROY = downcallHandleVoid("JPH_BodyCreationSettings_Destroy", UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_GET_POSITION = downcallHandleVoid("JPH_BodyCreationSettings_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_POSITION = downcallHandleVoid("JPH_BodyCreationSettings_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_GET_ROTATION = downcallHandleVoid("JPH_BodyCreationSettings_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_ROTATION = downcallHandleVoid("JPH_BodyCreationSettings_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_GetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_GET_USER_DATA = downcallHandle("JPH_BodyCreationSettings_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_BodyCreationSettings_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
        JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER = downcallHandle("JPH_BodyCreationSettings_GetObjectLayer", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER = downcallHandleVoid("JPH_BodyCreationSettings_SetObjectLayer", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyCreationSettings_GetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP = downcallHandleVoid("JPH_BodyCreationSettings_SetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE = downcallHandle("JPH_BodyCreationSettings_GetMotionType", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE = downcallHandleVoid("JPH_BodyCreationSettings_SetMotionType", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS = downcallHandle("JPH_BodyCreationSettings_GetAllowedDOFs", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowedDOFs", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC = downcallHandle("JPH_BodyCreationSettings_GetAllowDynamicOrKinematic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowDynamicOrKinematic", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR = downcallHandle("JPH_BodyCreationSettings_GetIsSensor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR = downcallHandleVoid("JPH_BodyCreationSettings_SetIsSensor", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandle("JPH_BodyCreationSettings_GetCollideKinematicVsNonDynamic", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC = downcallHandleVoid("JPH_BodyCreationSettings_SetCollideKinematicVsNonDynamic", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_BodyCreationSettings_GetUseManifoldReduction", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_BodyCreationSettings_SetUseManifoldReduction", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE = downcallHandle("JPH_BodyCreationSettings_GetApplyGyroscopicForce", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE = downcallHandleVoid("JPH_BodyCreationSettings_SetApplyGyroscopicForce", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY = downcallHandle("JPH_BodyCreationSettings_GetMotionQuality", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMotionQuality", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_BodyCreationSettings_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_BodyCreationSettings_SetEnhancedInternalEdgeRemoval", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING = downcallHandle("JPH_BodyCreationSettings_GetAllowSleeping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING = downcallHandleVoid("JPH_BodyCreationSettings_SetAllowSleeping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_BODY_CREATION_SETTINGS_GET_FRICTION = downcallHandle("JPH_BodyCreationSettings_GetFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_FRICTION = downcallHandleVoid("JPH_BodyCreationSettings_SetFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION = downcallHandle("JPH_BodyCreationSettings_GetRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION = downcallHandleVoid("JPH_BodyCreationSettings_SetRestitution", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING = downcallHandle("JPH_BodyCreationSettings_GetLinearDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING = downcallHandleVoid("JPH_BodyCreationSettings_SetLinearDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING = downcallHandle("JPH_BodyCreationSettings_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_BodyCreationSettings_SetAngularDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY = downcallHandle("JPH_BodyCreationSettings_GetMaxLinearVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMaxLinearVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY = downcallHandle("JPH_BodyCreationSettings_GetMaxAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY = downcallHandleVoid("JPH_BodyCreationSettings_SetMaxAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR = downcallHandle("JPH_BodyCreationSettings_GetGravityFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_BodyCreationSettings_SetGravityFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandle("JPH_BodyCreationSettings_GetNumVelocityStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetNumVelocityStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE = downcallHandle("JPH_BodyCreationSettings_GetNumPositionStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetNumPositionStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES = downcallHandle("JPH_BodyCreationSettings_GetOverrideMassProperties", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES = downcallHandleVoid("JPH_BodyCreationSettings_SetOverrideMassProperties", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER = downcallHandle("JPH_BodyCreationSettings_GetInertiaMultiplier", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER = downcallHandleVoid("JPH_BodyCreationSettings_SetInertiaMultiplier", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_GetMassPropertiesOverride", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE = downcallHandleVoid("JPH_BodyCreationSettings_SetMassPropertiesOverride", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public BodyCreationSettings() {
        this(Arena.ofAuto());
    }
    
    public BodyCreationSettings(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public BodyCreationSettings(
        ShapeSettings settings, 
        Vec3 position, 
        Quat rotation, 
        int motionType, 
        int objectLayer
    ) {
        this(
            Arena.ofAuto(),
            settings, 
            position, 
            rotation, 
            motionType, 
            objectLayer
        );
    }
    
    public BodyCreationSettings(
        Arena arena,
        ShapeSettings settings, 
        Vec3 position, 
        Quat rotation, 
        int motionType, 
        int objectLayer
    ) {
         MemorySegment segment = create2(
            settings.memorySegment(), 
            position.memorySegment(), 
            rotation.memorySegment(), 
            motionType, 
            objectLayer
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public BodyCreationSettings(
        Shape shape, 
        Vec3 position, 
        Quat rotation, 
        int motionType, 
        int objectLayer
    ) {
        this(
            Arena.ofAuto(),
            shape, 
            position, 
            rotation, 
            motionType, 
            objectLayer
        );
    }
    
    public BodyCreationSettings(
        Arena arena,
        Shape shape, 
        Vec3 position, 
        Quat rotation, 
        int motionType, 
        int objectLayer
    ) {
         MemorySegment segment = create3(
            shape.memorySegment(), 
            position.memorySegment(), 
            rotation.memorySegment(), 
            motionType, 
            objectLayer
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public BodyCreationSettings(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment create2(
        MemorySegment settings, 
        MemorySegment position, 
        MemorySegment rotation, 
        int motionType, 
        int objectLayer
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE2.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings, 
                position, 
                rotation, 
                motionType, 
                objectLayer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment create3(
        MemorySegment shape, 
        MemorySegment position, 
        MemorySegment rotation, 
        int motionType, 
        int objectLayer
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_CREATE3.get();
        try {
            return (MemorySegment) method.invokeExact(
                shape, 
                position, 
                rotation, 
                motionType, 
                objectLayer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_DESTROY.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void getPosition(
        MemorySegment settings, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_POSITION.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static void setPosition(
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_POSITION.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPosition}.
     */
    public final void setPosition(
        Vec3 value
    ) {
        setPosition(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static void getRotation(
        MemorySegment settings, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ROTATION.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static void setRotation(
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ROTATION.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRotation}.
     */
    public final void setRotation(
        Quat value
    ) {
        setRotation(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static void getLinearVelocity(
        MemorySegment settings, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                settings, 
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
        MemorySegment settings, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static void getAngularVelocity(
        MemorySegment settings, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                settings, 
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
        MemorySegment settings, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static long getUserData(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_USER_DATA.get();
        try {
            return (long) method.invokeExact(
                settings
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
    
    public static void setUserData(
        MemorySegment settings, 
        long value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_USER_DATA.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setUserData}.
     */
    public final void setUserData(
        long value
    ) {
        setUserData(
            this.segment, 
            value
        );
    }
    
    public static int getObjectLayer(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER.get();
        try {
            return (int) method.invokeExact(
                settings
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
    
    public static void setObjectLayer(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setObjectLayer}.
     */
    public final void setObjectLayer(
        int value
    ) {
        setObjectLayer(
            this.segment, 
            value
        );
    }
    
    public static void getCollisionGroup(
        MemorySegment settings, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP.get();
        try {
            method.invokeExact(
                settings, 
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
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static int getMotionType(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MOTION_TYPE.get();
        try {
            return (int) method.invokeExact(
                settings
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
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MOTION_TYPE.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMotionType}.
     */
    public final void setMotionType(
        int value
    ) {
        setMotionType(
            this.segment, 
            value
        );
    }
    
    public static int getAllowedDOFs(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOWED_DOFS.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAllowedDOFs}.
     */
    public final int getAllowedDOFs(
    ) {
        return (int) getAllowedDOFs(
            this.segment
        );
    }
    
    public static void setAllowedDOFs(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOWED_DOFS.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAllowedDOFs}.
     */
    public final void setAllowedDOFs(
        int value
    ) {
        setAllowedDOFs(
            this.segment, 
            value
        );
    }
    
    public static boolean getAllowDynamicOrKinematic(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOW_DYNAMIC_OR_KINEMATIC.get();
        try {
            return (boolean) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAllowDynamicOrKinematic}.
     */
    public final boolean getAllowDynamicOrKinematic(
    ) {
        return (boolean) getAllowDynamicOrKinematic(
            this.segment
        );
    }
    
    public static void setAllowDynamicOrKinematic(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOW_DYNAMIC_OR_KINEMATIC.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAllowDynamicOrKinematic}.
     */
    public final void setAllowDynamicOrKinematic(
        boolean value
    ) {
        setAllowDynamicOrKinematic(
            this.segment, 
            value
        );
    }
    
    public static boolean getIsSensor(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_IS_SENSOR.get();
        try {
            return (boolean) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getIsSensor}.
     */
    public final boolean getIsSensor(
    ) {
        return (boolean) getIsSensor(
            this.segment
        );
    }
    
    public static void setIsSensor(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_IS_SENSOR.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static boolean getCollideKinematicVsNonDynamic(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC.get();
        try {
            return (boolean) method.invokeExact(
                settings
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
    
    public static void setCollideKinematicVsNonDynamic(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_COLLIDE_KINEMATIC_VS_NON_DYNAMIC.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static boolean getUseManifoldReduction(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_USE_MANIFOLD_REDUCTION.get();
        try {
            return (boolean) method.invokeExact(
                settings
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
    
    public static void setUseManifoldReduction(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_USE_MANIFOLD_REDUCTION.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static boolean getApplyGyroscopicForce(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_APPLY_GYROSCOPIC_FORCE.get();
        try {
            return (boolean) method.invokeExact(
                settings
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
    
    public static void setApplyGyroscopicForce(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_APPLY_GYROSCOPIC_FORCE.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static int getMotionQuality(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MOTION_QUALITY.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMotionQuality}.
     */
    public final int getMotionQuality(
    ) {
        return (int) getMotionQuality(
            this.segment
        );
    }
    
    public static void setMotionQuality(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MOTION_QUALITY.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMotionQuality}.
     */
    public final void setMotionQuality(
        int value
    ) {
        setMotionQuality(
            this.segment, 
            value
        );
    }
    
    public static boolean getEnhancedInternalEdgeRemoval(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
        try {
            return (boolean) method.invokeExact(
                settings
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
    
    public static void setEnhancedInternalEdgeRemoval(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static boolean getAllowSleeping(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING.get();
        try {
            return (boolean) method.invokeExact(
                settings
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
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAllowSleeping}.
     */
    public final void setAllowSleeping(
        boolean value
    ) {
        setAllowSleeping(
            this.segment, 
            value
        );
    }
    
    public static float getFriction(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_FRICTION.get();
        try {
            return (float) method.invokeExact(
                settings
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
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_FRICTION.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setFriction}.
     */
    public final void setFriction(
        float value
    ) {
        setFriction(
            this.segment, 
            value
        );
    }
    
    public static float getRestitution(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_RESTITUTION.get();
        try {
            return (float) method.invokeExact(
                settings
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
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_RESTITUTION.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRestitution}.
     */
    public final void setRestitution(
        float value
    ) {
        setRestitution(
            this.segment, 
            value
        );
    }
    
    public static float getLinearDamping(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLinearDamping}.
     */
    public final float getLinearDamping(
    ) {
        return (float) getLinearDamping(
            this.segment
        );
    }
    
    public static void setLinearDamping(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLinearDamping}.
     */
    public final void setLinearDamping(
        float value
    ) {
        setLinearDamping(
            this.segment, 
            value
        );
    }
    
    public static float getAngularDamping(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_ANGULAR_DAMPING.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAngularDamping}.
     */
    public final float getAngularDamping(
    ) {
        return (float) getAngularDamping(
            this.segment
        );
    }
    
    public static void setAngularDamping(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_ANGULAR_DAMPING.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAngularDamping}.
     */
    public final void setAngularDamping(
        float value
    ) {
        setAngularDamping(
            this.segment, 
            value
        );
    }
    
    public static float getMaxLinearVelocity(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxLinearVelocity}.
     */
    public final float getMaxLinearVelocity(
    ) {
        return (float) getMaxLinearVelocity(
            this.segment
        );
    }
    
    public static void setMaxLinearVelocity(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxLinearVelocity}.
     */
    public final void setMaxLinearVelocity(
        float value
    ) {
        setMaxLinearVelocity(
            this.segment, 
            value
        );
    }
    
    public static float getMaxAngularVelocity(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MAX_ANGULAR_VELOCITY.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxAngularVelocity}.
     */
    public final float getMaxAngularVelocity(
    ) {
        return (float) getMaxAngularVelocity(
            this.segment
        );
    }
    
    public static void setMaxAngularVelocity(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MAX_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxAngularVelocity}.
     */
    public final void setMaxAngularVelocity(
        float value
    ) {
        setMaxAngularVelocity(
            this.segment, 
            value
        );
    }
    
    public static float getGravityFactor(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGravityFactor}.
     */
    public final float getGravityFactor(
    ) {
        return (float) getGravityFactor(
            this.segment
        );
    }
    
    public static void setGravityFactor(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR.get();
        try {
            method.invokeExact(
                settings, 
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
        float value
    ) {
        setGravityFactor(
            this.segment, 
            value
        );
    }
    
    public static int getNumVelocityStepsOverride(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_NUM_VELOCITY_STEPS_OVERRIDE.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumVelocityStepsOverride}.
     */
    public final int getNumVelocityStepsOverride(
    ) {
        return (int) getNumVelocityStepsOverride(
            this.segment
        );
    }
    
    public static void setNumVelocityStepsOverride(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_NUM_VELOCITY_STEPS_OVERRIDE.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setNumVelocityStepsOverride}.
     */
    public final void setNumVelocityStepsOverride(
        int value
    ) {
        setNumVelocityStepsOverride(
            this.segment, 
            value
        );
    }
    
    public static int getNumPositionStepsOverride(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_NUM_POSITION_STEPS_OVERRIDE.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumPositionStepsOverride}.
     */
    public final int getNumPositionStepsOverride(
    ) {
        return (int) getNumPositionStepsOverride(
            this.segment
        );
    }
    
    public static void setNumPositionStepsOverride(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_NUM_POSITION_STEPS_OVERRIDE.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setNumPositionStepsOverride}.
     */
    public final void setNumPositionStepsOverride(
        int value
    ) {
        setNumPositionStepsOverride(
            this.segment, 
            value
        );
    }
    
    public static int getOverrideMassProperties(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_OVERRIDE_MASS_PROPERTIES.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getOverrideMassProperties}.
     */
    public final int getOverrideMassProperties(
    ) {
        return (int) getOverrideMassProperties(
            this.segment
        );
    }
    
    public static void setOverrideMassProperties(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_OVERRIDE_MASS_PROPERTIES.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setOverrideMassProperties}.
     */
    public final void setOverrideMassProperties(
        int value
    ) {
        setOverrideMassProperties(
            this.segment, 
            value
        );
    }
    
    public static float getInertiaMultiplier(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_INERTIA_MULTIPLIER.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInertiaMultiplier}.
     */
    public final float getInertiaMultiplier(
    ) {
        return (float) getInertiaMultiplier(
            this.segment
        );
    }
    
    public static void setInertiaMultiplier(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_INERTIA_MULTIPLIER.get();
        try {
            method.invokeExact(
                settings, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setInertiaMultiplier}.
     */
    public final void setInertiaMultiplier(
        float value
    ) {
        setInertiaMultiplier(
            this.segment, 
            value
        );
    }
    
    public static void getMassPropertiesOverride(
        MemorySegment settings, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_GET_MASS_PROPERTIES_OVERRIDE.get();
        try {
            method.invokeExact(
                settings, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMassPropertiesOverride}.
     */
    public final void getMassPropertiesOverride(
        MassProperties result
    ) {
        getMassPropertiesOverride(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setMassPropertiesOverride(
        MemorySegment settings, 
        MemorySegment massProperties
    ) {
        MethodHandle method = JPH_BODY_CREATION_SETTINGS_SET_MASS_PROPERTIES_OVERRIDE.get();
        try {
            method.invokeExact(
                settings, 
                massProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMassPropertiesOverride}.
     */
    public final void setMassPropertiesOverride(
        MassProperties massProperties
    ) {
        setMassPropertiesOverride(
            this.segment, 
            massProperties.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}