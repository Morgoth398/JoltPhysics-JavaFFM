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
 * Class that constructs a ScaledShape.
 */
public final class ScaledShapeSettings extends ShapeSettings {

	private static final MethodHandle JPH_SCALED_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_SCALED_SHAPE_SETTINGS_CREATE2;
	private static final MethodHandle JPH_SCALED_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_SCALED_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_ScaledShapeSettings_Create", ADDRESS, ADDRESS, ADDRESS);
		JPH_SCALED_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_ScaledShapeSettings_Create2", ADDRESS, ADDRESS, ADDRESS);
		JPH_SCALED_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_ScaledShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public ScaledShapeSettings(ShapeSettings shapeSettings, Vector3f scale) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, scale);

			MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(shapeSettings.memorySegment(), vec.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create scaled shape settings.");
		}
		super(segment);
	}

	public ScaledShapeSettings(Shape shape, Vector3f scale) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(arena, scale);

			MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE2;
			segment = (MemorySegment) method.invokeExact(shape.memorySegment(), vec.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create scaled shape settings.");
		}
		super(segment);
	}

	public ScaledShape createShape() {
		try {
			MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new ScaledShape(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}