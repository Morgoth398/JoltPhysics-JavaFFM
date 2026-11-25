/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BodyLockRead {

	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_READ_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_READ_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_READ_RELEASE_LOCK;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_READ_SUCCEEDED;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_READ_SUCCEEDED_AND_IS_IN_BROAD_PHASE;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_READ_GET_BODY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_LOCK_READ_CREATE = downcallHandle("JPH_BodyLockRead_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_READ_DESTROY = downcallHandleVoid("JPH_BodyLockRead_Destroy", UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_READ_RELEASE_LOCK = downcallHandleVoid("JPH_BodyLockRead_ReleaseLock", UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_READ_SUCCEEDED = downcallHandle("JPH_BodyLockRead_Succeeded", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_READ_SUCCEEDED_AND_IS_IN_BROAD_PHASE = downcallHandle("JPH_BodyLockRead_SucceededAndIsInBroadPhase", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_READ_GET_BODY = downcallHandle("JPH_BodyLockRead_GetBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BodyLockRead(
	    BodyLockInterface lockInterface,
	    BodyID bodyID
	) {
	    this(
	        Arena.ofAuto(),
	        lockInterface,
	        bodyID
	    );
	}
	
	/// Typed method of [#create].
	public BodyLockRead(
		Arena arena,
		BodyLockInterface lockInterface,
		BodyID bodyID
	) {
		MemorySegment segment = create(
			lockInterface.memorySegment(),
			bodyID.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyLockRead(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor will lock the body.
    /// ```
    public static MemorySegment create(
    	MemorySegment lockInterface,
    	MemorySegment bodyID
    ) {
    	MethodHandle method = JPH_BODY_LOCK_READ_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			lockInterface,
    			bodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Destructor will unlock the body.
    /// ```
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_READ_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Explicitly release the lock (normally this is done in the destructor)
    /// ```
    public static void releaseLock(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_READ_RELEASE_LOCK.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#releaseLock].
    public final void releaseLock() {
    	releaseLock(
    		this.segment
    	);
    }
    
    /// ```
    /// Test if the lock was successful (if the body ID was valid)
    /// ```
    public static boolean succeeded(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_READ_SUCCEEDED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#succeeded].
    public final boolean succeeded() {
    	return succeeded(
    		this.segment
    	);
    }
    
    /// ```
    /// Test if the lock was successful (if the body ID was valid) and the body is still in the broad phase.
    /// ```
    public static boolean succeededAndIsInBroadPhase(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_READ_SUCCEEDED_AND_IS_IN_BROAD_PHASE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#succeededAndIsInBroadPhase].
    public final boolean succeededAndIsInBroadPhase() {
    	return succeededAndIsInBroadPhase(
    		this.segment
    	);
    }
    
    /// ```
    /// Access the body.
    /// ```
    public static MemorySegment getBody(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_READ_GET_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBody].
    public final @Nullable Body getBody() {
    	MemorySegment segment = getBody(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}