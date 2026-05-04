package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * A mesh shape, consisting of triangles. Mesh shapes are mostly used for static
 * geometry. They can be used by dynamic or kinematic objects but only if they
 * don't collide with other mesh or heightfield shapes as those collisions are
 * currently not supported. Note that if you make a mesh shape a dynamic or
 * kinematic object, you need to provide a mass yourself as mesh shapes don't
 * need to form a closed hull so don't have a well defined volume from which the
 * mass can be calculated.
 */
public final class MeshShape extends Shape {

	private static final MethodHandle JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA;

	static {
		//@formatter:off
		JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA = downcallHandle("JPH_MeshShape_GetTriangleUserData", JAVA_INT, ADDRESS, JAVA_INT);
		//@formatter:on
	}

	protected MeshShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected MeshShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected MeshShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected MeshShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	public int getTriangleUserData(int id) {
		try {
			MethodHandle method = JPH_MESH_SHAPE_GET_TRIANGLE_USER_DATA;
			return (int) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get triangle user data: " + className);
		}
	}

}