package volucris.bindings.core;

import edu.umd.cs.findbugs.annotations.Nullable;

public final class NativeLibraryLoaderConfig {

	public static final NativeLibraryLoaderConfig SHARED_LIBRARY_EXTRACT_PATH = new NativeLibraryLoaderConfig(
			"volucris.bindings.sharedLibraryExtractPath");
	public static final NativeLibraryLoaderConfig SHARED_LIBRARY_EXTRACT_DIRECTORY = new NativeLibraryLoaderConfig(
			"volucris.bindings.sharedLibraryExtractDirectory");

	private final String propertyName;

	private @Nullable String value;

	public NativeLibraryLoaderConfig(String propertyName) {
		this.propertyName = propertyName;
		this.value = System.getProperty(propertyName);
	}

	public final String getPropertyName() {
		return propertyName;
	}

	public final void setValue(@Nullable String value) {
		this.value = value;
	}

	public @Nullable String getValue() {
		return value;
	}

	public String getValueOrDefault(String defaultValue) {
		if (value == null)
			return defaultValue;

		return value;
	}

}
