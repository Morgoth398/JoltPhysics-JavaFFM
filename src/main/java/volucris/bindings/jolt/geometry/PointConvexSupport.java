/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.geometry;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static volucris.bindings.core.FFMUtils.*;

public final class PointConvexSupport {

	private static final LazyConstant<MethodHandle> JPH_POINT_CONVEX_SUPPORT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONVEX_SUPPORT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONVEX_SUPPORT_GET_POINT;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONVEX_SUPPORT_SET_POINT;
	private static final LazyConstant<MethodHandle> JPH_POINT_CONVEX_SUPPORT_GET_SUPPORT;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_POINT_CONVEX_SUPPORT_CREATE = downcallHandle("JPH_PointConvexSupport_Create", UNBOUNDED_ADDRESS);
		JPH_POINT_CONVEX_SUPPORT_DESTROY = downcallHandleVoid("JPH_PointConvexSupport_Destroy", UNBOUNDED_ADDRESS);
		JPH_POINT_CONVEX_SUPPORT_GET_POINT = downcallHandleVoid("JPH_PointConvexSupport_GetPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONVEX_SUPPORT_SET_POINT = downcallHandleVoid("JPH_PointConvexSupport_SetPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_POINT_CONVEX_SUPPORT_GET_SUPPORT = downcallHandleVoid("JPH_PointConvexSupport_GetSupport", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public PointConvexSupport() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public PointConvexSupport(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public PointConvexSupport(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_POINT_CONVEX_SUPPORT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_POINT_CONVEX_SUPPORT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getPoint(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_POINT_CONVEX_SUPPORT_GET_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPoint].
    public final void getPoint(
    	Vec3 outResult
    ) {
    	getPoint(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setPoint(
    	MemorySegment self,
    	MemorySegment mPoint
    ) {
    	MethodHandle method = JPH_POINT_CONVEX_SUPPORT_SET_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPoint].
    public final void setPoint(
    	Vec3 mPoint
    ) {
    	setPoint(
    		this.segment,
    		mPoint.memorySegment()
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
    	MethodHandle method = JPH_POINT_CONVEX_SUPPORT_GET_SUPPORT.get();
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