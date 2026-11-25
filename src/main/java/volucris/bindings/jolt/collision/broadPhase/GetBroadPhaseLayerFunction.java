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
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Convert an object layer to the corresponding broadphase layer
/// ```
public abstract class GetBroadPhaseLayerFunction {

    private static final Map<Long, WeakReference<GetBroadPhaseLayerFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            JAVA_SHORT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(GetBroadPhaseLayerFunction.class, "ninvoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public GetBroadPhaseLayerFunction() {
        this(Arena.ofAuto());
    }

    public GetBroadPhaseLayerFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment ninvoke(
        short inLayer
    ) {
        return invoke(
            inLayer
        ).memorySegment();
    }

    public BroadPhaseLayer invoke(
        short inLayer
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in GetBroadPhaseLayerFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable GetBroadPhaseLayerFunction get(MemorySegment segment) {
        WeakReference<GetBroadPhaseLayerFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}