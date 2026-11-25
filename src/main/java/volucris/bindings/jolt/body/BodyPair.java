/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BodyPair {

	private static final LazyConstant<MethodHandle> JPH_BODY_PAIR_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_PAIR_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_PAIR_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BODY_PAIR_GET_BODY_A;
	private static final LazyConstant<MethodHandle> JPH_BODY_PAIR_SET_BODY_A;
	private static final LazyConstant<MethodHandle> JPH_BODY_PAIR_GET_BODY_B;
	private static final LazyConstant<MethodHandle> JPH_BODY_PAIR_SET_BODY_B;
	private static final LazyConstant<MethodHandle> JPH_BODY_PAIR_GET_HASH;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_PAIR_CREATE = downcallHandle("JPH_BodyPair_Create", UNBOUNDED_ADDRESS);
		JPH_BODY_PAIR_CREATE1 = downcallHandle("JPH_BodyPair_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_PAIR_DESTROY = downcallHandleVoid("JPH_BodyPair_Destroy", UNBOUNDED_ADDRESS);
		JPH_BODY_PAIR_GET_BODY_A = downcallHandleVoid("JPH_BodyPair_GetBodyA", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_PAIR_SET_BODY_A = downcallHandleVoid("JPH_BodyPair_SetBodyA", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_PAIR_GET_BODY_B = downcallHandleVoid("JPH_BodyPair_GetBodyB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_PAIR_SET_BODY_B = downcallHandleVoid("JPH_BodyPair_SetBodyB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BODY_PAIR_GET_HASH = downcallHandle("JPH_BodyPair_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BodyPair() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public BodyPair(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyPair(
	    BodyID inA,
	    BodyID inB
	) {
	    this(
	        Arena.ofAuto(),
	        inA,
	        inB
	    );
	}
	
	/// Typed method of [#create1].
	public BodyPair(
		Arena arena,
		BodyID inA,
		BodyID inB
	) {
		MemorySegment segment = create1(
			inA.memorySegment(),
			inB.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyPair(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_BODY_PAIR_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inA,
    	MemorySegment inB
    ) {
    	MethodHandle method = JPH_BODY_PAIR_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inA,
    			inB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_PAIR_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getBodyA(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_PAIR_GET_BODY_A.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyA].
    public final void getBodyA(
    	BodyID outResult
    ) {
    	getBodyA(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setBodyA(
    	MemorySegment self,
    	MemorySegment mBodyA
    ) {
    	MethodHandle method = JPH_BODY_PAIR_SET_BODY_A.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyA
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyA].
    public final void setBodyA(
    	BodyID mBodyA
    ) {
    	setBodyA(
    		this.segment,
    		mBodyA.memorySegment()
    	);
    }
    
    public static void getBodyB(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BODY_PAIR_GET_BODY_B.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyB].
    public final void getBodyB(
    	BodyID outResult
    ) {
    	getBodyB(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setBodyB(
    	MemorySegment self,
    	MemorySegment mBodyB
    ) {
    	MethodHandle method = JPH_BODY_PAIR_SET_BODY_B.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyB].
    public final void setBodyB(
    	BodyID mBodyB
    ) {
    	setBodyB(
    		this.segment,
    		mBodyB.memorySegment()
    	);
    }
    
    /// ```
    /// Get the hash value of this object
    /// ```
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_PAIR_GET_HASH.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHash].
    public final long getHash() {
    	return getHash(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}