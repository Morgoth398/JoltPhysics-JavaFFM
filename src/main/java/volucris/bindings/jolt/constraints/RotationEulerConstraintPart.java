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
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class RotationEulerConstraintPart {

	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION_XY;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION_XZ;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_DEACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_GET_TOTAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_ROTATION_EULER_CONSTRAINT_PART_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_ROTATION_EULER_CONSTRAINT_PART_CREATE = downcallHandle("JPH_RotationEulerConstraintPart_Create", UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_DESTROY = downcallHandleVoid("JPH_RotationEulerConstraintPart_Destroy", UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION = downcallHandleVoid("JPH_RotationEulerConstraintPart_sGetInvInitialOrientation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION_XY = downcallHandleVoid("JPH_RotationEulerConstraintPart_sGetInvInitialOrientationXY", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION_XZ = downcallHandleVoid("JPH_RotationEulerConstraintPart_sGetInvInitialOrientationXZ", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES = downcallHandleVoid("JPH_RotationEulerConstraintPart_CalculateConstraintProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_DEACTIVATE = downcallHandleVoid("JPH_RotationEulerConstraintPart_Deactivate", UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_IS_ACTIVE = downcallHandle("JPH_RotationEulerConstraintPart_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_WARM_START = downcallHandleVoid("JPH_RotationEulerConstraintPart_WarmStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_ROTATION_EULER_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_RotationEulerConstraintPart_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_RotationEulerConstraintPart_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_ROTATION_EULER_CONSTRAINT_PART_GET_TOTAL_LAMBDA = downcallHandleVoid("JPH_RotationEulerConstraintPart_GetTotalLambda", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_SAVE_STATE = downcallHandleVoid("JPH_RotationEulerConstraintPart_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATION_EULER_CONSTRAINT_PART_RESTORE_STATE = downcallHandleVoid("JPH_RotationEulerConstraintPart_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RotationEulerConstraintPart() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RotationEulerConstraintPart(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RotationEulerConstraintPart(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Return inverse of initial rotation from body 1 to body 2 in body 1 space
    /// ```
    public static void sGetInvInitialOrientation(
    	MemorySegment inBody1,
    	MemorySegment inBody2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION.get();
    	try {
    		 method.invokeExact(
    			inBody1,
    			inBody2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGetInvInitialOrientation].
    public static void sGetInvInitialOrientation(
    	Body inBody1,
    	Body inBody2,
    	Quat outResult
    ) {
    	sGetInvInitialOrientation(
    		inBody1.memorySegment(),
    		inBody2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Return inverse of initial rotation from body 1 to body 2 in body 1 space
    /// @param inAxisX1 Reference axis X for body 1
    /// @param inAxisY1 Reference axis Y for body 1
    /// @param inAxisX2 Reference axis X for body 2
    /// @param inAxisY2 Reference axis Y for body 2
    /// ```
    public static void sGetInvInitialOrientationXY(
    	MemorySegment inAxisX1,
    	MemorySegment inAxisY1,
    	MemorySegment inAxisX2,
    	MemorySegment inAxisY2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION_XY.get();
    	try {
    		 method.invokeExact(
    			inAxisX1,
    			inAxisY1,
    			inAxisX2,
    			inAxisY2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGetInvInitialOrientationXY].
    public static void sGetInvInitialOrientationXY(
    	Vec3 inAxisX1,
    	Vec3 inAxisY1,
    	Vec3 inAxisX2,
    	Vec3 inAxisY2,
    	Quat outResult
    ) {
    	sGetInvInitialOrientationXY(
    		inAxisX1.memorySegment(),
    		inAxisY1.memorySegment(),
    		inAxisX2.memorySegment(),
    		inAxisY2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Return inverse of initial rotation from body 1 to body 2 in body 1 space
    /// @param inAxisX1 Reference axis X for body 1
    /// @param inAxisZ1 Reference axis Z for body 1
    /// @param inAxisX2 Reference axis X for body 2
    /// @param inAxisZ2 Reference axis Z for body 2
    /// ```
    public static void sGetInvInitialOrientationXZ(
    	MemorySegment inAxisX1,
    	MemorySegment inAxisZ1,
    	MemorySegment inAxisX2,
    	MemorySegment inAxisZ2,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_S_GET_INV_INITIAL_ORIENTATION_XZ.get();
    	try {
    		 method.invokeExact(
    			inAxisX1,
    			inAxisZ1,
    			inAxisX2,
    			inAxisZ2,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGetInvInitialOrientationXZ].
    public static void sGetInvInitialOrientationXZ(
    	Vec3 inAxisX1,
    	Vec3 inAxisZ1,
    	Vec3 inAxisX2,
    	Vec3 inAxisZ2,
    	Quat outResult
    ) {
    	sGetInvInitialOrientationXZ(
    		inAxisX1.memorySegment(),
    		inAxisZ1.memorySegment(),
    		inAxisX2.memorySegment(),
    		inAxisZ2.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate properties used during the functions below
    /// ```
    public static void calculateConstraintProperties(
    	MemorySegment self,
    	MemorySegment inBody1,
    	MemorySegment inRotation1,
    	MemorySegment inBody2,
    	MemorySegment inRotation2
    ) {
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody1,
    			inRotation1,
    			inBody2,
    			inRotation2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintProperties].
    public final void calculateConstraintProperties(
    	Body inBody1,
    	Mat44 inRotation1,
    	Body inBody2,
    	Mat44 inRotation2
    ) {
    	calculateConstraintProperties(
    		this.segment,
    		inBody1.memorySegment(),
    		inRotation1.memorySegment(),
    		inBody2.memorySegment(),
    		inRotation2.memorySegment()
    	);
    }
    
    /// ```
    /// Deactivate this constraint
    /// ```
    public static void deactivate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_DEACTIVATE.get();
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
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_IS_ACTIVE.get();
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
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_WARM_START.get();
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
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT.get();
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
    /// ```
    public static boolean solvePositionConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inInvInitialOrientation,
    	float inBaumgarte
    ) {
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inInvInitialOrientation,
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
    	Quat inInvInitialOrientation,
    	float inBaumgarte
    ) {
    	return solvePositionConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inInvInitialOrientation.memorySegment(),
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
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_GET_TOTAL_LAMBDA.get();
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
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_SAVE_STATE.get();
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
    	MethodHandle method = JPH_ROTATION_EULER_CONSTRAINT_PART_RESTORE_STATE.get();
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