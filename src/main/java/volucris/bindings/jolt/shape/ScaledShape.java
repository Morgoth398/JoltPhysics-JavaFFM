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
public final class ScaledShape extends DecoratedShape {

    private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_GET_SCALE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_SCALED_SHAPE_CREATE = downcallHandle("JPH_ScaledShape_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_SCALED_SHAPE_GET_SCALE = downcallHandleVoid("JPH_ScaledShape_GetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public ScaledShape(
        Shape shape, 
        Vec3 scale
    ) {
        this(
            Arena.ofAuto(),
            shape, 
            scale
        );
    }
    
    public ScaledShape(
        Arena arena,
        Shape shape, 
        Vec3 scale
    ) {
         MemorySegment segment = create(
            shape.memorySegment(), 
            scale.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public ScaledShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment shape, 
        MemorySegment scale
    ) {
        MethodHandle method = JPH_SCALED_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                shape, 
                scale
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void getScale(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_SCALED_SHAPE_GET_SCALE.get();
        try {
            method.invokeExact(
                shape, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getScale}.
     */
    public final void getScale(
        Vec3 result
    ) {
        getScale(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}