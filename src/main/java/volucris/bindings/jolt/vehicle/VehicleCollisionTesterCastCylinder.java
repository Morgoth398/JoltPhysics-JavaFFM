/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleCollisionTesterCastCylinder extends VehicleCollisionTester {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_AS_VEHICLE_COLLISION_TESTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE = downcallHandle("JPH_VehicleCollisionTesterCastCylinder_Create", UNBOUNDED_ADDRESS, JAVA_SHORT, JAVA_FLOAT);
		JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_AS_VEHICLE_COLLISION_TESTER = downcallHandle("JPH_VehicleCollisionTesterCastCylinder_AsVehicleCollisionTester", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleCollisionTesterCastCylinder(
	    short inObjectLayer,
	    float inConvexRadiusFraction
	) {
	    this(
	        Arena.ofAuto(),
	        inObjectLayer,
	        inConvexRadiusFraction
	    );
	}
	
	/// Typed method of [#create].
	public VehicleCollisionTesterCastCylinder(
		Arena arena,
		short inObjectLayer,
		float inConvexRadiusFraction
	) {
		MemorySegment segment = create(
			inObjectLayer,
			inConvexRadiusFraction
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleCollisionTester(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public VehicleCollisionTesterCastCylinder(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleCollisionTester(segment));
	}

    /// ```
    /// Constructor
    /// @param inObjectLayer The object layer the wheel belongs to. This is used to determine which objects the wheel can collide with. Works as BodyCreationSettings::mObjectLayer.
    /// @param inConvexRadiusFraction Fraction of half the wheel width (or wheel radius if it is smaller) that is used as the convex radius
    /// ```
    public static MemorySegment create(
    	short inObjectLayer,
    	float inConvexRadiusFraction
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inObjectLayer,
    			inConvexRadiusFraction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// WRAPPER INFO: Helper method for upcasting.
    /// ```
    public static MemorySegment asVehicleCollisionTester(
    	MemorySegment self
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_AS_VEHICLE_COLLISION_TESTER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			self
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public MemorySegment memorySegment() {
    	return segment;
    }

}