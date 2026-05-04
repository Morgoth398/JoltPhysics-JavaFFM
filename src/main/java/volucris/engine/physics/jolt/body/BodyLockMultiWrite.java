package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Specialization that locks multiple bodies for writing to.
 */
public final class BodyLockMultiWrite {

	private static final MethodHandle JPH_BODY_LOCK_MULTI_WRITE_DESTROY;
	private static final MethodHandle JPH_BODY_LOCK_MULTI_WRITE_GET_BODY;

	private final MemorySegment jphBodyLockMultiWrite;

	static {
		//@formatter:off
		JPH_BODY_LOCK_MULTI_WRITE_DESTROY = downcallHandleVoid("JPH_BodyLockMultiWrite_Destroy", ADDRESS);
		JPH_BODY_LOCK_MULTI_WRITE_GET_BODY = downcallHandle("JPH_BodyLockMultiWrite_GetBody", ADDRESS, ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public BodyLockMultiWrite(MemorySegment segment) {
		jphBodyLockMultiWrite = segment.reinterpret(Arena.ofAuto(), s -> destroy(s));
	}

	private static void destroy(MemorySegment segment) {
		try {
			JPH_BODY_LOCK_MULTI_WRITE_DESTROY.invokeExact(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot destroy BodyLockMultiWrite.");
		}
	}

	public Body getBody(int bodyIndex) {
		try {
			MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_GET_BODY;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyLockMultiWrite, bodyIndex);

			Body body = Jolt.getBody(segment.address());

			if (body != null)
				return body;

			return new Body(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get body.");
		}
	}

}
