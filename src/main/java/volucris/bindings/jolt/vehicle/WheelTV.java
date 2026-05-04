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
public final class WheelTV extends Wheel {

    private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_CREATE;
    private static final LazyConstant<MethodHandle> JPH_WHEEL_TV_GET_SETTINGS;

    private final MemorySegment segment;

    static {
        //@formatter:off
        JPH_WHEEL_TV_CREATE = downcallHandle("JPH_WheelTV_Create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        JPH_WHEEL_TV_GET_SETTINGS = downcallHandle("JPH_WheelTV_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    public WheelTV(
        WheelSettingsTV settings
    ) {
        this(
            Arena.ofAuto(),
            settings
        );
    }
    
    public WheelTV(
        Arena arena,
        WheelSettingsTV settings
    ) {
         MemorySegment segment = create(
            settings.memorySegment()
         );
    
         this.segment = segment.reinterpret(arena, s -> destroy(s));
         super(segment);
    }
    
    public WheelTV(MemorySegment segment) {
        this.segment = segment;
        super(segment);
    }

    public static MemorySegment create(
        MemorySegment settings
    ) {
        MethodHandle method = JPH_WHEEL_TV_CREATE.get();
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
        MethodHandle method = JPH_WHEEL_TV_GET_SETTINGS.get();
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
    public final @Nullable WheelSettingsTV getSettings(
    ) {
        MemorySegment segment = getSettings(
            this.segment
        );
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    
        return new WheelSettingsTV(segment);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}