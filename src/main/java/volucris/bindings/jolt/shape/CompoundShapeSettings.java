/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class CompoundShapeSettings extends ShapeSettings
		permits MutableCompoundShapeSettings,
		StaticCompoundShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE;
    private static final LazyConstant<MethodHandle> JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE2;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE = downcallHandleVoid("JPH_CompoundShapeSettings_AddShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE2 = downcallHandleVoid("JPH_CompoundShapeSettings_AddShape2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public CompoundShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static void addShape(
        MemorySegment settings, 
        MemorySegment position, 
        MemorySegment rotation, 
        MemorySegment shapeSettings, 
        int userData
    ) {
        MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE.get();
        try {
            method.invokeExact(
                settings, 
                position, 
                rotation, 
                shapeSettings, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addShape}.
     */
    public final void addShape(
        Vec3 position, 
        Quat rotation, 
        ShapeSettings shapeSettings, 
        int userData
    ) {
        addShape(
            this.segment, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            shapeSettings.memorySegment(), 
            userData
        );
    }
    
    public static void addShape2(
        MemorySegment settings, 
        MemorySegment position, 
        MemorySegment rotation, 
        MemorySegment shape, 
        int userData
    ) {
        MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE2.get();
        try {
            method.invokeExact(
                settings, 
                position, 
                rotation, 
                shape, 
                userData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addShape2}.
     */
    public final void addShape2(
        Vec3 position, 
        Quat rotation, 
        Shape shape, 
        int userData
    ) {
        addShape2(
            this.segment, 
            position.memorySegment(), 
            rotation.memorySegment(), 
            shape.memorySegment(), 
            userData
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}