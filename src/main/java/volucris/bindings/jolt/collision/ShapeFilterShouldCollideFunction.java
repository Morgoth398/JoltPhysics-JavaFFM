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
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Filter function to determine if we should collide with a shape. Returns true if the filter passes.
/// This overload is called when the query doesn't have a source shape (e.g. ray cast / collide point)
/// @param inShape2 Shape we're colliding against
/// @param inSubShapeIDOfShape2 The sub shape ID that will lead from the root shape to inShape2 (i.e. the shape of mBodyID2)
/// ```
public abstract class ShapeFilterShouldCollideFunction {

    private static final Map<Long, WeakReference<ShapeFilterShouldCollideFunction>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(ShapeFilterShouldCollideFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ShapeFilterShouldCollideFunction() {
        this(Arena.ofAuto());
    }

    public ShapeFilterShouldCollideFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment inShape2,
        MemorySegment inSubShapeIDOfShape2
    ) {
        return invoke(
            new Shape(inShape2),
            new SubShapeID(inSubShapeIDOfShape2)
        );
    }

    public boolean invoke(
        Shape inShape2,
        SubShapeID inSubShapeIDOfShape2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ShapeFilterShouldCollideFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ShapeFilterShouldCollideFunction get(MemorySegment segment) {
        WeakReference<ShapeFilterShouldCollideFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}