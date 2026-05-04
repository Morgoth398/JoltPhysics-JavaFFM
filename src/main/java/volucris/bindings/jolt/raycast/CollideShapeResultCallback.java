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

public abstract class CollideShapeResultCallback {

    private static final HashMap<Long, WeakReference<CollideShapeResultCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CollideShapeResultCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CollideShapeResultCallback() {
        this(Arena.ofAuto());
    }

    public CollideShapeResultCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment context, 
        MemorySegment result
    ) {
        invoke(
            context, 
            new CollideShapeResult(result)
        );
    }

    public void invoke(
        MemorySegment context, 
        CollideShapeResult result
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CollideShapeResultCallback."
        );
    };


    public MemorySegment memorySegment() {
        return segment;
    }

    public static CollideShapeResultCallback get(MemorySegment segment) {
        WeakReference<CollideShapeResultCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}