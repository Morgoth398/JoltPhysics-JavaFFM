package volucris.engine.physics.jolt.character;

public enum GroundState {

	/**
	 * Character is on the ground and can move freely.
	 */
	ON_GROUND(0),

	/**
	 * Character is on a slope that is too steep and can't climb up any further. The
	 * caller should start applying downward velocity if sliding from the slope is
	 * desired.
	 */
	ON_STEEP_GROUND(1),

	/**
	 * Character is touching an object, but is not supported by it and should fall.
	 * The GetGroundXXX functions will return information about the touched object.
	 */
	NOT_SUPPORTED(2),

	/**
	 * Character is in the air and is not touching anything.
	 */
	IN_AIR(3);

	private int id;

	GroundState(int id) {
		this.id = id;
	}

	public int id() {
		return id;
	}

}
