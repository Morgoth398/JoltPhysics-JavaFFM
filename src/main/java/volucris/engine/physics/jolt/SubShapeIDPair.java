package volucris.engine.physics.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * A pair of bodies and their sub shape ID's. Can be used as a key in a map to
 * find a contact point.
 */
public final class SubShapeIDPair {

	private static final StructLayout LAYOUT;

	private static final VarHandle BODY_1_ID;
	private static final VarHandle SUB_SHAPE_ID_1;
	private static final VarHandle BODY_2_ID;
	private static final VarHandle SUB_SHAPE_ID_2;

	private final MemorySegment jphSubShapeIDPair;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("Body1ID"),
		        JAVA_INT.withName("subShapeID1"),
		        JAVA_INT.withName("Body2ID"),
		        JAVA_INT.withName("subShapeID2")
			).withName("JPH_SubShapeIDPair");
		//@formatter:on

		BODY_1_ID = varHandle(LAYOUT, "Body1ID");
		SUB_SHAPE_ID_1 = varHandle(LAYOUT, "subShapeID1");
		BODY_2_ID = varHandle(LAYOUT, "Body2ID");
		SUB_SHAPE_ID_2 = varHandle(LAYOUT, "subShapeID2");
	}

	public SubShapeIDPair() {
		this(Arena.ofAuto());
	}

	public SubShapeIDPair(Arena arena) {
		jphSubShapeIDPair = arena.allocate(LAYOUT);
	}

	public void set(MemorySegment segment) {
		MemorySegment.copy(segment, 0, jphSubShapeIDPair, 0, LAYOUT.byteSize());
	}

	/**
	 * 
	 */
	public int getBody1Id() {
		return (int) BODY_1_ID.get(jphSubShapeIDPair);
	}

	/**
	 * 
	 */
	public int getSubShapeId1() {
		return (int) SUB_SHAPE_ID_1.get(jphSubShapeIDPair);
	}

	/**
	 * 
	 */
	public int getBody2Id() {
		return (int) BODY_2_ID.get(jphSubShapeIDPair);
	}

	/**
	 * 
	 */
	public int getSubShapeId2() {
		return (int) SUB_SHAPE_ID_2.get(jphSubShapeIDPair);
	}

	public MemorySegment memorySegment() {
		return jphSubShapeIDPair;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
