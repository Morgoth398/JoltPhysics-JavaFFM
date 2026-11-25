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
/// Returns true if two layers can collide
/// ```
public abstract class ObjectLayerPairFilterShouldCollideFunction {

    private static final Map<Long, WeakReference<ObjectLayerPairFilterShouldCollideFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            JAVA_SHORT, 
            JAVA_SHORT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(ObjectLayerPairFilterShouldCollideFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ObjectLayerPairFilterShouldCollideFunction() {
        this(Arena.ofAuto());
    }

    public ObjectLayerPairFilterShouldCollideFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        short inLayer1,
        short inLayer2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ObjectLayerPairFilterShouldCollideFunction."
        );
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ObjectLayerPairFilterShouldCollideFunction get(MemorySegment segment) {
        WeakReference<ObjectLayerPairFilterShouldCollideFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}