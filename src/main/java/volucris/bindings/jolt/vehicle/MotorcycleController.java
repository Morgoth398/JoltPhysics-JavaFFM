/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.constraints.VehicleConstraint;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MotorcycleController extends WheeledVehicleController {

	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_AS_WHEELED_VEHICLE_CONTROLLER;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_MOTORCYCLE_CONTROLLER_CREATE = downcallHandle("JPH_MotorcycleController_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_AS_WHEELED_VEHICLE_CONTROLLER = downcallHandle("JPH_MotorcycleController_AsWheeledVehicleController", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE = downcallHandle("JPH_MotorcycleController_GetWheelBase", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER = downcallHandleVoid("JPH_MotorcycleController_EnableLeanController", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED = downcallHandle("JPH_MotorcycleController_IsLeanControllerEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT = downcallHandleVoid("JPH_MotorcycleController_EnableLeanSteeringLimit", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED = downcallHandle("JPH_MotorcycleController_IsLeanSteeringLimitEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringConstant", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT = downcallHandle("JPH_MotorcycleController_GetLeanSpringConstant", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING = downcallHandle("JPH_MotorcycleController_GetLeanSpringDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringIntegrationCoefficient", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT = downcallHandle("JPH_MotorcycleController_GetLeanSpringIntegrationCoefficient", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandleVoid("JPH_MotorcycleController_SetLeanSpringIntegrationCoefficientDecay", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY = downcallHandle("JPH_MotorcycleController_GetLeanSpringIntegrationCoefficientDecay", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR = downcallHandleVoid("JPH_MotorcycleController_SetLeanSmoothingFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR = downcallHandle("JPH_MotorcycleController_GetLeanSmoothingFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public MotorcycleController(
	    MotorcycleControllerSettings inSettings,
	    VehicleConstraint inConstraint
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inConstraint
	    );
	}
	
	/// Typed method of [#create].
	public MotorcycleController(
		Arena arena,
		MotorcycleControllerSettings inSettings,
		VehicleConstraint inConstraint
	) {
		MemorySegment segment = create(
			inSettings.memorySegment(),
			inConstraint.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asWheeledVehicleController(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public MotorcycleController(MemorySegment segment) {
		this.segment = segment;
		super(asWheeledVehicleController(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inSettings,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asWheeledVehicleController(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_AS_WHEELED_VEHICLE_CONTROLLER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the distance between the front and back wheels
    /// ```
    public static float getWheelBase(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_WHEEL_BASE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelBase].
    public final float getWheelBase() {
    	return getWheelBase(
    		this.segment
    	);
    }
    
    /// ```
    /// Enable or disable the lean spring. This allows you to temporarily disable the lean spring to allow the motorcycle to fall over.
    /// ```
    public static void enableLeanController(
    	MemorySegment self,
    	boolean inEnable
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_CONTROLLER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inEnable
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableLeanController].
    public final void enableLeanController(
    	boolean inEnable
    ) {
    	enableLeanController(
    		this.segment,
    		inEnable
    	);
    }
    
    /// ```
    /// Check if the lean spring is enabled.
    /// ```
    public static boolean isLeanControllerEnabled(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_CONTROLLER_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isLeanControllerEnabled].
    public final boolean isLeanControllerEnabled() {
    	return isLeanControllerEnabled(
    		this.segment
    	);
    }
    
    /// ```
    /// Enable or disable the lean steering limit. When enabled (default) the steering angle is limited based on the vehicle speed to prevent steering that would cause an inertial force that causes the motorcycle to topple over.
    /// ```
    public static void enableLeanSteeringLimit(
    	MemorySegment self,
    	boolean inEnable
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_ENABLE_LEAN_STEERING_LIMIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inEnable
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#enableLeanSteeringLimit].
    public final void enableLeanSteeringLimit(
    	boolean inEnable
    ) {
    	enableLeanSteeringLimit(
    		this.segment,
    		inEnable
    	);
    }
    
    public static boolean isLeanSteeringLimitEnabled(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_IS_LEAN_STEERING_LIMIT_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isLeanSteeringLimitEnabled].
    public final boolean isLeanSteeringLimitEnabled() {
    	return isLeanSteeringLimitEnabled(
    		this.segment
    	);
    }
    
    /// ```
    /// Spring constant for the lean spring
    /// ```
    public static void setLeanSpringConstant(
    	MemorySegment self,
    	float inConstant
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_CONSTANT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstant
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringConstant].
    public final void setLeanSpringConstant(
    	float inConstant
    ) {
    	setLeanSpringConstant(
    		this.segment,
    		inConstant
    	);
    }
    
    public static float getLeanSpringConstant(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_CONSTANT.get();
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
    /// Spring damping constant for the lean spring
    /// ```
    public static void setLeanSpringDamping(
    	MemorySegment self,
    	float inDamping
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringDamping].
    public final void setLeanSpringDamping(
    	float inDamping
    ) {
    	setLeanSpringDamping(
    		this.segment,
    		inDamping
    	);
    }
    
    public static float getLeanSpringDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_DAMPING.get();
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
    /// The lean spring applies an additional force equal to this coefficient * Integral(delta angle, 0, t), this effectively makes the lean spring a PID controller
    /// ```
    public static void setLeanSpringIntegrationCoefficient(
    	MemorySegment self,
    	float inCoefficient
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCoefficient
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringIntegrationCoefficient].
    public final void setLeanSpringIntegrationCoefficient(
    	float inCoefficient
    ) {
    	setLeanSpringIntegrationCoefficient(
    		this.segment,
    		inCoefficient
    	);
    }
    
    public static float getLeanSpringIntegrationCoefficient(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT.get();
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
    /// How much to decay the angle integral when the wheels are not touching the floor: new_value = e^(-decay * t) * initial_value
    /// ```
    public static void setLeanSpringIntegrationCoefficientDecay(
    	MemorySegment self,
    	float inDecay
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDecay
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSpringIntegrationCoefficientDecay].
    public final void setLeanSpringIntegrationCoefficientDecay(
    	float inDecay
    ) {
    	setLeanSpringIntegrationCoefficientDecay(
    		this.segment,
    		inDecay
    	);
    }
    
    public static float getLeanSpringIntegrationCoefficientDecay(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SPRING_INTEGRATION_COEFFICIENT_DECAY.get();
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
    /// How much to smooth the lean angle (0 = no smoothing, 1 = lean angle never changes)
    /// Note that this is frame rate dependent because the formula is: smoothing_factor * previous + (1 - smoothing_factor) * current
    /// ```
    public static void setLeanSmoothingFactor(
    	MemorySegment self,
    	float inFactor
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_SET_LEAN_SMOOTHING_FACTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLeanSmoothingFactor].
    public final void setLeanSmoothingFactor(
    	float inFactor
    ) {
    	setLeanSmoothingFactor(
    		this.segment,
    		inFactor
    	);
    }
    
    public static float getLeanSmoothingFactor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTORCYCLE_CONTROLLER_GET_LEAN_SMOOTHING_FACTOR.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}