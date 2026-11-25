/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BodyID {

	private static final LazyConstant<MethodHandle> JPH_BODY_ID_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_GET_INVALID_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_GET_BROAD_PHASE_BIT;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_GET_MAX_BODY_INDEX;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_GET_MAX_SEQUENCE_NUMBER;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_GET_SEQUENCE_NUMBER_SHIFT;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_GET_INDEX;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_GET_SEQUENCE_NUMBER;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_GET_INDEX_AND_SEQUENCE_NUMBER;
	private static final LazyConstant<MethodHandle> JPH_BODY_ID_IS_INVALID;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_ID_CREATE = downcallHandle("JPH_BodyID_Create", UNBOUNDED_ADDRESS);
		JPH_BODY_ID_CREATE1 = downcallHandle("JPH_BodyID_Create1", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_BODY_ID_CREATE2 = downcallHandle("JPH_BodyID_Create2", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BYTE);
		JPH_BODY_ID_DESTROY = downcallHandleVoid("JPH_BodyID_Destroy", UNBOUNDED_ADDRESS);
		JPH_BODY_ID_GET_INVALID_BODY_ID = downcallHandle("JPH_BodyID_GetInvalidBodyID", JAVA_INT);
		JPH_BODY_ID_GET_BROAD_PHASE_BIT = downcallHandle("JPH_BodyID_GetBroadPhaseBit", JAVA_INT);
		JPH_BODY_ID_GET_MAX_BODY_INDEX = downcallHandle("JPH_BodyID_GetMaxBodyIndex", JAVA_INT);
		JPH_BODY_ID_GET_MAX_SEQUENCE_NUMBER = downcallHandle("JPH_BodyID_GetMaxSequenceNumber", JAVA_BYTE);
		JPH_BODY_ID_GET_SEQUENCE_NUMBER_SHIFT = downcallHandle("JPH_BodyID_GetSequenceNumberShift", JAVA_INT);
		JPH_BODY_ID_GET_INDEX = downcallHandle("JPH_BodyID_GetIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_ID_GET_SEQUENCE_NUMBER = downcallHandle("JPH_BodyID_GetSequenceNumber", JAVA_BYTE, UNBOUNDED_ADDRESS);
		JPH_BODY_ID_GET_INDEX_AND_SEQUENCE_NUMBER = downcallHandle("JPH_BodyID_GetIndexAndSequenceNumber", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_BODY_ID_IS_INVALID = downcallHandle("JPH_BodyID_IsInvalid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BodyID() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public BodyID(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyID(
	    int inID
	) {
	    this(
	        Arena.ofAuto(),
	        inID
	    );
	}
	
	/// Typed method of [#create1].
	public BodyID(
		Arena arena,
		int inID
	) {
		MemorySegment segment = create1(
			inID
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyID(
	    int inID,
	    byte inSequenceNumber
	) {
	    this(
	        Arena.ofAuto(),
	        inID,
	        inSequenceNumber
	    );
	}
	
	/// Typed method of [#create2].
	public BodyID(
		Arena arena,
		int inID,
		byte inSequenceNumber
	) {
		MemorySegment segment = create2(
			inID,
			inSequenceNumber
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyID(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Construct invalid body ID
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_BODY_ID_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Construct from index and sequence number combined in a single uint32 (use with care!)
    /// ```
    public static MemorySegment create1(
    	int inID
    ) {
    	MethodHandle method = JPH_BODY_ID_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Construct from index and sequence number
    /// ```
    public static MemorySegment create2(
    	int inID,
    	byte inSequenceNumber
    ) {
    	MethodHandle method = JPH_BODY_ID_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inID,
    			inSequenceNumber
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_ID_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The value for an invalid body ID
    /// ```
    public static int getInvalidBodyID() {
    	MethodHandle method = JPH_BODY_ID_GET_INVALID_BODY_ID.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// This bit is used by the broadphase
    /// ```
    public static int getBroadPhaseBit() {
    	MethodHandle method = JPH_BODY_ID_GET_BROAD_PHASE_BIT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Maximum value for body index (also the maximum amount of bodies supported - 1)
    /// ```
    public static int getMaxBodyIndex() {
    	MethodHandle method = JPH_BODY_ID_GET_MAX_BODY_INDEX.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Maximum value for the sequence number
    /// ```
    public static byte getMaxSequenceNumber() {
    	MethodHandle method = JPH_BODY_ID_GET_MAX_SEQUENCE_NUMBER.get();
    	try {
    		return (byte) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Number of bits to shift to get the sequence number
    /// ```
    public static int getSequenceNumberShift() {
    	MethodHandle method = JPH_BODY_ID_GET_SEQUENCE_NUMBER_SHIFT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get index in body array
    /// ```
    public static int getIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_ID_GET_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIndex].
    public final int getIndex() {
    	return getIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Get sequence number of body.
    /// The sequence number can be used to check if a body ID with the same body index has been reused by another body.
    /// It is mainly used in multi threaded situations where a body is removed and its body index is immediately reused by a body created from another thread.
    /// Functions querying the broadphase can (after acquiring a body lock) detect that the body has been removed (we assume that this won't happen more than 128 times in a row).
    /// ```
    public static byte getSequenceNumber(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_ID_GET_SEQUENCE_NUMBER.get();
    	try {
    		return (byte) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSequenceNumber].
    public final byte getSequenceNumber() {
    	return getSequenceNumber(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns the index and sequence number combined in an uint32
    /// ```
    public static int getIndexAndSequenceNumber(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_ID_GET_INDEX_AND_SEQUENCE_NUMBER.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIndexAndSequenceNumber].
    public final int getIndexAndSequenceNumber() {
    	return getIndexAndSequenceNumber(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if the ID is valid
    /// ```
    public static boolean isInvalid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_ID_IS_INVALID.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isInvalid].
    public final boolean isInvalid() {
    	return isInvalid(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}