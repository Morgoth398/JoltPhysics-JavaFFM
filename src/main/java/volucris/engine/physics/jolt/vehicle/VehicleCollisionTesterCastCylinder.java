package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Collision tester that tests collision using a cylinder shape.
 */
public final class VehicleCollisionTesterCastCylinder extends VehicleCollisionTester {

	private static final MethodHandle JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE;

	static {
		//@formatter:off
		JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE = downcallHandle("JPH_VehicleCollisionTesterCastCylinder_Create", ADDRESS, JAVA_INT, JAVA_FLOAT);
		//@formatter:on
	}

	public VehicleCollisionTesterCastCylinder(int layer, float convexRadiusFraction) {
		this(layer, convexRadiusFraction, Arena.ofAuto());
	}

	public VehicleCollisionTesterCastCylinder(int layer, float convexRadiusFraction, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CAST_CYLINDER_CREATE;
			segment = (MemorySegment) method.invokeExact(layer, convexRadiusFraction);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create VehicleCollisionTesterCastCylinder: " + className);
		}
		super(segment, arena);
	}

}
