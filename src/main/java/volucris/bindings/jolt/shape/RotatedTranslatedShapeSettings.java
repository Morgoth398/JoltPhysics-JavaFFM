/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class RotatedTranslatedShapeSettings extends ShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2;
    private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_RotatedTranslatedShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_RotatedTranslatedShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_RotatedTranslatedShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public RotatedTranslatedShapeSettings(
        Vec3 position, 
        Quat rotation, 
        ShapeSettings shapeSettings
    ) {
        this(
            Arena.ofAuto(),
            position, 
            rotation, 
            shapeSettings
        );
    }
    
    public RotatedTranslatedShapeSettings(
        Arena arena,
        Vec3 position, 
        Quat rotation, 
        ShapeSettings shapeSettings
    ) {
         MemorySegment segment = create(
            position.memorySegment(), 
            rotation.memorySegment(), 
            shapeSettings.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public RotatedTranslatedShapeSettings(
        Vec3 position, 
        Quat rotation, 
        Shape shape
    ) {
        this(
            Arena.ofAuto(),
            position, 
            rotation, 
            shape
        );
    }
    
    public RotatedTranslatedShapeSettings(
        Arena arena,
        Vec3 position, 
        Quat rotation, 
        Shape shape
    ) {
         MemorySegment segment = create2(
            position.memorySegment(), 
            rotation.memorySegment(), 
            shape.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public RotatedTranslatedShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment position, 
        MemorySegment rotation, 
        MemorySegment shapeSettings
    ) {
        MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                position, 
                rotation, 
                shapeSettings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment create2(
        MemorySegment position, 
        MemorySegment rotation, 
        MemorySegment shape
    ) {
        MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2.get();
        try {
            return (MemorySegment) method.invokeExact(
                position, 
                rotation, 
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable RotatedTranslatedShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new RotatedTranslatedShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}