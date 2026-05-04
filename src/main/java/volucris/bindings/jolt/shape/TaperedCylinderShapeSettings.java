/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.PhysicsMaterial;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class TaperedCylinderShapeSettings extends ConvexShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_TaperedCylinderShapeSettings_Create", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_TaperedCylinderShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TaperedCylinderShapeSettings(
        float halfHeightOfTaperedCylinder, 
        float topRadius, 
        float bottomRadius, 
        float convexRadius, 
        PhysicsMaterial material
    ) {
        this(
            Arena.ofAuto(),
            halfHeightOfTaperedCylinder, 
            topRadius, 
            bottomRadius, 
            convexRadius, 
            material
        );
    }
    
    public TaperedCylinderShapeSettings(
        Arena arena,
        float halfHeightOfTaperedCylinder, 
        float topRadius, 
        float bottomRadius, 
        float convexRadius, 
        PhysicsMaterial material
    ) {
         MemorySegment segment = create(
            halfHeightOfTaperedCylinder, 
            topRadius, 
            bottomRadius, 
            convexRadius, 
            material.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public TaperedCylinderShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        float halfHeightOfTaperedCylinder, 
        float topRadius, 
        float bottomRadius, 
        float convexRadius, 
        MemorySegment material
    ) {
        MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                halfHeightOfTaperedCylinder, 
                topRadius, 
                bottomRadius, 
                convexRadius, 
                material
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable TaperedCylinderShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new TaperedCylinderShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}