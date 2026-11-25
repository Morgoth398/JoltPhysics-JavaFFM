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
/// Wait for a set of jobs to be finished, note that only 1 thread can be waiting on a barrier at a time
/// ```
public abstract class WaitForJobsFunction {

    private static final Map<Long, WeakReference<WaitForJobsFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(WaitForJobsFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public WaitForJobsFunction() {
        this(Arena.ofAuto());
    }

    public WaitForJobsFunction(Arena arena) {
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
            "Override either the typed or raw callback method in WaitForJobsFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable WaitForJobsFunction get(MemorySegment segment) {
        WeakReference<WaitForJobsFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}