/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.shape;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ConvexShapeSupport {

	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SUPPORT_GET_SUPPORT;
	private static final LazyConstant<MethodHandle> JPH_CONVEX_SHAPE_SUPPORT_GET_CONVEX_RADIUS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONVEX_SHAPE_SUPPORT_GET_SUPPORT = downcallHandleVoid("JPH_ConvexShapeSupport_GetSupport", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONVEX_SHAPE_SUPPORT_GET_CONVEX_RADIUS = downcallHandle("JPH_ConvexShapeSupport_GetConvexRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ConvexShapeSupport(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Calculate the support vector for this convex shape (includes / excludes the convex radius depending on how this was obtained).
    /// Support vector is relative to the center of mass of the shape.
    /// ```
    public static void getSupport(
    	MemorySegment self,
    	MemorySegment inDirection,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SUPPORT_GET_SUPPORT.get();
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
    
    /// ```
    /// Convex radius of shape. Collision detection on penetrating shapes is much more expensive,
    /// so you can add a radius around objects to increase the shape. This makes it far less likely that they will actually penetrate.
    /// ```
    public static float getConvexRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONVEX_SHAPE_SUPPORT_GET_CONVEX_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConvexRadius].
    public final float getConvexRadius() {
    	return getConvexRadius(
    		this.segment
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}