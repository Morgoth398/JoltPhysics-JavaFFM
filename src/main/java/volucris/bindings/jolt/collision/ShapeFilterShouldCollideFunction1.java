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
/// Filter function to determine if two shapes should collide. Returns true if the filter passes.
/// This overload is called when querying a shape vs a shape (e.g. collide object / cast object).
/// It is called at each level of the shape hierarchy, so if you have a compound shape with a box, this function will be called twice.
/// It will not be called on triangles that are part of another shape, i.e a mesh shape will not trigger a callback per triangle. You can filter out individual triangles in the CollisionCollector::AddHit function by their sub shape ID.
/// @param inShape1 1st shape that is colliding
/// @param inSubShapeIDOfShape1 The sub shape ID that will lead from the root shape to inShape1 (i.e. the shape that is used to collide or cast against shape 2)
/// @param inShape2 2nd shape that is colliding
/// @param inSubShapeIDOfShape2 The sub shape ID that will lead from the root shape to inShape2 (i.e. the shape of mBodyID2)
/// ```
public abstract class ShapeFilterShouldCollideFunction1 {

    private static final Map<Long, WeakReference<ShapeFilterShouldCollideFunction1>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(ShapeFilterShouldCollideFunction1.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ShapeFilterShouldCollideFunction1() {
        this(Arena.ofAuto());
    }

    public ShapeFilterShouldCollideFunction1(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment inShape1,
        MemorySegment inSubShapeIDOfShape1,
        MemorySegment inShape2,
        MemorySegment inSubShapeIDOfShape2
    ) {
        return invoke(
            new Shape(inShape1),
            new SubShapeID(inSubShapeIDOfShape1),
            new Shape(inShape2),
            new SubShapeID(inSubShapeIDOfShape2)
        );
    }

    public boolean invoke(
        Shape inShape1,
        SubShapeID inSubShapeIDOfShape1,
        Shape inShape2,
        SubShapeID inSubShapeIDOfShape2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in ShapeFilterShouldCollideFunction1."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable ShapeFilterShouldCollideFunction1 get(MemorySegment segment) {
        WeakReference<ShapeFilterShouldCollideFunction1> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}