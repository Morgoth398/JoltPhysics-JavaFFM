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
public final class BoxShape extends ConvexShape {

    private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_GET_HALF_EXTENT;
    private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_GET_CONVEX_RADIUS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BOX_SHAPE_CREATE = downcallHandle("JPH_BoxShape_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BOX_SHAPE_GET_HALF_EXTENT = downcallHandleVoid("JPH_BoxShape_GetHalfExtent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_BOX_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_BoxShape_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public BoxShape(
        Vec3 halfExtent, 
        float convexRadius
    ) {
        this(
            Arena.ofAuto(),
            halfExtent, 
            convexRadius
        );
    }
    
    public BoxShape(
        Arena arena,
        Vec3 halfExtent, 
        float convexRadius
    ) {
         MemorySegment segment = create(
            halfExtent.memorySegment(), 
            convexRadius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public BoxShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment halfExtent, 
        float convexRadius
    ) {
        MethodHandle method = JPH_BOX_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                halfExtent, 
                convexRadius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void getHalfExtent(
        MemorySegment shape, 
        MemorySegment halfExtent
    ) {
        MethodHandle method = JPH_BOX_SHAPE_GET_HALF_EXTENT.get();
        try {
            method.invokeExact(
                shape, 
                halfExtent
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getHalfExtent}.
     */
    public final void getHalfExtent(
        Vec3 halfExtent
    ) {
        getHalfExtent(
            this.segment, 
            halfExtent.memorySegment()
        );
    }
    
    public static float getConvexRadius(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_BOX_SHAPE_GET_CONVEX_RADIUS.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getConvexRadius}.
     */
    public final float getConvexRadius(
    ) {
        return (float) getConvexRadius(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}