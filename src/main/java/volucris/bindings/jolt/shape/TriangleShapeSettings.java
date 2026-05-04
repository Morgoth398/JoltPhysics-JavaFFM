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
public final class TriangleShapeSettings extends ConvexShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TRIANGLE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_TriangleShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_TRIANGLE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_TriangleShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TriangleShapeSettings(
        Vec3 v1, 
        Vec3 v2, 
        Vec3 v3, 
        float convexRadius
    ) {
        this(
            Arena.ofAuto(),
            v1, 
            v2, 
            v3, 
            convexRadius
        );
    }
    
    public TriangleShapeSettings(
        Arena arena,
        Vec3 v1, 
        Vec3 v2, 
        Vec3 v3, 
        float convexRadius
    ) {
         MemorySegment segment = create(
            v1.memorySegment(), 
            v2.memorySegment(), 
            v3.memorySegment(), 
            convexRadius
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public TriangleShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment v1, 
        MemorySegment v2, 
        MemorySegment v3, 
        float convexRadius
    ) {
        MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                v1, 
                v2, 
                v3, 
                convexRadius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable TriangleShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new TriangleShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}