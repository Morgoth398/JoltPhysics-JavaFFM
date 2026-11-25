package volucris.bindings.jolt;

import volucris.bindings.core.NativeLibraryLoader;

public final class JoltLoader {

	private JoltLoader() {
		
	}
	
	public static void loadReleaseNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/jolt/release", "joltc");
	}
	
	public static void loadDebugNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/jolt/debug", "joltc");
	}
	
}
