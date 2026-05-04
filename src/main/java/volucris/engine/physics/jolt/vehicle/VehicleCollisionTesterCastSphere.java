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
 * Collision tester that tests collision using a sphere cast. 
 */
public final class VehicleCollisionTesterCastSphere extends VehicleCollisionTester {

	private static final MethodHandle JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE;

	static {
		//@formatter:off
		JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE = downcallHandle("JPH_VehicleCollisionTesterCastSphere_Create", ADDRESS, JAVA_INT, JAVA_FLOAT, ADDRESS, JAVA_FLOAT);
		//@formatter:on
	}

	public VehicleCollisionTesterCastSphere(int layer, float radius, Vector3f up, float maxSlopAngle) {
		this(layer, radius, up, maxSlopAngle, Arena.ofAuto());
	}
	
	public VehicleCollisionTesterCastSphere(int layer, float radius, Vector3f up, float maxSlopAngle, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, up);
			
			MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_CAST_SPHERE;
			segment = (MemorySegment) method.invokeExact(layer, radius, vec.memorySegment(), maxSlopAngle);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create VehicleCollisionTesterCastSphere.");
		}
		super(segment, arena);
	}
	
}
