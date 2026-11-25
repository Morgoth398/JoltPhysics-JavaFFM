/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public class ShapeFilter {

	private static final LazyConstant<MethodHandle> JPH_SHAPE_FILTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_FILTER_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SHAPE_FILTER_CREATE = downcallHandle("JPH_ShapeFilter_Create", UNBOUNDED_ADDRESS, ShapeFilterFunctions.LAYOUT);
		JPH_SHAPE_FILTER_DESTROY = downcallHandleVoid("JPH_ShapeFilter_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ShapeFilter(
	    ShapeFilterFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public ShapeFilter(
		Arena arena,
		ShapeFilterFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ShapeFilter(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_SHAPE_FILTER_CREATE.get();
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
    	MethodHandle method = JPH_SHAPE_FILTER_DESTROY.get();
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