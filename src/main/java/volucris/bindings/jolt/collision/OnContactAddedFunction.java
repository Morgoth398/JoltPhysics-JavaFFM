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
/// Called whenever a new contact point is detected.
/// 
/// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
/// 
/// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
/// 
/// Note that only active bodies will report contacts, as soon as a body goes to sleep the contacts between that body and all other
/// bodies will receive an OnContactRemoved callback, if this is the case then Body::IsActive() will return false during the callback.
/// 
/// When contacts are added, the constraint solver has not run yet, so the collision impulse is unknown at that point.
/// The velocities of inBody1 and inBody2 are the velocities before the contact has been resolved, so you can use this to
/// estimate the collision impulse to e.g. determine the volume of the impact sound to play (see: EstimateCollisionResponse).
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