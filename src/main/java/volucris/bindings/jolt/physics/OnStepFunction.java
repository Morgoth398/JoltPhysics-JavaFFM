/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

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
/// Called before every simulation step (received inCollisionSteps times for every PhysicsSystem::Update(...) call)
/// This is called while all body and constraint mutexes are locked. You can read/write bodies and constraints but not add/remove them.
/// Multiple listeners can be executed in parallel and it is the responsibility of the listener to avoid race conditions.
/// The best way to do this is to have each step listener operate on a subset of the bodies and constraints
/// and making sure that these bodies and constraints are not touched by any other step listener.
/// Note that this function is not called if there aren't any active bodies or when the physics system is updated with 0 delta time.
/// ```
public abstract class OnStepFunction {

    private static final Map<Long, WeakReference<OnStepFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnStepFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnStepFunction() {
        this(Arena.ofAuto());
    }

    public OnStepFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inContext
    ) {
        invoke(
            new PhysicsStepListenerContext(inContext)
        );
    }

    public void invoke(
        PhysicsStepListenerContext inContext
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnStepFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnStepFunction get(MemorySegment segment) {
        WeakReference<OnStepFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}