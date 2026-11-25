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

public final class CapsuleShape extends ConvexShape {

	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_AS_CONVEX_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_GET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CAPSULE_SHAPE_CREATE = downcallHandle("JPH_CapsuleShape_Create", UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_CREATE1 = downcallHandle("JPH_CapsuleShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_CREATE2 = downcallHandle("JPH_CapsuleShape_Create2", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_AS_CONVEX_SHAPE = downcallHandle("JPH_CapsuleShape_AsConvexShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_GET_RADIUS = downcallHandle("JPH_CapsuleShape_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER = downcallHandle("JPH_CapsuleShape_GetHalfHeightOfCylinder", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CapsuleShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CapsuleShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CapsuleShape(
	    CapsuleShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public CapsuleShape(
		Arena arena,
		CapsuleShapeSettings inSettings,
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

	public CapsuleShape(
	    float inHalfHeightOfCylinder,
	    float inRadius,
	    PhysicsMaterial inMaterial
	) {
	    this(
	        Arena.ofAuto(),
	        inHalfHeightOfCylinder,
	        inRadius,
	        inMaterial
	    );
	}
	
	/// Typed method of [#create2].
	public CapsuleShape(
		Arena arena,
		float inHalfHeightOfCylinder,
		float inRadius,
		PhysicsMaterial inMaterial
	) {
		MemorySegment segment = create2(
			inHalfHeightOfCylinder,
			inRadius,
			inMaterial.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public CapsuleShape(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_CAPSULE_SHAPE_CREATE.get();
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
    	MethodHandle method = JPH_CAPSULE_SHAPE_CREATE1.get();
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
    /// Create a capsule centered around the origin with one sphere cap at (0, -inHalfHeightOfCylinder, 0) and the other at (0, inHalfHeightOfCylinder, 0)
    /// ```
    public static MemorySegment create2(
    	float inHalfHeightOfCylinder,
    	float inRadius,
    	MemorySegment inMaterial
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inHalfHeightOfCylinder,
    			inRadius,
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
    	MethodHandle method = JPH_CAPSULE_SHAPE_AS_CONVEX_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Radius of the cylinder
    /// ```
    public static float getRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_GET_RADIUS.get();
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
    /// Get half of the height of the cylinder
    /// ```
    public static float getHalfHeightOfCylinder(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CAPSULE_SHAPE_GET_HALF_HEIGHT_OF_CYLINDER.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHalfHeightOfCylinder].
    public final float getHalfHeightOfCylinder() {
    	return getHalfHeightOfCylinder(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}