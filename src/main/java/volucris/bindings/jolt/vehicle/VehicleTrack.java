/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.StateRecorder;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleTrack extends VehicleTrackSettings {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_AS_VEHICLE_TRACK_SETTINGS;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_SAVE_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_TRACK_RESTORE_STATE;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_TRACK_CREATE = downcallHandle("JPH_VehicleTrack_Create", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_AS_VEHICLE_TRACK_SETTINGS = downcallHandle("JPH_VehicleTrack_AsVehicleTrackSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY = downcallHandle("JPH_VehicleTrack_GetAngularVelocity", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY = downcallHandleVoid("JPH_VehicleTrack_SetAngularVelocity", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_TRACK_SAVE_STATE = downcallHandleVoid("JPH_VehicleTrack_SaveState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_TRACK_RESTORE_STATE = downcallHandleVoid("JPH_VehicleTrack_RestoreState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleTrack() {
		this(Arena.ofAuto());
	}
	
	/// Typed method of [#create].
	public VehicleTrack(Arena arena) {
		MemorySegment segment = create();
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleTrackSettings(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public VehicleTrack(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleTrackSettings(segment));
	}

    public static MemorySegment create() {
    	MethodHandle method = JPH_VEHICLE_TRACK_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asVehicleTrackSettings(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_AS_VEHICLE_TRACK_SETTINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Angular velocity of the driven wheel, will determine the speed of the entire track
    /// ```
    public static float getAngularVelocity(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_GET_ANGULAR_VELOCITY.get();
    	try {
    		return (float) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getAngularVelocity].
    public final float getAngularVelocity() {
    	return getAngularVelocity(
    		this.segment
    	);
    }
    
    /// ```
    /// Angular velocity of the driven wheel, will determine the speed of the entire track
    /// ```
    public static void setAngularVelocity(
    	MemorySegment self,
    	float mAngularVelocity
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SET_ANGULAR_VELOCITY.get();
    	try {
    		 method.invokeExact(
    			self,
    			mAngularVelocity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setAngularVelocity].
    public final void setAngularVelocity(
    	float mAngularVelocity
    ) {
    	setAngularVelocity(
    		this.segment,
    		mAngularVelocity
    	);
    }
    
    /// ```
    /// Saving state for replay
    /// ```
    public static void saveState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_SAVE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#saveState].
    public final void saveState(
    	StateRecorder inStream
    ) {
    	saveState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public static void restoreState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_TRACK_RESTORE_STATE.get();
    	try {
    		 method.invokeExact(
    			self,
    			inStream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#restoreState].
    public final void restoreState(
    	StateRecorder inStream
    ) {
    	restoreState(
    		this.segment,
    		inStream.memorySegment()
    	);
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}