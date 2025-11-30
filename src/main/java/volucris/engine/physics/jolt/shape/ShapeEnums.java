package volucris.engine.physics.jolt.shape;

public final class ShapeEnums {

	private ShapeEnums() {

	}

	public enum ShapeType {

		/**
		 * Used by ConvexShape, all shapes that use the generic convex vs convex
		 * collision detection system (box, sphere, capsule, tapered capsule, cylinder,
		 * triangle)
		 */
		CONVEX(0),

		/**
		 * Used by CompoundShape.
		 */
		COMPOUND(1),

		/**
		 * Used by DecoratedShape.
		 */
		DECORATED(2),

		/**
		 * Used by MeshShape.
		 */
		MESH(3),

		/**
		 * Used by HeightFieldShape.
		 */
		HEIGHT_FIELD(4),

		/**
		 * Used by SoftBodyShape.
		 */
		SOFT_BODY(5),

		/**
		 * 
		 */
		USER_1(6),

		/**
		 * 
		 */
		USER_2(7),

		/**
		 * 
		 */
		USER_3(8),

		/**
		 * 
		 */
		USER_4(9);

		private int id;

		ShapeType(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum ShapeSubType {

		SPHERE(0), BOX(1), TRIANGLE(2), CAPSULE(3), TAPERED_CAPSULE(4), CYLINDER(5), CONVEX_HULL(6), STATIC_COMPUND(7),
		MUTABLE_COMPOUND(8), ROTATED_TRANSLATED(9), SCALED(10), OFFSET_CENTER_OF_MASS(11), MESH(12), HEIGHT_FIELD(13),
		SOFT_BODY(14);

		private int id;

		ShapeSubType(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum BuildQuality {

		/**
		 * Favor runtime performance, takes more time to build the MeshShape but
		 * performs better.
		 */
		FAVOR_RUNTIME_PERFORMANCE(0),

		/**
		 * Favor build speed, build the tree faster but the MeshShape will be slower.
		 */
		FAVOR_BUILD_SPEED(1);

		private int id;

		BuildQuality(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

}
