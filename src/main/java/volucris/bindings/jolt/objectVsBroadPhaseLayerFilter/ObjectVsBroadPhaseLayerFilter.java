/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.objectVsBroadPhaseLayerFilter;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class ObjectVsBroadPhaseLayerFilter
		permits ObjectVsBroadPhaseLayerFilterMask,
		ObjectVsBroadPhaseLayerFilterTable {

    private static final LazyConstant<MethodHandle> JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_DESTROY;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_DESTROY = downcallHandleVoid("JPH_ObjectVsBroadPhaseLayerFilter_Destroy", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public ObjectVsBroadPhaseLayerFilter(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment filter
    ) {
        MethodHandle method = JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_DESTROY.get();
        try {
            method.invokeExact(
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}