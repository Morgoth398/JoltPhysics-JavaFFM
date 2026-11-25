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

public final class WheelTV extends Wheel {

	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_CREATE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_AS_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_GET_TRACK_INDEX;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_SET_TRACK_INDEX;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_GET_COMBINED_LONGITUDINAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_SET_COMBINED_LONGITUDINAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_GET_COMBINED_LATERAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_SET_COMBINED_LATERAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_GET_BRAKE_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_SET_BRAKE_IMPULSE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_GET_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_CALCULATE_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_UPDATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_WHEEL_TV_CREATE = downcallHandle("JPH_WheelTV_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_TV_AS_WHEEL = downcallHandle("JPH_WheelTV_AsWheel", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_TV_GET_TRACK_INDEX = downcallHandle("JPH_WheelTV_GetTrackIndex", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_TV_SET_TRACK_INDEX = downcallHandleVoid("JPH_WheelTV_SetTrackIndex", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_WHEEL_TV_GET_COMBINED_LONGITUDINAL_FRICTION = downcallHandle("JPH_WheelTV_GetCombinedLongitudinalFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_TV_SET_COMBINED_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelTV_SetCombinedLongitudinalFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_TV_GET_COMBINED_LATERAL_FRICTION = downcallHandle("JPH_WheelTV_GetCombinedLateralFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_TV_SET_COMBINED_LATERAL_FRICTION = downcallHandleVoid("JPH_WheelTV_SetCombinedLateralFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_TV_GET_BRAKE_IMPULSE = downcallHandle("JPH_WheelTV_GetBrakeImpulse", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_TV_SET_BRAKE_IMPULSE = downcallHandleVoid("JPH_WheelTV_SetBrakeImpulse", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_TV_GET_SETTINGS = downcallHandle("JPH_WheelTV_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_TV_CALCULATE_ANGULAR_VELOCITY = downcallHandleVoid("JPH_WheelTV_CalculateAngularVelocity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_TV_UPDATE = downcallHandleVoid("JPH_WheelTV_Update", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public WheelTV(
	    WheelSettingsTV inWheel
	) {
	    this(
	        Arena.ofAuto(),
	        inWheel
	    );
	}
	
	/// Typed method of [#create].
	public WheelTV(
		Arena arena,
		WheelSettingsTV inWheel
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

	public WheelTV(MemorySegment segment) {
		this.segment = segment;
		super(asWheel(segment));
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create(
    	MemorySegment inWheel
    ) {
    	MethodHandle method = JPH_WHEEL_TV_CREATE.get();
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
    	MethodHandle method = JPH_WHEEL_TV_AS_WHEEL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Index in mTracks to which this wheel is attached (calculated on initialization)
    /// ```
    public static int getTrackIndex(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_TV_GET_TRACK_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getTrackIndex].
    public final int getTrackIndex() {
    	return getTrackIndex(
    		this.segment
    	);
    }
    
    /// ```
    /// Index in mTracks to which this wheel is attached (calculated on initialization)
    /// ```
    public static void setTrackIndex(
    	MemorySegment self,
    	int mTrackIndex
    ) {
    	MethodHandle method = JPH_WHEEL_TV_SET_TRACK_INDEX.get();
    	try {
    		 method.invokeExact(
    			self,
    			mTrackIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setTrackIndex].
    public final void setTrackIndex(
    	int mTrackIndex
    ) {
    	setTrackIndex(
    		this.segment,
    		mTrackIndex
    	);
    }
    
    /// ```
    /// Combined friction coefficient in longitudinal direction (combines terrain and track)
    /// ```
    public static float getCombinedLongitudinalFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_TV_GET_COMBINED_LONGITUDINAL_FRICTION.get();
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
    /// Combined friction coefficient in longitudinal direction (combines terrain and track)
    /// ```
    public static void setCombinedLongitudinalFriction(
    	MemorySegment self,
    	float mCombinedLongitudinalFriction
    ) {
    	MethodHandle method = JPH_WHEEL_TV_SET_COMBINED_LONGITUDINAL_FRICTION.get();
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
    /// Combined friction coefficient in lateral direction (combines terrain and track)
    /// ```
    public static float getCombinedLateralFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_TV_GET_COMBINED_LATERAL_FRICTION.get();
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
    /// Combined friction coefficient in lateral direction (combines terrain and track)
    /// ```
    public static void setCombinedLateralFriction(
    	MemorySegment self,
    	float mCombinedLateralFriction
    ) {
    	MethodHandle method = JPH_WHEEL_TV_SET_COMBINED_LATERAL_FRICTION.get();
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
    /// Amount of impulse that the brakes can apply to the floor (excluding friction), spread out from brake impulse applied on track
    /// ```
    public static float getBrakeImpulse(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_TV_GET_BRAKE_IMPULSE.get();
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
    /// Amount of impulse that the brakes can apply to the floor (excluding friction), spread out from brake impulse applied on track
    /// ```
    public static void setBrakeImpulse(
    	MemorySegment self,
    	float mBrakeImpulse
    ) {
    	MethodHandle method = JPH_WHEEL_TV_SET_BRAKE_IMPULSE.get();
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
    	MethodHandle method = JPH_WHEEL_TV_GET_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSettings].
    public final @Nullable WheelSettingsTV getSettings() {
    	MemorySegment segment = getSettings(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new WheelSettingsTV(segment);
    }
    
    /// ```
    /// Update the angular velocity of the wheel based on the angular velocity of the track
    /// ```
    public static void calculateAngularVelocity(
    	MemorySegment self,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_WHEEL_TV_CALCULATE_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#calculateAngularVelocity].
    public final void calculateAngularVelocity(
    	VehicleConstraint inConstraint
    ) {
    	calculateAngularVelocity(
    		this.segment,
    		inConstraint.memorySegment()
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
    	MethodHandle method = JPH_WHEEL_TV_UPDATE.get();
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