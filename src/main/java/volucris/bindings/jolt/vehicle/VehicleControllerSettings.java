/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.StreamIn;
import volucris.bindings.jolt.StreamOut;
import volucris.bindings.jolt.constraints.VehicleConstraint;

import static volucris.bindings.core.FFMUtils.*;

public sealed class VehicleControllerSettings extends VehicleControllerSettingsRefTarget
		permits TrackedVehicleControllerSettings,
		WheeledVehicleControllerSettings {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_SETTINGS_AS_REF_TARGET;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_SETTINGS_SAVE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_SETTINGS_RESTORE_BINARY_STATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_SETTINGS_CONSTRUCT_CONTROLLER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_CONTROLLER_SETTINGS_AS_REF_TARGET = downcallHandle("JPH_VehicleControllerSettings_AsRefTarget", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONTROLLER_SETTINGS_SAVE_BINARY_STATE = downcallHandleVoid("JPH_VehicleControllerSettings_SaveBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONTROLLER_SETTINGS_RESTORE_BINARY_STATE = downcallHandleVoid("JPH_VehicleControllerSettings_RestoreBinaryState", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONTROLLER_SETTINGS_CONSTRUCT_CONTROLLER = downcallHandle("JPH_VehicleControllerSettings_ConstructController", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY = downcallHandleVoid("JPH_VehicleControllerSettings_Destroy", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleControllerSettings(MemorySegment segment) {
		this.segment = segment;
		super(asRefTarget(segment));
	}

    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asRefTarget(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_SETTINGS_AS_REF_TARGET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Saves the contents of the controller settings in binary form to inStream.
    /// ```
    public static void saveBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_SETTINGS_SAVE_BINARY_STATE.get();
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
    /// Restore the contents of the controller settings in binary form from inStream.
    /// ```
    public static void restoreBinaryState(
    	MemorySegment self,
    	MemorySegment inStream
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_SETTINGS_RESTORE_BINARY_STATE.get();
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
    
    /// ```
    /// Create an instance of the vehicle controller class
    /// ```
    public static MemorySegment constructController(
    	MemorySegment self,
    	MemorySegment inConstraint
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_SETTINGS_CONSTRUCT_CONTROLLER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self,
    			inConstraint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#constructController].
    public final @Nullable VehicleController constructController(
    	VehicleConstraint inConstraint
    ) {
    	MemorySegment segment = constructController(
    		this.segment,
    		inConstraint.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleController(segment);
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_SETTINGS_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#destroy].
    public final void destroy() {
    	destroy(
    		this.segment
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