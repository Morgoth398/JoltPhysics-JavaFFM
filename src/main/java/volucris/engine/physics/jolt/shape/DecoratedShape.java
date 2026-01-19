package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Base class for shapes that decorate another shape with extra functionality
 * (e.g. scale, translation etc.)
 */
public sealed class DecoratedShape extends Shape permits OffsetCenterOfMassShape, RotatedTranslatedShape, ScaledShape {

	private static final MethodHandle JPH_DECORATED_SHAPE_GET_INNER_SHAPE;

	static {
		//@formatter:off
		JPH_DECORATED_SHAPE_GET_INNER_SHAPE = downcallHandle("JPH_DecoratedShape_GetInnerShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected DecoratedShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected DecoratedShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected DecoratedShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected DecoratedShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	/**
	 * Access to the decorated inner shape.
	 */
	public Shape getInnerShape() {
		try {
			MethodHandle method = JPH_DECORATED_SHAPE_GET_INNER_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShape);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Shape shape = Jolt.getShape(segment.address());
			if (shape != null)
				return shape;

			return new Shape(segment, false);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get inner shape: " + className);
		}
	}

	/**
	 * The method does not check if the memory segment points to a
	 * OffsetCenterOfMassShape, so make sure of that first.
	 */
	public OffsetCenterOfMassShape asOffsetCenterOfMassShape() {
		if (this instanceof OffsetCenterOfMassShape s)
			return s;

		return new OffsetCenterOfMassShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a
	 * RotatedTranslatedShape, so make sure of that first.
	 */
	public RotatedTranslatedShape asRotatedTranslatedShape() {
		if (this instanceof RotatedTranslatedShape s)
			return s;

		return new RotatedTranslatedShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a ScaledShape, so
	 * make sure of that first.
	 */
	public ScaledShape asScaledShape() {
		if (this instanceof ScaledShape s)
			return s;

		return new ScaledShape(jphShape, false);
	}

}