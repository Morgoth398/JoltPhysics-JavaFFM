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
public final class CylinderShape extends ConvexShape {

    private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_GET_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CYLINDER_SHAPE_CREATE = downcallHandle("JPH_CylinderShape_Create", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        JPH_CYLINDER_SHAPE_GET_RADIUS = downcallHandle("JPH_CylinderShape_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT = downcallHandle("JPH_CylinderShape_GetHalfHeight", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public CylinderShape(
        float halfHeight, 
        float radius
    ) {
        this(
            Arena.ofAuto(),
            halfHeight, 
            radius
        );
    }
    
    public CylinderShape(
        Arena arena,
        float halfHeight, 
        float radius
    ) {
         MemorySegment segment = create(
            halfHeight, 
            radius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public CylinderShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        float halfHeight, 
        float radius
    ) {
        MethodHandle method = JPH_CYLINDER_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                halfHeight, 
                radius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static float getRadius(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CYLINDER_SHAPE_GET_RADIUS.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRadius}.
     */
    public final float getRadius(
    ) {
        return (float) getRadius(
            this.segment
        );
    }
    
    public static float getHalfHeight(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT.get();
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