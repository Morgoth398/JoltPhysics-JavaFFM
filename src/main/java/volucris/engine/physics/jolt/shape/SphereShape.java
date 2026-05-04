package volucris.engine.physics.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A sphere, centered around the origin. Note that it is implemented as a point
 * with convex radius.
 */
public final class SphereShape extends ConvexShape {

	private static final MethodHandle JPH_SPHERE_SHAPE_CREATE;
	private static final MethodHandle JPH_SPHERE_SHAPE_GET_RADIUS;

	static {
		//@formatter:off
		JPH_SPHERE_SHAPE_CREATE = downcallHandle("JPH_SphereShape_Create", ADDRESS, JAVA_FLOAT);
		JPH_SPHERE_SHAPE_GET_RADIUS = downcallHandle("JPH_SphereShape_GetRadius", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected SphereShape(MemorySegment segment) {
		this(segment, true);
	}

	protected SphereShape(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}

	public SphereShape(float radius) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_SPHERE_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(radius);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create sphereShape.");
		}
		super(segment);
	}

	/**
	 * Radius of the sphere.
	 */
	public float getRadius() {
		try {
			MethodHandle method = JPH_SPHERE_SHAPE_GET_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get radius.");
		}
	}

}