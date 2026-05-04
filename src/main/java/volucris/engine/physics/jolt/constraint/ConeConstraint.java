package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A cone constraint constraints 2 bodies to a single point and limits the swing
 * between the twist axis within a cone:
 * <p>
 * t1 . t2 <= cos(theta)
 * <p>
 * Where:
 * <p>
 * t1 = twist axis of body 1. t2 = twist axis of body 2. theta = half cone angle
 * (angle from the principal axis of the cone to the edge).
 * <p>
 * Calculating the Jacobian:
 * <p>
 * Constraint equation:
 * <p>
 * C = t1 . t2 - cos(theta)
 * <p>
 * Derivative:
 * <p>
 * d/dt C = d/dt (t1 . t2) = (d/dt t1) . t2 + t1 . (d/dt t2) = (w1 x t1) . t2 +
 * t1 . (w2 x t2) = (t1 x t2) . w1 + (t2 x t1) . w2
 * <p>
 * d/dt C = J v = [0, -t2 x t1, 0, t2 x t1] [v1, w1, v2, w2]
 * <p>
 * Where J is the Jacobian.
 * <p>
 * Note that this is the exact same equation as used in AngleConstraintPart if
 * we use t2 x t1 as the world space axis
 * 
 */
public final class ConeConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_CONE_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_CONE_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE;
	private static final MethodHandle JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE;
	private static final MethodHandle JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final MethodHandle JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;

	static {
		//@formatter:off
		JPH_CONE_CONSTRAINT_CREATE = downcallHandle("JPH_ConeConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_CONE_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_ConeConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE = downcallHandleVoid("JPH_ConeConstraint_SetHalfConeAngle", ADDRESS, JAVA_FLOAT);
		JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE = downcallHandle("JPH_ConeConstraint_GetCosHalfConeAngle", JAVA_FLOAT, ADDRESS);
		JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_ConeConstraint_GetTotalLambdaPosition", ADDRESS, ADDRESS);
		JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandle("JPH_ConeConstraint_GetTotalLambdaRotation", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected ConeConstraint(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}
	
	/**
	 * Construct cone constraint.
	 */
	public ConeConstraint(ConeConstraintSettings settings, Body body1, Body body2) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_CONE_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create cone constraint.");
		}
		super(segment);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public ConeConstraintSettings getSettings(ConeConstraintSettings target) {
		try {
			MethodHandle method = JPH_CONE_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get settings.");
		}
	}

	/**
	 * @see #getSettings(ConeConstraintSettings)
	 */
	public ConeConstraintSettings getSettings() {
		return getSettings(new ConeConstraintSettings());
	}

	/**
	 * Update maximum angle between body 1 and 2.
	 * 
	 * @see ConeConstraintSettings
	 */
	public void setHalfConeAngle(float halfConeAngle) {
		try {
			MethodHandle method = JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE;
			method.invokeExact(jphConstraint, halfConeAngle);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set half cone angle.");
		}
	}

	public float getCosHalfConeAngle() {
		try {
			MethodHandle method = JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get cos half cone angle.");
		}
	}

	public Vector3f getTotalLambdaPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get tota lLambda position.");
		}
	}

	public float getTotalLambdaRotation() {
		try {
			MethodHandle method = JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda rotation.");
		}
	}

}