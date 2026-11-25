/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class EmptyShape extends Shape {

	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_CREATE2;
	private static final LazyConstant<MethodHandle> JPH_EMPTY_SHAPE_AS_SHAPE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_EMPTY_SHAPE_CREATE = downcallHandle("JPH_EmptyShape_Create", UNBOUNDED_ADDRESS);
		JPH_EMPTY_SHAPE_CREATE1 = downcallHandle("JPH_EmptyShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_EMPTY_SHAPE_CREATE2 = downcallHandle("JPH_EmptyShape_Create2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_EMPTY_SHAPE_AS_SHAPE = downcallHandle("JPH_EmptyShape_AsShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public EmptyShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public EmptyShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public EmptyShape(
	    Vec3 inCenterOfMass
	) {
	    this(
	        Arena.ofAuto(),
	        inCenterOfMass
	    );
	}
	
	/// Typed method of [#create1].
	public EmptyShape(
		Arena arena,
		Vec3 inCenterOfMass
	) {
		MemorySegment segment = create1(
			inCenterOfMass.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public EmptyShape(
	    EmptyShapeSettings inSettings,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        outResult
	    );
	}
	
	/// Typed method of [#create2].
	public EmptyShape(
		Arena arena,
		EmptyShapeSettings inSettings,
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

	public EmptyShape(MemorySegment segment) {
		this.segment = segment;
		super(asShape(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_EMPTY_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inCenterOfMass
    ) {
    	MethodHandle method = JPH_EMPTY_SHAPE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inCenterOfMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create2(
    	MemorySegment inSettings,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_EMPTY_SHAPE_CREATE2.get();
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
    	MethodHandle method = JPH_EMPTY_SHAPE_AS_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
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