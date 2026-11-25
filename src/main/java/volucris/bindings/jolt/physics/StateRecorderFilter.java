/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.physics;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class StateRecorderFilter {

	private static final LazyConstant<MethodHandle> JPH_STATE_RECORDER_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_STATE_RECORDER_FILTER_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_STATE_RECORDER_FILTER_CREATE = downcallHandle("JPH_StateRecorderFilter_Create", UNBOUNDED_ADDRESS, StateRecorderFilterFunctions.LAYOUT);
		JPH_STATE_RECORDER_FILTER_DESTROY = downcallHandleVoid("JPH_StateRecorderFilter_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public StateRecorderFilter(
	    StateRecorderFilterFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public StateRecorderFilter(
		Arena arena,
		StateRecorderFilterFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public StateRecorderFilter(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_STATE_RECORDER_FILTER_CREATE.get();
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
    	MethodHandle method = JPH_STATE_RECORDER_FILTER_DESTROY.get();
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