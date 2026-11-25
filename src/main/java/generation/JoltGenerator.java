package generation;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.generator.parsing.NativeFunctionPointer;

public class JoltGenerator {

	public static void main(String[] args) {

		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/JoltC.h");

		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
		
		generator.generateEnums("src/main/resources/configs/enumsConfig.yaml");

		try {
			Files.walkFileTree(Path.of("src/main/resources/configs/classConfigs"), new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					String path = file.toString();

					try {
						if (path.endsWith(".yaml"))
							generator.generate(file.toString());
					} catch (Exception e) {
						System.err.println(path);
						e.printStackTrace();
					}

					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, NativeFunctionPointer> functionPointers = new HashMap<>();

		List<String> classes = List.of(
				"JPH_BodyActivationListenerFunctions",
				"JPH_BodyDrawFilterFunctions",
				"JPH_BodyFilterFunctions",
				"JPH_BroadPhaseLayerFilterFunctions",
				"JPH_BroadPhaseLayerInterfaceFunctions",
				"JPH_ContactListenerFunctions",
				"JPH_DebugRendererFunctions",
				"JPH_DebugRendererSimpleFunctions",
				"JPH_ObjectLayerFilterFunctions",
				"JPH_ObjectLayerPairFilterFunctions",
				"JPH_GroupFilterFunctions",
				"JPH_JobSystemFunctions",
				"JPH_ObjectVsBroadPhaseLayerFilterFunctions",
				"JPH_PhysicsStepListenerFunctions",
				"JPH_SimShapeFilterFunctions",
				"JPH_TempAllocatorFunctions",
				"JPH_ShapeFilterFunctions",
				"JPH_CharacterContactListenerFunctions",
				"JPH_CharacterVsCharacterCollisionFunctions",
				"JPH_VehicleCollisionTesterFunctions",
				"JPH_SoftBodyContactListenerFunctions",
				"JPH_StateRecorderFilterFunctions"
		);

		headerFile.getRecords(classes)
			.stream()
			.flatMap(record -> record.getFunctionPointerFields().stream())
			.forEach(field -> {
				NativeFunctionPointer functionPointer = field.getFunctionPointer();
				functionPointers.put(functionPointer.getName(), functionPointer);
			});

		generator.generateCallbacks("src/main/resources/configs/callbacksConfig.yaml", functionPointers);
	}

}
