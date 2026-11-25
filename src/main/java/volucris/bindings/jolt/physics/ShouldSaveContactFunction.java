/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

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
import volucris.bindings.jolt.body.BodyID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// If the state of a specific contact should be saved
/// ```
public abstract class ShouldSaveContactFunction {

    private static final Map<Long, WeakReference<ShouldSaveContactFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(ShouldSaveContactFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ShouldSaveContactFunction() {
        this(Arena.ofAuto());
    }

    public ShouldSaveContactFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment inBody1,
        MemorySegment inBody2
    ) {
        return invoke(
            new BodyID(inBody1),
            new BodyID(inBody2)
        );
    }

    public boolean invoke(
        BodyID inBody1,
        BodyID inBody2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ShouldSaveContactFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ShouldSaveContactFunction get(MemorySegment segment) {
        WeakReference<ShouldSaveContactFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}