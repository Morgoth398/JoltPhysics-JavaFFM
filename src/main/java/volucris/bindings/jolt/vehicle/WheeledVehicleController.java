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
public sealed class WheeledVehicleController extends VehicleController
		permits MotorcycleController {

    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SET_TIRE_MAX_IMPULSE_CALLBACK;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetDriverInput", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetForwardInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT = downcallHandle("JPH_WheeledVehicleController_GetForwardInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetRightInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT = downcallHandle("JPH_WheeledVehicleController_GetRightInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetBrakeInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT = downcallHandle("JPH_WheeledVehicleController_GetBrakeInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT = downcallHandleVoid("JPH_WheeledVehicleController_SetHandBrakeInput", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT = downcallHandle("JPH_WheeledVehicleController_GetHandBrakeInput", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH = downcallHandle("JPH_WheeledVehicleController_GetWheelSpeedAtClutch", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SET_TIRE_MAX_IMPULSE_CALLBACK = downcallHandleVoid("JPH_WheeledVehicleController_SetTireMaxImpulseCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE = downcallHandle("JPH_WheeledVehicleController_GetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION = downcallHandle("JPH_WheeledVehicleController_GetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public WheeledVehicleController(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static void setDriverInput(
        MemorySegment controller, 
        float forward, 
        float right, 
        float brake, 
        float handBrake
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_DRIVER_INPUT.get();
        try {
            method.invokeExact(
                controller, 
                forward, 
                right, 
                brake, 
                handBrake
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
        float right, 
        float brake, 
        float handBrake
    ) {
        setDriverInput(
            this.segment, 
            forward, 
            right, 
            brake, 
            handBrake
        );
    }
    
    public static void setForwardInput(
        MemorySegment controller, 
        float forward
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_FORWARD_INPUT.get();
        try {
            method.invokeExact(
                controller, 
                forward
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setForwardInput}.
     */
    public final void setForwardInput(
        float forward
    ) {
        setForwardInput(
            this.segment, 
            forward
        );
    }
    
    public static float getForwardInput(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_FORWARD_INPUT.get();
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
    
    public static void setRightInput(
        MemorySegment controller, 
        float rightRatio
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_RIGHT_INPUT.get();
        try {
            method.invokeExact(
                controller, 
                rightRatio
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setRightInput}.
     */
    public final void setRightInput(
        float rightRatio
    ) {
        setRightInput(
            this.segment, 
            rightRatio
        );
    }
    
    public static float getRightInput(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_RIGHT_INPUT.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRightInput}.
     */
    public final float getRightInput(
    ) {
        return (float) getRightInput(
            this.segment
        );
    }
    
    public static void setBrakeInput(
        MemorySegment controller, 
        float brakeInput
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_BRAKE_INPUT.get();
        try {
            method.invokeExact(
                controller, 
                brakeInput
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setBrakeInput}.
     */
    public final void setBrakeInput(
        float brakeInput
    ) {
        setBrakeInput(
            this.segment, 
            brakeInput
        );
    }
    
    public static float getBrakeInput(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_BRAKE_INPUT.get();
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
    
    public static void setHandBrakeInput(
        MemorySegment controller, 
        float handBrakeInput
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_HAND_BRAKE_INPUT.get();
        try {
            method.invokeExact(
                controller, 
                handBrakeInput
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setHandBrakeInput}.
     */
    public final void setHandBrakeInput(
        float handBrakeInput
    ) {
        setHandBrakeInput(
            this.segment, 
            handBrakeInput
        );
    }
    
    public static float getHandBrakeInput(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_HAND_BRAKE_INPUT.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getHandBrakeInput}.
     */
    public final float getHandBrakeInput(
    ) {
        return (float) getHandBrakeInput(
            this.segment
        );
    }
    
    public static float getWheelSpeedAtClutch(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_WHEEL_SPEED_AT_CLUTCH.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWheelSpeedAtClutch}.
     */
    public final float getWheelSpeedAtClutch(
    ) {
        return (float) getWheelSpeedAtClutch(
            this.segment
        );
    }
    
    public static void setTireMaxImpulseCallback(
        MemorySegment controller, 
        MemorySegment tireMaxImpulseCallback, 
        MemorySegment userData
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SET_TIRE_MAX_IMPULSE_CALLBACK.get();
        try {
            method.invokeExact(
                controller, 
                tireMaxImpulseCallback, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTireMaxImpulseCallback}.
     */
    public final void setTireMaxImpulseCallback(
        TireMaxImpulseCallback tireMaxImpulseCallback, 
        MemorySegment userData
    ) {
        setTireMaxImpulseCallback(
            this.segment, 
            tireMaxImpulseCallback.memorySegment(), 
            userData
        );
    }
    
    public static MemorySegment getEngine(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_ENGINE.get();
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
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_GET_TRANSMISSION.get();
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