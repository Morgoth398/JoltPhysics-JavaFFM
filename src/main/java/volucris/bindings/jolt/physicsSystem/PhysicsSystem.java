/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physicsSystem;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.jolt.BodyActivationListener;
import volucris.bindings.jolt.ContactListener;
import volucris.bindings.jolt.DebugRenderer;
import volucris.bindings.jolt.DrawSettings;
import volucris.bindings.jolt.PhysicsStepListener;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.body.BodyInterface;
import volucris.bindings.jolt.body.BodyLockInterface;
import volucris.bindings.jolt.constraint.Constraint;
import volucris.bindings.jolt.filter.BodyDrawFilter;
import volucris.bindings.jolt.filter.SimShapeFilter;
import volucris.bindings.jolt.jobSystem.JobSystem;
import volucris.bindings.jolt.math.AABox;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.raycast.BroadPhaseQuery;
import volucris.bindings.jolt.raycast.NarrowPhaseQuery;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;;

/**
 * 
 */
public final class PhysicsSystem {

    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_CREATE;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_UPDATE;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NUM_BODIES;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_MAX_BODIES;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NUM_CONSTRAINTS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_GRAVITY;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_GRAVITY;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODIES;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES_UNSAFE;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_ACTIVATE_BODIES_IN_AABOX;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DRAW_BODIES;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_PTR;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_PHYSICS_SYSTEM_CREATE = downcallHandle("JPH_PhysicsSystem_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_DESTROY = downcallHandleVoid("JPH_PhysicsSystem_Destroy", UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS = downcallHandleVoid("JPH_PhysicsSystem_SetPhysicsSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS = downcallHandleVoid("JPH_PhysicsSystem_GetPhysicsSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE = downcallHandleVoid("JPH_PhysicsSystem_OptimizeBroadPhase", UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_UPDATE = downcallHandle("JPH_PhysicsSystem_Update", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE = downcallHandle("JPH_PhysicsSystem_GetBodyInterface", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetBodyInterfaceNoLock", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE = downcallHandle("JPH_PhysicsSystem_GetBodyLockInterface", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetBodyLockInterfaceNoLock", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY = downcallHandle("JPH_PhysicsSystem_GetBroadPhaseQuery", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY = downcallHandle("JPH_PhysicsSystem_GetNarrowPhaseQuery", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetNarrowPhaseQueryNoLock", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_SetContactListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_SetBodyActivationListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER = downcallHandleVoid("JPH_PhysicsSystem_SetSimShapeFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT = downcallHandle("JPH_PhysicsSystem_WereBodiesInContact", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_PHYSICS_SYSTEM_GET_NUM_BODIES = downcallHandle("JPH_PhysicsSystem_GetNumBodies", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES = downcallHandle("JPH_PhysicsSystem_GetNumActiveBodies", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_SYSTEM_GET_MAX_BODIES = downcallHandle("JPH_PhysicsSystem_GetMaxBodies", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_NUM_CONSTRAINTS = downcallHandle("JPH_PhysicsSystem_GetNumConstraints", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_SET_GRAVITY = downcallHandleVoid("JPH_PhysicsSystem_SetGravity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_GRAVITY = downcallHandleVoid("JPH_PhysicsSystem_GetGravity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT = downcallHandleVoid("JPH_PhysicsSystem_AddConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT = downcallHandleVoid("JPH_PhysicsSystem_RemoveConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_AddConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_RemoveConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_AddStepListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_RemoveStepListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_BODIES = downcallHandleVoid("JPH_PhysicsSystem_GetBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES = downcallHandleVoid("JPH_PhysicsSystem_GetActiveBodies", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES_UNSAFE = downcallHandle("JPH_PhysicsSystem_GetActiveBodiesUnsafe", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_GetConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_SYSTEM_ACTIVATE_BODIES_IN_AABOX = downcallHandleVoid("JPH_PhysicsSystem_ActivateBodiesInAABox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_SYSTEM_DRAW_BODIES = downcallHandleVoid("JPH_PhysicsSystem_DrawBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraintLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraintReferenceFrame", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_SYSTEM_GET_BODY_PTR = downcallHandle("JPH_PhysicsSystem_GetBodyPtr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public PhysicsSystem(
        PhysicsSystemSettings settings
    ) {
        this(
            Arena.ofAuto(),
            settings
        );
    }
    
    public PhysicsSystem(
        Arena arena,
        PhysicsSystemSettings settings
    ) {
         MemorySegment segment = create(
            settings.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public PhysicsSystem(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_DESTROY.get();
        try {
            method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void setPhysicsSettings(
        MemorySegment system, 
        MemorySegment settings
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS.get();
        try {
            method.invokeExact(
                system, 
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setPhysicsSettings}.
     */
    public final void setPhysicsSettings(
        PhysicsSettings settings
    ) {
        setPhysicsSettings(
            this.segment, 
            settings.memorySegment()
        );
    }
    
    public static void getPhysicsSettings(
        MemorySegment system, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS.get();
        try {
            method.invokeExact(
                system, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPhysicsSettings}.
     */
    public final void getPhysicsSettings(
        PhysicsSettings result
    ) {
        getPhysicsSettings(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void optimizeBroadPhase(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE.get();
        try {
            method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #optimizeBroadPhase}.
     */
    public final void optimizeBroadPhase(
    ) {
        optimizeBroadPhase(
            this.segment
        );
    }
    
    public static int update(
        MemorySegment system, 
        float deltaTime, 
        int collisionSteps, 
        MemorySegment jobSystem
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_UPDATE.get();
        try {
            return (int) method.invokeExact(
                system, 
                deltaTime, 
                collisionSteps, 
                jobSystem
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #update}.
     */
    public final int update(
        float deltaTime, 
        int collisionSteps, 
        JobSystem jobSystem
    ) {
        return (int) update(
            this.segment, 
            deltaTime, 
            collisionSteps, 
            jobSystem.memorySegment()
        );
    }
    
    public static MemorySegment getBodyInterface(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE.get();
        try {
            return (MemorySegment) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyInterface}.
     */
    public final @Nullable BodyInterface getBodyInterface(
    ) {
        MemorySegment segment = getBodyInterface(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BodyInterface(segment);
    }
    
    public static MemorySegment getBodyInterfaceNoLock(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK.get();
        try {
            return (MemorySegment) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyInterfaceNoLock}.
     */
    public final @Nullable BodyInterface getBodyInterfaceNoLock(
    ) {
        MemorySegment segment = getBodyInterfaceNoLock(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BodyInterface(segment);
    }
    
    public static MemorySegment getBodyLockInterface(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE.get();
        try {
            return (MemorySegment) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyLockInterface}.
     */
    public final @Nullable BodyLockInterface getBodyLockInterface(
    ) {
        MemorySegment segment = getBodyLockInterface(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BodyLockInterface(segment);
    }
    
    public static MemorySegment getBodyLockInterfaceNoLock(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK.get();
        try {
            return (MemorySegment) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyLockInterfaceNoLock}.
     */
    public final @Nullable BodyLockInterface getBodyLockInterfaceNoLock(
    ) {
        MemorySegment segment = getBodyLockInterfaceNoLock(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BodyLockInterface(segment);
    }
    
    public static MemorySegment getBroadPhaseQuery(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY.get();
        try {
            return (MemorySegment) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBroadPhaseQuery}.
     */
    public final @Nullable BroadPhaseQuery getBroadPhaseQuery(
    ) {
        MemorySegment segment = getBroadPhaseQuery(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BroadPhaseQuery(segment);
    }
    
    public static MemorySegment getNarrowPhaseQuery(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY.get();
        try {
            return (MemorySegment) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNarrowPhaseQuery}.
     */
    public final @Nullable NarrowPhaseQuery getNarrowPhaseQuery(
    ) {
        MemorySegment segment = getNarrowPhaseQuery(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new NarrowPhaseQuery(segment);
    }
    
    public static MemorySegment getNarrowPhaseQueryNoLock(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK.get();
        try {
            return (MemorySegment) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNarrowPhaseQueryNoLock}.
     */
    public final @Nullable NarrowPhaseQuery getNarrowPhaseQueryNoLock(
    ) {
        MemorySegment segment = getNarrowPhaseQueryNoLock(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new NarrowPhaseQuery(segment);
    }
    
    public static void setContactListener(
        MemorySegment system, 
        MemorySegment listener
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER.get();
        try {
            method.invokeExact(
                system, 
                listener
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setContactListener}.
     */
    public final void setContactListener(
        ContactListener listener
    ) {
        setContactListener(
            this.segment, 
            listener.memorySegment()
        );
    }
    
    public static void setBodyActivationListener(
        MemorySegment system, 
        MemorySegment listener
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER.get();
        try {
            method.invokeExact(
                system, 
                listener
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setBodyActivationListener}.
     */
    public final void setBodyActivationListener(
        BodyActivationListener listener
    ) {
        setBodyActivationListener(
            this.segment, 
            listener.memorySegment()
        );
    }
    
    public static void setSimShapeFilter(
        MemorySegment system, 
        MemorySegment filter
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER.get();
        try {
            method.invokeExact(
                system, 
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setSimShapeFilter}.
     */
    public final void setSimShapeFilter(
        SimShapeFilter filter
    ) {
        setSimShapeFilter(
            this.segment, 
            filter.memorySegment()
        );
    }
    
    public static boolean wereBodiesInContact(
        MemorySegment system, 
        int body1, 
        int body2
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT.get();
        try {
            return (boolean) method.invokeExact(
                system, 
                body1, 
                body2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #wereBodiesInContact}.
     */
    public final boolean wereBodiesInContact(
        int body1, 
        int body2
    ) {
        return (boolean) wereBodiesInContact(
            this.segment, 
            body1, 
            body2
        );
    }
    
    public static int getNumBodies(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NUM_BODIES.get();
        try {
            return (int) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumBodies}.
     */
    public final int getNumBodies(
    ) {
        return (int) getNumBodies(
            this.segment
        );
    }
    
    public static int getNumActiveBodies(
        MemorySegment system, 
        int type
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES.get();
        try {
            return (int) method.invokeExact(
                system, 
                type
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumActiveBodies}.
     */
    public final int getNumActiveBodies(
        int type
    ) {
        return (int) getNumActiveBodies(
            this.segment, 
            type
        );
    }
    
    public static int getMaxBodies(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_MAX_BODIES.get();
        try {
            return (int) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxBodies}.
     */
    public final int getMaxBodies(
    ) {
        return (int) getMaxBodies(
            this.segment
        );
    }
    
    public static int getNumConstraints(
        MemorySegment system
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NUM_CONSTRAINTS.get();
        try {
            return (int) method.invokeExact(
                system
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getNumConstraints}.
     */
    public final int getNumConstraints(
    ) {
        return (int) getNumConstraints(
            this.segment
        );
    }
    
    public static void setGravity(
        MemorySegment system, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_SET_GRAVITY.get();
        try {
            method.invokeExact(
                system, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setGravity}.
     */
    public final void setGravity(
        Vec3 value
    ) {
        setGravity(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static void getGravity(
        MemorySegment system, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_GRAVITY.get();
        try {
            method.invokeExact(
                system, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGravity}.
     */
    public final void getGravity(
        Vec3 result
    ) {
        getGravity(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void addConstraint(
        MemorySegment system, 
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT.get();
        try {
            method.invokeExact(
                system, 
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addConstraint}.
     */
    public final void addConstraint(
        Constraint constraint
    ) {
        addConstraint(
            this.segment, 
            constraint.memorySegment()
        );
    }
    
    public static void removeConstraint(
        MemorySegment system, 
        MemorySegment constraint
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT.get();
        try {
            method.invokeExact(
                system, 
                constraint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeConstraint}.
     */
    public final void removeConstraint(
        Constraint constraint
    ) {
        removeConstraint(
            this.segment, 
            constraint.memorySegment()
        );
    }
    
    public static void addConstraints(
        MemorySegment system, 
        MemorySegment constraints, 
        int count
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS.get();
        try {
            method.invokeExact(
                system, 
                constraints, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addConstraints}.
     */
    public final void addConstraints(
        NativePointerArray constraints, 
        int count
    ) {
        addConstraints(
            this.segment, 
            constraints.memorySegment(), 
            count
        );
    }
    
    public static void removeConstraints(
        MemorySegment system, 
        MemorySegment constraints, 
        int count
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS.get();
        try {
            method.invokeExact(
                system, 
                constraints, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeConstraints}.
     */
    public final void removeConstraints(
        NativePointerArray constraints, 
        int count
    ) {
        removeConstraints(
            this.segment, 
            constraints.memorySegment(), 
            count
        );
    }
    
    public static void addStepListener(
        MemorySegment system, 
        MemorySegment listener
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER.get();
        try {
            method.invokeExact(
                system, 
                listener
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addStepListener}.
     */
    public final void addStepListener(
        PhysicsStepListener listener
    ) {
        addStepListener(
            this.segment, 
            listener.memorySegment()
        );
    }
    
    public static void removeStepListener(
        MemorySegment system, 
        MemorySegment listener
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER.get();
        try {
            method.invokeExact(
                system, 
                listener
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeStepListener}.
     */
    public final void removeStepListener(
        PhysicsStepListener listener
    ) {
        removeStepListener(
            this.segment, 
            listener.memorySegment()
        );
    }
    
    public static void getBodies(
        MemorySegment system, 
        MemorySegment ids, 
        int count
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODIES.get();
        try {
            method.invokeExact(
                system, 
                ids, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodies}.
     */
    public final void getBodies(
        NativeIntArray ids, 
        int count
    ) {
        getBodies(
            this.segment, 
            ids.memorySegment(), 
            count
        );
    }
    
    public static void getActiveBodies(
        MemorySegment system, 
        int type, 
        MemorySegment ids, 
        int count
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES.get();
        try {
            method.invokeExact(
                system, 
                type, 
                ids, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getActiveBodies}.
     */
    public final void getActiveBodies(
        int type, 
        NativeIntArray ids, 
        int count
    ) {
        getActiveBodies(
            this.segment, 
            type, 
            ids.memorySegment(), 
            count
        );
    }
    
    public static MemorySegment getActiveBodiesUnsafe(
        MemorySegment system, 
        int type
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES_UNSAFE.get();
        try {
            return (MemorySegment) method.invokeExact(
                system, 
                type
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getActiveBodiesUnsafe}.
     */
    public final @Nullable NativeIntArray getActiveBodiesUnsafe(
        int type
    ) {
        MemorySegment segment = getActiveBodiesUnsafe(
            this.segment, 
            type
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new NativeIntArray(segment);
    }
    
    public static void getConstraints(
        MemorySegment system, 
        MemorySegment constraints, 
        int count
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS.get();
        try {
            method.invokeExact(
                system, 
                constraints, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getConstraints}.
     */
    public final void getConstraints(
        NativePointerArray constraints, 
        int count
    ) {
        getConstraints(
            this.segment, 
            constraints.memorySegment(), 
            count
        );
    }
    
    public static void activateBodiesInAABox(
        MemorySegment system, 
        MemorySegment box, 
        int layer
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_ACTIVATE_BODIES_IN_AABOX.get();
        try {
            method.invokeExact(
                system, 
                box, 
                layer
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
        int layer
    ) {
        activateBodiesInAABox(
            this.segment, 
            box.memorySegment(), 
            layer
        );
    }
    
    public static void drawBodies(
        MemorySegment system, 
        MemorySegment settings, 
        MemorySegment renderer, 
        MemorySegment bodyFilter
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_BODIES.get();
        try {
            method.invokeExact(
                system, 
                settings, 
                renderer, 
                bodyFilter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawBodies}.
     */
    public final void drawBodies(
        DrawSettings settings, 
        DebugRenderer renderer, 
        BodyDrawFilter bodyFilter
    ) {
        drawBodies(
            this.segment, 
            settings.memorySegment(), 
            renderer.memorySegment(), 
            bodyFilter.memorySegment()
        );
    }
    
    public static void drawConstraints(
        MemorySegment system, 
        MemorySegment renderer
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS.get();
        try {
            method.invokeExact(
                system, 
                renderer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawConstraints}.
     */
    public final void drawConstraints(
        DebugRenderer renderer
    ) {
        drawConstraints(
            this.segment, 
            renderer.memorySegment()
        );
    }
    
    public static void drawConstraintLimits(
        MemorySegment system, 
        MemorySegment renderer
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS.get();
        try {
            method.invokeExact(
                system, 
                renderer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawConstraintLimits}.
     */
    public final void drawConstraintLimits(
        DebugRenderer renderer
    ) {
        drawConstraintLimits(
            this.segment, 
            renderer.memorySegment()
        );
    }
    
    public static void drawConstraintReferenceFrame(
        MemorySegment system, 
        MemorySegment renderer
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME.get();
        try {
            method.invokeExact(
                system, 
                renderer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #drawConstraintReferenceFrame}.
     */
    public final void drawConstraintReferenceFrame(
        DebugRenderer renderer
    ) {
        drawConstraintReferenceFrame(
            this.segment, 
            renderer.memorySegment()
        );
    }
    
    public static MemorySegment getBodyPtr(
        MemorySegment system, 
        int bodyID
    ) {
        MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_PTR.get();
        try {
            return (MemorySegment) method.invokeExact(
                system, 
                bodyID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBodyPtr}.
     */
    public final @Nullable Body getBodyPtr(
        int bodyID
    ) {
        MemorySegment segment = getBodyPtr(
            this.segment, 
            bodyID
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}