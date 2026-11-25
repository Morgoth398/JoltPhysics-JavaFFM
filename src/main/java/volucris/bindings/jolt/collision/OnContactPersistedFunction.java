/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

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
import volucris.bindings.jolt.body.Body;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Called whenever a contact is detected that was also detected last update.
/// 
/// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
/// 
/// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
/// 
/// If the structure of the shape of a body changes between simulation steps (e.g. by adding/removing a child shape of a compound shape),
/// it is possible that the same sub shape ID used to identify the removed child shape is now reused for a different child shape. The physics
/// system cannot detect this, so may send a 'contact persisted' callback even though the contact is now on a different child shape. You can
/// detect this by keeping the old shape (before adding/removing a part) around until the next PhysicsSystem::Update (when the OnContactPersisted
/// callbacks are triggered) and resolving the sub shape ID against both the old and new shape to see if they still refer to the same child shape.
/// ```
public abstract class OnContactPersistedFunction {

    private static final Map<Long, WeakReference<OnContactPersistedFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnContactPersistedFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnContactPersistedFunction() {
        this(Arena.ofAuto());
    }

    public OnContactPersistedFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inBody1,
        MemorySegment inBody2,
        MemorySegment inManifold,
        MemorySegment ioSettings
    ) {
        invoke(
            new Body(inBody1),
            new Body(inBody2),
            new ContactManifold(inManifold),
            new ContactSettings(ioSettings)
        );
    }

    public void invoke(
        Body inBody1,
        Body inBody2,
        ContactManifold inManifold,
        ContactSettings ioSettings
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnContactPersistedFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnContactPersistedFunction get(MemorySegment segment) {
        WeakReference<OnContactPersistedFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}