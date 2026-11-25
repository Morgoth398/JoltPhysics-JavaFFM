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
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Called whenever the character loses contact with a body.
/// Note that there is no guarantee that the body or its sub shape still exists at this point. The body may have been deleted since the last update.
/// @param inCharacter Character that is being solved
/// @param inBodyID2 Body ID of body that is being hit
/// @param inSubShapeID2 Sub shape ID of shape that is being hit
/// ```
public abstract class OnContactRemovedFunction {

    private static final Map<Long, WeakReference<OnContactRemovedFunction>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(OnContactRemovedFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnContactRemovedFunction() {
        this(Arena.ofAuto());
    }

    public OnContactRemovedFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inCharacter,
        MemorySegment inBodyID2,
        MemorySegment inSubShapeID2
    ) {
        invoke(
            new CharacterVirtual(inCharacter),
            new BodyID(inBodyID2),
            new SubShapeID(inSubShapeID2)
        );
    }

    public void invoke(
        CharacterVirtual inCharacter,
        BodyID inBodyID2,
        SubShapeID inSubShapeID2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnContactRemovedFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnContactRemovedFunction get(MemorySegment segment) {
        WeakReference<OnContactRemovedFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}