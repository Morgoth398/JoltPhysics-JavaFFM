package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Structure that holds the result of colliding a point against a shape.
 */
public final class CollidePointResult {

	private static final StructLayout LAYOUT;

	private static final VarHandle BODY_ID;
	private static final VarHandle SUB_SHAPE_ID_2;

	private final MemorySegment jphCollidePointResult;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("bodyID"),
		        JAVA_INT.withName("subShapeID2")
			).withName("JPH_CollidePointResult");
		//@formatter:on

		BODY_ID = varHandle(LAYOUT, "bodyID");
		SUB_SHAPE_ID_2 = varHandle(LAYOUT, "subShapeID2");
	}

	public CollidePointResult() {
		this(Arena.ofAuto());
	}

	public CollidePointResult(Arena arena) {
		jphCollidePointResult = arena.allocate(LAYOUT);
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphCollidePointResult, 0, LAYOUT.byteSize());
	}

	/**
	 * Body that was hit.
	 */
	public int getBodyId() {
		return (int) BODY_ID.get(jphCollidePointResult);
	}

	/**
	 * Sub shape ID of shape that we collided against.
	 */
	public int getSubShapeId2() {
		return (int) SUB_SHAPE_ID_2.get(jphCollidePointResult);
	}

	public MemorySegment memorySegment() {
		return jphCollidePointResult;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
