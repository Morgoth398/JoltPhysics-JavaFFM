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
public final class TrackedVehicleControllerSettings extends VehicleControllerSettings {

    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION;
    private static final LazyConstant<MethodHandle> JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRACK;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE = downcallHandle("JPH_TrackedVehicleControllerSettings_Create", UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_GetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_SetEngine", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION = downcallHandle("JPH_TrackedVehicleControllerSettings_GetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_SetTransmission", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRACK = downcallHandleVoid("JPH_TrackedVehicleControllerSettings_SetTrack", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public TrackedVehicleControllerSettings() {
        this(Arena.ofAuto());
    }
    
    public TrackedVehicleControllerSettings(Arena arena) {
        MemorySegment segment = create();
        this.segment = segment.reinterpret(arena, s -> destroy(s));
        super(segment);
    }
    
    public TrackedVehicleControllerSettings(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create() {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_CREATE.get();
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
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_ENGINE.get();
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
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_ENGINE.get();
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
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_GET_TRANSMISSION.get();
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
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRANSMISSION.get();
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
    
    public static void setTrack(
        MemorySegment settings, 
        int index, 
        MemorySegment track
    ) {
        MethodHandle method = JPH_TRACKED_VEHICLE_CONTROLLER_SETTINGS_SET_TRACK.get();
        try {
            method.invokeExact(
                settings, 
                index, 
                track
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #setTrack}.
     */
    public final void setTrack(
        int index, 
        VehicleTrackSettings track
    ) {
        setTrack(
            this.segment, 
            index, 
            track.memorySegment()
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}