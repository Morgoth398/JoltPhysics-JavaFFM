/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class ScaledShape extends DecoratedShape {

	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_AS_DECORATED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_SCALED_SHAPE_GET_SCALE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SCALED_SHAPE_CREATE = downcallHandle("JPH_ScaledShape_Create", UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_CREATE1 = downcallHandle("JPH_ScaledShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_CREATE2 = downcallHandle("JPH_ScaledShape_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_AS_DECORATED_SHAPE = downcallHandle("JPH_ScaledShape_AsDecoratedShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SCALED_SHAPE_GET_SCALE = downcallHandleVoid("JPH_ScaledShape_GetScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ScaledShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ScaledShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ScaledShape(
	    ScaledShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public ScaledShape(
		Arena arena,
		ScaledShapeSettings inSettings,
		ShapeResult outResult
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			outResult.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ScaledShape(
	    Shape inShape,
	    Vec3 inScale
	) {
	    this(
	        Arena.ofAuto(),
	        inShape,
	        inScale
	    );
	}
	
	/// Typed method of [#create2].
	public ScaledShape(
		Arena arena,
		Shape inShape,
		Vec3 inScale
	) {
		MemorySegment segment = create2(
			inShape.memorySegment(),
			inScale.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ScaledShape(MemorySegment segment) {
		this.segment = segment;
		super(asDecoratedShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SCALED_SHAPE_CREATE.get();
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
    	MethodHandle method = JPH_SCALED_SHAPE_CREATE1.get();
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
    /// Constructor that decorates another shape with a scale
    /// ```
    public static MemorySegment create2(
    	MemorySegment inShape,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_SCALED_SHAPE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inShape,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asDecoratedShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SCALED_SHAPE_AS_DECORATED_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the scale
    /// ```
    public static void getScale(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SCALED_SHAPE_GET_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getScale].
    public final void getScale(
    	Vec3 outResult
    ) {
    	getScale(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}