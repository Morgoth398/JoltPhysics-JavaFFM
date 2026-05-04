package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A box, centered around the origin.
 */
public final class BoxShape extends ConvexShape {

	private static final MethodHandle JPH_BOX_SHAPE_CREATE;
	private static final MethodHandle JPH_BOX_SHAPE_GET_HALF_EXTENT;
	private static final MethodHandle JPH_BOX_SHAPE_GET_CONVEX_RADIUS;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_BOX_SHAPE_CREATE = downcallHandle("JPH_BoxShape_Create", ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_BOX_SHAPE_GET_HALF_EXTENT = downcallHandleVoid("JPH_BoxShape_GetHalfExtent", ADDRESS, ADDRESS);
		JPH_BOX_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_BoxShape_GetConvexRadius", JAVA_FLOAT, ADDRESS);
		//@formatter:on
	}

	protected BoxShape(MemorySegment segment) {
		this(segment, true);
	}

	protected BoxShape(MemorySegment segment, boolean owns) {
		super(segment, owns);

		vecTmp = new Vec3();
	}

	public BoxShape(Vector3f halfExtent) {
		this(halfExtent, PhysicsSettings.DEFAULT_CONVEX_RADIUS);
	}

	public BoxShape(Vector3f halfExtent, float convexRadius) {
		this(halfExtent.x, halfExtent.y, halfExtent.z, convexRadius);
	}

	public BoxShape(float halfExtentX, float halfExtentY, float halfExtentZ) {
		this(halfExtentX, halfExtentY, halfExtentZ, PhysicsSettings.DEFAULT_CONVEX_RADIUS);
	}

	public BoxShape(float halfExtentX, float halfExtentY, float halfExtentZ, float convexRadius) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, halfExtentX, halfExtentY, halfExtentZ);

			MethodHandle method = JPH_BOX_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(vec.memorySegment(), convexRadius);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create box shape.");
		}
		super(segment);

		vecTmp = new Vec3();
	}

	public Vector3f getHalfExtent(Vector3f target) {
		try {
			MethodHandle method = JPH_BOX_SHAPE_GET_HALF_EXTENT;
			method.invokeExact(jphShape, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call get half extent.");
		}
	}

	public Vector3f getHalfExtent() {
		return getHalfExtent(new Vector3f());
	}

	public float getConvexRadius() {
		try {
			MethodHandle method = JPH_BOX_SHAPE_GET_CONVEX_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get convex radius.");
		}
	}

}