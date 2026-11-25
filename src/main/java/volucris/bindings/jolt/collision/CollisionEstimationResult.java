/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.collision;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.ContactImpulse;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CollisionEstimationResult {

	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_CREATE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_GET_LINEAR_VELOCITY1;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_SET_LINEAR_VELOCITY1;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_VELOCITY1;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_VELOCITY1;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_GET_LINEAR_VELOCITY2;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_SET_LINEAR_VELOCITY2;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_VELOCITY2;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_VELOCITY2;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_GET_FRICTION_POINT;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_SET_FRICTION_POINT;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_GET_FRICTION_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_SET_FRICTION_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_FRICTION_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_FRICTION_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_GET_CONTACT_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_COLLISION_ESTIMATION_RESULT_SET_CONTACT_IMPULSE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_COLLISION_ESTIMATION_RESULT_CREATE = downcallHandle("JPH_CollisionEstimationResult_Create", UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_DESTROY = downcallHandleVoid("JPH_CollisionEstimationResult_Destroy", UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_GET_LINEAR_VELOCITY1 = downcallHandleVoid("JPH_CollisionEstimationResult_GetLinearVelocity1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_SET_LINEAR_VELOCITY1 = downcallHandleVoid("JPH_CollisionEstimationResult_SetLinearVelocity1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_VELOCITY1 = downcallHandleVoid("JPH_CollisionEstimationResult_GetAngularVelocity1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_VELOCITY1 = downcallHandleVoid("JPH_CollisionEstimationResult_SetAngularVelocity1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_GET_LINEAR_VELOCITY2 = downcallHandleVoid("JPH_CollisionEstimationResult_GetLinearVelocity2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_SET_LINEAR_VELOCITY2 = downcallHandleVoid("JPH_CollisionEstimationResult_SetLinearVelocity2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_VELOCITY2 = downcallHandleVoid("JPH_CollisionEstimationResult_GetAngularVelocity2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_VELOCITY2 = downcallHandleVoid("JPH_CollisionEstimationResult_SetAngularVelocity2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_GET_FRICTION_POINT = downcallHandleVoid("JPH_CollisionEstimationResult_GetFrictionPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_SET_FRICTION_POINT = downcallHandleVoid("JPH_CollisionEstimationResult_SetFrictionPoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_GET_FRICTION_IMPULSE = downcallHandleVoid("JPH_CollisionEstimationResult_GetFrictionImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_SET_FRICTION_IMPULSE = downcallHandleVoid("JPH_CollisionEstimationResult_SetFrictionImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_FRICTION_IMPULSE = downcallHandle("JPH_CollisionEstimationResult_GetAngularFrictionImpulse", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_FRICTION_IMPULSE = downcallHandleVoid("JPH_CollisionEstimationResult_SetAngularFrictionImpulse", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_COLLISION_ESTIMATION_RESULT_GET_CONTACT_IMPULSE = downcallHandleVoid("JPH_CollisionEstimationResult_GetContactImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_COLLISION_ESTIMATION_RESULT_SET_CONTACT_IMPULSE = downcallHandleVoid("JPH_CollisionEstimationResult_SetContactImpulse", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public CollisionEstimationResult() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public CollisionEstimationResult(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public CollisionEstimationResult(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The estimated linear velocity of body 1 after collision
    /// ```
    public static void getLinearVelocity1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_GET_LINEAR_VELOCITY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity1].
    public final void getLinearVelocity1(
    	Vec3 outResult
    ) {
    	getLinearVelocity1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The estimated linear velocity of body 1 after collision
    /// ```
    public static void setLinearVelocity1(
    	MemorySegment self,
    	MemorySegment mLinearVelocity1
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_SET_LINEAR_VELOCITY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLinearVelocity1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity1].
    public final void setLinearVelocity1(
    	Vec3 mLinearVelocity1
    ) {
    	setLinearVelocity1(
    		this.segment,
    		mLinearVelocity1.memorySegment()
    	);
    }
    
    /// ```
    /// The estimated angular velocity of body 1 after collision
    /// ```
    public static void getAngularVelocity1(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_VELOCITY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity1].
    public final void getAngularVelocity1(
    	Vec3 outResult
    ) {
    	getAngularVelocity1(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The estimated angular velocity of body 1 after collision
    /// ```
    public static void setAngularVelocity1(
    	MemorySegment self,
    	MemorySegment mAngularVelocity1
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_VELOCITY1.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAngularVelocity1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity1].
    public final void setAngularVelocity1(
    	Vec3 mAngularVelocity1
    ) {
    	setAngularVelocity1(
    		this.segment,
    		mAngularVelocity1.memorySegment()
    	);
    }
    
    /// ```
    /// The estimated linear velocity of body 2 after collision
    /// ```
    public static void getLinearVelocity2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_GET_LINEAR_VELOCITY2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLinearVelocity2].
    public final void getLinearVelocity2(
    	Vec3 outResult
    ) {
    	getLinearVelocity2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The estimated linear velocity of body 2 after collision
    /// ```
    public static void setLinearVelocity2(
    	MemorySegment self,
    	MemorySegment mLinearVelocity2
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_SET_LINEAR_VELOCITY2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLinearVelocity2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLinearVelocity2].
    public final void setLinearVelocity2(
    	Vec3 mLinearVelocity2
    ) {
    	setLinearVelocity2(
    		this.segment,
    		mLinearVelocity2.memorySegment()
    	);
    }
    
    /// ```
    /// The estimated angular velocity of body 2 after collision
    /// ```
    public static void getAngularVelocity2(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_VELOCITY2.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity2].
    public final void getAngularVelocity2(
    	Vec3 outResult
    ) {
    	getAngularVelocity2(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// The estimated angular velocity of body 2 after collision
    /// ```
    public static void setAngularVelocity2(
    	MemorySegment self,
    	MemorySegment mAngularVelocity2
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_VELOCITY2.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAngularVelocity2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity2].
    public final void setAngularVelocity2(
    	Vec3 mAngularVelocity2
    ) {
    	setAngularVelocity2(
    		this.segment,
    		mAngularVelocity2.memorySegment()
    	);
    }
    
    /// ```
    /// Point at which friction was applied (relative to mBaseOffset of the manifold)
    /// ```
    public static void getFrictionPoint(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_GET_FRICTION_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFrictionPoint].
    public final void getFrictionPoint(
    	Vec3 outResult
    ) {
    	getFrictionPoint(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Point at which friction was applied (relative to mBaseOffset of the manifold)
    /// ```
    public static void setFrictionPoint(
    	MemorySegment self,
    	MemorySegment mFrictionPoint
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_SET_FRICTION_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFrictionPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFrictionPoint].
    public final void setFrictionPoint(
    	Vec3 mFrictionPoint
    ) {
    	setFrictionPoint(
    		this.segment,
    		mFrictionPoint.memorySegment()
    	);
    }
    
    /// ```
    /// Estimated linear friction impulse (kg m / s)
    /// ```
    public static void getFrictionImpulse(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_GET_FRICTION_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getFrictionImpulse].
    public final void getFrictionImpulse(
    	Vec3 outResult
    ) {
    	getFrictionImpulse(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Estimated linear friction impulse (kg m / s)
    /// ```
    public static void setFrictionImpulse(
    	MemorySegment self,
    	MemorySegment mFrictionImpulse
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_SET_FRICTION_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mFrictionImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setFrictionImpulse].
    public final void setFrictionImpulse(
    	Vec3 mFrictionImpulse
    ) {
    	setFrictionImpulse(
    		this.segment,
    		mFrictionImpulse.memorySegment()
    	);
    }
    
    /// ```
    /// Estimated angular friction impulse around the world space normal (kg m^2 / s)
    /// ```
    public static float getAngularFrictionImpulse(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_GET_ANGULAR_FRICTION_IMPULSE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularFrictionImpulse].
    public final float getAngularFrictionImpulse() {
    	return getAngularFrictionImpulse(
    		this.segment
    	);
    }
    
    /// ```
    /// Estimated angular friction impulse around the world space normal (kg m^2 / s)
    /// ```
    public static void setAngularFrictionImpulse(
    	MemorySegment self,
    	float mAngularFrictionImpulse
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_SET_ANGULAR_FRICTION_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAngularFrictionImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularFrictionImpulse].
    public final void setAngularFrictionImpulse(
    	float mAngularFrictionImpulse
    ) {
    	setAngularFrictionImpulse(
    		this.segment,
    		mAngularFrictionImpulse
    	);
    }
    
    /// ```
    /// Estimated contact impulses (kg m / s)
    /// ```
    public static void getContactImpulse(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_GET_CONTACT_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactImpulse].
    public final void getContactImpulse(
    	ContactImpulse outResult
    ) {
    	getContactImpulse(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Estimated contact impulses (kg m / s)
    /// ```
    public static void setContactImpulse(
    	MemorySegment self,
    	MemorySegment mContactImpulse
    ) {
    	MethodHandle method = JPH_COLLISION_ESTIMATION_RESULT_SET_CONTACT_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mContactImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setContactImpulse].
    public final void setContactImpulse(
    	ContactImpulse mContactImpulse
    ) {
    	setContactImpulse(
    		this.segment,
    		mContactImpulse.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}