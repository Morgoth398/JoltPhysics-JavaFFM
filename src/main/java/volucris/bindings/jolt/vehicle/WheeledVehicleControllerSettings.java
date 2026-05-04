/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import edu.umd.cs.findbugs.annotations.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/**
 * 
 */
public sealed class WheeledVehicleControllerSettings extends VehicleControllerSettings
		permits MotorcycleControllerSettings {

    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS_COUNT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS_COUNT;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_ADD_DIFFERENTIAL;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO;
    private static final LazyConstant<MethodHandle> JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE = downcallHandle("JPH_WheeledVehicleControllerSettings_Create", UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_GetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION = downcallHandle("JPH_WheeledVehicleControllerSettings_GetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS_COUNT = downcallHandle("JPH_WheeledVehicleControllerSettings_GetDifferentialsCount", JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS_COUNT = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferentialsCount", UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_GetDifferential", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferential", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferentials", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_ADD_DIFFERENTIAL = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_AddDifferential", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO = downcallHandle("JPH_WheeledVehicleControllerSettings_GetDifferentialLimitedSlipRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO = downcallHandleVoid("JPH_WheeledVehicleControllerSettings_SetDifferentialLimitedSlipRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        //@formatter:on
    }

    public WheeledVehicleControllerSettings() {
        this(Arena.ofAuto());
    }
    
    public WheeledVehicleControllerSettings(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
        super(segment);
    }
    
    public WheeledVehicleControllerSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void getEngine(
        MemorySegment settings, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE.get();
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
     * Typed method of {@link #getEngine}.
     */
    public final void getEngine(
        VehicleEngineSettings result
    ) {
        getEngine(
            this.segment, 
            result.memorySegment()
        );
    }
    
    public static void setEngine(
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE.get();
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
     * Typed method of {@link #setEngine}.
     */
    public final void setEngine(
        VehicleEngineSettings value
    ) {
        setEngine(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static MemorySegment getTransmission(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getTransmission}.
     */
    public final @Nullable VehicleTransmissionSettings getTransmission(
    ) {
        MemorySegment segment = getTransmission(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new VehicleTransmissionSettings(segment);
    }
    
    public static void setTransmission(
        MemorySegment settings, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION.get();
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
     * Typed method of {@link #setTransmission}.
     */
    public final void setTransmission(
        VehicleTransmissionSettings value
    ) {
        setTransmission(
            this.segment, 
            value.memorySegment()
        );
    }
    
    public static int getDifferentialsCount(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIALS_COUNT.get();
        try {
            return (int) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDifferentialsCount}.
     */
    public final int getDifferentialsCount(
    ) {
        return (int) getDifferentialsCount(
            this.segment
        );
    }
    
    public static void setDifferentialsCount(
        MemorySegment settings, 
        int count
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS_COUNT.get();
        try {
            method.invokeExact(
                settings, 
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setDifferentialsCount}.
     */
    public final void setDifferentialsCount(
        int count
    ) {
        setDifferentialsCount(
            this.segment, 
            count
        );
    }
    
    public static void getDifferential(
        MemorySegment settings, 
        int index, 
        MemorySegment result
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL.get();
        try {
            method.invokeExact(
                settings, 
                index, 
                result
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDifferential}.
     */
    public final void getDifferential(
        int index, 
        VehicleDifferentialSettings result
    ) {
        getDifferential(
            this.segment, 
            index, 
            result.memorySegment()
        );
    }
    
    public static void setDifferential(
        MemorySegment settings, 
        int index, 
        MemorySegment value
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL.get();
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
     * Typed method of {@link #setDifferential}.
     */
    public final void setDifferential(
        int index, 
        VehicleDifferentialSettings value
    ) {
        setDifferential(
            this.segment, 
            index, 
            value.memorySegment()
        );
    }
    
    public static void setDifferentials(
        MemorySegment settings, 
        MemorySegment values, 
        int count
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIALS.get();
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
     * Typed method of {@link #setDifferentials}.
     */
    public final void setDifferentials(
        VehicleDifferentialSettings values, 
        int count
    ) {
        setDifferentials(
            this.segment, 
            values.memorySegment(), 
            count
        );
    }
    
    public static void addDifferential(
        MemorySegment settings, 
        int leftWheel, 
        int rightWheel
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_ADD_DIFFERENTIAL.get();
        try {
            method.invokeExact(
                settings, 
                leftWheel, 
                rightWheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #addDifferential}.
     */
    public final void addDifferential(
        int leftWheel, 
        int rightWheel
    ) {
        addDifferential(
            this.segment, 
            leftWheel, 
            rightWheel
        );
    }
    
    public static float getDifferentialLimitedSlipRatio(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_GET_DIFFERENTIAL_LIMITED_SLIP_RATIO.get();
        try {
            return (float) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getDifferentialLimitedSlipRatio}.
     */
    public final float getDifferentialLimitedSlipRatio(
    ) {
        return (float) getDifferentialLimitedSlipRatio(
            this.segment
        );
    }
    
    public static void setDifferentialLimitedSlipRatio(
        MemorySegment settings, 
        float value
    ) {
        MethodHandle method = JPH_WHEELED_VEHICLE_CONTROLLER_SETTINGS_SET_DIFFERENTIAL_LIMITED_SLIP_RATIO.get();
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
     * Typed method of {@link #setDifferentialLimitedSlipRatio}.
     */
    public final void setDifferentialLimitedSlipRatio(
        float value
    ) {
        setDifferentialLimitedSlipRatio(
            this.segment, 
            value
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}