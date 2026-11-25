/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PhysicsSettings {

	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_MAX_IN_FLIGHT_BODY_PAIRS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_MAX_IN_FLIGHT_BODY_PAIRS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_STEP_LISTENERS_BATCH_SIZE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_STEP_LISTENERS_BATCH_SIZE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_STEP_LISTENER_BATCHES_PER_JOB;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_STEP_LISTENER_BATCHES_PER_JOB;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_BAUMGARTE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_BAUMGARTE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_SPECULATIVE_CONTACT_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_SPECULATIVE_CONTACT_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_PENETRATION_SLOP;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_PENETRATION_SLOP;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_LINEAR_CAST_THRESHOLD;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_LINEAR_CAST_THRESHOLD;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_LINEAR_CAST_MAX_PENETRATION;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_LINEAR_CAST_MAX_PENETRATION;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_MANIFOLD_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_MANIFOLD_TOLERANCE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_MAX_PENETRATION_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_MAX_PENETRATION_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_CONTACT_NORMAL_COS_MAX_DELTA_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_CONTACT_NORMAL_COS_MAX_DELTA_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_NUM_VELOCITY_STEPS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_NUM_VELOCITY_STEPS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_NUM_POSITION_STEPS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_NUM_POSITION_STEPS;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_MIN_VELOCITY_FOR_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_MIN_VELOCITY_FOR_RESTITUTION;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_TIME_BEFORE_SLEEP;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_TIME_BEFORE_SLEEP;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_POINT_VELOCITY_SLEEP_THRESHOLD;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_POINT_VELOCITY_SLEEP_THRESHOLD;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_CONSTRAINT_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_CONSTRAINT_WARM_START;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_USE_BODY_PAIR_CONTACT_CACHE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_USE_BODY_PAIR_CONTACT_CACHE;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_USE_MANIFOLD_REDUCTION;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_USE_MANIFOLD_REDUCTION;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_USE_LARGE_ISLAND_SPLITTER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_USE_LARGE_ISLAND_SPLITTER;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_ALLOW_SLEEPING;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_GET_CHECK_ACTIVE_EDGES;
	private static final LazyConstant<MethodHandle> JPH_PHYSICS_SETTINGS_SET_CHECK_ACTIVE_EDGES;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PHYSICS_SETTINGS_CREATE = downcallHandle("JPH_PhysicsSettings_Create", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_DESTROY = downcallHandleVoid("JPH_PhysicsSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_GET_MAX_IN_FLIGHT_BODY_PAIRS = downcallHandle("JPH_PhysicsSettings_GetMaxInFlightBodyPairs", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_MAX_IN_FLIGHT_BODY_PAIRS = downcallHandleVoid("JPH_PhysicsSettings_SetMaxInFlightBodyPairs", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SETTINGS_GET_STEP_LISTENERS_BATCH_SIZE = downcallHandle("JPH_PhysicsSettings_GetStepListenersBatchSize", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_STEP_LISTENERS_BATCH_SIZE = downcallHandleVoid("JPH_PhysicsSettings_SetStepListenersBatchSize", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SETTINGS_GET_STEP_LISTENER_BATCHES_PER_JOB = downcallHandle("JPH_PhysicsSettings_GetStepListenerBatchesPerJob", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_STEP_LISTENER_BATCHES_PER_JOB = downcallHandleVoid("JPH_PhysicsSettings_SetStepListenerBatchesPerJob", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SETTINGS_GET_BAUMGARTE = downcallHandle("JPH_PhysicsSettings_GetBaumgarte", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_BAUMGARTE = downcallHandleVoid("JPH_PhysicsSettings_SetBaumgarte", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_SPECULATIVE_CONTACT_DISTANCE = downcallHandle("JPH_PhysicsSettings_GetSpeculativeContactDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_SPECULATIVE_CONTACT_DISTANCE = downcallHandleVoid("JPH_PhysicsSettings_SetSpeculativeContactDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_PENETRATION_SLOP = downcallHandle("JPH_PhysicsSettings_GetPenetrationSlop", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_PENETRATION_SLOP = downcallHandleVoid("JPH_PhysicsSettings_SetPenetrationSlop", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_LINEAR_CAST_THRESHOLD = downcallHandle("JPH_PhysicsSettings_GetLinearCastThreshold", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_LINEAR_CAST_THRESHOLD = downcallHandleVoid("JPH_PhysicsSettings_SetLinearCastThreshold", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_LINEAR_CAST_MAX_PENETRATION = downcallHandle("JPH_PhysicsSettings_GetLinearCastMaxPenetration", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_LINEAR_CAST_MAX_PENETRATION = downcallHandleVoid("JPH_PhysicsSettings_SetLinearCastMaxPenetration", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_MANIFOLD_TOLERANCE = downcallHandle("JPH_PhysicsSettings_GetManifoldTolerance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_MANIFOLD_TOLERANCE = downcallHandleVoid("JPH_PhysicsSettings_SetManifoldTolerance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_MAX_PENETRATION_DISTANCE = downcallHandle("JPH_PhysicsSettings_GetMaxPenetrationDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_MAX_PENETRATION_DISTANCE = downcallHandleVoid("JPH_PhysicsSettings_SetMaxPenetrationDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ = downcallHandle("JPH_PhysicsSettings_GetBodyPairCacheMaxDeltaPositionSq", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ = downcallHandleVoid("JPH_PhysicsSettings_SetBodyPairCacheMaxDeltaPositionSq", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2 = downcallHandle("JPH_PhysicsSettings_GetBodyPairCacheCosMaxDeltaRotationDiv2", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2 = downcallHandleVoid("JPH_PhysicsSettings_SetBodyPairCacheCosMaxDeltaRotationDiv2", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_CONTACT_NORMAL_COS_MAX_DELTA_ROTATION = downcallHandle("JPH_PhysicsSettings_GetContactNormalCosMaxDeltaRotation", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_CONTACT_NORMAL_COS_MAX_DELTA_ROTATION = downcallHandleVoid("JPH_PhysicsSettings_SetContactNormalCosMaxDeltaRotation", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ = downcallHandle("JPH_PhysicsSettings_GetContactPointPreserveLambdaMaxDistSq", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ = downcallHandleVoid("JPH_PhysicsSettings_SetContactPointPreserveLambdaMaxDistSq", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ = downcallHandle("JPH_PhysicsSettings_GetInternalEdgeRemovalVertexToleranceSq", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ = downcallHandleVoid("JPH_PhysicsSettings_SetInternalEdgeRemovalVertexToleranceSq", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_NUM_VELOCITY_STEPS = downcallHandle("JPH_PhysicsSettings_GetNumVelocitySteps", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_NUM_VELOCITY_STEPS = downcallHandleVoid("JPH_PhysicsSettings_SetNumVelocitySteps", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SETTINGS_GET_NUM_POSITION_STEPS = downcallHandle("JPH_PhysicsSettings_GetNumPositionSteps", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_NUM_POSITION_STEPS = downcallHandleVoid("JPH_PhysicsSettings_SetNumPositionSteps", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_PHYSICS_SETTINGS_GET_MIN_VELOCITY_FOR_RESTITUTION = downcallHandle("JPH_PhysicsSettings_GetMinVelocityForRestitution", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_MIN_VELOCITY_FOR_RESTITUTION = downcallHandleVoid("JPH_PhysicsSettings_SetMinVelocityForRestitution", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_TIME_BEFORE_SLEEP = downcallHandle("JPH_PhysicsSettings_GetTimeBeforeSleep", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_TIME_BEFORE_SLEEP = downcallHandleVoid("JPH_PhysicsSettings_SetTimeBeforeSleep", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_POINT_VELOCITY_SLEEP_THRESHOLD = downcallHandle("JPH_PhysicsSettings_GetPointVelocitySleepThreshold", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_POINT_VELOCITY_SLEEP_THRESHOLD = downcallHandleVoid("JPH_PhysicsSettings_SetPointVelocitySleepThreshold", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PHYSICS_SETTINGS_GET_CONSTRAINT_WARM_START = downcallHandle("JPH_PhysicsSettings_GetConstraintWarmStart", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_CONSTRAINT_WARM_START = downcallHandleVoid("JPH_PhysicsSettings_SetConstraintWarmStart", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_PHYSICS_SETTINGS_GET_USE_BODY_PAIR_CONTACT_CACHE = downcallHandle("JPH_PhysicsSettings_GetUseBodyPairContactCache", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_USE_BODY_PAIR_CONTACT_CACHE = downcallHandleVoid("JPH_PhysicsSettings_SetUseBodyPairContactCache", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_PHYSICS_SETTINGS_GET_USE_MANIFOLD_REDUCTION = downcallHandle("JPH_PhysicsSettings_GetUseManifoldReduction", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_USE_MANIFOLD_REDUCTION = downcallHandleVoid("JPH_PhysicsSettings_SetUseManifoldReduction", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_PHYSICS_SETTINGS_GET_USE_LARGE_ISLAND_SPLITTER = downcallHandle("JPH_PhysicsSettings_GetUseLargeIslandSplitter", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_USE_LARGE_ISLAND_SPLITTER = downcallHandleVoid("JPH_PhysicsSettings_SetUseLargeIslandSplitter", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_PHYSICS_SETTINGS_GET_ALLOW_SLEEPING = downcallHandle("JPH_PhysicsSettings_GetAllowSleeping", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_ALLOW_SLEEPING = downcallHandleVoid("JPH_PhysicsSettings_SetAllowSleeping", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_PHYSICS_SETTINGS_GET_CHECK_ACTIVE_EDGES = downcallHandle("JPH_PhysicsSettings_GetCheckActiveEdges", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_PHYSICS_SETTINGS_SET_CHECK_ACTIVE_EDGES = downcallHandleVoid("JPH_PhysicsSettings_SetCheckActiveEdges", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		//@formatter:on
	}

	public PhysicsSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PhysicsSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PhysicsSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Size of body pairs array, corresponds to the maximum amount of potential body pairs that can be in flight at any time.
    /// Setting this to a low value will use less memory but slow down simulation as threads may run out of narrow phase work.
    /// ```
    public static int getMaxInFlightBodyPairs(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_MAX_IN_FLIGHT_BODY_PAIRS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxInFlightBodyPairs].
    public final int getMaxInFlightBodyPairs() {
    	return getMaxInFlightBodyPairs(
    		this.segment
    	);
    }
    
    /// ```
    /// Size of body pairs array, corresponds to the maximum amount of potential body pairs that can be in flight at any time.
    /// Setting this to a low value will use less memory but slow down simulation as threads may run out of narrow phase work.
    /// ```
    public static void setMaxInFlightBodyPairs(
    	MemorySegment self,
    	int mMaxInFlightBodyPairs
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_MAX_IN_FLIGHT_BODY_PAIRS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxInFlightBodyPairs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxInFlightBodyPairs].
    public final void setMaxInFlightBodyPairs(
    	int mMaxInFlightBodyPairs
    ) {
    	setMaxInFlightBodyPairs(
    		this.segment,
    		mMaxInFlightBodyPairs
    	);
    }
    
    /// ```
    /// How many PhysicsStepListeners to notify in 1 batch
    /// ```
    public static int getStepListenersBatchSize(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_STEP_LISTENERS_BATCH_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getStepListenersBatchSize].
    public final int getStepListenersBatchSize() {
    	return getStepListenersBatchSize(
    		this.segment
    	);
    }
    
    /// ```
    /// How many PhysicsStepListeners to notify in 1 batch
    /// ```
    public static void setStepListenersBatchSize(
    	MemorySegment self,
    	int mStepListenersBatchSize
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_STEP_LISTENERS_BATCH_SIZE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mStepListenersBatchSize
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setStepListenersBatchSize].
    public final void setStepListenersBatchSize(
    	int mStepListenersBatchSize
    ) {
    	setStepListenersBatchSize(
    		this.segment,
    		mStepListenersBatchSize
    	);
    }
    
    /// ```
    /// How many step listener batches are needed before spawning another job (set to INT_MAX if no parallelism is desired)
    /// ```
    public static int getStepListenerBatchesPerJob(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_STEP_LISTENER_BATCHES_PER_JOB.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getStepListenerBatchesPerJob].
    public final int getStepListenerBatchesPerJob() {
    	return getStepListenerBatchesPerJob(
    		this.segment
    	);
    }
    
    /// ```
    /// How many step listener batches are needed before spawning another job (set to INT_MAX if no parallelism is desired)
    /// ```
    public static void setStepListenerBatchesPerJob(
    	MemorySegment self,
    	int mStepListenerBatchesPerJob
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_STEP_LISTENER_BATCHES_PER_JOB.get();
    	try {
    		 method.invokeExact(
    			self,
    			mStepListenerBatchesPerJob
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setStepListenerBatchesPerJob].
    public final void setStepListenerBatchesPerJob(
    	int mStepListenerBatchesPerJob
    ) {
    	setStepListenerBatchesPerJob(
    		this.segment,
    		mStepListenerBatchesPerJob
    	);
    }
    
    /// ```
    /// Baumgarte stabilization factor (how much of the position error to 'fix' in 1 update) (unit: dimensionless, 0 = nothing, 1 = 100%)
    /// ```
    public static float getBaumgarte(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_BAUMGARTE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBaumgarte].
    public final float getBaumgarte() {
    	return getBaumgarte(
    		this.segment
    	);
    }
    
    /// ```
    /// Baumgarte stabilization factor (how much of the position error to 'fix' in 1 update) (unit: dimensionless, 0 = nothing, 1 = 100%)
    /// ```
    public static void setBaumgarte(
    	MemorySegment self,
    	float mBaumgarte
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_BAUMGARTE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBaumgarte
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBaumgarte].
    public final void setBaumgarte(
    	float mBaumgarte
    ) {
    	setBaumgarte(
    		this.segment,
    		mBaumgarte
    	);
    }
    
    /// ```
    /// Radius around objects inside which speculative contact points will be detected. Note that if this is too big
    /// you will get ghost collisions as speculative contacts are based on the closest points during the collision detection
    /// step which may not be the actual closest points by the time the two objects hit (unit: meters)
    /// ```
    public static float getSpeculativeContactDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_SPECULATIVE_CONTACT_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSpeculativeContactDistance].
    public final float getSpeculativeContactDistance() {
    	return getSpeculativeContactDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// Radius around objects inside which speculative contact points will be detected. Note that if this is too big
    /// you will get ghost collisions as speculative contacts are based on the closest points during the collision detection
    /// step which may not be the actual closest points by the time the two objects hit (unit: meters)
    /// ```
    public static void setSpeculativeContactDistance(
    	MemorySegment self,
    	float mSpeculativeContactDistance
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_SPECULATIVE_CONTACT_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSpeculativeContactDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSpeculativeContactDistance].
    public final void setSpeculativeContactDistance(
    	float mSpeculativeContactDistance
    ) {
    	setSpeculativeContactDistance(
    		this.segment,
    		mSpeculativeContactDistance
    	);
    }
    
    /// ```
    /// How much bodies are allowed to sink into each other (unit: meters)
    /// ```
    public static float getPenetrationSlop(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_PENETRATION_SLOP.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPenetrationSlop].
    public final float getPenetrationSlop() {
    	return getPenetrationSlop(
    		this.segment
    	);
    }
    
    /// ```
    /// How much bodies are allowed to sink into each other (unit: meters)
    /// ```
    public static void setPenetrationSlop(
    	MemorySegment self,
    	float mPenetrationSlop
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_PENETRATION_SLOP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPenetrationSlop
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPenetrationSlop].
    public final void setPenetrationSlop(
    	float mPenetrationSlop
    ) {
    	setPenetrationSlop(
    		this.segment,
    		mPenetrationSlop
    	);
    }
    
    /// ```
    /// Fraction of its inner radius a body must move per step to enable casting for the LinearCast motion quality
    /// ```
    public static float getLinearCastThreshold(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_LINEAR_CAST_THRESHOLD.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearCastThreshold].
    public final float getLinearCastThreshold() {
    	return getLinearCastThreshold(
    		this.segment
    	);
    }
    
    /// ```
    /// Fraction of its inner radius a body must move per step to enable casting for the LinearCast motion quality
    /// ```
    public static void setLinearCastThreshold(
    	MemorySegment self,
    	float mLinearCastThreshold
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_LINEAR_CAST_THRESHOLD.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLinearCastThreshold
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearCastThreshold].
    public final void setLinearCastThreshold(
    	float mLinearCastThreshold
    ) {
    	setLinearCastThreshold(
    		this.segment,
    		mLinearCastThreshold
    	);
    }
    
    /// ```
    /// Fraction of its inner radius a body may penetrate another body for the LinearCast motion quality
    /// ```
    public static float getLinearCastMaxPenetration(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_LINEAR_CAST_MAX_PENETRATION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearCastMaxPenetration].
    public final float getLinearCastMaxPenetration() {
    	return getLinearCastMaxPenetration(
    		this.segment
    	);
    }
    
    /// ```
    /// Fraction of its inner radius a body may penetrate another body for the LinearCast motion quality
    /// ```
    public static void setLinearCastMaxPenetration(
    	MemorySegment self,
    	float mLinearCastMaxPenetration
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_LINEAR_CAST_MAX_PENETRATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLinearCastMaxPenetration
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearCastMaxPenetration].
    public final void setLinearCastMaxPenetration(
    	float mLinearCastMaxPenetration
    ) {
    	setLinearCastMaxPenetration(
    		this.segment,
    		mLinearCastMaxPenetration
    	);
    }
    
    /// ```
    /// Max distance to use to determine if two points are on the same plane for determining the contact manifold between two shape faces (unit: meter)
    /// ```
    public static float getManifoldTolerance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_MANIFOLD_TOLERANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getManifoldTolerance].
    public final float getManifoldTolerance() {
    	return getManifoldTolerance(
    		this.segment
    	);
    }
    
    /// ```
    /// Max distance to use to determine if two points are on the same plane for determining the contact manifold between two shape faces (unit: meter)
    /// ```
    public static void setManifoldTolerance(
    	MemorySegment self,
    	float mManifoldTolerance
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_MANIFOLD_TOLERANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mManifoldTolerance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setManifoldTolerance].
    public final void setManifoldTolerance(
    	float mManifoldTolerance
    ) {
    	setManifoldTolerance(
    		this.segment,
    		mManifoldTolerance
    	);
    }
    
    /// ```
    /// Maximum distance to correct in a single iteration when solving position constraints (unit: meters)
    /// ```
    public static float getMaxPenetrationDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_MAX_PENETRATION_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxPenetrationDistance].
    public final float getMaxPenetrationDistance() {
    	return getMaxPenetrationDistance(
    		this.segment
    	);
    }
    
    /// ```
    /// Maximum distance to correct in a single iteration when solving position constraints (unit: meters)
    /// ```
    public static void setMaxPenetrationDistance(
    	MemorySegment self,
    	float mMaxPenetrationDistance
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_MAX_PENETRATION_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxPenetrationDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxPenetrationDistance].
    public final void setMaxPenetrationDistance(
    	float mMaxPenetrationDistance
    ) {
    	setMaxPenetrationDistance(
    		this.segment,
    		mMaxPenetrationDistance
    	);
    }
    
    /// ```
    /// 1 mm
    /// ```
    public static float getBodyPairCacheMaxDeltaPositionSq(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyPairCacheMaxDeltaPositionSq].
    public final float getBodyPairCacheMaxDeltaPositionSq() {
    	return getBodyPairCacheMaxDeltaPositionSq(
    		this.segment
    	);
    }
    
    /// ```
    /// 1 mm
    /// ```
    public static void setBodyPairCacheMaxDeltaPositionSq(
    	MemorySegment self,
    	float mBodyPairCacheMaxDeltaPositionSq
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyPairCacheMaxDeltaPositionSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyPairCacheMaxDeltaPositionSq].
    public final void setBodyPairCacheMaxDeltaPositionSq(
    	float mBodyPairCacheMaxDeltaPositionSq
    ) {
    	setBodyPairCacheMaxDeltaPositionSq(
    		this.segment,
    		mBodyPairCacheMaxDeltaPositionSq
    	);
    }
    
    /// ```
    /// cos(2 degrees / 2)
    /// ```
    public static float getBodyPairCacheCosMaxDeltaRotationDiv2(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyPairCacheCosMaxDeltaRotationDiv2].
    public final float getBodyPairCacheCosMaxDeltaRotationDiv2() {
    	return getBodyPairCacheCosMaxDeltaRotationDiv2(
    		this.segment
    	);
    }
    
    /// ```
    /// cos(2 degrees / 2)
    /// ```
    public static void setBodyPairCacheCosMaxDeltaRotationDiv2(
    	MemorySegment self,
    	float mBodyPairCacheCosMaxDeltaRotationDiv2
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyPairCacheCosMaxDeltaRotationDiv2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyPairCacheCosMaxDeltaRotationDiv2].
    public final void setBodyPairCacheCosMaxDeltaRotationDiv2(
    	float mBodyPairCacheCosMaxDeltaRotationDiv2
    ) {
    	setBodyPairCacheCosMaxDeltaRotationDiv2(
    		this.segment,
    		mBodyPairCacheCosMaxDeltaRotationDiv2
    	);
    }
    
    /// ```
    /// cos(5 degree)
    /// ```
    public static float getContactNormalCosMaxDeltaRotation(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_CONTACT_NORMAL_COS_MAX_DELTA_ROTATION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactNormalCosMaxDeltaRotation].
    public final float getContactNormalCosMaxDeltaRotation() {
    	return getContactNormalCosMaxDeltaRotation(
    		this.segment
    	);
    }
    
    /// ```
    /// cos(5 degree)
    /// ```
    public static void setContactNormalCosMaxDeltaRotation(
    	MemorySegment self,
    	float mContactNormalCosMaxDeltaRotation
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_CONTACT_NORMAL_COS_MAX_DELTA_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mContactNormalCosMaxDeltaRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactNormalCosMaxDeltaRotation].
    public final void setContactNormalCosMaxDeltaRotation(
    	float mContactNormalCosMaxDeltaRotation
    ) {
    	setContactNormalCosMaxDeltaRotation(
    		this.segment,
    		mContactNormalCosMaxDeltaRotation
    	);
    }
    
    /// ```
    /// 1 cm
    /// ```
    public static float getContactPointPreserveLambdaMaxDistSq(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactPointPreserveLambdaMaxDistSq].
    public final float getContactPointPreserveLambdaMaxDistSq() {
    	return getContactPointPreserveLambdaMaxDistSq(
    		this.segment
    	);
    }
    
    /// ```
    /// 1 cm
    /// ```
    public static void setContactPointPreserveLambdaMaxDistSq(
    	MemorySegment self,
    	float mContactPointPreserveLambdaMaxDistSq
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ.get();
    	try {
    		 method.invokeExact(
    			self,
    			mContactPointPreserveLambdaMaxDistSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactPointPreserveLambdaMaxDistSq].
    public final void setContactPointPreserveLambdaMaxDistSq(
    	float mContactPointPreserveLambdaMaxDistSq
    ) {
    	setContactPointPreserveLambdaMaxDistSq(
    		this.segment,
    		mContactPointPreserveLambdaMaxDistSq
    	);
    }
    
    /// ```
    /// Max squared distance to consider a vertex to be the same as another vertex, used by the internal edge removal algorithm to determine if two edges are shared. (unit: meter^2)
    /// ```
    public static float getInternalEdgeRemovalVertexToleranceSq(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInternalEdgeRemovalVertexToleranceSq].
    public final float getInternalEdgeRemovalVertexToleranceSq() {
    	return getInternalEdgeRemovalVertexToleranceSq(
    		this.segment
    	);
    }
    
    /// ```
    /// Max squared distance to consider a vertex to be the same as another vertex, used by the internal edge removal algorithm to determine if two edges are shared. (unit: meter^2)
    /// ```
    public static void setInternalEdgeRemovalVertexToleranceSq(
    	MemorySegment self,
    	float mInternalEdgeRemovalVertexToleranceSq
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_INTERNAL_EDGE_REMOVAL_VERTEX_TOLERANCE_SQ.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInternalEdgeRemovalVertexToleranceSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInternalEdgeRemovalVertexToleranceSq].
    public final void setInternalEdgeRemovalVertexToleranceSq(
    	float mInternalEdgeRemovalVertexToleranceSq
    ) {
    	setInternalEdgeRemovalVertexToleranceSq(
    		this.segment,
    		mInternalEdgeRemovalVertexToleranceSq
    	);
    }
    
    /// ```
    /// Number of solver velocity iterations to run
    /// Note that this needs to be >= 2 in order for friction to work (friction is applied using the non-penetration impulse from the previous iteration)
    /// ```
    public static int getNumVelocitySteps(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_NUM_VELOCITY_STEPS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumVelocitySteps].
    public final int getNumVelocitySteps() {
    	return getNumVelocitySteps(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of solver velocity iterations to run
    /// Note that this needs to be >= 2 in order for friction to work (friction is applied using the non-penetration impulse from the previous iteration)
    /// ```
    public static void setNumVelocitySteps(
    	MemorySegment self,
    	int mNumVelocitySteps
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_NUM_VELOCITY_STEPS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumVelocitySteps
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumVelocitySteps].
    public final void setNumVelocitySteps(
    	int mNumVelocitySteps
    ) {
    	setNumVelocitySteps(
    		this.segment,
    		mNumVelocitySteps
    	);
    }
    
    /// ```
    /// Number of solver position iterations to run
    /// ```
    public static int getNumPositionSteps(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_NUM_POSITION_STEPS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumPositionSteps].
    public final int getNumPositionSteps() {
    	return getNumPositionSteps(
    		this.segment
    	);
    }
    
    /// ```
    /// Number of solver position iterations to run
    /// ```
    public static void setNumPositionSteps(
    	MemorySegment self,
    	int mNumPositionSteps
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_NUM_POSITION_STEPS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNumPositionSteps
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNumPositionSteps].
    public final void setNumPositionSteps(
    	int mNumPositionSteps
    ) {
    	setNumPositionSteps(
    		this.segment,
    		mNumPositionSteps
    	);
    }
    
    /// ```
    /// Minimal velocity needed before a collision can be elastic. If the relative velocity between colliding objects
    /// in the direction of the contact normal is lower than this, the restitution will be zero regardless of the configured
    /// value. This lets an object settle sooner. Must be a positive number. (unit: m)
    /// ```
    public static float getMinVelocityForRestitution(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_MIN_VELOCITY_FOR_RESTITUTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinVelocityForRestitution].
    public final float getMinVelocityForRestitution() {
    	return getMinVelocityForRestitution(
    		this.segment
    	);
    }
    
    /// ```
    /// Minimal velocity needed before a collision can be elastic. If the relative velocity between colliding objects
    /// in the direction of the contact normal is lower than this, the restitution will be zero regardless of the configured
    /// value. This lets an object settle sooner. Must be a positive number. (unit: m)
    /// ```
    public static void setMinVelocityForRestitution(
    	MemorySegment self,
    	float mMinVelocityForRestitution
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_MIN_VELOCITY_FOR_RESTITUTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMinVelocityForRestitution
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMinVelocityForRestitution].
    public final void setMinVelocityForRestitution(
    	float mMinVelocityForRestitution
    ) {
    	setMinVelocityForRestitution(
    		this.segment,
    		mMinVelocityForRestitution
    	);
    }
    
    /// ```
    /// Time before object is allowed to go to sleep (unit: seconds)
    /// ```
    public static float getTimeBeforeSleep(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_TIME_BEFORE_SLEEP.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTimeBeforeSleep].
    public final float getTimeBeforeSleep() {
    	return getTimeBeforeSleep(
    		this.segment
    	);
    }
    
    /// ```
    /// Time before object is allowed to go to sleep (unit: seconds)
    /// ```
    public static void setTimeBeforeSleep(
    	MemorySegment self,
    	float mTimeBeforeSleep
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_TIME_BEFORE_SLEEP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTimeBeforeSleep
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTimeBeforeSleep].
    public final void setTimeBeforeSleep(
    	float mTimeBeforeSleep
    ) {
    	setTimeBeforeSleep(
    		this.segment,
    		mTimeBeforeSleep
    	);
    }
    
    /// ```
    /// To detect if an object is sleeping, we use 3 points:
    /// - The center of mass.
    /// - The centers of the faces of the bounding box that are furthest away from the center.
    /// The movement of these points is tracked and if the velocity of all 3 points is lower than this value,
    /// the object is allowed to go to sleep. Must be a positive number. (unit: m/s)
    /// ```
    public static float getPointVelocitySleepThreshold(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_POINT_VELOCITY_SLEEP_THRESHOLD.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPointVelocitySleepThreshold].
    public final float getPointVelocitySleepThreshold() {
    	return getPointVelocitySleepThreshold(
    		this.segment
    	);
    }
    
    /// ```
    /// To detect if an object is sleeping, we use 3 points:
    /// - The center of mass.
    /// - The centers of the faces of the bounding box that are furthest away from the center.
    /// The movement of these points is tracked and if the velocity of all 3 points is lower than this value,
    /// the object is allowed to go to sleep. Must be a positive number. (unit: m/s)
    /// ```
    public static void setPointVelocitySleepThreshold(
    	MemorySegment self,
    	float mPointVelocitySleepThreshold
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_POINT_VELOCITY_SLEEP_THRESHOLD.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPointVelocitySleepThreshold
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPointVelocitySleepThreshold].
    public final void setPointVelocitySleepThreshold(
    	float mPointVelocitySleepThreshold
    ) {
    	setPointVelocitySleepThreshold(
    		this.segment,
    		mPointVelocitySleepThreshold
    	);
    }
    
    /// ```
    /// Whether or not to use warm starting for constraints (initially applying previous frames impulses)
    /// ```
    public static boolean getConstraintWarmStart(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_CONSTRAINT_WARM_START.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraintWarmStart].
    public final boolean getConstraintWarmStart() {
    	return getConstraintWarmStart(
    		this.segment
    	);
    }
    
    /// ```
    /// Whether or not to use warm starting for constraints (initially applying previous frames impulses)
    /// ```
    public static void setConstraintWarmStart(
    	MemorySegment self,
    	boolean mConstraintWarmStart
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_CONSTRAINT_WARM_START.get();
    	try {
    		 method.invokeExact(
    			self,
    			mConstraintWarmStart
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setConstraintWarmStart].
    public final void setConstraintWarmStart(
    	boolean mConstraintWarmStart
    ) {
    	setConstraintWarmStart(
    		this.segment,
    		mConstraintWarmStart
    	);
    }
    
    /// ```
    /// Whether or not to use the body pair cache, which removes the need for narrow phase collision detection when orientation between two bodies didn't change
    /// ```
    public static boolean getUseBodyPairContactCache(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_USE_BODY_PAIR_CONTACT_CACHE.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUseBodyPairContactCache].
    public final boolean getUseBodyPairContactCache() {
    	return getUseBodyPairContactCache(
    		this.segment
    	);
    }
    
    /// ```
    /// Whether or not to use the body pair cache, which removes the need for narrow phase collision detection when orientation between two bodies didn't change
    /// ```
    public static void setUseBodyPairContactCache(
    	MemorySegment self,
    	boolean mUseBodyPairContactCache
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_USE_BODY_PAIR_CONTACT_CACHE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUseBodyPairContactCache
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUseBodyPairContactCache].
    public final void setUseBodyPairContactCache(
    	boolean mUseBodyPairContactCache
    ) {
    	setUseBodyPairContactCache(
    		this.segment,
    		mUseBodyPairContactCache
    	);
    }
    
    /// ```
    /// Whether or not to reduce manifolds with similar contact normals into one contact manifold (see description at Body::SetUseManifoldReduction)
    /// ```
    public static boolean getUseManifoldReduction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_USE_MANIFOLD_REDUCTION.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUseManifoldReduction].
    public final boolean getUseManifoldReduction() {
    	return getUseManifoldReduction(
    		this.segment
    	);
    }
    
    /// ```
    /// Whether or not to reduce manifolds with similar contact normals into one contact manifold (see description at Body::SetUseManifoldReduction)
    /// ```
    public static void setUseManifoldReduction(
    	MemorySegment self,
    	boolean mUseManifoldReduction
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_USE_MANIFOLD_REDUCTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUseManifoldReduction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUseManifoldReduction].
    public final void setUseManifoldReduction(
    	boolean mUseManifoldReduction
    ) {
    	setUseManifoldReduction(
    		this.segment,
    		mUseManifoldReduction
    	);
    }
    
    /// ```
    /// If we split up large islands into smaller parallel batches of work (to improve performance)
    /// ```
    public static boolean getUseLargeIslandSplitter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_USE_LARGE_ISLAND_SPLITTER.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUseLargeIslandSplitter].
    public final boolean getUseLargeIslandSplitter() {
    	return getUseLargeIslandSplitter(
    		this.segment
    	);
    }
    
    /// ```
    /// If we split up large islands into smaller parallel batches of work (to improve performance)
    /// ```
    public static void setUseLargeIslandSplitter(
    	MemorySegment self,
    	boolean mUseLargeIslandSplitter
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_USE_LARGE_ISLAND_SPLITTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUseLargeIslandSplitter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUseLargeIslandSplitter].
    public final void setUseLargeIslandSplitter(
    	boolean mUseLargeIslandSplitter
    ) {
    	setUseLargeIslandSplitter(
    		this.segment,
    		mUseLargeIslandSplitter
    	);
    }
    
    /// ```
    /// If objects can go to sleep or not
    /// ```
    public static boolean getAllowSleeping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_ALLOW_SLEEPING.get();
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
    /// If objects can go to sleep or not
    /// ```
    public static void setAllowSleeping(
    	MemorySegment self,
    	boolean mAllowSleeping
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_ALLOW_SLEEPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAllowSleeping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAllowSleeping].
    public final void setAllowSleeping(
    	boolean mAllowSleeping
    ) {
    	setAllowSleeping(
    		this.segment,
    		mAllowSleeping
    	);
    }
    
    /// ```
    /// When false, we prevent collision against non-active (shared) edges. Mainly for debugging the algorithm.
    /// ```
    public static boolean getCheckActiveEdges(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_GET_CHECK_ACTIVE_EDGES.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCheckActiveEdges].
    public final boolean getCheckActiveEdges() {
    	return getCheckActiveEdges(
    		this.segment
    	);
    }
    
    /// ```
    /// When false, we prevent collision against non-active (shared) edges. Mainly for debugging the algorithm.
    /// ```
    public static void setCheckActiveEdges(
    	MemorySegment self,
    	boolean mCheckActiveEdges
    ) {
    	MethodHandle method = JPH_PHYSICS_SETTINGS_SET_CHECK_ACTIVE_EDGES.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCheckActiveEdges
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCheckActiveEdges].
    public final void setCheckActiveEdges(
    	boolean mCheckActiveEdges
    ) {
    	setCheckActiveEdges(
    		this.segment,
    		mCheckActiveEdges
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}