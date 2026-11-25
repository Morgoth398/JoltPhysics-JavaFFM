/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class OffsetCenterOfMassShape extends DecoratedShape {

	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_AS_DECORATED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE = downcallHandle("JPH_OffsetCenterOfMassShape_Create", UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE1 = downcallHandle("JPH_OffsetCenterOfMassShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE2 = downcallHandle("JPH_OffsetCenterOfMassShape_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_AS_DECORATED_SHAPE = downcallHandle("JPH_OffsetCenterOfMassShape_AsDecoratedShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET = downcallHandleVoid("JPH_OffsetCenterOfMassShape_GetOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public OffsetCenterOfMassShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public OffsetCenterOfMassShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public OffsetCenterOfMassShape(
	    OffsetCenterOfMassShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public OffsetCenterOfMassShape(
		Arena arena,
		OffsetCenterOfMassShapeSettings inSettings,
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

	public OffsetCenterOfMassShape(
	    Shape inShape,
	    Vec3 inOffset
	) {
	    this(
	        Arena.ofAuto(),
	        inShape,
	        inOffset
	    );
	}
	
	/// Typed method of [#create2].
	public OffsetCenterOfMassShape(
		Arena arena,
		Shape inShape,
		Vec3 inOffset
	) {
		MemorySegment segment = create2(
			inShape.memorySegment(),
			inOffset.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asDecoratedShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public OffsetCenterOfMassShape(MemorySegment segment) {
		this.segment = segment;
		super(asDecoratedShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE.get();
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
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE1.get();
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
    	MemorySegment inShape,
    	MemorySegment inOffset
    ) {
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_CREATE2.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inShape,
    			inOffset
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
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_AS_DECORATED_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Access the offset that is applied to the center of mass
    /// ```
    public static void getOffset(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_GET_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getOffset].
    public final void getOffset(
    	Vec3 outResult
    ) {
    	getOffset(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}