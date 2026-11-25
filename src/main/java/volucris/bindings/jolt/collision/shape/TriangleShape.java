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

public final class TriangleShape extends ConvexShape {

	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_AS_CONVEX_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_GET_VERTEX1;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_GET_VERTEX2;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_GET_VERTEX3;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TRIANGLE_SHAPE_CREATE = downcallHandle("JPH_TriangleShape_Create", UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_CREATE1 = downcallHandle("JPH_TriangleShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_CREATE2 = downcallHandle("JPH_TriangleShape_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_AS_CONVEX_SHAPE = downcallHandle("JPH_TriangleShape_AsConvexShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_GET_VERTEX1 = downcallHandleVoid("JPH_TriangleShape_GetVertex1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_GET_VERTEX2 = downcallHandleVoid("JPH_TriangleShape_GetVertex2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_GET_VERTEX3 = downcallHandleVoid("JPH_TriangleShape_GetVertex3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_TriangleShape_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TriangleShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public TriangleShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TriangleShape(
	    TriangleShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public TriangleShape(
		Arena arena,
		TriangleShapeSettings inSettings,
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

	public TriangleShape(
	    Vec3 inV1,
	    Vec3 inV2,
	    Vec3 inV3,
	    float inConvexRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inV1,
	        inV2,
	        inV3,
	        inConvexRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create2].
	public TriangleShape(
		Arena arena,
		Vec3 inV1,
		Vec3 inV2,
		Vec3 inV3,
		float inConvexRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create2(
			inV1.memorySegment(),
			inV2.memorySegment(),
			inV3.memorySegment(),
			inConvexRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TriangleShape(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_CREATE.get();
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
    	MethodHandle method = JPH_TRIANGLE_SHAPE_CREATE1.get();
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
    /// Create a triangle with points (inV1, inV2, inV3) (counter clockwise) and convex radius inConvexRadius.
    /// Note that the convex radius is currently only used for shape vs shape collision, for all other purposes the triangle is infinitely thin.
    /// ```
    public static MemorySegment create2(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3,
    	float inConvexRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV1,
    			inV2,
    			inV3,
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
    	MethodHandle method = JPH_TRIANGLE_SHAPE_AS_CONVEX_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the vertices of the triangle
    /// ```
    public static void getVertex1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertex1].
    public final void getVertex1(
    	Vec3 outResult
    ) {
    	getVertex1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getVertex2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertex2].
    public final void getVertex2(
    	Vec3 outResult
    ) {
    	getVertex2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void getVertex3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_GET_VERTEX3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVertex3].
    public final void getVertex3(
    	Vec3 outResult
    ) {
    	getVertex3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Convex radius
    /// ```
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRIANGLE_SHAPE_GET_CONVEX_RADIUS.get();
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