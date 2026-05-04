/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class CylinderShapeSettings extends ConvexShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CYLINDER_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_CylinderShapeSettings_Create", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        JPH_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_CylinderShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public CylinderShapeSettings(
        float halfHeight, 
        float radius, 
        float convexRadius
    ) {
        this(
            Arena.ofAuto(),
            halfHeight, 
            radius, 
            convexRadius
        );
    }
    
    public CylinderShapeSettings(
        Arena arena,
        float halfHeight, 
        float radius, 
        float convexRadius
    ) {
         MemorySegment segment = create(
            halfHeight, 
            radius, 
            convexRadius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public CylinderShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        float halfHeight, 
        float radius, 
        float convexRadius
    ) {
        MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                halfHeight, 
                radius, 
                convexRadius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_CYLINDER_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable CylinderShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new CylinderShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}