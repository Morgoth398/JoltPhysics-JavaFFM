/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.filter;

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

public abstract class BodyFilter {

    private static final HashMap<Long, WeakReference<BodyFilter>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor SHOULD_COLLIDE_DESCRIPTION;
    public static final MethodHandle SHOULD_COLLIDE_HANDLE;
    public static final FunctionDescriptor SHOULD_COLLIDE_LOCKED_DESCRIPTION;
    public static final MethodHandle SHOULD_COLLIDE_LOCKED_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment SHOULD_COLLIDE_ADDRESS;
    private static final MemorySegment SHOULD_COLLIDE_LOCKED_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_BODY_FILTER_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_BODY_FILTER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_BODY_FILTER_DESTROY;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("shouldCollide"), 
            UNBOUNDED_ADDRESS.withName("shouldCollideLocked")
        ).withName("JPH_BodyFilter_Procs").withByteAlignment(8);

        JPH_BODY_FILTER_SET_PROCS = downcallHandleVoid("JPH_BodyFilter_SetProcs", UNBOUNDED_ADDRESS);
        JPH_BODY_FILTER_CREATE = downcallHandle("JPH_BodyFilter_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BODY_FILTER_DESTROY = downcallHandleVoid("JPH_BodyFilter_Destroy", UNBOUNDED_ADDRESS);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            SHOULD_COLLIDE_DESCRIPTION = FunctionDescriptor.of(
                JAVA_BOOLEAN, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT
            );

            SHOULD_COLLIDE_HANDLE = lookup.findStatic(BodyFilter.class, "shouldCollide", SHOULD_COLLIDE_DESCRIPTION.toMethodType());

            SHOULD_COLLIDE_ADDRESS = linker.upcallStub(SHOULD_COLLIDE_HANDLE, SHOULD_COLLIDE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("shouldCollide")), SHOULD_COLLIDE_ADDRESS);
            
            SHOULD_COLLIDE_LOCKED_DESCRIPTION = FunctionDescriptor.of(
                JAVA_BOOLEAN, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            SHOULD_COLLIDE_LOCKED_HANDLE = lookup.findStatic(BodyFilter.class, "shouldCollideLocked", SHOULD_COLLIDE_LOCKED_DESCRIPTION.toMethodType());

            SHOULD_COLLIDE_LOCKED_ADDRESS = linker.upcallStub(SHOULD_COLLIDE_LOCKED_HANDLE, SHOULD_COLLIDE_LOCKED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("shouldCollideLocked")), SHOULD_COLLIDE_LOCKED_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public BodyFilter() {
        this(Arena.ofAuto());
    }

    public BodyFilter(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_BODY_FILTER_SET_PROCS.get();
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
        MethodHandle method = JPH_BODY_FILTER_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment filter
    ) {
        MethodHandle method = JPH_BODY_FILTER_DESTROY.get();
        try {
            method.invokeExact(
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }


    public static boolean shouldCollide(
        MemorySegment userData, 
        int bodyID
    ) {
        BodyFilter callback = CACHE.get(userData.address()).get();

        return (boolean) callback.shouldCollide(
            bodyID
        );
    }

    public boolean shouldCollide(
        int bodyID
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method for shouldCollide."
        );
    }

    public static boolean shouldCollideLocked(
        MemorySegment userData, 
        MemorySegment bodyID
    ) {
        BodyFilter callback = CACHE.get(userData.address()).get();

        return (boolean) callback.shouldCollideLocked(
            bodyID
        );
    }

    public boolean shouldCollideLocked(
        MemorySegment bodyID
    ) {
        throw new UnsupportedOperationException(
            "Override either the typed or raw callback method for shouldCollideLocked."
        );
    }

}