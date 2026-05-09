/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.jobSystem;

import edu.umd.cs.findbugs.annotations.Nullable;
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
public final class JobSystemConfig
		implements Struct<JobSystemConfig> {

    public static final StructLayout LAYOUT;

    public static final VarHandle CONTEXT_HANDLE;
    public static final VarHandle QUEUE_JOB_HANDLE;
    public static final VarHandle QUEUE_JOBS_HANDLE;
    public static final VarHandle MAX_CONCURRENCY_HANDLE;
    public static final VarHandle MAX_BARRIERS_HANDLE;

    public static final long CONTEXT_BYTE_OFFSET;
    public static final long QUEUE_JOB_BYTE_OFFSET;
    public static final long QUEUE_JOBS_BYTE_OFFSET;
    public static final long MAX_CONCURRENCY_BYTE_OFFSET;
    public static final long MAX_BARRIERS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("context"),
            UNBOUNDED_ADDRESS.withName("queueJob"),
            UNBOUNDED_ADDRESS.withName("queueJobs"),
            JAVA_INT.withName("maxConcurrency"),
            JAVA_INT.withName("maxBarriers")
        ).withName("JPH_JobSystemConfig").withByteAlignment(8);
        
        CONTEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("context"));
        QUEUE_JOB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueJob"));
        QUEUE_JOBS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueJobs"));
        MAX_CONCURRENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxConcurrency"));
        MAX_BARRIERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBarriers"));
        
        CONTEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("context"));
        QUEUE_JOB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueJob"));
        QUEUE_JOBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueJobs"));
        MAX_CONCURRENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxConcurrency"));
        MAX_BARRIERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBarriers"));
        //@formatter:on
    }

    public JobSystemConfig() {
        this(Arena.ofAuto());
    }
    
    public JobSystemConfig(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public JobSystemConfig(MemorySegment segment) {
        this.segment = segment;
    
    }

    public JobSystemConfig context(MemorySegment context) {
        CONTEXT_HANDLE.set(segment, 0L, context);
        return this;
    }
    
    public @Nullable MemorySegment context() {
        MemorySegment segment = (MemorySegment) CONTEXT_HANDLE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return segment;
    }
    
    public JobSystemConfig queueJob(QueueJobCallback queueJob) {
        QUEUE_JOB_HANDLE.set(segment, 0L, queueJob.memorySegment());
        return this;
    }
    
    public @Nullable QueueJobCallback queueJob() {
        MemorySegment segment = (MemorySegment) QUEUE_JOB_HANDLE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return QueueJobCallback.get(segment);
    }
    
    public JobSystemConfig queueJobs(QueueJobsCallback queueJobs) {
        QUEUE_JOBS_HANDLE.set(segment, 0L, queueJobs.memorySegment());
        return this;
    }
    
    public @Nullable QueueJobsCallback queueJobs() {
        MemorySegment segment = (MemorySegment) QUEUE_JOBS_HANDLE.get(this.segment, 0L);
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return QueueJobsCallback.get(segment);
    }
    
    public JobSystemConfig maxConcurrency(int maxConcurrency) {
        MAX_CONCURRENCY_HANDLE.set(segment, 0L, maxConcurrency);
        return this;
    }
    
    public int maxConcurrency() {
        return (int) MAX_CONCURRENCY_HANDLE.get(segment, 0L);
    }
    
    public JobSystemConfig maxBarriers(int maxBarriers) {
        MAX_BARRIERS_HANDLE.set(segment, 0L, maxBarriers);
        return this;
    }
    
    public int maxBarriers() {
        return (int) MAX_BARRIERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public JobSystemConfig set(JobSystemConfig other) {
        return set(other.segment);
    }
    
    @Override
    public JobSystemConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<JobSystemConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<JobSystemConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JobSystemConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<JobSystemConfig> array(Arena arena, JobSystemConfig... structs) {
        NativeStructArray<JobSystemConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new JobSystemConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<JobSystemConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new JobSystemConfig(segment)
        );
    }
    
}