package volucris.engine.physics.jolt.physicsSystem;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import volucris.engine.physics.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterface;
import volucris.engine.physics.jolt.objectLayerPairFilter.ObjectLayerPairFilter;
import volucris.engine.physics.jolt.objectVsBroadPhaseLayerFilter.ObjectVsBroadPhaseLayerFilter;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

public final class PhysicsSystemSettings {

	private static final StructLayout LAYOUT;

	private static final VarHandle MAX_BODIES;
	private static final VarHandle NUM_BODY_MUTEXES;
	private static final VarHandle MAX_BODY_PAIRS;
	private static final VarHandle MAX_CONTACT_CONSTRAINTS;
	private static final VarHandle BROAD_PHASE_LAYER_INTERFACE;
	private static final VarHandle OBJECT_LAYER_PAIR_FILTER;
	private static final VarHandle OBJECT_VS_BROAD_PHASE_LAYER_FILTER;

	private final MemorySegment jphPhysicsSystemSettings;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		        JAVA_INT.withName("maxBodies"),
		        JAVA_INT.withName("numBodyMutexes"),
		        JAVA_INT.withName("maxBodyPairs"),
		        JAVA_INT.withName("maxContactConstraints"),
		        JAVA_INT.withName("_padding"),
		        MemoryLayout.paddingLayout(4),
		        ADDRESS.withName("broadPhaseLayerInterface"),
		        ADDRESS.withName("objectLayerPairFilter"),
		        ADDRESS.withName("objectVsBroadPhaseLayerFilter")
			).withName("JPH_PhysicsSystemSettings");
		//@formatter:on

		MAX_BODIES = varHandle(LAYOUT, "maxBodies");
		NUM_BODY_MUTEXES = varHandle(LAYOUT, "numBodyMutexes");
		MAX_BODY_PAIRS = varHandle(LAYOUT, "maxBodyPairs");
		MAX_CONTACT_CONSTRAINTS = varHandle(LAYOUT, "maxContactConstraints");
		BROAD_PHASE_LAYER_INTERFACE = varHandle(LAYOUT, "broadPhaseLayerInterface");
		OBJECT_LAYER_PAIR_FILTER = varHandle(LAYOUT, "objectLayerPairFilter");
		OBJECT_VS_BROAD_PHASE_LAYER_FILTER = varHandle(LAYOUT, "objectVsBroadPhaseLayerFilter");
	}

	public PhysicsSystemSettings() {
		this(Arena.ofAuto());
	}
	
	public PhysicsSystemSettings(Arena arena) {
		jphPhysicsSystemSettings = arena.allocate(LAYOUT);

		setMaxBodies(10240);
		setNumBodyMutexes(0);
		setMaxBodyPairs(10240);
		setMaxContactConstraints(10240);
	}

	/**
	 * Maximum number of bodies to support.
	 */
	public void setMaxBodies(int maxBodies) {
		MAX_BODIES.set(jphPhysicsSystemSettings, maxBodies);
	}

	/**
	 * Number of body mutexes to use. Should be a power of 2 in the range [1, 64],
	 * use 0 to auto detect.
	 */
	public void setNumBodyMutexes(int numBodyMutexes) {
		NUM_BODY_MUTEXES.set(jphPhysicsSystemSettings, numBodyMutexes);
	}

	/**
	 * Maximum amount of body pairs to process (anything else will fall through the
	 * world), this number should generally be much higher than the max amount of
	 * contact points as there will be lots of bodies close that are not actually
	 * touching.
	 */
	public void setMaxBodyPairs(int maxBodyPairs) {
		MAX_BODY_PAIRS.set(jphPhysicsSystemSettings, maxBodyPairs);
	}

	/**
	 * Maximum amount of contact constraints to process (anything else will fall
	 * through the world).
	 */
	public void setMaxContactConstraints(int maxContactConstraints) {
		MAX_CONTACT_CONSTRAINTS.set(jphPhysicsSystemSettings, maxContactConstraints);
	}

	/**
	 * Information on the mapping of object layers to broad phase layers. Since this
	 * is a virtual interface, the instance needs to stay alive during the lifetime
	 * of the PhysicsSystem.
	 */
	public void setBroadPhaseLayerInterface(BroadPhaseLayerInterface layerInterface) {
		BROAD_PHASE_LAYER_INTERFACE.set(jphPhysicsSystemSettings, layerInterface.memorySegment());
	}

	/**
	 * Filter callback function that is used to determine if two object layers
	 * collide. Since this is a virtual interface, the instance needs to stay alive
	 * during the lifetime of the PhysicsSystem.
	 */
	public void setObjectLayerPairFilter(ObjectLayerPairFilter pairFilter) {
		OBJECT_LAYER_PAIR_FILTER.set(jphPhysicsSystemSettings, pairFilter.memorySegment());
	}

	/**
	 * Filter callback function that is used to determine if an object layer
	 * collides with a broad phase layer. Since this is a virtual interface, the
	 * instance needs to stay alive during the lifetime of the PhysicsSystem.
	 */
	public void setObjectVsBroadPhaseLayerFilter(ObjectVsBroadPhaseLayerFilter layerFilter) {
		OBJECT_VS_BROAD_PHASE_LAYER_FILTER.set(jphPhysicsSystemSettings, layerFilter.memorySegment());
	}

	/**
	 * 
	 */
	public boolean isBroadPhaseLayerInterfaceSet() {
		return !BROAD_PHASE_LAYER_INTERFACE.get(jphPhysicsSystemSettings).equals(MemorySegment.NULL);
	}

	/**
	 * 
	 */
	public boolean isObjectLayerPairFilterSet() {
		return !OBJECT_LAYER_PAIR_FILTER.get(jphPhysicsSystemSettings).equals(MemorySegment.NULL);
	}

	/**
	 * 
	 */
	public boolean isObjectVsBroadPhaseLayerFilterSet() {
		return !OBJECT_VS_BROAD_PHASE_LAYER_FILTER.get(jphPhysicsSystemSettings).equals(MemorySegment.NULL);
	}

	public MemorySegment memorySegment() {
		return jphPhysicsSystemSettings;
	}

	public static StructLayout LAYOUT() {
		return LAYOUT;
	}

}
