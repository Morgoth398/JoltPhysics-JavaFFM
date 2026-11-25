/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SpecifiedObjectLayerFilter extends ObjectLayerFilter {

	private static final LazyConstant<MethodHandle> JPH_SPECIFIED_OBJECT_LAYER_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SPECIFIED_OBJECT_LAYER_FILTER_AS_OBJECT_LAYER_FILTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SPECIFIED_OBJECT_LAYER_FILTER_CREATE = downcallHandle("JPH_SpecifiedObjectLayerFilter_Create", UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_SPECIFIED_OBJECT_LAYER_FILTER_AS_OBJECT_LAYER_FILTER = downcallHandle("JPH_SpecifiedObjectLayerFilter_AsObjectLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SpecifiedObjectLayerFilter(
	    short inLayer
	) {
	    this(
	        Arena.ofAuto(),
	        inLayer
	    );
	}
	
	/// Typed method of [#create].
	public SpecifiedObjectLayerFilter(
		Arena arena,
		short inLayer
	) {
		MemorySegment segment = create(
			inLayer
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asObjectLayerFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SpecifiedObjectLayerFilter(MemorySegment segment) {
		this.segment = segment;
		super(asObjectLayerFilter(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	short inLayer
    ) {
    	MethodHandle method = JPH_SPECIFIED_OBJECT_LAYER_FILTER_CREATE.get();
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
    public static MemorySegment asObjectLayerFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SPECIFIED_OBJECT_LAYER_FILTER_AS_OBJECT_LAYER_FILTER.get();
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