/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class TrackedVehicleController extends VehicleController {

    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRACK;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRACK = downcallHandle("JPH_TrackedVehicleController_GetTrack", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetDriverInput", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT = downcallHandle("JPH_TrackedVehicleController_GetForwardInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetForwardInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO = downcallHandle("JPH_TrackedVehicleController_GetLeftRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO = downcallHandleVoid("JPH_TrackedVehicleController_SetLeftRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO = downcallHandle("JPH_TrackedVehicleController_GetRightRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO = downcallHandleVoid("JPH_TrackedVehicleController_SetRightRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT = downcallHandle("JPH_TrackedVehicleController_GetBrakeInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT = downcallHandleVoid("JPH_TrackedVehicleController_SetBrakeInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE = downcallHandle("JPH_TrackedVehicleController_GetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION = downcallHandle("JPH_TrackedVehicleController_GetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TrackedVehicleController(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment getTrack(
        MemorySegment controller, 
        int side
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRACK.get();
        try {
            return (MemorySegment) method.invokeExact(
                controller, 
                side
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTrack}.
     */
    public final @Nullable VehicleTrack getTrack(
        int side
    ) {
        MemorySegment segment = getTrack(
            this.segment, 
            side
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new VehicleTrack(segment);
    }
    
    public static void setDriverInput(
        MemorySegment controller, 
        float forward, 
        float leftRatio, 
        float rightRatio, 
        float brake
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT.get();
        try {
            method.invokeExact(
                controller, 
                forward, 
                leftRatio, 
                rightRatio, 
                brake
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setDriverInput}.
     */
    public final void setDriverInput(
        float forward, 
        float leftRatio, 
        float rightRatio, 
        float brake
    ) {
        setDriverInput(
            this.segment, 
            forward, 
            leftRatio, 
            rightRatio, 
            brake
        );
    }
    
    public static float getForwardInput(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getForwardInput}.
     */
    public final float getForwardInput(
    ) {
        return (float) getForwardInput(
            this.segment
        );
    }
    
    public static void setForwardInput(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT.get();
        try {
            method.invokeExact(
                controller, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setForwardInput}.
     */
    public final void setForwardInput(
        float value
    ) {
        setForwardInput(
            this.segment, 
            value
        );
    }
    
    public static float getLeftRatio(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_LEFT_RATIO.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLeftRatio}.
     */
    public final float getLeftRatio(
    ) {
        return (float) getLeftRatio(
            this.segment
        );
    }
    
    public static void setLeftRatio(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_LEFT_RATIO.get();
        try {
            method.invokeExact(
                controller, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setLeftRatio}.
     */
    public final void setLeftRatio(
        float value
    ) {
        setLeftRatio(
            this.segment, 
            value
        );
    }
    
    public static float getRightRatio(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_RIGHT_RATIO.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRightRatio}.
     */
    public final float getRightRatio(
    ) {
        return (float) getRightRatio(
            this.segment
        );
    }
    
    public static void setRightRatio(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_RIGHT_RATIO.get();
        try {
            method.invokeExact(
                controller, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRightRatio}.
     */
    public final void setRightRatio(
        float value
    ) {
        setRightRatio(
            this.segment, 
            value
        );
    }
    
    public static float getBrakeInput(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBrakeInput}.
     */
    public final float getBrakeInput(
    ) {
        return (float) getBrakeInput(
            this.segment
        );
    }
    
    public static void setBrakeInput(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT.get();
        try {
            method.invokeExact(
                controller, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setBrakeInput}.
     */
    public final void setBrakeInput(
        float value
    ) {
        setBrakeInput(
            this.segment, 
            value
        );
    }
    
    public static MemorySegment getEngine(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_ENGINE.get();
        try {
            return (MemorySegment) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getEngine}.
     */
    public final @Nullable VehicleEngine getEngine(
    ) {
        MemorySegment segment = getEngine(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new VehicleEngine(segment);
    }
    
    public static MemorySegment getTransmission(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_GET_TRANSMISSION.get();
        try {
            return (MemorySegment) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTransmission}.
     */
    public final @Nullable VehicleTransmission getTransmission(
    ) {
        MemorySegment segment = getTransmission(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new VehicleTransmission(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}