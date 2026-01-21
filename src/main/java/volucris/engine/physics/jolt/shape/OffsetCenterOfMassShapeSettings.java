package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that constructs an OffsetCenterOfMassShape.
 */
public final class OffsetCenterOfMassShapeSettings extends ShapeSettings {

	private static final MethodHandle JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2;
	private static final MethodHandle JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_Create", ADDRESS, ADDRESS, ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_Create2", ADDRESS, ADDRESS, ADDRESS);
		JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_OffsetCenterOfMassShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public OffsetCenterOfMassShapeSettings(Vector3f offset, ShapeSettings shapeSettings) {
		this(offset, shapeSettings, Arena.ofAuto());
	}

	public OffsetCenterOfMassShapeSettings(Vector3f offset, ShapeSettings shapeSettings, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, offset);

			MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(vec.memorySegment(), shapeSettings.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create offset center of mass shape settings: " + className);
		}
		super(segment, arena);
	}

	public OffsetCenterOfMassShapeSettings(Vector3f offset, Shape shape) {
		this(offset, shape, Arena.ofAuto());
	}

	public OffsetCenterOfMassShapeSettings(Vector3f offset, Shape shape, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, offset);

			MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE2;
			segment = (MemorySegment) method.invokeExact(vec.memorySegment(), shape.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create offset center of mass shape settings: " + className);
		}
		super(segment, arena);
	}

	public OffsetCenterOfMassShape createShape() {
		return createShape(Arena.ofAuto());
	}

	public OffsetCenterOfMassShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_OFFSET_CENTER_OF_MASS_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new OffsetCenterOfMassShape(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create shape: " + className);
		}
	}

}