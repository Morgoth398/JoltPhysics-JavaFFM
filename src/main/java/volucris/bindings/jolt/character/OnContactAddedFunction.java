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
/// Called whenever the character collides with a body for the first time.
/// @param inCharacter Character that is being solved
/// @param inContact Contact that we're colliding against
/// @param ioSettings Settings returned by the contact callback to indicate how the character should behave
/// ```
public abstract class OnContactAddedFunction {

    private static final Map<Long, WeakReference<OnContactAddedFunction>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(OnContactAddedFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnContactAddedFunction() {
        this(Arena.ofAuto());
    }

    public OnContactAddedFunction(Arena arena) {
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
            "Override either the typed or raw callback method in OnContactAddedFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnContactAddedFunction get(MemorySegment segment) {
        WeakReference<OnContactAddedFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}