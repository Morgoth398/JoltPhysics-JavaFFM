/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

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
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.constraints.VehicleConstraint;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physics.PhysicsSystem;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Do a collision test with the world
/// @param inPhysicsSystem The physics system that should be tested against
/// @param inVehicleConstraint The vehicle constraint
/// @param inWheelIndex Index of the wheel that we're testing collision for
/// @param inOrigin Origin for the test, corresponds to the world space position for the suspension attachment point
/// @param inDirection Direction for the test (unit vector, world space)
/// @param inVehicleBodyID This body should be filtered out during collision detection to avoid self collisions
/// @param outBody Body that the wheel collided with
/// @param outSubShapeID Sub shape ID that the wheel collided with
/// @param outContactPosition Contact point between wheel and floor, in world space
/// @param outContactNormal Contact normal between wheel and floor, pointing away from the floor
/// @param outSuspensionLength New length of the suspension [0, inSuspensionMaxLength]
/// @return True when collision found, false if not
/// ```
public abstract class CollideFunction {

    private static final Map<Long, WeakReference<CollideFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
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
            HANDLE = MethodHandles.lookup().findVirtual(CollideFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CollideFunction() {
        this(Arena.ofAuto());
    }

    public CollideFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment inPhysicsSystem,
        MemorySegment inVehicleConstraint,
        int inWheelIndex,
        MemorySegment inOrigin,
        MemorySegment inDirection,
        MemorySegment inVehicleBodyID,
        MemorySegment outBody,
        MemorySegment outSubShapeID,
        MemorySegment outContactPosition,
        MemorySegment outContactNormal,
        MemorySegment outSuspensionLength
    ) {
        return invoke(
            new PhysicsSystem(inPhysicsSystem),
            new VehicleConstraint(inVehicleConstraint),
            inWheelIndex,
            new Vec3(inOrigin),
            new Vec3(inDirection),
            new BodyID(inVehicleBodyID),
            new NativePointerArray(outBody),
            new SubShapeID(outSubShapeID),
            new Vec3(outContactPosition),
            new Vec3(outContactNormal),
            new NativeFloatArray(outSuspensionLength)
        );
    }

    public boolean invoke(
        PhysicsSystem inPhysicsSystem,
        VehicleConstraint inVehicleConstraint,
        int inWheelIndex,
        Vec3 inOrigin,
        Vec3 inDirection,
        BodyID inVehicleBodyID,
        NativePointerArray outBody,
        SubShapeID outSubShapeID,
        Vec3 outContactPosition,
        Vec3 outContactNormal,
        NativeFloatArray outSuspensionLength
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CollideFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CollideFunction get(MemorySegment segment) {
        WeakReference<CollideFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}