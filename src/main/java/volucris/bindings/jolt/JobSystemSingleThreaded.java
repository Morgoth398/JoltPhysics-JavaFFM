/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class JobSystemSingleThreaded extends JobSystem {

	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_SINGLE_THREADED_CREATE;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_SINGLE_THREADED_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_SINGLE_THREADED_AS_JOB_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_SINGLE_THREADED_INIT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_JOB_SYSTEM_SINGLE_THREADED_CREATE = downcallHandle("JPH_JobSystemSingleThreaded_Create", UNBOUNDED_ADDRESS);
		JPH_JOB_SYSTEM_SINGLE_THREADED_CREATE1 = downcallHandle("JPH_JobSystemSingleThreaded_Create1", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_JOB_SYSTEM_SINGLE_THREADED_AS_JOB_SYSTEM = downcallHandle("JPH_JobSystemSingleThreaded_AsJobSystem", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_JOB_SYSTEM_SINGLE_THREADED_INIT = downcallHandleVoid("JPH_JobSystemSingleThreaded_Init", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public JobSystemSingleThreaded() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public JobSystemSingleThreaded(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asJobSystem(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public JobSystemSingleThreaded(
	    int inMaxJobs
	) {
	    this(
	        Arena.ofAuto(),
	        inMaxJobs
	    );
	}
	
	/// Typed method of [#create1].
	public JobSystemSingleThreaded(
		Arena arena,
		int inMaxJobs
	) {
		MemorySegment segment = create1(
			inMaxJobs
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asJobSystem(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public JobSystemSingleThreaded(MemorySegment segment) {
		this.segment = segment;
		super(asJobSystem(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_JOB_SYSTEM_SINGLE_THREADED_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	int inMaxJobs
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_SINGLE_THREADED_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inMaxJobs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asJobSystem(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_SINGLE_THREADED_AS_JOB_SYSTEM.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Initialize the job system
    /// @param inMaxJobs Max number of jobs that can be allocated at any time
    /// ```
    public static void init(
    	MemorySegment self,
    	int inMaxJobs
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_SINGLE_THREADED_INIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxJobs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#init].
    public final void init(
    	int inMaxJobs
    ) {
    	init(
    		this.segment,
    		inMaxJobs
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}