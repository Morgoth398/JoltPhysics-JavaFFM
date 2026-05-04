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
public final class VehicleTransmission {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SET_MODE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SET;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_UPDATE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_TRANSMISSION_SET_MODE = downcallHandleVoid("JPH_VehicleTransmission_SetMode", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_VEHICLE_TRANSMISSION_SET = downcallHandleVoid("JPH_VehicleTransmission_Set", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_VEHICLE_TRANSMISSION_UPDATE = downcallHandleVoid("JPH_VehicleTransmission_Update", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_BOOLEAN);
        JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR = downcallHandle("JPH_VehicleTransmission_GetCurrentGear", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION = downcallHandle("JPH_VehicleTransmission_GetClutchFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR = downcallHandle("JPH_VehicleTransmission_IsSwitchingGear", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO = downcallHandle("JPH_VehicleTransmission_GetCurrentRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP = downcallHandle("JPH_VehicleTransmission_AllowSleep", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public VehicleTransmission(MemorySegment segment) {
        this.segment = segment;
    }

    public static void setMode(
        MemorySegment transmission, 
        int mode
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SET_MODE.get();
        try {
            method.invokeExact(
                transmission, 
                mode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setMode}.
     */
    public final void setMode(
        VehicleTransmission transmission, 
        int mode
    ) {
        setMode(
            transmission.memorySegment(), 
            mode
        );
    }
    
    public static void set(
        MemorySegment transmission, 
        int currentGear, 
        float clutchFriction
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SET.get();
        try {
            method.invokeExact(
                transmission, 
                currentGear, 
                clutchFriction
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #set}.
     */
    public final void set(
        VehicleTransmission transmission, 
        int currentGear, 
        float clutchFriction
    ) {
        set(
            transmission.memorySegment(), 
            currentGear, 
            clutchFriction
        );
    }
    
    public static void update(
        MemorySegment transmission, 
        float deltaTime, 
        float currentRPM, 
        float forwardInput, 
        boolean canShiftUp
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_UPDATE.get();
        try {
            method.invokeExact(
                transmission, 
                deltaTime, 
                currentRPM, 
                forwardInput, 
                canShiftUp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #update}.
     */
    public final void update(
        VehicleTransmission transmission, 
        float deltaTime, 
        float currentRPM, 
        float forwardInput, 
        boolean canShiftUp
    ) {
        update(
            transmission.memorySegment(), 
            deltaTime, 
            currentRPM, 
            forwardInput, 
            canShiftUp
        );
    }
    
    public static int getCurrentGear(
        MemorySegment transmission
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CURRENT_GEAR.get();
        try {
            return (int) method.invokeExact(
                transmission
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCurrentGear}.
     */
    public final int getCurrentGear(
        VehicleTransmission transmission
    ) {
        return (int) getCurrentGear(
            transmission.memorySegment()
        );
    }
    
    public static float getClutchFriction(
        MemorySegment transmission
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CLUTCH_FRICTION.get();
        try {
            return (float) method.invokeExact(
                transmission
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getClutchFriction}.
     */
    public final float getClutchFriction(
        VehicleTransmission transmission
    ) {
        return (float) getClutchFriction(
            transmission.memorySegment()
        );
    }
    
    public static boolean isSwitchingGear(
        MemorySegment transmission
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_IS_SWITCHING_GEAR.get();
        try {
            return (boolean) method.invokeExact(
                transmission
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isSwitchingGear}.
     */
    public final boolean isSwitchingGear(
        VehicleTransmission transmission
    ) {
        return (boolean) isSwitchingGear(
            transmission.memorySegment()
        );
    }
    
    public static float getCurrentRatio(
        MemorySegment transmission
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_GET_CURRENT_RATIO.get();
        try {
            return (float) method.invokeExact(
                transmission
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCurrentRatio}.
     */
    public final float getCurrentRatio(
        VehicleTransmission transmission
    ) {
        return (float) getCurrentRatio(
            transmission.memorySegment()
        );
    }
    
    public static boolean allowSleep(
        MemorySegment transmission
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_ALLOW_SLEEP.get();
        try {
            return (boolean) method.invokeExact(
                transmission
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #allowSleep}.
     */
    public final boolean allowSleep(
        VehicleTransmission transmission
    ) {
        return (boolean) allowSleep(
            transmission.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}