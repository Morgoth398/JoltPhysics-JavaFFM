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

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Same as OnContactAdded but when colliding with a CharacterVirtual
/// ```
public abstract class OnCharacterContactAddedFunction {

    private static final Map<Long, WeakReference<OnCharacterContactAddedFunction>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(OnCharacterContactAddedFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnCharacterContactAddedFunction() {
        this(Arena.ofAuto());
    }

    public OnCharacterContactAddedFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inCharacter,
        MemorySegment inContact,
        MemorySegment ioSettings
    ) {
        invoke(
            new CharacterVirtual(inCharacter),
            new CharacterContact(inContact),
            new CharacterContactSettings(ioSettings)
        );
    }

    public void invoke(
        CharacterVirtual inCharacter,
        CharacterContact inContact,
        CharacterContactSettings ioSettings
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnCharacterContactAddedFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnCharacterContactAddedFunction get(MemorySegment segment) {
        WeakReference<OnCharacterContactAddedFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}