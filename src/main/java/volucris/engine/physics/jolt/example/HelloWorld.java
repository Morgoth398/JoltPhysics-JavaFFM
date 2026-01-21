package volucris.engine.physics.jolt.example;

import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.BodyActivationListener;
import volucris.engine.physics.jolt.ContactListener;
import volucris.engine.physics.jolt.ContactManifold;
import volucris.engine.physics.jolt.ContactSettings;
import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.JoltEnums.Activation;
import volucris.engine.physics.jolt.JoltEnums.ValidateResult;
import volucris.engine.physics.jolt.SubShapeIDPair;
import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.body.BodyCreationSettings;
import volucris.engine.physics.jolt.body.BodyEnums.MotionType;
import volucris.engine.physics.jolt.body.BodyInterface;
import volucris.engine.physics.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterfaceTable;
import volucris.engine.physics.jolt.jobSystem.JobSystemThreadPool;
import volucris.engine.physics.jolt.jobSystem.JobSystemThreadPoolConfig;
import volucris.engine.physics.jolt.objectLayerPairFilter.ObjectLayerPairFilterTable;
import volucris.engine.physics.jolt.objectVsBroadPhaseLayerFilter.ObjectVsBroadPhaseLayerFilter;
import volucris.engine.physics.jolt.objectVsBroadPhaseLayerFilter.ObjectVsBroadPhaseLayerFilterTable;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystemSettings;
import volucris.engine.physics.jolt.raycast.CollideShapeResult;
import volucris.engine.physics.jolt.shape.BoxShape;
import volucris.engine.physics.jolt.shape.BoxShapeSettings;
import volucris.engine.physics.jolt.shape.SphereShape;
import volucris.engine.physics.jolt.utils.NativeLibraryLoader;

//@formatter:off
public class HelloWorld {

	private static class MyContactListener extends ContactListener {
		@Override
		public ValidateResult onContactValidate(Body body1, Body body2, Vector3f baseOffset,	CollideShapeResult result) {

			System.out.println("Contact validate callback");

			return ValidateResult.ACCEPT_ALL_CONTACTS_FOR_THIS_BODY_PAIR;
		}

		@Override
		public void onContactAdded(Body body1, Body body2, ContactManifold manifold, ContactSettings settings) {
			System.out.println("A contact was added");
		}

		@Override
		public void onContactPersisted(Body body1, Body body2, ContactManifold manifold, ContactSettings settings) {
			System.out.println("A contact was persisted");
		}

		@Override
		public void onContactRemoved(SubShapeIDPair subShapePair) {
			System.out.println("A contact was removed");
		}

	}

	private static class MyBodyActivationListener extends BodyActivationListener {

		@Override
		protected void onBodyActivated(int bodyId, long bodyUserData) {
			System.out.println("A body got activated");
		}

		@Override
		protected void onBodyDeactivated(int bodyId, long bodyUserData) {
			System.out.println("A body went to sleep");
		}

	}
	
	private static class BroadPhaseLayers {
		public static final byte NON_MOVING = 0;
		public static final byte MOVING = 1;
		public static final int NUM_LAYERS = 2;
	}

	private static class Layers {
		public static final int NON_MOVING = 0;
		public static final int MOVING = 1;
		public static final int NUM_LAYERS = 2;
	}

	public static void main(String[] args) {
		
		NativeLibraryLoader.DEBUG = true;
		NativeLibraryLoader.REPLACE_EXISTING = true;
		
		if (!Jolt.init())
			return;
		
		int maxPhysicsJobs = PhysicsSettings.MAX_PHYSICS_JOBS;
		int maxPhysicsBarriers = PhysicsSettings.MAX_PHYSICS_BARRIERS;
		JobSystemThreadPoolConfig config = new JobSystemThreadPoolConfig(maxPhysicsJobs, maxPhysicsBarriers, -1);
		JobSystemThreadPool jobSystem = new JobSystemThreadPool(config);

		int maxBodies = 1024;
		int bodyMutexes = 0;
		int maxBodyPairs = 1024;
		int maxContactConstraints = 1024;

		ObjectLayerPairFilterTable objectLayerPairFilter = new ObjectLayerPairFilterTable(2);
		objectLayerPairFilter.enableCollision(Layers.NON_MOVING, Layers.MOVING);
		objectLayerPairFilter.enableCollision(Layers.MOVING, Layers.NON_MOVING);

		BroadPhaseLayerInterfaceTable broadPhaseLayerInterface = new BroadPhaseLayerInterfaceTable(2, 2);
		broadPhaseLayerInterface.mapObjectToBroadPhaseLayer(Layers.NON_MOVING, BroadPhaseLayers.NON_MOVING);
		broadPhaseLayerInterface.mapObjectToBroadPhaseLayer(Layers.MOVING, BroadPhaseLayers.MOVING);

		ObjectVsBroadPhaseLayerFilter objectVsBroadPhaseLayerFilter = new ObjectVsBroadPhaseLayerFilterTable(broadPhaseLayerInterface, 2, objectLayerPairFilter, 2);

		PhysicsSystemSettings settings = new PhysicsSystemSettings();
		settings.setMaxBodies(maxBodies);
		settings.setNumBodyMutexes(bodyMutexes);
		settings.setMaxBodyPairs(maxBodyPairs);
		settings.setMaxContactConstraints(maxContactConstraints);
		settings.setBroadPhaseLayerInterface(broadPhaseLayerInterface);
		settings.setObjectVsBroadPhaseLayerFilter(objectVsBroadPhaseLayerFilter);
		settings.setObjectLayerPairFilter(objectLayerPairFilter);

		PhysicsSystem physicsSystem = new PhysicsSystem(settings);

		MyBodyActivationListener bodyActivationListener = new MyBodyActivationListener();
		physicsSystem.setBodyActivationListener(bodyActivationListener);

		MyContactListener contactListener = new MyContactListener();
		physicsSystem.setContactListener(contactListener);

		BodyInterface bodyInterface = physicsSystem.getBodyInterface();

		BoxShapeSettings floorShapeSettings = new BoxShapeSettings(new Vector3f(100, 1, 100));
		BoxShape floorShape = floorShapeSettings.createShape();

		BodyCreationSettings floorSettings = new BodyCreationSettings(floorShape, new Vector3f(0, -1, 0), new Quaternionf(), MotionType.STATIC, Layers.NON_MOVING);
		Body floor = bodyInterface.createBody(floorSettings);

		bodyInterface.addBody(floor.getID(), Activation.DONT_ACTIVATE);

		BodyCreationSettings sphereSettings = new BodyCreationSettings(new SphereShape(0.5f), new Vector3f(0, 2, 0), new Quaternionf(), MotionType.DYNAMIC, Layers.MOVING);
		int sphereId = bodyInterface.createAndAddBody(sphereSettings, Activation.ACTIVATE);

		bodyInterface.setLinearVelocity(sphereId, new Vector3f(0, -5, 0));

		final float deltaTime = 1.0f / 60.0f;

		physicsSystem.optimizeBroadPhase();

		int step = 0;

		Vector3f tmp = new Vector3f();

		while (bodyInterface.isActive(sphereId)) {
			++step;

			System.out.print("Step: " + step);

			Vector3f position = bodyInterface.getCenterOfMassPosition(sphereId, tmp);
			System.out.print(": Position = (" + position.x + ", " + position.y + ", " + position.z + "),");

			Vector3f velocity = bodyInterface.getLinearVelocity(sphereId, tmp);
			System.out.print(" Velocity = (" + velocity.x + ", " + velocity.y + ", " + velocity.z + ") \n");

			int collisionStepsSteps = 1;

			physicsSystem.update(deltaTime, collisionStepsSteps, jobSystem);
		}
		
		bodyInterface.removeBody(sphereId);

		bodyInterface.destroyBody(sphereId);

		bodyInterface.removeBody(floor.getID());
		bodyInterface.destroyBody(floor);

		Jolt.shutdown();
	}

}
//@formatter:on
