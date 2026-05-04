/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.LinearCurve;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class WheelSettingsWV extends WheelSettings {

    private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_WV_CREATE;
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
        JPH_WHEEL_SETTINGS_WV_GET_INERTIA = downcallHandle("JPH_WheelSettingsWV_GetInertia", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_WV_SET_INERTIA = downcallHandleVoid("JPH_WheelSettingsWV_SetInertia", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEEL_SETTINGS_WV_GET_ANGULAR_DAMPING = downcallHandle("JPH_WheelSettingsWV_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_WV_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_WheelSettingsWV_SetAngularDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEEL_SETTINGS_WV_GET_MAX_STEER_ANGLE = downcallHandle("JPH_WheelSettingsWV_GetMaxSteerAngle", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_WV_SET_MAX_STEER_ANGLE = downcallHandleVoid("JPH_WheelSettingsWV_SetMaxSteerAngle", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEEL_SETTINGS_WV_GET_LONGITUDINAL_FRICTION = downcallHandle("JPH_WheelSettingsWV_GetLongitudinalFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_WV_SET_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsWV_SetLongitudinalFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_WV_GET_LATERAL_FRICTION = downcallHandle("JPH_WheelSettingsWV_GetLateralFriction", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
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
    
    public WheelSettingsWV(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
        super(segment);
    }
    
    public WheelSettingsWV(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static float getInertia(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_INERTIA.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getInertia}.
     */
    public final float getInertia(
        WheelSettingsWV settings
    ) {
        return (float) getInertia(
            settings.memorySegment()
        );
    }
    
    public static void setInertia(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_INERTIA.get();
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
     * Typed method of {@link #setInertia}.
     */
    public final void setInertia(
        WheelSettingsWV settings, 
        float value
    ) {
        setInertia(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getAngularDamping(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_ANGULAR_DAMPING.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getAngularDamping}.
     */
    public final float getAngularDamping(
        WheelSettingsWV settings
    ) {
        return (float) getAngularDamping(
            settings.memorySegment()
        );
    }
    
    public static void setAngularDamping(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_ANGULAR_DAMPING.get();
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
     * Typed method of {@link #setAngularDamping}.
     */
    public final void setAngularDamping(
        WheelSettingsWV settings, 
        float value
    ) {
        setAngularDamping(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getMaxSteerAngle(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_STEER_ANGLE.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxSteerAngle}.
     */
    public final float getMaxSteerAngle(
        WheelSettingsWV settings
    ) {
        return (float) getMaxSteerAngle(
            settings.memorySegment()
        );
    }
    
    public static void setMaxSteerAngle(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_STEER_ANGLE.get();
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
     * Typed method of {@link #setMaxSteerAngle}.
     */
    public final void setMaxSteerAngle(
        WheelSettingsWV settings, 
        float value
    ) {
        setMaxSteerAngle(
            settings.memorySegment(), 
            value
        );
    }
    
    public static MemorySegment getLongitudinalFriction(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_LONGITUDINAL_FRICTION.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLongitudinalFriction}.
     */
    public final @Nullable LinearCurve getLongitudinalFriction(
        WheelSettingsWV settings
    ) {
        MemorySegment segment = getLongitudinalFriction(
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new LinearCurve(segment);
    }
    
    public static void setLongitudinalFriction(
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_LONGITUDINAL_FRICTION.get();
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
     * Typed method of {@link #setLongitudinalFriction}.
     */
    public final void setLongitudinalFriction(
        WheelSettingsWV settings, 
        LinearCurve value
    ) {
        setLongitudinalFriction(
            settings.memorySegment(), 
            value.memorySegment()
        );
    }
    
    public static MemorySegment getLateralFriction(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_LATERAL_FRICTION.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLateralFriction}.
     */
    public final @Nullable LinearCurve getLateralFriction(
        WheelSettingsWV settings
    ) {
        MemorySegment segment = getLateralFriction(
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new LinearCurve(segment);
    }
    
    public static void setLateralFriction(
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_LATERAL_FRICTION.get();
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
     * Typed method of {@link #setLateralFriction}.
     */
    public final void setLateralFriction(
        WheelSettingsWV settings, 
        LinearCurve value
    ) {
        setLateralFriction(
            settings.memorySegment(), 
            value.memorySegment()
        );
    }
    
    public static float getMaxBrakeTorque(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_BRAKE_TORQUE.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxBrakeTorque}.
     */
    public final float getMaxBrakeTorque(
        WheelSettingsWV settings
    ) {
        return (float) getMaxBrakeTorque(
            settings.memorySegment()
        );
    }
    
    public static void setMaxBrakeTorque(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_BRAKE_TORQUE.get();
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
     * Typed method of {@link #setMaxBrakeTorque}.
     */
    public final void setMaxBrakeTorque(
        WheelSettingsWV settings, 
        float value
    ) {
        setMaxBrakeTorque(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getMaxHandBrakeTorque(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_GET_MAX_HAND_BRAKE_TORQUE.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMaxHandBrakeTorque}.
     */
    public final float getMaxHandBrakeTorque(
        WheelSettingsWV settings
    ) {
        return (float) getMaxHandBrakeTorque(
            settings.memorySegment()
        );
    }
    
    public static void setMaxHandBrakeTorque(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_WV_SET_MAX_HAND_BRAKE_TORQUE.get();
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
     * Typed method of {@link #setMaxHandBrakeTorque}.
     */
    public final void setMaxHandBrakeTorque(
        WheelSettingsWV settings, 
        float value
    ) {
        setMaxHandBrakeTorque(
            settings.memorySegment(), 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}