/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.filter.CollisionGroup;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class SoftBodyCreationSettings {

    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_CREATE2;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_ROTATION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_USER_DATA;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_NUM_ITERATIONS;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_NUM_ITERATIONS;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_RESTITUTION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_RESTITUTION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_PRESSURE;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_PRESSURE;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_VERTEX_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_VERTEX_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_UPDATE_POSITION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_UPDATE_POSITION;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAKE_ROTATION_IDENTITY;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAKE_ROTATION_IDENTITY;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_GET_FACES_DOUBLE_SIDED;
    private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_CREATION_SETTINGS_SET_FACES_DOUBLE_SIDED;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SOFT_BODY_CREATION_SETTINGS_CREATE = downcallHandle("JPH_SoftBodyCreationSettings_Create", UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_CREATE2 = downcallHandle("JPH_SoftBodyCreationSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY = downcallHandleVoid("JPH_SoftBodyCreationSettings_Destroy", UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_SETTINGS = downcallHandle("JPH_SoftBodyCreationSettings_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_SETTINGS = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_POSITION = downcallHandleVoid("JPH_SoftBodyCreationSettings_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_POSITION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_ROTATION = downcallHandleVoid("JPH_SoftBodyCreationSettings_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_ROTATION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_USER_DATA = downcallHandle("JPH_SoftBodyCreationSettings_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_USER_DATA = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER = downcallHandle("JPH_SoftBodyCreationSettings_GetObjectLayer", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetObjectLayer", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP = downcallHandleVoid("JPH_SoftBodyCreationSettings_GetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetCollisionGroup", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_NUM_ITERATIONS = downcallHandle("JPH_SoftBodyCreationSettings_GetNumIterations", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_NUM_ITERATIONS = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetNumIterations", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING = downcallHandle("JPH_SoftBodyCreationSettings_GetLinearDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetLinearDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY = downcallHandle("JPH_SoftBodyCreationSettings_GetMaxLinearVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetMaxLinearVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_RESTITUTION = downcallHandle("JPH_SoftBodyCreationSettings_GetRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_RESTITUTION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetRestitution", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_FRICTION = downcallHandle("JPH_SoftBodyCreationSettings_GetFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_FRICTION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_PRESSURE = downcallHandle("JPH_SoftBodyCreationSettings_GetPressure", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_PRESSURE = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetPressure", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR = downcallHandle("JPH_SoftBodyCreationSettings_GetGravityFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetGravityFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_VERTEX_RADIUS = downcallHandle("JPH_SoftBodyCreationSettings_GetVertexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_VERTEX_RADIUS = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetVertexRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_UPDATE_POSITION = downcallHandle("JPH_SoftBodyCreationSettings_GetUpdatePosition", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_UPDATE_POSITION = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetUpdatePosition", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAKE_ROTATION_IDENTITY = downcallHandle("JPH_SoftBodyCreationSettings_GetMakeRotationIdentity", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAKE_ROTATION_IDENTITY = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetMakeRotationIdentity", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING = downcallHandle("JPH_SoftBodyCreationSettings_GetAllowSleeping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetAllowSleeping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_SOFT_BODY_CREATION_SETTINGS_GET_FACES_DOUBLE_SIDED = downcallHandle("JPH_SoftBodyCreationSettings_GetFacesDoubleSided", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_SOFT_BODY_CREATION_SETTINGS_SET_FACES_DOUBLE_SIDED = downcallHandleVoid("JPH_SoftBodyCreationSettings_SetFacesDoubleSided", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        //@formatter:on
    }

    public SoftBodyCreationSettings() {
        this(Arena.ofAuto());
    }
    
    public SoftBodyCreationSettings(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public SoftBodyCreationSettings(
        SoftBodySharedSettings settings, 
        Vec3 position, 
        Quat rotation, 
        int objectLayer
    ) {
        this(
            Arena.ofAuto(),
            settings, 
            position, 
            rotation, 
            objectLayer
        );
    }
    
    public SoftBodyCreationSettings(
        Arena arena,
        SoftBodySharedSettings settings, 
        Vec3 position, 
        Quat rotation, 
        int objectLayer
    ) {
         MemorySegment segment = create2(
            settings.memorySegment(), 
            position.memorySegment(), 
            rotation.memorySegment(), 
            objectLayer
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public SoftBodyCreationSettings(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_CREATE.get();
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
        int objectLayer
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_CREATE2.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings, 
                position, 
                rotation, 
                objectLayer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_DESTROY.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment getSettings(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_SETTINGS.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSettings}.
     */
    public final @Nullable SoftBodySharedSettings getSettings(
    ) {
        MemorySegment segment = getSettings(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new SoftBodySharedSettings(segment);
    }
    
    public static void setSettings(
        MemorySegment settings, 
        MemorySegment sharedSettings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_SETTINGS.get();
        try {
            method.invokeExact(
                settings, 
                sharedSettings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setSettings}.
     */
    public final void setSettings(
        SoftBodySharedSettings sharedSettings
    ) {
        setSettings(
            this.segment, 
            sharedSettings.memorySegment()
        );
    }
    
    public static void getPosition(
        MemorySegment settings, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_POSITION.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_POSITION.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_ROTATION.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_ROTATION.get();
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
    
    public static long getUserData(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_USER_DATA.get();
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
        long userData
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_USER_DATA.get();
        try {
            method.invokeExact(
                settings, 
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
    
    public static int getObjectLayer(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_OBJECT_LAYER.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_OBJECT_LAYER.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_COLLISION_GROUP.get();
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
        MemorySegment group
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_COLLISION_GROUP.get();
        try {
            method.invokeExact(
                settings, 
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
        CollisionGroup group
    ) {
        setCollisionGroup(
            this.segment, 
            group.memorySegment()
        );
    }
    
    public static int getNumIterations(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_NUM_ITERATIONS.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumIterations}.
     */
    public final int getNumIterations(
    ) {
        return (int) getNumIterations(
            this.segment
        );
    }
    
    public static void setNumIterations(
        MemorySegment settings, 
        int iterations
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_NUM_ITERATIONS.get();
        try {
            method.invokeExact(
                settings, 
                iterations
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setNumIterations}.
     */
    public final void setNumIterations(
        int iterations
    ) {
        setNumIterations(
            this.segment, 
            iterations
        );
    }
    
    public static float getLinearDamping(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_LINEAR_DAMPING.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_LINEAR_DAMPING.get();
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
    
    public static float getMaxLinearVelocity(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAX_LINEAR_VELOCITY.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAX_LINEAR_VELOCITY.get();
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
    
    public static float getRestitution(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_RESTITUTION.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_RESTITUTION.get();
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
    
    public static float getFriction(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_FRICTION.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_FRICTION.get();
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
    
    public static float getPressure(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_PRESSURE.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPressure}.
     */
    public final float getPressure(
    ) {
        return (float) getPressure(
            this.segment
        );
    }
    
    public static void setPressure(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_PRESSURE.get();
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
     * Typed method of {@link #setPressure}.
     */
    public final void setPressure(
        float value
    ) {
        setPressure(
            this.segment, 
            value
        );
    }
    
    public static float getGravityFactor(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_GRAVITY_FACTOR.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_GRAVITY_FACTOR.get();
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
    
    public static float getVertexRadius(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_VERTEX_RADIUS.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getVertexRadius}.
     */
    public final float getVertexRadius(
    ) {
        return (float) getVertexRadius(
            this.segment
        );
    }
    
    public static void setVertexRadius(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_VERTEX_RADIUS.get();
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
     * Typed method of {@link #setVertexRadius}.
     */
    public final void setVertexRadius(
        float value
    ) {
        setVertexRadius(
            this.segment, 
            value
        );
    }
    
    public static boolean getUpdatePosition(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_UPDATE_POSITION.get();
        try {
            return (boolean) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getUpdatePosition}.
     */
    public final boolean getUpdatePosition(
    ) {
        return (boolean) getUpdatePosition(
            this.segment
        );
    }
    
    public static void setUpdatePosition(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_UPDATE_POSITION.get();
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
     * Typed method of {@link #setUpdatePosition}.
     */
    public final void setUpdatePosition(
        boolean value
    ) {
        setUpdatePosition(
            this.segment, 
            value
        );
    }
    
    public static boolean getMakeRotationIdentity(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_MAKE_ROTATION_IDENTITY.get();
        try {
            return (boolean) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMakeRotationIdentity}.
     */
    public final boolean getMakeRotationIdentity(
    ) {
        return (boolean) getMakeRotationIdentity(
            this.segment
        );
    }
    
    public static void setMakeRotationIdentity(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_MAKE_ROTATION_IDENTITY.get();
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
     * Typed method of {@link #setMakeRotationIdentity}.
     */
    public final void setMakeRotationIdentity(
        boolean value
    ) {
        setMakeRotationIdentity(
            this.segment, 
            value
        );
    }
    
    public static boolean getAllowSleeping(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_ALLOW_SLEEPING.get();
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
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_ALLOW_SLEEPING.get();
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
    
    public static boolean getFacesDoubleSided(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_GET_FACES_DOUBLE_SIDED.get();
        try {
            return (boolean) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getFacesDoubleSided}.
     */
    public final boolean getFacesDoubleSided(
    ) {
        return (boolean) getFacesDoubleSided(
            this.segment
        );
    }
    
    public static void setFacesDoubleSided(
        MemorySegment settings, 
        boolean value
    ) {
        MethodHandle method = JPH_SOFT_BODY_CREATION_SETTINGS_SET_FACES_DOUBLE_SIDED.get();
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
     * Typed method of {@link #setFacesDoubleSided}.
     */
    public final void setFacesDoubleSided(
        boolean value
    ) {
        setFacesDoubleSided(
            this.segment, 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}