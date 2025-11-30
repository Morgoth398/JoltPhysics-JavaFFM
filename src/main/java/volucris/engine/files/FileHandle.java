package volucris.engine.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import volucris.engine.utils.VolucrisUtils;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.nio.file.StandardOpenOption.*;
import static volucris.engine.files.PathType.*;

public final class FileHandle {

	private PathType pathType;

	private Path path;

	protected FileHandle(String filePath, PathType pathType, boolean create) {
		this.path = Paths.get(filePath);
		this.pathType = pathType;

		if (pathType == ABSOLUTE && !path.isAbsolute())
			path = path.toAbsolutePath();

		if (create)
			createDirectoryAndFile();
	}

	private FileHandle(Path path, PathType pathType) {
		this.path = path;
		this.pathType = pathType;
	}

	private void createDirectoryAndFile() {
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

	/**
	 * Reads the entire file into a string with the given charset.
	 * 
	 * @return The content of the file.
	 * @throws VolucrisRuntimeException If the file does not exist or could not be
	 *                                  read.
	 */
	public String readString(Charset charset) {
		if (pathType == INTERNAL) {
			String path = this.path.toString().replace('\\', '/');
			return readString(FileHandle.class.getResourceAsStream("/" + path), charset);
		} else {
			try {
				return readString(Files.newInputStream(path), charset);
			} catch (IOException e) {
				throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");
			}
		}
	}

	private String readString(InputStream inputStream, Charset charset) {
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try {
			if (inputStream == null)
				throw new VolucrisRuntimeException(
						"File not found: " + getPath() + " (" + pathType + ")");
			inputStreamReader = new InputStreamReader(inputStream, charset);
			bufferedReader = new BufferedReader(inputStreamReader);
			StringBuilder builder = new StringBuilder(100);
			while (true) {
				int character = bufferedReader.read();
				if (character == -1)
					break;
				builder.append((char) character);
			}
			return builder.toString();
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot read file: " + getPath() + " (" + pathType + ")");
		} finally {
			VolucrisUtils.closeQuietly(inputStream);
			VolucrisUtils.closeQuietly(inputStreamReader);
			VolucrisUtils.closeQuietly(bufferedReader);
		}
	}

	/**
	 * Reads the entire file into a string with the default charset.
	 * 
	 * @return The content of the file.
	 * @throws VolucrisRuntimeException If the file does not exist or could not be
	 *                                  read.
	 */
	public String readString() {
		return readString(Charset.defaultCharset());
	}

	/**
	 * Reads all lines of the file with the given charset.
	 * 
	 * @return List with all lines
	 * @throws VolucrisRuntimeException If the file does not exist or could not be
	 *                                  read.
	 */
	public List<String> readAllLines(Charset charset) {
		if (pathType == INTERNAL) {
			String path = this.path.toString().replace('\\', '/');
			try (InputStream inputStream = FileHandle.class.getResourceAsStream("/" + path);
					InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
					BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
				return bufferedReader.lines().collect(Collectors.toList());
			} catch (UncheckedIOException e) {
				throw new VolucrisRuntimeException("Cannot read file: " + getPath() + " (" + pathType + ")");
			} catch (NullPointerException e) {
				throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");
			} catch (IOException e) {
				// Ignore IOException
			}
		}

		if (!Files.exists(path))
			throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");

		try {
			return Files.readAllLines(path, charset);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot read file: " + getPath() + " (" + pathType + ")");
		}
	}

	/**
	 * Reads all lines of the file with the default charset.
	 * 
	 * @return List with all lines
	 * @throws VolucrisRuntimeException If the file does not exist or could not be
	 *                                  read.
	 */
	public List<String> readAllLines() {
		return readAllLines(Charset.defaultCharset());
	}

	/**
	 * Reads all bytes of the file.
	 * 
	 * @return The bytes of the file.
	 * @throws VolucrisRuntimeException If the file does not exist or could not be
	 *                                  read.
	 */
	public byte[] readAllBytes() {
		if (pathType == INTERNAL) {
			boolean read = false;
			String path = this.path.toString().replace('\\', '/');
			try (InputStream inputStream = FileHandle.class.getResourceAsStream("/" + path)) {
				byte[] bytes = inputStream.readAllBytes();
				read = true;
				return bytes;
			} catch (IOException e) {
				if (!read)
					throw new VolucrisRuntimeException("Cannot read file: " + getPath() + " (" + pathType + ")");
			} catch (NullPointerException e) {
				throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");
			}
		}

		if (!Files.exists(path))
			throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");

		try {
			return Files.readAllBytes(path);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot read file: " + getPath() + " (" + pathType + ")");
		}
	}

	/**
	 * Writes the given bytes to the file.
	 * 
	 * @param bytes  The bytes to be written into the file.
	 * @param append If the bytes should be appended to the files content.
	 * @throws VolucrisRuntimeException If the file does not exist or the bytes
	 *                                  could not be written.
	 */
	public void writeBytes(byte[] bytes, boolean append) {
		if (pathType == PathType.INTERNAL)
			throw new VolucrisRuntimeException("Cannot write to file: " + getPath() + " (" + pathType + ")");
		if (!Files.exists(path))
			throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");
		try {
			Files.write(path, bytes, append ? APPEND : TRUNCATE_EXISTING);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot write to file: " + getPath() + " (" + pathType + ")");
		}
	}

	/**
	 * Writes the given string to the file.
	 * 
	 * @param text    The string to be written into the file.
	 * @param charset The charset for the text.
	 * @param append  If the bytes should be appended to the files content.
	 * @throws VolucrisRuntimeException If the file does not exist or the string
	 *                                  could not be written.
	 */
	public void writeString(String text, Charset charset, boolean append) {
		if (pathType == PathType.INTERNAL)
			throw new VolucrisRuntimeException("Cannot write to file: " + getPath() + " (" + pathType + ")");
		if (!Files.exists(path))
			throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");
		try {
			Files.writeString(path, text, charset, append ? APPEND : TRUNCATE_EXISTING);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot write to file: " + getPath() + " (" + pathType + ")");
		}
	}

	/**
	 * Writes the given string to the file using the default charset.
	 * 
	 * @param text   The string to be written into the file.
	 * @param append If the bytes should be appended to the files content.
	 * @throws VolucrisRuntimeException If the file does not exist or the string
	 *                                  could not be written.
	 */
	public void writeString(String text, boolean append) {
		writeString(text, Charset.defaultCharset(), append);
	}

	/**
	 * Writes the given {@link CharSequence} to the file.
	 * 
	 * @param text    The char sequence to be written into the file.
	 * @param charset The charset for the text.
	 * @param append  If the bytes should be appended to the files content.
	 * @throws VolucrisRuntimeException If the file does not exist or the string
	 *                                  could not be written.
	 */
	public void writeString(CharSequence text, Charset charset, boolean append) {
		if (pathType == PathType.INTERNAL)
			throw new VolucrisRuntimeException("Cannot write to file: " + getPath() + " (" + pathType + ")");
		if (!Files.exists(path))
			throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");
		try {
			Files.writeString(path, text, charset, append ? APPEND : TRUNCATE_EXISTING);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot write to file: " + getPath() + " (" + pathType + ")");
		}
	}

	/**
	 * Writes the given {@link CharSequence} to the file using the default charset.
	 * 
	 * @param text   The char sequence to be written into the file.
	 * @param append If the bytes should be appended to the files content.
	 * @throws VolucrisRuntimeException If the file does not exist or the string
	 *                                  could not be written.
	 */
	public void writeString(CharSequence text, boolean append) {
		writeString(text, Charset.defaultCharset(), append);
	}

	/**
	 * Deletes the file or directory. To delete a directory it must be empty.
	 * 
	 * @throws VolucrisRuntimeException If the file could not be deleted.
	 */
	public void delete() {
		if (pathType == INTERNAL)
			throw new VolucrisRuntimeException("Cannot delete an internal file: " + getPath() + " (" + pathType + ")");

		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot delete file: " + getPath() + " (" + pathType + ")");
		}
	}

	/**
	 * Delivers the parent file handle for the file.
	 * <p>
	 * If the file handle has no parent, the path string will be empty.
	 * 
	 * @return The parent file handle.
	 */
	public FileHandle getParent() {
		Path parent = path.getParent();
		if (parent == null)
			return new FileHandle("", pathType, false);
		return new FileHandle(parent, pathType);
	}

	/**
	 * Delivers the name of all files contained in this directory.
	 * 
	 * @return A list of all the names.
	 * @throws VolucrisRuntimeException If the file handle is not a directory or an
	 *                                  reading error occurred.
	 */
	public List<String> getChildren() {
		if (pathType == INTERNAL)
			return readAllLines();
		else {
			if (!isDirectory())
				throw new VolucrisRuntimeException(
						"Cannot list children for file: " + getPath() + " (" + pathType + ")");

			try {
				List<Path> paths = Files.list(path).collect(Collectors.toList());
				List<String> files = new ArrayList<String>(paths.size());
				for (Path path : paths) {
					files.add(path.getFileName().toString());
				}
				return files;
			} catch (IOException e) {
				throw new VolucrisRuntimeException(
						"Cannot list children for directory: " + getPath() + " (" + pathType + ")");
			}
		}
	}

	/**
	 * Copies the file to the given destination.
	 * 
	 * @param destination The destination file handle.
	 * @throws VolucrisRuntimeException If the file could not be copied.
	 */
	public void copyTo(FileHandle destination) {
		try {
			Files.copy(path, destination.path);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot copy file " + getPath() + " (" + pathType + ") to "
					+ destination.getPath() + "(" + destination.pathType + ")");
		}
	}

	/**
	 * Moves the file to the given destination.
	 * 
	 * @param destination The destination file handle.
	 * @throws VolucrisRuntimeException If the file could not me moved.
	 */
	public void moveTo(FileHandle destination) {
		try {
			Files.move(path, destination.path);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("Cannot move file " + getPath() + " (" + pathType + ") to "
					+ destination.getPath() + "(" + destination.pathType + ")");
		}
	}

	@Override
	public String toString() {
		return getPath();
	}

	public String getPath() {
		return path.toString().replace('\\', '/');
	}

	/**
	 * WARNING: Does not work for internal file handles: The absolute path will be
	 * wrong.
	 * 
	 * @return The absolute path
	 */
	public String getAbsolutePath() {
		if (path.isAbsolute())
			return getPath();
		else
			return path.toAbsolutePath().toString();
	}

	public String getPathWithoutExtension() {
		String path = getPath();
		int dotIndex = path.lastIndexOf('.');
		if (dotIndex == -1)
			return path;
		return path.substring(0, dotIndex);
	}

	/**
	 * WARNING: Does not work for internal file handles: The absolute path will be
	 * wrong.
	 * 
	 * @return The absolute path
	 */
	public String getAbsolutePathWithoutExtension() {
		String path = getAbsolutePath();
		int dotIndex = path.lastIndexOf('.');
		if (dotIndex == -1)
			return path;
		return path.substring(0, dotIndex);
	}

	public String getDirectoryPath() {
		if (isDirectory())
			return getPath();
		else
			return path.getParent().toString();
	}

	public String getFileName() {
		return path.getFileName().toString();
	}

	public String getFileNameWithoutExtension() {
		String name = getFileName();
		int dotIndex = name.lastIndexOf('.');
		if (dotIndex == -1)
			return name;
		return name.substring(0, dotIndex);
	}

	public String getFileExtension() {
		String name = getFileName();
		int dotIndex = name.lastIndexOf('.');
		if (dotIndex == -1)
			return "";
		return name.substring(dotIndex + 1);
	}

	/**
	 * Returns an {@link InputStream} for this file handle.
	 * 
	 * @return The Input Stream
	 * @throws VolucrisRuntimeException If the InputStream could not be created.
	 */
	public InputStream getInputStream() {
		if (pathType == INTERNAL) {
			String path = this.path.toString().replace('\\', '/');
			InputStream inputStream = FileHandle.class.getResourceAsStream("/" + path);
			if (inputStream == null)
				throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");
			return inputStream;
		}
		try {
			return Files.newInputStream(path);
		} catch (IOException e) {
			throw new VolucrisRuntimeException("File not found: " + getPath() + " (" + pathType + ")");
		}
	}

	/**
	 * WARNING: Does not work for internal file handles.
	 * 
	 * @return If the file handle points to a file or not.
	 */
	public boolean isFile() {
		return Files.isRegularFile(path);
	}

	/**
	 * WARNING: Does not work for internal file handles.
	 * 
	 * @return If the file handle points to a directory or not
	 */
	public boolean isDirectory() {
		return Files.isDirectory(path);
	}

	/**
	 * 
	 * @return If the file or directory exists or not
	 */
	public boolean exists() {
		if (pathType == INTERNAL)
			return FileHandle.class.getResource("/" + path.toString().replace('\\', '/')) != null;

		return Files.exists(path);
	}

	public PathType getPathType() {
		return pathType;
	}

}
