package volucris.engine.physics.jolt.jobSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * A class that allows units of work (Jobs) to be scheduled across multiple
 * threads. It allows dependencies between the jobs so that the jobs form a
 * graph.
 */
public sealed class JobSystem permits JobSystemThreadPool {

	private static final MethodHandle JPH_JOB_SYSTEM_DESTROY;

	private final MemorySegment jphJobSystem;

	static {
		//@formatter:off
		JPH_JOB_SYSTEM_DESTROY = downcallHandleVoid("JPH_JobSystem_Destroy", ADDRESS);
		//@formatter:on
	}

	protected JobSystem(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected JobSystem(MemorySegment segment, Arena arena) {
		jphJobSystem = segment.reinterpret(arena, s -> destroy(s));
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_JOB_SYSTEM_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy job system: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphJobSystem;
	}

}