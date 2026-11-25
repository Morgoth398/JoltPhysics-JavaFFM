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
import volucris.bindings.jolt.Color;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Draw line
/// ```
public abstract class DrawLineFunction {

    private static final Map<Long, WeakReference<DrawLineFunction>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(DrawLineFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DrawLineFunction() {
        this(Arena.ofAuto());
    }

    public DrawLineFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inFrom,
        MemorySegment inTo,
        MemorySegment inColor
    ) {
        invoke(
            new Vec3(inFrom),
            new Vec3(inTo),
            new Color(inColor)
        );
    }

    public void invoke(
        Vec3 inFrom,
        Vec3 inTo,
        Color inColor
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DrawLineFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DrawLineFunction get(MemorySegment segment) {
        WeakReference<DrawLineFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}