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
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Called after detecting a collision between a body pair, but before calling OnContactAdded and before adding the contact constraint.
/// If the function rejects the contact, the contact will not be processed by the simulation.
/// This is a rather expensive time to reject a contact point since a lot of the collision detection has happened already, make sure you
/// filter out the majority of undesired body pairs through the ObjectLayerPairFilter that is registered on the PhysicsSystem.
/// 
/// This function may not be called again the next update if a contact persists and no new contact pairs between sub shapes are found.
/// 
/// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
/// 
/// Body 1 will have a motion type that is larger or equal than body 2's motion type (order from large to small: dynamic -> kinematic -> static). When motion types are equal, they are ordered by BodyID.
/// 
/// The collision result (inCollisionResult) is reported relative to inBaseOffset.
/// ```
public abstract class OnContactValidateFunction {

    private static final Map<Long, WeakReference<OnContactValidateFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_INT, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnContactValidateFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnContactValidateFunction() {
        this(Arena.ofAuto());
    }

    public OnContactValidateFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public int invoke(
        MemorySegment inBody1,
        MemorySegment inBody2,
        MemorySegment inBaseOffset,
        MemorySegment inCollisionResult
    ) {
        return invoke(
            new Body(inBody1),
            new Body(inBody2),
            new Vec3(inBaseOffset),
            new CollideShapeResult(inCollisionResult)
        );
    }

    public int invoke(
        Body inBody1,
        Body inBody2,
        Vec3 inBaseOffset,
        CollideShapeResult inCollisionResult
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnContactValidateFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnContactValidateFunction get(MemorySegment segment) {
        WeakReference<OnContactValidateFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}