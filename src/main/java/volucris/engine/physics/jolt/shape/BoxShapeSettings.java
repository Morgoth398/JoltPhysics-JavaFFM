package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.physics.jolt.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.physics.jolt.utils.FFMUtils.*;

/**
 * Class that constructs a BoxShape.
 */
public final class BoxShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_BOX_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_BOX_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_BoxShapeSettings_Create", ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_BoxShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public BoxShapeSettings(Vector3f halfExtent, Arena arena) {
		this(halfExtent, PhysicsSettings.DEFAULT_CONVEX_RADIUS, arena);
	}

	public BoxShapeSettings(Vector3f halfExtent) {
		this(halfExtent, PhysicsSettings.DEFAULT_CONVEX_RADIUS);
	}

	public BoxShapeSettings(Vector3f halfExtent, float convexRadius) {
		this(halfExtent, convexRadius, Arena.ofAuto());
	}

	public BoxShapeSettings(Vector3f halfExtent, float convexRadius, Arena arena) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			Vec3 vecTmp = new Vec3(confinedArena);
			vecTmp.set(halfExtent);

			MethodHandle method = JPH_BOX_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(vecTmp.memorySegment(), convexRadius);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create box shape settings: " + className);
		}
		super(segment, arena);
	}

	public BoxShape createShape() {
		return createShape(Arena.ofAuto());
	}

	public BoxShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_BOX_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new BoxShape(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create box shape: " + className);
		}
	}

}