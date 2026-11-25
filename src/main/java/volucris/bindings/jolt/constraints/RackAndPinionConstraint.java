/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.Body;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class RackAndPinionConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_SET_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_RACK_AND_PINION_CONSTRAINT_GET_TOTAL_LAMBDA;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RACK_AND_PINION_CONSTRAINT_CREATE = downcallHandle("JPH_RackAndPinionConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_RackAndPinionConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_SET_CONSTRAINTS = downcallHandleVoid("JPH_RackAndPinionConstraint_SetConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RACK_AND_PINION_CONSTRAINT_GET_TOTAL_LAMBDA = downcallHandle("JPH_RackAndPinionConstraint_GetTotalLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RackAndPinionConstraint(
	    Body inBody1,
	    Body inBody2,
	    RackAndPinionConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public RackAndPinionConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		RackAndPinionConstraintSettings inSettings
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

	public RackAndPinionConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct gear constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The constraints that constrain the rack and pinion (a slider and a hinge), optional and used to calculate the position error and fix numerical drift.
    /// ```
    public static void setConstraints(
    	MemorySegment self,
    	MemorySegment inPinion,
    	MemorySegment inRack
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_SET_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPinion,
    			inRack
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConstraints].
    public final void setConstraints(
    	Constraint inPinion,
    	Constraint inRack
    ) {
    	setConstraints(
    		this.segment,
    		inPinion.memorySegment(),
    		inRack.memorySegment()
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the linear/angular impulse applied to satisfy the constraint)
    /// ```
    public static float getTotalLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RACK_AND_PINION_CONSTRAINT_GET_TOTAL_LAMBDA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambda].
    public final float getTotalLambda() {
    	return getTotalLambda(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}