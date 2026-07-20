# JoltPhysics-JavaFFM
This project provides Java Bindings for [JoltPhysics](https://github.com/jrouwe/JoltPhysics) using the Java FFM API and a [C Wrapper](https://github.com/amerkoleci/joltc).

This project is in a usable, working state regarding the features that the C wrapper exposes. When the wrapper exposes new features, I try to update this project as fast as possible.

# Supported Platforms
Windows, Linux and Mac are directly supported. The native libraries were build by [the workflow the C Wrapper provides](https://github.com/amerkoleci/joltc/blob/main/.github/workflows/build.yml).

# Building The Project
1. Download [Java 26](https://www.oracle.com/de/java/technologies/downloads/)
2. Download the sources or clone the repo

### Using The Terminal

3. Install [Maven](https://maven.apache.org/download.cgi)
4. Open the terminal in the directory of the downloaded project
5. Run the goal `mvn package`.
6. The output is in the `target/` folder

### Using An IDE

3. Import the project in an IDE of your choice as a maven project
	- [IntelliJ](https://www.jetbrains.com/guide/java/tutorials/working-with-maven/importing-a-project/)
	- [Eclipse](https://www.lagomframework.com/documentation/1.6.x/java/EclipseMavenInt.html)
4. Create a new maven run configuration and add the goal `mvn package`
	- [IntelliJ](https://www.jetbrains.com/help/idea/run-debug-configuration-maven.html)
	- [Eclipse](https://www.genuitec.com/docs/assembly/setting-up-maven-launch-configurations/)
5. Run the created configuration
6. The output is also in the `target/` folder

If you are using the Eclipse IDE, you do not need to build the project explicitly. You can import this project into a workspace and just add the Maven coordinates into the `pom.xml` file of any other Maven project in the same workspace. This works as Eclipse can resolve Maven dependencies directly from the workspace, without requiring the project to be installed into the local Maven repository.

# Usage
This project requires Java 26 and preview features enabled.

Before calling any method you need to load the native library. For Windows and Linux you can call ```Jolt.loadNativeLibrary()```. Additionally you need to initialize jolt with a call to ```Jolt.init()``` (do not forget to call ```Jolt.shutdown()``` when jolt is no longer needed).

To set the extract directory of the native library, change ```NativeLibraryLoaderConfig.SHARED_LIBRARY_EXTRACT_PATH```. 

Due to the introduction of  [restricted methods](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/doc-files/RestrictedMethods.html), it is recommended (and in later versions required) to run the application with the VM argument ```--enable-native-access=ALL-UNNAMED```.

# Memory Management
When creating an object (directly or indirectly), native memory will be allocated. 

Structs will always be allocated with an arena. By default an automatic arena is used, but you can use any arena you want (even a global arena, but this may not be desirable) by using the appropriate constructor.

Other classes will allocate memory with a function call. When the object is created directly with a constructor call, a cleanup function will be attached to the memory segment. By default an automatic arena is used, but you can again use any arena you want. But this means you must not free the memory yourself, as it will be freed a second time when the arena is closed (does not apply for the global arena).

When an object is not created directly, e.g. with a method call, no cleanup function will be attached to the segment (unfortunately a side effect of generating all sources). That means you need to free the memory that this object holds manually. A workaround is to use the "raw methods" to allocate the memory and then attach the cleanup function manually.

```Java
BoxShapeSettings floorShapeSettings = new BoxShapeSettings(
		new Vec3().x(100).y(1).z(100),
		Jolt.DEFAULT_CONVEX_RADIUS);

// Object is created indirectly. No cleanup function will be attached
BoxShape floorShape = floorShapeSettings.createShape(); 

// Workaround
MemorySegment floorShapeSegment = BoxShapeSettings.createShape(floorShapeSettings.memorySegment());
BoxShape floorShape = new BoxShape(floorShapeSegment.reinterpret(Arena.ofAuto(), Shape::destroy));
```

# Example
This is a port of the [HelloWorld](https://github.com/jrouwe/JoltPhysics/blob/master/HelloWorld/HelloWorld.cpp) example.

```Java
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

		if (Boolean.getBoolean("load.debug.library"))
			Jolt.loadDebugNativeLibrary();
		else
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
				BroadPhaseLayers.NUM_LAYERS
		);

		broadPhaseLayerInterface.mapObjectToBroadPhaseLayer(Layers.NON_MOVING, BroadPhaseLayers.NON_MOVING);
		broadPhaseLayerInterface.mapObjectToBroadPhaseLayer(Layers.MOVING, BroadPhaseLayers.MOVING);

		ObjectVsBroadPhaseLayerFilter objectVsBroadPhaseLayerFilter = new ObjectVsBroadPhaseLayerFilterTable(
				broadPhaseLayerInterface, BroadPhaseLayers.NUM_LAYERS,
				objectLayerPairFilter, Layers.NUM_LAYERS
		);

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
				Jolt.DEFAULT_CONVEX_RADIUS
		);
		BoxShape floorShape = floorShapeSettings.createShape();

		BodyCreationSettings floorSettings = new BodyCreationSettings(
				floorShape,
				new Vec3().x(0).y(-1).z(0),
				new Quat().x(0).y(0).z(0).w(1),
				MotionType.STATIC,
				Layers.NON_MOVING
		);
		Body floor = bodyInterface.createBody(floorSettings);

		bodyInterface.addBody(floor.getID(), Activation.DONT_ACTIVATE);

		SphereShape sphereShape = new SphereShape(0.5f);
		BodyCreationSettings sphereSettings = new BodyCreationSettings(
				sphereShape,
				new Vec3().x(0).y(2).z(0),
				new Quat().x(0).y(0).z(0).w(1),
				MotionType.DYNAMIC,
				Layers.MOVING
		);
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
```
