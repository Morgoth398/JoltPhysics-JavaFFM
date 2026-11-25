/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

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
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayer;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Returns true if an object layer should collide with a broadphase layer
/// ```
public abstract class ObjectVsBroadPhaseLayerFilterShouldCollideFunction {

    private static final Map<Long, WeakReference<ObjectVsBroadPhaseLayerFilterShouldCollideFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            JAVA_SHORT, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(ObjectVsBroadPhaseLayerFilterShouldCollideFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ObjectVsBroadPhaseLayerFilterShouldCollideFunction() {
        this(Arena.ofAuto());
    }

    public ObjectVsBroadPhaseLayerFilterShouldCollideFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        short inLayer1,
        MemorySegment inLayer2
    ) {
        return invoke(
            inLayer1,
            new BroadPhaseLayer(inLayer2)
        );
    }

    public boolean invoke(
        short inLayer1,
        BroadPhaseLayer inLayer2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ObjectVsBroadPhaseLayerFilterShouldCollideFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ObjectVsBroadPhaseLayerFilterShouldCollideFunction get(MemorySegment segment) {
        WeakReference<ObjectVsBroadPhaseLayerFilterShouldCollideFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}