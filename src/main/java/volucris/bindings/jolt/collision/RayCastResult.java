/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static volucris.bindings.core.FFMUtils.*;

public final class RayCastResult extends BroadPhaseCastResult {

	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_RESULT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_RESULT_AS_BROAD_PHASE_CAST_RESULT;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_RESULT_GET_SUB_SHAPE_ID2;
	private static final LazyConstant<MethodHandle> JPH_RAY_CAST_RESULT_SET_SUB_SHAPE_ID2;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RAY_CAST_RESULT_CREATE = downcallHandle("JPH_RayCastResult_Create", UNBOUNDED_ADDRESS);
		JPH_RAY_CAST_RESULT_AS_BROAD_PHASE_CAST_RESULT = downcallHandle("JPH_RayCastResult_AsBroadPhaseCastResult", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAY_CAST_RESULT_GET_SUB_SHAPE_ID2 = downcallHandleVoid("JPH_RayCastResult_GetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAY_CAST_RESULT_SET_SUB_SHAPE_ID2 = downcallHandleVoid("JPH_RayCastResult_SetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RayCastResult() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RayCastResult(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asBroadPhaseCastResult(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public RayCastResult(MemorySegment segment) {
		this.segment = segment;
		super(asBroadPhaseCastResult(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_RAY_CAST_RESULT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asBroadPhaseCastResult(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAY_CAST_RESULT_AS_BROAD_PHASE_CAST_RESULT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Sub shape ID of shape that we collided against
    /// ```
    public static void getSubShapeID2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAY_CAST_RESULT_GET_SUB_SHAPE_ID2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeID2].
    public final void getSubShapeID2(
    	SubShapeID outResult
    ) {
    	getSubShapeID2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape ID of shape that we collided against
    /// ```
    public static void setSubShapeID2(
    	MemorySegment self,
    	MemorySegment mSubShapeID2
    ) {
    	MethodHandle method = JPH_RAY_CAST_RESULT_SET_SUB_SHAPE_ID2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSubShapeID2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSubShapeID2].
    public final void setSubShapeID2(
    	SubShapeID mSubShapeID2
    ) {
    	setSubShapeID2(
    		this.segment,
    		mSubShapeID2.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}