package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A gear constraint constrains the rotation of body1 to the rotation of body 2
 * using a gear. Note that this constraint needs to be used in conjunction with
 * a two hinge constraints.
 */
public final class GearConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_GEAR_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_GEAR_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS;
	private static final MethodHandle JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA;

	static {
		//@formatter:off
		JPH_GEAR_CONSTRAINT_CREATE = downcallHandle("JPH_GearConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_GEAR_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_GearConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS = downcallHandleVoid("JPH_GearConstraint_SetConstraints", ADDRESS, ADDRESS, ADDRESS);
		JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA = downcallHandle("JPH_GearConstraint_GetTotalLambda", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected GearConstraint(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}
	
	protected GearConstraint(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}
	
	public GearConstraint(GearConstraintSettings settings, Body body1, Body body2) {
		this(settings, body1, body2, Arena.ofAuto());
	}
	
	public GearConstraint(GearConstraintSettings settings, Body body1, Body body2, Arena arena) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_GEAR_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create gear constraint.");
		}
		super(segment, arena);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public GearConstraintSettings getSettings(GearConstraintSettings target) {
		try {
			MethodHandle method = JPH_GEAR_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get settings.");
		}
	}

	/**
	 * @see #getSettings(GearConstraintSettings)
	 */
	public GearConstraintSettings getSettings() {
		return getSettings(new GearConstraintSettings());
	}

	/**
	 * The constraints that constrain both gears (2 hinges), optional and used to
	 * calculate the rotation error and fix numerical drift.
	 */
	public void setConstraints(Constraint gear1, Constraint gear2) {
		try {
			MethodHandle method = JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS;
			method.invokeExact(jphConstraint, gear1.memorySegment(), gear2.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set constraints.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the angular impulse applied
	 * to satisfy the constraint).
	 */
	public float getTotalLambda() {
		try {
			MethodHandle method = JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda.");
		}
	}

}