package volucris.engine.utils;

import java.io.Closeable;

public final class VolucrisUtils {

	private VolucrisUtils() {

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
