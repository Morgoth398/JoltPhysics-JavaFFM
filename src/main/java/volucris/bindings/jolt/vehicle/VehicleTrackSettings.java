/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.UnsignedIntArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class VehicleTrackSettings
		permits VehicleTrack {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_GET_DRIVEN_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_SET_DRIVEN_WHEEL;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_GET_WHEELS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_SET_WHEELS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_GET_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_SET_INERTIA;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_GET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_SET_ANGULAR_DAMPING;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_GET_MAX_BRAKE_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_SET_MAX_BRAKE_TORQUE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_GET_DIFFERENTIAL_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_SET_DIFFERENTIAL_RATIO;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SETTINGS_RESTORE_BINARY_STATE;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_TRACK_SETTINGS_CREATE = downcallHandle("JPH_VehicleTrackSettings_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleTrackSettings_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_GET_DRIVEN_WHEEL = downcallHandle("JPH_VehicleTrackSettings_GetDrivenWheel", JAVA_INT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_SET_DRIVEN_WHEEL = downcallHandleVoid("JPH_VehicleTrackSettings_SetDrivenWheel", UNBOUNDED_ADDRESS, JAVA_INT);
		JPH_VEHICLE_TRACK_SETTINGS_GET_WHEELS = downcallHandleVoid("JPH_VehicleTrackSettings_GetWheels", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_SET_WHEELS = downcallHandleVoid("JPH_VehicleTrackSettings_SetWheels", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_GET_INERTIA = downcallHandle("JPH_VehicleTrackSettings_GetInertia", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_SET_INERTIA = downcallHandleVoid("JPH_VehicleTrackSettings_SetInertia", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRACK_SETTINGS_GET_ANGULAR_DAMPING = downcallHandle("JPH_VehicleTrackSettings_GetAngularDamping", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_SET_ANGULAR_DAMPING = downcallHandleVoid("JPH_VehicleTrackSettings_SetAngularDamping", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRACK_SETTINGS_GET_MAX_BRAKE_TORQUE = downcallHandle("JPH_VehicleTrackSettings_GetMaxBrakeTorque", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_SET_MAX_BRAKE_TORQUE = downcallHandleVoid("JPH_VehicleTrackSettings_SetMaxBrakeTorque", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRACK_SETTINGS_GET_DIFFERENTIAL_RATIO = downcallHandle("JPH_VehicleTrackSettings_GetDifferentialRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_SET_DIFFERENTIAL_RATIO = downcallHandleVoid("JPH_VehicleTrackSettings_SetDifferentialRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRACK_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_VehicleTrackSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_VehicleTrackSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleTrackSettings() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleTrackSettings(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VehicleTrackSettings(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Which wheel on the track is connected to the engine
    /// ```
    public static int getDrivenWheel(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_GET_DRIVEN_WHEEL.get();
    	try {
    		return (int) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDrivenWheel].
    public final int getDrivenWheel() {
    	return getDrivenWheel(
    		this.segment
    	);
    }
    
    /// ```
    /// Which wheel on the track is connected to the engine
    /// ```
    public static void setDrivenWheel(
    	MemorySegment self,
    	int mDrivenWheel
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_SET_DRIVEN_WHEEL.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDrivenWheel
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDrivenWheel].
    public final void setDrivenWheel(
    	int mDrivenWheel
    ) {
    	setDrivenWheel(
    		this.segment,
    		mDrivenWheel
    	);
    }
    
    /// ```
    /// Indices of wheels that are inside this track, should include the driven wheel too
    /// ```
    public static void getWheels(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_GET_WHEELS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getWheels].
    public final void getWheels(
    	UnsignedIntArray outResult
    ) {
    	getWheels(
    		this.segment,
    		outResult.memorySegment()
    	);
    }
    
    /// ```
    /// Indices of wheels that are inside this track, should include the driven wheel too
    /// ```
    public static void setWheels(
    	MemorySegment self,
    	MemorySegment mWheels
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_SET_WHEELS.get();
    	try {
    		 method.invokeExact(
    			self,
    			mWheels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setWheels].
    public final void setWheels(
    	UnsignedIntArray mWheels
    ) {
    	setWheels(
    		this.segment,
    		mWheels.memorySegment()
    	);
    }
    
    /// ```
    /// Moment of inertia (kg m^2) of the track and its wheels as seen on the driven wheel
    /// ```
    public static float getInertia(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_GET_INERTIA.get();
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
    /// Moment of inertia (kg m^2) of the track and its wheels as seen on the driven wheel
    /// ```
    public static void setInertia(
    	MemorySegment self,
    	float mInertia
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_SET_INERTIA.get();
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
    /// Damping factor of track and its wheels: dw/dt = -c * w as seen on the driven wheel
    /// ```
    public static float getAngularDamping(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_GET_ANGULAR_DAMPING.get();
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
    /// Damping factor of track and its wheels: dw/dt = -c * w as seen on the driven wheel
    /// ```
    public static void setAngularDamping(
    	MemorySegment self,
    	float mAngularDamping
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_SET_ANGULAR_DAMPING.get();
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
    /// How much torque (Nm) the brakes can apply on the driven wheel
    /// ```
    public static float getMaxBrakeTorque(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_GET_MAX_BRAKE_TORQUE.get();
    	try {
    		return (float) method.invokeExact(
    			self
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
    
    /// ```
    /// How much torque (Nm) the brakes can apply on the driven wheel
    /// ```
    public static void setMaxBrakeTorque(
    	MemorySegment self,
    	float mMaxBrakeTorque
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_SET_MAX_BRAKE_TORQUE.get();
    	try {
    		 method.invokeExact(
    			self,
    			mMaxBrakeTorque
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setMaxBrakeTorque].
    public final void setMaxBrakeTorque(
    	float mMaxBrakeTorque
    ) {
    	setMaxBrakeTorque(
    		this.segment,
    		mMaxBrakeTorque
    	);
    }
    
    /// ```
    /// Ratio between rotation speed of gear box and driven wheel of track
    /// ```
    public static float getDifferentialRatio(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_GET_DIFFERENTIAL_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getDifferentialRatio].
    public final float getDifferentialRatio() {
    	return getDifferentialRatio(
    		this.segment
    	);
    }
    
    /// ```
    /// Ratio between rotation speed of gear box and driven wheel of track
    /// ```
    public static void setDifferentialRatio(
    	MemorySegment self,
    	float mDifferentialRatio
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_SET_DIFFERENTIAL_RATIO.get();
    	try {
    		 method.invokeExact(
    			self,
    			mDifferentialRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setDifferentialRatio].
    public final void setDifferentialRatio(
    	float mDifferentialRatio
    ) {
    	setDifferentialRatio(
    		this.segment,
    		mDifferentialRatio
    	);
    }
    
    /// ```
    /// Saves the contents in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_SAVE_BINARY_STATE.get();
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
    	MethodHandle method = JPH_VEHICLE_TRACK_SETTINGS_RESTORE_BINARY_STATE.get();
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