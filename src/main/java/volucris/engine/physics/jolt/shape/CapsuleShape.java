package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A capsule, implemented as a line segment with convex radius.
 */
public final class CapsuleShape extends ConvexShape {

	private static final MethodHandle JPH_CAPSULE_SHAPE_CREATE;
	private static final MethodHandle JPH_CAPSULE_SHAPE_GET_RADIUS;
	private static final MethodHandle JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER;

	static {
		//@formatter:off
		JPH_CAPSULE_SHAPE_CREATE = downcallHandle("JPH_CapsuleShape_Create", ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_CAPSULE_SHAPE_GET_RADIUS = downcallHandle("JPH_CapsuleShape_GetRadius", JAVA_FLOAT, ADDRESS);
		JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER = downcallHandle("JPH_CapsuleShape_GetHalfHeightOfCylinder", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected CapsuleShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected CapsuleShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected CapsuleShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected CapsuleShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	public CapsuleShape(float halfHeightOfCylinder, float radius) {
		this(halfHeightOfCylinder, radius, Arena.ofAuto());
	}

	public CapsuleShape(float halfHeightOfCylinder, float radius, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_CAPSULE_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(halfHeightOfCylinder, radius);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create capsule shape: " + className);
		}
		super(segment, arena);
	}

	/**
	 * Radius of the cylinder.
	 */
	public float getRadius() {
		try {
			MethodHandle method = JPH_CAPSULE_SHAPE_GET_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get radius: " + className);
		}
	}

	/**
	 * Get half of the height of the cylinder.
	 */
	public float getHalfHeightOfCylinder() {
		try {
			MethodHandle method = JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get half height of cylinder: " + className);
		}
	}

}