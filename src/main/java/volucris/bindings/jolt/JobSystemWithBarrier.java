/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class JobSystemWithBarrier extends JobSystem
		permits JobSystemThreadPool {

	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_WITH_BARRIER_AS_JOB_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_WITH_BARRIER_INIT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_JOB_SYSTEM_WITH_BARRIER_AS_JOB_SYSTEM = downcallHandle("JPH_JobSystemWithBarrier_AsJobSystem", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_JOB_SYSTEM_WITH_BARRIER_INIT = downcallHandleVoid("JPH_JobSystemWithBarrier_Init", UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public JobSystemWithBarrier(MemorySegment segment) {
		this.segment = segment;
		super(asJobSystem(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asJobSystem(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_WITH_BARRIER_AS_JOB_SYSTEM.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Initialize the barriers
    /// @param inMaxBarriers Max number of barriers that can be allocated at any time
    /// ```
    public static void init(
    	MemorySegment self,
    	int inMaxBarriers
    ) {
    	MethodHandle method = JPH_JOB_SYSTEM_WITH_BARRIER_INIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxBarriers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#init].
    public final void init(
    	int inMaxBarriers
    ) {
    	init(
    		this.segment,
    		inMaxBarriers
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}