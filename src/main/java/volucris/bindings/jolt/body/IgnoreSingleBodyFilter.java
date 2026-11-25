/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class IgnoreSingleBodyFilter extends BodyFilter {

	private static final LazyConstant<MethodHandle> JPH_IGNORE_SINGLE_BODY_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_IGNORE_SINGLE_BODY_FILTER_AS_BODY_FILTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_IGNORE_SINGLE_BODY_FILTER_CREATE = downcallHandle("JPH_IgnoreSingleBodyFilter_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_IGNORE_SINGLE_BODY_FILTER_AS_BODY_FILTER = downcallHandle("JPH_IgnoreSingleBodyFilter_AsBodyFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public IgnoreSingleBodyFilter(
	    BodyID inBodyID
	) {
	    this(
	        Arena.ofAuto(),
	        inBodyID
	    );
	}
	
	/// Typed method of [#create].
	public IgnoreSingleBodyFilter(
		Arena arena,
		BodyID inBodyID
	) {
		MemorySegment segment = create(
			inBodyID.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBodyFilter(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public IgnoreSingleBodyFilter(MemorySegment segment) {
		this.segment = segment;
		super(asBodyFilter(segment));
	}

    /// ```
    /// Constructor, pass the body you want to ignore
    /// ```
    public static MemorySegment create(
    	MemorySegment inBodyID
    ) {
    	MethodHandle method = JPH_IGNORE_SINGLE_BODY_FILTER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBodyID
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
    	MethodHandle method = JPH_IGNORE_SINGLE_BODY_FILTER_AS_BODY_FILTER.get();
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