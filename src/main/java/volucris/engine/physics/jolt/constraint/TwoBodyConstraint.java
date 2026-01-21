package volucris.engine.physics.jolt.constraint;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Base class for all constraints that involve 2 bodies. Body1 is usually
 * considered the parent, Body2 the child.
 */
public sealed class TwoBodyConstraint extends Constraint permits ConeConstraint, DistanceConstraint, FixedConstraint,
		GearConstraint, HingeConstraint, PointConstraint, SixDOFConstraint, SliderConstraint, SwingTwistConstraint {

	private static final MethodHandle JPH_TWO_BODY_CONSTRAINT_GET_BODY1;
	private static final MethodHandle JPH_TWO_BODY_CONSTRAINT_GET_BODY2;
	private static final MethodHandle JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY1MATRIX;
	private static final MethodHandle JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY2MATRIX;

	private Mat4 matTmp;

	static {
		//@formatter:off
		JPH_TWO_BODY_CONSTRAINT_GET_BODY1 = downcallHandle("JPH_TwoBodyConstraint_GetBody1", ADDRESS, ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_GET_BODY2 = downcallHandle("JPH_TwoBodyConstraint_GetBody2", ADDRESS, ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY1MATRIX = downcallHandleVoid("JPH_TwoBodyConstraint_GetConstraintToBody1Matrix", ADDRESS, ADDRESS);
		JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY2MATRIX = downcallHandleVoid("JPH_TwoBodyConstraint_GetConstraintToBody2Matrix", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected TwoBodyConstraint(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected TwoBodyConstraint(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	public TwoBodyConstraint(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	public TwoBodyConstraint(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);

		matTmp = new Mat4(arena);
	}

	/**
	 * Access to the connected bodies.
	 */
	public Body getBody1() {
		try {
			MethodHandle method = JPH_TWO_BODY_CONSTRAINT_GET_BODY1;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphConstraint);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Body body = Jolt.getBody(segment.address());
			if (body != null)
				return body;

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get body 1: " + className);
		}
	}

	/**
	 * Access to the connected bodies.
	 */
	public Body getBody2() {
		try {
			MethodHandle method = JPH_TWO_BODY_CONSTRAINT_GET_BODY2;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphConstraint);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Body body = Jolt.getBody(segment.address());
			if (body != null)
				return body;

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get body 2: " + className);
		}
	}

	/**
	 * Calculates the transform that transforms from constraint space to body 1
	 * space. The first column of the matrix is the primary constraint axis (e.g.
	 * the hinge axis / slider direction), second column the secondary etc.
	 */
	public Matrix4f getConstraintToBody1Matrix(Matrix4f target) {
		try {
			MethodHandle method = JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY1MATRIX;
			method.invokeExact(jphConstraint, matTmp.memorySegment());
			return matTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get constraint to body 1 matrix: " + className);
		}
	}

	/**
	 * @see #getConstraintToBody1Matrix(Matrix4f)
	 */
	public Matrix4f getConstraintToBody1Matrix() {
		return getConstraintToBody1Matrix(new Matrix4f());
	}

	/**
	 * Calculates the transform that transforms from constraint space to body 2
	 * space. The first column of the matrix is the primary constraint axis (e.g.
	 * the hinge axis / slider direction), second column the secondary etc.
	 */
	public Matrix4f getConstraintToBody2Matrix(Matrix4f target) {
		try {
			MethodHandle method = JPH_TWO_BODY_CONSTRAINT_GET_CONSTRAINT_TO_BODY2MATRIX;
			method.invokeExact(jphConstraint, matTmp.memorySegment());
			return matTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get constraint to body 2 matrix: " + className);
		}
	}

	/**
	 * @see #getConstraintToBody2Matrix(Matrix4f)
	 */
	public Matrix4f getConstraintToBody2Matrix() {
		return getConstraintToBody2Matrix(new Matrix4f());
	}

	/*
	 * The method does not check if the memory segment points to a ConeConstraint,
	 * so make sure of that first.
	 */
	public ConeConstraint asConeConstraint() {
		if (this instanceof ConeConstraint c)
			return c;

		return new ConeConstraint(jphConstraint, false);
	}

	/*
	 * The method does not check if the memory segment points to a
	 * DistanceConstraint, so make sure of that first.
	 */
	public DistanceConstraint asDistanceConstraint() {
		if (this instanceof DistanceConstraint c)
			return c;

		return new DistanceConstraint(jphConstraint, false);
	}

	/*
	 * The method does not check if the memory segment points to a FixedConstraint,
	 * so make sure of that first.
	 */
	public FixedConstraint asFixedConstraint() {
		if (this instanceof FixedConstraint c)
			return c;

		return new FixedConstraint(jphConstraint, false);
	}

	/*
	 * The method does not check if the memory segment points to a GearConstraint,
	 * so make sure of that first.
	 */
	public GearConstraint asGearConstraint() {
		if (this instanceof GearConstraint c)
			return c;

		return new GearConstraint(jphConstraint, false);
	}

	/*
	 * The method does not check if the memory segment points to a HingeConstraint,
	 * so make sure of that first.
	 */
	public HingeConstraint asHingeConstraint() {
		if (this instanceof HingeConstraint c)
			return c;

		return new HingeConstraint(jphConstraint, false);
	}

	/*
	 * The method does not check if the memory segment points to a PointConstraint,
	 * so make sure of that first.
	 */
	public PointConstraint asPointConstraint() {
		if (this instanceof PointConstraint c)
			return c;

		return new PointConstraint(jphConstraint, false);
	}

	/*
	 * The method does not check if the memory segment points to a SixDOFConstraint,
	 * so make sure of that first.
	 */
	public SixDOFConstraint asSixDOFConstraint() {
		if (this instanceof SixDOFConstraint c)
			return c;

		return new SixDOFConstraint(jphConstraint, false);
	}

	/*
	 * The method does not check if the memory segment points to a SliderConstraint,
	 * so make sure of that first.
	 */
	public SliderConstraint asSliderConstraint() {
		if (this instanceof SliderConstraint c)
			return c;

		return new SliderConstraint(jphConstraint, false);
	}

	/*
	 * The method does not check if the memory segment points to a SliderConstraint,
	 * so make sure of that first.
	 */
	public SwingTwistConstraint asSwingTwistConstraint() {
		if (this instanceof SwingTwistConstraint c)
			return c;

		return new SwingTwistConstraint(jphConstraint, false);
	}
}