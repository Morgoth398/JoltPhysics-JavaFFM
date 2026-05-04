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
public final class OffsetCenterOfMassShapeSettings extends ShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2;
    private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public OffsetCenterOfMassShapeSettings(
        Vec3 offset, 
        ShapeSettings shapeSettings
    ) {
        this(
            Arena.ofAuto(),
            offset, 
            shapeSettings
        );
    }
    
    public OffsetCenterOfMassShapeSettings(
        Arena arena,
        Vec3 offset, 
        ShapeSettings shapeSettings
    ) {
         MemorySegment segment = create(
            offset.memorySegment(), 
            shapeSettings.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public OffsetCenterOfMassShapeSettings(
        Vec3 offset, 
        Shape shape
    ) {
        this(
            Arena.ofAuto(),
            offset, 
            shape
        );
    }
    
    public OffsetCenterOfMassShapeSettings(
        Arena arena,
        Vec3 offset, 
        Shape shape
    ) {
         MemorySegment segment = create2(
            offset.memorySegment(), 
            shape.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public OffsetCenterOfMassShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment offset, 
        MemorySegment shapeSettings
    ) {
        MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                offset, 
                shapeSettings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment create2(
        MemorySegment offset, 
        MemorySegment shape
    ) {
        MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2.get();
        try {
            return (MemorySegment) method.invokeExact(
                offset, 
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable OffsetCenterOfMassShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new OffsetCenterOfMassShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}