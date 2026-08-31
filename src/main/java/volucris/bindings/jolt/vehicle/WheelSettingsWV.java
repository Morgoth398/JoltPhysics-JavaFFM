/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.LinearCurve;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

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
    
    /// Typed method of [#create].
    public WheelSettingsWV(Arena arena) {
    	MemorySegment segment = create();
    
    	if (segment.equals(MemorySegment.NULL))
    		throw new NullPointerException("Created segment is NULL.");
    
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
    
    /// Typed method of [#getInertia].
    public final float getInertia() {
    	return getInertia(
    		this.segment
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
    
    /// Typed method of [#setInertia].
    public final void setInertia(
    	float value
    ) {
    	setInertia(
    		this.segment,
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
    
    /// Typed method of [#getAngularDamping].
    public final float getAngularDamping() {
    	return getAngularDamping(
    		this.segment
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
    
    /// Typed method of [#setAngularDamping].
    public final void setAngularDamping(
    	float value
    ) {
    	setAngularDamping(
    		this.segment,
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
    
    /// Typed method of [#getMaxSteerAngle].
    public final float getMaxSteerAngle() {
    	return getMaxSteerAngle(
    		this.segment
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
    
    /// Typed method of [#setMaxSteerAngle].
    public final void setMaxSteerAngle(
    	float value
    ) {
    	setMaxSteerAngle(
    		this.segment,
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
    
    /// Typed method of [#getLongitudinalFriction].
    public final @Nullable LinearCurve getLongitudinalFriction() {
    	MemorySegment segment = getLongitudinalFriction(
    		this.segment
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
    
    /// Typed method of [#setLongitudinalFriction].
    public final void setLongitudinalFriction(
    	LinearCurve value
    ) {
    	setLongitudinalFriction(
    		this.segment,
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
    
    /// Typed method of [#getLateralFriction].
    public final @Nullable LinearCurve getLateralFriction() {
    	MemorySegment segment = getLateralFriction(
    		this.segment
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
    
    /// Typed method of [#setLateralFriction].
    public final void setLateralFriction(
    	LinearCurve value
    ) {
    	setLateralFriction(
    		this.segment,
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
    
    /// Typed method of [#getMaxBrakeTorque].
    public final float getMaxBrakeTorque() {
    	return getMaxBrakeTorque(
    		this.segment
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
    
    /// Typed method of [#setMaxBrakeTorque].
    public final void setMaxBrakeTorque(
    	float value
    ) {
    	setMaxBrakeTorque(
    		this.segment,
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
    
    /// Typed method of [#getMaxHandBrakeTorque].
    public final float getMaxHandBrakeTorque() {
    	return getMaxHandBrakeTorque(
    		this.segment
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
    
    /// Typed method of [#setMaxHandBrakeTorque].
    public final void setMaxHandBrakeTorque(
    	float value
    ) {
    	setMaxHandBrakeTorque(
    		this.segment,
    		value
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
}