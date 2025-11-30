package volucris.engine.physics.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A cylinder
 */
public final class CylinderShape extends ConvexShape {

	private static final MethodHandle JPH_CYLINDER_SHAPE_CREATE;
	private static final MethodHandle JPH_CYLINDER_SHAPE_GET_RADIUS;
	private static final MethodHandle JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT;

	static {
		//@formatter:off
		JPH_CYLINDER_SHAPE_CREATE = downcallHandle("JPH_CylinderShape_Create", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_CYLINDER_SHAPE_GET_RADIUS = downcallHandle("JPH_CylinderShape_GetRadius", JAVA_FLOAT, ADDRESS);
		JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT = downcallHandle("JPH_CylinderShape_GetHalfHeight", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected CylinderShape(MemorySegment segment) {
		this(segment, true);
	}

	protected CylinderShape(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}

	public CylinderShape(float halfHeight, float radius) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_CYLINDER_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(halfHeight, radius);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create cylinder shape.");
		}
		super(segment);
	}

	/**
	 * Get radius of cylinder.
	 */
	public float getRadius() {
		try {
			MethodHandle method = JPH_CYLINDER_SHAPE_GET_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get radius.");
		}
	}

	/**
	 * Get half height of cylinder.
	 */
	public float getHalfHeight() {
		try {
			MethodHandle method = JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get half height.");
		}
	}

}