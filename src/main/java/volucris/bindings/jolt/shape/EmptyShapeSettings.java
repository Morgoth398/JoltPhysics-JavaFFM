/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class EmptyShapeSettings extends ShapeSettings {

    private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_SETTINGS_CREATE_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_EMPTY_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_EmptyShapeSettings_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_EMPTY_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_EmptyShapeSettings_CreateShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public EmptyShapeSettings(
        Vec3 centerOfMass
    ) {
        this(
            Arena.ofAuto(),
            centerOfMass
        );
    }
    
    public EmptyShapeSettings(
        Arena arena,
        Vec3 centerOfMass
    ) {
         MemorySegment segment = create(
            centerOfMass.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public EmptyShapeSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment centerOfMass
    ) {
        MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                centerOfMass
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment createShape(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_CREATE_SHAPE.get();
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
    public final @Nullable EmptyShape createShape(
    ) {
        MemorySegment segment = createShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new EmptyShape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}