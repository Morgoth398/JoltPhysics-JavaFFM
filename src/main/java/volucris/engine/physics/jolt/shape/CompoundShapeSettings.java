package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Quaternionf;
import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Quat;
import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Base class settings to construct a compound shape.
 */
public sealed class CompoundShapeSettings extends ShapeSettings
		permits MutableCompoundShapeSettings, StaticCompoundShapeSettings {

	private static final MethodHandle JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE;
	private static final MethodHandle JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE2;

	private Quat quatTmp;

	private Vec3 vecTmp;

	static {
		//@formatter:off
		JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE = downcallHandleVoid("JPH_CompoundShapeSettings_AddShape", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
		JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE2 = downcallHandleVoid("JPH_CompoundShapeSettings_AddShape2", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT);
		//@formatter:on
	}

	protected CompoundShapeSettings(MemorySegment segment) {
		this(segment, Arena.ofAuto());
	}
	
	protected CompoundShapeSettings(MemorySegment segment, Arena arena) {
		super(segment, arena);

		vecTmp = new Vec3(arena);
		quatTmp = new Quat(arena);
	}

	/**
	 * Add a shape to the compound.
	 */
	public void addShape(Vector3f position, Quaternionf rotation, ShapeSettings shapeSettings, int userData) {
		try {
			vecTmp.set(position);
			quatTmp.set(rotation);

			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment quatAddr = quatTmp.memorySegment();

			MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE;
			method.invokeExact(jphShapeSettings, posAddr, quatAddr, shapeSettings.memorySegment(), userData);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add shape.");
		}
	}

	/**
	 * Add a shape to the compound.
	 */
	public void addShape(Vector3f position, Quaternionf rotation, Shape shape, int userData) {
		try {
			vecTmp.set(position);
			quatTmp.set(rotation);

			MemorySegment posAddr = vecTmp.memorySegment();
			MemorySegment quatAddr = quatTmp.memorySegment();

			MethodHandle method = JPH_COMPOUND_SHAPE_SETTINGS_ADD_SHAPE2;
			method.invokeExact(jphShapeSettings, posAddr, quatAddr, shape.memorySegment(), userData);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot add shape.");
		}
	}

}