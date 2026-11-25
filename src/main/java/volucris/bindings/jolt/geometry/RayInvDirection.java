/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.UVec4;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class RayInvDirection {

	private static final LazyConstant<MethodHandle> JPH_RAY_INV_DIRECTION_CREATE;
	private static final LazyConstant<MethodHandle> JPH_RAY_INV_DIRECTION_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_RAY_INV_DIRECTION_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_RAY_INV_DIRECTION_GET_INV_DIRECTION;
	private static final LazyConstant<MethodHandle> JPH_RAY_INV_DIRECTION_SET_INV_DIRECTION;
	private static final LazyConstant<MethodHandle> JPH_RAY_INV_DIRECTION_GET_IS_PARALLEL;
	private static final LazyConstant<MethodHandle> JPH_RAY_INV_DIRECTION_SET_IS_PARALLEL;
	private static final LazyConstant<MethodHandle> JPH_RAY_INV_DIRECTION_SET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_RAY_INV_DIRECTION_CREATE = downcallHandle("JPH_RayInvDirection_Create", UNBOUNDED_ADDRESS);
		JPH_RAY_INV_DIRECTION_CREATE1 = downcallHandle("JPH_RayInvDirection_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAY_INV_DIRECTION_DESTROY = downcallHandleVoid("JPH_RayInvDirection_Destroy", UNBOUNDED_ADDRESS);
		JPH_RAY_INV_DIRECTION_GET_INV_DIRECTION = downcallHandleVoid("JPH_RayInvDirection_GetInvDirection", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAY_INV_DIRECTION_SET_INV_DIRECTION = downcallHandleVoid("JPH_RayInvDirection_SetInvDirection", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAY_INV_DIRECTION_GET_IS_PARALLEL = downcallHandleVoid("JPH_RayInvDirection_GetIsParallel", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAY_INV_DIRECTION_SET_IS_PARALLEL = downcallHandleVoid("JPH_RayInvDirection_SetIsParallel", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_RAY_INV_DIRECTION_SET = downcallHandleVoid("JPH_RayInvDirection_Set", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public RayInvDirection() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public RayInvDirection(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RayInvDirection(
	    Vec3 inDirection
	) {
	    this(
	        Arena.ofAuto(),
	        inDirection
	    );
	}
	
	/// Typed method of [#create1].
	public RayInvDirection(
		Arena arena,
		Vec3 inDirection
	) {
		MemorySegment segment = create1(
			inDirection.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public RayInvDirection(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructors
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_RAY_INV_DIRECTION_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inDirection
    ) {
    	MethodHandle method = JPH_RAY_INV_DIRECTION_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_RAY_INV_DIRECTION_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 1 / ray direction
    /// ```
    public static void getInvDirection(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAY_INV_DIRECTION_GET_INV_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvDirection].
    public final void getInvDirection(
    	Vec3 outResult
    ) {
    	getInvDirection(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// 1 / ray direction
    /// ```
    public static void setInvDirection(
    	MemorySegment self,
    	MemorySegment mInvDirection
    ) {
    	MethodHandle method = JPH_RAY_INV_DIRECTION_SET_INV_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvDirection].
    public final void setInvDirection(
    	Vec3 mInvDirection
    ) {
    	setInvDirection(
    		this.segment,
    		mInvDirection.memorySegment()
    	);
    }
    
    /// ```
    /// for each component if it is parallel to the coordinate axis
    /// ```
    public static void getIsParallel(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_RAY_INV_DIRECTION_GET_IS_PARALLEL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsParallel].
    public final void getIsParallel(
    	UVec4 outResult
    ) {
    	getIsParallel(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// for each component if it is parallel to the coordinate axis
    /// ```
    public static void setIsParallel(
    	MemorySegment self,
    	MemorySegment mIsParallel
    ) {
    	MethodHandle method = JPH_RAY_INV_DIRECTION_SET_IS_PARALLEL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsParallel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsParallel].
    public final void setIsParallel(
    	UVec4 mIsParallel
    ) {
    	setIsParallel(
    		this.segment,
    		mIsParallel.memorySegment()
    	);
    }
    
    /// ```
    /// Set reciprocal from ray direction
    /// ```
    public static void set(
    	MemorySegment self,
    	MemorySegment inDirection
    ) {
    	MethodHandle method = JPH_RAY_INV_DIRECTION_SET.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#set].
    public final void set(
    	Vec3 inDirection
    ) {
    	set(
    		this.segment,
    		inDirection.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}