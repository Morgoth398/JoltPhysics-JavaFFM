/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static volucris.bindings.core.FFMUtils.*;

public final class CharacterVsCharacterCollisionSimple extends CharacterVsCharacterCollision {

	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_AS_CHARACTER_VS_CHARACTER_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_GET_CHARACTERS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_SET_CHARACTERS;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD;
	private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_CREATE = downcallHandle("JPH_CharacterVsCharacterCollisionSimple_Create", UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_AS_CHARACTER_VS_CHARACTER_COLLISION = downcallHandle("JPH_CharacterVsCharacterCollisionSimple_AsCharacterVsCharacterCollision", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_GET_CHARACTERS = downcallHandleVoid("JPH_CharacterVsCharacterCollisionSimple_GetCharacters", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_SET_CHARACTERS = downcallHandleVoid("JPH_CharacterVsCharacterCollisionSimple_SetCharacters", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD = downcallHandleVoid("JPH_CharacterVsCharacterCollisionSimple_Add", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE = downcallHandleVoid("JPH_CharacterVsCharacterCollisionSimple_Remove", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CharacterVsCharacterCollisionSimple() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CharacterVsCharacterCollisionSimple(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCharacterVsCharacterCollision(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CharacterVsCharacterCollisionSimple(MemorySegment segment) {
		this.segment = segment;
		super(asCharacterVsCharacterCollision(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCharacterVsCharacterCollision(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_AS_CHARACTER_VS_CHARACTER_COLLISION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#asCharacterVsCharacterCollision].
    public final @Nullable CharacterVsCharacterCollision asCharacterVsCharacterCollision() {
    	MemorySegment segment = asCharacterVsCharacterCollision(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CharacterVsCharacterCollision(segment);
    }
    
    /// ```
    /// The list of characters to check collision against
    /// ```
    public static void getCharacters(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_GET_CHARACTERS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCharacters].
    public final void getCharacters(
    	CharacterVirtualArray outResult
    ) {
    	getCharacters(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The list of characters to check collision against
    /// ```
    public static void setCharacters(
    	MemorySegment self,
    	MemorySegment mCharacters
    ) {
    	MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_SET_CHARACTERS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCharacters
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCharacters].
    public final void setCharacters(
    	CharacterVirtualArray mCharacters
    ) {
    	setCharacters(
    		this.segment,
    		mCharacters.memorySegment()
    	);
    }
    
    /// ```
    /// Add a character to the list of characters to check collision against.
    /// ```
    public static void add(
    	MemorySegment self,
    	MemorySegment inCharacter
    ) {
    	MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCharacter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#add].
    public final void add(
    	CharacterVirtual inCharacter
    ) {
    	add(
    		this.segment,
    		inCharacter.memorySegment()
    	);
    }
    
    /// ```
    /// Remove a character from the list of characters to check collision against.
    /// ```
    public static void remove(
    	MemorySegment self,
    	MemorySegment inCharacter
    ) {
    	MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCharacter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#remove].
    public final void remove(
    	CharacterVirtual inCharacter
    ) {
    	remove(
    		this.segment,
    		inCharacter.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}