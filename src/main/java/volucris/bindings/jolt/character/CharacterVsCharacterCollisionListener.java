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
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Vec3;
import volucris.bindings.jolt.raycast.CollideShapeSettings;
import volucris.bindings.jolt.raycast.ShapeCastSettings;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public abstract class CharacterVsCharacterCollisionListener extends CharacterVsCharacterCollision {

    private static final HashMap<Long, WeakReference<CharacterVsCharacterCollisionListener>> CACHE;

    public static final StructLayout LAYOUT;

    public static final FunctionDescriptor COLLIDE_CHARACTER_DESCRIPTION;
    public static final MethodHandle COLLIDE_CHARACTER_HANDLE;
    public static final FunctionDescriptor CAST_CHARACTER_DESCRIPTION;
    public static final MethodHandle CAST_CHARACTER_HANDLE;

    private static final MemorySegment PROCS;
    private static final MemorySegment COLLIDE_CHARACTER_ADDRESS;
    private static final MemorySegment CAST_CHARACTER_ADDRESS;

    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_SET_PROCS;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY;

    private final MemorySegment segment;

    private final MemorySegment identifier;

    static {
        CACHE = new HashMap<>();

        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("collideCharacter"), 
            UNBOUNDED_ADDRESS.withName("castCharacter")
        ).withName("JPH_CharacterVsCharacterCollision_Procs").withByteAlignment(8);

        JPH_CHARACTER_VS_CHARACTER_COLLISION_SET_PROCS = downcallHandleVoid("JPH_CharacterVsCharacterCollision_SetProcs", UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE = downcallHandle("JPH_CharacterVsCharacterCollision_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY = downcallHandleVoid("JPH_CharacterVsCharacterCollision_Destroy", UNBOUNDED_ADDRESS);

        Lookup lookup = MethodHandles.lookup();
        Linker linker = Linker.nativeLinker();

        Arena arena = Arena.global();

        PROCS = Arena.global().allocate(LAYOUT);

        try {
            COLLIDE_CHARACTER_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            COLLIDE_CHARACTER_HANDLE = lookup.findStatic(CharacterVsCharacterCollisionListener.class, "collideCharacter", COLLIDE_CHARACTER_DESCRIPTION.toMethodType());

            COLLIDE_CHARACTER_ADDRESS = linker.upcallStub(COLLIDE_CHARACTER_HANDLE, COLLIDE_CHARACTER_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("collideCharacter")), COLLIDE_CHARACTER_ADDRESS);
            
            CAST_CHARACTER_DESCRIPTION = FunctionDescriptor.ofVoid(
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS, 
                UNBOUNDED_ADDRESS
            );

            CAST_CHARACTER_HANDLE = lookup.findStatic(CharacterVsCharacterCollisionListener.class, "castCharacter", CAST_CHARACTER_DESCRIPTION.toMethodType());

            CAST_CHARACTER_ADDRESS = linker.upcallStub(CAST_CHARACTER_HANDLE, CAST_CHARACTER_DESCRIPTION, arena);

            PROCS.set(UNBOUNDED_ADDRESS, LAYOUT.byteOffset(PathElement.groupElement("castCharacter")), CAST_CHARACTER_ADDRESS);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setProcs(PROCS);
    }

    public CharacterVsCharacterCollisionListener() {
        this(Arena.ofAuto());
    }

    public CharacterVsCharacterCollisionListener(Arena arena) {
        this.identifier = arena.allocate(JAVA_INT);

        this.segment = create(identifier).reinterpret(arena, s -> destroy(s));

        CACHE.put(identifier.address(), new WeakReference<>(this));
    }

    public static void setProcs(
        MemorySegment procs
    ) {
        MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_SET_PROCS.get();
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
        MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_CREATE.get();
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
        MethodHandle method = JPH_CHARACTER_VS_CHARACTER_COLLISION_DESTROY.get();
        try {
            method.invokeExact(
                listener
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #destroy}.
     */
    public final void destroy(
        CharacterVsCharacterCollision listener
    ) {
        destroy(
            listener.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }


    public static void collideCharacter(
        MemorySegment userData, 
        MemorySegment character, 
        MemorySegment centerOfMassTransform, 
        MemorySegment collideShapeSettings, 
        MemorySegment baseOffset
    ) {
        CharacterVsCharacterCollisionListener callback = CACHE.get(userData.address()).get();

        callback.collideCharacter(
            character, 
            centerOfMassTransform, 
            collideShapeSettings, 
            baseOffset
        );
    }

    public void collideCharacter(
        MemorySegment character, 
        MemorySegment centerOfMassTransform, 
        MemorySegment collideShapeSettings, 
        MemorySegment baseOffset
    ) {
        collideCharacter(
            new CharacterVirtual(character), 
            new Mat4(centerOfMassTransform), 
            new CollideShapeSettings(collideShapeSettings), 
            new Vec3(baseOffset)
        );
    }

    public abstract void collideCharacter(
        CharacterVirtual character, 
        Mat4 centerOfMassTransform, 
        CollideShapeSettings collideShapeSettings, 
        Vec3 baseOffset
    );


    public static void castCharacter(
        MemorySegment userData, 
        MemorySegment character, 
        MemorySegment centerOfMassTransform, 
        MemorySegment direction, 
        MemorySegment shapeCastSettings, 
        MemorySegment baseOffset
    ) {
        CharacterVsCharacterCollisionListener callback = CACHE.get(userData.address()).get();

        callback.castCharacter(
            character, 
            centerOfMassTransform, 
            direction, 
            shapeCastSettings, 
            baseOffset
        );
    }

    public void castCharacter(
        MemorySegment character, 
        MemorySegment centerOfMassTransform, 
        MemorySegment direction, 
        MemorySegment shapeCastSettings, 
        MemorySegment baseOffset
    ) {
        castCharacter(
            new CharacterVirtual(character), 
            new Mat4(centerOfMassTransform), 
            new Vec3(direction), 
            new ShapeCastSettings(shapeCastSettings), 
            new Vec3(baseOffset)
        );
    }

    public abstract void castCharacter(
        CharacterVirtual character, 
        Mat4 centerOfMassTransform, 
        Vec3 direction, 
        ShapeCastSettings shapeCastSettings, 
        Vec3 baseOffset
    );


}