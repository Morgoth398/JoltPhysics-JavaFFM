/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.jolt.SupportingFace;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.CollideShapeCollector;
import volucris.bindings.jolt.collision.shape.GetTrianglesContext;
import volucris.bindings.jolt.collision.shape.Shape;
import volucris.bindings.jolt.collision.shape.ShapeRefConst;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.collision.shape.SubShapeIDCreator;
import volucris.bindings.jolt.geometry.AABox;
import volucris.bindings.jolt.math.Float3;
import volucris.bindings.jolt.math.Mat44;
import volucris.bindings.jolt.math.Quat;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class TransformedShape {

	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_SHAPE_POSITION_COM;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_SET_SHAPE_POSITION_COM;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_SHAPE_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_SET_SHAPE_ROTATION;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_SET_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_SET_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_IDCREATOR;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_SET_SUB_SHAPE_IDCREATOR;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_CAST_RAY;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_CAST_RAY1;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_COLLIDE_POINT;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_COLLIDE_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_CAST_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_COLLECT_TRANSFORMED_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_TRIANGLES_START;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_TRIANGLES_NEXT;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_SHAPE_SCALE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_SET_SHAPE_SCALE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_CENTER_OF_MASS_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_INVERSE_CENTER_OF_MASS_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_SET_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_SET_WORLD_TRANSFORM1;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_WORLD_TRANSFORM;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_WORLD_SPACE_BOUNDS;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_MAKE_SUB_SHAPE_IDRELATIVE_TO_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_WORLD_SPACE_SURFACE_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_SUPPORTING_FACE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_MATERIAL;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_USER_DATA;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_TRANSFORMED_SHAPE;
	private static final LazyConstant<MethodHandle> JPH_TRANSFORMED_SHAPE_S_GET_BODY_ID;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_TRANSFORMED_SHAPE_CREATE = downcallHandle("JPH_TransformedShape_Create", UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_CREATE1 = downcallHandle("JPH_TransformedShape_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_DESTROY = downcallHandleVoid("JPH_TransformedShape_Destroy", UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_SHAPE_POSITION_COM = downcallHandleVoid("JPH_TransformedShape_GetShapePositionCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_SET_SHAPE_POSITION_COM = downcallHandleVoid("JPH_TransformedShape_SetShapePositionCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_SHAPE_ROTATION = downcallHandleVoid("JPH_TransformedShape_GetShapeRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_SET_SHAPE_ROTATION = downcallHandleVoid("JPH_TransformedShape_SetShapeRotation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_SHAPE = downcallHandleVoid("JPH_TransformedShape_GetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_SET_SHAPE = downcallHandleVoid("JPH_TransformedShape_SetShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_BODY_ID = downcallHandleVoid("JPH_TransformedShape_GetBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_SET_BODY_ID = downcallHandleVoid("JPH_TransformedShape_SetBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_IDCREATOR = downcallHandleVoid("JPH_TransformedShape_GetSubShapeIDCreator", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_SET_SUB_SHAPE_IDCREATOR = downcallHandleVoid("JPH_TransformedShape_SetSubShapeIDCreator", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_CAST_RAY = downcallHandle("JPH_TransformedShape_CastRay", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_CAST_RAY1 = downcallHandleVoid("JPH_TransformedShape_CastRay1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_COLLIDE_POINT = downcallHandleVoid("JPH_TransformedShape_CollidePoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_COLLIDE_SHAPE = downcallHandleVoid("JPH_TransformedShape_CollideShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_CAST_SHAPE = downcallHandleVoid("JPH_TransformedShape_CastShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_COLLECT_TRANSFORMED_SHAPES = downcallHandleVoid("JPH_TransformedShape_CollectTransformedShapes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_TRIANGLES_START = downcallHandleVoid("JPH_TransformedShape_GetTrianglesStart", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_TRIANGLES_NEXT = downcallHandle("JPH_TransformedShape_GetTrianglesNext", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_SHAPE_SCALE = downcallHandleVoid("JPH_TransformedShape_GetShapeScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_SET_SHAPE_SCALE = downcallHandleVoid("JPH_TransformedShape_SetShapeScale", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_TransformedShape_GetCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_INVERSE_CENTER_OF_MASS_TRANSFORM = downcallHandleVoid("JPH_TransformedShape_GetInverseCenterOfMassTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_SET_WORLD_TRANSFORM = downcallHandleVoid("JPH_TransformedShape_SetWorldTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_SET_WORLD_TRANSFORM1 = downcallHandleVoid("JPH_TransformedShape_SetWorldTransform1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_WORLD_TRANSFORM = downcallHandleVoid("JPH_TransformedShape_GetWorldTransform", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_WORLD_SPACE_BOUNDS = downcallHandleVoid("JPH_TransformedShape_GetWorldSpaceBounds", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_MAKE_SUB_SHAPE_IDRELATIVE_TO_SHAPE = downcallHandleVoid("JPH_TransformedShape_MakeSubShapeIDRelativeToShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_WORLD_SPACE_SURFACE_NORMAL = downcallHandleVoid("JPH_TransformedShape_GetWorldSpaceSurfaceNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_SUPPORTING_FACE = downcallHandleVoid("JPH_TransformedShape_GetSupportingFace", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_MATERIAL = downcallHandle("JPH_TransformedShape_GetMaterial", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_USER_DATA = downcallHandle("JPH_TransformedShape_GetSubShapeUserData", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_TRANSFORMED_SHAPE = downcallHandleVoid("JPH_TransformedShape_GetSubShapeTransformedShape", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_TRANSFORMED_SHAPE_S_GET_BODY_ID = downcallHandleVoid("JPH_TransformedShape_sGetBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public TransformedShape() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public TransformedShape(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public TransformedShape(
	    Vec3 inPositionCOM,
	    Quat inRotation,
	    Shape inShape,
	    BodyID inBodyID,
	    SubShapeIDCreator inSubShapeIDCreator
	) {
	    this(
	        Arena.ofAuto(),
	        inPositionCOM,
	        inRotation,
	        inShape,
	        inBodyID,
	        inSubShapeIDCreator
	    );
	}
	
	/// Typed method of [#create1].
	public TransformedShape(
		Arena arena,
		Vec3 inPositionCOM,
		Quat inRotation,
		Shape inShape,
		BodyID inBodyID,
		SubShapeIDCreator inSubShapeIDCreator
	) {
		MemorySegment segment = create1(
			inPositionCOM.memorySegment(),
			inRotation.memorySegment(),
			inShape.memorySegment(),
			inBodyID.memorySegment(),
			inSubShapeIDCreator.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public TransformedShape(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment create1(
    	MemorySegment inPositionCOM,
    	MemorySegment inRotation,
    	MemorySegment inShape,
    	MemorySegment inBodyID,
    	MemorySegment inSubShapeIDCreator
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inPositionCOM,
    			inRotation,
    			inShape,
    			inBodyID,
    			inSubShapeIDCreator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Center of mass world position of the shape
    /// ```
    public static void getShapePositionCOM(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_SHAPE_POSITION_COM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShapePositionCOM].
    public final void getShapePositionCOM(
    	Vec3 outResult
    ) {
    	getShapePositionCOM(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Center of mass world position of the shape
    /// ```
    public static void setShapePositionCOM(
    	MemorySegment self,
    	MemorySegment mShapePositionCOM
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_SET_SHAPE_POSITION_COM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShapePositionCOM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShapePositionCOM].
    public final void setShapePositionCOM(
    	Vec3 mShapePositionCOM
    ) {
    	setShapePositionCOM(
    		this.segment,
    		mShapePositionCOM.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation of the shape
    /// ```
    public static void getShapeRotation(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_SHAPE_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShapeRotation].
    public final void getShapeRotation(
    	Quat outResult
    ) {
    	getShapeRotation(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Rotation of the shape
    /// ```
    public static void setShapeRotation(
    	MemorySegment self,
    	MemorySegment mShapeRotation
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_SET_SHAPE_ROTATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShapeRotation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShapeRotation].
    public final void setShapeRotation(
    	Quat mShapeRotation
    ) {
    	setShapeRotation(
    		this.segment,
    		mShapeRotation.memorySegment()
    	);
    }
    
    /// ```
    /// The shape itself
    /// ```
    public static void getShape(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShape].
    public final void getShape(
    	ShapeRefConst outResult
    ) {
    	getShape(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The shape itself
    /// ```
    public static void setShape(
    	MemorySegment self,
    	MemorySegment mShape
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_SET_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape].
    public final void setShape(
    	ShapeRefConst mShape
    ) {
    	setShape(
    		this.segment,
    		mShape.memorySegment()
    	);
    }
    
    /// ```
    /// Optional body ID from which this shape comes
    /// ```
    public static void getBodyID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyID].
    public final void getBodyID(
    	BodyID outResult
    ) {
    	getBodyID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Optional body ID from which this shape comes
    /// ```
    public static void setBodyID(
    	MemorySegment self,
    	MemorySegment mBodyID
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_SET_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyID].
    public final void setBodyID(
    	BodyID mBodyID
    ) {
    	setBodyID(
    		this.segment,
    		mBodyID.memorySegment()
    	);
    }
    
    /// ```
    /// Optional sub shape ID creator for the shape (can be used when expanding compound shapes into multiple transformed shapes)
    /// ```
    public static void getSubShapeIDCreator(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_IDCREATOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeIDCreator].
    public final void getSubShapeIDCreator(
    	SubShapeIDCreator outResult
    ) {
    	getSubShapeIDCreator(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Optional sub shape ID creator for the shape (can be used when expanding compound shapes into multiple transformed shapes)
    /// ```
    public static void setSubShapeIDCreator(
    	MemorySegment self,
    	MemorySegment mSubShapeIDCreator
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_SET_SUB_SHAPE_IDCREATOR.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSubShapeIDCreator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSubShapeIDCreator].
    public final void setSubShapeIDCreator(
    	SubShapeIDCreator mSubShapeIDCreator
    ) {
    	setSubShapeIDCreator(
    		this.segment,
    		mSubShapeIDCreator.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a ray and find the closest hit. Returns true if it finds a hit. Hits further than ioHit.mFraction will not be considered and in this case ioHit will remain unmodified (and the function will return false).
    /// Convex objects will be treated as solid (meaning if the ray starts inside, you'll get a hit fraction of 0) and back face hits are returned.
    /// If you want the surface normal of the hit use GetWorldSpaceSurfaceNormal(ioHit.mSubShapeID2, inRay.GetPointOnRay(ioHit.mFraction)) on this object.
    /// ```
    public static boolean castRay(
    	MemorySegment self,
    	MemorySegment inRay,
    	MemorySegment ioHit
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_CAST_RAY.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inRay,
    			ioHit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#castRay].
    public final boolean castRay(
    	RRayCast inRay,
    	RayCastResult ioHit
    ) {
    	return castRay(
    		this.segment,
    		inRay.memorySegment(),
    		ioHit.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a ray, allows collecting multiple hits. Note that this version is more flexible but also slightly slower than the CastRay function that returns only a single hit.
    /// If you want the surface normal of the hit use GetWorldSpaceSurfaceNormal(collected sub shape ID, inRay.GetPointOnRay(collected fraction)) on this object.
    /// ```
    public static void castRay1(
    	MemorySegment self,
    	MemorySegment inRay,
    	MemorySegment inRayCastSettings,
    	MemorySegment ioCollector,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_CAST_RAY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inRay,
    			inRayCastSettings,
    			ioCollector,
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
    	ShapeFilter inShapeFilter
    ) {
    	castRay1(
    		this.segment,
    		inRay.memorySegment(),
    		inRayCastSettings.memorySegment(),
    		ioCollector.memorySegment(),
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
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_COLLIDE_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPoint,
    			ioCollector,
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
    	ShapeFilter inShapeFilter
    ) {
    	collidePoint(
    		this.segment,
    		inPoint.memorySegment(),
    		ioCollector.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Collide a shape and report any hits to ioCollector
    /// @param inShape Shape to test
    /// @param inShapeScale Scale in local space of shape
    /// @param inCenterOfMassTransform Center of mass transform for the shape
    /// @param inCollideShapeSettings Settings
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. mShapePositionCOM since floats are most accurate near the origin
    /// @param ioCollector Collector that receives the hits
    /// @param inShapeFilter Filter that allows you to reject collisions
    /// ```
    public static void collideShape(
    	MemorySegment self,
    	MemorySegment inShape,
    	MemorySegment inShapeScale,
    	MemorySegment inCenterOfMassTransform,
    	MemorySegment inCollideShapeSettings,
    	MemorySegment inBaseOffset,
    	MemorySegment ioCollector,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_COLLIDE_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShape,
    			inShapeScale,
    			inCenterOfMassTransform,
    			inCollideShapeSettings,
    			inBaseOffset,
    			ioCollector,
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
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Cast a shape and report any hits to ioCollector
    /// @param inShapeCast The shape cast and its position and direction
    /// @param inShapeCastSettings Settings for the shape cast
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. mShapePositionCOM or inShapeCast.mCenterOfMassStart.GetTranslation() since floats are most accurate near the origin
    /// @param ioCollector Collector that receives the hits
    /// @param inShapeFilter Filter that allows you to reject collisions
    /// ```
    public static void castShape(
    	MemorySegment self,
    	MemorySegment inShapeCast,
    	MemorySegment inShapeCastSettings,
    	MemorySegment inBaseOffset,
    	MemorySegment ioCollector,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_CAST_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inShapeCast,
    			inShapeCastSettings,
    			inBaseOffset,
    			ioCollector,
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
    	ShapeFilter inShapeFilter
    ) {
    	castShape(
    		this.segment,
    		inShapeCast.memorySegment(),
    		inShapeCastSettings.memorySegment(),
    		inBaseOffset.memorySegment(),
    		ioCollector.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// Collect the leaf transformed shapes of all leaf shapes of this shape
    /// inBox is the world space axis aligned box which leaf shapes should collide with
    /// ```
    public static void collectTransformedShapes(
    	MemorySegment self,
    	MemorySegment inBox,
    	MemorySegment ioCollector,
    	MemorySegment inShapeFilter
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_COLLECT_TRANSFORMED_SHAPES.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBox,
    			ioCollector,
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
    	ShapeFilter inShapeFilter
    ) {
    	collectTransformedShapes(
    		this.segment,
    		inBox.memorySegment(),
    		ioCollector.memorySegment(),
    		inShapeFilter.memorySegment()
    	);
    }
    
    /// ```
    /// To start iterating over triangles, call this function first.
    /// To get the actual triangles call GetTrianglesNext.
    /// @param ioContext A temporary buffer and should remain untouched until the last call to GetTrianglesNext.
    /// @param inBox The world space bounding in which you want to get the triangles.
    /// @param inBaseOffset All hit results will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. inBox.GetCenter() since floats are most accurate near the origin
    /// ```
    public static void getTrianglesStart(
    	MemorySegment self,
    	MemorySegment ioContext,
    	MemorySegment inBox,
    	MemorySegment inBaseOffset
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_TRIANGLES_START.get();
    	try {
    		 method.invokeExact(
    			self,
    			ioContext,
    			inBox,
    			inBaseOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTrianglesStart].
    public final void getTrianglesStart(
    	GetTrianglesContext ioContext,
    	AABox inBox,
    	Vec3 inBaseOffset
    ) {
    	getTrianglesStart(
    		this.segment,
    		ioContext.memorySegment(),
    		inBox.memorySegment(),
    		inBaseOffset.memorySegment()
    	);
    }
    
    /// ```
    /// Call this repeatedly to get all triangles in the box.
    /// outTriangleVertices should be large enough to hold 3 * inMaxTriangleRequested entries
    /// outMaterials (if it is not null) should contain inMaxTrianglesRequested entries
    /// The function returns the amount of triangles that it found (which will be <= inMaxTrianglesRequested), or 0 if there are no more triangles.
    /// Note that the function can return a value < inMaxTrianglesRequested and still have more triangles to process (triangles can be returned in blocks)
    /// Note that the function may return triangles outside of the requested box, only coarse culling is performed on the returned triangles
    /// ```
    public static int getTrianglesNext(
    	MemorySegment self,
    	MemorySegment ioContext,
    	int inMaxTrianglesRequested,
    	MemorySegment outTriangleVertices,
    	MemorySegment outMaterials
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_TRIANGLES_NEXT.get();
    	try {
    		return (int) method.invokeExact(
    			self,
    			ioContext,
    			inMaxTrianglesRequested,
    			outTriangleVertices,
    			outMaterials
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTrianglesNext].
    public final int getTrianglesNext(
    	GetTrianglesContext ioContext,
    	int inMaxTrianglesRequested,
    	Float3 outTriangleVertices,
    	NativePointerArray outMaterials
    ) {
    	return getTrianglesNext(
    		this.segment,
    		ioContext.memorySegment(),
    		inMaxTrianglesRequested,
    		outTriangleVertices.memorySegment(),
    		outMaterials.memorySegment()
    	);
    }
    
    /// ```
    /// Get/set the scale of the shape as a Vec3
    /// ```
    public static void getShapeScale(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_SHAPE_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShapeScale].
    public final void getShapeScale(
    	Vec3 outResult
    ) {
    	getShapeScale(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public static void setShapeScale(
    	MemorySegment self,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_SET_SHAPE_SCALE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShapeScale].
    public final void setShapeScale(
    	Vec3 inScale
    ) {
    	setShapeScale(
    		this.segment,
    		inScale.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates the transform for this shape's center of mass (excluding scale)
    /// ```
    public static void getCenterOfMassTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_CENTER_OF_MASS_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCenterOfMassTransform].
    public final void getCenterOfMassTransform(
    	Mat44 outResult
    ) {
    	getCenterOfMassTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates the inverse of the transform for this shape's center of mass (excluding scale)
    /// ```
    public static void getInverseCenterOfMassTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_INVERSE_CENTER_OF_MASS_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInverseCenterOfMassTransform].
    public final void getInverseCenterOfMassTransform(
    	Mat44 outResult
    ) {
    	getInverseCenterOfMassTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sets the world transform (including scale) of this transformed shape (not from the center of mass but in the space the shape was created)
    /// ```
    public static void setWorldTransform(
    	MemorySegment self,
    	MemorySegment inPosition,
    	MemorySegment inRotation,
    	MemorySegment inScale
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_SET_WORLD_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			inPosition,
    			inRotation,
    			inScale
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWorldTransform].
    public final void setWorldTransform(
    	Vec3 inPosition,
    	Quat inRotation,
    	Vec3 inScale
    ) {
    	setWorldTransform(
    		this.segment,
    		inPosition.memorySegment(),
    		inRotation.memorySegment(),
    		inScale.memorySegment()
    	);
    }
    
    /// ```
    /// Sets the world transform (including scale) of this transformed shape (not from the center of mass but in the space the shape was created)
    /// ```
    public static void setWorldTransform1(
    	MemorySegment self,
    	MemorySegment inTransform
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_SET_WORLD_TRANSFORM1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTransform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWorldTransform1].
    public final void setWorldTransform1(
    	Mat44 inTransform
    ) {
    	setWorldTransform1(
    		this.segment,
    		inTransform.memorySegment()
    	);
    }
    
    /// ```
    /// Calculates the world transform including scale of this shape (not from the center of mass but in the space the shape was created)
    /// ```
    public static void getWorldTransform(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_WORLD_TRANSFORM.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldTransform].
    public final void getWorldTransform(
    	Mat44 outResult
    ) {
    	getWorldTransform(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the world space bounding box for this transformed shape
    /// ```
    public static void getWorldSpaceBounds(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_WORLD_SPACE_BOUNDS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceBounds].
    public final void getWorldSpaceBounds(
    	AABox outResult
    ) {
    	getWorldSpaceBounds(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Make inSubShapeID relative to mShape. When mSubShapeIDCreator is not empty, this is needed in order to get the correct path to the sub shape.
    /// ```
    public static void makeSubShapeIDRelativeToShape(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_MAKE_SUB_SHAPE_IDRELATIVE_TO_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#makeSubShapeIDRelativeToShape].
    public final void makeSubShapeIDRelativeToShape(
    	SubShapeID inSubShapeID,
    	SubShapeID outResult
    ) {
    	makeSubShapeIDRelativeToShape(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get surface normal of a particular sub shape and its world space surface position on this body.
    /// Note: When you have a CollideShapeResult or ShapeCastResult you should use -mPenetrationAxis.Normalized() as contact normal as GetWorldSpaceSurfaceNormal will only return face normals (and not vertex or edge normals).
    /// ```
    public static void getWorldSpaceSurfaceNormal(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment inPosition,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_WORLD_SPACE_SURFACE_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			inPosition,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceSurfaceNormal].
    public final void getWorldSpaceSurfaceNormal(
    	SubShapeID inSubShapeID,
    	Vec3 inPosition,
    	Vec3 outResult
    ) {
    	getWorldSpaceSurfaceNormal(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		inPosition.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the vertices of the face that faces inDirection the most (includes any convex radius). Note that this function can only return faces of
    /// convex shapes or triangles, which is why a sub shape ID to get to that leaf must be provided.
    /// @param inSubShapeID Sub shape ID of target shape
    /// @param inDirection Direction that the face should be facing (in world space)
    /// @param inBaseOffset The vertices will be returned relative to this offset, can be zero to get results in world position, but when you're testing far from the origin you get better precision by picking a position that's closer e.g. mShapePositionCOM since floats are most accurate near the origin
    /// @param outVertices Resulting face. Note the returned face can have a single point if the shape doesn't have polygons to return (e.g. because it's a sphere). The face will be returned in world space.
    /// ```
    public static void getSupportingFace(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment inDirection,
    	MemorySegment inBaseOffset,
    	MemorySegment outVertices
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_SUPPORTING_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			inDirection,
    			inBaseOffset,
    			outVertices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSupportingFace].
    public final void getSupportingFace(
    	SubShapeID inSubShapeID,
    	Vec3 inDirection,
    	Vec3 inBaseOffset,
    	SupportingFace outVertices
    ) {
    	getSupportingFace(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		inDirection.memorySegment(),
    		inBaseOffset.memorySegment(),
    		outVertices.memorySegment()
    	);
    }
    
    /// ```
    /// Get material of a particular sub shape
    /// ```
    public static MemorySegment getMaterial(
    	MemorySegment self,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_MATERIAL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaterial].
    public final @Nullable PhysicsMaterial getMaterial(
    	SubShapeID inSubShapeID
    ) {
    	MemorySegment segment = getMaterial(
    		this.segment,
    		inSubShapeID.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new PhysicsMaterial(segment);
    }
    
    /// ```
    /// Get the user data of a particular sub shape
    /// ```
    public static long getSubShapeUserData(
    	MemorySegment self,
    	MemorySegment inSubShapeID
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_USER_DATA.get();
    	try {
    		return (long) method.invokeExact(
    			self,
    			inSubShapeID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeUserData].
    public final long getSubShapeUserData(
    	SubShapeID inSubShapeID
    ) {
    	return getSubShapeUserData(
    		this.segment,
    		inSubShapeID.memorySegment()
    	);
    }
    
    /// ```
    /// Get the direct child sub shape and its transform for a sub shape ID.
    /// @param inSubShapeID Sub shape ID that indicates the path to the leaf shape
    /// @param outRemainder The remainder of the sub shape ID after removing the sub shape
    /// @return Direct child sub shape and its transform, note that the body ID and sub shape ID will be invalid
    /// ```
    public static void getSubShapeTransformedShape(
    	MemorySegment self,
    	MemorySegment inSubShapeID,
    	MemorySegment outRemainder,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_GET_SUB_SHAPE_TRANSFORMED_SHAPE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inSubShapeID,
    			outRemainder,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeTransformedShape].
    public final void getSubShapeTransformedShape(
    	SubShapeID inSubShapeID,
    	SubShapeID outRemainder,
    	TransformedShape outResult
    ) {
    	getSubShapeTransformedShape(
    		this.segment,
    		inSubShapeID.memorySegment(),
    		outRemainder.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Helper function to return the body id from a transformed shape. If the transformed shape is null an invalid body ID will be returned.
    /// ```
    public static void sGetBodyID(
    	MemorySegment inTS,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_TRANSFORMED_SHAPE_S_GET_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			inTS,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#sGetBodyID].
    public static void sGetBodyID(
    	TransformedShape inTS,
    	BodyID outResult
    ) {
    	sGetBodyID(
    		inTS.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}