/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.SupportingFace;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class CollideShapeResult
		permits ShapeCastResult {

	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_CONTACT_POINT_ON1;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_CONTACT_POINT_ON1;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_CONTACT_POINT_ON2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_CONTACT_POINT_ON2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_PENETRATION_AXIS;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_PENETRATION_AXIS;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_PENETRATION_DEPTH;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_PENETRATION_DEPTH;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_SUB_SHAPE_ID1;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_SUB_SHAPE_ID1;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_SUB_SHAPE_ID2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_SUB_SHAPE_ID2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_BODY_ID2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_BODY_ID2;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_SHAPE1_FACE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_SHAPE1_FACE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_SHAPE2_FACE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_SET_SHAPE2_FACE;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_GET_EARLY_OUT_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_COLLIDE_SHAPE_RESULT_REVERSED;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLLIDE_SHAPE_RESULT_CREATE = downcallHandle("JPH_CollideShapeResult_Create", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_CREATE1 = downcallHandle("JPH_CollideShapeResult_Create1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_DESTROY = downcallHandleVoid("JPH_CollideShapeResult_Destroy", UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_CONTACT_POINT_ON1 = downcallHandleVoid("JPH_CollideShapeResult_GetContactPointOn1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_CONTACT_POINT_ON1 = downcallHandleVoid("JPH_CollideShapeResult_SetContactPointOn1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_CONTACT_POINT_ON2 = downcallHandleVoid("JPH_CollideShapeResult_GetContactPointOn2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_CONTACT_POINT_ON2 = downcallHandleVoid("JPH_CollideShapeResult_SetContactPointOn2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_PENETRATION_AXIS = downcallHandleVoid("JPH_CollideShapeResult_GetPenetrationAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_PENETRATION_AXIS = downcallHandleVoid("JPH_CollideShapeResult_SetPenetrationAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_PENETRATION_DEPTH = downcallHandle("JPH_CollideShapeResult_GetPenetrationDepth", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_PENETRATION_DEPTH = downcallHandleVoid("JPH_CollideShapeResult_SetPenetrationDepth", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_COLLIDE_SHAPE_RESULT_GET_SUB_SHAPE_ID1 = downcallHandleVoid("JPH_CollideShapeResult_GetSubShapeID1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_SUB_SHAPE_ID1 = downcallHandleVoid("JPH_CollideShapeResult_SetSubShapeID1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_SUB_SHAPE_ID2 = downcallHandleVoid("JPH_CollideShapeResult_GetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_SUB_SHAPE_ID2 = downcallHandleVoid("JPH_CollideShapeResult_SetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_BODY_ID2 = downcallHandleVoid("JPH_CollideShapeResult_GetBodyID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_BODY_ID2 = downcallHandleVoid("JPH_CollideShapeResult_SetBodyID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_SHAPE1_FACE = downcallHandleVoid("JPH_CollideShapeResult_GetShape1Face", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_SHAPE1_FACE = downcallHandleVoid("JPH_CollideShapeResult_SetShape1Face", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_SHAPE2_FACE = downcallHandleVoid("JPH_CollideShapeResult_GetShape2Face", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_SET_SHAPE2_FACE = downcallHandleVoid("JPH_CollideShapeResult_SetShape2Face", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_GET_EARLY_OUT_FRACTION = downcallHandle("JPH_CollideShapeResult_GetEarlyOutFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLIDE_SHAPE_RESULT_REVERSED = downcallHandleVoid("JPH_CollideShapeResult_Reversed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CollideShapeResult() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CollideShapeResult(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CollideShapeResult(
	    Vec3 inContactPointOn1,
	    Vec3 inContactPointOn2,
	    Vec3 inPenetrationAxis,
	    float inPenetrationDepth,
	    SubShapeID inSubShapeID1,
	    SubShapeID inSubShapeID2,
	    BodyID inBodyID2
	) {
	    this(
	        Arena.ofAuto(),
	        inContactPointOn1,
	        inContactPointOn2,
	        inPenetrationAxis,
	        inPenetrationDepth,
	        inSubShapeID1,
	        inSubShapeID2,
	        inBodyID2
	    );
	}
	
	/// Typed method of [#create1].
	public CollideShapeResult(
		Arena arena,
		Vec3 inContactPointOn1,
		Vec3 inContactPointOn2,
		Vec3 inPenetrationAxis,
		float inPenetrationDepth,
		SubShapeID inSubShapeID1,
		SubShapeID inSubShapeID2,
		BodyID inBodyID2
	) {
		MemorySegment segment = create1(
			inContactPointOn1.memorySegment(),
			inContactPointOn2.memorySegment(),
			inPenetrationAxis.memorySegment(),
			inPenetrationDepth,
			inSubShapeID1.memorySegment(),
			inSubShapeID2.memorySegment(),
			inBodyID2.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CollideShapeResult(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Default constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create1(
    	MemorySegment inContactPointOn1,
    	MemorySegment inContactPointOn2,
    	MemorySegment inPenetrationAxis,
    	float inPenetrationDepth,
    	MemorySegment inSubShapeID1,
    	MemorySegment inSubShapeID2,
    	MemorySegment inBodyID2
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inContactPointOn1,
    			inContactPointOn2,
    			inPenetrationAxis,
    			inPenetrationDepth,
    			inSubShapeID1,
    			inSubShapeID2,
    			inBodyID2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Contact point on the surface of shape 1 (in world space or relative to base offset)
    /// ```
    public static void getContactPointOn1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_CONTACT_POINT_ON1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactPointOn1].
    public final void getContactPointOn1(
    	Vec3 outResult
    ) {
    	getContactPointOn1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Contact point on the surface of shape 1 (in world space or relative to base offset)
    /// ```
    public static void setContactPointOn1(
    	MemorySegment self,
    	MemorySegment mContactPointOn1
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_CONTACT_POINT_ON1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mContactPointOn1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactPointOn1].
    public final void setContactPointOn1(
    	Vec3 mContactPointOn1
    ) {
    	setContactPointOn1(
    		this.segment,
    		mContactPointOn1.memorySegment()
    	);
    }
    
    /// ```
    /// Contact point on the surface of shape 2 (in world space or relative to base offset). If the penetration depth is 0, this will be the same as mContactPointOn1.
    /// ```
    public static void getContactPointOn2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_CONTACT_POINT_ON2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactPointOn2].
    public final void getContactPointOn2(
    	Vec3 outResult
    ) {
    	getContactPointOn2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Contact point on the surface of shape 2 (in world space or relative to base offset). If the penetration depth is 0, this will be the same as mContactPointOn1.
    /// ```
    public static void setContactPointOn2(
    	MemorySegment self,
    	MemorySegment mContactPointOn2
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_CONTACT_POINT_ON2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mContactPointOn2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactPointOn2].
    public final void setContactPointOn2(
    	Vec3 mContactPointOn2
    ) {
    	setContactPointOn2(
    		this.segment,
    		mContactPointOn2.memorySegment()
    	);
    }
    
    /// ```
    /// Direction to move shape 2 out of collision along the shortest path (magnitude is meaningless, in world space). You can use -mPenetrationAxis.Normalized() as contact normal.
    /// ```
    public static void getPenetrationAxis(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_PENETRATION_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPenetrationAxis].
    public final void getPenetrationAxis(
    	Vec3 outResult
    ) {
    	getPenetrationAxis(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Direction to move shape 2 out of collision along the shortest path (magnitude is meaningless, in world space). You can use -mPenetrationAxis.Normalized() as contact normal.
    /// ```
    public static void setPenetrationAxis(
    	MemorySegment self,
    	MemorySegment mPenetrationAxis
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_PENETRATION_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPenetrationAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPenetrationAxis].
    public final void setPenetrationAxis(
    	Vec3 mPenetrationAxis
    ) {
    	setPenetrationAxis(
    		this.segment,
    		mPenetrationAxis.memorySegment()
    	);
    }
    
    /// ```
    /// Penetration depth (move shape 2 by this distance to resolve the collision). If CollideShapeSettings::mMaxSeparationDistance > 0 this number can be negative to indicate that the objects are separated by -mPenetrationDepth. The contact points are the closest points in that case.
    /// ```
    public static float getPenetrationDepth(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_PENETRATION_DEPTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPenetrationDepth].
    public final float getPenetrationDepth() {
    	return getPenetrationDepth(
    		this.segment
    	);
    }
    
    /// ```
    /// Penetration depth (move shape 2 by this distance to resolve the collision). If CollideShapeSettings::mMaxSeparationDistance > 0 this number can be negative to indicate that the objects are separated by -mPenetrationDepth. The contact points are the closest points in that case.
    /// ```
    public static void setPenetrationDepth(
    	MemorySegment self,
    	float mPenetrationDepth
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_PENETRATION_DEPTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPenetrationDepth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPenetrationDepth].
    public final void setPenetrationDepth(
    	float mPenetrationDepth
    ) {
    	setPenetrationDepth(
    		this.segment,
    		mPenetrationDepth
    	);
    }
    
    /// ```
    /// Sub shape ID that identifies the face on shape 1
    /// ```
    public static void getSubShapeID1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_SUB_SHAPE_ID1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeID1].
    public final void getSubShapeID1(
    	SubShapeID outResult
    ) {
    	getSubShapeID1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape ID that identifies the face on shape 1
    /// ```
    public static void setSubShapeID1(
    	MemorySegment self,
    	MemorySegment mSubShapeID1
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_SUB_SHAPE_ID1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSubShapeID1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSubShapeID1].
    public final void setSubShapeID1(
    	SubShapeID mSubShapeID1
    ) {
    	setSubShapeID1(
    		this.segment,
    		mSubShapeID1.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape ID that identifies the face on shape 2
    /// ```
    public static void getSubShapeID2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_SUB_SHAPE_ID2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSubShapeID2].
    public final void getSubShapeID2(
    	SubShapeID outResult
    ) {
    	getSubShapeID2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Sub shape ID that identifies the face on shape 2
    /// ```
    public static void setSubShapeID2(
    	MemorySegment self,
    	MemorySegment mSubShapeID2
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_SUB_SHAPE_ID2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSubShapeID2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSubShapeID2].
    public final void setSubShapeID2(
    	SubShapeID mSubShapeID2
    ) {
    	setSubShapeID2(
    		this.segment,
    		mSubShapeID2.memorySegment()
    	);
    }
    
    /// ```
    /// BodyID to which shape 2 belongs to
    /// ```
    public static void getBodyID2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_BODY_ID2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyID2].
    public final void getBodyID2(
    	BodyID outResult
    ) {
    	getBodyID2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// BodyID to which shape 2 belongs to
    /// ```
    public static void setBodyID2(
    	MemorySegment self,
    	MemorySegment mBodyID2
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_BODY_ID2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBodyID2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyID2].
    public final void setBodyID2(
    	BodyID mBodyID2
    ) {
    	setBodyID2(
    		this.segment,
    		mBodyID2.memorySegment()
    	);
    }
    
    /// ```
    /// Colliding face on shape 1 (optional result, in world space or relative to base offset)
    /// ```
    public static void getShape1Face(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_SHAPE1_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShape1Face].
    public final void getShape1Face(
    	SupportingFace outResult
    ) {
    	getShape1Face(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Colliding face on shape 1 (optional result, in world space or relative to base offset)
    /// ```
    public static void setShape1Face(
    	MemorySegment self,
    	MemorySegment mShape1Face
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_SHAPE1_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShape1Face
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape1Face].
    public final void setShape1Face(
    	SupportingFace mShape1Face
    ) {
    	setShape1Face(
    		this.segment,
    		mShape1Face.memorySegment()
    	);
    }
    
    /// ```
    /// Colliding face on shape 2 (optional result, in world space or relative to base offset)
    /// ```
    public static void getShape2Face(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_SHAPE2_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getShape2Face].
    public final void getShape2Face(
    	SupportingFace outResult
    ) {
    	getShape2Face(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Colliding face on shape 2 (optional result, in world space or relative to base offset)
    /// ```
    public static void setShape2Face(
    	MemorySegment self,
    	MemorySegment mShape2Face
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_SET_SHAPE2_FACE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mShape2Face
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setShape2Face].
    public final void setShape2Face(
    	SupportingFace mShape2Face
    ) {
    	setShape2Face(
    		this.segment,
    		mShape2Face.memorySegment()
    	);
    }
    
    /// ```
    /// Function required by the CollisionCollector. A smaller fraction is considered to be a 'better hit'. We use -penetration depth to get the hit with the biggest penetration depth
    /// ```
    public static float getEarlyOutFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_GET_EARLY_OUT_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEarlyOutFraction].
    public float getEarlyOutFraction() {
    	return getEarlyOutFraction(
    		this.segment
    	);
    }
    
    /// ```
    /// Reverses the hit result, swapping contact point 1 with contact point 2 etc.
    /// ```
    public static void reversed(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLIDE_SHAPE_RESULT_REVERSED.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reversed].
    public final void reversed(
    	CollideShapeResult outResult
    ) {
    	reversed(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}