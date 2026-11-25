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
import volucris.bindings.core.NativePointerArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Adds a number of jobs at once to the job queue
/// ```
public abstract class QueueJobsFunction {

    private static final Map<Long, WeakReference<QueueJobsFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(QueueJobsFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public QueueJobsFunction() {
        this(Arena.ofAuto());
    }

    public QueueJobsFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inJobs,
        int inNumJobs
    ) {
        invoke(
            new NativePointerArray(inJobs),
            inNumJobs
        );
    }

    public void invoke(
        NativePointerArray inJobs,
        int inNumJobs
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in QueueJobsFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable QueueJobsFunction get(MemorySegment segment) {
        WeakReference<QueueJobsFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}