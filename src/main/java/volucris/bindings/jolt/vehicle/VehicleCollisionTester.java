/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.jolt.body.BodyFilter;
import volucris.bindings.jolt.collision.ObjectLayerFilter;
import volucris.bindings.jolt.collision.broadPhase.BroadPhaseLayerFilter;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public sealed class VehicleCollisionTester
		permits VehicleCollisionTesterCastCylinder,
		VehicleCollisionTesterCastSphere,
		VehicleCollisionTesterRay {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_DESTROY;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_SET_BROAD_PHASE_LAYER_FILTER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_GET_BROAD_PHASE_LAYER_FILTER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER_FILTER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER_FILTER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_SET_BODY_FILTER;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_GET_BODY_FILTER;

	private MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_COLLISION_TESTER_CREATE = downcallHandle("JPH_VehicleCollisionTester_Create", UNBOUNDED_ADDRESS, VehicleCollisionTesterFunctions.LAYOUT);
		JPH_VEHICLE_COLLISION_TESTER_DESTROY = downcallHandleVoid("JPH_VehicleCollisionTester_Destroy", UNBOUNDED_ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER = downcallHandle("JPH_VehicleCollisionTester_GetObjectLayer", JAVA_SHORT, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER = downcallHandleVoid("JPH_VehicleCollisionTester_SetObjectLayer", UNBOUNDED_ADDRESS, JAVA_SHORT);
		JPH_VEHICLE_COLLISION_TESTER_SET_BROAD_PHASE_LAYER_FILTER = downcallHandleVoid("JPH_VehicleCollisionTester_SetBroadPhaseLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_GET_BROAD_PHASE_LAYER_FILTER = downcallHandle("JPH_VehicleCollisionTester_GetBroadPhaseLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER_FILTER = downcallHandleVoid("JPH_VehicleCollisionTester_SetObjectLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER_FILTER = downcallHandle("JPH_VehicleCollisionTester_GetObjectLayerFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_SET_BODY_FILTER = downcallHandleVoid("JPH_VehicleCollisionTester_SetBodyFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_GET_BODY_FILTER = downcallHandle("JPH_VehicleCollisionTester_GetBodyFilter", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleCollisionTester(
	    VehicleCollisionTesterFunctions functions
	) {
	    this(
	        Arena.ofAuto(),
	        functions
	    );
	}
	
	/// Typed method of [#create].
	public VehicleCollisionTester(
		Arena arena,
		VehicleCollisionTesterFunctions functions
	) {
		MemorySegment segment = create(
			functions.memorySegment()
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		this.segment = segment.reinterpret(arena, s -> destroy(s));
	}

	public VehicleCollisionTester(MemorySegment segment) {
		this.segment = segment;
	}

    public static MemorySegment create(
    	MemorySegment functions
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			functions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void destroy(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_DESTROY.get();
    	try {
    		 method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// The object layer the wheel belongs to. This is used to determine which objects the wheel can collide with. Works as BodyCreationSettings::mObjectLayer.
    /// Used only when the ObjectLayerFilter is not overridden.
    /// ```
    public static short getObjectLayer(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER.get();
    	try {
    		return (short) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getObjectLayer].
    public final short getObjectLayer() {
    	return getObjectLayer(
    		this.segment
    	);
    }
    
    public static void setObjectLayer(
    	MemorySegment self,
    	short inObjectLayer
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inObjectLayer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setObjectLayer].
    public final void setObjectLayer(
    	short inObjectLayer
    ) {
    	setObjectLayer(
    		this.segment,
    		inObjectLayer
    	);
    }
    
    /// ```
    /// Access to the broad phase layer filter, when set this overrides the object layer supplied in the constructor
    /// ```
    public static void setBroadPhaseLayerFilter(
    	MemorySegment self,
    	MemorySegment inFilter
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_SET_BROAD_PHASE_LAYER_FILTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBroadPhaseLayerFilter].
    public final void setBroadPhaseLayerFilter(
    	BroadPhaseLayerFilter inFilter
    ) {
    	setBroadPhaseLayerFilter(
    		this.segment,
    		inFilter.memorySegment()
    	);
    }
    
    public static MemorySegment getBroadPhaseLayerFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_GET_BROAD_PHASE_LAYER_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBroadPhaseLayerFilter].
    public final @Nullable BroadPhaseLayerFilter getBroadPhaseLayerFilter() {
    	MemorySegment segment = getBroadPhaseLayerFilter(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BroadPhaseLayerFilter(segment);
    }
    
    /// ```
    /// Access to the object layer filter, when set this overrides the object layer supplied in the constructor
    /// ```
    public static void setObjectLayerFilter(
    	MemorySegment self,
    	MemorySegment inFilter
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER_FILTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setObjectLayerFilter].
    public final void setObjectLayerFilter(
    	ObjectLayerFilter inFilter
    ) {
    	setObjectLayerFilter(
    		this.segment,
    		inFilter.memorySegment()
    	);
    }
    
    public static MemorySegment getObjectLayerFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getObjectLayerFilter].
    public final @Nullable ObjectLayerFilter getObjectLayerFilter() {
    	MemorySegment segment = getObjectLayerFilter(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ObjectLayerFilter(segment);
    }
    
    /// ```
    /// Access to the body filter, when set this overrides the default filter that filters out the vehicle body
    /// ```
    public static void setBodyFilter(
    	MemorySegment self,
    	MemorySegment inFilter
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_SET_BODY_FILTER.get();
    	try {
    		 method.invokeExact(
    			self,
    			inFilter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#setBodyFilter].
    public final void setBodyFilter(
    	BodyFilter inFilter
    ) {
    	setBodyFilter(
    		this.segment,
    		inFilter.memorySegment()
    	);
    }
    
    public static MemorySegment getBodyFilter(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_GET_BODY_FILTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#getBodyFilter].
    public final @Nullable BodyFilter getBodyFilter() {
    	MemorySegment segment = getBodyFilter(
    		this.segment
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new BodyFilter(segment);
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