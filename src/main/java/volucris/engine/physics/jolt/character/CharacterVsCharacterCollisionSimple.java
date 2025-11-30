package volucris.engine.physics.jolt.character;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Simple collision checker that loops over all registered characters. This is a
 * brute force checking algorithm. If you have a lot of characters you may want
 * to store your characters in a hierarchical structure to make this more
 * efficient. Note that this is not thread safe, so make sure that only one
 * CharacterVirtual is checking collision at a time.
 */
public abstract class CharacterVsCharacterCollisionSimple extends CharacterVsCharacterCollision {

	private static final MethodHandle JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE_SIMPLE;
	private static final MethodHandle JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD_CHARACTER;
	private static final MethodHandle JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE_CHARACTER;

	static {
		//@formatter:off
		JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE_SIMPLE = downcallHandle("JPH_CharacterVsCharacterCollision_CreateSimple", ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD_CHARACTER = downcallHandleVoid("JPH_CharacterVsCharacterCollisionSimple_AddCharacter", ADDRESS, ADDRESS);
		JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE_CHARACTER = downcallHandleVoid("JPH_CharacterVsCharacterCollisionSimple_RemoveCharacter", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public CharacterVsCharacterCollisionSimple() {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE_SIMPLE;
			segment = (MemorySegment) method.invokeExact();
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create CharacterVsCharacterCollisionSimple");
		}
		super(segment);
	}

	/**
	 * Add a character to the list of characters to check collision against. 
	 */
	public void addCharacter(CharacterVirtual character) {
		try {
			MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD_CHARACTER;
			method.invokeExact(jphCharacterVsCharacterCollision, character.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add character.");
		}
	}

	/**
	 * Remove a character from the list of characters to check collision against. 
	 */
	public void removeCharacter(CharacterVirtual character) {
		try {
			MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE_CHARACTER;
			method.invokeExact(jphCharacterVsCharacterCollision, character.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add character.");
		}
	}

}
