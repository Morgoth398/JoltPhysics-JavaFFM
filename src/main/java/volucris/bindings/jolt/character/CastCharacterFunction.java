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
import volucris.bindings.jolt.collision.ShapeCastSettings;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Cast a character against other CharacterVirtuals.
/// @param inCharacter The character to cast.
/// @param inCenterOfMassTransform Center of mass transform for this character.
/// @param inDirection Direction and length to cast in.
/// @param inShapeCastSettings Settings for the shape cast.
/// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. GetPosition() since floats are most accurate near the origin
/// @param ioCollector Collision collector that receives the collision results.
/// ```
public abstract class CastCharacterFunction {

    private static final Map<Long, WeakReference<CastCharacterFunction>> CACHE;

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
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CastCharacterFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CastCharacterFunction() {
        this(Arena.ofAuto());
    }

    public CastCharacterFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inCharacter,
        MemorySegment inCenterOfMassTransform,
        MemorySegment inDirection,
        MemorySegment inShapeCastSettings,
        MemorySegment inBaseOffset,
        MemorySegment ioCollector
    ) {
        invoke(
            new CharacterVirtual(inCharacter),
            new Mat44(inCenterOfMassTransform),
            new Vec3(inDirection),
            new ShapeCastSettings(inShapeCastSettings),
            new Vec3(inBaseOffset),
            new CastShapeCollector(ioCollector)
        );
    }

    public void invoke(
        CharacterVirtual inCharacter,
        Mat44 inCenterOfMassTransform,
        Vec3 inDirection,
        ShapeCastSettings inShapeCastSettings,
        Vec3 inBaseOffset,
        CastShapeCollector ioCollector
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CastCharacterFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CastCharacterFunction get(MemorySegment segment) {
        WeakReference<CastCharacterFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}