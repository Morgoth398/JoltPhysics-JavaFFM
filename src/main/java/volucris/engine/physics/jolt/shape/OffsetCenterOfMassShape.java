package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.JoltRuntimeException;

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
		this(segment, Arena.ofAuto());
	}

	protected OffsetCenterOfMassShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected OffsetCenterOfMassShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected OffsetCenterOfMassShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);

		vecTmp = new Vec3(arena);
	}

	public OffsetCenterOfMassShape(Vector3f offset, Shape shape) {
		this(offset, shape, Arena.ofAuto());
	}

	public OffsetCenterOfMassShape(Vector3f offset, Shape shape, Arena arena) {
		MemorySegment segment;
		try {
			Vec3 vec = vecTmp = new Vec3(arena, offset);

			MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(vec.memorySegment(), shape.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create OffsetCenterOfMassShape: " + className);
		}
		super(segment, arena);
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
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get offset: " + className);
		}
	}

	public Vector3f getOffset() {
		return getOffset(new Vector3f());
	}

}