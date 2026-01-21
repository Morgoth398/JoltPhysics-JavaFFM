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
 * Class that constructs an EmptyShape
 */
public final class EmptyShapeSettings extends ShapeSettings {

	private static final MethodHandle JPH_EMPTY_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_EMPTY_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_EMPTY_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_EmptyShapeSettings_Create", ADDRESS, ADDRESS);
		JPH_EMPTY_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_EmptyShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public EmptyShapeSettings(Vector3f centerOfMass) {
		this(centerOfMass, Arena.ofAuto());
	}

	public EmptyShapeSettings(Vector3f centerOfMass, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, centerOfMass);

			MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(vec.memorySegment());
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create empty shape settings: " + className);
		}
		super(segment, arena);
	}

	public EmptyShape createShape() {
		return createShape(Arena.ofAuto());
	}

	public EmptyShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new EmptyShape(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create shape: " + className);
		}
	}

}