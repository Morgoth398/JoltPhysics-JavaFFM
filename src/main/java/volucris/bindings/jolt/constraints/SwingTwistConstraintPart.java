/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Quat;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SwingTwistConstraintPart {

	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_TWIST_MIN;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_TWIST_MAX;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_YMIN;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_YMAX;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_ZMIN;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_ZMAX;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_SET_SWING_TYPE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_SWING_TYPE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_SET_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_S_DISTANCE_TO_MIN_SHORTER;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_CLAMP_SWING_TWIST;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_DEACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_SWING_YLAMBDA;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_SWING_ZLAMBDA;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_TWIST_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_SWING_TWIST_CONSTRAINT_PART_RESTORE_STATE;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_SWING_TWIST_CONSTRAINT_PART_CREATE = downcallHandle("JPH_SwingTwistConstraintPart_Create", UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_DESTROY = downcallHandleVoid("JPH_SwingTwistConstraintPart_Destroy", UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_TWIST_MIN = downcallHandle("JPH_SwingTwistConstraintPart_GetClampedTwistMin", JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_TWIST_MAX = downcallHandle("JPH_SwingTwistConstraintPart_GetClampedTwistMax", JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_YMIN = downcallHandle("JPH_SwingTwistConstraintPart_GetClampedSwingYMin", JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_YMAX = downcallHandle("JPH_SwingTwistConstraintPart_GetClampedSwingYMax", JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_ZMIN = downcallHandle("JPH_SwingTwistConstraintPart_GetClampedSwingZMin", JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_ZMAX = downcallHandle("JPH_SwingTwistConstraintPart_GetClampedSwingZMax", JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_PART_SET_SWING_TYPE = downcallHandleVoid("JPH_SwingTwistConstraintPart_SetSwingType", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_SWING_TYPE = downcallHandle("JPH_SwingTwistConstraintPart_GetSwingType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_SET_LIMITS = downcallHandleVoid("JPH_SwingTwistConstraintPart_SetLimits", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_PART_S_DISTANCE_TO_MIN_SHORTER = downcallHandle("JPH_SwingTwistConstraintPart_sDistanceToMinShorter", JAVA_BOOLEAN, JAVA_FLOAT, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_PART_CLAMP_SWING_TWIST = downcallHandleVoid("JPH_SwingTwistConstraintPart_ClampSwingTwist", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES = downcallHandleVoid("JPH_SwingTwistConstraintPart_CalculateConstraintProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_DEACTIVATE = downcallHandleVoid("JPH_SwingTwistConstraintPart_Deactivate", UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_IS_ACTIVE = downcallHandle("JPH_SwingTwistConstraintPart_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_WARM_START = downcallHandleVoid("JPH_SwingTwistConstraintPart_WarmStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_SwingTwistConstraintPart_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_SwingTwistConstraintPart_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_SWING_YLAMBDA = downcallHandle("JPH_SwingTwistConstraintPart_GetTotalSwingYLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_SWING_ZLAMBDA = downcallHandle("JPH_SwingTwistConstraintPart_GetTotalSwingZLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_TWIST_LAMBDA = downcallHandle("JPH_SwingTwistConstraintPart_GetTotalTwistLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_SAVE_STATE = downcallHandleVoid("JPH_SwingTwistConstraintPart_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SWING_TWIST_CONSTRAINT_PART_RESTORE_STATE = downcallHandleVoid("JPH_SwingTwistConstraintPart_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SwingTwistConstraintPart() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SwingTwistConstraintPart(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SwingTwistConstraintPart(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Flags to indicate which axis got clamped by ClampSwingTwist
    /// ```
    public static int getClampedTwistMin() {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_TWIST_MIN.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int getClampedTwistMax() {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_TWIST_MAX.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int getClampedSwingYMin() {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_YMIN.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int getClampedSwingYMax() {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_YMAX.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int getClampedSwingZMin() {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_ZMIN.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int getClampedSwingZMax() {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_CLAMPED_SWING_ZMAX.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Override the swing type
    /// ```
    public static void setSwingType(
    	MemorySegment self,
    	int inSwingType
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_SET_SWING_TYPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSwingType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSwingType].
    public final void setSwingType(
    	int inSwingType
    ) {
    	setSwingType(
    		this.segment,
    		inSwingType
    	);
    }
    
    /// ```
    /// Get the swing type for this part
    /// ```
    public static int getSwingType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_SWING_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSwingType].
    public final int getSwingType() {
    	return getSwingType(
    		this.segment
    	);
    }
    
    /// ```
    /// Set limits for this constraint (see description above for parameters)
    /// ```
    public static void setLimits(
    	MemorySegment self,
    	float inTwistMinAngle,
    	float inTwistMaxAngle,
    	float inSwingYMinAngle,
    	float inSwingYMaxAngle,
    	float inSwingZMinAngle,
    	float inSwingZMaxAngle
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_SET_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTwistMinAngle,
    			inTwistMaxAngle,
    			inSwingYMinAngle,
    			inSwingYMaxAngle,
    			inSwingZMinAngle,
    			inSwingZMaxAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLimits].
    public final void setLimits(
    	float inTwistMinAngle,
    	float inTwistMaxAngle,
    	float inSwingYMinAngle,
    	float inSwingYMaxAngle,
    	float inSwingZMinAngle,
    	float inSwingZMaxAngle
    ) {
    	setLimits(
    		this.segment,
    		inTwistMinAngle,
    		inTwistMaxAngle,
    		inSwingYMinAngle,
    		inSwingYMaxAngle,
    		inSwingZMinAngle,
    		inSwingZMaxAngle
    	);
    }
    
    /// ```
    /// Helper function to determine if we're clamped against the min or max limit
    /// ```
    public static boolean sDistanceToMinShorter(
    	float inDeltaMin,
    	float inDeltaMax
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_S_DISTANCE_TO_MIN_SHORTER.get();
    	try {
    		return (boolean) method.invokeExact(
    			inDeltaMin,
    			inDeltaMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Clamp twist and swing against the constraint limits, returns which parts were clamped (everything assumed in constraint space)
    /// ```
    public static void clampSwingTwist(
    	MemorySegment self,
    	MemorySegment ioSwing,
    	MemorySegment ioTwist,
    	MemorySegment outClampedAxis
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_CLAMP_SWING_TWIST.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioSwing,
    			ioTwist,
    			outClampedAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clampSwingTwist].
    public final void clampSwingTwist(
    	Quat ioSwing,
    	Quat ioTwist,
    	NativeIntArray outClampedAxis
    ) {
    	clampSwingTwist(
    		this.segment,
    		ioSwing.memorySegment(),
    		ioTwist.memorySegment(),
    		outClampedAxis.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate properties used during the functions below
    /// @param inBody1 The first body that this constraint is attached to
    /// @param inBody2 The second body that this constraint is attached to
    /// @param inConstraintRotation The current rotation of the constraint in constraint space
    /// @param inConstraintToWorld Rotates from constraint space into world space
    /// ```
    public static void calculateConstraintProperties(
    	MemorySegment self,
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment inConstraintRotation,
    	MemorySegment inConstraintToWorld
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody1,
    			inBody2,
    			inConstraintRotation,
    			inConstraintToWorld
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintProperties].
    public final void calculateConstraintProperties(
    	Body inBody1,
    	Body inBody2,
    	Quat inConstraintRotation,
    	Quat inConstraintToWorld
    ) {
    	calculateConstraintProperties(
    		this.segment,
    		inBody1.memorySegment(),
    		inBody2.memorySegment(),
    		inConstraintRotation.memorySegment(),
    		inConstraintToWorld.memorySegment()
    	);
    }
    
    /// ```
    /// Deactivate this constraint
    /// ```
    public static void deactivate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_DEACTIVATE.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_IS_ACTIVE.get();
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
    /// ```
    public static void warmStart(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	float inWarmStartImpulseRatio
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_WARM_START.get();
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
    /// ```
    public static boolean solveVelocityConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT.get();
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
    /// @param inConstraintRotation The current rotation of the constraint in constraint space
    /// @param inConstraintToBody1 , inConstraintToBody2 Rotates from constraint space to body 1/2 space
    /// @param inBaumgarte Baumgarte constant (fraction of the error to correct)
    /// ```
    public static boolean solvePositionConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inConstraintRotation,
    	MemorySegment inConstraintToBody1,
    	MemorySegment inConstraintToBody2,
    	float inBaumgarte
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inConstraintRotation,
    			inConstraintToBody1,
    			inConstraintToBody2,
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
    	Quat inConstraintRotation,
    	Quat inConstraintToBody1,
    	Quat inConstraintToBody2,
    	float inBaumgarte
    ) {
    	return solvePositionConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inConstraintRotation.memorySegment(),
    		inConstraintToBody1.memorySegment(),
    		inConstraintToBody2.memorySegment(),
    		inBaumgarte
    	);
    }
    
    /// ```
    /// Return lagrange multiplier for swing
    /// ```
    public static float getTotalSwingYLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_SWING_YLAMBDA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalSwingYLambda].
    public final float getTotalSwingYLambda() {
    	return getTotalSwingYLambda(
    		this.segment
    	);
    }
    
    public static float getTotalSwingZLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_SWING_ZLAMBDA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalSwingZLambda].
    public final float getTotalSwingZLambda() {
    	return getTotalSwingZLambda(
    		this.segment
    	);
    }
    
    /// ```
    /// Return lagrange multiplier for twist
    /// ```
    public static float getTotalTwistLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_GET_TOTAL_TWIST_LAMBDA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTotalTwistLambda].
    public final float getTotalTwistLambda() {
    	return getTotalTwistLambda(
    		this.segment
    	);
    }
    
    /// ```
    /// Save state of this constraint part
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_SAVE_STATE.get();
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
    	MethodHandle method = JPH_SWING_TWIST_CONSTRAINT_PART_RESTORE_STATE.get();
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
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}