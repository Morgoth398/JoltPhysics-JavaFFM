/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.broadPhaseLayerInterface;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class BroadPhaseLayerInterfaceMask extends BroadPhaseLayerInterface {

    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE;
    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE = downcallHandle("JPH_BroadPhaseLayerInterfaceMask_Create", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER = downcallHandleVoid("JPH_BroadPhaseLayerInterfaceMask_ConfigureLayer", UNBOUNDED_ADDRESS, JAVA_BYTE, JAVA_INT, JAVA_INT);
        //@formatter:on
    }

    public BroadPhaseLayerInterfaceMask(
        int numBroadPhaseLayers
    ) {
        this(
            Arena.ofAuto(),
            numBroadPhaseLayers
        );
    }
    
    public BroadPhaseLayerInterfaceMask(
        Arena arena,
        int numBroadPhaseLayers
    ) {
         MemorySegment segment = create(
            numBroadPhaseLayers
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public BroadPhaseLayerInterfaceMask(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        int numBroadPhaseLayers
    ) {
        MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                numBroadPhaseLayers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void configureLayer(
        MemorySegment bpInterface, 
        byte broadPhaseLayer, 
        int groupsToInclude, 
        int groupsToExclude
    ) {
        MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_MASK_CONFIGURE_LAYER.get();
        try {
            method.invokeExact(
                bpInterface, 
                broadPhaseLayer, 
                groupsToInclude, 
                groupsToExclude
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #configureLayer}.
     */
    public final void configureLayer(
        byte broadPhaseLayer, 
        int groupsToInclude, 
        int groupsToExclude
    ) {
        configureLayer(
            this.segment, 
            broadPhaseLayer, 
            groupsToInclude, 
            groupsToExclude
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}