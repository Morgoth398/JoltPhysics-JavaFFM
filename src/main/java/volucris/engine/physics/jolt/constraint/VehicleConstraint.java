package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.vehicle.VehicleCollisionTester;
import volucris.engine.physics.jolt.vehicle.VehicleController;
import volucris.engine.physics.jolt.vehicle.Wheel;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Constraint that simulates a vehicle Note: Don't forget to register the
 * constraint as a StepListener with the PhysicsSystem!
 * <p>
 * When the vehicle drives over very light objects (rubble) you may see the car
 * body dip down. This is a known issue and is an artifact of the iterative
 * solver that Jolt is using. Basically if a light object is sandwiched between
 * two heavy objects (the static floor and the car body), the light object is
 * not able to transfer enough force from the ground to the car body to keep the
 * car body up. You can see this effect in the HeavyOnLightTest sample, the
 * boxes on the right have a lot of penetration because they're on top of light
 * objects.
 * <p>
 * There are a couple of ways to improve this:
 * <ol>
 * <li>You can increase the number of velocity steps (global settings
 * PhysicsSettings::mNumVelocitySteps or if you only want to increase it on the
 * vehicle you can use VehicleConstraintSettings::mNumVelocityStepsOverride).
 * E.g. going from 10 to 30 steps in the HeavyOnLightTest sample makes the
 * penetration a lot less. The number of position steps can also be increased
 * (the first prevents the body from going down, the second corrects it if the
 * problem did occur which inevitably happens due to numerical drift). This
 * solution costs CPU cycles.
 * <li>You can reduce the mass difference between the vehicle body and the
 * rubble on the floor (by making the rubble heavier or the car lighter).
 * <li>You could filter out collisions between the vehicle collision test and
 * the rubble completely. This would make the wheels ignore the rubble but would
 * cause the vehicle to drive through it as if nothing happened. You could
 * create fake wheels (keyframed bodies) that move along with the vehicle and
 * that only collide with rubble (and not the vehicle or the ground). This would
 * cause the vehicle to push away the rubble without the rubble being able to
 * affect the vehicle (unless it hits the main body of course).
 * </ol>
 * Note that when driving over rubble, you may see the wheel jump up and down
 * quite quickly because one frame a collision is found and the next frame not.
 * To alleviate this, it may be needed to smooth the motion of the visual mesh
 * for the wheel.
 * 
 */
public final class VehicleConstraint extends Constraint {

	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_CREATE;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_WHEELS_COUNT;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_WHEEL;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM;
	private static final MethodHandle JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM;

	private Mat4 matTmp;

	private Vec3 vecTmp2;
	private Vec3 vecTmp3;

	static {
		//@formatter:off
		JPH_VEHICLE_CONSTRAINT_CREATE = downcallHandle("JPH_VehicleConstraint_Create", ADDRESS, ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER = downcallHandle("JPH_VehicleConstraint_AsPhysicsStepListener", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE = downcallHandleVoid("JPH_VehicleConstraint_SetMaxPitchRollAngle", ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER = downcallHandleVoid("JPH_VehicleConstraint_SetVehicleCollisionTester", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY = downcallHandleVoid("JPH_VehicleConstraint_OverrideGravity", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN = downcallHandle("JPH_VehicleConstraint_IsGravityOverridden", JAVA_BOOLEAN, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE = downcallHandleVoid("JPH_VehicleConstraint_GetGravityOverride", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE = downcallHandleVoid("JPH_VehicleConstraint_ResetGravityOverride", ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD = downcallHandleVoid("JPH_VehicleConstraint_GetLocalForward", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP = downcallHandleVoid("JPH_VehicleConstraint_GetLocalUp", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP = downcallHandleVoid("JPH_VehicleConstraint_GetWorldUp", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY = downcallHandle("JPH_VehicleConstraint_GetVehicleBody", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER = downcallHandle("JPH_VehicleConstraint_GetController", ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEELS_COUNT = downcallHandle("JPH_VehicleConstraint_GetWheelsCount", JAVA_INT, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL = downcallHandle("JPH_VehicleConstraint_GetWheel", ADDRESS, ADDRESS, JAVA_INT);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS = downcallHandleVoid("JPH_VehicleConstraint_GetWheelLocalBasis", ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM = downcallHandleVoid("JPH_VehicleConstraint_GetWheelLocalTransform", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM = downcallHandleVoid("JPH_VehicleConstraint_GetWheelWorldTransform", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		//@formatter:on
	}

	public VehicleConstraint(MemorySegment segment) {
		super(segment, false);

		matTmp = new Mat4(arena);

		vecTmp2 = new Vec3(arena);
		vecTmp3 = new Vec3(arena);
	}

	public VehicleConstraint(Body body, VehicleConstraintSettings settings) {
		MemorySegment segment;
		try {
			MemorySegment bodyAddr = body.memorySegment();
			MemorySegment settingsAddr = settings.memorySegment();

			MethodHandle method = JPH_VEHICLE_CONSTRAINT_CREATE;
			segment = (MemorySegment) method.invokeExact(bodyAddr, settingsAddr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create vehicle constraint.");
		}
		super(segment);

		matTmp = new Mat4(arena);

		vecTmp2 = new Vec3(arena);
		vecTmp3 = new Vec3(arena);
	}

	public MemorySegment asPhysicsStepListener() {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER;
			return (MemorySegment) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call asPhysicsStepListener.");
		}
	}

	/**
	 * Defines the maximum pitch/roll angle (rad), can be used to avoid the car from
	 * getting upside down. The vehicle up direction will stay within a cone
	 * centered around the up axis with half top angle mMaxPitchRollAngle, set to pi
	 * to turn off.
	 */
	public void setMaxPitchRollAngle(float maxPitchRollAngle) {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE;
			method.invokeExact(jphConstraint, maxPitchRollAngle);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set max pitch roll angle.");
		}
	}

	/**
	 * Set the interface that tests collision between wheel and ground.
	 */
	public void setVehicleCollisionTester(VehicleCollisionTester tester) {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER;
			method.invokeExact(jphConstraint, tester.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set vehicle collision tester.");
		}
	}

	/**
	 * Override gravity for this vehicle. Note that overriding gravity will set the
	 * gravity factor of the vehicle body to 0 and apply gravity in the
	 * PhysicsStepListener instead.
	 */
	public void overrideGravity(Vector3f value) {
		try {
			vecTmp.set(value);

			MethodHandle method = JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot override gravity.");
		}
	}

	/**
	 * 
	 */
	public boolean isGravityOverridden() {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN;
			return (boolean) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot chec if gravity is overridden.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getGravityOverride(Vector3f target) {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get gravity override.");
		}
	}

	/**
	 * 
	 */
	public Vector3f getGravityOverride() {
		return getGravityOverride(new Vector3f());
	}

	/**
	 * Note that resetting the gravity override will restore the gravity factor of
	 * the vehicle body to 1.
	 */
	public void resetGravityOverride() {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE;
			method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot reset gravity override.");
		}
	}

	/**
	 * Get the local space forward vector of the vehicle.
	 */
	public Vector3f getLocalForward(Vector3f target) {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get local forward.");
		}
	}

	/**
	 * Get the local space forward vector of the vehicle.
	 */
	public Vector3f getLocalForward() {
		return getLocalForward(new Vector3f());
	}

	/**
	 * Get the local space up vector of the vehicle.
	 */
	public Vector3f getLocalUp(Vector3f target) {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get local up.");
		}
	}

	/**
	 * Get the local space up vector of the vehicle.
	 */
	public Vector3f getLocalUp() {
		return getLocalUp(new Vector3f());
	}

	/**
	 * Vector indicating the world space up direction (used to limit vehicle
	 * pitch/roll), calculated every frame by inverting gravity.
	 */
	public Vector3f getWorldUp(Vector3f target) {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP;
			method.invokeExact(jphConstraint, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get world up.");
		}
	}

	/**
	 * Vector indicating the world space up direction (used to limit vehicle
	 * pitch/roll), calculated every frame by inverting gravity.
	 */
	public Vector3f getWorldUp() {
		return getWorldUp(new Vector3f());
	}

	/**
	 * Access to the vehicle body.
	 */
	public Body getVehicleBody() {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphConstraint);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Body body = Jolt.getBody(segment.address());
			if (body != null)
				return body;

			return new Body(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get vehicle body.");
		}
	}

	/**
	 * Access to the vehicle controller interface (determines acceleration /
	 * deceleration)
	 */
	public VehicleController getController() {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphConstraint);

			if (segment.equals(MemorySegment.NULL))
				return null;

			VehicleController controller = Jolt.getVehicleController(segment.address());
			if (controller != null)
				return controller;

			return new VehicleController(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get controller.");
		}
	}

	/**
	 * 
	 */
	public int getWheelsCount() {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEELS_COUNT;
			return (int) method.invokeExact(jphConstraint);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get wheels count.");
		}
	}

	/**
	 * 
	 */
	public Wheel getWheel(int index) {
		try {
			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphConstraint, index);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Wheel wheel = Jolt.getWheel(segment.address());
			if (wheel != null)
				return wheel;

			return new Wheel(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get wheel.");
		}
	}

	/**
	 * Get the basis vectors for the wheel in local space to the vehicle body (note:
	 * basis does not rotate when the wheel rotates around its axis)
	 * 
	 * @param wheel      Wheel to fetch basis for
	 * @param outForward Forward vector for the wheel
	 * @param outUp      Up vector for the wheel
	 * @param outRight   Right vector for the wheel
	 */
	public void getWheelLocalBasis(Wheel wheel, Vector3f outForward, Vector3f outUp, Vector3f outRight) {
		try {

			MemorySegment wheelAddr = wheel.memorySegment();
			MemorySegment forAddr = vecTmp.memorySegment();
			MemorySegment upAddr = vecTmp2.memorySegment();
			MemorySegment rightAddr = vecTmp3.memorySegment();

			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS;
			method.invokeExact(jphConstraint, wheelAddr, forAddr, upAddr, rightAddr);

			vecTmp.get(outForward);
			vecTmp2.get(outUp);
			vecTmp3.get(outRight);

		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get wheel local basis.");
		}
	}

	/**
	 * Get the transform of a wheel in local space to the vehicle body, returns a
	 * matrix that transforms a cylinder aligned with the Y axis in body space (not
	 * COM space)
	 * 
	 * @param wheelIndex Index of the wheel to fetch
	 * @param wheelRight Unit vector that indicates right in model space of the
	 *                   wheel (so if you only have 1 wheel model, you probably want
	 *                   to specify the opposite direction for the left and right
	 *                   wheels)
	 * @param wheelUp    Unit vector that indicates up in model space of the wheel
	 * @param target
	 * @return local transform
	 */
	public Matrix4f getWheelLocalTransform(int wheelIndex, Vector3f wheelRight, Vector3f wheelUp, Matrix4f target) {
		try {
			vecTmp.set(wheelRight);
			vecTmp2.set(wheelUp);

			MemorySegment rightAddr = vecTmp.memorySegment();
			MemorySegment upAddr = vecTmp2.memorySegment();
			MemorySegment resultAddr = matTmp.memorySegment();

			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM;
			method.invokeExact(jphConstraint, wheelIndex, rightAddr, upAddr, resultAddr);

			return matTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get wheel local transform.");
		}
	}

	/**
	 * @see #getWheelLocalTransform(int, Vector3f, Vector3f, Matrix4f)
	 */
	public Matrix4f getWheelLocalTransform(int wheelIndex, Vector3f wheelRight, Vector3f wheelUp) {
		return getWheelLocalTransform(wheelIndex, wheelRight, wheelUp, new Matrix4f());
	}

	/**
	 * Get the transform of a wheel in world space, returns a matrix that transforms
	 * a cylinder aligned with the Y axis in world space
	 * 
	 * @param wheelIndex Index of the wheel to fetch
	 * @param wheelRight Unit vector that indicates right in model space of the
	 *                   wheel (so if you only have 1 wheel model, you probably want
	 *                   to specify the opposite direction for the left and right
	 *                   wheels)
	 * @param wheelUp    Unit vector that indicates up in model space of the wheel
	 * @param target
	 * @return world transform
	 */
	public Matrix4f getWheelWorldTransform(int wheelIndex, Vector3f wheelRight, Vector3f wheelUp, Matrix4f target) {
		try {
			vecTmp.set(wheelRight);
			vecTmp2.set(wheelUp);

			MemorySegment rightAddr = vecTmp.memorySegment();
			MemorySegment upAddr = vecTmp2.memorySegment();
			MemorySegment resultAddr = matTmp.memorySegment();

			MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM;
			method.invokeExact(jphConstraint, wheelIndex, rightAddr, upAddr, resultAddr);

			return matTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get wheel world transform.");
		}
	}

	/**
	 * @see #getWheelWorldTransform(int, Vector3f, Vector3f, Matrix4f)
	 */
	public Matrix4f getWheelWorldTransform(int wheelIndex, Vector3f wheelRight, Vector3f wheelUp) {
		return getWheelWorldTransform(wheelIndex, wheelRight, wheelUp, new Matrix4f());
	}

}