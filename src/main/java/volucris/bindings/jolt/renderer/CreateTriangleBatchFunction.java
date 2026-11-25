/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

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
import volucris.bindings.jolt.RefTargetVirtualRef;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Create a batch of triangles that can be drawn efficiently
/// ```
public abstract class CreateTriangleBatchFunction {

    private static final Map<Long, WeakReference<CreateTriangleBatchFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CreateTriangleBatchFunction.class, "ninvoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CreateTriangleBatchFunction() {
        this(Arena.ofAuto());
    }

    public CreateTriangleBatchFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment ninvoke(
        MemorySegment inTriangles,
        int inTriangleCount
    ) {
        return invoke(
            inTriangles,
            inTriangleCount
        ).memorySegment();
    }

    public RefTargetVirtualRef invoke(
        MemorySegment inTriangles,
        int inTriangleCount
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CreateTriangleBatchFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CreateTriangleBatchFunction get(MemorySegment segment) {
        WeakReference<CreateTriangleBatchFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}