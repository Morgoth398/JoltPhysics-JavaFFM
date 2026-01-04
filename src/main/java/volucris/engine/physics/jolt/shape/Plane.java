package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * An infinite plane described by the formula X . Normal + Constant = 0.
 */
public final class Plane {

	private static final StructLayout LAYOUT;

	private static final VarHandle DISTANCE;

	private static final long NORMAL_OFFSET;

	private final MemorySegment jphPlane;

	private final Vec3 normal;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				Vec3.LAYOUT().withName("normal"),
				JAVA_FLOAT.withName("distance")
			).withName("JPH_Plane");
		//@formatter:on

		DISTANCE = varHandle(LAYOUT, "distance");

		NORMAL_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normal"));
	}

	public Plane() {
		this(Arena.ofAuto());
	}

	public Plane(Arena arena) {
		jphPlane = arena.allocate(LAYOUT);

		normal = new Vec3(jphPlane.asSlice(NORMAL_OFFSET, Vec3.LAYOUT()));
	}

	public Plane(MemorySegment segment) {
		jphPlane = segment;

		normal = new Vec3(jphPlane.asSlice(NORMAL_OFFSET, Vec3.LAYOUT()));
	}

	public Plane(Vector3f normal, float distance) {
		this(normal, distance, Arena.ofAuto());
	}

	public Plane(Vector3f normal, float distance, Arena arena) {
		jphPlane = arena.allocate(LAYOUT);

		this.normal = new Vec3(jphPlane.asSlice(NORMAL_OFFSET, Vec3.LAYOUT()));

		setNormal(normal);
		setDistance(distance);
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphPlane, 0, LAYOUT.byteSize());
	}

	public void setNormal(Vector3f normal) {
		this.normal.set(normal);
	}

	public Vector3f getNormal(Vector3f target) {
		return normal.get(target);
	}

	public Vector3f getNormal() {
		return normal.get();
	}

	public void setDistance(float distance) {
		DISTANCE.set(jphPlane, distance);
	}

	public float getDistance() {
		return (float) DISTANCE.get(jphPlane);
	}

	public MemorySegment memorySegment() {
		return jphPlane;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
