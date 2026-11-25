/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerInterfaceMask;

import static volucris.bindings.core.FFMUtils.*;

public final class ObjectVsBroadPhaseLayerFilterMask extends ObjectVsBroadPhaseLayerFilter {

	private static final LazyConstant<MethodHandle> JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_CREATE;
	private static final LazyConstant<MethodHandle> JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_AS_OBJECT_VS_BROAD_PHASE_LAYER_FILTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_CREATE = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterMask_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_AS_OBJECT_VS_BROAD_PHASE_LAYER_FILTER = downcallHandle("JPH_ObjectVsBroadPhaseLayerFilterMask_AsObjectVsBroadPhaseLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ObjectVsBroadPhaseLayerFilterMask(
	    BroadPhaseLayerInterfaceMask inBroadPhaseLayerInterface
	) {
	    this(
	        Arena.ofAuto(),
	        inBroadPhaseLayerInterface
	    );
	}
	
	/// Typed method of [#create].
	public ObjectVsBroadPhaseLayerFilterMask(
		Arena arena,
		BroadPhaseLayerInterfaceMask inBroadPhaseLayerInterface
	) {
		MemorySegment segment = create(
			inBroadPhaseLayerInterface.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asObjectVsBroadPhaseLayerFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ObjectVsBroadPhaseLayerFilterMask(MemorySegment segment) {
		this.segment = segment;
		super(asObjectVsBroadPhaseLayerFilter(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inBroadPhaseLayerInterface
    ) {
    	MethodHandle method = JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBroadPhaseLayerInterface
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
    	MethodHandle method = JPH_OBJECT_VS_BROAD_PHASE_LAYER_FILTER_MASK_AS_OBJECT_VS_BROAD_PHASE_LAYER_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}