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

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Function to filter out object layers when doing collision query test (return true to allow testing against objects with this layer)
/// ```
public abstract class ObjectLayerFilterShouldCollideFunction {

    private static final Map<Long, WeakReference<ObjectLayerFilterShouldCollideFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            JAVA_SHORT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(ObjectLayerFilterShouldCollideFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ObjectLayerFilterShouldCollideFunction() {
        this(Arena.ofAuto());
    }

    public ObjectLayerFilterShouldCollideFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        short inLayer
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ObjectLayerFilterShouldCollideFunction."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ObjectLayerFilterShouldCollideFunction get(MemorySegment segment) {
        WeakReference<ObjectLayerFilterShouldCollideFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}