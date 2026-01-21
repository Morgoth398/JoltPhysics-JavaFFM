package volucris.engine.physics.jolt.utils;

public final class JoltRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 5110412887151439333L;

	public JoltRuntimeException(String message) {
		super(message);
	}

	public JoltRuntimeException(Throwable throwable) {
		super(throwable);
	}

	public JoltRuntimeException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
