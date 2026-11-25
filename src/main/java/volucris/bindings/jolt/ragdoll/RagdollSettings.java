/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.ragdoll;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.IntArray;
import volucris.bindings.jolt.IntIntPair;
import volucris.bindings.jolt.IntIntPairArray;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.physics.PhysicsSystem;
import volucris.bindings.jolt.skeleton.Skeleton;
import volucris.bindings.jolt.skeleton.SkeletonRef;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class RagdollSettings extends RagdollSettingsRefTarget {

	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_SKELETON;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_PARTS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_PARTS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_ADDITIONAL_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SET_ADDITIONAL_CONSTRAINTS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_STABILIZE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_PRIORITIES;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_S_RESTORE_FROM_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_SKELETON;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_SKELETON1;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_BODY_INDEX_TO_CONSTRAINT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_GET_BODY_INDICES_FOR_CONSTRAINT_INDEX;
	private static final LazyConstant<MethodHandle> JPH_RAGDOLL_SETTINGS_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RAGDOLL_SETTINGS_CREATE = downcallHandle("JPH_RagdollSettings_Create", UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_AS_REF_TARGET = downcallHandle("JPH_RagdollSettings_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_SET_SKELETON = downcallHandleVoid("JPH_RagdollSettings_SetSkeleton", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_PARTS = downcallHandleVoid("JPH_RagdollSettings_GetParts", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_SET_PARTS = downcallHandleVoid("JPH_RagdollSettings_SetParts", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_ADDITIONAL_CONSTRAINTS = downcallHandleVoid("JPH_RagdollSettings_GetAdditionalConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_SET_ADDITIONAL_CONSTRAINTS = downcallHandleVoid("JPH_RagdollSettings_SetAdditionalConstraints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_STABILIZE = downcallHandle("JPH_RagdollSettings_Stabilize", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_PRIORITIES = downcallHandleVoid("JPH_RagdollSettings_CalculateConstraintPriorities", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS = downcallHandleVoid("JPH_RagdollSettings_DisableParentChildCollisions", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_RAGDOLL_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_RagdollSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, JAVA_BOOLEAN);
		JPH_RAGDOLL_SETTINGS_S_RESTORE_FROM_BINARY_STATE = downcallHandleVoid("JPH_RagdollSettings_sRestoreFromBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL = downcallHandle("JPH_RagdollSettings_CreateRagdoll", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_SKELETON = downcallHandle("JPH_RagdollSettings_GetSkeleton", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_SKELETON1 = downcallHandle("JPH_RagdollSettings_GetSkeleton1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX = downcallHandleVoid("JPH_RagdollSettings_CalculateBodyIndexToConstraintIndex", UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_BODY_INDEX_TO_CONSTRAINT_INDEX = downcallHandle("JPH_RagdollSettings_GetBodyIndexToConstraintIndex", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX = downcallHandle("JPH_RagdollSettings_GetConstraintIndexForBodyIndex", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR = downcallHandleVoid("JPH_RagdollSettings_CalculateConstraintIndexToBodyIdxPair", UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR = downcallHandle("JPH_RagdollSettings_GetConstraintIndexToBodyIdxPair", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_GET_BODY_INDICES_FOR_CONSTRAINT_INDEX = downcallHandleVoid("JPH_RagdollSettings_GetBodyIndicesForConstraintIndex", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_RAGDOLL_SETTINGS_DESTROY = downcallHandleVoid("JPH_RagdollSettings_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RagdollSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RagdollSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RagdollSettings(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
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
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The skeleton for this ragdoll
    /// ```
    public static void setSkeleton(
    	MemorySegment self,
    	MemorySegment mSkeleton
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_SKELETON.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSkeleton
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSkeleton].
    public final void setSkeleton(
    	SkeletonRef mSkeleton
    ) {
    	setSkeleton(
    		this.segment,
    		mSkeleton.memorySegment()
    	);
    }
    
    /// ```
    /// For each of the joints, the body and constraint attaching it to its parent body (1-on-1 with mSkeleton.GetJoints())
    /// ```
    public static void getParts(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_PARTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getParts].
    public final void getParts(
    	PartArray outResult
    ) {
    	getParts(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// For each of the joints, the body and constraint attaching it to its parent body (1-on-1 with mSkeleton.GetJoints())
    /// ```
    public static void setParts(
    	MemorySegment self,
    	MemorySegment mParts
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_PARTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mParts
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setParts].
    public final void setParts(
    	PartArray mParts
    ) {
    	setParts(
    		this.segment,
    		mParts.memorySegment()
    	);
    }
    
    /// ```
    /// A list of constraints that connects two bodies in a ragdoll (for non parent child related constraints)
    /// ```
    public static void getAdditionalConstraints(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_ADDITIONAL_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAdditionalConstraints].
    public final void getAdditionalConstraints(
    	AdditionalConstraintArray outResult
    ) {
    	getAdditionalConstraints(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// A list of constraints that connects two bodies in a ragdoll (for non parent child related constraints)
    /// ```
    public static void setAdditionalConstraints(
    	MemorySegment self,
    	MemorySegment mAdditionalConstraints
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_SET_ADDITIONAL_CONSTRAINTS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAdditionalConstraints
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAdditionalConstraints].
    public final void setAdditionalConstraints(
    	AdditionalConstraintArray mAdditionalConstraints
    ) {
    	setAdditionalConstraints(
    		this.segment,
    		mAdditionalConstraints.memorySegment()
    	);
    }
    
    /// ```
    /// Stabilize the constraints of the ragdoll
    /// @return True on success, false on failure.
    /// ```
    public static boolean stabilize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_STABILIZE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stabilize].
    public final boolean stabilize() {
    	return stabilize(
    		this.segment
    	);
    }
    
    /// ```
    /// Initializes the constraint priorities so that constraints near the leaves of the ragdoll have a lower priority
    /// than constraints near the root of the ragdoll.
    /// @param inBasePriority The lowest priority that will be used in the ragdoll.
    /// ```
    public static void calculateConstraintPriorities(
    	MemorySegment self,
    	int inBasePriority
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_PRIORITIES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBasePriority
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintPriorities].
    public final void calculateConstraintPriorities(
    	int inBasePriority
    ) {
    	calculateConstraintPriorities(
    		this.segment,
    		inBasePriority
    	);
    }
    
    /// ```
    /// After the ragdoll has been fully configured, call this function to automatically create and add a GroupFilterTable collision filter to all bodies
    /// and configure them so that parent and children don't collide.
    /// 
    /// This will:
    /// - Create a GroupFilterTable and assign it to all of the bodies in a ragdoll.
    /// - Each body in your ragdoll will get a SubGroupID that is equal to the joint index in the Skeleton that it is attached to.
    /// - Loop over all joints in the Skeleton and call GroupFilterTable::DisableCollision(joint index, parent joint index).
    /// - When a pose is provided through inJointMatrices the function will detect collisions between joints
    /// (they must be separated by more than inMinSeparationDistance to be treated as not colliding) and automatically disable collisions.
    /// 
    /// When you create an instance using Ragdoll::CreateRagdoll pass in a unique GroupID for each ragdoll (e.g. a simple counter), note that this number
    /// should be unique throughout the PhysicsSystem, so if you have different types of ragdolls they should not share the same GroupID.
    /// ```
    public static void disableParentChildCollisions(
    	MemorySegment self,
    	MemorySegment inJointMatrices,
    	float inMinSeparationDistance
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_DISABLE_PARENT_CHILD_COLLISIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inJointMatrices,
    			inMinSeparationDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#disableParentChildCollisions].
    public final void disableParentChildCollisions(
    	Mat44 inJointMatrices,
    	float inMinSeparationDistance
    ) {
    	disableParentChildCollisions(
    		this.segment,
    		inJointMatrices.memorySegment(),
    		inMinSeparationDistance
    	);
    }
    
    /// ```
    /// Saves the state of this object in binary form to inStream.
    /// @param inStream The stream to save the state to
    /// @param inSaveShapes If the shapes should be saved as well (these could be shared between ragdolls, in which case the calling application may want to write custom code to restore them)
    /// @param inSaveGroupFilter If the group filter should be saved as well (these could be shared)
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream,
    	boolean inSaveShapes,
    	boolean inSaveGroupFilter
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream,
    			inSaveShapes,
    			inSaveGroupFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream,
    	boolean inSaveShapes,
    	boolean inSaveGroupFilter
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment(),
    		inSaveShapes,
    		inSaveGroupFilter
    	);
    }
    
    /// ```
    /// Restore a saved ragdoll from inStream
    /// ```
    public static void sRestoreFromBinaryState(
    	MemorySegment inStream,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_S_RESTORE_FROM_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			inStream,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sRestoreFromBinaryState].
    public static void sRestoreFromBinaryState(
    	StreamIn inStream,
    	RagdollSettingsResult outResult
    ) {
    	sRestoreFromBinaryState(
    		inStream.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Create ragdoll instance from these settings
    /// @return Newly created ragdoll or null when out of bodies
    /// ```
    public static MemorySegment createRagdoll(
    	MemorySegment self,
    	int inCollisionGroup,
    	long inUserData,
    	MemorySegment inSystem
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_CREATE_RAGDOLL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inCollisionGroup,
    			inUserData,
    			inSystem
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#createRagdoll].
    public final @Nullable Ragdoll createRagdoll(
    	int inCollisionGroup,
    	long inUserData,
    	PhysicsSystem inSystem
    ) {
    	MemorySegment segment = createRagdoll(
    		this.segment,
    		inCollisionGroup,
    		inUserData,
    		inSystem.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Ragdoll(segment);
    }
    
    /// ```
    /// Access to the skeleton of this ragdoll
    /// ```
    public static MemorySegment getSkeleton(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_SKELETON.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkeleton].
    public final @Nullable Skeleton getSkeleton() {
    	MemorySegment segment = getSkeleton(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Skeleton(segment);
    }
    
    public static MemorySegment getSkeleton1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_SKELETON1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSkeleton1].
    public final @Nullable Skeleton getSkeleton1() {
    	MemorySegment segment = getSkeleton1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Skeleton(segment);
    }
    
    /// ```
    /// Calculate the map needed for GetBodyIndexToConstraintIndex()
    /// ```
    public static void calculateBodyIndexToConstraintIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_CALCULATE_BODY_INDEX_TO_CONSTRAINT_INDEX.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateBodyIndexToConstraintIndex].
    public final void calculateBodyIndexToConstraintIndex() {
    	calculateBodyIndexToConstraintIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Get table that maps a body index to the constraint index with which it is connected to its parent. -1 if there is no constraint associated with the body.
    /// Note that this will only tell you which constraint connects the body to its parent, it will not look in the additional constraint list.
    /// ```
    public static MemorySegment getBodyIndexToConstraintIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_BODY_INDEX_TO_CONSTRAINT_INDEX.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyIndexToConstraintIndex].
    public final @Nullable IntArray getBodyIndexToConstraintIndex() {
    	MemorySegment segment = getBodyIndexToConstraintIndex(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new IntArray(segment);
    }
    
    /// ```
    /// Map a single body index to a constraint index
    /// ```
    public static int getConstraintIndexForBodyIndex(
    	MemorySegment self,
    	int inBodyIndex
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_FOR_BODY_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inBodyIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintIndexForBodyIndex].
    public final int getConstraintIndexForBodyIndex(
    	int inBodyIndex
    ) {
    	return getConstraintIndexForBodyIndex(
    		this.segment,
    		inBodyIndex
    	);
    }
    
    /// ```
    /// Calculate the map needed for GetConstraintIndexToBodyIdxPair()
    /// ```
    public static void calculateConstraintIndexToBodyIdxPair(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_CALCULATE_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateConstraintIndexToBodyIdxPair].
    public final void calculateConstraintIndexToBodyIdxPair() {
    	calculateConstraintIndexToBodyIdxPair(
    		this.segment
    	);
    }
    
    /// ```
    /// Table that maps a constraint index (index in mConstraints) to the indices of the bodies that the constraint is connected to (index in mBodyIDs)
    /// ```
    public static MemorySegment getConstraintIndexToBodyIdxPair(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_CONSTRAINT_INDEX_TO_BODY_IDX_PAIR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintIndexToBodyIdxPair].
    public final @Nullable IntIntPairArray getConstraintIndexToBodyIdxPair() {
    	MemorySegment segment = getConstraintIndexToBodyIdxPair(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new IntIntPairArray(segment);
    }
    
    /// ```
    /// Map a single constraint index (index in mConstraints) to the indices of the bodies that the constraint is connected to (index in mBodyIDs)
    /// ```
    public static void getBodyIndicesForConstraintIndex(
    	MemorySegment self,
    	int inConstraintIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_GET_BODY_INDICES_FOR_CONSTRAINT_INDEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstraintIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyIndicesForConstraintIndex].
    public final void getBodyIndicesForConstraintIndex(
    	int inConstraintIndex,
    	IntIntPair outResult
    ) {
    	getBodyIndicesForConstraintIndex(
    		this.segment,
    		inConstraintIndex,
    		outResult.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAGDOLL_SETTINGS_DESTROY.get();
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