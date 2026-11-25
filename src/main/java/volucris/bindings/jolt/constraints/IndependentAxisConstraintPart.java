/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class IndependentAxisConstraintPart {

	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_DEACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_CREATE = downcallHandle("JPH_IndependentAxisConstraintPart_Create", UNBOUNDED_ADDRESS);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_DESTROY = downcallHandleVoid("JPH_IndependentAxisConstraintPart_Destroy", UNBOUNDED_ADDRESS);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES = downcallHandleVoid("JPH_IndependentAxisConstraintPart_CalculateConstraintProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_DEACTIVATE = downcallHandleVoid("JPH_IndependentAxisConstraintPart_Deactivate", UNBOUNDED_ADDRESS);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_IS_ACTIVE = downcallHandle("JPH_IndependentAxisConstraintPart_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_WARM_START = downcallHandleVoid("JPH_IndependentAxisConstraintPart_WarmStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_IndependentAxisConstraintPart_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA = downcallHandle("JPH_IndependentAxisConstraintPart_GetTotalLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_IndependentAxisConstraintPart_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SAVE_STATE = downcallHandleVoid("JPH_IndependentAxisConstraintPart_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_RESTORE_STATE = downcallHandleVoid("JPH_IndependentAxisConstraintPart_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public IndependentAxisConstraintPart() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public IndependentAxisConstraintPart(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public IndependentAxisConstraintPart(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_DESTROY.get();
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
    /// @param inR1 The position on which the constraint operates on body 1 relative to COM
    /// @param inN1 The world space normal in which the constraint operates for body 1
    /// @param inR2 The position on which the constraint operates on body 1 relative to COM
    /// @param inN2 The world space normal in which the constraint operates for body 2
    /// @param inRatio The ratio how forces are applied between bodies
    /// ```
    public static void calculateConstraintProperties(
    	MemorySegment self,
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inR1,
    	MemorySegment inN1,
    	MemorySegment inR2,
    	MemorySegment inN2,
    	float inRatio
    ) {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody1,
    			inBody2,
    			inR1,
    			inN1,
    			inR2,
    			inN2,
    			inRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintProperties].
    public final void calculateConstraintProperties(
    	Body inBody1,
    	Body inBody2,
    	Vec3 inR1,
    	Vec3 inN1,
    	Vec3 inR2,
    	Vec3 inN2,
    	float inRatio
    ) {
    	calculateConstraintProperties(
    		this.segment,
    		inBody1.memorySegment(),
    		inBody2.memorySegment(),
    		inR1.memorySegment(),
    		inN1.memorySegment(),
    		inR2.memorySegment(),
    		inN2.memorySegment(),
    		inRatio
    	);
    }
    
    /// ```
    /// Deactivate this constraint
    /// ```
    public static void deactivate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_DEACTIVATE.get();
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
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_IS_ACTIVE.get();
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
    /// @param inN1 The world space normal in which the constraint operates for body 1
    /// @param inN2 The world space normal in which the constraint operates for body 2
    /// @param inRatio The ratio how forces are applied between bodies
    /// @param inWarmStartImpulseRatio Ratio of new step to old time step (dt_new / dt_old) for scaling the lagrange multiplier of the previous frame
    /// ```
    public static void warmStart(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inN1,
    	MemorySegment inN2,
    	float inRatio,
    	float inWarmStartImpulseRatio
    ) {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_WARM_START.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inN1,
    			inN2,
    			inRatio,
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
    	Vec3 inN1,
    	Vec3 inN2,
    	float inRatio,
    	float inWarmStartImpulseRatio
    ) {
    	warmStart(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inN1.memorySegment(),
    		inN2.memorySegment(),
    		inRatio,
    		inWarmStartImpulseRatio
    	);
    }
    
    /// ```
    /// Iteratively update the velocity constraint. Makes sure d/dt C(...) = 0, where C is the constraint equation.
    /// @param ioBody1 The first body that this constraint is attached to
    /// @param ioBody2 The second body that this constraint is attached to
    /// @param inN1 The world space normal in which the constraint operates for body 1
    /// @param inN2 The world space normal in which the constraint operates for body 2
    /// @param inRatio The ratio how forces are applied between bodies
    /// @param inMinLambda Minimum angular impulse to apply (N m s)
    /// @param inMaxLambda Maximum angular impulse to apply (N m s)
    /// ```
    public static boolean solveVelocityConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inN1,
    	MemorySegment inN2,
    	float inRatio,
    	float inMinLambda,
    	float inMaxLambda
    ) {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inN1,
    			inN2,
    			inRatio,
    			inMinLambda,
    			inMaxLambda
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solveVelocityConstraint].
    public final boolean solveVelocityConstraint(
    	Body ioBody1,
    	Body ioBody2,
    	Vec3 inN1,
    	Vec3 inN2,
    	float inRatio,
    	float inMinLambda,
    	float inMaxLambda
    ) {
    	return solveVelocityConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inN1.memorySegment(),
    		inN2.memorySegment(),
    		inRatio,
    		inMinLambda,
    		inMaxLambda
    	);
    }
    
    /// ```
    /// Return lagrange multiplier
    /// ```
    public static float getTotalLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA.get();
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
    
    /// ```
    /// Iteratively update the position constraint. Makes sure C(...) == 0.
    /// @param ioBody1 The first body that this constraint is attached to
    /// @param ioBody2 The second body that this constraint is attached to
    /// @param inN1 The world space normal in which the constraint operates for body 1
    /// @param inN2 The world space normal in which the constraint operates for body 2
    /// @param inRatio The ratio how forces are applied between bodies
    /// @param inC Value of the constraint equation (C)
    /// @param inBaumgarte Baumgarte constant (fraction of the error to correct)
    /// ```
    public static boolean solvePositionConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inN1,
    	MemorySegment inN2,
    	float inRatio,
    	float inC,
    	float inBaumgarte
    ) {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inN1,
    			inN2,
    			inRatio,
    			inC,
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
    	Vec3 inN1,
    	Vec3 inN2,
    	float inRatio,
    	float inC,
    	float inBaumgarte
    ) {
    	return solvePositionConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inN1.memorySegment(),
    		inN2.memorySegment(),
    		inRatio,
    		inC,
    		inBaumgarte
    	);
    }
    
    /// ```
    /// Save state of this constraint part
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_SAVE_STATE.get();
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
    	MethodHandle method = JPH_INDEPENDENT_AXIS_CONSTRAINT_PART_RESTORE_STATE.get();
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