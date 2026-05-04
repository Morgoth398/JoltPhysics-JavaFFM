package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.MemorySegment;

public abstract sealed class TwoBodyConstraintSettings extends ConstraintSettings permits ConeConstraintSettings,
		DistanceConstraintSettings, FixedConstraintSettings, GearConstraintSettings, HingeConstraintSettings,
		PointConstraintSettings, SixDOFConstraintSettings, SliderConstraintSettings, SwingTwistConstraintSettings {

	protected TwoBodyConstraintSettings(MemorySegment segment) {
		super(segment);
	}

}
