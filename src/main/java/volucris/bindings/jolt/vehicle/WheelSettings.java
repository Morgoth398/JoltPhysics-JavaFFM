/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.constraints.SpringSettings;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class WheelSettings extends WheelSettingsRefTarget
		permits WheelSettingsTV,
		WheelSettingsWV {

	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_POSITION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_SUSPENSION_FORCE_POINT;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_SUSPENSION_FORCE_POINT;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_SUSPENSION_DIRECTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_SUSPENSION_DIRECTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_STEERING_AXIS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_STEERING_AXIS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_WHEEL_UP;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_WHEEL_UP;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_WHEEL_FORWARD;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_WHEEL_FORWARD;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_SUSPENSION_MIN_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_SUSPENSION_MIN_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_SUSPENSION_MAX_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_SUSPENSION_MAX_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_SUSPENSION_PRELOAD_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_SUSPENSION_PRELOAD_LENGTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_SUSPENSION_SPRING;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_SUSPENSION_SPRING;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_RADIUS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_WIDTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_WIDTH;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_GET_ENABLE_SUSPENSION_FORCE_POINT;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SET_ENABLE_SUSPENSION_FORCE_POINT;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_RESTORE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_WHEEL_SETTINGS_CREATE = downcallHandle("JPH_WheelSettings_Create", UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_AS_REF_TARGET = downcallHandle("JPH_WheelSettings_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_GET_POSITION = downcallHandleVoid("JPH_WheelSettings_GetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_POSITION = downcallHandleVoid("JPH_WheelSettings_SetPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_FORCE_POINT = downcallHandleVoid("JPH_WheelSettings_GetSuspensionForcePoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_FORCE_POINT = downcallHandleVoid("JPH_WheelSettings_SetSuspensionForcePoint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_DIRECTION = downcallHandleVoid("JPH_WheelSettings_GetSuspensionDirection", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_DIRECTION = downcallHandleVoid("JPH_WheelSettings_SetSuspensionDirection", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_GET_STEERING_AXIS = downcallHandleVoid("JPH_WheelSettings_GetSteeringAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_STEERING_AXIS = downcallHandleVoid("JPH_WheelSettings_SetSteeringAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_GET_WHEEL_UP = downcallHandleVoid("JPH_WheelSettings_GetWheelUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_WHEEL_UP = downcallHandleVoid("JPH_WheelSettings_SetWheelUp", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_GET_WHEEL_FORWARD = downcallHandleVoid("JPH_WheelSettings_GetWheelForward", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_WHEEL_FORWARD = downcallHandleVoid("JPH_WheelSettings_SetWheelForward", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_MIN_LENGTH = downcallHandle("JPH_WheelSettings_GetSuspensionMinLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_MIN_LENGTH = downcallHandleVoid("JPH_WheelSettings_SetSuspensionMinLength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_MAX_LENGTH = downcallHandle("JPH_WheelSettings_GetSuspensionMaxLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_MAX_LENGTH = downcallHandleVoid("JPH_WheelSettings_SetSuspensionMaxLength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_PRELOAD_LENGTH = downcallHandle("JPH_WheelSettings_GetSuspensionPreloadLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_PRELOAD_LENGTH = downcallHandleVoid("JPH_WheelSettings_SetSuspensionPreloadLength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_SUSPENSION_SPRING = downcallHandleVoid("JPH_WheelSettings_GetSuspensionSpring", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_SUSPENSION_SPRING = downcallHandleVoid("JPH_WheelSettings_SetSuspensionSpring", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_GET_RADIUS = downcallHandle("JPH_WheelSettings_GetRadius", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_RADIUS = downcallHandleVoid("JPH_WheelSettings_SetRadius", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_WIDTH = downcallHandle("JPH_WheelSettings_GetWidth", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_WIDTH = downcallHandleVoid("JPH_WheelSettings_SetWidth", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_GET_ENABLE_SUSPENSION_FORCE_POINT = downcallHandle("JPH_WheelSettings_GetEnableSuspensionForcePoint", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_SET_ENABLE_SUSPENSION_FORCE_POINT = downcallHandleVoid("JPH_WheelSettings_SetEnableSuspensionForcePoint", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		JPH_WHEEL_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_WheelSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_WheelSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_DESTROY = downcallHandleVoid("JPH_WheelSettings_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public WheelSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public WheelSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asRefTarget(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public WheelSettings(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_WHEEL_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Attachment point of wheel suspension in local space of the body
    /// ```
    public static void getPosition(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_POSITION.get();
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
    /// Attachment point of wheel suspension in local space of the body
    /// ```
    public static void setPosition(
    	MemorySegment self,
    	MemorySegment mPosition
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_POSITION.get();
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
    /// Where tire forces (suspension and traction) are applied, in local space of the body. A good default is the center of the wheel in its neutral pose. See mEnableSuspensionForcePoint.
    /// ```
    public static void getSuspensionForcePoint(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_FORCE_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionForcePoint].
    public final void getSuspensionForcePoint(
    	Vec3 outResult
    ) {
    	getSuspensionForcePoint(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Where tire forces (suspension and traction) are applied, in local space of the body. A good default is the center of the wheel in its neutral pose. See mEnableSuspensionForcePoint.
    /// ```
    public static void setSuspensionForcePoint(
    	MemorySegment self,
    	MemorySegment mSuspensionForcePoint
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_FORCE_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSuspensionForcePoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionForcePoint].
    public final void setSuspensionForcePoint(
    	Vec3 mSuspensionForcePoint
    ) {
    	setSuspensionForcePoint(
    		this.segment,
    		mSuspensionForcePoint.memorySegment()
    	);
    }
    
    /// ```
    /// Direction of the suspension in local space of the body, should point down
    /// ```
    public static void getSuspensionDirection(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionDirection].
    public final void getSuspensionDirection(
    	Vec3 outResult
    ) {
    	getSuspensionDirection(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Direction of the suspension in local space of the body, should point down
    /// ```
    public static void setSuspensionDirection(
    	MemorySegment self,
    	MemorySegment mSuspensionDirection
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSuspensionDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionDirection].
    public final void setSuspensionDirection(
    	Vec3 mSuspensionDirection
    ) {
    	setSuspensionDirection(
    		this.segment,
    		mSuspensionDirection.memorySegment()
    	);
    }
    
    /// ```
    /// Direction of the steering axis in local space of the body, should point up (e.g. for a bike would be -mSuspensionDirection)
    /// ```
    public static void getSteeringAxis(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_STEERING_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSteeringAxis].
    public final void getSteeringAxis(
    	Vec3 outResult
    ) {
    	getSteeringAxis(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Direction of the steering axis in local space of the body, should point up (e.g. for a bike would be -mSuspensionDirection)
    /// ```
    public static void setSteeringAxis(
    	MemorySegment self,
    	MemorySegment mSteeringAxis
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_STEERING_AXIS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSteeringAxis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSteeringAxis].
    public final void setSteeringAxis(
    	Vec3 mSteeringAxis
    ) {
    	setSteeringAxis(
    		this.segment,
    		mSteeringAxis.memorySegment()
    	);
    }
    
    /// ```
    /// Up direction when the wheel is in the neutral steering position (usually VehicleConstraintSettings::mUp but can be used to give the wheel camber or for a bike would be -mSuspensionDirection)
    /// ```
    public static void getWheelUp(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_WHEEL_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelUp].
    public final void getWheelUp(
    	Vec3 outResult
    ) {
    	getWheelUp(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Up direction when the wheel is in the neutral steering position (usually VehicleConstraintSettings::mUp but can be used to give the wheel camber or for a bike would be -mSuspensionDirection)
    /// ```
    public static void setWheelUp(
    	MemorySegment self,
    	MemorySegment mWheelUp
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_WHEEL_UP.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWheelUp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWheelUp].
    public final void setWheelUp(
    	Vec3 mWheelUp
    ) {
    	setWheelUp(
    		this.segment,
    		mWheelUp.memorySegment()
    	);
    }
    
    /// ```
    /// Forward direction when the wheel is in the neutral steering position (usually VehicleConstraintSettings::mForward but can be used to give the wheel toe, does not need to be perpendicular to mWheelUp)
    /// ```
    public static void getWheelForward(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_WHEEL_FORWARD.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelForward].
    public final void getWheelForward(
    	Vec3 outResult
    ) {
    	getWheelForward(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Forward direction when the wheel is in the neutral steering position (usually VehicleConstraintSettings::mForward but can be used to give the wheel toe, does not need to be perpendicular to mWheelUp)
    /// ```
    public static void setWheelForward(
    	MemorySegment self,
    	MemorySegment mWheelForward
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_WHEEL_FORWARD.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWheelForward
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWheelForward].
    public final void setWheelForward(
    	Vec3 mWheelForward
    ) {
    	setWheelForward(
    		this.segment,
    		mWheelForward.memorySegment()
    	);
    }
    
    /// ```
    /// How long the suspension is in max raised position relative to the attachment point (m)
    /// ```
    public static float getSuspensionMinLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_MIN_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionMinLength].
    public final float getSuspensionMinLength() {
    	return getSuspensionMinLength(
    		this.segment
    	);
    }
    
    /// ```
    /// How long the suspension is in max raised position relative to the attachment point (m)
    /// ```
    public static void setSuspensionMinLength(
    	MemorySegment self,
    	float mSuspensionMinLength
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_MIN_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSuspensionMinLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionMinLength].
    public final void setSuspensionMinLength(
    	float mSuspensionMinLength
    ) {
    	setSuspensionMinLength(
    		this.segment,
    		mSuspensionMinLength
    	);
    }
    
    /// ```
    /// How long the suspension is in max droop position relative to the attachment point (m)
    /// ```
    public static float getSuspensionMaxLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_MAX_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionMaxLength].
    public final float getSuspensionMaxLength() {
    	return getSuspensionMaxLength(
    		this.segment
    	);
    }
    
    /// ```
    /// How long the suspension is in max droop position relative to the attachment point (m)
    /// ```
    public static void setSuspensionMaxLength(
    	MemorySegment self,
    	float mSuspensionMaxLength
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_MAX_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSuspensionMaxLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionMaxLength].
    public final void setSuspensionMaxLength(
    	float mSuspensionMaxLength
    ) {
    	setSuspensionMaxLength(
    		this.segment,
    		mSuspensionMaxLength
    	);
    }
    
    /// ```
    /// The natural length (m) of the suspension spring is defined as mSuspensionMaxLength + mSuspensionPreloadLength. Can be used to preload the suspension as the spring is compressed by mSuspensionPreloadLength when the suspension is in max droop position. Note that this means when the vehicle touches the ground there is a discontinuity so it will also make the vehicle more bouncy as we're updating with discrete time steps.
    /// ```
    public static float getSuspensionPreloadLength(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_PRELOAD_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionPreloadLength].
    public final float getSuspensionPreloadLength() {
    	return getSuspensionPreloadLength(
    		this.segment
    	);
    }
    
    /// ```
    /// The natural length (m) of the suspension spring is defined as mSuspensionMaxLength + mSuspensionPreloadLength. Can be used to preload the suspension as the spring is compressed by mSuspensionPreloadLength when the suspension is in max droop position. Note that this means when the vehicle touches the ground there is a discontinuity so it will also make the vehicle more bouncy as we're updating with discrete time steps.
    /// ```
    public static void setSuspensionPreloadLength(
    	MemorySegment self,
    	float mSuspensionPreloadLength
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_PRELOAD_LENGTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSuspensionPreloadLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionPreloadLength].
    public final void setSuspensionPreloadLength(
    	float mSuspensionPreloadLength
    ) {
    	setSuspensionPreloadLength(
    		this.segment,
    		mSuspensionPreloadLength
    	);
    }
    
    /// ```
    /// Settings for the suspension spring
    /// ```
    public static void getSuspensionSpring(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_SPRING.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionSpring].
    public final void getSuspensionSpring(
    	SpringSettings outResult
    ) {
    	getSuspensionSpring(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Settings for the suspension spring
    /// ```
    public static void setSuspensionSpring(
    	MemorySegment self,
    	MemorySegment mSuspensionSpring
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_SPRING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mSuspensionSpring
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionSpring].
    public final void setSuspensionSpring(
    	SpringSettings mSuspensionSpring
    ) {
    	setSuspensionSpring(
    		this.segment,
    		mSuspensionSpring.memorySegment()
    	);
    }
    
    /// ```
    /// Radius of the wheel (m)
    /// ```
    public static float getRadius(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getRadius].
    public final float getRadius() {
    	return getRadius(
    		this.segment
    	);
    }
    
    /// ```
    /// Radius of the wheel (m)
    /// ```
    public static void setRadius(
    	MemorySegment self,
    	float mRadius
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_RADIUS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mRadius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRadius].
    public final void setRadius(
    	float mRadius
    ) {
    	setRadius(
    		this.segment,
    		mRadius
    	);
    }
    
    /// ```
    /// Width of the wheel (m)
    /// ```
    public static float getWidth(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_WIDTH.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWidth].
    public final float getWidth() {
    	return getWidth(
    		this.segment
    	);
    }
    
    /// ```
    /// Width of the wheel (m)
    /// ```
    public static void setWidth(
    	MemorySegment self,
    	float mWidth
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_WIDTH.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWidth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWidth].
    public final void setWidth(
    	float mWidth
    ) {
    	setWidth(
    		this.segment,
    		mWidth
    	);
    }
    
    /// ```
    /// Enables mSuspensionForcePoint, if disabled, the forces are applied at the collision contact point. This leads to a more accurate simulation when interacting with dynamic objects but makes the vehicle less stable. When setting this to true, all forces will be applied to a fixed point on the vehicle body.
    /// ```
    public static boolean getEnableSuspensionForcePoint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_ENABLE_SUSPENSION_FORCE_POINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getEnableSuspensionForcePoint].
    public final boolean getEnableSuspensionForcePoint() {
    	return getEnableSuspensionForcePoint(
    		this.segment
    	);
    }
    
    /// ```
    /// Enables mSuspensionForcePoint, if disabled, the forces are applied at the collision contact point. This leads to a more accurate simulation when interacting with dynamic objects but makes the vehicle less stable. When setting this to true, all forces will be applied to a fixed point on the vehicle body.
    /// ```
    public static void setEnableSuspensionForcePoint(
    	MemorySegment self,
    	boolean mEnableSuspensionForcePoint
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_ENABLE_SUSPENSION_FORCE_POINT.get();
    	try {
    		 method.invokeExact(
    			self,
    			mEnableSuspensionForcePoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEnableSuspensionForcePoint].
    public final void setEnableSuspensionForcePoint(
    	boolean mEnableSuspensionForcePoint
    ) {
    	setEnableSuspensionForcePoint(
    		this.segment,
    		mEnableSuspensionForcePoint
    	);
    }
    
    /// ```
    /// Saves the contents in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restores the contents in binary form to inStream.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_RESTORE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreBinaryState].
    public final void restoreBinaryState(
    	StreamIn inStream
    ) {
    	restoreBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public final void destroy() {
    	destroy(
    		this.segment
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