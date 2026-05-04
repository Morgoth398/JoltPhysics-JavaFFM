/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.constraint.SpringSettings;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
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
    
    public WheelSettings(Arena arena) {
        MemorySegment segment = create();
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
    
    /**
     * Typed method of {@link #getPosition}.
     */
    public final void getPosition(
        WheelSettings settings, 
        Vec3 result
    ) {
        getPosition(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #setPosition}.
     */
    public final void setPosition(
        WheelSettings settings, 
        Vec3 value
    ) {
        setPosition(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getSuspensionForcePoint}.
     */
    public final void getSuspensionForcePoint(
        WheelSettings settings, 
        Vec3 result
    ) {
        getSuspensionForcePoint(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #setSuspensionForcePoint}.
     */
    public final void setSuspensionForcePoint(
        WheelSettings settings, 
        Vec3 value
    ) {
        setSuspensionForcePoint(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getSuspensionDirection}.
     */
    public final void getSuspensionDirection(
        WheelSettings settings, 
        Vec3 result
    ) {
        getSuspensionDirection(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #setSuspensionDirection}.
     */
    public final void setSuspensionDirection(
        WheelSettings settings, 
        Vec3 value
    ) {
        setSuspensionDirection(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getSteeringAxis}.
     */
    public final void getSteeringAxis(
        WheelSettings settings, 
        Vec3 result
    ) {
        getSteeringAxis(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #setSteeringAxis}.
     */
    public final void setSteeringAxis(
        WheelSettings settings, 
        Vec3 value
    ) {
        setSteeringAxis(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getWheelUp}.
     */
    public final void getWheelUp(
        WheelSettings settings, 
        Vec3 result
    ) {
        getWheelUp(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #setWheelUp}.
     */
    public final void setWheelUp(
        WheelSettings settings, 
        Vec3 value
    ) {
        setWheelUp(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getWheelForward}.
     */
    public final void getWheelForward(
        WheelSettings settings, 
        Vec3 result
    ) {
        getWheelForward(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #setWheelForward}.
     */
    public final void setWheelForward(
        WheelSettings settings, 
        Vec3 value
    ) {
        setWheelForward(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getSuspensionMinLength}.
     */
    public final float getSuspensionMinLength(
        WheelSettings settings
    ) {
        return (float) getSuspensionMinLength(
            settings.memorySegment()
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
    
    /**
     * Typed method of {@link #setSuspensionMinLength}.
     */
    public final void setSuspensionMinLength(
        WheelSettings settings, 
        float value
    ) {
        setSuspensionMinLength(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getSuspensionMaxLength}.
     */
    public final float getSuspensionMaxLength(
        WheelSettings settings
    ) {
        return (float) getSuspensionMaxLength(
            settings.memorySegment()
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
    
    /**
     * Typed method of {@link #setSuspensionMaxLength}.
     */
    public final void setSuspensionMaxLength(
        WheelSettings settings, 
        float value
    ) {
        setSuspensionMaxLength(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getSuspensionPreloadLength}.
     */
    public final float getSuspensionPreloadLength(
        WheelSettings settings
    ) {
        return (float) getSuspensionPreloadLength(
            settings.memorySegment()
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
    
    /**
     * Typed method of {@link #setSuspensionPreloadLength}.
     */
    public final void setSuspensionPreloadLength(
        WheelSettings settings, 
        float value
    ) {
        setSuspensionPreloadLength(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getSuspensionSpring}.
     */
    public final void getSuspensionSpring(
        WheelSettings settings, 
        SpringSettings result
    ) {
        getSuspensionSpring(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #setSuspensionSpring}.
     */
    public final void setSuspensionSpring(
        WheelSettings settings, 
        SpringSettings springSettings
    ) {
        setSuspensionSpring(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getRadius}.
     */
    public final float getRadius(
        WheelSettings settings
    ) {
        return (float) getRadius(
            settings.memorySegment()
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
    
    /**
     * Typed method of {@link #setRadius}.
     */
    public final void setRadius(
        WheelSettings settings, 
        float value
    ) {
        setRadius(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getWidth}.
     */
    public final float getWidth(
        WheelSettings settings
    ) {
        return (float) getWidth(
            settings.memorySegment()
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
    
    /**
     * Typed method of {@link #setWidth}.
     */
    public final void setWidth(
        WheelSettings settings, 
        float value
    ) {
        setWidth(
            settings.memorySegment(), 
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
    
    /**
     * Typed method of {@link #getEnableSuspensionForcePoint}.
     */
    public final boolean getEnableSuspensionForcePoint(
        WheelSettings settings
    ) {
        return (boolean) getEnableSuspensionForcePoint(
            settings.memorySegment()
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
    
    /**
     * Typed method of {@link #setEnableSuspensionForcePoint}.
     */
    public final void setEnableSuspensionForcePoint(
        WheelSettings settings, 
        boolean value
    ) {
        setEnableSuspensionForcePoint(
            settings.memorySegment(), 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}