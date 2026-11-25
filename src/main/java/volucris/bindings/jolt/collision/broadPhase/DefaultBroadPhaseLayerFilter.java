/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.ObjectVsBroadPhaseLayerFilter;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DefaultBroadPhaseLayerFilter extends BroadPhaseLayerFilter {

	private static final LazyConstant<MethodHandle> JPH_DEFAULT_BROAD_PHASE_LAYER_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DEFAULT_BROAD_PHASE_LAYER_FILTER_AS_BROAD_PHASE_LAYER_FILTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DEFAULT_BROAD_PHASE_LAYER_FILTER_CREATE = downcallHandle("JPH_DefaultBroadPhaseLayerFilter_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_DEFAULT_BROAD_PHASE_LAYER_FILTER_AS_BROAD_PHASE_LAYER_FILTER = downcallHandle("JPH_DefaultBroadPhaseLayerFilter_AsBroadPhaseLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DefaultBroadPhaseLayerFilter(
	    ObjectVsBroadPhaseLayerFilter inObjectVsBroadPhaseLayerFilter,
	    short inLayer
	) {
	    this(
	        Arena.ofAuto(),
	        inObjectVsBroadPhaseLayerFilter,
	        inLayer
	    );
	}
	
	/// Typed method of [#create].
	public DefaultBroadPhaseLayerFilter(
		Arena arena,
		ObjectVsBroadPhaseLayerFilter inObjectVsBroadPhaseLayerFilter,
		short inLayer
	) {
		MemorySegment segment = create(
			inObjectVsBroadPhaseLayerFilter.memorySegment(),
			inLayer
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBroadPhaseLayerFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public DefaultBroadPhaseLayerFilter(MemorySegment segment) {
		this.segment = segment;
		super(asBroadPhaseLayerFilter(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inObjectVsBroadPhaseLayerFilter,
    	short inLayer
    ) {
    	MethodHandle method = JPH_DEFAULT_BROAD_PHASE_LAYER_FILTER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inObjectVsBroadPhaseLayerFilter,
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
    	MethodHandle method = JPH_DEFAULT_BROAD_PHASE_LAYER_FILTER_AS_BROAD_PHASE_LAYER_FILTER.get();
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