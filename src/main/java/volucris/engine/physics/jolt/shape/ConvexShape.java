package volucris.engine.physics.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Base class for all convex shapes. Defines a virtual interface.
 */
public sealed class ConvexShape extends Shape permits BoxShape, CapsuleShape, ConvexHullShape, CylinderShape,
		SphereShape, TaperedCapsuleShape, TaperedCylinderShape, TriangleShape {

	private static final MethodHandle JPH_CONVEX_SHAPE_GET_DENSITY;
	private static final MethodHandle JPH_CONVEX_SHAPE_SET_DENSITY;

	static {
		//@formatter:off
		JPH_CONVEX_SHAPE_GET_DENSITY = downcallHandle("JPH_ConvexShape_GetDensity", JAVA_FLOAT, ADDRESS);
		JPH_CONVEX_SHAPE_SET_DENSITY = downcallHandleVoid("JPH_ConvexShape_SetDensity", ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	protected ConvexShape(MemorySegment segment) {
		this(segment, true);
	}

	protected ConvexShape(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}

	/**
	 * Get density of the shape (kg / m^3)
	 */
	public float getDensity() {
		try {
			MethodHandle method = JPH_CONVEX_SHAPE_GET_DENSITY;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get density.");
		}
	}

	/**
	 * Set density of the shape (kg / m^3)
	 */
	public void setDensity(float density) {
		try {
			MethodHandle method = JPH_CONVEX_SHAPE_SET_DENSITY;
			method.invokeExact(jphShape, density);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot set density.");
		}
	}

	/**
	 * The method does not check if the memory segment points to a BoxShape, so make
	 * sure of that first.
	 */
	public BoxShape asBoxShape() {
		if (this instanceof BoxShape s)
			return s;

		return new BoxShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a CapsuleShape, so
	 * make sure of that first.
	 */
	public CapsuleShape asCapsuleShape() {
		if (this instanceof CapsuleShape s)
			return s;

		return new CapsuleShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a ConvexHullShape,
	 * so make sure of that first.
	 */
	public ConvexHullShape asConvexHullShape() {
		if (this instanceof ConvexHullShape s)
			return s;

		return new ConvexHullShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a CylinderShape, so
	 * make sure of that first.
	 */
	public CylinderShape asCylinderShape() {
		if (this instanceof CylinderShape s)
			return s;

		return new CylinderShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a SphereShape, so
	 * make sure of that first.
	 */
	public SphereShape asSphereShape() {
		if (this instanceof SphereShape s)
			return s;

		return new SphereShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a
	 * TaperedCapsuleShape, so make sure of that first.
	 */
	public TaperedCapsuleShape asTaperedCapsuleShape() {
		if (this instanceof TaperedCapsuleShape s)
			return s;

		return new TaperedCapsuleShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a
	 * TaperedCylinderShape, so make sure of that first.
	 */
	public TaperedCylinderShape asTaperedCylinderShape() {
		if (this instanceof TaperedCylinderShape s)
			return s;

		return new TaperedCylinderShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a TriangleShape, so
	 * make sure of that first.
	 */
	public TriangleShape asTriangleShape() {
		if (this instanceof TriangleShape s)
			return s;

		return new TriangleShape(jphShape, false);
	}

}