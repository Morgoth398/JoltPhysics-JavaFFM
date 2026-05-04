package volucris.engine.physics.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A plane shape. The negative half space is considered solid. Planes cannot be
 * dynamic objects, only static or kinematic. The plane is considered an
 * infinite shape, but testing collision outside of its bounding box (defined by
 * the half-extent parameter) will not return a collision result. At the edge of
 * the bounding box collision with the plane will be inconsistent. If you need
 * something of a well defined size, a box shape may be better.
 */
public final class PlaneShape extends Shape {

	private static final MethodHandle JPH_PLANE_SHAPE_CREATE;
	private static final MethodHandle JPH_PLANE_SHAPE_GET_PLANE;
	private static final MethodHandle JPH_PLANE_SHAPE_GET_HALF_EXTENT;

	static {
		//@formatter:off
		JPH_PLANE_SHAPE_CREATE = downcallHandle("JPH_PlaneShape_Create", ADDRESS, ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_PLANE_SHAPE_GET_PLANE = downcallHandleVoid("JPH_PlaneShape_GetPlane", ADDRESS, ADDRESS);
		JPH_PLANE_SHAPE_GET_HALF_EXTENT = downcallHandle("JPH_PlaneShape_GetHalfExtent", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected PlaneShape(MemorySegment segment) {
		this(segment, true);
	}

	protected PlaneShape(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}

	public PlaneShape(Plane plane, float halfExtent) {
		this(plane, null, halfExtent);
	}

	public PlaneShape(Plane plane, PhysicsMaterial material, float halfExtent) {
		MemorySegment segment;
		try {
			MemorySegment planeAddr = plane.memorySegment();
			MemorySegment matAddr = material == null ? MemorySegment.NULL : material.memorySegment();

			MethodHandle method = JPH_PLANE_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(planeAddr, matAddr, halfExtent);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create plane shape.");
		}
		super(segment);
	}

	public Plane getPlane(Plane target) {
		try {
			MethodHandle method = JPH_PLANE_SHAPE_GET_PLANE;
			method.invokeExact(jphShape, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get plane.");
		}
	}

	public Plane getPlane() {
		return getPlane(new Plane());
	}

	/**
	 * Get the half-extent of the bounding box of the plane.
	 */
	public float getHalfExtent() {
		try {
			MethodHandle method = JPH_PLANE_SHAPE_GET_HALF_EXTENT;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get half extent.");
		}
	}

}