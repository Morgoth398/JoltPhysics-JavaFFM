/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class VehicleCollisionTesterCastCylinder extends VehicleCollisionTester {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE = downcallHandle("JPH_VehicleCollisionTesterCastCylinder_Create", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        //@formatter:on
    }

    public VehicleCollisionTesterCastCylinder(
        int layer, 
        float convexRadiusFraction
    ) {
        this(
            Arena.ofAuto(),
            layer, 
            convexRadiusFraction
        );
    }
    
    public VehicleCollisionTesterCastCylinder(
        Arena arena,
        int layer, 
        float convexRadiusFraction
    ) {
         MemorySegment segment = create(
            layer, 
            convexRadiusFraction
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public VehicleCollisionTesterCastCylinder(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        int layer, 
        float convexRadiusFraction
    ) {
        MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                layer, 
                convexRadiusFraction
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}