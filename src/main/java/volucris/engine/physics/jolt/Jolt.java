package volucris.engine.physics.jolt;

import java.lang.invoke.MethodHandle;
import java.lang.ref.WeakReference;

import org.eclipse.collections.impl.map.mutable.primitive.LongObjectHashMap;

import volucris.engine.physics.jolt.body.Body;
import volucris.engine.physics.jolt.callbacks.AssertFailureCallback;
import volucris.engine.physics.jolt.callbacks.TraceCallback;
import volucris.engine.physics.jolt.character.CharacterVirtual;
import volucris.engine.physics.jolt.constraint.Constraint;
import volucris.engine.physics.jolt.filter.GroupFilter;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSystem;
import volucris.engine.physics.jolt.ragdoll.RagdollSettings;
import volucris.engine.physics.jolt.ragdoll.Skeleton;
import volucris.engine.physics.jolt.shape.Shape;
import volucris.engine.physics.jolt.vehicle.LinearCurve;
import volucris.engine.physics.jolt.vehicle.VehicleController;
import volucris.engine.physics.jolt.vehicle.VehicleTransmissionSettings;
import volucris.engine.physics.jolt.vehicle.Wheel;
import volucris.engine.physics.jolt.vehicle.WheelSettings;
import volucris.engine.utils.NativeLibraryLoader;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public final class Jolt {

	private static final MethodHandle JPH_INIT;
	private static final MethodHandle JPH_SHUTDOWN;
	private static final MethodHandle JPH_SET_TRACE_HANDLER;
	private static final MethodHandle JPH_SET_ASSERT_FAILURE_HANDLER;

	private static final LongObjectHashMap<Body> BODIES;
	private static final LongObjectHashMap<WeakReference<PhysicsSystem>> PHYSICS_SYSTEMS;
	private static final LongObjectHashMap<WeakReference<Shape>> SHAPES;
	private static final LongObjectHashMap<WeakReference<PhysicsMaterial>> MATERIALS;
	private static final LongObjectHashMap<WeakReference<GroupFilter>> GROUP_FILTERS;
	private static final LongObjectHashMap<WeakReference<Skeleton>> SKELETONS;
	private static final LongObjectHashMap<WeakReference<CharacterVirtual>> CHARACTER_VIRTUALS;
	private static final LongObjectHashMap<WeakReference<Wheel>> WHEELS;
	private static final LongObjectHashMap<WeakReference<WheelSettings>> WHEEL_SETTINGS;
	private static final LongObjectHashMap<WeakReference<VehicleTransmissionSettings>> TRANSMISSION_SETTINGS;
	private static final LongObjectHashMap<WeakReference<VehicleController>> VEHICLE_CONTROLLERS;
	private static final LongObjectHashMap<WeakReference<Constraint>> CONSTRAINTS;
	private static final LongObjectHashMap<WeakReference<LinearCurve>> LINEAR_CURVES;
	private static final LongObjectHashMap<WeakReference<RagdollSettings>> RAGDOLL_SETTINGS;

	private static final LongObjectHashMap<Object> INTERNAL_USER_DATA;
	private static final LongObjectHashMap<Object> USER_DATA;

	static {
		NativeLibraryLoader.loadLibrary("natives/jolt", "jolt");

		//@formatter:off
		JPH_INIT = downcallHandle("JPH_Init", JAVA_BOOLEAN);
		JPH_SHUTDOWN = downcallHandleVoid("JPH_Shutdown");
		JPH_SET_TRACE_HANDLER = downcallHandleVoid("JPH_SetTraceHandler", ADDRESS);
		JPH_SET_ASSERT_FAILURE_HANDLER = downcallHandleVoid("JPH_SetAssertFailureHandler", ADDRESS);
		//@formatter:on

		BODIES = new LongObjectHashMap<Body>(500);
		PHYSICS_SYSTEMS = new LongObjectHashMap<WeakReference<PhysicsSystem>>();
		SHAPES = new LongObjectHashMap<WeakReference<Shape>>(500);
		MATERIALS = new LongObjectHashMap<WeakReference<PhysicsMaterial>>();
		GROUP_FILTERS = new LongObjectHashMap<WeakReference<GroupFilter>>();
		SKELETONS = new LongObjectHashMap<WeakReference<Skeleton>>();
		CHARACTER_VIRTUALS = new LongObjectHashMap<WeakReference<CharacterVirtual>>();
		WHEELS = new LongObjectHashMap<WeakReference<Wheel>>();
		WHEEL_SETTINGS = new LongObjectHashMap<WeakReference<WheelSettings>>();
		TRANSMISSION_SETTINGS = new LongObjectHashMap<WeakReference<VehicleTransmissionSettings>>();
		VEHICLE_CONTROLLERS = new LongObjectHashMap<WeakReference<VehicleController>>();
		CONSTRAINTS = new LongObjectHashMap<WeakReference<Constraint>>();
		LINEAR_CURVES = new LongObjectHashMap<WeakReference<LinearCurve>>();
		RAGDOLL_SETTINGS = new LongObjectHashMap<WeakReference<RagdollSettings>>();

		INTERNAL_USER_DATA = new LongObjectHashMap<Object>();
		USER_DATA = new LongObjectHashMap<Object>();
	}

	private Jolt() {

	}

	/**
	 * Initializes jolt.
	 * <p>
	 * Calls:
	 * <ul>
	 * <li>JPH::RegisterDefaultAllocator();
	 * <li>JPH::Factory::sInstance = new JPH::Factory();
	 * <li>JPH::RegisterTypes();
	 * <li>s_TempAllocator = new TempAllocatorImplWithMallocFallback(8 * 1024 *
	 * 1024);
	 * </ul>
	 */
	public static boolean init() {
		try {
			return (boolean) JPH_INIT.invokeExact();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot initialize jolt: " + className);
		}
	}

	/**
	 * Shutdown jolt.
	 * <p>
	 * Calls:
	 * <ul>
	 * <li>delete s_TempAllocator
	 * <li>JPH::UnregisterTypes();
	 * <li>delete JPH::Factory::sInstance;
	 * </ul>
	 * 
	 */
	public static void shutdown() {
		try {
			JPH_SHUTDOWN.invokeExact();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot shutdown jolt: " + className);
		}
	}

	public static void setTraceCallback(TraceCallback traceCallback) {
		try {
			JPH_SET_TRACE_HANDLER.invokeExact(traceCallback.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set trace callback: " + className);
		}
	}

	public static void setAssertFailureCallback(AssertFailureCallback assertFailureCallback) {
		try {
			JPH_SET_ASSERT_FAILURE_HANDLER.invokeExact(assertFailureCallback.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot set assert failure callback: " + className);
		}
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addPhysicsSystem(long address, PhysicsSystem system) {
		if (!PHYSICS_SYSTEMS.containsKey(address))
			PHYSICS_SYSTEMS.put(address, new WeakReference<PhysicsSystem>(system));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static PhysicsSystem getPhysicsSystem(long address) {
		return PHYSICS_SYSTEMS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removePhysicsSystem(long address) {
		PHYSICS_SYSTEMS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addBody(long address, Body body) {
		if (!BODIES.containsKey(address))
			BODIES.put(address, body);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static Body getBody(long address) {
		return BODIES.get(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeBody(long address) {
		BODIES.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addShape(long address, Shape shape) {
		if (!SHAPES.containsKey(address))
			SHAPES.put(address, new WeakReference<Shape>(shape));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static Shape getShape(long address) {
		return SHAPES.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeShape(long address) {
		SHAPES.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addMaterial(long address, PhysicsMaterial material) {
		if (!MATERIALS.containsKey(address))
			MATERIALS.put(address, new WeakReference<PhysicsMaterial>(material));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static PhysicsMaterial getMaterial(long address) {
		return MATERIALS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeMaterial(long address) {
		MATERIALS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addGroupFilter(long address, GroupFilter group) {
		if (!GROUP_FILTERS.containsKey(address))
			GROUP_FILTERS.put(address, new WeakReference<GroupFilter>(group));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static GroupFilter getGroupFilter(long address) {
		return GROUP_FILTERS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeGroupFilter(long address) {
		GROUP_FILTERS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addSkeleton(long address, Skeleton skeleton) {
		if (!SKELETONS.containsKey(address))
			SKELETONS.put(address, new WeakReference<Skeleton>(skeleton));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static Skeleton getSkeleton(long address) {
		return SKELETONS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeSkeleton(long address) {
		SKELETONS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addCharacterVirtual(long address, CharacterVirtual character) {
		if (!CHARACTER_VIRTUALS.containsKey(address))
			CHARACTER_VIRTUALS.put(address, new WeakReference<CharacterVirtual>(character));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static CharacterVirtual getCharacterVirtual(long address) {
		return CHARACTER_VIRTUALS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeCharacterVirtual(long address) {
		CHARACTER_VIRTUALS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addWheelSettings(long address, WheelSettings settings) {
		if (!WHEEL_SETTINGS.containsKey(address))
			WHEEL_SETTINGS.put(address, new WeakReference<WheelSettings>(settings));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static WheelSettings getWheelSettings(long address) {
		return WHEEL_SETTINGS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeWheelSettings(long address) {
		WHEEL_SETTINGS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addWheel(long address, Wheel wheel) {
		if (!WHEELS.containsKey(address))
			WHEELS.put(address, new WeakReference<Wheel>(wheel));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static Wheel getWheel(long address) {
		return WHEELS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeWheel(long address) {
		WHEELS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addVehicleTransmissionSettings(long address, VehicleTransmissionSettings settings) {
		if (!TRANSMISSION_SETTINGS.containsKey(address))
			TRANSMISSION_SETTINGS.put(address, new WeakReference<VehicleTransmissionSettings>(settings));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static VehicleTransmissionSettings getVehicleTransmissionSettings(long address) {
		return TRANSMISSION_SETTINGS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeVehicleTransmissionSettings(long address) {
		TRANSMISSION_SETTINGS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addVehicleController(long address, VehicleController controller) {
		if (!VEHICLE_CONTROLLERS.containsKey(address))
			VEHICLE_CONTROLLERS.put(address, new WeakReference<VehicleController>(controller));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static VehicleController getVehicleController(long address) {
		return VEHICLE_CONTROLLERS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeVehicleController(long address) {
		VEHICLE_CONTROLLERS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addConstraint(long address, Constraint constraint) {
		if (!CONSTRAINTS.containsKey(address))
			CONSTRAINTS.put(address, new WeakReference<Constraint>(constraint));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static Constraint getConstraint(long address) {
		return CONSTRAINTS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeConstraint(long address) {
		CONSTRAINTS.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addLinearCurve(long address, LinearCurve curve) {
		if (!LINEAR_CURVES.containsKey(address))
			LINEAR_CURVES.put(address, new WeakReference<LinearCurve>(curve));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static LinearCurve getLinearCurve(long address) {
		return LINEAR_CURVES.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeLinearCurve(long address) {
		LINEAR_CURVES.remove(address);
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void addRagdollSettings(long address, RagdollSettings settings) {
		if (!RAGDOLL_SETTINGS.containsKey(address))
			RAGDOLL_SETTINGS.put(address, new WeakReference<RagdollSettings>(settings));
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static RagdollSettings getRagdollSettings(long address) {
		return RAGDOLL_SETTINGS.get(address).get();
	}

	/**
	 * DO NOT CALL. INTERNAL USE ONLY.
	 */
	public static void removeRagdollSettings(long address) {
		RAGDOLL_SETTINGS.remove(address);
	}

	public static void setInternalUserData(long address, Object userData) {
		INTERNAL_USER_DATA.put(address, userData);
	}

	public static Object getInternalUserData(long address) {
		return INTERNAL_USER_DATA.get(address);
	}

	public static void setUserData(long address, Object userData) {
		USER_DATA.put(address, userData);
	}

	public static Object getUserData(long address) {
		return USER_DATA.get(address);
	}

}
