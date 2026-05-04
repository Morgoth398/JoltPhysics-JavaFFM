package volucris.engine.physics.jolt.shape;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import org.joml.Vector3f;

import volucris.engine.physics.jolt.math.Vec3;
import volucris.engine.physics.jolt.physicsSystem.PhysicsSettings;
import volucris.engine.utils.VolucrisRuntimeException;

import static java.lang.foreign.ValueLayout.*;
import static volucris.engine.utils.FFMUtils.*;

/**
 * Class that constructs a TriangleShape. 
 */
public final class TriangleShapeSettings extends ConvexShapeSettings {

	private static final MethodHandle JPH_TRIANGLE_SHAPE_SETTINGS_CREATE;
	private static final MethodHandle JPH_TRIANGLE_SHAPE_SETTINGS_CREATE_SHAPE;

	static {
		//@formatter:off
		JPH_TRIANGLE_SHAPE_SETTINGS_CREATE = downcallHandle("JPH_TriangleShapeSettings_Create", ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_FLOAT);
		JPH_TRIANGLE_SHAPE_SETTINGS_CREATE_SHAPE = downcallHandle("JPH_TriangleShapeSettings_CreateShape", ADDRESS, ADDRESS);
		//@formatter:on
	}

	public TriangleShapeSettings(Vector3f v1, Vector3f v2, Vector3f v3) {
		this(v1, v2, v3, PhysicsSettings.DEFAULT_CONVEX_RADIUS);
	}
	
	public TriangleShapeSettings(Vector3f v1, Vector3f v2, Vector3f v3, float convexRadius) {
		MemorySegment segment;
		try (Arena arena = Arena.ofConfined()) {
			Vec3 p1 = new Vec3(arena, v1);
			Vec3 p2 = new Vec3(arena, v2);
			Vec3 p3 = new Vec3(arena, v3);

			MemorySegment p1Addr = p1.memorySegment();
			MemorySegment p2Addr = p2.memorySegment();
			MemorySegment p3Addr = p3.memorySegment();

			MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_CREATE;
			segment = (MemorySegment) method.invokeExact(p1Addr, p2Addr, p3Addr, convexRadius);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create triangle shape settings.");
		}
		super(segment);
	}

	public TriangleShape createShape() {
		try {
			MethodHandle method = JPH_TRIANGLE_SHAPE_SETTINGS_CREATE_SHAPE;
			MemorySegment segment = (MemorySegment) method.invokeExact(jphShapeSettings);
			return new TriangleShape(segment);
		} catch (Throwable e) {
			throw new VolucrisRuntimeException("Jolt: Cannot create shape.");
		}
	}

}