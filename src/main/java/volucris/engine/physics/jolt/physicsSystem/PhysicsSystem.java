package volucris.engine.physics.jolt.physicsSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.BodyActivationListener;
import volucris.engine.physics.jolt.ContactListener;
import volucris.engine.physics.jolt.DebugRenderer;
import volucris.engine.physics.jolt.DrawSettings;
import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.PhysicsStepListener;
import volucris.engine.physics.jolt.body.BodyEnums.BodyType;
import volucris.engine.physics.jolt.body.BodyInterface;
import volucris.engine.physics.jolt.body.BodyLockInterface;
import volucris.engine.physics.jolt.constraint.Constraint;
import volucris.engine.physics.jolt.filter.BodyDrawFilter;
import volucris.engine.physics.jolt.filter.SimShapeFilter;
import volucris.engine.physics.jolt.jobSystem.JobSystem;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.query.BroadPhaseQuery;
import volucris.engine.physics.jolt.query.NarrowPhaseQuery;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * The main class for the physics system. It contains all rigid bodies and
 * simulates them.
 * <p>
 * The main simulation is performed by the Update() call on multiple threads (if
 * the JobSystem is configured to use them). Please refer to the general
 * architecture overview in the Docs for more information.
 * 
 */
public final class PhysicsSystem {

	private static final MethodHandle JPH_PHYSICS_SYSTEM_CREATE;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_DESTROY;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_UPDATE;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_NUM_BODIES;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_MAX_BODIES;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_NUM_CONSTRAINTS;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_SET_GRAVITY;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_GRAVITY;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_BODIES;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_DRAW_BODIES;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS;
	private static final MethodHandle JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME;

	private final MemorySegment jphPhysicsSystem;

	private final BodyInterface bodyInterface;
	private final BodyInterface bodyInterfaceNoLock;

	private final BodyLockInterface bodyLockInterface;
	private final BodyLockInterface bodyLockInterfaceNoLock;

	private final BroadPhaseQuery broadPhaseQuery;
	private final NarrowPhaseQuery narrowPhaseQuery;
	private final NarrowPhaseQuery narrowPhaseQueryNoLock;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_PHYSICS_SYSTEM_CREATE = downcallHandle("JPH_PhysicsSystem_Create", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_DESTROY = downcallHandleVoid("JPH_PhysicsSystem_Destroy", ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS = downcallHandleVoid("JPH_PhysicsSystem_SetPhysicsSettings", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS = downcallHandleVoid("JPH_PhysicsSystem_GetPhysicsSettings", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE = downcallHandleVoid("JPH_PhysicsSystem_OptimizeBroadPhase", ADDRESS);
		JPH_PHYSICS_SYSTEM_UPDATE = downcallHandle("JPH_PhysicsSystem_Update", JAVA_INT, ADDRESS, JAVA_FLOAT, JAVA_INT, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE = downcallHandle("JPH_PhysicsSystem_GetBodyInterface", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetBodyInterfaceNoLock", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE = downcallHandle("JPH_PhysicsSystem_GetBodyLockInterface", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetBodyLockInterfaceNoLock", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY = downcallHandle("JPH_PhysicsSystem_GetBroadPhaseQuery", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY = downcallHandle("JPH_PhysicsSystem_GetNarrowPhaseQuery", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK = downcallHandle("JPH_PhysicsSystem_GetNarrowPhaseQueryNoLock", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_SetContactListener", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_SetBodyActivationListener", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER = downcallHandleVoid("JPH_PhysicsSystem_SetSimShapeFilter", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT = downcallHandle("JPH_PhysicsSystem_WereBodiesInContact", JAVA_BOOLEAN, ADDRESS, JAVA_INT, JAVA_INT);
		JPH_PHYSICS_SYSTEM_GET_NUM_BODIES = downcallHandle("JPH_PhysicsSystem_GetNumBodies", JAVA_INT, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES = downcallHandle("JPH_PhysicsSystem_GetNumActiveBodies", JAVA_INT, ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_GET_MAX_BODIES = downcallHandle("JPH_PhysicsSystem_GetMaxBodies", JAVA_INT, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_NUM_CONSTRAINTS = downcallHandle("JPH_PhysicsSystem_GetNumConstraints", JAVA_INT, ADDRESS);
		JPH_PHYSICS_SYSTEM_SET_GRAVITY = downcallHandleVoid("JPH_PhysicsSystem_SetGravity", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_GRAVITY = downcallHandleVoid("JPH_PhysicsSystem_GetGravity", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT = downcallHandleVoid("JPH_PhysicsSystem_AddConstraint", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT = downcallHandleVoid("JPH_PhysicsSystem_RemoveConstraint", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_AddConstraints", ADDRESS, ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_RemoveConstraints", ADDRESS, ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_AddStepListener", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER = downcallHandleVoid("JPH_PhysicsSystem_RemoveStepListener", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_GET_BODIES = downcallHandleVoid("JPH_PhysicsSystem_GetBodies", ADDRESS, ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_GetConstraints", ADDRESS, ADDRESS, JAVA_INT);
		JPH_PHYSICS_SYSTEM_DRAW_BODIES = downcallHandleVoid("JPH_PhysicsSystem_DrawBodies", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraints", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraintLimits", ADDRESS, ADDRESS);
		JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME = downcallHandleVoid("JPH_PhysicsSystem_DrawConstraintReferenceFrame", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public PhysicsSystem(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	public PhysicsSystem(MemorySegment segment, Arena arena) {
		jphPhysicsSystem = segment;

		bodyInterface = createBodyInterface(arena);
		bodyInterfaceNoLock = createBodyInterfaceNoLock(arena);
		bodyLockInterface = createBodyLockInterface();
		bodyLockInterfaceNoLock = createBodyLockInterfaceNoLock();
		broadPhaseQuery = createBroadPhaseQuery(arena);
		narrowPhaseQuery = createNarrowPhaseQuery(arena);
		narrowPhaseQueryNoLock = createNarrowPhaseQueryNoLock(arena);

		vecTmp = new Vec3(arena);

		Jolt.addPhysicsSystem(jphPhysicsSystem.address(), this);
	}

	/**
	 * 
	 */
	public PhysicsSystem(PhysicsSystemSettings settings) {
		this(settings, Arena.ofAuto());
	}

	/**
	 * 
	 */
	public PhysicsSystem(PhysicsSystemSettings settings, Arena arena) {
		if (!settings.isBroadPhaseLayerInterfaceSet())
			throw new JoltRuntimeException("BroadPhaseLayerInterface not set");
		if (!settings.isObjectLayerPairFilterSet())
			throw new JoltRuntimeException("ObjectLayerPairFilter not set");
		if (!settings.isObjectVsBroadPhaseLayerFilterSet())
			throw new JoltRuntimeException("ObjectVsBroadPhaseLayerFilter not set");

		try {
			MemorySegment segment = (MemorySegment) JPH_PHYSICS_SYSTEM_CREATE.invokeExact(settings.memorySegment());
			jphPhysicsSystem = segment.reinterpret(arena, s -> destroy(s));
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create PhysicsSystem: " + className);
		}

		bodyInterface = createBodyInterface(arena);
		bodyInterfaceNoLock = createBodyInterfaceNoLock(arena);
		bodyLockInterface = createBodyLockInterface();
		bodyLockInterfaceNoLock = createBodyLockInterfaceNoLock();
		broadPhaseQuery = createBroadPhaseQuery(arena);
		narrowPhaseQuery = createNarrowPhaseQuery(arena);
		narrowPhaseQueryNoLock = createNarrowPhaseQueryNoLock(arena);

		vecTmp = new Vec3(arena);

		Jolt.addPhysicsSystem(jphPhysicsSystem.address(), this);
	}

	private BodyInterface createBodyInterface(Arena arena) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphPhysicsSystem);
			return new BodyInterface(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create BodyInterface: " + className);
		}
	}

	private BodyInterface createBodyInterfaceNoLock(Arena arena) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_INTERFACE_NO_LOCK;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphPhysicsSystem);
			return new BodyInterface(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create BodyInterface(NoLock): " + className);
		}
	}

	private BodyLockInterface createBodyLockInterface() {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphPhysicsSystem);
			return new BodyLockInterface(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create BodyLockInterface: " + className);
		}
	}

	private BodyLockInterface createBodyLockInterfaceNoLock() {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODY_LOCK_INTERFACE_NO_LOCK;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphPhysicsSystem);
			return new BodyLockInterface(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create BodyLockInterface(NoLock): " + className);
		}
	}

	private BroadPhaseQuery createBroadPhaseQuery(Arena arena) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BROAD_PHASE_QUERY;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphPhysicsSystem);
			return new BroadPhaseQuery(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create NarrowPhaseQuery: " + className);
		}
	}

	private NarrowPhaseQuery createNarrowPhaseQuery(Arena arena) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphPhysicsSystem);
			return new NarrowPhaseQuery(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create NarrowPhaseQuery: " + className);
		}
	}

	private NarrowPhaseQuery createNarrowPhaseQueryNoLock(Arena arena) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NARROW_PHASE_QUERY_NO_LOCK;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphPhysicsSystem);
			return new NarrowPhaseQuery(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create NarrowPhaseQuery(NoLock): " + className);
		}
	}

	private static void destroy(MemorySegment segment) {
		try {
			JPH_PHYSICS_SYSTEM_DESTROY.invokeExact(segment);

			Jolt.removePhysicsSystem(segment.address());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy PhysicsSystem: " + className);
		}
	}

	/**
	 * Control the main constants of the physics simulation.
	 */
	public void setPhysicsSettings(PhysicsSettings target) {
		try {
			JPH_PHYSICS_SYSTEM_SET_PHYSICS_SETTINGS.invokeExact(jphPhysicsSystem, target.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get PhysicsSettings: " + className);
		}
	}

	/**
	 * 
	 */
	public PhysicsSettings getPhysicsSettings() {
		return getPhysicsSettings(new PhysicsSettings());
	}

	/**
	 * 
	 */
	public PhysicsSettings getPhysicsSettings(PhysicsSettings target) {
		try {
			JPH_PHYSICS_SYSTEM_GET_PHYSICS_SETTINGS.invokeExact(jphPhysicsSystem, target.memorySegment());
			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get PhysicsSettings: " + className);
		}
	}

	/**
	 * Optimize the broadphase, needed only if you've added many bodies prior to
	 * calling Update() for the first time. Don't call this every frame as
	 * PhysicsSystem::Update spreads out the same work over multiple frames. If you
	 * add many bodies through BodyInterface::AddBodiesPrepare/AddBodiesFinalize and
	 * if the bodies in a batch are in a roughly unoccupied space (e.g. a new level
	 * section) then a call to OptimizeBroadPhase is also not needed as batch adding
	 * creates an efficient bounding volume hierarchy. Don't call this function
	 * while bodies are being modified from another thread or use the locking
	 * BodyInterface to modify bodies.
	 */
	public void optimizeBroadPhase() {
		try {
			JPH_PHYSICS_SYSTEM_OPTIMIZE_BROAD_PHASE.invokeExact(jphPhysicsSystem);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot optimize broad phase: " + className);
		}
	}

	/**
	 * Simulate the system. The world steps for a total of deltaTime seconds. This
	 * is divided in collisionSteps iterations. Each iteration consists of collision
	 * detection followed by an integration step. This function internally spawns
	 * jobs using jobSystem and waits for them to complete, so no jobs will be
	 * running when this function returns. The temp allocator (<b>Implementation:
	 * The C wrapper takes care of this allocator</b>) is used, for example, to
	 * store the list of bodies that are in contact, how they form islands together
	 * and data to solve the contacts between bodies. At the end of the Update call,
	 * all allocated memory will have been freed.
	 */
	public PhysicsUpdateError update(float deltaTime, int collisionSteps, JobSystem jobSystem) {
		try {
			MemorySegment jobSystemAddr = jobSystem.memorySegment();

			MethodHandle method = JPH_PHYSICS_SYSTEM_UPDATE;
			int error = (int) method.invokeExact(jphPhysicsSystem, deltaTime, collisionSteps, jobSystemAddr);

			if (error == PhysicsUpdateError.NONE.id())
				return PhysicsUpdateError.NONE;
			else if (error == PhysicsUpdateError.MANIFOLD_CACHE_FULL.id())
				return PhysicsUpdateError.MANIFOLD_CACHE_FULL;
			else if (error == PhysicsUpdateError.BODY_PAIR_CACHE_FULL.id())
				return PhysicsUpdateError.BODY_PAIR_CACHE_FULL;
			else
				return PhysicsUpdateError.CONTACT_CONSTRAINTS_FULL;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot update physics: " + className);
		}
	}

	/**
	 * Access to the body interface. This interface allows to to create / remove
	 * bodies and to change their properties.
	 */
	public BodyInterface getBodyInterface() {
		return bodyInterface;
	}

	/**
	 * Access to the body interface. This interface allows to to create / remove
	 * bodies and to change their properties. Version that does not lock the bodies,
	 * use with great care!
	 */
	public BodyInterface getBodyInterfaceNoLock() {
		return bodyInterfaceNoLock;
	}

	/**
	 * Returns a locking interface that locks the body so other threads cannot
	 * modify it.
	 */
	public BodyLockInterface getBodyLockInterface() {
		return bodyLockInterface;
	}

	/**
	 * Returns a locking interface that won't actually lock the body. Use with great
	 * care!
	 */
	public BodyLockInterface getBodyLockInterfaceNoLock() {
		return bodyLockInterfaceNoLock;
	}

	/**
	 * Access to the broadphase interface that allows coarse collision queries.
	 */
	public BroadPhaseQuery getBroadPhaseQuery() {
		return broadPhaseQuery;
	}

	/**
	 * Interface that allows fine collision queries against first the broad phase
	 * and then the narrow phase.
	 */
	public NarrowPhaseQuery getNarrowPhaseQuery() {
		return narrowPhaseQuery;
	}

	/**
	 * Interface that allows fine collision queries against first the broad phase
	 * and then the narrow phase. Version that does not lock the bodies, use with
	 * great care!
	 */
	public NarrowPhaseQuery getNarrowPhaseQueryNoLock() {
		return narrowPhaseQueryNoLock;
	}

	/**
	 * Listener that is notified whenever a contact point between two bodies is
	 * added/updated/removed. You can't change contact listener during
	 * {@link #update(float, int, JobSystem) update} but it can be changed at any
	 * other time.
	 */
	public void setContactListener(ContactListener contactListener) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_SET_CONTACT_LISTENER;
			method.invokeExact(jphPhysicsSystem, contactListener.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set contact listener: " + className);
		}
	}

	/**
	 * Listener that is notified whenever a body is activated/deactivated.
	 */
	public void setBodyActivationListener(BodyActivationListener activationListener) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_SET_BODY_ACTIVATION_LISTENER;
			method.invokeExact(jphPhysicsSystem, activationListener.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set body activation listener: " + className);
		}
	}

	/**
	 * Setthe shape filter that will be used during simulation. This can be used to
	 * exclude shapes within a body from colliding with each other. E.g. if you have
	 * a high detail and a low detail collision model, you can attach them to the
	 * same body in a StaticCompoundShape and use the ShapeFilter to exclude the
	 * high detail collision model when simulating and exclude the low detail
	 * collision model when casting rays. Note that in this case you would need to
	 * pass the inverse of inShapeFilter to the CastRay function. Pass a nullptr to
	 * disable the shape filter. The PhysicsSystem does not own the ShapeFilter,
	 * make sure it stays alive during the lifetime of the PhysicsSystem.
	 */
	public void setSimShapeFilter(SimShapeFilter filter) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_SET_SIM_SHAPE_FILTER;

			if (filter != null)
				method.invokeExact(jphPhysicsSystem, filter.memorySegment());
			else
				method.invokeExact(jphPhysicsSystem, MemorySegment.NULL);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set sim shape filter: " + className);
		}
	}

	/**
	 * Check if 2 bodies were in contact during the last simulation step. Since
	 * contacts are only detected between active bodies, so at least one of the
	 * bodies must be active in order for this function to work. It queries the
	 * state at the time of the last PhysicsSystem::Update and will return true if
	 * the bodies were in contact, even if one of the bodies was moved / removed
	 * afterwards. This function can be called from any thread when the
	 * PhysicsSystem::Update is not running. During PhysicsSystem::Update this
	 * function is only valid during contact callbacks:
	 * <ul>
	 * <li>During the ContactListener::OnContactAdded callback this function can be
	 * used to determine if a different contact pair between the bodies was active
	 * in the previous simulation step (function returns true) or if this is the
	 * first step that the bodies are touching (function returns false).
	 * <li>During the ContactListener::OnContactRemoved callback this function can
	 * be used to determine if this is the last contact pair between the bodies
	 * (function returns false) or if there are other contacts still present
	 * (function returns true).
	 * </ul>
	 * 
	 */
	public boolean wereBodiesInContact(int body1, int body2) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_WERE_BODIES_IN_CONTACT;
			return (boolean) method.invokeExact(jphPhysicsSystem, body1, body2);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot check if bodies were in contact: " + className);
		}
	}

	/**
	 * Gets the current amount of bodies that are in the body manager.
	 */
	public int getNumBodies() {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NUM_BODIES;
			return (int) method.invokeExact(jphPhysicsSystem);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get number of bodies: " + className);
		}
	}

	/**
	 * Gets the current amount of active bodies that are in the body manager.
	 */
	public int getNumActiveBodies(BodyType bodyType) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NUM_ACTIVE_BODIES;
			return (int) method.invokeExact(jphPhysicsSystem, bodyType.id());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get number of active bodies: " + className);
		}
	}

	/**
	 * Get the maximum amount of bodies that this physics system supports.
	 */
	public int getMaxBodies() {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_MAX_BODIES;
			return (int) method.invokeExact(jphPhysicsSystem);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max bodies: " + className);
		}
	}

	/**
	 * 
	 */
	public int getNumConstraints() {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_NUM_CONSTRAINTS;
			return (int) method.invokeExact(jphPhysicsSystem);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get number of constraints: " + className);
		}
	}

	/**
	 * Set gravity value.
	 */
	public void setGravity(Vector3f gravity) {
		setGravity(gravity.x, gravity.y, gravity.z);
	}

	/**
	 * Set gravity value.
	 */
	public void setGravity(float x, float y, float z) {
		try {
			vecTmp.set(x, y, z);
			JPH_PHYSICS_SYSTEM_SET_GRAVITY.invokeExact(jphPhysicsSystem, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set gravity: " + className);
		}
	}

	/**
	 * 
	 */
	public Vector3f getGravity(Vector3f target) {
		try {
			JPH_PHYSICS_SYSTEM_GET_GRAVITY.invokeExact(jphPhysicsSystem, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get gravity: " + className);
		}
	}

	/**
	 * 
	 */
	public Vector3f getGravity() {
		return getGravity(new Vector3f());
	}

	/**
	 * Add constraint to the world.
	 */
	public void addConstraint(Constraint constraint) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_CONSTRAINT;
			method.invokeExact(jphPhysicsSystem, constraint.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add constraint: " + className);
		}
	}

	/**
	 * Remove constraint from the world.
	 */
	public void removeConstraint(Constraint constraint) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINT;
			method.invokeExact(jphPhysicsSystem, constraint.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove constraint: " + className);
		}
	}

	/**
	 * Batch add constraints.
	 */
	public void addConstraints(Constraint... constraints) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(constraints.length, ADDRESS));

			for (int i = 0; i < constraints.length; i++) {
				Constraint constraint = constraints[i];
				array.setAtIndex(ADDRESS, i, constraint.memorySegment());
			}

			MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_CONSTRAINTS;
			method.invokeExact(jphPhysicsSystem, array, constraints.length);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add constraints: " + className);
		}
	}

	/**
	 * Batch remove constraints.
	 */
	public void removeConstraints(Constraint... constraints) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(constraints.length, ADDRESS));

			for (int i = 0; i < constraints.length; i++) {
				Constraint constraint = constraints[i];
				array.setAtIndex(ADDRESS, i, constraint.memorySegment());
			}

			MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_CONSTRAINTS;
			method.invokeExact(jphPhysicsSystem, array, constraints.length);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove constraints: " + className);
		}
	}

	/**
	 * Adds a new step listener.
	 */
	public void addStepListener(PhysicsStepListener stepListener) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER;
			method.invokeExact(jphPhysicsSystem, stepListener.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add step listener: " + className);
		}
	}

	/**
	 * Adds a new step listener.
	 */
	public void addStepListener(MemorySegment segment) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_ADD_STEP_LISTENER;
			method.invokeExact(jphPhysicsSystem, segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add step listener: " + className);
		}
	}

	/**
	 * Removes a step listener.
	 */
	public void removeStepListener(PhysicsStepListener stepListener) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER;
			method.invokeExact(jphPhysicsSystem, stepListener.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove step listener: " + className);
		}
	}

	/**
	 * Removes a step listener.
	 */
	public void removeStepListener(MemorySegment segment) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_REMOVE_STEP_LISTENER;
			method.invokeExact(jphPhysicsSystem, segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove step listener: " + className);
		}
	}

	/**
	 * Get copy of the list of all bodies under protection of a lock.
	 */
	public int[] getBodies(int[] target) {
		try (Arena arena = Arena.ofConfined()) {
			int count = target.length > getNumBodies() ? getNumBodies() : target.length;

			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(count, JAVA_INT));

			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_BODIES;
			method.invokeExact(jphPhysicsSystem, array, count);

			MemorySegment.copy(array, JAVA_INT, 0, target, 0, count);

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get bodies: " + className);
		}
	}

	/**
	 * Get a list of all constraints.
	 */
	public Constraint[] getConstraints(Constraint[] target) {
		try (Arena arena = Arena.ofConfined()) {
			int count = target.length > getNumConstraints() ? getNumConstraints() : target.length;

			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(count, ADDRESS));

			MethodHandle method = JPH_PHYSICS_SYSTEM_GET_CONSTRAINTS;
			method.invokeExact(jphPhysicsSystem, array, count);

			for (int i = 0; i < count; i++) {
				MemorySegment segment = array.getAtIndex(ADDRESS, i);

				Constraint constraint = Jolt.getConstraint(segment.address());
				if (constraint == null)
					constraint = new Constraint(segment, false);

				target[i] = constraint;
			}

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get constraints: " + className);
		}
	}

	/**
	 * Draw the state of the bodies (debugging purposes)
	 */
	public void drawBodies(DrawSettings settings, DebugRenderer renderer) {
		drawBodies(settings, renderer, null);
	}

	/**
	 * Draw the state of the bodies (debugging purposes)
	 */
	public void drawBodies(DrawSettings settings, DebugRenderer renderer, BodyDrawFilter filter) {
		try {
			MemorySegment settAddr = settings.memorySegment();
			MemorySegment rendererAddr = renderer.memorySegment();
			MemorySegment filterAddr = filter == null ? MemorySegment.NULL : filter.memorySegment();

			MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_BODIES;
			method.invokeExact(jphPhysicsSystem, settAddr, rendererAddr, filterAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot draw bodies: " + className);
		}
	}

	/**
	 * Draw the constraints only (debugging purposes)
	 */
	public void drawConstraints(DebugRenderer renderer) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINTS;
			method.invokeExact(jphPhysicsSystem, renderer.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot draw constraints: " + className);
		}
	}

	/**
	 * Draw the constraint limits only (debugging purposes)
	 */
	public void drawConstraintLimits(DebugRenderer renderer) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_LIMITS;
			method.invokeExact(jphPhysicsSystem, renderer.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot draw constraint limits: " + className);
		}
	}

	/**
	 * Draw the constraint reference frames only (debugging purposes)
	 */
	public void drawConstraintReferenceFrame(DebugRenderer renderer) {
		try {
			MethodHandle method = JPH_PHYSICS_SYSTEM_DRAW_CONSTRAINT_REFERENCE_FRAME;
			method.invokeExact(jphPhysicsSystem, renderer.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot draw constraint reference frame: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphPhysicsSystem;
	}

}