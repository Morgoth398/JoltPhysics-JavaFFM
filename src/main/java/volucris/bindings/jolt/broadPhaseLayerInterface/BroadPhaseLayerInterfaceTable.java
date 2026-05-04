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
public final class BroadPhaseLayerInterfaceTable extends BroadPhaseLayerInterface {

    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE;
    private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PHASE_LAYER;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE = downcallHandle("JPH_BroadPhaseLayerInterfaceTable_Create", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PHASE_LAYER = downcallHandleVoid("JPH_BroadPhaseLayerInterfaceTable_MapObjectToBroadPhaseLayer", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BYTE);
        //@formatter:on
    }

    public BroadPhaseLayerInterfaceTable(
        int numObjectLayers, 
        int numBroadPhaseLayers
    ) {
        this(
            Arena.ofAuto(),
            numObjectLayers, 
            numBroadPhaseLayers
        );
    }
    
    public BroadPhaseLayerInterfaceTable(
        Arena arena,
        int numObjectLayers, 
        int numBroadPhaseLayers
    ) {
         MemorySegment segment = create(
            numObjectLayers, 
            numBroadPhaseLayers
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public BroadPhaseLayerInterfaceTable(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        int numObjectLayers, 
        int numBroadPhaseLayers
    ) {
        MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                numObjectLayers, 
                numBroadPhaseLayers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void mapObjectToBroadPhaseLayer(
        MemorySegment bpInterface, 
        int objectLayer, 
        byte broadPhaseLayer
    ) {
        MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PHASE_LAYER.get();
        try {
            method.invokeExact(
                bpInterface, 
                objectLayer, 
                broadPhaseLayer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #mapObjectToBroadPhaseLayer}.
     */
    public final void mapObjectToBroadPhaseLayer(
        int objectLayer, 
        byte broadPhaseLayer
    ) {
        mapObjectToBroadPhaseLayer(
            this.segment, 
            objectLayer, 
            broadPhaseLayer
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}