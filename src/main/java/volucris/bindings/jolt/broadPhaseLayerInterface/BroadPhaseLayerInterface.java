/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.broadPhaseLayerInterface;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class BroadPhaseLayerInterface
		permits BroadPhaseLayerInterfaceMask,
		BroadPhaseLayerInterfaceTable {

    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_DESTROY;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BROAD_PHASE_LAYER_INTERFACE_DESTROY = downcallHandleVoid("JPH_BroadPhaseLayerInterface_Destroy", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public BroadPhaseLayerInterface(MemorySegment segment) {
        this.segment = segment;
    }

    public static void destroy(
        MemorySegment bpInterface
    ) {
        MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_DESTROY.get();
        try {
            method.invokeExact(
                bpInterface
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}