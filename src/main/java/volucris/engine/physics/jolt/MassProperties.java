package volucris.engine.physics.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import org.joml.Matrix4f;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Describes the mass and inertia properties of a body. Used during body
 * construction only.
 */
public final class MassProperties {

	private static final StructLayout LAYOUT;

	private static final MethodHandle JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA;
	private static final MethodHandle JPH_MASS_PROPERTIES_SCALE_TO_MASS;
	private static final MethodHandle JPH_MASS_PROPERTIES_GET_EQUIVALENT_SOLID_BOX_SIZE;

	private static final VarHandle MASS;

	private static final long INERTIA_OFFSET;

	private final MemorySegment jphMassProperties;

	private final Mat4 inertia;

	private Mat4 matTmp;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_FLOAT.withName("mass"),
				Mat4.LAYOUT().withName("inertia")
			);
		
		JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA = downcallHandleVoid("JPH_MassProperties_DecomposePrincipalMomentsOfInertia", ADDRESS, ADDRESS, ADDRESS);
		JPH_MASS_PROPERTIES_SCALE_TO_MASS = downcallHandleVoid("JPH_MassProperties_ScaleToMass", ADDRESS, JAVA_FLOAT);
		JPH_MASS_PROPERTIES_GET_EQUIVALENT_SOLID_BOX_SIZE = downcallHandleVoid("JPH_MassProperties_GetEquivalentSolidBoxSize", JAVA_FLOAT, ADDRESS, ADDRESS);
		//@formatter:on

		MASS = varHandle(LAYOUT, "mass");

		INERTIA_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inertia"));
	}

	public MassProperties() {
		this(Arena.ofAuto());
	}

	public MassProperties(Arena arena) {
		jphMassProperties = arena.allocate(LAYOUT);

		inertia = new Mat4(jphMassProperties.asSlice(INERTIA_OFFSET, Mat4.LAYOUT()));

		matTmp = new Mat4(arena);

		vecTmp = new Vec3(arena);
	}

	/**
	 * Using eigendecomposition, decompose the inertia tensor into a diagonal matrix
	 * D and a right-handed rotation matrix R so that the inertia tensor is
	 * 𝑅𝐷𝑅−1.
	 * <p>
	 * See also <a
	 * href=https://en.wikipedia.org/wiki/Moment_of_inertia>https://en.wikipedia.org/wiki/Moment_of_inertia</a>
	 * section 'Principal axes'
	 */
	public void decomposePrincipalMomentsOfInertia(Matrix4f rotationTarget, Vector3f diagonalTarget) {
		try {
			MethodHandle method = JPH_MASS_PROPERTIES_DECOMPOSE_PRINCIPAL_MOMENTS_OF_INERTIA;
			method.invokeExact(jphMassProperties, matTmp.memorySegment(), vecTmp.memorySegment());

			matTmp.get(rotationTarget);
			vecTmp.get(diagonalTarget);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call decomposePrincipalMomentsOfInertia: " + className);
		}
	}

	/**
	 * Set the mass and scale the inertia tensor to match the mass.
	 */
	public void scaleToMass(float mass) {
		try {
			MethodHandle method = JPH_MASS_PROPERTIES_SCALE_TO_MASS;
			method.invokeExact(jphMassProperties, mass);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot scale to mass: " + className);
		}
	}

	/**
	 * Calculates the size of the solid box that has an inertia tensor diagonal
	 * inInertiaDiagonal.
	 */
	public static Vector3f getEquivalentSolidBoxSize(float mass, Vector3f inertiaDiagonal, Vector3f target) {
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, inertiaDiagonal);

			MethodHandle method = JPH_MASS_PROPERTIES_GET_EQUIVALENT_SOLID_BOX_SIZE;
			method.invokeExact(mass, vec.memorySegment(), vec.memorySegment());

			return vec.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get equivalent solid box size: " + className);
		}
	}

	/**
	 * Calculates the size of the solid box that has an inertia tensor diagonal
	 * inInertiaDiagonal.
	 */
	public static Vector3f getEquivalentSolidBoxSize(float mass, Vector3f inertiaDiagonal) {
		return getEquivalentSolidBoxSize(mass, inertiaDiagonal, new Vector3f());
	}

	/**
	 * Mass of the shape (kg)
	 */
	public void setMass(float mass) {
		MASS.set(jphMassProperties, mass);
	}

	/**
	 * Mass of the shape (kg)
	 */
	public float getMass() {
		return (float) MASS.get(jphMassProperties);
	}

	/**
	 * Inertia tensor of the shape (kg m^2)
	 */
	public Matrix4f getInertia(Matrix4f target) {
		return inertia.get(target);
	}

	/**
	 * Inertia tensor of the shape (kg m^2)
	 */
	public Matrix4f getInertia() {
		return inertia.get();
	}

	/**
	 * Inertia tensor of the shape (kg m^2)
	 */
	public void setInertia(Matrix4f inertia) {
		this.inertia.set(inertia);
	}

	public MemorySegment memorySegment() {
		return jphMassProperties;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}