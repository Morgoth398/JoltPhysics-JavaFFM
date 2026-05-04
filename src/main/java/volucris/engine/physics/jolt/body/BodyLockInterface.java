package volucris.engine.physics.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Base class interface for locking a body.
 */
public final class BodyLockInterface {

	private static final MethodHandle JPH_BODY_LOCK_INTERFACE_LOCK_READ;
	private static final MethodHandle JPH_BODY_LOCK_INTERFACE_UNLOCK_READ;
	private static final MethodHandle JPH_BODY_LOCK_INTERFACE_LOCK_WRITE;
	private static final MethodHandle JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE;
	private static final MethodHandle JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_READ;
	private static final MethodHandle JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_WRITE;

	private final MemorySegment jphBodyLockInterface;

	static {
		//@formatter:off
		JPH_BODY_LOCK_INTERFACE_LOCK_READ = downcallHandleVoid("JPH_BodyLockInterface_LockRead", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_LOCK_INTERFACE_UNLOCK_READ = downcallHandleVoid("JPH_BodyLockInterface_UnlockRead", ADDRESS, ADDRESS);
		JPH_BODY_LOCK_INTERFACE_LOCK_WRITE = downcallHandleVoid("JPH_BodyLockInterface_LockWrite", ADDRESS, JAVA_INT, ADDRESS);
		JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE = downcallHandleVoid("JPH_BodyLockInterface_UnlockWrite", ADDRESS, ADDRESS);
		JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_READ = downcallHandle("JPH_BodyLockInterface_LockMultiRead", ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
		JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_WRITE = downcallHandle("JPH_BodyLockInterface_LockMultiWrite", ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public BodyLockInterface(MemorySegment segment) {
		jphBodyLockInterface = segment;
	}

	public BodyLockRead lockRead(int bodyId, BodyLockRead target) {
		try {
			MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_READ;
			method.invokeExact(jphBodyLockInterface, bodyId, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot lock read.");
		}
	}

	public BodyLockRead lockRead(int bodyId) {
		return lockRead(bodyId, new BodyLockRead());
	}

	public void unlockRead(BodyLockRead lockRead) {
		try {
			MethodHandle method = JPH_BODY_LOCK_INTERFACE_UNLOCK_READ;
			method.invokeExact(jphBodyLockInterface, lockRead.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot unlock read.");
		}
	}

	public BodyLockWrite lockWrite(int bodyId, BodyLockWrite target) {
		try {
			MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_WRITE;
			method.invokeExact(jphBodyLockInterface, bodyId, target.memorySegment());
			return target;
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot lock write.");
		}
	}

	public BodyLockWrite lockWrite(int bodyId) {
		return lockWrite(bodyId, new BodyLockWrite());
	}

	public void unlockWrite(BodyLockWrite lockWrite) {
		try {
			MethodHandle method = JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE;
			method.invokeExact(jphBodyLockInterface, lockWrite.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot unlock write.");
		}
	}

	public BodyLockMultiRead lockMultiRead(int... bodyIds) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(bodyIds.length, JAVA_INT));

			for (int i = 0; i < bodyIds.length; i++)
				array.setAtIndex(JAVA_INT, i, bodyIds[0]);

			MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_READ;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyLockInterface, array, bodyIds.length);

			return new BodyLockMultiRead(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot lock multi read.");
		}
	}

	public BodyLockMultiWrite lockMultiWrite(int... bodyIds) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment array = arena.allocate(MemoryLayout.sequenceLayout(bodyIds.length, JAVA_INT));

			for (int i = 0; i < bodyIds.length; i++)
				array.setAtIndex(JAVA_INT, i, bodyIds[0]);

			MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_WRITE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphBodyLockInterface, array, bodyIds.length);

			return new BodyLockMultiWrite(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot lock multi write.");
		}
	}

}