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
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Called whenever a contact is being used by the solver. Allows the listener to override the resulting character velocity (e.g. by preventing sliding along certain surfaces).
/// @param inCharacter Character that is being solved
/// @param inBodyID2 Body ID of body that is being hit
/// @param inSubShapeID2 Sub shape ID of shape that is being hit
/// @param inContactPosition World space contact position
/// @param inContactNormal World space contact normal
/// @param inContactVelocity World space velocity of contact point (e.g. for a moving platform)
/// @param inContactMaterial Material of contact point
/// @param inCharacterVelocity World space velocity of the character prior to hitting this contact
/// @param ioNewCharacterVelocity Contains the calculated world space velocity of the character after hitting this contact, this velocity slides along the surface of the contact. Can be modified by the listener to provide an alternative velocity.
/// ```
public abstract class OnContactSolveFunction {

    private static final Map<Long, WeakReference<OnContactSolveFunction>> CACHE;

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
            HANDLE = MethodHandles.lookup().findVirtual(OnContactSolveFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnContactSolveFunction() {
        this(Arena.ofAuto());
    }

    public OnContactSolveFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inCharacter,
        MemorySegment inBodyID2,
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
            new BodyID(inBodyID2),
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
        BodyID inBodyID2,
        SubShapeID inSubShapeID2,
        Vec3 inContactPosition,
        Vec3 inContactNormal,
        Vec3 inContactVelocity,
        PhysicsMaterial inContactMaterial,
        Vec3 inCharacterVelocity,
        Vec3 ioNewCharacterVelocity
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnContactSolveFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnContactSolveFunction get(MemorySegment segment) {
        WeakReference<OnContactSolveFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}