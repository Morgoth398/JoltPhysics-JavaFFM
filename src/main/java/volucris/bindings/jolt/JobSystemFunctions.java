/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class JobSystemFunctions
		implements Struct<JobSystemFunctions> {

	public static final StructLayout LAYOUT;

	public static final VarHandle GET_MAX_CONCURRENCY_HANDLE;
	public static final VarHandle CREATE_JOB_HANDLE;
	public static final VarHandle CREATE_JOBS_HANDLE;
	public static final VarHandle CREATE_BARRIER_HANDLE;
	public static final VarHandle DESTROY_BARRIER_HANDLE;
	public static final VarHandle WAIT_FOR_JOBS_HANDLE;
	public static final VarHandle QUEUE_JOB_HANDLE;
	public static final VarHandle QUEUE_JOBS_HANDLE;
	public static final VarHandle FREE_JOB_HANDLE;

	public static final long GET_MAX_CONCURRENCY_BYTE_OFFSET;
	public static final long CREATE_JOB_BYTE_OFFSET;
	public static final long CREATE_JOBS_BYTE_OFFSET;
	public static final long CREATE_BARRIER_BYTE_OFFSET;
	public static final long DESTROY_BARRIER_BYTE_OFFSET;
	public static final long WAIT_FOR_JOBS_BYTE_OFFSET;
	public static final long QUEUE_JOB_BYTE_OFFSET;
	public static final long QUEUE_JOBS_BYTE_OFFSET;
	public static final long FREE_JOB_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("GetMaxConcurrency"),
		    UNBOUNDED_ADDRESS.withName("CreateJob"),
		    UNBOUNDED_ADDRESS.withName("CreateJobs"),
		    UNBOUNDED_ADDRESS.withName("CreateBarrier"),
		    UNBOUNDED_ADDRESS.withName("DestroyBarrier"),
		    UNBOUNDED_ADDRESS.withName("WaitForJobs"),
		    UNBOUNDED_ADDRESS.withName("QueueJob"),
		    UNBOUNDED_ADDRESS.withName("QueueJobs"),
		    UNBOUNDED_ADDRESS.withName("FreeJob")
		).withName("JPH_JobSystemFunctions").withByteAlignment(8);
		
		GET_MAX_CONCURRENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("GetMaxConcurrency"));
		CREATE_JOB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CreateJob"));
		CREATE_JOBS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CreateJobs"));
		CREATE_BARRIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CreateBarrier"));
		DESTROY_BARRIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DestroyBarrier"));
		WAIT_FOR_JOBS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("WaitForJobs"));
		QUEUE_JOB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("QueueJob"));
		QUEUE_JOBS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("QueueJobs"));
		FREE_JOB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FreeJob"));
		
		GET_MAX_CONCURRENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("GetMaxConcurrency"));
		CREATE_JOB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CreateJob"));
		CREATE_JOBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CreateJobs"));
		CREATE_BARRIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CreateBarrier"));
		DESTROY_BARRIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DestroyBarrier"));
		WAIT_FOR_JOBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("WaitForJobs"));
		QUEUE_JOB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("QueueJob"));
		QUEUE_JOBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("QueueJobs"));
		FREE_JOB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FreeJob"));
		//@formatter:on
	}

	public JobSystemFunctions() {
	    this(Arena.ofAuto());
	}
	
	public JobSystemFunctions(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public JobSystemFunctions(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #getMaxConcurrency()
    public JobSystemFunctions getMaxConcurrency(GetMaxConcurrencyFunction getMaxConcurrency) {
    	GET_MAX_CONCURRENCY_HANDLE.set(segment, 0L, getMaxConcurrency.memorySegment());
    	return this;
    }
    
    /// ```
    /// Get maximum number of concurrently executing jobs
    /// ```
    public @Nullable GetMaxConcurrencyFunction getMaxConcurrency() {
    	MemorySegment segment = (MemorySegment) GET_MAX_CONCURRENCY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return GetMaxConcurrencyFunction.get(segment);
    }
    
    /// @see #createJob()
    public JobSystemFunctions createJob(CreateJobFunction createJob) {
    	CREATE_JOB_HANDLE.set(segment, 0L, createJob.memorySegment());
    	return this;
    }
    
    /// ```
    /// Create a new job, the job is started immediately if inNumDependencies == 0 otherwise it starts when
    /// RemoveDependency causes the dependency counter to reach 0.
    /// ```
    public @Nullable CreateJobFunction createJob() {
    	MemorySegment segment = (MemorySegment) CREATE_JOB_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CreateJobFunction.get(segment);
    }
    
    /// @see #createJobs()
    public JobSystemFunctions createJobs(CreateJobsFunction createJobs) {
    	CREATE_JOBS_HANDLE.set(segment, 0L, createJobs.memorySegment());
    	return this;
    }
    
    /// ```
    /// Create a number of similar jobs, the jobs are started immediately if inNumDependencies == 0 otherwise they start when
    /// RemoveDependency causes the dependency counter to reach 0.
    /// ```
    public @Nullable CreateJobsFunction createJobs() {
    	MemorySegment segment = (MemorySegment) CREATE_JOBS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CreateJobsFunction.get(segment);
    }
    
    /// @see #createBarrier()
    public JobSystemFunctions createBarrier(CreateBarrierFunction createBarrier) {
    	CREATE_BARRIER_HANDLE.set(segment, 0L, createBarrier.memorySegment());
    	return this;
    }
    
    /// ```
    /// Create a new barrier, used to wait on jobs
    /// ```
    public @Nullable CreateBarrierFunction createBarrier() {
    	MemorySegment segment = (MemorySegment) CREATE_BARRIER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return CreateBarrierFunction.get(segment);
    }
    
    /// @see #destroyBarrier()
    public JobSystemFunctions destroyBarrier(DestroyBarrierFunction destroyBarrier) {
    	DESTROY_BARRIER_HANDLE.set(segment, 0L, destroyBarrier.memorySegment());
    	return this;
    }
    
    /// ```
    /// Destroy a barrier when it is no longer used. The barrier should be empty at this point.
    /// ```
    public @Nullable DestroyBarrierFunction destroyBarrier() {
    	MemorySegment segment = (MemorySegment) DESTROY_BARRIER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return DestroyBarrierFunction.get(segment);
    }
    
    /// @see #waitForJobs()
    public JobSystemFunctions waitForJobs(WaitForJobsFunction waitForJobs) {
    	WAIT_FOR_JOBS_HANDLE.set(segment, 0L, waitForJobs.memorySegment());
    	return this;
    }
    
    /// ```
    /// Wait for a set of jobs to be finished, note that only 1 thread can be waiting on a barrier at a time
    /// ```
    public @Nullable WaitForJobsFunction waitForJobs() {
    	MemorySegment segment = (MemorySegment) WAIT_FOR_JOBS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return WaitForJobsFunction.get(segment);
    }
    
    /// @see #queueJob()
    public JobSystemFunctions queueJob(QueueJobFunction queueJob) {
    	QUEUE_JOB_HANDLE.set(segment, 0L, queueJob.memorySegment());
    	return this;
    }
    
    /// ```
    /// Adds a job to the job queue
    /// ```
    public @Nullable QueueJobFunction queueJob() {
    	MemorySegment segment = (MemorySegment) QUEUE_JOB_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return QueueJobFunction.get(segment);
    }
    
    /// @see #queueJobs()
    public JobSystemFunctions queueJobs(QueueJobsFunction queueJobs) {
    	QUEUE_JOBS_HANDLE.set(segment, 0L, queueJobs.memorySegment());
    	return this;
    }
    
    /// ```
    /// Adds a number of jobs at once to the job queue
    /// ```
    public @Nullable QueueJobsFunction queueJobs() {
    	MemorySegment segment = (MemorySegment) QUEUE_JOBS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return QueueJobsFunction.get(segment);
    }
    
    /// @see #freeJob()
    public JobSystemFunctions freeJob(FreeJobFunction freeJob) {
    	FREE_JOB_HANDLE.set(segment, 0L, freeJob.memorySegment());
    	return this;
    }
    
    /// ```
    /// Frees a job
    /// ```
    public @Nullable FreeJobFunction freeJob() {
    	MemorySegment segment = (MemorySegment) FREE_JOB_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return FreeJobFunction.get(segment);
    }
    
    @Override
    public JobSystemFunctions set(JobSystemFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public JobSystemFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<JobSystemFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<JobSystemFunctions> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new JobSystemFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<JobSystemFunctions> array(SegmentAllocator allocator, JobSystemFunctions... structs) {
        NativeStructArray<JobSystemFunctions> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new JobSystemFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<JobSystemFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new JobSystemFunctions(segment)
        );
    }

}