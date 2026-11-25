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
/// Create a new job, the job is started immediately if inNumDependencies == 0 otherwise it starts when
/// RemoveDependency causes the dependency counter to reach 0.
/// ```
public abstract class CreateJobFunction {

    private static final Map<Long, WeakReference<CreateJobFunction>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(CreateJobFunction.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CreateJobFunction() {
        this(Arena.ofAuto());
    }

    public CreateJobFunction(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public MemorySegment invoke(
        MemorySegment inName,
        MemorySegment inColor,
        MemorySegment inJobFunction,
        int inNumDependencies
    ) {
        return invoke(
            new NativeByteArray(inName),
            new Color(inColor),
            new JobFunction(inJobFunction),
            inNumDependencies
        ).memorySegment();
    }

    public JobSystemJobHandle invoke(
        NativeByteArray inName,
        Color inColor,
        JobFunction inJobFunction,
        int inNumDependencies
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method in CreateJobFunction."
        );
    };

    public MemorySegment memorySegment() {
        return segment;
    }

    public static @Nullable CreateJobFunction get(MemorySegment segment) {
        WeakReference<CreateJobFunction> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}