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

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Draw a single back face culled triangle
/// ```
public abstract class DrawTriangleFunction {

    private static final Map<Long, WeakReference<DrawTriangleFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(DrawTriangleFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DrawTriangleFunction() {
        this(Arena.ofAuto());
    }

    public DrawTriangleFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inV1,
        MemorySegment inV2,
        MemorySegment inV3,
        MemorySegment inColor,
        int inCastShadow
    ) {
        invoke(
            new Vec3(inV1),
            new Vec3(inV2),
            new Vec3(inV3),
            new Color(inColor),
            inCastShadow
        );
    }

    public void invoke(
        Vec3 inV1,
        Vec3 inV2,
        Vec3 inV3,
        Color inColor,
        int inCastShadow
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in DrawTriangleFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable DrawTriangleFunction get(MemorySegment segment) {
        WeakReference<DrawTriangleFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}