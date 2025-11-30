package volucris.engine.physics.jolt.raycast;

public enum CollisionCollectorType {

	ALL_HIT(0), ALL_HIT_SORTED(1), CLOSEST_HIT(2), ANY_HIT(3);

	private int id;

	CollisionCollectorType(int id) {
		this.id = id;
	}

	public int id() {
		return id;
	}

}
