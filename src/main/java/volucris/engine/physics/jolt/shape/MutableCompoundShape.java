package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * A compound shape, sub shapes can be rotated and translated. This shape is
 * optimized for adding / removing and changing the rotation / translation of
 * sub shapes but is less efficient in querying. Shifts all child objects so
 * that they're centered around the center of mass (which needs to be kept up to
 * date by calling AdjustCenterOfMass).
 * <p>
 * Note: If you're using MutableCompoundShape and are querying data while
 * modifying the shape you'll have a race condition. In this case it is best to
 * create a new MutableCompoundShape using the Clone function. You replace the
 * shape on a body using BodyInterface::SetShape. If a query is still working on
 * the old shape, it will have taken a reference and keep the old shape alive
 * until the query finishes.
 * <p>
 * When you modify a MutableCompoundShape, beware that the SubShapeIDs of all
 * other shapes can change. So be careful when storing SubShapeIDs.
 */
public final class MutableCompoundShape extends CompoundShape {

	private static final MethodHandle JPH_MUTABLE_COMPOUND_SHAPE_CREATE;
	private static final MethodHandle JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE;
	private static final MethodHandle JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE;
	private static final MethodHandle JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE;
	private static final MethodHandle JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE2;
	private static final MethodHandle JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS;

	static {
		//@formatter:off
		JPH_MUTABLE_COMPOUND_SHAPE_CREATE = downcallHandle("JPH_StaticCompoundShape_Create", ADDRESS, ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE = downcallHandle("JPH_MutableCompoundShape_AddShape", JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE = downcallHandleVoid("JPH_MutableCompoundShape_RemoveShape", ADDRESS, JAVA_INT);
		JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE = downcallHandleVoid("JPH_MutableCompoundShape_ModifyShape", ADDRESS, JAVA_INT, ADDRESS, ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE2 = downcallHandleVoid("JPH_MutableCompoundShape_ModifyShape2", ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS);
		JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS = downcallHandleVoid("JPH_MutableCompoundShape_AdjustCenterOfMass", ADDRESS);
		//@formatter:on
	}

	protected MutableCompoundShape(MemorySegment segment, boolean owns) {
		this(segment, Arena.ofAuto(), owns);
	}

	protected MutableCompoundShape(MemorySegment segment, Arena arena, boolean owns) {
		super(segment, arena, owns);
	}

	public MutableCompoundShape(MutableCompoundShapeSettings settings) {
		this(settings, Arena.ofAuto());
	}

	public MutableCompoundShape(MutableCompoundShapeSettings settings, Arena arena) {
		MemorySegment segment;
		try {
			MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_CREATE;
			segment = (MemorySegment) method.invokeExact(settings.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create mutable compund shape: " + className);
		}
		super(segment, arena);
	}

	/**
	 * @see #addShape(Vector3f, Quaternionf, Shape, int, int)
	 */
	public int addShape(Vector3f position, Quaternionf rotation, Shape child) {
		return addShape(position, rotation, child, 0, 0xffffffff);
	}

	/**
	 * @see #addShape(Vector3f, Quaternionf, Shape, int, int)
	 */
	public int addShape(Vector3f position, Quaternionf rotation, Shape child, int userData) {
		return addShape(position, rotation, child, userData, 0xffffffff);
	}

	/**
	 * Adding a new shape. Beware this can create a race condition if you're running
	 * collision queries in parallel. See class documentation for more information.
	 * <p>
	 * Mutating shapes. Note that this is not thread safe, so you need to ensure
	 * that any bodies that use this shape are locked at the time of modification
	 * using BodyLockWrite. After modification you need to call
	 * BodyInterface::NotifyShapeChanged to update the broadphase and collision
	 * caches.
	 */
	public int addShape(Vector3f position, Quaternionf rotation, Shape child, int userData, int index) {
		try {
			vecTmp.set(position);
			quatTmp.set(rotation);

			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment rotAddr = quatTmp.memorySegment();
			MemorySegment childAddr = child.memorySegment();

			MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_ADD_SHAPE;
			return (int) method.invokeExact(jphShape, posAddr, rotAddr, childAddr, userData, index);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot add shape: " + className);
		}
	}

	/**
	 * Remove a shape by index. Beware this can create a race condition if you're
	 * running collision queries in parallel. See class documentation for more
	 * information.
	 * <p>
	 * Mutating shapes. Note that this is not thread safe, so you need to ensure
	 * that any bodies that use this shape are locked at the time of modification
	 * using BodyLockWrite. After modification you need to call
	 * BodyInterface::NotifyShapeChanged to update the broadphase and collision
	 * caches.
	 */
	public void removeShape(int index) {
		try {
			MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_REMOVE_SHAPE;
			method.invokeExact(jphShape, index);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot remove shape: " + className);
		}
	}

	/**
	 * @see #modifyShape(int, Vector3f, Quaternionf, Shape)
	 */
	public void modifyShape(int index, Vector3f position, Quaternionf rotation) {
		try {
			vecTmp.set(position);
			quatTmp.set(rotation);

			MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE;
			method.invokeExact(jphShape, index, vecTmp.memorySegment(), quatTmp.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot modify shape: " + className);
		}
	}

	/**
	 * Modify the position / orientation and shape at the same time. Beware this can
	 * create a race condition if you're running collision queries in parallel. See
	 * class documentation for more information.
	 * <p>
	 * Mutating shapes. Note that this is not thread safe, so you need to ensure
	 * that any bodies that use this shape are locked at the time of modification
	 * using BodyLockWrite. After modification you need to call
	 * BodyInterface::NotifyShapeChanged to update the broadphase and collision
	 * caches.
	 */
	public void modifyShape(int index, Vector3f position, Quaternionf rotation, Shape newShape) {
		try {
			vecTmp.set(position);
			quatTmp.set(rotation);

			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment rotAddr = quatTmp.memorySegment();
			MemorySegment shapeAddr = newShape.memorySegment();

			MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_MODIFY_SHAPE2;
			method.invokeExact(jphShape, index, posAddr, rotAddr, shapeAddr);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot modify shape: " + className);
		}
	}

	/**
	 * Recalculate the center of mass and shift all objects so they're centered
	 * around it (this needs to be done of dynamic bodies and if the center of mass
	 * changes significantly due to adding / removing / repositioning sub shapes or
	 * else the simulation will look unnatural) Note that after adjusting the center
	 * of mass of an object you need to call BodyInterface::NotifyShapeChanged and
	 * Constraint::NotifyShapeChanged on the relevant bodies / constraints. Beware
	 * this can create a race condition if you're running collision queries in
	 * parallel. See class documentation for more information.
	 * <p>
	 * Mutating shapes. Note that this is not thread safe, so you need to ensure
	 * that any bodies that use this shape are locked at the time of modification
	 * using BodyLockWrite. After modification you need to call
	 * BodyInterface::NotifyShapeChanged to update the broadphase and collision
	 * caches.
	 */
	public void adjustCenterOfMass() {
		try {
			MethodHandle method = JPH_MUTABLE_COMPOUND_SHAPE_ADJUST_CENTER_OF_MASS;
			method.invokeExact(jphShape);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot adjust center of mass: " + className);
		}
	}

}