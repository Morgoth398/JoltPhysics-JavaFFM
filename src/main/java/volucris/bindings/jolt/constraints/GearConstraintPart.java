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

public final class GearConstraintPart {

	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_DEACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_GET_TOTAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_GEAR_CONSTRAINT_PART_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_GEAR_CONSTRAINT_PART_CREATE = downcallHandle("JPH_GearConstraintPart_Create", UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_PART_DESTROY = downcallHandleVoid("JPH_GearConstraintPart_Destroy", UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES = downcallHandleVoid("JPH_GearConstraintPart_CalculateConstraintProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_GEAR_CONSTRAINT_PART_DEACTIVATE = downcallHandleVoid("JPH_GearConstraintPart_Deactivate", UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_PART_IS_ACTIVE = downcallHandle("JPH_GearConstraintPart_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_PART_WARM_START = downcallHandleVoid("JPH_GearConstraintPart_WarmStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_GEAR_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_GearConstraintPart_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_GEAR_CONSTRAINT_PART_GET_TOTAL_LAMBDA = downcallHandle("JPH_GearConstraintPart_GetTotalLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_GearConstraintPart_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_GEAR_CONSTRAINT_PART_SAVE_STATE = downcallHandleVoid("JPH_GearConstraintPart_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_GEAR_CONSTRAINT_PART_RESTORE_STATE = downcallHandleVoid("JPH_GearConstraintPart_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public GearConstraintPart() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public GearConstraintPart(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public GearConstraintPart(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_DESTROY.get();
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
    /// @param inWorldSpaceHingeAxis1 The axis around which body 1 rotates
    /// @param inWorldSpaceHingeAxis2 The axis around which body 2 rotates
    /// @param inRatio The ratio between rotation and translation
    /// ```
    public static void calculateConstraintProperties(
    	MemorySegment self,
    	MemorySegment inBody1,
    	MemorySegment inWorldSpaceHingeAxis1,
    	MemorySegment inBody2,
    	MemorySegment inWorldSpaceHingeAxis2,
    	float inRatio
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody1,
    			inWorldSpaceHingeAxis1,
    			inBody2,
    			inWorldSpaceHingeAxis2,
    			inRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintProperties].
    public final void calculateConstraintProperties(
    	Body inBody1,
    	Vec3 inWorldSpaceHingeAxis1,
    	Body inBody2,
    	Vec3 inWorldSpaceHingeAxis2,
    	float inRatio
    ) {
    	calculateConstraintProperties(
    		this.segment,
    		inBody1.memorySegment(),
    		inWorldSpaceHingeAxis1.memorySegment(),
    		inBody2.memorySegment(),
    		inWorldSpaceHingeAxis2.memorySegment(),
    		inRatio
    	);
    }
    
    /// ```
    /// Deactivate this constraint
    /// ```
    public static void deactivate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_DEACTIVATE.get();
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_IS_ACTIVE.get();
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_WARM_START.get();
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
    /// @param inWorldSpaceHingeAxis1 The axis around which body 1 rotates
    /// @param inWorldSpaceHingeAxis2 The axis around which body 2 rotates
    /// @param inRatio The ratio between rotation and translation
    /// ```
    public static boolean solveVelocityConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment inWorldSpaceHingeAxis1,
    	MemorySegment ioBody2,
    	MemorySegment inWorldSpaceHingeAxis2,
    	float inRatio
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			inWorldSpaceHingeAxis1,
    			ioBody2,
    			inWorldSpaceHingeAxis2,
    			inRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solveVelocityConstraint].
    public final boolean solveVelocityConstraint(
    	Body ioBody1,
    	Vec3 inWorldSpaceHingeAxis1,
    	Body ioBody2,
    	Vec3 inWorldSpaceHingeAxis2,
    	float inRatio
    ) {
    	return solveVelocityConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		inWorldSpaceHingeAxis1.memorySegment(),
    		ioBody2.memorySegment(),
    		inWorldSpaceHingeAxis2.memorySegment(),
    		inRatio
    	);
    }
    
    /// ```
    /// Return lagrange multiplier
    /// ```
    public static float getTotalLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_GET_TOTAL_LAMBDA.get();
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
    /// @param inC Value of the constraint equation (C)
    /// @param inBaumgarte Baumgarte constant (fraction of the error to correct)
    /// ```
    public static boolean solvePositionConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	float inC,
    	float inBaumgarte
    ) {
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
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
    	float inC,
    	float inBaumgarte
    ) {
    	return solvePositionConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_SAVE_STATE.get();
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
    	MethodHandle method = JPH_GEAR_CONSTRAINT_PART_RESTORE_STATE.get();
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