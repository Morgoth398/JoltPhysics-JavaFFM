/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.renderer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.RefTargetVirtualRef;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Geometry extends GeometryRefTarget {

	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_CREATE;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_GET_LODS;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_SET_LODS;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_GET_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_SET_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_GET_LOD;
	private static final LazyConstant<MethodHandle> JPH_DEBUG_RENDERER_GEOMETRY_DESTROY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_DEBUG_RENDERER_GEOMETRY_CREATE = downcallHandle("JPH_DebugRendererGeometry_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_GEOMETRY_CREATE1 = downcallHandle("JPH_DebugRendererGeometry_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_GEOMETRY_AS_REF_TARGET = downcallHandle("JPH_DebugRendererGeometry_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_GEOMETRY_GET_LODS = downcallHandleVoid("JPH_DebugRendererGeometry_GetLODs", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_GEOMETRY_SET_LODS = downcallHandleVoid("JPH_DebugRendererGeometry_SetLODs", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_GEOMETRY_GET_BOUNDS = downcallHandleVoid("JPH_DebugRendererGeometry_GetBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_GEOMETRY_SET_BOUNDS = downcallHandleVoid("JPH_DebugRendererGeometry_SetBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_DEBUG_RENDERER_GEOMETRY_GET_LOD = downcallHandle("JPH_DebugRendererGeometry_GetLOD", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_DEBUG_RENDERER_GEOMETRY_DESTROY = downcallHandleVoid("JPH_DebugRendererGeometry_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Geometry(
	    AABox inBounds
	) {
	    this(
	        Arena.ofAuto(),
	        inBounds
	    );
	}
	
	/// Typed method of [#create].
	public Geometry(
		Arena arena,
		AABox inBounds
	) {
		MemorySegment segment = create(
			inBounds.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Geometry(
	    RefTargetVirtualRef inBatch,
	    AABox inBounds
	) {
	    this(
	        Arena.ofAuto(),
	        inBatch,
	        inBounds
	    );
	}
	
	/// Typed method of [#create1].
	public Geometry(
		Arena arena,
		RefTargetVirtualRef inBatch,
		AABox inBounds
	) {
		MemorySegment segment = create1(
			inBatch.memorySegment(),
			inBounds.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Geometry(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inBounds
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inBatch,
    	MemorySegment inBounds
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inBatch,
    			inBounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// All level of details for this mesh
    /// ```
    public static void getLODs(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_GET_LODS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLODs].
    public final void getLODs(
    	LODArray outResult
    ) {
    	getLODs(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// All level of details for this mesh
    /// ```
    public static void setLODs(
    	MemorySegment self,
    	MemorySegment mLODs
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_SET_LODS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLODs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLODs].
    public final void setLODs(
    	LODArray mLODs
    ) {
    	setLODs(
    		this.segment,
    		mLODs.memorySegment()
    	);
    }
    
    /// ```
    /// Bounding box that encapsulates all LODs
    /// ```
    public static void getBounds(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_GET_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBounds].
    public final void getBounds(
    	AABox outResult
    ) {
    	getBounds(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Bounding box that encapsulates all LODs
    /// ```
    public static void setBounds(
    	MemorySegment self,
    	MemorySegment mBounds
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_SET_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBounds].
    public final void setBounds(
    	AABox mBounds
    ) {
    	setBounds(
    		this.segment,
    		mBounds.memorySegment()
    	);
    }
    
    /// ```
    /// Determine which LOD to render
    /// @param inCameraPosition Current position of the camera
    /// @param inWorldSpaceBounds World space bounds for this geometry (transform mBounds by model space matrix)
    /// @param inLODScaleSq is the squared scale of the model matrix, it is multiplied with the LOD distances in inGeometry to calculate the real LOD distance (so a number > 1 will force a higher LOD).
    /// @return The selected LOD.
    /// ```
    public static MemorySegment getLOD(
    	MemorySegment self,
    	MemorySegment inCameraPosition,
    	MemorySegment inWorldSpaceBounds,
    	float inLODScaleSq
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_GET_LOD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inCameraPosition,
    			inWorldSpaceBounds,
    			inLODScaleSq
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLOD].
    public final @Nullable LOD getLOD(
    	Vec3 inCameraPosition,
    	AABox inWorldSpaceBounds,
    	float inLODScaleSq
    ) {
    	MemorySegment segment = getLOD(
    		this.segment,
    		inCameraPosition.memorySegment(),
    		inWorldSpaceBounds.memorySegment(),
    		inLODScaleSq
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new LOD(segment);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_DEBUG_RENDERER_GEOMETRY_DESTROY.get();
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