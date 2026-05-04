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
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.raycast.CollideShapeResult;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class ContactListener {

    private static final HashMap<Long, WeakReference<ContactListener>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor ON_CONTACT_VALIDATE_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_VALIDATE_HANDLE;
    public static final FunctionDescriptor ON_CONTACT_ADDED_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_ADDED_HANDLE;
    public static final FunctionDescriptor ON_CONTACT_PERSISTED_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_PERSISTED_HANDLE;
    public static final FunctionDescriptor ON_CONTACT_REMOVED_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_REMOVED_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment ON_CONTACT_VALIDATE_ADDRESS;
    private static final MemorySegment ON_CONTACT_ADDED_ADDRESS;
    private static final MemorySegment ON_CONTACT_PERSISTED_ADDRESS;
    private static final MemorySegment ON_CONTACT_REMOVED_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_CONTACT_LISTENER_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_CONTACT_LISTENER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CONTACT_LISTENER_DESTROY;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("onContactValidate"), 
            UNBOUNDED_ADDRESS.withName("onContactAdded"), 
            UNBOUNDED_ADDRESS.withName("onContactPersisted"), 
            UNBOUNDED_ADDRESS.withName("onContactRemoved")
        ).withName("JPH_ContactListener_Procs").withByteAlignment(8);

        JPH_CONTACT_LISTENER_SET_PROCS = downcallHandleVoid("JPH_ContactListener_SetProcs", UNBOUNDED_ADDRESS);
        JPH_CONTACT_LISTENER_CREATE = downcallHandle("JPH_ContactListener_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CONTACT_LISTENER_DESTROY = downcallHandleVoid("JPH_ContactListener_Destroy", UNBOUNDED_ADDRESS);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            ON_CONTACT_VALIDATE_DESCRIPTION = FunctionDescriptor.of(
                JAVA_INT, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CONTACT_VALIDATE_HANDLE = lookup.findStatic(ContactListener.class, "onContactValidate", ON_CONTACT_VALIDATE_DESCRIPTION.toMethodType());

            ON_CONTACT_VALIDATE_ADDRESS = linker.upcallStub(ON_CONTACT_VALIDATE_HANDLE, ON_CONTACT_VALIDATE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactValidate")), ON_CONTACT_VALIDATE_ADDRESS);
            
            ON_CONTACT_ADDED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CONTACT_ADDED_HANDLE = lookup.findStatic(ContactListener.class, "onContactAdded", ON_CONTACT_ADDED_DESCRIPTION.toMethodType());

            ON_CONTACT_ADDED_ADDRESS = linker.upcallStub(ON_CONTACT_ADDED_HANDLE, ON_CONTACT_ADDED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactAdded")), ON_CONTACT_ADDED_ADDRESS);
            
            ON_CONTACT_PERSISTED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CONTACT_PERSISTED_HANDLE = lookup.findStatic(ContactListener.class, "onContactPersisted", ON_CONTACT_PERSISTED_DESCRIPTION.toMethodType());

            ON_CONTACT_PERSISTED_ADDRESS = linker.upcallStub(ON_CONTACT_PERSISTED_HANDLE, ON_CONTACT_PERSISTED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactPersisted")), ON_CONTACT_PERSISTED_ADDRESS);
            
            ON_CONTACT_REMOVED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CONTACT_REMOVED_HANDLE = lookup.findStatic(ContactListener.class, "onContactRemoved", ON_CONTACT_REMOVED_DESCRIPTION.toMethodType());

            ON_CONTACT_REMOVED_ADDRESS = linker.upcallStub(ON_CONTACT_REMOVED_HANDLE, ON_CONTACT_REMOVED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactRemoved")), ON_CONTACT_REMOVED_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public ContactListener() {
        this(Arena.ofAuto());
    }

    public ContactListener(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_CONTACT_LISTENER_SET_PROCS.get();
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
        MethodHandle method = JPH_CONTACT_LISTENER_CREATE.get();
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
        MethodHandle method = JPH_CONTACT_LISTENER_DESTROY.get();
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


    public static int onContactValidate(
        MemorySegment userData, 
        MemorySegment body1, 
        MemorySegment body2, 
        MemorySegment baseOffset, 
        MemorySegment collisionResult
    ) {
        ContactListener callback = CACHE.get(userData.address()).get();

        return (int) callback.onContactValidate(
            body1, 
            body2, 
            baseOffset, 
            collisionResult
        );
    }

    public int onContactValidate(
        MemorySegment body1, 
        MemorySegment body2, 
        MemorySegment baseOffset, 
        MemorySegment collisionResult
    ) {
        return (int) onContactValidate(
            new Body(body1), 
            new Body(body2), 
            new Vec3(baseOffset), 
            new CollideShapeResult(collisionResult)
        );
    }

    public abstract int onContactValidate(
        Body body1, 
        Body body2, 
        Vec3 baseOffset, 
        CollideShapeResult collisionResult
    );


    public static void onContactAdded(
        MemorySegment userData, 
        MemorySegment body1, 
        MemorySegment body2, 
        MemorySegment manifold, 
        MemorySegment settings
    ) {
        ContactListener callback = CACHE.get(userData.address()).get();

        callback.onContactAdded(
            body1, 
            body2, 
            manifold, 
            settings
        );
    }

    public void onContactAdded(
        MemorySegment body1, 
        MemorySegment body2, 
        MemorySegment manifold, 
        MemorySegment settings
    ) {
        onContactAdded(
            new Body(body1), 
            new Body(body2), 
            new ContactManifold(manifold), 
            new ContactSettings(settings)
        );
    }

    public abstract void onContactAdded(
        Body body1, 
        Body body2, 
        ContactManifold manifold, 
        ContactSettings settings
    );


    public static void onContactPersisted(
        MemorySegment userData, 
        MemorySegment body1, 
        MemorySegment body2, 
        MemorySegment manifold, 
        MemorySegment settings
    ) {
        ContactListener callback = CACHE.get(userData.address()).get();

        callback.onContactPersisted(
            body1, 
            body2, 
            manifold, 
            settings
        );
    }

    public void onContactPersisted(
        MemorySegment body1, 
        MemorySegment body2, 
        MemorySegment manifold, 
        MemorySegment settings
    ) {
        onContactPersisted(
            new Body(body1), 
            new Body(body2), 
            new ContactManifold(manifold), 
            new ContactSettings(settings)
        );
    }

    public abstract void onContactPersisted(
        Body body1, 
        Body body2, 
        ContactManifold manifold, 
        ContactSettings settings
    );


    public static void onContactRemoved(
        MemorySegment userData, 
        MemorySegment subShapePair
    ) {
        ContactListener callback = CACHE.get(userData.address()).get();

        callback.onContactRemoved(
            subShapePair
        );
    }

    public void onContactRemoved(
        MemorySegment subShapePair
    ) {
        onContactRemoved(
            new SubShapeIDPair(subShapePair)
        );
    }

    public abstract void onContactRemoved(
        SubShapeIDPair subShapePair
    );


}