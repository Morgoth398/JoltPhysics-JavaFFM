package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A cylinder with different top and bottom radii.
 */
public final class TaperedCylinderShape extends ConvexShape {

	private static final MethodHandle JPH_TAPERED_CYLINDER_SHAPE_GET_TOP_RADIUS;
	private static final MethodHandle JPH_TAPERED_CYLINDER_SHAPE_GET_BOTTOM_RADIUS;
	private static final MethodHandle JPH_TAPERED_CYLINDER_SHAPE_GET_CONVEX_RADIUS;
	private static final MethodHandle JPH_TAPERED_CYLINDER_SHAPE_GET_HALF_HEIGHT;

	static {
		//@formatter:off
		JPH_TAPERED_CYLINDER_SHAPE_GET_TOP_RADIUS = downcallHandle("JPH_TaperedCylinderShape_GetTopRadius", JAVA_FLOAT, ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_GET_BOTTOM_RADIUS = downcallHandle("JPH_TaperedCylinderShape_GetBottomRadius", JAVA_FLOAT, ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_TaperedCylinderShape_GetConvexRadius", JAVA_FLOAT, ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_GET_HALF_HEIGHT = downcallHandle("JPH_TaperedCylinderShape_GetHalfHeight", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected TaperedCylinderShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected TaperedCylinderShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected TaperedCylinderShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected TaperedCylinderShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	public float getTopRadius() {
		try {
			MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_GET_TOP_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get top radius: " + className);
		}
	}

	public float getBottomRadius() {
		try {
			MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_GET_BOTTOM_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get bottom radius: " + className);
		}
	}

	public float getConvexRadius() {
		try {
			MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_GET_CONVEX_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get convex radius: " + className);
		}
	}

	public float getHalfHeight() {
		try {
			MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_GET_HALF_HEIGHT;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get half height: " + className);
		}
	}

}