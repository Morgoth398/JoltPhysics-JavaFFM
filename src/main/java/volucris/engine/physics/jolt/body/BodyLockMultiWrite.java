package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Specialization that locks multiple bodies for writing to.
 */
public final class BodyLockMultiWrite implements AutoCloseable {

	private static final MethodHandle JPH_BODY_LOCK_MULTI_WRITE_DESTROY;
	private static final MethodHandle JPH_BODY_LOCK_MULTI_WRITE_GET_BODY;

	private final MemorySegment jphBodyLockMultiWrite;

	static {
		//@formatter:off
		JPH_BODY_LOCK_MULTI_WRITE_DESTROY = downcallHandleVoid("JPH_BodyLockMultiWrite_Destroy", ADDRESS);
		JPH_BODY_LOCK_MULTI_WRITE_GET_BODY = downcallHandle("JPH_BodyLockMultiWrite_GetBody", ADDRESS, ADDRESS, JAVA_INT);
		//@formatter:on
	}

	/**
	 * Constructs an invalid BodyLockMultiWrite object. Call
	 * {@link BodyLockInterface#lockMultiWrite(BodyLockMultiWrite, int...)} before
	 * using this object.
	 */
	public BodyLockMultiWrite() {
		this(Arena.ofAuto());
	}

	/**
	 * Constructs an invalid BodyLockMultiWrite object. Call
	 * {@link BodyLockInterface#lockMultiWrite(BodyLockMultiWrite, int...)} before
	 * using this object.
	 */
	public BodyLockMultiWrite(Arena arena) {
		jphBodyLockMultiWrite = arena.allocate(ADDRESS);
	}

	public void set(MemorySegment segment) {
		jphBodyLockMultiWrite.set(ADDRESS, 0, segment);
	}

	public Body getBody(int bodyIndex) {
		try {
			MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_GET_BODY;
			MemorySegment segment = (MemorySegment) method.invokeExact(memorySegment(), bodyIndex);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Body body = Jolt.getBody(segment.address());

			if (body != null)
				return body;

			return new Body(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get body: " + className);
		}
	}

	@Override
	public void close() {
		try {
			JPH_BODY_LOCK_MULTI_WRITE_DESTROY.invokeExact(memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy BodyLockMultiWrite: " + className);
		}
	}

	private MemorySegment memorySegment() {
		return jphBodyLockMultiWrite.get(ADDRESS, 0);
	}

}
