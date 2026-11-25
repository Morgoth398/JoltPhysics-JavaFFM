/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.TempAllocator;

import static volucris.bindings.core.FFMUtils.*;

public final class StaticCompoundShape extends CompoundShape {

	private static final LazyConstant<MethodHandle> JPH_STATIC_COMPOUND_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_STATIC_COMPOUND_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_STATIC_COMPOUND_SHAPE_AS_COMPOUND_SHAPE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_STATIC_COMPOUND_SHAPE_CREATE = downcallHandle("JPH_StaticCompoundShape_Create", UNBOUNDED_ADDRESS);
		JPH_STATIC_COMPOUND_SHAPE_CREATE1 = downcallHandle("JPH_StaticCompoundShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_STATIC_COMPOUND_SHAPE_AS_COMPOUND_SHAPE = downcallHandle("JPH_StaticCompoundShape_AsCompoundShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public StaticCompoundShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public StaticCompoundShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCompoundShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public StaticCompoundShape(
	    StaticCompoundShapeSettings inSettings,
	    TempAllocator inTempAllocator,
	    ShapeResult outResult
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings,
	        inTempAllocator,
	        outResult
	    );
	}
	
	/// Typed method of [#create1].
	public StaticCompoundShape(
		Arena arena,
		StaticCompoundShapeSettings inSettings,
		TempAllocator inTempAllocator,
		ShapeResult outResult
	) {
		MemorySegment segment = create1(
			inSettings.memorySegment(),
			inTempAllocator.memorySegment(),
			outResult.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCompoundShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public StaticCompoundShape(MemorySegment segment) {
		this.segment = segment;
		super(asCompoundShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inSettings,
    	MemorySegment inTempAllocator,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings,
    			inTempAllocator,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCompoundShape(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_STATIC_COMPOUND_SHAPE_AS_COMPOUND_SHAPE.get();
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