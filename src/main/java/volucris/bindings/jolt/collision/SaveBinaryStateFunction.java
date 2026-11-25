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
import volucris.bindings.jolt.StreamOut;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Saves the contents of the group filter in binary form to inStream.
/// ```
public abstract class SaveBinaryStateFunction {

    private static final Map<Long, WeakReference<SaveBinaryStateFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(SaveBinaryStateFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public SaveBinaryStateFunction() {
        this(Arena.ofAuto());
    }

    public SaveBinaryStateFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inStream
    ) {
        invoke(
            new StreamOut(inStream)
        );
    }

    public void invoke(
        StreamOut inStream
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in SaveBinaryStateFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable SaveBinaryStateFunction get(MemorySegment segment) {
        WeakReference<SaveBinaryStateFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}