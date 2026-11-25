/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.Color;
import volucris.bindings.jolt.math.Float2;
import volucris.bindings.jolt.math.Float3;

import static volucris.bindings.core.FFMUtils.*;

public class Vertex {

	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_GET_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_SET_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_GET_UV;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_SET_UV;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_GET_COLOR;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_VERTEX_SET_COLOR;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DEBUG_RENDERER_VERTEX_CREATE = downcallHandle("JPH_DebugRendererVertex_Create", UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_DESTROY = downcallHandleVoid("JPH_DebugRendererVertex_Destroy", UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_GET_POSITION = downcallHandleVoid("JPH_DebugRendererVertex_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_SET_POSITION = downcallHandleVoid("JPH_DebugRendererVertex_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_GET_NORMAL = downcallHandleVoid("JPH_DebugRendererVertex_GetNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_SET_NORMAL = downcallHandleVoid("JPH_DebugRendererVertex_SetNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_GET_UV = downcallHandleVoid("JPH_DebugRendererVertex_GetUV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_SET_UV = downcallHandleVoid("JPH_DebugRendererVertex_SetUV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_GET_COLOR = downcallHandleVoid("JPH_DebugRendererVertex_GetColor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_VERTEX_SET_COLOR = downcallHandleVoid("JPH_DebugRendererVertex_SetColor", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Vertex() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Vertex(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vertex(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	Float3 outResult
    ) {
    	getPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment mPosition
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	Float3 mPosition
    ) {
    	setPosition(
    		this.segment,
    		mPosition.memorySegment()
    	);
    }
    
    public static void getNormal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_GET_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormal].
    public final void getNormal(
    	Float3 outResult
    ) {
    	getNormal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setNormal(
    	MemorySegment self,
    	MemorySegment mNormal
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_SET_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormal].
    public final void setNormal(
    	Float3 mNormal
    ) {
    	setNormal(
    		this.segment,
    		mNormal.memorySegment()
    	);
    }
    
    public static void getUV(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_GET_UV.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getUV].
    public final void getUV(
    	Float2 outResult
    ) {
    	getUV(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setUV(
    	MemorySegment self,
    	MemorySegment mUV
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_SET_UV.get();
    	try {
    		 method.invokeExact(
    			self,
    			mUV
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setUV].
    public final void setUV(
    	Float2 mUV
    ) {
    	setUV(
    		this.segment,
    		mUV.memorySegment()
    	);
    }
    
    public static void getColor(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_GET_COLOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getColor].
    public final void getColor(
    	Color outResult
    ) {
    	getColor(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setColor(
    	MemorySegment self,
    	MemorySegment mColor
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_VERTEX_SET_COLOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mColor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setColor].
    public final void setColor(
    	Color mColor
    ) {
    	setColor(
    		this.segment,
    		mColor.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}