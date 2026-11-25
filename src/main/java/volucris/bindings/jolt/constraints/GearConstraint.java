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

public final class GearConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_GEAR_CONSTRAINT_CREATE = downcallHandle("JPH_GearConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_GearConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS = downcallHandleVoid("JPH_GearConstraint_SetConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA = downcallHandle("JPH_GearConstraint_GetTotalLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public GearConstraint(
	    Body inBody1,
	    Body inBody2,
	    GearConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public GearConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		GearConstraintSettings inSettings
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

	public GearConstraint(MemorySegment segment) {
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The constraints that constrain both gears (2 hinges), optional and used to calculate the rotation error and fix numerical drift.
    /// ```
    public static void setConstraints(
    	MemorySegment self,
    	MemorySegment inGear1,
    	MemorySegment inGear2
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_SET_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inGear1,
    			inGear2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConstraints].
    public final void setConstraints(
    	Constraint inGear1,
    	Constraint inGear2
    ) {
    	setConstraints(
    		this.segment,
    		inGear1.memorySegment(),
    		inGear2.memorySegment()
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the angular impulse applied to satisfy the constraint)
    /// ```
    public static float getTotalLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_GET_TOTAL_LAMBDA.get();
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