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
 * Type definition for a supporting face.
 */
public final class SupportingFace {

	private static final StructLayout LAYOUT;

	private static final VarHandle COUNT;

	private final MemorySegment jphSupportingFace;

	private final Vec3[] vertices;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_INT.withName("count"),
				MemoryLayout.sequenceLayout(32, Vec3.LAYOUT()).withName("vertices")
			).withName("JPH_SupportingFace");
		//@formatter:on

		COUNT = varHandle(LAYOUT, "count");
	}

	public SupportingFace() {
		this(Arena.ofAuto());
	}

	public SupportingFace(Arena arena) {
		jphSupportingFace = arena.allocate(LAYOUT);

		vertices = new Vec3[32];
		for (int i = 0; i < 32; i++) {
			long offset = i * Vec3.LAYOUT().byteSize();
			vertices[i] = new Vec3(jphSupportingFace.asSlice(offset, Vec3.LAYOUT()));
		}
	}

	public int getCount() {
		return (int) COUNT.get(jphSupportingFace);
	}

	public Vector3f getVertex(int index, Vector3f target) {
		return vertices[index].get(target);
	}

	public Vector3f getVertex(int index) {
		return getVertex(index, new Vector3f());
	}

	public MemorySegment memorySegment() {
		return jphSupportingFace;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
