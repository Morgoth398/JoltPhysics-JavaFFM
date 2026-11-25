/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.BodyID;
import volucris.bindings.jolt.collision.shape.SubShapeID;
import volucris.bindings.jolt.constraints.VehicleConstraint;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class Wheel
		permits WheelTV,
		WheelWV {

	private static final LazyConstant<MethodHandle> JPH_WHEEL_CREATE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_ROTATION_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SET_ROTATION_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_STEER_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SET_STEER_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_HAS_CONTACT;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_BODY_ID;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_POSITION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_POINT_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_NORMAL;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_LONGITUDINAL;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_CONTACT_LATERAL;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_SUSPENSION_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_HAS_HIT_HARD_POINT;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_SUSPENSION_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_LONGITUDINAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_GET_LATERAL_LAMBDA;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SOLVE_LONGITUDINAL_CONSTRAINT_PART;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SOLVE_LATERAL_CONSTRAINT_PART;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_WHEEL_CREATE = downcallHandle("JPH_Wheel_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_DESTROY = downcallHandleVoid("JPH_Wheel_Destroy", UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_SETTINGS = downcallHandle("JPH_Wheel_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_ANGULAR_VELOCITY = downcallHandle("JPH_Wheel_GetAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_Wheel_SetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_GET_ROTATION_ANGLE = downcallHandle("JPH_Wheel_GetRotationAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SET_ROTATION_ANGLE = downcallHandleVoid("JPH_Wheel_SetRotationAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_GET_STEER_ANGLE = downcallHandle("JPH_Wheel_GetSteerAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SET_STEER_ANGLE = downcallHandleVoid("JPH_Wheel_SetSteerAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_HAS_CONTACT = downcallHandle("JPH_Wheel_HasContact", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_CONTACT_BODY_ID = downcallHandleVoid("JPH_Wheel_GetContactBodyID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID = downcallHandleVoid("JPH_Wheel_GetContactSubShapeID", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_CONTACT_POSITION = downcallHandleVoid("JPH_Wheel_GetContactPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_CONTACT_POINT_VELOCITY = downcallHandleVoid("JPH_Wheel_GetContactPointVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_CONTACT_NORMAL = downcallHandleVoid("JPH_Wheel_GetContactNormal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_CONTACT_LONGITUDINAL = downcallHandleVoid("JPH_Wheel_GetContactLongitudinal", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_CONTACT_LATERAL = downcallHandleVoid("JPH_Wheel_GetContactLateral", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_SUSPENSION_LENGTH = downcallHandle("JPH_Wheel_GetSuspensionLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_HAS_HIT_HARD_POINT = downcallHandle("JPH_Wheel_HasHitHardPoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_SUSPENSION_LAMBDA = downcallHandle("JPH_Wheel_GetSuspensionLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_LONGITUDINAL_LAMBDA = downcallHandle("JPH_Wheel_GetLongitudinalLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_GET_LATERAL_LAMBDA = downcallHandle("JPH_Wheel_GetLateralLambda", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SOLVE_LONGITUDINAL_CONSTRAINT_PART = downcallHandle("JPH_Wheel_SolveLongitudinalConstraintPart", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_WHEEL_SOLVE_LATERAL_CONSTRAINT_PART = downcallHandle("JPH_Wheel_SolveLateralConstraintPart", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		//@formatter:on
	}

	public Wheel(
	    WheelSettings inSettings
	) {
	    this(
	        Arena.ofAuto(),
	        inSettings
	    );
	}
	
	/// Typed method of [#create].
	public Wheel(
		Arena arena,
		WheelSettings inSettings
	) {
		MemorySegment segment = create(
			inSettings.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public Wheel(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor / destructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inSettings
    ) {
    	MethodHandle method = JPH_WHEEL_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get settings for the wheel
    /// ```
    public static MemorySegment getSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_GET_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSettings].
    public @Nullable WheelSettings getSettings() {
    	MemorySegment segment = getSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WheelSettings(segment);
    }
    
    /// ```
    /// Get the angular velocity (rad/s) for this wheel, note that positive means the wheel is rotating such that the car moves forward
    /// ```
    public static float getAngularVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_GET_ANGULAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public final float getAngularVelocity() {
    	return getAngularVelocity(
    		this.segment
    	);
    }
    
    /// ```
    /// Update the angular velocity (rad/s)
    /// ```
    public static void setAngularVelocity(
    	MemorySegment self,
    	float inVel
    ) {
    	MethodHandle method = JPH_WHEEL_SET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inVel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity].
    public final void setAngularVelocity(
    	float inVel
    ) {
    	setAngularVelocity(
    		this.segment,
    		inVel
    	);
    }
    
    /// ```
    /// Get the current rotation angle of the wheel in radians [0, 2 pi]
    /// ```
    public static float getRotationAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_GET_ROTATION_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRotationAngle].
    public final float getRotationAngle() {
    	return getRotationAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the current rotation angle of the wheel in radians [0, 2 pi]
    /// ```
    public static void setRotationAngle(
    	MemorySegment self,
    	float inAngle
    ) {
    	MethodHandle method = JPH_WHEEL_SET_ROTATION_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRotationAngle].
    public final void setRotationAngle(
    	float inAngle
    ) {
    	setRotationAngle(
    		this.segment,
    		inAngle
    	);
    }
    
    /// ```
    /// Get the current steer angle of the wheel in radians [-pi, pi], positive is to the left
    /// ```
    public static float getSteerAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_GET_STEER_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSteerAngle].
    public final float getSteerAngle() {
    	return getSteerAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// Set the current steer angle of the wheel in radians [-pi, pi]
    /// ```
    public static void setSteerAngle(
    	MemorySegment self,
    	float inAngle
    ) {
    	MethodHandle method = JPH_WHEEL_SET_STEER_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSteerAngle].
    public final void setSteerAngle(
    	float inAngle
    ) {
    	setSteerAngle(
    		this.segment,
    		inAngle
    	);
    }
    
    /// ```
    /// Returns true if the wheel is touching an object
    /// ```
    public static boolean hasContact(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_HAS_CONTACT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasContact].
    public final boolean hasContact() {
    	return hasContact(
    		this.segment
    	);
    }
    
    /// ```
    /// Returns the body ID of the body that this wheel is touching
    /// ```
    public static void getContactBodyID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_GET_CONTACT_BODY_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactBodyID].
    public final void getContactBodyID(
    	BodyID outResult
    ) {
    	getContactBodyID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns the sub shape ID where we're contacting the body
    /// ```
    public static void getContactSubShapeID(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_GET_CONTACT_SUB_SHAPE_ID.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactSubShapeID].
    public final void getContactSubShapeID(
    	SubShapeID outResult
    ) {
    	getContactSubShapeID(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns the current contact position in world space (note by the time you call this the vehicle has moved)
    /// ```
    public static void getContactPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_GET_CONTACT_POSITION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactPosition].
    public final void getContactPosition(
    	Vec3 outResult
    ) {
    	getContactPosition(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Velocity of the contact point (m / s, not relative to the wheel but in world space)
    /// ```
    public static void getContactPointVelocity(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_GET_CONTACT_POINT_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactPointVelocity].
    public final void getContactPointVelocity(
    	Vec3 outResult
    ) {
    	getContactPointVelocity(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns the current contact normal in world space (note by the time you call this the vehicle has moved)
    /// ```
    public static void getContactNormal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_GET_CONTACT_NORMAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactNormal].
    public final void getContactNormal(
    	Vec3 outResult
    ) {
    	getContactNormal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns longitudinal direction (direction along the wheel relative to floor) in world space (note by the time you call this the vehicle has moved)
    /// ```
    public static void getContactLongitudinal(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_GET_CONTACT_LONGITUDINAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactLongitudinal].
    public final void getContactLongitudinal(
    	Vec3 outResult
    ) {
    	getContactLongitudinal(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Returns lateral direction (sideways direction) in world space (note by the time you call this the vehicle has moved)
    /// ```
    public static void getContactLateral(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_GET_CONTACT_LATERAL.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getContactLateral].
    public final void getContactLateral(
    	Vec3 outResult
    ) {
    	getContactLateral(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Get the length of the suspension for a wheel (m) relative to the suspension attachment point (hard point)
    /// ```
    public static float getSuspensionLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_GET_SUSPENSION_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionLength].
    public final float getSuspensionLength() {
    	return getSuspensionLength(
    		this.segment
    	);
    }
    
    /// ```
    /// Check if the suspension hit its upper limit
    /// ```
    public static boolean hasHitHardPoint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_HAS_HIT_HARD_POINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#hasHitHardPoint].
    public final boolean hasHitHardPoint() {
    	return hasHitHardPoint(
    		this.segment
    	);
    }
    
    /// ```
    /// Get the total impulse (N s) that was applied by the suspension
    /// ```
    public static float getSuspensionLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_GET_SUSPENSION_LAMBDA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionLambda].
    public final float getSuspensionLambda() {
    	return getSuspensionLambda(
    		this.segment
    	);
    }
    
    /// ```
    /// Get total impulse (N s) applied along the forward direction of the wheel
    /// ```
    public static float getLongitudinalLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_GET_LONGITUDINAL_LAMBDA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLongitudinalLambda].
    public final float getLongitudinalLambda() {
    	return getLongitudinalLambda(
    		this.segment
    	);
    }
    
    /// ```
    /// Get total impulse (N s) applied along the sideways direction of the wheel
    /// ```
    public static float getLateralLambda(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_GET_LATERAL_LAMBDA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLateralLambda].
    public final float getLateralLambda() {
    	return getLateralLambda(
    		this.segment
    	);
    }
    
    /// ```
    /// Internal function that should only be called by the controller. Used to apply impulses in the forward direction of the vehicle.
    /// ```
    public static boolean solveLongitudinalConstraintPart(
    	MemorySegment self,
    	MemorySegment inConstraint,
    	float inMinImpulse,
    	float inMaxImpulse
    ) {
    	MethodHandle method = JPH_WHEEL_SOLVE_LONGITUDINAL_CONSTRAINT_PART.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inConstraint,
    			inMinImpulse,
    			inMaxImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solveLongitudinalConstraintPart].
    public final boolean solveLongitudinalConstraintPart(
    	VehicleConstraint inConstraint,
    	float inMinImpulse,
    	float inMaxImpulse
    ) {
    	return solveLongitudinalConstraintPart(
    		this.segment,
    		inConstraint.memorySegment(),
    		inMinImpulse,
    		inMaxImpulse
    	);
    }
    
    /// ```
    /// Internal function that should only be called by the controller. Used to apply impulses in the sideways direction of the vehicle.
    /// ```
    public static boolean solveLateralConstraintPart(
    	MemorySegment self,
    	MemorySegment inConstraint,
    	float inMinImpulse,
    	float inMaxImpulse
    ) {
    	MethodHandle method = JPH_WHEEL_SOLVE_LATERAL_CONSTRAINT_PART.get();
    	try {
    		return (boolean) method.invokeExact(
    			self,
    			inConstraint,
    			inMinImpulse,
    			inMaxImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#solveLateralConstraintPart].
    public final boolean solveLateralConstraintPart(
    	VehicleConstraint inConstraint,
    	float inMinImpulse,
    	float inMaxImpulse
    ) {
    	return solveLateralConstraintPart(
    		this.segment,
    		inConstraint.memorySegment(),
    		inMinImpulse,
    		inMaxImpulse
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