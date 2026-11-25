/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class BodyLockInterface
		permits BodyLockInterfaceLocking,
		BodyLockInterfaceNoLock {

	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCK_READ;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCK_WRITE;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_GET_ALL_BODIES_MUTEX_MASK;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_GET_MUTEX_MASK;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCK_READ1;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_LOCK_WRITE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_TRY_GET_BODY;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_UNLOCK_READ;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_LOCK_INTERFACE_LOCK_READ = downcallHandle("JPH_BodyLockInterface_LockRead", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_INTERFACE_LOCK_WRITE = downcallHandle("JPH_BodyLockInterface_LockWrite", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_INTERFACE_GET_ALL_BODIES_MUTEX_MASK = downcallHandle("JPH_BodyLockInterface_GetAllBodiesMutexMask", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_INTERFACE_GET_MUTEX_MASK = downcallHandle("JPH_BodyLockInterface_GetMutexMask", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_LOCK_INTERFACE_LOCK_READ1 = downcallHandleVoid("JPH_BodyLockInterface_LockRead1", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_BODY_LOCK_INTERFACE_LOCK_WRITE1 = downcallHandleVoid("JPH_BodyLockInterface_LockWrite1", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_BODY_LOCK_INTERFACE_TRY_GET_BODY = downcallHandle("JPH_BodyLockInterface_TryGetBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_INTERFACE_UNLOCK_READ = downcallHandleVoid("JPH_BodyLockInterface_UnlockRead", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE = downcallHandleVoid("JPH_BodyLockInterface_UnlockWrite", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BodyLockInterface(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// @name Locking functions
    /// @{
    /// ```
    public static MemorySegment lockRead(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_READ.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lockRead].
    public final @Nullable SharedMutex lockRead(
    	BodyID inBodyID
    ) {
    	MemorySegment segment = lockRead(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SharedMutex(segment);
    }
    
    public static MemorySegment lockWrite(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_WRITE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lockWrite].
    public final @Nullable SharedMutex lockWrite(
    	BodyID inBodyID
    ) {
    	MemorySegment segment = lockWrite(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SharedMutex(segment);
    }
    
    /// ```
    /// Get the mask needed to lock all bodies
    /// ```
    public static long getAllBodiesMutexMask(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_GET_ALL_BODIES_MUTEX_MASK.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAllBodiesMutexMask].
    public final long getAllBodiesMutexMask() {
    	return getAllBodiesMutexMask(
    		this.segment
    	);
    }
    
    /// ```
    /// @name Batch locking functions
    /// @{
    /// ```
    public static long getMutexMask(
    	MemorySegment self,
    	MemorySegment inBodies,
    	int inNumber
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_GET_MUTEX_MASK.get();
    	try {
    		return (long) method.invokeExact(
    			self,
    			inBodies,
    			inNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMutexMask].
    public final long getMutexMask(
    	BodyID inBodies,
    	int inNumber
    ) {
    	return getMutexMask(
    		this.segment,
    		inBodies.memorySegment(),
    		inNumber
    	);
    }
    
    public static void lockRead1(
    	MemorySegment self,
    	long inMutexMask
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_READ1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMutexMask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lockRead1].
    public final void lockRead1(
    	long inMutexMask
    ) {
    	lockRead1(
    		this.segment,
    		inMutexMask
    	);
    }
    
    public static void lockWrite1(
    	MemorySegment self,
    	long inMutexMask
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_LOCK_WRITE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMutexMask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lockWrite1].
    public final void lockWrite1(
    	long inMutexMask
    ) {
    	lockWrite1(
    		this.segment,
    		inMutexMask
    	);
    }
    
    /// ```
    /// Convert body ID to body
    /// ```
    public static MemorySegment tryGetBody(
    	MemorySegment self,
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_TRY_GET_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#tryGetBody].
    public final @Nullable Body tryGetBody(
    	BodyID inBodyID
    ) {
    	MemorySegment segment = tryGetBody(
    		this.segment,
    		inBodyID.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    public static void unlockRead(
    	MemorySegment self,
    	MemorySegment inMutex
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_UNLOCK_READ.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMutex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#unlockRead].
    public final void unlockRead(
    	SharedMutex inMutex
    ) {
    	unlockRead(
    		this.segment,
    		inMutex.memorySegment()
    	);
    }
    
    public static void unlockWrite(
    	MemorySegment self,
    	MemorySegment inMutex
    ) {
    	MethodHandle method = JPH_BODY_LOCK_INTERFACE_UNLOCK_WRITE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMutex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#unlockWrite].
    public final void unlockWrite(
    	SharedMutex inMutex
    ) {
    	unlockWrite(
    		this.segment,
    		inMutex.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}