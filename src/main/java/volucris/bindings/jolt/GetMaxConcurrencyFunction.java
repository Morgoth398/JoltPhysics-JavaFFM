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

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Get maximum number of concurrently executing jobs
/// ```
public abstract class GetMaxConcurrencyFunction {

    private static final Map<Long, WeakReference<GetMaxConcurrencyFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(JAVA_INT);

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GetMaxConcurrencyFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GetMaxConcurrencyFunction() {
        this(Arena.ofAuto());
    }

    public GetMaxConcurrencyFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke() {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GetMaxConcurrencyFunction."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GetMaxConcurrencyFunction get(MemorySegment segment) {
        WeakReference<GetMaxConcurrencyFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}