package volucris.engine.physics.jolt.objectLayerPairFilter;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Filter class to test if two objects can collide based on their object layer.
 * Used while finding collision pairs. This implementation uses a table to
 * determine if two layers can collide.
 */
public final class ObjectLayerPairFilterTable extends ObjectLayerPairFilter {

	private static final MethodHandle JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE;
	private static final MethodHandle JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION;
	private static final MethodHandle JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION;
	private static final MethodHandle JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_SHOULD_COLLIDE;

	static {
		//@formatter:off
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE = downcallHandle("JPH_ObjectLayerPairFilterTable_Create", ADDRESS, JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION = downcallHandleVoid("JPH_ObjectLayerPairFilterTable_DisableCollision", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION = downcallHandleVoid("JPH_ObjectLayerPairFilterTable_EnableCollision", ADDRESS, JAVA_INT, JAVA_INT);
		JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_SHOULD_COLLIDE = downcallHandle("JPH_ObjectLayerPairFilterTable_ShouldCollide", JAVA_BOOLEAN, ADDRESS, JAVA_INT, JAVA_INT);
		//@formatter:on
	}

	/**
	 * Constructs the table with inNumObjectLayers Layers, initially all layer pairs
	 * are disabled.
	 */
	public ObjectLayerPairFilterTable(int numObjectLayers) {
		MemorySegment segment;
		try {
			segment = (MemorySegment) JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_CREATE.invokeExact(numObjectLayers);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create ObjectLayerPairFilterTable.");
		}
		super(segment);
	}

	/**
	 * Disable collision between two object layers.
	 */
	public void disableCollision(int layer1, int layer2) {
		try {
			MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_DISABLE_COLLISION;
			method.invokeExact(jphObjectLayerPairFilter, layer1, layer2);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot disable collision.");
		}
	}

	/**
	 * Enable collision between two object layers.
	 */
	public void enableCollision(int layer1, int layer2) {
		try {
			MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_ENABLE_COLLISION;
			method.invokeExact(jphObjectLayerPairFilter, layer1, layer2);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot enable collision.");
		}
	}

	/**
	 * Returns true if two layers can collide.
	 */
	public boolean shouldCollide(int layer1, int layer2) {
		try {
			MethodHandle method = JPH_OBJECT_LAYER_PAIR_FILTER_TABLE_SHOULD_COLLIDE;
			return (boolean) method.invokeExact(jphObjectLayerPairFilter, layer1, layer2);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot check if layers should collide.");
		}
	}

}
