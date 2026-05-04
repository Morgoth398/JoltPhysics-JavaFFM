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

public abstract class BodyActivationListener {

    private static final HashMap<Long, WeakReference<BodyActivationListener>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor ON_BODY_ACTIVATED_DESCRIPTION;
    public static final MethodHandle ON_BODY_ACTIVATED_HANDLE;
    public static final FunctionDescriptor ON_BODY_DEACTIVATED_DESCRIPTION;
    public static final MethodHandle ON_BODY_DEACTIVATED_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment ON_BODY_ACTIVATED_ADDRESS;
    private static final MemorySegment ON_BODY_DEACTIVATED_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_BODY_ACTIVATION_LISTENER_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_BODY_ACTIVATION_LISTENER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_BODY_ACTIVATION_LISTENER_DESTROY;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("onBodyActivated"), 
            UNBOUNDED_ADDRESS.withName("onBodyDeactivated")
        ).withName("JPH_BodyActivationListener_Procs").withByteAlignment(8);

        JPH_BODY_ACTIVATION_LISTENER_SET_PROCS = downcallHandleVoid("JPH_BodyActivationListener_SetProcs", UNBOUNDED_ADDRESS);
        JPH_BODY_ACTIVATION_LISTENER_CREATE = downcallHandle("JPH_BodyActivationListener_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_ACTIVATION_LISTENER_DESTROY = downcallHandleVoid("JPH_BodyActivationListener_Destroy", UNBOUNDED_ADDRESS);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            ON_BODY_ACTIVATED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_LONG
            );

            ON_BODY_ACTIVATED_HANDLE = lookup.findStatic(BodyActivationListener.class, "onBodyActivated", ON_BODY_ACTIVATED_DESCRIPTION.toMethodType());

            ON_BODY_ACTIVATED_ADDRESS = linker.upcallStub(ON_BODY_ACTIVATED_HANDLE, ON_BODY_ACTIVATED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onBodyActivated")), ON_BODY_ACTIVATED_ADDRESS);
            
            ON_BODY_DEACTIVATED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_LONG
            );

            ON_BODY_DEACTIVATED_HANDLE = lookup.findStatic(BodyActivationListener.class, "onBodyDeactivated", ON_BODY_DEACTIVATED_DESCRIPTION.toMethodType());

            ON_BODY_DEACTIVATED_ADDRESS = linker.upcallStub(ON_BODY_DEACTIVATED_HANDLE, ON_BODY_DEACTIVATED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onBodyDeactivated")), ON_BODY_DEACTIVATED_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public BodyActivationListener() {
        this(Arena.ofAuto());
    }

    public BodyActivationListener(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_BODY_ACTIVATION_LISTENER_SET_PROCS.get();
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
        MethodHandle method = JPH_BODY_ACTIVATION_LISTENER_CREATE.get();
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
        MethodHandle method = JPH_BODY_ACTIVATION_LISTENER_DESTROY.get();
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


    public static void onBodyActivated(
        MemorySegment userData, 
        int bodyID, 
        long bodyUserData
    ) {
        BodyActivationListener callback = CACHE.get(userData.address()).get();

        callback.onBodyActivated(
            bodyID, 
            bodyUserData
        );
    }

    public void onBodyActivated(
        int bodyID, 
        long bodyUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method for onBodyActivated."
        );
    }

    public static void onBodyDeactivated(
        MemorySegment userData, 
        int bodyID, 
        long bodyUserData
    ) {
        BodyActivationListener callback = CACHE.get(userData.address()).get();

        callback.onBodyDeactivated(
            bodyID, 
            bodyUserData
        );
    }

    public void onBodyDeactivated(
        int bodyID, 
        long bodyUserData
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method for onBodyDeactivated."
        );
    }

}