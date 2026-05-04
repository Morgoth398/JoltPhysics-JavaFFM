/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.callbacks;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class AssertFailureFunc {

    private static final HashMap<Long, WeakReference<AssertFailureFunc>> CACHE;

    public static final FunctionDescriptor DESCRIPTION;
    public static final MethodHandle HANDLE;

    private final MemorySegment segment;

    static {
        CACHE = new HashMap<>();

        DESCRIPTION = FunctionDescriptor.of(
            JAVA_BOOLEAN, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            UNBOUNDED_ADDRESS, 
            JAVA_INT
        );

        try {
            HANDLE = MethodHandles.lookup().findVirtual(AssertFailureFunc.class, "invoke", DESCRIPTION.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AssertFailureFunc() {
        this(Arena.ofAuto());
    }

    public AssertFailureFunc(Arena arena) {
        this.segment = Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTION, arena);

        CACHE.put(this.segment.address(), new WeakReference<>(this));
    }

    public boolean invoke(
        MemorySegment expression, 
        MemorySegment message, 
        MemorySegment file, 
        int line
    ) {
        return (boolean) invoke(
            expression.getString(0), 
            message.getString(0), 
            file.getString(0), 
            line
        );
    }

    public abstract boolean invoke(
        String expression, 
        String message, 
        String file, 
        int line
    );


    public MemorySegment memorySegment() {
        return segment;
    }

    public static AssertFailureFunc get(MemorySegment segment) {
        WeakReference<AssertFailureFunc> reference = CACHE.get(segment.address());

        if (reference == null)
            return null;

        return reference.get();
    }

}