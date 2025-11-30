package volucris.engine.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.lwjgl.Version;
import org.lwjgl.system.Configuration;
import org.tinylog.Logger;

import volucris.engine.files.VolucrisFiles;

public final class NativeLibraryLoader {

	private static final String OS = System.getProperty("os.name").toLowerCase();
	private static final boolean IS_WINDOWS = OS.contains("windows");
	private static final boolean IS_APPLE = OS.contains("mac") || OS.contains("darwin");

	private static final String[] EXTRACT_PATHS;

	public static boolean DEBUG = false;
	public static boolean LOAD_LIBRARY = true;

	static {
		EXTRACT_PATHS = new String[4];

		String extractDirectory = Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.get();
		if (extractDirectory == null)
			extractDirectory = "lwjgl_" + System.getProperty("user.name");
		String version = Version.getVersion().replace(' ', '-');
		String arch = System.getProperty("os.arch");
		if (arch.contains("64"))
			arch = "x64";
		else if (arch.contains("86"))
			arch = "x86";

		String path = Configuration.SHARED_LIBRARY_EXTRACT_PATH.get();
		EXTRACT_PATHS[0] = path == null ? null : path + File.separator;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(System.getProperty("java.io.tmpdir"));

		if (!IS_WINDOWS)
			stringBuilder.append(File.separator);

		stringBuilder.append(extractDirectory).append(File.separator);
		stringBuilder.append(version).append(File.separator).append(arch).append(File.separator);
		EXTRACT_PATHS[1] = stringBuilder.toString();

//		stringBuilder.setLength(0);
//		stringBuilder.append(System.getProperty("user.dir")).append(File.separator).append(extractDirectory);
//		stringBuilder.append(File.separator).append(version).append(File.separator).append(arch).append(File.separator);
//		EXTRACT_PATHS[2] = stringBuilder.toString();
//		System.out.println(EXTRACT_PATHS[2]);

		stringBuilder.setLength(0);
		stringBuilder.append(System.getProperty("user.dir")).append(File.separator);
		EXTRACT_PATHS[2] = stringBuilder.toString();

		stringBuilder.setLength(0);
		stringBuilder.append(System.getProperty("user.home")).append(File.separator).append(extractDirectory);
		stringBuilder.append(File.separator).append(version).append(File.separator).append(arch).append(File.separator);
		EXTRACT_PATHS[3] = stringBuilder.toString();
	}

	private NativeLibraryLoader() {
	}

	public static void loadLibrary(String sourcePath, String name) {
		if (IS_APPLE || !LOAD_LIBRARY)
			return;
		
		String fileName = IS_WINDOWS ? name + ".dll" : "lib" + name + ".so";
		String internalPath = sourcePath + File.separator + fileName;
		InputStream sharedLibraryStream = VolucrisFiles.internal(internalPath).getInputStream();

		for (int i = 0; i < EXTRACT_PATHS.length; i++) {

			if (EXTRACT_PATHS[i] == null)
				continue;

			String completePath = EXTRACT_PATHS[i] + fileName;
			Path path = Path.of(completePath).toAbsolutePath();

			if (extract(path, sharedLibraryStream)) {
				System.load(path.toString());

				VolucrisUtils.closeQuietly(sharedLibraryStream);

				if (DEBUG)
					Logger.debug("Native Library Path: " + completePath);

				return;
			}
		}

		VolucrisUtils.closeQuietly(sharedLibraryStream);
		throw new VolucrisRuntimeException("Failed to extract and load native library.");
	}

	private static boolean extract(Path path, InputStream stream) {
		if (!Files.exists(path)) {
			VolucrisFiles.absolute(path.toString());
			try {
				Files.copy(stream, path, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				return false;
			}
		}
		return true;
	}

}
