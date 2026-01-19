package volucris.engine.physics.jolt.physicsSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.utils.MathUtils;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public final class PhysicsSettings {

	public static final float DEFAULT_COLLISION_TOLERANCE = 1.0e-4f;
	public static final float DEFAULT_PENETRATION_TOLERANCE = 1.0e-4f;
	public static final float DEFAULT_CONVEX_RADIUS = 0.05f;
	public static final float CAPSULE_PROJECTION_SLOP = 0.02f;
	public static final int MAX_PHYSICS_JOBS = 2048;
	public static final int MAX_PHYSICS_BARRIERS = 8;

	private static final StructLayout LAYOUT;

	private static final VarHandle MAX_IN_FLIGHT_BODY_PAIRS;
	private static final VarHandle STEP_LISTENERS_BATCH_SIZE;
	private static final VarHandle STEP_LISTENER_BATCHES_PER_JOB;
	private static final VarHandle BAUMGARTE;
	private static final VarHandle SPECULATIVE_CONTACT_DISTANCE;
	private static final VarHandle PENETRATION_SLOP;
	private static final VarHandle LINEAR_CAST_THRESHOLD;
	private static final VarHandle LINEAR_CAST_MAX_PENETRATION;
	private static final VarHandle MANIFOLD_TOLERANCE;
	private static final VarHandle MAX_PENETRATION_DISTANCE;
	private static final VarHandle BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ;
	private static final VarHandle BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2;
	private static final VarHandle CONTACT_NORMAL_COS_MAX_DELTA_ROTATION;
	private static final VarHandle CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ;
	private static final VarHandle NUM_VELOCITY_STEPS;
	private static final VarHandle NUM_POSITION_STEPS;
	private static final VarHandle MIN_VELOCITY_FOR_RESTITUTION;
	private static final VarHandle TIME_BEFORE_SLEEP;
	private static final VarHandle POINT_VELOCITY_SLEEP_THRESHOLD;
	private static final VarHandle DETERMINISTIC_SIMULATION;
	private static final VarHandle CONSTRAINT_WARM_START;
	private static final VarHandle USE_BODY_PAIR_CONTACT_CACHE;
	private static final VarHandle USE_MANIFOLD_REDUCTION;
	private static final VarHandle USE_LARGE_ISLAND_SPLITTER;
	private static final VarHandle ALLOW_SLEEPING;
	private static final VarHandle CHECK_ACTIVE_EDGES;

	private final MemorySegment jphPhysicsSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("maxInFlightBodyPairs"),
		        JAVA_INT.withName("stepListenersBatchSize"),
		        JAVA_INT.withName("stepListenerBatchesPerJob"),
		        JAVA_FLOAT.withName("baumgarte"),
		        JAVA_FLOAT.withName("speculativeContactDistance"),
		        JAVA_FLOAT.withName("penetrationSlop"),
		        JAVA_FLOAT.withName("linearCastThreshold"),
		        JAVA_FLOAT.withName("linearCastMaxPenetration"),
		        JAVA_FLOAT.withName("manifoldTolerance"),
		        JAVA_FLOAT.withName("maxPenetrationDistance"),
		        JAVA_FLOAT.withName("bodyPairCacheMaxDeltaPositionSq"),
		        JAVA_FLOAT.withName("bodyPairCacheCosMaxDeltaRotationDiv2"),
		        JAVA_FLOAT.withName("contactNormalCosMaxDeltaRotation"),
		        JAVA_FLOAT.withName("contactPointPreserveLambdaMaxDistSq"),
		        JAVA_INT.withName("numVelocitySteps"),
		        JAVA_INT.withName("numPositionSteps"),
		        JAVA_FLOAT.withName("minVelocityForRestitution"),
		        JAVA_FLOAT.withName("timeBeforeSleep"),
		        JAVA_FLOAT.withName("pointVelocitySleepThreshold"),
		        JAVA_BOOLEAN.withName("deterministicSimulation"),
		        JAVA_BOOLEAN.withName("constraintWarmStart"),
		        JAVA_BOOLEAN.withName("useBodyPairContactCache"),
		        JAVA_BOOLEAN.withName("useManifoldReduction"),
		        JAVA_BOOLEAN.withName("useLargeIslandSplitter"),
		        JAVA_BOOLEAN.withName("allowSleeping"),
		        JAVA_BOOLEAN.withName("checkActiveEdges"),
		        MemoryLayout.paddingLayout(1)
			).withName("JPH_PhysicsSettings");
		
		 MAX_IN_FLIGHT_BODY_PAIRS = varHandle(LAYOUT, "maxInFlightBodyPairs"); 
		 STEP_LISTENERS_BATCH_SIZE = varHandle(LAYOUT, "stepListenersBatchSize"); 
		 STEP_LISTENER_BATCHES_PER_JOB = varHandle(LAYOUT, "stepListenerBatchesPerJob"); 
		 BAUMGARTE = varHandle(LAYOUT, "baumgarte"); 
		 SPECULATIVE_CONTACT_DISTANCE = varHandle(LAYOUT, "speculativeContactDistance"); 
		 PENETRATION_SLOP = varHandle(LAYOUT, "penetrationSlop"); 
		 LINEAR_CAST_THRESHOLD = varHandle(LAYOUT, "linearCastThreshold"); 
		 LINEAR_CAST_MAX_PENETRATION = varHandle(LAYOUT, "linearCastMaxPenetration"); 
		 MANIFOLD_TOLERANCE = varHandle(LAYOUT, "manifoldTolerance"); 
		 MAX_PENETRATION_DISTANCE = varHandle(LAYOUT, "maxPenetrationDistance"); 
		 BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ = varHandle(LAYOUT, "bodyPairCacheMaxDeltaPositionSq"); 
		 BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2 = varHandle(LAYOUT, "bodyPairCacheCosMaxDeltaRotationDiv2"); 
		 CONTACT_NORMAL_COS_MAX_DELTA_ROTATION = varHandle(LAYOUT, "contactNormalCosMaxDeltaRotation"); 
		 CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ = varHandle(LAYOUT, "contactPointPreserveLambdaMaxDistSq"); 
		 NUM_VELOCITY_STEPS = varHandle(LAYOUT, "numVelocitySteps"); 
		 NUM_POSITION_STEPS = varHandle(LAYOUT, "numPositionSteps"); 
		 MIN_VELOCITY_FOR_RESTITUTION = varHandle(LAYOUT, "minVelocityForRestitution"); 
		 TIME_BEFORE_SLEEP = varHandle(LAYOUT, "timeBeforeSleep"); 
		 POINT_VELOCITY_SLEEP_THRESHOLD = varHandle(LAYOUT, "pointVelocitySleepThreshold"); 
		 DETERMINISTIC_SIMULATION = varHandle(LAYOUT, "deterministicSimulation"); 
		 CONSTRAINT_WARM_START = varHandle(LAYOUT, "constraintWarmStart"); 
		 USE_BODY_PAIR_CONTACT_CACHE = varHandle(LAYOUT, "useBodyPairContactCache"); 
		 USE_MANIFOLD_REDUCTION = varHandle(LAYOUT, "useManifoldReduction"); 
		 USE_LARGE_ISLAND_SPLITTER = varHandle(LAYOUT, "useLargeIslandSplitter"); 
		 ALLOW_SLEEPING = varHandle(LAYOUT, "allowSleeping"); 
		 CHECK_ACTIVE_EDGES = varHandle(LAYOUT, "checkActiveEdges"); 	
		//@formatter:on
	}

	public PhysicsSettings() {
		this(Arena.ofAuto());
	}

	public PhysicsSettings(Arena arena) {
		jphPhysicsSettings = arena.allocate(LAYOUT);

		setMaxInFlightBodyPairs(16384);
		setStepListenersBatchSize(8);
		setStepListenerBatchesPerJob(1);
		setBaumgarte(0.2f);
		setSpeculativeContactDistance(0.02f);
		setPenetrationSlop(0.02f);
		setLinearCastThreshold(0.75f);
		setLinearCastMaxPenetration(0.25f);
		setManifoldTolerance(1.0e-3f);
		setMaxPenetrationDistance(0.2f);
		setBodyPairCacheMaxDeltaPositionSq(MathUtils.pow(0.001f, 2));
		setBodyPairCacheCosMaxDeltaRotationDiv2(0.99984769515639123915701155881391f);
		setContactNormalCosMaxDeltaRotation(0.99619469809174553229501040247389f);
		setContactPointPreserveLambdaMaxDistSq(MathUtils.pow(0.001f, 2));
		setNumVelocitySteps(10);
		setNumPositionSteps(10);
		setMinVelocityForRestitution(1.0f);
		setTimeBeforeSleep(0.5f);
		setPointVelocitySleepThreshold(0.03f);
		setDeterministicSimulation(true);

		CONSTRAINT_WARM_START.set(jphPhysicsSettings, true);
		USE_BODY_PAIR_CONTACT_CACHE.set(jphPhysicsSettings, true);
		USE_MANIFOLD_REDUCTION.set(jphPhysicsSettings, true);
		USE_LARGE_ISLAND_SPLITTER.set(jphPhysicsSettings, true);
		ALLOW_SLEEPING.set(jphPhysicsSettings, true);
		CHECK_ACTIVE_EDGES.set(jphPhysicsSettings, true);
	}

	/**
	 * Size of body pairs array, corresponds to the maximum amount of potential body
	 * pairs that can be in flight at any time. Setting this to a low value will use
	 * less memory but slow down simulation as threads may run out of narrow phase
	 * work.
	 */
	public void setMaxInFlightBodyPairs(int maxInFlightBodyPairs) {
		MAX_IN_FLIGHT_BODY_PAIRS.set(jphPhysicsSettings, maxInFlightBodyPairs);
	}

	/**
	 * How many PhysicsStepListeners to notify in 1 batch.
	 */
	public void setStepListenersBatchSize(int stepListenersBatchSize) {
		STEP_LISTENERS_BATCH_SIZE.set(jphPhysicsSettings, stepListenersBatchSize);
	}

	/**
	 * How many step listener batches are needed before spawning another job (set to
	 * INT_MAX if no parallelism is desired)
	 */
	public void setStepListenerBatchesPerJob(int stepListenerBatchesPerJob) {
		STEP_LISTENER_BATCHES_PER_JOB.set(jphPhysicsSettings, stepListenerBatchesPerJob);
	}

	/**
	 * Baumgarte stabilization factor (how much of the position error to 'fix' in 1
	 * update) (unit: dimensionless, 0 = nothing, 1 = 100%)
	 */
	public void setBaumgarte(float baumgarte) {
		BAUMGARTE.set(jphPhysicsSettings, baumgarte);
	}

	/**
	 * Radius around objects inside which speculative contact points will be
	 * detected. Note that if this is too big you will get ghost collisions as
	 * speculative contacts are based on the closest points during the collision
	 * detection step which may not be the actual closest points by the time the two
	 * objects hit (unit: meters)
	 */
	public void setSpeculativeContactDistance(float speculativeContactDistance) {
		SPECULATIVE_CONTACT_DISTANCE.set(jphPhysicsSettings, speculativeContactDistance);
	}

	/**
	 * How much bodies are allowed to sink into each other (unit: meters)
	 */
	public void setPenetrationSlop(float penetrationSlop) {
		PENETRATION_SLOP.set(jphPhysicsSettings, penetrationSlop);
	}

	/**
	 * Fraction of its inner radius a body must move per step to enable casting for
	 * the LinearCast motion quality.
	 */
	public void setLinearCastThreshold(float linearCastThreshold) {
		LINEAR_CAST_THRESHOLD.set(jphPhysicsSettings, linearCastThreshold);
	}

	/**
	 * Fraction of its inner radius a body may penetrate another body for the
	 * LinearCast motion quality.
	 */
	public void setLinearCastMaxPenetration(float linearCastMaxPenetration) {
		LINEAR_CAST_MAX_PENETRATION.set(jphPhysicsSettings, linearCastMaxPenetration);
	}

	/**
	 * Max distance to use to determine if two points are on the same plane for
	 * determining the contact manifold between two shape faces (unit: meter)
	 */
	public void setManifoldTolerance(float manifoldTolerance) {
		MANIFOLD_TOLERANCE.set(jphPhysicsSettings, manifoldTolerance);
	}

	/**
	 * Maximum distance to correct in a single iteration when solving position
	 * constraints (unit: meters)
	 */
	public void setMaxPenetrationDistance(float maxPenetrationDistance) {
		MAX_PENETRATION_DISTANCE.set(jphPhysicsSettings, maxPenetrationDistance);
	}

	/**
	 * Maximum relative delta position for body pairs to be able to reuse collision
	 * results from last frame (units: meter^2)
	 */
	public void setBodyPairCacheMaxDeltaPositionSq(float bodyPairCacheMaxDeltaPositionSq) {
		BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ.set(jphPhysicsSettings, bodyPairCacheMaxDeltaPositionSq);
	}

	/**
	 * Maximum relative delta orientation for body pairs to be able to reuse
	 * collision results from last frame, stored as cos(max angle / 2)
	 */
	public void setBodyPairCacheCosMaxDeltaRotationDiv2(float bodyPairCacheCosMaxDeltaRotationDiv2) {
		BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2.set(jphPhysicsSettings, bodyPairCacheCosMaxDeltaRotationDiv2);
	}

	/**
	 * Maximum angle between normals that allows manifolds between different sub
	 * shapes of the same body pair to be combined.
	 */
	public void setContactNormalCosMaxDeltaRotation(float contactNormalCosMaxDeltaRotation) {
		CONTACT_NORMAL_COS_MAX_DELTA_ROTATION.set(jphPhysicsSettings, contactNormalCosMaxDeltaRotation);
	}

	/**
	 * Maximum allowed distance between old and new contact point to preserve
	 * contact forces for warm start (units: meter^2)
	 */
	public void setContactPointPreserveLambdaMaxDistSq(float contactPointPreserveLambdaMaxDistSq) {
		CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ.set(jphPhysicsSettings, contactPointPreserveLambdaMaxDistSq);
	}

	/**
	 * Number of solver velocity iterations to run Note that this needs to be >= 2
	 * in order for friction to work (friction is applied using the non-penetration
	 * impulse from the previous iteration)
	 */
	public void setNumVelocitySteps(int numVelocitySteps) {
		NUM_VELOCITY_STEPS.set(jphPhysicsSettings, numVelocitySteps);
	}

	/**
	 * Number of solver position iterations to run.
	 */
	public void setNumPositionSteps(int numPositionSteps) {
		NUM_POSITION_STEPS.set(jphPhysicsSettings, numPositionSteps);
	}

	/**
	 * Minimal velocity needed before a collision can be elastic. If the relative
	 * velocity between colliding objects in the direction of the contact normal is
	 * lower than this, the restitution will be zero regardless of the configured
	 * value. This lets an object settle sooner. Must be a positive number. (unit:
	 * m)
	 */
	public void setMinVelocityForRestitution(float minVelocityForRestitution) {
		MIN_VELOCITY_FOR_RESTITUTION.set(jphPhysicsSettings, minVelocityForRestitution);
	}

	/**
	 * Time before object is allowed to go to sleep (unit: seconds)
	 */
	public void setTimeBeforeSleep(float timeBeforeSleep) {
		TIME_BEFORE_SLEEP.set(jphPhysicsSettings, timeBeforeSleep);
	}

	/**
	 * 
	 * 
	 * To detect if an object is sleeping, we use 3 points:
	 * <ul>
	 * <li>The center of mass.
	 * <li>The centers of the faces of the bounding box that are furthest away from
	 * the center. The movement of these points is tracked and if the velocity of
	 * all 3 points is lower than this value, the object is allowed to go to sleep.
	 * Must be a positive number. (unit: m/s)
	 * </ul>
	 * 
	 */
	public void setPointVelocitySleepThreshold(float pointVelocitySleepThreshold) {
		POINT_VELOCITY_SLEEP_THRESHOLD.set(jphPhysicsSettings, pointVelocitySleepThreshold);
	}

	/**
	 * By default the simulation is deterministic, it is possible to turn this off
	 * by setting this setting to false. This will make the simulation run faster
	 * but it will no longer be deterministic.
	 * <p>
	 * This variable is mainly for debugging purposes, it allows turning on/off this
	 * subsystem. You probably want to leave it alone.
	 */
	public void setDeterministicSimulation(boolean deterministicSimulation) {
		DETERMINISTIC_SIMULATION.set(jphPhysicsSettings, deterministicSimulation);
	}

	/**
	 * Whether or not to reduce manifolds with similar contact normals into one
	 * contact manifold (see description at
	 * {@link volucris.engine.physics.jolt.body.Body#setUseManifoldReduction(boolean)
	 * Body.SetUseManifoldReduction}
	 */
	public void useManifoldReduction(boolean value) {
		USE_MANIFOLD_REDUCTION.set(jphPhysicsSettings, value);
	}

	public MemorySegment memorySegment() {
		return jphPhysicsSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
