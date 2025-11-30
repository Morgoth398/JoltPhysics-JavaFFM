package volucris.engine.physics.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A capsule with different top and bottom radii.
 */
public final class TaperedCapsuleShape extends ConvexShape {

	private static final MethodHandle JPH_TAPERED_CAPSULE_SHAPE_GET_TOP_RADIUS;
	private static final MethodHandle JPH_TAPERED_CAPSULE_SHAPE_GET_BOTTOM_RADIUS;
	private static final MethodHandle JPH_TAPERED_CAPSULE_SHAPE_GET_HALF_HEIGHT;

	static {
		//@formatter:off
		JPH_TAPERED_CAPSULE_SHAPE_GET_TOP_RADIUS = downcallHandle("JPH_TaperedCapsuleShape_GetTopRadius", JAVA_FLOAT, ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_GET_BOTTOM_RADIUS = downcallHandle("JPH_TaperedCapsuleShape_GetBottomRadius", JAVA_FLOAT, ADDRESS);
		JPH_TAPERED_CAPSULE_SHAPE_GET_HALF_HEIGHT = downcallHandle("JPH_TaperedCapsuleShape_GetHalfHeight", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected TaperedCapsuleShape(MemorySegment segment) {
		this(segment, true);
	}

	protected TaperedCapsuleShape(MemorySegment segment, boolean owns) {
		super(segment, owns);
	}

	public float getTopRadius() {
		try {
			MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_GET_TOP_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get top radius.");
		}
	}

	public float getBottomRadius() {
		try {
			MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_GET_BOTTOM_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get bottom radius.");
		}
	}

	public float getHalfHeight() {
		try {
			MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_GET_HALF_HEIGHT;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get half height.");
		}
	}

}