package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.utils.JoltRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a ConvexHullShape
 */
public final class ConvexHullShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_ConvexHullShapeSettings_Create", ADDRESS, ADDRESS, JAVA_INT, JAVA_FLOAT);
		JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_ConvexHullShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	/**
	 * @see #ConvexHullShapeSettings(float, Arena, Vector3f...)
	 */
	public ConvexHullShapeSettings(Vector3f... points) {
		this(Arena.ofAuto(), points);
	}

	/**
	 * @see #ConvexHullShapeSettings(float, Arena, Vector3f...)
	 */
	public ConvexHullShapeSettings(Arena arena, Vector3f... points) {
		this(PhysicsSettings.DEFAULT_CONVEX_RADIUS, arena, points);
	}

	/**
	 * @see #ConvexHullShapeSettings(float, Arena, Vector3f...)
	 */
	public ConvexHullShapeSettings(float maxConvexRadius, Vector3f... points) {
		this(maxConvexRadius, Arena.ofAuto(), points);
	}

	/**
	 * Create a convex hull from inPoints and maximum convex radius
	 * inMaxConvexRadius, the radius is automatically lowered if the hull requires
	 * it. (internally this will be subtracted so the total size will not grow with
	 * the convex radius).
	 */
	public ConvexHullShapeSettings(float maxConvexRadius, Arena arena, Vector3f... points) {
		MemorySegment segment;
		try (Arena confinedArena = Arena.ofConfined()) {
			MemorySegment array = confinedArena.allocate(MemoryLayout.sequenceLayout(points.length, Vec3.LAYOUT()));

			Vec3 vecTmp = new Vec3(confinedArena);
			for (int i = 0; i < points.length; i++) {
				vecTmp.set(points[i]);

				long offset = i * Vec3.LAYOUT().byteSize();
				MemorySegment.copy(vecTmp.memorySegment(), 0, array, offset, Vec3.LAYOUT().byteSize());
			}

			MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(array, points.length, maxConvexRadius);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create convex hull shape settings: " + className);
		}
		super(segment, arena);
	}

	public ConvexHullShape createShape() {
		return createShape(Arena.ofAuto());
	}

	public ConvexHullShape createShape(Arena arena) {
		try {
			MethodHandle method = JPH_CONVEX_HULL_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new ConvexHullShape(segment, arena);
		} catch (Throwable e) {
			String className = e.getClass().getSimpleName();
			throw new JoltRuntimeException("Cannot create shape: " + className);
		}
	}

}