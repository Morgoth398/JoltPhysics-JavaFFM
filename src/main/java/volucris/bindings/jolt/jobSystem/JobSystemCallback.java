/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.jobSystem;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class JobSystemCallback extends JobSystem {

    private static final LazyConstant<MethodHandle> JPH_JOB_SYSTEM_CALLBACK_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_JOB_SYSTEM_CALLBACK_CREATE = downcallHandle("JPH_JobSystemCallback_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public JobSystemCallback(
        JobSystemConfig config
    ) {
        this(
            Arena.ofAuto(),
            config
        );
    }
    
    public JobSystemCallback(
        Arena arena,
        JobSystemConfig config
    ) {
         MemorySegment segment = create(
            config.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public JobSystemCallback(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment config
    ) {
        MethodHandle method = JPH_JOB_SYSTEM_CALLBACK_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                config
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}