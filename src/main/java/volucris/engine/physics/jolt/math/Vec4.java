package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector4f;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public class Vec4 {

	private static final StructLayout LAYOUT;

	private static final VarHandle X;
	private static final VarHandle Y;
	private static final VarHandle Z;
	private static final VarHandle W;

	private final MemorySegment jphVec4;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_FLOAT.withName("x"),
		        JAVA_FLOAT.withName("y"),
		        JAVA_FLOAT.withName("z"),
		        JAVA_FLOAT.withName("w")
			).withName("JPH_Vec4");
		//@formatter:on

		X = varHandle(LAYOUT, "x");
		Y = varHandle(LAYOUT, "y");
		Z = varHandle(LAYOUT, "z");
		W = varHandle(LAYOUT, "w");
	}

	public Vec4() {
		this(Arena.ofAuto());
	}

	public Vec4(Arena arena) {
		jphVec4 = arena.allocate(LAYOUT);
	}

	public Vec4(MemorySegment segment) {
		jphVec4 = segment;
	}

	public void set(float x, float y, float z, float w) {
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
	}

	public void set(Vector4f vector) {
		set(vector.x, vector.y, vector.z, vector.w);
	}

	public void setX(float x) {
		X.set(jphVec4, x);
	}

	public float getX() {
		return (float) X.get(jphVec4);
	}

	public void setY(float y) {
		Y.set(jphVec4, y);
	}

	public float getY() {
		return (float) Y.get(jphVec4);
	}

	public void setZ(float z) {
		Z.set(jphVec4, z);
	}

	public float getZ() {
		return (float) Z.get(jphVec4);
	}

	public void setW(float w) {
		W.set(jphVec4, w);
	}

	public float getW() {
		return (float) W.get(jphVec4);
	}

	public Vector4f get(Vector4f target) {
		return target.set(getX(), getY(), getZ(), getW());
	}

	public Vector4f get() {
		return get(new Vector4f());
	}

	public MemorySegment memorySegment() {
		return jphVec4;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}
}
