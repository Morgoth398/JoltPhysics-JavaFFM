/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static volucris.bindings.core.FFMUtils.*;

public final class GetTrianglesContext {

	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_TRIANGLES_CONTEXT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_GET_TRIANGLES_CONTEXT_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SHAPE_GET_TRIANGLES_CONTEXT_CREATE = downcallHandle("JPH_ShapeGetTrianglesContext_Create", UNBOUNDED_ADDRESS);
		JPH_SHAPE_GET_TRIANGLES_CONTEXT_DESTROY = downcallHandleVoid("JPH_ShapeGetTrianglesContext_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public GetTrianglesContext() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public GetTrianglesContext(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public GetTrianglesContext(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SHAPE_GET_TRIANGLES_CONTEXT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_GET_TRIANGLES_CONTEXT_DESTROY.get();
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