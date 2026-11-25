/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public class DebugRendererSimple extends DebugRenderer {

	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_SIMPLE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_SIMPLE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_SIMPLE_SET_CAMERA_POS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DEBUG_RENDERER_SIMPLE_CREATE = downcallHandle("JPH_DebugRendererSimple_Create", UNBOUNDED_ADDRESS, DebugRendererSimpleFunctions.LAYOUT);
		JPH_DEBUG_RENDERER_SIMPLE_DESTROY = downcallHandleVoid("JPH_DebugRendererSimple_Destroy", UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_SIMPLE_SET_CAMERA_POS = downcallHandleVoid("JPH_DebugRendererSimple_SetCameraPos", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public DebugRendererSimple(
	    DebugRendererSimpleFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public DebugRendererSimple(
		Arena arena,
		DebugRendererSimpleFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(segment);
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public DebugRendererSimple(MemorySegment segment) {
		this.segment = segment;
		super((segment));
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_SIMPLE_CREATE.get();
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
    	MethodHandle method = JPH_DEBUG_RENDERER_SIMPLE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Should be called every frame by the application to provide the camera position.
    /// This is used to determine the correct LOD for rendering.
    /// ```
    public static void setCameraPos(
    	MemorySegment self,
    	MemorySegment inCameraPos
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_SIMPLE_SET_CAMERA_POS.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCameraPos
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCameraPos].
    public final void setCameraPos(
    	Vec3 inCameraPos
    ) {
    	setCameraPos(
    		this.segment,
    		inCameraPos.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}