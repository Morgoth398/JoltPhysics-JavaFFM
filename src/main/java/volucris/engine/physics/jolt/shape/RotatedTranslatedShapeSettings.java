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
 * Class that constructs a RotatedTranslatedShape
 */
public final class RotatedTranslatedShapeSettings extends ShapeSettings {

	private static final MethodHandle JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2;
	private static final MethodHandle JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_RotatedTranslatedShapeSettings_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2 = downcallHandle("JPH_RotatedTranslatedShapeSettings_Create2", ADDRESS, ADDRESS, ADDRESS, ADDRESS);
		JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_RotatedTranslatedShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public RotatedTranslatedShapeSettings(Vector3f position, Quaternionf rotation, ShapeSettings shapeSettings) {
		this(position, rotation, shapeSettings, Arena.ofAuto());
	}
	
	public RotatedTranslatedShapeSettings(Vector3f position, Quaternionf rotation, ShapeSettings shapeSettings, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, position);
			Quat quat = new Quat(confinedArena, rotation);
			
			MemorySegment posAddr = vec.memorySegment();
			MemorySegment rotAddr = quat.memorySegment();
			
			MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(posAddr, rotAddr, shapeSettings.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create rotated translated shape settings.");
		}
		super(segment, arena);
	}

	public RotatedTranslatedShapeSettings(Vector3f position, Quaternionf rotation, Shape shape) {
		this(position, rotation, shape, Arena.ofAuto());
	}
	
	public RotatedTranslatedShapeSettings(Vector3f position, Quaternionf rotation, Shape shape, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vec = new Vec3(confinedArena, position);
			Quat quat = new Quat(confinedArena, rotation);
			
			MemorySegment posAddr = vec.memorySegment();
			MemorySegment rotAddr = quat.memorySegment();
			
			MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE2;
			segment = (MemorySegment) method.invokeExact(posAddr, rotAddr, shape.memorySegment());
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create rotated translated shape settings.");
		}
		super(segment, arena);
	}

	public RotatedTranslatedShape createShape() {
		return createShape(Arena.ofAuto());
	}
	
	public RotatedTranslatedShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_ROTATED_TRANSLATED_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new RotatedTranslatedShape(segment, arena);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}