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
public final class VehicleEngine {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_CLAMP_RPM;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_GET_CURRENT_RPM;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SET_CURRENT_RPM;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_GET_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_APPLY_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_APPLY_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_ALLOW_SLEEP;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_ENGINE_CLAMP_RPM = downcallHandleVoid("JPH_VehicleEngine_ClampRPM", UNBOUNDED_ADDRESS);
        JPH_VEHICLE_ENGINE_GET_CURRENT_RPM = downcallHandle("JPH_VehicleEngine_GetCurrentRPM", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_ENGINE_SET_CURRENT_RPM = downcallHandleVoid("JPH_VehicleEngine_SetCurrentRPM", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY = downcallHandle("JPH_VehicleEngine_GetAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_ENGINE_GET_TORQUE = downcallHandle("JPH_VehicleEngine_GetTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_ENGINE_APPLY_TORQUE = downcallHandleVoid("JPH_VehicleEngine_ApplyTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        JPH_VEHICLE_ENGINE_APPLY_DAMPING = downcallHandleVoid("JPH_VehicleEngine_ApplyDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_ENGINE_ALLOW_SLEEP = downcallHandle("JPH_VehicleEngine_AllowSleep", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public VehicleEngine(MemorySegment segment) {
        this.segment = segment;
    }

    public static void clampRPM(
        MemorySegment engine
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_CLAMP_RPM.get();
        try {
            method.invokeExact(
                engine
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #clampRPM}.
     */
    public final void clampRPM(
    ) {
        clampRPM(
            this.segment
        );
    }
    
    public static float getCurrentRPM(
        MemorySegment engine
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_GET_CURRENT_RPM.get();
        try {
            return (float) method.invokeExact(
                engine
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getCurrentRPM}.
     */
    public final float getCurrentRPM(
    ) {
        return (float) getCurrentRPM(
            this.segment
        );
    }
    
    public static void setCurrentRPM(
        MemorySegment engine, 
        float rpm
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_SET_CURRENT_RPM.get();
        try {
            method.invokeExact(
                engine, 
                rpm
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setCurrentRPM}.
     */
    public final void setCurrentRPM(
        float rpm
    ) {
        setCurrentRPM(
            this.segment, 
            rpm
        );
    }
    
    public static float getAngularVelocity(
        MemorySegment engine
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_GET_ANGULAR_VELOCITY.get();
        try {
            return (float) method.invokeExact(
                engine
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAngularVelocity}.
     */
    public final float getAngularVelocity(
    ) {
        return (float) getAngularVelocity(
            this.segment
        );
    }
    
    public static float getTorque(
        MemorySegment engine, 
        float acceleration
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_GET_TORQUE.get();
        try {
            return (float) method.invokeExact(
                engine, 
                acceleration
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTorque}.
     */
    public final float getTorque(
        float acceleration
    ) {
        return (float) getTorque(
            this.segment, 
            acceleration
        );
    }
    
    public static void applyTorque(
        MemorySegment engine, 
        float torque, 
        float deltaTime
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_APPLY_TORQUE.get();
        try {
            method.invokeExact(
                engine, 
                torque, 
                deltaTime
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #applyTorque}.
     */
    public final void applyTorque(
        float torque, 
        float deltaTime
    ) {
        applyTorque(
            this.segment, 
            torque, 
            deltaTime
        );
    }
    
    public static void applyDamping(
        MemorySegment engine, 
        float deltaTime
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_APPLY_DAMPING.get();
        try {
            method.invokeExact(
                engine, 
                deltaTime
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #applyDamping}.
     */
    public final void applyDamping(
        float deltaTime
    ) {
        applyDamping(
            this.segment, 
            deltaTime
        );
    }
    
    public static boolean allowSleep(
        MemorySegment engine
    ) {
        MethodHandle method = JPH_VEHICLE_ENGINE_ALLOW_SLEEP.get();
        try {
            return (boolean) method.invokeExact(
                engine
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #allowSleep}.
     */
    public final boolean allowSleep(
    ) {
        return (boolean) allowSleep(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}