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

public final class PointConstraint extends TwoBodyConstraint {

	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_AS_TWO_BODY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SET_POINT1;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_SET_POINT2;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_POINT_CONSTRAINT_CREATE = downcallHandle("JPH_PointConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_AS_TWO_BODY_CONSTRAINT = downcallHandle("JPH_PointConstraint_AsTwoBodyConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_SET_POINT1 = downcallHandleVoid("JPH_PointConstraint_SetPoint1", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_SET_POINT2 = downcallHandleVoid("JPH_PointConstraint_SetPoint2", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1 = downcallHandleVoid("JPH_PointConstraint_GetLocalSpacePoint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2 = downcallHandleVoid("JPH_PointConstraint_GetLocalSpacePoint2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION = downcallHandleVoid("JPH_PointConstraint_GetTotalLambdaPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PointConstraint(
	    Body inBody1,
	    Body inBody2,
	    PointConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inBody1,
	        inBody2,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public PointConstraint(
		Arena arena,
		Body inBody1,
		Body inBody2,
		PointConstraintSettings inSettings
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

	public PointConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asTwoBodyConstraint(segment));
	}

    /// ```
    /// Construct point constraint
    /// ```
    public static MemorySegment create(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_CREATE.get();
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
    	MethodHandle method = JPH_POINT_CONSTRAINT_AS_TWO_BODY_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Update the attachment point for body 1
    /// ```
    public static void setPoint1(
    	MemorySegment self,
    	int inSpace,
    	MemorySegment inPoint1
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_SET_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSpace,
    			inPoint1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoint1].
    public final void setPoint1(
    	int inSpace,
    	Vec3 inPoint1
    ) {
    	setPoint1(
    		this.segment,
    		inSpace,
    		inPoint1.memorySegment()
    	);
    }
    
    /// ```
    /// Update the attachment point for body 2
    /// ```
    public static void setPoint2(
    	MemorySegment self,
    	int inSpace,
    	MemorySegment inPoint2
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_SET_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSpace,
    			inPoint2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoint2].
    public final void setPoint2(
    	int inSpace,
    	Vec3 inPoint2
    ) {
    	setPoint2(
    		this.segment,
    		inSpace,
    		inPoint2.memorySegment()
    	);
    }
    
    /// ```
    /// Get the attachment point for body 1 relative to body 1 COM (transform by Body::GetCenterOfMassTransform to take to world space)
    /// ```
    public static void getLocalSpacePoint1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpacePoint1].
    public final void getLocalSpacePoint1(
    	Vec3 outResult
    ) {
    	getLocalSpacePoint1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the attachment point for body 2 relative to body 2 COM (transform by Body::GetCenterOfMassTransform to take to world space)
    /// ```
    public static void getLocalSpacePoint2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_GET_LOCAL_SPACE_POINT2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpacePoint2].
    public final void getLocalSpacePoint2(
    	Vec3 outResult
    ) {
    	getLocalSpacePoint2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @name Get Lagrange multiplier from last physics update (the linear impulse applied to satisfy the constraint)
    /// ```
    public static void getTotalLambdaPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_GET_TOTAL_LAMBDA_POSITION.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}