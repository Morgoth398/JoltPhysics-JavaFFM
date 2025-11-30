# JoltPhysics-JavaFFM
This project provides Java Bindings for [JoltPhysics](https://github.com/jrouwe/JoltPhysics) 5.4.0 using the Java FFM API and a [C Wrapper](https://github.com/amerkoleci/joltc). All implemented functions and the latest commit included in these bindings can be found in 'AllFunctions.txt'.

# Supported Platforms
Windows and Linux are directly supported. The Linux .so file was built on Linux Mint 22.2.
Nevertheless, you can use these bindings for Mac if you provide your own .dylib file and load it.
If you load your own native library, you can disable the loading of the default library with
```Java
NativeLibraryLoader.LOAD_LIBRARY  =  false;
 ```

# Usage
Before using the bindings (and even loading the bindings classes), you need to call 'Jolt.init()'. This function initializes JoltPhysics, but also loads the default native library. When you load your own native library, you need to do this before calling this method.
My implementation of a native library loader makes use of some  [LWJGL](https://www.lwjgl.org/) configurations. To set the extract directory of the native library, change 'Configuration.SHARED _LIBRARY _EXTRACT _PATH'. 

Due to the introduction of  [restricted methods](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/doc-files/RestrictedMethods.html), it is recommended (and in later versions required) to run the application with the VM argument '--enable-native-access=ALL-UNNAMED'.

# Example
This is a port of the [HelloWorld](https://github.com/jrouwe/JoltPhysics/blob/master/HelloWorld/HelloWorld.cpp) example.

```Java
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
```

# Implementation
I made these bindings as part of my own game engine (therefore the package naming). Because I use  [Joml](https://github.com/JOML-CI/JOML) as the math library of this engine, it is the math library used in these bindings. Even if the jolt wrapper math classes exist, they are only used internally to pass the values to the C code. Feel free to change the package name and the math library if it does not fit your project.