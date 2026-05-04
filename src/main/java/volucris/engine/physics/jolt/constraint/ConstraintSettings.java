package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class used to store the configuration of a constraint. Allows run-time
 * creation of constraints.
 */
public sealed class ConstraintSettings permits TwoBodyConstraintSettings, VehicleConstraintSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle ENABLED;
	private static final VarHandle CONSTRAINT_PRIORITY;
	private static final VarHandle NUM_VELOCITY_STEPS_OVERRIDE;
	private static final VarHandle NUM_POSITION_STEPS_OVERRIDE;
	private static final VarHandle DRAW_CONSTRAINT_SIZE;
	private static final VarHandle USER_DATA;

	private final MemorySegment jphConstraintSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_BOOLEAN.withName("enabled"),
		        MemoryLayout.paddingLayout(3),
		        JAVA_INT.withName("constraintPriority"),
		        JAVA_INT.withName("numVelocityStepsOverride"),
		        JAVA_INT.withName("numPositionStepsOverride"),
		        JAVA_FLOAT.withName("drawConstraintSize"),
		        MemoryLayout.paddingLayout(4),
		        JAVA_LONG.withName("userData")
			).withName("JPH_ConstraintSettings");
		//@formatter:on

		ENABLED = varHandle(LAYOUT, "enabled");
		CONSTRAINT_PRIORITY = varHandle(LAYOUT, "constraintPriority");
		NUM_VELOCITY_STEPS_OVERRIDE = varHandle(LAYOUT, "numVelocityStepsOverride");
		NUM_POSITION_STEPS_OVERRIDE = varHandle(LAYOUT, "numPositionStepsOverride");
		DRAW_CONSTRAINT_SIZE = varHandle(LAYOUT, "drawConstraintSize");
		USER_DATA = varHandle(LAYOUT, "userData");
	}

	protected ConstraintSettings(MemorySegment segment) {
		jphConstraintSettings = segment;
	}

	/**
	 * If this constraint is enabled initially. Use
	 * {@link Constraint#setEnabled(boolean)} to toggle after creation.
	 */
	public void setEnabled(boolean enabled) {
		ENABLED.set(jphConstraintSettings, enabled);
	}

	/**
	 * 
	 */
	public boolean isEnabled() {
		return (boolean) ENABLED.get(jphConstraintSettings);
	}

	/**
	 * Priority of the constraint when solving. Higher numbers are more likely to be
	 * solved correctly. Note that if you want a deterministic simulation and you
	 * cannot guarantee the order in which constraints are added/removed, you can
	 * make the priority for all constraints unique to get a deterministic ordering.
	 */
	public void setConstraintPriority(int priority) {
		CONSTRAINT_PRIORITY.set(jphConstraintSettings, priority);
	}

	/**
	 * @see #setConstraintPriority(int)
	 */
	public int getConstraintPriority() {
		return (int) CONSTRAINT_PRIORITY.get(jphConstraintSettings);
	}

	/**
	 * Used only when the constraint is active. Override for the number of solver
	 * velocity iterations to run, 0 means use the default in
	 * {@link PhysicsSettings#setNumVelocitySteps(int)}. The number of iterations to
	 * use is the max of all contacts and constraints in the island.
	 */
	public void setNumVelocityStepsOverride(int override) {
		NUM_VELOCITY_STEPS_OVERRIDE.set(jphConstraintSettings, override);
	}

	/**
	 * @see #setNumVelocityStepsOverride(int)
	 */
	public int getNumVelocityStepsOverride() {
		return (int) NUM_VELOCITY_STEPS_OVERRIDE.get(jphConstraintSettings);
	}

	/**
	 * Used only when the constraint is active. Override for the number of solver
	 * position iterations to run, 0 means use the default in
	 * {@link PhysicsSettings#setNumPositionSteps(int)}. The number of iterations to
	 * use is the max of all contacts and constraints in the island.
	 */
	public void setNumPositionStepsOverride(int override) {
		NUM_POSITION_STEPS_OVERRIDE.set(jphConstraintSettings, override);
	}

	/**
	 * @see #setNumPositionStepsOverride(int)
	 */
	public int getNumPositionStepsOverride() {
		return (int) NUM_POSITION_STEPS_OVERRIDE.get(jphConstraintSettings);
	}

	/**
	 * Size of constraint when drawing it through the debug renderer.
	 */
	public void setDrawConstraintSize(float size) {
		DRAW_CONSTRAINT_SIZE.set(jphConstraintSettings, size);
	}

	/**
	 * Size of constraint when drawing it through the debug renderer.
	 */
	public float getDrawConstraintSize() {
		return (float) DRAW_CONSTRAINT_SIZE.get(jphConstraintSettings);
	}

	/**
	 * User data value (can be used by application)
	 */
	public void setUserData(long userData) {
		USER_DATA.set(jphConstraintSettings, userData);
	}

	/**
	 * User data value (can be used by application)
	 */
	public long getUserData() {
		return (long) USER_DATA.get(jphConstraintSettings);
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
