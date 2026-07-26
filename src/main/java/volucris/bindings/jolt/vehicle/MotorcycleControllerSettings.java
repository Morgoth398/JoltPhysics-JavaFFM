/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MotorcycleControllerSettings extends WheeledVehicleControllerSettings {

    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_MAX_LEAN_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_MAX_LEAN_ANGLE;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_CONSTANT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_CONSTANT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_DAMPING;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SMOOTHING_FACTOR;
    private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SMOOTHING_FACTOR;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_CREATE = downcallHandle("JPH_MotorcycleControllerSettings_Create", UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_MAX_LEAN_ANGLE = downcallHandle("JPH_MotorcycleControllerSettings_GetMaxLeanAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_MAX_LEAN_ANGLE = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetMaxLeanAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_CONSTANT = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSpringConstant", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_CONSTANT = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSpringConstant", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_DAMPING = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSpringDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_DAMPING = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSpringDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSpringIntegrationCoefficient", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSpringIntegrationCoefficient", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSpringIntegrationCoefficientDecay", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSpringIntegrationCoefficientDecay", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SMOOTHING_FACTOR = downcallHandle("JPH_MotorcycleControllerSettings_GetLeanSmoothingFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SMOOTHING_FACTOR = downcallHandleVoid("JPH_MotorcycleControllerSettings_SetLeanSmoothingFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public MotorcycleControllerSettings() {
    	this(Arena.ofAuto());
    }
    
    /// Typed method of [#create].
    public MotorcycleControllerSettings(Arena arena) {
    	MemorySegment segment = create();
    
    	if (segment.equals(MemorySegment.NULL))
    		throw new NullPointerException("Created segment is NULL.");
    
    	this.segment = segment.reinterpret(arena, s -> destroy(s));
    	super(segment);
    }
    
    public MotorcycleControllerSettings(MemorySegment segment) {
    	this.segment = segment;
    	super(segment);
    }

    
    public static MemorySegment create() {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment)  method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    
    public static float getMaxLeanAngle(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_MAX_LEAN_ANGLE.get();
    	try {
    		return (float)  method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxLeanAngle].
    public final float getMaxLeanAngle() {
    	return (float) getMaxLeanAngle(
    		this.segment
    	);
    }
    
    
    public static void setMaxLeanAngle(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_MAX_LEAN_ANGLE.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxLeanAngle].
    public final void setMaxLeanAngle(
    	float value
    ) {
    	setMaxLeanAngle(
    		this.segment,
    		value
    	);
    }
    
    
    public static float getLeanSpringConstant(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_CONSTANT.get();
    	try {
    		return (float)  method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSpringConstant].
    public final float getLeanSpringConstant() {
    	return (float) getLeanSpringConstant(
    		this.segment
    	);
    }
    
    
    public static void setLeanSpringConstant(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_CONSTANT.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringConstant].
    public final void setLeanSpringConstant(
    	float value
    ) {
    	setLeanSpringConstant(
    		this.segment,
    		value
    	);
    }
    
    
    public static float getLeanSpringDamping(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_DAMPING.get();
    	try {
    		return (float)  method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSpringDamping].
    public final float getLeanSpringDamping() {
    	return (float) getLeanSpringDamping(
    		this.segment
    	);
    }
    
    
    public static void setLeanSpringDamping(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_DAMPING.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringDamping].
    public final void setLeanSpringDamping(
    	float value
    ) {
    	setLeanSpringDamping(
    		this.segment,
    		value
    	);
    }
    
    
    public static float getLeanSpringIntegrationCoefficient(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT.get();
    	try {
    		return (float)  method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSpringIntegrationCoefficient].
    public final float getLeanSpringIntegrationCoefficient() {
    	return (float) getLeanSpringIntegrationCoefficient(
    		this.segment
    	);
    }
    
    
    public static void setLeanSpringIntegrationCoefficient(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringIntegrationCoefficient].
    public final void setLeanSpringIntegrationCoefficient(
    	float value
    ) {
    	setLeanSpringIntegrationCoefficient(
    		this.segment,
    		value
    	);
    }
    
    
    public static float getLeanSpringIntegrationCoefficientDecay(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY.get();
    	try {
    		return (float)  method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSpringIntegrationCoefficientDecay].
    public final float getLeanSpringIntegrationCoefficientDecay() {
    	return (float) getLeanSpringIntegrationCoefficientDecay(
    		this.segment
    	);
    }
    
    
    public static void setLeanSpringIntegrationCoefficientDecay(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringIntegrationCoefficientDecay].
    public final void setLeanSpringIntegrationCoefficientDecay(
    	float value
    ) {
    	setLeanSpringIntegrationCoefficientDecay(
    		this.segment,
    		value
    	);
    }
    
    
    public static float getLeanSmoothingFactor(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SMOOTHING_FACTOR.get();
    	try {
    		return (float)  method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSmoothingFactor].
    public final float getLeanSmoothingFactor() {
    	return (float) getLeanSmoothingFactor(
    		this.segment
    	);
    }
    
    
    public static void setLeanSmoothingFactor(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SMOOTHING_FACTOR.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSmoothingFactor].
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