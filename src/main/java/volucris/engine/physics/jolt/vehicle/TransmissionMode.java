package volucris.engine.physics.jolt.vehicle;

public enum TransmissionMode {

	/**
	 * Automatically shift gear up and down.
	 */
	AUTO(0),

	/**
	 * Manual gear shift (call SetTransmissionInput)
	 */
	MANUAL(1);

	private int id;

	TransmissionMode(int id) {
		this.id = id;
	}

	public int id() {
		return id;
	}

}
