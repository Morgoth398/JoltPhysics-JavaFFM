package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;

import org.joml.Matrix4f;
import org.joml.Vector4f;

/**
 * Holds a 4x4 matrix of floats, but supports also operations on the 3x3 upper
 * left part of the matrix.
 */
public final class Mat4 {

	private static final StructLayout LAYOUT;

	private static final long COLUMN_0_OFFSET;
	private static final long COLUMN_1_OFFSET;
	private static final long COLUMN_2_OFFSET;
	private static final long COLUMN_3_OFFSET;

	private final MemorySegment jphMat4;

	private final Vec4[] columns;

	private Vector4f tmp;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				MemoryLayout.sequenceLayout(4, Vec4.LAYOUT()).withName("column")
			).withName("JPH_Mat4");
		//@formatter:on

		COLUMN_0_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("column"), PathElement.sequenceElement(0));
		COLUMN_1_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("column"), PathElement.sequenceElement(1));
		COLUMN_2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("column"), PathElement.sequenceElement(2));
		COLUMN_3_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("column"), PathElement.sequenceElement(3));
	}

	public Mat4(MemorySegment segment) {
		jphMat4 = segment;

		columns = new Vec4[4];
		columns[0] = new Vec4(jphMat4.asSlice(COLUMN_0_OFFSET, Vec4.LAYOUT()));
		columns[1] = new Vec4(jphMat4.asSlice(COLUMN_1_OFFSET, Vec4.LAYOUT()));
		columns[2] = new Vec4(jphMat4.asSlice(COLUMN_2_OFFSET, Vec4.LAYOUT()));
		columns[3] = new Vec4(jphMat4.asSlice(COLUMN_3_OFFSET, Vec4.LAYOUT()));

		tmp = new Vector4f();
	}

	public Mat4() {
		this(Arena.ofAuto());
	}

	public Mat4(Arena arena) {
		jphMat4 = arena.allocate(LAYOUT);

		columns = new Vec4[4];
		columns[0] = new Vec4(jphMat4.asSlice(COLUMN_0_OFFSET, Vec4.LAYOUT()));
		columns[1] = new Vec4(jphMat4.asSlice(COLUMN_1_OFFSET, Vec4.LAYOUT()));
		columns[2] = new Vec4(jphMat4.asSlice(COLUMN_2_OFFSET, Vec4.LAYOUT()));
		columns[3] = new Vec4(jphMat4.asSlice(COLUMN_3_OFFSET, Vec4.LAYOUT()));

		tmp = new Vector4f();
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphMat4, 0, LAYOUT.byteSize());
	}

	public void set(Matrix4f matrix) {
		columns[0].set(matrix.getColumn(0, tmp));
		columns[1].set(matrix.getColumn(1, tmp));
		columns[2].set(matrix.getColumn(2, tmp));
		columns[3].set(matrix.getColumn(3, tmp));
	}

	public Matrix4f get(Matrix4f target) {
		target.setColumn(0, columns[0].get(tmp));
		target.setColumn(1, columns[1].get(tmp));
		target.setColumn(2, columns[2].get(tmp));
		target.setColumn(3, columns[3].get(tmp));
		return target;
	}

	public Matrix4f get() {
		return get(new Matrix4f());
	}

	public MemorySegment memorySegment() {
		return jphMat4;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
