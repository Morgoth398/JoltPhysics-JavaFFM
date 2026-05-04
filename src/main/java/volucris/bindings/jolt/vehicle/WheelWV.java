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
public final class WheelWV extends Wheel {

    private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_CREATE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_GET_SETTINGS;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_WV_APPLY_TORQUE;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_WHEEL_WV_CREATE = downcallHandle("JPH_WheelWV_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_WV_GET_SETTINGS = downcallHandle("JPH_WheelWV_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_WV_APPLY_TORQUE = downcallHandleVoid("JPH_WheelWV_ApplyTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        //@formatter:on
    }

    public WheelWV(
        WheelSettingsWV settings
    ) {
        this(
            Arena.ofAuto(),
            settings
        );
    }
    
    public WheelWV(
        Arena arena,
        WheelSettingsWV settings
    ) {
         MemorySegment segment = create(
            settings.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public WheelWV(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_WV_CREATE.get();
        try {
            return (MemorySegment) method.invokeExact(
                settings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    public static MemorySegment getSettings(
        MemorySegment wheel
    ) {
        MethodHandle method = JPH_WHEEL_WV_GET_SETTINGS.get();
        try {
            return (MemorySegment) method.invokeExact(
                wheel
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #getSettings}.
     */
    public final @Nullable WheelSettingsWV getSettings(
    ) {
        MemorySegment segment = getSettings(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new WheelSettingsWV(segment);
    }
    
    public static void applyTorque(
        MemorySegment wheel, 
        float torque, 
        float deltaTime
    ) {
        MethodHandle method = JPH_WHEEL_WV_APPLY_TORQUE.get();
        try {
            method.invokeExact(
                wheel, 
                torque, 
                deltaTime
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Typed method of {@link #applyTorque}.
     */
    public final void applyTorque(
        float torque, 
        float deltaTime
    ) {
        applyTorque(
            this.segment, 
            torque, 
            deltaTime
        );
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}