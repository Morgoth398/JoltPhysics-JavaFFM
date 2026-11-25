/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

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
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Called whenever a body deactivates, note this can be called from any thread so make sure your code is thread safe.
/// At the time of the callback the body inBodyID will be locked and no bodies can be written/activated/deactivated from the callback.
/// ```
public abstract class OnBodyDeactivatedFunction {

    private static final Map<Long, WeakReference<OnBodyDeactivatedFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            JAVA_LONG
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnBodyDeactivatedFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnBodyDeactivatedFunction() {
        this(Arena.ofAuto());
    }

    public OnBodyDeactivatedFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inBodyID,
        long inBodyUserData
    ) {
        invoke(
            new BodyID(inBodyID),
            inBodyUserData
        );
    }

    public void invoke(
        BodyID inBodyID,
        long inBodyUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnBodyDeactivatedFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnBodyDeactivatedFunction get(MemorySegment segment) {
        WeakReference<OnBodyDeactivatedFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}