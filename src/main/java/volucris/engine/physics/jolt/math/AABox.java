package volucris.engine.physics.jolt.math;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;

import org.joml.Vector3f;

import java.lang.foreign.MemoryLayout.PathElement;

/**
 * Axis aligned box.
 */
public final class AABox {

	private static final StructLayout LAYOUT;

	private static final long MIN_OFFSET;
	private static final long MAX_OFFSET;

	private final MemorySegment jphAABox;

	private final Vec3 min;
	private final Vec3 max;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				Vec3.LAYOUT().withName("min"),
				Vec3.LAYOUT().withName("max")
			).withName("JPH_AABox");
		//@formatter:on

		MIN_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("min"));
		MAX_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max"));
	}

	public AABox() {
		this(Arena.ofAuto());
	}

	public AABox(Arena arena) {
		jphAABox = arena.allocate(LAYOUT);

		min = new Vec3(jphAABox.asSlice(MIN_OFFSET, Vec3.LAYOUT()));
		max = new Vec3(jphAABox.asSlice(MAX_OFFSET, Vec3.LAYOUT()));
	}

	public void setMin(Vector3f min) {
		this.min.set(min);
	}

	public Vector3f getMin(Vector3f target) {
		return min.get(target);
	}

	public Vector3f getMin() {
		return getMin(new Vector3f());
	}

	public void setMax(Vector3f max) {
		this.max.set(max);
	}

	public Vector3f getMax(Vector3f target) {
		return max.get(target);
	}

	public Vector3f getMax() {
		return getMax(new Vector3f());
	}

	public MemorySegment memorySegment() {
		return jphAABox;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
