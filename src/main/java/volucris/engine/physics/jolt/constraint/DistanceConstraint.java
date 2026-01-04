package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * This constraint is a stiff spring that holds 2 points at a fixed distance
 * from each other.
 */
public final class DistanceConstraint extends TwoBodyConstraint {

	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_GET_SETTINGS;
	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_SET_DISTANCE;
	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE;
	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE;
	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
	private static final MethodHandle JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;

	static {
		//@formatter:off
		JPH_DISTANCE_CONSTRAINT_CREATE = downcallHandle("JPH_DistanceConstraint_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_DISTANCE_CONSTRAINT_GET_SETTINGS = downcallHandleVoid("JPH_DistanceConstraint_GetSettings", ADDRESS, ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SET_DISTANCE = downcallHandleVoid("JPH_DistanceConstraint_SetDistance", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE = downcallHandle("JPH_DistanceConstraint_GetMinDistance", JAVA_FLOAT, ADDRESS);
		JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE = downcallHandle("JPH_DistanceConstraint_GetMaxDistance", JAVA_FLOAT, ADDRESS);
		JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_DistanceConstraint_GetLimitsSpringSettings", ADDRESS, ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_DistanceConstraint_SetLimitsSpringSettings", ADDRESS, ADDRESS);
		JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandle("JPH_DistanceConstraint_GetTotalLambdaPosition", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected DistanceConstraint(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}
	
	protected DistanceConstraint(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}
	
	/**
	 * Construct distance constraint.
	 */
	public DistanceConstraint(DistanceConstraintSettings settings, Body body1, Body body2) {
		this(settings, body1, body2, Arena.ofAuto());
	}
	
	/**
	 * Construct distance constraint.
	 */
	public DistanceConstraint(DistanceConstraintSettings settings, Body body1, Body body2, Arena arena) {
		MemorySegment segment;
		try {
			MemorySegment settingsAddr = settings.memorySegment();
			MemorySegment body1Addr = body1.memorySegment();
			MemorySegment body2Addr = body2.memorySegment();

			MethodHandle method = JPH_DISTANCE_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(settingsAddr, body1Addr, body2Addr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create distance constraint.");
		}
		super(segment, arena);
	}

	/**
	 * Debug function to convert a constraint to its settings, note that this will
	 * not save to which bodies the constraint is connected to.
	 */
	public DistanceConstraintSettings getSettings(DistanceConstraintSettings target) {
		try {
			MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get settings.");
		}
	}

	/**
	 * @see #getSettings(DistanceConstraintSettings)
	 */
	public DistanceConstraintSettings getSettings() {
		return getSettings(new DistanceConstraintSettings());
	}

	/**
	 * Update the minimum and maximum distance for the constraint. 
	 */
	public void setDistance(float minDistance, float maxDistance) {
		try {
			MethodHandle method = JPH_DISTANCE_CONSTRAINT_SET_DISTANCE;
			method.invokeExact(jphConstraint, minDistance, maxDistance);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set distance.");
		}
	}

	/**
	 * 
	 */
	public float getMinDistance() {
		try {
			MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get min distance.");
		}
	}

	/**
	 * 
	 */
	public float getMaxDistance() {
		try {
			MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get max distance.");
		}
	}

	/**
	 * 
	 */
	public SpringSettings getLimitsSpringSettings(SpringSettings target) {
		try {
			MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
			method.invokeExact(jphConstraint, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get limits spring settings.");
		}
	}

	/**
	 * 
	 */
	public SpringSettings getLimitsSpringSettings() {
		return getLimitsSpringSettings(new SpringSettings());
	}

	/**
	 * Update the limits spring settings. 
	 */
	public void setLimitsSpringSettings(SpringSettings settings) {
		try {
			MethodHandle method = JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
			method.invokeExact(jphConstraint, settings.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set limits spring settings.");
		}
	}

	/**
	 * 
	 */
	public float getTotalLambdaPosition() {
		try {
			MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
			return (float) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get total lambda position.");
		}
	}

}