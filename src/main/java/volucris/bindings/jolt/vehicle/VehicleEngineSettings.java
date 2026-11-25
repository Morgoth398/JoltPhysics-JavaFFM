/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.LinearCurve;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class VehicleEngineSettings
		permits VehicleEngine {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_GET_MAX_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_SET_MAX_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_GET_MIN_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_SET_MIN_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_GET_MAX_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_SET_MAX_RPM;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_GET_NORMALIZED_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_SET_NORMALIZED_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_GET_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_SET_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_GET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_SET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_ENGINE_SETTINGS_RESTORE_BINARY_STATE;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_ENGINE_SETTINGS_CREATE = downcallHandle("JPH_VehicleEngineSettings_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleEngineSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_GET_MAX_TORQUE = downcallHandle("JPH_VehicleEngineSettings_GetMaxTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_SET_MAX_TORQUE = downcallHandleVoid("JPH_VehicleEngineSettings_SetMaxTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_SETTINGS_GET_MIN_RPM = downcallHandle("JPH_VehicleEngineSettings_GetMinRPM", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_SET_MIN_RPM = downcallHandleVoid("JPH_VehicleEngineSettings_SetMinRPM", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_SETTINGS_GET_MAX_RPM = downcallHandle("JPH_VehicleEngineSettings_GetMaxRPM", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_SET_MAX_RPM = downcallHandleVoid("JPH_VehicleEngineSettings_SetMaxRPM", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_SETTINGS_GET_NORMALIZED_TORQUE = downcallHandleVoid("JPH_VehicleEngineSettings_GetNormalizedTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_SET_NORMALIZED_TORQUE = downcallHandleVoid("JPH_VehicleEngineSettings_SetNormalizedTorque", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_GET_INERTIA = downcallHandle("JPH_VehicleEngineSettings_GetInertia", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_SET_INERTIA = downcallHandleVoid("JPH_VehicleEngineSettings_SetInertia", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_SETTINGS_GET_ANGULAR_DAMPING = downcallHandle("JPH_VehicleEngineSettings_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_VehicleEngineSettings_SetAngularDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_ENGINE_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_VehicleEngineSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_ENGINE_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_VehicleEngineSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleEngineSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleEngineSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VehicleEngineSettings(MemorySegment segment) {
		this.segment = segment;
	}

    /// ```
    /// Constructor
    /// ```
    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Max amount of torque (Nm) that the engine can deliver
    /// ```
    public static float getMaxTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_GET_MAX_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxTorque].
    public final float getMaxTorque() {
    	return getMaxTorque(
    		this.segment
    	);
    }
    
    /// ```
    /// Max amount of torque (Nm) that the engine can deliver
    /// ```
    public static void setMaxTorque(
    	MemorySegment self,
    	float mMaxTorque
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_SET_MAX_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxTorque].
    public final void setMaxTorque(
    	float mMaxTorque
    ) {
    	setMaxTorque(
    		this.segment,
    		mMaxTorque
    	);
    }
    
    /// ```
    /// Min amount of revolutions per minute (rpm) the engine can produce without stalling
    /// ```
    public static float getMinRPM(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_GET_MIN_RPM.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMinRPM].
    public final float getMinRPM() {
    	return getMinRPM(
    		this.segment
    	);
    }
    
    /// ```
    /// Min amount of revolutions per minute (rpm) the engine can produce without stalling
    /// ```
    public static void setMinRPM(
    	MemorySegment self,
    	float mMinRPM
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_SET_MIN_RPM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMinRPM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMinRPM].
    public final void setMinRPM(
    	float mMinRPM
    ) {
    	setMinRPM(
    		this.segment,
    		mMinRPM
    	);
    }
    
    /// ```
    /// Max amount of revolutions per minute (rpm) the engine can generate
    /// ```
    public static float getMaxRPM(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_GET_MAX_RPM.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getMaxRPM].
    public final float getMaxRPM() {
    	return getMaxRPM(
    		this.segment
    	);
    }
    
    /// ```
    /// Max amount of revolutions per minute (rpm) the engine can generate
    /// ```
    public static void setMaxRPM(
    	MemorySegment self,
    	float mMaxRPM
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_SET_MAX_RPM.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxRPM
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxRPM].
    public final void setMaxRPM(
    	float mMaxRPM
    ) {
    	setMaxRPM(
    		this.segment,
    		mMaxRPM
    	);
    }
    
    /// ```
    /// Y-axis: Curve that describes a ratio of the max torque the engine can produce (0 = 0, 1 = mMaxTorque). X-axis: the fraction of the RPM of the engine (0 = mMinRPM, 1 = mMaxRPM)
    /// ```
    public static void getNormalizedTorque(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_GET_NORMALIZED_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getNormalizedTorque].
    public final void getNormalizedTorque(
    	LinearCurve outResult
    ) {
    	getNormalizedTorque(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Y-axis: Curve that describes a ratio of the max torque the engine can produce (0 = 0, 1 = mMaxTorque). X-axis: the fraction of the RPM of the engine (0 = mMinRPM, 1 = mMaxRPM)
    /// ```
    public static void setNormalizedTorque(
    	MemorySegment self,
    	MemorySegment mNormalizedTorque
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_SET_NORMALIZED_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mNormalizedTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setNormalizedTorque].
    public final void setNormalizedTorque(
    	LinearCurve mNormalizedTorque
    ) {
    	setNormalizedTorque(
    		this.segment,
    		mNormalizedTorque.memorySegment()
    	);
    }
    
    /// ```
    /// Moment of inertia (kg m^2) of the engine
    /// ```
    public static float getInertia(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_GET_INERTIA.get();
    	try {
    		return (float) method.invokeExact(
    			self
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
    
    /// ```
    /// Moment of inertia (kg m^2) of the engine
    /// ```
    public static void setInertia(
    	MemorySegment self,
    	float mInertia
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_SET_INERTIA.get();
    	try {
    		 method.invokeExact(
    			self,
    			mInertia
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setInertia].
    public final void setInertia(
    	float mInertia
    ) {
    	setInertia(
    		this.segment,
    		mInertia
    	);
    }
    
    /// ```
    /// Angular damping factor of the wheel: dw/dt = -c * w. Value should be zero or positive and is usually close to 0.
    /// ```
    public static float getAngularDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_GET_ANGULAR_DAMPING.get();
    	try {
    		return (float) method.invokeExact(
    			self
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
    
    /// ```
    /// Angular damping factor of the wheel: dw/dt = -c * w. Value should be zero or positive and is usually close to 0.
    /// ```
    public static void setAngularDamping(
    	MemorySegment self,
    	float mAngularDamping
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_SET_ANGULAR_DAMPING.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAngularDamping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularDamping].
    public final void setAngularDamping(
    	float mAngularDamping
    ) {
    	setAngularDamping(
    		this.segment,
    		mAngularDamping
    	);
    }
    
    /// ```
    /// Saves the contents in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_SAVE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveBinaryState].
    public final void saveBinaryState(
    	StreamOut inStream
    ) {
    	saveBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    /// ```
    /// Restores the contents in binary form to inStream.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_ENGINE_SETTINGS_RESTORE_BINARY_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreBinaryState].
    public final void restoreBinaryState(
    	StreamIn inStream
    ) {
    	restoreBinaryState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }
    
    /// Attaches a cleanup function to the [MemorySegment].
    ///
    /// This method must only ever be called once. A second call throws
    /// an [IllegalStateException] if the segment is no longer global-scoped.
    ///
    /// If the object was created explicitly with a constructor call,
    /// this method must not be called again as the constructor calls
    /// it automatically.
    public void attachCleanupFunction(Arena arena) {
    	 if (!segment.scope().equals(Arena.global().scope()))
    	 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
    
    	segment = segment.reinterpret(arena, s -> destroy(s));
    }

}