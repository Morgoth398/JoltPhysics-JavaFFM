/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.PhysicsMaterial;
import volucris.bindings.jolt.math.Plane;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class PlaneShapeSettings extends ShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_PLANE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_PlaneShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_PLANE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_PlaneShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public PlaneShapeSettings(
        Plane plane, 
        PhysicsMaterial material, 
        float halfExtent
    ) {
        this(
            Arena.ofAuto(),
            plane, 
            material, 
            halfExtent
        );
    }
    
    public PlaneShapeSettings(
        Arena arena,
        Plane plane, 
        PhysicsMaterial material, 
        float halfExtent
    ) {
         MemorySegment segment = create(
            plane.memorySegment(), 
            material.memorySegment(), 
            halfExtent
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public PlaneShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment plane, 
        MemorySegment material, 
        float halfExtent
    ) {
        MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                plane, 
                material, 
                halfExtent
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_PLANE_SHAPE_SETTINGS_CREATE_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #createShape}.
     */
    public final @Nullable PlaneShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new PlaneShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}