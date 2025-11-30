package volucris.engine.utils;

public final class VolucrisRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 5110412887151439333L;

	public VolucrisRuntimeException (String message) {
		super(message);
	}

	public VolucrisRuntimeException (Throwable throwable) {
		super(throwable);
	}

	public VolucrisRuntimeException (String message, Throwable throwable) {
		super(message, throwable);
	}	
}
