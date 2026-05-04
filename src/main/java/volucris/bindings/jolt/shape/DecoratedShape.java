/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.shape;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class DecoratedShape extends Shape
		permits OffsetCenterOfMassShape,
		RotatedTranslatedShape,
		ScaledShape {

    private static final LazyConstant<MethodHandle> JPH_DECORATED_SHAPE_GET_INNER_SHAPE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_DECORATED_SHAPE_GET_INNER_SHAPE = downcallHandle("JPH_DecoratedShape_GetInnerShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public DecoratedShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment getInnerShape(
        MemorySegment shape
    ) {
        MethodHandle method = JPH_DECORATED_SHAPE_GET_INNER_SHAPE.get();
        try {
            return (MemorySegment) method.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInnerShape}.
     */
    public final @Nullable Shape getInnerShape(
    ) {
        MemorySegment segment = getInnerShape(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new Shape(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}