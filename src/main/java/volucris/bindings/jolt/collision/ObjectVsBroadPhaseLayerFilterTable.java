/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerInterface;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ObjectVsBroadPhaseLayerFilterTable extends ObjectVsBroadPhaseLayerFilter {

	private static final LazyConstant<MethodHandle> JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_AS_OBJECT_VS_BROAD_PHASE_LAYER_FILTER;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_GET_NUM_BROAD_PHASE_LAYERS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_CREATE = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterTable_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_AS_OBJECT_VS_BROAD_PHASE_LAYER_FILTER = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterTable_AsObjectVsBroadPhaseLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_GET_NUM_BROAD_PHASE_LAYERS = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterTable_GetNumBroadPhaseLayers", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ObjectVsBroadPhaseLayerFilterTable(
	    BroadPhaseLayerInterface inBroadPhaseLayerInterface,
	    int inNumBroadPhaseLayers,
	    ObjectLayerPairFilter inObjectLayerPairFilter,
	    int inNumObjectLayers
	) {
	    this(
	        Arena.ofAuto(),
	        inBroadPhaseLayerInterface,
	        inNumBroadPhaseLayers,
	        inObjectLayerPairFilter,
	        inNumObjectLayers
	    );
	}
	
	/// Typed method of [#create].
	public ObjectVsBroadPhaseLayerFilterTable(
		Arena arena,
		BroadPhaseLayerInterface inBroadPhaseLayerInterface,
		int inNumBroadPhaseLayers,
		ObjectLayerPairFilter inObjectLayerPairFilter,
		int inNumObjectLayers
	) {
		MemorySegment segment = create(
			inBroadPhaseLayerInterface.memorySegment(),
			inNumBroadPhaseLayers,
			inObjectLayerPairFilter.memorySegment(),
			inNumObjectLayers
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asObjectVsBroadPhaseLayerFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ObjectVsBroadPhaseLayerFilterTable(MemorySegment segment) {
		this.segment = segment;
		super(asObjectVsBroadPhaseLayerFilter(segment));
	}

    /// ```
    /// Construct the table
    /// @param inBroadPhaseLayerInterface The broad phase layer interface that maps object layers to broad phase layers
    /// @param inNumBroadPhaseLayers Number of broad phase layers
    /// @param inObjectLayerPairFilter The object layer pair filter that determines which object layers can collide
    /// @param inNumObjectLayers Number of object layers
    /// ```
    public static MemorySegment create(
    	MemorySegment inBroadPhaseLayerInterface,
    	int inNumBroadPhaseLayers,
    	MemorySegment inObjectLayerPairFilter,
    	int inNumObjectLayers
    ) {
    	MethodHandle method = JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBroadPhaseLayerInterface,
    			inNumBroadPhaseLayers,
    			inObjectLayerPairFilter,
    			inNumObjectLayers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asObjectVsBroadPhaseLayerFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_AS_OBJECT_VS_BROAD_PHASE_LAYER_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the total number of broadphase layers
    /// ```
    public static int getNumBroadPhaseLayers(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_TABLE_GET_NUM_BROAD_PHASE_LAYERS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBroadPhaseLayers].
    public final int getNumBroadPhaseLayers() {
    	return getNumBroadPhaseLayers(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}