/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

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
/// Called after all contact points for a soft body have been handled.
/// Note that this callback is called when all bodies are locked, so don't use any locking functions!
/// You will receive a single callback for a soft body per simulation step for performance reasons, this callback will apply to all vertices in the soft body.
/// @param inSoftBody The soft body that collided. It is safe to access this as the soft body is only updated on the current thread.
/// @param inManifold The manifold that describes which vertices collide and with what body they collide. Other bodies may be modified by other threads during this callback.
/// ```
public abstract class OnSoftBodyContactAdded {

    private static final Map<Long, WeakReference<OnSoftBodyContactAdded>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnSoftBodyContactAdded.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnSoftBodyContactAdded() {
        this(Arena.ofAuto());
    }

    public OnSoftBodyContactAdded(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inSoftBody,
        MemorySegment inManifold
    ) {
        invoke(
            new Body(inSoftBody),
            new SoftBodyManifold(inManifold)
        );
    }

    public void invoke(
        Body inSoftBody,
        SoftBodyManifold inManifold
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnSoftBodyContactAdded."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnSoftBodyContactAdded get(MemorySegment segment) {
        WeakReference<OnSoftBodyContactAdded> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}