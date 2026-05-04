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
		this(shapeSettings, scale, Arena.ofAuto());
	}
	
	public ScaledShapeSettings(ShapeSettings shapeSettings, Vector3f scale, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, scale);

			MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(shapeSettings.memorySegment(), vec.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create scaled shape settings.");
		}
		super(segment, arena);
	}

	public ScaledShapeSettings(Shape shape, Vector3f scale) {
		this(shape, scale, Arena.ofAuto());
	}
	
	public ScaledShapeSettings(Shape shape, Vector3f scale, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, scale);

			MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE2;
			segment = (MemorySegment) method.invokeExact(shape.memorySegment(), vec.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create scaled shape settings.");
		}
		super(segment, arena);
	}

	public ScaledShape createShape() {
		return createShape(Arena.ofAuto());
	}
	
	public ScaledShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_SCALED_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new ScaledShape(segment, arena);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}