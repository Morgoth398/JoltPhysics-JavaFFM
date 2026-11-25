/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class TaperedCylinderShape extends ConvexShape {

	private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_AS_CONVEX_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_GET_TOP_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_GET_BOTTOM_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_GET_CONVEX_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_TAPERED_CYLINDER_SHAPE_GET_HALF_HEIGHT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TAPERED_CYLINDER_SHAPE_CREATE = downcallHandle("JPH_TaperedCylinderShape_Create", UNBOUNDED_ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_CREATE1 = downcallHandle("JPH_TaperedCylinderShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_AS_CONVEX_SHAPE = downcallHandle("JPH_TaperedCylinderShape_AsConvexShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_GET_TOP_RADIUS = downcallHandle("JPH_TaperedCylinderShape_GetTopRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_GET_BOTTOM_RADIUS = downcallHandle("JPH_TaperedCylinderShape_GetBottomRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_GET_CONVEX_RADIUS = downcallHandle("JPH_TaperedCylinderShape_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_TAPERED_CYLINDER_SHAPE_GET_HALF_HEIGHT = downcallHandle("JPH_TaperedCylinderShape_GetHalfHeight", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TaperedCylinderShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public TaperedCylinderShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asConvexShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public TaperedCylinderShape(
	    TaperedCylinderShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public TaperedCylinderShape(
		Arena arena,
		TaperedCylinderShapeSettings inSettings,
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

	public TaperedCylinderShape(MemorySegment segment) {
		this.segment = segment;
		super(asConvexShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_CREATE.get();
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
    	MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_CREATE1.get();
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
    public static MemorySegment asConvexShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_AS_CONVEX_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get top radius of the tapered cylinder
    /// ```
    public static float getTopRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_GET_TOP_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTopRadius].
    public final float getTopRadius() {
    	return getTopRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Get bottom radius of the tapered cylinder
    /// ```
    public static float getBottomRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_GET_BOTTOM_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBottomRadius].
    public final float getBottomRadius() {
    	return getBottomRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Get convex radius of the tapered cylinder
    /// ```
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_GET_CONVEX_RADIUS.get();
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
    
    /// ```
    /// Get half height of the tapered cylinder
    /// ```
    public static float getHalfHeight(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TAPERED_CYLINDER_SHAPE_GET_HALF_HEIGHT.get();
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
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}