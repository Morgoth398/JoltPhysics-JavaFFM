/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.Vector2;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DualAxisConstraintPart {

	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_DEACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_SET_TOTAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_DUAL_AXIS_CONSTRAINT_PART_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DUAL_AXIS_CONSTRAINT_PART_CREATE = downcallHandle("JPH_DualAxisConstraintPart_Create", UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_DESTROY = downcallHandleVoid("JPH_DualAxisConstraintPart_Destroy", UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES = downcallHandleVoid("JPH_DualAxisConstraintPart_CalculateConstraintProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_DEACTIVATE = downcallHandleVoid("JPH_DualAxisConstraintPart_Deactivate", UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_IS_ACTIVE = downcallHandle("JPH_DualAxisConstraintPart_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_WARM_START = downcallHandleVoid("JPH_DualAxisConstraintPart_WarmStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DUAL_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_DualAxisConstraintPart_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_DualAxisConstraintPart_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DUAL_AXIS_CONSTRAINT_PART_SET_TOTAL_LAMBDA = downcallHandleVoid("JPH_DualAxisConstraintPart_SetTotalLambda", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA = downcallHandle("JPH_DualAxisConstraintPart_GetTotalLambda", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_SAVE_STATE = downcallHandleVoid("JPH_DualAxisConstraintPart_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DUAL_AXIS_CONSTRAINT_PART_RESTORE_STATE = downcallHandleVoid("JPH_DualAxisConstraintPart_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DualAxisConstraintPart() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public DualAxisConstraintPart(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DualAxisConstraintPart(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_DESTROY.get();
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
    /// All input vectors are in world space
    /// ```
    public static void calculateConstraintProperties(
    	MemorySegment self,
    	MemorySegment inBody1,
    	MemorySegment inRotation1,
    	MemorySegment inR1PlusU,
    	MemorySegment inBody2,
    	MemorySegment inRotation2,
    	MemorySegment inR2,
    	MemorySegment inN1,
    	MemorySegment inN2
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody1,
    			inRotation1,
    			inR1PlusU,
    			inBody2,
    			inRotation2,
    			inR2,
    			inN1,
    			inN2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintProperties].
    public final void calculateConstraintProperties(
    	Body inBody1,
    	Mat44 inRotation1,
    	Vec3 inR1PlusU,
    	Body inBody2,
    	Mat44 inRotation2,
    	Vec3 inR2,
    	Vec3 inN1,
    	Vec3 inN2
    ) {
    	calculateConstraintProperties(
    		this.segment,
    		inBody1.memorySegment(),
    		inRotation1.memorySegment(),
    		inR1PlusU.memorySegment(),
    		inBody2.memorySegment(),
    		inRotation2.memorySegment(),
    		inR2.memorySegment(),
    		inN1.memorySegment(),
    		inN2.memorySegment()
    	);
    }
    
    /// ```
    /// Deactivate this constraint
    /// ```
    public static void deactivate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_DEACTIVATE.get();
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
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_IS_ACTIVE.get();
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
    /// All input vectors are in world space
    /// ```
    public static void warmStart(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inN1,
    	MemorySegment inN2,
    	float inWarmStartImpulseRatio
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_WARM_START.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inN1,
    			inN2,
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
    	float inWarmStartImpulseRatio
    ) {
    	warmStart(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inN1.memorySegment(),
    		inN2.memorySegment(),
    		inWarmStartImpulseRatio
    	);
    }
    
    /// ```
    /// Iteratively update the velocity constraint. Makes sure d/dt C(...) = 0, where C is the constraint equation.
    /// All input vectors are in world space
    /// ```
    public static boolean solveVelocityConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inN1,
    	MemorySegment inN2
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inN1,
    			inN2
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
    	Vec3 inN2
    ) {
    	return solveVelocityConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inN1.memorySegment(),
    		inN2.memorySegment()
    	);
    }
    
    /// ```
    /// Iteratively update the position constraint. Makes sure C(...) = 0.
    /// All input vectors are in world space
    /// ```
    public static boolean solvePositionConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inU,
    	MemorySegment inN1,
    	MemorySegment inN2,
    	float inBaumgarte
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inU,
    			inN1,
    			inN2,
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
    	Vec3 inU,
    	Vec3 inN1,
    	Vec3 inN2,
    	float inBaumgarte
    ) {
    	return solvePositionConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inU.memorySegment(),
    		inN1.memorySegment(),
    		inN2.memorySegment(),
    		inBaumgarte
    	);
    }
    
    /// ```
    /// Override total lagrange multiplier, can be used to set the initial value for warm starting
    /// ```
    public static void setTotalLambda(
    	MemorySegment self,
    	MemorySegment inLambda
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_SET_TOTAL_LAMBDA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLambda
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTotalLambda].
    public final void setTotalLambda(
    	Vector2 inLambda
    ) {
    	setTotalLambda(
    		this.segment,
    		inLambda.memorySegment()
    	);
    }
    
    /// ```
    /// Return lagrange multiplier
    /// ```
    public static MemorySegment getTotalLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalLambda].
    public final @Nullable Vector2 getTotalLambda() {
    	MemorySegment segment = getTotalLambda(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Vector2(segment);
    }
    
    /// ```
    /// Save state of this constraint part
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_SAVE_STATE.get();
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
    	MethodHandle method = JPH_DUAL_AXIS_CONSTRAINT_PART_RESTORE_STATE.get();
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