/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class BodyLockInterface {

    private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCK_READ;
    private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_UNLOCK_READ;
    private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCK_WRITE;
    private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE;
    private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_READ;
    private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_WRITE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BODY_LOCK_INTERFACE_LOCK_READ = downcallHandleVoid("JPH_BodyLockInterface_LockRead", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_LOCK_INTERFACE_UNLOCK_READ = downcallHandleVoid("JPH_BodyLockInterface_UnlockRead", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_LOCK_INTERFACE_LOCK_WRITE = downcallHandleVoid("JPH_BodyLockInterface_LockWrite", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE = downcallHandleVoid("JPH_BodyLockInterface_UnlockWrite", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_READ = downcallHandle("JPH_BodyLockInterface_LockMultiRead", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_WRITE = downcallHandle("JPH_BodyLockInterface_LockMultiWrite", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public BodyLockInterface(MemorySegment segment) {
        this.segment = segment;
    }

    public static void lockRead(
        MemorySegment lockInterface, 
        int bodyID, 
        MemorySegment outLock
    ) {
        MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_READ.get();
        try {
            method.invokeExact(
                lockInterface, 
                bodyID, 
                outLock
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #lockRead}.
     */
    public final void lockRead(
        int bodyID, 
        BodyLockRead outLock
    ) {
        lockRead(
            this.segment, 
            bodyID, 
            outLock.memorySegment()
        );
    }
    
    public static void unlockRead(
        MemorySegment lockInterface, 
        MemorySegment ioLock
    ) {
        MethodHandle method = JPH_BODY_LOCK_INTERFACE_UNLOCK_READ.get();
        try {
            method.invokeExact(
                lockInterface, 
                ioLock
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #unlockRead}.
     */
    public final void unlockRead(
        BodyLockRead ioLock
    ) {
        unlockRead(
            this.segment, 
            ioLock.memorySegment()
        );
    }
    
    public static void lockWrite(
        MemorySegment lockInterface, 
        int bodyID, 
        MemorySegment outLock
    ) {
        MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_WRITE.get();
        try {
            method.invokeExact(
                lockInterface, 
                bodyID, 
                outLock
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #lockWrite}.
     */
    public final void lockWrite(
        int bodyID, 
        BodyLockWrite outLock
    ) {
        lockWrite(
            this.segment, 
            bodyID, 
            outLock.memorySegment()
        );
    }
    
    public static void unlockWrite(
        MemorySegment lockInterface, 
        MemorySegment ioLock
    ) {
        MethodHandle method = JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE.get();
        try {
            method.invokeExact(
                lockInterface, 
                ioLock
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #unlockWrite}.
     */
    public final void unlockWrite(
        BodyLockWrite ioLock
    ) {
        unlockWrite(
            this.segment, 
            ioLock.memorySegment()
        );
    }
    
    public static MemorySegment lockMultiRead(
        MemorySegment lockInterface, 
        MemorySegment bodyIDs, 
        int count
    ) {
        MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_READ.get();
        try {
            return (MemorySegment) method.invokeExact(
                lockInterface, 
                bodyIDs, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #lockMultiRead}.
     */
    public final @Nullable BodyLockMultiRead lockMultiRead(
        NativeIntArray bodyIDs, 
        int count
    ) {
        MemorySegment segment = lockMultiRead(
            this.segment, 
            bodyIDs.memorySegment(), 
            count
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BodyLockMultiRead(segment);
    }
    
    public static MemorySegment lockMultiWrite(
        MemorySegment lockInterface, 
        MemorySegment bodyIDs, 
        int count
    ) {
        MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_MULTI_WRITE.get();
        try {
            return (MemorySegment) method.invokeExact(
                lockInterface, 
                bodyIDs, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #lockMultiWrite}.
     */
    public final @Nullable BodyLockMultiWrite lockMultiWrite(
        NativeIntArray bodyIDs, 
        int count
    ) {
        MemorySegment segment = lockMultiWrite(
            this.segment, 
            bodyIDs.memorySegment(), 
            count
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BodyLockMultiWrite(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}