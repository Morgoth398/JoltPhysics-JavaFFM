package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Base class for runtime data for a wheel, each VehicleController can implement
 * a derived class of this.
 */
public sealed class Wheel permits WheelTV, WheelWV {

	private static final MethodHandle JPH_WHEEL_CREATE;
	private static final MethodHandle JPH_WHEEL_DESTROY;
	private static final MethodHandle JPH_WHEEL_GET_SETTINGS;
	private static final MethodHandle JPH_WHEEL_GET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_WHEEL_SET_ANGULAR_VELOCITY;
	private static final MethodHandle JPH_WHEEL_GET_ROTATION_ANGLE;
	private static final MethodHandle JPH_WHEEL_SET_ROTATION_ANGLE;
	private static final MethodHandle JPH_WHEEL_GET_STEER_ANGLE;
	private static final MethodHandle JPH_WHEEL_SET_STEER_ANGLE;
	private static final MethodHandle JPH_WHEEL_HAS_CONTACT;
	private static final MethodHandle JPH_WHEEL_GET_CONTACT_BODY_ID;
	private static final MethodHandle JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID;
	private static final MethodHandle JPH_WHEEL_GET_CONTACT_POSITION;
	private static final MethodHandle JPH_WHEEL_GET_CONTACT_POINT_VELOCITY;
	private static final MethodHandle JPH_WHEEL_GET_CONTACT_NORMAL;
	private static final MethodHandle JPH_WHEEL_GET_CONTACT_LONGITUDINAL;
	private static final MethodHandle JPH_WHEEL_GET_CONTACT_LATERAL;
	private static final MethodHandle JPH_WHEEL_GET_SUSPENSION_LENGTH;
	private static final MethodHandle JPH_WHEEL_GET_SUSPENSION_LAMBDA;
	private static final MethodHandle JPH_WHEEL_GET_LONGITUDINAL_LAMBDA;
	private static final MethodHandle JPH_WHEEL_GET_LATERAL_LAMBDA;
	private static final MethodHandle JPH_WHEEL_HAS_HIT_HARD_POINT;

	protected final MemorySegment jphWheel;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_WHEEL_CREATE = downcallHandle("JPH_Wheel_Create", ADDRESS, ADDRESS);
		JPH_WHEEL_DESTROY = downcallHandleVoid("JPH_Wheel_Destroy", ADDRESS);
		JPH_WHEEL_GET_SETTINGS = downcallHandle("JPH_Wheel_GetSettings", ADDRESS, ADDRESS);
		JPH_WHEEL_GET_ANGULAR_VELOCITY = downcallHandle("JPH_Wheel_GetAngularVelocity", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Wheel_SetAngularVelocity", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_GET_ROTATION_ANGLE = downcallHandle("JPH_Wheel_GetRotationAngle", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SET_ROTATION_ANGLE = downcallHandleVoid("JPH_Wheel_SetRotationAngle", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_GET_STEER_ANGLE = downcallHandle("JPH_Wheel_GetSteerAngle", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SET_STEER_ANGLE = downcallHandleVoid("JPH_Wheel_SetSteerAngle", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_HAS_CONTACT = downcallHandle("JPH_Wheel_HasContact", JAVA_BOOLEAN, ADDRESS);
		JPH_WHEEL_GET_CONTACT_BODY_ID = downcallHandle("JPH_Wheel_GetContactBodyID", JAVA_INT, ADDRESS);
		JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID = downcallHandle("JPH_Wheel_GetContactSubShapeID", JAVA_INT, ADDRESS);
		JPH_WHEEL_GET_CONTACT_POSITION = downcallHandleVoid("JPH_Wheel_GetContactPosition", ADDRESS, ADDRESS);
		JPH_WHEEL_GET_CONTACT_POINT_VELOCITY = downcallHandleVoid("JPH_Wheel_GetContactPointVelocity", ADDRESS, ADDRESS);
		JPH_WHEEL_GET_CONTACT_NORMAL = downcallHandleVoid("JPH_Wheel_GetContactNormal", ADDRESS, ADDRESS);
		JPH_WHEEL_GET_CONTACT_LONGITUDINAL = downcallHandleVoid("JPH_Wheel_GetContactLongitudinal", ADDRESS, ADDRESS);
		JPH_WHEEL_GET_CONTACT_LATERAL = downcallHandleVoid("JPH_Wheel_GetContactLateral", ADDRESS, ADDRESS);
		JPH_WHEEL_GET_SUSPENSION_LENGTH = downcallHandle("JPH_Wheel_GetSuspensionLength", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_GET_SUSPENSION_LAMBDA = downcallHandle("JPH_Wheel_GetSuspensionLambda", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_GET_LONGITUDINAL_LAMBDA = downcallHandle("JPH_Wheel_GetLongitudinalLambda", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_GET_LATERAL_LAMBDA = downcallHandle("JPH_Wheel_GetLateralLambda", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_HAS_HIT_HARD_POINT = downcallHandle("JPH_Wheel_HasHitHardPoint", JAVA_BOOLEAN, ADDRESS);
		//@formatter:on
	}

	public Wheel(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	public Wheel(MemorySegment segment, Arena arena) {
		jphWheel = segment;

		vecTmp = new Vec3(arena);

		Jolt.addWheel(jphWheel.address(), this);
	}

	public Wheel(WheelSettings settings) {
		this(settings, Arena.ofAuto());
	}

	public Wheel(WheelSettings settings, Arena arena) {
		try {
			MethodHandle method = JPH_WHEEL_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact(settings.memorySegment());
			jphWheel = segment.reinterpret(arena, s -> destroy(s));

			vecTmp = new Vec3(arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create wheel: " + className);
		}

		Jolt.addWheel(jphWheel.address(), this);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_WHEEL_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy wheel: " + className);
		}

		Jolt.removeWheel(segment.address());
	}

	/**
	 * Get settings for the wheel.
	 */
	public WheelSettings getSettings() {
		try {
			MethodHandle method = JPH_WHEEL_GET_SETTINGS;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphWheel);

			if (segment.equals(MemorySegment.NULL))
				return null;

			WheelSettings settings = Jolt.getWheelSettings(segment.address());
			if (settings != null)
				return settings;

			return new WheelSettings(segment, false);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get settings: " + className);
		}
	}

	/**
	 * Get the angular velocity (rad/s) for this wheel, note that positive means the
	 * wheel is rotating such that the car moves forward.
	 */
	public float getAngularVelocity() {
		try {
			MethodHandle method = JPH_WHEEL_GET_ANGULAR_VELOCITY;
			return (float) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get angular velocity: " + className);
		}
	}

	/**
	 * Update the angular velocity (rad/s)
	 */
	public void setAngularVelocity(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SET_ANGULAR_VELOCITY;
			method.invokeExact(jphWheel, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set angular velocity: " + className);
		}
	}

	/**
	 * Get the current rotation angle of the wheel in radians [0, 2 pi].
	 */
	public float getRotationAngle() {
		try {
			MethodHandle method = JPH_WHEEL_GET_ROTATION_ANGLE;
			return (float) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get rotation angle: " + className);
		}
	}

	/**
	 * Set the current rotation angle of the wheel in radians [0, 2 pi].
	 */
	public void setRotationAngle(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SET_ROTATION_ANGLE;
			method.invokeExact(jphWheel, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set rotation angle: " + className);
		}
	}

	/**
	 * Get the current steer angle of the wheel in radians [-pi, pi], positive is to
	 * the left.
	 */
	public float getSteerAngle() {
		try {
			MethodHandle method = JPH_WHEEL_GET_STEER_ANGLE;
			return (float) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get steer angle: " + className);
		}
	}

	/**
	 * Set the current steer angle of the wheel in radians [-pi, pi].
	 */
	public void setSteerAngle(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SET_STEER_ANGLE;
			method.invokeExact(jphWheel, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set steer angle: " + className);
		}
	}

	/**
	 * Returns true if the wheel is touching an object.
	 */
	public boolean hasContact() {
		try {
			MethodHandle method = JPH_WHEEL_HAS_CONTACT;
			return (boolean) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call has contact: " + className);
		}
	}

	/**
	 * Returns the body ID of the body that this wheel is touching.
	 */
	public int getContactBodyID() {
		try {
			MethodHandle method = JPH_WHEEL_GET_CONTACT_BODY_ID;
			return (int) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get contact body ID: " + className);
		}
	}

	/**
	 * Returns the sub shape ID where we're contacting the body.
	 */
	public int getContactSubShapeID() {
		try {
			MethodHandle method = JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID;
			return (int) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get contact sub shape ID: " + className);
		}
	}

	/**
	 * Returns the current contact position in world space (note by the time you
	 * call this the vehicle has moved)
	 */
	public Vector3f getContactPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_GET_CONTACT_POSITION;
			method.invokeExact(jphWheel, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get contact position: " + className);
		}
	}

	/**
	 * Returns the current contact position in world space (note by the time you
	 * call this the vehicle has moved)
	 */
	public Vector3f getContactPosition() {
		return getContactPosition(new Vector3f());
	}

	/**
	 * Velocity of the contact point (m / s, not relative to the wheel but in world
	 * space)
	 */
	public Vector3f getContactPointVelocity(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_GET_CONTACT_POINT_VELOCITY;
			method.invokeExact(jphWheel, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get contact point velocity: " + className);
		}
	}

	/**
	 * Velocity of the contact point (m / s, not relative to the wheel but in world
	 * space)
	 */
	public Vector3f getContactPointVelocity() {
		return getContactPointVelocity(new Vector3f());
	}

	/**
	 * Returns the current contact normal in world space (note by the time you call
	 * this the vehicle has moved)
	 */
	public Vector3f getContactNormal(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_GET_CONTACT_NORMAL;
			method.invokeExact(jphWheel, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get contact normal: " + className);
		}
	}

	/**
	 * Returns the current contact normal in world space (note by the time you call
	 * this the vehicle has moved)
	 */
	public Vector3f getContactNormal() {
		return getContactNormal(new Vector3f());
	}

	/**
	 * Returns longitudinal direction (direction along the wheel relative to floor)
	 * in world space (note by the time you call this the vehicle has moved)
	 */
	public Vector3f getContactLongitudinal(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_GET_CONTACT_LONGITUDINAL;
			method.invokeExact(jphWheel, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get contact longitudinal: " + className);
		}
	}

	/**
	 * @see #getContactLongitudinal(Vector3f)
	 */
	public Vector3f getContactLongitudinal() {
		return getContactLongitudinal(new Vector3f());
	}

	/**
	 * Returns lateral direction (sideways direction) in world space (note by the
	 * time you call this the vehicle has moved)
	 */
	public Vector3f getContactLateral(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_GET_CONTACT_LATERAL;
			method.invokeExact(jphWheel, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get contact lateral: " + className);
		}
	}

	/**
	 * @see #getContactLateral()
	 */
	public Vector3f getContactLateral() {
		return getContactLateral(new Vector3f());
	}

	/**
	 * Get the length of the suspension for a wheel (m) relative to the suspension
	 * attachment point (hard point)
	 */
	public float getSuspensionLength() {
		try {
			MethodHandle method = JPH_WHEEL_GET_SUSPENSION_LENGTH;
			return (float) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get suspension length: " + className);
		}
	}

	/**
	 * Get the total impulse (N s) that was applied by the suspension.
	 */
	public float getSuspensionLambda() {
		try {
			MethodHandle method = JPH_WHEEL_GET_SUSPENSION_LAMBDA;
			return (float) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get suspension lambda: " + className);
		}
	}

	/**
	 * Get total impulse (N s) applied along the forward direction of the wheel.
	 */
	public float getLongitudinalLambda() {
		try {
			MethodHandle method = JPH_WHEEL_GET_LONGITUDINAL_LAMBDA;
			return (float) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get longitudinal lambda: " + className);
		}
	}

	/**
	 * Get total impulse (N s) applied along the sideways direction of the wheel.
	 */
	public float getLateralLambda() {
		try {
			MethodHandle method = JPH_WHEEL_GET_LATERAL_LAMBDA;
			return (float) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get lateral lambda: " + className);
		}
	}

	/**
	 * Check if the suspension hit its upper limit.
	 */
	public boolean hasHitHardPoint() {
		try {
			MethodHandle method = JPH_WHEEL_HAS_HIT_HARD_POINT;
			return (boolean) method.invokeExact(jphWheel);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call hasHitHardPoint: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphWheel;
	}

}