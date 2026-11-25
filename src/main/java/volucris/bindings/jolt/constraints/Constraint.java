/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.renderer.DebugRenderer;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class Constraint extends ConstraintRefTarget
		permits TwoBodyConstraint,
		VehicleConstraint {

	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_TYPE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_SUB_TYPE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_ENABLED;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_ENABLED;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_RESET_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_DRAW_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_DRAW_CONSTRAINT_LIMITS;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_DRAW_CONSTRAINT_REFERENCE_FRAME;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_DRAW_CONSTRAINT_SIZE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SET_DRAW_CONSTRAINT_SIZE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_RESTORE_STATE;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_GET_CONSTRAINT_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_CONSTRAINT_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONSTRAINT_AS_REF_TARGET = downcallHandle("JPH_Constraint_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_GET_TYPE = downcallHandle("JPH_Constraint_GetType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_GET_SUB_TYPE = downcallHandle("JPH_Constraint_GetSubType", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY = downcallHandle("JPH_Constraint_GetConstraintPriority", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY = downcallHandleVoid("JPH_Constraint_SetConstraintPriority", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandleVoid("JPH_Constraint_SetNumVelocityStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandle("JPH_Constraint_GetNumVelocityStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE = downcallHandleVoid("JPH_Constraint_SetNumPositionStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE = downcallHandle("JPH_Constraint_GetNumPositionStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SET_ENABLED = downcallHandleVoid("JPH_Constraint_SetEnabled", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_CONSTRAINT_GET_ENABLED = downcallHandle("JPH_Constraint_GetEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_GET_USER_DATA = downcallHandle("JPH_Constraint_GetUserData", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SET_USER_DATA = downcallHandleVoid("JPH_Constraint_SetUserData", UNBOUNDED_ADDRESS, JAVA_LONG);
		JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED = downcallHandleVoid("JPH_Constraint_NotifyShapeChanged", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_RESET_WARM_START = downcallHandleVoid("JPH_Constraint_ResetWarmStart", UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_IS_ACTIVE = downcallHandle("JPH_Constraint_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT = downcallHandleVoid("JPH_Constraint_SetupVelocityConstraint", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT = downcallHandleVoid("JPH_Constraint_WarmStartVelocityConstraint", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_Constraint_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_Constraint_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_CONSTRAINT_DRAW_CONSTRAINT = downcallHandleVoid("JPH_Constraint_DrawConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_DRAW_CONSTRAINT_LIMITS = downcallHandleVoid("JPH_Constraint_DrawConstraintLimits", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_DRAW_CONSTRAINT_REFERENCE_FRAME = downcallHandleVoid("JPH_Constraint_DrawConstraintReferenceFrame", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_GET_DRAW_CONSTRAINT_SIZE = downcallHandle("JPH_Constraint_GetDrawConstraintSize", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_SET_DRAW_CONSTRAINT_SIZE = downcallHandleVoid("JPH_Constraint_SetDrawConstraintSize", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONSTRAINT_SAVE_STATE = downcallHandleVoid("JPH_Constraint_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_RESTORE_STATE = downcallHandleVoid("JPH_Constraint_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_GET_CONSTRAINT_SETTINGS = downcallHandleVoid("JPH_Constraint_GetConstraintSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONSTRAINT_DESTROY = downcallHandleVoid("JPH_Constraint_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Constraint(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the type of a constraint
    /// ```
    public static int getType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getType].
    public final int getType() {
    	return getType(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the sub type of a constraint
    /// ```
    public static int getSubType(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_SUB_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubType].
    public final int getSubType() {
    	return getSubType(
    		this.segment
    	);
    }
    
    /// ```
    /// Priority of the constraint when solving. Higher numbers have are more likely to be solved correctly.
    /// Note that if you want a deterministic simulation and you cannot guarantee the order in which constraints are added/removed, you can make the priority for all constraints unique to get a deterministic ordering.
    /// ```
    public static int getConstraintPriority(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_CONSTRAINT_PRIORITY.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintPriority].
    public final int getConstraintPriority() {
    	return getConstraintPriority(
    		this.segment
    	);
    }
    
    public static void setConstraintPriority(
    	MemorySegment self,
    	int inPriority
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SET_CONSTRAINT_PRIORITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPriority
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConstraintPriority].
    public final void setConstraintPriority(
    	int inPriority
    ) {
    	setConstraintPriority(
    		this.segment,
    		inPriority
    	);
    }
    
    /// ```
    /// Used only when the constraint is active. Override for the number of solver velocity iterations to run, 0 means use the default in PhysicsSettings::mNumVelocitySteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static void setNumVelocityStepsOverride(
    	MemorySegment self,
    	int inN
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SET_NUM_VELOCITY_STEPS_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inN
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumVelocityStepsOverride].
    public final void setNumVelocityStepsOverride(
    	int inN
    ) {
    	setNumVelocityStepsOverride(
    		this.segment,
    		inN
    	);
    }
    
    public static int getNumVelocityStepsOverride(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_NUM_VELOCITY_STEPS_OVERRIDE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumVelocityStepsOverride].
    public final int getNumVelocityStepsOverride() {
    	return getNumVelocityStepsOverride(
    		this.segment
    	);
    }
    
    /// ```
    /// Used only when the constraint is active. Override for the number of solver position iterations to run, 0 means use the default in PhysicsSettings::mNumPositionSteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static void setNumPositionStepsOverride(
    	MemorySegment self,
    	int inN
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SET_NUM_POSITION_STEPS_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inN
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumPositionStepsOverride].
    public final void setNumPositionStepsOverride(
    	int inN
    ) {
    	setNumPositionStepsOverride(
    		this.segment,
    		inN
    	);
    }
    
    public static int getNumPositionStepsOverride(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_NUM_POSITION_STEPS_OVERRIDE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumPositionStepsOverride].
    public final int getNumPositionStepsOverride() {
    	return getNumPositionStepsOverride(
    		this.segment
    	);
    }
    
    /// ```
    /// Enable / disable this constraint. This can e.g. be used to implement a breakable constraint by detecting that the constraint impulse
    /// (see e.g. PointConstraint::GetTotalLambdaPosition) went over a certain limit and then disabling the constraint.
    /// Note that although a disabled constraint will not affect the simulation in any way anymore, it does incur some processing overhead.
    /// Alternatively you can remove a constraint from the constraint manager (which may be more costly if you want to disable the constraint for a short while).
    /// ```
    public static void setEnabled(
    	MemorySegment self,
    	boolean inEnabled
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SET_ENABLED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inEnabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEnabled].
    public final void setEnabled(
    	boolean inEnabled
    ) {
    	setEnabled(
    		this.segment,
    		inEnabled
    	);
    }
    
    /// ```
    /// Test if a constraint is enabled.
    /// ```
    public static boolean getEnabled(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEnabled].
    public final boolean getEnabled() {
    	return getEnabled(
    		this.segment
    	);
    }
    
    /// ```
    /// Access to the user data, can be used for anything by the application
    /// ```
    public static long getUserData(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUserData].
    public final long getUserData() {
    	return getUserData(
    		this.segment
    	);
    }
    
    public static void setUserData(
    	MemorySegment self,
    	long inUserData
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SET_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUserData].
    public final void setUserData(
    	long inUserData
    ) {
    	setUserData(
    		this.segment,
    		inUserData
    	);
    }
    
    /// ```
    /// Notify the constraint that the shape of a body has changed and that its center of mass has moved by inDeltaCOM.
    /// Bodies don't know which constraints are connected to them so the user is responsible for notifying the relevant constraints when a body changes.
    /// @param inBodyID ID of the body that has changed
    /// @param inDeltaCOM The delta of the center of mass of the body (shape->GetCenterOfMass() - shape_before_change->GetCenterOfMass())
    /// ```
    public static void notifyShapeChanged(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inDeltaCOM
    ) {
    	MethodHandle method = JPH_CONSTRAINT_NOTIFY_SHAPE_CHANGED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inDeltaCOM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#notifyShapeChanged].
    public final void notifyShapeChanged(
    	BodyID inBodyID,
    	Vec3 inDeltaCOM
    ) {
    	notifyShapeChanged(
    		this.segment,
    		inBodyID.memorySegment(),
    		inDeltaCOM.memorySegment()
    	);
    }
    
    /// ```
    /// Notify the system that the configuration of the bodies and/or constraint has changed enough so that the warm start impulses should not be applied the next frame.
    /// You can use this function for example when repositioning a ragdoll through Ragdoll::SetPose in such a way that the orientation of the bodies completely changes so that
    /// the previous frame impulses are no longer a good approximation of what the impulses will be in the next frame. Calling this function when there are no big changes
    /// will result in the constraints being much 'softer' than usual so they are more easily violated (e.g. a long chain of bodies might sag a bit if you call this every frame).
    /// ```
    public static void resetWarmStart(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_RESET_WARM_START.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetWarmStart].
    public final void resetWarmStart() {
    	resetWarmStart(
    		this.segment
    	);
    }
    
    /// ```
    /// @name Solver interface
    /// @{
    /// ```
    public static boolean isActive(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_IS_ACTIVE.get();
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
    
    public static void setupVelocityConstraint(
    	MemorySegment self,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SETUP_VELOCITY_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setupVelocityConstraint].
    public final void setupVelocityConstraint(
    	float inDeltaTime
    ) {
    	setupVelocityConstraint(
    		this.segment,
    		inDeltaTime
    	);
    }
    
    public static void warmStartVelocityConstraint(
    	MemorySegment self,
    	float inWarmStartImpulseRatio
    ) {
    	MethodHandle method = JPH_CONSTRAINT_WARM_START_VELOCITY_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inWarmStartImpulseRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#warmStartVelocityConstraint].
    public final void warmStartVelocityConstraint(
    	float inWarmStartImpulseRatio
    ) {
    	warmStartVelocityConstraint(
    		this.segment,
    		inWarmStartImpulseRatio
    	);
    }
    
    public static boolean solveVelocityConstraint(
    	MemorySegment self,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SOLVE_VELOCITY_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solveVelocityConstraint].
    public final boolean solveVelocityConstraint(
    	float inDeltaTime
    ) {
    	return solveVelocityConstraint(
    		this.segment,
    		inDeltaTime
    	);
    }
    
    public static boolean solvePositionConstraint(
    	MemorySegment self,
    	float inDeltaTime,
    	float inBaumgarte
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SOLVE_POSITION_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inDeltaTime,
    			inBaumgarte
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solvePositionConstraint].
    public final boolean solvePositionConstraint(
    	float inDeltaTime,
    	float inBaumgarte
    ) {
    	return solvePositionConstraint(
    		this.segment,
    		inDeltaTime,
    		inBaumgarte
    	);
    }
    
    public static void drawConstraint(
    	MemorySegment self,
    	MemorySegment inRenderer
    ) {
    	MethodHandle method = JPH_CONSTRAINT_DRAW_CONSTRAINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawConstraint].
    public final void drawConstraint(
    	DebugRenderer inRenderer
    ) {
    	drawConstraint(
    		this.segment,
    		inRenderer.memorySegment()
    	);
    }
    
    public static void drawConstraintLimits(
    	MemorySegment self,
    	MemorySegment inRenderer
    ) {
    	MethodHandle method = JPH_CONSTRAINT_DRAW_CONSTRAINT_LIMITS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawConstraintLimits].
    public final void drawConstraintLimits(
    	DebugRenderer inRenderer
    ) {
    	drawConstraintLimits(
    		this.segment,
    		inRenderer.memorySegment()
    	);
    }
    
    public static void drawConstraintReferenceFrame(
    	MemorySegment self,
    	MemorySegment inRenderer
    ) {
    	MethodHandle method = JPH_CONSTRAINT_DRAW_CONSTRAINT_REFERENCE_FRAME.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRenderer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#drawConstraintReferenceFrame].
    public final void drawConstraintReferenceFrame(
    	DebugRenderer inRenderer
    ) {
    	drawConstraintReferenceFrame(
    		this.segment,
    		inRenderer.memorySegment()
    	);
    }
    
    /// ```
    /// Size of constraint when drawing it through the debug renderer
    /// ```
    public static float getDrawConstraintSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_DRAW_CONSTRAINT_SIZE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrawConstraintSize].
    public final float getDrawConstraintSize() {
    	return getDrawConstraintSize(
    		this.segment
    	);
    }
    
    public static void setDrawConstraintSize(
    	MemorySegment self,
    	float inSize
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SET_DRAW_CONSTRAINT_SIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrawConstraintSize].
    public final void setDrawConstraintSize(
    	float inSize
    ) {
    	setDrawConstraintSize(
    		this.segment,
    		inSize
    	);
    }
    
    /// ```
    /// Saving state for replay
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CONSTRAINT_SAVE_STATE.get();
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
    /// Restoring state for replay
    /// ```
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_CONSTRAINT_RESTORE_STATE.get();
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
    
    /// ```
    /// Debug function to convert a constraint to its settings, note that this will not save to which bodies the constraint is connected to
    /// ```
    public static void getConstraintSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONSTRAINT_GET_CONSTRAINT_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintSettings].
    public final void getConstraintSettings(
    	ConstraintSettingsRef outResult
    ) {
    	getConstraintSettings(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONSTRAINT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public final void destroy() {
    	destroy(
    		this.segment
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