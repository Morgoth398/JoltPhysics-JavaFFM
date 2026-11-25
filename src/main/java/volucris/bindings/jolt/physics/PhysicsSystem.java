/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.jolt.JobSystem;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.TempAllocator;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.body.BodyActivationListener;
import volucris.bindings.jolt.body.BodyDrawFilter;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.body.BodyIDArray;
import volucris.bindings.jolt.body.BodyInterface;
import volucris.bindings.jolt.body.BodyLockInterfaceLocking;
import volucris.bindings.jolt.body.BodyLockInterfaceNoLock;
import volucris.bindings.jolt.collision.CollideShapeSettings;
import volucris.bindings.jolt.collision.ContactListener;
import volucris.bindings.jolt.collision.NarrowPhaseQuery;
import volucris.bindings.jolt.collision.ObjectLayerPairFilter;
import volucris.bindings.jolt.collision.ObjectVsBroadPhaseLayerFilter;
import volucris.bindings.jolt.collision.ShapeFilter;
import volucris.bindings.jolt.collision.SimShapeFilter;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerInterface;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseQuery;
import volucris.bindings.jolt.collision.shape.CollideShapeCollector;
import volucris.bindings.jolt.constraints.Constraint;
import volucris.bindings.jolt.constraints.ConstraintArray;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.renderer.DebugRenderer;
import volucris.bindings.jolt.softBody.SoftBodyContactListener;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PhysicsSystem {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_MAX_BODIES_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_MAX_BODY_PAIRS_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_MAX_CONTACT_CONSTRAINTS_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_DRAW_MOTION_QUALITY_LINEAR_CAST;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_DRAW_MOTION_QUALITY_LINEAR_CAST;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_INIT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_ACTIVATION_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_CONTACT_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_SOFT_BODY_CONTACT_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_SOFT_BODY_CONTACT_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_SIM_SHAPE_FILTER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_SIM_COLLIDE_BODY_VS_BODY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_SIM_COLLIDE_BODY_VS_BODY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_S_DEFAULT_SIM_COLLIDE_BODY_VS_BODY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK1;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_UPDATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_RESTORE_STATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SAVE_BODY_STATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_RESTORE_BODY_STATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DRAW_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_SET_GRAVITY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_GRAVITY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_LAYER_INTERFACE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_OBJECT_VS_BROAD_PHASE_LAYER_FILTER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_OBJECT_LAYER_PAIR_FILTER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NUM_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_MAX_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODY_STATS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES_UNSAFE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SYSTEM_GET_BOUNDS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_SYSTEM_CREATE = downcallHandle("JPH_PhysicsSystem_Create", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_DESTROY = downcallHandleVoid("JPH_PhysicsSystem_Destroy", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_MAX_BODIES_LIMIT = downcallHandle("JPH_PhysicsSystem_GetMaxBodiesLimit", JAVA_INT);
		JPH_PHYSICS_SYSTEM_GET_MAX_BODY_PAIRS_LIMIT = downcallHandle("JPH_PhysicsSystem_GetMaxBodyPairsLimit", JAVA_INT);
		JPH_PHYSICS_SYSTEM_GET_MAX_CONTACT_CONSTRAINTS_LIMIT = downcallHandle("JPH_PhysicsSystem_GetMaxContactConstraintsLimit", JAVA_INT);
		JPH_PHYSICS_SYSTEM_GET_DRAW_MOTION_QUALITY_LINEAR_CAST = downcallHandle("JPH_PhysicsSystem_GetDrawMotionQualityLinearCast", JAVA_BOOLEAN);
		JPH_PHYSICS_SYSTEM_SET_DRAW_MOTION_QUALITY_LINEAR_CAST = downcallHandleVoid("JPH_PhysicsSystem_SetDrawMotionQualityLinearCast", JAVA_BOOLEAN);
		JPH_PHYSICS_SYSTEM_INIT = downcallHandleVoid("JPH_PhysicsSystem_Init", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_SetBodyActivationListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_ACTIVATION_LISTENER = downcallHandle("JPH_PhysicsSystem_GetBodyActivationListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_SetContactListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_CONTACT_LISTENER = downcallHandle("JPH_PhysicsSystem_GetContactListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_SOFT_BODY_CONTACT_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_SetSoftBodyContactListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_SOFT_BODY_CONTACT_LISTENER = downcallHandle("JPH_PhysicsSystem_GetSoftBodyContactListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER = downcallHandleVoid("JPH_PhysicsSystem_SetSimShapeFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_SIM_SHAPE_FILTER = downcallHandle("JPH_PhysicsSystem_GetSimShapeFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_SIM_COLLIDE_BODY_VS_BODY = downcallHandleVoid("JPH_PhysicsSystem_SetSimCollideBodyVsBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_SIM_COLLIDE_BODY_VS_BODY = downcallHandle("JPH_PhysicsSystem_GetSimCollideBodyVsBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_S_DEFAULT_SIM_COLLIDE_BODY_VS_BODY = downcallHandleVoid("JPH_PhysicsSystem_sDefaultSimCollideBodyVsBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS = downcallHandleVoid("JPH_PhysicsSystem_SetPhysicsSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS = downcallHandle("JPH_PhysicsSystem_GetPhysicsSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE = downcallHandle("JPH_PhysicsSystem_GetBodyInterface", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE1 = downcallHandle("JPH_PhysicsSystem_GetBodyInterface1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetBodyInterfaceNoLock", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK1 = downcallHandle("JPH_PhysicsSystem_GetBodyInterfaceNoLock1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY = downcallHandle("JPH_PhysicsSystem_GetBroadPhaseQuery", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY = downcallHandle("JPH_PhysicsSystem_GetNarrowPhaseQuery", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetNarrowPhaseQueryNoLock", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT = downcallHandleVoid("JPH_PhysicsSystem_AddConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT = downcallHandleVoid("JPH_PhysicsSystem_RemoveConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_AddConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_RemoveConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_GetConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE = downcallHandleVoid("JPH_PhysicsSystem_OptimizeBroadPhase", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_AddStepListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_RemoveStepListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_UPDATE = downcallHandle("JPH_PhysicsSystem_Update", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SAVE_STATE = downcallHandleVoid("JPH_PhysicsSystem_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_RESTORE_STATE = downcallHandle("JPH_PhysicsSystem_RestoreState", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SAVE_BODY_STATE = downcallHandleVoid("JPH_PhysicsSystem_SaveBodyState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_RESTORE_BODY_STATE = downcallHandleVoid("JPH_PhysicsSystem_RestoreBodyState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_DRAW_BODIES = downcallHandleVoid("JPH_PhysicsSystem_DrawBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraintLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraintReferenceFrame", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_GRAVITY = downcallHandleVoid("JPH_PhysicsSystem_SetGravity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_GRAVITY = downcallHandleVoid("JPH_PhysicsSystem_GetGravity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetBodyLockInterfaceNoLock", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE = downcallHandle("JPH_PhysicsSystem_GetBodyLockInterface", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_LAYER_INTERFACE = downcallHandle("JPH_PhysicsSystem_GetBroadPhaseLayerInterface", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_OBJECT_VS_BROAD_PHASE_LAYER_FILTER = downcallHandle("JPH_PhysicsSystem_GetObjectVsBroadPhaseLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_OBJECT_LAYER_PAIR_FILTER = downcallHandle("JPH_PhysicsSystem_GetObjectLayerPairFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_NUM_BODIES = downcallHandle("JPH_PhysicsSystem_GetNumBodies", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES = downcallHandle("JPH_PhysicsSystem_GetNumActiveBodies", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_GET_MAX_BODIES = downcallHandle("JPH_PhysicsSystem_GetMaxBodies", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_STATS = downcallHandleVoid("JPH_PhysicsSystem_GetBodyStats", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODIES = downcallHandleVoid("JPH_PhysicsSystem_GetBodies", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES = downcallHandleVoid("JPH_PhysicsSystem_GetActiveBodies", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES_UNSAFE = downcallHandle("JPH_PhysicsSystem_GetActiveBodiesUnsafe", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT = downcallHandle("JPH_PhysicsSystem_WereBodiesInContact", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BOUNDS = downcallHandleVoid("JPH_PhysicsSystem_GetBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PhysicsSystem() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PhysicsSystem(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PhysicsSystem(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor / Destructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The maximum value that can be passed to Init for inMaxBodies.
    /// ```
    public static int getMaxBodiesLimit() {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_MAX_BODIES_LIMIT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The maximum value that can be passed to Init for inMaxBodyPairs.
    /// Note you should really use a lower value, using this value will cost a lot of memory!
    /// On a 32 bit platform, you'll run out of memory way before you reach this limit.
    /// ```
    public static int getMaxBodyPairsLimit() {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_MAX_BODY_PAIRS_LIMIT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The maximum value that can be passed to Init for inMaxContactConstraints.
    /// Note you should really use a lower value, using this value will cost a lot of memory!
    /// On a 32 bit platform, you'll run out of memory way before you reach this limit.
    /// ```
    public static int getMaxContactConstraintsLimit() {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_MAX_CONTACT_CONSTRAINTS_LIMIT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw debug info for objects that perform continuous collision detection through the linear cast motion quality
    /// ```
    public static boolean getDrawMotionQualityLinearCast() {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_DRAW_MOTION_QUALITY_LINEAR_CAST.get();
    	try {
    		return (boolean) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Draw debug info for objects that perform continuous collision detection through the linear cast motion quality
    /// ```
    public static void setDrawMotionQualityLinearCast(
    	boolean sDrawMotionQualityLinearCast
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SET_DRAW_MOTION_QUALITY_LINEAR_CAST.get();
    	try {
    		 method.invokeExact(
    			sDrawMotionQualityLinearCast
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Initialize the system.
    /// @param inMaxBodies Maximum number of bodies to support.
    /// @param inNumBodyMutexes Number of body mutexes to use. Should be a power of 2 in the range [1, 64], use 0 to auto detect.
    /// @param inMaxBodyPairs Maximum amount of body pairs to process (anything else will fall through the world), this number should generally be much higher than the max amount of contact points as there will be lots of bodies close that are not actually touching.
    /// @param inMaxContactConstraints Maximum amount of contact constraints to process (anything else will fall through the world).
    /// @param inBroadPhaseLayerInterface Information on the mapping of object layers to broad phase layers. Since this is a virtual interface, the instance needs to stay alive during the lifetime of the PhysicsSystem.
    /// @param inObjectVsBroadPhaseLayerFilter Filter callback function that is used to determine if an object layer collides with a broad phase layer. Since this is a virtual interface, the instance needs to stay alive during the lifetime of the PhysicsSystem.
    /// @param inObjectLayerPairFilter Filter callback function that is used to determine if two object layers collide. Since this is a virtual interface, the instance needs to stay alive during the lifetime of the PhysicsSystem.
    /// ```
    public static void init(
    	MemorySegment self,
    	int inMaxBodies,
    	int inNumBodyMutexes,
    	int inMaxBodyPairs,
    	int inMaxContactConstraints,
    	MemorySegment inBroadPhaseLayerInterface,
    	MemorySegment inObjectVsBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerPairFilter
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_INIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxBodies,
    			inNumBodyMutexes,
    			inMaxBodyPairs,
    			inMaxContactConstraints,
    			inBroadPhaseLayerInterface,
    			inObjectVsBroadPhaseLayerFilter,
    			inObjectLayerPairFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#init].
    public final void init(
    	int inMaxBodies,
    	int inNumBodyMutexes,
    	int inMaxBodyPairs,
    	int inMaxContactConstraints,
    	BroadPhaseLayerInterface inBroadPhaseLayerInterface,
    	ObjectVsBroadPhaseLayerFilter inObjectVsBroadPhaseLayerFilter,
    	ObjectLayerPairFilter inObjectLayerPairFilter
    ) {
    	init(
    		this.segment,
    		inMaxBodies,
    		inNumBodyMutexes,
    		inMaxBodyPairs,
    		inMaxContactConstraints,
    		inBroadPhaseLayerInterface.memorySegment(),
    		inObjectVsBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerPairFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Listener that is notified whenever a body is activated/deactivated
    /// ```
    public static void setBodyActivationListener(
    	MemorySegment self,
    	MemorySegment inListener
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyActivationListener].
    public final void setBodyActivationListener(
    	BodyActivationListener inListener
    ) {
    	setBodyActivationListener(
    		this.segment,
    		inListener.memorySegment()
    	);
    }
    
    public static MemorySegment getBodyActivationListener(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_ACTIVATION_LISTENER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyActivationListener].
    public final @Nullable BodyActivationListener getBodyActivationListener() {
    	MemorySegment segment = getBodyActivationListener(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyActivationListener(segment);
    }
    
    /// ```
    /// Listener that is notified whenever a contact point between two bodies is added/updated/removed.
    /// You can't change contact listener during PhysicsSystem::Update but it can be changed at any other time.
    /// ```
    public static void setContactListener(
    	MemorySegment self,
    	MemorySegment inListener
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactListener].
    public final void setContactListener(
    	ContactListener inListener
    ) {
    	setContactListener(
    		this.segment,
    		inListener.memorySegment()
    	);
    }
    
    public static MemorySegment getContactListener(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_CONTACT_LISTENER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactListener].
    public final @Nullable ContactListener getContactListener() {
    	MemorySegment segment = getContactListener(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ContactListener(segment);
    }
    
    /// ```
    /// Listener that is notified whenever a contact point between a soft body and another body
    /// ```
    public static void setSoftBodyContactListener(
    	MemorySegment self,
    	MemorySegment inListener
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SET_SOFT_BODY_CONTACT_LISTENER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSoftBodyContactListener].
    public final void setSoftBodyContactListener(
    	SoftBodyContactListener inListener
    ) {
    	setSoftBodyContactListener(
    		this.segment,
    		inListener.memorySegment()
    	);
    }
    
    public static MemorySegment getSoftBodyContactListener(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_SOFT_BODY_CONTACT_LISTENER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSoftBodyContactListener].
    public final @Nullable SoftBodyContactListener getSoftBodyContactListener() {
    	MemorySegment segment = getSoftBodyContactListener(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SoftBodyContactListener(segment);
    }
    
    /// ```
    /// Set/get the shape filter that will be used during simulation. This can be used to exclude shapes within a body from colliding with each other.
    /// E.g. if you have a high detail and a low detail collision model, you can attach them to the same body in a StaticCompoundShape and use the ShapeFilter
    /// to exclude the high detail collision model when simulating and exclude the low detail collision model when casting rays. Note that in this case
    /// you would need to pass the inverse of inShapeFilter to the CastRay function. Pass a nullptr to disable the shape filter.
    /// The PhysicsSystem does not own the ShapeFilter, make sure it stays alive during the lifetime of the PhysicsSystem.
    /// ```
    public static void setSimShapeFilter(
    	MemorySegment self,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSimShapeFilter].
    public final void setSimShapeFilter(
    	SimShapeFilter inShapeFilter
    ) {
    	setSimShapeFilter(
    		this.segment,
    		inShapeFilter.memorySegment()
    	);
    }
    
    public static MemorySegment getSimShapeFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_SIM_SHAPE_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSimShapeFilter].
    public final @Nullable SimShapeFilter getSimShapeFilter() {
    	MemorySegment segment = getSimShapeFilter(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SimShapeFilter(segment);
    }
    
    /// ```
    /// Advanced use only: Set the function that will be used to collide two bodies during simulation.
    /// This function is expected to eventually call CollideShapeCollector::AddHit all contact points between the shapes of body 1 and 2 in their given transforms.
    /// ```
    public static void setSimCollideBodyVsBody(
    	MemorySegment self,
    	MemorySegment inBodyVsBody
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SET_SIM_COLLIDE_BODY_VS_BODY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyVsBody
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSimCollideBodyVsBody].
    public final void setSimCollideBodyVsBody(
    	SimCollideBodyVsBody inBodyVsBody
    ) {
    	setSimCollideBodyVsBody(
    		this.segment,
    		inBodyVsBody.memorySegment()
    	);
    }
    
    public static MemorySegment getSimCollideBodyVsBody(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_SIM_COLLIDE_BODY_VS_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSimCollideBodyVsBody].
    public final @Nullable SimCollideBodyVsBody getSimCollideBodyVsBody() {
    	MemorySegment segment = getSimCollideBodyVsBody(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SimCollideBodyVsBody(segment);
    }
    
    /// ```
    /// Advanced use only: Default function that is used to collide two bodies during simulation.
    /// ```
    public static void sDefaultSimCollideBodyVsBody(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inCenterOfMassTransform1,
    	MemorySegment inCenterOfMassTransform2,
    	MemorySegment ioCollideShapeSettings,
    	MemorySegment ioCollector,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_S_DEFAULT_SIM_COLLIDE_BODY_VS_BODY.get();
    	try {
    		 method.invokeExact(
    			inBody1,
    			inBody2,
    			inCenterOfMassTransform1,
    			inCenterOfMassTransform2,
    			ioCollideShapeSettings,
    			ioCollector,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sDefaultSimCollideBodyVsBody].
    public static void sDefaultSimCollideBodyVsBody(
    	Body inBody1,
    	Body inBody2,
    	Mat44 inCenterOfMassTransform1,
    	Mat44 inCenterOfMassTransform2,
    	CollideShapeSettings ioCollideShapeSettings,
    	CollideShapeCollector ioCollector,
    	ShapeFilter inShapeFilter
    ) {
    	sDefaultSimCollideBodyVsBody(
    		inBody1.memorySegment(),
    		inBody2.memorySegment(),
    		inCenterOfMassTransform1.memorySegment(),
    		inCenterOfMassTransform2.memorySegment(),
    		ioCollideShapeSettings.memorySegment(),
    		ioCollector.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Control the main constants of the physics simulation
    /// ```
    public static void setPhysicsSettings(
    	MemorySegment self,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPhysicsSettings].
    public final void setPhysicsSettings(
    	PhysicsSettings inSettings
    ) {
    	setPhysicsSettings(
    		this.segment,
    		inSettings.memorySegment()
    	);
    }
    
    public static MemorySegment getPhysicsSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPhysicsSettings].
    public final @Nullable PhysicsSettings getPhysicsSettings() {
    	MemorySegment segment = getPhysicsSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsSettings(segment);
    }
    
    /// ```
    /// Access to the body interface. This interface allows to to create / remove bodies and to change their properties.
    /// ```
    public static MemorySegment getBodyInterface(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyInterface].
    public final @Nullable BodyInterface getBodyInterface() {
    	MemorySegment segment = getBodyInterface(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyInterface(segment);
    }
    
    public static MemorySegment getBodyInterface1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyInterface1].
    public final @Nullable BodyInterface getBodyInterface1() {
    	MemorySegment segment = getBodyInterface1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyInterface(segment);
    }
    
    public static MemorySegment getBodyInterfaceNoLock(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyInterfaceNoLock].
    public final @Nullable BodyInterface getBodyInterfaceNoLock() {
    	MemorySegment segment = getBodyInterfaceNoLock(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyInterface(segment);
    }
    
    public static MemorySegment getBodyInterfaceNoLock1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyInterfaceNoLock1].
    public final @Nullable BodyInterface getBodyInterfaceNoLock1() {
    	MemorySegment segment = getBodyInterfaceNoLock1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyInterface(segment);
    }
    
    /// ```
    /// Access to the broadphase interface that allows coarse collision queries
    /// ```
    public static MemorySegment getBroadPhaseQuery(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBroadPhaseQuery].
    public final @Nullable BroadPhaseQuery getBroadPhaseQuery() {
    	MemorySegment segment = getBroadPhaseQuery(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BroadPhaseQuery(segment);
    }
    
    /// ```
    /// Interface that allows fine collision queries against first the broad phase and then the narrow phase.
    /// ```
    public static MemorySegment getNarrowPhaseQuery(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNarrowPhaseQuery].
    public final @Nullable NarrowPhaseQuery getNarrowPhaseQuery() {
    	MemorySegment segment = getNarrowPhaseQuery(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NarrowPhaseQuery(segment);
    }
    
    public static MemorySegment getNarrowPhaseQueryNoLock(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNarrowPhaseQueryNoLock].
    public final @Nullable NarrowPhaseQuery getNarrowPhaseQueryNoLock() {
    	MemorySegment segment = getNarrowPhaseQueryNoLock(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NarrowPhaseQuery(segment);
    }
    
    /// ```
    /// Add constraint to the world
    /// ```
    public static void addConstraint(
    	MemorySegment self,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addConstraint].
    public final void addConstraint(
    	Constraint inConstraint
    ) {
    	addConstraint(
    		this.segment,
    		inConstraint.memorySegment()
    	);
    }
    
    /// ```
    /// Remove constraint from the world
    /// ```
    public static void removeConstraint(
    	MemorySegment self,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#removeConstraint].
    public final void removeConstraint(
    	Constraint inConstraint
    ) {
    	removeConstraint(
    		this.segment,
    		inConstraint.memorySegment()
    	);
    }
    
    /// ```
    /// Batch add constraints.
    /// ```
    public static void addConstraints(
    	MemorySegment self,
    	MemorySegment inConstraints,
    	int inNumber
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstraints,
    			inNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addConstraints].
    public final void addConstraints(
    	NativePointerArray inConstraints,
    	int inNumber
    ) {
    	addConstraints(
    		this.segment,
    		inConstraints.memorySegment(),
    		inNumber
    	);
    }
    
    /// ```
    /// Batch remove constraints.
    /// ```
    public static void removeConstraints(
    	MemorySegment self,
    	MemorySegment inConstraints,
    	int inNumber
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstraints,
    			inNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#removeConstraints].
    public final void removeConstraints(
    	NativePointerArray inConstraints,
    	int inNumber
    ) {
    	removeConstraints(
    		this.segment,
    		inConstraints.memorySegment(),
    		inNumber
    	);
    }
    
    /// ```
    /// Get a list of all constraints
    /// ```
    public static void getConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraints].
    public final void getConstraints(
    	ConstraintArray outResult
    ) {
    	getConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Optimize the broadphase, needed only if you've added many bodies prior to calling Update() for the first time.
    /// Don't call this every frame as PhysicsSystem::Update spreads out the same work over multiple frames.
    /// If you add many bodies through BodyInterface::AddBodiesPrepare/AddBodiesFinalize and if the bodies in a batch are
    /// in a roughly unoccupied space (e.g. a new level section) then a call to OptimizeBroadPhase is also not needed
    /// as batch adding creates an efficient bounding volume hierarchy.
    /// Don't call this function while bodies are being modified from another thread or use the locking BodyInterface to modify bodies.
    /// ```
    public static void optimizeBroadPhase(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#optimizeBroadPhase].
    public final void optimizeBroadPhase() {
    	optimizeBroadPhase(
    		this.segment
    	);
    }
    
    /// ```
    /// Adds a new step listener
    /// ```
    public static void addStepListener(
    	MemorySegment self,
    	MemorySegment inListener
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addStepListener].
    public final void addStepListener(
    	PhysicsStepListener inListener
    ) {
    	addStepListener(
    		this.segment,
    		inListener.memorySegment()
    	);
    }
    
    /// ```
    /// Removes a step listener
    /// ```
    public static void removeStepListener(
    	MemorySegment self,
    	MemorySegment inListener
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inListener
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#removeStepListener].
    public final void removeStepListener(
    	PhysicsStepListener inListener
    ) {
    	removeStepListener(
    		this.segment,
    		inListener.memorySegment()
    	);
    }
    
    /// ```
    /// Simulate the system.
    /// The world steps for a total of inDeltaTime seconds. This is divided in inCollisionSteps iterations.
    /// Each iteration consists of collision detection followed by an integration step.
    /// This function internally spawns jobs using inJobSystem and waits for them to complete, so no jobs will be running when this function returns.
    /// The temp allocator is used, for example, to store the list of bodies that are in contact, how they form islands together
    /// and data to solve the contacts between bodies. At the end of the Update call, all allocated memory will have been freed.
    /// ```
    public static int update(
    	MemorySegment self,
    	float inDeltaTime,
    	int inCollisionSteps,
    	MemorySegment inTempAllocator,
    	MemorySegment inJobSystem
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_UPDATE.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inDeltaTime,
    			inCollisionSteps,
    			inTempAllocator,
    			inJobSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#update].
    public final int update(
    	float inDeltaTime,
    	int inCollisionSteps,
    	TempAllocator inTempAllocator,
    	JobSystem inJobSystem
    ) {
    	return update(
    		this.segment,
    		inDeltaTime,
    		inCollisionSteps,
    		inTempAllocator.memorySegment(),
    		inJobSystem.memorySegment()
    	);
    }
    
    /// ```
    /// Saving state for replay
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream,
    	int inState,
    	MemorySegment inFilter
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SAVE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream,
    			inState,
    			inFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveState].
    public final void saveState(
    	StateRecorder inStream,
    	int inState,
    	StateRecorderFilter inFilter
    ) {
    	saveState(
    		this.segment,
    		inStream.memorySegment(),
    		inState,
    		inFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Restoring state for replay. Returns false if failed.
    /// ```
    public static boolean restoreState(
    	MemorySegment self,
    	MemorySegment inStream,
    	MemorySegment inFilter
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_RESTORE_STATE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inStream,
    			inFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreState].
    public final boolean restoreState(
    	StateRecorder inStream,
    	StateRecorderFilter inFilter
    ) {
    	return restoreState(
    		this.segment,
    		inStream.memorySegment(),
    		inFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Saving state of a single body.
    /// ```
    public static void saveBodyState(
    	MemorySegment self,
    	MemorySegment inBody,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SAVE_BODY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBodyState].
    public final void saveBodyState(
    	Body inBody,
    	StateRecorder inStream
    ) {
    	saveBodyState(
    		this.segment,
    		inBody.memorySegment(),
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restoring state of a single body.
    /// ```
    public static void restoreBodyState(
    	MemorySegment self,
    	MemorySegment ioBody,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_RESTORE_BODY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioBody,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreBodyState].
    public final void restoreBodyState(
    	Body ioBody,
    	StateRecorder inStream
    ) {
    	restoreBodyState(
    		this.segment,
    		ioBody.memorySegment(),
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Draw the state of the bodies (debugging purposes)
    /// ```
    public static void drawBodies(
    	MemorySegment self,
    	MemorySegment inSettings,
    	MemorySegment inRenderer,
    	MemorySegment inBodyFilter
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSettings,
    			inRenderer,
    			inBodyFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawBodies].
    public final void drawBodies(
    	DrawSettings inSettings,
    	DebugRenderer inRenderer,
    	BodyDrawFilter inBodyFilter
    ) {
    	drawBodies(
    		this.segment,
    		inSettings.memorySegment(),
    		inRenderer.memorySegment(),
    		inBodyFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Draw the constraints only (debugging purposes)
    /// ```
    public static void drawConstraints(
    	MemorySegment self,
    	MemorySegment inRenderer
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawConstraints].
    public final void drawConstraints(
    	DebugRenderer inRenderer
    ) {
    	drawConstraints(
    		this.segment,
    		inRenderer.memorySegment()
    	);
    }
    
    /// ```
    /// Draw the constraint limits only (debugging purposes)
    /// ```
    public static void drawConstraintLimits(
    	MemorySegment self,
    	MemorySegment inRenderer
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawConstraintLimits].
    public final void drawConstraintLimits(
    	DebugRenderer inRenderer
    ) {
    	drawConstraintLimits(
    		this.segment,
    		inRenderer.memorySegment()
    	);
    }
    
    /// ```
    /// Draw the constraint reference frames only (debugging purposes)
    /// ```
    public static void drawConstraintReferenceFrame(
    	MemorySegment self,
    	MemorySegment inRenderer
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawConstraintReferenceFrame].
    public final void drawConstraintReferenceFrame(
    	DebugRenderer inRenderer
    ) {
    	drawConstraintReferenceFrame(
    		this.segment,
    		inRenderer.memorySegment()
    	);
    }
    
    /// ```
    /// Set gravity value
    /// ```
    public static void setGravity(
    	MemorySegment self,
    	MemorySegment inGravity
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_SET_GRAVITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inGravity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGravity].
    public final void setGravity(
    	Vec3 inGravity
    ) {
    	setGravity(
    		this.segment,
    		inGravity.memorySegment()
    	);
    }
    
    public static void getGravity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_GRAVITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGravity].
    public final void getGravity(
    	Vec3 outResult
    ) {
    	getGravity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns a locking interface that won't actually lock the body. Use with great care!
    /// ```
    public static MemorySegment getBodyLockInterfaceNoLock(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyLockInterfaceNoLock].
    public final @Nullable BodyLockInterfaceNoLock getBodyLockInterfaceNoLock() {
    	MemorySegment segment = getBodyLockInterfaceNoLock(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyLockInterfaceNoLock(segment);
    }
    
    /// ```
    /// Returns a locking interface that locks the body so other threads cannot modify it.
    /// ```
    public static MemorySegment getBodyLockInterface(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyLockInterface].
    public final @Nullable BodyLockInterfaceLocking getBodyLockInterface() {
    	MemorySegment segment = getBodyLockInterface(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyLockInterfaceLocking(segment);
    }
    
    /// ```
    /// Return the BroadPhaseLayerInterface that this class has been initialized with
    /// ```
    public static MemorySegment getBroadPhaseLayerInterface(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_LAYER_INTERFACE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBroadPhaseLayerInterface].
    public final @Nullable BroadPhaseLayerInterface getBroadPhaseLayerInterface() {
    	MemorySegment segment = getBroadPhaseLayerInterface(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BroadPhaseLayerInterface(segment);
    }
    
    /// ```
    /// Broadphase layer filter that decides if two objects can collide, this was passed to the Init function.
    /// ```
    public static MemorySegment getObjectVsBroadPhaseLayerFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_OBJECT_VS_BROAD_PHASE_LAYER_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getObjectVsBroadPhaseLayerFilter].
    public final @Nullable ObjectVsBroadPhaseLayerFilter getObjectVsBroadPhaseLayerFilter() {
    	MemorySegment segment = getObjectVsBroadPhaseLayerFilter(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ObjectVsBroadPhaseLayerFilter(segment);
    }
    
    /// ```
    /// Object layer filter that decides if two objects can collide, this was passed to the Init function.
    /// ```
    public static MemorySegment getObjectLayerPairFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_OBJECT_LAYER_PAIR_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getObjectLayerPairFilter].
    public final @Nullable ObjectLayerPairFilter getObjectLayerPairFilter() {
    	MemorySegment segment = getObjectLayerPairFilter(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ObjectLayerPairFilter(segment);
    }
    
    /// ```
    /// Gets the current amount of bodies that are in the body manager
    /// ```
    public static int getNumBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NUM_BODIES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBodies].
    public final int getNumBodies() {
    	return getNumBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Gets the current amount of active bodies that are in the body manager
    /// ```
    public static int getNumActiveBodies(
    	MemorySegment self,
    	int inType
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumActiveBodies].
    public final int getNumActiveBodies(
    	int inType
    ) {
    	return getNumActiveBodies(
    		this.segment,
    		inType
    	);
    }
    
    /// ```
    /// Get the maximum amount of bodies that this physics system supports
    /// ```
    public static int getMaxBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_MAX_BODIES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxBodies].
    public final int getMaxBodies() {
    	return getMaxBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Get stats about the bodies in the body manager (slow, iterates through all bodies)
    /// ```
    public static void getBodyStats(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_STATS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyStats].
    public final void getBodyStats(
    	BodyStats outResult
    ) {
    	getBodyStats(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get copy of the list of all bodies under protection of a lock.
    /// @param outBodyIDs On return, this will contain the list of BodyIDs
    /// ```
    public static void getBodies(
    	MemorySegment self,
    	MemorySegment outBodyIDs
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outBodyIDs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodies].
    public final void getBodies(
    	BodyIDArray outBodyIDs
    ) {
    	getBodies(
    		this.segment,
    		outBodyIDs.memorySegment()
    	);
    }
    
    /// ```
    /// Get copy of the list of active bodies under protection of a lock.
    /// @param inType The type of bodies to get
    /// @param outBodyIDs On return, this will contain the list of BodyIDs
    /// ```
    public static void getActiveBodies(
    	MemorySegment self,
    	int inType,
    	MemorySegment outBodyIDs
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inType,
    			outBodyIDs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getActiveBodies].
    public final void getActiveBodies(
    	int inType,
    	BodyIDArray outBodyIDs
    ) {
    	getActiveBodies(
    		this.segment,
    		inType,
    		outBodyIDs.memorySegment()
    	);
    }
    
    /// ```
    /// Get the list of active bodies, use GetNumActiveBodies() to find out how long the list is.
    /// Note: Not thread safe. The active bodies list can change at any moment when other threads are doing work. Use GetActiveBodies() if you need a thread safe version.
    /// ```
    public static MemorySegment getActiveBodiesUnsafe(
    	MemorySegment self,
    	int inType
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_ACTIVE_BODIES_UNSAFE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getActiveBodiesUnsafe].
    public final @Nullable BodyID getActiveBodiesUnsafe(
    	int inType
    ) {
    	MemorySegment segment = getActiveBodiesUnsafe(
    		this.segment,
    		inType
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyID(segment);
    }
    
    /// ```
    /// Check if 2 bodies were in contact during the last simulation step. Since contacts are only detected between active bodies, so at least one of the bodies must be active in order for this function to work.
    /// It queries the state at the time of the last PhysicsSystem::Update and will return true if the bodies were in contact, even if one of the bodies was moved / removed afterwards.
    /// This function can be called from any thread when the PhysicsSystem::Update is not running. During PhysicsSystem::Update this function is only valid during contact callbacks:
    /// - During the ContactListener::OnContactAdded callback this function can be used to determine if a different contact pair between the bodies was active in the previous simulation step (function returns true) or if this is the first step that the bodies are touching (function returns false).
    /// - During the ContactListener::OnContactRemoved callback this function can be used to determine if this is the last contact pair between the bodies (function returns false) or if there are other contacts still present (function returns true).
    /// ```
    public static boolean wereBodiesInContact(
    	MemorySegment self,
    	MemorySegment inBody1ID,
    	MemorySegment inBody2ID
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inBody1ID,
    			inBody2ID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#wereBodiesInContact].
    public final boolean wereBodiesInContact(
    	BodyID inBody1ID,
    	BodyID inBody2ID
    ) {
    	return wereBodiesInContact(
    		this.segment,
    		inBody1ID.memorySegment(),
    		inBody2ID.memorySegment()
    	);
    }
    
    /// ```
    /// Get the bounding box of all bodies in the physics system.
    /// Deprecated: Use GetBroadPhaseQuery().GetBounds() instead.
    /// ```
    public static void getBounds(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBounds].
    public final void getBounds(
    	AABox outResult
    ) {
    	getBounds(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}