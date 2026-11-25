/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.Body;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DistanceConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SET_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DISTANCE_CONSTRAINT_CREATE = downcallHandle("JPH_DistanceConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_DistanceConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SET_DISTANCE = downcallHandleVoid("JPH_DistanceConstraint_SetDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE = downcallHandle("JPH_DistanceConstraint_GetMinDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE = downcallHandle("JPH_DistanceConstraint_GetMaxDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS = downcallHandle("JPH_DistanceConstraint_GetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1 = downcallHandle("JPH_DistanceConstraint_GetLimitsSpringSettings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS = downcallHandleVoid("JPH_DistanceConstraint_SetLimitsSpringSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandle("JPH_DistanceConstraint_GetTotalLambdaPosition", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DistanceConstraint(
	    Body inBody1,
	    Body inBody2,
	    DistanceConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public DistanceConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		DistanceConstraintSettings inSettings
	) {
		MemorySegment segment = create(
			inBody1.memorySegment(),
			inBody2.memorySegment(),
			inSettings.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asTwoBodyConstraint(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public DistanceConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct distance constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBody1,
    			inBody2,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asTwoBodyConstraint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Update the minimum and maximum distance for the constraint
    /// ```
    public static void setDistance(
    	MemorySegment self,
    	float inMinDistance,
    	float inMaxDistance
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SET_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMinDistance,
    			inMaxDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDistance].
    public final void setDistance(
    	float inMinDistance,
    	float inMaxDistance
    ) {
    	setDistance(
    		this.segment,
    		inMinDistance,
    		inMaxDistance
    	);
    }
    
    public static float getMinDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_MIN_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinDistance].
    public final float getMinDistance() {
    	return getMinDistance(
    		this.segment
    	);
    }
    
    public static float getMaxDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_MAX_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxDistance].
    public final float getMaxDistance() {
    	return getMaxDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// Update the limits spring settings
    /// ```
    public static MemorySegment getLimitsSpringSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsSpringSettings].
    public final @Nullable SpringSettings getLimitsSpringSettings() {
    	MemorySegment segment = getLimitsSpringSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SpringSettings(segment);
    }
    
    public static MemorySegment getLimitsSpringSettings1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_LIMITS_SPRING_SETTINGS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLimitsSpringSettings1].
    public final @Nullable SpringSettings getLimitsSpringSettings1() {
    	MemorySegment segment = getLimitsSpringSettings1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SpringSettings(segment);
    }
    
    public static void setLimitsSpringSettings(
    	MemorySegment self,
    	MemorySegment inLimitsSpringSettings
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_SET_LIMITS_SPRING_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLimitsSpringSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimitsSpringSettings].
    public final void setLimitsSpringSettings(
    	SpringSettings inLimitsSpringSettings
    ) {
    	setLimitsSpringSettings(
    		this.segment,
    		inLimitsSpringSettings.memorySegment()
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the linear impulse applied to satisfy the constraint)
    /// ```
    public static float getTotalLambdaPosition(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DISTANCE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaPosition].
    public final float getTotalLambdaPosition() {
    	return getTotalLambdaPosition(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}