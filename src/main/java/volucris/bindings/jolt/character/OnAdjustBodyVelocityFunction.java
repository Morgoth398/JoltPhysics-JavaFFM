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
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Callback to adjust the velocity of a body as seen by the character. Can be adjusted to e.g. implement a conveyor belt or an inertial dampener system of a sci-fi space ship.
/// Note that inBody2 is locked during the callback so you can read its properties freely.
/// ```
public abstract class OnAdjustBodyVelocityFunction {

    private static final Map<Long, WeakReference<OnAdjustBodyVelocityFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(OnAdjustBodyVelocityFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public OnAdjustBodyVelocityFunction() {
        this(Arena.ofAuto());
    }

    public OnAdjustBodyVelocityFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inCharacter,
        MemorySegment inBody2,
        MemorySegment ioLinearVelocity,
        MemorySegment ioAngularVelocity
    ) {
        invoke(
            new CharacterVirtual(inCharacter),
            new Body(inBody2),
            new Vec3(ioLinearVelocity),
            new Vec3(ioAngularVelocity)
        );
    }

    public void invoke(
        CharacterVirtual inCharacter,
        Body inBody2,
        Vec3 ioLinearVelocity,
        Vec3 ioAngularVelocity
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in OnAdjustBodyVelocityFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable OnAdjustBodyVelocityFunction get(MemorySegment segment) {
        WeakReference<OnAdjustBodyVelocityFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}