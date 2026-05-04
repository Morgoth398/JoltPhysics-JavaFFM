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
public final class VehicleCollisionTesterCastSphere extends VehicleCollisionTester {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_CREATE = downcallHandle("JPH_VehicleCollisionTesterCastSphere_Create", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public VehicleCollisionTesterCastSphere(
        int layer, 
        float radius, 
        Vec3 up, 
        float maxSlopeAngle
    ) {
        this(
            Arena.ofAuto(),
            layer, 
            radius, 
            up, 
            maxSlopeAngle
        );
    }
    
    public VehicleCollisionTesterCastSphere(
        Arena arena,
        int layer, 
        float radius, 
        Vec3 up, 
        float maxSlopeAngle
    ) {
         MemorySegment segment = create(
            layer, 
            radius, 
            up.memorySegment(), 
            maxSlopeAngle
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public VehicleCollisionTesterCastSphere(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        int layer, 
        float radius, 
        MemorySegment up, 
        float maxSlopeAngle
    ) {
        MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                layer, 
                radius, 
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