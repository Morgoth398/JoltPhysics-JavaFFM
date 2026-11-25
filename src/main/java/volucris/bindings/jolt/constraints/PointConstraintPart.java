/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PointConstraintPart {

	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_DEACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_GET_TOTAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONSTRAINT_PART_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_POINT_CONSTRAINT_PART_CREATE = downcallHandle("JPH_PointConstraintPart_Create", UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_PART_DESTROY = downcallHandleVoid("JPH_PointConstraintPart_Destroy", UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES = downcallHandleVoid("JPH_PointConstraintPart_CalculateConstraintProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_PART_DEACTIVATE = downcallHandleVoid("JPH_PointConstraintPart_Deactivate", UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_PART_IS_ACTIVE = downcallHandle("JPH_PointConstraintPart_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_PART_WARM_START = downcallHandleVoid("JPH_PointConstraintPart_WarmStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_POINT_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_PointConstraintPart_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_PointConstraintPart_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_POINT_CONSTRAINT_PART_GET_TOTAL_LAMBDA = downcallHandleVoid("JPH_PointConstraintPart_GetTotalLambda", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_PART_SAVE_STATE = downcallHandleVoid("JPH_PointConstraintPart_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONSTRAINT_PART_RESTORE_STATE = downcallHandleVoid("JPH_PointConstraintPart_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PointConstraintPart() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PointConstraintPart(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PointConstraintPart(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Calculate properties used during the functions below
    /// @param inBody1 The first body that this constraint is attached to
    /// @param inBody2 The second body that this constraint is attached to
    /// @param inRotation1 The 3x3 rotation matrix for body 1 (translation part is ignored)
    /// @param inRotation2 The 3x3 rotation matrix for body 2 (translation part is ignored)
    /// @param inR1 Local space vector from center of mass to constraint point for body 1
    /// @param inR2 Local space vector from center of mass to constraint point for body 2
    /// ```
    public static void calculateConstraintProperties(
    	MemorySegment self,
    	MemorySegment inBody1,
    	MemorySegment inRotation1,
    	MemorySegment inR1,
    	MemorySegment inBody2,
    	MemorySegment inRotation2,
    	MemorySegment inR2
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody1,
    			inRotation1,
    			inR1,
    			inBody2,
    			inRotation2,
    			inR2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintProperties].
    public final void calculateConstraintProperties(
    	Body inBody1,
    	Mat44 inRotation1,
    	Vec3 inR1,
    	Body inBody2,
    	Mat44 inRotation2,
    	Vec3 inR2
    ) {
    	calculateConstraintProperties(
    		this.segment,
    		inBody1.memorySegment(),
    		inRotation1.memorySegment(),
    		inR1.memorySegment(),
    		inBody2.memorySegment(),
    		inRotation2.memorySegment(),
    		inR2.memorySegment()
    	);
    }
    
    /// ```
    /// Deactivate this constraint
    /// ```
    public static void deactivate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_DEACTIVATE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#deactivate].
    public final void deactivate() {
    	deactivate(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if constraint is active
    /// ```
    public static boolean isActive(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_IS_ACTIVE.get();
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
    /// Must be called from the WarmStartVelocityConstraint call to apply the previous frame's impulses
    /// @param ioBody1 The first body that this constraint is attached to
    /// @param ioBody2 The second body that this constraint is attached to
    /// @param inWarmStartImpulseRatio Ratio of new step to old time step (dt_new / dt_old) for scaling the lagrange multiplier of the previous frame
    /// ```
    public static void warmStart(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	float inWarmStartImpulseRatio
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_WARM_START.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inWarmStartImpulseRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#warmStart].
    public final void warmStart(
    	Body ioBody1,
    	Body ioBody2,
    	float inWarmStartImpulseRatio
    ) {
    	warmStart(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inWarmStartImpulseRatio
    	);
    }
    
    /// ```
    /// Iteratively update the velocity constraint. Makes sure d/dt C(...) = 0, where C is the constraint equation.
    /// @param ioBody1 The first body that this constraint is attached to
    /// @param ioBody2 The second body that this constraint is attached to
    /// ```
    public static boolean solveVelocityConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solveVelocityConstraint].
    public final boolean solveVelocityConstraint(
    	Body ioBody1,
    	Body ioBody2
    ) {
    	return solveVelocityConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment()
    	);
    }
    
    /// ```
    /// Iteratively update the position constraint. Makes sure C(...) = 0.
    /// @param ioBody1 The first body that this constraint is attached to
    /// @param ioBody2 The second body that this constraint is attached to
    /// @param inBaumgarte Baumgarte constant (fraction of the error to correct)
    /// ```
    public static boolean solvePositionConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	float inBaumgarte
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inBaumgarte
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solvePositionConstraint].
    public final boolean solvePositionConstraint(
    	Body ioBody1,
    	Body ioBody2,
    	float inBaumgarte
    ) {
    	return solvePositionConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inBaumgarte
    	);
    }
    
    /// ```
    /// Return lagrange multiplier
    /// ```
    public static void getTotalLambda(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_GET_TOTAL_LAMBDA.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambda].
    public final void getTotalLambda(
    	Vec3 outResult
    ) {
    	getTotalLambda(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Save state of this constraint part
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_SAVE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveState].
    public final void saveState(
    	StateRecorder inStream
    ) {
    	saveState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restore state of this constraint part
    /// ```
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_POINT_CONSTRAINT_PART_RESTORE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreState].
    public final void restoreState(
    	StateRecorder inStream
    ) {
    	restoreState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}