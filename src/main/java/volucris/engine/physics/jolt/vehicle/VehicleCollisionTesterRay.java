package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.JoltRuntimeException;

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
		this(layer, up, maxSlopAngle, Arena.ofAuto());
	}

	public VehicleCollisionTesterRay(int layer, Vector3f up, float maxSlopAngle, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, up);

			MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_RAY_CREATE;
			segment = (MemorySegment) method.invokeExact(layer, vec.memorySegment(), maxSlopAngle);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create VehicleCollisionTesterRay: " + className);
		}
		super(segment, arena);
	}

}