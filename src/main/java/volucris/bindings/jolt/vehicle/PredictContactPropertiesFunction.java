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
/// Do a cheap contact properties prediction based on the contact properties from the last collision test (provided as input parameters)
/// @param inPhysicsSystem The physics system that should be tested against
/// @param inVehicleConstraint The vehicle constraint
/// @param inWheelIndex Index of the wheel that we're testing collision for
/// @param inOrigin Origin for the test, corresponds to the world space position for the suspension attachment point
/// @param inDirection Direction for the test (unit vector, world space)
/// @param inVehicleBodyID The body ID for the vehicle itself
/// @param ioBody Body that the wheel previously collided with
/// @param ioSubShapeID Sub shape ID that the wheel collided with during the last check
/// @param ioContactPosition Contact point between wheel and floor during the last check, in world space
/// @param ioContactNormal Contact normal between wheel and floor during the last check, pointing away from the floor
/// @param ioSuspensionLength New length of the suspension [0, inSuspensionMaxLength]
/// ```
public abstract class PredictContactPropertiesFunction {

    private static final Map<Long, WeakReference<PredictContactPropertiesFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
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
            HANDLE = MethodHandles.lookup().findVirtual(PredictContactPropertiesFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public PredictContactPropertiesFunction() {
        this(Arena.ofAuto());
    }

    public PredictContactPropertiesFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inPhysicsSystem,
        MemorySegment inVehicleConstraint,
        int inWheelIndex,
        MemorySegment inOrigin,
        MemorySegment inDirection,
        MemorySegment inVehicleBodyID,
        MemorySegment ioBody,
        MemorySegment ioSubShapeID,
        MemorySegment ioContactPosition,
        MemorySegment ioContactNormal,
        MemorySegment ioSuspensionLength
    ) {
        invoke(
            new PhysicsSystem(inPhysicsSystem),
            new VehicleConstraint(inVehicleConstraint),
            inWheelIndex,
            new Vec3(inOrigin),
            new Vec3(inDirection),
            new BodyID(inVehicleBodyID),
            new NativePointerArray(ioBody),
            new SubShapeID(ioSubShapeID),
            new Vec3(ioContactPosition),
            new Vec3(ioContactNormal),
            new NativeFloatArray(ioSuspensionLength)
        );
    }

    public void invoke(
        PhysicsSystem inPhysicsSystem,
        VehicleConstraint inVehicleConstraint,
        int inWheelIndex,
        Vec3 inOrigin,
        Vec3 inDirection,
        BodyID inVehicleBodyID,
        NativePointerArray ioBody,
        SubShapeID ioSubShapeID,
        Vec3 ioContactPosition,
        Vec3 ioContactNormal,
        NativeFloatArray ioSuspensionLength
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in PredictContactPropertiesFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable PredictContactPropertiesFunction get(MemorySegment segment) {
        WeakReference<PredictContactPropertiesFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}