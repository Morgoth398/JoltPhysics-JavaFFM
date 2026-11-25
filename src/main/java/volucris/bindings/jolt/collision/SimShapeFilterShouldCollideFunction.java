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
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Filter function to determine if two shapes should collide. Returns true if the filter passes.
/// This overload is called during the simulation (PhysicsSystem::Update) and must be registered with PhysicsSystem::SetSimShapeFilter.
/// It is called at each level of the shape hierarchy, so if you have a compound shape with a box, this function will be called twice.
/// It will not be called on triangles that are part of another shape, i.e a mesh shape will not trigger a callback per triangle.
/// Note that this function is called from multiple threads and must be thread safe. All properties are read only.
/// @param inBody1 1st body that is colliding
/// @param inShape1 1st shape that is colliding
/// @param inSubShapeIDOfShape1 The sub shape ID that will lead from inBody1.GetShape() to inShape1
/// @param inBody2 2nd body that is colliding
/// @param inShape2 2nd shape that is colliding
/// @param inSubShapeIDOfShape2 The sub shape ID that will lead from inBody2.GetShape() to inShape2
/// ```
public abstract class SimShapeFilterShouldCollideFunction {

    private static final Map<Long, WeakReference<SimShapeFilterShouldCollideFunction>> CACHE;

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
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(SimShapeFilterShouldCollideFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public SimShapeFilterShouldCollideFunction() {
        this(Arena.ofAuto());
    }

    public SimShapeFilterShouldCollideFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment inBody1,
        MemorySegment inShape1,
        MemorySegment inSubShapeIDOfShape1,
        MemorySegment inBody2,
        MemorySegment inShape2,
        MemorySegment inSubShapeIDOfShape2
    ) {
        return invoke(
            new Body(inBody1),
            new Shape(inShape1),
            new SubShapeID(inSubShapeIDOfShape1),
            new Body(inBody2),
            new Shape(inShape2),
            new SubShapeID(inSubShapeIDOfShape2)
        );
    }

    public boolean invoke(
        Body inBody1,
        Shape inShape1,
        SubShapeID inSubShapeIDOfShape1,
        Body inBody2,
        Shape inShape2,
        SubShapeID inSubShapeIDOfShape2
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in SimShapeFilterShouldCollideFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable SimShapeFilterShouldCollideFunction get(MemorySegment segment) {
        WeakReference<SimShapeFilterShouldCollideFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}