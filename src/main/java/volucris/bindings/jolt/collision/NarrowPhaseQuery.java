/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.BodyFilter;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerFilter;
import volucris.bindings.jolt.collision.shape.CollideShapeCollector;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class NarrowPhaseQuery {

	private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_CAST_RAY;
	private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_CAST_RAY1;
	private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_COLLIDE_POINT;
	private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE_WITH_INTERNAL_EDGE_REMOVAL;
	private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_CAST_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_NARROW_PHASE_QUERY_COLLECT_TRANSFORMED_SHAPES;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_NARROW_PHASE_QUERY_CAST_RAY = downcallHandle("JPH_NarrowPhaseQuery_CastRay", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_NARROW_PHASE_QUERY_CAST_RAY1 = downcallHandleVoid("JPH_NarrowPhaseQuery_CastRay1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_NARROW_PHASE_QUERY_COLLIDE_POINT = downcallHandleVoid("JPH_NarrowPhaseQuery_CollidePoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE = downcallHandleVoid("JPH_NarrowPhaseQuery_CollideShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE_WITH_INTERNAL_EDGE_REMOVAL = downcallHandleVoid("JPH_NarrowPhaseQuery_CollideShapeWithInternalEdgeRemoval", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_NARROW_PHASE_QUERY_CAST_SHAPE = downcallHandleVoid("JPH_NarrowPhaseQuery_CastShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_NARROW_PHASE_QUERY_COLLECT_TRANSFORMED_SHAPES = downcallHandleVoid("JPH_NarrowPhaseQuery_CollectTransformedShapes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public NarrowPhaseQuery(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Cast a ray and find the closest hit. Returns true if it finds a hit. Hits further than ioHit.mFraction will not be considered and in this case ioHit will remain unmodified (and the function will return false).
    /// Convex objects will be treated as solid (meaning if the ray starts inside, you'll get a hit fraction of 0) and back face hits against triangles are returned.
    /// If you want the surface normal of the hit use Body::GetWorldSpaceSurfaceNormal(ioHit.mSubShapeID2, inRay.GetPointOnRay(ioHit.mFraction)) on body with ID ioHit.mBodyID.
    /// ```
    public static boolean castRay(
    	MemorySegment self,
    	MemorySegment inRay,
    	MemorySegment ioHit,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter
    ) {
    	MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_RAY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inRay,
    			ioHit,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRay].
    public final boolean castRay(
    	RRayCast inRay,
    	RayCastResult ioHit,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter
    ) {
    	return castRay(
    		this.segment,
    		inRay.memorySegment(),
    		ioHit.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a ray, allows collecting multiple hits. Note that this version is more flexible but also slightly slower than the CastRay function that returns only a single hit.
    /// If you want the surface normal of the hit use Body::GetWorldSpaceSurfaceNormal(collected sub shape ID, inRay.GetPointOnRay(collected fraction)) on body with collected body ID.
    /// ```
    public static void castRay1(
    	MemorySegment self,
    	MemorySegment inRay,
    	MemorySegment inRayCastSettings,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_RAY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRay,
    			inRayCastSettings,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRay1].
    public final void castRay1(
    	RRayCast inRay,
    	RayCastSettings inRayCastSettings,
    	CastRayCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter
    ) {
    	castRay1(
    		this.segment,
    		inRay.memorySegment(),
    		inRayCastSettings.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Check if inPoint is inside any shapes. For this tests all shapes are treated as if they were solid.
    /// For a mesh shape, this test will only provide sensible information if the mesh is a closed manifold.
    /// For each shape that collides, ioCollector will receive a hit
    /// ```
    public static void collidePoint(
    	MemorySegment self,
    	MemorySegment inPoint,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collidePoint].
    public final void collidePoint(
    	Vec3 inPoint,
    	CollidePointCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter
    ) {
    	collidePoint(
    		this.segment,
    		inPoint.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a shape with the system
    /// @param inShape Shape to test
    /// @param inShapeScale Scale in local space of shape
    /// @param inCenterOfMassTransform Center of mass transform for the shape
    /// @param inCollideShapeSettings Settings
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. inCenterOfMassTransform.GetTranslation() since floats are most accurate near the origin
    /// @param ioCollector Collector that receives the hits
    /// @param inBroadPhaseLayerFilter Filter that filters at broadphase level
    /// @param inObjectLayerFilter Filter that filters at layer level
    /// @param inBodyFilter Filter that filters at body level
    /// @param inShapeFilter Filter that filters at shape level
    /// ```
    public static void collideShape(
    	MemorySegment self,
    	MemorySegment inShape,
    	MemorySegment inShapeScale,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inCollideShapeSettings,
    	MemorySegment inBaseOffset,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShape,
    			inShapeScale,
    			inCenterOfMassTransform,
    			inCollideShapeSettings,
    			inBaseOffset,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideShape].
    public final void collideShape(
    	Shape inShape,
    	Vec3 inShapeScale,
    	Mat44 inCenterOfMassTransform,
    	CollideShapeSettings inCollideShapeSettings,
    	Vec3 inBaseOffset,
    	CollideShapeCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter
    ) {
    	collideShape(
    		this.segment,
    		inShape.memorySegment(),
    		inShapeScale.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inCollideShapeSettings.memorySegment(),
    		inBaseOffset.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Same as CollideShape, but uses InternalEdgeRemovingCollector to remove internal edges from the collision results (a.k.a. ghost collisions)
    /// ```
    public static void collideShapeWithInternalEdgeRemoval(
    	MemorySegment self,
    	MemorySegment inShape,
    	MemorySegment inShapeScale,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inCollideShapeSettings,
    	MemorySegment inBaseOffset,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE_WITH_INTERNAL_EDGE_REMOVAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShape,
    			inShapeScale,
    			inCenterOfMassTransform,
    			inCollideShapeSettings,
    			inBaseOffset,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collideShapeWithInternalEdgeRemoval].
    public final void collideShapeWithInternalEdgeRemoval(
    	Shape inShape,
    	Vec3 inShapeScale,
    	Mat44 inCenterOfMassTransform,
    	CollideShapeSettings inCollideShapeSettings,
    	Vec3 inBaseOffset,
    	CollideShapeCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter
    ) {
    	collideShapeWithInternalEdgeRemoval(
    		this.segment,
    		inShape.memorySegment(),
    		inShapeScale.memorySegment(),
    		inCenterOfMassTransform.memorySegment(),
    		inCollideShapeSettings.memorySegment(),
    		inBaseOffset.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a shape and report any hits to ioCollector
    /// @param inShapeCast The shape cast and its position and direction
    /// @param inShapeCastSettings Settings for the shape cast
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. inShapeCast.mCenterOfMassStart.GetTranslation() since floats are most accurate near the origin
    /// @param ioCollector Collector that receives the hits
    /// @param inBroadPhaseLayerFilter Filter that filters at broadphase level
    /// @param inObjectLayerFilter Filter that filters at layer level
    /// @param inBodyFilter Filter that filters at body level
    /// @param inShapeFilter Filter that filters at shape level
    /// ```
    public static void castShape(
    	MemorySegment self,
    	MemorySegment inShapeCast,
    	MemorySegment inShapeCastSettings,
    	MemorySegment inBaseOffset,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShapeCast,
    			inShapeCastSettings,
    			inBaseOffset,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castShape].
    public final void castShape(
    	RShapeCast inShapeCast,
    	ShapeCastSettings inShapeCastSettings,
    	Vec3 inBaseOffset,
    	CastShapeCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter
    ) {
    	castShape(
    		this.segment,
    		inShapeCast.memorySegment(),
    		inShapeCastSettings.memorySegment(),
    		inBaseOffset.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Collect all leaf transformed shapes that fall inside world space box inBox
    /// ```
    public static void collectTransformedShapes(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment ioCollector,
    	MemorySegment inBroadPhaseLayerFilter,
    	MemorySegment inObjectLayerFilter,
    	MemorySegment inBodyFilter,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLECT_TRANSFORMED_SHAPES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			ioCollector,
    			inBroadPhaseLayerFilter,
    			inObjectLayerFilter,
    			inBodyFilter,
    			inShapeFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#collectTransformedShapes].
    public final void collectTransformedShapes(
    	AABox inBox,
    	TransformedShapeCollector ioCollector,
    	BroadPhaseLayerFilter inBroadPhaseLayerFilter,
    	ObjectLayerFilter inObjectLayerFilter,
    	BodyFilter inBodyFilter,
    	ShapeFilter inShapeFilter
    ) {
    	collectTransformedShapes(
    		this.segment,
    		inBox.memorySegment(),
    		ioCollector.memorySegment(),
    		inBroadPhaseLayerFilter.memorySegment(),
    		inObjectLayerFilter.memorySegment(),
    		inBodyFilter.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}