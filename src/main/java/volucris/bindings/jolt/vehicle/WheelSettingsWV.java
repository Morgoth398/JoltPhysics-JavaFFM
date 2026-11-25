/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.LinearCurve;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class WheelSettingsWV extends WheelSettings {

	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_CREATE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_AS_WHEEL_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_GET_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_SET_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_GET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_SET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_GET_MAX_STEER_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_SET_MAX_STEER_ANGLE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_GET_LONGITUDINAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_SET_LONGITUDINAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_GET_LATERAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_SET_LATERAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_GET_MAX_BRAKE_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_SET_MAX_BRAKE_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_GET_MAX_HAND_BRAKE_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_SET_MAX_HAND_BRAKE_TORQUE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_WHEEL_SETTINGS_WV_CREATE = downcallHandle("JPH_WheelSettingsWV_Create", UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_AS_WHEEL_SETTINGS = downcallHandle("JPH_WheelSettingsWV_AsWheelSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_GET_INERTIA = downcallHandle("JPH_WheelSettingsWV_GetInertia", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_INERTIA = downcallHandleVoid("JPH_WheelSettingsWV_SetInertia", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_WV_GET_ANGULAR_DAMPING = downcallHandle("JPH_WheelSettingsWV_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_WheelSettingsWV_SetAngularDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_WV_GET_MAX_STEER_ANGLE = downcallHandle("JPH_WheelSettingsWV_GetMaxSteerAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_MAX_STEER_ANGLE = downcallHandleVoid("JPH_WheelSettingsWV_SetMaxSteerAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_WV_GET_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsWV_GetLongitudinalFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsWV_SetLongitudinalFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_GET_LATERAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsWV_GetLateralFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_LATERAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsWV_SetLateralFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_GET_MAX_BRAKE_TORQUE = downcallHandle("JPH_WheelSettingsWV_GetMaxBrakeTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_MAX_BRAKE_TORQUE = downcallHandleVoid("JPH_WheelSettingsWV_SetMaxBrakeTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_WV_GET_MAX_HAND_BRAKE_TORQUE = downcallHandle("JPH_WheelSettingsWV_GetMaxHandBrakeTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_WV_SET_MAX_HAND_BRAKE_TORQUE = downcallHandleVoid("JPH_WheelSettingsWV_SetMaxHandBrakeTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public WheelSettingsWV() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public WheelSettingsWV(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asWheelSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public WheelSettingsWV(MemorySegment segment) {
		this.segment = segment;
		super(asWheelSettings(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asWheelSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_AS_WHEEL_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Moment of inertia (kg m^2), for a cylinder this would be 0.5 * M * R^2 which is 0.9 for a wheel with a mass of 20 kg and radius 0.3 m
    /// ```
    public static float getInertia(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_INERTIA.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getInertia].
    public final float getInertia() {
    	return getInertia(
    		this.segment
    	);
    }
    
    /// ```
    /// Moment of inertia (kg m^2), for a cylinder this would be 0.5 * M * R^2 which is 0.9 for a wheel with a mass of 20 kg and radius 0.3 m
    /// ```
    public static void setInertia(
    	MemorySegment self,
    	float mInertia
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInertia
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInertia].
    public final void setInertia(
    	float mInertia
    ) {
    	setInertia(
    		this.segment,
    		mInertia
    	);
    }
    
    /// ```
    /// Angular damping factor of the wheel: dw/dt = -c * w. Value should be zero or positive and is usually close to 0.
    /// ```
    public static float getAngularDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_ANGULAR_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularDamping].
    public final float getAngularDamping() {
    	return getAngularDamping(
    		this.segment
    	);
    }
    
    /// ```
    /// Angular damping factor of the wheel: dw/dt = -c * w. Value should be zero or positive and is usually close to 0.
    /// ```
    public static void setAngularDamping(
    	MemorySegment self,
    	float mAngularDamping
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_ANGULAR_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAngularDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularDamping].
    public final void setAngularDamping(
    	float mAngularDamping
    ) {
    	setAngularDamping(
    		this.segment,
    		mAngularDamping
    	);
    }
    
    /// ```
    /// How much this wheel can steer (radians)
    /// ```
    public static float getMaxSteerAngle(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_STEER_ANGLE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxSteerAngle].
    public final float getMaxSteerAngle() {
    	return getMaxSteerAngle(
    		this.segment
    	);
    }
    
    /// ```
    /// How much this wheel can steer (radians)
    /// ```
    public static void setMaxSteerAngle(
    	MemorySegment self,
    	float mMaxSteerAngle
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_STEER_ANGLE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxSteerAngle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxSteerAngle].
    public final void setMaxSteerAngle(
    	float mMaxSteerAngle
    ) {
    	setMaxSteerAngle(
    		this.segment,
    		mMaxSteerAngle
    	);
    }
    
    /// ```
    /// On the Y-axis: friction in the forward direction of the tire. Friction is normally between 0 (no friction) and 1 (full friction) although friction can be a little bit higher than 1 because of the profile of a tire. On the X-axis: the slip ratio (fraction) defined as (omega_wheel * r_wheel - v_longitudinal) / |v_longitudinal|. You can see slip ratio as the amount the wheel is spinning relative to the floor: 0 means the wheel has full traction and is rolling perfectly in sync with the ground, 1 is for example when the wheel is locked and sliding over the ground.
    /// ```
    public static void getLongitudinalFriction(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_LONGITUDINAL_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLongitudinalFriction].
    public final void getLongitudinalFriction(
    	LinearCurve outResult
    ) {
    	getLongitudinalFriction(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// On the Y-axis: friction in the forward direction of the tire. Friction is normally between 0 (no friction) and 1 (full friction) although friction can be a little bit higher than 1 because of the profile of a tire. On the X-axis: the slip ratio (fraction) defined as (omega_wheel * r_wheel - v_longitudinal) / |v_longitudinal|. You can see slip ratio as the amount the wheel is spinning relative to the floor: 0 means the wheel has full traction and is rolling perfectly in sync with the ground, 1 is for example when the wheel is locked and sliding over the ground.
    /// ```
    public static void setLongitudinalFriction(
    	MemorySegment self,
    	MemorySegment mLongitudinalFriction
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_LONGITUDINAL_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLongitudinalFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLongitudinalFriction].
    public final void setLongitudinalFriction(
    	LinearCurve mLongitudinalFriction
    ) {
    	setLongitudinalFriction(
    		this.segment,
    		mLongitudinalFriction.memorySegment()
    	);
    }
    
    /// ```
    /// On the Y-axis: friction in the sideways direction of the tire. Friction is normally between 0 (no friction) and 1 (full friction) although friction can be a little bit higher than 1 because of the profile of a tire. On the X-axis: the slip angle (degrees) defined as angle between relative contact velocity and tire direction.
    /// ```
    public static void getLateralFriction(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_LATERAL_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLateralFriction].
    public final void getLateralFriction(
    	LinearCurve outResult
    ) {
    	getLateralFriction(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// On the Y-axis: friction in the sideways direction of the tire. Friction is normally between 0 (no friction) and 1 (full friction) although friction can be a little bit higher than 1 because of the profile of a tire. On the X-axis: the slip angle (degrees) defined as angle between relative contact velocity and tire direction.
    /// ```
    public static void setLateralFriction(
    	MemorySegment self,
    	MemorySegment mLateralFriction
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_LATERAL_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLateralFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLateralFriction].
    public final void setLateralFriction(
    	LinearCurve mLateralFriction
    ) {
    	setLateralFriction(
    		this.segment,
    		mLateralFriction.memorySegment()
    	);
    }
    
    /// ```
    /// How much torque (Nm) the brakes can apply to this wheel
    /// ```
    public static float getMaxBrakeTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_BRAKE_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxBrakeTorque].
    public final float getMaxBrakeTorque() {
    	return getMaxBrakeTorque(
    		this.segment
    	);
    }
    
    /// ```
    /// How much torque (Nm) the brakes can apply to this wheel
    /// ```
    public static void setMaxBrakeTorque(
    	MemorySegment self,
    	float mMaxBrakeTorque
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_BRAKE_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxBrakeTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxBrakeTorque].
    public final void setMaxBrakeTorque(
    	float mMaxBrakeTorque
    ) {
    	setMaxBrakeTorque(
    		this.segment,
    		mMaxBrakeTorque
    	);
    }
    
    /// ```
    /// How much torque (Nm) the hand brake can apply to this wheel (usually only applied to the rear wheels)
    /// ```
    public static float getMaxHandBrakeTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_HAND_BRAKE_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxHandBrakeTorque].
    public final float getMaxHandBrakeTorque() {
    	return getMaxHandBrakeTorque(
    		this.segment
    	);
    }
    
    /// ```
    /// How much torque (Nm) the hand brake can apply to this wheel (usually only applied to the rear wheels)
    /// ```
    public static void setMaxHandBrakeTorque(
    	MemorySegment self,
    	float mMaxHandBrakeTorque
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_HAND_BRAKE_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxHandBrakeTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxHandBrakeTorque].
    public final void setMaxHandBrakeTorque(
    	float mMaxHandBrakeTorque
    ) {
    	setMaxHandBrakeTorque(
    		this.segment,
    		mMaxHandBrakeTorque
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}