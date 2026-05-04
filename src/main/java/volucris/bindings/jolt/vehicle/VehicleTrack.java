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
public final class VehicleTrack {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_GET_DRIVEN_WHEEL;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_GET_INERTIA;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_GET_ANGULAR_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_GET_MAX_BRAKE_TORQUE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_GET_DIFFERENTIAL_RATIO;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY = downcallHandle("JPH_VehicleTrack_GetAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_VehicleTrack_SetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_TRACK_GET_DRIVEN_WHEEL = downcallHandle("JPH_VehicleTrack_GetDrivenWheel", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRACK_GET_INERTIA = downcallHandle("JPH_VehicleTrack_GetInertia", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRACK_GET_ANGULAR_DAMPING = downcallHandle("JPH_VehicleTrack_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRACK_GET_MAX_BRAKE_TORQUE = downcallHandle("JPH_VehicleTrack_GetMaxBrakeTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRACK_GET_DIFFERENTIAL_RATIO = downcallHandle("JPH_VehicleTrack_GetDifferentialRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public VehicleTrack(MemorySegment segment) {
        this.segment = segment;
    }

    public static float getAngularVelocity(
        MemorySegment track
    ) {
        MethodHandle method = JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY.get();
        try {
            return (float) method.invokeExact(
                track
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
    
    public static void setAngularVelocity(
        MemorySegment track, 
        float velocity
    ) {
        MethodHandle method = JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY.get();
        try {
            method.invokeExact(
                track, 
                velocity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setAngularVelocity}.
     */
    public final void setAngularVelocity(
        float velocity
    ) {
        setAngularVelocity(
            this.segment, 
            velocity
        );
    }
    
    public static int getDrivenWheel(
        MemorySegment track
    ) {
        MethodHandle method = JPH_VEHICLE_TRACK_GET_DRIVEN_WHEEL.get();
        try {
            return (int) method.invokeExact(
                track
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDrivenWheel}.
     */
    public final int getDrivenWheel(
    ) {
        return (int) getDrivenWheel(
            this.segment
        );
    }
    
    public static float getInertia(
        MemorySegment track
    ) {
        MethodHandle method = JPH_VEHICLE_TRACK_GET_INERTIA.get();
        try {
            return (float) method.invokeExact(
                track
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInertia}.
     */
    public final float getInertia(
    ) {
        return (float) getInertia(
            this.segment
        );
    }
    
    public static float getAngularDamping(
        MemorySegment track
    ) {
        MethodHandle method = JPH_VEHICLE_TRACK_GET_ANGULAR_DAMPING.get();
        try {
            return (float) method.invokeExact(
                track
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAngularDamping}.
     */
    public final float getAngularDamping(
    ) {
        return (float) getAngularDamping(
            this.segment
        );
    }
    
    public static float getMaxBrakeTorque(
        MemorySegment track
    ) {
        MethodHandle method = JPH_VEHICLE_TRACK_GET_MAX_BRAKE_TORQUE.get();
        try {
            return (float) method.invokeExact(
                track
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxBrakeTorque}.
     */
    public final float getMaxBrakeTorque(
    ) {
        return (float) getMaxBrakeTorque(
            this.segment
        );
    }
    
    public static float getDifferentialRatio(
        MemorySegment track
    ) {
        MethodHandle method = JPH_VEHICLE_TRACK_GET_DIFFERENTIAL_RATIO.get();
        try {
            return (float) method.invokeExact(
                track
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDifferentialRatio}.
     */
    public final float getDifferentialRatio(
    ) {
        return (float) getDifferentialRatio(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}