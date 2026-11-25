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

public final class BodyLockMultiWrite {

	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_MULTI_WRITE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_MULTI_WRITE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_MULTI_WRITE_RELEASE_LOCKS;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_MULTI_WRITE_GET_NUM_BODIES;
	private static final LazyConstant<MethodHandle> JPH_BODY_LOCK_MULTI_WRITE_GET_BODY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_LOCK_MULTI_WRITE_CREATE = downcallHandle("JPH_BodyLockMultiWrite_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_MULTI_WRITE_DESTROY = downcallHandleVoid("JPH_BodyLockMultiWrite_Destroy", UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_MULTI_WRITE_RELEASE_LOCKS = downcallHandleVoid("JPH_BodyLockMultiWrite_ReleaseLocks", UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_MULTI_WRITE_GET_NUM_BODIES = downcallHandle("JPH_BodyLockMultiWrite_GetNumBodies", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_LOCK_MULTI_WRITE_GET_BODY = downcallHandle("JPH_BodyLockMultiWrite_GetBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	public BodyLockMultiWrite(
	    BodyLockInterface lockInterface,
	    BodyIDArray bodyIDs
	) {
	    this(
	        Arena.ofAuto(),
	        lockInterface,
	        bodyIDs
	    );
	}
	
	/// Typed method of [#create].
	public BodyLockMultiWrite(
		Arena arena,
		BodyLockInterface lockInterface,
		BodyIDArray bodyIDs
	) {
		MemorySegment segment = create(
			lockInterface.memorySegment(),
			bodyIDs.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyLockMultiWrite(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor will lock the bodies
    /// ```
    public static MemorySegment create(
    	MemorySegment lockInterface,
    	MemorySegment bodyIDs
    ) {
    	MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			lockInterface,
    			bodyIDs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Destructor will unlock the bodies
    /// ```
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Explicitly release the locks on all bodies (normally this is done in the destructor)
    /// ```
    public static void releaseLocks(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_RELEASE_LOCKS.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#releaseLocks].
    public final void releaseLocks() {
    	releaseLocks(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns the number of bodies that were locked
    /// ```
    public static int getNumBodies(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_GET_NUM_BODIES.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBodies].
    public final int getNumBodies() {
    	return getNumBodies(
    		this.segment
    	);
    }
    
    /// ```
    /// Access the body (returns null if body was not properly locked)
    /// ```
    public static MemorySegment getBody(
    	MemorySegment self,
    	int bodyIndex
    ) {
    	MethodHandle method = JPH_BODY_LOCK_MULTI_WRITE_GET_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			bodyIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBody].
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