package volucris.engine.physics.jolt.query;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.filter.BroadPhaseLayerFilter;
import volucris.engine.physics.jolt.filter.ObjectLayerFilter;
import volucris.engine.physics.jolt.math.AABox;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.raycast.CollideShapeBodyCollectorCallback;
import volucris.engine.physics.jolt.raycast.CollisionCollectorType;
import volucris.engine.physics.jolt.raycast.RayCastBodyCollectorCallback;
import volucris.engine.physics.jolt.raycast.RayCastBodyResultCallback;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Interface to the broadphase that can perform collision queries. These queries
 * will only test the bounding box of the body to quickly determine a potential
 * set of colliding bodies. The shapes of the bodies are not tested, if you want
 * this then you should use the NarrowPhaseQuery interface.
 */
public final class BroadPhaseQuery {

	private static final MethodHandle JPH_BROAD_PHASE_QUERY_CAST_RAY;
	private static final MethodHandle JPH_BROAD_PHASE_QUERY_CAST_RAY2;
	private static final MethodHandle JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX;
	private static final MethodHandle JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE;
	private static final MethodHandle JPH_BROAD_PHASE_QUERY_COLLIDE_POINT;

	private final MemorySegment jphBroadPhaseQuery;

	private Vec3 vecTmp;
	private Vec3 vecTmp2;

	static {
		//@formatter:off
		JPH_BROAD_PHASE_QUERY_CAST_RAY = downcallHandle("JPH_BroadPhaseQuery_CastRay", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_BROAD_PHASE_QUERY_CAST_RAY2 = downcallHandle("JPH_BroadPhaseQuery_CastRay2", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX = downcallHandle("JPH_BroadPhaseQuery_CollideAABox", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE = downcallHandle("JPH_BroadPhaseQuery_CollideSphere", JAVA_BOOLEAN, ADDRESS, ADDRESS, JAVA_FLOAT, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_BROAD_PHASE_QUERY_COLLIDE_POINT = downcallHandle("JPH_BroadPhaseQuery_CollidePoint", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		//@formatter:on
	}

	public BroadPhaseQuery(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	public BroadPhaseQuery(MemorySegment segment, Arena arena) {
		jphBroadPhaseQuery = segment;

		vecTmp = new Vec3(arena);
		vecTmp2 = new Vec3(arena);
	}

	/**
	 * Cast a ray and add any hits to coolectorCallback.
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, RayCastBodyCollectorCallback callback,
			MemorySegment userData, BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter) {
		try {
			vecTmp.set(origin);
			vecTmp2.set(direction);

			MemorySegment query = jphBroadPhaseQuery;
			MemorySegment origAddr = vecTmp.memorySegment();
			MemorySegment dirAddr = vecTmp2.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1Addr = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2Addr = objectLayerFilter.memorySegment();

			MethodHandle method = JPH_BROAD_PHASE_QUERY_CAST_RAY;
			return (boolean) method.invokeExact(query, origAddr, dirAddr, callAddr, userData, filt1Addr, filt2Addr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot cast ray: " + className);
		}
	}

	/**
	 * 
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, CollisionCollectorType collectorType,
			RayCastBodyResultCallback callback, MemorySegment data, BroadPhaseLayerFilter broadPhaseLayerFilter,
			ObjectLayerFilter objectLayerFilter) {
		try {
			vecTmp.set(origin);
			vecTmp2.set(direction);

			MemorySegment query = jphBroadPhaseQuery;
			MemorySegment origAddr = vecTmp.memorySegment();
			MemorySegment dirAddr = vecTmp2.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1Addr = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2Addr = objectLayerFilter.memorySegment();

			int type = collectorType.id();

			MethodHandle method = JPH_BROAD_PHASE_QUERY_CAST_RAY2;
			return (boolean) method.invokeExact(query, origAddr, dirAddr, type, callAddr, data, filt1Addr, filt2Addr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot cast ray: " + className);
		}
	}

	/**
	 * Get bodies intersecting with inBox and add any hits to the collectorCallback.
	 */
	public boolean collideAABox(AABox box, CollideShapeBodyCollectorCallback callback, MemorySegment userData,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter) {
		try {
			MemorySegment query = jphBroadPhaseQuery;
			MemorySegment boxAddr = box.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1Addr = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2Addr = objectLayerFilter.memorySegment();

			MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_AABOX;
			return (boolean) method.invokeExact(query, boxAddr, callAddr, userData, filt1Addr, filt2Addr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call collide AABox: " + className);
		}
	}

	/**
	 * Get bodies intersecting with a sphere and add any hits to the
	 * collectorCallback.
	 */
	public boolean collideSphere(Vector3f center, float radius, CollideShapeBodyCollectorCallback callback,
			MemorySegment userData, BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter) {
		try {
			vecTmp.set(center);

			MemorySegment query = jphBroadPhaseQuery;
			MemorySegment centerAddr = vecTmp.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1Addr = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2Addr = objectLayerFilter.memorySegment();

			MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_SPHERE;
			return (boolean) method.invokeExact(query, centerAddr, radius, callAddr, userData, filt1Addr, filt2Addr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call collide sphere: " + className);
		}
	}

	/**
	 * Get bodies intersecting with a point and add any hits to the
	 * collectorCallback.
	 */
	public boolean collidePoint(Vector3f point, CollideShapeBodyCollectorCallback callback, MemorySegment userData,
			BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter) {
		try {
			vecTmp.set(point);

			MemorySegment query = jphBroadPhaseQuery;
			MemorySegment pointAddr = vecTmp.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment filt1Addr = broadPhaseLayerFilter.memorySegment();
			MemorySegment filt2Addr = objectLayerFilter.memorySegment();

			MethodHandle method = JPH_BROAD_PHASE_QUERY_COLLIDE_POINT;
			return (boolean) method.invokeExact(query, pointAddr, callAddr, userData, filt1Addr, filt2Addr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call collide point: " + className);
		}
	}

}