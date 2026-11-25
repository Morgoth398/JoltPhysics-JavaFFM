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
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Allocates inSize bytes of memory, returned memory address must be JPH_RVECTOR_ALIGNMENT byte aligned
/// ```
public abstract class AllocateFunction {

    private static final Map<Long, WeakReference<AllocateFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(AllocateFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AllocateFunction() {
        this(Arena.ofAuto());
    }

    public AllocateFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        int inSize
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in AllocateFunction."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable AllocateFunction get(MemorySegment segment) {
        WeakReference<AllocateFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}