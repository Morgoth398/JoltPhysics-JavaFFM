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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.RefTargetVirtualRef;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class CreateTriangleBatchFunction1 {

    private static final Map<Long, WeakReference<CreateTriangleBatchFunction1>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CreateTriangleBatchFunction1.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CreateTriangleBatchFunction1() {
        this(Arena.ofAuto());
    }

    public CreateTriangleBatchFunction1(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment inVertices,
        int inVertexCount,
        MemorySegment inIndices,
        int inIndexCount
    ) {
        return invoke(
            inVertices,
            inVertexCount,
            new NativeIntArray(inIndices),
            inIndexCount
        ).memorySegment();
    }

    public RefTargetVirtualRef invoke(
        MemorySegment inVertices,
        int inVertexCount,
        NativeIntArray inIndices,
        int inIndexCount
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CreateTriangleBatchFunction1."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CreateTriangleBatchFunction1 get(MemorySegment segment) {
        WeakReference<CreateTriangleBatchFunction1> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}