package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A swing twist constraint is a specialized constraint for humanoid ragdolls
 * that allows limited rotation only.
 * <p>
 * See {@link SwingTwistConstraintSettings} for a description of the limits. 
 */
public final class SwingTwistConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE;
	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST;
	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y;
	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z;
	private static final MethodHandle JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;

	static {
		//@formatter:off
		JPH_SWING_TWIST_CONSTRAINT_CREATE = downcallHandle("JPH_SwingTwistConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_SwingTwistConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE = downcallHandle("JPH_SwingTwistConstraint_GetNormalHalfConeAngle", JAVA_FLOAT, ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_SwingTwistConstraint_GetTotalLambdaPosition", ADDRESS, ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaTwist", JAVA_FLOAT, ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaSwingY", JAVA_FLOAT, ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z = downcallHandle("JPH_SwingTwistConstraint_GetTotalLambdaSwingZ", JAVA_FLOAT, ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR = downcallHandleVoid("JPH_SwingTwistConstraint_GetTotalLambdaMotor", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected SwingTwistConstraint(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}
	
	public SwingTwistConstraint(SwingTwistConstraintSettings settings, Body body1, Body body2) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create SwingTwistConstraint.");
		}
		super(segment);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public SwingTwistConstraintSettings getSettings(SwingTwistConstraintSettings target) {
		try {
			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());

			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get settings.");
		}
	}

	/**
	 * @see #getSettings(SwingTwistConstraintSettings)
	 */
	public SwingTwistConstraintSettings getSettings() {
		return getSettings(new SwingTwistConstraintSettings());
	}

	/**
	 * 
	 */
	public float getNormalHalfConeAngle() {
		try {
			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_NORMAL_HALF_CONE_ANGLE;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get normal half cone angle.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda position.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaPosition() {
		return getTotalLambdaPosition(new Vector3f());
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public float getTotalLambdaTwist() {
		try {
			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_TWIST;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda twist.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public float getTotalLambdaSwingY() {
		try {
			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Y;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda swing Y.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public float getTotalLambdaSwingZ() {
		try {
			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_SWING_Z;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda swing Z.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaMotor(Vector3f target) {
		try {
			MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_GET_TOTAL_LAMBDA_MOTOR;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda motor.");
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear/angular impulse
	 * applied to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaMotor() {
		return getTotalLambdaMotor(new Vector3f());
	}

}