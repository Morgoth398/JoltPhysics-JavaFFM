/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SubShapeID {

	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_ID_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_ID_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_ID_GET_MAX_BITS;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_ID_POP_ID;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_ID_GET_VALUE;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_ID_SET_VALUE;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_ID_IS_EMPTY;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SUB_SHAPE_ID_CREATE = downcallHandle("JPH_SubShapeID_Create", UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_ID_DESTROY = downcallHandleVoid("JPH_SubShapeID_Destroy", UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_ID_GET_MAX_BITS = downcallHandle("JPH_SubShapeID_GetMaxBits", JAVA_INT);
		JPH_SUB_SHAPE_ID_POP_ID = downcallHandle("JPH_SubShapeID_PopID", JAVA_BYTE, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_ID_GET_VALUE = downcallHandle("JPH_SubShapeID_GetValue", JAVA_BYTE, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_ID_SET_VALUE = downcallHandleVoid("JPH_SubShapeID_SetValue", UNBOUNDED_ADDRESS, JAVA_BYTE);
		JPH_SUB_SHAPE_ID_IS_EMPTY = downcallHandle("JPH_SubShapeID_IsEmpty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SubShapeID() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SubShapeID(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SubShapeID(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SUB_SHAPE_ID_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_ID_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// How many bits we can store in this ID
    /// ```
    public static int getMaxBits() {
    	MethodHandle method = JPH_SUB_SHAPE_ID_GET_MAX_BITS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get the next id in the chain of ids (pops parents before children)
    /// ```
    public static byte popID(
    	MemorySegment self,
    	int inBits,
    	MemorySegment outRemainder
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_ID_POP_ID.get();
    	try {
    		return (byte) method.invokeExact(
    			self,
    			inBits,
    			outRemainder
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#popID].
    public final byte popID(
    	int inBits,
    	SubShapeID outRemainder
    ) {
    	return popID(
    		this.segment,
    		inBits,
    		outRemainder.memorySegment()
    	);
    }
    
    /// ```
    /// Get the value of the path to the sub shape ID
    /// ```
    public static byte getValue(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_ID_GET_VALUE.get();
    	try {
    		return (byte) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getValue].
    public final byte getValue() {
    	return getValue(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the value of the sub shape ID (use with care!)
    /// ```
    public static void setValue(
    	MemorySegment self,
    	byte inValue
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_ID_SET_VALUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setValue].
    public final void setValue(
    	byte inValue
    ) {
    	setValue(
    		this.segment,
    		inValue
    	);
    }
    
    /// ```
    /// Check if there is any bits of subshape ID left.
    /// Note that this is not a 100% guarantee as the subshape ID could consist of all 1 bits. Use for asserts only.
    /// ```
    public static boolean isEmpty(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_ID_IS_EMPTY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#isEmpty].
    public final boolean isEmpty() {
    	return isEmpty(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}