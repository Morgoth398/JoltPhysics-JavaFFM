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

public final class AxisConstraintPart {

	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_CREATE;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_FREQUENCY_AND_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_STIFFNESS_AND_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_SETTINGS_FOR_LIMIT;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_SETTINGS_FOR_MOTOR;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_DEACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_AXIS_CONSTRAINT_PART_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_AXIS_CONSTRAINT_PART_CREATE = downcallHandle("JPH_AxisConstraintPart_Create", UNBOUNDED_ADDRESS);
		JPH_AXIS_CONSTRAINT_PART_DESTROY = downcallHandleVoid("JPH_AxisConstraintPart_Destroy", UNBOUNDED_ADDRESS);
		JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES = downcallHandleVoid("JPH_AxisConstraintPart_CalculateConstraintProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_FREQUENCY_AND_DAMPING = downcallHandleVoid("JPH_AxisConstraintPart_CalculateConstraintPropertiesWithFrequencyAndDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_STIFFNESS_AND_DAMPING = downcallHandleVoid("JPH_AxisConstraintPart_CalculateConstraintPropertiesWithStiffnessAndDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_SETTINGS_FOR_LIMIT = downcallHandleVoid("JPH_AxisConstraintPart_CalculateConstraintPropertiesWithSettingsForLimit", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_SETTINGS_FOR_MOTOR = downcallHandleVoid("JPH_AxisConstraintPart_CalculateConstraintPropertiesWithSettingsForMotor", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_AXIS_CONSTRAINT_PART_DEACTIVATE = downcallHandleVoid("JPH_AxisConstraintPart_Deactivate", UNBOUNDED_ADDRESS);
		JPH_AXIS_CONSTRAINT_PART_IS_ACTIVE = downcallHandle("JPH_AxisConstraintPart_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_AXIS_CONSTRAINT_PART_WARM_START = downcallHandleVoid("JPH_AxisConstraintPart_WarmStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT = downcallHandle("JPH_AxisConstraintPart_SolveVelocityConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA = downcallHandle("JPH_AxisConstraintPart_GetTotalLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT = downcallHandle("JPH_AxisConstraintPart_SolvePositionConstraint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_AXIS_CONSTRAINT_PART_SAVE_STATE = downcallHandleVoid("JPH_AxisConstraintPart_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_AXIS_CONSTRAINT_PART_RESTORE_STATE = downcallHandleVoid("JPH_AxisConstraintPart_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public AxisConstraintPart() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public AxisConstraintPart(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public AxisConstraintPart(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Calculate properties used during the functions below. Creates a constraint without spring.
    /// @param inBody1 The first body that this constraint is attached to
    /// @param inBody2 The second body that this constraint is attached to
    /// @param inR1PlusU See equations above (r1 + u)
    /// @param inR2 See equations above (r2)
    /// @param inWorldSpaceAxis Axis along which the constraint acts (normalized, pointing from body 1 to 2)
    /// @param inBias Bias term (b) for the constraint impulse: lambda = J v + b
    /// ```
    public static void calculateConstraintProperties(
    	MemorySegment self,
    	MemorySegment inBody1,
    	MemorySegment inR1PlusU,
    	MemorySegment inBody2,
    	MemorySegment inR2,
    	MemorySegment inWorldSpaceAxis,
    	float inBias
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBody1,
    			inR1PlusU,
    			inBody2,
    			inR2,
    			inWorldSpaceAxis,
    			inBias
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintProperties].
    public final void calculateConstraintProperties(
    	Body inBody1,
    	Vec3 inR1PlusU,
    	Body inBody2,
    	Vec3 inR2,
    	Vec3 inWorldSpaceAxis,
    	float inBias
    ) {
    	calculateConstraintProperties(
    		this.segment,
    		inBody1.memorySegment(),
    		inR1PlusU.memorySegment(),
    		inBody2.memorySegment(),
    		inR2.memorySegment(),
    		inWorldSpaceAxis.memorySegment(),
    		inBias
    	);
    }
    
    /// ```
    /// Calculate properties used during the functions below. Set inFrequency to zero if you don't want to drive using a spring.
    /// @param inDeltaTime Time step
    /// @param inBody1 The first body that this constraint is attached to
    /// @param inBody2 The second body that this constraint is attached to
    /// @param inR1PlusU See equations above (r1 + u)
    /// @param inR2 See equations above (r2)
    /// @param inWorldSpaceAxis Axis along which the constraint acts (normalized, pointing from body 1 to 2)
    /// @param inBias Bias term (b) for the constraint impulse: lambda = J v + b
    /// @param inC Value of the constraint equation (C).
    /// @param inFrequency Oscillation frequency (Hz).
    /// @param inDamping Damping factor (0 = no damping, 1 = critical damping).
    /// ```
    public static void calculateConstraintPropertiesWithFrequencyAndDamping(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment inBody1,
    	MemorySegment inR1PlusU,
    	MemorySegment inBody2,
    	MemorySegment inR2,
    	MemorySegment inWorldSpaceAxis,
    	float inBias,
    	float inC,
    	float inFrequency,
    	float inDamping
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_FREQUENCY_AND_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inBody1,
    			inR1PlusU,
    			inBody2,
    			inR2,
    			inWorldSpaceAxis,
    			inBias,
    			inC,
    			inFrequency,
    			inDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintPropertiesWithFrequencyAndDamping].
    public final void calculateConstraintPropertiesWithFrequencyAndDamping(
    	float inDeltaTime,
    	Body inBody1,
    	Vec3 inR1PlusU,
    	Body inBody2,
    	Vec3 inR2,
    	Vec3 inWorldSpaceAxis,
    	float inBias,
    	float inC,
    	float inFrequency,
    	float inDamping
    ) {
    	calculateConstraintPropertiesWithFrequencyAndDamping(
    		this.segment,
    		inDeltaTime,
    		inBody1.memorySegment(),
    		inR1PlusU.memorySegment(),
    		inBody2.memorySegment(),
    		inR2.memorySegment(),
    		inWorldSpaceAxis.memorySegment(),
    		inBias,
    		inC,
    		inFrequency,
    		inDamping
    	);
    }
    
    /// ```
    /// Calculate properties used during the functions below. Set inFrequency and inDamping to zero if you don't want to drive using a spring.
    /// @param inDeltaTime Time step
    /// @param inBody1 The first body that this constraint is attached to
    /// @param inBody2 The second body that this constraint is attached to
    /// @param inR1PlusU See equations above (r1 + u)
    /// @param inR2 See equations above (r2)
    /// @param inWorldSpaceAxis Axis along which the constraint acts (normalized, pointing from body 1 to 2)
    /// @param inBias Bias term (b) for the constraint impulse: lambda = J v + b
    /// @param inC Value of the constraint equation (C).
    /// @param inStiffness Spring stiffness k.
    /// @param inDamping Spring damping coefficient c.
    /// ```
    public static void calculateConstraintPropertiesWithStiffnessAndDamping(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment inBody1,
    	MemorySegment inR1PlusU,
    	MemorySegment inBody2,
    	MemorySegment inR2,
    	MemorySegment inWorldSpaceAxis,
    	float inBias,
    	float inC,
    	float inStiffness,
    	float inDamping
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_STIFFNESS_AND_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inBody1,
    			inR1PlusU,
    			inBody2,
    			inR2,
    			inWorldSpaceAxis,
    			inBias,
    			inC,
    			inStiffness,
    			inDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintPropertiesWithStiffnessAndDamping].
    public final void calculateConstraintPropertiesWithStiffnessAndDamping(
    	float inDeltaTime,
    	Body inBody1,
    	Vec3 inR1PlusU,
    	Body inBody2,
    	Vec3 inR2,
    	Vec3 inWorldSpaceAxis,
    	float inBias,
    	float inC,
    	float inStiffness,
    	float inDamping
    ) {
    	calculateConstraintPropertiesWithStiffnessAndDamping(
    		this.segment,
    		inDeltaTime,
    		inBody1.memorySegment(),
    		inR1PlusU.memorySegment(),
    		inBody2.memorySegment(),
    		inR2.memorySegment(),
    		inWorldSpaceAxis.memorySegment(),
    		inBias,
    		inC,
    		inStiffness,
    		inDamping
    	);
    }
    
    /// ```
    /// Calculate properties used during the functions below based on inSpringSettings.
    /// Turns to a hard limit when inSpringSettings has stiffness / frequency = 0
    /// ```
    public static void calculateConstraintPropertiesWithSettingsForLimit(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment inBody1,
    	MemorySegment inR1PlusU,
    	MemorySegment inBody2,
    	MemorySegment inR2,
    	MemorySegment inWorldSpaceAxis,
    	float inBias,
    	float inC,
    	MemorySegment inSpringSettings
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_SETTINGS_FOR_LIMIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inBody1,
    			inR1PlusU,
    			inBody2,
    			inR2,
    			inWorldSpaceAxis,
    			inBias,
    			inC,
    			inSpringSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintPropertiesWithSettingsForLimit].
    public final void calculateConstraintPropertiesWithSettingsForLimit(
    	float inDeltaTime,
    	Body inBody1,
    	Vec3 inR1PlusU,
    	Body inBody2,
    	Vec3 inR2,
    	Vec3 inWorldSpaceAxis,
    	float inBias,
    	float inC,
    	SpringSettings inSpringSettings
    ) {
    	calculateConstraintPropertiesWithSettingsForLimit(
    		this.segment,
    		inDeltaTime,
    		inBody1.memorySegment(),
    		inR1PlusU.memorySegment(),
    		inBody2.memorySegment(),
    		inR2.memorySegment(),
    		inWorldSpaceAxis.memorySegment(),
    		inBias,
    		inC,
    		inSpringSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate properties used during the functions below based on inSpringSettings.
    /// Assumes the spring has either stiffness or damping.
    /// ```
    public static void calculateConstraintPropertiesWithSettingsForMotor(
    	MemorySegment self,
    	float inDeltaTime,
    	MemorySegment inBody1,
    	MemorySegment inR1PlusU,
    	MemorySegment inBody2,
    	MemorySegment inR2,
    	MemorySegment inWorldSpaceAxis,
    	float inBias,
    	float inC,
    	MemorySegment inSpringSettings
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_CALCULATE_CONSTRAINT_PROPERTIES_WITH_SETTINGS_FOR_MOTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaTime,
    			inBody1,
    			inR1PlusU,
    			inBody2,
    			inR2,
    			inWorldSpaceAxis,
    			inBias,
    			inC,
    			inSpringSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintPropertiesWithSettingsForMotor].
    public final void calculateConstraintPropertiesWithSettingsForMotor(
    	float inDeltaTime,
    	Body inBody1,
    	Vec3 inR1PlusU,
    	Body inBody2,
    	Vec3 inR2,
    	Vec3 inWorldSpaceAxis,
    	float inBias,
    	float inC,
    	SpringSettings inSpringSettings
    ) {
    	calculateConstraintPropertiesWithSettingsForMotor(
    		this.segment,
    		inDeltaTime,
    		inBody1.memorySegment(),
    		inR1PlusU.memorySegment(),
    		inBody2.memorySegment(),
    		inR2.memorySegment(),
    		inWorldSpaceAxis.memorySegment(),
    		inBias,
    		inC,
    		inSpringSettings.memorySegment()
    	);
    }
    
    /// ```
    /// Deactivate this constraint
    /// ```
    public static void deactivate(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_DEACTIVATE.get();
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
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_IS_ACTIVE.get();
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
    /// @param inWorldSpaceAxis Axis along which the constraint acts (normalized)
    /// @param inWarmStartImpulseRatio Ratio of new step to old time step (dt_new / dt_old) for scaling the lagrange multiplier of the previous frame
    /// ```
    public static void warmStart(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inWorldSpaceAxis,
    	float inWarmStartImpulseRatio
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_WARM_START.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inWorldSpaceAxis,
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
    	Vec3 inWorldSpaceAxis,
    	float inWarmStartImpulseRatio
    ) {
    	warmStart(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inWorldSpaceAxis.memorySegment(),
    		inWarmStartImpulseRatio
    	);
    }
    
    /// ```
    /// Iteratively update the velocity constraint. Makes sure d/dt C(...) = 0, where C is the constraint equation.
    /// @param ioBody1 The first body that this constraint is attached to
    /// @param ioBody2 The second body that this constraint is attached to
    /// @param inWorldSpaceAxis Axis along which the constraint acts (normalized)
    /// @param inMinLambda Minimum value of constraint impulse to apply (N s)
    /// @param inMaxLambda Maximum value of constraint impulse to apply (N s)
    /// ```
    public static boolean solveVelocityConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inWorldSpaceAxis,
    	float inMinLambda,
    	float inMaxLambda
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_SOLVE_VELOCITY_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inWorldSpaceAxis,
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
    	Vec3 inWorldSpaceAxis,
    	float inMinLambda,
    	float inMaxLambda
    ) {
    	return solveVelocityConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inWorldSpaceAxis.memorySegment(),
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
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_GET_TOTAL_LAMBDA.get();
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
    /// Iteratively update the position constraint. Makes sure C(...) = 0.
    /// @param ioBody1 The first body that this constraint is attached to
    /// @param ioBody2 The second body that this constraint is attached to
    /// @param inWorldSpaceAxis Axis along which the constraint acts (normalized)
    /// @param inC Value of the constraint equation (C)
    /// @param inBaumgarte Baumgarte constant (fraction of the error to correct)
    /// ```
    public static boolean solvePositionConstraint(
    	MemorySegment self,
    	MemorySegment ioBody1,
    	MemorySegment ioBody2,
    	MemorySegment inWorldSpaceAxis,
    	float inC,
    	float inBaumgarte
    ) {
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_SOLVE_POSITION_CONSTRAINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			ioBody1,
    			ioBody2,
    			inWorldSpaceAxis,
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
    	Vec3 inWorldSpaceAxis,
    	float inC,
    	float inBaumgarte
    ) {
    	return solvePositionConstraint(
    		this.segment,
    		ioBody1.memorySegment(),
    		ioBody2.memorySegment(),
    		inWorldSpaceAxis.memorySegment(),
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
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_SAVE_STATE.get();
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
    	MethodHandle method = JPH_AXIS_CONSTRAINT_PART_RESTORE_STATE.get();
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