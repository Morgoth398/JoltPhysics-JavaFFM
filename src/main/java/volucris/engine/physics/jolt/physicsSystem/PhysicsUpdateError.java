package volucris.engine.physics.jolt.physicsSystem;

public enum PhysicsUpdateError {

	/**
	 * No errors.
	 */
	NONE(0),

	/**
	 * The manifold cache is full, this means that the total number of contacts
	 * between bodies is too high. Some contacts were ignored. Increase
	 * maxContactConstraints in {@link PhysicsSystemSettings}
	 */
	MANIFOLD_CACHE_FULL(1 << 0),

	/**
	 * The body pair cache is full, this means that too many bodies contacted. Some
	 * contacts were ignored. Increase maxBodyPairs in {@link PhysicsSystemSettings}
	 */
	BODY_PAIR_CACHE_FULL(1 << 1),

	/**
	 * The contact constraints buffer is full. Some contacts were ignored. Increase
	 * maxContactConstraints in {@link PhysicsSystemSettings}
	 */
	CONTACT_CONSTRAINTS_FULL(1 << 2);

	private int id;

	PhysicsUpdateError(int id) {
		this.id = id;
	}

	public int id() {
		return id;
	}

}
