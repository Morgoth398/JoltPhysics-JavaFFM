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
/// Function to filter out broadphase layers when doing collision query test (return true to allow testing against objects with this layer)
/// ```
public abstract class ShouldCollideFunction {

    private static final Map<Long, WeakReference<ShouldCollideFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(ShouldCollideFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ShouldCollideFunction() {
        this(Arena.ofAuto());
    }

    public ShouldCollideFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment inLayer
    ) {
        return invoke(
            new BroadPhaseLayer(inLayer)
        );
    }

    public boolean invoke(
        BroadPhaseLayer inLayer
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ShouldCollideFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ShouldCollideFunction get(MemorySegment segment) {
        WeakReference<ShouldCollideFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}