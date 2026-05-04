/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.character;

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
import volucris.bindings.jolt.PhysicsMaterial;
import volucris.bindings.jolt.body.Body;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class CharacterContactListener {

    private static final HashMap<Long, WeakReference<CharacterContactListener>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor ON_ADJUST_BODY_VELOCITY_DESCRIPTION;
    public static final MethodHandle ON_ADJUST_BODY_VELOCITY_HANDLE;
    public static final FunctionDescriptor ON_CONTACT_VALIDATE_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_VALIDATE_HANDLE;
    public static final FunctionDescriptor ON_CHARACTER_CONTACT_VALIDATE_DESCRIPTION;
    public static final MethodHandle ON_CHARACTER_CONTACT_VALIDATE_HANDLE;
    public static final FunctionDescriptor ON_CONTACT_ADDED_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_ADDED_HANDLE;
    public static final FunctionDescriptor ON_CONTACT_PERSISTED_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_PERSISTED_HANDLE;
    public static final FunctionDescriptor ON_CONTACT_REMOVED_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_REMOVED_HANDLE;
    public static final FunctionDescriptor ON_CHARACTER_CONTACT_ADDED_DESCRIPTION;
    public static final MethodHandle ON_CHARACTER_CONTACT_ADDED_HANDLE;
    public static final FunctionDescriptor ON_CHARACTER_CONTACT_PERSISTED_DESCRIPTION;
    public static final MethodHandle ON_CHARACTER_CONTACT_PERSISTED_HANDLE;
    public static final FunctionDescriptor ON_CHARACTER_CONTACT_REMOVED_DESCRIPTION;
    public static final MethodHandle ON_CHARACTER_CONTACT_REMOVED_HANDLE;
    public static final FunctionDescriptor ON_CONTACT_SOLVE_DESCRIPTION;
    public static final MethodHandle ON_CONTACT_SOLVE_HANDLE;
    public static final FunctionDescriptor ON_CHARACTER_CONTACT_SOLVE_DESCRIPTION;
    public static final MethodHandle ON_CHARACTER_CONTACT_SOLVE_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment ON_ADJUST_BODY_VELOCITY_ADDRESS;
    private static final MemorySegment ON_CONTACT_VALIDATE_ADDRESS;
    private static final MemorySegment ON_CHARACTER_CONTACT_VALIDATE_ADDRESS;
    private static final MemorySegment ON_CONTACT_ADDED_ADDRESS;
    private static final MemorySegment ON_CONTACT_PERSISTED_ADDRESS;
    private static final MemorySegment ON_CONTACT_REMOVED_ADDRESS;
    private static final MemorySegment ON_CHARACTER_CONTACT_ADDED_ADDRESS;
    private static final MemorySegment ON_CHARACTER_CONTACT_PERSISTED_ADDRESS;
    private static final MemorySegment ON_CHARACTER_CONTACT_REMOVED_ADDRESS;
    private static final MemorySegment ON_CONTACT_SOLVE_ADDRESS;
    private static final MemorySegment ON_CHARACTER_CONTACT_SOLVE_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_LISTENER_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_LISTENER_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_CONTACT_LISTENER_DESTROY;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("onAdjustBodyVelocity"), 
            UNBOUNDED_ADDRESS.withName("onContactValidate"), 
            UNBOUNDED_ADDRESS.withName("onCharacterContactValidate"), 
            UNBOUNDED_ADDRESS.withName("onContactAdded"), 
            UNBOUNDED_ADDRESS.withName("onContactPersisted"), 
            UNBOUNDED_ADDRESS.withName("onContactRemoved"), 
            UNBOUNDED_ADDRESS.withName("onCharacterContactAdded"), 
            UNBOUNDED_ADDRESS.withName("onCharacterContactPersisted"), 
            UNBOUNDED_ADDRESS.withName("onCharacterContactRemoved"), 
            UNBOUNDED_ADDRESS.withName("onContactSolve"), 
            UNBOUNDED_ADDRESS.withName("onCharacterContactSolve")
        ).withName("JPH_CharacterContactListener_Procs").withByteAlignment(8);

        JPH_CHARACTER_CONTACT_LISTENER_SET_PROCS = downcallHandleVoid("JPH_CharacterContactListener_SetProcs", UNBOUNDED_ADDRESS);
        JPH_CHARACTER_CONTACT_LISTENER_CREATE = downcallHandle("JPH_CharacterContactListener_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_CONTACT_LISTENER_DESTROY = downcallHandleVoid("JPH_CharacterContactListener_Destroy", UNBOUNDED_ADDRESS);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            ON_ADJUST_BODY_VELOCITY_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_ADJUST_BODY_VELOCITY_HANDLE = lookup.findStatic(CharacterContactListener.class, "onAdjustBodyVelocity", ON_ADJUST_BODY_VELOCITY_DESCRIPTION.toMethodType());

            ON_ADJUST_BODY_VELOCITY_ADDRESS = linker.upcallStub(ON_ADJUST_BODY_VELOCITY_HANDLE, ON_ADJUST_BODY_VELOCITY_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onAdjustBodyVelocity")), ON_ADJUST_BODY_VELOCITY_ADDRESS);
            
            ON_CONTACT_VALIDATE_DESCRIPTION = FunctionDescriptor.of(
                JAVA_BOOLEAN, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_INT
            );

            ON_CONTACT_VALIDATE_HANDLE = lookup.findStatic(CharacterContactListener.class, "onContactValidate", ON_CONTACT_VALIDATE_DESCRIPTION.toMethodType());

            ON_CONTACT_VALIDATE_ADDRESS = linker.upcallStub(ON_CONTACT_VALIDATE_HANDLE, ON_CONTACT_VALIDATE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactValidate")), ON_CONTACT_VALIDATE_ADDRESS);
            
            ON_CHARACTER_CONTACT_VALIDATE_DESCRIPTION = FunctionDescriptor.of(
                JAVA_BOOLEAN, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT
            );

            ON_CHARACTER_CONTACT_VALIDATE_HANDLE = lookup.findStatic(CharacterContactListener.class, "onCharacterContactValidate", ON_CHARACTER_CONTACT_VALIDATE_DESCRIPTION.toMethodType());

            ON_CHARACTER_CONTACT_VALIDATE_ADDRESS = linker.upcallStub(ON_CHARACTER_CONTACT_VALIDATE_HANDLE, ON_CHARACTER_CONTACT_VALIDATE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onCharacterContactValidate")), ON_CHARACTER_CONTACT_VALIDATE_ADDRESS);
            
            ON_CONTACT_ADDED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_INT, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CONTACT_ADDED_HANDLE = lookup.findStatic(CharacterContactListener.class, "onContactAdded", ON_CONTACT_ADDED_DESCRIPTION.toMethodType());

            ON_CONTACT_ADDED_ADDRESS = linker.upcallStub(ON_CONTACT_ADDED_HANDLE, ON_CONTACT_ADDED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactAdded")), ON_CONTACT_ADDED_ADDRESS);
            
            ON_CONTACT_PERSISTED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_INT, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CONTACT_PERSISTED_HANDLE = lookup.findStatic(CharacterContactListener.class, "onContactPersisted", ON_CONTACT_PERSISTED_DESCRIPTION.toMethodType());

            ON_CONTACT_PERSISTED_ADDRESS = linker.upcallStub(ON_CONTACT_PERSISTED_HANDLE, ON_CONTACT_PERSISTED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactPersisted")), ON_CONTACT_PERSISTED_ADDRESS);
            
            ON_CONTACT_REMOVED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_INT
            );

            ON_CONTACT_REMOVED_HANDLE = lookup.findStatic(CharacterContactListener.class, "onContactRemoved", ON_CONTACT_REMOVED_DESCRIPTION.toMethodType());

            ON_CONTACT_REMOVED_ADDRESS = linker.upcallStub(ON_CONTACT_REMOVED_HANDLE, ON_CONTACT_REMOVED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactRemoved")), ON_CONTACT_REMOVED_ADDRESS);
            
            ON_CHARACTER_CONTACT_ADDED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CHARACTER_CONTACT_ADDED_HANDLE = lookup.findStatic(CharacterContactListener.class, "onCharacterContactAdded", ON_CHARACTER_CONTACT_ADDED_DESCRIPTION.toMethodType());

            ON_CHARACTER_CONTACT_ADDED_ADDRESS = linker.upcallStub(ON_CHARACTER_CONTACT_ADDED_HANDLE, ON_CHARACTER_CONTACT_ADDED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onCharacterContactAdded")), ON_CHARACTER_CONTACT_ADDED_ADDRESS);
            
            ON_CHARACTER_CONTACT_PERSISTED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CHARACTER_CONTACT_PERSISTED_HANDLE = lookup.findStatic(CharacterContactListener.class, "onCharacterContactPersisted", ON_CHARACTER_CONTACT_PERSISTED_DESCRIPTION.toMethodType());

            ON_CHARACTER_CONTACT_PERSISTED_ADDRESS = linker.upcallStub(ON_CHARACTER_CONTACT_PERSISTED_HANDLE, ON_CHARACTER_CONTACT_PERSISTED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onCharacterContactPersisted")), ON_CHARACTER_CONTACT_PERSISTED_ADDRESS);
            
            ON_CHARACTER_CONTACT_REMOVED_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_INT
            );

            ON_CHARACTER_CONTACT_REMOVED_HANDLE = lookup.findStatic(CharacterContactListener.class, "onCharacterContactRemoved", ON_CHARACTER_CONTACT_REMOVED_DESCRIPTION.toMethodType());

            ON_CHARACTER_CONTACT_REMOVED_ADDRESS = linker.upcallStub(ON_CHARACTER_CONTACT_REMOVED_HANDLE, ON_CHARACTER_CONTACT_REMOVED_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onCharacterContactRemoved")), ON_CHARACTER_CONTACT_REMOVED_ADDRESS);
            
            ON_CONTACT_SOLVE_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                JAVA_INT, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CONTACT_SOLVE_HANDLE = lookup.findStatic(CharacterContactListener.class, "onContactSolve", ON_CONTACT_SOLVE_DESCRIPTION.toMethodType());

            ON_CONTACT_SOLVE_ADDRESS = linker.upcallStub(ON_CONTACT_SOLVE_HANDLE, ON_CONTACT_SOLVE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onContactSolve")), ON_CONTACT_SOLVE_ADDRESS);
            
            ON_CHARACTER_CONTACT_SOLVE_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                JAVA_INT, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            ON_CHARACTER_CONTACT_SOLVE_HANDLE = lookup.findStatic(CharacterContactListener.class, "onCharacterContactSolve", ON_CHARACTER_CONTACT_SOLVE_DESCRIPTION.toMethodType());

            ON_CHARACTER_CONTACT_SOLVE_ADDRESS = linker.upcallStub(ON_CHARACTER_CONTACT_SOLVE_HANDLE, ON_CHARACTER_CONTACT_SOLVE_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("onCharacterContactSolve")), ON_CHARACTER_CONTACT_SOLVE_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public CharacterContactListener() {
        this(Arena.ofAuto());
    }

    public CharacterContactListener(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_CHARACTER_CONTACT_LISTENER_SET_PROCS.get();
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
        MethodHandle method = JPH_CHARACTER_CONTACT_LISTENER_CREATE.get();
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
        MethodHandle method = JPH_CHARACTER_CONTACT_LISTENER_DESTROY.get();
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


    public static void onAdjustBodyVelocity(
        MemorySegment userData, 
        MemorySegment character, 
        MemorySegment body2, 
        MemorySegment ioLinearVelocity, 
        MemorySegment ioAngularVelocity
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onAdjustBodyVelocity(
            character, 
            body2, 
            ioLinearVelocity, 
            ioAngularVelocity
        );
    }

    public void onAdjustBodyVelocity(
        MemorySegment character, 
        MemorySegment body2, 
        MemorySegment ioLinearVelocity, 
        MemorySegment ioAngularVelocity
    ) {
        onAdjustBodyVelocity(
            new CharacterVirtual(character), 
            new Body(body2), 
            new Vec3(ioLinearVelocity), 
            new Vec3(ioAngularVelocity)
        );
    }

    public abstract void onAdjustBodyVelocity(
        CharacterVirtual character, 
        Body body2, 
        Vec3 ioLinearVelocity, 
        Vec3 ioAngularVelocity
    );


    public static boolean onContactValidate(
        MemorySegment userData, 
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        return (boolean) callback.onContactValidate(
            character, 
            bodyID2, 
            subShapeID2
        );
    }

    public boolean onContactValidate(
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2
    ) {
        return (boolean) onContactValidate(
            new CharacterVirtual(character), 
            bodyID2, 
            subShapeID2
        );
    }

    public abstract boolean onContactValidate(
        CharacterVirtual character, 
        int bodyID2, 
        int subShapeID2
    );


    public static boolean onCharacterContactValidate(
        MemorySegment userData, 
        MemorySegment character, 
        MemorySegment otherCharacter, 
        int subShapeID2
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        return (boolean) callback.onCharacterContactValidate(
            character, 
            otherCharacter, 
            subShapeID2
        );
    }

    public boolean onCharacterContactValidate(
        MemorySegment character, 
        MemorySegment otherCharacter, 
        int subShapeID2
    ) {
        return (boolean) onCharacterContactValidate(
            new CharacterVirtual(character), 
            new CharacterVirtual(otherCharacter), 
            subShapeID2
        );
    }

    public abstract boolean onCharacterContactValidate(
        CharacterVirtual character, 
        CharacterVirtual otherCharacter, 
        int subShapeID2
    );


    public static void onContactAdded(
        MemorySegment userData, 
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment ioSettings
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onContactAdded(
            character, 
            bodyID2, 
            subShapeID2, 
            contactPosition, 
            contactNormal, 
            ioSettings
        );
    }

    public void onContactAdded(
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment ioSettings
    ) {
        onContactAdded(
            new CharacterVirtual(character), 
            bodyID2, 
            subShapeID2, 
            new Vec3(contactPosition), 
            new Vec3(contactNormal), 
            new CharacterContactSettings(ioSettings)
        );
    }

    public abstract void onContactAdded(
        CharacterVirtual character, 
        int bodyID2, 
        int subShapeID2, 
        Vec3 contactPosition, 
        Vec3 contactNormal, 
        CharacterContactSettings ioSettings
    );


    public static void onContactPersisted(
        MemorySegment userData, 
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment ioSettings
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onContactPersisted(
            character, 
            bodyID2, 
            subShapeID2, 
            contactPosition, 
            contactNormal, 
            ioSettings
        );
    }

    public void onContactPersisted(
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment ioSettings
    ) {
        onContactPersisted(
            new CharacterVirtual(character), 
            bodyID2, 
            subShapeID2, 
            new Vec3(contactPosition), 
            new Vec3(contactNormal), 
            new CharacterContactSettings(ioSettings)
        );
    }

    public abstract void onContactPersisted(
        CharacterVirtual character, 
        int bodyID2, 
        int subShapeID2, 
        Vec3 contactPosition, 
        Vec3 contactNormal, 
        CharacterContactSettings ioSettings
    );


    public static void onContactRemoved(
        MemorySegment userData, 
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onContactRemoved(
            character, 
            bodyID2, 
            subShapeID2
        );
    }

    public void onContactRemoved(
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2
    ) {
        onContactRemoved(
            new CharacterVirtual(character), 
            bodyID2, 
            subShapeID2
        );
    }

    public abstract void onContactRemoved(
        CharacterVirtual character, 
        int bodyID2, 
        int subShapeID2
    );


    public static void onCharacterContactAdded(
        MemorySegment userData, 
        MemorySegment character, 
        MemorySegment otherCharacter, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment ioSettings
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onCharacterContactAdded(
            character, 
            otherCharacter, 
            subShapeID2, 
            contactPosition, 
            contactNormal, 
            ioSettings
        );
    }

    public void onCharacterContactAdded(
        MemorySegment character, 
        MemorySegment otherCharacter, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment ioSettings
    ) {
        onCharacterContactAdded(
            new CharacterVirtual(character), 
            new CharacterVirtual(otherCharacter), 
            subShapeID2, 
            new Vec3(contactPosition), 
            new Vec3(contactNormal), 
            new CharacterContactSettings(ioSettings)
        );
    }

    public abstract void onCharacterContactAdded(
        CharacterVirtual character, 
        CharacterVirtual otherCharacter, 
        int subShapeID2, 
        Vec3 contactPosition, 
        Vec3 contactNormal, 
        CharacterContactSettings ioSettings
    );


    public static void onCharacterContactPersisted(
        MemorySegment userData, 
        MemorySegment character, 
        MemorySegment otherCharacter, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment ioSettings
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onCharacterContactPersisted(
            character, 
            otherCharacter, 
            subShapeID2, 
            contactPosition, 
            contactNormal, 
            ioSettings
        );
    }

    public void onCharacterContactPersisted(
        MemorySegment character, 
        MemorySegment otherCharacter, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment ioSettings
    ) {
        onCharacterContactPersisted(
            new CharacterVirtual(character), 
            new CharacterVirtual(otherCharacter), 
            subShapeID2, 
            new Vec3(contactPosition), 
            new Vec3(contactNormal), 
            new CharacterContactSettings(ioSettings)
        );
    }

    public abstract void onCharacterContactPersisted(
        CharacterVirtual character, 
        CharacterVirtual otherCharacter, 
        int subShapeID2, 
        Vec3 contactPosition, 
        Vec3 contactNormal, 
        CharacterContactSettings ioSettings
    );


    public static void onCharacterContactRemoved(
        MemorySegment userData, 
        MemorySegment character, 
        int otherCharacterID, 
        int subShapeID2
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onCharacterContactRemoved(
            character, 
            otherCharacterID, 
            subShapeID2
        );
    }

    public void onCharacterContactRemoved(
        MemorySegment character, 
        int otherCharacterID, 
        int subShapeID2
    ) {
        onCharacterContactRemoved(
            new CharacterVirtual(character), 
            otherCharacterID, 
            subShapeID2
        );
    }

    public abstract void onCharacterContactRemoved(
        CharacterVirtual character, 
        int otherCharacterID, 
        int subShapeID2
    );


    public static void onContactSolve(
        MemorySegment userData, 
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment contactVelocity, 
        MemorySegment contactMaterial, 
        MemorySegment characterVelocity, 
        MemorySegment newCharacterVelocity
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onContactSolve(
            character, 
            bodyID2, 
            subShapeID2, 
            contactPosition, 
            contactNormal, 
            contactVelocity, 
            contactMaterial, 
            characterVelocity, 
            newCharacterVelocity
        );
    }

    public void onContactSolve(
        MemorySegment character, 
        int bodyID2, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment contactVelocity, 
        MemorySegment contactMaterial, 
        MemorySegment characterVelocity, 
        MemorySegment newCharacterVelocity
    ) {
        onContactSolve(
            new CharacterVirtual(character), 
            bodyID2, 
            subShapeID2, 
            new Vec3(contactPosition), 
            new Vec3(contactNormal), 
            new Vec3(contactVelocity), 
            new PhysicsMaterial(contactMaterial), 
            new Vec3(characterVelocity), 
            new Vec3(newCharacterVelocity)
        );
    }

    public abstract void onContactSolve(
        CharacterVirtual character, 
        int bodyID2, 
        int subShapeID2, 
        Vec3 contactPosition, 
        Vec3 contactNormal, 
        Vec3 contactVelocity, 
        PhysicsMaterial contactMaterial, 
        Vec3 characterVelocity, 
        Vec3 newCharacterVelocity
    );


    public static void onCharacterContactSolve(
        MemorySegment userData, 
        MemorySegment character, 
        MemorySegment otherCharacter, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment contactVelocity, 
        MemorySegment contactMaterial, 
        MemorySegment characterVelocity, 
        MemorySegment newCharacterVelocity
    ) {
        CharacterContactListener callback = CACHE.get(userData.address()).get();

        callback.onCharacterContactSolve(
            character, 
            otherCharacter, 
            subShapeID2, 
            contactPosition, 
            contactNormal, 
            contactVelocity, 
            contactMaterial, 
            characterVelocity, 
            newCharacterVelocity
        );
    }

    public void onCharacterContactSolve(
        MemorySegment character, 
        MemorySegment otherCharacter, 
        int subShapeID2, 
        MemorySegment contactPosition, 
        MemorySegment contactNormal, 
        MemorySegment contactVelocity, 
        MemorySegment contactMaterial, 
        MemorySegment characterVelocity, 
        MemorySegment newCharacterVelocity
    ) {
        onCharacterContactSolve(
            new CharacterVirtual(character), 
            new CharacterVirtual(otherCharacter), 
            subShapeID2, 
            new Vec3(contactPosition), 
            new Vec3(contactNormal), 
            new Vec3(contactVelocity), 
            new PhysicsMaterial(contactMaterial), 
            new Vec3(characterVelocity), 
            new Vec3(newCharacterVelocity)
        );
    }

    public abstract void onCharacterContactSolve(
        CharacterVirtual character, 
        CharacterVirtual otherCharacter, 
        int subShapeID2, 
        Vec3 contactPosition, 
        Vec3 contactNormal, 
        Vec3 contactVelocity, 
        PhysicsMaterial contactMaterial, 
        Vec3 characterVelocity, 
        Vec3 newCharacterVelocity
    );


}