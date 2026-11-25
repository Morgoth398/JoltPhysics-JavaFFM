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
import volucris.bindings.jolt.StringView;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Draw text
/// ```
public abstract class DrawText3DFunction {

    private static final Map<Long, WeakReference<DrawText3DFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_FLOAT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(DrawText3DFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DrawText3DFunction() {
        this(Arena.ofAuto());
    }

    public DrawText3DFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inPosition,
        MemorySegment inString,
        MemorySegment inColor,
        float inHeight
    ) {
        invoke(
            new Vec3(inPosition),
            new StringView(inString),
            new Color(inColor),
            inHeight
        );
    }

    public void invoke(
        Vec3 inPosition,
        StringView inString,
        Color inColor,
        float inHeight
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DrawText3DFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DrawText3DFunction get(MemorySegment segment) {
        WeakReference<DrawText3DFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}