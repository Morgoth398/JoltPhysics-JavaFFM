/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CharacterID {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_GET_INVALID_CHARACTER_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_GET_VALUE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_IS_INVALID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_GET_HASH;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_S_NEXT_CHARACTER_ID;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_ID_S_SET_NEXT_CHARACTER_ID;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_ID_CREATE = downcallHandle("JPH_CharacterID_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_ID_CREATE1 = downcallHandle("JPH_CharacterID_Create1", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CHARACTER_ID_DESTROY = downcallHandleVoid("JPH_CharacterID_Destroy", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_ID_GET_INVALID_CHARACTER_ID = downcallHandle("JPH_CharacterID_GetInvalidCharacterID", JAVA_INT);
		JPH_CHARACTER_ID_GET_VALUE = downcallHandle("JPH_CharacterID_GetValue", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_ID_IS_INVALID = downcallHandle("JPH_CharacterID_IsInvalid", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_ID_GET_HASH = downcallHandle("JPH_CharacterID_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_ID_S_NEXT_CHARACTER_ID = downcallHandleVoid("JPH_CharacterID_sNextCharacterID", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_ID_S_SET_NEXT_CHARACTER_ID = downcallHandleVoid("JPH_CharacterID_sSetNextCharacterID", JAVA_INT);
		//@formatter:on
	}

	public CharacterID() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterID(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterID(
	    int inID
	) {
	    this(
	        Arena.ofAuto(),
	        inID
	    );
	}
	
	/// Typed method of [#create1].
	public CharacterID(
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

	public CharacterID(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Construct invalid character ID
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_ID_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Construct with specific value, make sure you don't use the same value twice!
    /// ```
    public static MemorySegment create1(
    	int inID
    ) {
    	MethodHandle method = JPH_CHARACTER_ID_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_ID_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The value for an invalid character ID
    /// ```
    public static int getInvalidCharacterID() {
    	MethodHandle method = JPH_CHARACTER_ID_GET_INVALID_CHARACTER_ID.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the numeric value of the ID
    /// ```
    public static int getValue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_ID_GET_VALUE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getValue].
    public final int getValue() {
    	return getValue(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if the ID is valid
    /// ```
    public static boolean isInvalid(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_ID_IS_INVALID.get();
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
    
    /// ```
    /// Get the hash for this character ID
    /// ```
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_ID_GET_HASH.get();
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
    
    /// ```
    /// Generate the next available character ID
    /// ```
    public static void sNextCharacterID(
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_ID_S_NEXT_CHARACTER_ID.get();
    	try {
    		 method.invokeExact(
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sNextCharacterID].
    public final void sNextCharacterID(
    	CharacterID outResult
    ) {
    	sNextCharacterID(
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the next available character ID, can be used after destroying all character to prepare for a second deterministic run
    /// ```
    public static void sSetNextCharacterID(
    	int inNextValue
    ) {
    	MethodHandle method = JPH_CHARACTER_ID_S_SET_NEXT_CHARACTER_ID.get();
    	try {
    		 method.invokeExact(
    			inNextValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}