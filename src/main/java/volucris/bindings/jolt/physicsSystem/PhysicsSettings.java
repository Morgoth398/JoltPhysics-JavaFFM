/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physicsSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/**
 * 
 */
public final class PhysicsSettings
		implements Struct<PhysicsSettings> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_IN_FLIGHT_BODY_PAIRS;
    public static final VarHandle STEP_LISTENERS_BATCH_SIZE;
    public static final VarHandle STEP_LISTENER_BATCHES_PER_JOB;
    public static final VarHandle BAUMGARTE;
    public static final VarHandle SPECULATIVE_CONTACT_DISTANCE;
    public static final VarHandle PENETRATION_SLOP;
    public static final VarHandle LINEAR_CAST_THRESHOLD;
    public static final VarHandle LINEAR_CAST_MAX_PENETRATION;
    public static final VarHandle MANIFOLD_TOLERANCE;
    public static final VarHandle MAX_PENETRATION_DISTANCE;
    public static final VarHandle BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ;
    public static final VarHandle BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2;
    public static final VarHandle CONTACT_NORMAL_COS_MAX_DELTA_ROTATION;
    public static final VarHandle CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ;
    public static final VarHandle NUM_VELOCITY_STEPS;
    public static final VarHandle NUM_POSITION_STEPS;
    public static final VarHandle MIN_VELOCITY_FOR_RESTITUTION;
    public static final VarHandle TIME_BEFORE_SLEEP;
    public static final VarHandle POINT_VELOCITY_SLEEP_THRESHOLD;
    public static final VarHandle DETERMINISTIC_SIMULATION;
    public static final VarHandle CONSTRAINT_WARM_START;
    public static final VarHandle USE_BODY_PAIR_CONTACT_CACHE;
    public static final VarHandle USE_MANIFOLD_REDUCTION;
    public static final VarHandle USE_LARGE_ISLAND_SPLITTER;
    public static final VarHandle ALLOW_SLEEPING;
    public static final VarHandle CHECK_ACTIVE_EDGES;

    public static final long MAX_IN_FLIGHT_BODY_PAIRS_OFFSET;
    public static final long STEP_LISTENERS_BATCH_SIZE_OFFSET;
    public static final long STEP_LISTENER_BATCHES_PER_JOB_OFFSET;
    public static final long BAUMGARTE_OFFSET;
    public static final long SPECULATIVE_CONTACT_DISTANCE_OFFSET;
    public static final long PENETRATION_SLOP_OFFSET;
    public static final long LINEAR_CAST_THRESHOLD_OFFSET;
    public static final long LINEAR_CAST_MAX_PENETRATION_OFFSET;
    public static final long MANIFOLD_TOLERANCE_OFFSET;
    public static final long MAX_PENETRATION_DISTANCE_OFFSET;
    public static final long BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ_OFFSET;
    public static final long BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2_OFFSET;
    public static final long CONTACT_NORMAL_COS_MAX_DELTA_ROTATION_OFFSET;
    public static final long CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ_OFFSET;
    public static final long NUM_VELOCITY_STEPS_OFFSET;
    public static final long NUM_POSITION_STEPS_OFFSET;
    public static final long MIN_VELOCITY_FOR_RESTITUTION_OFFSET;
    public static final long TIME_BEFORE_SLEEP_OFFSET;
    public static final long POINT_VELOCITY_SLEEP_THRESHOLD_OFFSET;
    public static final long DETERMINISTIC_SIMULATION_OFFSET;
    public static final long CONSTRAINT_WARM_START_OFFSET;
    public static final long USE_BODY_PAIR_CONTACT_CACHE_OFFSET;
    public static final long USE_MANIFOLD_REDUCTION_OFFSET;
    public static final long USE_LARGE_ISLAND_SPLITTER_OFFSET;
    public static final long ALLOW_SLEEPING_OFFSET;
    public static final long CHECK_ACTIVE_EDGES_OFFSET;

    private final MemorySegment segment;

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
        ).withName("JPH_PhysicsSettings").withByteAlignment(4);
        
        MAX_IN_FLIGHT_BODY_PAIRS = LAYOUT.varHandle(PathElement.groupElement("maxInFlightBodyPairs"));
        STEP_LISTENERS_BATCH_SIZE = LAYOUT.varHandle(PathElement.groupElement("stepListenersBatchSize"));
        STEP_LISTENER_BATCHES_PER_JOB = LAYOUT.varHandle(PathElement.groupElement("stepListenerBatchesPerJob"));
        BAUMGARTE = LAYOUT.varHandle(PathElement.groupElement("baumgarte"));
        SPECULATIVE_CONTACT_DISTANCE = LAYOUT.varHandle(PathElement.groupElement("speculativeContactDistance"));
        PENETRATION_SLOP = LAYOUT.varHandle(PathElement.groupElement("penetrationSlop"));
        LINEAR_CAST_THRESHOLD = LAYOUT.varHandle(PathElement.groupElement("linearCastThreshold"));
        LINEAR_CAST_MAX_PENETRATION = LAYOUT.varHandle(PathElement.groupElement("linearCastMaxPenetration"));
        MANIFOLD_TOLERANCE = LAYOUT.varHandle(PathElement.groupElement("manifoldTolerance"));
        MAX_PENETRATION_DISTANCE = LAYOUT.varHandle(PathElement.groupElement("maxPenetrationDistance"));
        BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ = LAYOUT.varHandle(PathElement.groupElement("bodyPairCacheMaxDeltaPositionSq"));
        BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2 = LAYOUT.varHandle(PathElement.groupElement("bodyPairCacheCosMaxDeltaRotationDiv2"));
        CONTACT_NORMAL_COS_MAX_DELTA_ROTATION = LAYOUT.varHandle(PathElement.groupElement("contactNormalCosMaxDeltaRotation"));
        CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ = LAYOUT.varHandle(PathElement.groupElement("contactPointPreserveLambdaMaxDistSq"));
        NUM_VELOCITY_STEPS = LAYOUT.varHandle(PathElement.groupElement("numVelocitySteps"));
        NUM_POSITION_STEPS = LAYOUT.varHandle(PathElement.groupElement("numPositionSteps"));
        MIN_VELOCITY_FOR_RESTITUTION = LAYOUT.varHandle(PathElement.groupElement("minVelocityForRestitution"));
        TIME_BEFORE_SLEEP = LAYOUT.varHandle(PathElement.groupElement("timeBeforeSleep"));
        POINT_VELOCITY_SLEEP_THRESHOLD = LAYOUT.varHandle(PathElement.groupElement("pointVelocitySleepThreshold"));
        DETERMINISTIC_SIMULATION = LAYOUT.varHandle(PathElement.groupElement("deterministicSimulation"));
        CONSTRAINT_WARM_START = LAYOUT.varHandle(PathElement.groupElement("constraintWarmStart"));
        USE_BODY_PAIR_CONTACT_CACHE = LAYOUT.varHandle(PathElement.groupElement("useBodyPairContactCache"));
        USE_MANIFOLD_REDUCTION = LAYOUT.varHandle(PathElement.groupElement("useManifoldReduction"));
        USE_LARGE_ISLAND_SPLITTER = LAYOUT.varHandle(PathElement.groupElement("useLargeIslandSplitter"));
        ALLOW_SLEEPING = LAYOUT.varHandle(PathElement.groupElement("allowSleeping"));
        CHECK_ACTIVE_EDGES = LAYOUT.varHandle(PathElement.groupElement("checkActiveEdges"));
        
        MAX_IN_FLIGHT_BODY_PAIRS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInFlightBodyPairs"));
        STEP_LISTENERS_BATCH_SIZE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stepListenersBatchSize"));
        STEP_LISTENER_BATCHES_PER_JOB_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stepListenerBatchesPerJob"));
        BAUMGARTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baumgarte"));
        SPECULATIVE_CONTACT_DISTANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("speculativeContactDistance"));
        PENETRATION_SLOP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("penetrationSlop"));
        LINEAR_CAST_THRESHOLD_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearCastThreshold"));
        LINEAR_CAST_MAX_PENETRATION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearCastMaxPenetration"));
        MANIFOLD_TOLERANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("manifoldTolerance"));
        MAX_PENETRATION_DISTANCE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPenetrationDistance"));
        BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyPairCacheMaxDeltaPositionSq"));
        BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bodyPairCacheCosMaxDeltaRotationDiv2"));
        CONTACT_NORMAL_COS_MAX_DELTA_ROTATION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactNormalCosMaxDeltaRotation"));
        CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contactPointPreserveLambdaMaxDistSq"));
        NUM_VELOCITY_STEPS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numVelocitySteps"));
        NUM_POSITION_STEPS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numPositionSteps"));
        MIN_VELOCITY_FOR_RESTITUTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minVelocityForRestitution"));
        TIME_BEFORE_SLEEP_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timeBeforeSleep"));
        POINT_VELOCITY_SLEEP_THRESHOLD_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointVelocitySleepThreshold"));
        DETERMINISTIC_SIMULATION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deterministicSimulation"));
        CONSTRAINT_WARM_START_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("constraintWarmStart"));
        USE_BODY_PAIR_CONTACT_CACHE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useBodyPairContactCache"));
        USE_MANIFOLD_REDUCTION_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useManifoldReduction"));
        USE_LARGE_ISLAND_SPLITTER_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useLargeIslandSplitter"));
        ALLOW_SLEEPING_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowSleeping"));
        CHECK_ACTIVE_EDGES_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("checkActiveEdges"));
        //@formatter:on
    }

    public PhysicsSettings() {
        this(Arena.ofAuto());
    }
    
    public PhysicsSettings(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public PhysicsSettings(MemorySegment segment) {
        this.segment = segment;
    
    }

    public PhysicsSettings maxInFlightBodyPairs(int maxInFlightBodyPairs) {
        MAX_IN_FLIGHT_BODY_PAIRS.set(segment, 0L, maxInFlightBodyPairs);
        return this;
    }
    
    public int maxInFlightBodyPairs() {
        return (int) MAX_IN_FLIGHT_BODY_PAIRS.get(segment, 0L);
    }
    
    public PhysicsSettings stepListenersBatchSize(int stepListenersBatchSize) {
        STEP_LISTENERS_BATCH_SIZE.set(segment, 0L, stepListenersBatchSize);
        return this;
    }
    
    public int stepListenersBatchSize() {
        return (int) STEP_LISTENERS_BATCH_SIZE.get(segment, 0L);
    }
    
    public PhysicsSettings stepListenerBatchesPerJob(int stepListenerBatchesPerJob) {
        STEP_LISTENER_BATCHES_PER_JOB.set(segment, 0L, stepListenerBatchesPerJob);
        return this;
    }
    
    public int stepListenerBatchesPerJob() {
        return (int) STEP_LISTENER_BATCHES_PER_JOB.get(segment, 0L);
    }
    
    public PhysicsSettings baumgarte(float baumgarte) {
        BAUMGARTE.set(segment, 0L, baumgarte);
        return this;
    }
    
    public float baumgarte() {
        return (float) BAUMGARTE.get(segment, 0L);
    }
    
    public PhysicsSettings speculativeContactDistance(float speculativeContactDistance) {
        SPECULATIVE_CONTACT_DISTANCE.set(segment, 0L, speculativeContactDistance);
        return this;
    }
    
    public float speculativeContactDistance() {
        return (float) SPECULATIVE_CONTACT_DISTANCE.get(segment, 0L);
    }
    
    public PhysicsSettings penetrationSlop(float penetrationSlop) {
        PENETRATION_SLOP.set(segment, 0L, penetrationSlop);
        return this;
    }
    
    public float penetrationSlop() {
        return (float) PENETRATION_SLOP.get(segment, 0L);
    }
    
    public PhysicsSettings linearCastThreshold(float linearCastThreshold) {
        LINEAR_CAST_THRESHOLD.set(segment, 0L, linearCastThreshold);
        return this;
    }
    
    public float linearCastThreshold() {
        return (float) LINEAR_CAST_THRESHOLD.get(segment, 0L);
    }
    
    public PhysicsSettings linearCastMaxPenetration(float linearCastMaxPenetration) {
        LINEAR_CAST_MAX_PENETRATION.set(segment, 0L, linearCastMaxPenetration);
        return this;
    }
    
    public float linearCastMaxPenetration() {
        return (float) LINEAR_CAST_MAX_PENETRATION.get(segment, 0L);
    }
    
    public PhysicsSettings manifoldTolerance(float manifoldTolerance) {
        MANIFOLD_TOLERANCE.set(segment, 0L, manifoldTolerance);
        return this;
    }
    
    public float manifoldTolerance() {
        return (float) MANIFOLD_TOLERANCE.get(segment, 0L);
    }
    
    public PhysicsSettings maxPenetrationDistance(float maxPenetrationDistance) {
        MAX_PENETRATION_DISTANCE.set(segment, 0L, maxPenetrationDistance);
        return this;
    }
    
    public float maxPenetrationDistance() {
        return (float) MAX_PENETRATION_DISTANCE.get(segment, 0L);
    }
    
    public PhysicsSettings bodyPairCacheMaxDeltaPositionSq(float bodyPairCacheMaxDeltaPositionSq) {
        BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ.set(segment, 0L, bodyPairCacheMaxDeltaPositionSq);
        return this;
    }
    
    public float bodyPairCacheMaxDeltaPositionSq() {
        return (float) BODY_PAIR_CACHE_MAX_DELTA_POSITION_SQ.get(segment, 0L);
    }
    
    public PhysicsSettings bodyPairCacheCosMaxDeltaRotationDiv2(float bodyPairCacheCosMaxDeltaRotationDiv2) {
        BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2.set(segment, 0L, bodyPairCacheCosMaxDeltaRotationDiv2);
        return this;
    }
    
    public float bodyPairCacheCosMaxDeltaRotationDiv2() {
        return (float) BODY_PAIR_CACHE_COS_MAX_DELTA_ROTATION_DIV2.get(segment, 0L);
    }
    
    public PhysicsSettings contactNormalCosMaxDeltaRotation(float contactNormalCosMaxDeltaRotation) {
        CONTACT_NORMAL_COS_MAX_DELTA_ROTATION.set(segment, 0L, contactNormalCosMaxDeltaRotation);
        return this;
    }
    
    public float contactNormalCosMaxDeltaRotation() {
        return (float) CONTACT_NORMAL_COS_MAX_DELTA_ROTATION.get(segment, 0L);
    }
    
    public PhysicsSettings contactPointPreserveLambdaMaxDistSq(float contactPointPreserveLambdaMaxDistSq) {
        CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ.set(segment, 0L, contactPointPreserveLambdaMaxDistSq);
        return this;
    }
    
    public float contactPointPreserveLambdaMaxDistSq() {
        return (float) CONTACT_POINT_PRESERVE_LAMBDA_MAX_DIST_SQ.get(segment, 0L);
    }
    
    public PhysicsSettings numVelocitySteps(int numVelocitySteps) {
        NUM_VELOCITY_STEPS.set(segment, 0L, numVelocitySteps);
        return this;
    }
    
    public int numVelocitySteps() {
        return (int) NUM_VELOCITY_STEPS.get(segment, 0L);
    }
    
    public PhysicsSettings numPositionSteps(int numPositionSteps) {
        NUM_POSITION_STEPS.set(segment, 0L, numPositionSteps);
        return this;
    }
    
    public int numPositionSteps() {
        return (int) NUM_POSITION_STEPS.get(segment, 0L);
    }
    
    public PhysicsSettings minVelocityForRestitution(float minVelocityForRestitution) {
        MIN_VELOCITY_FOR_RESTITUTION.set(segment, 0L, minVelocityForRestitution);
        return this;
    }
    
    public float minVelocityForRestitution() {
        return (float) MIN_VELOCITY_FOR_RESTITUTION.get(segment, 0L);
    }
    
    public PhysicsSettings timeBeforeSleep(float timeBeforeSleep) {
        TIME_BEFORE_SLEEP.set(segment, 0L, timeBeforeSleep);
        return this;
    }
    
    public float timeBeforeSleep() {
        return (float) TIME_BEFORE_SLEEP.get(segment, 0L);
    }
    
    public PhysicsSettings pointVelocitySleepThreshold(float pointVelocitySleepThreshold) {
        POINT_VELOCITY_SLEEP_THRESHOLD.set(segment, 0L, pointVelocitySleepThreshold);
        return this;
    }
    
    public float pointVelocitySleepThreshold() {
        return (float) POINT_VELOCITY_SLEEP_THRESHOLD.get(segment, 0L);
    }
    
    public PhysicsSettings deterministicSimulation(boolean deterministicSimulation) {
        DETERMINISTIC_SIMULATION.set(segment, 0L, deterministicSimulation);
        return this;
    }
    
    public boolean deterministicSimulation() {
        return (boolean) DETERMINISTIC_SIMULATION.get(segment, 0L);
    }
    
    public PhysicsSettings constraintWarmStart(boolean constraintWarmStart) {
        CONSTRAINT_WARM_START.set(segment, 0L, constraintWarmStart);
        return this;
    }
    
    public boolean constraintWarmStart() {
        return (boolean) CONSTRAINT_WARM_START.get(segment, 0L);
    }
    
    public PhysicsSettings useBodyPairContactCache(boolean useBodyPairContactCache) {
        USE_BODY_PAIR_CONTACT_CACHE.set(segment, 0L, useBodyPairContactCache);
        return this;
    }
    
    public boolean useBodyPairContactCache() {
        return (boolean) USE_BODY_PAIR_CONTACT_CACHE.get(segment, 0L);
    }
    
    public PhysicsSettings useManifoldReduction(boolean useManifoldReduction) {
        USE_MANIFOLD_REDUCTION.set(segment, 0L, useManifoldReduction);
        return this;
    }
    
    public boolean useManifoldReduction() {
        return (boolean) USE_MANIFOLD_REDUCTION.get(segment, 0L);
    }
    
    public PhysicsSettings useLargeIslandSplitter(boolean useLargeIslandSplitter) {
        USE_LARGE_ISLAND_SPLITTER.set(segment, 0L, useLargeIslandSplitter);
        return this;
    }
    
    public boolean useLargeIslandSplitter() {
        return (boolean) USE_LARGE_ISLAND_SPLITTER.get(segment, 0L);
    }
    
    public PhysicsSettings allowSleeping(boolean allowSleeping) {
        ALLOW_SLEEPING.set(segment, 0L, allowSleeping);
        return this;
    }
    
    public boolean allowSleeping() {
        return (boolean) ALLOW_SLEEPING.get(segment, 0L);
    }
    
    public PhysicsSettings checkActiveEdges(boolean checkActiveEdges) {
        CHECK_ACTIVE_EDGES.set(segment, 0L, checkActiveEdges);
        return this;
    }
    
    public boolean checkActiveEdges() {
        return (boolean) CHECK_ACTIVE_EDGES.get(segment, 0L);
    }
    
    @Override
    public PhysicsSettings set(PhysicsSettings other) {
        return set(other.segment);
    }
    
    @Override
    public PhysicsSettings set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<PhysicsSettings> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<PhysicsSettings> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PhysicsSettings(segment),
            count
        );
    }
    
    public static NativeStructArray<PhysicsSettings> array(Arena arena, PhysicsSettings... structs) {
        NativeStructArray<PhysicsSettings> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new PhysicsSettings(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<PhysicsSettings> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new PhysicsSettings(segment)
        );
    }
    
}