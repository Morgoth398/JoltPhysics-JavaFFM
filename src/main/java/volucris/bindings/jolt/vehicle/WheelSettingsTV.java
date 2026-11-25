/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class WheelSettingsTV extends WheelSettings {

	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_CREATE;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_AS_WHEEL_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION;
	private static final LazyConstant<MethodHandle> JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_WHEEL_SETTINGS_TV_CREATE = downcallHandle("JPH_WheelSettingsTV_Create", UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_TV_AS_WHEEL_SETTINGS = downcallHandle("JPH_WheelSettingsTV_AsWheelSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION = downcallHandle("JPH_WheelSettingsTV_GetLongitudinalFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsTV_SetLongitudinalFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION = downcallHandle("JPH_WheelSettingsTV_GetLateralFriction", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION = downcallHandleVoid("JPH_WheelSettingsTV_SetLateralFriction", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public WheelSettingsTV() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public WheelSettingsTV(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asWheelSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public WheelSettingsTV(MemorySegment segment) {
		this.segment = segment;
		super(asWheelSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_WHEEL_SETTINGS_TV_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asWheelSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_TV_AS_WHEEL_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Friction in forward direction of tire
    /// ```
    public static float getLongitudinalFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_TV_GET_LONGITUDINAL_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLongitudinalFriction].
    public final float getLongitudinalFriction() {
    	return getLongitudinalFriction(
    		this.segment
    	);
    }
    
    /// ```
    /// Friction in forward direction of tire
    /// ```
    public static void setLongitudinalFriction(
    	MemorySegment self,
    	float mLongitudinalFriction
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_TV_SET_LONGITUDINAL_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLongitudinalFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLongitudinalFriction].
    public final void setLongitudinalFriction(
    	float mLongitudinalFriction
    ) {
    	setLongitudinalFriction(
    		this.segment,
    		mLongitudinalFriction
    	);
    }
    
    /// ```
    /// Friction in sideways direction of tire
    /// ```
    public static float getLateralFriction(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_TV_GET_LATERAL_FRICTION.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getLateralFriction].
    public final float getLateralFriction() {
    	return getLateralFriction(
    		this.segment
    	);
    }
    
    /// ```
    /// Friction in sideways direction of tire
    /// ```
    public static void setLateralFriction(
    	MemorySegment self,
    	float mLateralFriction
    ) {
    	MethodHandle method = JPH_WHEEL_SETTINGS_TV_SET_LATERAL_FRICTION.get();
    	try {
    		 method.invokeExact(
    			self,
    			mLateralFriction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setLateralFriction].
    public final void setLateralFriction(
    	float mLateralFriction
    ) {
    	setLateralFriction(
    		this.segment,
    		mLateralFriction
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}