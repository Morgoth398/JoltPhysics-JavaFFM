/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.Color;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public class Triangle {

	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_TRIANGLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_TRIANGLE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_TRIANGLE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_TRIANGLE_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DEBUG_RENDERER_TRIANGLE_CREATE = downcallHandle("JPH_DebugRendererTriangle_Create", UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_TRIANGLE_CREATE1 = downcallHandle("JPH_DebugRendererTriangle_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_TRIANGLE_CREATE2 = downcallHandle("JPH_DebugRendererTriangle_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_TRIANGLE_DESTROY = downcallHandleVoid("JPH_DebugRendererTriangle_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Triangle() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Triangle(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Triangle(
	    Vec3 inV1,
	    Vec3 inV2,
	    Vec3 inV3,
	    Color inColor
	) {
	    this(
	        Arena.ofAuto(),
	        inV1,
	        inV2,
	        inV3,
	        inColor
	    );
	}
	
	/// Typed method of [#create1].
	public Triangle(
		Arena arena,
		Vec3 inV1,
		Vec3 inV2,
		Vec3 inV3,
		Color inColor
	) {
		MemorySegment segment = create1(
			inV1.memorySegment(),
			inV2.memorySegment(),
			inV3.memorySegment(),
			inColor.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Triangle(
	    Vec3 inV1,
	    Vec3 inV2,
	    Vec3 inV3,
	    Color inColor,
	    Vec3 inUVOrigin,
	    Vec3 inUVDirection
	) {
	    this(
	        Arena.ofAuto(),
	        inV1,
	        inV2,
	        inV3,
	        inColor,
	        inUVOrigin,
	        inUVDirection
	    );
	}
	
	/// Typed method of [#create2].
	public Triangle(
		Arena arena,
		Vec3 inV1,
		Vec3 inV2,
		Vec3 inV3,
		Color inColor,
		Vec3 inUVOrigin,
		Vec3 inUVDirection
	) {
		MemorySegment segment = create2(
			inV1.memorySegment(),
			inV2.memorySegment(),
			inV3.memorySegment(),
			inColor.memorySegment(),
			inUVOrigin.memorySegment(),
			inUVDirection.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Triangle(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_DEBUG_RENDERER_TRIANGLE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3,
    	MemorySegment inColor
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_TRIANGLE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV1,
    			inV2,
    			inV3,
    			inColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3,
    	MemorySegment inColor,
    	MemorySegment inUVOrigin,
    	MemorySegment inUVDirection
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_TRIANGLE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV1,
    			inV2,
    			inV3,
    			inColor,
    			inUVOrigin,
    			inUVDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_TRIANGLE_DESTROY.get();
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