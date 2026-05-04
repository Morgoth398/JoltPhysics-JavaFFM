/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.jobSystem;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class JobSystem
		permits JobSystemThreadPool,
		JobSystemCallback {

    private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_DESTROY;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_JOB_SYSTEM_DESTROY = downcallHandleVoid("JPH_JobSystem_Destroy", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public JobSystem(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment jobSystem
    ) {
        MethodHandle method = JPH_JOB_SYSTEM_DESTROY.get();
        try {
            method.invokeExact(
                jobSystem
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}