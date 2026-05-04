package volucris.engine.physics.jolt.body;

import volucris.engine.physics.jolt.MassProperties;

public final class BodyEnums {

	private BodyEnums() {

	}

	public enum BodyType {

		/**
		 * Rigid body consisting of a rigid shape.
		 */
		RIGID_BODY(0),

		/**
		 * Soft body consisting of a deformable shape.
		 */
		SOFT_BODY(1);

		private int id;

		BodyType(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

	public enum MotionQuality {

		/**
		 * Update the body in discrete steps. Body will tunnel through thin objects if
		 * its velocity is high enough. This is the cheapest way of simulating a body.
		 */
		DISCRETE(0),

		/**
		 * Update the body using linear casting. When stepping the body, its collision
		 * shape is cast from start to destination using the starting rotation. The body
		 * will not be able to tunnel through thin objects at high velocity, but
		 * tunneling is still possible if the body is long and thin and has high angular
		 * velocity. Time is stolen from the object (which means it will move up to the
		 * first collision and will not bounce off the surface until the next
		 * integration step). This will make the body appear to go slower when it
		 * collides with high velocity. In order to not get stuck, the body is always
		 * allowed to move by a fraction of it's inner radius, which may eventually lead
		 * it to pass through geometry.
		 * <p>
		 * Note that if you're using a collision listener, you can receive contact
		 * added/persisted notifications of contacts that may in the end not happen.
		 * This happens between bodies that are using casting: If bodies A and B collide
		 * at t1 and B and C collide at t2 where {@code t2 < t1} and A and C don't
		 * collide. In this case you may receive an incorrect contact point added
		 * callback between A and B (which will be removed the next frame).
		 */
		LINEAR_CAST(1);

		private int id;

		MotionQuality(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

	public enum MotionType {

		/**
		 * Non movable.
		 */
		STATIC(0),

		/**
		 * Movable using velocities only, does not respond to forces.
		 */
		KINEMATIC(1),

		/**
		 * Responds to forces as a normal physics object.
		 */
		DYNAMIC(2);

		private int id;

		MotionType(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

	public enum OverrideMassProperties {

		/**
		 * Tells the system to calculate the mass and inertia based on density.
		 */
		CALCULATE_MASS_AND_INERTIA(0),

		/**
		 * Tells the system to take the mass from massPropertiesOverride and to
		 * calculate the inertia based on density of the shapes and to scale it to the
		 * provided mass.
		 */
		CALCULATE_INERTIA(1),

		/**
		 * Tells the system to take the mass and inertia from
		 * {@link BodyCreationSettings#setMassPropertiesOverride(MassProperties)}
		 */
		MASS_AND_INERTIA_PROVIDED(2);

		private int id;

		OverrideMassProperties(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

}
