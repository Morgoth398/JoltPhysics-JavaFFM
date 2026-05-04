/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeFloatArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public final class VehicleTransmissionSettings {

    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO_COUNT;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIO;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO_COUNT;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIO;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH;
    private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE = downcallHandle("JPH_VehicleTransmissionSettings_Create", UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleTransmissionSettings_Destroy", UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE = downcallHandle("JPH_VehicleTransmissionSettings_GetMode", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetMode", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO_COUNT = downcallHandle("JPH_VehicleTransmissionSettings_GetGearRatioCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO = downcallHandle("JPH_VehicleTransmissionSettings_GetGearRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIO = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetGearRatio", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS = downcallHandle("JPH_VehicleTransmissionSettings_GetGearRatios", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetGearRatios", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO_COUNT = downcallHandle("JPH_VehicleTransmissionSettings_GetReverseGearRatioCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO = downcallHandle("JPH_VehicleTransmissionSettings_GetReverseGearRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIO = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetReverseGearRatio", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS = downcallHandle("JPH_VehicleTransmissionSettings_GetReverseGearRatios", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetReverseGearRatios", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME = downcallHandle("JPH_VehicleTransmissionSettings_GetSwitchTime", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetSwitchTime", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME = downcallHandle("JPH_VehicleTransmissionSettings_GetClutchReleaseTime", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetClutchReleaseTime", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY = downcallHandle("JPH_VehicleTransmissionSettings_GetSwitchLatency", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetSwitchLatency", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM = downcallHandle("JPH_VehicleTransmissionSettings_GetShiftUpRPM", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetShiftUpRPM", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM = downcallHandle("JPH_VehicleTransmissionSettings_GetShiftDownRPM", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetShiftDownRPM", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH = downcallHandle("JPH_VehicleTransmissionSettings_GetClutchStrength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH = downcallHandleVoid("JPH_VehicleTransmissionSettings_SetClutchStrength", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public VehicleTransmissionSettings() {
        this(Arena.ofAuto());
    }
    
    public VehicleTransmissionSettings(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
    }
    
    public VehicleTransmissionSettings(MemorySegment segment) {
        this.segment = segment;
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void destroy(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_DESTROY.get();
        try {
            method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int getMode(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_MODE.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getMode}.
     */
    public final int getMode(
        VehicleTransmissionSettings settings
    ) {
        return (int) getMode(
            settings.memorySegment()
        );
    }
    
    public static void setMode(
        MemorySegment settings, 
        int value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_MODE.get();
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
     * Typed method of {@link #setMode}.
     */
    public final void setMode(
        VehicleTransmissionSettings settings, 
        int value
    ) {
        setMode(
            settings.memorySegment(), 
            value
        );
    }
    
    public static int getGearRatioCount(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO_COUNT.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGearRatioCount}.
     */
    public final int getGearRatioCount(
        VehicleTransmissionSettings settings
    ) {
        return (int) getGearRatioCount(
            settings.memorySegment()
        );
    }
    
    public static float getGearRatio(
        MemorySegment settings, 
        int index
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIO.get();
        try {
            return (float) method.invokeExact(
                settings, 
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGearRatio}.
     */
    public final float getGearRatio(
        VehicleTransmissionSettings settings, 
        int index
    ) {
        return (float) getGearRatio(
            settings.memorySegment(), 
            index
        );
    }
    
    public static void setGearRatio(
        MemorySegment settings, 
        int index, 
        float value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIO.get();
        try {
            method.invokeExact(
                settings, 
                index, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setGearRatio}.
     */
    public final void setGearRatio(
        VehicleTransmissionSettings settings, 
        int index, 
        float value
    ) {
        setGearRatio(
            settings.memorySegment(), 
            index, 
            value
        );
    }
    
    public static MemorySegment getGearRatios(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_GEAR_RATIOS.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getGearRatios}.
     */
    public final @Nullable NativeFloatArray getGearRatios(
        VehicleTransmissionSettings settings
    ) {
        MemorySegment segment = getGearRatios(
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new NativeFloatArray(segment);
    }
    
    public static void setGearRatios(
        MemorySegment settings, 
        MemorySegment values, 
        int count
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_GEAR_RATIOS.get();
        try {
            method.invokeExact(
                settings, 
                values, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setGearRatios}.
     */
    public final void setGearRatios(
        VehicleTransmissionSettings settings, 
        NativeFloatArray values, 
        int count
    ) {
        setGearRatios(
            settings.memorySegment(), 
            values.memorySegment(), 
            count
        );
    }
    
    public static int getReverseGearRatioCount(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO_COUNT.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getReverseGearRatioCount}.
     */
    public final int getReverseGearRatioCount(
        VehicleTransmissionSettings settings
    ) {
        return (int) getReverseGearRatioCount(
            settings.memorySegment()
        );
    }
    
    public static float getReverseGearRatio(
        MemorySegment settings, 
        int index
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIO.get();
        try {
            return (float) method.invokeExact(
                settings, 
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getReverseGearRatio}.
     */
    public final float getReverseGearRatio(
        VehicleTransmissionSettings settings, 
        int index
    ) {
        return (float) getReverseGearRatio(
            settings.memorySegment(), 
            index
        );
    }
    
    public static void setReverseGearRatio(
        MemorySegment settings, 
        int index, 
        float value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIO.get();
        try {
            method.invokeExact(
                settings, 
                index, 
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setReverseGearRatio}.
     */
    public final void setReverseGearRatio(
        VehicleTransmissionSettings settings, 
        int index, 
        float value
    ) {
        setReverseGearRatio(
            settings.memorySegment(), 
            index, 
            value
        );
    }
    
    public static MemorySegment getReverseGearRatios(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_REVERSE_GEAR_RATIOS.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getReverseGearRatios}.
     */
    public final @Nullable NativeFloatArray getReverseGearRatios(
        VehicleTransmissionSettings settings
    ) {
        MemorySegment segment = getReverseGearRatios(
            settings.memorySegment()
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new NativeFloatArray(segment);
    }
    
    public static void setReverseGearRatios(
        MemorySegment settings, 
        MemorySegment values, 
        int count
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_REVERSE_GEAR_RATIOS.get();
        try {
            method.invokeExact(
                settings, 
                values, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setReverseGearRatios}.
     */
    public final void setReverseGearRatios(
        VehicleTransmissionSettings settings, 
        NativeFloatArray values, 
        int count
    ) {
        setReverseGearRatios(
            settings.memorySegment(), 
            values.memorySegment(), 
            count
        );
    }
    
    public static float getSwitchTime(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_TIME.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSwitchTime}.
     */
    public final float getSwitchTime(
        VehicleTransmissionSettings settings
    ) {
        return (float) getSwitchTime(
            settings.memorySegment()
        );
    }
    
    public static void setSwitchTime(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_TIME.get();
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
     * Typed method of {@link #setSwitchTime}.
     */
    public final void setSwitchTime(
        VehicleTransmissionSettings settings, 
        float value
    ) {
        setSwitchTime(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getClutchReleaseTime(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_RELEASE_TIME.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getClutchReleaseTime}.
     */
    public final float getClutchReleaseTime(
        VehicleTransmissionSettings settings
    ) {
        return (float) getClutchReleaseTime(
            settings.memorySegment()
        );
    }
    
    public static void setClutchReleaseTime(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_RELEASE_TIME.get();
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
     * Typed method of {@link #setClutchReleaseTime}.
     */
    public final void setClutchReleaseTime(
        VehicleTransmissionSettings settings, 
        float value
    ) {
        setClutchReleaseTime(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getSwitchLatency(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SWITCH_LATENCY.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSwitchLatency}.
     */
    public final float getSwitchLatency(
        VehicleTransmissionSettings settings
    ) {
        return (float) getSwitchLatency(
            settings.memorySegment()
        );
    }
    
    public static void setSwitchLatency(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SWITCH_LATENCY.get();
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
     * Typed method of {@link #setSwitchLatency}.
     */
    public final void setSwitchLatency(
        VehicleTransmissionSettings settings, 
        float value
    ) {
        setSwitchLatency(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getShiftUpRPM(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_UP_RPM.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getShiftUpRPM}.
     */
    public final float getShiftUpRPM(
        VehicleTransmissionSettings settings
    ) {
        return (float) getShiftUpRPM(
            settings.memorySegment()
        );
    }
    
    public static void setShiftUpRPM(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_UP_RPM.get();
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
     * Typed method of {@link #setShiftUpRPM}.
     */
    public final void setShiftUpRPM(
        VehicleTransmissionSettings settings, 
        float value
    ) {
        setShiftUpRPM(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getShiftDownRPM(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_SHIFT_DOWN_RPM.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getShiftDownRPM}.
     */
    public final float getShiftDownRPM(
        VehicleTransmissionSettings settings
    ) {
        return (float) getShiftDownRPM(
            settings.memorySegment()
        );
    }
    
    public static void setShiftDownRPM(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_SHIFT_DOWN_RPM.get();
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
     * Typed method of {@link #setShiftDownRPM}.
     */
    public final void setShiftDownRPM(
        VehicleTransmissionSettings settings, 
        float value
    ) {
        setShiftDownRPM(
            settings.memorySegment(), 
            value
        );
    }
    
    public static float getClutchStrength(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_GET_CLUTCH_STRENGTH.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getClutchStrength}.
     */
    public final float getClutchStrength(
        VehicleTransmissionSettings settings
    ) {
        return (float) getClutchStrength(
            settings.memorySegment()
        );
    }
    
    public static void setClutchStrength(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_VEHICLE_TRANSMISSION_SETTINGS_SET_CLUTCH_STRENGTH.get();
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
     * Typed method of {@link #setClutchStrength}.
     */
    public final void setClutchStrength(
        VehicleTransmissionSettings settings, 
        float value
    ) {
        setClutchStrength(
            settings.memorySegment(), 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}