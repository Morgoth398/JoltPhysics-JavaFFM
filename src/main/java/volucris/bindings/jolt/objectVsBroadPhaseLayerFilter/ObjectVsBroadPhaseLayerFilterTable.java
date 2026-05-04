/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.objectVsBroadPhaseLayerFilter;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterface;
import volucris.bindings.jolt.objectLayerPairFilter.ObjectLayerPairFilter;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class ObjectVsBroadPhaseLayerFilterTable extends ObjectVsBroadPhaseLayerFilter {

    private static final LazyConstant<MethodHandle> JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_CREATE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_CREATE = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterTable_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        //@formatter:on
    }

    public ObjectVsBroadPhaseLayerFilterTable(
        BroadPhaseLayerInterface broadPhaseLayerInterface, 
        int numBroadPhaseLayers, 
        ObjectLayerPairFilter objectLayerPairFilter, 
        int numObjectLayers
    ) {
        this(
            Arena.ofAuto(),
            broadPhaseLayerInterface, 
            numBroadPhaseLayers, 
            objectLayerPairFilter, 
            numObjectLayers
        );
    }
    
    public ObjectVsBroadPhaseLayerFilterTable(
        Arena arena,
        BroadPhaseLayerInterface broadPhaseLayerInterface, 
        int numBroadPhaseLayers, 
        ObjectLayerPairFilter objectLayerPairFilter, 
        int numObjectLayers
    ) {
         MemorySegment segment = create(
            broadPhaseLayerInterface.memorySegment(), 
            numBroadPhaseLayers, 
            objectLayerPairFilter.memorySegment(), 
            numObjectLayers
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public ObjectVsBroadPhaseLayerFilterTable(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment broadPhaseLayerInterface, 
        int numBroadPhaseLayers, 
        MemorySegment objectLayerPairFilter, 
        int numObjectLayers
    ) {
        MethodHandle method = JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                broadPhaseLayerInterface, 
                numBroadPhaseLayers, 
                objectLayerPairFilter, 
                numObjectLayers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}