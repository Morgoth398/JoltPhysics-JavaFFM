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

public final class PulleyConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_SET_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_GET_MIN_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_GET_MAX_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_GET_CURRENT_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_PULLEY_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PULLEY_CONSTRAINT_CREATE = downcallHandle("JPH_PulleyConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_PulleyConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_SET_LENGTH = downcallHandleVoid("JPH_PulleyConstraint_SetLength", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_PULLEY_CONSTRAINT_GET_MIN_LENGTH = downcallHandle("JPH_PulleyConstraint_GetMinLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_GET_MAX_LENGTH = downcallHandle("JPH_PulleyConstraint_GetMaxLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_GET_CURRENT_LENGTH = downcallHandle("JPH_PulleyConstraint_GetCurrentLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PULLEY_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandle("JPH_PulleyConstraint_GetTotalLambdaPosition", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PulleyConstraint(
	    Body inBody1,
	    Body inBody2,
	    PulleyConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public PulleyConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		PulleyConstraintSettings inSettings
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

	public PulleyConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct pulley constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Update the minimum and maximum length for the constraint
    /// ```
    public static void setLength(
    	MemorySegment self,
    	float inMinLength,
    	float inMaxLength
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_SET_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMinLength,
    			inMaxLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLength].
    public final void setLength(
    	float inMinLength,
    	float inMaxLength
    ) {
    	setLength(
    		this.segment,
    		inMinLength,
    		inMaxLength
    	);
    }
    
    public static float getMinLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_GET_MIN_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinLength].
    public final float getMinLength() {
    	return getMinLength(
    		this.segment
    	);
    }
    
    public static float getMaxLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_GET_MAX_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxLength].
    public final float getMaxLength() {
    	return getMaxLength(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the current length of both segments (multiplied by the ratio for segment 2)
    /// ```
    public static float getCurrentLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_GET_CURRENT_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCurrentLength].
    public final float getCurrentLength() {
    	return getCurrentLength(
    		this.segment
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the linear impulse applied to satisfy the constraint)
    /// ```
    public static float getTotalLambdaPosition(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PULLEY_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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