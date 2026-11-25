/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class BroadPhaseLayerInterfaceTable extends BroadPhaseLayerInterface {

	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_AS_BROAD_PHASE_LAYER_INTERFACE;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PHASE_LAYER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE = downcallHandle("JPH_BroadPhaseLayerInterfaceTable_Create", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_AS_BROAD_PHASE_LAYER_INTERFACE = downcallHandle("JPH_BroadPhaseLayerInterfaceTable_AsBroadPhaseLayerInterface", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PHASE_LAYER = downcallHandleVoid("JPH_BroadPhaseLayerInterfaceTable_MapObjectToBroadPhaseLayer", UNBOUNDED_ADDRESS, JAVA_SHORT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BroadPhaseLayerInterfaceTable(
	    int inNumObjectLayers,
	    int inNumBroadPhaseLayers
	) {
	    this(
	        Arena.ofAuto(),
	        inNumObjectLayers,
	        inNumBroadPhaseLayers
	    );
	}
	
	/// Typed method of [#create].
	public BroadPhaseLayerInterfaceTable(
		Arena arena,
		int inNumObjectLayers,
		int inNumBroadPhaseLayers
	) {
		MemorySegment segment = create(
			inNumObjectLayers,
			inNumBroadPhaseLayers
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBroadPhaseLayerInterface(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public BroadPhaseLayerInterfaceTable(MemorySegment segment) {
		this.segment = segment;
		super(asBroadPhaseLayerInterface(segment));
	}

    public static MemorySegment create(
    	int inNumObjectLayers,
    	int inNumBroadPhaseLayers
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inNumObjectLayers,
    			inNumBroadPhaseLayers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asBroadPhaseLayerInterface(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_AS_BROAD_PHASE_LAYER_INTERFACE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void mapObjectToBroadPhaseLayer(
    	MemorySegment self,
    	short inObjectLayer,
    	MemorySegment inBroadPhaseLayer
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_LAYER_INTERFACE_TABLE_MAP_OBJECT_TO_BROAD_PHASE_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inObjectLayer,
    			inBroadPhaseLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#mapObjectToBroadPhaseLayer].
    public final void mapObjectToBroadPhaseLayer(
    	short inObjectLayer,
    	BroadPhaseLayer inBroadPhaseLayer
    ) {
    	mapObjectToBroadPhaseLayer(
    		this.segment,
    		inObjectLayer,
    		inBroadPhaseLayer.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}