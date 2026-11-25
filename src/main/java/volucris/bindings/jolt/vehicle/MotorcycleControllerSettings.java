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
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SETTINGS_AS_WHEELED_VEHICLE_CONTROLLER_SETTINGS;
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
		JPH_MOTORCYCLE_CONTROLLER_SETTINGS_AS_WHEELED_VEHICLE_CONTROLLER_SETTINGS = downcallHandle("JPH_MotorcycleControllerSettings_AsWheeledVehicleControllerSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
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
	
		super(asWheeledVehicleControllerSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MotorcycleControllerSettings(MemorySegment segment) {
		this.segment = segment;
		super(asWheeledVehicleControllerSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asWheeledVehicleControllerSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_AS_WHEELED_VEHICLE_CONTROLLER_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// How far we're willing to make the bike lean over in turns (in radians)
    /// ```
    public static float getMaxLeanAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_MAX_LEAN_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxLeanAngle].
    public final float getMaxLeanAngle() {
    	return getMaxLeanAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// How far we're willing to make the bike lean over in turns (in radians)
    /// ```
    public static void setMaxLeanAngle(
    	MemorySegment self,
    	float mMaxLeanAngle
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_MAX_LEAN_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxLeanAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxLeanAngle].
    public final void setMaxLeanAngle(
    	float mMaxLeanAngle
    ) {
    	setMaxLeanAngle(
    		this.segment,
    		mMaxLeanAngle
    	);
    }
    
    /// ```
    /// Spring constant for the lean spring
    /// ```
    public static float getLeanSpringConstant(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_CONSTANT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSpringConstant].
    public final float getLeanSpringConstant() {
    	return getLeanSpringConstant(
    		this.segment
    	);
    }
    
    /// ```
    /// Spring constant for the lean spring
    /// ```
    public static void setLeanSpringConstant(
    	MemorySegment self,
    	float mLeanSpringConstant
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_CONSTANT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLeanSpringConstant
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringConstant].
    public final void setLeanSpringConstant(
    	float mLeanSpringConstant
    ) {
    	setLeanSpringConstant(
    		this.segment,
    		mLeanSpringConstant
    	);
    }
    
    /// ```
    /// Spring damping constant for the lean spring
    /// ```
    public static float getLeanSpringDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSpringDamping].
    public final float getLeanSpringDamping() {
    	return getLeanSpringDamping(
    		this.segment
    	);
    }
    
    /// ```
    /// Spring damping constant for the lean spring
    /// ```
    public static void setLeanSpringDamping(
    	MemorySegment self,
    	float mLeanSpringDamping
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLeanSpringDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringDamping].
    public final void setLeanSpringDamping(
    	float mLeanSpringDamping
    ) {
    	setLeanSpringDamping(
    		this.segment,
    		mLeanSpringDamping
    	);
    }
    
    /// ```
    /// The lean spring applies an additional force equal to this coefficient * Integral(delta angle, 0, t), this effectively makes the lean spring a PID controller
    /// ```
    public static float getLeanSpringIntegrationCoefficient(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSpringIntegrationCoefficient].
    public final float getLeanSpringIntegrationCoefficient() {
    	return getLeanSpringIntegrationCoefficient(
    		this.segment
    	);
    }
    
    /// ```
    /// The lean spring applies an additional force equal to this coefficient * Integral(delta angle, 0, t), this effectively makes the lean spring a PID controller
    /// ```
    public static void setLeanSpringIntegrationCoefficient(
    	MemorySegment self,
    	float mLeanSpringIntegrationCoefficient
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLeanSpringIntegrationCoefficient
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringIntegrationCoefficient].
    public final void setLeanSpringIntegrationCoefficient(
    	float mLeanSpringIntegrationCoefficient
    ) {
    	setLeanSpringIntegrationCoefficient(
    		this.segment,
    		mLeanSpringIntegrationCoefficient
    	);
    }
    
    /// ```
    /// How much to decay the angle integral when the wheels are not touching the floor: new_value = e^(-decay * t) * initial_value
    /// ```
    public static float getLeanSpringIntegrationCoefficientDecay(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSpringIntegrationCoefficientDecay].
    public final float getLeanSpringIntegrationCoefficientDecay() {
    	return getLeanSpringIntegrationCoefficientDecay(
    		this.segment
    	);
    }
    
    /// ```
    /// How much to decay the angle integral when the wheels are not touching the floor: new_value = e^(-decay * t) * initial_value
    /// ```
    public static void setLeanSpringIntegrationCoefficientDecay(
    	MemorySegment self,
    	float mLeanSpringIntegrationCoefficientDecay
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLeanSpringIntegrationCoefficientDecay
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringIntegrationCoefficientDecay].
    public final void setLeanSpringIntegrationCoefficientDecay(
    	float mLeanSpringIntegrationCoefficientDecay
    ) {
    	setLeanSpringIntegrationCoefficientDecay(
    		this.segment,
    		mLeanSpringIntegrationCoefficientDecay
    	);
    }
    
    /// ```
    /// How much to smooth the lean angle (0 = no smoothing, 1 = lean angle never changes)
    /// Note that this is frame rate dependent because the formula is: smoothing_factor * previous + (1 - smoothing_factor) * current
    /// ```
    public static float getLeanSmoothingFactor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_GET_LEAN_SMOOTHING_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLeanSmoothingFactor].
    public final float getLeanSmoothingFactor() {
    	return getLeanSmoothingFactor(
    		this.segment
    	);
    }
    
    /// ```
    /// How much to smooth the lean angle (0 = no smoothing, 1 = lean angle never changes)
    /// Note that this is frame rate dependent because the formula is: smoothing_factor * previous + (1 - smoothing_factor) * current
    /// ```
    public static void setLeanSmoothingFactor(
    	MemorySegment self,
    	float mLeanSmoothingFactor
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SETTINGS_SET_LEAN_SMOOTHING_FACTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLeanSmoothingFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSmoothingFactor].
    public final void setLeanSmoothingFactor(
    	float mLeanSmoothingFactor
    ) {
    	setLeanSmoothingFactor(
    		this.segment,
    		mLeanSmoothingFactor
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}