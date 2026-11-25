/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ContactManifold {

	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_CREATE;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_BASE_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_SET_BASE_OFFSET;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_SET_WORLD_SPACE_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_SET_PENETRATION_DEPTH;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_SET_SUB_SHAPE_ID1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_SET_SUB_SHAPE_ID2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_RELATIVE_CONTACT_POINTS_ON1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_SET_RELATIVE_CONTACT_POINTS_ON1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_RELATIVE_CONTACT_POINTS_ON2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_SET_RELATIVE_CONTACT_POINTS_ON2;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_SWAP_SHAPES;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1;
	private static final LazyConstant<MethodHandle> JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_CONTACT_MANIFOLD_CREATE = downcallHandle("JPH_ContactManifold_Create", UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_DESTROY = downcallHandleVoid("JPH_ContactManifold_Destroy", UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_BASE_OFFSET = downcallHandleVoid("JPH_ContactManifold_GetBaseOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_SET_BASE_OFFSET = downcallHandleVoid("JPH_ContactManifold_SetBaseOffset", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_SET_WORLD_SPACE_NORMAL = downcallHandleVoid("JPH_ContactManifold_SetWorldSpaceNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH = downcallHandle("JPH_ContactManifold_GetPenetrationDepth", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_SET_PENETRATION_DEPTH = downcallHandleVoid("JPH_ContactManifold_SetPenetrationDepth", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1 = downcallHandleVoid("JPH_ContactManifold_GetSubShapeID1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_SET_SUB_SHAPE_ID1 = downcallHandleVoid("JPH_ContactManifold_SetSubShapeID1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2 = downcallHandleVoid("JPH_ContactManifold_GetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_SET_SUB_SHAPE_ID2 = downcallHandleVoid("JPH_ContactManifold_SetSubShapeID2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_RELATIVE_CONTACT_POINTS_ON1 = downcallHandleVoid("JPH_ContactManifold_GetRelativeContactPointsOn1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_SET_RELATIVE_CONTACT_POINTS_ON1 = downcallHandleVoid("JPH_ContactManifold_SetRelativeContactPointsOn1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_RELATIVE_CONTACT_POINTS_ON2 = downcallHandleVoid("JPH_ContactManifold_GetRelativeContactPointsOn2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_SET_RELATIVE_CONTACT_POINTS_ON2 = downcallHandleVoid("JPH_ContactManifold_SetRelativeContactPointsOn2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_SWAP_SHAPES = downcallHandleVoid("JPH_ContactManifold_SwapShapes", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1 = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceContactPointOn1", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2 = downcallHandleVoid("JPH_ContactManifold_GetWorldSpaceContactPointOn2", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public ContactManifold() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public ContactManifold(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public ContactManifold(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Offset to which all the contact points are relative
    /// ```
    public static void getBaseOffset(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_BASE_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBaseOffset].
    public final void getBaseOffset(
    	Vec3 outResult
    ) {
    	getBaseOffset(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Offset to which all the contact points are relative
    /// ```
    public static void setBaseOffset(
    	MemorySegment self,
    	MemorySegment mBaseOffset
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_SET_BASE_OFFSET.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBaseOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBaseOffset].
    public final void setBaseOffset(
    	Vec3 mBaseOffset
    ) {
    	setBaseOffset(
    		this.segment,
    		mBaseOffset.memorySegment()
    	);
    }
    
    /// ```
    /// Normal for this manifold, direction along which to move body 2 out of collision along the shortest path
    /// ```
    public static void getWorldSpaceNormal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceNormal].
    public final void getWorldSpaceNormal(
    	Vec3 outResult
    ) {
    	getWorldSpaceNormal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Normal for this manifold, direction along which to move body 2 out of collision along the shortest path
    /// ```
    public static void setWorldSpaceNormal(
    	MemorySegment self,
    	MemorySegment mWorldSpaceNormal
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_SET_WORLD_SPACE_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWorldSpaceNormal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWorldSpaceNormal].
    public final void setWorldSpaceNormal(
    	Vec3 mWorldSpaceNormal
    ) {
    	setWorldSpaceNormal(
    		this.segment,
    		mWorldSpaceNormal.memorySegment()
    	);
    }
    
    /// ```
    /// Penetration depth (move shape 2 by this distance to resolve the collision). If this value is negative, this is a speculative contact point and may not actually result in a velocity change as during solving the bodies may not actually collide.
    /// ```
    public static float getPenetrationDepth(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_PENETRATION_DEPTH.get();
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
    /// Penetration depth (move shape 2 by this distance to resolve the collision). If this value is negative, this is a speculative contact point and may not actually result in a velocity change as during solving the bodies may not actually collide.
    /// ```
    public static void setPenetrationDepth(
    	MemorySegment self,
    	float mPenetrationDepth
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_SET_PENETRATION_DEPTH.get();
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
    /// Sub shapes that formed this manifold (note that when multiple manifolds are combined because they're coplanar, we lose some information here because we only keep track of one sub shape pair that we encounter, see description at Body::SetUseManifoldReduction)
    /// ```
    public static void getSubShapeID1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID1.get();
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
    /// Sub shapes that formed this manifold (note that when multiple manifolds are combined because they're coplanar, we lose some information here because we only keep track of one sub shape pair that we encounter, see description at Body::SetUseManifoldReduction)
    /// ```
    public static void setSubShapeID1(
    	MemorySegment self,
    	MemorySegment mSubShapeID1
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_SET_SUB_SHAPE_ID1.get();
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
    
    public static void getSubShapeID2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_SUB_SHAPE_ID2.get();
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
    
    public static void setSubShapeID2(
    	MemorySegment self,
    	MemorySegment mSubShapeID2
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_SET_SUB_SHAPE_ID2.get();
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
    /// Contact points on the surface of shape 1 relative to mBaseOffset.
    /// ```
    public static void getRelativeContactPointsOn1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_RELATIVE_CONTACT_POINTS_ON1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRelativeContactPointsOn1].
    public final void getRelativeContactPointsOn1(
    	ContactPoints outResult
    ) {
    	getRelativeContactPointsOn1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Contact points on the surface of shape 1 relative to mBaseOffset.
    /// ```
    public static void setRelativeContactPointsOn1(
    	MemorySegment self,
    	MemorySegment mRelativeContactPointsOn1
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_SET_RELATIVE_CONTACT_POINTS_ON1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRelativeContactPointsOn1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRelativeContactPointsOn1].
    public final void setRelativeContactPointsOn1(
    	ContactPoints mRelativeContactPointsOn1
    ) {
    	setRelativeContactPointsOn1(
    		this.segment,
    		mRelativeContactPointsOn1.memorySegment()
    	);
    }
    
    /// ```
    /// Contact points on the surface of shape 2 relative to mBaseOffset. If there's no penetration, this will be the same as mRelativeContactPointsOn1. If there is penetration they will be different.
    /// ```
    public static void getRelativeContactPointsOn2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_RELATIVE_CONTACT_POINTS_ON2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRelativeContactPointsOn2].
    public final void getRelativeContactPointsOn2(
    	ContactPoints outResult
    ) {
    	getRelativeContactPointsOn2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Contact points on the surface of shape 2 relative to mBaseOffset. If there's no penetration, this will be the same as mRelativeContactPointsOn1. If there is penetration they will be different.
    /// ```
    public static void setRelativeContactPointsOn2(
    	MemorySegment self,
    	MemorySegment mRelativeContactPointsOn2
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_SET_RELATIVE_CONTACT_POINTS_ON2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRelativeContactPointsOn2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRelativeContactPointsOn2].
    public final void setRelativeContactPointsOn2(
    	ContactPoints mRelativeContactPointsOn2
    ) {
    	setRelativeContactPointsOn2(
    		this.segment,
    		mRelativeContactPointsOn2.memorySegment()
    	);
    }
    
    /// ```
    /// Swaps shape 1 and 2
    /// ```
    public static void swapShapes(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_SWAP_SHAPES.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#swapShapes].
    public final void swapShapes(
    	ContactManifold outResult
    ) {
    	swapShapes(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Access to the world space contact positions
    /// ```
    public static void getWorldSpaceContactPointOn1(
    	MemorySegment self,
    	int inIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON1.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceContactPointOn1].
    public final void getWorldSpaceContactPointOn1(
    	int inIndex,
    	Vec3 outResult
    ) {
    	getWorldSpaceContactPointOn1(
    		this.segment,
    		inIndex,
    		outResult.memorySegment()
    	);
    }
    
    public static void getWorldSpaceContactPointOn2(
    	MemorySegment self,
    	int inIndex,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_CONTACT_MANIFOLD_GET_WORLD_SPACE_CONTACT_POINT_ON2.get();
    	try {
    		 method.invokeExact(
    			self,
    			inIndex,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWorldSpaceContactPointOn2].
    public final void getWorldSpaceContactPointOn2(
    	int inIndex,
    	Vec3 outResult
    ) {
    	getWorldSpaceContactPointOn2(
    		this.segment,
    		inIndex,
    		outResult.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}