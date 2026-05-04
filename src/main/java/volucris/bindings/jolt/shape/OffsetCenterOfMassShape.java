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
public final class OffsetCenterOfMassShape extends DecoratedShape {

    private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE = downcallHandle("JPH_OffsetCenterOfMassShape_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET = downcallHandleVoid("JPH_OffsetCenterOfMassShape_GetOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public OffsetCenterOfMassShape(
        Vec3 offset, 
        Shape shape
    ) {
        this(
            Arena.ofAuto(),
            offset, 
            shape
        );
    }
    
    public OffsetCenterOfMassShape(
        Arena arena,
        Vec3 offset, 
        Shape shape
    ) {
         MemorySegment segment = create(
            offset.memorySegment(), 
            shape.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public OffsetCenterOfMassShape(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment offset, 
        MemorySegment shape
    ) {
        MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                offset, 
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void getOffset(
        MemorySegment shape, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET.get();
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
     * Typed method of {@link #getOffset}.
     */
    public final void getOffset(
        Vec3 result
    ) {
        getOffset(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}