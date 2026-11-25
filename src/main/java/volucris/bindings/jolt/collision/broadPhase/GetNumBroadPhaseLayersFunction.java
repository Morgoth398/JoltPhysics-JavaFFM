/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

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
/// Return the number of broadphase layers there are
/// ```
public abstract class GetNumBroadPhaseLayersFunction {

    private static final Map<Long, WeakReference<GetNumBroadPhaseLayersFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(JAVA_INT);

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GetNumBroadPhaseLayersFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GetNumBroadPhaseLayersFunction() {
        this(Arena.ofAuto());
    }

    public GetNumBroadPhaseLayersFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke() {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GetNumBroadPhaseLayersFunction."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GetNumBroadPhaseLayersFunction get(MemorySegment segment) {
        WeakReference<GetNumBroadPhaseLayersFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}