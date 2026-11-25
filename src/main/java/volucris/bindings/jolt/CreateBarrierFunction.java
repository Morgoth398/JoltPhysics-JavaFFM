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
/// Create a new barrier, used to wait on jobs
/// ```
public abstract class CreateBarrierFunction {

    private static final Map<Long, WeakReference<CreateBarrierFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(UNBOUNDED_ADDRESS);

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CreateBarrierFunction.class, "ninvoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CreateBarrierFunction() {
        this(Arena.ofAuto());
    }

    public CreateBarrierFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment ninvoke() {
        return invoke(
        ).memorySegment();
    }

    public JobSystemBarrier invoke(
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CreateBarrierFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CreateBarrierFunction get(MemorySegment segment) {
        WeakReference<CreateBarrierFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}