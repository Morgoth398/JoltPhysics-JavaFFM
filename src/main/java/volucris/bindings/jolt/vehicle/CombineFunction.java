/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class CombineFunction {

	private static final LazyConstant<MethodHandle> JPH_COMBINE_FUNCTION_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COMBINE_FUNCTION_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COMBINE_FUNCTION_CREATE = downcallHandle("JPH_CombineFunction_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COMBINE_FUNCTION_DESTROY = downcallHandleVoid("JPH_CombineFunction_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CombineFunction(
	    CombineFunctionCallback callback
	) {
	    this(
	        Arena.ofAuto(),
	        callback
	    );
	}
	
	/// Typed method of [#create].
	public CombineFunction(
		Arena arena,
		CombineFunctionCallback callback
	) {
		MemorySegment segment = create(
			callback.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CombineFunction(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment callback
    ) {
    	MethodHandle method = JPH_COMBINE_FUNCTION_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			callback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COMBINE_FUNCTION_DESTROY.get();
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