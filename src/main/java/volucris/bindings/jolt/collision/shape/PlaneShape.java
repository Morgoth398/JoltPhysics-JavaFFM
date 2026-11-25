/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.geometry.Plane;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class PlaneShape extends Shape {

	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_AS_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_GET_PLANE;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_GET_HALF_EXTENT;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_SET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_PLANE_SHAPE_GET_MATERIAL1;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_PLANE_SHAPE_CREATE = downcallHandle("JPH_PlaneShape_Create", UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_CREATE1 = downcallHandle("JPH_PlaneShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_PLANE_SHAPE_CREATE2 = downcallHandle("JPH_PlaneShape_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_AS_SHAPE = downcallHandle("JPH_PlaneShape_AsShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_GET_PLANE = downcallHandle("JPH_PlaneShape_GetPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_GET_HALF_EXTENT = downcallHandle("JPH_PlaneShape_GetHalfExtent", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_SET_MATERIAL = downcallHandleVoid("JPH_PlaneShape_SetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_PLANE_SHAPE_GET_MATERIAL1 = downcallHandle("JPH_PlaneShape_GetMaterial1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PlaneShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PlaneShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PlaneShape(
	    Plane inPlane,
	    PhysicsMaterial inMaterial,
	    float inHalfExtent
	) {
	    this(
	        Arena.ofAuto(),
	        inPlane,
	        inMaterial,
	        inHalfExtent
	    );
	}
	
	/// Typed method of [#create1].
	public PlaneShape(
		Arena arena,
		Plane inPlane,
		PhysicsMaterial inMaterial,
		float inHalfExtent
	) {
		MemorySegment segment = create1(
			inPlane.memorySegment(),
			inMaterial.memorySegment(),
			inHalfExtent
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PlaneShape(
	    PlaneShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create2].
	public PlaneShape(
		Arena arena,
		PlaneShapeSettings inSettings,
		ShapeResult outResult
	) {
		MemorySegment segment = create2(
			inSettings.memorySegment(),
			outResult.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public PlaneShape(MemorySegment segment) {
		this.segment = segment;
		super(asShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_PLANE_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inPlane,
    	MemorySegment inMaterial,
    	float inHalfExtent
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inPlane,
    			inMaterial,
    			inHalfExtent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inSettings,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_AS_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the plane
    /// ```
    public static MemorySegment getPlane(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_GET_PLANE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPlane].
    public final @Nullable Plane getPlane() {
    	MemorySegment segment = getPlane(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new Plane(segment);
    }
    
    /// ```
    /// Get the half-extent of the bounding box of the plane
    /// ```
    public static float getHalfExtent(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_GET_HALF_EXTENT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfExtent].
    public final float getHalfExtent() {
    	return getHalfExtent(
    		this.segment
    	);
    }
    
    /// ```
    /// Material of the shape
    /// ```
    public static void setMaterial(
    	MemorySegment self,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_SET_MATERIAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaterial].
    public final void setMaterial(
    	PhysicsMaterial inMaterial
    ) {
    	setMaterial(
    		this.segment,
    		inMaterial.memorySegment()
    	);
    }
    
    public static MemorySegment getMaterial1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_PLANE_SHAPE_GET_MATERIAL1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial1].
    public final @Nullable PhysicsMaterial getMaterial1() {
    	MemorySegment segment = getMaterial1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterial(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}