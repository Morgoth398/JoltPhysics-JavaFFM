package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Collision tester that tests collision using a raycast.
 */
public final class VehicleCollisionTesterRay extends VehicleCollisionTester {

	private static final MethodHandle JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE;

	static {
		//@formatter:off
		JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE = downcallHandle("JPH_VehicleCollisionTesterRay_Create", ADDRESS, JAVA_INT, ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public VehicleCollisionTesterRay(int layer, Vector3f up, float maxSlopAngle) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, up);

			MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE;
			segment = (MemorySegment) method.invokeExact(layer, vec.memorySegment(), maxSlopAngle);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create VehicleCollisionTesterRay.");
		}
		super(segment);
	}

}