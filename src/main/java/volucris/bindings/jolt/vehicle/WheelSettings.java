/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.constraint.SpringSettings;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class WheelSettings
		permits WheelSettingsTV,
		WheelSettingsWV {

    private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_DESTROY;
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

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_WHEEL_SETTINGS_CREATE = downcallHandle("JPH_WheelSettings_Create", UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_DESTROY = downcallHandleVoid("JPH_WheelSettings_Destroy", UNBOUNDED_ADDRESS);
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
    
    	this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public WheelSettings(MemorySegment segment) {
    	this.segment = segment;
    }

    public static MemorySegment create() {
    	MethodHandle method = JPH_WHEEL_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			settings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void getPosition(
    	MemorySegment settings,
    	MemorySegment result
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_POSITION.get();
    	try {
    		 method.invokeExact(
    			settings,
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getPosition].
    public final void getPosition(
    	Vec3 result
    ) {
    	getPosition(
    		this.segment,
    		result.memorySegment()
    	);
    }
    
    public static void setPosition(
    	MemorySegment settings,
    	MemorySegment value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setPosition].
    public final void setPosition(
    	Vec3 value
    ) {
    	setPosition(
    		this.segment,
    		value.memorySegment()
    	);
    }
    
    public static void getSuspensionForcePoint(
    	MemorySegment settings,
    	MemorySegment result
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_FORCE_POINT.get();
    	try {
    		 method.invokeExact(
    			settings,
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionForcePoint].
    public final void getSuspensionForcePoint(
    	Vec3 result
    ) {
    	getSuspensionForcePoint(
    		this.segment,
    		result.memorySegment()
    	);
    }
    
    public static void setSuspensionForcePoint(
    	MemorySegment settings,
    	MemorySegment value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_FORCE_POINT.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionForcePoint].
    public final void setSuspensionForcePoint(
    	Vec3 value
    ) {
    	setSuspensionForcePoint(
    		this.segment,
    		value.memorySegment()
    	);
    }
    
    public static void getSuspensionDirection(
    	MemorySegment settings,
    	MemorySegment result
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			settings,
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionDirection].
    public final void getSuspensionDirection(
    	Vec3 result
    ) {
    	getSuspensionDirection(
    		this.segment,
    		result.memorySegment()
    	);
    }
    
    public static void setSuspensionDirection(
    	MemorySegment settings,
    	MemorySegment value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionDirection].
    public final void setSuspensionDirection(
    	Vec3 value
    ) {
    	setSuspensionDirection(
    		this.segment,
    		value.memorySegment()
    	);
    }
    
    public static void getSteeringAxis(
    	MemorySegment settings,
    	MemorySegment result
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_STEERING_AXIS.get();
    	try {
    		 method.invokeExact(
    			settings,
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSteeringAxis].
    public final void getSteeringAxis(
    	Vec3 result
    ) {
    	getSteeringAxis(
    		this.segment,
    		result.memorySegment()
    	);
    }
    
    public static void setSteeringAxis(
    	MemorySegment settings,
    	MemorySegment value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_STEERING_AXIS.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSteeringAxis].
    public final void setSteeringAxis(
    	Vec3 value
    ) {
    	setSteeringAxis(
    		this.segment,
    		value.memorySegment()
    	);
    }
    
    public static void getWheelUp(
    	MemorySegment settings,
    	MemorySegment result
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_WHEEL_UP.get();
    	try {
    		 method.invokeExact(
    			settings,
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelUp].
    public final void getWheelUp(
    	Vec3 result
    ) {
    	getWheelUp(
    		this.segment,
    		result.memorySegment()
    	);
    }
    
    public static void setWheelUp(
    	MemorySegment settings,
    	MemorySegment value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_WHEEL_UP.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWheelUp].
    public final void setWheelUp(
    	Vec3 value
    ) {
    	setWheelUp(
    		this.segment,
    		value.memorySegment()
    	);
    }
    
    public static void getWheelForward(
    	MemorySegment settings,
    	MemorySegment result
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_WHEEL_FORWARD.get();
    	try {
    		 method.invokeExact(
    			settings,
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheelForward].
    public final void getWheelForward(
    	Vec3 result
    ) {
    	getWheelForward(
    		this.segment,
    		result.memorySegment()
    	);
    }
    
    public static void setWheelForward(
    	MemorySegment settings,
    	MemorySegment value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_WHEEL_FORWARD.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWheelForward].
    public final void setWheelForward(
    	Vec3 value
    ) {
    	setWheelForward(
    		this.segment,
    		value.memorySegment()
    	);
    }
    
    public static float getSuspensionMinLength(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_MIN_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			settings
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
    
    public static void setSuspensionMinLength(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_MIN_LENGTH.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionMinLength].
    public final void setSuspensionMinLength(
    	float value
    ) {
    	setSuspensionMinLength(
    		this.segment,
    		value
    	);
    }
    
    public static float getSuspensionMaxLength(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_MAX_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			settings
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
    
    public static void setSuspensionMaxLength(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_MAX_LENGTH.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionMaxLength].
    public final void setSuspensionMaxLength(
    	float value
    ) {
    	setSuspensionMaxLength(
    		this.segment,
    		value
    	);
    }
    
    public static float getSuspensionPreloadLength(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_PRELOAD_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			settings
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
    
    public static void setSuspensionPreloadLength(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_PRELOAD_LENGTH.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionPreloadLength].
    public final void setSuspensionPreloadLength(
    	float value
    ) {
    	setSuspensionPreloadLength(
    		this.segment,
    		value
    	);
    }
    
    public static void getSuspensionSpring(
    	MemorySegment settings,
    	MemorySegment result
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_SUSPENSION_SPRING.get();
    	try {
    		 method.invokeExact(
    			settings,
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSuspensionSpring].
    public final void getSuspensionSpring(
    	SpringSettings result
    ) {
    	getSuspensionSpring(
    		this.segment,
    		result.memorySegment()
    	);
    }
    
    public static void setSuspensionSpring(
    	MemorySegment settings,
    	MemorySegment springSettings
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_SUSPENSION_SPRING.get();
    	try {
    		 method.invokeExact(
    			settings,
    			springSettings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setSuspensionSpring].
    public final void setSuspensionSpring(
    	SpringSettings springSettings
    ) {
    	setSuspensionSpring(
    		this.segment,
    		springSettings.memorySegment()
    	);
    }
    
    public static float getRadius(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_RADIUS.get();
    	try {
    		return (float) method.invokeExact(
    			settings
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
    
    public static void setRadius(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_RADIUS.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setRadius].
    public final void setRadius(
    	float value
    ) {
    	setRadius(
    		this.segment,
    		value
    	);
    }
    
    public static float getWidth(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_WIDTH.get();
    	try {
    		return (float) method.invokeExact(
    			settings
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
    
    public static void setWidth(
    	MemorySegment settings,
    	float value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_WIDTH.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWidth].
    public final void setWidth(
    	float value
    ) {
    	setWidth(
    		this.segment,
    		value
    	);
    }
    
    public static boolean getEnableSuspensionForcePoint(
    	MemorySegment settings
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_GET_ENABLE_SUSPENSION_FORCE_POINT.get();
    	try {
    		return (boolean) method.invokeExact(
    			settings
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
    
    public static void setEnableSuspensionForcePoint(
    	MemorySegment settings,
    	boolean value
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_SET_ENABLE_SUSPENSION_FORCE_POINT.get();
    	try {
    		 method.invokeExact(
    			settings,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setEnableSuspensionForcePoint].
    public final void setEnableSuspensionForcePoint(
    	boolean value
    ) {
    	setEnableSuspensionForcePoint(
    		this.segment,
    		value
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}