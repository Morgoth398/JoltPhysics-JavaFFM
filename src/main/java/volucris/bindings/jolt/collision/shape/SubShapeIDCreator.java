/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class SubShapeIDCreator {

	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDCREATOR_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDCREATOR_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDCREATOR_PUSH_ID;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDCREATOR_GET_ID;
	private static final LazyConstant<MethodHandle> JPH_SUB_SHAPE_IDCREATOR_GET_NUM_BITS_WRITTEN;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SUB_SHAPE_IDCREATOR_CREATE = downcallHandle("JPH_SubShapeIDCreator_Create", UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDCREATOR_DESTROY = downcallHandleVoid("JPH_SubShapeIDCreator_Destroy", UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDCREATOR_PUSH_ID = downcallHandleVoid("JPH_SubShapeIDCreator_PushID", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDCREATOR_GET_ID = downcallHandle("JPH_SubShapeIDCreator_GetID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SUB_SHAPE_IDCREATOR_GET_NUM_BITS_WRITTEN = downcallHandle("JPH_SubShapeIDCreator_GetNumBitsWritten", JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public SubShapeIDCreator() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public SubShapeIDCreator(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public SubShapeIDCreator(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SUB_SHAPE_IDCREATOR_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDCREATOR_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Add a new id to the chain of id's and return it
    /// ```
    public static void pushID(
    	MemorySegment self,
    	int inValue,
    	int inBits,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDCREATOR_PUSH_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			inValue,
    			inBits,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#pushID].
    public final void pushID(
    	int inValue,
    	int inBits,
    	SubShapeIDCreator outResult
    ) {
    	pushID(
    		this.segment,
    		inValue,
    		inBits,
    		outResult.memorySegment()
    	);
    }
    
    public static MemorySegment getID(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDCREATOR_GET_ID.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getID].
    public final @Nullable SubShapeID getID() {
    	MemorySegment segment = getID(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new SubShapeID(segment);
    }
    
    /// ```
    /// Get the number of bits that have been written to the sub shape ID so far
    /// ```
    public static int getNumBitsWritten(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SUB_SHAPE_IDCREATOR_GET_NUM_BITS_WRITTEN.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNumBitsWritten].
    public final int getNumBitsWritten() {
    	return getNumBitsWritten(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}