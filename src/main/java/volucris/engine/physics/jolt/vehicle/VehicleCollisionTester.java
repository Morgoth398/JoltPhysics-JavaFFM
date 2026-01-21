package volucris.engine.physics.jolt.vehicle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that does collision detection between wheels and ground.
 */
public sealed class VehicleCollisionTester
		permits VehicleCollisionTesterRay, VehicleCollisionTesterCastCylinder, VehicleCollisionTesterCastSphere {

	private static final MethodHandle JPH_VEHICLE_COLLISION_TESTER_DESTROY;
	private static final MethodHandle JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER;
	private static final MethodHandle JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER;

	protected final MemorySegment jphVehicleCollisionTester;

	static {
		//@formatter:off
		JPH_VEHICLE_COLLISION_TESTER_DESTROY = downcallHandleVoid("JPH_VehicleCollisionTester_Destroy", ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER = downcallHandle("JPH_VehicleCollisionTester_GetObjectLayer", JAVA_INT, ADDRESS);
		JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER = downcallHandleVoid("JPH_VehicleCollisionTester_SetObjectLayer", ADDRESS, JAVA_INT);
		//@formatter:on
	}

	protected VehicleCollisionTester(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected VehicleCollisionTester(MemorySegment segment, Arena arena) {
		jphVehicleCollisionTester = segment.reinterpret(arena, s -> destroy(s));
	}

	private static void destroy(MemorySegment segment) {
		try {
			MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_DESTROY;
			method.invokeExact(segment);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot destroy vehicle collision tester: " + className);
		}
	}

	/**
	 * Object layer to use for collision detection, this is used when the filters
	 * are not overridden.
	 */
	public int getObjectLayer() {
		try {
			MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_GET_OBJECT_LAYER;
			return (int) method.invokeExact(jphVehicleCollisionTester);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get object layer: " + className);
		}
	}

	/**
	 * Object layer to use for collision detection, this is used when the filters
	 * are not overridden.
	 */
	public void setObjectLayer(int layer) {
		try {
			MethodHandle method = JPH_VEHICLE_COLLISION_TESTER_SET_OBJECT_LAYER;
			method.invokeExact(jphVehicleCollisionTester, layer);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set object layer: " + className);
		}
	}

	public MemorySegment memorySegment() {
		return jphVehicleCollisionTester;
	}

}