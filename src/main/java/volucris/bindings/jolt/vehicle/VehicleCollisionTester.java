/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class VehicleCollisionTester
		permits VehicleCollisionTesterRay,
		VehicleCollisionTesterCastCylinder,
		VehicleCollisionTesterCastSphere {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_COLLISION_TESTER_DESTROY = downcallHandleVoid("JPH_VehicleCollisionTester_Destroy", UNBOUNDED_ADDRESS);
        JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER = downcallHandle("JPH_VehicleCollisionTester_GetObjectLayer", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER = downcallHandleVoid("JPH_VehicleCollisionTester_SetObjectLayer", UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public VehicleCollisionTester(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment tester
    ) {
        MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_DESTROY.get();
        try {
            method.invokeExact(
                tester
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getObjectLayer(
        MemorySegment tester
    ) {
        MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER.get();
        try {
            return (int) method.invokeExact(
                tester
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getObjectLayer}.
     */
    public final int getObjectLayer(
        VehicleCollisionTester tester
    ) {
        return (int) getObjectLayer(
            tester.memorySegment()
        );
    }
    
    public static void setObjectLayer(
        MemorySegment tester, 
        int value
    ) {
        MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER.get();
        try {
            method.invokeExact(
                tester, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setObjectLayer}.
     */
    public final void setObjectLayer(
        VehicleCollisionTester tester, 
        int value
    ) {
        setObjectLayer(
            tester.memorySegment(), 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}