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
 * A single triangle, not the most efficient way of creating a world filled with
 * triangles but can be used as a query shape for example.
 */
public final class TriangleShape extends ConvexShape {

	private static final MethodHandle JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS;
	private static final MethodHandle JPH_TRIANGLE_SHAPE_GET_VERTEX1;
	private static final MethodHandle JPH_TRIANGLE_SHAPE_GET_VERTEX2;
	private static final MethodHandle JPH_TRIANGLE_SHAPE_GET_VERTEX3;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_TriangleShape_GetConvexRadius", JAVA_FLOAT, ADDRESS);
		JPH_TRIANGLE_SHAPE_GET_VERTEX1 = downcallHandleVoid("JPH_TriangleShape_GetVertex1", ADDRESS, ADDRESS);
		JPH_TRIANGLE_SHAPE_GET_VERTEX2 = downcallHandleVoid("JPH_TriangleShape_GetVertex2", ADDRESS, ADDRESS);
		JPH_TRIANGLE_SHAPE_GET_VERTEX3 = downcallHandleVoid("JPH_TriangleShape_GetVertex3", ADDRESS, ADDRESS);
		//@formatter:on
	}

	protected TriangleShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}
	
	protected TriangleShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected TriangleShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}
	
	protected TriangleShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);

		vecTmp = new Vec3(arena);
	}

	public float getConvexRadius() {
		try {
			MethodHandle method = JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get convex radius.");
		}
	}

	public Vector3f getVertex1(Vector3f target) {
		try {
			MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX1;
			method.invokeExact(jphShape, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get vertex1.");
		}
	}

	public Vector3f getVertex1() {
		return getVertex1(new Vector3f());
	}

	public Vector3f getVertex2(Vector3f target) {
		try {
			MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX2;
			method.invokeExact(jphShape, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get vertex2.");
		}
	}

	public Vector3f getVertex2() {
		return getVertex2(new Vector3f());
	}

	public Vector3f getVertex3(Vector3f target) {
		try {
			MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX3;
			method.invokeExact(jphShape, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get vertex3.");
		}
	}

	public Vector3f getVertex3() {
		return getVertex3(new Vector3f());
	}

}