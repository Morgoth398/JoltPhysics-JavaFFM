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
public final class BoxShapeSettings extends ConvexShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BOX_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_BoxShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_BoxShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public BoxShapeSettings(
        Vec3 halfExtent, 
        float convexRadius
    ) {
        this(
            Arena.ofAuto(),
            halfExtent, 
            convexRadius
        );
    }
    
    public BoxShapeSettings(
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
    
    public BoxShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment halfExtent, 
        float convexRadius
    ) {
        MethodHandle method = JPH_BOX_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                halfExtent, 
                convexRadius
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable BoxShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new BoxShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}