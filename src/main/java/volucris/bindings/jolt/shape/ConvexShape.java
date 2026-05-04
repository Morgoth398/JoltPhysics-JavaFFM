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
public sealed class ConvexShape extends Shape
		permits BoxShape,
		CapsuleShape,
		ConvexHullShape,
		CylinderShape,
		SphereShape,
		TaperedCapsuleShape,
		TaperedCylinderShape,
		TriangleShape {

    private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_GET_DENSITY;
    private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SET_DENSITY;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CONVEX_SHAPE_GET_DENSITY = downcallHandle("JPH_ConvexShape_GetDensity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CONVEX_SHAPE_SET_DENSITY = downcallHandleVoid("JPH_ConvexShape_SetDensity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public ConvexShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static float getDensity(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CONVEX_SHAPE_GET_DENSITY.get();
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
    ) {
        return (float) getDensity(
            this.segment
        );
    }
    
    public static void setDensity(
        MemorySegment shape, 
        float inDensity
    ) {
        MethodHandle method = JPH_CONVEX_SHAPE_SET_DENSITY.get();
        try {
            method.invokeExact(
                shape, 
                inDensity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setDensity}.
     */
    public final void setDensity(
        float inDensity
    ) {
        setDensity(
            this.segment, 
            inDensity
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}