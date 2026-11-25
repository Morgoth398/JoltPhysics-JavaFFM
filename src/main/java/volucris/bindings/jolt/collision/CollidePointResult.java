/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.SubShapeID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CollidePointResult {

	private static final LazyConstant<MethodHandle> JPH_COLLIDE_POINT_RESULT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_POINT_RESULT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_POINT_RESULT_GET_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_POINT_RESULT_SET_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_POINT_RESULT_GET_SUB_SHAPE_ID2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_POINT_RESULT_SET_SUB_SHAPE_ID2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_POINT_RESULT_GET_EARLY_OUT_FRACTION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLLIDE_POINT_RESULT_CREATE = downcallHandle("JPH_CollidePointResult_Create", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_POINT_RESULT_DESTROY = downcallHandleVoid("JPH_CollidePointResult_Destroy", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_POINT_RESULT_GET_BODY_ID = downcallHandleVoid("JPH_CollidePointResult_GetBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_POINT_RESULT_SET_BODY_ID = downcallHandleVoid("JPH_CollidePointResult_SetBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_POINT_RESULT_GET_SUB_SHAPE_ID2 = downcallHandleVoid("JPH_CollidePointResult_GetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_POINT_RESULT_SET_SUB_SHAPE_ID2 = downcallHandleVoid("JPH_CollidePointResult_SetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_POINT_RESULT_GET_EARLY_OUT_FRACTION = downcallHandle("JPH_CollidePointResult_GetEarlyOutFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CollidePointResult() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CollidePointResult(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CollidePointResult(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_COLLIDE_POINT_RESULT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_POINT_RESULT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Body that was hit
    /// ```
    public static void getBodyID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_POINT_RESULT_GET_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyID].
    public final void getBodyID(
    	BodyID outResult
    ) {
    	getBodyID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Body that was hit
    /// ```
    public static void setBodyID(
    	MemorySegment self,
    	MemorySegment mBodyID
    ) {
    	MethodHandle method = JPH_COLLIDE_POINT_RESULT_SET_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyID].
    public final void setBodyID(
    	BodyID mBodyID
    ) {
    	setBodyID(
    		this.segment,
    		mBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape ID of shape that we collided against
    /// ```
    public static void getSubShapeID2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_POINT_RESULT_GET_SUB_SHAPE_ID2.get();
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
    	MethodHandle method = JPH_COLLIDE_POINT_RESULT_SET_SUB_SHAPE_ID2.get();
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
    
    /// ```
    /// Function required by the CollisionCollector. A smaller fraction is considered to be a 'better hit'. For point queries there is no sensible return value.
    /// ```
    public static float getEarlyOutFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_POINT_RESULT_GET_EARLY_OUT_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEarlyOutFraction].
    public final float getEarlyOutFraction() {
    	return getEarlyOutFraction(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}