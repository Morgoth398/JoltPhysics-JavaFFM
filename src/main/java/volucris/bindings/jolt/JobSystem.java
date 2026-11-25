/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class JobSystem
		permits JobSystemSingleThreaded,
		JobSystemWithBarrier {

	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_CREATE;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_SET_ELEMENT_IN_OUT_JOBS;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_JOB_SYSTEM_CREATE = downcallHandle("JPH_JobSystem_Create", UNBOUNDED_ADDRESS, JobSystemFunctions.LAYOUT);
		JPH_JOB_SYSTEM_DESTROY = downcallHandleVoid("JPH_JobSystem_Destroy", UNBOUNDED_ADDRESS);
		JPH_JOB_SYSTEM_SET_ELEMENT_IN_OUT_JOBS = downcallHandleVoid("JPH_JobSystem_SetElementInOutJobs", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public JobSystem(
	    JobSystemFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public JobSystem(
		Arena arena,
		JobSystemFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public JobSystem(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			functions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void setElementInOutJobs(
    	MemorySegment outJobs,
    	int index,
    	MemorySegment value
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_SET_ELEMENT_IN_OUT_JOBS.get();
    	try {
    		 method.invokeExact(
    			outJobs,
    			index,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setElementInOutJobs].
    public static void setElementInOutJobs(
    	MemorySegment outJobs,
    	int index,
    	JobSystemJobHandle value
    ) {
    	setElementInOutJobs(
    		outJobs,
    		index,
    		value.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}