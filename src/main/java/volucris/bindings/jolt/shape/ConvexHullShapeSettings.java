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
public final class ConvexHullShapeSettings extends ConvexShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_ConvexHullShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_ConvexHullShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public ConvexHullShapeSettings(
        Vec3 points, 
        int pointsCount, 
        float maxConvexRadius
    ) {
        this(
            Arena.ofAuto(),
            points, 
            pointsCount, 
            maxConvexRadius
        );
    }
    
    public ConvexHullShapeSettings(
        Arena arena,
        Vec3 points, 
        int pointsCount, 
        float maxConvexRadius
    ) {
         MemorySegment segment = create(
            points.memorySegment(), 
            pointsCount, 
            maxConvexRadius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public ConvexHullShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment points, 
        int pointsCount, 
        float maxConvexRadius
    ) {
        MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                points, 
                pointsCount, 
                maxConvexRadius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable ConvexHullShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new ConvexHullShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}