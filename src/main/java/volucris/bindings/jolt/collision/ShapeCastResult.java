/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ShapeCastResult extends CollideShapeResult {

	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_CREATE1;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_AS_COLLIDE_SHAPE_RESULT;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_GET_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_SET_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_GET_IS_BACK_FACE_HIT;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_SET_IS_BACK_FACE_HIT;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_GET_EARLY_OUT_FRACTION;
	private static final LazyConstant<MethodHandle> JPH_SHAPE_CAST_RESULT_REVERSED;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_SHAPE_CAST_RESULT_CREATE = downcallHandle("JPH_ShapeCastResult_Create", UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_RESULT_CREATE1 = downcallHandle("JPH_ShapeCastResult_Create1", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_RESULT_AS_COLLIDE_SHAPE_RESULT = downcallHandle("JPH_ShapeCastResult_AsCollideShapeResult", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_RESULT_GET_FRACTION = downcallHandle("JPH_ShapeCastResult_GetFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_RESULT_SET_FRACTION = downcallHandleVoid("JPH_ShapeCastResult_SetFraction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SHAPE_CAST_RESULT_GET_IS_BACK_FACE_HIT = downcallHandle("JPH_ShapeCastResult_GetIsBackFaceHit", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_RESULT_SET_IS_BACK_FACE_HIT = downcallHandleVoid("JPH_ShapeCastResult_SetIsBackFaceHit", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SHAPE_CAST_RESULT_GET_EARLY_OUT_FRACTION = downcallHandle("JPH_ShapeCastResult_GetEarlyOutFraction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SHAPE_CAST_RESULT_REVERSED = downcallHandleVoid("JPH_ShapeCastResult_Reversed", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ShapeCastResult() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ShapeCastResult(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCollideShapeResult(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ShapeCastResult(
	    float inFraction,
	    Vec3 inContactPoint1,
	    Vec3 inContactPoint2,
	    Vec3 inContactNormalOrPenetrationDepth,
	    boolean inBackFaceHit,
	    SubShapeID inSubShapeID1,
	    SubShapeID inSubShapeID2,
	    BodyID inBodyID2
	) {
	    this(
	        Arena.ofAuto(),
	        inFraction,
	        inContactPoint1,
	        inContactPoint2,
	        inContactNormalOrPenetrationDepth,
	        inBackFaceHit,
	        inSubShapeID1,
	        inSubShapeID2,
	        inBodyID2
	    );
	}
	
	/// Typed method of [#create1].
	public ShapeCastResult(
		Arena arena,
		float inFraction,
		Vec3 inContactPoint1,
		Vec3 inContactPoint2,
		Vec3 inContactNormalOrPenetrationDepth,
		boolean inBackFaceHit,
		SubShapeID inSubShapeID1,
		SubShapeID inSubShapeID2,
		BodyID inBodyID2
	) {
		MemorySegment segment = create1(
			inFraction,
			inContactPoint1.memorySegment(),
			inContactPoint2.memorySegment(),
			inContactNormalOrPenetrationDepth.memorySegment(),
			inBackFaceHit,
			inSubShapeID1.memorySegment(),
			inSubShapeID2.memorySegment(),
			inBodyID2.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asCollideShapeResult(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public ShapeCastResult(MemorySegment segment) {
		this.segment = segment;
		super(asCollideShapeResult(segment));
	}

    /// ```
    /// Default constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Constructor
    /// @param inFraction Fraction at which the cast hit
    /// @param inContactPoint1 Contact point on shape 1
    /// @param inContactPoint2 Contact point on shape 2
    /// @param inContactNormalOrPenetrationDepth Contact normal pointing from shape 1 to 2 or penetration depth vector when the objects are penetrating (also from 1 to 2)
    /// @param inBackFaceHit If this hit was a back face hit
    /// @param inSubShapeID1 Sub shape id for shape 1
    /// @param inSubShapeID2 Sub shape id for shape 2
    /// @param inBodyID2 BodyID that was hit
    /// ```
    public static MemorySegment create1(
    	float inFraction,
    	MemorySegment inContactPoint1,
    	MemorySegment inContactPoint2,
    	MemorySegment inContactNormalOrPenetrationDepth,
    	boolean inBackFaceHit,
    	MemorySegment inSubShapeID1,
    	MemorySegment inSubShapeID2,
    	MemorySegment inBodyID2
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_CREATE1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inFraction,
    			inContactPoint1,
    			inContactPoint2,
    			inContactNormalOrPenetrationDepth,
    			inBackFaceHit,
    			inSubShapeID1,
    			inSubShapeID2,
    			inBodyID2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asCollideShapeResult(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_AS_COLLIDE_SHAPE_RESULT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// This is the fraction where the shape hit the other shape: CenterOfMassOnHit = Start + value * (End - Start)
    /// ```
    public static float getFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_GET_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFraction].
    public final float getFraction() {
    	return getFraction(
    		this.segment
    	);
    }
    
    /// ```
    /// This is the fraction where the shape hit the other shape: CenterOfMassOnHit = Start + value * (End - Start)
    /// ```
    public static void setFraction(
    	MemorySegment self,
    	float mFraction
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_SET_FRACTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFraction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFraction].
    public final void setFraction(
    	float mFraction
    ) {
    	setFraction(
    		this.segment,
    		mFraction
    	);
    }
    
    /// ```
    /// True if the shape was hit from the back side
    /// ```
    public static boolean getIsBackFaceHit(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_GET_IS_BACK_FACE_HIT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getIsBackFaceHit].
    public final boolean getIsBackFaceHit() {
    	return getIsBackFaceHit(
    		this.segment
    	);
    }
    
    /// ```
    /// True if the shape was hit from the back side
    /// ```
    public static void setIsBackFaceHit(
    	MemorySegment self,
    	boolean mIsBackFaceHit
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_SET_IS_BACK_FACE_HIT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mIsBackFaceHit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setIsBackFaceHit].
    public final void setIsBackFaceHit(
    	boolean mIsBackFaceHit
    ) {
    	setIsBackFaceHit(
    		this.segment,
    		mIsBackFaceHit
    	);
    }
    
    /// ```
    /// Function required by the CollisionCollector. A smaller fraction is considered to be a 'better hit'. For rays/cast shapes we can just use the collision fraction. The fraction and penetration depth are combined in such a way that deeper hits at fraction 0 go first.
    /// ```
    public static float getEarlyOutFraction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_GET_EARLY_OUT_FRACTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEarlyOutFraction].
    public final float getEarlyOutFraction() {
    	return getEarlyOutFraction(
    		this.segment
    	);
    }
    
    /// ```
    /// Reverses the hit result, swapping contact point 1 with contact point 2 etc.
    /// @param inWorldSpaceCastDirection Direction of the shape cast in world space
    /// ```
    public static void reversed(
    	MemorySegment self,
    	MemorySegment inWorldSpaceCastDirection,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SHAPE_CAST_RESULT_REVERSED.get();
    	try {
    		 method.invokeExact(
    			self,
    			inWorldSpaceCastDirection,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#reversed].
    public final void reversed(
    	Vec3 inWorldSpaceCastDirection,
    	ShapeCastResult outResult
    ) {
    	reversed(
    		this.segment,
    		inWorldSpaceCastDirection.memorySegment(),
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}