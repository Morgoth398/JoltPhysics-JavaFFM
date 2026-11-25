/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.PhysicsMaterial;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CylinderShape extends ConvexShape {

	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_AS_CONVEX_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_GET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CYLINDER_SHAPE_GET_CONVEX_RADIUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CYLINDER_SHAPE_CREATE = downcallHandle("JPH_CylinderShape_Create", UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_CREATE1 = downcallHandle("JPH_CylinderShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_CREATE2 = downcallHandle("JPH_CylinderShape_Create2", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_AS_CONVEX_SHAPE = downcallHandle("JPH_CylinderShape_AsConvexShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT = downcallHandle("JPH_CylinderShape_GetHalfHeight", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_GET_RADIUS = downcallHandle("JPH_CylinderShape_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CYLINDER_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_CylinderShape_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CylinderShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CylinderShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CylinderShape(
	    CylinderShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public CylinderShape(
		Arena arena,
		CylinderShapeSettings inSettings,
		ShapeResult outResult
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			outResult.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CylinderShape(
	    float inHalfHeight,
	    float inRadius,
	    float inConvexRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inHalfHeight,
	        inRadius,
	        inConvexRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create2].
	public CylinderShape(
		Arena arena,
		float inHalfHeight,
		float inRadius,
		float inConvexRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create2(
			inHalfHeight,
			inRadius,
			inConvexRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CylinderShape(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CYLINDER_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inSettings,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_CREATE1.get();
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
    /// Create a shape centered around the origin with one top at (0, -inHalfHeight, 0) and the other at (0, inHalfHeight, 0) and radius inRadius.
    /// (internally the convex radius will be subtracted from the cylinder the total cylinder will not grow with the convex radius, but the edges of the cylinder will be rounded a bit).
    /// ```
    public static MemorySegment create2(
    	float inHalfHeight,
    	float inRadius,
    	float inConvexRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inHalfHeight,
    			inRadius,
    			inConvexRadius,
    			inMaterial
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asConvexShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_AS_CONVEX_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get half height of cylinder
    /// ```
    public static float getHalfHeight(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_GET_HALF_HEIGHT.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfHeight].
    public final float getHalfHeight() {
    	return getHalfHeight(
    		this.segment
    	);
    }
    
    /// ```
    /// Get radius of cylinder
    /// ```
    public static float getRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_GET_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRadius].
    public final float getRadius() {
    	return getRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the convex radius of this cylinder
    /// ```
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CYLINDER_SHAPE_GET_CONVEX_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConvexRadius].
    public final float getConvexRadius() {
    	return getConvexRadius(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}