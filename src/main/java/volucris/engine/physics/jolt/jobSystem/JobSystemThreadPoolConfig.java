package volucris.engine.physics.jolt.jobSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

public final class JobSystemThreadPoolConfig {

	private static final StructLayout LAYOUT;

	private static final VarHandle MAX_JOBS;
	private static final VarHandle MAX_BARRIERS;
	private static final VarHandle NUM_THREADS;

	private final MemorySegment jphJobSystemThreadPoolConfig;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
				JAVA_INT.withName("maxJobs"),
				JAVA_INT.withName("maxBarriers"),
				JAVA_INT.withName("numThreads")
			);
		//@formatter:on

		MAX_JOBS = varHandle(LAYOUT, "maxJobs");
		MAX_BARRIERS = varHandle(LAYOUT, "maxBarriers");
		NUM_THREADS = varHandle(LAYOUT, "numThreads");
	}

	public JobSystemThreadPoolConfig() {
		this(Arena.ofAuto());
	}

	public JobSystemThreadPoolConfig(Arena arena) {
		jphJobSystemThreadPoolConfig = arena.allocate(LAYOUT);

		setMaxJobs(2048);
		setMaxBarriers(8);
		setNumThreads(-1);
	}

	public JobSystemThreadPoolConfig(int maxJobs, int maxBarriers, int numThreads) {
		this(maxJobs, maxBarriers, numThreads, Arena.ofAuto());
	}

	public JobSystemThreadPoolConfig(int maxJobs, int maxBarriers, int numThreads, Arena arena) {
		jphJobSystemThreadPoolConfig = arena.allocate(LAYOUT);

		setMaxJobs(maxJobs);
		setMaxBarriers(maxBarriers);
		setNumThreads(numThreads);
	}

	public void setMaxJobs(int maxJobs) {
		MAX_JOBS.set(jphJobSystemThreadPoolConfig, maxJobs);
	}

	public void setMaxBarriers(int maxBarriers) {
		MAX_BARRIERS.set(jphJobSystemThreadPoolConfig, maxBarriers);
	}

	public void setNumThreads(int numThreads) {
		NUM_THREADS.set(jphJobSystemThreadPoolConfig, numThreads);
	}

	public MemorySegment memorySegment() {
		return jphJobSystemThreadPoolConfig;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
