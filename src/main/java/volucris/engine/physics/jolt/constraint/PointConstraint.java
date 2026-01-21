package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.constraint.ConstraintEnums.ConstraintSpace;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * A point constraint constrains 2 bodies on a single point (removing 3 degrees
 * of freedom)
 */
public final class PointConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_POINT_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_POINT_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_POINT_CONSTRAINT_SET_POINT1;
	private static final MethodHandle JPH_POINT_CONSTRAINT_SET_POINT2;
	private static final MethodHandle JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1;
	private static final MethodHandle JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2;
	private static final MethodHandle JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;

	static {
		//@formatter:off
		JPH_POINT_CONSTRAINT_CREATE = downcallHandle("JPH_PointConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_POINT_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_PointConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_POINT_CONSTRAINT_SET_POINT1 = downcallHandleVoid("JPH_PointConstraint_SetPoint1", ADDRESS, JAVA_INT, ADDRESS);
		JPH_POINT_CONSTRAINT_SET_POINT2 = downcallHandleVoid("JPH_PointConstraint_SetPoint2", ADDRESS, JAVA_INT, ADDRESS);
		JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1 = downcallHandleVoid("JPH_PointConstraint_GetLocalSpacePoint1", ADDRESS, ADDRESS);
		JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2 = downcallHandleVoid("JPH_PointConstraint_GetLocalSpacePoint2", ADDRESS, ADDRESS);
		JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_PointConstraint_GetTotalLambdaPosition", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected PointConstraint(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected PointConstraint(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	public PointConstraint(PointConstraintSettings settings, Body body1, Body body2) {
		this(settings, body1, body2, Arena.ofAuto());
	}

	public PointConstraint(PointConstraintSettings settings, Body body1, Body body2, Arena arena) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_POINT_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create point constraint: " + className);
		}
		super(segment, arena);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public PointConstraintSettings getSettings(PointConstraintSettings target) {
		try {
			MethodHandle method = JPH_POINT_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get settings: " + className);
		}
	}

	/**
	 * @see #getSettings(PointConstraintSettings)
	 */
	public PointConstraintSettings getSettings() {
		return getSettings(new PointConstraintSettings());
	}

	/**
	 * Update the attachment point for body 1.
	 */
	public void setPoint1(ConstraintSpace space, Vector3f point) {
		try {
			vecTmp.set(point);

			MethodHandle method = JPH_POINT_CONSTRAINT_SET_POINT1;
			method.invokeExact(jphConstraint, space.id(), vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set point 1: " + className);
		}
	}

	/**
	 * Update the attachment point for body 2.
	 */
	public void setPoint2(ConstraintSpace space, Vector3f point) {
		try {
			vecTmp.set(point);

			MethodHandle method = JPH_POINT_CONSTRAINT_SET_POINT2;
			method.invokeExact(jphConstraint, space.id(), vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set point 2: " + className);
		}
	}

	/**
	 * Get the attachment point for body 1 relative to body 1 COM (transform by
	 * {@link Body#getCenterOfMassTransform()} to take to world space)
	 */
	public Vector3f getLocalSpacePoint1(Vector3f target) {
		try {
			MethodHandle method = JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get local space point 1: " + className);
		}
	}

	/**
	 * @see #getLocalSpacePoint1(Vector3f)
	 */
	public Vector3f getLocalSpacePoint1() {
		return getLocalSpacePoint1(new Vector3f());
	}

	/**
	 * Get the attachment point for body 2 relative to body 2 COM (transform by
	 * {@link Body#getCenterOfMassTransform()} to take to world space)
	 */
	public Vector3f getLocalSpacePoint2(Vector3f target) {
		try {
			MethodHandle method = JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get local space point 2: " + className);
		}
	}

	/**
	 * @see #getLocalSpacePoint2(Vector3f)
	 */
	public Vector3f getLocalSpacePoint2() {
		return getLocalSpacePoint2(new Vector3f());
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear impulse applied
	 * to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get total lambda position: " + className);
		}
	}

	/**
	 * Get Lagrange multiplier from last physics update (the linear impulse applied
	 * to satisfy the constraint)
	 */
	public Vector3f getTotalLambdaPosition() {
		return getTotalLambdaPosition(new Vector3f());
	}

}