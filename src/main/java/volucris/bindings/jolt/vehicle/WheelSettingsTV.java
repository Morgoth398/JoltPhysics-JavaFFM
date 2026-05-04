/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class WheelSettingsTV extends WheelSettings {

    private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_CREATE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_WHEEL_SETTINGS_TV_CREATE = downcallHandle("JPH_WheelSettingsTV_Create", UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION = downcallHandle("JPH_WheelSettingsTV_GetLongitudinalFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsTV_SetLongitudinalFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION = downcallHandle("JPH_WheelSettingsTV_GetLateralFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsTV_SetLateralFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public WheelSettingsTV() {
        this(Arena.ofAuto());
    }
    
    public WheelSettingsTV(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
        super(segment);
    }
    
    public WheelSettingsTV(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_WHEEL_SETTINGS_TV_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static float getLongitudinalFriction(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLongitudinalFriction}.
     */
    public final float getLongitudinalFriction(
        WheelSettingsTV settings
    ) {
        return (float) getLongitudinalFriction(
            settings.memorySegment()
        );
    }
    
    public static void setLongitudinalFriction(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION.get();
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
        WheelSettingsTV settings, 
        float value
    ) {
        setLongitudinalFriction(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getLateralFriction(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getLateralFriction}.
     */
    public final float getLateralFriction(
        WheelSettingsTV settings
    ) {
        return (float) getLateralFriction(
            settings.memorySegment()
        );
    }
    
    public static void setLateralFriction(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION.get();
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
        WheelSettingsTV settings, 
        float value
    ) {
        setLateralFriction(
            settings.memorySegment(), 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}