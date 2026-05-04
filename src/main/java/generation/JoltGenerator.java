//package generation;
//
//import java.io.IOException;
//import java.nio.file.FileVisitResult;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.SimpleFileVisitor;
//import java.nio.file.attribute.BasicFileAttributes;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import freemarker.template.Template;
//import volucris.bindings.generator.config.ClassConfig.NativeFunctionDescription;
//import volucris.bindings.generator.config.GlobalConfig;
//import volucris.bindings.generator.generation.Generator;
//import volucris.bindings.generator.generation.GeneratorUtils;
//import volucris.bindings.generator.generation.methods.NativeFunctionMethod;
//import volucris.bindings.generator.parsing.FunctionPointer;
//import volucris.bindings.generator.parsing.HeaderFile;
//import volucris.bindings.generator.parsing.Struct;
//
//import static volucris.bindings.generator.generation.GeneratorUtils.*;
//
//public class JoltGenerator {
//
//	private static final Template CALLBACK_WITH_PROCS_STRUCT_TEMPLATE;
//	
//	static {
//		try {
//			CALLBACK_WITH_PROCS_STRUCT_TEMPLATE = Generator.FREE_MARKER_CONFIG
//					.getTemplate("CallbackWithProcsStructTemplate.ftl");
//		} catch (Exception e) {
//			throw new RuntimeException(e.getMessage());
//		}
//	}
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
//					if (path.endsWith(".yaml"))
//						generator.generate(file.toString());
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
//		generateCallbackWithProcsStruct(headerFile, generator);
//	}
//
//	private static void generateCallbackWithProcsStruct(HeaderFile headerFile, Generator generator) {
//		Struct struct = headerFile.getStruct("JPH_ObjectLayerFilter_Procs");
//		List<PerCallbackMethodInfo> infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			description.setTypedMethod(false);
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/ObjectLayerFilter.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_ObjectLayerFilter_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_ShapeFilter_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), new NativeFunctionDescription());
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/ShapeFilter.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_ShapeFilter_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_SimShapeFilter_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), new NativeFunctionDescription());
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/SimShapeFilter.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_SimShapeFilter_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_BroadPhaseLayerFilter_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			description.setTypedMethod(false);
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/BroadPhaseLayerFilter.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_BroadPhaseLayerFilter_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_BodyFilter_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			description.setTypedMethod(false);
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/BodyFilter.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_BodyFilter_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_CharacterContactListener_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/CharacterContactListener.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_CharacterContactListener_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_CharacterVsCharacterCollision_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/CharacterVsCharacterCollisionListener.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_CharacterVsCharacterCollision_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_PhysicsStepListener_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/PhysicsStepListener.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_PhysicsStepListener_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_ContactListener_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/ContactListener.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_ContactListener_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_BodyActivationListener_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			description.setTypedMethod(false);
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/BodyActivationListener.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_BodyActivationListener_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_BodyDrawFilter_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/BodyDrawFilter.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_BodyDrawFilter_Procs"));
//		
//		//---------------------------------------------------------------------------------------------------------
//		
//		struct = headerFile.getStruct("JPH_DebugRenderer_Procs");
//		infos = struct.getFunctionPointers().stream().map(f -> {
//			NativeFunctionDescription description = new NativeFunctionDescription();
//			
//			if (f.getName().contains("Text3D"))
//				description.getStringParameters().add("str");
//			
//			return new PerCallbackMethodInfo(f, generator.getGlobalConfig(), description);
//		}).toList();
//		
//		generator.generate(
//				"src/main/resources/callbacksWithProcs/DebugRenderer.yaml",
//				CALLBACK_WITH_PROCS_STRUCT_TEMPLATE,
//				Map.of("infos", infos, "structName", "JPH_DebugRenderer_Procs"));
//	}
//	
//	public static class PerCallbackMethodInfo {
//
//		private NativeFunctionMethod method;
//		private NativeFunctionDescription description;
//
//		private List<String> valueLayouts;
//
//		private String returnTypeLayout;
//		private String constantsName;
//		private String name;
//
//		private boolean hasReturnType;
//
//		public PerCallbackMethodInfo(
//				FunctionPointer functionPointer,
//				GlobalConfig config,
//				NativeFunctionDescription description) {
//			
//			this.description = description;
//			
//			method = new NativeFunctionMethod(
//					config,
//					functionPointer,
//					description);
//				
//			valueLayouts = new ArrayList<String>();
//			functionPointer.getParameters().forEach(parameter -> {
//				String layout = GeneratorUtils.stripPrefixes(config, getLayoutString(parameter.getType()), false);
//				valueLayouts.add(layout);
//			});
//
//			returnTypeLayout = GeneratorUtils.stripPrefixes(
//					config,
//					getLayoutString(functionPointer.getReturnType().getType()),
//					false);
//			
//			hasReturnType = !method.getReturnType().getIsVoid();
//			
//			name = GeneratorUtils.stripPrefixes(config, functionPointer.getName(), true).replaceAll("\\*\\s*$", "").trim();
//			constantsName = name.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase();
//		}
//
//		public NativeFunctionMethod getMethod() {
//			return method;
//		}
//
//		public List<String> getValueLayouts() {
//			return valueLayouts;
//		}
//
//		public String getReturnTypeLayout() {
//			return returnTypeLayout;
//		}
//
//		public String getConstantsName() {
//			return constantsName;
//		}
//
//		public String getName() {
//			return name;
//		}
//		
//		public boolean getHasReturnType() {
//			return hasReturnType;
//		}
//		
//		public NativeFunctionDescription getDescription() {
//			return description;
//		}
//		
//	}
//
//}
