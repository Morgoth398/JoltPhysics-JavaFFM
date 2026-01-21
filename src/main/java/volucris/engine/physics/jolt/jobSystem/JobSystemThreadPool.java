package volucris.engine.physics.jolt.jobSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Implementation of a JobSystem using a thread pool
 * <p>
 * Note that this is considered an example implementation. It is expected that
 * when you integrate the physics engine into your own project that you'll
 * provide your own implementation of the JobSystem built on top of whatever job
 * system your project uses.
 * 
 */
public final class JobSystemThreadPool extends JobSystem {

	private static final MethodHandle JPH_JOB_SYSTEM_THREAD_POOL_CREATE;

	static {
		//@formatter:off
		JPH_JOB_SYSTEM_THREAD_POOL_CREATE = downcallHandle("JPH_JobSystemThreadPool_Create", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public JobSystemThreadPool() {
		this(Arena.ofAuto());
	}

	public JobSystemThreadPool(Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_CREATE;
			segment = (MemorySegment) method.invokeExact(MemorySegment.NULL);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create job system thread pool: " + className);
		}
		super(segment, arena);
	}

	public JobSystemThreadPool(JobSystemThreadPoolConfig config) {
		this(config, Arena.ofAuto());
	}

	public JobSystemThreadPool(JobSystemThreadPoolConfig config, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_CREATE;
			segment = (MemorySegment) method.invokeExact(config.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create job system thread pool: " + className);
		}
		super(segment, arena);
	}

}