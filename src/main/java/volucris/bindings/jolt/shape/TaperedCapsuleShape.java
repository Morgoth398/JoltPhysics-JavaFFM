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
public final class TaperedCapsuleShape extends ConvexShape {

    private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_GET_TOP_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_GET_BOTTOM_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_TAPERED_CAPSULE_SHAPE_GET_HALF_HEIGHT;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TAPERED_CAPSULE_SHAPE_GET_TOP_RADIUS = downcallHandle("JPH_TaperedCapsuleShape_GetTopRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_TAPERED_CAPSULE_SHAPE_GET_BOTTOM_RADIUS = downcallHandle("JPH_TaperedCapsuleShape_GetBottomRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_TAPERED_CAPSULE_SHAPE_GET_HALF_HEIGHT = downcallHandle("JPH_TaperedCapsuleShape_GetHalfHeight", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TaperedCapsuleShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static float getTopRadius(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_GET_TOP_RADIUS.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTopRadius}.
     */
    public final float getTopRadius(
    ) {
        return (float) getTopRadius(
            this.segment
        );
    }
    
    public static float getBottomRadius(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_GET_BOTTOM_RADIUS.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getBottomRadius}.
     */
    public final float getBottomRadius(
    ) {
        return (float) getBottomRadius(
            this.segment
        );
    }
    
    public static float getHalfHeight(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_TAPERED_CAPSULE_SHAPE_GET_HALF_HEIGHT.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getHalfHeight}.
     */
    public final float getHalfHeight(
    ) {
        return (float) getHalfHeight(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}