package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.Jolt;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * A body lock takes a body ID and locks the underlying body so that other
 * threads cannot access its members
 */
public final class BodyLockRead {

	private static final StructLayout LAYOUT;

	private static final VarHandle BODY;

	private final MemorySegment jphBodyLockRead;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				ADDRESS.withName("lockInterface"),
				ADDRESS.withName("mutex"),
				ADDRESS.withName("body")
			).withName("JPH_BodyLockRead");
		//@formatter:on

		BODY = varHandle(LAYOUT, "body");
	}

	public BodyLockRead() {
		this(Arena.ofAuto());
	}

	public BodyLockRead(Arena arena) {
		jphBodyLockRead = arena.allocate(LAYOUT);
	}

	public boolean succeeded() {
		return !BODY.get(jphBodyLockRead).equals(MemorySegment.NULL);
	}

	public boolean succededAndIsInBroadPhase() {
		return succeeded() && getBody().isInBroadPhase();
	}

	public Body getBody() {

		if (!succeeded())
			return null;

		MemorySegment bodyAddress = (MemorySegment) BODY.get(jphBodyLockRead);
		Body body = Jolt.getBody(bodyAddress.address());

		if (body == null)
			return new Body(bodyAddress);

		return body;
	}

	public MemorySegment memorySegment() {
		return jphBodyLockRead;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
