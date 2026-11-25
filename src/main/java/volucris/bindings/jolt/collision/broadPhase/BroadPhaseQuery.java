/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision.broadPhase;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.AABoxCast;
import volucris.bindings.jolt.collision.CastShapeBodyCollector;
import volucris.bindings.jolt.collision.CollideShapeBodyCollector;
import volucris.bindings.jolt.collision.ObjectLayerFilter;
import volucris.bindings.jolt.collision.RayCast;
import volucris.bindings.jolt.collision.RayCastBodyCollector;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.geometry.OrientedBox;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class BroadPhaseQuery {

	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_CAST_RAY;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_COLLIDE_POINT;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_COLLIDE_ORIENTED_BOX;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_CAST_AABOX;
	private static final LazyConstant<MethodHandle> JPH_BROAD_PHASE_QUERY_GET_BOUNDS;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_BROAD_PHASE_QUERY_CAST_RAY = downcallHandleVoid("JPH_BroadPhaseQuery_CastRay", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX = downcallHandleVoid("JPH_BroadPhaseQuery_CollideAABox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE = downcallHandleVoid("JPH_BroadPhaseQuery_CollideSphere", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_QUERY_COLLIDE_POINT = downcallHandleVoid("JPH_BroadPhaseQuery_CollidePoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_QUERY_COLLIDE_ORIENTED_BOX = downcallHandleVoid("JPH_BroadPhaseQuery_CollideOrientedBox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_QUERY_CAST_AABOX = downcallHandleVoid("JPH_BroadPhaseQuery_CastAABox", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_BROAD_PHASE_QUERY_GET_BOUNDS = downcallHandleVoid("JPH_BroadPhaseQuery_GetBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public BroadPhaseQuery(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Cast a ray and add any hits to ioCollector
    /// ```
    public static void castRay(
    	MemorySegment self,
    	MemorySegment inRay,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_QUERY_CAST_RAY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRay,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRay].
    public final void castRay(
    	RayCast inRay,
    	RayCastBodyCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter
    ) {
    	castRay(
    		this.segment,
    		inRay.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Get bodies intersecting with inBox and any hits to ioCollector
    /// ```
    public static void collideAABox(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideAABox].
    public final void collideAABox(
    	AABox inBox,
    	CollideShapeBodyCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter
    ) {
    	collideAABox(
    		this.segment,
    		inBox.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Get bodies intersecting with a sphere and any hits to ioCollector
    /// ```
    public static void collideSphere(
    	MemorySegment self,
    	MemorySegment inCenter,
    	float inRadius,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inCenter,
    			inRadius,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideSphere].
    public final void collideSphere(
    	Vec3 inCenter,
    	float inRadius,
    	CollideShapeBodyCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter
    ) {
    	collideSphere(
    		this.segment,
    		inCenter.memorySegment(),
    		inRadius,
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Get bodies intersecting with a point and any hits to ioCollector
    /// ```
    public static void collidePoint(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collidePoint].
    public final void collidePoint(
    	Vec3 inPoint,
    	CollideShapeBodyCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter
    ) {
    	collidePoint(
    		this.segment,
    		inPoint.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Get bodies intersecting with an oriented box and any hits to ioCollector
    /// ```
    public static void collideOrientedBox(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_ORIENTED_BOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideOrientedBox].
    public final void collideOrientedBox(
    	OrientedBox inBox,
    	CollideShapeBodyCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter
    ) {
    	collideOrientedBox(
    		this.segment,
    		inBox.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a box and add any hits to ioCollector
    /// ```
    public static void castAABox(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_QUERY_CAST_AABOX.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castAABox].
    public final void castAABox(
    	AABoxCast inBox,
    	CastShapeBodyCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter
    ) {
    	castAABox(
    		this.segment,
    		inBox.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Get the bounding box of all objects in the broadphase
    /// ```
    public static void getBounds(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_BROAD_PHASE_QUERY_GET_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBounds].
    public final void getBounds(
    	AABox outResult
    ) {
    	getBounds(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}