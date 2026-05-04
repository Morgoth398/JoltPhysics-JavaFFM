/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.jobSystem;

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

public abstract class QueueJobCallback {

    private static final HashMap<Long, WeakReference<QueueJobCallback>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(QueueJobCallback.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public QueueJobCallback() {
        this(Arena.ofAuto());
    }

    public QueueJobCallback(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment context, 
        MemorySegment job, 
        MemorySegment arg
    ) {
        invoke(
            context, 
            JobFunction.get(job), 
            arg
        );
    }

    public void invoke(
        MemorySegment context, 
        JobFunction job, 
        MemorySegment arg
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in QueueJobCallback."
        );
    };


    public MemorySegment memorySegment() {
        return segment;
    }

    public static QueueJobCallback get(MemorySegment segment) {
        WeakReference<QueueJobCallback> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}