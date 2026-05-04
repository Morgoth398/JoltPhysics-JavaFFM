package volucris.engine.physics.jolt.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.filter.BodyFilter;
import volucris.engine.physics.jolt.filter.BroadPhaseLayerFilter;
import volucris.engine.physics.jolt.filter.ObjectLayerFilter;
import volucris.engine.physics.jolt.filter.ShapeFilter;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.raycast.CastRayCollectorCallback;
import volucris.engine.physics.jolt.raycast.CastRayResultCallback;
import volucris.engine.physics.jolt.raycast.CastShapeCollectorCallback;
import volucris.engine.physics.jolt.raycast.CastShapeResultCallback;
import volucris.engine.physics.jolt.raycast.CollidePointCollectorCallback;
import volucris.engine.physics.jolt.raycast.CollidePointResultCallback;
import volucris.engine.physics.jolt.raycast.CollideShapeCollectorCallback;
import volucris.engine.physics.jolt.raycast.CollideShapeResultCallback;
import volucris.engine.physics.jolt.raycast.CollideShapeSettings;
import volucris.engine.physics.jolt.raycast.CollisionCollectorType;
import volucris.engine.physics.jolt.raycast.RayCastResult;
import volucris.engine.physics.jolt.raycast.RayCastSettings;
import volucris.engine.physics.jolt.raycast.ShapeCastSettings;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that provides an interface for doing precise collision detection
 * against the broad and then the narrow phase. Unlike a BroadPhaseQuery, the
 * NarrowPhaseQuery will test against shapes and will return collision
 * information against triangles, spheres etc.
 */
public final class NarrowPhaseQuery {

	private static final MethodHandle JPH_NARROW_PHASE_QUERY_CAST_RAY;
	private static final MethodHandle JPH_NARROW_PHASE_QUERY_CAST_RAY2;
	private static final MethodHandle JPH_NARROW_PHASE_QUERY_CAST_RAY3;
	private static final MethodHandle JPH_NARROW_PHASE_QUERY_COLLIDE_POINT;
	private static final MethodHandle JPH_NARROW_PHASE_QUERY_COLLIDE_POINT2;
	private static final MethodHandle JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE;
	private static final MethodHandle JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE2;
	private static final MethodHandle JPH_NARROW_PHASE_QUERY_CAST_SHAPE;
	private static final MethodHandle JPH_NARROW_PHASE_QUERY_CAST_SHAPE2;

	private final MemorySegment jphNarrowPhaseQuery;

	private Mat4 matTmp;

	private Vec3 vecTmp;
	private Vec3 vecTmp2;

	static {
		//@formatter:off
		JPH_NARROW_PHASE_QUERY_CAST_RAY = downcallHandle("JPH_NarrowPhaseQuery_CastRay", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_NARROW_PHASE_QUERY_CAST_RAY2 = downcallHandle("JPH_NarrowPhaseQuery_CastRay2", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_NARROW_PHASE_QUERY_CAST_RAY3 = downcallHandle("JPH_NarrowPhaseQuery_CastRay3", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_NARROW_PHASE_QUERY_COLLIDE_POINT = downcallHandle("JPH_NarrowPhaseQuery_CollidePoint", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_NARROW_PHASE_QUERY_COLLIDE_POINT2 = downcallHandle("JPH_NarrowPhaseQuery_CollidePoint2", JAVA_BOOLEAN, ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE = downcallHandle("JPH_NarrowPhaseQuery_CollideShape", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE2 = downcallHandle("JPH_NarrowPhaseQuery_CollideShape2", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_NARROW_PHASE_QUERY_CAST_SHAPE = downcallHandle("JPH_NarrowPhaseQuery_CastShape", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_NARROW_PHASE_QUERY_CAST_SHAPE2 = downcallHandle("JPH_NarrowPhaseQuery_CastShape2", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		//@formatter:on
	}

	public NarrowPhaseQuery(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}
	
	public NarrowPhaseQuery(MemorySegment segment, Arena arena) {
		jphNarrowPhaseQuery = segment;

		matTmp = new Mat4(arena);
		vecTmp = new Vec3(arena);
		vecTmp2 = new Vec3(arena);

	}

	/**
	 * Cast a ray and find the closest hit. Returns true if it finds a hit. Hits
	 * further than hit.mFraction will not be considered and in this case hit will
	 * remain unmodified (and the function will return false). Convex objects will
	 * be treated as solid (meaning if the ray starts inside, you'll get a hit
	 * fraction of 0) and back face hits against triangles are returned.
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, RayCastResult hit,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter) {
		try {
			vecTmp.set(origin);
			vecTmp2.set(direction);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment origAddr = vecTmp.memorySegment();
			MemorySegment dirAddr = vecTmp2.memorySegment();
			MemorySegment hitAddr = hit.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_RAY;
			return (boolean) method.invokeExact(query, origAddr, dirAddr, hitAddr, filt1, filt2, filt3);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot cast ray.");
		}
	}

	/**
	 * Cast a ray, allows collecting multiple hits. Note that this version is more
	 * flexible but also slightly slower than the other castRay functions that
	 * return only a single hit.
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, RayCastSettings rayCastSettings,
			CastRayCollectorCallback callback, BroadPhaseLayerFilter broadPhaseLayerFilter,
			ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		return castRay(origin, direction, rayCastSettings, callback, MemorySegment.NULL, broadPhaseLayerFilter,
				objectLayerFilter, bodyFilter, shapeFilter);
	}

	/**
	 * Cast a ray, allows collecting multiple hits. Note that this version is more
	 * flexible but also slightly slower than the other castRay functions that
	 * return only a single hit.
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, RayCastSettings rayCastSettings,
			CastRayCollectorCallback callback, MemorySegment data, BroadPhaseLayerFilter broadPhaseLayerFilter,
			ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {
			vecTmp.set(origin);
			vecTmp2.set(direction);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment orig = vecTmp.memorySegment();
			MemorySegment dir = vecTmp2.memorySegment();
			MemorySegment settAddr = rayCastSettings.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();
			MemorySegment filt4 = shapeFilter.memorySegment();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_RAY2;
			return (boolean) method.invokeExact(query, orig, dir, settAddr, callAddr, data, filt1, filt2, filt3, filt4);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot cast ray.");
		}
	}

	/**
	 * 
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, RayCastSettings rayCastSettings,
			CollisionCollectorType collectorType, CastRayResultCallback callback,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter,
			ShapeFilter shapeFilter) {
		return castRay(origin, direction, rayCastSettings, collectorType, callback, MemorySegment.NULL,
				broadPhaseLayerFilter, objectLayerFilter, bodyFilter, shapeFilter);
	}

	/**
	 * 
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, RayCastSettings rayCastSettings,
			CollisionCollectorType collectorType, CastRayResultCallback callback, MemorySegment data,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter,
			ShapeFilter shapeFilter) {
		try {

			vecTmp.set(origin);
			vecTmp2.set(direction);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment orig = vecTmp.memorySegment();
			MemorySegment dir = vecTmp2.memorySegment();
			MemorySegment sett = rayCastSettings.memorySegment();
			MemorySegment call = callback.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();
			MemorySegment filt4 = shapeFilter.memorySegment();

			int type = collectorType.id();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_RAY3;
			return (boolean) method.invokeExact(query, orig, dir, sett, type, call, data, filt1, filt2, filt3, filt4);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot cast ray.");
		}
	}

	/**
	 * Check if inPoint is inside any shapes. For this tests all shapes are treated
	 * as if they were solid. For a mesh shape, this test will only provide sensible
	 * information if the mesh is a closed manifold. For each shape that collides,
	 * ioCollector will receive a hit
	 */
	public boolean collidePoint(Vector3f point, CollidePointCollectorCallback callback,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter,
			ShapeFilter shapeFilter) {
		return collidePoint(point, callback, MemorySegment.NULL, broadPhaseLayerFilter, objectLayerFilter, bodyFilter,
				shapeFilter);
	}

	/**
	 * Check if inPoint is inside any shapes. For this tests all shapes are treated
	 * as if they were solid. For a mesh shape, this test will only provide sensible
	 * information if the mesh is a closed manifold. For each shape that collides,
	 * ioCollector will receive a hit
	 */
	public boolean collidePoint(Vector3f point, CollidePointCollectorCallback callback, MemorySegment data,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter,
			ShapeFilter shapeFilter) {
		try {
			vecTmp.set(point);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment pointAddr = vecTmp.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();
			MemorySegment filt4 = shapeFilter.memorySegment();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_POINT;
			return (boolean) method.invokeExact(query, pointAddr, callAddr, data, filt1, filt2, filt3, filt4);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call collide point.");
		}
	}

	/**
	 * 
	 */
	public boolean collidePoint(Vector3f point, CollisionCollectorType collectorType,
			CollidePointResultCallback callback, MemorySegment data, BroadPhaseLayerFilter broadPhaseLayerFilter,
			ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {
			vecTmp.set(point);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment pointAddr = vecTmp.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();
			MemorySegment filt4 = shapeFilter.memorySegment();

			int type = collectorType.id();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_POINT2;
			return (boolean) method.invokeExact(query, pointAddr, type, callAddr, data, filt1, filt2, filt3, filt4);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call collide point.");
		}
	}

	/**
	 * @see #collideShape(Shape, Vector3f, Matrix4f, CollideShapeSettings, Vector3f,
	 *      CollideShapeCollectorCallback, MemorySegment, BroadPhaseLayerFilter,
	 *      ObjectLayerFilter, BodyFilter, ShapeFilter) collideShape
	 */
	public boolean collideShape(Shape shape, Vector3f scale, Matrix4f centerOfMassTransform,
			CollideShapeSettings settings, Vector3f baseOffset, CollideShapeCollectorCallback callback,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter,
			ShapeFilter shapeFilter) {
		return collideShape(shape, scale, centerOfMassTransform, settings, baseOffset, callback, MemorySegment.NULL,
				broadPhaseLayerFilter, objectLayerFilter, bodyFilter, shapeFilter);
	}

	/**
	 * Collide a shape with the system
	 * 
	 * @param shape                 Shape to test
	 * @param scale                 Scale in local space of shape
	 * @param centerOfMassTransform Center of mass transform for the shape
	 * @param settings              Settings
	 * @param baseOffset            ll hit results will be returned relative to this
	 *                              offset, can be zero to get results in world
	 *                              position, but when you're testing far from the
	 *                              origin you get better precision by picking a
	 *                              position that's closer e.g.
	 *                              inCenterOfMassTransform.GetTranslation() since
	 *                              floats are most accurate near the origin
	 * @param callback              The callback
	 * @param data                  User data
	 * @param broadPhaseLayerFilter Filter that filters at broadphase level
	 * @param objectLayerFilter     Filter that filters at layer level
	 * @param bodyFilter            Filter that filters at body level
	 * @param shapeFilter           Filter that filters at shape level
	 * @return
	 */
	public boolean collideShape(Shape shape, Vector3f scale, Matrix4f centerOfMassTransform,
			CollideShapeSettings settings, Vector3f baseOffset, CollideShapeCollectorCallback callback,
			MemorySegment data, BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter,
			BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {
			vecTmp.set(scale);
			vecTmp2.set(baseOffset);

			matTmp.set(centerOfMassTransform);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment shapeAddr = shape.memorySegment();
			MemorySegment scaleAddr = vecTmp.memorySegment();
			MemorySegment matAddr = matTmp.memorySegment();
			MemorySegment settAddr = settings.memorySegment();
			MemorySegment offAddr = vecTmp2.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();
			MemorySegment filt4 = shapeFilter.memorySegment();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE;
			return (boolean) method.invokeExact(query, shapeAddr, scaleAddr, matAddr, settAddr, offAddr, callAddr, data,
					filt1, filt2, filt3, filt4);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call collide shape.");
		}
	}

	/**
	 * 
	 */
	public boolean collideShape(Shape shape, Vector3f scale, Matrix4f centerOfMassTransform,
			CollideShapeSettings settings, Vector3f baseOffset, CollisionCollectorType collectorType,
			CollideShapeResultCallback callback, MemorySegment userData, BroadPhaseLayerFilter broadPhaseLayerFilter,
			ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {
			vecTmp.set(scale);
			vecTmp2.set(baseOffset);

			matTmp.set(centerOfMassTransform);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment shapeAddr = shape.memorySegment();
			MemorySegment scaleAddr = vecTmp.memorySegment();
			MemorySegment matAddr = matTmp.memorySegment();
			MemorySegment settAddr = settings.memorySegment();
			MemorySegment offAddr = vecTmp2.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();
			MemorySegment filt4 = shapeFilter.memorySegment();

			int type = collectorType.id();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_COLLIDE_SHAPE2;
			return (boolean) method.invokeExact(query, shapeAddr, scaleAddr, matAddr, settAddr, offAddr, type, callAddr,
					userData, filt1, filt2, filt3, filt4);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call collideShape2.");
		}
	}

	public boolean castShape(Shape shape, Matrix4f worldTransform, Vector3f direction, ShapeCastSettings settings,
			Vector3f baseOffset, CastShapeCollectorCallback callback, BroadPhaseLayerFilter broadPhaseLayerFilter,
			ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		return castShape(shape, worldTransform, direction, settings, baseOffset, callback, MemorySegment.NULL,
				broadPhaseLayerFilter, objectLayerFilter, bodyFilter, shapeFilter);
	}

	public boolean castShape(Shape shape, Matrix4f worldTransform, Vector3f direction, ShapeCastSettings settings,
			Vector3f baseOffset, CastShapeCollectorCallback callback, MemorySegment userData,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter,
			ShapeFilter shapeFilter) {
		try {
			vecTmp.set(direction);
			vecTmp2.set(baseOffset);

			matTmp.set(worldTransform);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment shapeAddr = shape.memorySegment();
			MemorySegment dirAddr = vecTmp.memorySegment();
			MemorySegment matAddr = matTmp.memorySegment();
			MemorySegment settAddr = settings.memorySegment();
			MemorySegment offAddr = vecTmp2.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();
			MemorySegment filt4 = shapeFilter.memorySegment();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_SHAPE;
			return (boolean) method.invokeExact(query, shapeAddr, matAddr, dirAddr, settAddr, offAddr, callAddr,
					userData, filt1, filt2, filt3, filt4);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot cast shape.");
		}
	}

	/**
	 * 
	 */
	public boolean castShape(Shape shape, Matrix4f worldTransform, Vector3f direction, ShapeCastSettings settings,
			Vector3f baseOffset, CollisionCollectorType collectorType, CastShapeResultCallback callback,
			MemorySegment userData, BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter,
			BodyFilter bodyFilter, ShapeFilter shapeFilter) {
		try {

			vecTmp.set(direction);
			vecTmp2.set(baseOffset);

			matTmp.set(worldTransform);

			MemorySegment query = jphNarrowPhaseQuery;
			MemorySegment shapeAddr = shape.memorySegment();
			MemorySegment dirAddr = vecTmp.memorySegment();
			MemorySegment matAddr = matTmp.memorySegment();
			MemorySegment settAddr = settings.memorySegment();
			MemorySegment offAddr = vecTmp2.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1 = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2 = objectLayerFilter.memorySegment();
			MemorySegment filt3 = bodyFilter.memorySegment();
			MemorySegment filt4 = shapeFilter.memorySegment();

			int type = collectorType.id();

			MethodHandle method = JPH_NARROW_PHASE_QUERY_CAST_SHAPE2;
			return (boolean) method.invokeExact(query, shapeAddr, matAddr, dirAddr, settAddr, offAddr, type, callAddr,
					userData, filt1, filt2, filt3, filt4);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot call cast shape.");
		}
	}

}