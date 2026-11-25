/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class VisitedShapes {

	private static final LazyConstant<MethodHandle> JPH_VISITED_SHAPES_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VISITED_SHAPES_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VISITED_SHAPES_CREATE = downcallHandle("JPH_VisitedShapes_Create", UNBOUNDED_ADDRESS);
		JPH_VISITED_SHAPES_DESTROY = downcallHandleVoid("JPH_VisitedShapes_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VisitedShapes() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VisitedShapes(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VisitedShapes(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VISITED_SHAPES_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VISITED_SHAPES_DESTROY.get();
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