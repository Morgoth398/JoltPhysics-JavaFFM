package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Specialization of cast result against a shape.
 */
public final class RayCastResult {

	private static final StructLayout LAYOUT;

	private static final VarHandle BODY_ID;
	private static final VarHandle FRACTION;
	private static final VarHandle SUB_SHAPE_ID_2;

	private final MemorySegment jphRayCastResult;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_INT.withName("bodyId"),
				JAVA_FLOAT.withName("fraction"),
				JAVA_INT.withName("subShapeID2")
			).withName("JPH_RayCastResult");
		//@formatter:on

		BODY_ID = varHandle(LAYOUT, "bodyId");
		FRACTION = varHandle(LAYOUT, "fraction");
		SUB_SHAPE_ID_2 = varHandle(LAYOUT, "subShapeID2");
	}

	public RayCastResult() {
		this(Arena.ofAuto());
	}

	public RayCastResult(Arena arena) {
		jphRayCastResult = arena.allocate(LAYOUT);
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphRayCastResult, 0, LAYOUT.byteSize());
	}

	/**
	 * Body that was hit.
	 */
	public int getBodyId() {
		return (int) BODY_ID.get(jphRayCastResult);
	}

	/**
	 * Hit fraction of the ray/object [0, 1], HitPoint = Start + mFraction * (End -
	 * Start)
	 */
	public float getFraction() {
		return (float) FRACTION.get(jphRayCastResult);
	}

	/**
	 * Sub shape ID of shape that we collided against.
	 */
	public int getSubShapeId2() {
		return (int) SUB_SHAPE_ID_2.get(jphRayCastResult);
	}

	public MemorySegment memorySegment() {
		return jphRayCastResult;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
