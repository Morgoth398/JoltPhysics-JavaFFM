/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

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
/// Destroy a barrier when it is no longer used. The barrier should be empty at this point.
/// ```
public abstract class DestroyBarrierFunction {

    private static final Map<Long, WeakReference<DestroyBarrierFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(DestroyBarrierFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DestroyBarrierFunction() {
        this(Arena.ofAuto());
    }

    public DestroyBarrierFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inBarrier
    ) {
        invoke(
            new JobSystemBarrier(inBarrier)
        );
    }

    public void invoke(
        JobSystemBarrier inBarrier
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DestroyBarrierFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DestroyBarrierFunction get(MemorySegment segment) {
        WeakReference<DestroyBarrierFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}