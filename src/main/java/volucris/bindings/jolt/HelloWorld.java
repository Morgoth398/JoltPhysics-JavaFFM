package volucris.bindings.jolt;

import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.body.BodyCreationSettings;
import volucris.bindings.jolt.body.BodyInterface;
import volucris.bindings.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterfaceTable;
import volucris.bindings.jolt.enums.Activation;
import volucris.bindings.jolt.enums.MotionType;
import volucris.bindings.jolt.enums.ValidateResult;
import volucris.bindings.jolt.jobSystem.JobSystemThreadPool;
import volucris.bindings.jolt.jobSystem.JobSystemThreadPoolConfig;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.objectLayerPairFilter.ObjectLayerPairFilterTable;
import volucris.bindings.jolt.objectVsBroadPhaseLayerFilter.ObjectVsBroadPhaseLayerFilter;
import volucris.bindings.jolt.objectVsBroadPhaseLayerFilter.ObjectVsBroadPhaseLayerFilterTable;
import volucris.bindings.jolt.physicsSystem.PhysicsSystem;
import volucris.bindings.jolt.physicsSystem.PhysicsSystemSettings;
import volucris.bindings.jolt.raycast.CollideShapeResult;
import volucris.bindings.jolt.shape.BoxShape;
import volucris.bindings.jolt.shape.BoxShapeSettings;
import volucris.bindings.jolt.shape.Shape;
import volucris.bindings.jolt.shape.SphereShape;

public class HelloWorld {

	private static class MyContactListener extends ContactListener {

		@Override
		public int onContactValidate(Body body1, Body body2, Vec3 baseOffset, CollideShapeResult collisionResult) {
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
		public void onBodyActivated(int bodyId, long bodyUserData) {
			System.out.println("A body got activated");
		}

		@Override
		public void onBodyDeactivated(int bodyId, long bodyUserData) {
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

		Jolt.loadNativeLibrary();

		if (!Jolt.init())
			return;

		JobSystemThreadPoolConfig config = new JobSystemThreadPoolConfig()
				.maxJobs(Jolt.MAX_PHYSICS_JOBS)
				.maxBarriers(Jolt.MAX_PHYSICS_BARRIERS)
				.numThreads(-1);

		JobSystemThreadPool jobSystem = new JobSystemThreadPool(config);

		ObjectLayerPairFilterTable objectLayerPairFilter = new ObjectLayerPairFilterTable(2);
		objectLayerPairFilter.enableCollision(Layers.NON_MOVING, Layers.MOVING);
		objectLayerPairFilter.enableCollision(Layers.MOVING, Layers.NON_MOVING);

		BroadPhaseLayerInterfaceTable broadPhaseLayerInterface = new BroadPhaseLayerInterfaceTable(
				Layers.NUM_LAYERS,
				BroadPhaseLayers.NUM_LAYERS);

		broadPhaseLayerInterface.mapObjectToBroadPhaseLayer(Layers.NON_MOVING, BroadPhaseLayers.NON_MOVING);
		broadPhaseLayerInterface.mapObjectToBroadPhaseLayer(Layers.MOVING, BroadPhaseLayers.MOVING);

		ObjectVsBroadPhaseLayerFilter objectVsBroadPhaseLayerFilter = new ObjectVsBroadPhaseLayerFilterTable(
				broadPhaseLayerInterface, BroadPhaseLayers.NUM_LAYERS,
				objectLayerPairFilter, Layers.NUM_LAYERS);

		PhysicsSystemSettings settings = new PhysicsSystemSettings()
				.maxBodies(1024)
				.numBodyMutexes(0)
				.maxBodyPairs(1024)
				.maxContactConstraints(1024)
				.broadPhaseLayerInterface(broadPhaseLayerInterface)
				.objectVsBroadPhaseLayerFilter(objectVsBroadPhaseLayerFilter)
				.objectLayerPairFilter(objectLayerPairFilter);

		PhysicsSystem physicsSystem = new PhysicsSystem(settings);

		MyBodyActivationListener bodyActivationListener = new MyBodyActivationListener();
		physicsSystem.setBodyActivationListener(bodyActivationListener);

		MyContactListener contactListener = new MyContactListener();
		physicsSystem.setContactListener(contactListener);

		BodyInterface bodyInterface = physicsSystem.getBodyInterface();

		BoxShapeSettings floorShapeSettings = new BoxShapeSettings(
				new Vec3().x(100).y(1).z(100),
				Jolt.DEFAULT_CONVEX_RADIUS);
		BoxShape floorShape = floorShapeSettings.createShape();

		BodyCreationSettings floorSettings = new BodyCreationSettings(
				floorShape,
				new Vec3().x(0).y(-1).z(0),
				new Quat(),
				MotionType.STATIC,
				Layers.NON_MOVING);
		Body floor = bodyInterface.createBody(floorSettings);

		bodyInterface.addBody(floor.getID(), Activation.DONT_ACTIVATE);

		SphereShape sphereShape = new SphereShape(0.5f);
		BodyCreationSettings sphereSettings = new BodyCreationSettings(
				sphereShape,
				new Vec3().x(0).y(2).z(0),
				new Quat(),
				MotionType.DYNAMIC,
				Layers.MOVING);
		int sphereId = bodyInterface.createAndAddBody(sphereSettings, Activation.ACTIVATE);

		bodyInterface.setLinearVelocity(sphereId, new Vec3().x(0).y(-5).z(0));

		final float deltaTime = 1.0f / 60.0f;

		physicsSystem.optimizeBroadPhase();

		int step = 0;

		Vec3 tmp = new Vec3();

		while (bodyInterface.isActive(sphereId)) {
			++step;

			System.out.print("Step: " + step);

			bodyInterface.getCenterOfMassPosition(sphereId, tmp);

			System.out.print(": Position = (" + tmp.x() + ", " + tmp.y() + ", " + tmp.z() + "),");

			bodyInterface.getLinearVelocity(sphereId, tmp);
			System.out.print(" Velocity = (" + tmp.x() + ", " + tmp.y() + ", " + tmp.z() + ") \n");

			int collisionStepsSteps = 1;

			physicsSystem.update(deltaTime, collisionStepsSteps, jobSystem);
		}

		bodyInterface.removeBody(sphereId);
		bodyInterface.destroyBody(sphereId);

		bodyInterface.removeBody(floor.getID());
		bodyInterface.destroyBody(floor.getID());

		Shape.destroy(floorShape.memorySegment());

		Jolt.shutdown();
	}

}
