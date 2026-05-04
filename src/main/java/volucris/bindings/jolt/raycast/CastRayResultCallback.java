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

public abstract class CastRayResultCallback {

    private static final HashMap<Long, WeakReference<CastRayResultCallback>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(CastRayResultCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CastRayResultCallback() {
        this(Arena.ofAuto());
    }

    public CastRayResultCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment context, 
        MemorySegment result
    ) {
        invoke(
            context, 
            new RayCastResult(result)
        );
    }

    public void invoke(
        MemorySegment context, 
        RayCastResult result
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CastRayResultCallback."
        );
    };


    public MemorySegment memorySegment() {
        return segment;
    }

    public static CastRayResultCallback get(MemorySegment segment) {
        WeakReference<CastRayResultCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}