/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class ConvexShapeSettings extends ShapeSettings
		permits BoxShapeSettings,
		CapsuleShapeSettings,
		ConvexHullShapeSettings,
		CylinderShapeSettings,
		SphereShapeSettings,
		TaperedCapsuleShapeSettings,
		TaperedCylinderShapeSettings,
		TriangleShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY;
    private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY = downcallHandle("JPH_ConvexShapeSettings_GetDensity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY = downcallHandleVoid("JPH_ConvexShapeSettings_SetDensity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public ConvexShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static float getDensity(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_GET_DENSITY.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDensity}.
     */
    public final float getDensity(
        ConvexShapeSettings shape
    ) {
        return (float) getDensity(
            shape.memorySegment()
        );
    }
    
    public static void setDensity(
        MemorySegment shape, 
        float value
    ) {
        MethodHandle method = JPH_CONVEX_SHAPE_SETTINGS_SET_DENSITY.get();
        try {
            method.invokeExact(
                shape, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setDensity}.
     */
    public final void setDensity(
        ConvexShapeSettings shape, 
        float value
    ) {
        setDensity(
            shape.memorySegment(), 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}