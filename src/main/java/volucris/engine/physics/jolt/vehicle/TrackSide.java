package volucris.engine.physics.jolt.vehicle;

/**
 *  
 */
public enum TrackSide {
	/**
	 *  
	 */
	TRACK_SIDE_LEFT(0),

	/**
	 *  
	 */
	TRACK_SIDE_RIGHT(1);

	private int id;

	TrackSide(int id) {
		this.id = id;
	}

	public int id() {
		return id;
	}
}
