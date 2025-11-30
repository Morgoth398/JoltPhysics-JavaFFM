package volucris.engine.physics.jolt.constraint;

import volucris.engine.physics.jolt.shape.Shape;

public final class ConstraintEnums {

	private ConstraintEnums() {

	}

	/**
	 * Enum to identify constraint type.
	 */
	public enum ConstraintType {
		CONSTRAINT(0), TWO_BODY_CONSTRAINT(1);

		private int id;

		ConstraintType(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum ConstraintSubType {
		FIXED(0), POINT(1), HINGE(2), SLIDER(3), DISTANCE(4), CONE(5), SWING_TWIST(6), SIX_DOF(7), PATH(8), VEHCILE(9),
		RACK_AND_PINION(10), GEAR(11), PULLEY(12), USER_1(13), USER_2(14), USER_3(15), USER_4(16);

		private int id;

		ConstraintSubType(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum ConstraintSpace {

		/**
		 * All constraint properties are specified in local space to center of mass of
		 * the bodies that are being constrained (so e.g. 'constraint position 1' will
		 * be local to body 1 COM, 'constraint position 2' will be local to body 2 COM).
		 * Note that this means you need to subtract {@link Shape#getCenterOfMass()}
		 * from positions!
		 */
		LOCAL_TO_BODY_COM(0),

		/**
		 * All constraint properties are specified in world space.
		 */
		WORLD_SPACE(1);

		private int id;

		ConstraintSpace(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

	public enum SpringMode {

		/**
		 * Frequency and damping are specified.
		 */
		FREQUENCY_AND_DAMPING(0),

		/**
		 * Stiffness and damping are specified.
		 */
		STIFFNESS_AND_DAMPING(1);

		private int id;

		SpringMode(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	public enum SwingType {

		/**
		 * Swing is limited by a cone shape, note that this cone starts to deform for
		 * larger swing angles. Cone limits only support limits that are symmetric
		 * around 0.
		 */
		CONE(0),

		/**
		 * Swing is limited by a pyramid shape, note that this pyramid starts to deform
		 * for larger swing angles.
		 */
		PYRAMID(1);

		private int id;

		SwingType(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

	/**
	 * Constraint is split up into translation/rotation around X, Y and Z axis.
	 */
	public enum SixDOFConstraintAxis {

		TRANSLATION_X(0), TRANSLATION_Y(1), TRANSLATION_Z(2), ROTATION_X(3), ROTATION_Y(4), ROTATION_Z(5);

		private int id;

		SixDOFConstraintAxis(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}

	}

	public enum MotorState {
		/**
		 * Motor is off.
		 */
		OFF(0),

		/**
		 * Motor will drive to target velocity.
		 */
		VELOCITY(1),

		/**
		 * Motor will drive to target position.
		 */
		POSITION(2);

		private int id;

		MotorState(int id) {
			this.id = id;
		}

		public int id() {
			return id;
		}
	}

}
