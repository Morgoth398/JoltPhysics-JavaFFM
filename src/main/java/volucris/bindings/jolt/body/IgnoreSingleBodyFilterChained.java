/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class IgnoreSingleBodyFilterChained extends BodyFilter {

	private static final LazyConstant<MethodHandle> JPH_IGNORE_SINGLE_BODY_FILTER_CHAINED_CREATE;
	private static final LazyConstant<MethodHandle> JPH_IGNORE_SINGLE_BODY_FILTER_CHAINED_AS_BODY_FILTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_IGNORE_SINGLE_BODY_FILTER_CHAINED_CREATE = downcallHandle("JPH_IgnoreSingleBodyFilterChained_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_IGNORE_SINGLE_BODY_FILTER_CHAINED_AS_BODY_FILTER = downcallHandle("JPH_IgnoreSingleBodyFilterChained_AsBodyFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public IgnoreSingleBodyFilterChained(
	    BodyID inBodyID,
	    BodyFilter inFilter
	) {
	    this(
	        Arena.ofAuto(),
	        inBodyID,
	        inFilter
	    );
	}
	
	/// Typed method of [#create].
	public IgnoreSingleBodyFilterChained(
		Arena arena,
		BodyID inBodyID,
		BodyFilter inFilter
	) {
		MemorySegment segment = create(
			inBodyID.memorySegment(),
			inFilter.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBodyFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public IgnoreSingleBodyFilterChained(MemorySegment segment) {
		this.segment = segment;
		super(asBodyFilter(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inBodyID,
    	MemorySegment inFilter
    ) {
    	MethodHandle method = JPH_IGNORE_SINGLE_BODY_FILTER_CHAINED_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBodyID,
    			inFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asBodyFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_IGNORE_SINGLE_BODY_FILTER_CHAINED_AS_BODY_FILTER.get();
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