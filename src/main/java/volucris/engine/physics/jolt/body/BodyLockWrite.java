package volucris.engine.physics.jolt.body;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static volucris.engine.utils.FFMUtils.varHandle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.Jolt;

/**
 * Specialization that locks a body for writing to.
 */
public final class BodyLockWrite {

	private static final StructLayout LAYOUT;

	private static final VarHandle BODY;

	private final MemorySegment jphBodyLockWrite;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("lockInterface"),
				ADDRESS.withName("mutex"),
				ADDRESS.withName("body")
			).withName("JPH_BodyLockWrite");
		//@formatter:on

		BODY = varHandle(LAYOUT, "body");
	}

	public BodyLockWrite() {
		this(Arena.ofAuto());
	}

	public BodyLockWrite(Arena arena) {
		jphBodyLockWrite = arena.allocate(LAYOUT);
	}

	public boolean succeeded() {
		return !BODY.get(jphBodyLockWrite).equals(MemorySegment.NULL);
	}

	public boolean succededAndIsInBroadPhase() {
		return succeeded() && getBody().isInBroadPhase();
	}

	public Body getBody() {

		if (!succeeded())
			return null;

		MemorySegment bodyAddress = (MemorySegment) BODY.get(jphBodyLockWrite);
		Body body = Jolt.getBody(bodyAddress.address());

		if (body == null)
			return new Body(bodyAddress);

		return body;
	}

	public MemorySegment memorySegment() {
		return jphBodyLockWrite;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
