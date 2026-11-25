/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StateRecorder;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.UVec4;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class MotionProperties {

	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_CREATE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INACTIVE_INDEX;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_MOTION_QUALITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_LINEAR_VELOCITY_CLAMPED;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_ANGULAR_VELOCITY_CLAMPED;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_MOVE_KINEMATIC;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_MAX_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_MAX_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_MAX_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_MAX_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_CLAMP_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_CLAMP_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_GRAVITY_FACTOR;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INVERSE_MASS;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_INVERSE_MASS;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SCALE_TO_MASS;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_LOCAL_SPACE_INVERSE_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_LOCAL_SPACE_INVERSE_INERTIA_UNCHECKED;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_FOR_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_MULTIPLY_WORLD_SPACE_INVERSE_INERTIA_BY_VECTOR;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_POINT_VELOCITY_COM;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ACCUMULATED_FORCE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ACCUMULATED_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_RESET_FORCE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_RESET_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_RESET_MOTION;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_LINEAR_DOFS_MASK;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_LOCK_TRANSLATION;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ANGULAR_DOFS_MASK;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_LOCK_ANGULAR;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_NUM_VELOCITY_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_NUM_POSITION_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_NUM_POSITION_STEPS_OVERRIDE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_APPLY_LINEAR_VELOCITY_STEP;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_ADD_LINEAR_VELOCITY_STEP;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SUB_LINEAR_VELOCITY_STEP;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_APPLY_ANGULAR_VELOCITY_STEP;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_ADD_ANGULAR_VELOCITY_STEP;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SUB_ANGULAR_VELOCITY_STEP;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_APPLY_GYROSCOPIC_FORCE_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_APPLY_FORCE_TORQUE_AND_DRAG_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_ISLAND_INDEX_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SET_ISLAND_INDEX_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_GET_INDEX_IN_ACTIVE_BODIES_INTERNAL;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_RESET_SLEEP_TEST_SPHERES;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_RESET_SLEEP_TEST_TIMER;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_ACCUMULATE_SLEEP_TIME;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_MOTION_PROPERTIES_RESTORE_STATE;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_MOTION_PROPERTIES_CREATE = downcallHandle("JPH_MotionProperties_Create", UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_DESTROY = downcallHandleVoid("JPH_MotionProperties_Destroy", UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_INACTIVE_INDEX = downcallHandle("JPH_MotionProperties_GetInactiveIndex", JAVA_INT);
		JPH_MOTION_PROPERTIES_GET_MOTION_QUALITY = downcallHandle("JPH_MotionProperties_GetMotionQuality", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS = downcallHandle("JPH_MotionProperties_GetAllowedDOFs", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_ALLOW_SLEEPING = downcallHandle("JPH_MotionProperties_GetAllowSleeping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_LINEAR_VELOCITY = downcallHandleVoid("JPH_MotionProperties_GetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_MotionProperties_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_LINEAR_VELOCITY_CLAMPED = downcallHandleVoid("JPH_MotionProperties_SetLinearVelocityClamped", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_MotionProperties_GetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_MotionProperties_SetAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_ANGULAR_VELOCITY_CLAMPED = downcallHandleVoid("JPH_MotionProperties_SetAngularVelocityClamped", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_MOVE_KINEMATIC = downcallHandleVoid("JPH_MotionProperties_MoveKinematic", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_MAX_LINEAR_VELOCITY = downcallHandle("JPH_MotionProperties_GetMaxLinearVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_MAX_LINEAR_VELOCITY = downcallHandleVoid("JPH_MotionProperties_SetMaxLinearVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_MAX_ANGULAR_VELOCITY = downcallHandle("JPH_MotionProperties_GetMaxAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_MAX_ANGULAR_VELOCITY = downcallHandleVoid("JPH_MotionProperties_SetMaxAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_CLAMP_LINEAR_VELOCITY = downcallHandleVoid("JPH_MotionProperties_ClampLinearVelocity", UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_CLAMP_ANGULAR_VELOCITY = downcallHandleVoid("JPH_MotionProperties_ClampAngularVelocity", UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING = downcallHandle("JPH_MotionProperties_GetLinearDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING = downcallHandleVoid("JPH_MotionProperties_SetLinearDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING = downcallHandle("JPH_MotionProperties_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_MotionProperties_SetAngularDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_GRAVITY_FACTOR = downcallHandle("JPH_MotionProperties_GetGravityFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_GRAVITY_FACTOR = downcallHandleVoid("JPH_MotionProperties_SetGravityFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES = downcallHandleVoid("JPH_MotionProperties_SetMassProperties", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_INVERSE_MASS = downcallHandle("JPH_MotionProperties_GetInverseMass", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED = downcallHandle("JPH_MotionProperties_GetInverseMassUnchecked", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_INVERSE_MASS = downcallHandleVoid("JPH_MotionProperties_SetInverseMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL = downcallHandleVoid("JPH_MotionProperties_GetInverseInertiaDiagonal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION = downcallHandleVoid("JPH_MotionProperties_GetInertiaRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA = downcallHandleVoid("JPH_MotionProperties_SetInverseInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SCALE_TO_MASS = downcallHandleVoid("JPH_MotionProperties_ScaleToMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_LOCAL_SPACE_INVERSE_INERTIA = downcallHandleVoid("JPH_MotionProperties_GetLocalSpaceInverseInertia", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_LOCAL_SPACE_INVERSE_INERTIA_UNCHECKED = downcallHandleVoid("JPH_MotionProperties_GetLocalSpaceInverseInertiaUnchecked", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_FOR_ROTATION = downcallHandleVoid("JPH_MotionProperties_GetInverseInertiaForRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_MULTIPLY_WORLD_SPACE_INVERSE_INERTIA_BY_VECTOR = downcallHandleVoid("JPH_MotionProperties_MultiplyWorldSpaceInverseInertiaByVector", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_POINT_VELOCITY_COM = downcallHandleVoid("JPH_MotionProperties_GetPointVelocityCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_ACCUMULATED_FORCE = downcallHandleVoid("JPH_MotionProperties_GetAccumulatedForce", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_ACCUMULATED_TORQUE = downcallHandleVoid("JPH_MotionProperties_GetAccumulatedTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_RESET_FORCE = downcallHandleVoid("JPH_MotionProperties_ResetForce", UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_RESET_TORQUE = downcallHandleVoid("JPH_MotionProperties_ResetTorque", UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_RESET_MOTION = downcallHandleVoid("JPH_MotionProperties_ResetMotion", UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_LINEAR_DOFS_MASK = downcallHandleVoid("JPH_MotionProperties_GetLinearDOFsMask", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_LOCK_TRANSLATION = downcallHandleVoid("JPH_MotionProperties_LockTranslation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_GET_ANGULAR_DOFS_MASK = downcallHandleVoid("JPH_MotionProperties_GetAngularDOFsMask", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_LOCK_ANGULAR = downcallHandleVoid("JPH_MotionProperties_LockAngular", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandleVoid("JPH_MotionProperties_SetNumVelocityStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_MOTION_PROPERTIES_GET_NUM_VELOCITY_STEPS_OVERRIDE = downcallHandle("JPH_MotionProperties_GetNumVelocityStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_NUM_POSITION_STEPS_OVERRIDE = downcallHandleVoid("JPH_MotionProperties_SetNumPositionStepsOverride", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_MOTION_PROPERTIES_GET_NUM_POSITION_STEPS_OVERRIDE = downcallHandle("JPH_MotionProperties_GetNumPositionStepsOverride", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_APPLY_LINEAR_VELOCITY_STEP = downcallHandleVoid("JPH_MotionProperties_ApplyLinearVelocityStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_ADD_LINEAR_VELOCITY_STEP = downcallHandleVoid("JPH_MotionProperties_AddLinearVelocityStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SUB_LINEAR_VELOCITY_STEP = downcallHandleVoid("JPH_MotionProperties_SubLinearVelocityStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_APPLY_ANGULAR_VELOCITY_STEP = downcallHandleVoid("JPH_MotionProperties_ApplyAngularVelocityStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_ADD_ANGULAR_VELOCITY_STEP = downcallHandleVoid("JPH_MotionProperties_AddAngularVelocityStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SUB_ANGULAR_VELOCITY_STEP = downcallHandleVoid("JPH_MotionProperties_SubAngularVelocityStep", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_APPLY_GYROSCOPIC_FORCE_INTERNAL = downcallHandleVoid("JPH_MotionProperties_ApplyGyroscopicForceInternal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_APPLY_FORCE_TORQUE_AND_DRAG_INTERNAL = downcallHandleVoid("JPH_MotionProperties_ApplyForceTorqueAndDragInternal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_GET_ISLAND_INDEX_INTERNAL = downcallHandle("JPH_MotionProperties_GetIslandIndexInternal", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_SET_ISLAND_INDEX_INTERNAL = downcallHandleVoid("JPH_MotionProperties_SetIslandIndexInternal", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_MOTION_PROPERTIES_GET_INDEX_IN_ACTIVE_BODIES_INTERNAL = downcallHandle("JPH_MotionProperties_GetIndexInActiveBodiesInternal", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_RESET_SLEEP_TEST_SPHERES = downcallHandleVoid("JPH_MotionProperties_ResetSleepTestSpheres", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_RESET_SLEEP_TEST_TIMER = downcallHandleVoid("JPH_MotionProperties_ResetSleepTestTimer", UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_ACCUMULATE_SLEEP_TIME = downcallHandle("JPH_MotionProperties_AccumulateSleepTime", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_MOTION_PROPERTIES_SAVE_STATE = downcallHandleVoid("JPH_MotionProperties_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_MOTION_PROPERTIES_RESTORE_STATE = downcallHandleVoid("JPH_MotionProperties_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public MotionProperties() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public MotionProperties(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public MotionProperties(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_MOTION_PROPERTIES_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constant indicating that body is not active
    /// ```
    public static int getInactiveIndex() {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_INACTIVE_INDEX.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Motion quality, or how well it detects collisions when it has a high velocity
    /// ```
    public static int getMotionQuality(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_MOTION_QUALITY.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMotionQuality].
    public final int getMotionQuality() {
    	return getMotionQuality(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the allowed degrees of freedom that this body has (this can be changed by calling SetMassProperties)
    /// ```
    public static int getAllowedDOFs(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_ALLOWED_DOFS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAllowedDOFs].
    public final int getAllowedDOFs() {
    	return getAllowedDOFs(
    		this.segment
    	);
    }
    
    /// ```
    /// If this body can go to sleep.
    /// ```
    public static boolean getAllowSleeping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_ALLOW_SLEEPING.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAllowSleeping].
    public final boolean getAllowSleeping() {
    	return getAllowSleeping(
    		this.segment
    	);
    }
    
    /// ```
    /// Get world space linear velocity of the center of mass
    /// ```
    public static void getLinearVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity].
    public final void getLinearVelocity(
    	Vec3 outResult
    ) {
    	getLinearVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set world space linear velocity of the center of mass.
    /// Note that it is illegal to set a non-zero linear velocity on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::SetLinearVelocity instead.
    /// ```
    public static void setLinearVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public final void setLinearVelocity(
    	Vec3 inLinearVelocity
    ) {
    	setLinearVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set world space linear velocity of the center of mass, will make sure the value is clamped against the maximum linear velocity.
    /// Note that it is illegal to set a non-zero linear velocity on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::SetLinearVelocity instead.
    /// ```
    public static void setLinearVelocityClamped(
    	MemorySegment self,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_LINEAR_VELOCITY_CLAMPED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocityClamped].
    public final void setLinearVelocityClamped(
    	Vec3 inLinearVelocity
    ) {
    	setLinearVelocityClamped(
    		this.segment,
    		inLinearVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Get world space angular velocity of the center of mass
    /// ```
    public static void getAngularVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public final void getAngularVelocity(
    	Vec3 outResult
    ) {
    	getAngularVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set world space angular velocity of the center of mass.
    /// Note that it is illegal to set a non-zero angular velocity on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::SetAngularVelocity instead.
    /// ```
    public static void setAngularVelocity(
    	MemorySegment self,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity].
    public final void setAngularVelocity(
    	Vec3 inAngularVelocity
    ) {
    	setAngularVelocity(
    		this.segment,
    		inAngularVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set world space angular velocity of the center of mass, will make sure the value is clamped against the maximum angular velocity.
    /// Note that it is illegal to set a non-zero angular velocity on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::SetAngularVelocity instead.
    /// ```
    public static void setAngularVelocityClamped(
    	MemorySegment self,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_ANGULAR_VELOCITY_CLAMPED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocityClamped].
    public final void setAngularVelocityClamped(
    	Vec3 inAngularVelocity
    ) {
    	setAngularVelocityClamped(
    		this.segment,
    		inAngularVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Set velocity of body such that it will be rotate/translate by inDeltaPosition/Rotation in inDeltaTime seconds.
    /// Note that it is illegal to provide non-zero delta position/rotation on a sleeping body without waking it up afterwards.
    /// If you want the body to wake up when it is sleeping, use BodyInterface::MoveKinematic instead.
    /// ```
    public static void moveKinematic(
    	MemorySegment self,
    	MemorySegment inDeltaPosition,
    	MemorySegment inDeltaRotation,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_MOVE_KINEMATIC.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDeltaPosition,
    			inDeltaRotation,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#moveKinematic].
    public final void moveKinematic(
    	Vec3 inDeltaPosition,
    	Quat inDeltaRotation,
    	float inDeltaTime
    ) {
    	moveKinematic(
    		this.segment,
    		inDeltaPosition.memorySegment(),
    		inDeltaRotation.memorySegment(),
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Maximum linear velocity that a body can achieve. Used to prevent the system from exploding.
    /// ```
    public static float getMaxLinearVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_MAX_LINEAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxLinearVelocity].
    public final float getMaxLinearVelocity() {
    	return getMaxLinearVelocity(
    		this.segment
    	);
    }
    
    public static void setMaxLinearVelocity(
    	MemorySegment self,
    	float inLinearVelocity
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_MAX_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxLinearVelocity].
    public final void setMaxLinearVelocity(
    	float inLinearVelocity
    ) {
    	setMaxLinearVelocity(
    		this.segment,
    		inLinearVelocity
    	);
    }
    
    /// ```
    /// Maximum angular velocity that a body can achieve. Used to prevent the system from exploding.
    /// ```
    public static float getMaxAngularVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_MAX_ANGULAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxAngularVelocity].
    public final float getMaxAngularVelocity() {
    	return getMaxAngularVelocity(
    		this.segment
    	);
    }
    
    public static void setMaxAngularVelocity(
    	MemorySegment self,
    	float inAngularVelocity
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_MAX_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxAngularVelocity].
    public final void setMaxAngularVelocity(
    	float inAngularVelocity
    ) {
    	setMaxAngularVelocity(
    		this.segment,
    		inAngularVelocity
    	);
    }
    
    /// ```
    /// Clamp velocity according to limit
    /// ```
    public static void clampLinearVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_CLAMP_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clampLinearVelocity].
    public final void clampLinearVelocity() {
    	clampLinearVelocity(
    		this.segment
    	);
    }
    
    public static void clampAngularVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_CLAMP_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clampAngularVelocity].
    public final void clampAngularVelocity() {
    	clampAngularVelocity(
    		this.segment
    	);
    }
    
    /// ```
    /// Get linear damping: dv/dt = -c * v. c. Value should be zero or positive and is usually close to 0.
    /// ```
    public static float getLinearDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_LINEAR_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearDamping].
    public final float getLinearDamping() {
    	return getLinearDamping(
    		this.segment
    	);
    }
    
    public static void setLinearDamping(
    	MemorySegment self,
    	float inLinearDamping
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_LINEAR_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearDamping].
    public final void setLinearDamping(
    	float inLinearDamping
    ) {
    	setLinearDamping(
    		this.segment,
    		inLinearDamping
    	);
    }
    
    /// ```
    /// Get angular damping: dw/dt = -c * w. c. Value should be zero or positive and is usually close to 0.
    /// ```
    public static float getAngularDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_ANGULAR_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularDamping].
    public final float getAngularDamping() {
    	return getAngularDamping(
    		this.segment
    	);
    }
    
    public static void setAngularDamping(
    	MemorySegment self,
    	float inAngularDamping
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_ANGULAR_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularDamping].
    public final void setAngularDamping(
    	float inAngularDamping
    ) {
    	setAngularDamping(
    		this.segment,
    		inAngularDamping
    	);
    }
    
    /// ```
    /// Get gravity factor (1 = normal gravity, 0 = no gravity)
    /// ```
    public static float getGravityFactor(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_GRAVITY_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getGravityFactor].
    public final float getGravityFactor() {
    	return getGravityFactor(
    		this.segment
    	);
    }
    
    public static void setGravityFactor(
    	MemorySegment self,
    	float inGravityFactor
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_GRAVITY_FACTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inGravityFactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGravityFactor].
    public final void setGravityFactor(
    	float inGravityFactor
    ) {
    	setGravityFactor(
    		this.segment,
    		inGravityFactor
    	);
    }
    
    /// ```
    /// Set the mass and inertia tensor
    /// ```
    public static void setMassProperties(
    	MemorySegment self,
    	int inAllowedDOFs,
    	MemorySegment inMassProperties
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_MASS_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAllowedDOFs,
    			inMassProperties
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMassProperties].
    public final void setMassProperties(
    	int inAllowedDOFs,
    	MassProperties inMassProperties
    ) {
    	setMassProperties(
    		this.segment,
    		inAllowedDOFs,
    		inMassProperties.memorySegment()
    	);
    }
    
    /// ```
    /// Get inverse mass (1 / mass). Should only be called on a dynamic object (static or kinematic bodies have infinite mass so should be treated as 1 / mass = 0)
    /// ```
    public static float getInverseMass(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_INVERSE_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseMass].
    public final float getInverseMass() {
    	return getInverseMass(
    		this.segment
    	);
    }
    
    public static float getInverseMassUnchecked(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_INVERSE_MASS_UNCHECKED.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseMassUnchecked].
    public final float getInverseMassUnchecked() {
    	return getInverseMassUnchecked(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the inverse mass (1 / mass).
    /// Note that mass and inertia are linearly related (e.g. inertia of a sphere with mass m and radius r is \f$2/5 \: m \: r^2\f$).
    /// If you change mass, inertia should probably change as well. You can use ScaleToMass to update mass and inertia at the same time.
    /// If all your translation degrees of freedom are restricted, make sure this is zero (see EAllowedDOFs).
    /// ```
    public static void setInverseMass(
    	MemorySegment self,
    	float inInverseMass
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_INVERSE_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inInverseMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInverseMass].
    public final void setInverseMass(
    	float inInverseMass
    ) {
    	setInverseMass(
    		this.segment,
    		inInverseMass
    	);
    }
    
    /// ```
    /// Diagonal of inverse inertia matrix: D. Should only be called on a dynamic object (static or kinematic bodies have infinite mass so should be treated as D = 0)
    /// ```
    public static void getInverseInertiaDiagonal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_DIAGONAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseInertiaDiagonal].
    public final void getInverseInertiaDiagonal(
    	Vec3 outResult
    ) {
    	getInverseInertiaDiagonal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation (R) that takes inverse inertia diagonal to local space: \f$I_{body}^{-1} = R \: D \: R^{-1}\f$
    /// ```
    public static void getInertiaRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_INERTIA_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInertiaRotation].
    public final void getInertiaRotation(
    	Quat outResult
    ) {
    	getInertiaRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Set the inverse inertia tensor in local space by setting the diagonal and the rotation: \f$I_{body}^{-1} = R \: D \: R^{-1}\f$.
    /// Note that mass and inertia are linearly related (e.g. inertia of a sphere with mass m and radius r is \f$2/5 \: m \: r^2\f$).
    /// If you change inertia, mass should probably change as well. You can use ScaleToMass to update mass and inertia at the same time.
    /// If all your rotation degrees of freedom are restricted, make sure this is zero (see EAllowedDOFs).
    /// ```
    public static void setInverseInertia(
    	MemorySegment self,
    	MemorySegment inDiagonal,
    	MemorySegment inRot
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_INVERSE_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDiagonal,
    			inRot
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInverseInertia].
    public final void setInverseInertia(
    	Vec3 inDiagonal,
    	Quat inRot
    ) {
    	setInverseInertia(
    		this.segment,
    		inDiagonal.memorySegment(),
    		inRot.memorySegment()
    	);
    }
    
    /// ```
    /// Sets the mass to inMass and scale the inertia tensor based on the ratio between the old and new mass.
    /// Note that this only works when the current mass is finite (i.e. the body is dynamic and translational degrees of freedom are not restricted).
    /// ```
    public static void scaleToMass(
    	MemorySegment self,
    	float inMass
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SCALE_TO_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#scaleToMass].
    public final void scaleToMass(
    	float inMass
    ) {
    	scaleToMass(
    		this.segment,
    		inMass
    	);
    }
    
    /// ```
    /// Get inverse inertia matrix (\f$I_{body}^{-1}\f$). Will be a matrix of zeros for a static or kinematic object.
    /// ```
    public static void getLocalSpaceInverseInertia(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_LOCAL_SPACE_INVERSE_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpaceInverseInertia].
    public final void getLocalSpaceInverseInertia(
    	Mat44 outResult
    ) {
    	getLocalSpaceInverseInertia(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Same as GetLocalSpaceInverseInertia() but doesn't check if the body is dynamic
    /// ```
    public static void getLocalSpaceInverseInertiaUnchecked(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_LOCAL_SPACE_INVERSE_INERTIA_UNCHECKED.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLocalSpaceInverseInertiaUnchecked].
    public final void getLocalSpaceInverseInertiaUnchecked(
    	Mat44 outResult
    ) {
    	getLocalSpaceInverseInertiaUnchecked(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get inverse inertia matrix (\f$I^{-1}\f$) for a given object rotation (translation will be ignored). Zero if object is static or kinematic.
    /// ```
    public static void getInverseInertiaForRotation(
    	MemorySegment self,
    	MemorySegment inRotation,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_INVERSE_INERTIA_FOR_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRotation,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseInertiaForRotation].
    public final void getInverseInertiaForRotation(
    	Mat44 inRotation,
    	Mat44 outResult
    ) {
    	getInverseInertiaForRotation(
    		this.segment,
    		inRotation.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply a vector with the inverse world space inertia tensor (\f$I_{world}^{-1}\f$). Zero if object is static or kinematic.
    /// ```
    public static void multiplyWorldSpaceInverseInertiaByVector(
    	MemorySegment self,
    	MemorySegment inBodyRotation,
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_MULTIPLY_WORLD_SPACE_INVERSE_INERTIA_BY_VECTOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyRotation,
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#multiplyWorldSpaceInverseInertiaByVector].
    public final void multiplyWorldSpaceInverseInertiaByVector(
    	Quat inBodyRotation,
    	Vec3 inV,
    	Vec3 outResult
    ) {
    	multiplyWorldSpaceInverseInertiaByVector(
    		this.segment,
    		inBodyRotation.memorySegment(),
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity of point inPoint (in center of mass space, e.g. on the surface of the body) of the body (unit: m/s)
    /// ```
    public static void getPointVelocityCOM(
    	MemorySegment self,
    	MemorySegment inPointRelativeToCOM,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_POINT_VELOCITY_COM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPointRelativeToCOM,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPointVelocityCOM].
    public final void getPointVelocityCOM(
    	Vec3 inPointRelativeToCOM,
    	Vec3 outResult
    ) {
    	getPointVelocityCOM(
    		this.segment,
    		inPointRelativeToCOM.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public static void getAccumulatedForce(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_ACCUMULATED_FORCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAccumulatedForce].
    public final void getAccumulatedForce(
    	Vec3 outResult
    ) {
    	getAccumulatedForce(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getAccumulatedTorque(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_ACCUMULATED_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAccumulatedTorque].
    public final void getAccumulatedTorque(
    	Vec3 outResult
    ) {
    	getAccumulatedTorque(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void resetForce(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_RESET_FORCE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetForce].
    public final void resetForce() {
    	resetForce(
    		this.segment
    	);
    }
    
    public static void resetTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_RESET_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetTorque].
    public final void resetTorque() {
    	resetTorque(
    		this.segment
    	);
    }
    
    public static void resetMotion(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_RESET_MOTION.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetMotion].
    public final void resetMotion() {
    	resetMotion(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns a vector where the linear components that are not allowed by mAllowedDOFs are set to 0 and the rest to 0xffffffff
    /// ```
    public static void getLinearDOFsMask(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_LINEAR_DOFS_MASK.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearDOFsMask].
    public final void getLinearDOFsMask(
    	UVec4 outResult
    ) {
    	getLinearDOFsMask(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Takes a translation vector inV and returns a vector where the components that are not allowed by mAllowedDOFs are set to 0
    /// ```
    public static void lockTranslation(
    	MemorySegment self,
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_LOCK_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lockTranslation].
    public final void lockTranslation(
    	Vec3 inV,
    	Vec3 outResult
    ) {
    	lockTranslation(
    		this.segment,
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns a vector where the angular components that are not allowed by mAllowedDOFs are set to 0 and the rest to 0xffffffff
    /// ```
    public static void getAngularDOFsMask(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_ANGULAR_DOFS_MASK.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularDOFsMask].
    public final void getAngularDOFsMask(
    	UVec4 outResult
    ) {
    	getAngularDOFsMask(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Takes an angular velocity / torque vector inV and returns a vector where the components that are not allowed by mAllowedDOFs are set to 0
    /// ```
    public static void lockAngular(
    	MemorySegment self,
    	MemorySegment inV,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_LOCK_ANGULAR.get();
    	try {
    		 method.invokeExact(
    			self,
    			inV,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lockAngular].
    public final void lockAngular(
    	Vec3 inV,
    	Vec3 outResult
    ) {
    	lockAngular(
    		this.segment,
    		inV.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Used only when this body is dynamic and colliding. Override for the number of solver velocity iterations to run, 0 means use the default in PhysicsSettings::mNumVelocitySteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static void setNumVelocityStepsOverride(
    	MemorySegment self,
    	int inN
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_NUM_VELOCITY_STEPS_OVERRIDE.get();
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
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_NUM_VELOCITY_STEPS_OVERRIDE.get();
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
    /// Used only when this body is dynamic and colliding. Override for the number of solver position iterations to run, 0 means use the default in PhysicsSettings::mNumPositionSteps. The number of iterations to use is the max of all contacts and constraints in the island.
    /// ```
    public static void setNumPositionStepsOverride(
    	MemorySegment self,
    	int inN
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_NUM_POSITION_STEPS_OVERRIDE.get();
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
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_NUM_POSITION_STEPS_OVERRIDE.get();
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
    /// @name Update linear and angular velocity (used during constraint solving)
    /// @{
    /// ```
    public static void applyLinearVelocityStep(
    	MemorySegment self,
    	MemorySegment inLinearVelocity
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_APPLY_LINEAR_VELOCITY_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyLinearVelocityStep].
    public final void applyLinearVelocityStep(
    	Vec3 inLinearVelocity
    ) {
    	applyLinearVelocityStep(
    		this.segment,
    		inLinearVelocity.memorySegment()
    	);
    }
    
    public static void addLinearVelocityStep(
    	MemorySegment self,
    	MemorySegment inLinearVelocityChange
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_ADD_LINEAR_VELOCITY_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocityChange
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addLinearVelocityStep].
    public final void addLinearVelocityStep(
    	Vec3 inLinearVelocityChange
    ) {
    	addLinearVelocityStep(
    		this.segment,
    		inLinearVelocityChange.memorySegment()
    	);
    }
    
    public static void subLinearVelocityStep(
    	MemorySegment self,
    	MemorySegment inLinearVelocityChange
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SUB_LINEAR_VELOCITY_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocityChange
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#subLinearVelocityStep].
    public final void subLinearVelocityStep(
    	Vec3 inLinearVelocityChange
    ) {
    	subLinearVelocityStep(
    		this.segment,
    		inLinearVelocityChange.memorySegment()
    	);
    }
    
    public static void applyAngularVelocityStep(
    	MemorySegment self,
    	MemorySegment inAngularVelocity
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_APPLY_ANGULAR_VELOCITY_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyAngularVelocityStep].
    public final void applyAngularVelocityStep(
    	Vec3 inAngularVelocity
    ) {
    	applyAngularVelocityStep(
    		this.segment,
    		inAngularVelocity.memorySegment()
    	);
    }
    
    public static void addAngularVelocityStep(
    	MemorySegment self,
    	MemorySegment inAngularVelocityChange
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_ADD_ANGULAR_VELOCITY_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocityChange
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addAngularVelocityStep].
    public final void addAngularVelocityStep(
    	Vec3 inAngularVelocityChange
    ) {
    	addAngularVelocityStep(
    		this.segment,
    		inAngularVelocityChange.memorySegment()
    	);
    }
    
    public static void subAngularVelocityStep(
    	MemorySegment self,
    	MemorySegment inAngularVelocityChange
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SUB_ANGULAR_VELOCITY_STEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngularVelocityChange
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#subAngularVelocityStep].
    public final void subAngularVelocityStep(
    	Vec3 inAngularVelocityChange
    ) {
    	subAngularVelocityStep(
    		this.segment,
    		inAngularVelocityChange.memorySegment()
    	);
    }
    
    /// ```
    /// Apply the gyroscopic force (aka Dzhanibekov effect, see https://en.wikipedia.org/wiki/Tennis_racket_theorem)
    /// ```
    public static void applyGyroscopicForceInternal(
    	MemorySegment self,
    	MemorySegment inBodyRotation,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_APPLY_GYROSCOPIC_FORCE_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyRotation,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyGyroscopicForceInternal].
    public final void applyGyroscopicForceInternal(
    	Quat inBodyRotation,
    	float inDeltaTime
    ) {
    	applyGyroscopicForceInternal(
    		this.segment,
    		inBodyRotation.memorySegment(),
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Apply all accumulated forces, torques and drag (should only be called by the PhysicsSystem)
    /// ```
    public static void applyForceTorqueAndDragInternal(
    	MemorySegment self,
    	MemorySegment inBodyRotation,
    	MemorySegment inGravity,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_APPLY_FORCE_TORQUE_AND_DRAG_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyRotation,
    			inGravity,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyForceTorqueAndDragInternal].
    public final void applyForceTorqueAndDragInternal(
    	Quat inBodyRotation,
    	Vec3 inGravity,
    	float inDeltaTime
    ) {
    	applyForceTorqueAndDragInternal(
    		this.segment,
    		inBodyRotation.memorySegment(),
    		inGravity.memorySegment(),
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Access to the island index
    /// ```
    public static int getIslandIndexInternal(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_ISLAND_INDEX_INTERNAL.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIslandIndexInternal].
    public final int getIslandIndexInternal() {
    	return getIslandIndexInternal(
    		this.segment
    	);
    }
    
    public static void setIslandIndexInternal(
    	MemorySegment self,
    	int inIndex
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SET_ISLAND_INDEX_INTERNAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIslandIndexInternal].
    public final void setIslandIndexInternal(
    	int inIndex
    ) {
    	setIslandIndexInternal(
    		this.segment,
    		inIndex
    	);
    }
    
    /// ```
    /// Access to the index in the active bodies array
    /// ```
    public static int getIndexInActiveBodiesInternal(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_GET_INDEX_IN_ACTIVE_BODIES_INTERNAL.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIndexInActiveBodiesInternal].
    public final int getIndexInActiveBodiesInternal() {
    	return getIndexInActiveBodiesInternal(
    		this.segment
    	);
    }
    
    /// ```
    /// Reset spheres to center around inPoints with radius 0
    /// ```
    public static void resetSleepTestSpheres(
    	MemorySegment self,
    	MemorySegment inPoints
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_RESET_SLEEP_TEST_SPHERES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetSleepTestSpheres].
    public final void resetSleepTestSpheres(
    	Vec3 inPoints
    ) {
    	resetSleepTestSpheres(
    		this.segment,
    		inPoints.memorySegment()
    	);
    }
    
    /// ```
    /// Reset the sleep test timer without resetting the sleep test spheres
    /// ```
    public static void resetSleepTestTimer(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_RESET_SLEEP_TEST_TIMER.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetSleepTestTimer].
    public final void resetSleepTestTimer() {
    	resetSleepTestTimer(
    		this.segment
    	);
    }
    
    /// ```
    /// Accumulate sleep time and return if a body can go to sleep
    /// ```
    public static int accumulateSleepTime(
    	MemorySegment self,
    	float inDeltaTime,
    	float inTimeBeforeSleep
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_ACCUMULATE_SLEEP_TIME.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inDeltaTime,
    			inTimeBeforeSleep
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#accumulateSleepTime].
    public final int accumulateSleepTime(
    	float inDeltaTime,
    	float inTimeBeforeSleep
    ) {
    	return accumulateSleepTime(
    		this.segment,
    		inDeltaTime,
    		inTimeBeforeSleep
    	);
    }
    
    /// ```
    /// Saving state for replay
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_MOTION_PROPERTIES_SAVE_STATE.get();
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
    public void saveState(
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
    	MethodHandle method = JPH_MOTION_PROPERTIES_RESTORE_STATE.get();
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
    public void restoreState(
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