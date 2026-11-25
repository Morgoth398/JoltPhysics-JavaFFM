/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SoftBodyShape extends Shape {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHAPE_AS_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHAPE_GET_SUB_SHAPE_IDBITS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_SHAPE_GET_FACE_INDEX;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_SHAPE_CREATE = downcallHandle("JPH_SoftBodyShape_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHAPE_AS_SHAPE = downcallHandle("JPH_SoftBodyShape_AsShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHAPE_GET_SUB_SHAPE_IDBITS = downcallHandle("JPH_SoftBodyShape_GetSubShapeIDBits", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_SHAPE_GET_FACE_INDEX = downcallHandle("JPH_SoftBodyShape_GetFaceIndex", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SoftBodyShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SoftBodyShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asShape(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public SoftBodyShape(MemorySegment segment) {
		this.segment = segment;
		super(asShape(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
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
    	MethodHandle method = JPH_SOFT_BODY_SHAPE_AS_SHAPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Determine amount of bits needed to encode sub shape id
    /// ```
    public static int getSubShapeIDBits(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHAPE_GET_SUB_SHAPE_IDBITS.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeIDBits].
    public final int getSubShapeIDBits() {
    	return getSubShapeIDBits(
    		this.segment
    	);
    }
    
    /// ```
    /// Convert a sub shape ID back to a face index
    /// ```
    public static int getFaceIndex(
    	MemorySegment self,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_SOFT_BODY_SHAPE_GET_FACE_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFaceIndex].
    public final int getFaceIndex(
    	SubShapeID inSubShapeID
    ) {
    	return getFaceIndex(
    		this.segment,
    		inSubShapeID.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}