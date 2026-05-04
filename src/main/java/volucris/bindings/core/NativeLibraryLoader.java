package volucris.bindings.core;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import org.lwjgl.system.Configuration;

public final class NativeLibraryLoader {

	private static final String OS = System.getProperty("os.name").toLowerCase();
	private static final String OS_ARCH = System.getProperty("os.arch").toLowerCase();

	private static final boolean IS_WINDOWS = OS.contains("windows");
	private static final boolean IS_APPLE = OS.contains("mac") || OS.contains("darwin");
	private static final boolean IS_LINUX = OS.contains("linux") || OS.contains("nux");

	private static final boolean IS_ARM = OS_ARCH.contains("aarch64");

	private static final ArrayList<String> EXTRACT_PATHS;

	public static boolean DEBUG = false;
	public static boolean REPLACE_EXISTING = false;

	static {
		EXTRACT_PATHS = new ArrayList<String>();

		String extractPath = Configuration.SHARED_LIBRARY_EXTRACT_PATH.get();
		if (extractPath != null)
			EXTRACT_PATHS.add(extractPath + File.separator);

		String extractDirectory = Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.get();
		if (extractDirectory == null) {
			extractDirectory = "volucris_bindings";
		}

		EXTRACT_PATHS.add(System.getProperty("user.dir") + File.separator + "natives" + File.separator);
		EXTRACT_PATHS.add(System.getProperty("user.home") + File.separator + extractDirectory + File.separator);
		EXTRACT_PATHS.add(System.getProperty("java.io.tmpdir") + File.separator + extractDirectory + File.separator);
	}

	private NativeLibraryLoader() {
	}

	public static void loadLibrary(String directory, String name) {
		loadLibrary(directory, name, false);
	}

	public static void loadLibrary(String directory, String name, boolean debug) {

		String fileName;
		if (IS_WINDOWS) {
			if (!IS_ARM)
				fileName = name + ".dll";
			else
				fileName = name + "_arm64.dll";
		} else if (IS_APPLE) {
			if (!IS_ARM)
				fileName = "lib" + name + ".dylib";
			else
				fileName = "lib" + name + "_arm64.dylib";
		} else if (IS_LINUX) {
			if (!IS_ARM)
				fileName = "lib" + name + ".so";
			else
				fileName = "lib" + name + "_arm64.so";
		} else
			throw new RuntimeException("Unsupported operating system: " + OS);

		String fileLocation = directory + File.separator + fileName;

		ArrayList<String> logs = new ArrayList<String>();
		for (String extractPath : EXTRACT_PATHS) {

			String completeExtractPath = extractPath + fileName;
			Path path = Path.of(completeExtractPath).toAbsolutePath();

			InputStream inputStream = getInputStream(fileLocation);

			try {
				createDirectoryAndFile(path);

				Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);

				System.load(path.toString());

				if (debug)
					System.out.println("Native Library Path: " + completeExtractPath);
			} catch (Exception e) {
				logs.add(e.getMessage());
				continue;
			} finally {
				closeQuietly(inputStream);
			}

			return;
		}

		for (int i = 0; i < EXTRACT_PATHS.size(); i++) {
			System.err.println("Extraction failed for path: " + EXTRACT_PATHS.get(i));
			System.err.println(logs.get(i));
		}

		throw new RuntimeException("Failed to extract and load native library.");
	}

	private static InputStream getInputStream(String internalPath) {
		String path = internalPath.replace('\\', '/');
		InputStream inputStream = NativeLibraryLoader.class.getResourceAsStream("/" + path);
		if (inputStream == null)
			throw new RuntimeException("File not found: " + path);
		return inputStream;
	}

	private static void createDirectoryAndFile(Path path) throws IOException {
		if (Files.isDirectory(path))
			throw new RuntimeException("Invalid file path");

		if (Files.exists(path))
			return;

		Path parent = path.getParent();
		if (parent != null)
			Files.createDirectories(path.getParent());

		Files.createFile(path);
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
