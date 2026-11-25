/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ConeConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;
	private static final LazyConstant<MethodHandle> JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONE_CONSTRAINT_CREATE = downcallHandle("JPH_ConeConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_ConeConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE = downcallHandleVoid("JPH_ConeConstraint_SetHalfConeAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE = downcallHandle("JPH_ConeConstraint_GetCosHalfConeAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_ConeConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION = downcallHandle("JPH_ConeConstraint_GetTotalLambdaRotation", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ConeConstraint(
	    Body inBody1,
	    Body inBody2,
	    ConeConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public ConeConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		ConeConstraintSettings inSettings
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

	public ConeConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct cone constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_CONE_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Update maximum angle between body 1 and 2 (see ConeConstraintSettings)
    /// ```
    public static void setHalfConeAngle(
    	MemorySegment self,
    	float inHalfConeAngle
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_SET_HALF_CONE_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inHalfConeAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHalfConeAngle].
    public final void setHalfConeAngle(
    	float inHalfConeAngle
    ) {
    	setHalfConeAngle(
    		this.segment,
    		inHalfConeAngle
    	);
    }
    
    public static float getCosHalfConeAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_GET_COS_HALF_CONE_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCosHalfConeAngle].
    public final float getCosHalfConeAngle() {
    	return getCosHalfConeAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the linear/angular impulse applied to satisfy the constraint)
    /// ```
    public static void getTotalLambdaPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaPosition].
    public final void getTotalLambdaPosition(
    	Vec3 outResult
    ) {
    	getTotalLambdaPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static float getTotalLambdaRotation(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONE_CONSTRAINT_GET_TOTAL_LAMBDA_ROTATION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambdaRotation].
    public final float getTotalLambdaRotation() {
    	return getTotalLambdaRotation(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}