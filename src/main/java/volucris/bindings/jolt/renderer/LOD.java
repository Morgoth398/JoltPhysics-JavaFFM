/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.RefTargetVirtualRef;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class LOD {

	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_LOD_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_LOD_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_LOD_GET_TRIANGLE_BATCH;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_LOD_SET_TRIANGLE_BATCH;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_LOD_GET_DISTANCE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_LOD_SET_DISTANCE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DEBUG_RENDERER_LOD_CREATE = downcallHandle("JPH_DebugRendererLOD_Create", UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_LOD_DESTROY = downcallHandleVoid("JPH_DebugRendererLOD_Destroy", UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_LOD_GET_TRIANGLE_BATCH = downcallHandleVoid("JPH_DebugRendererLOD_GetTriangleBatch", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_LOD_SET_TRIANGLE_BATCH = downcallHandleVoid("JPH_DebugRendererLOD_SetTriangleBatch", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_LOD_GET_DISTANCE = downcallHandle("JPH_DebugRendererLOD_GetDistance", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_LOD_SET_DISTANCE = downcallHandleVoid("JPH_DebugRendererLOD_SetDistance", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public LOD() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public LOD(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public LOD(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_DEBUG_RENDERER_LOD_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_LOD_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getTriangleBatch(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_LOD_GET_TRIANGLE_BATCH.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTriangleBatch].
    public final void getTriangleBatch(
    	RefTargetVirtualRef outResult
    ) {
    	getTriangleBatch(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setTriangleBatch(
    	MemorySegment self,
    	MemorySegment mTriangleBatch
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_LOD_SET_TRIANGLE_BATCH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTriangleBatch
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTriangleBatch].
    public final void setTriangleBatch(
    	RefTargetVirtualRef mTriangleBatch
    ) {
    	setTriangleBatch(
    		this.segment,
    		mTriangleBatch.memorySegment()
    	);
    }
    
    public static float getDistance(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_LOD_GET_DISTANCE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDistance].
    public final float getDistance() {
    	return getDistance(
    		this.segment
    	);
    }
    
    public static void setDistance(
    	MemorySegment self,
    	float mDistance
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_LOD_SET_DISTANCE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDistance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDistance].
    public final void setDistance(
    	float mDistance
    ) {
    	setDistance(
    		this.segment,
    		mDistance
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}