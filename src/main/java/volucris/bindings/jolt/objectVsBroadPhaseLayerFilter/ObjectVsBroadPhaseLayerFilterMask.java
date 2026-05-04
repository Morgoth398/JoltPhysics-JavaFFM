/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.objectVsBroadPhaseLayerFilter;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterface;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class ObjectVsBroadPhaseLayerFilterMask extends ObjectVsBroadPhaseLayerFilter {

    private static final LazyConstant<MethodHandle> JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_CREATE = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterMask_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public ObjectVsBroadPhaseLayerFilterMask(
        BroadPhaseLayerInterface broadPhaseLayerInterface
    ) {
        this(
            Arena.ofAuto(),
            broadPhaseLayerInterface
        );
    }
    
    public ObjectVsBroadPhaseLayerFilterMask(
        Arena arena,
        BroadPhaseLayerInterface broadPhaseLayerInterface
    ) {
         MemorySegment segment = create(
            broadPhaseLayerInterface.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public ObjectVsBroadPhaseLayerFilterMask(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment broadPhaseLayerInterface
    ) {
        MethodHandle method = JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                broadPhaseLayerInterface
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}