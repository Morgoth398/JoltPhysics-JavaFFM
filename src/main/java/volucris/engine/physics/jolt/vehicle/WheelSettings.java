package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.constraint.SpringSettings;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Base class for wheel settings, each VehicleController can implement a derived
 * class of this.
 */
public sealed class WheelSettings permits WheelSettingsTV, WheelSettingsWV {

	private static final MethodHandle JPH_WHEEL_SETTINGS_CREATE;
	private static final MethodHandle JPH_WHEEL_SETTINGS_DESTROY;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_POSITION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_POSITION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_SUSPENSION_FORCE_POINT;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_SUSPENSION_FORCE_POINT;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_SUSPENSION_DIRECTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_SUSPENSION_DIRECTION;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_STEERING_AXIS;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_STEERING_AXIS;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_WHEEL_UP;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_WHEEL_UP;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_WHEEL_FORWARD;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_WHEEL_FORWARD;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_SUSPENSION_MIN_LENGTH;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_SUSPENSION_MIN_LENGTH;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_SUSPENSION_MAX_LENGTH;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_SUSPENSION_MAX_LENGTH;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_SUSPENSION_PRELOAD_LENGTH;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_SUSPENSION_PRELOAD_LENGTH;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_SUSPENSION_SPRING;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_SUSPENSION_SPRING;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_RADIUS;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_RADIUS;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_WIDTH;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_WIDTH;
	private static final MethodHandle JPH_WHEEL_SETTINGS_GET_ENABLE_SUSPENSION_FORCE_POINT;
	private static final MethodHandle JPH_WHEEL_SETTINGS_SET_ENABLE_SUSPENSION_FORCE_POINT;

	protected final MemorySegment jphWheelSettings;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_WHEEL_SETTINGS_CREATE = downcallHandle("JPH_WheelSettings_Create", ADDRESS);
		JPH_WHEEL_SETTINGS_DESTROY = downcallHandleVoid("JPH_WheelSettings_Destroy", ADDRESS);
		JPH_WHEEL_SETTINGS_GET_POSITION = downcallHandleVoid("JPH_WheelSettings_GetPosition", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_POSITION = downcallHandleVoid("JPH_WheelSettings_SetPosition", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_FORCE_POINT = downcallHandleVoid("JPH_WheelSettings_GetSuspensionForcePoint", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_FORCE_POINT = downcallHandleVoid("JPH_WheelSettings_SetSuspensionForcePoint", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_DIRECTION = downcallHandleVoid("JPH_WheelSettings_GetSuspensionDirection", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_DIRECTION = downcallHandleVoid("JPH_WheelSettings_SetSuspensionDirection", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_GET_STEERING_AXIS = downcallHandleVoid("JPH_WheelSettings_GetSteeringAxis", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_STEERING_AXIS = downcallHandleVoid("JPH_WheelSettings_SetSteeringAxis", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_GET_WHEEL_UP = downcallHandleVoid("JPH_WheelSettings_GetWheelUp", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_WHEEL_UP = downcallHandleVoid("JPH_WheelSettings_SetWheelUp", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_GET_WHEEL_FORWARD = downcallHandleVoid("JPH_WheelSettings_GetWheelForward", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_WHEEL_FORWARD = downcallHandleVoid("JPH_WheelSettings_SetWheelForward", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_MIN_LENGTH = downcallHandle("JPH_WheelSettings_GetSuspensionMinLength", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_MIN_LENGTH = downcallHandleVoid("JPH_WheelSettings_SetSuspensionMinLength", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_MAX_LENGTH = downcallHandle("JPH_WheelSettings_GetSuspensionMaxLength", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_MAX_LENGTH = downcallHandleVoid("JPH_WheelSettings_SetSuspensionMaxLength", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_PRELOAD_LENGTH = downcallHandle("JPH_WheelSettings_GetSuspensionPreloadLength", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_PRELOAD_LENGTH = downcallHandleVoid("JPH_WheelSettings_SetSuspensionPreloadLength", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_SPRING = downcallHandleVoid("JPH_WheelSettings_GetSuspensionSpring", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_SPRING = downcallHandleVoid("JPH_WheelSettings_SetSuspensionSpring", ADDRESS, ADDRESS);
		JPH_WHEEL_SETTINGS_GET_RADIUS = downcallHandle("JPH_WheelSettings_GetRadius", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_RADIUS = downcallHandleVoid("JPH_WheelSettings_SetRadius", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_WIDTH = downcallHandle("JPH_WheelSettings_GetWidth", JAVA_FLOAT, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_WIDTH = downcallHandleVoid("JPH_WheelSettings_SetWidth", ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_ENABLE_SUSPENSION_FORCE_POINT = downcallHandle("JPH_WheelSettings_GetEnableSuspensionForcePoint", JAVA_BOOLEAN, ADDRESS);
		JPH_WHEEL_SETTINGS_SET_ENABLE_SUSPENSION_FORCE_POINT = downcallHandleVoid("JPH_WheelSettings_SetEnableSuspensionForcePoint", ADDRESS, JAVA_BOOLEAN);
		//@formatter:on
	}

	protected WheelSettings(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected WheelSettings(MemorySegment segment, Arena arena, boolean owns) {
		if (owns)
			jphWheelSettings = segment.reinterpret(arena, s -> destroy(s));
		else
			jphWheelSettings = segment;

		vecTmp = new Vec3(arena);

		Jolt.addWheelSettings(jphWheelSettings.address(), this);
	}

	public WheelSettings() {
		this(Arena.ofAuto());
	}

	public WheelSettings(Arena arena) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_CREATE;
			MemorySegment segment = (MemorySegment) method.invokeExact();
			jphWheelSettings = segment.reinterpret(arena, s -> destroy(s));

			vecTmp = new Vec3(arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create wheel settings: " + className);
		}

		Jolt.addWheelSettings(jphWheelSettings.address(), this);
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_DESTROY;
			method.invokeExact(segment);

			Jolt.removeWheelSettings(segment.address());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy wheel settings: " + className);
		}
	}

	/**
	 * Attachment point of wheel suspension in local space of the body.
	 */
	public Vector3f getPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_POSITION;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get position: " + className);
		}
	}

	/**
	 * Attachment point of wheel suspension in local space of the body.
	 */
	public Vector3f getPosition() {
		return getPosition(new Vector3f());
	}

	/**
	 * Attachment point of wheel suspension in local space of the body.
	 */
	public void setPosition(Vector3f position) {
		try {
			vecTmp.set(position);

			MethodHandle method = JPH_WHEEL_SETTINGS_SET_POSITION;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set position: " + className);
		}
	}

	/**
	 * Where tire forces (suspension and traction) are applied, in local space of
	 * the body. A good default is the center of the wheel in its neutral pose. See
	 * mEnableSuspensionForcePoint.
	 */
	public Vector3f getSuspensionForcePoint(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_FORCE_POINT;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get suspension force point: " + className);
		}
	}

	/**
	 * @see #getSuspensionForcePoint(Vector3f)
	 */
	public Vector3f getSuspensionForcePoint() {
		return getSuspensionForcePoint(new Vector3f());
	}

	/**
	 * @see #getSuspensionForcePoint(Vector3f)
	 */
	public void setSuspensionForcePoint(Vector3f point) {
		try {
			vecTmp.set(point);

			MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_FORCE_POINT;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set suspension force point: " + className);
		}
	}

	/**
	 * Direction of the suspension in local space of the body, should point down.
	 */
	public Vector3f getSuspensionDirection(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_DIRECTION;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get suspension direction: " + className);
		}
	}

	/**
	 * Direction of the suspension in local space of the body, should point down.
	 */
	public Vector3f getSuspensionDirection() {
		return getSuspensionDirection(new Vector3f());
	}

	/**
	 * Direction of the suspension in local space of the body, should point down.
	 */
	public void setSuspensionDirection(Vector3f direction) {
		try {
			vecTmp.set(direction);

			MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_DIRECTION;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set suspension direction: " + className);
		}
	}

	/**
	 * Direction of the steering axis in local space of the body, should point up
	 * (e.g. for a bike would be -mSuspensionDirection)
	 */
	public Vector3f getSteeringAxis(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_STEERING_AXIS;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get steering axis: " + className);
		}
	}

	/**
	 * @see #getSteeringAxis(Vector3f)
	 */
	public Vector3f getSteeringAxis() {
		return getSteeringAxis(new Vector3f());
	}

	/**
	 * @see #getSteeringAxis(Vector3f)
	 */
	public void setSteeringAxis(Vector3f axis) {
		try {
			vecTmp.set(axis);

			MethodHandle method = JPH_WHEEL_SETTINGS_SET_STEERING_AXIS;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set steering axis: " + className);
		}
	}

	/**
	 * Up direction when the wheel is in the neutral steering position (usually
	 * VehicleConstraintSettings::mUp but can be used to give the wheel camber or
	 * for a bike would be -mSuspensionDirection)
	 */
	public Vector3f getWheelUp(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_WHEEL_UP;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get wheel up: " + className);
		}
	}

	/**
	 * @see #getWheelUp(Vector3f)
	 */
	public Vector3f getWheelUp() {
		return getWheelUp(new Vector3f());
	}

	/**
	 * @see #getWheelUp(Vector3f)
	 */
	public void setWheelUp(Vector3f up) {
		try {
			vecTmp.set(up);

			MethodHandle method = JPH_WHEEL_SETTINGS_SET_WHEEL_UP;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set wheel up: " + className);
		}
	}

	/**
	 * Forward direction when the wheel is in the neutral steering position (usually
	 * VehicleConstraintSettings::mForward but can be used to give the wheel toe,
	 * does not need to be perpendicular to mWheelUp)
	 */
	public Vector3f getWheelForward(Vector3f target) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_WHEEL_FORWARD;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get wheel forward: " + className);
		}
	}

	/**
	 * @see #getWheelForward(Vector3f)
	 */
	public Vector3f getWheelForward() {
		return getWheelForward(new Vector3f());
	}

	/**
	 * @see #getWheelForward(Vector3f)
	 */
	public void setWheelForward(Vector3f forward) {
		try {
			vecTmp.set(forward);

			MethodHandle method = JPH_WHEEL_SETTINGS_SET_WHEEL_FORWARD;
			method.invokeExact(jphWheelSettings, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set wheel forward: " + className);
		}
	}

	/**
	 * How long the suspension is in max raised position relative to the attachment
	 * point (m)
	 */
	public float getSuspensionMinLength() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_MIN_LENGTH;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get suspension min length: " + className);
		}
	}

	/**
	 * How long the suspension is in max raised position relative to the attachment
	 * point (m)
	 */
	public void setSuspensionMinLength(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_MIN_LENGTH;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set suspension min length: " + className);
		}
	}

	/**
	 * How long the suspension is in max droop position relative to the attachment
	 * point (m)
	 */
	public float getSuspensionMaxLength() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_MAX_LENGTH;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get suspension max length: " + className);
		}
	}

	/**
	 * How long the suspension is in max droop position relative to the attachment
	 * point (m)
	 */
	public void setSuspensionMaxLength(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_MAX_LENGTH;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set suspension max length: " + className);
		}
	}

	/**
	 * The natural length (m) of the suspension spring is defined as
	 * mSuspensionMaxLength + mSuspensionPreloadLength. Can be used to preload the
	 * suspension as the spring is compressed by mSuspensionPreloadLength when the
	 * suspension is in max droop position. Note that this means when the vehicle
	 * touches the ground there is a discontinuity so it will also make the vehicle
	 * more bouncy as we're updating with discrete time steps.
	 */
	public float getSuspensionPreloadLength() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_PRELOAD_LENGTH;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get suspension preload length: " + className);
		}
	}

	/**
	 * @see #getSuspensionPreloadLength()
	 */
	public void setSuspensionPreloadLength(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_PRELOAD_LENGTH;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set suspension preload length: " + className);
		}
	}

	/**
	 * Settings for the suspension spring.
	 */
	public SpringSettings getSuspensionSpring(SpringSettings target) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_SPRING;
			method.invokeExact(jphWheelSettings, target.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get suspension spring: " + className);
		}
	}

	/**
	 * Settings for the suspension spring.
	 */
	public SpringSettings getSuspensionSpring() {
		return getSuspensionSpring(new SpringSettings());
	}

	/**
	 * Settings for the suspension spring.
	 */
	public void setSuspensionSpring(SpringSettings springSettings) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_SPRING;
			method.invokeExact(jphWheelSettings, springSettings.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set suspension spring: " + className);
		}
	}

	/**
	 * Radius of the wheel (m)
	 */
	public float getRadius() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_RADIUS;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get radius: " + className);
		}
	}

	/**
	 * Radius of the wheel (m)
	 */
	public void setRadius(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_SET_RADIUS;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set radius: " + className);
		}
	}

	/**
	 * Width of the wheel (m)
	 */
	public float getWidth() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_WIDTH;
			return (float) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get width: " + className);
		}
	}

	/**
	 * Width of the wheel (m)
	 */
	public void setWidth(float value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_SET_WIDTH;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set width: " + className);
		}
	}

	/**
	 * Enables mSuspensionForcePoint, if disabled, the forces are applied at the
	 * collision contact point. This leads to a more accurate simulation when
	 * interacting with dynamic objects but makes the vehicle less stable. When
	 * setting this to true, all forces will be applied to a fixed point on the
	 * vehicle body.
	 */
	public boolean getEnableSuspensionForcePoint() {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_GET_ENABLE_SUSPENSION_FORCE_POINT;
			return (boolean) method.invokeExact(jphWheelSettings);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get enable suspension force point: " + className);
		}
	}

	/**
	 * @see #getEnableSuspensionForcePoint()
	 */
	public void setEnableSuspensionForcePoint(boolean value) {
		try {
			MethodHandle method = JPH_WHEEL_SETTINGS_SET_ENABLE_SUSPENSION_FORCE_POINT;
			method.invokeExact(jphWheelSettings, value);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set enable suspension force point: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphWheelSettings;
	}

}