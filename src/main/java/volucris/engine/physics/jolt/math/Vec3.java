package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * 3 component vector.
 */
public final class Vec3 {

	private static final StructLayout LAYOUT;

	private static final VarHandle X;
	private static final VarHandle Y;
	private static final VarHandle Z;

	private final MemorySegment jphVec3;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_FLOAT.withName("x"),
		        JAVA_FLOAT.withName("y"),
		        JAVA_FLOAT.withName("z")
			).withName("JPH_Vec3");
		//@formatter:on

		X = varHandle(LAYOUT, "x");
		Y = varHandle(LAYOUT, "y");
		Z = varHandle(LAYOUT, "z");
	}

	public Vec3() {
		jphVec3 = Arena.ofAuto().allocate(LAYOUT);
	}

	public Vec3(Arena arena) {
		jphVec3 = arena.allocate(LAYOUT);
	}

	public Vec3(Vector3f vector) {
		this(Arena.ofAuto(), vector);
	}

	public Vec3(Arena arena, Vector3f vector) {
		jphVec3 = arena.allocate(LAYOUT);

		set(vector);
	}

	public Vec3(Arena arena, float x, float y, float z) {
		jphVec3 = arena.allocate(LAYOUT);

		set(x, y, z);
	}

	public Vec3(MemorySegment segment) {
		jphVec3 = segment;
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphVec3, 0, LAYOUT.byteSize());
	}

	public void set(float x, float y, float z) {
		setX(x);
		setY(y);
		setZ(z);
	}

	public void set(Vector3f vector) {
		set(vector.x, vector.y, vector.z);
	}

	public void setX(float x) {
		X.set(jphVec3, x);
	}

	public float getX() {
		return (float) X.get(jphVec3);
	}

	public void setY(float y) {
		Y.set(jphVec3, y);
	}

	public float getY() {
		return (float) Y.get(jphVec3);
	}

	public void setZ(float z) {
		Z.set(jphVec3, z);
	}

	public float getZ() {
		return (float) Z.get(jphVec3);
	}

	public Vector3f get(Vector3f target) {
		return target.set(getX(), getY(), getZ());
	}

	public Vector3f get() {
		return get(new Vector3f());
	}

	public MemorySegment memorySegment() {
		return jphVec3;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
