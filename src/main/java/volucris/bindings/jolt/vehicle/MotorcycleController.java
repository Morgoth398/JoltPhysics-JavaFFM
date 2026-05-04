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
public final class MotorcycleController extends WheeledVehicleController {

    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE = downcallHandle("JPH_MotorcycleController_GetWheelBase", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED = downcallHandle("JPH_MotorcycleController_IsLeanControllerEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER = downcallHandleVoid("JPH_MotorcycleController_EnableLeanController", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED = downcallHandle("JPH_MotorcycleController_IsLeanSteeringLimitEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT = downcallHandleVoid("JPH_MotorcycleController_EnableLeanSteeringLimit", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
        JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT = downcallHandle("JPH_MotorcycleController_GetLeanSpringConstant", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringConstant", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING = downcallHandle("JPH_MotorcycleController_GetLeanSpringDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandle("JPH_MotorcycleController_GetLeanSpringIntegrationCoefficient", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringIntegrationCoefficient", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandle("JPH_MotorcycleController_GetLeanSpringIntegrationCoefficientDecay", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringIntegrationCoefficientDecay", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR = downcallHandle("JPH_MotorcycleController_GetLeanSmoothingFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR = downcallHandleVoid("JPH_MotorcycleController_SetLeanSmoothingFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public MotorcycleController(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static float getWheelBase(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getWheelBase}.
     */
    public final float getWheelBase(
    ) {
        return (float) getWheelBase(
            this.segment
        );
    }
    
    public static boolean isLeanControllerEnabled(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED.get();
        try {
            return (boolean) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isLeanControllerEnabled}.
     */
    public final boolean isLeanControllerEnabled(
    ) {
        return (boolean) isLeanControllerEnabled(
            this.segment
        );
    }
    
    public static void enableLeanController(
        MemorySegment controller, 
        boolean value
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER.get();
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
     * Typed method of {@link #enableLeanController}.
     */
    public final void enableLeanController(
        boolean value
    ) {
        enableLeanController(
            this.segment, 
            value
        );
    }
    
    public static boolean isLeanSteeringLimitEnabled(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED.get();
        try {
            return (boolean) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #isLeanSteeringLimitEnabled}.
     */
    public final boolean isLeanSteeringLimitEnabled(
    ) {
        return (boolean) isLeanSteeringLimitEnabled(
            this.segment
        );
    }
    
    public static void enableLeanSteeringLimit(
        MemorySegment controller, 
        boolean value
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT.get();
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
     * Typed method of {@link #enableLeanSteeringLimit}.
     */
    public final void enableLeanSteeringLimit(
        boolean value
    ) {
        enableLeanSteeringLimit(
            this.segment, 
            value
        );
    }
    
    public static float getLeanSpringConstant(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLeanSpringConstant}.
     */
    public final float getLeanSpringConstant(
    ) {
        return (float) getLeanSpringConstant(
            this.segment
        );
    }
    
    public static void setLeanSpringConstant(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT.get();
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
     * Typed method of {@link #setLeanSpringConstant}.
     */
    public final void setLeanSpringConstant(
        float value
    ) {
        setLeanSpringConstant(
            this.segment, 
            value
        );
    }
    
    public static float getLeanSpringDamping(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLeanSpringDamping}.
     */
    public final float getLeanSpringDamping(
    ) {
        return (float) getLeanSpringDamping(
            this.segment
        );
    }
    
    public static void setLeanSpringDamping(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING.get();
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
     * Typed method of {@link #setLeanSpringDamping}.
     */
    public final void setLeanSpringDamping(
        float value
    ) {
        setLeanSpringDamping(
            this.segment, 
            value
        );
    }
    
    public static float getLeanSpringIntegrationCoefficient(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLeanSpringIntegrationCoefficient}.
     */
    public final float getLeanSpringIntegrationCoefficient(
    ) {
        return (float) getLeanSpringIntegrationCoefficient(
            this.segment
        );
    }
    
    public static void setLeanSpringIntegrationCoefficient(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT.get();
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
     * Typed method of {@link #setLeanSpringIntegrationCoefficient}.
     */
    public final void setLeanSpringIntegrationCoefficient(
        float value
    ) {
        setLeanSpringIntegrationCoefficient(
            this.segment, 
            value
        );
    }
    
    public static float getLeanSpringIntegrationCoefficientDecay(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLeanSpringIntegrationCoefficientDecay}.
     */
    public final float getLeanSpringIntegrationCoefficientDecay(
    ) {
        return (float) getLeanSpringIntegrationCoefficientDecay(
            this.segment
        );
    }
    
    public static void setLeanSpringIntegrationCoefficientDecay(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY.get();
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
     * Typed method of {@link #setLeanSpringIntegrationCoefficientDecay}.
     */
    public final void setLeanSpringIntegrationCoefficientDecay(
        float value
    ) {
        setLeanSpringIntegrationCoefficientDecay(
            this.segment, 
            value
        );
    }
    
    public static float getLeanSmoothingFactor(
        MemorySegment controller
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR.get();
        try {
            return (float) method.invokeExact(
                controller
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLeanSmoothingFactor}.
     */
    public final float getLeanSmoothingFactor(
    ) {
        return (float) getLeanSmoothingFactor(
            this.segment
        );
    }
    
    public static void setLeanSmoothingFactor(
        MemorySegment controller, 
        float value
    ) {
        MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR.get();
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
     * Typed method of {@link #setLeanSmoothingFactor}.
     */
    public final void setLeanSmoothingFactor(
        float value
    ) {
        setLeanSmoothingFactor(
            this.segment, 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}