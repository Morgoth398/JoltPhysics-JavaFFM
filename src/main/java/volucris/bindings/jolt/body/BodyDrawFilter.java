/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.body;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public class BodyDrawFilter {

	private static final LazyConstant<MethodHandle> JPH_BODY_DRAW_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BODY_DRAW_FILTER_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BODY_DRAW_FILTER_CREATE = downcallHandle("JPH_BodyDrawFilter_Create", UNBOUNDED_ADDRESS, BodyDrawFilterFunctions.LAYOUT);
		JPH_BODY_DRAW_FILTER_DESTROY = downcallHandleVoid("JPH_BodyDrawFilter_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BodyDrawFilter(
	    BodyDrawFilterFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public BodyDrawFilter(
		Arena arena,
		BodyDrawFilterFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BodyDrawFilter(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_BODY_DRAW_FILTER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			functions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BODY_DRAW_FILTER_DESTROY.get();
    	try {
    		 method.invokeExact(
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