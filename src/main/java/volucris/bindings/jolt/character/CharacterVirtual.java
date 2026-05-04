/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.filter.BodyFilter;
import volucris.bindings.jolt.filter.ShapeFilter;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physicsSystem.PhysicsSystem;
import volucris.bindings.jolt.shape.Shape;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class CharacterVirtual extends CharacterBase {

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_ID;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_LISTENER;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_MASS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_MASS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_UPDATE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_WALK_STAIRS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_NUM_ACTIVE_CONTACTS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACT;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_BODY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_CHARACTER;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CHARACTER_VIRTUAL_CREATE = downcallHandle("JPH_CharacterVirtual_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_ID = downcallHandle("JPH_CharacterVirtual_GetID", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_LISTENER = downcallHandleVoid("JPH_CharacterVirtual_SetListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION = downcallHandleVoid("JPH_CharacterVirtual_SetCharacterVsCharacterCollision", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_POSITION = downcallHandleVoid("JPH_CharacterVirtual_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_POSITION = downcallHandleVoid("JPH_CharacterVirtual_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_ROTATION = downcallHandleVoid("JPH_CharacterVirtual_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_ROTATION = downcallHandleVoid("JPH_CharacterVirtual_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_CharacterVirtual_GetWorldTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_CharacterVirtual_GetCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_MASS = downcallHandle("JPH_CharacterVirtual_GetMass", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_MASS = downcallHandleVoid("JPH_CharacterVirtual_SetMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH = downcallHandle("JPH_CharacterVirtual_GetMaxStrength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH = downcallHandleVoid("JPH_CharacterVirtual_SetMaxStrength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED = downcallHandle("JPH_CharacterVirtual_GetPenetrationRecoverySpeed", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED = downcallHandleVoid("JPH_CharacterVirtual_SetPenetrationRecoverySpeed", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandle("JPH_CharacterVirtual_GetEnhancedInternalEdgeRemoval", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_CharacterVirtual_SetEnhancedInternalEdgeRemoval", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING = downcallHandle("JPH_CharacterVirtual_GetCharacterPadding", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS = downcallHandle("JPH_CharacterVirtual_GetMaxNumHits", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS = downcallHandleVoid("JPH_CharacterVirtual_SetMaxNumHits", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE = downcallHandle("JPH_CharacterVirtual_GetHitReductionCosMaxAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE = downcallHandleVoid("JPH_CharacterVirtual_SetHitReductionCosMaxAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED = downcallHandle("JPH_CharacterVirtual_GetMaxHitsExceeded", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET = downcallHandleVoid("JPH_CharacterVirtual_GetShapeOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET = downcallHandleVoid("JPH_CharacterVirtual_SetShapeOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_USER_DATA = downcallHandle("JPH_CharacterVirtual_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_USER_DATA = downcallHandleVoid("JPH_CharacterVirtual_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
        JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID = downcallHandle("JPH_CharacterVirtual_GetInnerBodyID", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES = downcallHandleVoid("JPH_CharacterVirtual_CancelVelocityTowardsSteepSlopes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES = downcallHandleVoid("JPH_CharacterVirtual_StartTrackingContactChanges", UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES = downcallHandleVoid("JPH_CharacterVirtual_FinishTrackingContactChanges", UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_UPDATE = downcallHandleVoid("JPH_CharacterVirtual_Update", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE = downcallHandleVoid("JPH_CharacterVirtual_ExtendedUpdate", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS = downcallHandleVoid("JPH_CharacterVirtual_RefreshContacts", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS = downcallHandle("JPH_CharacterVirtual_CanWalkStairs", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_WALK_STAIRS = downcallHandle("JPH_CharacterVirtual_WalkStairs", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR = downcallHandle("JPH_CharacterVirtual_StickToFloor", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY = downcallHandleVoid("JPH_CharacterVirtual_UpdateGroundVelocity", UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_SHAPE = downcallHandle("JPH_CharacterVirtual_SetShape", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE = downcallHandleVoid("JPH_CharacterVirtual_SetInnerBodyShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_NUM_ACTIVE_CONTACTS = downcallHandle("JPH_CharacterVirtual_GetNumActiveContacts", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACT = downcallHandleVoid("JPH_CharacterVirtual_GetActiveContact", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_BODY = downcallHandle("JPH_CharacterVirtual_HasCollidedWithBody", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH = downcallHandle("JPH_CharacterVirtual_HasCollidedWith", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_CHARACTER = downcallHandle("JPH_CharacterVirtual_HasCollidedWithCharacter", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public CharacterVirtual(
        CharacterVirtualSettings settings, 
        Vec3 position, 
        Quat rotation, 
        long userData, 
        PhysicsSystem system
    ) {
        this(
            Arena.ofAuto(),
            settings, 
            position, 
            rotation, 
            userData, 
            system
        );
    }
    
    public CharacterVirtual(
        Arena arena,
        CharacterVirtualSettings settings, 
        Vec3 position, 
        Quat rotation, 
        long userData, 
        PhysicsSystem system
    ) {
         MemorySegment segment = create(
            settings.memorySegment(), 
            position.memorySegment(), 
            rotation.memorySegment(), 
            userData, 
            system.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public CharacterVirtual(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings, 
        MemorySegment position, 
        MemorySegment rotation, 
        long userData, 
        MemorySegment system
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings, 
                position, 
                rotation, 
                userData, 
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getID(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ID.get();
        try {
            return (int) method.invokeExact(
                character
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
    
    public static void setListener(
        MemorySegment character, 
        MemorySegment listener
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_LISTENER.get();
        try {
            method.invokeExact(
                character, 
                listener
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setListener}.
     */
    public final void setListener(
        CharacterContactListener listener
    ) {
        setListener(
            this.segment, 
            listener.memorySegment()
        );
    }
    
    public static void setCharacterVsCharacterCollision(
        MemorySegment character, 
        MemorySegment characterVsCharacterCollision
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_CHARACTER_VS_CHARACTER_COLLISION.get();
        try {
            method.invokeExact(
                character, 
                characterVsCharacterCollision
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setCharacterVsCharacterCollision}.
     */
    public final void setCharacterVsCharacterCollision(
        CharacterVsCharacterCollision characterVsCharacterCollision
    ) {
        setCharacterVsCharacterCollision(
            this.segment, 
            characterVsCharacterCollision.memorySegment()
        );
    }
    
    public static void getLinearVelocity(
        MemorySegment character, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                character, 
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
        MemorySegment character, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                character, 
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
    
    public static void getPosition(
        MemorySegment character, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_POSITION.get();
        try {
            method.invokeExact(
                character, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPosition}.
     */
    public final void getPosition(
        Vec3 position
    ) {
        getPosition(
            this.segment, 
            position.memorySegment()
        );
    }
    
    public static void setPosition(
        MemorySegment character, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_POSITION.get();
        try {
            method.invokeExact(
                character, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPosition}.
     */
    public final void setPosition(
        Vec3 position
    ) {
        setPosition(
            this.segment, 
            position.memorySegment()
        );
    }
    
    public static void getRotation(
        MemorySegment character, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ROTATION.get();
        try {
            method.invokeExact(
                character, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotation}.
     */
    public final void getRotation(
        Quat rotation
    ) {
        getRotation(
            this.segment, 
            rotation.memorySegment()
        );
    }
    
    public static void setRotation(
        MemorySegment character, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_ROTATION.get();
        try {
            method.invokeExact(
                character, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRotation}.
     */
    public final void setRotation(
        Quat rotation
    ) {
        setRotation(
            this.segment, 
            rotation.memorySegment()
        );
    }
    
    public static void getWorldTransform(
        MemorySegment character, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_WORLD_TRANSFORM.get();
        try {
            method.invokeExact(
                character, 
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
    
    public static void getCenterOfMassTransform(
        MemorySegment character, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_CENTER_OF_MASS_TRANSFORM.get();
        try {
            method.invokeExact(
                character, 
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
    
    public static float getMass(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MASS.get();
        try {
            return (float) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMass}.
     */
    public final float getMass(
    ) {
        return (float) getMass(
            this.segment
        );
    }
    
    public static void setMass(
        MemorySegment character, 
        float value
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MASS.get();
        try {
            method.invokeExact(
                character, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMass}.
     */
    public final void setMass(
        float value
    ) {
        setMass(
            this.segment, 
            value
        );
    }
    
    public static float getMaxStrength(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_STRENGTH.get();
        try {
            return (float) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxStrength}.
     */
    public final float getMaxStrength(
    ) {
        return (float) getMaxStrength(
            this.segment
        );
    }
    
    public static void setMaxStrength(
        MemorySegment character, 
        float value
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MAX_STRENGTH.get();
        try {
            method.invokeExact(
                character, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxStrength}.
     */
    public final void setMaxStrength(
        float value
    ) {
        setMaxStrength(
            this.segment, 
            value
        );
    }
    
    public static float getPenetrationRecoverySpeed(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_PENETRATION_RECOVERY_SPEED.get();
        try {
            return (float) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPenetrationRecoverySpeed}.
     */
    public final float getPenetrationRecoverySpeed(
    ) {
        return (float) getPenetrationRecoverySpeed(
            this.segment
        );
    }
    
    public static void setPenetrationRecoverySpeed(
        MemorySegment character, 
        float value
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_PENETRATION_RECOVERY_SPEED.get();
        try {
            method.invokeExact(
                character, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPenetrationRecoverySpeed}.
     */
    public final void setPenetrationRecoverySpeed(
        float value
    ) {
        setPenetrationRecoverySpeed(
            this.segment, 
            value
        );
    }
    
    public static boolean getEnhancedInternalEdgeRemoval(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
        try {
            return (boolean) method.invokeExact(
                character
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
        MemorySegment character, 
        boolean value
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_ENHANCED_INTERNAL_EDGE_REMOVAL.get();
        try {
            method.invokeExact(
                character, 
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
    
    public static float getCharacterPadding(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_CHARACTER_PADDING.get();
        try {
            return (float) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCharacterPadding}.
     */
    public final float getCharacterPadding(
    ) {
        return (float) getCharacterPadding(
            this.segment
        );
    }
    
    public static int getMaxNumHits(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_NUM_HITS.get();
        try {
            return (int) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxNumHits}.
     */
    public final int getMaxNumHits(
    ) {
        return (int) getMaxNumHits(
            this.segment
        );
    }
    
    public static void setMaxNumHits(
        MemorySegment character, 
        int value
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_MAX_NUM_HITS.get();
        try {
            method.invokeExact(
                character, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMaxNumHits}.
     */
    public final void setMaxNumHits(
        int value
    ) {
        setMaxNumHits(
            this.segment, 
            value
        );
    }
    
    public static float getHitReductionCosMaxAngle(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_HIT_REDUCTION_COS_MAX_ANGLE.get();
        try {
            return (float) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getHitReductionCosMaxAngle}.
     */
    public final float getHitReductionCosMaxAngle(
    ) {
        return (float) getHitReductionCosMaxAngle(
            this.segment
        );
    }
    
    public static void setHitReductionCosMaxAngle(
        MemorySegment character, 
        float value
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_HIT_REDUCTION_COS_MAX_ANGLE.get();
        try {
            method.invokeExact(
                character, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setHitReductionCosMaxAngle}.
     */
    public final void setHitReductionCosMaxAngle(
        float value
    ) {
        setHitReductionCosMaxAngle(
            this.segment, 
            value
        );
    }
    
    public static boolean getMaxHitsExceeded(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_MAX_HITS_EXCEEDED.get();
        try {
            return (boolean) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxHitsExceeded}.
     */
    public final boolean getMaxHitsExceeded(
    ) {
        return (boolean) getMaxHitsExceeded(
            this.segment
        );
    }
    
    public static void getShapeOffset(
        MemorySegment character, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_SHAPE_OFFSET.get();
        try {
            method.invokeExact(
                character, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getShapeOffset}.
     */
    public final void getShapeOffset(
        Vec3 result
    ) {
        getShapeOffset(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setShapeOffset(
        MemorySegment character, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_SHAPE_OFFSET.get();
        try {
            method.invokeExact(
                character, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setShapeOffset}.
     */
    public final void setShapeOffset(
        Vec3 value
    ) {
        setShapeOffset(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static long getUserData(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_USER_DATA.get();
        try {
            return (long) method.invokeExact(
                character
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
        MemorySegment character, 
        long value
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_USER_DATA.get();
        try {
            method.invokeExact(
                character, 
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
    
    public static int getInnerBodyID(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_INNER_BODY_ID.get();
        try {
            return (int) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInnerBodyID}.
     */
    public final int getInnerBodyID(
    ) {
        return (int) getInnerBodyID(
            this.segment
        );
    }
    
    public static void cancelVelocityTowardsSteepSlopes(
        MemorySegment character, 
        MemorySegment desiredVelocity, 
        MemorySegment velocity
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_CANCEL_VELOCITY_TOWARDS_STEEP_SLOPES.get();
        try {
            method.invokeExact(
                character, 
                desiredVelocity, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #cancelVelocityTowardsSteepSlopes}.
     */
    public final void cancelVelocityTowardsSteepSlopes(
        Vec3 desiredVelocity, 
        Vec3 velocity
    ) {
        cancelVelocityTowardsSteepSlopes(
            this.segment, 
            desiredVelocity.memorySegment(), 
            velocity.memorySegment()
        );
    }
    
    public static void startTrackingContactChanges(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_START_TRACKING_CONTACT_CHANGES.get();
        try {
            method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #startTrackingContactChanges}.
     */
    public final void startTrackingContactChanges(
    ) {
        startTrackingContactChanges(
            this.segment
        );
    }
    
    public static void finishTrackingContactChanges(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_FINISH_TRACKING_CONTACT_CHANGES.get();
        try {
            method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #finishTrackingContactChanges}.
     */
    public final void finishTrackingContactChanges(
    ) {
        finishTrackingContactChanges(
            this.segment
        );
    }
    
    public static void update(
        MemorySegment character, 
        float deltaTime, 
        int layer, 
        MemorySegment system, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_UPDATE.get();
        try {
            method.invokeExact(
                character, 
                deltaTime, 
                layer, 
                system, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #update}.
     */
    public final void update(
        float deltaTime, 
        int layer, 
        PhysicsSystem system, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        update(
            this.segment, 
            deltaTime, 
            layer, 
            system.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static void extendedUpdate(
        MemorySegment character, 
        float deltaTime, 
        MemorySegment settings, 
        int layer, 
        MemorySegment system, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_EXTENDED_UPDATE.get();
        try {
            method.invokeExact(
                character, 
                deltaTime, 
                settings, 
                layer, 
                system, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #extendedUpdate}.
     */
    public final void extendedUpdate(
        float deltaTime, 
        ExtendedUpdateSettings settings, 
        int layer, 
        PhysicsSystem system, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        extendedUpdate(
            this.segment, 
            deltaTime, 
            settings.memorySegment(), 
            layer, 
            system.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static void refreshContacts(
        MemorySegment character, 
        int layer, 
        MemorySegment system, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_REFRESH_CONTACTS.get();
        try {
            method.invokeExact(
                character, 
                layer, 
                system, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #refreshContacts}.
     */
    public final void refreshContacts(
        int layer, 
        PhysicsSystem system, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        refreshContacts(
            this.segment, 
            layer, 
            system.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean canWalkStairs(
        MemorySegment character, 
        MemorySegment linearVelocity
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_CAN_WALK_STAIRS.get();
        try {
            return (boolean) method.invokeExact(
                character, 
                linearVelocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #canWalkStairs}.
     */
    public final boolean canWalkStairs(
        Vec3 linearVelocity
    ) {
        return (boolean) canWalkStairs(
            this.segment, 
            linearVelocity.memorySegment()
        );
    }
    
    public static boolean walkStairs(
        MemorySegment character, 
        float deltaTime, 
        MemorySegment stepUp, 
        MemorySegment stepForward, 
        MemorySegment stepForwardTest, 
        MemorySegment stepDownExtra, 
        int layer, 
        MemorySegment system, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_WALK_STAIRS.get();
        try {
            return (boolean) method.invokeExact(
                character, 
                deltaTime, 
                stepUp, 
                stepForward, 
                stepForwardTest, 
                stepDownExtra, 
                layer, 
                system, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #walkStairs}.
     */
    public final boolean walkStairs(
        float deltaTime, 
        Vec3 stepUp, 
        Vec3 stepForward, 
        Vec3 stepForwardTest, 
        Vec3 stepDownExtra, 
        int layer, 
        PhysicsSystem system, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) walkStairs(
            this.segment, 
            deltaTime, 
            stepUp.memorySegment(), 
            stepForward.memorySegment(), 
            stepForwardTest.memorySegment(), 
            stepDownExtra.memorySegment(), 
            layer, 
            system.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static boolean stickToFloor(
        MemorySegment character, 
        MemorySegment stepDown, 
        int layer, 
        MemorySegment system, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_STICK_TO_FLOOR.get();
        try {
            return (boolean) method.invokeExact(
                character, 
                stepDown, 
                layer, 
                system, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #stickToFloor}.
     */
    public final boolean stickToFloor(
        Vec3 stepDown, 
        int layer, 
        PhysicsSystem system, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) stickToFloor(
            this.segment, 
            stepDown.memorySegment(), 
            layer, 
            system.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static void updateGroundVelocity(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_UPDATE_GROUND_VELOCITY.get();
        try {
            method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #updateGroundVelocity}.
     */
    public final void updateGroundVelocity(
    ) {
        updateGroundVelocity(
            this.segment
        );
    }
    
    public static boolean setShape(
        MemorySegment character, 
        MemorySegment shape, 
        float maxPenetrationDepth, 
        int layer, 
        MemorySegment system, 
        MemorySegment bodyFilter, 
        MemorySegment shapeFilter
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_SHAPE.get();
        try {
            return (boolean) method.invokeExact(
                character, 
                shape, 
                maxPenetrationDepth, 
                layer, 
                system, 
                bodyFilter, 
                shapeFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setShape}.
     */
    public final boolean setShape(
        Shape shape, 
        float maxPenetrationDepth, 
        int layer, 
        PhysicsSystem system, 
        BodyFilter bodyFilter, 
        ShapeFilter shapeFilter
    ) {
        return (boolean) setShape(
            this.segment, 
            shape.memorySegment(), 
            maxPenetrationDepth, 
            layer, 
            system.memorySegment(), 
            bodyFilter.memorySegment(), 
            shapeFilter.memorySegment()
        );
    }
    
    public static void setInnerBodyShape(
        MemorySegment character, 
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_SET_INNER_BODY_SHAPE.get();
        try {
            method.invokeExact(
                character, 
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setInnerBodyShape}.
     */
    public final void setInnerBodyShape(
        Shape shape
    ) {
        setInnerBodyShape(
            this.segment, 
            shape.memorySegment()
        );
    }
    
    public static int getNumActiveContacts(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_NUM_ACTIVE_CONTACTS.get();
        try {
            return (int) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumActiveContacts}.
     */
    public final int getNumActiveContacts(
    ) {
        return (int) getNumActiveContacts(
            this.segment
        );
    }
    
    public static void getActiveContact(
        MemorySegment character, 
        int index, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_GET_ACTIVE_CONTACT.get();
        try {
            method.invokeExact(
                character, 
                index, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getActiveContact}.
     */
    public final void getActiveContact(
        int index, 
        CharacterVirtualContact result
    ) {
        getActiveContact(
            this.segment, 
            index, 
            result.memorySegment()
        );
    }
    
    public static boolean hasCollidedWithBody(
        MemorySegment character, 
        int body
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_BODY.get();
        try {
            return (boolean) method.invokeExact(
                character, 
                body
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #hasCollidedWithBody}.
     */
    public final boolean hasCollidedWithBody(
        int body
    ) {
        return (boolean) hasCollidedWithBody(
            this.segment, 
            body
        );
    }
    
    public static boolean hasCollidedWith(
        MemorySegment character, 
        int other
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH.get();
        try {
            return (boolean) method.invokeExact(
                character, 
                other
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #hasCollidedWith}.
     */
    public final boolean hasCollidedWith(
        int other
    ) {
        return (boolean) hasCollidedWith(
            this.segment, 
            other
        );
    }
    
    public static boolean hasCollidedWithCharacter(
        MemorySegment character, 
        MemorySegment other
    ) {
        MethodHandle method = JPH_CHARACTER_VIRTUAL_HAS_COLLIDED_WITH_CHARACTER.get();
        try {
            return (boolean) method.invokeExact(
                character, 
                other
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #hasCollidedWithCharacter}.
     */
    public final boolean hasCollidedWithCharacter(
        CharacterVirtual other
    ) {
        return (boolean) hasCollidedWithCharacter(
            this.segment, 
            other.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}