/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.jolt.math.Mat4;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class PhysicsMaterial {

    private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_CREATE;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME;
    private static final LazyConstant<MethodHandle> JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_PHYSICS_MATERIAL_CREATE = downcallHandle("JPH_PhysicsMaterial_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_PHYSICS_MATERIAL_DESTROY = downcallHandleVoid("JPH_PhysicsMaterial_Destroy", UNBOUNDED_ADDRESS);
        JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME = downcallHandle("JPH_PhysicsMaterial_GetDebugName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR = downcallHandle("JPH_PhysicsMaterial_GetDebugColor", JAVA_INT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public PhysicsMaterial(
        NativeByteArray name, 
        int color
    ) {
        this(
            Arena.ofAuto(),
            name, 
            color
        );
    }
    
    public PhysicsMaterial(
        Arena arena,
        NativeByteArray name, 
        int color
    ) {
         MemorySegment segment = create(
            name.memorySegment(), 
            color
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public PhysicsMaterial(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create(
        MemorySegment name, 
        int color
    ) {
        MethodHandle method = JPH_PHYSICS_MATERIAL_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                name, 
                color
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment material
    ) {
        MethodHandle method = JPH_PHYSICS_MATERIAL_DESTROY.get();
        try {
            method.invokeExact(
                material
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment getDebugName(
        MemorySegment material
    ) {
        MethodHandle method = JPH_PHYSICS_MATERIAL_GET_DEBUG_NAME.get();
        try {
            return (MemorySegment) method.invokeExact(
                material
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDebugName}.
     */
    public final @Nullable NativeByteArray getDebugName(
        PhysicsMaterial material
    ) {
        MemorySegment segment = getDebugName(
            material.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new NativeByteArray(segment);
    }
    
    public static int getDebugColor(
        MemorySegment material
    ) {
        MethodHandle method = JPH_PHYSICS_MATERIAL_GET_DEBUG_COLOR.get();
        try {
            return (int) method.invokeExact(
                material
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDebugColor}.
     */
    public final int getDebugColor(
        PhysicsMaterial material
    ) {
        return (int) getDebugColor(
            material.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}