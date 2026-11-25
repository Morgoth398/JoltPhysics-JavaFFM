/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class RotatedTranslatedShape extends DecoratedShape {

	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_AS_DECORATED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_ROTATED_TRANSLATED_SHAPE_TRANSFORM_SCALE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_ROTATED_TRANSLATED_SHAPE_CREATE = downcallHandle("JPH_RotatedTranslatedShape_Create", UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_CREATE1 = downcallHandle("JPH_RotatedTranslatedShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_CREATE2 = downcallHandle("JPH_RotatedTranslatedShape_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_AS_DECORATED_SHAPE = downcallHandle("JPH_RotatedTranslatedShape_AsDecoratedShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION = downcallHandleVoid("JPH_RotatedTranslatedShape_GetRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION = downcallHandleVoid("JPH_RotatedTranslatedShape_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_TRANSFORM_SCALE = downcallHandleVoid("JPH_RotatedTranslatedShape_TransformScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RotatedTranslatedShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RotatedTranslatedShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public RotatedTranslatedShape(
	    RotatedTranslatedShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public RotatedTranslatedShape(
		Arena arena,
		RotatedTranslatedShapeSettings inSettings,
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

	public RotatedTranslatedShape(
	    Vec3 inPosition,
	    Quat inRotation,
	    Shape inShape
	) {
	    this(
	        Arena.ofAuto(),
	        inPosition,
	        inRotation,
	        inShape
	    );
	}
	
	/// Typed method of [#create2].
	public RotatedTranslatedShape(
		Arena arena,
		Vec3 inPosition,
		Quat inRotation,
		Shape inShape
	) {
		MemorySegment segment = create2(
			inPosition.memorySegment(),
			inRotation.memorySegment(),
			inShape.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public RotatedTranslatedShape(MemorySegment segment) {
		this.segment = segment;
		super(asDecoratedShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_CREATE.get();
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
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inShape
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inPosition,
    			inRotation,
    			inShape
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
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_AS_DECORATED_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Access the rotation that is applied to the inner shape
    /// ```
    public static void getRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_GET_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotation].
    public final void getRotation(
    	Quat outResult
    ) {
    	getRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access the translation that has been applied to the inner shape
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_GET_POSITION.get();
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
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Transform the scale to the local space of the child shape
    /// ```
    public static void transformScale(
    	MemorySegment self,
    	MemorySegment inScale,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_TRANSFORM_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inScale,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#transformScale].
    public final void transformScale(
    	Vec3 inScale,
    	Vec3 outResult
    ) {
    	transformScale(
    		this.segment,
    		inScale.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}