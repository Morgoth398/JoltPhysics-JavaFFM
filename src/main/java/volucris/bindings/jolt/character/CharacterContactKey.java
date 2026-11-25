/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class CharacterContactKey
		permits CharacterContact {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_CREATE3;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_GET_BODY_B;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_SET_BODY_B;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_GET_CHARACTER_IDB;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_SET_CHARACTER_IDB;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_GET_SUB_SHAPE_IDB;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_SET_SUB_SHAPE_IDB;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_IS_SAME_BODY;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_GET_HASH;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_KEY_RESTORE_STATE;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_CONTACT_KEY_CREATE = downcallHandle("JPH_CharacterContactKey_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_CREATE1 = downcallHandle("JPH_CharacterContactKey_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_CREATE2 = downcallHandle("JPH_CharacterContactKey_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_CREATE3 = downcallHandle("JPH_CharacterContactKey_Create3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_DESTROY = downcallHandleVoid("JPH_CharacterContactKey_Destroy", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_GET_BODY_B = downcallHandleVoid("JPH_CharacterContactKey_GetBodyB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_SET_BODY_B = downcallHandleVoid("JPH_CharacterContactKey_SetBodyB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_GET_CHARACTER_IDB = downcallHandleVoid("JPH_CharacterContactKey_GetCharacterIDB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_SET_CHARACTER_IDB = downcallHandleVoid("JPH_CharacterContactKey_SetCharacterIDB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_GET_SUB_SHAPE_IDB = downcallHandleVoid("JPH_CharacterContactKey_GetSubShapeIDB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_SET_SUB_SHAPE_IDB = downcallHandleVoid("JPH_CharacterContactKey_SetSubShapeIDB", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_IS_SAME_BODY = downcallHandle("JPH_CharacterContactKey_IsSameBody", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_GET_HASH = downcallHandle("JPH_CharacterContactKey_GetHash", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_SAVE_STATE = downcallHandleVoid("JPH_CharacterContactKey_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_CONTACT_KEY_RESTORE_STATE = downcallHandleVoid("JPH_CharacterContactKey_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CharacterContactKey() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterContactKey(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterContactKey(
	    CharacterContactKey inContact
	) {
	    this(
	        Arena.ofAuto(),
	        inContact
	    );
	}
	
	/// Typed method of [#create1].
	public CharacterContactKey(
		Arena arena,
		CharacterContactKey inContact
	) {
		MemorySegment segment = create1(
			inContact.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterContactKey(
	    BodyID inBodyB,
	    SubShapeID inSubShapeID
	) {
	    this(
	        Arena.ofAuto(),
	        inBodyB,
	        inSubShapeID
	    );
	}
	
	/// Typed method of [#create2].
	public CharacterContactKey(
		Arena arena,
		BodyID inBodyB,
		SubShapeID inSubShapeID
	) {
		MemorySegment segment = create2(
			inBodyB.memorySegment(),
			inSubShapeID.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterContactKey(
	    CharacterID inCharacterIDB,
	    SubShapeID inSubShapeID
	) {
	    this(
	        Arena.ofAuto(),
	        inCharacterIDB,
	        inSubShapeID
	    );
	}
	
	/// Typed method of [#create3].
	public CharacterContactKey(
		Arena arena,
		CharacterID inCharacterIDB,
		SubShapeID inSubShapeID
	) {
		MemorySegment segment = create3(
			inCharacterIDB.memorySegment(),
			inSubShapeID.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterContactKey(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inContact
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inContact
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inBodyB,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBodyB,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create3(
    	MemorySegment inCharacterIDB,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_CREATE3.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inCharacterIDB,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// ID of body we're colliding with (if not invalid)
    /// ```
    public static void getBodyB(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_GET_BODY_B.get();
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
    
    /// ```
    /// ID of body we're colliding with (if not invalid)
    /// ```
    public static void setBodyB(
    	MemorySegment self,
    	MemorySegment mBodyB
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_SET_BODY_B.get();
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
    /// Character we're colliding with (if not invalid)
    /// ```
    public static void getCharacterIDB(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_GET_CHARACTER_IDB.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCharacterIDB].
    public final void getCharacterIDB(
    	CharacterID outResult
    ) {
    	getCharacterIDB(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Character we're colliding with (if not invalid)
    /// ```
    public static void setCharacterIDB(
    	MemorySegment self,
    	MemorySegment mCharacterIDB
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_SET_CHARACTER_IDB.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCharacterIDB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCharacterIDB].
    public final void setCharacterIDB(
    	CharacterID mCharacterIDB
    ) {
    	setCharacterIDB(
    		this.segment,
    		mCharacterIDB.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape ID of body or character we're colliding with
    /// ```
    public static void getSubShapeIDB(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_GET_SUB_SHAPE_IDB.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeIDB].
    public final void getSubShapeIDB(
    	SubShapeID outResult
    ) {
    	getSubShapeIDB(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape ID of body or character we're colliding with
    /// ```
    public static void setSubShapeIDB(
    	MemorySegment self,
    	MemorySegment mSubShapeIDB
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_SET_SUB_SHAPE_IDB.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSubShapeIDB
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSubShapeIDB].
    public final void setSubShapeIDB(
    	SubShapeID mSubShapeIDB
    ) {
    	setSubShapeIDB(
    		this.segment,
    		mSubShapeIDB.memorySegment()
    	);
    }
    
    /// ```
    /// Checks if two contacts refer to the same body (or virtual character)
    /// ```
    public static boolean isSameBody(
    	MemorySegment self,
    	MemorySegment inOther
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_IS_SAME_BODY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inOther
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isSameBody].
    public final boolean isSameBody(
    	CharacterContactKey inOther
    ) {
    	return isSameBody(
    		this.segment,
    		inOther.memorySegment()
    	);
    }
    
    /// ```
    /// Hash of this structure
    /// ```
    public static long getHash(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_GET_HASH.get();
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
    
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_SAVE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveState].
    public void saveState(
    	StateRecorder inStream
    ) {
    	saveState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CHARACTER_CONTACT_KEY_RESTORE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreState].
    public void restoreState(
    	StateRecorder inStream
    ) {
    	restoreState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}