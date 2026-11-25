/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class JobSystemThreadPool extends JobSystemWithBarrier {

	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_THREAD_POOL_CREATE;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_THREAD_POOL_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_THREAD_POOL_AS_JOB_SYSTEM_WITH_BARRIER;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_THREAD_POOL_SET_THREAD_INIT_FUNCTION;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_THREAD_POOL_SET_THREAD_EXIT_FUNCTION;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_THREAD_POOL_INIT;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_THREAD_POOL_SET_NUM_THREADS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_JOB_SYSTEM_THREAD_POOL_CREATE = downcallHandle("JPH_JobSystemThreadPool_Create", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_JOB_SYSTEM_THREAD_POOL_CREATE1 = downcallHandle("JPH_JobSystemThreadPool_Create1", UNBOUNDED_ADDRESS);
		JPH_JOB_SYSTEM_THREAD_POOL_AS_JOB_SYSTEM_WITH_BARRIER = downcallHandle("JPH_JobSystemThreadPool_AsJobSystemWithBarrier", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_JOB_SYSTEM_THREAD_POOL_SET_THREAD_INIT_FUNCTION = downcallHandleVoid("JPH_JobSystemThreadPool_SetThreadInitFunction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_JOB_SYSTEM_THREAD_POOL_SET_THREAD_EXIT_FUNCTION = downcallHandleVoid("JPH_JobSystemThreadPool_SetThreadExitFunction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_JOB_SYSTEM_THREAD_POOL_INIT = downcallHandleVoid("JPH_JobSystemThreadPool_Init", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_JOB_SYSTEM_THREAD_POOL_SET_NUM_THREADS = downcallHandleVoid("JPH_JobSystemThreadPool_SetNumThreads", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public JobSystemThreadPool(
	    int inMaxJobs,
	    int inMaxBarriers,
	    int inNumThreads
	) {
	    this(
	        Arena.ofAuto(),
	        inMaxJobs,
	        inMaxBarriers,
	        inNumThreads
	    );
	}
	
	/// Typed method of [#create].
	public JobSystemThreadPool(
		Arena arena,
		int inMaxJobs,
		int inMaxBarriers,
		int inNumThreads
	) {
		MemorySegment segment = create(
			inMaxJobs,
			inMaxBarriers,
			inNumThreads
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asJobSystemWithBarrier(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public JobSystemThreadPool() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create1].
	public JobSystemThreadPool(Arena arena) {
		MemorySegment segment = create1();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asJobSystemWithBarrier(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public JobSystemThreadPool(MemorySegment segment) {
		this.segment = segment;
		super(asJobSystemWithBarrier(segment));
	}

    /// ```
    /// Creates a thread pool.
    /// @see JobSystemThreadPool::Init
    /// ```
    public static MemorySegment create(
    	int inMaxJobs,
    	int inMaxBarriers,
    	int inNumThreads
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inMaxJobs,
    			inMaxBarriers,
    			inNumThreads
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1() {
    	MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asJobSystemWithBarrier(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_AS_JOB_SYSTEM_WITH_BARRIER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void setThreadInitFunction(
    	MemorySegment self,
    	MemorySegment inInitFunction
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_SET_THREAD_INIT_FUNCTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inInitFunction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setThreadInitFunction].
    public final void setThreadInitFunction(
    	InitExitFunction inInitFunction
    ) {
    	setThreadInitFunction(
    		this.segment,
    		inInitFunction.memorySegment()
    	);
    }
    
    public static void setThreadExitFunction(
    	MemorySegment self,
    	MemorySegment inExitFunction
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_SET_THREAD_EXIT_FUNCTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inExitFunction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setThreadExitFunction].
    public final void setThreadExitFunction(
    	InitExitFunction inExitFunction
    ) {
    	setThreadExitFunction(
    		this.segment,
    		inExitFunction.memorySegment()
    	);
    }
    
    /// ```
    /// Initialize the thread pool
    /// @param inMaxJobs Max number of jobs that can be allocated at any time (note that the actual number of jobs that can be queued is inMaxJobs - 1 because the queue always contains a dummy node)
    /// @param inMaxBarriers Max number of barriers that can be allocated at any time
    /// @param inNumThreads Number of threads to start (the number of concurrent jobs is 1 more because the main thread will also run jobs while waiting for a barrier to complete). Use -1 to auto detect the amount of CPU's.
    /// ```
    public static void init(
    	MemorySegment self,
    	int inMaxJobs,
    	int inMaxBarriers,
    	int inNumThreads
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_INIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxJobs,
    			inMaxBarriers,
    			inNumThreads
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#init].
    public final void init(
    	int inMaxJobs,
    	int inMaxBarriers,
    	int inNumThreads
    ) {
    	init(
    		this.segment,
    		inMaxJobs,
    		inMaxBarriers,
    		inNumThreads
    	);
    }
    
    /// ```
    /// Change the max concurrency after initialization
    /// ```
    public static void setNumThreads(
    	MemorySegment self,
    	int inNumThreads
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_THREAD_POOL_SET_NUM_THREADS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inNumThreads
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumThreads].
    public final void setNumThreads(
    	int inNumThreads
    ) {
    	setNumThreads(
    		this.segment,
    		inNumThreads
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}