/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class BodyLockMultiWrite {

    private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_MULTI_WRITE_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_MULTI_WRITE_GET_BODY;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BODY_LOCK_MULTI_WRITE_DESTROY = downcallHandleVoid("JPH_BodyLockMultiWrite_Destroy", UNBOUNDED_ADDRESS);
        JPH_BODY_LOCK_MULTI_WRITE_GET_BODY = downcallHandle("JPH_BodyLockMultiWrite_GetBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public BodyLockMultiWrite(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment ioLock
    ) {
        MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_DESTROY.get();
        try {
            method.invokeExact(
                ioLock
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #destroy}.
     */
    public final void destroy(
    ) {
        destroy(
            this.segment
        );
    }
    
    public static MemorySegment getBody(
        MemorySegment ioLock, 
        int bodyIndex
    ) {
        MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_GET_BODY.get();
        try {
            return (MemorySegment) method.invokeExact(
                ioLock, 
                bodyIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBody}.
     */
    public final @Nullable Body getBody(
        int bodyIndex
    ) {
        MemorySegment segment = getBody(
            this.segment, 
            bodyIndex
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Body(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}