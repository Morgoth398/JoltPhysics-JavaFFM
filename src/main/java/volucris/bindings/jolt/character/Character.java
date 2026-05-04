/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
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
public final class Character extends CharacterBase {

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_ACTIVATE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_POST_SIMULATION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_ADD_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_ADD_IMPULSE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_BODY_ID;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_POSITION_AND_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_POSITION_AND_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_WORLD_TRANSFORM;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_GET_LAYER;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_LAYER;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_SET_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CHARACTER_CREATE = downcallHandle("JPH_Character_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Character_AddToPhysicsSystem", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
        JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Character_RemoveFromPhysicsSystem", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_ACTIVATE = downcallHandleVoid("JPH_Character_Activate", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_POST_SIMULATION = downcallHandleVoid("JPH_Character_PostSimulation", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
        JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Character_SetLinearAndAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_ADD_LINEAR_VELOCITY = downcallHandleVoid("JPH_Character_AddLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_ADD_IMPULSE = downcallHandleVoid("JPH_Character_AddImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_GET_BODY_ID = downcallHandle("JPH_Character_GetBodyID", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_GET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_Character_GetPositionAndRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_SET_POSITION_AND_ROTATION = downcallHandleVoid("JPH_Character_SetPositionAndRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
        JPH_CHARACTER_GET_POSITION = downcallHandleVoid("JPH_Character_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_SET_POSITION = downcallHandleVoid("JPH_Character_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
        JPH_CHARACTER_GET_ROTATION = downcallHandleVoid("JPH_Character_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_SET_ROTATION = downcallHandleVoid("JPH_Character_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
        JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION = downcallHandleVoid("JPH_Character_GetCenterOfMassPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_Character_GetWorldTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_CHARACTER_GET_LAYER = downcallHandle("JPH_Character_GetLayer", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_SET_LAYER = downcallHandleVoid("JPH_Character_SetLayer", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
        JPH_CHARACTER_SET_SHAPE = downcallHandleVoid("JPH_Character_SetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
        //@formatter:on
    }

    public Character(
        CharacterSettings settings, 
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
    
    public Character(
        Arena arena,
        CharacterSettings settings, 
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
    
    public Character(MemorySegment segment) {
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
        MethodHandle method = JPH_CHARACTER_CREATE.get();
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
    
    public static void addToPhysicsSystem(
        MemorySegment character, 
        int activationMode, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_ADD_TO_PHYSICS_SYSTEM.get();
        try {
            method.invokeExact(
                character, 
                activationMode, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addToPhysicsSystem}.
     */
    public final void addToPhysicsSystem(
        int activationMode, 
        boolean lockBodies
    ) {
        addToPhysicsSystem(
            this.segment, 
            activationMode, 
            lockBodies
        );
    }
    
    public static void removeFromPhysicsSystem(
        MemorySegment character, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_REMOVE_FROM_PHYSICS_SYSTEM.get();
        try {
            method.invokeExact(
                character, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeFromPhysicsSystem}.
     */
    public final void removeFromPhysicsSystem(
        boolean lockBodies
    ) {
        removeFromPhysicsSystem(
            this.segment, 
            lockBodies
        );
    }
    
    public static void activate(
        MemorySegment character, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_ACTIVATE.get();
        try {
            method.invokeExact(
                character, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #activate}.
     */
    public final void activate(
        boolean lockBodies
    ) {
        activate(
            this.segment, 
            lockBodies
        );
    }
    
    public static void postSimulation(
        MemorySegment character, 
        float maxSeparationDistance, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_POST_SIMULATION.get();
        try {
            method.invokeExact(
                character, 
                maxSeparationDistance, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #postSimulation}.
     */
    public final void postSimulation(
        float maxSeparationDistance, 
        boolean lockBodies
    ) {
        postSimulation(
            this.segment, 
            maxSeparationDistance, 
            lockBodies
        );
    }
    
    public static void setLinearAndAngularVelocity(
        MemorySegment character, 
        MemorySegment linearVelocity, 
        MemorySegment angularVelocity, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_SET_LINEAR_AND_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                character, 
                linearVelocity, 
                angularVelocity, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLinearAndAngularVelocity}.
     */
    public final void setLinearAndAngularVelocity(
        Vec3 linearVelocity, 
        Vec3 angularVelocity, 
        boolean lockBodies
    ) {
        setLinearAndAngularVelocity(
            this.segment, 
            linearVelocity.memorySegment(), 
            angularVelocity.memorySegment(), 
            lockBodies
        );
    }
    
    public static void getLinearVelocity(
        MemorySegment character, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_CHARACTER_GET_LINEAR_VELOCITY.get();
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
     * Typed method of {@link #getLinearVelocity}.
     */
    public final void getLinearVelocity(
        Vec3 result
    ) {
        getLinearVelocity(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setLinearVelocity(
        MemorySegment character, 
        MemorySegment value, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_SET_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                character, 
                value, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLinearVelocity}.
     */
    public final void setLinearVelocity(
        Vec3 value, 
        boolean lockBodies
    ) {
        setLinearVelocity(
            this.segment, 
            value.memorySegment(), 
            lockBodies
        );
    }
    
    public static void addLinearVelocity(
        MemorySegment character, 
        MemorySegment value, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_ADD_LINEAR_VELOCITY.get();
        try {
            method.invokeExact(
                character, 
                value, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addLinearVelocity}.
     */
    public final void addLinearVelocity(
        Vec3 value, 
        boolean lockBodies
    ) {
        addLinearVelocity(
            this.segment, 
            value.memorySegment(), 
            lockBodies
        );
    }
    
    public static void addImpulse(
        MemorySegment character, 
        MemorySegment value, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_ADD_IMPULSE.get();
        try {
            method.invokeExact(
                character, 
                value, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addImpulse}.
     */
    public final void addImpulse(
        Vec3 value, 
        boolean lockBodies
    ) {
        addImpulse(
            this.segment, 
            value.memorySegment(), 
            lockBodies
        );
    }
    
    public static int getBodyID(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_GET_BODY_ID.get();
        try {
            return (int) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyID}.
     */
    public final int getBodyID(
    ) {
        return (int) getBodyID(
            this.segment
        );
    }
    
    public static void getPositionAndRotation(
        MemorySegment character, 
        MemorySegment position, 
        MemorySegment rotation, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_GET_POSITION_AND_ROTATION.get();
        try {
            method.invokeExact(
                character, 
                position, 
                rotation, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPositionAndRotation}.
     */
    public final void getPositionAndRotation(
        Vec3 position, 
        Quat rotation, 
        boolean lockBodies
    ) {
        getPositionAndRotation(
            this.segment, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            lockBodies
        );
    }
    
    public static void setPositionAndRotation(
        MemorySegment character, 
        MemorySegment position, 
        MemorySegment rotation, 
        int activationMode, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_SET_POSITION_AND_ROTATION.get();
        try {
            method.invokeExact(
                character, 
                position, 
                rotation, 
                activationMode, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPositionAndRotation}.
     */
    public final void setPositionAndRotation(
        Vec3 position, 
        Quat rotation, 
        int activationMode, 
        boolean lockBodies
    ) {
        setPositionAndRotation(
            this.segment, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            activationMode, 
            lockBodies
        );
    }
    
    public static void getPosition(
        MemorySegment character, 
        MemorySegment position, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_GET_POSITION.get();
        try {
            method.invokeExact(
                character, 
                position, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPosition}.
     */
    public final void getPosition(
        Vec3 position, 
        boolean lockBodies
    ) {
        getPosition(
            this.segment, 
            position.memorySegment(), 
            lockBodies
        );
    }
    
    public static void setPosition(
        MemorySegment character, 
        MemorySegment position, 
        int activationMode, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_SET_POSITION.get();
        try {
            method.invokeExact(
                character, 
                position, 
                activationMode, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPosition}.
     */
    public final void setPosition(
        Vec3 position, 
        int activationMode, 
        boolean lockBodies
    ) {
        setPosition(
            this.segment, 
            position.memorySegment(), 
            activationMode, 
            lockBodies
        );
    }
    
    public static void getRotation(
        MemorySegment character, 
        MemorySegment rotation, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_GET_ROTATION.get();
        try {
            method.invokeExact(
                character, 
                rotation, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotation}.
     */
    public final void getRotation(
        Quat rotation, 
        boolean lockBodies
    ) {
        getRotation(
            this.segment, 
            rotation.memorySegment(), 
            lockBodies
        );
    }
    
    public static void setRotation(
        MemorySegment character, 
        MemorySegment rotation, 
        int activationMode, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_SET_ROTATION.get();
        try {
            method.invokeExact(
                character, 
                rotation, 
                activationMode, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRotation}.
     */
    public final void setRotation(
        Quat rotation, 
        int activationMode, 
        boolean lockBodies
    ) {
        setRotation(
            this.segment, 
            rotation.memorySegment(), 
            activationMode, 
            lockBodies
        );
    }
    
    public static void getCenterOfMassPosition(
        MemorySegment character, 
        MemorySegment result, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_GET_CENTER_OF_MASS_POSITION.get();
        try {
            method.invokeExact(
                character, 
                result, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCenterOfMassPosition}.
     */
    public final void getCenterOfMassPosition(
        Vec3 result, 
        boolean lockBodies
    ) {
        getCenterOfMassPosition(
            this.segment, 
            result.memorySegment(), 
            lockBodies
        );
    }
    
    public static void getWorldTransform(
        MemorySegment character, 
        MemorySegment result, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_GET_WORLD_TRANSFORM.get();
        try {
            method.invokeExact(
                character, 
                result, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWorldTransform}.
     */
    public final void getWorldTransform(
        Mat4 result, 
        boolean lockBodies
    ) {
        getWorldTransform(
            this.segment, 
            result.memorySegment(), 
            lockBodies
        );
    }
    
    public static int getLayer(
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_GET_LAYER.get();
        try {
            return (int) method.invokeExact(
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLayer}.
     */
    public final int getLayer(
    ) {
        return (int) getLayer(
            this.segment
        );
    }
    
    public static void setLayer(
        MemorySegment character, 
        int value, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_SET_LAYER.get();
        try {
            method.invokeExact(
                character, 
                value, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLayer}.
     */
    public final void setLayer(
        int value, 
        boolean lockBodies
    ) {
        setLayer(
            this.segment, 
            value, 
            lockBodies
        );
    }
    
    public static void setShape(
        MemorySegment character, 
        MemorySegment shape, 
        float maxPenetrationDepth, 
        boolean lockBodies
    ) {
        MethodHandle method = JPH_CHARACTER_SET_SHAPE.get();
        try {
            method.invokeExact(
                character, 
                shape, 
                maxPenetrationDepth, 
                lockBodies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setShape}.
     */
    public final void setShape(
        Shape shape, 
        float maxPenetrationDepth, 
        boolean lockBodies
    ) {
        setShape(
            this.segment, 
            shape.memorySegment(), 
            maxPenetrationDepth, 
            lockBodies
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}