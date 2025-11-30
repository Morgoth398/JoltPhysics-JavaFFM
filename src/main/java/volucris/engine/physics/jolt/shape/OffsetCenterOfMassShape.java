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
 * This shape will shift the center of mass of a child shape, it can e.g. be
 * used to lower the center of mass of an unstable object like a boat to make it
 * stable.
 */
public final class OffsetCenterOfMassShape extends DecoratedShape {

	private static final MethodHandle JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE;
	private static final MethodHandle JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE = downcallHandle("JPH_OffsetCenterOfMassShape_Create", ADDRESS, ADDRESS, ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET = downcallHandleVoid("JPH_OffsetCenterOfMassShape_GetOffset", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected OffsetCenterOfMassShape(MemorySegment segment) {
		this(segment, true);
	}

	protected OffsetCenterOfMassShape(MemorySegment segment, boolean owns) {
		super(segment, owns);

		vecTmp = new Vec3();
	}

	public OffsetCenterOfMassShape(Vector3f offset, Shape shape) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, offset);

			MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(vec.memorySegment(), shape.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create OffsetCenterOfMassShape.");
		}
		super(segment);

		vecTmp = new Vec3();
	}

	/**
	 * Access the offset that is applied to the center of mass. 
	 */
	public Vector3f getOffset(Vector3f target) {
		try {
			MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET;
			method.invokeExact(jphShape, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get offset.");
		}
	}

	public Vector3f getOffset() {
		return getOffset(new Vector3f());
	}

}