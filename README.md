# JoltPhysics-JavaFFM
This project provides Java Bindings for [JoltPhysics](https://github.com/jrouwe/JoltPhysics) using the Java FFM API.

The current state is experimental. The project uses a custom C wrapper and does not expose all features yet.
Missing features are, for example, raycasting, the stream api, custom job systems and everything you find a placeholder object for.

# Supported Platforms
Windows, Linux and Mac are directly supported. All release native libraries were build using the [JoltC_ReleaseBuild](./.github/workflows/JoltC_ReleaseBuild.yml) workflow.

# Building The Project
1. Download [Java 26](https://adoptium.net/temurin/releases?version=26&mode=filter&os=any&arch=any)
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

Before calling any method you need to load the native library. For that you can call ```JoltLoader.loadReleaseNativeLibrary()```. For using the debug libraries you need to download them yourself. They can be found as artifacts from the `JoltC_DebugBuild` workflow.

To set the extract directory of the native library, change ```NativeLibraryLoaderConfig.SHARED_LIBRARY_EXTRACT_PATH```. 

Due to the introduction of  [restricted methods](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/doc-files/RestrictedMethods.html), it is recommended (and in later versions required) to run the application with the VM argument ```--enable-native-access=ALL-UNNAMED```.

# Memory Management
When creating an object (directly or indirectly), native memory will be allocated. 

You have three options to manage the memory:

1. Using Jolts reference counting. Always use the `Arena.global()` when creating the objects/ allocating the memory. Any other arena will cause the memory to be freed multiple times.
2. Managing the memory using `Arena.ofAuto()`, `Arena.ofConfined()` or `Arena.ofShared()`. If the class is reference counted you need to disable it with a call to `setEmbedded()`.
3. Manually managing the memory without any arenas or reference counting. Use `Arena.global()` for any allocation and disable reference counting when applicable. If the memory should be freed you must manually call `className.destroy(myMemory)`.

# Example
For a port of the [HelloWorld](https://github.com/jrouwe/JoltPhysics/blob/master/HelloWorld/HelloWorld.cpp) example see [here](src/main/java/volucris/bindings/jolt/HelloWorld.java).


# Other Bindings
- [Box2D-JavaFFM](https://github.com/Morgoth398/Box2D-JavaFFM)
- [Box3D-JavaFFM](https://github.com/Morgoth398/Box3D-JavaFFM)
