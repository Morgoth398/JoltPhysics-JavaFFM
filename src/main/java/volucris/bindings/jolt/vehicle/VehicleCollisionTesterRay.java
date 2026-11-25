/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.jolt.math.Vec3;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VehicleCollisionTesterRay extends VehicleCollisionTester {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_RAY_AS_VEHICLE_COLLISION_TESTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE = downcallHandle("JPH_VehicleCollisionTesterRay_Create", UNBOUNDED_ADDRESS, JAVA_SHORT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_COLLISION_TESTER_RAY_AS_VEHICLE_COLLISION_TESTER = downcallHandle("JPH_VehicleCollisionTesterRay_AsVehicleCollisionTester", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleCollisionTesterRay(
	    short inObjectLayer,
	    Vec3 inUp,
	    float inMaxSlopeAngle
	) {
	    this(
	        Arena.ofAuto(),
	        inObjectLayer,
	        inUp,
	        inMaxSlopeAngle
	    );
	}
	
	/// Typed method of [#create].
	public VehicleCollisionTesterRay(
		Arena arena,
		short inObjectLayer,
		Vec3 inUp,
		float inMaxSlopeAngle
	) {
		MemorySegment segment = create(
			inObjectLayer,
			inUp.memorySegment(),
			inMaxSlopeAngle
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleCollisionTester(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public VehicleCollisionTesterRay(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleCollisionTester(segment));
	}

    /// ```
    /// Constructor
    /// @param inObjectLayer The object layer the wheel belongs to. This is used to determine which objects the wheel can collide with. Works as BodyCreationSettings::mObjectLayer.
    /// @param inUp World space up vector, used to avoid colliding with vertical walls.
    /// @param inMaxSlopeAngle Max angle (rad) that is considered for colliding wheels. This is to avoid colliding with vertical walls.
    /// ```
    public static MemorySegment create(
    	short inObjectLayer,
    	MemorySegment inUp,
    	float inMaxSlopeAngle
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inObjectLayer,
    			inUp,
    			inMaxSlopeAngle
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
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_RAY_AS_VEHICLE_COLLISION_TESTER.get();
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