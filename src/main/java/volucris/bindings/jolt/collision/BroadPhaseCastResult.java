/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.BodyID;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class BroadPhaseCastResult
		permits RayCastResult {

	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_CAST_RESULT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_CAST_RESULT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_CAST_RESULT_GET_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_CAST_RESULT_SET_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_CAST_RESULT_GET_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_CAST_RESULT_SET_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_CAST_RESULT_GET_EARLY_OUT_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_CAST_RESULT_RESET;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_BROAD_PHASE_CAST_RESULT_CREATE = downcallHandle("JPH_BroadPhaseCastResult_Create", UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_CAST_RESULT_DESTROY = downcallHandleVoid("JPH_BroadPhaseCastResult_Destroy", UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_CAST_RESULT_GET_BODY_ID = downcallHandleVoid("JPH_BroadPhaseCastResult_GetBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_CAST_RESULT_SET_BODY_ID = downcallHandleVoid("JPH_BroadPhaseCastResult_SetBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_CAST_RESULT_GET_FRACTION = downcallHandle("JPH_BroadPhaseCastResult_GetFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_CAST_RESULT_SET_FRACTION = downcallHandleVoid("JPH_BroadPhaseCastResult_SetFraction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_BROAD_PHASE_CAST_RESULT_GET_EARLY_OUT_FRACTION = downcallHandle("JPH_BroadPhaseCastResult_GetEarlyOutFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_CAST_RESULT_RESET = downcallHandleVoid("JPH_BroadPhaseCastResult_Reset", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BroadPhaseCastResult() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public BroadPhaseCastResult(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public BroadPhaseCastResult(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_BROAD_PHASE_CAST_RESULT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_CAST_RESULT_DESTROY.get();
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
    	MethodHandle method = JPH_BROAD_PHASE_CAST_RESULT_GET_BODY_ID.get();
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
    	MethodHandle method = JPH_BROAD_PHASE_CAST_RESULT_SET_BODY_ID.get();
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
    /// Hit fraction of the ray/object [0, 1], HitPoint = Start + mFraction * (End - Start)
    /// ```
    public static float getFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_CAST_RESULT_GET_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFraction].
    public final float getFraction() {
    	return getFraction(
    		this.segment
    	);
    }
    
    /// ```
    /// Hit fraction of the ray/object [0, 1], HitPoint = Start + mFraction * (End - Start)
    /// ```
    public static void setFraction(
    	MemorySegment self,
    	float mFraction
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_CAST_RESULT_SET_FRACTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFraction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFraction].
    public final void setFraction(
    	float mFraction
    ) {
    	setFraction(
    		this.segment,
    		mFraction
    	);
    }
    
    /// ```
    /// Function required by the CollisionCollector. A smaller fraction is considered to be a 'better hit'. For rays/cast shapes we can just use the collision fraction.
    /// ```
    public static float getEarlyOutFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_CAST_RESULT_GET_EARLY_OUT_FRACTION.get();
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
    
    /// ```
    /// Reset this result so it can be reused for a new cast.
    /// ```
    public static void reset(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_CAST_RESULT_RESET.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reset].
    public final void reset() {
    	reset(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}