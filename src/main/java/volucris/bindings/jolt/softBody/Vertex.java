/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.softBody;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.geometry.Plane;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Vertex {

	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_CREATE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_GET_PREVIOUS_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_SET_PREVIOUS_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_GET_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_SET_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_GET_COLLISION_PLANE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_SET_COLLISION_PLANE;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_GET_COLLIDING_SHAPE_INDEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_SET_COLLIDING_SHAPE_INDEX;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_GET_HAS_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_SET_HAS_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_GET_LARGEST_PENETRATION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_SET_LARGEST_PENETRATION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_GET_INV_MASS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_SET_INV_MASS;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_RESET_COLLISION;
	private static final LazyConstant<MethodHandle> JPH_SOFT_BODY_VERTEX_MARK_CCDCONTACT;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_SOFT_BODY_VERTEX_CREATE = downcallHandle("JPH_SoftBodyVertex_Create", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_DESTROY = downcallHandleVoid("JPH_SoftBodyVertex_Destroy", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_GET_PREVIOUS_POSITION = downcallHandleVoid("JPH_SoftBodyVertex_GetPreviousPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_SET_PREVIOUS_POSITION = downcallHandleVoid("JPH_SoftBodyVertex_SetPreviousPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_GET_POSITION = downcallHandleVoid("JPH_SoftBodyVertex_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_SET_POSITION = downcallHandleVoid("JPH_SoftBodyVertex_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_GET_VELOCITY = downcallHandleVoid("JPH_SoftBodyVertex_GetVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_SET_VELOCITY = downcallHandleVoid("JPH_SoftBodyVertex_SetVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_GET_COLLISION_PLANE = downcallHandleVoid("JPH_SoftBodyVertex_GetCollisionPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_SET_COLLISION_PLANE = downcallHandleVoid("JPH_SoftBodyVertex_SetCollisionPlane", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_GET_COLLIDING_SHAPE_INDEX = downcallHandle("JPH_SoftBodyVertex_GetCollidingShapeIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_SET_COLLIDING_SHAPE_INDEX = downcallHandleVoid("JPH_SoftBodyVertex_SetCollidingShapeIndex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_SOFT_BODY_VERTEX_GET_HAS_CONTACT = downcallHandle("JPH_SoftBodyVertex_GetHasContact", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_SET_HAS_CONTACT = downcallHandleVoid("JPH_SoftBodyVertex_SetHasContact", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_SOFT_BODY_VERTEX_GET_LARGEST_PENETRATION = downcallHandle("JPH_SoftBodyVertex_GetLargestPenetration", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_SET_LARGEST_PENETRATION = downcallHandleVoid("JPH_SoftBodyVertex_SetLargestPenetration", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_VERTEX_GET_INV_MASS = downcallHandle("JPH_SoftBodyVertex_GetInvMass", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_SET_INV_MASS = downcallHandleVoid("JPH_SoftBodyVertex_SetInvMass", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_SOFT_BODY_VERTEX_RESET_COLLISION = downcallHandleVoid("JPH_SoftBodyVertex_ResetCollision", UNBOUNDED_ADDRESS);
		JPH_SOFT_BODY_VERTEX_MARK_CCDCONTACT = downcallHandleVoid("JPH_SoftBodyVertex_MarkCCDContact", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public Vertex() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public Vertex(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Vertex(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Internal use only. Position at the previous time step
    /// ```
    public static void getPreviousPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_GET_PREVIOUS_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPreviousPosition].
    public final void getPreviousPosition(
    	Vec3 outResult
    ) {
    	getPreviousPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Internal use only. Position at the previous time step
    /// ```
    public static void setPreviousPosition(
    	MemorySegment self,
    	MemorySegment mPreviousPosition
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_SET_PREVIOUS_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPreviousPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPreviousPosition].
    public final void setPreviousPosition(
    	Vec3 mPreviousPosition
    ) {
    	setPreviousPosition(
    		this.segment,
    		mPreviousPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Position, relative to the center of mass of the soft body
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	Vec3 outResult
    ) {
    	getPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Position, relative to the center of mass of the soft body
    /// ```
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment mPosition
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mPosition
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	Vec3 mPosition
    ) {
    	setPosition(
    		this.segment,
    		mPosition.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity, relative to the center of mass of the soft body
    /// ```
    public static void getVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_GET_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getVelocity].
    public final void getVelocity(
    	Vec3 outResult
    ) {
    	getVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity, relative to the center of mass of the soft body
    /// ```
    public static void setVelocity(
    	MemorySegment self,
    	MemorySegment mVelocity
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_SET_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setVelocity].
    public final void setVelocity(
    	Vec3 mVelocity
    ) {
    	setVelocity(
    		this.segment,
    		mVelocity.memorySegment()
    	);
    }
    
    /// ```
    /// Internal use only. Nearest collision plane, relative to the center of mass of the soft body
    /// ```
    public static void getCollisionPlane(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_GET_COLLISION_PLANE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollisionPlane].
    public final void getCollisionPlane(
    	Plane outResult
    ) {
    	getCollisionPlane(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Internal use only. Nearest collision plane, relative to the center of mass of the soft body
    /// ```
    public static void setCollisionPlane(
    	MemorySegment self,
    	MemorySegment mCollisionPlane
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_SET_COLLISION_PLANE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCollisionPlane
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollisionPlane].
    public final void setCollisionPlane(
    	Plane mCollisionPlane
    ) {
    	setCollisionPlane(
    		this.segment,
    		mCollisionPlane.memorySegment()
    	);
    }
    
    /// ```
    /// Internal use only. Index in the colliding shapes list of the body we may collide with
    /// ```
    public static int getCollidingShapeIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_GET_COLLIDING_SHAPE_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCollidingShapeIndex].
    public final int getCollidingShapeIndex() {
    	return getCollidingShapeIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Internal use only. Index in the colliding shapes list of the body we may collide with
    /// ```
    public static void setCollidingShapeIndex(
    	MemorySegment self,
    	int mCollidingShapeIndex
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_SET_COLLIDING_SHAPE_INDEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCollidingShapeIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCollidingShapeIndex].
    public final void setCollidingShapeIndex(
    	int mCollidingShapeIndex
    ) {
    	setCollidingShapeIndex(
    		this.segment,
    		mCollidingShapeIndex
    	);
    }
    
    /// ```
    /// True if the vertex has collided with anything in the last update
    /// ```
    public static boolean getHasContact(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_GET_HAS_CONTACT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getHasContact].
    public final boolean getHasContact() {
    	return getHasContact(
    		this.segment
    	);
    }
    
    /// ```
    /// True if the vertex has collided with anything in the last update
    /// ```
    public static void setHasContact(
    	MemorySegment self,
    	boolean mHasContact
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_SET_HAS_CONTACT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mHasContact
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setHasContact].
    public final void setHasContact(
    	boolean mHasContact
    ) {
    	setHasContact(
    		this.segment,
    		mHasContact
    	);
    }
    
    /// ```
    /// Internal use only. Used while finding the collision plane, stores the largest penetration found so far
    /// ```
    public static float getLargestPenetration(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_GET_LARGEST_PENETRATION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLargestPenetration].
    public final float getLargestPenetration() {
    	return getLargestPenetration(
    		this.segment
    	);
    }
    
    /// ```
    /// Internal use only. Used while finding the collision plane, stores the largest penetration found so far
    /// ```
    public static void setLargestPenetration(
    	MemorySegment self,
    	float mLargestPenetration
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_SET_LARGEST_PENETRATION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLargestPenetration
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLargestPenetration].
    public final void setLargestPenetration(
    	float mLargestPenetration
    ) {
    	setLargestPenetration(
    		this.segment,
    		mLargestPenetration
    	);
    }
    
    /// ```
    /// Inverse mass (1 / mass)
    /// ```
    public static float getInvMass(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_GET_INV_MASS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInvMass].
    public final float getInvMass() {
    	return getInvMass(
    		this.segment
    	);
    }
    
    /// ```
    /// Inverse mass (1 / mass)
    /// ```
    public static void setInvMass(
    	MemorySegment self,
    	float mInvMass
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_SET_INV_MASS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInvMass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInvMass].
    public final void setInvMass(
    	float mInvMass
    ) {
    	setInvMass(
    		this.segment,
    		mInvMass
    	);
    }
    
    /// ```
    /// Reset collision information to prepare for a new collision check
    /// ```
    public static void resetCollision(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_RESET_COLLISION.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#resetCollision].
    public final void resetCollision() {
    	resetCollision(
    		this.segment
    	);
    }
    
    /// ```
    /// Mark this vertex as being in contact with inBodyID
    /// ```
    public static void markCCDContact(
    	MemorySegment self,
    	MemorySegment inBodyID,
    	MemorySegment inContactPlane
    ) {
    	MethodHandle method = JPH_SOFT_BODY_VERTEX_MARK_CCDCONTACT.get();
    	try {
    		 method.invokeExact(
    			self,
    			inBodyID,
    			inContactPlane
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#markCCDContact].
    public final void markCCDContact(
    	BodyID inBodyID,
    	Plane inContactPlane
    ) {
    	markCCDContact(
    		this.segment,
    		inBodyID.memorySegment(),
    		inContactPlane.memorySegment()
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