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
public final class CapsuleShape extends ConvexShape {

    private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_GET_RADIUS;
    private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CAPSULE_SHAPE_CREATE = downcallHandle("JPH_CapsuleShape_Create", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        JPH_CAPSULE_SHAPE_GET_RADIUS = downcallHandle("JPH_CapsuleShape_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER = downcallHandle("JPH_CapsuleShape_GetHalfHeightOfCylinder", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public CapsuleShape(
        float halfHeightOfCylinder, 
        float radius
    ) {
        this(
            Arena.ofAuto(),
            halfHeightOfCylinder, 
            radius
        );
    }
    
    public CapsuleShape(
        Arena arena,
        float halfHeightOfCylinder, 
        float radius
    ) {
         MemorySegment segment = create(
            halfHeightOfCylinder, 
            radius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public CapsuleShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        float halfHeightOfCylinder, 
        float radius
    ) {
        MethodHandle method = JPH_CAPSULE_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                halfHeightOfCylinder, 
                radius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static float getRadius(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CAPSULE_SHAPE_GET_RADIUS.get();
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
    
    public static float getHalfHeightOfCylinder(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER.get();
        try {
            return (float) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getHalfHeightOfCylinder}.
     */
    public final float getHalfHeightOfCylinder(
    ) {
        return (float) getHalfHeightOfCylinder(
            this.segment
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}