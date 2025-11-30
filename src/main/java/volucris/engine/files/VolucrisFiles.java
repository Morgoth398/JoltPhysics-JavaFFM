package volucris.engine.files;

import static volucris.engine.files.PathType.*;

public final class VolucrisFiles {

	private VolucrisFiles() {

	}

	/**
	 * Creates a new internal file handle. If the file does not exist, it will not
	 * be created.
	 * 
	 * @param filePath The path to the file
	 * @return The created file handle
	 */
	public static FileHandle internal(String filePath) {
		return new FileHandle(filePath, INTERNAL, false);
	}

	/**
	 * Creates a new external file handle with the path relative to the user home.
	 * If the file does not exist, it will be created.
	 * 
	 * @param filePath The path to the file
	 * @return The created file handle
	 */
	public static FileHandle external(String filePath) {
		return new FileHandle(System.getProperty("user.home") + "/" + filePath, EXTERNAL, true);
	}

	/**
	 * Creates a new external file handle with the path relative to the user home.
	 * 
	 * @param filePath The path to the file
	 * @param create If the file should be created if it does not exist.
	 * @return The created file handle
	 */
	public static FileHandle external(String filePath, boolean create) {
		return new FileHandle(System.getProperty("user.home") + "/" + filePath, EXTERNAL, create);
	}

	/**
	 * Creates a new local file handle. If the file does not exist, it will be
	 * created.
	 * 
	 * @param filePath The path to the file
	 * @return The created file handle
	 */
	public static FileHandle local(String filePath) {
		return new FileHandle(filePath, LOCAL, true);
	}

	/**
	 * Creates a new local file handle.
	 * 
	 * @param filePath The path to the file
	 * @param create If the file should be created if it does not exist.
	 * @return The created file handle
	 */
	public static FileHandle local(String filePath, boolean create) {
		return new FileHandle(filePath, LOCAL, create);
	}

	/**
	 * Creates a new absolute file handle. If the path is not absolute, it will be
	 * converted to an absolute path.
	 * If the file does not exist, it will be created.
	 * 
	 * @param filePath The path to the file
	 * @return The created file handle
	 */
	public static FileHandle absolute(String filePath) {
		return new FileHandle(filePath, ABSOLUTE, true);
	}

	/**
	 * Creates a new absolute file handle. If the path is not absolute, it will be
	 * converted to an absolute path.
	 * 
	 * @param filePath The path to the file
	 * @param create If the file should be created if it does not exist.
	 * @return The created file handle
	 */
	public static FileHandle absolute(String filePath, boolean create) {
		return new FileHandle(filePath, ABSOLUTE, create);
	}

}
