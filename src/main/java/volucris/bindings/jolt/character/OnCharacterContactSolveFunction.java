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
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Same as OnContactSolve but when colliding with a CharacterVirtual
/// ```
public abstract class OnCharacterContactSolveFunction {

    private static final Map<Long, WeakReference<OnCharacterContactSolveFunction>> CACHE;

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
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnCharacterContactSolveFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnCharacterContactSolveFunction() {
        this(Arena.ofAuto());
    }

    public OnCharacterContactSolveFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inCharacter,
        MemorySegment inOtherCharacter,
        MemorySegment inSubShapeID2,
        MemorySegment inContactPosition,
        MemorySegment inContactNormal,
        MemorySegment inContactVelocity,
        MemorySegment inContactMaterial,
        MemorySegment inCharacterVelocity,
        MemorySegment ioNewCharacterVelocity
    ) {
        invoke(
            new CharacterVirtual(inCharacter),
            new CharacterVirtual(inOtherCharacter),
            new SubShapeID(inSubShapeID2),
            new Vec3(inContactPosition),
            new Vec3(inContactNormal),
            new Vec3(inContactVelocity),
            new PhysicsMaterial(inContactMaterial),
            new Vec3(inCharacterVelocity),
            new Vec3(ioNewCharacterVelocity)
        );
    }

    public void invoke(
        CharacterVirtual inCharacter,
        CharacterVirtual inOtherCharacter,
        SubShapeID inSubShapeID2,
        Vec3 inContactPosition,
        Vec3 inContactNormal,
        Vec3 inContactVelocity,
        PhysicsMaterial inContactMaterial,
        Vec3 inCharacterVelocity,
        Vec3 ioNewCharacterVelocity
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnCharacterContactSolveFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnCharacterContactSolveFunction get(MemorySegment segment) {
        WeakReference<OnCharacterContactSolveFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}