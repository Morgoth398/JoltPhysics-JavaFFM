package volucris.engine.physics.jolt.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.lwjgl.Version;
import org.lwjgl.system.Configuration;
import org.tinylog.Logger;

public final class NativeLibraryLoader {

	private static final String OS = System.getProperty("os.name").toLowerCase();
	private static final boolean IS_WINDOWS = OS.contains("windows");
	private static final boolean IS_APPLE = OS.contains("mac") || OS.contains("darwin");

	private static final String[] EXTRACT_PATHS;

	public static boolean DEBUG = false;
	public static boolean LOAD_LIBRARY = true;
	public static boolean REPLACE_EXISTING = false;

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
		InputStream sharedLibraryStream = getInputStream(internalPath);

		for (int i = 0; i < EXTRACT_PATHS.length; i++) {

			if (EXTRACT_PATHS[i] == null)
				continue;

			String completePath = EXTRACT_PATHS[i] + fileName;
			Path path = Path.of(completePath).toAbsolutePath();

			if (extract(path, sharedLibraryStream)) {
				System.load(path.toString());

				closeQuietly(sharedLibraryStream);

				if (DEBUG)
					Logger.debug("Native Library Path: " + completePath);

				return;
			}
		}

		closeQuietly(sharedLibraryStream);
		throw new JoltRuntimeException("Failed to extract and load native library. ");
	}

	private static boolean extract(Path path, InputStream stream) {
		if (!Files.exists(path) || REPLACE_EXISTING) {
			createDirectoryAndFile(path);
			try {
				Files.copy(stream, path, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				return false;
			}
		}
		return true;
	}

	private static InputStream getInputStream(String internalPath) {
		String path = internalPath.replace('\\', '/');
		InputStream inputStream = NativeLibraryLoader.class.getResourceAsStream("/" + path);
		if (inputStream == null)
			throw new JoltRuntimeException("File not found: " + path);
		return inputStream;
	}

	private static void createDirectoryAndFile(Path path) {
		if (Files.exists(path))
			return;
		try {
			if (path.toString().contains(".")) {
				Path parent = path.getParent();
				if (parent != null)
					Files.createDirectories(path.getParent());
				Files.createFile(path);
			} else {
				Files.createDirectories(path);
			}
		} catch (IOException e) {
		}
	}

	public static void closeQuietly(Closeable closeable) {
		if (closeable == null)
			return;
		try {
			closeable.close();
		} catch (Exception e) {
		}
	}

}
