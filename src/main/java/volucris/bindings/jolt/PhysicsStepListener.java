/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.ref.WeakReference;
import java.util.HashMap;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class PhysicsStepListener {

    private static final HashMap<Long, WeakReference<PhysicsStepListener>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor ON_STEP_DESCRIPTION;
    public static final MethodHandle ON_STEP_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment ON_STEP_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_STEP_LISTENER_DESTROY;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("onStep")
        ).withName("JPH_PhysicsStepListener_Procs").withByteAlignment(8);

        JPH_PHYSICS_STEP_LISTENER_SET_PROCS = downcallHandleVoid("JPH_PhysicsStepListener_SetProcs", UNBOUNDED_ADDRESS);
        JPH_PHYSICS_STEP_LISTENER_CREATE = downcallHandle("JPH_PhysicsStepListener_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_STEP_LISTENER_DESTROY = downcallHandleVoid("JPH_PhysicsStepListener_Destroy", UNBOUNDED_ADDRESS);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            ON_STEP_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_STEP_HANDLE = lookup.findStatic(PhysicsStepListener.class, "onStep", ON_STEP_DESCRIPTION.toMethodType());

            ON_STEP_ADDRESS = linker.upcallStub(ON_STEP_HANDLE, ON_STEP_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onStep")), ON_STEP_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public PhysicsStepListener() {
        this(Arena.ofAuto());
    }

    public PhysicsStepListener(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_PHYSICS_STEP_LISTENER_SET_PROCS.get();
        try {
            method.invokeExact(
                procs
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment create(
        MemorySegment userData
    ) {
        MethodHandle method = JPH_PHYSICS_STEP_LISTENER_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment listener
    ) {
        MethodHandle method = JPH_PHYSICS_STEP_LISTENER_DESTROY.get();
        try {
            method.invokeExact(
                listener
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }


    public static void onStep(
        MemorySegment userData, 
        MemorySegment context
    ) {
        PhysicsStepListener callback = CACHE.get(userData.address()).get();

        callback.onStep(
            context
        );
    }

    public void onStep(
        MemorySegment context
    ) {
        onStep(
            new PhysicsStepListenerContext(context)
        );
    }

    public void onStep(
        PhysicsStepListenerContext context
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method for onStep."
        );
    }


}