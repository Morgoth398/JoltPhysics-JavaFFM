package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Quaternionf;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Quaternion class, quaternions are 4 dimensional vectors which can describe
 * rotations in 3 dimensional space if their length is 1.
 * <p>
 * They are written as:
 * <p>
 * 𝑞=𝑤+𝑥𝑖+𝑦𝑗+𝑧𝑘
 * <p>
 * or in vector notation:
 * <p>
 * 𝑞=[𝑤,𝑣]=[𝑤,𝑥,𝑦,𝑧]
 * <p>
 * Where:
 * <p>
 * w = the real part v = the imaginary part, (x, y, z)
 * <p>
 * Note that we store the quaternion in a Vec4 as [x, y, z, w] because that
 * makes it easy to extract the rotation axis of the quaternion:
 * <p>
 * q = [cos(angle / 2), sin(angle / 2) * rotation_axis]
 * <p>
 */
public final class Quat {

	private static final StructLayout LAYOUT;

	private static final VarHandle X;
	private static final VarHandle Y;
	private static final VarHandle Z;
	private static final VarHandle W;

	private final MemorySegment jphQuat;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_FLOAT.withName("x"),
		        JAVA_FLOAT.withName("y"),
		        JAVA_FLOAT.withName("z"),
		        JAVA_FLOAT.withName("w")
			).withName("JPH_Quat");
		//@formatter:on

		X = varHandle(LAYOUT, "x");
		Y = varHandle(LAYOUT, "y");
		Z = varHandle(LAYOUT, "z");
		W = varHandle(LAYOUT, "w");
	}

	public Quat(Quaternionf quaternion) {
		this(Arena.ofAuto(), quaternion);
	}

	public Quat(Arena arena, Quaternionf quaternion) {
		jphQuat = arena.allocate(LAYOUT);

		set(quaternion);
	}

	public Quat() {
		jphQuat = Arena.ofAuto().allocate(LAYOUT);
	}

	public Quat(Arena arena) {
		jphQuat = arena.allocate(LAYOUT);
	}

	public void set(Quaternionf quaternion) {
		set(quaternion.x, quaternion.y, quaternion.z, quaternion.w);
	}

	public void set(float x, float y, float z, float w) {
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
	}

	public void setX(float x) {
		X.set(jphQuat, x);
	}

	public float getX() {
		return (float) X.get(jphQuat);
	}

	public void setY(float y) {
		Y.set(jphQuat, y);
	}

	public float getY() {
		return (float) Y.get(jphQuat);
	}

	public void setZ(float z) {
		Z.set(jphQuat, z);
	}

	public float getZ() {
		return (float) Z.get(jphQuat);
	}

	public void setW(float w) {
		W.set(jphQuat, w);
	}

	public float getW() {
		return (float) W.get(jphQuat);
	}

	public Quaternionf get(Quaternionf target) {
		return target.set(getX(), getY(), getZ(), getW());
	}

	public Quaternionf get() {
		return get(new Quaternionf());
	}

	public MemorySegment memorySegment() {
		return jphQuat;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
