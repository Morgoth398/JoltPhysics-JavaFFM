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
public final class ScaledShapeSettings extends ShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_CREATE2;
    private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SCALED_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_ScaledShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SCALED_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_ScaledShapeSettings_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SCALED_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_ScaledShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public ScaledShapeSettings(
        ShapeSettings shapeSettings, 
        Vec3 scale
    ) {
        this(
            Arena.ofAuto(),
            shapeSettings, 
            scale
        );
    }
    
    public ScaledShapeSettings(
        Arena arena,
        ShapeSettings shapeSettings, 
        Vec3 scale
    ) {
         MemorySegment segment = create(
            shapeSettings.memorySegment(), 
            scale.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public ScaledShapeSettings(
        Shape shape, 
        Vec3 scale
    ) {
        this(
            Arena.ofAuto(),
            shape, 
            scale
        );
    }
    
    public ScaledShapeSettings(
        Arena arena,
        Shape shape, 
        Vec3 scale
    ) {
         MemorySegment segment = create2(
            shape.memorySegment(), 
            scale.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public ScaledShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment shapeSettings, 
        MemorySegment scale
    ) {
        MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                shapeSettings, 
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment create2(
        MemorySegment shape, 
        MemorySegment scale
    ) {
        MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE2.get();
        try {
            return (MemorySegment) method.invokeExact(
                shape, 
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable ScaledShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new ScaledShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}