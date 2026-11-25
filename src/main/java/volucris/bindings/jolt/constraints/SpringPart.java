/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeFloatArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SpringPart {

	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_BIAS;
	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_STIFFNESS_AND_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_FREQUENCY_AND_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_MASS_NORMALIZED_STIFFNESS_AND_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_SPRING_PART_GET_BIAS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SPRING_PART_CREATE = downcallHandle("JPH_SpringPart_Create", UNBOUNDED_ADDRESS);
		JPH_SPRING_PART_DESTROY = downcallHandleVoid("JPH_SpringPart_Destroy", UNBOUNDED_ADDRESS);
		JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_BIAS = downcallHandleVoid("JPH_SpringPart_CalculateSpringPropertiesWithBias", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_STIFFNESS_AND_DAMPING = downcallHandleVoid("JPH_SpringPart_CalculateSpringPropertiesWithStiffnessAndDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_FREQUENCY_AND_DAMPING = downcallHandleVoid("JPH_SpringPart_CalculateSpringPropertiesWithFrequencyAndDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_MASS_NORMALIZED_STIFFNESS_AND_DAMPING = downcallHandleVoid("JPH_SpringPart_CalculateSpringPropertiesWithMassNormalizedStiffnessAndDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_SETTINGS = downcallHandleVoid("JPH_SpringPart_CalculateSpringPropertiesWithSettings", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPRING_PART_IS_ACTIVE = downcallHandle("JPH_SpringPart_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SPRING_PART_GET_BIAS = downcallHandle("JPH_SpringPart_GetBias", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public SpringPart() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SpringPart(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SpringPart(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SPRING_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPRING_PART_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Turn off the spring and set a bias only
    /// 
    /// @param inBias Bias term (b) for the constraint impulse: lambda = J v + b
    /// ```
    public static void calculateSpringPropertiesWithBias(
    	MemorySegment self,
    	float inBias
    ) {
    	MethodHandle method = JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_BIAS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBias
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateSpringPropertiesWithBias].
    public final void calculateSpringPropertiesWithBias(
    	float inBias
    ) {
    	calculateSpringPropertiesWithBias(
    		this.segment,
    		inBias
    	);
    }
    
    /// ```
    /// Calculate spring properties with spring Stiffness (k) and damping (c), this is based on the spring equation: F = -k * x - c * v
    /// 
    /// @param inDeltaTime Time step
    /// @param inInvEffectiveMass Inverse effective mass K
    /// @param inBias Bias term (b) for the constraint impulse: lambda = J v + b
    /// @param inC Value of the constraint equation (C).
    /// @param inStiffness Spring stiffness k.
    /// @param inDamping Spring damping coefficient c.
    /// @param outEffectiveMass On return, this contains the new effective mass K^-1
    /// ```
    public static void calculateSpringPropertiesWithStiffnessAndDamping(
    	MemorySegment self,
    	float inDeltaTime,
    	float inInvEffectiveMass,
    	float inBias,
    	float inC,
    	float inStiffness,
    	float inDamping,
    	MemorySegment outEffectiveMass
    ) {
    	MethodHandle method = JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_STIFFNESS_AND_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inInvEffectiveMass,
    			inBias,
    			inC,
    			inStiffness,
    			inDamping,
    			outEffectiveMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateSpringPropertiesWithStiffnessAndDamping].
    public final void calculateSpringPropertiesWithStiffnessAndDamping(
    	float inDeltaTime,
    	float inInvEffectiveMass,
    	float inBias,
    	float inC,
    	float inStiffness,
    	float inDamping,
    	NativeFloatArray outEffectiveMass
    ) {
    	calculateSpringPropertiesWithStiffnessAndDamping(
    		this.segment,
    		inDeltaTime,
    		inInvEffectiveMass,
    		inBias,
    		inC,
    		inStiffness,
    		inDamping,
    		outEffectiveMass.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate spring properties based on frequency and damping ratio
    /// 
    /// @param inDeltaTime Time step
    /// @param inInvEffectiveMass Inverse effective mass K
    /// @param inBias Bias term (b) for the constraint impulse: lambda = J v + b
    /// @param inC Value of the constraint equation (C).
    /// @param inFrequency Oscillation frequency (Hz).
    /// @param inDamping Damping factor (0 = no damping, 1 = critical damping).
    /// @param outEffectiveMass On return, this contains the new effective mass K^-1
    /// ```
    public static void calculateSpringPropertiesWithFrequencyAndDamping(
    	MemorySegment self,
    	float inDeltaTime,
    	float inInvEffectiveMass,
    	float inBias,
    	float inC,
    	float inFrequency,
    	float inDamping,
    	MemorySegment outEffectiveMass
    ) {
    	MethodHandle method = JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_FREQUENCY_AND_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inInvEffectiveMass,
    			inBias,
    			inC,
    			inFrequency,
    			inDamping,
    			outEffectiveMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateSpringPropertiesWithFrequencyAndDamping].
    public final void calculateSpringPropertiesWithFrequencyAndDamping(
    	float inDeltaTime,
    	float inInvEffectiveMass,
    	float inBias,
    	float inC,
    	float inFrequency,
    	float inDamping,
    	NativeFloatArray outEffectiveMass
    ) {
    	calculateSpringPropertiesWithFrequencyAndDamping(
    		this.segment,
    		inDeltaTime,
    		inInvEffectiveMass,
    		inBias,
    		inC,
    		inFrequency,
    		inDamping,
    		outEffectiveMass.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate spring properties with spring stiffness (k) and damping (c) in acceleration mode, this is based on the spring equation: F = m_eff * (-k * x - c * v) where m_eff is the effective mass of the constraint
    /// 
    /// @param inDeltaTime Time step
    /// @param inInvEffectiveMass Inverse effective mass K
    /// @param inBias Bias term (b) for the constraint impulse: lambda = J v + b
    /// @param inC Value of the constraint equation (C).
    /// @param inStiffness Spring stiffness k.
    /// @param inDamping Spring damping coefficient c.
    /// @param outEffectiveMass On return, this contains the new effective mass K^-1
    /// ```
    public static void calculateSpringPropertiesWithMassNormalizedStiffnessAndDamping(
    	MemorySegment self,
    	float inDeltaTime,
    	float inInvEffectiveMass,
    	float inBias,
    	float inC,
    	float inStiffness,
    	float inDamping,
    	MemorySegment outEffectiveMass
    ) {
    	MethodHandle method = JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_MASS_NORMALIZED_STIFFNESS_AND_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inInvEffectiveMass,
    			inBias,
    			inC,
    			inStiffness,
    			inDamping,
    			outEffectiveMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateSpringPropertiesWithMassNormalizedStiffnessAndDamping].
    public final void calculateSpringPropertiesWithMassNormalizedStiffnessAndDamping(
    	float inDeltaTime,
    	float inInvEffectiveMass,
    	float inBias,
    	float inC,
    	float inStiffness,
    	float inDamping,
    	NativeFloatArray outEffectiveMass
    ) {
    	calculateSpringPropertiesWithMassNormalizedStiffnessAndDamping(
    		this.segment,
    		inDeltaTime,
    		inInvEffectiveMass,
    		inBias,
    		inC,
    		inStiffness,
    		inDamping,
    		outEffectiveMass.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate spring properties based on SpringSettings object.
    /// Assumes the spring has either stiffness or damping.
    /// ```
    public static void calculateSpringPropertiesWithSettings(
    	MemorySegment self,
    	float inDeltaTime,
    	float inInvEffectiveMass,
    	float inBias,
    	float inC,
    	MemorySegment inSpringSettings,
    	MemorySegment outEffectiveMass
    ) {
    	MethodHandle method = JPH_SPRING_PART_CALCULATE_SPRING_PROPERTIES_WITH_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inInvEffectiveMass,
    			inBias,
    			inC,
    			inSpringSettings,
    			outEffectiveMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateSpringPropertiesWithSettings].
    public final void calculateSpringPropertiesWithSettings(
    	float inDeltaTime,
    	float inInvEffectiveMass,
    	float inBias,
    	float inC,
    	SpringSettings inSpringSettings,
    	NativeFloatArray outEffectiveMass
    ) {
    	calculateSpringPropertiesWithSettings(
    		this.segment,
    		inDeltaTime,
    		inInvEffectiveMass,
    		inBias,
    		inC,
    		inSpringSettings.memorySegment(),
    		outEffectiveMass.memorySegment()
    	);
    }
    
    /// ```
    /// Returns if this spring is active
    /// ```
    public static boolean isActive(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPRING_PART_IS_ACTIVE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isActive].
    public final boolean isActive() {
    	return isActive(
    		this.segment
    	);
    }
    
    /// ```
    /// Get total bias b, including supplied bias and bias for spring: lambda = J v + b
    /// ```
    public static float getBias(
    	MemorySegment self,
    	float inTotalLambda
    ) {
    	MethodHandle method = JPH_SPRING_PART_GET_BIAS.get();
    	try {
    		return (float) method.invokeExact(
    			self,
    			inTotalLambda
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBias].
    public final float getBias(
    	float inTotalLambda
    ) {
    	return getBias(
    		this.segment,
    		inTotalLambda
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}