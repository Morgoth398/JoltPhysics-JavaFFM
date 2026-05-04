package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * A height field shape. Cannot be used as a dynamic object.
 * <p>
 * Note: If you're using HeightFieldShape and are querying data while modifying
 * the shape you'll have a race condition. In this case it is best to create a
 * new HeightFieldShape using the Clone function. You replace the shape on a
 * body using BodyInterface::SetShape. If a query is still working on the old
 * shape, it will have taken a reference and keep the old shape alive until the
 * query finishes.
 */
public final class HeightFieldShape extends Shape {

	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_GET_POSITION;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE;
	private static final MethodHandle JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE;

	private Vec3 vecTmp;
	private Vec3 vecTmp2;

	static {
		//@formatter:off
		JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT = downcallHandle("JPH_HeightFieldShape_GetSampleCount", JAVA_INT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE = downcallHandle("JPH_HeightFieldShape_GetBlockSize", JAVA_INT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL = downcallHandle("JPH_HeightFieldShape_GetMaterial", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_GET_POSITION = downcallHandleVoid("JPH_HeightFieldShape_GetPosition", ADDRESS, JAVA_INT, JAVA_INT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION = downcallHandle("JPH_HeightFieldShape_IsNoCollision", JAVA_BOOLEAN, ADDRESS, JAVA_INT, JAVA_INT);
		JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE = downcallHandle("JPH_HeightFieldShape_ProjectOntoSurface", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShape_GetMinHeightValue", JAVA_FLOAT, ADDRESS);
		JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE = downcallHandle("JPH_HeightFieldShape_GetMaxHeightValue", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected HeightFieldShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected HeightFieldShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected HeightFieldShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected HeightFieldShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);

		vecTmp = new Vec3(arena);
		vecTmp2 = new Vec3(arena);
	}

	/**
	 * Get the size of the height field. Note that this will always be rounded up to
	 * the nearest multiple of getBlockSize().
	 */
	public int getSampleCount() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_SAMPLE_COUNT;
			return (int) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get sample count: " + className);
		}
	}

	/**
	 * Get the size of a block.
	 */
	public int getBlockSize() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_BLOCK_SIZE;
			return (int) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get block size: " + className);
		}
	}

	/**
	 * Get the material at a particular location.
	 */
	public PhysicsMaterial getMaterial(int x, int y) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MATERIAL;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShape, x, y);

			if (segment.equals(MemorySegment.NULL))
				return null;

			PhysicsMaterial material = Jolt.getMaterial(segment.address());
			if (material != null)
				return material;

			return new PhysicsMaterial(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get material: " + className);
		}
	}

	/**
	 * Get height field position at sampled location (inX, inY). where inX and inY
	 * are integers in the range inX e [0, mSampleCount - 1] and inY e [0,
	 * mSampleCount - 1].
	 */
	public Vector3f getPosition(int x, int y, Vector3f target) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_POSITION;
			method.invokeExact(jphShape, x, y, vecTmp.memorySegment());
			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get position: " + className);
		}
	}

	/**
	 * @see #getPosition(int, int, Vector3f)
	 */
	public Vector3f getPosition(int x, int y) {
		return getPosition(x, y, new Vector3f());
	}

	/**
	 * Check if height field at sampled location (inX, inY) has collision (has a
	 * hole or not)
	 */
	public boolean isNoCollision(int x, int y) {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_IS_NO_COLLISION;
			return (boolean) method.invokeExact(jphShape, x, y);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call isNoCollision: " + className);
		}
	}

	/**
	 * Projects localPosition (a point in the space of the shape) along the Y axis
	 * onto the surface and returns it in outSurfacePosition. When there is no
	 * surface position (because of a hole or because the point is outside the
	 * heightfield) the function will return false.
	 */
	public boolean projectOntoSurface(Vector3f localPosition, Vector3f outSurfacePosition, int[] outSubShapeID) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment intPointer = arena.allocate(JAVA_INT);

			vecTmp.set(localPosition);

			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment targetAddr = vecTmp2.memorySegment();

			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_PROJECT_ONTO_SURFACE;
			boolean value = (boolean) method.invokeExact(jphShape, posAddr, targetAddr, intPointer);

			vecTmp2.get(outSurfacePosition);

			outSubShapeID[0] = intPointer.getAtIndex(JAVA_INT, 0);

			return value;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call projectOntoSurface: " + className);
		}
	}

	/**
	 * Get the range of height values that this height field can encode. Can be used
	 * to determine the allowed range when setting the height values with
	 * SetHeights.
	 */
	public float getMinHeightValue() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MIN_HEIGHT_VALUE;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get min height value: " + className);
		}
	}

	/**
	 * @see #getMinHeightValue()
	 */
	public float getMaxHeightValue() {
		try {
			MethodHandle method = JPH_HEIGHT_FIELD_SHAPE_GET_MAX_HEIGHT_VALUE;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get max height value: " + className);
		}
	}

}