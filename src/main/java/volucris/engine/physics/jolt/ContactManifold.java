package volucris.engine.physics.jolt;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Manifold class, describes the contact surface between two bodies.
 */
public final class ContactManifold {

	private static final MethodHandle JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL;
	private static final MethodHandle JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH;
	private static final MethodHandle JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1;
	private static final MethodHandle JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2;
	private static final MethodHandle JPH_CONTACT_MANIFOLD_GET_POINT_COUNT;
	private static final MethodHandle JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1;
	private static final MethodHandle JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2;

	private final MemorySegment jphContactManifold;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceNormal", ADDRESS, ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH = downcallHandle("JPH_ContactManifold_GetPenetrationDepth", JAVA_FLOAT, ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1 = downcallHandle("JPH_ContactManifold_GetSubShapeID1", JAVA_INT, ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2 = downcallHandle("JPH_ContactManifold_GetSubShapeID2", JAVA_INT, ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_POINT_COUNT = downcallHandle("JPH_ContactManifold_GetPointCount", JAVA_INT, ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1 = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceContactPointOn1", ADDRESS, JAVA_INT, ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2 = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceContactPointOn2", ADDRESS, JAVA_INT, ADDRESS);
		//@formatter:on
	}

	public ContactManifold() {
		this(Arena.ofAuto());
	}

	public ContactManifold(Arena arena) {
		jphContactManifold = arena.allocate(ADDRESS);

		vecTmp = new Vec3(arena);
	}

	public void set(MemorySegment segment) {
		jphContactManifold.set(ADDRESS, 0, segment);
	}

	/**
	 * Normal for this manifold, direction along which to move body 2 out of
	 * collision along the shortest path.
	 */
	public Vector3f getWorldSpaceNormal(Vector3f target) {
		try {
			MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL;
			method.invokeExact(memorySegment(), vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get world space normal.");
		}
	}

	/**
	 * Normal for this manifold, direction along which to move body 2 out of
	 * collision along the shortest path.
	 */
	public Vector3f getWorldSpaceNormal() {
		return getWorldSpaceNormal(new Vector3f());
	}

	/**
	 * Penetration depth (move shape 2 by this distance to resolve the collision).
	 * If this value is negative, this is a speculative contact point and may not
	 * actually result in a velocity change as during solving the bodies may not
	 * actually collide.
	 */
	public float getPenetrationDepth() {
		try {
			MethodHandle method = JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH;
			return (float) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get penetration depth.");
		}
	}

	/**
	 * Sub shapes that formed this manifold (note that when multiple manifolds are
	 * combined because they're coplanar, we lose some information here because we
	 * only keep track of one sub shape pair that we encounter, see description at
	 * {@link Body#setUseManifoldReduction(boolean)}
	 */
	public int getSubShapeID1() {
		try {
			MethodHandle method = JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1;
			return (int) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get sub shape Id 1.");
		}
	}

	/**
	 * @see #getSubShapeID1()
	 */
	public int getSubShapeID2() {
		try {
			MethodHandle method = JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2;
			return (int) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get sub shape Id 2.");
		}
	}

	/**
	 * 
	 */
	public int getPointCount() {
		try {
			MethodHandle method = JPH_CONTACT_MANIFOLD_GET_POINT_COUNT;
			return (int) method.invokeExact(memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot getPointCount.");
		}
	}

	/**
	 * Access to the world space contact positions. 
	 */
	public Vector3f getWorldSpaceContactPointOn1(int index, Vector3f target) {
		try {
			MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1;
			method.invokeExact(memorySegment(), index, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get world space contact point on 1.");
		}
	}

	/**
	 * Access to the world space contact positions. 
	 */
	public Vector3f getWorldSpaceContactPointOn1(int index) {
		return getWorldSpaceContactPointOn1(index, new Vector3f());
	}

	/**
	 * Access to the world space contact positions. 
	 */
	public Vector3f getWorldSpaceContactPointOn2(int index, Vector3f target) {
		try {
			MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2;
			method.invokeExact(memorySegment(), index, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot get world space contact point on 2.");
		}
	}

	/**
	 * Access to the world space contact positions. 
	 */
	public Vector3f getWorldSpaceContactPointOn2(int index) {
		return getWorldSpaceContactPointOn2(index, new Vector3f());
	}

	public MemorySegment memorySegment() {
		return jphContactManifold.get(ADDRESS, 0);
	}

}