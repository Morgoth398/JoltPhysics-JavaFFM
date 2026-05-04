/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.jobSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class JobSystemThreadPoolConfig
		implements Struct<JobSystemThreadPoolConfig> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_JOBS;
    public static final VarHandle MAX_BARRIERS;
    public static final VarHandle NUM_THREADS;

    public static final long MAX_JOBS_OFFSET;
    public static final long MAX_BARRIERS_OFFSET;
    public static final long NUM_THREADS_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("maxJobs"),
            JAVA_INT.withName("maxBarriers"),
            JAVA_INT.withName("numThreads")
        ).withName("JobSystemThreadPoolConfig").withByteAlignment(4);
        
        MAX_JOBS = LAYOUT.varHandle(PathElement.groupElement("maxJobs"));
        MAX_BARRIERS = LAYOUT.varHandle(PathElement.groupElement("maxBarriers"));
        NUM_THREADS = LAYOUT.varHandle(PathElement.groupElement("numThreads"));
        
        MAX_JOBS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxJobs"));
        MAX_BARRIERS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBarriers"));
        NUM_THREADS_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numThreads"));
        //@formatter:on
    }

    public JobSystemThreadPoolConfig() {
        this(Arena.ofAuto());
    }
    
    public JobSystemThreadPoolConfig(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public JobSystemThreadPoolConfig(MemorySegment segment) {
        this.segment = segment;
    
    }

    public JobSystemThreadPoolConfig maxJobs(int maxJobs) {
        MAX_JOBS.set(segment, 0L, maxJobs);
        return this;
    }
    
    public int maxJobs() {
        return (int) MAX_JOBS.get(segment, 0L);
    }
    
    public JobSystemThreadPoolConfig maxBarriers(int maxBarriers) {
        MAX_BARRIERS.set(segment, 0L, maxBarriers);
        return this;
    }
    
    public int maxBarriers() {
        return (int) MAX_BARRIERS.get(segment, 0L);
    }
    
    public JobSystemThreadPoolConfig numThreads(int numThreads) {
        NUM_THREADS.set(segment, 0L, numThreads);
        return this;
    }
    
    public int numThreads() {
        return (int) NUM_THREADS.get(segment, 0L);
    }
    
    @Override
    public JobSystemThreadPoolConfig set(JobSystemThreadPoolConfig other) {
        return set(other.segment);
    }
    
    @Override
    public JobSystemThreadPoolConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<JobSystemThreadPoolConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<JobSystemThreadPoolConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JobSystemThreadPoolConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<JobSystemThreadPoolConfig> array(Arena arena, JobSystemThreadPoolConfig... structs) {
        NativeStructArray<JobSystemThreadPoolConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JobSystemThreadPoolConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<JobSystemThreadPoolConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new JobSystemThreadPoolConfig(segment)
        );
    }
    
}