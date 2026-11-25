/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class TriangleConvexSupport {

	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_GET_V1;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_SET_V1;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_GET_V2;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_SET_V2;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_GET_V3;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_SET_V3;
	private static final LazyConstant<MethodHandle> JPH_TRIANGLE_CONVEX_SUPPORT_GET_SUPPORT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TRIANGLE_CONVEX_SUPPORT_CREATE = downcallHandle("JPH_TriangleConvexSupport_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CONVEX_SUPPORT_DESTROY = downcallHandleVoid("JPH_TriangleConvexSupport_Destroy", UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CONVEX_SUPPORT_GET_V1 = downcallHandleVoid("JPH_TriangleConvexSupport_GetV1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CONVEX_SUPPORT_SET_V1 = downcallHandleVoid("JPH_TriangleConvexSupport_SetV1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CONVEX_SUPPORT_GET_V2 = downcallHandleVoid("JPH_TriangleConvexSupport_GetV2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CONVEX_SUPPORT_SET_V2 = downcallHandleVoid("JPH_TriangleConvexSupport_SetV2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CONVEX_SUPPORT_GET_V3 = downcallHandleVoid("JPH_TriangleConvexSupport_GetV3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CONVEX_SUPPORT_SET_V3 = downcallHandleVoid("JPH_TriangleConvexSupport_SetV3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRIANGLE_CONVEX_SUPPORT_GET_SUPPORT = downcallHandleVoid("JPH_TriangleConvexSupport_GetSupport", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TriangleConvexSupport(
	    Vec3 inV1,
	    Vec3 inV2,
	    Vec3 inV3
	) {
	    this(
	        Arena.ofAuto(),
	        inV1,
	        inV2,
	        inV3
	    );
	}
	
	/// Typed method of [#create].
	public TriangleConvexSupport(
		Arena arena,
		Vec3 inV1,
		Vec3 inV2,
		Vec3 inV3
	) {
		MemorySegment segment = create(
			inV1.memorySegment(),
			inV2.memorySegment(),
			inV3.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public TriangleConvexSupport(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inV1,
    	MemorySegment inV2,
    	MemorySegment inV3
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inV1,
    			inV2,
    			inV3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The three vertices of the triangle
    /// ```
    public static void getV1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_GET_V1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV1].
    public final void getV1(
    	Vec3 outResult
    ) {
    	getV1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The three vertices of the triangle
    /// ```
    public static void setV1(
    	MemorySegment self,
    	MemorySegment mV1
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_SET_V1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV1].
    public final void setV1(
    	Vec3 mV1
    ) {
    	setV1(
    		this.segment,
    		mV1.memorySegment()
    	);
    }
    
    public static void getV2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_GET_V2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV2].
    public final void getV2(
    	Vec3 outResult
    ) {
    	getV2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setV2(
    	MemorySegment self,
    	MemorySegment mV2
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_SET_V2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV2].
    public final void setV2(
    	Vec3 mV2
    ) {
    	setV2(
    		this.segment,
    		mV2.memorySegment()
    	);
    }
    
    public static void getV3(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_GET_V3.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getV3].
    public final void getV3(
    	Vec3 outResult
    ) {
    	getV3(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setV3(
    	MemorySegment self,
    	MemorySegment mV3
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_SET_V3.get();
    	try {
    		 method.invokeExact(
    			self,
    			mV3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setV3].
    public final void setV3(
    	Vec3 mV3
    ) {
    	setV3(
    		this.segment,
    		mV3.memorySegment()
    	);
    }
    
    /// ```
    /// Calculate the support vector for this convex shape.
    /// ```
    public static void getSupport(
    	MemorySegment self,
    	MemorySegment inDirection,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRIANGLE_CONVEX_SUPPORT_GET_SUPPORT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inDirection,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSupport].
    public final void getSupport(
    	Vec3 inDirection,
    	Vec3 outResult
    ) {
    	getSupport(
    		this.segment,
    		inDirection.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}