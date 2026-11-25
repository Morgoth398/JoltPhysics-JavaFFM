/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.PhysicsMaterial;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BoxShape extends ConvexShape {

	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_AS_CONVEX_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_GET_HALF_EXTENT;
	private static final LazyConstant<MethodHandle> JPH_BOX_SHAPE_GET_CONVEX_RADIUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BOX_SHAPE_CREATE = downcallHandle("JPH_BoxShape_Create", UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_CREATE1 = downcallHandle("JPH_BoxShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_CREATE2 = downcallHandle("JPH_BoxShape_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_AS_CONVEX_SHAPE = downcallHandle("JPH_BoxShape_AsConvexShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_GET_HALF_EXTENT = downcallHandleVoid("JPH_BoxShape_GetHalfExtent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BOX_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_BoxShape_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BoxShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public BoxShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public BoxShape(
	    BoxShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public BoxShape(
		Arena arena,
		BoxShapeSettings inSettings,
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

	public BoxShape(
	    Vec3 inHalfExtent,
	    float inConvexRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inHalfExtent,
	        inConvexRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create2].
	public BoxShape(
		Arena arena,
		Vec3 inHalfExtent,
		float inConvexRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create2(
			inHalfExtent.memorySegment(),
			inConvexRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public BoxShape(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_BOX_SHAPE_CREATE.get();
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
    	MethodHandle method = JPH_BOX_SHAPE_CREATE1.get();
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
    /// Create a box with half edge length inHalfExtent and convex radius inConvexRadius.
    /// (internally the convex radius will be subtracted from the half extent so the total box will not grow with the convex radius).
    /// ```
    public static MemorySegment create2(
    	MemorySegment inHalfExtent,
    	float inConvexRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_BOX_SHAPE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inHalfExtent,
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
    	MethodHandle method = JPH_BOX_SHAPE_AS_CONVEX_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get half extent of box
    /// ```
    public static void getHalfExtent(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BOX_SHAPE_GET_HALF_EXTENT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfExtent].
    public final void getHalfExtent(
    	Vec3 outResult
    ) {
    	getHalfExtent(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the convex radius of this box
    /// ```
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BOX_SHAPE_GET_CONVEX_RADIUS.get();
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