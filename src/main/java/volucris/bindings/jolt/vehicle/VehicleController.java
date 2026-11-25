/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.constraints.VehicleConstraint;

import static volucris.bindings.core.FFMUtils.*;

public sealed class VehicleController
		permits TrackedVehicleController,
		WheeledVehicleController {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT1;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_CONTROLLER_GET_SETTINGS;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_CONTROLLER_DESTROY = downcallHandleVoid("JPH_VehicleController_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT = downcallHandle("JPH_VehicleController_GetConstraint", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT1 = downcallHandle("JPH_VehicleController_GetConstraint1", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_CONTROLLER_GET_SETTINGS = downcallHandleVoid("JPH_VehicleController_GetSettings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleController(MemorySegment segment) {
		this.segment = segment;
	}

    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Access the vehicle constraint that this controller is part of
    /// ```
    public static MemorySegment getConstraint(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraint].
    public final @Nullable VehicleConstraint getConstraint() {
    	MemorySegment segment = getConstraint(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleConstraint(segment);
    }
    
    public static MemorySegment getConstraint1(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_GET_CONSTRAINT1.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getConstraint1].
    public final @Nullable VehicleConstraint getConstraint1() {
    	MemorySegment segment = getConstraint1(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VehicleConstraint(segment);
    }
    
    /// ```
    /// Recreate the settings for this controller
    /// ```
    public static void getSettings(
    	MemorySegment self,
    	MemorySegment outResult
    ) {
    	MethodHandle method = JPH_VEHICLE_CONTROLLER_GET_SETTINGS.get();
    	try {
    		 method.invokeExact(
    			self,
    			outResult
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getSettings].
    public final void getSettings(
    	VehicleControllerSettingsRef outResult
    ) {
    	getSettings(
    		this.segment,
    		outResult.memorySegment()
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