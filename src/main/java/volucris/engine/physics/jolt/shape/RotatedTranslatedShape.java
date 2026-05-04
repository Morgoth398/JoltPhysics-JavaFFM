package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A rotated translated shape will rotate and translate a child shape. Shifts
 * the child object so that it is centered around the center of mass.
 */
public final class RotatedTranslatedShape extends DecoratedShape {

	private static final MethodHandle JPH_ROTATED_TRANSLATED_SHAPE_CREATE;
	private static final MethodHandle JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION;
	private static final MethodHandle JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION;

	private Quat quatTmp;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_ROTATED_TRANSLATED_SHAPE_CREATE = downcallHandle("JPH_RotatedTranslatedShape_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION = downcallHandleVoid("JPH_RotatedTranslatedShape_GetPosition", ADDRESS, ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION = downcallHandleVoid("JPH_RotatedTranslatedShape_GetRotation", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected RotatedTranslatedShape(MemorySegment segment) {
		this(segment, true);
	}

	protected RotatedTranslatedShape(MemorySegment segment, boolean owns) {
		super(segment);

		quatTmp = new Quat();

		vecTmp = new Vec3();
	}

	public RotatedTranslatedShape(Vector3f position, Quaternionf rotation, Shape shape) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, position);
			Quat quat = new Quat(arena, rotation);

			MemorySegment posAddr = vec.memorySegment();
			MemorySegment rotAddr = quat.memorySegment();
			MemorySegment shapeAddr = shape.memorySegment();

			MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(posAddr, rotAddr, shapeAddr);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call create rotated translated shape.");
		}
		super(segment);

		quatTmp = new Quat();

		vecTmp = new Vec3();
	}

	/**
	 * Access the translation that has been applied to the inner shape.
	 */
	public Vector3f getPosition(Vector3f target) {
		try {
			MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION;
			method.invokeExact(jphShape, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get position.");
		}
	}
	
	/**
	 * Access the translation that has been applied to the inner shape.
	 */
	public Vector3f getPosition() {
		return getPosition(new Vector3f());
	}
	
	/**
	 * Access the rotation that is applied to the inner shape. 
	 */
	public Quaternionf getRotation(Quaternionf target) {
		try {
			MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION;
			method.invokeExact(jphShape, quatTmp.memorySegment());

			return quatTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get rotation.");
		}
	}
	
	/**
	 * Access the rotation that is applied to the inner shape. 
	 */
	public Quaternionf getRotation() {
		return getRotation(new Quaternionf());
	}

}