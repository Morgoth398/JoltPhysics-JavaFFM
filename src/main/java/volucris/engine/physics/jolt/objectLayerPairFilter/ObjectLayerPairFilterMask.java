package volucris.engine.physics.jolt.objectLayerPairFilter;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.physics.jolt.broadPhaseLayerInterface.BroadPhaseLayerInterfaceMask;
import volucris.engine.physics.jolt.objectVsBroadPhaseLayerFilter.ObjectVsBroadPhaseLayerFilterMask;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Filter class to test if two objects can collide based on their object layer.
 * Used while finding collision pairs. Uses group bits and mask bits. Two layers
 * can collide if {@code Object1.Group & Object2.Mask} is non-zero and
 * {@code Object2.Group & Object1.Mask} is non-zero. The behavior is similar to
 * that in e.g. Bullet. This implementation works together with
 * {@link BroadPhaseLayerInterfaceMask} and
 * {@link ObjectVsBroadPhaseLayerFilterMask}.
 */
public final class ObjectLayerPairFilterMask extends ObjectLayerPairFilter {

	private static final MethodHandle JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE;
	private static final MethodHandle JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_OBJECT_LAYER;
	private static final MethodHandle JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_GROUP;
	private static final MethodHandle JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK;

	static {
		//@formatter:off
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE = downcallHandle("JPH_ObjectLayerPairFilterMask_Create", ADDRESS);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_OBJECT_LAYER = downcallHandle("JPH_ObjectLayerPairFilterMask_GetObjectLayer", JAVA_INT, JAVA_INT, JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_GROUP = downcallHandle("JPH_ObjectLayerPairFilterMask_GetGroup", JAVA_INT, JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK = downcallHandle("JPH_ObjectLayerPairFilterMask_GetMask", JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	public ObjectLayerPairFilterMask() {
		MemorySegment segment;
		try {
			segment = (MemorySegment) JPH_OBJECT_LAYER_PAIR_FILTER_MASK_CREATE.invokeExact();
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create ObjectLayerPairFilterMask: " + className);
		}
		super(segment);
	}

	/**
	 * Construct an ObjectLayer from a group and mask bits.
	 */
	public int getObjectLayer(int group, int mask) {
		try {
			MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_OBJECT_LAYER;
			return (int) method.invokeExact(group, mask);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get object layer: " + className);
		}
	}

	/**
	 * Get the group bits from an ObjectLayer.
	 */
	public int getGroup(int layer) {
		try {
			MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_GROUP;
			return (int) method.invokeExact(layer);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get group: " + className);
		}
	}

	/**
	 * Get the mask bits from an ObjectLayer.
	 */
	public int getMask(int layer) {
		try {
			MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_MASK_GET_MASK;
			return (int) method.invokeExact(layer);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get mask: " + className);
		}
	}

}
