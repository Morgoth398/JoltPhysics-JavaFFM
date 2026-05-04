/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class CharacterVsCharacterCollisionSimple extends CharacterVsCharacterCollision {

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE_SIMPLE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD_CHARACTER;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE_CHARACTER;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE_SIMPLE = downcallHandle("JPH_CharacterVsCharacterCollision_CreateSimple", UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD_CHARACTER = downcallHandleVoid("JPH_CharacterVsCharacterCollisionSimple_AddCharacter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE_CHARACTER = downcallHandleVoid("JPH_CharacterVsCharacterCollisionSimple_RemoveCharacter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public CharacterVsCharacterCollisionSimple() {
        this(Arena.ofAuto());
    }
    
    public CharacterVsCharacterCollisionSimple(Arena arena) {
        MemorySegment segment = createSimple();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public CharacterVsCharacterCollisionSimple(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment createSimple() {
        MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE_SIMPLE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void addCharacter(
        MemorySegment characterVsCharacter, 
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_ADD_CHARACTER.get();
        try {
            method.invokeExact(
                characterVsCharacter, 
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addCharacter}.
     */
    public final void addCharacter(
        CharacterVirtual character
    ) {
        addCharacter(
            this.segment, 
            character.memorySegment()
        );
    }
    
    public static void removeCharacter(
        MemorySegment characterVsCharacter, 
        MemorySegment character
    ) {
        MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SIMPLE_REMOVE_CHARACTER.get();
        try {
            method.invokeExact(
                characterVsCharacter, 
                character
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #removeCharacter}.
     */
    public final void removeCharacter(
        CharacterVirtual character
    ) {
        removeCharacter(
            this.segment, 
            character.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}