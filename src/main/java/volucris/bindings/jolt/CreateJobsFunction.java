/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Create a number of similar jobs, the jobs are started immediately if inNumDependencies == 0 otherwise they start when
/// RemoveDependency causes the dependency counter to reach 0.
/// ```
public abstract class CreateJobsFunction {

    private static final Map<Long, WeakReference<CreateJobsFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.ofVoid(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CreateJobsFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CreateJobsFunction() {
        this(Arena.ofAuto());
    }

    public CreateJobsFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public void invoke(
        MemorySegment inName,
        MemorySegment inColor,
        MemorySegment inJobFunction,
        MemorySegment outJobs,
        int inNumJobs,
        int inNumDependencies
    ) {
        invoke(
            new NativeByteArray(inName),
            new Color(inColor),
            new JobFunction(inJobFunction),
            outJobs,
            inNumJobs,
            inNumDependencies
        );
    }

    public void invoke(
        NativeByteArray inName,
        Color inColor,
        JobFunction inJobFunction,
        MemorySegment outJobs,
        int inNumJobs,
        int inNumDependencies
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CreateJobsFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CreateJobsFunction get(MemorySegment segment) {
        WeakReference<CreateJobsFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}