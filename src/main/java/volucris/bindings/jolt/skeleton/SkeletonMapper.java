/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.skeleton;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.math.Mat44;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SkeletonMapper extends SkeletonMapperRefTarget {

	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_S_DEFAULT_CAN_MAP_JOINT;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_INITIALIZE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAP;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_MAP_REVERSE;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_IDX;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_MAPPINGS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_MAPPINGS1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_CHAINS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_CHAINS1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_UNMAPPED;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_UNMAPPED1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_LOCKED_TRANSLATIONS;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_GET_LOCKED_TRANSLATIONS1;
	private static final LazyConstant<MethodHandle> JPH_SKELETON_MAPPER_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SKELETON_MAPPER_CREATE = downcallHandle("JPH_SkeletonMapper_Create", UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_AS_REF_TARGET = downcallHandle("JPH_SkeletonMapper_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_S_DEFAULT_CAN_MAP_JOINT = downcallHandle("JPH_SkeletonMapper_sDefaultCanMapJoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_INITIALIZE = downcallHandleVoid("JPH_SkeletonMapper_Initialize", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS = downcallHandleVoid("JPH_SkeletonMapper_LockTranslations", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS = downcallHandleVoid("JPH_SkeletonMapper_LockAllTranslations", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAP = downcallHandleVoid("JPH_SkeletonMapper_Map", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_MAP_REVERSE = downcallHandleVoid("JPH_SkeletonMapper_MapReverse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_IDX = downcallHandle("JPH_SkeletonMapper_GetMappedJointIdx", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED = downcallHandle("JPH_SkeletonMapper_IsJointTranslationLocked", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SKELETON_MAPPER_GET_MAPPINGS = downcallHandle("JPH_SkeletonMapper_GetMappings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_GET_MAPPINGS1 = downcallHandle("JPH_SkeletonMapper_GetMappings1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_GET_CHAINS = downcallHandle("JPH_SkeletonMapper_GetChains", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_GET_CHAINS1 = downcallHandle("JPH_SkeletonMapper_GetChains1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_GET_UNMAPPED = downcallHandle("JPH_SkeletonMapper_GetUnmapped", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_GET_UNMAPPED1 = downcallHandle("JPH_SkeletonMapper_GetUnmapped1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_GET_LOCKED_TRANSLATIONS = downcallHandle("JPH_SkeletonMapper_GetLockedTranslations", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_GET_LOCKED_TRANSLATIONS1 = downcallHandle("JPH_SkeletonMapper_GetLockedTranslations1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SKELETON_MAPPER_DESTROY = downcallHandleVoid("JPH_SkeletonMapper_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SkeletonMapper() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SkeletonMapper(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SkeletonMapper(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SKELETON_MAPPER_CREATE.get();
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
    	MethodHandle method = JPH_SKELETON_MAPPER_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Default function that checks if the names of the joints are equal
    /// ```
    public static boolean sDefaultCanMapJoint(
    	MemorySegment inSkeleton1,
    	int inIndex1,
    	MemorySegment inSkeleton2,
    	int inIndex2
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_S_DEFAULT_CAN_MAP_JOINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			inSkeleton1,
    			inIndex1,
    			inSkeleton2,
    			inIndex2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sDefaultCanMapJoint].
    public static boolean sDefaultCanMapJoint(
    	Skeleton inSkeleton1,
    	int inIndex1,
    	Skeleton inSkeleton2,
    	int inIndex2
    ) {
    	return sDefaultCanMapJoint(
    		inSkeleton1.memorySegment(),
    		inIndex1,
    		inSkeleton2.memorySegment(),
    		inIndex2
    	);
    }
    
    /// ```
    /// Initialize the skeleton mapper. Skeleton 1 should be the (low detail) ragdoll skeleton and skeleton 2 the (high detail) animation skeleton.
    /// We assume that each joint in skeleton 1 can be mapped to a joint in skeleton 2 (if not mapping from animation skeleton to ragdoll skeleton will be undefined).
    /// Skeleton 2 should have the same hierarchy as skeleton 1 but can contain extra joints between those in skeleton 1 and it can have extra joints at the root and leaves of the skeleton.
    /// @param inSkeleton1 Source skeleton to map from.
    /// @param inNeutralPose1 Neutral pose of the source skeleton (model space)
    /// @param inSkeleton2 Target skeleton to map to.
    /// @param inNeutralPose2 Neutral pose of the target skeleton (model space), inNeutralPose1 and inNeutralPose2 must match as closely as possible, preferably the position of the mappable joints should be identical.
    /// @param inCanMapJoint Function that checks if joints in skeleton 1 and skeleton 2 are equal.
    /// ```
    public static void initialize(
    	MemorySegment self,
    	MemorySegment inSkeleton1,
    	MemorySegment inNeutralPose1,
    	MemorySegment inSkeleton2,
    	MemorySegment inNeutralPose2,
    	MemorySegment inCanMapJoint
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_INITIALIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSkeleton1,
    			inNeutralPose1,
    			inSkeleton2,
    			inNeutralPose2,
    			inCanMapJoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#initialize].
    public final void initialize(
    	Skeleton inSkeleton1,
    	Mat44 inNeutralPose1,
    	Skeleton inSkeleton2,
    	Mat44 inNeutralPose2,
    	CanMapJoint inCanMapJoint
    ) {
    	initialize(
    		this.segment,
    		inSkeleton1.memorySegment(),
    		inNeutralPose1.memorySegment(),
    		inSkeleton2.memorySegment(),
    		inNeutralPose2.memorySegment(),
    		inCanMapJoint.memorySegment()
    	);
    }
    
    /// ```
    /// This can be called so lock the translation of a specified set of joints in skeleton 2.
    /// Because constraints are never 100% rigid, there's always a little bit of stretch in the ragdoll when the ragdoll is under stress.
    /// Locking the translations of the pose will remove the visual stretch from the ragdoll but will introduce a difference between the
    /// physical simulation and the visual representation.
    /// @param inSkeleton2 Target skeleton to map to.
    /// @param inLockedTranslations An array of bools the size of inSkeleton2->GetJointCount(), for each joint indicating if the joint is locked.
    /// @param inNeutralPose2 Neutral pose to take reference translations from
    /// ```
    public static void lockTranslations(
    	MemorySegment self,
    	MemorySegment inSkeleton2,
    	boolean inLockedTranslations,
    	MemorySegment inNeutralPose2
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCK_TRANSLATIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSkeleton2,
    			inLockedTranslations,
    			inNeutralPose2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lockTranslations].
    public final void lockTranslations(
    	Skeleton inSkeleton2,
    	boolean inLockedTranslations,
    	Mat44 inNeutralPose2
    ) {
    	lockTranslations(
    		this.segment,
    		inSkeleton2.memorySegment(),
    		inLockedTranslations,
    		inNeutralPose2.memorySegment()
    	);
    }
    
    /// ```
    /// After Initialize(), this can be called to lock the translation of all joints in skeleton 2 below the first mapped joint to those of the neutral pose.
    /// Because constraints are never 100% rigid, there's always a little bit of stretch in the ragdoll when the ragdoll is under stress.
    /// Locking the translations of the pose will remove the visual stretch from the ragdoll but will introduce a difference between the
    /// physical simulation and the visual representation.
    /// @param inSkeleton2 Target skeleton to map to.
    /// @param inNeutralPose2 Neutral pose to take reference translations from
    /// ```
    public static void lockAllTranslations(
    	MemorySegment self,
    	MemorySegment inSkeleton2,
    	MemorySegment inNeutralPose2
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_LOCK_ALL_TRANSLATIONS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSkeleton2,
    			inNeutralPose2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#lockAllTranslations].
    public final void lockAllTranslations(
    	Skeleton inSkeleton2,
    	Mat44 inNeutralPose2
    ) {
    	lockAllTranslations(
    		this.segment,
    		inSkeleton2.memorySegment(),
    		inNeutralPose2.memorySegment()
    	);
    }
    
    /// ```
    /// Map a pose. Joints that were directly mappable will be copied in model space from pose 1 to pose 2. Any joints that are only present in skeleton 2
    /// will get their model space transform calculated through the local space transforms of pose 2. Joints that are part of a joint chain between two
    /// mapped joints will be reoriented towards the next joint in skeleton 1. This means that it is possible for unmapped joints to have some animation,
    /// but very extreme animation poses will show artifacts.
    /// @param inPose1ModelSpace Pose on skeleton 1 in model space
    /// @param inPose2LocalSpace Pose on skeleton 2 in local space (used for the joints that cannot be mapped)
    /// @param outPose2ModelSpace Model space pose on skeleton 2 (the output of the mapping)
    /// ```
    public static void map(
    	MemorySegment self,
    	MemorySegment inPose1ModelSpace,
    	MemorySegment inPose2LocalSpace,
    	MemorySegment outPose2ModelSpace
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAP.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPose1ModelSpace,
    			inPose2LocalSpace,
    			outPose2ModelSpace
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#map].
    public final void map(
    	Mat44 inPose1ModelSpace,
    	Mat44 inPose2LocalSpace,
    	Mat44 outPose2ModelSpace
    ) {
    	map(
    		this.segment,
    		inPose1ModelSpace.memorySegment(),
    		inPose2LocalSpace.memorySegment(),
    		outPose2ModelSpace.memorySegment()
    	);
    }
    
    /// ```
    /// Reverse map a pose, this will only use the mappings and not the chains (it assumes that all joints in skeleton 1 are mapped)
    /// @param inPose2ModelSpace Model space pose on skeleton 2
    /// @param outPose1ModelSpace When the function returns this will contain the model space pose for skeleton 1
    /// ```
    public static void mapReverse(
    	MemorySegment self,
    	MemorySegment inPose2ModelSpace,
    	MemorySegment outPose1ModelSpace
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_MAP_REVERSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPose2ModelSpace,
    			outPose1ModelSpace
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mapReverse].
    public final void mapReverse(
    	Mat44 inPose2ModelSpace,
    	Mat44 outPose1ModelSpace
    ) {
    	mapReverse(
    		this.segment,
    		inPose2ModelSpace.memorySegment(),
    		outPose1ModelSpace.memorySegment()
    	);
    }
    
    /// ```
    /// Search through the directly mapped joints (mMappings) and find inJoint1Idx, returns the corresponding Joint2Idx or -1 if not found.
    /// ```
    public static int getMappedJointIdx(
    	MemorySegment self,
    	int inJoint1Idx
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_MAPPED_JOINT_IDX.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inJoint1Idx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMappedJointIdx].
    public final int getMappedJointIdx(
    	int inJoint1Idx
    ) {
    	return getMappedJointIdx(
    		this.segment,
    		inJoint1Idx
    	);
    }
    
    /// ```
    /// Search through the locked translations (mLockedTranslations) and find if joint inJoint2Idx is locked.
    /// ```
    public static boolean isJointTranslationLocked(
    	MemorySegment self,
    	int inJoint2Idx
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_IS_JOINT_TRANSLATION_LOCKED.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inJoint2Idx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isJointTranslationLocked].
    public final boolean isJointTranslationLocked(
    	int inJoint2Idx
    ) {
    	return isJointTranslationLocked(
    		this.segment,
    		inJoint2Idx
    	);
    }
    
    /// ```
    /// @name Access to the mapped joints
    /// @{
    /// ```
    public static MemorySegment getMappings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_MAPPINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMappings].
    public final @Nullable MappingArray getMappings() {
    	MemorySegment segment = getMappings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MappingArray(segment);
    }
    
    public static MemorySegment getMappings1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_MAPPINGS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMappings1].
    public final @Nullable MappingArray getMappings1() {
    	MemorySegment segment = getMappings1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MappingArray(segment);
    }
    
    public static MemorySegment getChains(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_CHAINS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getChains].
    public final @Nullable ChainArray getChains() {
    	MemorySegment segment = getChains(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ChainArray(segment);
    }
    
    public static MemorySegment getChains1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_CHAINS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getChains1].
    public final @Nullable ChainArray getChains1() {
    	MemorySegment segment = getChains1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ChainArray(segment);
    }
    
    public static MemorySegment getUnmapped(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_UNMAPPED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUnmapped].
    public final @Nullable UnmappedArray getUnmapped() {
    	MemorySegment segment = getUnmapped(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new UnmappedArray(segment);
    }
    
    public static MemorySegment getUnmapped1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_UNMAPPED1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUnmapped1].
    public final @Nullable UnmappedArray getUnmapped1() {
    	MemorySegment segment = getUnmapped1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new UnmappedArray(segment);
    }
    
    public static MemorySegment getLockedTranslations(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_LOCKED_TRANSLATIONS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLockedTranslations].
    public final @Nullable LockedArray getLockedTranslations() {
    	MemorySegment segment = getLockedTranslations(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new LockedArray(segment);
    }
    
    public static MemorySegment getLockedTranslations1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_GET_LOCKED_TRANSLATIONS1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLockedTranslations1].
    public final @Nullable LockedArray getLockedTranslations1() {
    	MemorySegment segment = getLockedTranslations1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new LockedArray(segment);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SKELETON_MAPPER_DESTROY.get();
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