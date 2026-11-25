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

public final class VehicleCollisionTesterCastSphere extends VehicleCollisionTester {

	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_CREATE;
	private static final LazyConstant<MethodHandle> JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_AS_VEHICLE_COLLISION_TESTER;

	private final MemorySegment segment;

	static {
		//@formatter:off
		JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_CREATE = downcallHandle("JPH_VehicleCollisionTesterCastSphere_Create", UNBOUNDED_ADDRESS, JAVA_SHORT, JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT);
		JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_AS_VEHICLE_COLLISION_TESTER = downcallHandle("JPH_VehicleCollisionTesterCastSphere_AsVehicleCollisionTester", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	public VehicleCollisionTesterCastSphere(
	    short inObjectLayer,
	    float inRadius,
	    Vec3 inUp,
	    float inMaxSlopeAngle
	) {
	    this(
	        Arena.ofAuto(),
	        inObjectLayer,
	        inRadius,
	        inUp,
	        inMaxSlopeAngle
	    );
	}
	
	/// Typed method of [#create].
	public VehicleCollisionTesterCastSphere(
		Arena arena,
		short inObjectLayer,
		float inRadius,
		Vec3 inUp,
		float inMaxSlopeAngle
	) {
		MemorySegment segment = create(
			inObjectLayer,
			inRadius,
			inUp.memorySegment(),
			inMaxSlopeAngle
		);
	
		if (segment.equals(MemorySegment.NULL))
			throw new NullPointerException("Created segment is NULL.");
	
		super(asVehicleCollisionTester(segment));
		
		this.segment = segment.reinterpret(arena, null);
		attachCleanupFunction(arena);
	}

	public VehicleCollisionTesterCastSphere(MemorySegment segment) {
		this.segment = segment;
		super(asVehicleCollisionTester(segment));
	}

    /// ```
    /// Constructor
    /// @param inObjectLayer The object layer the wheel belongs to. This is used to determine which objects the wheel can collide with. Works as BodyCreationSettings::mObjectLayer.
    /// @param inUp World space up vector, used to avoid colliding with vertical walls.
    /// @param inRadius Radius of sphere
    /// @param inMaxSlopeAngle Max angle (rad) that is considered for colliding wheels. This is to avoid colliding with vertical walls.
    /// ```
    public static MemorySegment create(
    	short inObjectLayer,
    	float inRadius,
    	MemorySegment inUp,
    	float inMaxSlopeAngle
    ) {
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			inObjectLayer,
    			inRadius,
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
    	MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE_AS_VEHICLE_COLLISION_TESTER.get();
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