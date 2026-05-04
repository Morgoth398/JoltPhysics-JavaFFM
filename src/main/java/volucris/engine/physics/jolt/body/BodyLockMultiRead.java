package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A multi body lock takes a number of body IDs and locks the underlying bodies
 * so that other threads cannot access its members.
 */
public final class BodyLockMultiRead implements AutoCloseable {

	private static final MethodHandle JPH_BODY_LOCK_MULTI_READ_DESTROY;
	private static final MethodHandle JPH_BODY_LOCK_MULTI_READ_GET_BODY;

	private final MemorySegment jphBodyLockMultiRead;

	static {
		//@formatter:off
		JPH_BODY_LOCK_MULTI_READ_DESTROY = downcallHandleVoid("JPH_BodyLockMultiRead_Destroy", ADDRESS);
		JPH_BODY_LOCK_MULTI_READ_GET_BODY = downcallHandle("JPH_BodyLockMultiRead_GetBody", ADDRESS, ADDRESS, JAVA_INT);
		//@formatter:on
	}

	/**
	 * Constructs an invalid BodyLockMultiRead object. Call
	 * {@link BodyLockInterface#lockMultiRead(BodyLockMultiRead, int...)} before
	 * using this object.
	 */
	public BodyLockMultiRead() {
		jphBodyLockMultiRead = Arena.ofAuto().allocate(ADDRESS);
	}

	public void set(MemorySegment segment) {
		jphBodyLockMultiRead.set(ADDRESS, 0, segment);
	}

	public Body getBody(int bodyIndex) {
		try {
			MethodHandle method = JPH_BODY_LOCK_MULTI_READ_GET_BODY;
			MemorySegment segment = (MemorySegment) method.invokeExact(memorySegment(), bodyIndex);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Body body = Jolt.getBody(segment.address());
			if (body != null)
				return body;

			return new Body(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get body.");
		}
	}

	@Override
	public void close() {
		try {
			JPH_BODY_LOCK_MULTI_READ_DESTROY.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy BodyLockMultiWrite.");
		}
	}

	private MemorySegment memorySegment() {
		return jphBodyLockMultiRead.get(ADDRESS, 0);
	}

}
