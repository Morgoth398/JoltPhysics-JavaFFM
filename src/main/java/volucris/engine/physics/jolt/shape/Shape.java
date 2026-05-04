package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Matrix4f;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.DebugRenderer;
import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.MassProperties;
import volucris.engine.physics.jolt.PhysicsMaterial;
import volucris.engine.physics.jolt.filter.ShapeFilter;
import volucris.engine.physics.jolt.math.AABox;
import volucris.engine.physics.jolt.math.Mat4;
import volucris.engine.physics.jolt.math.SupportingFace;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.raycast.CastRayResultCallback;
import volucris.engine.physics.jolt.raycast.CollidePointResultCallback;
import volucris.engine.physics.jolt.raycast.CollisionCollectorType;
import volucris.engine.physics.jolt.raycast.RayCastResult;
import volucris.engine.physics.jolt.raycast.RayCastSettings;
import volucris.engine.physics.jolt.shape.ShapeEnums.ShapeSubType;
import volucris.engine.physics.jolt.shape.ShapeEnums.ShapeType;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Base class for all shapes (collision volume of a body). Defines a virtual
 * interface for collision detection.
 */
public sealed class Shape
		permits CompoundShape, ConvexShape, DecoratedShape, EmptyShape, HeightFieldShape, MeshShape, PlaneShape {

	private static final MethodHandle JPH_SHAPE_DRAW;
	private static final MethodHandle JPH_SHAPE_DESTROY;
	private static final MethodHandle JPH_SHAPE_GET_TYPE;
	private static final MethodHandle JPH_SHAPE_GET_SUB_TYPE;
	private static final MethodHandle JPH_SHAPE_GET_USER_DATA;
	private static final MethodHandle JPH_SHAPE_SET_USER_DATA;
	private static final MethodHandle JPH_SHAPE_MUST_BE_STATIC;
	private static final MethodHandle JPH_SHAPE_GET_CENTER_OF_MASS;
	private static final MethodHandle JPH_SHAPE_GET_LOCAL_BOUNDS;
	private static final MethodHandle JPH_SHAPE_GET_SUB_SHAPE_ID_BITS_RECURSIVE;
	private static final MethodHandle JPH_SHAPE_GET_WORLD_SPACE_BOUNDS;
	private static final MethodHandle JPH_SHAPE_GET_INNER_RADIUS;
	private static final MethodHandle JPH_SHAPE_GET_MASS_PROPERTIES;
	private static final MethodHandle JPH_SHAPE_GET_LEAF_SHAPE;
	private static final MethodHandle JPH_SHAPE_GET_MATERIAL;
	private static final MethodHandle JPH_SHAPE_GET_SURFACE_NORMAL;
	private static final MethodHandle JPH_SHAPE_GET_SUPPORTING_FACE;
	private static final MethodHandle JPH_SHAPE_GET_VOLUME;
	private static final MethodHandle JPH_SHAPE_IS_VALID_SCALE;
	private static final MethodHandle JPH_SHAPE_MAKE_SCALE_VALID;
	private static final MethodHandle JPH_SHAPE_SCALE_SHAPE;
	private static final MethodHandle JPH_SHAPE_CAST_RAY;
	private static final MethodHandle JPH_SHAPE_CAST_RAY2;
	private static final MethodHandle JPH_SHAPE_COLLIDE_POINT;
	private static final MethodHandle JPH_SHAPE_COLLIDE_POINT2;

	protected final MemorySegment jphShape;

	private Mat4 matTmp;

	protected Vec3 vecTmp;
	private Vec3 vecTmp2;

	static {
		//@formatter:off
		JPH_SHAPE_DRAW = downcallHandleVoid("JPH_Shape_Draw", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT, JAVA_BOOLEAN, JAVA_BOOLEAN);
		JPH_SHAPE_DESTROY = downcallHandleVoid("JPH_Shape_Destroy", ADDRESS);
		JPH_SHAPE_GET_TYPE = downcallHandle("JPH_Shape_GetType", JAVA_INT, ADDRESS);
		JPH_SHAPE_GET_SUB_TYPE = downcallHandle("JPH_Shape_GetSubType", JAVA_INT, ADDRESS);
		JPH_SHAPE_GET_USER_DATA = downcallHandle("JPH_Shape_GetUserData", JAVA_LONG, ADDRESS);
		JPH_SHAPE_SET_USER_DATA = downcallHandleVoid("JPH_Shape_SetUserData", ADDRESS, JAVA_LONG);
		JPH_SHAPE_MUST_BE_STATIC = downcallHandle("JPH_Shape_MustBeStatic", JAVA_BOOLEAN, ADDRESS);
		JPH_SHAPE_GET_CENTER_OF_MASS = downcallHandleVoid("JPH_Shape_GetCenterOfMass", ADDRESS, ADDRESS);
		JPH_SHAPE_GET_LOCAL_BOUNDS = downcallHandleVoid("JPH_Shape_GetLocalBounds", ADDRESS, ADDRESS);
		JPH_SHAPE_GET_SUB_SHAPE_ID_BITS_RECURSIVE = downcallHandle("JPH_Shape_GetSubShapeIDBitsRecursive", JAVA_INT, ADDRESS);
		JPH_SHAPE_GET_WORLD_SPACE_BOUNDS = downcallHandleVoid("JPH_Shape_GetWorldSpaceBounds", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SHAPE_GET_INNER_RADIUS = downcallHandle("JPH_Shape_GetInnerRadius", JAVA_FLOAT, ADDRESS);
		JPH_SHAPE_GET_MASS_PROPERTIES = downcallHandleVoid("JPH_Shape_GetMassProperties", ADDRESS, ADDRESS);
		JPH_SHAPE_GET_LEAF_SHAPE = downcallHandle("JPH_Shape_GetLeafShape", ADDRESS, ADDRESS, JAVA_INT, ADDRESS);
		JPH_SHAPE_GET_MATERIAL = downcallHandle("JPH_Shape_GetMaterial", ADDRESS, ADDRESS, JAVA_INT);
		JPH_SHAPE_GET_SURFACE_NORMAL = downcallHandleVoid("JPH_Shape_GetSurfaceNormal", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_SHAPE_GET_SUPPORTING_FACE = downcallHandleVoid("JPH_Shape_GetSupportingFace", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SHAPE_GET_VOLUME = downcallHandle("JPH_Shape_GetVolume", JAVA_FLOAT, ADDRESS);
		JPH_SHAPE_IS_VALID_SCALE = downcallHandle("JPH_Shape_IsValidScale", JAVA_BOOLEAN, ADDRESS, ADDRESS);
		JPH_SHAPE_MAKE_SCALE_VALID = downcallHandleVoid("JPH_Shape_MakeScaleValid", ADDRESS, ADDRESS, ADDRESS);
		JPH_SHAPE_SCALE_SHAPE = downcallHandle("JPH_Shape_ScaleShape", ADDRESS, ADDRESS, ADDRESS);
		JPH_SHAPE_CAST_RAY = downcallHandle("JPH_Shape_CastRay", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_SHAPE_CAST_RAY2 = downcallHandle("JPH_Shape_CastRay2", JAVA_BOOLEAN);
		JPH_SHAPE_COLLIDE_POINT = downcallHandle("JPH_Shape_CollidePoint", JAVA_BOOLEAN, ADDRESS, ADDRESS, ADDRESS);
		JPH_SHAPE_COLLIDE_POINT2 = downcallHandle("JPH_Shape_CollidePoint2", JAVA_BOOLEAN);
		//@formatter:on
	}

	protected Shape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected Shape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	public Shape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	public Shape(MemorySegment segment, Arena arena, boolean owns) {

		if (segment.equals(MemorySegment.NULL))
			throw new JoltRuntimeException("Created shape is not valid!");

		if (owns)
			jphShape = segment.reinterpret(arena, s -> destroy(s));
		else
			jphShape = segment;

		Jolt.addShape(jphShape.address(), this);

		matTmp = new Mat4(arena);
		vecTmp = new Vec3(arena);
		vecTmp2 = new Vec3(arena);
	}

	private static void destroy(MemorySegment segment) {
		try {
			Jolt.removeShape(segment.address());
			MethodHandle method = JPH_SHAPE_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy shape: " + className);
		}
	}

	/**
	 * Draw the shape at a particular location with a particular color (debugging
	 * purposes)
	 */
	public void draw(DebugRenderer renderer, Matrix4f centerOfMassTransform, Vector3f scale, int color,
			boolean useMaterialColors, boolean drawWireframe) {
		try {
			matTmp.set(centerOfMassTransform);
			vecTmp.set(scale);

			MemorySegment rendererAddr = renderer.memorySegment();
			MemorySegment matAddr = matTmp.memorySegment();
			MemorySegment vecAddr = vecTmp.memorySegment();

			MethodHandle method = JPH_SHAPE_DRAW;
			method.invokeExact(jphShape, rendererAddr, matAddr, vecAddr, color, useMaterialColors, drawWireframe);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot draw shape: " + className);
		}
	}

	/**
	 * Get type.
	 */
	public ShapeType getType() {
		try {
			MethodHandle method = JPH_SHAPE_GET_TYPE;
			int value = (int) method.invokeExact(jphShape);

			for (ShapeType type : ShapeType.values()) {
				if (value == type.id())
					return type;
			}

			throw new Throwable();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get shape type: " + className);
		}
	}

	/**
	 * Get sub type.
	 */
	public ShapeSubType getSubType() {
		try {
			MethodHandle method = JPH_SHAPE_GET_SUB_TYPE;
			int value = (int) method.invokeExact(jphShape);

			for (ShapeSubType type : ShapeSubType.values()) {
				if (value == type.id())
					return type;
			}

			throw new Throwable();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get shape sub type: " + className);
		}
	}

	/**
	 * Set the internal user data for the body.
	 * <p>
	 * The object is not passed to the native code.
	 */
	public void setInternalUserData(Object internalUserData) {
		Jolt.setInternalUserData(jphShape.address(), internalUserData);
	}

	/**
	 * Get the internal user data stored in the body.
	 * <p>
	 * The object is not passed to the native code.
	 */
	public Object getInternalUserData() {
		return Jolt.getInternalUserData(jphShape.address());
	}

	/**
	 * Set the user data for the body.
	 * <p>
	 * The object is not passed to the native code.
	 */
	public void setObjectUserData(Object userData) {
		Jolt.setUserData(jphShape.address(), userData);
	}

	/**
	 * Get the user data stored in the body.
	 */
	public Object getObjectUserData() {
		return Jolt.getUserData(jphShape.address());
	}

	/**
	 * User data (to be used freely by the application)
	 */
	public long getUserData() {
		try {
			MethodHandle method = JPH_SHAPE_GET_USER_DATA;
			return (long) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get user data: " + className);
		}
	}

	/**
	 * User data (to be used freely by the application)
	 */
	public void setUserData(long userData) {
		try {
			MethodHandle method = JPH_SHAPE_SET_USER_DATA;
			method.invokeExact(jphShape, userData);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set user data: " + className);
		}
	}

	/**
	 * Check if this shape can only be used to create a static body or if it can
	 * also be dynamic/kinematic.
	 */
	public boolean mustBeStatic() {
		try {
			MethodHandle method = JPH_SHAPE_MUST_BE_STATIC;
			return (boolean) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call mustBeStatic: " + className);
		}
	}

	/**
	 * All shapes are centered around their center of mass. This function returns
	 * the center of mass position that needs to be applied to transform the shape
	 * to where it was created.
	 */
	public Vector3f getCenterOfMass(Vector3f target) {
		try {
			MethodHandle method = JPH_SHAPE_GET_CENTER_OF_MASS;
			method.invokeExact(jphShape, vecTmp.memorySegment());

			return vecTmp.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get center of mass: " + className);
		}
	}

	/**
	 * All shapes are centered around their center of mass. This function returns
	 * the center of mass position that needs to be applied to transform the shape
	 * to where it was created.
	 */
	public Vector3f getCenterOfMass() {
		return getCenterOfMass(new Vector3f());
	}

	/**
	 * Get local bounding box including convex radius, this box is centered around
	 * the center of mass rather than the world transform.
	 */
	public AABox getLocalBounds(AABox target) {
		try {
			MethodHandle method = JPH_SHAPE_GET_LOCAL_BOUNDS;
			method.invokeExact(jphShape, target.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get local bounds: " + className);
		}
	}

	/**
	 * Get local bounding box including convex radius, this box is centered around
	 * the center of mass rather than the world transform.
	 */
	public AABox getLocalBounds() {
		return getLocalBounds(new AABox());
	}

	/**
	 * Get the max number of sub shape ID bits that are needed to be able to address
	 * any leaf shape in this shape. Used mainly for checking that it is smaller or
	 * equal than SubShapeID::MaxBits.
	 */
	public int getSubShapeIdBitsRecursive() {
		try {
			MethodHandle method = JPH_SHAPE_GET_SUB_SHAPE_ID_BITS_RECURSIVE;
			return (int) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get bits: " + className);
		}
	}

	/**
	 * Get world space bounds including convex radius.
	 */
	public AABox getWorldSpaceBounds(Matrix4f centerOfMassTransform, Vector3f scale, AABox target) {
		try {
			matTmp.set(centerOfMassTransform);
			vecTmp.set(scale);

			MethodHandle method = JPH_SHAPE_GET_WORLD_SPACE_BOUNDS;
			method.invokeExact(jphShape, matTmp.memorySegment(), vecTmp.memorySegment(), target.memorySegment());

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get world space bounds: " + className);
		}
	}

	/**
	 * Get world space bounds including convex radius.
	 */
	public AABox getWorldSpaceBounds(Matrix4f centerOfMassTransform, Vector3f scale) {
		return getWorldSpaceBounds(centerOfMassTransform, scale, new AABox());
	}

	/**
	 * Returns the radius of the biggest sphere that fits entirely in the shape. In
	 * case this shape consists of multiple sub shapes, it returns the smallest
	 * sphere of the parts. This can be used as a measure of how far the shape can
	 * be moved without risking going through geometry.
	 */
	public float getInnerRadius() {
		try {
			MethodHandle method = JPH_SHAPE_GET_INNER_RADIUS;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get inner radius: " + className);
		}
	}

	/**
	 * Calculate the mass and inertia of this shape.
	 */
	public MassProperties getMassProperties(MassProperties target) {
		try {
			MethodHandle method = JPH_SHAPE_GET_MASS_PROPERTIES;
			method.invokeExact(jphShape, target.memorySegment());
			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get mass properties: " + className);
		}
	}

	/**
	 * Calculate the mass and inertia of this shape.
	 */
	public MassProperties getMassProperties() {
		return getMassProperties(new MassProperties());
	}

	/**
	 * Get the leaf shape for a particular sub shape ID.
	 * 
	 * @return The shape or null if the sub shape ID is invalid
	 */
	public Shape getLeafShape(int subShapeID, int[] remainder) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment intPointer = arena.allocate(JAVA_INT);

			MethodHandle method = JPH_SHAPE_GET_LEAF_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShape, subShapeID, intPointer);

			remainder[0] = intPointer.getAtIndex(JAVA_INT, 0);

			if (segment.equals(MemorySegment.NULL))
				return null;

			Shape shape = Jolt.getShape(segment.address());
			if (shape != null)
				return shape;

			return new Shape(segment, true);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get leaf shape: " + className);
		}
	}

	/**
	 * Get the material assigned to a particular sub shape ID.
	 */
	public PhysicsMaterial getMaterial(int subShapeId) {
		try {
			MethodHandle method = JPH_SHAPE_GET_MATERIAL;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShape, subShapeId);

			if (segment.equals(MemorySegment.NULL))
				return null;

			PhysicsMaterial material = Jolt.getMaterial(segment.address());
			if (material != null)
				return material;

			return new PhysicsMaterial(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get material: " + className);
		}
	}

	/**
	 * Get the surface normal of a particular sub shape ID and point on surface (all
	 * vectors are relative to center of mass for this shape). Note: When you have a
	 * CollideShapeResult or ShapeCastResult you should use
	 * -mPenetrationAxis.Normalized() as contact normal as GetSurfaceNormal will
	 * only return face normals (and not vertex or edge normals).
	 */
	public Vector3f getSurfaceNormal(int subShapeId, Vector3f localPosition, Vector3f target) {
		try {
			vecTmp.set(localPosition);

			MethodHandle method = JPH_SHAPE_GET_SURFACE_NORMAL;
			method.invokeExact(jphShape, subShapeId, vecTmp.memorySegment(), vecTmp2.memorySegment());

			return vecTmp2.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get surface normal: " + className);
		}
	}

	/**
	 * @see #getSurfaceNormal(int, Vector3f, Vector3f)
	 */
	public Vector3f getSurfaceNormal(int subShapeId, Vector3f localPosition) {
		return getSurfaceNormal(subShapeId, localPosition, new Vector3f());
	}

	/**
	 * Get the vertices of the face that faces inDirection the most (includes any
	 * convex radius). Note that this function can only return faces of convex
	 * shapes or triangles, which is why a sub shape ID to get to that leaf must be
	 * provided.
	 * 
	 * @param subShapeID            Sub shape ID of target shape
	 * @param direction             Direction that the face should be facing (in
	 *                              local space to this shape)
	 * @param scale                 Scale in local space of the shape (scales
	 *                              relative to its center of mass)
	 * @param centerOfMassTransform Transform to transform outVertices with
	 * @param target                Resulting face. The returned face can be empty
	 *                              if the shape doesn't have polygons to return
	 *                              (e.g. because it's a sphere). The face will be
	 *                              returned in world space.
	 */
	public SupportingFace getSupportingFace(int subShapeID, Vector3f direction, Vector3f scale,
			Matrix4f centerOfMassTransform, SupportingFace target) {
		try {
			vecTmp.set(direction);
			vecTmp2.set(scale);
			matTmp.set(centerOfMassTransform);

			MemorySegment dirAddr = vecTmp.memorySegment();
			MemorySegment scaleAddr = vecTmp2.memorySegment();
			MemorySegment matAddr = matTmp.memorySegment();
			MemorySegment targetAddr = target.memorySegment();

			MethodHandle method = JPH_SHAPE_GET_SUPPORTING_FACE;
			method.invokeExact(jphShape, subShapeID, dirAddr, scaleAddr, matAddr, targetAddr);

			return target;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot call getSupportingFace: " + className);
		}
	}

	/**
	 * @see #getSupportingFace(int, Vector3f, Vector3f, Matrix4f, SupportingFace)
	 */
	public SupportingFace getSupportingFace(int subShapeID, Vector3f direction, Vector3f scale,
			Matrix4f centerOfMassTransform) {
		return getSupportingFace(subShapeID, direction, scale, centerOfMassTransform, new SupportingFace());
	}

	/**
	 * 
	 */
	public float getVolume() {
		try {
			MethodHandle method = JPH_SHAPE_GET_VOLUME;
			return (float) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get volume: " + className);
		}
	}

	/**
	 * Test if inScale is a valid scale for this shape. Some shapes can only be
	 * scaled uniformly, compound shapes cannot handle shapes being rotated and
	 * scaled (this would cause shearing), scale can never be zero. When the scale
	 * is invalid, the function will return false.
	 * <p>
	 * Here's a list of supported scales:
	 * <ul>
	 * <li>SphereShape: Scale must be uniform (signs of scale are ignored).
	 * <li>BoxShape: Any scale supported (signs of scale are ignored).
	 * <li>TriangleShape: Any scale supported when convex radius is zero, otherwise
	 * only uniform scale supported.
	 * <li>CapsuleShape: Scale must be uniform (signs of scale are ignored).
	 * <li>TaperedCapsuleShape: Scale must be uniform (sign of Y scale can be used
	 * to flip the capsule).
	 * <li>CylinderShape: Scale must be uniform in XZ plane, Y can scale
	 * independently (signs of scale are ignored).
	 * <li>RotatedTranslatedShape: Scale must not cause shear in the child shape.
	 * <li>CompoundShape: Scale must not cause shear in any of the child shapes.
	 * </ul>
	 */
	public boolean isValidScale(Vector3f scale) {
		try {
			vecTmp.set(scale);

			MethodHandle method = JPH_SHAPE_IS_VALID_SCALE;
			return (boolean) method.invokeExact(jphShape, vecTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot check if scale is valid: " + className);
		}
	}

	/**
	 * This function will make sure that if you wrap this shape in a ScaledShape
	 * that the scale is valid. Note that this involves discarding components of the
	 * scale that are invalid, so the resulting scaled shape may be different than
	 * the requested scale. Compare the return value of this function with the scale
	 * you passed in to detect major inconsistencies and possibly warn the user.
	 */
	public Vector3f makeScaleValid(Vector3f scale, Vector3f target) {
		try {
			vecTmp.set(scale);

			MethodHandle method = JPH_SHAPE_MAKE_SCALE_VALID;
			method.invokeExact(jphShape, vecTmp.memorySegment(), vecTmp2.memorySegment());

			return vecTmp2.get(target);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot make scale valid: " + className);
		}
	}

	/**
	 * Scale this shape. Note that not all shapes support all scales, this will
	 * return a shape that matches the scale as accurately as possible. See
	 * Shape::IsValidScale for more information.
	 */
	public Shape scaleShape(Vector3f scale) {
		try {
			vecTmp.set(scale);

			MethodHandle method = JPH_SHAPE_SCALE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShape, vecTmp.memorySegment());

			return new Shape(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot scale shape: " + className);
		}
	}

	/**
	 * 
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, RayCastResult target) {
		try {
			vecTmp.set(origin);
			vecTmp2.set(direction);

			MemorySegment origAddr = vecTmp.memorySegment();
			MemorySegment dirAddr = vecTmp2.memorySegment();

			MethodHandle method = JPH_SHAPE_CAST_RAY;
			return (boolean) method.invokeExact(jphShape, origAddr, dirAddr, target.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot cast ray: " + className);
		}
	}

	/**
	 * Cast a ray against this shape, returns true if it finds a hit closer than
	 * ioHit.mFraction and updates that fraction. Otherwise ioHit is left untouched
	 * and the function returns false. Note that the ray should be relative to the
	 * center of mass of this shape (i.e. subtract Shape::GetCenterOfMass() from
	 * RayCast::mOrigin if you want to cast against the shape in the space it was
	 * created). Convex objects will be treated as solid (meaning if the ray starts
	 * inside, you'll get a hit fraction of 0) and back face hits against triangles
	 * are returned. If you want the surface normal of the hit use
	 * GetSurfaceNormal(ioHit.mSubShapeID2, inRay.GetPointOnRay(ioHit.mFraction)).
	 */
	public boolean castRay(Vector3f origin, Vector3f direction, RayCastSettings rayCastSettings,
			CollisionCollectorType collectorType, CastRayResultCallback callback, ShapeFilter shapeFilter) {
		try {
			vecTmp.set(origin);
			vecTmp2.set(direction);

			MemorySegment origAddr = vecTmp.memorySegment();
			MemorySegment dirAddr = vecTmp2.memorySegment();
			MemorySegment settAddr = rayCastSettings.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment data = MemorySegment.NULL;
			MemorySegment filtAddr = shapeFilter.memorySegment();

			int type = collectorType.id();

			MethodHandle method = JPH_SHAPE_CAST_RAY2;
			return (boolean) method.invokeExact(jphShape, origAddr, dirAddr, settAddr, type, callAddr, data, filtAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot cast ray: " + className);
		}
	}

	/**
	 * Check if point is inside this shape. For this tests all shapes are treated as
	 * if they were solid. Note that inPoint should be relative to the center of
	 * mass of this shape (i.e. subtract Shape::GetCenterOfMass() from inPoint if
	 * you want to test against the shape in the space it was created). For a mesh
	 * shape, this test will only provide sensible information if the mesh is a
	 * closed manifold. For each shape that collides, ioCollector will receive a
	 * hit.
	 */
	public boolean collidePoint(Vector3f point, ShapeFilter shapeFilter) {
		try {
			vecTmp.set(point);

			MethodHandle method = JPH_SHAPE_COLLIDE_POINT;
			return (boolean) method.invokeExact(jphShape, vecTmp.memorySegment(), shapeFilter.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot collide point: " + className);
		}
	}

	/**
	 * @see #collidePoint(Vector3f, ShapeFilter)
	 */
	public boolean collidePoint(Vector3f point, CollisionCollectorType collectorType,
			CollidePointResultCallback callback, ShapeFilter shapeFilter) {
		try {
			vecTmp.set(point);

			MemorySegment pointAddr = vecTmp.memorySegment();
			MemorySegment callAddr = callback.memorySegment();
			MemorySegment data = MemorySegment.NULL;
			MemorySegment filtAddr = shapeFilter.memorySegment();

			int type = collectorType.id();

			MethodHandle method = JPH_SHAPE_COLLIDE_POINT2;
			return (boolean) method.invokeExact(jphShape, pointAddr, type, callAddr, data, filtAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot collide point: " + className);
		}
	}

	/**
	 * The method does not check if the memory segment points to a CompoundShape, so
	 * make sure of that first.
	 */
	public CompoundShape asCompoundShape() {
		if (this instanceof CompoundShape s)
			return s;

		return new CompoundShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a ConvexShape, so
	 * make sure of that first.
	 */
	public ConvexShape asConvexShape() {
		if (this instanceof ConvexShape s)
			return s;

		return new ConvexShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a DecoratedShape,
	 * so make sure of that first.
	 */
	public DecoratedShape asDecoratedShape() {
		if (this instanceof DecoratedShape s)
			return s;

		return new DecoratedShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a EmptyShape, so
	 * make sure of that first.
	 */
	public EmptyShape asEmptyShape() {
		if (this instanceof EmptyShape s)
			return s;

		return new EmptyShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a HeightFieldShape,
	 * so make sure of that first.
	 */
	public HeightFieldShape asHeightFieldShape() {
		if (this instanceof HeightFieldShape s)
			return s;

		return new HeightFieldShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a MeshShape, so
	 * make sure of that first.
	 */
	public MeshShape asMeshShape() {
		if (this instanceof MeshShape s)
			return s;

		return new MeshShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a PlaneShape, so
	 * make sure of that first.
	 */
	public PlaneShape asPlaneShape() {
		if (this instanceof PlaneShape s)
			return s;

		return new PlaneShape(jphShape, false);
	}

	public MemorySegment memorySegment() {
		return jphShape;
	}

}