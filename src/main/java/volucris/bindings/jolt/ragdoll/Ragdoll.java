/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.body.BodyIDArray;
import volucris.bindings.jolt.constraints.TwoBodyConstraint;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.physics.PhysicsSystem;
import volucris.bindings.jolt.skeleton.SkeletonPose;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Ragdoll extends RagdollRefTarget {

	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_ACTIVATE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_IS_ACTIVE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SET_GROUP_ID;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SET_POSE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SET_POSE1;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_POSE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_POSE1;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_RESET_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS1;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS1;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SET_LINEAR_AND_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SET_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_ADD_LINEAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_ADD_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_ROOT_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_BODY_COUNT;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_BODY_IDS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_CONSTRAINT_COUNT;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_CONSTRAINT1;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_WORLD_SPACE_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_GET_RAGDOLL_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RAGDOLL_CREATE = downcallHandle("JPH_Ragdoll_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_AS_REF_TARGET = downcallHandle("JPH_Ragdoll_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Ragdoll_AddToPhysicsSystem", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM = downcallHandleVoid("JPH_Ragdoll_RemoveFromPhysicsSystem", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_ACTIVATE = downcallHandleVoid("JPH_Ragdoll_Activate", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_IS_ACTIVE = downcallHandle("JPH_Ragdoll_IsActive", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_SET_GROUP_ID = downcallHandleVoid("JPH_Ragdoll_SetGroupID", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		JPH_RAGDOLL_SET_POSE = downcallHandleVoid("JPH_Ragdoll_SetPose", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_SET_POSE1 = downcallHandleVoid("JPH_Ragdoll_SetPose1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_GET_POSE = downcallHandleVoid("JPH_Ragdoll_GetPose", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_GET_POSE1 = downcallHandleVoid("JPH_Ragdoll_GetPose1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_RESET_WARM_START = downcallHandleVoid("JPH_Ragdoll_ResetWarmStart", UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS = downcallHandleVoid("JPH_Ragdoll_DriveToPoseUsingKinematics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
		JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS1 = downcallHandleVoid("JPH_Ragdoll_DriveToPoseUsingKinematics1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_BOOLEAN);
		JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS = downcallHandleVoid("JPH_Ragdoll_DriveToPoseUsingMotors", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS1 = downcallHandleVoid("JPH_Ragdoll_DriveToPoseUsingMotors1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_RAGDOLL_SET_LINEAR_AND_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Ragdoll_SetLinearAndAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_SET_LINEAR_VELOCITY = downcallHandleVoid("JPH_Ragdoll_SetLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_ADD_LINEAR_VELOCITY = downcallHandleVoid("JPH_Ragdoll_AddLinearVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_ADD_IMPULSE = downcallHandleVoid("JPH_Ragdoll_AddImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_GET_ROOT_TRANSFORM = downcallHandleVoid("JPH_Ragdoll_GetRootTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_RAGDOLL_GET_BODY_COUNT = downcallHandle("JPH_Ragdoll_GetBodyCount", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_GET_BODY_ID = downcallHandleVoid("JPH_Ragdoll_GetBodyID", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_GET_BODY_IDS = downcallHandle("JPH_Ragdoll_GetBodyIDs", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_GET_CONSTRAINT_COUNT = downcallHandle("JPH_Ragdoll_GetConstraintCount", JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_GET_CONSTRAINT = downcallHandle("JPH_Ragdoll_GetConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_RAGDOLL_GET_CONSTRAINT1 = downcallHandle("JPH_Ragdoll_GetConstraint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_RAGDOLL_GET_WORLD_SPACE_BOUNDS = downcallHandleVoid("JPH_Ragdoll_GetWorldSpaceBounds", UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_GET_RAGDOLL_SETTINGS = downcallHandle("JPH_Ragdoll_GetRagdollSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_DESTROY = downcallHandleVoid("JPH_Ragdoll_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Ragdoll(
	    PhysicsSystem inSystem
	) {
	    this(
	        Arena.ofAuto(),
	        inSystem
	    );
	}
	
	/// Typed method of [#create].
	public Ragdoll(
		Arena arena,
		PhysicsSystem inSystem
	) {
		MemorySegment segment = create(
			inSystem.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Ragdoll(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_RAGDOLL_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Add bodies and constraints to the system and optionally activate the bodies
    /// ```
    public static void addToPhysicsSystem(
    	MemorySegment self,
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_ADD_TO_PHYSICS_SYSTEM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inActivationMode,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addToPhysicsSystem].
    public final void addToPhysicsSystem(
    	int inActivationMode,
    	boolean inLockBodies
    ) {
    	addToPhysicsSystem(
    		this.segment,
    		inActivationMode,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Remove bodies and constraints from the system
    /// ```
    public static void removeFromPhysicsSystem(
    	MemorySegment self,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_REMOVE_FROM_PHYSICS_SYSTEM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#removeFromPhysicsSystem].
    public final void removeFromPhysicsSystem(
    	boolean inLockBodies
    ) {
    	removeFromPhysicsSystem(
    		this.segment,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Wake up all bodies in the ragdoll
    /// ```
    public static void activate(
    	MemorySegment self,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_ACTIVATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#activate].
    public final void activate(
    	boolean inLockBodies
    ) {
    	activate(
    		this.segment,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Check if one or more of the bodies in the ragdoll are active.
    /// Note that this involves locking the bodies (if inLockBodies is true) and looping over them. An alternative and possibly faster
    /// way could be to install a BodyActivationListener and count the number of active bodies of a ragdoll as they're activated / deactivated
    /// (basically check if the body that activates / deactivates is in GetBodyIDs() and increment / decrement a counter).
    /// ```
    public static boolean isActive(
    	MemorySegment self,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_IS_ACTIVE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isActive].
    public final boolean isActive(
    	boolean inLockBodies
    ) {
    	return isActive(
    		this.segment,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Set the group ID on all bodies in the ragdoll
    /// ```
    public static void setGroupID(
    	MemorySegment self,
    	int inGroupID,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_SET_GROUP_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inGroupID,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setGroupID].
    public final void setGroupID(
    	int inGroupID,
    	boolean inLockBodies
    ) {
    	setGroupID(
    		this.segment,
    		inGroupID,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Set the ragdoll to a pose (calls BodyInterface::SetPositionAndRotation to instantly move the ragdoll)
    /// ```
    public static void setPose(
    	MemorySegment self,
    	MemorySegment inPose,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_SET_POSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPose,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPose].
    public final void setPose(
    	SkeletonPose inPose,
    	boolean inLockBodies
    ) {
    	setPose(
    		this.segment,
    		inPose.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Lower level version of SetPose that directly takes the world space joint matrices
    /// ```
    public static void setPose1(
    	MemorySegment self,
    	MemorySegment inRootOffset,
    	MemorySegment inJointMatrices,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_SET_POSE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRootOffset,
    			inJointMatrices,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPose1].
    public final void setPose1(
    	Vec3 inRootOffset,
    	Mat44 inJointMatrices,
    	boolean inLockBodies
    ) {
    	setPose1(
    		this.segment,
    		inRootOffset.memorySegment(),
    		inJointMatrices.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get the ragdoll pose (uses the world transform of the bodies to calculate the pose)
    /// ```
    public static void getPose(
    	MemorySegment self,
    	MemorySegment outPose,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_POSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outPose,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPose].
    public final void getPose(
    	SkeletonPose outPose,
    	boolean inLockBodies
    ) {
    	getPose(
    		this.segment,
    		outPose.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Lower level version of GetPose that directly returns the world space joint matrices
    /// ```
    public static void getPose1(
    	MemorySegment self,
    	MemorySegment outRootOffset,
    	MemorySegment outJointMatrices,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_POSE1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outRootOffset,
    			outJointMatrices,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPose1].
    public final void getPose1(
    	Vec3 outRootOffset,
    	Mat44 outJointMatrices,
    	boolean inLockBodies
    ) {
    	getPose1(
    		this.segment,
    		outRootOffset.memorySegment(),
    		outJointMatrices.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// This function calls ResetWarmStart on all constraints. It can be used after calling SetPose to reset previous frames impulses. See: Constraint::ResetWarmStart.
    /// ```
    public static void resetWarmStart(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_RESET_WARM_START.get();
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
    /// Drive the ragdoll to a specific pose by setting velocities on each of the bodies so that it will reach inPose in inDeltaTime
    /// ```
    public static void driveToPoseUsingKinematics(
    	MemorySegment self,
    	MemorySegment inPose,
    	float inDeltaTime,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPose,
    			inDeltaTime,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#driveToPoseUsingKinematics].
    public final void driveToPoseUsingKinematics(
    	SkeletonPose inPose,
    	float inDeltaTime,
    	boolean inLockBodies
    ) {
    	driveToPoseUsingKinematics(
    		this.segment,
    		inPose.memorySegment(),
    		inDeltaTime,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Lower level version of DriveToPoseUsingKinematics that directly takes the world space joint matrices
    /// ```
    public static void driveToPoseUsingKinematics1(
    	MemorySegment self,
    	MemorySegment inRootOffset,
    	MemorySegment inJointMatrices,
    	float inDeltaTime,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_DRIVE_TO_POSE_USING_KINEMATICS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRootOffset,
    			inJointMatrices,
    			inDeltaTime,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#driveToPoseUsingKinematics1].
    public final void driveToPoseUsingKinematics1(
    	Vec3 inRootOffset,
    	Mat44 inJointMatrices,
    	float inDeltaTime,
    	boolean inLockBodies
    ) {
    	driveToPoseUsingKinematics1(
    		this.segment,
    		inRootOffset.memorySegment(),
    		inJointMatrices.memorySegment(),
    		inDeltaTime,
    		inLockBodies
    	);
    }
    
    /// ```
    /// Drive the ragdoll to a specific pose by activating the motors on each constraint.
    /// ```
    public static void driveToPoseUsingMotors(
    	MemorySegment self,
    	MemorySegment inPose
    ) {
    	MethodHandle method = JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPose
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#driveToPoseUsingMotors].
    public final void driveToPoseUsingMotors(
    	SkeletonPose inPose
    ) {
    	driveToPoseUsingMotors(
    		this.segment,
    		inPose.memorySegment()
    	);
    }
    
    /// ```
    /// Drive the ragdoll to a specific pose by activating the motors on each constraint. Drives both to target position and velocity.
    /// @param inPrevPose The previous pose of the ragdoll, used to calculate the target velocity for each motor
    /// @param inPose The target pose of the ragdoll, used to calculate the target position for each motor
    /// @param inDeltaTime The time between inPrevPose and inPose, used to calculate the target velocity for each motor
    /// ```
    public static void driveToPoseUsingMotors1(
    	MemorySegment self,
    	MemorySegment inPrevPose,
    	MemorySegment inPose,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_RAGDOLL_DRIVE_TO_POSE_USING_MOTORS1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPrevPose,
    			inPose,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#driveToPoseUsingMotors1].
    public final void driveToPoseUsingMotors1(
    	SkeletonPose inPrevPose,
    	SkeletonPose inPose,
    	float inDeltaTime
    ) {
    	driveToPoseUsingMotors1(
    		this.segment,
    		inPrevPose.memorySegment(),
    		inPose.memorySegment(),
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Control the linear and velocity of all bodies in the ragdoll
    /// ```
    public static void setLinearAndAngularVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity,
    	MemorySegment inAngularVelocity,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_SET_LINEAR_AND_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity,
    			inAngularVelocity,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearAndAngularVelocity].
    public final void setLinearAndAngularVelocity(
    	Vec3 inLinearVelocity,
    	Vec3 inAngularVelocity,
    	boolean inLockBodies
    ) {
    	setLinearAndAngularVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment(),
    		inAngularVelocity.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Set the world space linear velocity of all bodies in the ragdoll.
    /// ```
    public static void setLinearVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_SET_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity].
    public final void setLinearVelocity(
    	Vec3 inLinearVelocity,
    	boolean inLockBodies
    ) {
    	setLinearVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Add a world space velocity (in m/s) to all bodies in the ragdoll.
    /// ```
    public static void addLinearVelocity(
    	MemorySegment self,
    	MemorySegment inLinearVelocity,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_ADD_LINEAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLinearVelocity,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addLinearVelocity].
    public final void addLinearVelocity(
    	Vec3 inLinearVelocity,
    	boolean inLockBodies
    ) {
    	addLinearVelocity(
    		this.segment,
    		inLinearVelocity.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Add impulse to all bodies of the ragdoll (center of mass of each of them)
    /// ```
    public static void addImpulse(
    	MemorySegment self,
    	MemorySegment inImpulse,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_ADD_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inImpulse,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#addImpulse].
    public final void addImpulse(
    	Vec3 inImpulse,
    	boolean inLockBodies
    ) {
    	addImpulse(
    		this.segment,
    		inImpulse.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get the position and orientation of the root of the ragdoll
    /// ```
    public static void getRootTransform(
    	MemorySegment self,
    	MemorySegment outPosition,
    	MemorySegment outRotation,
    	boolean inLockBodies
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_ROOT_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outPosition,
    			outRotation,
    			inLockBodies
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRootTransform].
    public final void getRootTransform(
    	Vec3 outPosition,
    	Quat outRotation,
    	boolean inLockBodies
    ) {
    	getRootTransform(
    		this.segment,
    		outPosition.memorySegment(),
    		outRotation.memorySegment(),
    		inLockBodies
    	);
    }
    
    /// ```
    /// Get number of bodies in the ragdoll
    /// ```
    public static long getBodyCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_BODY_COUNT.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyCount].
    public final long getBodyCount() {
    	return getBodyCount(
    		this.segment
    	);
    }
    
    /// ```
    /// Access a body ID
    /// ```
    public static void getBodyID(
    	MemorySegment self,
    	int inBodyIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyID].
    public final void getBodyID(
    	int inBodyIndex,
    	BodyID outResult
    ) {
    	getBodyID(
    		this.segment,
    		inBodyIndex,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the array of body IDs
    /// ```
    public static MemorySegment getBodyIDs(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_BODY_IDS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyIDs].
    public final @Nullable BodyIDArray getBodyIDs() {
    	MemorySegment segment = getBodyIDs(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyIDArray(segment);
    }
    
    /// ```
    /// Get number of constraints in the ragdoll
    /// ```
    public static long getConstraintCount(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_CONSTRAINT_COUNT.get();
    	try {
    		return (long) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintCount].
    public final long getConstraintCount() {
    	return getConstraintCount(
    		this.segment
    	);
    }
    
    /// ```
    /// Access a constraint by index
    /// ```
    public static MemorySegment getConstraint(
    	MemorySegment self,
    	int inConstraintIndex
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inConstraintIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraint].
    public final @Nullable TwoBodyConstraint getConstraint(
    	int inConstraintIndex
    ) {
    	MemorySegment segment = getConstraint(
    		this.segment,
    		inConstraintIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TwoBodyConstraint(segment);
    }
    
    /// ```
    /// Access a constraint by index
    /// ```
    public static MemorySegment getConstraint1(
    	MemorySegment self,
    	int inConstraintIndex
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_CONSTRAINT1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inConstraintIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraint1].
    public final @Nullable TwoBodyConstraint getConstraint1(
    	int inConstraintIndex
    ) {
    	MemorySegment segment = getConstraint1(
    		this.segment,
    		inConstraintIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new TwoBodyConstraint(segment);
    }
    
    /// ```
    /// Get world space bounding box for all bodies of the ragdoll
    /// ```
    public static void getWorldSpaceBounds(
    	MemorySegment self,
    	boolean inLockBodies,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_WORLD_SPACE_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inLockBodies,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceBounds].
    public final void getWorldSpaceBounds(
    	boolean inLockBodies,
    	AABox outResult
    ) {
    	getWorldSpaceBounds(
    		this.segment,
    		inLockBodies,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the settings object that created this ragdoll
    /// ```
    public static MemorySegment getRagdollSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_GET_RAGDOLL_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRagdollSettings].
    public final @Nullable RagdollSettings getRagdollSettings() {
    	MemorySegment segment = getRagdollSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new RagdollSettings(segment);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}