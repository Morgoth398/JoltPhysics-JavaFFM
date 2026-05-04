/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class RotatedTranslatedShape extends DecoratedShape {

    private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION;
    private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_ROTATED_TRANSLATED_SHAPE_CREATE = downcallHandle("JPH_RotatedTranslatedShape_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION = downcallHandleVoid("JPH_RotatedTranslatedShape_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION = downcallHandleVoid("JPH_RotatedTranslatedShape_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public RotatedTranslatedShape(
        Vec3 position, 
        Quat rotation, 
        Shape shape
    ) {
        this(
            Arena.ofAuto(),
            position, 
            rotation, 
            shape
        );
    }
    
    public RotatedTranslatedShape(
        Arena arena,
        Vec3 position, 
        Quat rotation, 
        Shape shape
    ) {
         MemorySegment segment = create(
            position.memorySegment(), 
            rotation.memorySegment(), 
            shape.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public RotatedTranslatedShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment position, 
        MemorySegment rotation, 
        MemorySegment shape
    ) {
        MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                position, 
                rotation, 
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void getPosition(
        MemorySegment shape, 
        MemorySegment position
    ) {
        MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION.get();
        try {
            method.invokeExact(
                shape, 
                position
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getPosition}.
     */
    public final void getPosition(
        Vec3 position
    ) {
        getPosition(
            this.segment, 
            position.memorySegment()
        );
    }
    
    public static void getRotation(
        MemorySegment shape, 
        MemorySegment rotation
    ) {
        MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION.get();
        try {
            method.invokeExact(
                shape, 
                rotation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getRotation}.
     */
    public final void getRotation(
        Quat rotation
    ) {
        getRotation(
            this.segment, 
            rotation.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}