package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.Jolt;
import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Base class for a compound shape.
 */
public sealed class CompoundShape extends Shape permits MutableCompoundShape, StaticCompoundShape {

	private static final MethodHandle JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES;
	private static final MethodHandle JPH_COMPOUND_SHAPE_GET_SUB_SHAPE;
	private static final MethodHandle JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID;

	protected Quat quatTmp;

	static {
		//@formatter:off
		JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES = downcallHandle("JPH_CompoundShape_GetNumSubShapes", JAVA_INT, ADDRESS);
		JPH_COMPOUND_SHAPE_GET_SUB_SHAPE = downcallHandleVoid("JPH_CompoundShape_GetSubShape", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID = downcallHandle("JPH_CompoundShape_GetSubShapeIndexFromID", JAVA_INT, ADDRESS, JAVA_INT, ADDRESS);
		//@formatter:on
	}

	protected CompoundShape(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}

	protected CompoundShape(MemorySegment segment, Arena arena) {
		this(segment, arena, true);
	}

	protected CompoundShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected CompoundShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);

		quatTmp = new Quat(arena);
	}

	/**
	 * Get the total number of sub shapes.
	 */
	public int getNumSubShapes() {
		try {
			MethodHandle method = JPH_COMPOUND_SHAPE_GET_NUM_SUB_SHAPES;
			return (int) method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get num sub shapes: " + className);
		}
	}

	/**
	 * Access to a particular sub shape.
	 */
	public Shape getSubShape(int index) {
		return getSubShape(index, null, null, null);
	}

	/**
	 * Access to a particular sub shape.
	 */
	public Shape getSubShape(int index, Vector3f positionCOM, Quaternionf rotation) {
		return getSubShape(index, positionCOM, rotation, null);
	}

	/**
	 * Access to a particular sub shape.
	 */
	public Shape getSubShape(int index, Vector3f positionCOM, Quaternionf rotation, int[] userData) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment shapePointer = arena.allocate(ADDRESS);
			MemorySegment userDataPointer = arena.allocate(JAVA_INT);

			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment rotAddr = quatTmp.memorySegment();

			MethodHandle method = JPH_COMPOUND_SHAPE_GET_SUB_SHAPE;
			method.invokeExact(jphShape, index, shapePointer, posAddr, rotAddr, userDataPointer);

			if (positionCOM != null)
				vecTmp.get(positionCOM);
			if (rotation != null)
				quatTmp.get(rotation);
			if (userData != null)
				userData[0] = userDataPointer.getAtIndex(JAVA_INT, 0);

			MemorySegment segment = shapePointer.get(ADDRESS, 0);
			if (segment.equals(MemorySegment.NULL))
				return null;

			Shape shape = Jolt.getShape(segment.address());
			if (shape != null)
				return shape;

			return new Shape(segment, true);

		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get sub shape: " + className);
		}
	}

	/**
	 * Convert SubShapeID to sub shape index
	 */
	public int getSubShapeIndexFromID(int id, int[] remainder) {
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment intPointer = arena.allocate(JAVA_INT);

			MethodHandle method = JPH_COMPOUND_SHAPE_GET_SUB_SHAPE_INDEX_FROM_ID;
			int value = (int) method.invokeExact(jphShape, id, intPointer);

			remainder[0] = intPointer.getAtIndex(JAVA_INT, 0);

			return value;
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot get subShapeIndexFromID: " + className);
		}
	}

	/**
	 * The method does not check if the memory segment points to a
	 * MutableCompoundShape, so make sure of that first.
	 */
	public MutableCompoundShape asMutableCompundShape() {
		if (this instanceof MutableCompoundShape s)
			return s;

		return new MutableCompoundShape(jphShape, false);
	}

	/**
	 * The method does not check if the memory segment points to a
	 * StaticCompoundShape, so make sure of that first.
	 */
	public StaticCompoundShape asStaticCompundShape() {
		if (this instanceof StaticCompoundShape s)
			return s;

		return new StaticCompoundShape(jphShape, false);
	}

}