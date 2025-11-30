package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A fixed constraint welds two bodies together removing all degrees of freedom
 * between them. This variant uses Euler angles for the rotation constraint.
 */
public final class FixedConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_FIXED_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_FIXED_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final MethodHandle JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;

	static {
		//@formatter:off
		JPH_FIXED_CONSTRAINT_CREATE = downcallHandle("JPH_FixedConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_FIXED_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_FixedConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_FixedConstraint_GetTotalLambdaPosition", ADDRESS, ADDRESS);
		JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandleVoid("JPH_FixedConstraint_GetTotalLambdaRotation", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected FixedConstraint(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}
	
	public FixedConstraint(FixedConstraintSettings settings, Body body1, Body body2) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_FIXED_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create fixed constraint.");
		}
		super(segment);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public FixedConstraintSettings getSettings(FixedConstraintSettings target) {
		try {
			MethodHandle method = JPH_FIXED_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get settings.");
		}
	}

	/**
	 * @see #getSettings(FixedConstraintSettings)
	 */
	public FixedConstraintSettings getSettings() {
		return getSettings(new FixedConstraintSettings());
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda position.");
		}
	}

	/**
	 * @see #getTotalLambdaPosition(Vector3f)
	 */
	public Vector3f getTotalLambdaPosition() {
		return getTotalLambdaPosition(new Vector3f());
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaRotation(Vector3f target) {
		try {
			MethodHandle method = JPH_FIXED_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda rotation.");
		}
	}

	/**
	 * @see #getTotalLambdaRotation()
	 */
	public Vector3f getTotalLambdaRotation() {
		return getTotalLambdaRotation(new Vector3f());
	}

}