/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class SpecifiedBroadPhaseLayerFilter extends BroadPhaseLayerFilter {

	private static final LazyConstant<MethodHandle> JPH_SPECIFIED_BROAD_PHASE_LAYER_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SPECIFIED_BROAD_PHASE_LAYER_FILTER_AS_BROAD_PHASE_LAYER_FILTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SPECIFIED_BROAD_PHASE_LAYER_FILTER_CREATE = downcallHandle("JPH_SpecifiedBroadPhaseLayerFilter_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SPECIFIED_BROAD_PHASE_LAYER_FILTER_AS_BROAD_PHASE_LAYER_FILTER = downcallHandle("JPH_SpecifiedBroadPhaseLayerFilter_AsBroadPhaseLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SpecifiedBroadPhaseLayerFilter(
	    BroadPhaseLayer inLayer
	) {
	    this(
	        Arena.ofAuto(),
	        inLayer
	    );
	}
	
	/// Typed method of [#create].
	public SpecifiedBroadPhaseLayerFilter(
		Arena arena,
		BroadPhaseLayer inLayer
	) {
		MemorySegment segment = create(
			inLayer.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBroadPhaseLayerFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SpecifiedBroadPhaseLayerFilter(MemorySegment segment) {
		this.segment = segment;
		super(asBroadPhaseLayerFilter(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inLayer
    ) {
    	MethodHandle method = JPH_SPECIFIED_BROAD_PHASE_LAYER_FILTER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asBroadPhaseLayerFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPECIFIED_BROAD_PHASE_LAYER_FILTER_AS_BROAD_PHASE_LAYER_FILTER.get();
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