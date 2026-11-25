/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

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
import volucris.bindings.jolt.collision.CollideShapeSettings;
import volucris.bindings.jolt.collision.shape.CollideShapeCollector;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Collide a character against other CharacterVirtuals.
/// @param inCharacter The character to collide.
/// @param inCenterOfMassTransform Center of mass transform for this character.
/// @param inCollideShapeSettings Settings for the collision check.
/// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. GetPosition() since floats are most accurate near the origin
/// @param ioCollector Collision collector that receives the collision results.
/// ```
public abstract class CollideCharacterFunction {

    private static final Map<Long, WeakReference<CollideCharacterFunction>> CACHE;

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
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CollideCharacterFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CollideCharacterFunction() {
        this(Arena.ofAuto());
    }

    public CollideCharacterFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inCharacter,
        MemorySegment inCenterOfMassTransform,
        MemorySegment inCollideShapeSettings,
        MemorySegment inBaseOffset,
        MemorySegment ioCollector
    ) {
        invoke(
            new CharacterVirtual(inCharacter),
            new Mat44(inCenterOfMassTransform),
            new CollideShapeSettings(inCollideShapeSettings),
            new Vec3(inBaseOffset),
            new CollideShapeCollector(ioCollector)
        );
    }

    public void invoke(
        CharacterVirtual inCharacter,
        Mat44 inCenterOfMassTransform,
        CollideShapeSettings inCollideShapeSettings,
        Vec3 inBaseOffset,
        CollideShapeCollector ioCollector
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CollideCharacterFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CollideCharacterFunction get(MemorySegment segment) {
        WeakReference<CollideCharacterFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}