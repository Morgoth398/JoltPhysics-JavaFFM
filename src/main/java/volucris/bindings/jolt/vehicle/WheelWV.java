/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.constraints.VehicleConstraint;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class WheelWV extends Wheel {

	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_CREATE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_AS_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_GET_LONGITUDINAL_SLIP;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_SET_LONGITUDINAL_SLIP;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_GET_LATERAL_SLIP;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_SET_LATERAL_SLIP;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_GET_COMBINED_LONGITUDINAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_SET_COMBINED_LONGITUDINAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_GET_COMBINED_LATERAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_SET_COMBINED_LATERAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_GET_BRAKE_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_SET_BRAKE_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_GET_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_APPLY_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_UPDATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_WHEEL_WV_CREATE = downcallHandle("JPH_WheelWV_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_WV_AS_WHEEL = downcallHandle("JPH_WheelWV_AsWheel", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_WV_GET_LONGITUDINAL_SLIP = downcallHandle("JPH_WheelWV_GetLongitudinalSlip", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_WV_SET_LONGITUDINAL_SLIP = downcallHandleVoid("JPH_WheelWV_SetLongitudinalSlip", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_WV_GET_LATERAL_SLIP = downcallHandle("JPH_WheelWV_GetLateralSlip", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_WV_SET_LATERAL_SLIP = downcallHandleVoid("JPH_WheelWV_SetLateralSlip", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_WV_GET_COMBINED_LONGITUDINAL_FRICTION = downcallHandle("JPH_WheelWV_GetCombinedLongitudinalFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_WV_SET_COMBINED_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelWV_SetCombinedLongitudinalFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_WV_GET_COMBINED_LATERAL_FRICTION = downcallHandle("JPH_WheelWV_GetCombinedLateralFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_WV_SET_COMBINED_LATERAL_FRICTION = downcallHandleVoid("JPH_WheelWV_SetCombinedLateralFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_WV_GET_BRAKE_IMPULSE = downcallHandle("JPH_WheelWV_GetBrakeImpulse", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_WV_SET_BRAKE_IMPULSE = downcallHandleVoid("JPH_WheelWV_SetBrakeImpulse", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_WV_GET_SETTINGS = downcallHandle("JPH_WheelWV_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_WV_APPLY_TORQUE = downcallHandleVoid("JPH_WheelWV_ApplyTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		JPH_WHEEL_WV_UPDATE = downcallHandleVoid("JPH_WheelWV_Update", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public WheelWV(
	    WheelSettingsWV inWheel
	) {
	    this(
	        Arena.ofAuto(),
	        inWheel
	    );
	}
	
	/// Typed method of [#create].
	public WheelWV(
		Arena arena,
		WheelSettingsWV inWheel
	) {
		MemorySegment segment = create(
			inWheel.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asWheel(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public WheelWV(MemorySegment segment) {
		this.segment = segment;
		super(asWheel(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inWheel
    ) {
    	MethodHandle method = JPH_WHEEL_WV_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inWheel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asWheel(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_WV_AS_WHEEL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Velocity difference between ground and wheel relative to ground velocity
    /// ```
    public static float getLongitudinalSlip(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_WV_GET_LONGITUDINAL_SLIP.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLongitudinalSlip].
    public final float getLongitudinalSlip() {
    	return getLongitudinalSlip(
    		this.segment
    	);
    }
    
    /// ```
    /// Velocity difference between ground and wheel relative to ground velocity
    /// ```
    public static void setLongitudinalSlip(
    	MemorySegment self,
    	float mLongitudinalSlip
    ) {
    	MethodHandle method = JPH_WHEEL_WV_SET_LONGITUDINAL_SLIP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLongitudinalSlip
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLongitudinalSlip].
    public final void setLongitudinalSlip(
    	float mLongitudinalSlip
    ) {
    	setLongitudinalSlip(
    		this.segment,
    		mLongitudinalSlip
    	);
    }
    
    /// ```
    /// Angular difference (in radians) between ground and wheel relative to ground velocity
    /// ```
    public static float getLateralSlip(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_WV_GET_LATERAL_SLIP.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLateralSlip].
    public final float getLateralSlip() {
    	return getLateralSlip(
    		this.segment
    	);
    }
    
    /// ```
    /// Angular difference (in radians) between ground and wheel relative to ground velocity
    /// ```
    public static void setLateralSlip(
    	MemorySegment self,
    	float mLateralSlip
    ) {
    	MethodHandle method = JPH_WHEEL_WV_SET_LATERAL_SLIP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLateralSlip
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLateralSlip].
    public final void setLateralSlip(
    	float mLateralSlip
    ) {
    	setLateralSlip(
    		this.segment,
    		mLateralSlip
    	);
    }
    
    /// ```
    /// Combined friction coefficient in longitudinal direction (combines terrain and tires)
    /// ```
    public static float getCombinedLongitudinalFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_WV_GET_COMBINED_LONGITUDINAL_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCombinedLongitudinalFriction].
    public final float getCombinedLongitudinalFriction() {
    	return getCombinedLongitudinalFriction(
    		this.segment
    	);
    }
    
    /// ```
    /// Combined friction coefficient in longitudinal direction (combines terrain and tires)
    /// ```
    public static void setCombinedLongitudinalFriction(
    	MemorySegment self,
    	float mCombinedLongitudinalFriction
    ) {
    	MethodHandle method = JPH_WHEEL_WV_SET_COMBINED_LONGITUDINAL_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCombinedLongitudinalFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCombinedLongitudinalFriction].
    public final void setCombinedLongitudinalFriction(
    	float mCombinedLongitudinalFriction
    ) {
    	setCombinedLongitudinalFriction(
    		this.segment,
    		mCombinedLongitudinalFriction
    	);
    }
    
    /// ```
    /// Combined friction coefficient in lateral direction (combines terrain and tires)
    /// ```
    public static float getCombinedLateralFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_WV_GET_COMBINED_LATERAL_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getCombinedLateralFriction].
    public final float getCombinedLateralFriction() {
    	return getCombinedLateralFriction(
    		this.segment
    	);
    }
    
    /// ```
    /// Combined friction coefficient in lateral direction (combines terrain and tires)
    /// ```
    public static void setCombinedLateralFriction(
    	MemorySegment self,
    	float mCombinedLateralFriction
    ) {
    	MethodHandle method = JPH_WHEEL_WV_SET_COMBINED_LATERAL_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mCombinedLateralFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setCombinedLateralFriction].
    public final void setCombinedLateralFriction(
    	float mCombinedLateralFriction
    ) {
    	setCombinedLateralFriction(
    		this.segment,
    		mCombinedLateralFriction
    	);
    }
    
    /// ```
    /// Amount of impulse that the brakes can apply to the floor (excluding friction)
    /// ```
    public static float getBrakeImpulse(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_WV_GET_BRAKE_IMPULSE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBrakeImpulse].
    public final float getBrakeImpulse() {
    	return getBrakeImpulse(
    		this.segment
    	);
    }
    
    /// ```
    /// Amount of impulse that the brakes can apply to the floor (excluding friction)
    /// ```
    public static void setBrakeImpulse(
    	MemorySegment self,
    	float mBrakeImpulse
    ) {
    	MethodHandle method = JPH_WHEEL_WV_SET_BRAKE_IMPULSE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mBrakeImpulse
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBrakeImpulse].
    public final void setBrakeImpulse(
    	float mBrakeImpulse
    ) {
    	setBrakeImpulse(
    		this.segment,
    		mBrakeImpulse
    	);
    }
    
    /// ```
    /// Override GetSettings and cast to the correct class
    /// ```
    public static MemorySegment getSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_WV_GET_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSettings].
    public final @Nullable WheelSettingsWV getSettings() {
    	MemorySegment segment = getSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WheelSettingsWV(segment);
    }
    
    /// ```
    /// Apply a torque (N m) to the wheel for a particular delta time
    /// ```
    public static void applyTorque(
    	MemorySegment self,
    	float inTorque,
    	float inDeltaTime
    ) {
    	MethodHandle method = JPH_WHEEL_WV_APPLY_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inTorque,
    			inDeltaTime
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#applyTorque].
    public final void applyTorque(
    	float inTorque,
    	float inDeltaTime
    ) {
    	applyTorque(
    		this.segment,
    		inTorque,
    		inDeltaTime
    	);
    }
    
    /// ```
    /// Update the wheel rotation based on the current angular velocity
    /// ```
    public static void update(
    	MemorySegment self,
    	int inWheelIndex,
    	float inDeltaTime,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_WHEEL_WV_UPDATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inWheelIndex,
    			inDeltaTime,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#update].
    public final void update(
    	int inWheelIndex,
    	float inDeltaTime,
    	VehicleConstraint inConstraint
    ) {
    	update(
    		this.segment,
    		inWheelIndex,
    		inDeltaTime,
    		inConstraint.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}