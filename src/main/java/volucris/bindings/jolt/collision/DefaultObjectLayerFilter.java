/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class DefaultObjectLayerFilter extends ObjectLayerFilter {

	private static final LazyConstant<MethodHandle> JPH_DEFAULT_OBJECT_LAYER_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DEFAULT_OBJECT_LAYER_FILTER_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_DEFAULT_OBJECT_LAYER_FILTER_AS_OBJECT_LAYER_FILTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DEFAULT_OBJECT_LAYER_FILTER_CREATE = downcallHandle("JPH_DefaultObjectLayerFilter_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_DEFAULT_OBJECT_LAYER_FILTER_CREATE1 = downcallHandle("JPH_DefaultObjectLayerFilter_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEFAULT_OBJECT_LAYER_FILTER_AS_OBJECT_LAYER_FILTER = downcallHandle("JPH_DefaultObjectLayerFilter_AsObjectLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DefaultObjectLayerFilter(
	    ObjectLayerPairFilter inObjectLayerPairFilter,
	    short inLayer
	) {
	    this(
	        Arena.ofAuto(),
	        inObjectLayerPairFilter,
	        inLayer
	    );
	}
	
	/// Typed method of [#create].
	public DefaultObjectLayerFilter(
		Arena arena,
		ObjectLayerPairFilter inObjectLayerPairFilter,
		short inLayer
	) {
		MemorySegment segment = create(
			inObjectLayerPairFilter.memorySegment(),
			inLayer
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asObjectLayerFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public DefaultObjectLayerFilter(
	    DefaultObjectLayerFilter inRHS
	) {
	    this(
	        Arena.ofAuto(),
	        inRHS
	    );
	}
	
	/// Typed method of [#create1].
	public DefaultObjectLayerFilter(
		Arena arena,
		DefaultObjectLayerFilter inRHS
	) {
		MemorySegment segment = create1(
			inRHS.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asObjectLayerFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public DefaultObjectLayerFilter(MemorySegment segment) {
		this.segment = segment;
		super(asObjectLayerFilter(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inObjectLayerPairFilter,
    	short inLayer
    ) {
    	MethodHandle method = JPH_DEFAULT_OBJECT_LAYER_FILTER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inObjectLayerPairFilter,
    			inLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Copy constructor
    /// ```
    public static MemorySegment create1(
    	MemorySegment inRHS
    ) {
    	MethodHandle method = JPH_DEFAULT_OBJECT_LAYER_FILTER_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inRHS
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
    	MethodHandle method = JPH_DEFAULT_OBJECT_LAYER_FILTER_AS_OBJECT_LAYER_FILTER.get();
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