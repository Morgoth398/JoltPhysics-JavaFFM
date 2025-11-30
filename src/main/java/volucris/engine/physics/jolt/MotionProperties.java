package volucris.engine.physics.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.JoltEnums.AllowedDOFs;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * The Body class only keeps track of state for static bodies, the
 * MotionProperties class keeps the additional state needed for a moving Body.
 * It has a 1-on-1 relationship with the body.
 */
public final class MotionProperties {

	private static final MethodHandle JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS;
	private static final MethodHandle JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING;
	private static final MethodHandle JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING;
	private static final MethodHandle JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING;
	private static final MethodHandle JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING;
	private static final MethodHandle JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES;
	private static final MethodHandle JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED;
	private static final MethodHandle JPH_MOTION_PROPERTIES_SET_INVERSE_MASS;
	private static final MethodHandle JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL;
	private static final MethodHandle JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION;
	private static final MethodHandle JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA;
	private static final MethodHandle JPH_MOTION_PROPERTIES_SCALE_TO_MASS;

	private final MemorySegment jphMotionProperties;

	private Quat quatTmp;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS = downcallHandle("JPH_MotionProperties_GetAllowedDOFs", JAVA_INT, ADDRESS);
		JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING = downcallHandleVoid("JPH_MotionProperties_SetLinearDamping", ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING = downcallHandle("JPH_MotionProperties_GetLinearDamping", JAVA_FLOAT, ADDRESS);
		JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_MotionProperties_SetAngularDamping", ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING = downcallHandle("JPH_MotionProperties_GetAngularDamping", JAVA_FLOAT, ADDRESS);
		JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES = downcallHandleVoid("JPH_MotionProperties_SetMassProperties", ADDRESS, JAVA_INT, ADDRESS);
		JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED = downcallHandle("JPH_MotionProperties_GetInverseMassUnchecked", JAVA_FLOAT, ADDRESS);
		JPH_MOTION_PROPERTIES_SET_INVERSE_MASS = downcallHandleVoid("JPH_MotionProperties_SetInverseMass", ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL = downcallHandleVoid("JPH_MotionProperties_GetInverseInertiaDiagonal", ADDRESS, ADDRESS);
		JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION = downcallHandleVoid("JPH_MotionProperties_GetInertiaRotation", ADDRESS, ADDRESS);
		JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA = downcallHandleVoid("JPH_MotionProperties_SetInverseInertia", ADDRESS, ADDRESS, ADDRESS);
		JPH_MOTION_PROPERTIES_SCALE_TO_MASS = downcallHandleVoid("JPH_MotionProperties_ScaleToMass", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public MotionProperties() {
		Arena arena = Arena.ofAuto();

		jphMotionProperties = arena.allocate(ADDRESS);

		quatTmp = new Quat(arena);
		vecTmp = new Vec3(arena);
	}

	public void set(MemorySegment segment) {
		jphMotionProperties.setAtIndex(ADDRESS, 0, segment);
	}

	/**
	 * Get the allowed degrees of freedom that this body has (this can be changed by
	 * calling SetMassProperties)
	 */
	public AllowedDOFs getAllowedDOFs() {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS;
			int value = (int) method.invokeExact(memorySegment());

			for (AllowedDOFs DOF : AllowedDOFs.values()) {
				if (value == DOF.id())
					return DOF;
			}

			throw new Throwable();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get AllowedDOFs.");
		}
	}

	/**
	 * 
	 */
	public void setLinearDamping(float damping) {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING;
			method.invokeExact(memorySegment(), damping);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set linear damping.");
		}
	}

	/**
	 * Get linear damping: dv/dt = -c * v. c. Value should be zero or positive and
	 * is usually close to 0.
	 */
	public float getLinearDamping() {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING;
			return (float) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get linear damping.");
		}
	}

	/**
	 * 
	 */
	public void setAngularDamping(float damping) {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING;
			method.invokeExact(memorySegment(), damping);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set angular damping.");
		}
	}

	/**
	 * Get angular damping: dw/dt = -c * w. c. Value should be zero or positive and
	 * is usually close to 0.
	 */
	public float getAngularDamping() {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING;
			return (float) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get angular damping.");
		}
	}

	/**
	 * Set the mass and inertia tensor.
	 */
	public void setMassProperties(AllowedDOFs allowedDOFs, MassProperties massProperties) {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES;
			method.invokeExact(memorySegment(), allowedDOFs.id(), massProperties.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set mass properties.");
		}
	}

	/**
	 * Get inverse mass (1 / mass). Should only be called on a dynamic object
	 * (static or kinematic bodies have infinite mass so should be treated as 1 /
	 * mass = 0)
	 */
	public float getInverseMassUnchecked() {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED;
			return (float) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get inverse mass unchecked.");
		}
	}

	/**
	 * Set the inverse mass (1 / mass). Note that mass and inertia are linearly
	 * related (e.g. inertia of a sphere with mass m and radius r is 2/5𝑚𝑟2). If
	 * you change mass, inertia should probably change as well. You can use
	 * ScaleToMass to update mass and inertia at the same time. If all your
	 * translation degrees of freedom are restricted, make sure this is zero (see
	 * EAllowedDOFs).
	 */
	public void setInverseMass(float inverseMass) {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_SET_INVERSE_MASS;
			method.invokeExact(memorySegment(), inverseMass);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set inverse mass.");
		}
	}

	/**
	 * Diagonal of inverse inertia matrix: D. Should only be called on a dynamic
	 * object (static or kinematic bodies have infinite mass so should be treated as
	 * D = 0)
	 */
	public Vector3f getInverseInertiaDiagonal(Vector3f result) {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL;
			method.invokeExact(memorySegment(), vecTmp.memorySegment());

			return vecTmp.get(result);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get inverse inertia diagonal.");
		}
	}

	/**
	 * @see #getInverseInertiaDiagonal(Vector3f)
	 */
	public Vector3f getInverseInertiaDiagonal() {
		return getInverseInertiaDiagonal(new Vector3f());
	}

	/**
	 * Rotation (R) that takes inverse inertia diagonal to local space:
	 * 𝐼−1𝑏𝑜𝑑𝑦=𝑅𝐷𝑅−1.
	 */
	public Quaternionf getInertiaRotation(Quaternionf result) {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION;
			method.invokeExact(memorySegment(), quatTmp.memorySegment());

			return quatTmp.get(result);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get inertia rotation.");
		}
	}

	/**
	 * Rotation (R) that takes inverse inertia diagonal to local space:
	 * 𝐼−1𝑏𝑜𝑑𝑦=𝑅𝐷𝑅−1.
	 */
	public Quaternionf getInertiaRotation() {
		return getInertiaRotation(new Quaternionf());
	}

	/**
	 * Set the inverse inertia tensor in local space by setting the diagonal and the
	 * rotation: 𝐼−1𝑏𝑜𝑑𝑦=𝑅𝐷𝑅−1. Note that mass and inertia are linearly
	 * related (e.g. inertia of a sphere with mass m and radius r is 2/5𝑚𝑟2). If
	 * you change inertia, mass should probably change as well. You can use
	 * ScaleToMass to update mass and inertia at the same time. If all your rotation
	 * degrees of freedom are restricted, make sure this is zero (see EAllowedDOFs).
	 */
	public void setInverseInertia(Vector3f diagonal, Quaternionf rot) {
		try {
			vecTmp.set(diagonal);
			quatTmp.set(rot);

			MethodHandle method = JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA;
			method.invokeExact(memorySegment(), vecTmp.memorySegment(), quatTmp.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set inverse inertia.");
		}
	}

	/**
	 * Sets the mass to mass and scale the inertia tensor based on the ratio
	 * between the old and new mass. Note that this only works when the current mass
	 * is finite (i.e. the body is dynamic and translational degrees of freedom are
	 * not restricted).
	 */
	public void scaleToMass(float mass) {
		try {
			MethodHandle method = JPH_MOTION_PROPERTIES_SCALE_TO_MASS;
			method.invokeExact(memorySegment(), mass);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot scale to mass.");
		}
	}

	private MemorySegment memorySegment() {
		return jphMotionProperties.getAtIndex(ADDRESS, 0);
	}

}