//package generation;
//
//import java.io.IOException;
//import java.nio.file.FileVisitResult;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.SimpleFileVisitor;
//import java.nio.file.attribute.BasicFileAttributes;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//
//import edu.umd.cs.findbugs.annotations.Nullable;
//import freemarker.template.Template;
//import volucris.bindings.generator.config.GlobalConfig;
//import volucris.bindings.generator.config.CallbacksConfig.CallbackConfig;
//import volucris.bindings.generator.generation.CallbackBuilder;
//import volucris.bindings.generator.generation.Generator;
//import volucris.bindings.generator.generation.GeneratorUtils;
//import volucris.bindings.generator.parsing.HeaderFile;
//import volucris.bindings.generator.parsing.NativeRecord;
//import volucris.bindings.generator.parsing.NativeRecord.FunctionPointerField;
//
//public class JoltGenerator {
//
//	public static void main(String[] args) {
//
//		HeaderFile headerFile = new HeaderFile("src/main/resources/headers/joltc.h");
//
//		Generator generator = new Generator("src/main/resources/globalConfig/globalConfig.yaml", headerFile);
//
//		try {
//			Files.walkFileTree(Path.of("src/main/resources/classConfigs"), new SimpleFileVisitor<Path>() {
//				@Override
//				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//					String path = file.toString();
//
//					try {
//						if (path.endsWith(".yaml"))
//							generator.generate(file.toString());
//					} catch (Exception e) {
//						System.err.println(path);
//						e.printStackTrace();
//					}
//
//					return FileVisitResult.CONTINUE;
//				}
//			});
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		generator.generateCallbacks("src/main/resources/callbacksConfig/callbacksConfig.yaml");
//		generator.generateEnums("src/main/resources/enumsConfig/enumsConfig.yaml");
//
//		Template template = generator.getTemplate("CallbackWithProcsStructTemplate.ftl");
//
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/ObjectLayerFilter.yaml",
//				"JPH_ObjectLayerFilter_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/ShapeFilter.yaml",
//				"JPH_ShapeFilter_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/SimShapeFilter.yaml",
//				"JPH_SimShapeFilter_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/BroadPhaseLayerFilter.yaml",
//				"JPH_BroadPhaseLayerFilter_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/BodyFilter.yaml",
//				"JPH_BodyFilter_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/CharacterContactListener.yaml",
//				"JPH_CharacterContactListener_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/CharacterVsCharacterCollisionListener.yaml",
//				"JPH_CharacterVsCharacterCollision_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/PhysicsStepListener.yaml",
//				"JPH_PhysicsStepListener_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/ContactListener.yaml",
//				"JPH_ContactListener_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/BodyActivationListener.yaml",
//				"JPH_BodyActivationListener_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/BodyDrawFilter.yaml",
//				"JPH_BodyDrawFilter_Procs",
//				template
//		);
//		
//		generateCallbackWithProcsStruct(
//				headerFile, generator,
//				"src/main/resources/callbacksWithProcs/DebugRenderer.yaml",
//				"JPH_DebugRenderer_Procs",
//				template
//		);
//	}
//
//	@SuppressWarnings("unchecked")
//	private static void generateCallbackWithProcsStruct(
//			HeaderFile headerFile,
//			Generator generator,
//			String config,
//			String structName,
//			Template template
//	) {
//		NativeRecord record = headerFile.getRecord(structName);
//
//		List<PerCallbackMethodInfo> infos = record.getFunctionPointerFields().stream().map(field -> {
//			return new PerCallbackMethodInfo(generator.getGlobalConfig(), new CallbackConfig(), field);
//		}).toList();
//
//		HashSet<String> imports = new HashSet<String>();
//		infos.forEach(info -> imports.addAll((Collection<String>) info.getImports()));
//		imports.remove(Nullable.class.getCanonicalName());
//		imports.remove(Map.class.getCanonicalName());
//		
//		HashSet<String> staticImports = new HashSet<String>();
//		infos.forEach(info -> staticImports.addAll((Collection<String>) info.getStaticImports()));
//		
//		generator.generate(config, template, Map.of("infos", infos, "structName", structName), imports, staticImports);
//	}
//
//	public static class PerCallbackMethodInfo {
//
//		private final Map<String, Object> dataModel;
//
//		private final String fieldName;
//		private final String name;
//		private final String constantsName;
//
//		public PerCallbackMethodInfo(
//				GlobalConfig globalConfig, CallbackConfig callbackConfig, FunctionPointerField field
//		) {
//
//			CallbackBuilder callbackBuilder = new CallbackBuilder(
//					globalConfig, callbackConfig, field.getFunctionPointer()
//			);
//
//			dataModel = callbackBuilder.getDataModel();
//
//			String functionPointerName = field.getFunctionPointer().getName();
//			
//			String name = GeneratorUtils.applyTypeRename(globalConfig, functionPointerName, true);
//			
//			if (name.equals(Character.toLowerCase(functionPointerName.charAt(0)) + functionPointerName.substring(1)))
//				name = GeneratorUtils.stripPrefixesAndPostfixes(globalConfig, functionPointerName, true);
//			
//			this.fieldName = field.getName();
//			this.name = name;
//			this.constantsName = name.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase();
//		}
//
//		public Object getParameters() {
//			return dataModel.get("parameters");
//		}
//
//		public Object getReturnType() {
//			return dataModel.get("returnType");
//		}
//
//		public boolean hasReturnType() {
//			return getReturnType() != null;
//		}
//		
//		public Object getValueLayouts() {
//			return dataModel.get("valueLayouts");
//		}
//
//		public Object getReturnTypeLayout() {
//			return dataModel.get("returnTypeLayout");
//		}
//
//		public Object getAddTypedMethod() {
//			return dataModel.get("addTypedMethod");
//		}
//
//		public Object getJavadoc() {
//			return dataModel.get("javadoc");
//		}
//
//		public Object getImports() {
//			return dataModel.get("imports");
//		}
//		
//		public Object getStaticImports() {
//			return dataModel.get("staticImports");
//		}
//		
//		public String getName() {
//			return name;
//		}
//
//		public String getConstantsName() {
//			return constantsName;
//		}
//
//		public String getFieldName() {
//			return fieldName;
//		}
//
//	}
//
//}
