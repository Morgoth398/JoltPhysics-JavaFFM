package volucris.engine.physics.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Structure that holds a ray cast or other object cast hit.
 */
public final class BroadPhaseCastResult {

	private static final StructLayout LAYOUT;

	private static final VarHandle BODY_ID;
	private static final VarHandle FRACTION;

	private final MemorySegment jphBroadPhaseCastResult;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_INT.withName("bodyID"),
				JAVA_FLOAT.withName("fraction")
			);
		//@formatter:on

		BODY_ID = varHandle(LAYOUT, "bodyID");
		FRACTION = varHandle(LAYOUT, "fraction");
	}

	public BroadPhaseCastResult() {
		jphBroadPhaseCastResult = Arena.ofAuto().allocate(LAYOUT);
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphBroadPhaseCastResult, 0, LAYOUT.byteSize());
	}

	/**
	 * Body that was hit.
	 */
	public int getBodyId() {
		return (int) BODY_ID.get(jphBroadPhaseCastResult);
	}

	/**
	 * Hit fraction of the ray/object [0, 1], HitPoint = Start + mFraction * (End -
	 * Start)
	 */
	public float getFraction() {
		return (float) FRACTION.get(jphBroadPhaseCastResult);
	}

	public MemorySegment memorySegment() {
		return jphBroadPhaseCastResult;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
