package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

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
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, centerOfMass);

			MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(vec.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create empty shape settings.");
		}
		super(segment);
	}

	public EmptyShape createShape() {
		try {
			MethodHandle method = JPH_EMPTY_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new EmptyShape(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}