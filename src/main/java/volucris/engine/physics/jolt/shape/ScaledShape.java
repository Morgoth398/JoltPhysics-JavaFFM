package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A shape that scales a child shape in local space of that shape. The scale can
 * be non-uniform and can even turn it inside out when one or three components
 * of the scale are negative.
 */
public final class ScaledShape extends DecoratedShape {

	private static final MethodHandle JPH_SCALED_SHAPE_CREATE;
	private static final MethodHandle JPH_SCALED_SHAPE_GET_SCALE;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_SCALED_SHAPE_CREATE = downcallHandle("JPH_ScaledShape_Create", ADDRESS, ADDRESS, ADDRESS);
		JPH_SCALED_SHAPE_GET_SCALE = downcallHandleVoid("JPH_ScaledShape_GetScale", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected ScaledShape(MemorySegment segment) {
		this(segment, true);
	}

	protected ScaledShape(MemorySegment segment, boolean owns) {
		super(segment, owns);

		vecTmp = new Vec3();
	}

	public ScaledShape(Shape shape, Vector3f scale) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, scale);

			MethodHandle method = JPH_SCALED_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(shape.memorySegment(), vec.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create scaled shape.");
		}
		super(segment);

		vecTmp = new Vec3();
	}

	public Vector3f getScale(Vector3f target) {
		try {
			MethodHandle method = JPH_SCALED_SHAPE_GET_SCALE;
			method.invokeExact(jphShape, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get scale.");
		}
	}

	public Vector3f getScale() {
		return getScale(new Vector3f());
	}

}