/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.constraints;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.vehicle.CombineFunction;
import volucris.bindings.jolt.vehicle.StepCallback;
import volucris.bindings.jolt.vehicle.VehicleAntiRollBarArray;
import volucris.bindings.jolt.vehicle.VehicleCollisionTester;
import volucris.bindings.jolt.vehicle.VehicleController;
import volucris.bindings.jolt.vehicle.Wheel;
import volucris.bindings.jolt.vehicle.WheelsArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleConstraint extends Constraint {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_AS_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_MAX_PITCH_ROLL_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_COLLISION_TESTER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_COMBINE_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_COMBINE_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_PRE_STEP_CALLBACK;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_PRE_STEP_CALLBACK;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_POST_COLLIDE_CALLBACK;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_POST_COLLIDE_CALLBACK;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_POST_STEP_CALLBACK;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_POST_STEP_CALLBACK;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER1;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEELS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEELS1;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL1;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_ANTI_ROLL_BARS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_ANTI_ROLL_BARS1;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_NUM_STEPS_BETWEEN_COLLISION_TEST_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_NUM_STEPS_BETWEEN_COLLISION_TEST_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_SET_NUM_STEPS_BETWEEN_COLLISION_TEST_INACTIVE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONSTRAINT_GET_NUM_STEPS_BETWEEN_COLLISION_TEST_INACTIVE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_CONSTRAINT_CREATE = downcallHandle("JPH_VehicleConstraint_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_AS_CONSTRAINT = downcallHandle("JPH_VehicleConstraint_AsConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER = downcallHandle("JPH_VehicleConstraint_AsPhysicsStepListener", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE = downcallHandleVoid("JPH_VehicleConstraint_SetMaxPitchRollAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_CONSTRAINT_GET_MAX_PITCH_ROLL_ANGLE = downcallHandle("JPH_VehicleConstraint_GetMaxPitchRollAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER = downcallHandleVoid("JPH_VehicleConstraint_SetVehicleCollisionTester", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_COLLISION_TESTER = downcallHandle("JPH_VehicleConstraint_GetVehicleCollisionTester", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_COMBINE_FRICTION = downcallHandleVoid("JPH_VehicleConstraint_SetCombineFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_COMBINE_FRICTION = downcallHandle("JPH_VehicleConstraint_GetCombineFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_PRE_STEP_CALLBACK = downcallHandle("JPH_VehicleConstraint_GetPreStepCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_PRE_STEP_CALLBACK = downcallHandleVoid("JPH_VehicleConstraint_SetPreStepCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_POST_COLLIDE_CALLBACK = downcallHandle("JPH_VehicleConstraint_GetPostCollideCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_POST_COLLIDE_CALLBACK = downcallHandleVoid("JPH_VehicleConstraint_SetPostCollideCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_POST_STEP_CALLBACK = downcallHandle("JPH_VehicleConstraint_GetPostStepCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_POST_STEP_CALLBACK = downcallHandleVoid("JPH_VehicleConstraint_SetPostStepCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY = downcallHandleVoid("JPH_VehicleConstraint_OverrideGravity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN = downcallHandle("JPH_VehicleConstraint_IsGravityOverridden", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE = downcallHandleVoid("JPH_VehicleConstraint_GetGravityOverride", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE = downcallHandleVoid("JPH_VehicleConstraint_ResetGravityOverride", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD = downcallHandleVoid("JPH_VehicleConstraint_GetLocalForward", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP = downcallHandleVoid("JPH_VehicleConstraint_GetLocalUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP = downcallHandleVoid("JPH_VehicleConstraint_GetWorldUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY = downcallHandle("JPH_VehicleConstraint_GetVehicleBody", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER = downcallHandle("JPH_VehicleConstraint_GetController", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER1 = downcallHandle("JPH_VehicleConstraint_GetController1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEELS = downcallHandle("JPH_VehicleConstraint_GetWheels", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEELS1 = downcallHandle("JPH_VehicleConstraint_GetWheels1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL = downcallHandle("JPH_VehicleConstraint_GetWheel", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL1 = downcallHandle("JPH_VehicleConstraint_GetWheel1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS = downcallHandleVoid("JPH_VehicleConstraint_GetWheelLocalBasis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM = downcallHandleVoid("JPH_VehicleConstraint_GetWheelLocalTransform", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM = downcallHandleVoid("JPH_VehicleConstraint_GetWheelWorldTransform", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_ANTI_ROLL_BARS = downcallHandle("JPH_VehicleConstraint_GetAntiRollBars", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_GET_ANTI_ROLL_BARS1 = downcallHandle("JPH_VehicleConstraint_GetAntiRollBars1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_NUM_STEPS_BETWEEN_COLLISION_TEST_ACTIVE = downcallHandleVoid("JPH_VehicleConstraint_SetNumStepsBetweenCollisionTestActive", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_CONSTRAINT_GET_NUM_STEPS_BETWEEN_COLLISION_TEST_ACTIVE = downcallHandle("JPH_VehicleConstraint_GetNumStepsBetweenCollisionTestActive", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONSTRAINT_SET_NUM_STEPS_BETWEEN_COLLISION_TEST_INACTIVE = downcallHandleVoid("JPH_VehicleConstraint_SetNumStepsBetweenCollisionTestInactive", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_CONSTRAINT_GET_NUM_STEPS_BETWEEN_COLLISION_TEST_INACTIVE = downcallHandle("JPH_VehicleConstraint_GetNumStepsBetweenCollisionTestInactive", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleConstraint(
	    Body inVehicleBody,
	    VehicleConstraintSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inVehicleBody,
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public VehicleConstraint(
		Arena arena,
		Body inVehicleBody,
		VehicleConstraintSettings inSettings
	) {
		MemorySegment segment = create(
			inVehicleBody.memorySegment(),
			inSettings.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConstraint(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public VehicleConstraint(MemorySegment segment) {
		this.segment = segment;
		super(asConstraint(segment));
	}

    /// ```
    /// Constructor / destructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inVehicleBody,
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inVehicleBody,
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asConstraint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_AS_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asPhysicsStepListener(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_AS_PHYSICS_STEP_LISTENER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Defines the maximum pitch/roll angle (rad), can be used to avoid the car from getting upside down. The vehicle up direction will stay within a cone centered around the up axis with half top angle mMaxPitchRollAngle, set to pi to turn off.
    /// ```
    public static void setMaxPitchRollAngle(
    	MemorySegment self,
    	float inMaxPitchRollAngle
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_MAX_PITCH_ROLL_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaxPitchRollAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxPitchRollAngle].
    public final void setMaxPitchRollAngle(
    	float inMaxPitchRollAngle
    ) {
    	setMaxPitchRollAngle(
    		this.segment,
    		inMaxPitchRollAngle
    	);
    }
    
    public static float getMaxPitchRollAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_MAX_PITCH_ROLL_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxPitchRollAngle].
    public final float getMaxPitchRollAngle() {
    	return getMaxPitchRollAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the interface that tests collision between wheel and ground
    /// ```
    public static void setVehicleCollisionTester(
    	MemorySegment self,
    	MemorySegment inTester
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_VEHICLE_COLLISION_TESTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTester
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setVehicleCollisionTester].
    public final void setVehicleCollisionTester(
    	VehicleCollisionTester inTester
    ) {
    	setVehicleCollisionTester(
    		this.segment,
    		inTester.memorySegment()
    	);
    }
    
    public static MemorySegment getVehicleCollisionTester(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_COLLISION_TESTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVehicleCollisionTester].
    public final @Nullable VehicleCollisionTester getVehicleCollisionTester() {
    	MemorySegment segment = getVehicleCollisionTester(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleCollisionTester(segment);
    }
    
    /// ```
    /// Set the function that combines the friction of two bodies and returns it
    /// Default method is the geometric mean: sqrt(friction1 * friction2).
    /// ```
    public static void setCombineFriction(
    	MemorySegment self,
    	MemorySegment inCombineFriction
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_COMBINE_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCombineFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCombineFriction].
    public final void setCombineFriction(
    	CombineFunction inCombineFriction
    ) {
    	setCombineFriction(
    		this.segment,
    		inCombineFriction.memorySegment()
    	);
    }
    
    public static MemorySegment getCombineFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_COMBINE_FRICTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCombineFriction].
    public final @Nullable CombineFunction getCombineFriction() {
    	MemorySegment segment = getCombineFriction(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CombineFunction(segment);
    }
    
    /// ```
    /// Callback function to notify that PhysicsStepListener::OnStep has started for this vehicle. Default is to do nothing.
    /// Can be used to allow higher-level code to e.g. control steering. This is the last moment that the position/orientation of the vehicle can be changed.
    /// Wheel collision checks have not been performed yet.
    /// ```
    public static MemorySegment getPreStepCallback(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_PRE_STEP_CALLBACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPreStepCallback].
    public final @Nullable StepCallback getPreStepCallback() {
    	MemorySegment segment = getPreStepCallback(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StepCallback(segment);
    }
    
    public static void setPreStepCallback(
    	MemorySegment self,
    	MemorySegment inPreStepCallback
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_PRE_STEP_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPreStepCallback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPreStepCallback].
    public final void setPreStepCallback(
    	StepCallback inPreStepCallback
    ) {
    	setPreStepCallback(
    		this.segment,
    		inPreStepCallback.memorySegment()
    	);
    }
    
    /// ```
    /// Callback function to notify that PhysicsStepListener::OnStep has just completed wheel collision checks. Default is to do nothing.
    /// Can be used to allow higher-level code to e.g. detect tire contact or to modify the velocity of the vehicle based on the wheel contacts.
    /// You should not change the position of the vehicle in this callback as the wheel collision checks have already been performed.
    /// ```
    public static MemorySegment getPostCollideCallback(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_POST_COLLIDE_CALLBACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPostCollideCallback].
    public final @Nullable StepCallback getPostCollideCallback() {
    	MemorySegment segment = getPostCollideCallback(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StepCallback(segment);
    }
    
    public static void setPostCollideCallback(
    	MemorySegment self,
    	MemorySegment inPostCollideCallback
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_POST_COLLIDE_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPostCollideCallback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPostCollideCallback].
    public final void setPostCollideCallback(
    	StepCallback inPostCollideCallback
    ) {
    	setPostCollideCallback(
    		this.segment,
    		inPostCollideCallback.memorySegment()
    	);
    }
    
    /// ```
    /// Callback function to notify that PhysicsStepListener::OnStep has completed for this vehicle. Default is to do nothing.
    /// Can be used to allow higher-level code to e.g. control the vehicle in the air.
    /// You should not change the position of the vehicle in this callback as the wheel collision checks have already been performed.
    /// ```
    public static MemorySegment getPostStepCallback(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_POST_STEP_CALLBACK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPostStepCallback].
    public final @Nullable StepCallback getPostStepCallback() {
    	MemorySegment segment = getPostStepCallback(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StepCallback(segment);
    }
    
    public static void setPostStepCallback(
    	MemorySegment self,
    	MemorySegment inPostStepCallback
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_POST_STEP_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPostStepCallback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPostStepCallback].
    public final void setPostStepCallback(
    	StepCallback inPostStepCallback
    ) {
    	setPostStepCallback(
    		this.segment,
    		inPostStepCallback.memorySegment()
    	);
    }
    
    /// ```
    /// Override gravity for this vehicle. Note that overriding gravity will set the gravity factor of the vehicle body to 0 and apply gravity in the PhysicsStepListener instead.
    /// ```
    public static void overrideGravity(
    	MemorySegment self,
    	MemorySegment inGravity
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_OVERRIDE_GRAVITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inGravity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#overrideGravity].
    public final void overrideGravity(
    	Vec3 inGravity
    ) {
    	overrideGravity(
    		this.segment,
    		inGravity.memorySegment()
    	);
    }
    
    public static boolean isGravityOverridden(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_IS_GRAVITY_OVERRIDDEN.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isGravityOverridden].
    public final boolean isGravityOverridden() {
    	return isGravityOverridden(
    		this.segment
    	);
    }
    
    public static void getGravityOverride(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_GRAVITY_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGravityOverride].
    public final void getGravityOverride(
    	Vec3 outResult
    ) {
    	getGravityOverride(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void resetGravityOverride(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_RESET_GRAVITY_OVERRIDE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetGravityOverride].
    public final void resetGravityOverride() {
    	resetGravityOverride(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the local space forward vector of the vehicle
    /// ```
    public static void getLocalForward(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_LOCAL_FORWARD.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalForward].
    public final void getLocalForward(
    	Vec3 outResult
    ) {
    	getLocalForward(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the local space up vector of the vehicle
    /// ```
    public static void getLocalUp(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_LOCAL_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalUp].
    public final void getLocalUp(
    	Vec3 outResult
    ) {
    	getLocalUp(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Vector indicating the world space up direction (used to limit vehicle pitch/roll), calculated every frame by inverting gravity
    /// ```
    public static void getWorldUp(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WORLD_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldUp].
    public final void getWorldUp(
    	Vec3 outResult
    ) {
    	getWorldUp(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the vehicle body
    /// ```
    public static MemorySegment getVehicleBody(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_VEHICLE_BODY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVehicleBody].
    public final @Nullable Body getVehicleBody() {
    	MemorySegment segment = getVehicleBody(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Body(segment);
    }
    
    /// ```
    /// Access to the vehicle controller interface (determines acceleration / deceleration)
    /// ```
    public static MemorySegment getController(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getController].
    public final @Nullable VehicleController getController() {
    	MemorySegment segment = getController(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleController(segment);
    }
    
    /// ```
    /// Access to the vehicle controller interface (determines acceleration / deceleration)
    /// ```
    public static MemorySegment getController1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_CONTROLLER1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getController1].
    public final @Nullable VehicleController getController1() {
    	MemorySegment segment = getController1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleController(segment);
    }
    
    /// ```
    /// Get the state of the wheels
    /// ```
    public static MemorySegment getWheels(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEELS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheels].
    public final @Nullable WheelsArray getWheels() {
    	MemorySegment segment = getWheels(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WheelsArray(segment);
    }
    
    /// ```
    /// Get the state of a wheels (writable interface, allows you to make changes to the configuration which will take effect the next time step)
    /// ```
    public static MemorySegment getWheels1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEELS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheels1].
    public final @Nullable WheelsArray getWheels1() {
    	MemorySegment segment = getWheels1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WheelsArray(segment);
    }
    
    /// ```
    /// Get the state of a wheel
    /// ```
    public static MemorySegment getWheel(
    	MemorySegment self,
    	int inIdx
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheel].
    public final @Nullable Wheel getWheel(
    	int inIdx
    ) {
    	MemorySegment segment = getWheel(
    		this.segment,
    		inIdx
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Wheel(segment);
    }
    
    public static MemorySegment getWheel1(
    	MemorySegment self,
    	int inIdx
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheel1].
    public final @Nullable Wheel getWheel1(
    	int inIdx
    ) {
    	MemorySegment segment = getWheel1(
    		this.segment,
    		inIdx
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Wheel(segment);
    }
    
    /// ```
    /// Get the basis vectors for the wheel in local space to the vehicle body (note: basis does not rotate when the wheel rotates around its axis)
    /// @param inWheel Wheel to fetch basis for
    /// @param outForward Forward vector for the wheel
    /// @param outUp Up vector for the wheel
    /// @param outRight Right vector for the wheel
    /// ```
    public static void getWheelLocalBasis(
    	MemorySegment self,
    	MemorySegment inWheel,
    	MemorySegment outForward,
    	MemorySegment outUp,
    	MemorySegment outRight
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_BASIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inWheel,
    			outForward,
    			outUp,
    			outRight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelLocalBasis].
    public final void getWheelLocalBasis(
    	Wheel inWheel,
    	Vec3 outForward,
    	Vec3 outUp,
    	Vec3 outRight
    ) {
    	getWheelLocalBasis(
    		this.segment,
    		inWheel.memorySegment(),
    		outForward.memorySegment(),
    		outUp.memorySegment(),
    		outRight.memorySegment()
    	);
    }
    
    /// ```
    /// Get the transform of a wheel in local space to the vehicle body, returns a matrix that transforms a cylinder aligned with the Y axis in body space (not COM space)
    /// @param inWheelIndex Index of the wheel to fetch
    /// @param inWheelRight Unit vector that indicates right in model space of the wheel (so if you only have 1 wheel model, you probably want to specify the opposite direction for the left and right wheels)
    /// @param inWheelUp Unit vector that indicates up in model space of the wheel
    /// ```
    public static void getWheelLocalTransform(
    	MemorySegment self,
    	int inWheelIndex,
    	MemorySegment inWheelRight,
    	MemorySegment inWheelUp,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_LOCAL_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inWheelIndex,
    			inWheelRight,
    			inWheelUp,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelLocalTransform].
    public final void getWheelLocalTransform(
    	int inWheelIndex,
    	Vec3 inWheelRight,
    	Vec3 inWheelUp,
    	Mat44 outResult
    ) {
    	getWheelLocalTransform(
    		this.segment,
    		inWheelIndex,
    		inWheelRight.memorySegment(),
    		inWheelUp.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the transform of a wheel in world space, returns a matrix that transforms a cylinder aligned with the Y axis in world space
    /// @param inWheelIndex Index of the wheel to fetch
    /// @param inWheelRight Unit vector that indicates right in model space of the wheel (so if you only have 1 wheel model, you probably want to specify the opposite direction for the left and right wheels)
    /// @param inWheelUp Unit vector that indicates up in model space of the wheel
    /// ```
    public static void getWheelWorldTransform(
    	MemorySegment self,
    	int inWheelIndex,
    	MemorySegment inWheelRight,
    	MemorySegment inWheelUp,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_WHEEL_WORLD_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inWheelIndex,
    			inWheelRight,
    			inWheelUp,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelWorldTransform].
    public final void getWheelWorldTransform(
    	int inWheelIndex,
    	Vec3 inWheelRight,
    	Vec3 inWheelUp,
    	Mat44 outResult
    ) {
    	getWheelWorldTransform(
    		this.segment,
    		inWheelIndex,
    		inWheelRight.memorySegment(),
    		inWheelUp.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the vehicle's anti roll bars
    /// ```
    public static MemorySegment getAntiRollBars(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_ANTI_ROLL_BARS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAntiRollBars].
    public final @Nullable VehicleAntiRollBarArray getAntiRollBars() {
    	MemorySegment segment = getAntiRollBars(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleAntiRollBarArray(segment);
    }
    
    public static MemorySegment getAntiRollBars1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_ANTI_ROLL_BARS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAntiRollBars1].
    public final @Nullable VehicleAntiRollBarArray getAntiRollBars1() {
    	MemorySegment segment = getAntiRollBars1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleAntiRollBarArray(segment);
    }
    
    /// ```
    /// Number of simulation steps between wheel collision tests when the vehicle is active. Default is 1. 0 = never, 1 = every step, 2 = every other step, etc.
    /// Note that if a vehicle has multiple wheels and the number of steps > 1, the wheels will be tested in a round robin fashion.
    /// If there are multiple vehicles, the tests will be spread out based on the BodyID of the vehicle.
    /// If you set this to test less than every step, you may see simulation artifacts. This setting can be used to reduce the cost of simulating vehicles in the distance.
    /// ```
    public static void setNumStepsBetweenCollisionTestActive(
    	MemorySegment self,
    	int inSteps
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_NUM_STEPS_BETWEEN_COLLISION_TEST_ACTIVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSteps
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumStepsBetweenCollisionTestActive].
    public final void setNumStepsBetweenCollisionTestActive(
    	int inSteps
    ) {
    	setNumStepsBetweenCollisionTestActive(
    		this.segment,
    		inSteps
    	);
    }
    
    public static int getNumStepsBetweenCollisionTestActive(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_NUM_STEPS_BETWEEN_COLLISION_TEST_ACTIVE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumStepsBetweenCollisionTestActive].
    public final int getNumStepsBetweenCollisionTestActive() {
    	return getNumStepsBetweenCollisionTestActive(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of simulation steps between wheel collision tests when the vehicle is inactive. Default is 1. 0 = never, 1 = every step, 2 = every other step, etc.
    /// Note that if a vehicle has multiple wheels and the number of steps > 1, the wheels will be tested in a round robin fashion.
    /// If there are multiple vehicles, the tests will be spread out based on the BodyID of the vehicle.
    /// This number can be lower than the number of steps when the vehicle is active as the only purpose of this test is
    /// to allow the vehicle to wake up in response to bodies moving into the wheels but not touching the body of the vehicle.
    /// ```
    public static void setNumStepsBetweenCollisionTestInactive(
    	MemorySegment self,
    	int inSteps
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_SET_NUM_STEPS_BETWEEN_COLLISION_TEST_INACTIVE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSteps
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumStepsBetweenCollisionTestInactive].
    public final void setNumStepsBetweenCollisionTestInactive(
    	int inSteps
    ) {
    	setNumStepsBetweenCollisionTestInactive(
    		this.segment,
    		inSteps
    	);
    }
    
    public static int getNumStepsBetweenCollisionTestInactive(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONSTRAINT_GET_NUM_STEPS_BETWEEN_COLLISION_TEST_INACTIVE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumStepsBetweenCollisionTestInactive].
    public final int getNumStepsBetweenCollisionTestInactive() {
    	return getNumStepsBetweenCollisionTestInactive(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}