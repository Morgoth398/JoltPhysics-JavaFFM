/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.raycast;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class CollideShapeCollectorCallback {

    private static final HashMap<Long, WeakReference<CollideShapeCollectorCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_FLOAT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CollideShapeCollectorCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CollideShapeCollectorCallback() {
        this(Arena.ofAuto());
    }

    public CollideShapeCollectorCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public float invoke(
        MemorySegment context, 
        MemorySegment result
    ) {
        return (float) invoke(
            context, 
            new CollideShapeResult(result)
        );
    }

    public float invoke(
        MemorySegment context, 
        CollideShapeResult result
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CollideShapeCollectorCallback."
        );
    };


    public MemorySegment memorySegment() {
        return segment;
    }

    public static CollideShapeCollectorCallback get(MemorySegment segment) {
        WeakReference<CollideShapeCollectorCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}