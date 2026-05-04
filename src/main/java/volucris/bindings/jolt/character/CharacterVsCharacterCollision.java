package volucris.bindings.jolt.character;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public abstract class CharacterVsCharacterCollision {

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY;

    static {
        //@formatter:off
        JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY = downcallHandleVoid("JPH_CharacterVsCharacterCollision_Destroy", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public static void destroy(
        MemorySegment listener
    ) {
        MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY.get();
        try {
            method.invokeExact(
                listener
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public abstract MemorySegment memorySegment();
    
}