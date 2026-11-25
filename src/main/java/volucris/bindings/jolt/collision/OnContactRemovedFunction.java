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
import volucris.bindings.jolt.collision.shape.SubShapeIDPair;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Called whenever a contact was detected last update but is not detected anymore.
/// 
/// Note that this callback is called when all bodies are locked, so don't use any locking functions! See detailed class description of ContactListener.
/// 
/// Beware when trying to access the bodies at the time of callback:
/// - Some properties of the bodies are being modified from another thread at the same time.
/// Things that the simulation doesn't modify are safe to read (e.g. user data, if sensor, if added to system etc.).
/// Things that the simulation does modify (e.g. position, rotation, velocity, bounding box) are not safe to read.
/// Checking Body::IsActive may return that the body is active but another thread can be in the process of making it go to sleep.
/// Writing to the bodies is not allowed.
/// - The body may have been removed and destroyed (you'll receive an OnContactRemoved callback in the PhysicsSystem::Update after the body has been removed). Check that the body still exists.
/// 
/// If you need the properties that are being written, cache what you need in the OnContactAdded and OnContactPersisted callbacks and store it in a separate structure to use during this callback.
/// Alternatively, you could just record that the contact was removed and process it after PhysicsSystem::Update.
/// 
/// Body 1 and 2 will be sorted such that body 1 ID < body 2 ID, so body 1 may not be dynamic.
/// 
/// The sub shape IDs were created in the previous simulation step, so if the structure of a shape changes (e.g. by adding/removing a child shape of a compound shape),
/// the sub shape ID may not be valid / may not point to the same sub shape anymore.
/// If you want to know if this is the last contact between the two bodies, use PhysicsSystem::WereBodiesInContact.
/// ```
public abstract class OnContactRemovedFunction {

    private static final Map<Long, WeakReference<OnContactRemovedFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnContactRemovedFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnContactRemovedFunction() {
        this(Arena.ofAuto());
    }

    public OnContactRemovedFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inSubShapePair
    ) {
        invoke(
            new SubShapeIDPair(inSubShapePair)
        );
    }

    public void invoke(
        SubShapeIDPair inSubShapePair
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnContactRemovedFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnContactRemovedFunction get(MemorySegment segment) {
        WeakReference<OnContactRemovedFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}