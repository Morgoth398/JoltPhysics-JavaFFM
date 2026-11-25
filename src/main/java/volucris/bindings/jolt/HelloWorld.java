package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.body.BodyActivationListener;
import volucris.bindings.jolt.body.BodyActivationListenerFunctions;
import volucris.bindings.jolt.body.BodyCreationSettings;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.body.BodyInterface;
import volucris.bindings.jolt.body.OnBodyActivatedFunction;
import volucris.bindings.jolt.body.OnBodyDeactivatedFunction;
import volucris.bindings.jolt.collision.CollideShapeResult;
import volucris.bindings.jolt.collision.ContactListener;
import volucris.bindings.jolt.collision.ContactListenerFunctions;
import volucris.bindings.jolt.collision.ContactManifold;
import volucris.bindings.jolt.collision.ContactSettings;
import volucris.bindings.jolt.collision.ObjectLayerPairFilter;
import volucris.bindings.jolt.collision.ObjectLayerPairFilterFunctions;
import volucris.bindings.jolt.collision.ObjectLayerPairFilterShouldCollideFunction;
import volucris.bindings.jolt.collision.ObjectVsBroadPhaseLayerFilter;
import volucris.bindings.jolt.collision.ObjectVsBroadPhaseLayerFilterFunctions;
import volucris.bindings.jolt.collision.ObjectVsBroadPhaseLayerFilterShouldCollideFunction;
import volucris.bindings.jolt.collision.OnContactAddedFunction;
import volucris.bindings.jolt.collision.OnContactPersistedFunction;
import volucris.bindings.jolt.collision.OnContactRemovedFunction;
import volucris.bindings.jolt.collision.OnContactValidateFunction;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayer;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerInterface;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerInterfaceFunctions;
import volucris.bindings.jolt.collision.broadPhase.GetBroadPhaseLayerFunction;
import volucris.bindings.jolt.collision.broadPhase.GetNumBroadPhaseLayersFunction;
import volucris.bindings.jolt.collision.shape.BoxShapeSettings;
import volucris.bindings.jolt.collision.shape.ShapeRef;
import volucris.bindings.jolt.collision.shape.ShapeResult;
import volucris.bindings.jolt.collision.shape.SphereShape;
import volucris.bindings.jolt.collision.shape.SubShapeIDPair;
import volucris.bindings.jolt.enums.Activation;
import volucris.bindings.jolt.enums.MotionType;
import volucris.bindings.jolt.enums.ValidateResult;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physics.PhysicsSystem;

public class HelloWorld {

	private static class TraceImpl extends TraceFunction {

		public TraceImpl(Arena arena) {
			super(arena);
		}

		@Override
		public void invoke(String message) {
			System.out.println(message);
		}
	}

	private static class AssertFailedImpl extends AssertFailureFunction {

		public AssertFailedImpl(Arena arena) {
			super(arena);
		}

		@Override
		public boolean invoke(String expression, String message, String file, int line) {
			System.err.println("%s : %s : (%s) %s".formatted(file, line, expression, message));
			return true;
		}

	}

	// Layer that objects can be in, determines which other objects it can collide
	// with
	// Typically you at least want to have 1 layer for moving bodies and 1 layer for
	// static bodies, but you can have more
	// layers if you want. E.g. you could have a layer for high detail collision
	// (which is not used by the physics simulation
	// but only if you do collision testing).
	private static class Layers {
		public static final int NON_MOVING = 0;
		public static final int MOVING = 1;
		public static final int NUM_LAYERS = 2;
	}

	/// Class that determines if two object layers can collide
	private static class ObjectLayerPairFilterImpl extends ObjectLayerPairFilter {

		public ObjectLayerPairFilterImpl(Arena arena) {
			super(
					arena,
					new ObjectLayerPairFilterFunctions(arena)
							.shouldCollide(new ShouldCollideImpl(arena))
			);
		}

		private static class ShouldCollideImpl extends ObjectLayerPairFilterShouldCollideFunction {

			public ShouldCollideImpl(Arena arena) {
				super(arena);
			}

			@Override
			public boolean invoke(short inLayer1, short inLayer2) {
				switch (inLayer1) {
					case Layers.NON_MOVING -> {
						return inLayer2 == Layers.MOVING; // Non moving only collides with moving
					}
					case Layers.MOVING -> {
						return true; // Moving collides with everything
					}
					default -> {
						assert (false);
						return false;
					}
				}
			}
		}

	}

	// Each broadphase layer results in a separate bounding volume tree in the broad
	// phase. You at least want to have
	// a layer for non-moving and moving objects to avoid having to update a tree
	// full of static objects every frame.
	// You can have a 1-on-1 mapping between object layers and broadphase layers
	// (like in this case) but if you have
	// many object layers you'll be creating many broad phase trees, which is not
	// efficient. If you want to fine tune
	// your broadphase layers define JPH_TRACK_BROADPHASE_STATS and look at the
	// stats reported on the TTY.
	private static class BroadPhaseLayers {
		public static final byte NON_MOVING = 0;
		public static final byte MOVING = 1;
		public static final int NUM_LAYERS = 2;
	}

	// BroadPhaseLayerInterface implementation
	// This defines a mapping between object and broadphase layers.
	private static class BPLayerInterfaceImpl extends BroadPhaseLayerInterface {

		public BPLayerInterfaceImpl(Arena arena) {
			super(
					arena,
					new BroadPhaseLayerInterfaceFunctions(arena)
							.getNumBroadPhaseLayers(new GetNumBroadPhaseLayers(arena))
							.getBroadPhaseLayer(new GetBroadPhaseLayer(arena))
			);
		}

		private static class GetNumBroadPhaseLayers extends GetNumBroadPhaseLayersFunction {

			public GetNumBroadPhaseLayers(Arena arena) {
				super(arena);
			}

			@Override
			public int invoke() {
				return BroadPhaseLayers.NUM_LAYERS;
			}

		}

		private static class GetBroadPhaseLayer extends GetBroadPhaseLayerFunction {

			private final BroadPhaseLayer[] objectToBroadPhase;

			public GetBroadPhaseLayer(Arena arena) {
				super(arena);

				objectToBroadPhase = new BroadPhaseLayer[Layers.NUM_LAYERS];
				objectToBroadPhase[Layers.NON_MOVING] = new BroadPhaseLayer(arena, BroadPhaseLayers.NON_MOVING);
				objectToBroadPhase[Layers.MOVING] = new BroadPhaseLayer(arena, BroadPhaseLayers.MOVING);
			}

			@Override
			public BroadPhaseLayer invoke(short inLayer) {
				return objectToBroadPhase[inLayer];
			}

		}

	}

	/// Class that determines if an object layer can collide with a broadphase layer
	private static class ObjectVsBroadPhaseLayerFilterImpl extends ObjectVsBroadPhaseLayerFilter {

		public ObjectVsBroadPhaseLayerFilterImpl(Arena arena) {
			super(
					arena,
					new ObjectVsBroadPhaseLayerFilterFunctions(arena)
							.shouldCollide(new ShouldCollideImpl(arena))
			);
		}

		private static class ShouldCollideImpl extends ObjectVsBroadPhaseLayerFilterShouldCollideFunction {

			private ShouldCollideImpl(Arena arena) {
				super(arena);
			}

			@Override
			public boolean invoke(short inLayer1, BroadPhaseLayer inLayer2) {
				switch (inLayer1) {
					case Layers.NON_MOVING -> {
						return inLayer2.getValue() == BroadPhaseLayers.NON_MOVING;
					}
					case Layers.MOVING -> {
						return true;
					}
					default -> {
						assert (false);
						return false;
					}
				}
			}

		}

	}

	private static class MyContactListener extends ContactListener {

		public MyContactListener(Arena arena) {
			super(
					arena,
					new ContactListenerFunctions(arena)
							.onContactValidate(new OnContactValidate(arena))
							.onContactAdded(new OnContactAdded(arena))
							.onContactPersisted(new OnContactPersisted(arena))
							.onContactRemoved(new OnContactRemoved(arena))
			);
		}

		private static class OnContactValidate extends OnContactValidateFunction {

			private OnContactValidate(Arena arena) {
				super(arena);
			}

			@Override
			public int invoke(Body inBody1, Body inBody2, Vec3 inBaseOffset, CollideShapeResult inCollisionResult) {
				System.out.println("Contact validate callback.");
				return ValidateResult.ACCEPT_ALL_CONTACTS_FOR_THIS_BODY_PAIR;
			}

		}

		private static class OnContactAdded extends OnContactAddedFunction {

			public OnContactAdded(Arena arena) {
				super(arena);
			}

			@Override
			public void invoke(Body inBody1, Body inBody2, ContactManifold inManifold, ContactSettings ioSettings) {
				System.out.println("A contact was added.");
			}

		}

		private static class OnContactPersisted extends OnContactPersistedFunction {

			public OnContactPersisted(Arena arena) {
				super(arena);
			}

			@Override
			public void invoke(Body inBody1, Body inBody2, ContactManifold inManifold, ContactSettings ioSettings) {
				System.out.println("A contact was persisted.");
			}

		}

		private static class OnContactRemoved extends OnContactRemovedFunction {

			public OnContactRemoved(Arena arena) {
				super(arena);
			}

			@Override
			public void invoke(SubShapeIDPair inSubShapePair) {
				System.out.println("A contact was removed.");
			}

		}

	}

	private static class MyBodyActivationListener extends BodyActivationListener {

		public MyBodyActivationListener(Arena arena) {
			super(
					arena,
					new BodyActivationListenerFunctions(arena)
							.onBodyActivated(new OnBodyActivated(arena))
							.onBodyDeactivated(new OnBodyDeactivated(arena))
			);
		}

		private static class OnBodyActivated extends OnBodyActivatedFunction {

			public OnBodyActivated(Arena arena) {
				super(arena);
			}

			@Override
			public void invoke(BodyID inBodyID, long inBodyUserData) {
				System.out.println("A body got activated.");
			}

		}

		private static class OnBodyDeactivated extends OnBodyDeactivatedFunction {

			public OnBodyDeactivated(Arena arena) {
				super(arena);
			}

			@Override
			public void invoke(BodyID inBodyID, long inBodyUserData) {
				System.out.println("A body went to sleep.");
			}

		}

	}

	public static void main(String[] args) {
		
		JoltLoader.loadReleaseNativeLibrary();

		try (Arena arena = Arena.ofConfined()) {

			// Register allocation hook. In this example we'll just let Jolt use malloc /
			// free but you can override these if you want (see Memory.h).
			// This needs to be done before any other Jolt function is called.
			Jolt.registerDefaultAllocator();

			// Install trace and assert callbacks
			Jolt.setTraceFunction(new TraceImpl(arena));
			Jolt.setAssertFailureFunction(new AssertFailedImpl(arena));

			// Create a factory, this class is responsible for creating instances of classes
			// based on their name or hash and is mainly used for deserialization of saved
			// data.
			// It is not directly used in this example but still required.
			Factory.setInstance(new Factory(Arena.global()));

			// Register all physics types with the factory and install their collision
			// handlers with the CollisionDispatch class.
			// If you have your own custom shape types you probably need to register their
			// handlers with the CollisionDispatch before calling this function.
			// If you implement your own default material (PhysicsMaterial::sDefault) make
			// sure to initialize it before this function or else this function will create
			// one for you.
			Jolt.registerTypes();

			// We need a temp allocator for temporary allocations during the physics update.
			// We're
			// pre-allocating 10 MB to avoid having to do allocations during the physics
			// update.
			// B.t.w. 10 MB is way too much for this example but it is a typical value you
			// can use.
			// If you don't want to pre-allocate you can also use TempAllocatorMalloc to
			// fall back to
			// malloc / free.
			TempAllocatorImpl tempAllocator = new TempAllocatorImpl(arena, 10 * 1024 * 1024);

			// We need a job system that will execute physics jobs on multiple threads.
			// Typically
			// you would implement the JobSystem interface yourself and let Jolt Physics run
			// on top
			// of your own job scheduler. JobSystemThreadPool is an example implementation.
			JobSystemThreadPool jobSystem = new JobSystemThreadPool(
					arena,
					Jolt.getMaxPhysicsJobs(),
					Jolt.getMaxPhysicsBarriers(),
					Runtime.getRuntime().availableProcessors() - 1
			);

			// This is the max amount of rigid bodies that you can add to the physics
			// system. If you try to add more you'll get an error.
			// Note: This value is low because this is a simple test. For a real project use
			// something in the order of 65536.
			int cMaxBodies = 1024;

			// This determines how many mutexes to allocate to protect rigid bodies from
			// concurrent access. Set it to 0 for the default settings.
			int cNumBodyMutexes = 0;

			// This is the max amount of body pairs that can be queued at any time (the
			// broad phase will detect overlapping
			// body pairs based on their bounding boxes and will insert them into a queue
			// for the narrowphase). If you make this buffer
			// too small the queue will fill up and the broad phase jobs will start to do
			// narrow phase work. This is slightly less efficient.
			// Note: This value is low because this is a simple test. For a real project use
			// something in the order of 65536.
			int cMaxBodyPairs = 1024;

			// This is the maximum size of the contact constraint buffer. If more contacts
			// (collisions between bodies) are detected than this
			// number then these contacts will be ignored and bodies will start
			// interpenetrating / fall through the world.
			// Note: This value is low because this is a simple test. For a real project use
			// something in the order of 10240.
			int cMaxContactConstraints = 1024;

			// Create mapping table from object layer to broadphase layer
			// Note: As this is an interface, PhysicsSystem will take a reference to this so
			// this instance needs to stay alive!
			// Also have a look at BroadPhaseLayerInterfaceTable or
			// BroadPhaseLayerInterfaceMask for a simpler interface.
			BPLayerInterfaceImpl broadPhaseLayerInterface = new BPLayerInterfaceImpl(arena);

			// Create class that filters object vs broadphase layers
			// Note: As this is an interface, PhysicsSystem will take a reference to this so
			// this instance needs to stay alive!
			// Also have a look at ObjectVsBroadPhaseLayerFilterTable or
			// ObjectVsBroadPhaseLayerFilterMask for a simpler interface.
			ObjectVsBroadPhaseLayerFilterImpl objectVsBroadPhaseLayerFilter = new ObjectVsBroadPhaseLayerFilterImpl(
					arena
			);

			// Create class that filters object vs object layers
			// Note: As this is an interface, PhysicsSystem will take a reference to this so
			// this instance needs to stay alive!
			// Also have a look at ObjectLayerPairFilterTable or ObjectLayerPairFilterMask
			// for a simpler interface.
			ObjectLayerPairFilterImpl objectVsObjectLayerFilter = new ObjectLayerPairFilterImpl(arena);

			// Now we can create the actual physics system.
			PhysicsSystem physicsSystem = new PhysicsSystem(arena);
			physicsSystem.init(
					cMaxBodies,
					cNumBodyMutexes,
					cMaxBodyPairs,
					cMaxContactConstraints,
					broadPhaseLayerInterface,
					objectVsBroadPhaseLayerFilter,
					objectVsObjectLayerFilter
			);

			// A body activation listener gets notified when bodies activate and go to sleep
			// Note that this is called from a job so whatever you do here needs to be
			// thread safe.
			// Registering one is entirely optional.
			physicsSystem.setBodyActivationListener(new MyBodyActivationListener(arena));

			// A contact listener gets notified when bodies (are about to) collide, and when
			// they separate again.
			// Note that this is called from a job so whatever you do here needs to be
			// thread safe.
			// Registering one is entirely optional.
			physicsSystem.setContactListener(new MyContactListener(arena));

			// The main way to interact with the bodies in the physics system is through the
			// body interface. There is a locking and a non-locking
			// variant of this. We're going to use the locking version (even though we're
			// not planning to access bodies from multiple threads)
			BodyInterface bodyInterface = physicsSystem.getBodyInterface();

			// Next we can create a rigid body to serve as the floor, we make a large box
			// Create the settings for the collision volume (the shape).
			// Note that for simple shapes (like boxes) you can also directly construct a
			// BoxShape.
			BoxShapeSettings floorShapeSettings = new BoxShapeSettings(
					arena,
					new Vec3(arena, 100.0f, 1.0f, 100.0f),
					Jolt.getDefaultConvexRadius(),
					new PhysicsMaterial(MemorySegment.NULL)
			);
			floorShapeSettings.setEmbedded(); // A ref counted object on the stack (base class RefTarget) should be
												// marked as such to prevent it from being freed when its reference
												// count goes to 0.

			// Create the shape
			ShapeResult floorShapeResult = new ShapeResult(arena);
			floorShapeSettings.create(floorShapeResult);

			ShapeRef floorShape = floorShapeResult.get(); // We don't expect an error here, but you can check
															// floor_shape_result for HasError() / GetError()

			Quat identityRotation = new Quat(arena);
			Quat.sIdentity(identityRotation);

			// Create the settings for the body itself. Note that here you can also set
			// other properties like the restitution / friction.
			BodyCreationSettings floorSettings = new BodyCreationSettings(
					floorShape.getPtr(),
					new Vec3(arena, 0.0f, -1.0f, 0.0f),
					identityRotation,
					MotionType.STATIC,
					(byte) Layers.NON_MOVING
			);

			// Create the actual rigid body
			Body floor = bodyInterface.createBody(floorSettings); // Note that if we run out of bodies this can return
																	// null

			// Add it to the world
			bodyInterface.addBody(floor.getID(), Activation.DONT_ACTIVATE);

			// Now create a dynamic body to bounce on the floor
			// Note that this uses the shorthand version of creating and adding a body to
			// the world
			BodyCreationSettings sphereSettings = new BodyCreationSettings(
					arena,
					// Use the global arena and not the confined arena.
					// The shape is reference counted by jolt and will be deleted once the
					// reference count reaches 0. If the memory belongs to an arena, it is then
					// freed twice (by Jolt and when the arena closes), which crashes.
					// You can use the confined arena when disabling reference counting with a
					// call to `setEmbedded()` as done for the floorShapeSettings above.
					new SphereShape(Arena.global(), 0.5f, new PhysicsMaterial(MemorySegment.NULL)),
					new Vec3(arena, 0.0f, 2.0f, 0.0f),
					identityRotation,
					MotionType.DYNAMIC,
					(byte) Layers.MOVING
			);

			BodyID sphereId = new BodyID(arena);
			bodyInterface.createAndAddBody(sphereSettings, Activation.ACTIVATE, sphereId);

			// Now you can interact with the dynamic body, in this case we're going to give
			// it a velocity.
			// (note that if we had used CreateBody then we could have set the velocity
			// straight on the body before adding it to the physics system)
			bodyInterface.setLinearVelocity(sphereId, new Vec3(arena, 0f, -5f, 0f));

			// We simulate the physics world in discrete time steps. 60 Hz is a good rate to
			// update the physics system.
			final float deltaTime = 1.0f / 60.0f;

			// Optional step: Before starting the physics simulation you can optimize the
			// broad phase. This improves collision detection performance (it's pointless
			// here because we only have 2 bodies).
			// You should definitely not call this every frame or when e.g. streaming in a
			// new level section as it is an expensive operation.
			// Instead insert all new objects in batches instead of 1 at a time to keep the
			// broad phase efficient.
			physicsSystem.optimizeBroadPhase();

			int step = 0;

			Vec3 position = new Vec3(arena);
			Vec3 velocity = new Vec3(arena);
			while (bodyInterface.isActive(sphereId)) {
				++step;

				bodyInterface.getCenterOfMassPosition(sphereId, position);
				bodyInterface.getLinearVelocity(sphereId, velocity);

				System.out.println(
						"Step %s: Position = (%s, %s, %s), Velocity = (%s, %s, %s)"
								.formatted(
										step,
										position.getX(), position.getY(), position.getZ(),
										velocity.getX(), velocity.getY(), velocity.getZ()
								)
				);

				// If you take larger steps than 1 / 60th of a second you need to do multiple
				// collision steps in order to keep the simulation stable. Do 1 collision step
				// per 1 / 60th of a second (round up).
				int collisionSteps = 1;

				// Step the world
				physicsSystem.update(deltaTime, collisionSteps, tempAllocator, jobSystem);
			}

			// Remove the sphere from the physics system. Note that the sphere itself keeps
			// all of its state and can be re-added at any time.
			bodyInterface.removeBody(sphereId);

			// Destroy the sphere. After this the sphere ID is no longer valid.
			bodyInterface.destroyBody(sphereId);

			// Remove and destroy the floor
			bodyInterface.removeBody(floor.getID());
			bodyInterface.destroyBody(floor.getID());

			// Unregisters all types with the factory and cleans up the default material
			Jolt.unregisterTypes();

			// Destroy the factory.
			Factory.destroy(Factory.ngetInstance());
			Factory.setInstance(MemorySegment.NULL);
		}
	}

}
