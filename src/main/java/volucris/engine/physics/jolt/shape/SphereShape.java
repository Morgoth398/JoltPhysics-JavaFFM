package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

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
		this(segment, Arena.ofAuto());
	}

	protected SphereShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected SphereShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected SphereShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	public SphereShape(float radius) {
		this(radius, Arena.ofAuto());
	}

	public SphereShape(float radius, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_SPHERE_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(radius);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create sphereShape: " + className);
		}
		super(segment, arena);
	}

	/**
	 * Radius of the sphere.
	 */
	public float getRadius() {
		try {
			MethodHandle method = JPH_SPHERE_SHAPE_GET_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get radius: " + className);
		}
	}

}