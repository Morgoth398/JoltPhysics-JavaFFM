/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Same as OnContactRemoved but when colliding with a CharacterVirtual
/// Note that inOtherCharacterID can be the ID of a character that has been deleted. This happens if the character was in contact with this character during the last update, but has been deleted since.
/// ```
public abstract class OnCharacterContactRemovedFunction {

    private static final Map<Long, WeakReference<OnCharacterContactRemovedFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnCharacterContactRemovedFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnCharacterContactRemovedFunction() {
        this(Arena.ofAuto());
    }

    public OnCharacterContactRemovedFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inCharacter,
        MemorySegment inOtherCharacterID,
        MemorySegment inSubShapeID2
    ) {
        invoke(
            new CharacterVirtual(inCharacter),
            new CharacterID(inOtherCharacterID),
            new SubShapeID(inSubShapeID2)
        );
    }

    public void invoke(
        CharacterVirtual inCharacter,
        CharacterID inOtherCharacterID,
        SubShapeID inSubShapeID2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnCharacterContactRemovedFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnCharacterContactRemovedFunction get(MemorySegment segment) {
        WeakReference<OnCharacterContactRemovedFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}