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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Same as OnContactValidate but when colliding with a CharacterVirtual
/// ```
public abstract class OnCharacterContactValidateFunction {

    private static final Map<Long, WeakReference<OnCharacterContactValidateFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnCharacterContactValidateFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnCharacterContactValidateFunction() {
        this(Arena.ofAuto());
    }

    public OnCharacterContactValidateFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment inCharacter,
        MemorySegment inContact
    ) {
        return invoke(
            new CharacterVirtual(inCharacter),
            new CharacterContact(inContact)
        );
    }

    public boolean invoke(
        CharacterVirtual inCharacter,
        CharacterContact inContact
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnCharacterContactValidateFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnCharacterContactValidateFunction get(MemorySegment segment) {
        WeakReference<OnCharacterContactValidateFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}