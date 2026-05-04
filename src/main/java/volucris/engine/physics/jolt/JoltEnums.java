package volucris.engine.physics.jolt;

public final class JoltEnums {

	private JoltEnums() {

	}

	public enum Activation {

		/**
		 * Activate the body, making it part of the simulation.
		 */
		ACTIVATE(0),

		/**
		 * Leave activation state as it is (will not deactivate an active body)
		 */
		DONT_ACTIVATE(1);

		private int id;

		Activation(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum AllowedDOFs {

		/**
		 * All degrees of freedom are allowed.
		 */
		ALL(0b111111),

		/**
		 * Body can move in world space X axis.
		 */
		TRANSLATION_X(0b000001),

		/**
		 * Body can move in world space Y axis.
		 */
		TRANSLATION_Y(0b000010),

		/**
		 * Body can move in world space Z axis.
		 */
		TRANSLATION_Z(0b000100),

		/**
		 * Body can rotate around world space X axis.
		 */
		ROTATION_X(0b001000),

		/**
		 * Body can rotate around world space Y axis.
		 */
		ROTATION_Y(0b010000),

		/**
		 * Body can rotate around world space Z axis.
		 */
		ROTATION_Z(0b100000),

		/**
		 * Body can only move in X and Y axis and rotate around Z axis.
		 */
		PLANE_2D(0b100011);

		private int id;

		AllowedDOFs(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

	public enum BackFaceMode {

		/**
		 * Ignore collision with back facing surfaces/triangles.
		 */
		IGNORE_BACK_FACE(0),

		/**
		 * Collide with back facing surfaces/triangles.
		 */
		COLLIDE_WITH_BACK_FACE(1);

		private int id;

		BackFaceMode(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

	public enum ActiveEdgeMode {

		/**
		 * Do not collide with inactive edges. For physics simulation, this gives less
		 * ghost collisions
		 */
		COLLIDE_ONLY_WITH_ACTIVE(0),

		/**
		 * Collide with all edges. Use this when you're interested in all collisions.
		 */
		COLLIDE_WITH_ALL(1);

		private int id;

		ActiveEdgeMode(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum CollectFacesMode {

		/**
		 * shape1/2Face is desired
		 */
		COLLECT_FACES(0),

		/**
		 * shape1/2Face is not desired
		 */
		NO_FACES(1);

		private int id;

		CollectFacesMode(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum ValidateResult {

		/**
		 * Accept this and any further contact points for this body pair.
		 */
		ACCEPT_ALL_CONTACTS_FOR_THIS_BODY_PAIR(0),

		/**
		 * Accept this contact only (and continue calling this callback for every
		 * contact manifold for the same body pair)
		 */
		ACCEPT_CONTACT(1),

		/**
		 * Reject this contact only (but process any other contact manifolds for the
		 * same body pair)
		 */
		REJECT_CONTACT(2),

		/**
		 * Rejects this and any further contact points for this body pair.
		 */
		REJECT_ALL_CONTACTS_FOR_THIS_BODY_PAIR(3);

		private int id;

		ValidateResult(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum CastShadow {

		/**
		 * This shape should cast a shadow.
		 */
		ON(0),

		/**
		 * This shape should not cast a shadow
		 */
		OFF(1);

		private int id;

		CastShadow(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum DrawMode {

		/**
		 * Draw as a solid shape.
		 */
		SOLID(0),

		/**
		 * Draw as wireframe.
		 */
		WIREFRAME(1);

		private int id;

		DrawMode(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum ShapeColor {
		/**
		 * Random color per instance
		 */
		INSTANCE_COLOR(0),
		/**
		 * Convex = green, scaled = yellow, compound = orange, mesh = red
		 */
		SHAPE_TYPE_COLOR(1),
		/**
		 * Static = grey, keyframed = green, dynamic = random color per instance
		 */
		MOTION_TYPE_COLOR(2),

		/**
		 * Static = grey, keyframed = green, dynamic = yellow, sleeping = red
		 */
		SLEEP_COLOR(3),

		/**
		 * Static = grey, active = random color per island, sleeping = light grey
		 */
		ISLAND_COLOR(4),

		/**
		 * Color as defined by the PhysicsMaterial of the shape
		 */
		MATERIAL_COLOR(5);

		private int id;

		ShapeColor(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum SoftBodyConstraintColor {

		/**
		 * Draw different types of constraints in different colors
		 */
		CONSTRAINT_TYPE(0),

		/**
		 * Draw constraints in the same group in the same color, non-parallel group will
		 * be red
		 */
		CONSTRAINT_GROUP(1),

		/**
		 * Draw constraints in the same group in the same color, non-parallel group will
		 * be red, and order within each group will be indicated with gradient
		 */
		CONSTRAINT_ORDER(2);

		private int id;

		SoftBodyConstraintColor(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

}
