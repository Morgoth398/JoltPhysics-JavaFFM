//package generation;
//
//import volucris.bindings.wrapper.generation.Generator;
//import volucris.bindings.wrapper.parsing.HeaderFile;
//
//public class WrapperGenerator {
//
//	public static void main(String[] args) throws Exception {
//
//		HeaderFile headerFile = new HeaderFile(
//				"src/main/resources/nativeSources/ParsingHeader.h",
//				0,
//				"-xc++",
//				"-std=c++17",
//				"-Isrc/main/resources/nativeSources/JoltPhysics-5.7.0",
//				"-DJPH_DEBUG_RENDERER"
//		);
//		
//		Generator generator = new Generator("src/main/resources/configs/WrapperConfig.yaml", headerFile);
//		generator.generate();
//	}
//
//}
