/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class VehicleCollisionTesterRay extends VehicleCollisionTester {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE = downcallHandle("JPH_VehicleCollisionTesterRay_Create", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public VehicleCollisionTesterRay(
        int layer, 
        Vec3 up, 
        float maxSlopeAngle
    ) {
        this(
            Arena.ofAuto(),
            layer, 
            up, 
            maxSlopeAngle
        );
    }
    
    public VehicleCollisionTesterRay(
        Arena arena,
        int layer, 
        Vec3 up, 
        float maxSlopeAngle
    ) {
         MemorySegment segment = create(
            layer, 
            up.memorySegment(), 
            maxSlopeAngle
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public VehicleCollisionTesterRay(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        int layer, 
        MemorySegment up, 
        float maxSlopeAngle
    ) {
        MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                layer, 
                up, 
                maxSlopeAngle
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}